package a.b.f;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;

public class c extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    public int f59a;

    /* renamed from: b  reason: collision with root package name */
    public Resources.Theme f60b;

    /* renamed from: c  reason: collision with root package name */
    public LayoutInflater f61c;
    public Configuration d;
    public Resources e;

    public c() {
        super(null);
    }

    public c(Context context, int i) {
        super(context);
        this.f59a = i;
    }

    public void a(Configuration configuration) {
        if (this.e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        } else if (this.d == null) {
            this.d = new Configuration(configuration);
        } else {
            throw new IllegalStateException("Override configuration has already been set");
        }
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f60b == null) {
            this.f60b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f60b.setTo(theme);
            }
        }
        this.f60b.applyStyle(this.f59a, true);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public Resources getResources() {
        if (this.e == null) {
            Configuration configuration = this.d;
            this.e = configuration == null ? super.getResources() : createConfigurationContext(configuration).getResources();
        }
        return this.e;
    }

    @Override // android.content.Context, android.content.ContextWrapper
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f61c == null) {
            this.f61c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f61c;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f60b;
        if (theme != null) {
            return theme;
        }
        if (this.f59a == 0) {
            this.f59a = 2131689795;
        }
        b();
        return this.f60b;
    }

    public void setTheme(int i) {
        if (this.f59a != i) {
            this.f59a = i;
            b();
        }
    }
}
