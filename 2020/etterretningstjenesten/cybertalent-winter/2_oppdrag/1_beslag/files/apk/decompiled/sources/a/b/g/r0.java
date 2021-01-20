package a.b.g;

import a.i.a.c;
import android.annotation.SuppressLint;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import no.cybertalent.liberatortoolkit.R;

@SuppressLint({"RestrictedAPI"})
public class r0 extends c implements View.OnClickListener {
    public static final /* synthetic */ int z = 0;
    public final SearchView m;
    public final SearchableInfo n;
    public final Context o;
    public final WeakHashMap<String, Drawable.ConstantState> p;
    public final int q;
    public int r = 1;
    public ColorStateList s;
    public int t = -1;
    public int u = -1;
    public int v = -1;
    public int w = -1;
    public int x = -1;
    public int y = -1;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f213a;

        /* renamed from: b  reason: collision with root package name */
        public final TextView f214b;

        /* renamed from: c  reason: collision with root package name */
        public final ImageView f215c;
        public final ImageView d;
        public final ImageView e;

        public a(View view) {
            this.f213a = (TextView) view.findViewById(16908308);
            this.f214b = (TextView) view.findViewById(16908309);
            this.f215c = (ImageView) view.findViewById(16908295);
            this.d = (ImageView) view.findViewById(16908296);
            this.e = (ImageView) view.findViewById(R.id.edit_query);
        }
    }

    public r0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.m = searchView;
        this.n = searchableInfo;
        this.q = searchView.getSuggestionCommitIconResId();
        this.o = context;
        this.p = weakHashMap;
    }

    public static String h(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v6, resolved type: android.text.SpannableString */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x014b  */
    @Override // a.i.a.a
    public void a(View view, Context context, Cursor cursor) {
        Drawable drawable;
        Drawable drawable2;
        Drawable.ConstantState constantState;
        String str;
        String str2;
        a aVar = (a) view.getTag();
        int i = this.y;
        int i2 = i != -1 ? cursor.getInt(i) : 0;
        if (aVar.f213a != null) {
            String h = h(cursor, this.t);
            TextView textView = aVar.f213a;
            textView.setText(h);
            textView.setVisibility(TextUtils.isEmpty(h) ? 8 : 0);
        }
        if (aVar.f214b != null) {
            String h2 = h(cursor, this.v);
            if (h2 != null) {
                if (this.s == null) {
                    TypedValue typedValue = new TypedValue();
                    this.e.getTheme().resolveAttribute(R.attr.textColorSearchUrl, typedValue, true);
                    this.s = this.e.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(h2);
                spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.s, null), 0, h2.length(), 33);
                str2 = spannableString;
            } else {
                str2 = h(cursor, this.u);
            }
            if (TextUtils.isEmpty(str2)) {
                TextView textView2 = aVar.f213a;
                if (textView2 != null) {
                    textView2.setSingleLine(false);
                    aVar.f213a.setMaxLines(2);
                }
            } else {
                TextView textView3 = aVar.f213a;
                if (textView3 != null) {
                    textView3.setSingleLine(true);
                    aVar.f213a.setMaxLines(1);
                }
            }
            TextView textView4 = aVar.f214b;
            textView4.setText(str2);
            textView4.setVisibility(TextUtils.isEmpty(str2) ? 8 : 0);
        }
        ImageView imageView = aVar.f215c;
        Drawable drawable3 = null;
        if (imageView != null) {
            int i3 = this.w;
            if (i3 == -1) {
                drawable = null;
            } else {
                drawable = f(cursor.getString(i3));
                if (drawable == null) {
                    ComponentName searchActivity = this.n.getSearchActivity();
                    String flattenToShortString = searchActivity.flattenToShortString();
                    if (this.p.containsKey(flattenToShortString)) {
                        Drawable.ConstantState constantState2 = this.p.get(flattenToShortString);
                        drawable = constantState2 == null ? null : constantState2.newDrawable(this.o.getResources());
                    } else {
                        PackageManager packageManager = this.e.getPackageManager();
                        try {
                            ActivityInfo activityInfo = packageManager.getActivityInfo(searchActivity, 128);
                            int iconResource = activityInfo.getIconResource();
                            if (iconResource != 0) {
                                drawable2 = packageManager.getDrawable(searchActivity.getPackageName(), iconResource, activityInfo.applicationInfo);
                                if (drawable2 == null) {
                                    str = "Invalid icon resource " + iconResource + " for " + searchActivity.flattenToShortString();
                                    Log.w("SuggestionsAdapter", str);
                                }
                                if (drawable2 != null) {
                                    constantState = null;
                                } else {
                                    constantState = drawable2.getConstantState();
                                }
                                this.p.put(flattenToShortString, constantState);
                                drawable = drawable2;
                            }
                        } catch (PackageManager.NameNotFoundException e) {
                            str = e.toString();
                        }
                        drawable2 = null;
                        if (drawable2 != null) {
                        }
                        this.p.put(flattenToShortString, constantState);
                        drawable = drawable2;
                    }
                    if (drawable == null) {
                        drawable = this.e.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            imageView.setImageDrawable(drawable);
            if (drawable == null) {
                imageView.setVisibility(4);
            } else {
                imageView.setVisibility(0);
                drawable.setVisible(false, false);
                drawable.setVisible(true, false);
            }
        }
        ImageView imageView2 = aVar.d;
        if (imageView2 != null) {
            int i4 = this.x;
            if (i4 != -1) {
                drawable3 = f(cursor.getString(i4));
            }
            imageView2.setImageDrawable(drawable3);
            if (drawable3 == null) {
                imageView2.setVisibility(8);
            } else {
                imageView2.setVisibility(0);
                drawable3.setVisible(false, false);
                drawable3.setVisible(true, false);
            }
        }
        int i5 = this.r;
        if (i5 == 2 || (i5 == 1 && (i2 & 1) != 0)) {
            aVar.e.setVisibility(0);
            aVar.e.setTag(aVar.f213a.getText());
            aVar.e.setOnClickListener(this);
            return;
        }
        aVar.e.setVisibility(8);
    }

    @Override // a.i.a.a
    public void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.t = cursor.getColumnIndex("suggest_text_1");
                this.u = cursor.getColumnIndex("suggest_text_2");
                this.v = cursor.getColumnIndex("suggest_text_2_url");
                this.w = cursor.getColumnIndex("suggest_icon_1");
                this.x = cursor.getColumnIndex("suggest_icon_2");
                this.y = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    @Override // a.i.a.a
    public CharSequence c(Cursor cursor) {
        String h;
        String h2;
        if (cursor == null) {
            return null;
        }
        String h3 = h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (h3 != null) {
            return h3;
        }
        if (this.n.shouldRewriteQueryFromData() && (h2 = h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return h2;
        }
        if (!this.n.shouldRewriteQueryFromText() || (h = h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return h;
    }

    @Override // a.i.a.a, a.i.a.c
    public View d(Context context, Cursor cursor, ViewGroup viewGroup) {
        View inflate = this.l.inflate(this.j, viewGroup, false);
        inflate.setTag(new a(inflate));
        ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.q);
        return inflate;
    }

    public Drawable e(Uri uri) {
        int i;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.e.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        i = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (i != 0) {
                        return resourcesForApplication.getDrawable(i);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        } else {
            throw new FileNotFoundException("No authority: " + uri);
        }
    }

    public final Drawable f(String str) {
        Uri parse;
        InputStream openInputStream;
        Drawable drawable = null;
        if (str != null && !str.isEmpty() && !"0".equals(str)) {
            try {
                int parseInt = Integer.parseInt(str);
                String str2 = "android.resource://" + this.o.getPackageName() + "/" + parseInt;
                Drawable.ConstantState constantState = this.p.get(str2);
                Drawable newDrawable = constantState == null ? null : constantState.newDrawable();
                if (newDrawable != null) {
                    return newDrawable;
                }
                Context context = this.o;
                Object obj = a.h.c.a.f439a;
                Drawable drawable2 = context.getDrawable(parseInt);
                if (drawable2 != null) {
                    this.p.put(str2, drawable2.getConstantState());
                }
                return drawable2;
            } catch (NumberFormatException unused) {
                Drawable.ConstantState constantState2 = this.p.get(str);
                Drawable newDrawable2 = constantState2 == null ? null : constantState2.newDrawable();
                if (newDrawable2 != null) {
                    return newDrawable2;
                }
                parse = Uri.parse(str);
                try {
                    if ("android.resource".equals(parse.getScheme())) {
                        try {
                            drawable = e(parse);
                        } catch (Resources.NotFoundException unused2) {
                            throw new FileNotFoundException("Resource does not exist: " + parse);
                        }
                    } else {
                        openInputStream = this.o.getContentResolver().openInputStream(parse);
                        if (openInputStream != null) {
                            Drawable createFromStream = Drawable.createFromStream(openInputStream, null);
                            try {
                                openInputStream.close();
                            } catch (IOException e) {
                                Log.e("SuggestionsAdapter", "Error closing icon stream for " + parse, e);
                            }
                            drawable = createFromStream;
                        } else {
                            throw new FileNotFoundException("Failed to open " + parse);
                        }
                    }
                } catch (FileNotFoundException e2) {
                    Log.w("SuggestionsAdapter", "Icon not found: " + parse + ", " + e2.getMessage());
                }
                if (drawable != null) {
                    this.p.put(str, drawable.getConstantState());
                }
            } catch (Resources.NotFoundException unused3) {
                Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
                return null;
            } catch (Throwable th) {
                try {
                    openInputStream.close();
                } catch (IOException e3) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + parse, e3);
                }
                throw th;
            }
        }
        return drawable;
    }

    public Cursor g(SearchableInfo searchableInfo, String str, int i) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        if (i > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.e.getContentResolver().query(fragment.build(), null, suggestSelection, strArr, null);
    }

    @Override // a.i.a.a
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View inflate = this.l.inflate(this.k, viewGroup, false);
            if (inflate != null) {
                ((a) inflate.getTag()).f213a.setText(e.toString());
            }
            return inflate;
        }
    }

    @Override // a.i.a.a
    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View d = d(this.e, this.d, viewGroup);
            ((a) d.getTag()).f213a.setText(e.toString());
            return d;
        }
    }

    public boolean hasStableIds() {
        return false;
    }

    public final void i(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras == null || extras.getBoolean("in_progress")) {
        }
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        i(this.d);
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        i(this.d);
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.m.x((CharSequence) tag);
        }
    }
}
