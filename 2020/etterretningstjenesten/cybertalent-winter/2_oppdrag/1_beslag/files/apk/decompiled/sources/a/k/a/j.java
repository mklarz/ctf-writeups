package a.k.a;

import a.k.a.l;
import a.k.a.n;
import a.m.d;
import a.m.h;
import a.m.p;
import a.m.q;
import a.m.r;
import a.m.s;
import a.m.t;
import a.n.a.b;
import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

public final class j extends i implements LayoutInflater.Factory2 {
    public static final Interpolator G = new DecelerateInterpolator(2.5f);
    public static final Interpolator H = new DecelerateInterpolator(1.5f);
    public ArrayList<Fragment> A;
    public Bundle B = null;
    public SparseArray<Parcelable> C = null;
    public ArrayList<f> D;
    public l E;
    public Runnable F = new b();
    public boolean d;
    public int e = 0;
    public final ArrayList<Fragment> f = new ArrayList<>();
    public final HashMap<String, Fragment> g = new HashMap<>();
    public ArrayList<a> h;
    public ArrayList<Fragment> i;
    public OnBackPressedDispatcher j;
    public final a.a.b k = new a(false);
    public ArrayList<a> l;
    public ArrayList<Integer> m;
    public final CopyOnWriteArrayList<d> n = new CopyOnWriteArrayList<>();
    public int o = 0;
    public h p;
    public e q;
    public Fragment r;
    public Fragment s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public ArrayList<a> y;
    public ArrayList<Boolean> z;

    public class a extends a.a.b {
        public a(boolean z) {
            super(z);
        }

        @Override // a.a.b
        public void a() {
            j jVar = j.this;
            jVar.K();
            if (jVar.k.f0a) {
                jVar.a();
            } else {
                jVar.j.a();
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            j.this.K();
        }
    }

    public class c extends g {
        public c() {
        }

