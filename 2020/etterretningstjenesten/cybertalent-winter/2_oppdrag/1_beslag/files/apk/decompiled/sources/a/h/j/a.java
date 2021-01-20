package a.h.j;

import a.h.j.w.d;
import a.h.j.w.e;
import a.h.j.w.f;
import android.os.Build;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import no.cybertalent.liberatortoolkit.R;

public class a {

    /* renamed from: c  reason: collision with root package name */
    public static final View.AccessibilityDelegate f500c = new View.AccessibilityDelegate();

    /* renamed from: a  reason: collision with root package name */
    public final View.AccessibilityDelegate f501a = f500c;

    /* renamed from: b  reason: collision with root package name */
    public final View.AccessibilityDelegate f502b = new C0013a(this);

    /* renamed from: a.h.j.a$a  reason: collision with other inner class name */
    public static final class C0013a extends View.AccessibilityDelegate {

        /* renamed from: a  reason: collision with root package name */
        public final a f503a;

        public C0013a(a aVar) {
            this.f503a = aVar;
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f503a.f501a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            AccessibilityNodeProvider accessibilityNodeProvider = this.f503a.f501a.getAccessibilityNodeProvider(view);
            e eVar = accessibilityNodeProvider != null ? new e(accessibilityNodeProvider) : null;
            if (eVar != null) {
                return (AccessibilityNodeProvider) eVar.f550a;
            }
            return null;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f503a.a(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            d dVar = new d(accessibilityNodeInfo);
            WeakHashMap<View, r> weakHashMap = m.f516a;
            Boolean bool = (Boolean) new n(R.id.tag_screen_reader_focusable, Boolean.class, 28).b(view);
            boolean booleanValue = bool == null ? false : bool.booleanValue();
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                dVar.f545a.setScreenReaderFocusable(booleanValue);
            } else {
                dVar.f(1, booleanValue);
            }
            Boolean bool2 = (Boolean) new q(R.id.tag_accessibility_heading, Boolean.class, 28).b(view);
            boolean booleanValue2 = bool2 == null ? false : bool2.booleanValue();
            if (i >= 28) {
                dVar.f545a.setHeading(booleanValue2);
            } else {
                dVar.f(2, booleanValue2);
            }
            CharSequence d = m.d(view);
            AccessibilityNodeInfo accessibilityNodeInfo2 = dVar.f545a;
            if (i >= 28) {
                accessibilityNodeInfo2.setPaneTitle(d);
            } else {
                accessibilityNodeInfo2.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", d);
            }
            dVar.h((CharSequence) new p(R.id.tag_state_description, CharSequence.class, 64, 30).b(view));
            this.f503a.b(view, dVar);
            accessibilityNodeInfo.getText();
            List list = (List) view.getTag(R.id.tag_accessibility_actions);
            if (list == null) {
                list = Collections.emptyList();
            }
            for (int i2 = 0; i2 < list.size(); i2++) {
                dVar.a((d.a) list.get(i2));
            }
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f503a.f501a.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f503a.f501a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f503a.c(view, i, bundle);
        }

        public void sendAccessibilityEvent(View view, int i) {
            this.f503a.f501a.sendAccessibilityEvent(view, i);
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f503a.f501a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }

    public void a(View view, AccessibilityEvent accessibilityEvent) {
        this.f501a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void b(View view, d dVar) {
        this.f501a.onInitializeAccessibilityNodeInfo(view, dVar.f545a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c9  */
    public boolean c(View view, int i, Bundle bundle) {
        boolean z;
        WeakReference weakReference;
        boolean z2;
        f.a aVar;
        Exception e;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        boolean z3 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= list.size()) {
                break;
            }
            d.a aVar2 = (d.a) list.get(i2);
            if (((AccessibilityNodeInfo.AccessibilityAction) aVar2.f546a).getId() != i) {
                i2++;
            } else if (aVar2.f548c != null) {
                f.a aVar3 = null;
                Class<? extends f.a> cls = aVar2.f547b;
                if (cls != null) {
                    try {
                        aVar = (f.a) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        try {
                            Objects.requireNonNull(aVar);
                        } catch (Exception e2) {
                            e = e2;
                        }
                    } catch (Exception e3) {
                        aVar = null;
                        e = e3;
                        Class<? extends f.a> cls2 = aVar2.f547b;
                        Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? "null" : cls2.getName()), e);
                        aVar3 = aVar;
                        z = aVar2.f548c.a(view, aVar3);
                        if (!z) {
                        }
                        return z ? z : z;
                    }
                    aVar3 = aVar;
                }
                z = aVar2.f548c.a(view, aVar3);
            }
        }
        z = false;
        if (!z) {
            z = this.f501a.performAccessibilityAction(view, i, bundle);
        }
        if (z && i == R.id.accessibility_action_clickable_span) {
            int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
            SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
            if (!(sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i3)) == null)) {
                ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
                if (clickableSpan != null) {
                    ClickableSpan[] d = d.d(view.createAccessibilityNodeInfo().getText());
                    int i4 = 0;
                    while (true) {
                        if (d == null || i4 >= d.length) {
                            break;
                        } else if (clickableSpan.equals(d[i4])) {
                            z2 = true;
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (z2) {
                        clickableSpan.onClick(view);
                        z3 = true;
                    }
                }
                z2 = false;
                if (z2) {
                }
            }
            return z3;
        }
    }
}