        @Override // a.k.a.g
        public Fragment a(ClassLoader classLoader, String str) {
            h hVar = j.this.p;
            Context context = hVar.f579c;
            Objects.requireNonNull(hVar);
            Object obj = Fragment.S;
            try {
                return (Fragment) g.c(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (InstantiationException e) {
                throw new Fragment.b(b.a.a.a.a.c("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
            } catch (IllegalAccessException e2) {
                throw new Fragment.b(b.a.a.a.a.c("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
            } catch (NoSuchMethodException e3) {
                throw new Fragment.b(b.a.a.a.a.c("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
            } catch (InvocationTargetException e4) {
                throw new Fragment.b(b.a.a.a.a.c("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
            }
        }
    }

    public static final class d {
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public static final int[] f585a = {16842755, 16842960, 16842961};
    }

    public static class f implements Fragment.c {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f586a;

        /* renamed from: b  reason: collision with root package name */
        public final a f587b;

        /* renamed from: c  reason: collision with root package name */
        public int f588c;

        public f(a aVar, boolean z) {
            this.f586a = z;
            this.f587b = aVar;
        }

        public void a() {
            boolean z = this.f588c > 0;
            j jVar = this.f587b.q;
            int size = jVar.f.size();
            for (int i = 0; i < size; i++) {
                jVar.f.get(i).G(null);
            }
            a aVar = this.f587b;
            aVar.q.g(aVar, this.f586a, !z, true);
        }
    }

    public void A(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.r;
        if (fragment2 != null) {
            j jVar = fragment2.r;
            if (jVar instanceof j) {
                jVar.A(fragment, true);
            }
        }
        Iterator<d> it = this.n.iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next());
            if (!z2) {
                throw null;
            }
        }
    }

    public void B(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.r;
        if (fragment2 != null) {
            j jVar = fragment2.r;
            if (jVar instanceof j) {
                jVar.B(fragment, true);
            }
        }
        Iterator<d> it = this.n.iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next());
            if (!z2) {
                throw null;
            }
        }
    }

    public boolean C(MenuItem menuItem) {
        if (this.o < 1) {
            return false;
        }
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            Fragment fragment = this.f.get(i2);
            if (fragment != null) {
                if (!fragment.y && fragment.t.C(menuItem)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void D(Menu menu) {
        if (this.o >= 1) {
            for (int i2 = 0; i2 < this.f.size(); i2++) {
                Fragment fragment = this.f.get(i2);
                if (fragment != null && !fragment.y) {
                    fragment.t.D(menu);
                }
            }
        }
    }

    public final void E(Fragment fragment) {
        if (fragment != null && this.g.get(fragment.e) == fragment) {
            boolean R = fragment.r.R(fragment);
            Boolean bool = fragment.j;
            if (bool == null || bool.booleanValue() != R) {
                fragment.j = Boolean.valueOf(R);
                j jVar = fragment.t;
                jVar.g0();
                jVar.E(jVar.s);
            }
        }
    }

    public void F(boolean z2) {
        int size = this.f.size();
        while (true) {
            size--;
            if (size >= 0) {
                Fragment fragment = this.f.get(size);
                if (fragment != null) {
                    fragment.t.F(z2);
                }
            } else {
                return;
            }
        }
    }

    public boolean G(Menu menu) {
        if (this.o < 1) {
            return false;
        }
        boolean z2 = false;
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            Fragment fragment = this.f.get(i2);
            if (fragment != null && fragment.z(menu)) {
                z2 = true;
            }
        }
        return z2;
    }

    /* JADX INFO: finally extract failed */
    public final void H(int i2) {
        try {
            this.d = true;
            V(i2, false);
            this.d = false;
            K();
        } catch (Throwable th) {
            this.d = false;
            throw th;
        }
    }

    public void I(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        int size3;
        String str2;
        String b2 = b.a.a.a.a.b(str, "    ");
        if (!this.g.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (Fragment fragment : this.g.values()) {
                printWriter.print(str);
                printWriter.println(fragment);
                if (fragment != null) {
                    printWriter.print(b2);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(fragment.v));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(fragment.w));
                    printWriter.print(" mTag=");
                    printWriter.println(fragment.x);
                    printWriter.print(b2);
                    printWriter.print("mState=");
                    printWriter.print(fragment.f902b);
                    printWriter.print(" mWho=");
                    printWriter.print(fragment.e);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(fragment.q);
                    printWriter.print(b2);
                    printWriter.print("mAdded=");
                    printWriter.print(fragment.k);
                    printWriter.print(" mRemoving=");
                    printWriter.print(fragment.l);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(fragment.m);
                    printWriter.print(" mInLayout=");
                    printWriter.println(fragment.n);
                    printWriter.print(b2);
                    printWriter.print("mHidden=");
                    printWriter.print(fragment.y);
                    printWriter.print(" mDetached=");
                    printWriter.print(fragment.z);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(fragment.B);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(b2);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(fragment.A);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(fragment.G);
                    if (fragment.r != null) {
                        printWriter.print(b2);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(fragment.r);
                    }
                    if (fragment.s != null) {
                        printWriter.print(b2);
                        printWriter.print("mHost=");
                        printWriter.println(fragment.s);
                    }
                    if (fragment.u != null) {
                        printWriter.print(b2);
                        printWriter.print("mParentFragment=");
                        printWriter.println(fragment.u);
                    }
                    if (fragment.f != null) {
                        printWriter.print(b2);
                        printWriter.print("mArguments=");
                        printWriter.println(fragment.f);
                    }
                    if (fragment.f903c != null) {
                        printWriter.print(b2);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(fragment.f903c);
                    }
                    if (fragment.d != null) {
                        printWriter.print(b2);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(fragment.d);
                    }
                    Object obj = fragment.g;
                    Context context = null;
                    if (obj == null) {
                        j jVar = fragment.r;
                        obj = (jVar == null || (str2 = fragment.h) == null) ? null : (Fragment) jVar.g.get(str2);
                    }
                    if (obj != null) {
                        printWriter.print(b2);
                        printWriter.print("mTarget=");
                        printWriter.print(obj);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(fragment.i);
                    }
                    if (fragment.l() != 0) {
                        printWriter.print(b2);
                        printWriter.print("mNextAnim=");
                        printWriter.println(fragment.l());
                    }
                    if (fragment.D != null) {
                        printWriter.print(b2);
                        printWriter.print("mContainer=");
                        printWriter.println(fragment.D);
                    }
                    if (fragment.E != null) {
                        printWriter.print(b2);
                        printWriter.print("mInnerView=");
                        printWriter.println((Object) null);
                    }
                    if (fragment.c() != null) {
                        printWriter.print(b2);
                        printWriter.print("mAnimatingAway=");
                        printWriter.println(fragment.c());
                        printWriter.print(b2);
                        printWriter.print("mStateAfterAnimating=");
                        printWriter.println(fragment.s());
                    }
                    h hVar = fragment.s;
                    if (hVar != null) {
                        context = hVar.f579c;
                    }
                    if (context != null) {
                        a.n.a.a.b(fragment).a(b2, fileDescriptor, printWriter, strArr);
                    }
                    printWriter.print(b2);
                    printWriter.println("Child " + fragment.t + ":");
                    fragment.t.I(b.a.a.a.a.b(b2, "  "), fileDescriptor, printWriter, strArr);
                }
            }
        }
        int size4 = this.f.size();
        if (size4 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size4; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(this.f.get(i2).toString());
            }
        }
        ArrayList<Fragment> arrayList = this.i;
        if (arrayList != null && (size3 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size3; i3++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(this.i.get(i3).toString());
            }
        }
        ArrayList<a> arrayList2 = this.h;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size2; i4++) {
                a aVar = this.h.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.b(b2, printWriter, true);
            }
        }
        synchronized (this) {
            ArrayList<a> arrayList3 = this.l;
            if (arrayList3 != null && (size = arrayList3.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack Indices:");
                for (int i5 = 0; i5 < size; i5++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i5);
                    printWriter.print(": ");
                    printWriter.println((a) this.l.get(i5));
                }
            }
            ArrayList<Integer> arrayList4 = this.m;
            if (arrayList4 != null && arrayList4.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.m.toArray()));
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.p);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.q);
        if (this.r != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.r);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.o);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.u);
        printWriter.print(" mStopped=");
        printWriter.print(this.v);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.w);
        if (this.t) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.t);
        }
    }

    public final void J(boolean z2) {
        if (this.d) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.p == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        } else if (Looper.myLooper() != this.p.d.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        } else if (z2 || !S()) {
            if (this.y == null) {
                this.y = new ArrayList<>();
                this.z = new ArrayList<>();
            }
            this.d = true;
            try {
                M(null, null);
            } finally {
                this.d = false;
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    public boolean K() {
        J(true);
        synchronized (this) {
        }
        g0();
        if (this.x) {
            this.x = false;
            e0();
        }
        this.g.values().removeAll(Collections.singleton(null));
        return false;
    }

    public final void L(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        boolean z2;
        int i7;
        int i8;
        ArrayList<Boolean> arrayList3 = arrayList2;
        boolean z3 = arrayList.get(i2).p;
        ArrayList<Fragment> arrayList4 = this.A;
        if (arrayList4 == null) {
            this.A = new ArrayList<>();
        } else {
            arrayList4.clear();
        }
        this.A.addAll(this.f);
        Fragment fragment = this.s;
        int i9 = i2;
        boolean z4 = false;
        while (true) {
            int i10 = 1;
            if (i9 < i3) {
                a aVar = arrayList.get(i9);
                int i11 = 3;
                if (!arrayList3.get(i9).booleanValue()) {
                    ArrayList<Fragment> arrayList5 = this.A;
                    int i12 = 0;
                    while (i12 < aVar.f597a.size()) {
                        n.a aVar2 = aVar.f597a.get(i12);
                        int i13 = aVar2.f600a;
                        if (i13 != i10) {
                            if (i13 == 2) {
                                Fragment fragment2 = aVar2.f601b;
                                int i14 = fragment2.w;
                                int size = arrayList5.size() - 1;
                                boolean z5 = false;
                                while (size >= 0) {
                                    Fragment fragment3 = arrayList5.get(size);
                                    if (fragment3.w != i14) {
                                        i8 = i14;
                                    } else if (fragment3 == fragment2) {
                                        i8 = i14;
                                        z5 = true;
                                    } else {
                                        if (fragment3 == fragment) {
                                            i8 = i14;
                                            aVar.f597a.add(i12, new n.a(9, fragment3));
                                            i12++;
                                            fragment = null;
                                        } else {
                                            i8 = i14;
                                        }
                                        n.a aVar3 = new n.a(3, fragment3);
                                        aVar3.f602c = aVar2.f602c;
                                        aVar3.e = aVar2.e;
                                        aVar3.d = aVar2.d;
                                        aVar3.f = aVar2.f;
                                        aVar.f597a.add(i12, aVar3);
                                        arrayList5.remove(fragment3);
                                        i12++;
                                    }
                                    size--;
                                    i14 = i8;
                                }
                                if (z5) {
                                    aVar.f597a.remove(i12);
                                    i12--;
                                } else {
                                    i7 = 1;
                                    aVar2.f600a = 1;
                                    arrayList5.add(fragment2);
                                    i12 += i7;
                                    i10 = i7;
                                    i11 = 3;
                                }
                            } else if (i13 == i11 || i13 == 6) {
                                arrayList5.remove(aVar2.f601b);
                                Fragment fragment4 = aVar2.f601b;
                                if (fragment4 == fragment) {
                                    aVar.f597a.add(i12, new n.a(9, fragment4));
                                    i12++;
                                    fragment = null;
                                }
                            } else if (i13 == 7) {
                                i7 = 1;
                            } else if (i13 == 8) {
                                aVar.f597a.add(i12, new n.a(9, fragment));
                                i12++;
                                fragment = aVar2.f601b;
                            }
                            i7 = 1;
                            i12 += i7;
                            i10 = i7;
                            i11 = 3;
                        } else {
                            i7 = i10;
                        }
                        arrayList5.add(aVar2.f601b);
                        i12 += i7;
                        i10 = i7;
                        i11 = 3;
                    }
                } else {
                    int i15 = 1;
                    ArrayList<Fragment> arrayList6 = this.A;
                    int size2 = aVar.f597a.size() - 1;
                    while (size2 >= 0) {
                        n.a aVar4 = aVar.f597a.get(size2);
                        int i16 = aVar4.f600a;
                        if (i16 != i15) {
                            if (i16 != 3) {
                                switch (i16) {
                                    case 8:
                                        fragment = null;
                                        break;
                                    case 9:
                                        fragment = aVar4.f601b;
                                        break;
                                    case 10:
                                        aVar4.h = aVar4.g;
                                        break;
                                }
                                size2--;
                                i15 = 1;
                            }
                            arrayList6.add(aVar4.f601b);
                            size2--;
                            i15 = 1;
                        }
                        arrayList6.remove(aVar4.f601b);
                        size2--;
                        i15 = 1;
                    }
                }
                z4 = z4 || aVar.h;
                i9++;
                arrayList3 = arrayList2;
            } else {
                this.A.clear();
                if (!z3) {
                    s.o(this, arrayList, arrayList2, i2, i3, false);
                }
                int i17 = i2;
                while (i17 < i3) {
                    a aVar5 = arrayList.get(i17);
                    if (arrayList2.get(i17).booleanValue()) {
                        aVar5.a(-1);
                        aVar5.d(i17 == i3 + -1);
                    } else {
                        aVar5.a(1);
                        aVar5.c();
                    }
                    i17++;
                }
                if (z3) {
                    a.e.c<Fragment> cVar = new a.e.c<>();
                    b(cVar);
                    i4 = i2;
                    int i18 = i3;
                    for (int i19 = i3 - 1; i19 >= i4; i19--) {
                        a aVar6 = arrayList.get(i19);
                        boolean booleanValue = arrayList2.get(i19).booleanValue();
                        int i20 = 0;
                        while (true) {
                            if (i20 >= aVar6.f597a.size()) {
                                z2 = false;
                            } else if (a.g(aVar6.f597a.get(i20))) {
                                z2 = true;
                            } else {
                                i20++;
                            }
                        }
                        if (z2 && !aVar6.f(arrayList, i19 + 1, i3)) {
                            if (this.D == null) {
                                this.D = new ArrayList<>();
                            }
                            f fVar = new f(aVar6, booleanValue);
                            this.D.add(fVar);
                            for (int i21 = 0; i21 < aVar6.f597a.size(); i21++) {
                                n.a aVar7 = aVar6.f597a.get(i21);
                                if (a.g(aVar7)) {
                                    aVar7.f601b.G(fVar);
                                }
                            }
                            if (booleanValue) {
                                aVar6.c();
                            } else {
                                aVar6.d(false);
                            }
                            i18--;
                            if (i19 != i18) {
                                arrayList.remove(i19);
                                arrayList.add(i18, aVar6);
                            }
                            b(cVar);
                        }
                    }
                    int i22 = cVar.f279c;
                    for (int i23 = 0; i23 < i22; i23++) {
                        Fragment fragment5 = (Fragment) cVar.f278b[i23];
                        if (!fragment5.k) {
                            View A2 = fragment5.A();
                            fragment5.K = A2.getAlpha();
                            A2.setAlpha(0.0f);
                        }
                    }
                    i5 = i18;
                } else {
                    i4 = i2;
                    i5 = i3;
                }
                if (i5 != i4 && z3) {
                    s.o(this, arrayList, arrayList2, i2, i5, true);
                    V(this.o, true);
                }
                while (i4 < i3) {
                    a aVar8 = arrayList.get(i4);
                    if (arrayList2.get(i4).booleanValue() && (i6 = aVar8.r) >= 0) {
                        synchronized (this) {
                            this.l.set(i6, null);
                            if (this.m == null) {
                                this.m = new ArrayList<>();
                            }
                            this.m.add(Integer.valueOf(i6));
                        }
                        aVar8.r = -1;
                    }
                    Objects.requireNonNull(aVar8);
                    i4++;
                }
                return;
            }
        }
    }

    public final void M(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<f> arrayList3 = this.D;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            f fVar = this.D.get(i2);
            if (arrayList == null || fVar.f586a || (indexOf2 = arrayList.indexOf(fVar.f587b)) == -1 || !arrayList2.get(indexOf2).booleanValue()) {
                if ((fVar.f588c == 0) || (arrayList != null && fVar.f587b.f(arrayList, 0, arrayList.size()))) {
                    this.D.remove(i2);
                    i2--;
                    size--;
                    if (arrayList == null || fVar.f586a || (indexOf = arrayList.indexOf(fVar.f587b)) == -1 || !arrayList2.get(indexOf).booleanValue()) {
                        fVar.a();
                    }
                }
                i2++;
            } else {
                this.D.remove(i2);
                i2--;
                size--;
            }
            a aVar = fVar.f587b;
            aVar.q.g(aVar, fVar.f586a, false, false);
            i2++;
        }
    }

    public Fragment N(int i2) {
        for (int size = this.f.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f.get(size);
            if (fragment != null && fragment.v == i2) {
                return fragment;
            }
        }
        for (Fragment fragment2 : this.g.values()) {
            if (fragment2 != null && fragment2.v == i2) {
                return fragment2;
            }
        }
        return null;
    }

    public Fragment O(String str) {
        for (Fragment fragment : this.g.values()) {
            if (fragment != null) {
                if (!str.equals(fragment.e)) {
                    fragment = fragment.t.O(str);
                }
                if (fragment != null) {
                    return fragment;
                }
            }
        }
        return null;
    }

    public g P() {
        if (this.f581b == null) {
            this.f581b = i.f580c;
        }
        g gVar = this.f581b;
        g gVar2 = i.f580c;
        if (gVar == gVar2) {
            Fragment fragment = this.r;
            if (fragment != null) {
                return fragment.r.P();
            }
            this.f581b = new c();
        }
        if (this.f581b == null) {
            this.f581b = gVar2;
        }
        return this.f581b;
    }

    public final boolean Q(Fragment fragment) {
        j jVar = fragment.t;
        boolean z2 = false;
        for (Fragment fragment2 : jVar.g.values()) {
            if (fragment2 != null) {
                z2 = jVar.Q(fragment2);
                continue;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public boolean R(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        j jVar = fragment.r;
        if (fragment != jVar.s || !R(jVar.r)) {
            return false;
        }
        return true;
    }

    public boolean S() {
        return this.u || this.v;
    }

    public void T(Fragment fragment) {
        if (this.g.get(fragment.e) == null) {
            this.g.put(fragment.e, fragment);
        }
    }

    public void U(Fragment fragment) {
        if (fragment != null && this.g.containsKey(fragment.e)) {
            int i2 = this.o;
            if (fragment.l) {
                i2 = fragment.u() ? Math.min(i2, 1) : Math.min(i2, 0);
            }
            W(fragment, i2, fragment.m(), fragment.n(), false);
            if (fragment.J) {
                if (fragment.k && Q(fragment)) {
                    this.t = true;
                }
                fragment.J = false;
            }
        }
    }

    public void V(int i2, boolean z2) {
        h hVar;
        if (this.p == null && i2 != 0) {
            throw new IllegalStateException("No activity");
        } else if (z2 || i2 != this.o) {
            this.o = i2;
            int size = this.f.size();
            for (int i3 = 0; i3 < size; i3++) {
                U(this.f.get(i3));
            }
            for (Fragment fragment : this.g.values()) {
                if (fragment != null && ((fragment.l || fragment.z) && !fragment.I)) {
                    U(fragment);
                }
            }
            e0();
            if (this.t && (hVar = this.p) != null && this.o == 4) {
                hVar.k();
                this.t = false;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0084, code lost:
        if (r0 != 3) goto L_0x059d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0346  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x036b  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x036e  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x05a2  */
    /* JADX WARNING: Removed duplicated region for block: B:261:? A[RETURN, SYNTHETIC] */
    public void W(Fragment fragment, int i2, int i3, int i4, boolean z2) {
        int i5;
        Fragment fragment2;
        boolean z3;
        ViewGroup viewGroup;
        String str;
        Parcelable parcelable;
        Parcelable parcelable2;
        Fragment fragment3;
        int i6;
        int i7 = 1;
        if (!fragment.k || fragment.z) {
            i5 = i2;
            if (i5 > 1) {
                i5 = 1;
            }
        } else {
            i5 = i2;
        }
        if (fragment.l && i5 > (i6 = fragment.f902b)) {
            i5 = (i6 != 0 || !fragment.u()) ? fragment.f902b : 1;
        }
        int i8 = 3;
        if (fragment.F && fragment.f902b < 3 && i5 > 2) {
            i5 = 2;
        }
        d.b bVar = fragment.N;
        int min = bVar == d.b.CREATED ? Math.min(i5, 1) : Math.min(i5, bVar.ordinal());
        int i9 = fragment.f902b;
        if (i9 <= min) {
            if (!fragment.m || fragment.n) {
                if (!(fragment.c() == null && fragment.g() == null)) {
                    fragment.B(null);
                    fragment.C(null);
                    W(fragment, fragment.s(), 0, 0, true);
                }
                int i10 = fragment.f902b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                        }
                        if (min <= 2) {
                            fragment.t.X();
                            fragment.t.K();
                            i8 = 3;
                            fragment.f902b = 3;
                            fragment.C = false;
                            fragment.C = true;
                            fragment.O.d(d.a.ON_START);
                            j jVar = fragment.t;
                            jVar.u = false;
                            jVar.v = false;
                            jVar.H(3);
                            z(fragment, false);
                        } else {
                            i8 = 3;
                        }
                        if (min > i8) {
                            fragment.t.X();
                            fragment.t.K();
                            fragment.f902b = 4;
                            fragment.C = false;
                            fragment.C = true;
                            fragment.O.d(d.a.ON_RESUME);
                            j jVar2 = fragment.t;
                            jVar2.u = false;
                            jVar2.v = false;
                            jVar2.H(4);
                            fragment.t.K();
                            x(fragment, false);
                            fragment.f903c = null;
                            fragment.d = null;
                        }
                    }
                } else if (min > 0) {
                    Bundle bundle = fragment.f903c;
                    if (bundle != null) {
                        bundle.setClassLoader(this.p.f579c.getClassLoader());
                        fragment.d = fragment.f903c.getSparseParcelableArray("android:view_state");
                        String string = fragment.f903c.getString("android:target_state");
                        if (string == null) {
                            fragment3 = null;
                        } else {
                            fragment3 = this.g.get(string);
                            if (fragment3 == null) {
                                f0(new IllegalStateException("Fragment no longer exists for key " + "android:target_state" + ": unique id " + string));
                                throw null;
                            }
                        }
                        String str2 = fragment3 != null ? fragment3.e : null;
                        fragment.h = str2;
                        if (str2 != null) {
                            fragment.i = fragment.f903c.getInt("android:target_req_state", 0);
                        }
                        boolean z4 = fragment.f903c.getBoolean("android:user_visible_hint", true);
                        fragment.G = z4;
                        if (!z4) {
                            fragment.F = true;
                            if (min > 2) {
                                min = 2;
                            }
                        }
                    }
                    h hVar = this.p;
                    fragment.s = hVar;
                    Fragment fragment4 = this.r;
                    fragment.u = fragment4;
                    fragment.r = fragment4 != null ? fragment4.t : hVar.f;
                    Fragment fragment5 = fragment.g;
                    if (fragment5 != null) {
                        Fragment fragment6 = this.g.get(fragment5.e);
                        Fragment fragment7 = fragment.g;
                        if (fragment6 == fragment7) {
                            if (fragment7.f902b < 1) {
                                W(fragment7, 1, 0, 0, true);
                            }
                            fragment.h = fragment.g.e;
                            fragment.g = null;
                        } else {
                            throw new IllegalStateException("Fragment " + fragment + " declared target fragment " + fragment.g + " that does not belong to this FragmentManager!");
                        }
                    }
                    String str3 = fragment.h;
                    if (str3 != null) {
                        Fragment fragment8 = this.g.get(str3);
                        if (fragment8 == null) {
                            throw new IllegalStateException("Fragment " + fragment + " declared target fragment " + fragment.h + " that does not belong to this FragmentManager!");
                        } else if (fragment8.f902b < 1) {
                            W(fragment8, 1, 0, 0, true);
                        }
                    }
                    v(fragment, this.p.f579c, false);
                    fragment.t.d(fragment.s, new c(fragment), fragment);
                    fragment.C = false;
                    h hVar2 = fragment.s;
                    Context context = hVar2.f579c;
                    fragment.C = true;
                    if (hVar2.f578b != null) {
                        fragment.C = false;
                        fragment.C = true;
                    }
                    if (fragment.C) {
                        if (fragment.u == null) {
                            this.p.g(fragment);
                        }
                        q(fragment, this.p.f579c, false);
                        if (!fragment.M) {
                            w(fragment, fragment.f903c, false);
                            Bundle bundle2 = fragment.f903c;
                            fragment.t.X();
                            fragment.f902b = 1;
                            fragment.C = false;
                            fragment.R.a(bundle2);
                            fragment.C = true;
                            if (!(bundle2 == null || (parcelable2 = bundle2.getParcelable("android:support:fragments")) == null)) {
                                fragment.t.a0(parcelable2);
                                fragment.t.k();
                            }
                            j jVar3 = fragment.t;
                            if (!(jVar3.o >= 1)) {
                                jVar3.k();
                            }
                            fragment.M = true;
                            if (fragment.C) {
                                fragment.O.d(d.a.ON_CREATE);
                                r(fragment, fragment.f903c, false);
                            } else {
                                throw new z("Fragment " + fragment + " did not call through to super.onCreate()");
                            }
                        } else {
                            Bundle bundle3 = fragment.f903c;
                            if (!(bundle3 == null || (parcelable = bundle3.getParcelable("android:support:fragments")) == null)) {
                                fragment.t.a0(parcelable);
                                fragment.t.k();
                            }
                            fragment.f902b = 1;
                        }
                    } else {
                        throw new z("Fragment " + fragment + " did not call through to super.onAttach()");
                    }
                }
                if (min > 0 && fragment.m && !fragment.p) {
                    fragment.w(fragment.x(fragment.f903c), null, fragment.f903c);
                    fragment.E = null;
                }
                if (min > 1) {
                    if (!fragment.m) {
                        int i11 = fragment.w;
                        if (i11 == 0) {
                            viewGroup = null;
                        } else if (i11 != -1) {
                            viewGroup = (ViewGroup) this.q.b(i11);
                            if (viewGroup == null && !fragment.o) {
                                try {
                                    h hVar3 = fragment.s;
                                    Context context2 = hVar3 == null ? null : hVar3.f579c;
                                    if (context2 != null) {
                                        str = context2.getResources().getResourceName(fragment.w);
                                        StringBuilder d2 = b.a.a.a.a.d("No view found for id 0x");
                                        d2.append(Integer.toHexString(fragment.w));
                                        d2.append(" (");
                                        d2.append(str);
                                        d2.append(") for fragment ");
                                        d2.append(fragment);
                                        f0(new IllegalArgumentException(d2.toString()));
                                        throw null;
                                    }
                                    throw new IllegalStateException("Fragment " + fragment + " not attached to a context.");
                                } catch (Resources.NotFoundException unused) {
                                    str = "unknown";
                                }
                            }
                        } else {
                            f0(new IllegalArgumentException("Cannot create fragment " + fragment + " for a container view with no id"));
                            throw null;
                        }
                        fragment.D = viewGroup;
                        fragment.w(fragment.x(fragment.f903c), viewGroup, fragment.f903c);
                        fragment.E = null;
                    }
                    fragment.t.X();
                    fragment.f902b = 2;
                    fragment.C = false;
                    fragment.C = true;
                    j jVar4 = fragment.t;
                    jVar4.u = false;
                    jVar4.v = false;
                    jVar4.H(2);
                    p(fragment, fragment.f903c, false);
                    fragment.f903c = null;
                }
                if (min <= 2) {
                }
                if (min > i8) {
                }
            } else {
                return;
            }
        } else if (i9 > min) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        if (i9 == 4) {
                            if (min < 4) {
                                fragment.t.H(3);
                                fragment.O.d(d.a.ON_PAUSE);
                                fragment.f902b = 3;
                                fragment.C = false;
                                fragment.C = true;
                                u(fragment, false);
                            }
                        }
                    }
                    if (min < 3) {
                        j jVar5 = fragment.t;
                        jVar5.v = true;
                        jVar5.H(2);
                        fragment.O.d(d.a.ON_STOP);
                        fragment.f902b = 2;
                        fragment.C = false;
                        fragment.C = true;
                        A(fragment, false);
                    }
                }
                if (min < 2) {
                    fragment.t.H(1);
                    fragment.f902b = 1;
                    fragment.C = false;
                    fragment.C = true;
                    b.C0019b bVar2 = ((a.n.a.b) a.n.a.a.b(fragment)).f655b;
                    int i12 = bVar2.f657b.i();
                    for (int i13 = 0; i13 < i12; i13++) {
                        Objects.requireNonNull(bVar2.f657b.j(i13));
                    }
                    fragment.p = false;
                    B(fragment, false);
                    fragment.D = null;
                    fragment.P = null;
                    fragment.Q.g(null);
                    fragment.E = null;
                    fragment.n = false;
                }
            }
            if (min < 1) {
                if (this.w) {
                    if (fragment.c() != null) {
                        View c2 = fragment.c();
                        fragment.B(null);
                        c2.clearAnimation();
                    } else if (fragment.g() != null) {
                        Animator g2 = fragment.g();
                        fragment.C(null);
                        g2.cancel();
                    }
                }
                if (fragment.c() == null && fragment.g() == null) {
                    boolean z5 = fragment.l && !fragment.u();
                    if (z5 || this.E.b(fragment)) {
                        h hVar4 = this.p;
                        if (hVar4 instanceof t) {
                            z3 = this.E.f;
                        } else {
                            Context context3 = hVar4.f579c;
                            z3 = context3 instanceof Activity ? !((Activity) context3).isChangingConfigurations() : true;
                        }
                        if (z5 || z3) {
                            l lVar = this.E;
                            Objects.requireNonNull(lVar);
                            l lVar2 = lVar.f593c.get(fragment.e);
                            if (lVar2 != null) {
                                lVar2.a();
                                lVar.f593c.remove(fragment.e);
                            }
                            s sVar = lVar.d.get(fragment.e);
                            if (sVar != null) {
                                sVar.a();
                                lVar.d.remove(fragment.e);
                            }
                        }
                        fragment.t.m();
                        fragment.O.d(d.a.ON_DESTROY);
                        fragment.f902b = 0;
                        fragment.C = false;
                        fragment.M = false;
                        fragment.C = true;
                        s(fragment, false);
                    } else {
                        fragment.f902b = 0;
                    }
                    fragment.C = false;
                    fragment.C = true;
                    fragment.L = null;
                    j jVar6 = fragment.t;
                    if (!jVar6.w) {
                        jVar6.m();
                        fragment.t = new j();
                    }
                    t(fragment, false);
                    if (!z2) {
                        if (!z5 && !this.E.b(fragment)) {
                            fragment.s = null;
                            fragment.u = null;
                            fragment.r = null;
                            String str4 = fragment.h;
                            if (!(str4 == null || (fragment2 = this.g.get(str4)) == null || !fragment2.A)) {
                                fragment.g = fragment2;
                            }
                        } else if (this.g.get(fragment.e) != null) {
                            for (Fragment fragment9 : this.g.values()) {
                                if (fragment9 != null && fragment.e.equals(fragment9.h)) {
                                    fragment9.g = fragment;
                                    fragment9.h = null;
                                }
                            }
                            this.g.put(fragment.e, null);
                            if (!S()) {
                                this.E.f592b.remove(fragment);
                            }
                            String str5 = fragment.h;
                            if (str5 != null) {
                                fragment.g = this.g.get(str5);
                            }
                            fragment.t();
                            fragment.e = UUID.randomUUID().toString();
                            fragment.k = false;
                            fragment.l = false;
                            fragment.m = false;
                            fragment.n = false;
                            fragment.o = false;
                            fragment.q = 0;
                            fragment.r = null;
                            fragment.t = new j();
                            fragment.s = null;
                            fragment.v = 0;
                            fragment.w = 0;
                            fragment.x = null;
                            fragment.y = false;
                            fragment.z = false;
                        }
                    }
                } else {
                    fragment.b().f907c = min;
                    if (fragment.f902b == i7) {
                        Log.w("FragmentManager", "moveToState: Fragment state for " + fragment + " not updated inline; expected state " + i7 + " found " + fragment.f902b);
                        fragment.f902b = i7;
                        return;
                    }
                    return;
                }
            }
        }
        i7 = min;
        if (fragment.f902b == i7) {
        }
    }

    public void X() {
        this.u = false;
        this.v = false;
        int size = this.f.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.f.get(i2);
            if (fragment != null) {
                fragment.t.X();
            }
        }
    }

    public void Y(Fragment fragment) {
        boolean z2 = !fragment.u();
        if (!fragment.z || z2) {
            synchronized (this.f) {
                this.f.remove(fragment);
            }
            if (Q(fragment)) {
                this.t = true;
            }
            fragment.k = false;
            fragment.l = true;
        }
    }

    public final void Z(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList != null && !arrayList.isEmpty()) {
            if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
                throw new IllegalStateException("Internal error with the back stack records");
            }
            M(arrayList, arrayList2);
            int size = arrayList.size();
            int i2 = 0;
            int i3 = 0;
            while (i2 < size) {
                if (!arrayList.get(i2).p) {
                    if (i3 != i2) {
                        L(arrayList, arrayList2, i3, i2);
                    }
                    i3 = i2 + 1;
                    if (arrayList2.get(i2).booleanValue()) {
                        while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).p) {
                            i3++;
                        }
                    }
                    L(arrayList, arrayList2, i2, i3);
                    i2 = i3 - 1;
                }
                i2++;
            }
            if (i3 != size) {
                L(arrayList, arrayList2, i3, size);
            }
        }
    }

    @Override // a.k.a.i
    public boolean a() {
        boolean z2;
        int size;
        if (!S()) {
            K();
            J(true);
            Fragment fragment = this.s;
            if (fragment != null && fragment.h().a()) {
                return true;
            }
            ArrayList<a> arrayList = this.y;
            ArrayList<Boolean> arrayList2 = this.z;
            Boolean bool = Boolean.TRUE;
            ArrayList<a> arrayList3 = this.h;
            if (arrayList3 != null && (size = arrayList3.size() - 1) >= 0) {
                arrayList.add(this.h.remove(size));
                arrayList2.add(bool);
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                this.d = true;
                try {
                    Z(this.y, this.z);
                } finally {
                    f();
                }
            }
            g0();
            if (this.x) {
                this.x = false;
                e0();
            }
            this.g.values().removeAll(Collections.singleton(null));
            return z2;
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }

    public void a0(Parcelable parcelable) {
        Bundle bundle;
        Fragment fragment;
        m mVar;
        if (parcelable != null) {
            k kVar = (k) parcelable;
            if (kVar.f589a != null) {
                for (Fragment fragment2 : this.E.f592b) {
                    Iterator<m> it = kVar.f589a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            mVar = null;
                            break;
                        }
                        mVar = it.next();
                        if (mVar.f595b.equals(fragment2.e)) {
                            break;
                        }
                    }
                    if (mVar == null) {
                        W(fragment2, 1, 0, 0, false);
                        fragment2.l = true;
                        W(fragment2, 0, 0, 0, false);
                    } else {
                        mVar.n = fragment2;
                        fragment2.d = null;
                        fragment2.q = 0;
                        fragment2.n = false;
                        fragment2.k = false;
                        Fragment fragment3 = fragment2.g;
                        fragment2.h = fragment3 != null ? fragment3.e : null;
                        fragment2.g = null;
                        Bundle bundle2 = mVar.m;
                        if (bundle2 != null) {
                            bundle2.setClassLoader(this.p.f579c.getClassLoader());
                            fragment2.d = mVar.m.getSparseParcelableArray("android:view_state");
                            fragment2.f903c = mVar.m;
                        }
                    }
                }
                this.g.clear();
                Iterator<m> it2 = kVar.f589a.iterator();
                while (it2.hasNext()) {
                    m next = it2.next();
                    if (next != null) {
                        ClassLoader classLoader = this.p.f579c.getClassLoader();
                        g P = P();
                        if (next.n == null) {
                            Bundle bundle3 = next.j;
                            if (bundle3 != null) {
                                bundle3.setClassLoader(classLoader);
                            }
                            Fragment a2 = P.a(classLoader, next.f594a);
                            next.n = a2;
                            a2.D(next.j);
                            Bundle bundle4 = next.m;
                            if (bundle4 != null) {
                                bundle4.setClassLoader(classLoader);
                                fragment = next.n;
                                bundle = next.m;
                            } else {
                                fragment = next.n;
                                bundle = new Bundle();
                            }
                            fragment.f903c = bundle;
                            Fragment fragment4 = next.n;
                            fragment4.e = next.f595b;
                            fragment4.m = next.f596c;
                            fragment4.o = true;
                            fragment4.v = next.d;
                            fragment4.w = next.e;
                            fragment4.x = next.f;
                            fragment4.A = next.g;
                            fragment4.l = next.h;
                            fragment4.z = next.i;
                            fragment4.y = next.k;
                            fragment4.N = d.b.values()[next.l];
                        }
                        Fragment fragment5 = next.n;
                        fragment5.r = this;
                        this.g.put(fragment5.e, fragment5);
                        next.n = null;
                    }
                }
                this.f.clear();
                ArrayList<String> arrayList = kVar.f590b;
                if (arrayList != null) {
                    Iterator<String> it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        String next2 = it3.next();
                        Fragment fragment6 = this.g.get(next2);
                        if (fragment6 != null) {
                            fragment6.k = true;
                            if (!this.f.contains(fragment6)) {
                                synchronized (this.f) {
                                    this.f.add(fragment6);
                                }
                            } else {
                                throw new IllegalStateException("Already added " + fragment6);
                            }
                        } else {
                            f0(new IllegalStateException(b.a.a.a.a.c("No instantiated fragment for (", next2, ")")));
                            throw null;
                        }
                    }
                }
                if (kVar.f591c != null) {
                    this.h = new ArrayList<>(kVar.f591c.length);
                    int i2 = 0;
                    while (true) {
                        b[] bVarArr = kVar.f591c;
                        if (i2 >= bVarArr.length) {
                            break;
                        }
                        b bVar = bVarArr[i2];
                        Objects.requireNonNull(bVar);
                        a aVar = new a(this);
                        int i3 = 0;
                        int i4 = 0;
                        while (true) {
                            int[] iArr = bVar.f572a;
                            if (i3 >= iArr.length) {
                                break;
                            }
                            n.a aVar2 = new n.a();
                            int i5 = i3 + 1;
                            aVar2.f600a = iArr[i3];
                            String str = bVar.f573b.get(i4);
                            aVar2.f601b = str != null ? this.g.get(str) : null;
                            aVar2.g = d.b.values()[bVar.f574c[i4]];
                            aVar2.h = d.b.values()[bVar.d[i4]];
                            int[] iArr2 = bVar.f572a;
                            int i6 = i5 + 1;
                            int i7 = iArr2[i5];
                            aVar2.f602c = i7;
                            int i8 = i6 + 1;
                            int i9 = iArr2[i6];
                            aVar2.d = i9;
                            int i10 = i8 + 1;
                            int i11 = iArr2[i8];
                            aVar2.e = i11;
                            int i12 = iArr2[i10];
                            aVar2.f = i12;
                            aVar.f598b = i7;
                            aVar.f599c = i9;
                            aVar.d = i11;
                            aVar.e = i12;
                            aVar.f597a.add(aVar2);
                            aVar2.f602c = aVar.f598b;
                            aVar2.d = aVar.f599c;
                            aVar2.e = aVar.d;
                            aVar2.f = aVar.e;
                            i4++;
                            i3 = i10 + 1;
                        }
                        aVar.f = bVar.e;
                        aVar.g = bVar.f;
                        aVar.i = bVar.g;
                        aVar.r = bVar.h;
                        aVar.h = true;
                        aVar.j = bVar.i;
                        aVar.k = bVar.j;
                        aVar.l = bVar.k;
                        aVar.m = bVar.l;
                        aVar.n = bVar.m;
                        aVar.o = bVar.n;
                        aVar.p = bVar.o;
                        aVar.a(1);
                        this.h.add(aVar);
                        int i13 = aVar.r;
                        if (i13 >= 0) {
                            synchronized (this) {
                                if (this.l == null) {
                                    this.l = new ArrayList<>();
                                }
                                int size = this.l.size();
                                if (i13 < size) {
                                    this.l.set(i13, aVar);
                                } else {
                                    while (size < i13) {
                                        this.l.add(null);
                                        if (this.m == null) {
                                            this.m = new ArrayList<>();
                                        }
                                        this.m.add(Integer.valueOf(size));
                                        size++;
                                    }
                                    this.l.add(aVar);
                                }
                            }
                        }
                        i2++;
                    }
                } else {
                    this.h = null;
                }
                String str2 = kVar.d;
                if (str2 != null) {
                    Fragment fragment7 = this.g.get(str2);
                    this.s = fragment7;
                    E(fragment7);
                }
                this.e = kVar.e;
            }
        }
    }

    public final void b(a.e.c<Fragment> cVar) {
        int i2 = this.o;
        if (i2 >= 1) {
            int min = Math.min(i2, 3);
            int size = this.f.size();
            for (int i3 = 0; i3 < size; i3++) {
                Fragment fragment = this.f.get(i3);
                if (fragment.f902b < min) {
                    W(fragment, min, fragment.l(), fragment.m(), false);
                }
            }
        }
    }

    public Parcelable b0() {
        b[] bVarArr;
        ArrayList<String> arrayList;
        int size;
        Bundle bundle;
        if (this.D != null) {
            while (!this.D.isEmpty()) {
                this.D.remove(0).a();
            }
        }
        Iterator<Fragment> it = this.g.values().iterator();
        while (true) {
            bVarArr = null;
            if (!it.hasNext()) {
                break;
            }
            Fragment next = it.next();
            if (next != null) {
                if (next.c() != null) {
                    int s2 = next.s();
                    View c2 = next.c();
                    Animation animation = c2.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        c2.clearAnimation();
                    }
                    next.B(null);
                    W(next, s2, 0, 0, false);
                } else if (next.g() != null) {
                    next.g().end();
                }
            }
        }
        K();
        this.u = true;
        if (this.g.isEmpty()) {
            return null;
        }
        ArrayList<m> arrayList2 = new ArrayList<>(this.g.size());
        boolean z2 = false;
        for (Fragment fragment : this.g.values()) {
            if (fragment != null) {
                if (fragment.r == this) {
                    m mVar = new m(fragment);
                    arrayList2.add(mVar);
                    if (fragment.f902b <= 0 || mVar.m != null) {
                        mVar.m = fragment.f903c;
                    } else {
                        if (this.B == null) {
                            this.B = new Bundle();
                        }
                        Bundle bundle2 = this.B;
                        fragment.R.b(bundle2);
                        Parcelable b0 = fragment.t.b0();
                        if (b0 != null) {
                            bundle2.putParcelable("android:support:fragments", b0);
                        }
                        y(fragment, this.B, false);
                        if (!this.B.isEmpty()) {
                            bundle = this.B;
                            this.B = null;
                        } else {
                            bundle = null;
                        }
                        if (fragment.d != null) {
                            if (bundle == null) {
                                bundle = new Bundle();
                            }
                            bundle.putSparseParcelableArray("android:view_state", fragment.d);
                        }
                        if (!fragment.G) {
                            if (bundle == null) {
                                bundle = new Bundle();
                            }
                            bundle.putBoolean("android:user_visible_hint", fragment.G);
                        }
                        mVar.m = bundle;
                        String str = fragment.h;
                        if (str != null) {
                            Fragment fragment2 = this.g.get(str);
                            if (fragment2 != null) {
                                if (mVar.m == null) {
                                    mVar.m = new Bundle();
                                }
                                Bundle bundle3 = mVar.m;
                                if (fragment2.r == this) {
                                    bundle3.putString("android:target_state", fragment2.e);
                                    int i2 = fragment.i;
                                    if (i2 != 0) {
                                        mVar.m.putInt("android:target_req_state", i2);
                                    }
                                } else {
                                    f0(new IllegalStateException("Fragment " + fragment2 + " is not currently in the FragmentManager"));
                                    throw null;
                                }
                            } else {
                                f0(new IllegalStateException("Failure saving state: " + fragment + " has target not in fragment manager: " + fragment.h));
                                throw null;
                            }
                        }
                    }
                    z2 = true;
                } else {
                    f0(new IllegalStateException("Failure saving state: active " + fragment + " was removed from the FragmentManager"));
                    throw null;
                }
            }
        }
        if (!z2) {
            return null;
        }
        int size2 = this.f.size();
        if (size2 > 0) {
            arrayList = new ArrayList<>(size2);
            Iterator<Fragment> it2 = this.f.iterator();
            while (it2.hasNext()) {
                Fragment next2 = it2.next();
                arrayList.add(next2.e);
                if (next2.r != this) {
                    f0(new IllegalStateException("Failure saving state: active " + next2 + " was removed from the FragmentManager"));
                    throw null;
                }
            }
        } else {
            arrayList = null;
        }
        ArrayList<a> arrayList3 = this.h;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            bVarArr = new b[size];
            for (int i3 = 0; i3 < size; i3++) {
                bVarArr[i3] = new b(this.h.get(i3));
            }
        }
        k kVar = new k();
        kVar.f589a = arrayList2;
        kVar.f590b = arrayList;
        kVar.f591c = bVarArr;
        Fragment fragment3 = this.s;
        if (fragment3 != null) {
            kVar.d = fragment3.e;
        }
        kVar.e = this.e;
        return kVar;
    }

    public void c(Fragment fragment, boolean z2) {
        T(fragment);
        if (fragment.z) {
            return;
        }
        if (!this.f.contains(fragment)) {
            synchronized (this.f) {
                this.f.add(fragment);
            }
            fragment.k = true;
            fragment.l = false;
            fragment.J = false;
            if (Q(fragment)) {
                this.t = true;
            }
            if (z2) {
                W(fragment, this.o, 0, 0, false);
                return;
            }
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    public void c0(Fragment fragment, d.b bVar) {
        if (this.g.get(fragment.e) == fragment && (fragment.s == null || fragment.r == this)) {
            fragment.N = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v18, resolved type: a.a.c */
    /* JADX WARN: Multi-variable type inference failed */
    public void d(h hVar, e eVar, Fragment fragment) {
        if (this.p == null) {
            this.p = hVar;
            this.q = eVar;
            this.r = fragment;
            if (fragment != null) {
                g0();
            }
            if (hVar instanceof a.a.c) {
                a.a.c cVar = (a.a.c) hVar;
                OnBackPressedDispatcher d2 = cVar.d();
                this.j = d2;
                Fragment fragment2 = cVar;
                if (fragment != null) {
                    fragment2 = fragment;
                }
                a.a.b bVar = this.k;
                Objects.requireNonNull(d2);
                a.m.d a2 = fragment2.a();
                if (((h) a2).f646b != d.b.DESTROYED) {
                    bVar.f1b.add(new OnBackPressedDispatcher.LifecycleOnBackPressedCancellable(a2, bVar));
                }
            }
            if (fragment != null) {
                l lVar = fragment.r.E;
                l lVar2 = lVar.f593c.get(fragment.e);
                if (lVar2 == null) {
                    lVar2 = new l(lVar.e);
                    lVar.f593c.put(fragment.e, lVar2);
                }
                this.E = lVar2;
            } else if (hVar instanceof t) {
                s f2 = ((t) hVar).f();
                q qVar = l.g;
                String canonicalName = l.class.getCanonicalName();
                if (canonicalName != null) {
                    String b2 = b.a.a.a.a.b("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
                    p pVar = f2.f653a.get(b2);
                    if (!l.class.isInstance(pVar)) {
                        pVar = qVar instanceof r ? ((r) qVar).a(b2, l.class) : ((l.a) qVar).a(l.class);
                        p put = f2.f653a.put(b2, pVar);
                        if (put != null) {
                            put.a();
                        }
                    }
                    this.E = (l) pVar;
                    return;
                }
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            } else {
                this.E = new l(false);
            }
        } else {
            throw new IllegalStateException("Already attached");
        }
    }

    public void d0(Fragment fragment) {
        if (fragment == null || (this.g.get(fragment.e) == fragment && (fragment.s == null || fragment.r == this))) {
            Fragment fragment2 = this.s;
            this.s = fragment;
            E(fragment2);
            E(this.s);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public void e(Fragment fragment) {
        if (fragment.z) {
            fragment.z = false;
            if (fragment.k) {
                return;
            }
            if (!this.f.contains(fragment)) {
                synchronized (this.f) {
                    this.f.add(fragment);
                }
                fragment.k = true;
                if (Q(fragment)) {
                    this.t = true;
                    return;
                }
                return;
            }
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
    }

    public void e0() {
        for (Fragment fragment : this.g.values()) {
            if (fragment != null && fragment.F) {
                if (this.d) {
                    this.x = true;
                } else {
                    fragment.F = false;
                    W(fragment, this.o, 0, 0, false);
                }
            }
        }
    }

    public final void f() {
        this.d = false;
        this.z.clear();
        this.y.clear();
    }

    public final void f0(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new a.h.i.a("FragmentManager"));
        h hVar = this.p;
        if (hVar != null) {
            try {
                hVar.h("  ", null, printWriter, new String[0]);
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
            }
        } else {
            I("  ", null, printWriter, new String[0]);
        }
        throw runtimeException;
    }

    public void g(a aVar, boolean z2, boolean z3, boolean z4) {
        if (z2) {
            aVar.d(z4);
        } else {
            aVar.c();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z2));
        if (z3) {
            s.o(this, arrayList, arrayList2, 0, 1, true);
        }
        if (z4) {
            V(this.o, true);
        }
        for (Fragment fragment : this.g.values()) {
        }
    }

    public final void g0() {
        a.a.b bVar = this.k;
        ArrayList<a> arrayList = this.h;
        boolean z2 = false;
        if ((arrayList != null ? arrayList.size() : 0) > 0 && R(this.r)) {
            z2 = true;
        }
        bVar.f0a = z2;
    }

    public void h(Fragment fragment) {
        if (!fragment.z) {
            fragment.z = true;
            if (fragment.k) {
                synchronized (this.f) {
                    this.f.remove(fragment);
                }
                if (Q(fragment)) {
                    this.t = true;
                }
                fragment.k = false;
            }
        }
    }

    public void i(Configuration configuration) {
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            Fragment fragment = this.f.get(i2);
            if (fragment != null) {
                fragment.C = true;
                fragment.t.i(configuration);
            }
        }
    }

    public boolean j(MenuItem menuItem) {
        if (this.o < 1) {
            return false;
        }
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            Fragment fragment = this.f.get(i2);
            if (fragment != null) {
                if (!fragment.y && fragment.t.j(menuItem)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void k() {
        this.u = false;
        this.v = false;
        H(1);
    }

    public boolean l(Menu menu, MenuInflater menuInflater) {
        if (this.o < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z2 = false;
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            Fragment fragment = this.f.get(i2);
            if (fragment != null) {
                if (!fragment.y ? fragment.t.l(menu, menuInflater) | false : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(fragment);
                    z2 = true;
                }
            }
        }
        if (this.i != null) {
            for (int i3 = 0; i3 < this.i.size(); i3++) {
                Fragment fragment2 = this.i.get(i3);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    Objects.requireNonNull(fragment2);
                }
            }
        }
        this.i = arrayList;
        return z2;
    }

    public void m() {
        this.w = true;
        K();
        H(0);
        this.p = null;
        this.q = null;
        this.r = null;
        if (this.j != null) {
            Iterator<a.a.a> it = this.k.f1b.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
            this.j = null;
        }
    }

    public void n() {
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            Fragment fragment = this.f.get(i2);
            if (fragment != null) {
                fragment.y();
            }
        }
    }

    public void o(boolean z2) {
        int size = this.f.size();
        while (true) {
            size--;
            if (size >= 0) {
                Fragment fragment = this.f.get(size);
                if (fragment != null) {
                    fragment.t.o(z2);
                }
            } else {
                return;
            }
        }
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z2;
        Fragment next;
        Fragment fragment = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.f585a);
        int i2 = 0;
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (attributeValue != null) {
            ClassLoader classLoader = context.getClassLoader();
            a.e.h<String, Class<?>> hVar = g.f577a;
            try {
                z2 = Fragment.class.isAssignableFrom(g.b(classLoader, attributeValue));
            } catch (ClassNotFoundException unused) {
                z2 = false;
            }
            if (z2) {
                if (view != null) {
                    i2 = view.getId();
                }
                if (i2 == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                Fragment N = resourceId != -1 ? N(resourceId) : null;
                if (N == null && string != null) {
                    int size = this.f.size() - 1;
                    while (true) {
                        if (size >= 0) {
                            next = this.f.get(size);
                            if (next != null && string.equals(next.x)) {
                                break;
                            }
                            size--;
                        } else {
                            Iterator<Fragment> it = this.g.values().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    next = it.next();
                                    if (next != null && string.equals(next.x)) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                    fragment = next;
                    N = fragment;
                }
                if (N == null && i2 != -1) {
                    N = N(i2);
                }
                if (N == null) {
                    N = P().a(context.getClassLoader(), attributeValue);
                    N.m = true;
                    if (resourceId == 0) {
                        resourceId = i2;
                    }
                    N.v = resourceId;
                    N.w = i2;
                    N.x = string;
                    N.n = true;
                    N.r = this;
                    h hVar2 = this.p;
                    N.s = hVar2;
                    Context context2 = hVar2.f579c;
                    N.v(attributeSet, N.f903c);
                    c(N, true);
                } else if (!N.n) {
                    N.n = true;
                    h hVar3 = this.p;
                    N.s = hVar3;
                    Context context3 = hVar3.f579c;
                    N.v(attributeSet, N.f903c);
                } else {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(i2) + " with another fragment for " + attributeValue);
                }
                int i3 = this.o;
                if (i3 >= 1 || !N.m) {
                    W(N, i3, 0, 0, false);
                } else {
                    W(N, 1, 0, 0, false);
                }
                throw new IllegalStateException(b.a.a.a.a.c("Fragment ", attributeValue, " did not create a view."));
            }
        }
        return null;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        onCreateView(null, str, context, attributeSet);
        return null;
    }

    public void p(Fragment fragment, Bundle bundle, boolean z2) {
        Fragment fragment2 = this.r;
        if (fragment2 != null) {
            j jVar = fragment2.r;
            if (jVar instanceof j) {
                jVar.p(fragment, bundle, true);
            }
        }
        Iterator<d> it = this.n.iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next());
            if (!z2) {
                throw null;
            }
        }
    }

    public void q(Fragment fragment, Context context, boolean z2) {
        Fragment fragment2 = this.r;
        if (fragment2 != null) {
            j jVar = fragment2.r;
            if (jVar instanceof j) {
                jVar.q(fragment, context, true);
            }
        }
        Iterator<d> it = this.n.iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next());
            if (!z2) {
                throw null;
            }
        }
    }

    public void r(Fragment fragment, Bundle bundle, boolean z2) {
        Fragment fragment2 = this.r;
        if (fragment2 != null) {
            j jVar = fragment2.r;
            if (jVar instanceof j) {
                jVar.r(fragment, bundle, true);
            }
        }
        Iterator<d> it = this.n.iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next());
            if (!z2) {
                throw null;
            }
        }
    }

    public void s(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.r;
        if (fragment2 != null) {
            j jVar = fragment2.r;
            if (jVar instanceof j) {
                jVar.s(fragment, true);
            }
        }
        Iterator<d> it = this.n.iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next());
            if (!z2) {
                throw null;
            }
        }
    }

    public void t(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.r;
        if (fragment2 != null) {
            j jVar = fragment2.r;
            if (jVar instanceof j) {
                jVar.t(fragment, true);
            }
        }
        Iterator<d> it = this.n.iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next());
            if (!z2) {
                throw null;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Object obj = this.r;
        if (obj == null) {
            obj = this.p;
        }
        a.h.b.d.a(obj, sb);
        sb.append("}}");
        return sb.toString();
    }

    public void u(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.r;
        if (fragment2 != null) {
            j jVar = fragment2.r;
            if (jVar instanceof j) {
                jVar.u(fragment, true);
            }
        }
        Iterator<d> it = this.n.iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next());
            if (!z2) {
                throw null;
            }
        }
    }

    public void v(Fragment fragment, Context context, boolean z2) {
        Fragment fragment2 = this.r;
        if (fragment2 != null) {
            j jVar = fragment2.r;
            if (jVar instanceof j) {
                jVar.v(fragment, context, true);
            }
        }
        Iterator<d> it = this.n.iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next());
            if (!z2) {
                throw null;
            }
        }
    }

    public void w(Fragment fragment, Bundle bundle, boolean z2) {
        Fragment fragment2 = this.r;
        if (fragment2 != null) {
            j jVar = fragment2.r;
            if (jVar instanceof j) {
                jVar.w(fragment, bundle, true);
            }
        }
        Iterator<d> it = this.n.iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next());
            if (!z2) {
                throw null;
            }
        }
    }

    public void x(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.r;
        if (fragment2 != null) {
            j jVar = fragment2.r;
            if (jVar instanceof j) {
                jVar.x(fragment, true);
            }
        }
        Iterator<d> it = this.n.iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next());
            if (!z2) {
                throw null;
            }
        }
    }

    public void y(Fragment fragment, Bundle bundle, boolean z2) {
        Fragment fragment2 = this.r;
        if (fragment2 != null) {
            j jVar = fragment2.r;
            if (jVar instanceof j) {
                jVar.y(fragment, bundle, true);
            }
        }
        Iterator<d> it = this.n.iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next());
            if (!z2) {
                throw null;
            }
        }
    }

    public void z(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.r;
        if (fragment2 != null) {
            j jVar = fragment2.r;
            if (jVar instanceof j) {
                jVar.z(fragment, true);
            }
        }
        Iterator<d> it = this.n.iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next());
            if (!z2) {
                throw null;
            }
        }
    }
}
