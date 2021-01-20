package androidx.constraintlayout.widget;

import a.f.b.i.c;
import a.f.b.i.d;
import a.f.b.i.e;
import a.f.b.i.f;
import a.f.b.i.g;
import a.f.b.i.j;
import a.f.b.i.l.b;
import a.f.b.i.l.m;
import a.f.c.c;
import a.f.c.d;
import a.f.c.e;
import a.f.c.h;
import a.f.c.i;
import a.f.c.k;
import a.f.c.l;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class ConstraintLayout extends ViewGroup {

    /* renamed from: b  reason: collision with root package name */
    public SparseArray<View> f875b = new SparseArray<>();

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<c> f876c = new ArrayList<>(4);
    public e d = new e();
    public int e = 0;
    public int f = 0;
    public int g = Integer.MAX_VALUE;
    public int h = Integer.MAX_VALUE;
    public boolean i = true;
    public int j = 263;
    public a.f.c.e k = null;
    public d l = null;
    public int m = -1;
    public HashMap<String, Integer> n = new HashMap<>();
    public int o = -1;
    public int p = -1;
    public SparseArray<a.f.b.i.d> q = new SparseArray<>();
    public b r;

    public static class a extends ViewGroup.MarginLayoutParams {
        public float A = 0.5f;
        public String B = null;
        public int C = 1;
        public float D = -1.0f;
        public float E = -1.0f;
        public int F = 0;
        public int G = 0;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public float N = 1.0f;
        public float O = 1.0f;
        public int P = -1;
        public int Q = -1;
        public int R = -1;
        public boolean S = false;
        public boolean T = false;
        public String U = null;
        public boolean V = true;
        public boolean W = true;
        public boolean X = false;
        public boolean Y = false;
        public boolean Z = false;

        /* renamed from: a  reason: collision with root package name */
        public int f877a = -1;
        public boolean a0 = false;

        /* renamed from: b  reason: collision with root package name */
        public int f878b = -1;
        public int b0 = -1;

        /* renamed from: c  reason: collision with root package name */
        public float f879c = -1.0f;
        public int c0 = -1;
        public int d = -1;
        public int d0 = -1;
        public int e = -1;
        public int e0 = -1;
        public int f = -1;
        public int f0 = -1;
        public int g = -1;
        public int g0 = -1;
        public int h = -1;
        public float h0 = 0.5f;
        public int i = -1;
        public int i0;
        public int j = -1;
        public int j0;
        public int k = -1;
        public float k0;
        public int l = -1;
        public a.f.b.i.d l0 = new a.f.b.i.d();
        public int m = -1;
        public int n = 0;
        public float o = 0.0f;
        public int p = -1;
        public int q = -1;
        public int r = -1;
        public int s = -1;
        public int t = -1;
        public int u = -1;
        public int v = -1;
        public int w = -1;
        public int x = -1;
        public int y = -1;
        public float z = 0.5f;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a$a  reason: collision with other inner class name */
        public static class C0026a {

            /* renamed from: a  reason: collision with root package name */
            public static final SparseIntArray f880a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f880a = sparseIntArray;
                sparseIntArray.append(63, 8);
                sparseIntArray.append(64, 9);
                sparseIntArray.append(66, 10);
                sparseIntArray.append(67, 11);
                sparseIntArray.append(73, 12);
                sparseIntArray.append(72, 13);
                sparseIntArray.append(45, 14);
                sparseIntArray.append(44, 15);
                sparseIntArray.append(42, 16);
                sparseIntArray.append(46, 2);
                sparseIntArray.append(48, 3);
                sparseIntArray.append(47, 4);
                sparseIntArray.append(81, 49);
                sparseIntArray.append(82, 50);
                sparseIntArray.append(52, 5);
                sparseIntArray.append(53, 6);
                sparseIntArray.append(54, 7);
                sparseIntArray.append(0, 1);
                sparseIntArray.append(68, 17);
                sparseIntArray.append(69, 18);
                sparseIntArray.append(51, 19);
                sparseIntArray.append(50, 20);
                sparseIntArray.append(85, 21);
                sparseIntArray.append(88, 22);
                sparseIntArray.append(86, 23);
                sparseIntArray.append(83, 24);
                sparseIntArray.append(87, 25);
                sparseIntArray.append(84, 26);
                sparseIntArray.append(59, 29);
                sparseIntArray.append(74, 30);
                sparseIntArray.append(49, 44);
                sparseIntArray.append(61, 45);
                sparseIntArray.append(76, 46);
                sparseIntArray.append(60, 47);
                sparseIntArray.append(75, 48);
                sparseIntArray.append(40, 27);
                sparseIntArray.append(39, 28);
                sparseIntArray.append(77, 31);
                sparseIntArray.append(55, 32);
                sparseIntArray.append(79, 33);
                sparseIntArray.append(78, 34);
                sparseIntArray.append(80, 35);
                sparseIntArray.append(57, 36);
                sparseIntArray.append(56, 37);
                sparseIntArray.append(58, 38);
                sparseIntArray.append(62, 39);
                sparseIntArray.append(71, 40);
                sparseIntArray.append(65, 41);
                sparseIntArray.append(43, 42);
                sparseIntArray.append(41, 43);
                sparseIntArray.append(70, 51);
            }
        }

        public a(int i2, int i3) {
            super(i2, i3);
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            String str;
            int i2;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f411b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                int i4 = C0026a.f880a.get(index);
                switch (i4) {
                    case 1:
                        this.R = obtainStyledAttributes.getInt(index, this.R);
                        continue;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.m);
                        this.m = resourceId;
                        if (resourceId == -1) {
                            this.m = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 3:
                        this.n = obtainStyledAttributes.getDimensionPixelSize(index, this.n);
                        continue;
                    case 4:
                        float f2 = obtainStyledAttributes.getFloat(index, this.o) % 360.0f;
                        this.o = f2;
                        if (f2 < 0.0f) {
                            this.o = (360.0f - f2) % 360.0f;
                        } else {
                            continue;
                        }
                    case 5:
                        this.f877a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f877a);
                        continue;
                    case 6:
                        this.f878b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f878b);
                        continue;
                    case 7:
                        this.f879c = obtainStyledAttributes.getFloat(index, this.f879c);
                        continue;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.d);
                        this.d = resourceId2;
                        if (resourceId2 == -1) {
                            this.d = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.e);
                        this.e = resourceId3;
                        if (resourceId3 == -1) {
                            this.e = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f);
                        this.f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.g);
                        this.g = resourceId5;
                        if (resourceId5 == -1) {
                            this.g = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.h);
                        this.h = resourceId6;
                        if (resourceId6 == -1) {
                            this.h = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.i);
                        this.i = resourceId7;
                        if (resourceId7 == -1) {
                            this.i = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.j);
                        this.j = resourceId8;
                        if (resourceId8 == -1) {
                            this.j = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.k);
                        this.k = resourceId9;
                        if (resourceId9 == -1) {
                            this.k = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.l);
                        this.l = resourceId10;
                        if (resourceId10 == -1) {
                            this.l = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.p);
                        this.p = resourceId11;
                        if (resourceId11 == -1) {
                            this.p = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.q);
                        this.q = resourceId12;
                        if (resourceId12 == -1) {
                            this.q = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.r);
                        this.r = resourceId13;
                        if (resourceId13 == -1) {
                            this.r = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.s);
                        this.s = resourceId14;
                        if (resourceId14 == -1) {
                            this.s = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 21:
                        this.t = obtainStyledAttributes.getDimensionPixelSize(index, this.t);
                        continue;
                    case 22:
                        this.u = obtainStyledAttributes.getDimensionPixelSize(index, this.u);
                        continue;
                    case 23:
                        this.v = obtainStyledAttributes.getDimensionPixelSize(index, this.v);
                        continue;
                    case 24:
                        this.w = obtainStyledAttributes.getDimensionPixelSize(index, this.w);
                        continue;
                    case 25:
                        this.x = obtainStyledAttributes.getDimensionPixelSize(index, this.x);
                        continue;
                    case 26:
                        this.y = obtainStyledAttributes.getDimensionPixelSize(index, this.y);
                        continue;
                    case 27:
                        this.S = obtainStyledAttributes.getBoolean(index, this.S);
                        continue;
                    case 28:
                        this.T = obtainStyledAttributes.getBoolean(index, this.T);
                        continue;
                    case 29:
                        this.z = obtainStyledAttributes.getFloat(index, this.z);
                        continue;
                    case 30:
                        this.A = obtainStyledAttributes.getFloat(index, this.A);
                        continue;
                    case 31:
                        int i5 = obtainStyledAttributes.getInt(index, 0);
                        this.H = i5;
                        if (i5 == 1) {
                            str = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.";
                            break;
                        } else {
                            continue;
                        }
                    case 32:
                        int i6 = obtainStyledAttributes.getInt(index, 0);
                        this.I = i6;
                        if (i6 == 1) {
                            str = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.";
                            break;
                        } else {
                            continue;
                        }
                    case 33:
                        try {
                            this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                            continue;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.J) == -2) {
                                this.J = -2;
                            }
                        }
                    case 34:
                        try {
                            this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            continue;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.L) == -2) {
                                this.L = -2;
                            }
                        }
                    case 35:
                        this.N = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.N));
                        this.H = 2;
                        continue;
                    case 36:
                        try {
                            this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                            continue;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.K) == -2) {
                                this.K = -2;
                            }
                        }
                    case 37:
                        try {
                            this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                            continue;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.M) == -2) {
                                this.M = -2;
                            }
                        }
                    case 38:
                        this.O = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.O));
                        this.I = 2;
                        continue;
                    default:
                        switch (i4) {
                            case 44:
                                String string = obtainStyledAttributes.getString(index);
                                this.B = string;
                                this.C = -1;
                                if (string == null) {
                                    break;
                                } else {
                                    int length = string.length();
                                    int indexOf = this.B.indexOf(44);
                                    if (indexOf <= 0 || indexOf >= length - 1) {
                                        i2 = 0;
                                    } else {
                                        String substring = this.B.substring(0, indexOf);
                                        if (substring.equalsIgnoreCase("W")) {
                                            this.C = 0;
                                        } else if (substring.equalsIgnoreCase("H")) {
                                            this.C = 1;
                                        }
                                        i2 = indexOf + 1;
                                    }
                                    int indexOf2 = this.B.indexOf(58);
                                    if (indexOf2 >= 0 && indexOf2 < length - 1) {
                                        String substring2 = this.B.substring(i2, indexOf2);
                                        String substring3 = this.B.substring(indexOf2 + 1);
                                        if (substring2.length() > 0 && substring3.length() > 0) {
                                            try {
                                                float parseFloat = Float.parseFloat(substring2);
                                                float parseFloat2 = Float.parseFloat(substring3);
                                                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                                    if (this.C == 1) {
                                                        Math.abs(parseFloat2 / parseFloat);
                                                        break;
                                                    } else {
                                                        Math.abs(parseFloat / parseFloat2);
                                                        break;
                                                    }
                                                }
                                            } catch (NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    } else {
                                        String substring4 = this.B.substring(i2);
                                        if (substring4.length() <= 0) {
                                            break;
                                        } else {
                                            Float.parseFloat(substring4);
                                            continue;
                                            continue;
                                        }
                                    }
                                }
                                break;
                            case 45:
                                this.D = obtainStyledAttributes.getFloat(index, this.D);
                                continue;
                            case 46:
                                this.E = obtainStyledAttributes.getFloat(index, this.E);
                                continue;
                            case 47:
                                this.F = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 48:
                                this.G = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 49:
                                this.P = obtainStyledAttributes.getDimensionPixelOffset(index, this.P);
                                continue;
                            case 50:
                                this.Q = obtainStyledAttributes.getDimensionPixelOffset(index, this.Q);
                                continue;
                            case 51:
                                this.U = obtainStyledAttributes.getString(index);
                                continue;
                        }
                        break;
                }
                Log.e("ConstraintLayout", str);
            }
            obtainStyledAttributes.recycle();
            a();
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public void a() {
            this.Y = false;
            this.V = true;
            this.W = true;
            int i2 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i2 == -2 && this.S) {
                this.V = false;
                if (this.H == 0) {
                    this.H = 1;
                }
            }
            int i3 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i3 == -2 && this.T) {
                this.W = false;
                if (this.I == 0) {
                    this.I = 1;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.V = false;
                if (i2 == 0 && this.H == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.S = true;
                }
            }
            if (i3 == 0 || i3 == -1) {
                this.W = false;
                if (i3 == 0 && this.I == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.T = true;
                }
            }
            if (this.f879c != -1.0f || this.f877a != -1 || this.f878b != -1) {
                this.Y = true;
                this.V = true;
                this.W = true;
                if (!(this.l0 instanceof f)) {
                    this.l0 = new f();
                }
                ((f) this.l0).E(this.R);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:70:0x00ce, code lost:
            if (r1 > 0) goto L_0x00d0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x00dd, code lost:
            if (r1 > 0) goto L_0x00d0;
         */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0053  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x005a  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0060  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0078  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x0080  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x00e4  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x00ef  */
        @TargetApi(17)
        public void resolveLayoutDirection(int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int i9 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(i2);
            boolean z2 = false;
            boolean z3 = 1 == getLayoutDirection();
            this.d0 = -1;
            this.e0 = -1;
            this.b0 = -1;
            this.c0 = -1;
            this.f0 = -1;
            this.g0 = -1;
            this.f0 = this.t;
            this.g0 = this.v;
            float f2 = this.z;
            this.h0 = f2;
            int i10 = this.f877a;
            this.i0 = i10;
            int i11 = this.f878b;
            this.j0 = i11;
            float f3 = this.f879c;
            this.k0 = f3;
            if (z3) {
                int i12 = this.p;
                if (i12 != -1) {
                    this.d0 = i12;
                } else {
                    int i13 = this.q;
                    if (i13 != -1) {
                        this.e0 = i13;
                    }
                    i4 = this.r;
                    if (i4 != -1) {
                        this.c0 = i4;
                        z2 = true;
                    }
                    i5 = this.s;
                    if (i5 != -1) {
                        this.b0 = i5;
                        z2 = true;
                    }
                    i6 = this.x;
                    if (i6 != -1) {
                        this.g0 = i6;
                    }
                    i7 = this.y;
                    if (i7 != -1) {
                        this.f0 = i7;
                    }
                    if (z2) {
                        this.h0 = 1.0f - f2;
                    }
                    if (this.Y && this.R == 1) {
                        if (f3 == -1.0f) {
                            this.k0 = 1.0f - f3;
                            this.i0 = -1;
                            this.j0 = -1;
                        } else {
                            if (i10 != -1) {
                                this.j0 = i10;
                                this.i0 = -1;
                            } else if (i11 != -1) {
                                this.i0 = i11;
                                this.j0 = -1;
                            }
                            this.k0 = -1.0f;
                        }
                    }
                }
                z2 = true;
                i4 = this.r;
                if (i4 != -1) {
                }
                i5 = this.s;
                if (i5 != -1) {
                }
                i6 = this.x;
                if (i6 != -1) {
                }
                i7 = this.y;
                if (i7 != -1) {
                }
                if (z2) {
                }
                if (f3 == -1.0f) {
                }
            } else {
                int i14 = this.p;
                if (i14 != -1) {
                    this.c0 = i14;
                }
                int i15 = this.q;
                if (i15 != -1) {
                    this.b0 = i15;
                }
                int i16 = this.r;
                if (i16 != -1) {
                    this.d0 = i16;
                }
                int i17 = this.s;
                if (i17 != -1) {
                    this.e0 = i17;
                }
                int i18 = this.x;
                if (i18 != -1) {
                    this.f0 = i18;
                }
                int i19 = this.y;
                if (i19 != -1) {
                    this.g0 = i19;
                }
            }
            if (this.r == -1 && this.s == -1 && this.q == -1 && this.p == -1) {
                int i20 = this.f;
                if (i20 != -1) {
                    this.d0 = i20;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0) {
                    }
                    i3 = this.d;
                    if (i3 != -1) {
                        this.b0 = i3;
                        if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i8 <= 0) {
                            return;
                        }
                    } else {
                        int i21 = this.e;
                        if (i21 != -1) {
                            this.c0 = i21;
                            if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i8 <= 0) {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i8;
                }
                int i22 = this.g;
                if (i22 != -1) {
                    this.e0 = i22;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0) {
                    }
                }
                i3 = this.d;
                if (i3 != -1) {
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i8;
                ((ViewGroup.MarginLayoutParams) this).rightMargin = i9;
                i3 = this.d;
                if (i3 != -1) {
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i8;
            }
        }
    }

    public class b implements b.AbstractC0008b {

        /* renamed from: a  reason: collision with root package name */
        public ConstraintLayout f881a;

        /* renamed from: b  reason: collision with root package name */
        public int f882b;

        /* renamed from: c  reason: collision with root package name */
        public int f883c;
        public int d;
        public int e;
        public int f;
        public int g;

        public b(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
            this.f881a = constraintLayout2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r19v1 */
        /* JADX WARN: Type inference failed for: r9v14, types: [int[]] */
        /* JADX WARN: Type inference failed for: r19v2 */
        /* JADX WARN: Type inference failed for: r19v3 */
        /* JADX WARNING: Removed duplicated region for block: B:102:0x016a  */
        /* JADX WARNING: Removed duplicated region for block: B:107:0x0175  */
        /* JADX WARNING: Removed duplicated region for block: B:113:0x0188 A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:122:0x01a1  */
        /* JADX WARNING: Removed duplicated region for block: B:128:0x01c0  */
        /* JADX WARNING: Removed duplicated region for block: B:129:0x01cb  */
        /* JADX WARNING: Removed duplicated region for block: B:131:0x01d7  */
        /* JADX WARNING: Removed duplicated region for block: B:132:0x01e1  */
        /* JADX WARNING: Removed duplicated region for block: B:135:0x01ee  */
        /* JADX WARNING: Removed duplicated region for block: B:136:0x01f3  */
        /* JADX WARNING: Removed duplicated region for block: B:139:0x01f8  */
        /* JADX WARNING: Removed duplicated region for block: B:142:0x0200  */
        /* JADX WARNING: Removed duplicated region for block: B:143:0x0205  */
        /* JADX WARNING: Removed duplicated region for block: B:146:0x020a  */
        /* JADX WARNING: Removed duplicated region for block: B:149:0x0212 A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:159:0x0230  */
        /* JADX WARNING: Removed duplicated region for block: B:161:0x0236  */
        /* JADX WARNING: Removed duplicated region for block: B:164:0x024c  */
        /* JADX WARNING: Removed duplicated region for block: B:165:0x024e  */
        /* JADX WARNING: Removed duplicated region for block: B:168:0x0254  */
        /* JADX WARNING: Removed duplicated region for block: B:174:0x0263  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x00bf  */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x013b  */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x014d  */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x014f  */
        /* JADX WARNING: Removed duplicated region for block: B:89:0x0152  */
        /* JADX WARNING: Removed duplicated region for block: B:90:0x0154  */
        /* JADX WARNING: Removed duplicated region for block: B:93:0x0159 A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:97:0x0161 A[ADDED_TO_REGION] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @SuppressLint({"WrongCall"})
        public final void a(a.f.b.i.d dVar, b.a aVar) {
            boolean z;
            int i;
            int ordinal;
            boolean z2;
            int i2;
            boolean z3;
            a aVar2;
            boolean z4;
            int i3;
            int i4;
            int i5;
            int i6;
            boolean z5;
            int measuredWidth;
            int measuredHeight;
            ?? r19;
            int i7;
            int i8;
            d.a aVar3 = d.a.FIXED;
            if (dVar != null) {
                if (dVar.X != 8 || dVar.x) {
                    d.a aVar4 = aVar.f352a;
                    d.a aVar5 = aVar.f353b;
                    int i9 = aVar.f354c;
                    int i10 = aVar.d;
                    int i11 = this.f882b + this.f883c;
                    int i12 = this.d;
                    View view = (View) dVar.W;
                    int ordinal2 = aVar4.ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 == 1) {
                            i = ViewGroup.getChildMeasureSpec(this.f, i12, -2);
                            dVar.g[2] = -2;
                        } else if (ordinal2 == 2) {
                            i = ViewGroup.getChildMeasureSpec(this.f, i12, -2);
                            boolean z6 = dVar.j == 1;
                            int[] iArr = dVar.g;
                            iArr[2] = 0;
                            if (aVar.j) {
                                boolean z7 = !(!z6 || iArr[3] == 0 || iArr[0] == dVar.o()) || (view instanceof i);
                                if (!z6 || z7) {
                                    i = View.MeasureSpec.makeMeasureSpec(dVar.o(), 1073741824);
                                }
                            }
                        } else if (ordinal2 != 3) {
                            i = 0;
                            z = false;
                            ordinal = aVar5.ordinal();
                            if (ordinal != 0) {
                                if (ordinal == 1) {
                                    i2 = ViewGroup.getChildMeasureSpec(this.g, i11, -2);
                                    dVar.g[3] = -2;
                                } else if (ordinal == 2) {
                                    i2 = ViewGroup.getChildMeasureSpec(this.g, i11, -2);
                                    boolean z8 = dVar.k == 1;
                                    int[] iArr2 = dVar.g;
                                    iArr2[3] = 0;
                                    if (aVar.j) {
                                        boolean z9 = !(!z8 || iArr2[2] == 0 || iArr2[1] == dVar.i()) || (view instanceof i);
                                        if (!z8 || z9) {
                                            i2 = View.MeasureSpec.makeMeasureSpec(dVar.i(), 1073741824);
                                        }
                                    }
                                } else if (ordinal != 3) {
                                    i2 = 0;
                                    z2 = false;
                                    d.a aVar6 = d.a.MATCH_CONSTRAINT;
                                    boolean z10 = aVar4 == aVar6;
                                    boolean z11 = aVar5 == aVar6;
                                    d.a aVar7 = d.a.MATCH_PARENT;
                                    boolean z12 = aVar5 != aVar7 || aVar5 == aVar3;
                                    boolean z13 = aVar4 != aVar7 || aVar4 == aVar3;
                                    z3 = !z10 && dVar.N > 0.0f;
                                    boolean z14 = !z11 && dVar.N > 0.0f;
                                    aVar2 = (a) view.getLayoutParams();
                                    if (!aVar.j || !z10 || dVar.j != 0 || !z11 || dVar.k != 0) {
                                        if ((view instanceof l) || !(dVar instanceof j)) {
                                            view.measure(i, i2);
                                        } else {
                                            j jVar = (j) dVar;
                                            ((l) view).k();
                                        }
                                        measuredWidth = view.getMeasuredWidth();
                                        measuredHeight = view.getMeasuredHeight();
                                        i3 = view.getBaseline();
                                        if (z) {
                                            int[] iArr3 = dVar.g;
                                            r19 = 0;
                                            iArr3[0] = measuredWidth;
                                            iArr3[2] = measuredHeight;
                                        } else {
                                            r19 = 0;
                                            int[] iArr4 = dVar.g;
                                            iArr4[0] = 0;
                                            iArr4[2] = 0;
                                        }
                                        if (z2) {
                                            int[] iArr5 = dVar.g;
                                            iArr5[1] = measuredHeight;
                                            iArr5[3] = measuredWidth;
                                        } else {
                                            ?? r9 = dVar.g;
                                            int i13 = r19 == true ? 1 : 0;
                                            int i14 = r19 == true ? 1 : 0;
                                            int i15 = r19 == true ? 1 : 0;
                                            int i16 = r19 == true ? 1 : 0;
                                            r9[1] = i13;
                                            r9[3] = r19;
                                        }
                                        int i17 = dVar.m;
                                        i5 = i17 > 0 ? Math.max(i17, measuredWidth) : measuredWidth;
                                        i7 = dVar.n;
                                        if (i7 > 0) {
                                            i5 = Math.min(i7, i5);
                                        }
                                        int i18 = dVar.p;
                                        i4 = i18 > 0 ? Math.max(i18, measuredHeight) : measuredHeight;
                                        i8 = dVar.q;
                                        if (i8 > 0) {
                                            i4 = Math.min(i8, i4);
                                        }
                                        if (!z3 && z12) {
                                            i5 = (int) ((((float) i4) * dVar.N) + 0.5f);
                                        } else if (z14 && z13) {
                                            i4 = (int) ((((float) i5) / dVar.N) + 0.5f);
                                        }
                                        if (!(measuredWidth == i5 && measuredHeight == i4)) {
                                            if (measuredWidth != i5) {
                                                i = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
                                            }
                                            if (measuredHeight != i4) {
                                                i2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                                            }
                                            view.measure(i, i2);
                                            i5 = view.getMeasuredWidth();
                                            i4 = view.getMeasuredHeight();
                                            i3 = view.getBaseline();
                                        }
                                        i6 = -1;
                                        z4 = r19;
                                    } else {
                                        i6 = -1;
                                        i5 = 0;
                                        i4 = 0;
                                        i3 = 0;
                                        z4 = false;
                                    }
                                    boolean z15 = i3 != i6 ? true : z4;
                                    if (i5 == aVar.f354c || i4 != aVar.d) {
                                        z5 = true;
                                    } else {
                                        boolean z16 = z4 ? 1 : 0;
                                        boolean z17 = z4 ? 1 : 0;
                                        boolean z18 = z4 ? 1 : 0;
                                        boolean z19 = z4 ? 1 : 0;
                                        boolean z20 = z4 ? 1 : 0;
                                        z5 = z16;
                                    }
                                    aVar.i = z5;
                                    if (aVar2.X) {
                                        z15 = true;
                                    }
                                    if (!(!z15 || i3 == -1 || dVar.R == i3)) {
                                        aVar.i = true;
                                    }
                                    aVar.e = i5;
                                    aVar.f = i4;
                                    aVar.h = z15;
                                    aVar.g = i3;
                                    return;
                                } else {
                                    int i19 = this.g;
                                    int i20 = dVar.y != null ? dVar.z.e + 0 : 0;
                                    if (dVar.A != null) {
                                        i20 += dVar.B.e;
                                    }
                                    i2 = ViewGroup.getChildMeasureSpec(i19, i11 + i20, -1);
                                    dVar.g[3] = -1;
                                }
                                z2 = true;
                                d.a aVar62 = d.a.MATCH_CONSTRAINT;
                                if (aVar4 == aVar62) {
                                }
                                if (aVar5 == aVar62) {
                                }
                                d.a aVar72 = d.a.MATCH_PARENT;
                                if (aVar5 != aVar72) {
                                }
                                if (aVar4 != aVar72) {
                                }
                                if (!z10) {
                                }
                                if (!z11) {
                                }
                                aVar2 = (a) view.getLayoutParams();
                                if (!aVar.j) {
                                }
                                if (view instanceof l) {
                                }
                                view.measure(i, i2);
                                measuredWidth = view.getMeasuredWidth();
                                measuredHeight = view.getMeasuredHeight();
                                i3 = view.getBaseline();
                                if (z) {
                                }
                                if (z2) {
                                }
                                int i172 = dVar.m;
                                if (i172 > 0) {
                                }
                                i7 = dVar.n;
                                if (i7 > 0) {
                                }
                                int i182 = dVar.p;
                                if (i182 > 0) {
                                }
                                i8 = dVar.q;
                                if (i8 > 0) {
                                }
                                if (!z3) {
                                }
                                i4 = (int) ((((float) i5) / dVar.N) + 0.5f);
                                if (measuredWidth != i5) {
                                }
                                if (measuredHeight != i4) {
                                }
                                view.measure(i, i2);
                                i5 = view.getMeasuredWidth();
                                i4 = view.getMeasuredHeight();
                                i3 = view.getBaseline();
                                i6 = -1;
                                z4 = r19;
                                if (i3 != i6) {
                                }
                                if (i5 == aVar.f354c) {
                                }
                                z5 = true;
                                aVar.i = z5;
                                if (aVar2.X) {
                                }
                                aVar.i = true;
                                aVar.e = i5;
                                aVar.f = i4;
                                aVar.h = z15;
                                aVar.g = i3;
                                return;
                            }
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
                            dVar.g[3] = i10;
                            i2 = makeMeasureSpec;
                            z2 = false;
                            d.a aVar622 = d.a.MATCH_CONSTRAINT;
                            if (aVar4 == aVar622) {
                            }
                            if (aVar5 == aVar622) {
                            }
                            d.a aVar722 = d.a.MATCH_PARENT;
                            if (aVar5 != aVar722) {
                            }
                            if (aVar4 != aVar722) {
                            }
                            if (!z10) {
                            }
                            if (!z11) {
                            }
                            aVar2 = (a) view.getLayoutParams();
                            if (!aVar.j) {
                            }
                            if (view instanceof l) {
                            }
                            view.measure(i, i2);
                            measuredWidth = view.getMeasuredWidth();
                            measuredHeight = view.getMeasuredHeight();
                            i3 = view.getBaseline();
                            if (z) {
                            }
                            if (z2) {
                            }
                            int i1722 = dVar.m;
                            if (i1722 > 0) {
                            }
                            i7 = dVar.n;
                            if (i7 > 0) {
                            }
                            int i1822 = dVar.p;
                            if (i1822 > 0) {
                            }
                            i8 = dVar.q;
                            if (i8 > 0) {
                            }
                            if (!z3) {
                            }
                            i4 = (int) ((((float) i5) / dVar.N) + 0.5f);
                            if (measuredWidth != i5) {
                            }
                            if (measuredHeight != i4) {
                            }
                            view.measure(i, i2);
                            i5 = view.getMeasuredWidth();
                            i4 = view.getMeasuredHeight();
                            i3 = view.getBaseline();
                            i6 = -1;
                            z4 = r19;
                            if (i3 != i6) {
                            }
                            if (i5 == aVar.f354c) {
                            }
                            z5 = true;
                            aVar.i = z5;
                            if (aVar2.X) {
                            }
                            aVar.i = true;
                            aVar.e = i5;
                            aVar.f = i4;
                            aVar.h = z15;
                            aVar.g = i3;
                            return;
                        } else {
                            int i21 = this.f;
                            a.f.b.i.c cVar = dVar.y;
                            int i22 = cVar != null ? cVar.e + 0 : 0;
                            a.f.b.i.c cVar2 = dVar.A;
                            if (cVar2 != null) {
                                i22 += cVar2.e;
                            }
                            i = ViewGroup.getChildMeasureSpec(i21, i12 + i22, -1);
                            dVar.g[2] = -1;
                        }
                        z = true;
                        ordinal = aVar5.ordinal();
                        if (ordinal != 0) {
                        }
                        z2 = false;
                        d.a aVar6222 = d.a.MATCH_CONSTRAINT;
                        if (aVar4 == aVar6222) {
                        }
                        if (aVar5 == aVar6222) {
                        }
                        d.a aVar7222 = d.a.MATCH_PARENT;
                        if (aVar5 != aVar7222) {
                        }
                        if (aVar4 != aVar7222) {
                        }
                        if (!z10) {
                        }
                        if (!z11) {
                        }
                        aVar2 = (a) view.getLayoutParams();
                        if (!aVar.j) {
                        }
                        if (view instanceof l) {
                        }
                        view.measure(i, i2);
                        measuredWidth = view.getMeasuredWidth();
                        measuredHeight = view.getMeasuredHeight();
                        i3 = view.getBaseline();
                        if (z) {
                        }
                        if (z2) {
                        }
                        int i17222 = dVar.m;
                        if (i17222 > 0) {
                        }
                        i7 = dVar.n;
                        if (i7 > 0) {
                        }
                        int i18222 = dVar.p;
                        if (i18222 > 0) {
                        }
                        i8 = dVar.q;
                        if (i8 > 0) {
                        }
                        if (!z3) {
                        }
                        i4 = (int) ((((float) i5) / dVar.N) + 0.5f);
                        if (measuredWidth != i5) {
                        }
                        if (measuredHeight != i4) {
                        }
                        view.measure(i, i2);
                        i5 = view.getMeasuredWidth();
                        i4 = view.getMeasuredHeight();
                        i3 = view.getBaseline();
                        i6 = -1;
                        z4 = r19;
                        if (i3 != i6) {
                        }
                        if (i5 == aVar.f354c) {
                        }
                        z5 = true;
                        aVar.i = z5;
                        if (aVar2.X) {
                        }
                        aVar.i = true;
                        aVar.e = i5;
                        aVar.f = i4;
                        aVar.h = z15;
                        aVar.g = i3;
                        return;
                    }
                    int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
                    dVar.g[2] = i9;
                    i = makeMeasureSpec2;
                    z = false;
                    ordinal = aVar5.ordinal();
                    if (ordinal != 0) {
                    }
                    z2 = false;
                    d.a aVar62222 = d.a.MATCH_CONSTRAINT;
                    if (aVar4 == aVar62222) {
                    }
                    if (aVar5 == aVar62222) {
                    }
                    d.a aVar72222 = d.a.MATCH_PARENT;
                    if (aVar5 != aVar72222) {
                    }
                    if (aVar4 != aVar72222) {
                    }
                    if (!z10) {
                    }
                    if (!z11) {
                    }
                    aVar2 = (a) view.getLayoutParams();
                    if (!aVar.j) {
                    }
                    if (view instanceof l) {
                    }
                    view.measure(i, i2);
                    measuredWidth = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    i3 = view.getBaseline();
                    if (z) {
                    }
                    if (z2) {
                    }
                    int i172222 = dVar.m;
                    if (i172222 > 0) {
                    }
                    i7 = dVar.n;
                    if (i7 > 0) {
                    }
                    int i182222 = dVar.p;
                    if (i182222 > 0) {
                    }
                    i8 = dVar.q;
                    if (i8 > 0) {
                    }
                    if (!z3) {
                    }
                    i4 = (int) ((((float) i5) / dVar.N) + 0.5f);
                    if (measuredWidth != i5) {
                    }
                    if (measuredHeight != i4) {
                    }
                    view.measure(i, i2);
                    i5 = view.getMeasuredWidth();
                    i4 = view.getMeasuredHeight();
                    i3 = view.getBaseline();
                    i6 = -1;
                    z4 = r19;
                    if (i3 != i6) {
                    }
                    if (i5 == aVar.f354c) {
                    }
                    z5 = true;
                    aVar.i = z5;
                    if (aVar2.X) {
                    }
                    aVar.i = true;
                    aVar.e = i5;
                    aVar.f = i4;
                    aVar.h = z15;
                    aVar.g = i3;
                    return;
                }
                aVar.e = 0;
                aVar.f = 0;
                aVar.g = 0;
            }
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b bVar = new b(this, this);
        this.r = bVar;
        e eVar = this.d;
        eVar.W = this;
        eVar.h0 = bVar;
        eVar.g0.f = bVar;
        this.f875b.put(getId(), this);
        this.k = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, k.f411b, 0, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 9) {
                    this.e = obtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                } else if (index == 10) {
                    this.f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                } else if (index == 7) {
                    this.g = obtainStyledAttributes.getDimensionPixelOffset(index, this.g);
                } else if (index == 8) {
                    this.h = obtainStyledAttributes.getDimensionPixelOffset(index, this.h);
                } else if (index == 89) {
                    this.j = obtainStyledAttributes.getInt(index, this.j);
                } else if (index == 38) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            this.l = new a.f.c.d(getContext(), this, resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.l = null;
                        }
                    }
                } else if (index == 18) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        a.f.c.e eVar2 = new a.f.c.e();
                        this.k = eVar2;
                        eVar2.d(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.k = null;
                    }
                    this.m = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.d.J(this.j);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    /* JADX WARNING: Removed duplicated region for block: B:156:0x030b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f6 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01da  */
    public void a(boolean z, View view, a.f.b.i.d dVar, a aVar, SparseArray<a.f.b.i.d> sparseArray) {
        int i2;
        int i3;
        int i4;
        int i5;
        float f2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        float f3;
        a.f.b.i.d dVar2;
        int i11;
        int i12;
        a.f.b.i.c f4;
        a.f.b.i.c f5;
        a.f.b.i.d dVar3;
        int i13;
        int i14;
        a.f.b.i.c f6;
        a.f.b.i.c f7;
        a.f.b.i.d dVar4;
        int i15;
        a.f.b.i.c f8;
        a.f.b.i.c f9;
        int i16;
        a.f.b.i.c f10;
        a.f.b.i.c f11;
        d.a aVar2 = d.a.MATCH_PARENT;
        d.a aVar3 = d.a.WRAP_CONTENT;
        d.a aVar4 = d.a.FIXED;
        d.a aVar5 = d.a.MATCH_CONSTRAINT;
        c.a aVar6 = c.a.RIGHT;
        c.a aVar7 = c.a.LEFT;
        c.a aVar8 = c.a.BOTTOM;
        c.a aVar9 = c.a.TOP;
        aVar.a();
        dVar.X = view.getVisibility();
        if (aVar.a0) {
            dVar.x = true;
            dVar.X = 8;
        }
        dVar.W = view;
        if (view instanceof a.f.c.c) {
            ((a.f.c.c) view).f(dVar, this.d.i0);
        }
        if (aVar.Y) {
            f fVar = (f) dVar;
            int i17 = aVar.i0;
            int i18 = aVar.j0;
            float f12 = aVar.k0;
            int i19 = (f12 > -1.0f ? 1 : (f12 == -1.0f ? 0 : -1));
            if (i19 != 0) {
                if (i19 > 0) {
                    fVar.e0 = f12;
                    fVar.f0 = -1;
                    fVar.g0 = -1;
                }
            } else if (i17 != -1) {
                if (i17 > -1) {
                    fVar.e0 = -1.0f;
                    fVar.f0 = i17;
                    fVar.g0 = -1;
                }
            } else if (i18 != -1 && i18 > -1) {
                fVar.e0 = -1.0f;
                fVar.f0 = -1;
                fVar.g0 = i18;
            }
        } else {
            int i20 = aVar.b0;
            int i21 = aVar.c0;
            int i22 = aVar.d0;
            int i23 = aVar.e0;
            int i24 = aVar.f0;
            int i25 = aVar.g0;
            float f13 = aVar.h0;
            int i26 = aVar.m;
            if (i26 != -1) {
                a.f.b.i.d dVar5 = sparseArray.get(i26);
                if (dVar5 != null) {
                    float f14 = aVar.o;
                    int i27 = aVar.n;
                    c.a aVar10 = c.a.CENTER;
                    dVar.f(aVar10).a(dVar5.f(aVar10), i27, 0, true);
                    dVar.v = f14;
                }
            } else {
                if (i20 != -1) {
                    a.f.b.i.d dVar6 = sparseArray.get(i20);
                    if (dVar6 != null) {
                        i16 = ((ViewGroup.MarginLayoutParams) aVar).leftMargin;
                        f10 = dVar.f(aVar7);
                        f11 = dVar6.f(aVar7);
                    }
                    i7 = -1;
                    if (i22 == i7) {
                        a.f.b.i.d dVar7 = sparseArray.get(i22);
                        if (dVar7 != null) {
                            i15 = ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
                            f8 = dVar.f(aVar6);
                            f9 = dVar7.f(aVar7);
                        }
                        i8 = aVar.h;
                        if (i8 == -1) {
                            a.f.b.i.d dVar8 = sparseArray.get(i8);
                            if (dVar8 != null) {
                                i13 = ((ViewGroup.MarginLayoutParams) aVar).topMargin;
                                i14 = aVar.u;
                                f6 = dVar.f(aVar9);
                                f7 = dVar8.f(aVar9);
                            }
                            i9 = aVar.j;
                            if (i9 == -1) {
                                a.f.b.i.d dVar9 = sparseArray.get(i9);
                                if (dVar9 != null) {
                                    i11 = ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
                                    i12 = aVar.w;
                                    f4 = dVar.f(aVar8);
                                    f5 = dVar9.f(aVar9);
                                }
                                i10 = aVar.l;
                                if (i10 != -1) {
                                    View view2 = this.f875b.get(i10);
                                    a.f.b.i.d dVar10 = sparseArray.get(aVar.l);
                                    if (!(dVar10 == null || view2 == null || !(view2.getLayoutParams() instanceof a))) {
                                        a aVar11 = (a) view2.getLayoutParams();
                                        aVar.X = true;
                                        aVar11.X = true;
                                        c.a aVar12 = c.a.BASELINE;
                                        dVar.f(aVar12).a(dVar10.f(aVar12), 0, -1, true);
                                        dVar.w = true;
                                        aVar11.l0.w = true;
                                        dVar.f(aVar9).e();
                                        dVar.f(aVar8).e();
                                    }
                                }
                                if (f13 >= 0.0f) {
                                    dVar.U = f13;
                                }
                                f3 = aVar.A;
                                if (f3 >= 0.0f) {
                                    dVar.V = f3;
                                }
                            } else {
                                int i28 = aVar.k;
                                if (!(i28 == -1 || (dVar2 = sparseArray.get(i28)) == null)) {
                                    i11 = ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
                                    i12 = aVar.w;
                                    f4 = dVar.f(aVar8);
                                    f5 = dVar2.f(aVar8);
                                }
                                i10 = aVar.l;
                                if (i10 != -1) {
                                }
                                if (f13 >= 0.0f) {
                                }
                                f3 = aVar.A;
                                if (f3 >= 0.0f) {
                                }
                            }
                            f4.a(f5, i11, i12, true);
                            i10 = aVar.l;
                            if (i10 != -1) {
                            }
                            if (f13 >= 0.0f) {
                            }
                            f3 = aVar.A;
                            if (f3 >= 0.0f) {
                            }
                        } else {
                            int i29 = aVar.i;
                            if (!(i29 == -1 || (dVar3 = sparseArray.get(i29)) == null)) {
                                i13 = ((ViewGroup.MarginLayoutParams) aVar).topMargin;
                                i14 = aVar.u;
                                f6 = dVar.f(aVar9);
                                f7 = dVar3.f(aVar8);
                            }
                            i9 = aVar.j;
                            if (i9 == -1) {
                            }
                            f4.a(f5, i11, i12, true);
                            i10 = aVar.l;
                            if (i10 != -1) {
                            }
                            if (f13 >= 0.0f) {
                            }
                            f3 = aVar.A;
                            if (f3 >= 0.0f) {
                            }
                        }
                        f6.a(f7, i13, i14, true);
                        i9 = aVar.j;
                        if (i9 == -1) {
                        }
                        f4.a(f5, i11, i12, true);
                        i10 = aVar.l;
                        if (i10 != -1) {
                        }
                        if (f13 >= 0.0f) {
                        }
                        f3 = aVar.A;
                        if (f3 >= 0.0f) {
                        }
                    } else {
                        if (!(i23 == i7 || (dVar4 = sparseArray.get(i23)) == null)) {
                            i15 = ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
                            f8 = dVar.f(aVar6);
                            f9 = dVar4.f(aVar6);
                        }
                        i8 = aVar.h;
                        if (i8 == -1) {
                        }
                        f6.a(f7, i13, i14, true);
                        i9 = aVar.j;
                        if (i9 == -1) {
                        }
                        f4.a(f5, i11, i12, true);
                        i10 = aVar.l;
                        if (i10 != -1) {
                        }
                        if (f13 >= 0.0f) {
                        }
                        f3 = aVar.A;
                        if (f3 >= 0.0f) {
                        }
                    }
                    f8.a(f9, i15, i25, true);
                    i8 = aVar.h;
                    if (i8 == -1) {
                    }
                    f6.a(f7, i13, i14, true);
                    i9 = aVar.j;
                    if (i9 == -1) {
                    }
                    f4.a(f5, i11, i12, true);
                    i10 = aVar.l;
                    if (i10 != -1) {
                    }
                    if (f13 >= 0.0f) {
                    }
                    f3 = aVar.A;
                    if (f3 >= 0.0f) {
                    }
                } else if (i21 != -1) {
                    a.f.b.i.d dVar11 = sparseArray.get(i21);
                    if (dVar11 != null) {
                        i16 = ((ViewGroup.MarginLayoutParams) aVar).leftMargin;
                        f10 = dVar.f(aVar7);
                        f11 = dVar11.f(aVar6);
                    }
                    i7 = -1;
                    if (i22 == i7) {
                    }
                    f8.a(f9, i15, i25, true);
                    i8 = aVar.h;
                    if (i8 == -1) {
                    }
                    f6.a(f7, i13, i14, true);
                    i9 = aVar.j;
                    if (i9 == -1) {
                    }
                    f4.a(f5, i11, i12, true);
                    i10 = aVar.l;
                    if (i10 != -1) {
                    }
                    if (f13 >= 0.0f) {
                    }
                    f3 = aVar.A;
                    if (f3 >= 0.0f) {
                    }
                } else {
                    i7 = -1;
                    if (i22 == i7) {
                    }
                    f8.a(f9, i15, i25, true);
                    i8 = aVar.h;
                    if (i8 == -1) {
                    }
                    f6.a(f7, i13, i14, true);
                    i9 = aVar.j;
                    if (i9 == -1) {
                    }
                    f4.a(f5, i11, i12, true);
                    i10 = aVar.l;
                    if (i10 != -1) {
                    }
                    if (f13 >= 0.0f) {
                    }
                    f3 = aVar.A;
                    if (f3 >= 0.0f) {
                    }
                }
                f10.a(f11, i16, i24, true);
                i7 = -1;
                if (i22 == i7) {
                }
                f8.a(f9, i15, i25, true);
                i8 = aVar.h;
                if (i8 == -1) {
                }
                f6.a(f7, i13, i14, true);
                i9 = aVar.j;
                if (i9 == -1) {
                }
                f4.a(f5, i11, i12, true);
                i10 = aVar.l;
                if (i10 != -1) {
                }
                if (f13 >= 0.0f) {
                }
                f3 = aVar.A;
                if (f3 >= 0.0f) {
                }
            }
            if (z && !((i6 = aVar.P) == -1 && aVar.Q == -1)) {
                int i30 = aVar.Q;
                dVar.P = i6;
                dVar.Q = i30;
            }
            if (aVar.V) {
                dVar.J[0] = aVar4;
                dVar.B(((ViewGroup.MarginLayoutParams) aVar).width);
                if (((ViewGroup.MarginLayoutParams) aVar).width == -2) {
                    dVar.J[0] = aVar3;
                }
            } else if (((ViewGroup.MarginLayoutParams) aVar).width == -1) {
                if (aVar.S) {
                    dVar.J[0] = aVar5;
                } else {
                    dVar.J[0] = aVar2;
                }
                dVar.f(aVar7).e = ((ViewGroup.MarginLayoutParams) aVar).leftMargin;
                dVar.f(aVar6).e = ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
            } else {
                dVar.J[0] = aVar5;
                dVar.B(0);
            }
            if (!aVar.W) {
                i2 = -1;
                if (((ViewGroup.MarginLayoutParams) aVar).height == -1) {
                    if (aVar.T) {
                        dVar.J[1] = aVar5;
                    } else {
                        dVar.J[1] = aVar2;
                    }
                    dVar.f(aVar9).e = ((ViewGroup.MarginLayoutParams) aVar).topMargin;
                    dVar.f(aVar8).e = ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
                } else {
                    dVar.J[1] = aVar5;
                    dVar.w(0);
                }
            } else {
                i2 = -1;
                dVar.J[1] = aVar4;
                dVar.w(((ViewGroup.MarginLayoutParams) aVar).height);
                if (((ViewGroup.MarginLayoutParams) aVar).height == -2) {
                    dVar.J[1] = aVar3;
                }
            }
            String str = aVar.B;
            if (str == null || str.length() == 0) {
                dVar.N = 0.0f;
            } else {
                int length = str.length();
                int indexOf = str.indexOf(44);
                if (indexOf <= 0 || indexOf >= length - 1) {
                    i4 = 1;
                    i3 = i2;
                    i5 = 0;
                } else {
                    String substring = str.substring(0, indexOf);
                    if (substring.equalsIgnoreCase("W")) {
                        i4 = 1;
                        i3 = 0;
                    } else if (substring.equalsIgnoreCase("H")) {
                        i4 = 1;
                        i3 = 1;
                    } else {
                        i3 = i2;
                        i4 = 1;
                    }
                    i5 = indexOf + i4;
                }
                int indexOf2 = str.indexOf(58);
                if (indexOf2 < 0 || indexOf2 >= length - i4) {
                    String substring2 = str.substring(i5);
                    if (substring2.length() > 0) {
                        f2 = Float.parseFloat(substring2);
                        if (f2 > 0.0f) {
                            dVar.N = f2;
                            dVar.O = i3;
                        }
                    }
                } else {
                    String substring3 = str.substring(i5, indexOf2);
                    String substring4 = str.substring(indexOf2 + i4);
                    if (substring3.length() > 0 && substring4.length() > 0) {
                        try {
                            float parseFloat = Float.parseFloat(substring3);
                            float parseFloat2 = Float.parseFloat(substring4);
                            if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                f2 = i3 == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                                if (f2 > 0.0f) {
                                }
                            }
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
                f2 = 0.0f;
                if (f2 > 0.0f) {
                }
            }
            float f15 = aVar.D;
            float[] fArr = dVar.b0;
            int i31 = 0;
            fArr[0] = f15;
            fArr[1] = aVar.E;
            dVar.Z = aVar.F;
            dVar.a0 = aVar.G;
            int i32 = aVar.H;
            int i33 = aVar.J;
            int i34 = aVar.L;
            float f16 = aVar.N;
            dVar.j = i32;
            dVar.m = i33;
            if (i34 == Integer.MAX_VALUE) {
                i34 = 0;
            }
            dVar.n = i34;
            dVar.o = f16;
            if (f16 > 0.0f && f16 < 1.0f && i32 == 0) {
                dVar.j = 2;
            }
            int i35 = aVar.I;
            int i36 = aVar.K;
            int i37 = aVar.M;
            float f17 = aVar.O;
            dVar.k = i35;
            dVar.p = i36;
            if (i37 != Integer.MAX_VALUE) {
                i31 = i37;
            }
            dVar.q = i31;
            dVar.r = f17;
            if (f17 > 0.0f && f17 < 1.0f && i35 == 0) {
                dVar.k = 2;
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
    }

    /* renamed from: b */
    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    public Object c(int i2, Object obj) {
        if (i2 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.n;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.n.get(str);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public View d(int i2) {
        return this.f875b.get(i2);
    }

    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<a.f.c.c> arrayList = this.f876c;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                this.f876c.get(i2).i();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = (float) getWidth();
            float height = (float) getHeight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i4 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i5 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f2 = (float) i4;
                        float f3 = (float) i5;
                        float f4 = (float) (i4 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                        canvas.drawLine(f2, f3, f4, f3, paint);
                        float parseInt4 = (float) (i5 + ((int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height)));
                        canvas.drawLine(f4, f3, f4, parseInt4, paint);
                        canvas.drawLine(f4, parseInt4, f2, parseInt4, paint);
                        canvas.drawLine(f2, parseInt4, f2, f3, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f2, f3, f4, parseInt4, paint);
                        canvas.drawLine(f2, parseInt4, f4, f3, paint);
                    }
                }
            }
        }
    }

    public final a.f.b.i.d e(View view) {
        if (view == this) {
            return this.d;
        }
        if (view == null) {
            return null;
        }
        return ((a) view.getLayoutParams()).l0;
    }

    public boolean f() {
        return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
    }

    public void forceLayout() {
        this.i = true;
        this.o = -1;
        this.p = -1;
        super.forceLayout();
    }

    public void g(int i2, Object obj, Object obj2) {
        if (i2 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.n == null) {
                this.n = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.n.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public int getMaxHeight() {
        return this.h;
    }

    public int getMaxWidth() {
        return this.g;
    }

    public int getMinHeight() {
        return this.f;
    }

    public int getMinWidth() {
        return this.e;
    }

    public int getOptimizationLevel() {
        return this.d.q0;
    }

    public final boolean h() {
        int i2;
        boolean z;
        int i3;
        boolean z2;
        boolean z3;
        String str;
        int d2;
        int i4;
        boolean z4;
        boolean z5;
        int i5;
        int i6;
        NoSuchMethodException e2;
        IllegalAccessException e3;
        InvocationTargetException e4;
        String str2;
        a.f.b.i.d dVar;
        int childCount = getChildCount();
        int i7 = 0;
        int i8 = 0;
        while (true) {
            i2 = 1;
            if (i8 >= childCount) {
                z = false;
                break;
            } else if (getChildAt(i8).isLayoutRequested()) {
                z = true;
                break;
            } else {
                i8++;
            }
        }
        if (!z) {
            return z;
        }
        boolean isInEditMode = isInEditMode();
        int childCount2 = getChildCount();
        for (int i9 = 0; i9 < childCount2; i9++) {
            a.f.b.i.d e5 = e(getChildAt(i9));
            if (e5 != null) {
                e5.u();
            }
        }
        int i10 = -1;
        if (isInEditMode) {
            for (int i11 = 0; i11 < childCount2; i11++) {
                View childAt = getChildAt(i11);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    g(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    int id = childAt.getId();
                    if (id != 0) {
                        View view = this.f875b.get(id);
                        if (view == null && (view = findViewById(id)) != null && view != this && view.getParent() == this) {
                            onViewAdded(view);
                        }
                        if (view != this) {
                            dVar = view == null ? null : ((a) view.getLayoutParams()).l0;
                            dVar.Y = resourceName;
                        }
                    }
                    dVar = this.d;
                    dVar.Y = resourceName;
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.m != -1) {
            for (int i12 = 0; i12 < childCount2; i12++) {
                View childAt2 = getChildAt(i12);
                if (childAt2.getId() == this.m && (childAt2 instanceof a.f.c.f)) {
                    this.k = ((a.f.c.f) childAt2).getConstraintSet();
                }
            }
        }
        a.f.c.e eVar = this.k;
        if (eVar != null) {
            int childCount3 = getChildCount();
            HashSet hashSet = new HashSet(eVar.f391c.keySet());
            while (i7 < childCount3) {
                View childAt3 = getChildAt(i7);
                int id2 = childAt3.getId();
                if (!eVar.f391c.containsKey(Integer.valueOf(id2))) {
                    StringBuilder d3 = b.a.a.a.a.d("id unknown ");
                    try {
                        str2 = childAt3.getContext().getResources().getResourceEntryName(childAt3.getId());
                    } catch (Exception unused2) {
                        str2 = "UNKNOWN";
                    }
                    d3.append(str2);
                    Log.w("ConstraintSet", d3.toString());
                } else if (eVar.f390b && id2 == i10) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                } else if (id2 != i10) {
                    if (eVar.f391c.containsKey(Integer.valueOf(id2))) {
                        hashSet.remove(Integer.valueOf(id2));
                        e.a aVar = eVar.f391c.get(Integer.valueOf(id2));
                        if (childAt3 instanceof a.f.c.a) {
                            aVar.d.d0 = i2;
                        }
                        int i13 = aVar.d.d0;
                        if (i13 != i10 && i13 == i2) {
                            a.f.c.a aVar2 = (a.f.c.a) childAt3;
                            aVar2.setId(id2);
                            aVar2.setType(aVar.d.b0);
                            aVar2.setMargin(aVar.d.c0);
                            aVar2.setAllowsGoneWidget(aVar.d.j0);
                            e.b bVar = aVar.d;
                            int[] iArr = bVar.e0;
                            if (iArr != null) {
                                aVar2.setReferencedIds(iArr);
                            } else {
                                String str3 = bVar.f0;
                                if (str3 != null) {
                                    bVar.e0 = eVar.b(aVar2, str3);
                                    aVar2.setReferencedIds(aVar.d.e0);
                                }
                            }
                        }
                        a aVar3 = (a) childAt3.getLayoutParams();
                        aVar3.a();
                        aVar.a(aVar3);
                        HashMap<String, a.f.c.b> hashMap = aVar.f;
                        i5 = childCount3;
                        Class<?> cls = childAt3.getClass();
                        for (String str4 : hashMap.keySet()) {
                            a.f.c.b bVar2 = hashMap.get(str4);
                            String b2 = b.a.a.a.a.b("set", str4);
                            try {
                                switch (bVar2.f374b.ordinal()) {
                                    case 0:
                                        i6 = childCount2;
                                        cls.getMethod(b2, Integer.TYPE).invoke(childAt3, Integer.valueOf(bVar2.f375c));
                                        break;
                                    case 1:
                                        i6 = childCount2;
                                        cls.getMethod(b2, Float.TYPE).invoke(childAt3, Float.valueOf(bVar2.d));
                                        break;
                                    case 2:
                                        i6 = childCount2;
                                        cls.getMethod(b2, Integer.TYPE).invoke(childAt3, Integer.valueOf(bVar2.g));
                                        break;
                                    case 3:
                                        i6 = childCount2;
                                        Method method = cls.getMethod(b2, Drawable.class);
                                        ColorDrawable colorDrawable = new ColorDrawable();
                                        colorDrawable.setColor(bVar2.g);
                                        method.invoke(childAt3, colorDrawable);
                                        break;
                                    case 4:
                                        i6 = childCount2;
                                        cls.getMethod(b2, CharSequence.class).invoke(childAt3, bVar2.e);
                                        break;
                                    case 5:
                                        i6 = childCount2;
                                        cls.getMethod(b2, Boolean.TYPE).invoke(childAt3, Boolean.valueOf(bVar2.f));
                                        break;
                                    case 6:
                                        i6 = childCount2;
                                        try {
                                            cls.getMethod(b2, Float.TYPE).invoke(childAt3, Float.valueOf(bVar2.d));
                                        } catch (NoSuchMethodException e6) {
                                            e2 = e6;
                                            Log.e("TransitionLayout", e2.getMessage());
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName());
                                            StringBuilder sb = new StringBuilder();
                                            sb.append(cls.getName());
                                            sb.append(" must have a method ");
                                            sb.append(b2);
                                            Log.e("TransitionLayout", sb.toString());
                                            z = z;
                                            hashMap = hashMap;
                                            isInEditMode = isInEditMode;
                                            childCount2 = i6;
                                        } catch (IllegalAccessException e7) {
                                            e3 = e7;
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName());
                                            e3.printStackTrace();
                                            z = z;
                                            hashMap = hashMap;
                                            isInEditMode = isInEditMode;
                                            childCount2 = i6;
                                        } catch (InvocationTargetException e8) {
                                            e4 = e8;
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName());
                                            e4.printStackTrace();
                                            z = z;
                                            hashMap = hashMap;
                                            isInEditMode = isInEditMode;
                                            childCount2 = i6;
                                        }
                                    default:
                                        i6 = childCount2;
                                        break;
                                }
                            } catch (NoSuchMethodException e9) {
                                e2 = e9;
                                i6 = childCount2;
                                Log.e("TransitionLayout", e2.getMessage());
                                Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName());
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(cls.getName());
                                sb2.append(" must have a method ");
                                sb2.append(b2);
                                Log.e("TransitionLayout", sb2.toString());
                                z = z;
                                hashMap = hashMap;
                                isInEditMode = isInEditMode;
                                childCount2 = i6;
                            } catch (IllegalAccessException e10) {
                                e3 = e10;
                                i6 = childCount2;
                                Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName());
                                e3.printStackTrace();
                                z = z;
                                hashMap = hashMap;
                                isInEditMode = isInEditMode;
                                childCount2 = i6;
                            } catch (InvocationTargetException e11) {
                                e4 = e11;
                                i6 = childCount2;
                                Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName());
                                e4.printStackTrace();
                                z = z;
                                hashMap = hashMap;
                                isInEditMode = isInEditMode;
                                childCount2 = i6;
                            }
                            z = z;
                            hashMap = hashMap;
                            isInEditMode = isInEditMode;
                            childCount2 = i6;
                        }
                        z5 = z;
                        z4 = isInEditMode;
                        i4 = childCount2;
                        childAt3.setLayoutParams(aVar3);
                        e.d dVar2 = aVar.f393b;
                        if (dVar2.f403c == 0) {
                            childAt3.setVisibility(dVar2.f402b);
                        }
                        childAt3.setAlpha(aVar.f393b.d);
                        childAt3.setRotation(aVar.e.f405b);
                        childAt3.setRotationX(aVar.e.f406c);
                        childAt3.setRotationY(aVar.e.d);
                        childAt3.setScaleX(aVar.e.e);
                        childAt3.setScaleY(aVar.e.f);
                        if (!Float.isNaN(aVar.e.g)) {
                            childAt3.setPivotX(aVar.e.g);
                        }
                        if (!Float.isNaN(aVar.e.h)) {
                            childAt3.setPivotY(aVar.e.h);
                        }
                        childAt3.setTranslationX(aVar.e.i);
                        childAt3.setTranslationY(aVar.e.j);
                        childAt3.setTranslationZ(aVar.e.k);
                        e.C0009e eVar2 = aVar.e;
                        if (eVar2.l) {
                            childAt3.setElevation(eVar2.m);
                        }
                    } else {
                        i5 = childCount3;
                        z5 = z;
                        z4 = isInEditMode;
                        i4 = childCount2;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                    }
                    i7++;
                    i10 = -1;
                    i2 = 1;
                    childCount3 = i5;
                    z = z5;
                    isInEditMode = z4;
                    childCount2 = i4;
                }
                i5 = childCount3;
                z5 = z;
                z4 = isInEditMode;
                i4 = childCount2;
                i7++;
                i10 = -1;
                i2 = 1;
                childCount3 = i5;
                z = z5;
                isInEditMode = z4;
                childCount2 = i4;
            }
            z3 = z;
            z2 = isInEditMode;
            i3 = childCount2;
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                e.a aVar4 = eVar.f391c.get(num);
                int i14 = aVar4.d.d0;
                if (i14 != -1 && i14 == 1) {
                    a.f.c.a aVar5 = new a.f.c.a(getContext());
                    aVar5.setId(num.intValue());
                    e.b bVar3 = aVar4.d;
                    int[] iArr2 = bVar3.e0;
                    if (iArr2 != null) {
                        aVar5.setReferencedIds(iArr2);
                    } else {
                        String str5 = bVar3.f0;
                        if (str5 != null) {
                            bVar3.e0 = eVar.b(aVar5, str5);
                            aVar5.setReferencedIds(aVar4.d.e0);
                        }
                    }
                    aVar5.setType(aVar4.d.b0);
                    aVar5.setMargin(aVar4.d.c0);
                    a b3 = generateDefaultLayoutParams();
                    aVar5.j();
                    aVar4.a(b3);
                    addView(aVar5, b3);
                }
                if (aVar4.d.f395a) {
                    View hVar = new h(getContext());
                    hVar.setId(num.intValue());
                    a b4 = generateDefaultLayoutParams();
                    aVar4.a(b4);
                    addView(hVar, b4);
                }
            }
        } else {
            z3 = z;
            z2 = isInEditMode;
            i3 = childCount2;
        }
        this.d.e0.clear();
        int size = this.f876c.size();
        if (size > 0) {
            for (int i15 = 0; i15 < size; i15++) {
                a.f.c.c cVar = this.f876c.get(i15);
                if (cVar.isInEditMode()) {
                    cVar.setIds(cVar.f);
                }
                g gVar = cVar.e;
                if (gVar != null) {
                    a.f.b.i.h hVar2 = (a.f.b.i.h) gVar;
                    hVar2.f0 = 0;
                    Arrays.fill(hVar2.e0, (Object) null);
                    for (int i16 = 0; i16 < cVar.f380c; i16++) {
                        int i17 = cVar.f379b[i16];
                        View d4 = d(i17);
                        if (d4 == null && (d2 = cVar.d(this, (str = cVar.g.get(Integer.valueOf(i17))))) != 0) {
                            cVar.f379b[i16] = d2;
                            cVar.g.put(Integer.valueOf(d2), str);
                            d4 = d(d2);
                        }
                        if (d4 != null) {
                            g gVar2 = cVar.e;
                            a.f.b.i.d e12 = e(d4);
                            a.f.b.i.h hVar3 = (a.f.b.i.h) gVar2;
                            Objects.requireNonNull(hVar3);
                            if (!(e12 == hVar3 || e12 == null)) {
                                int i18 = hVar3.f0 + 1;
                                a.f.b.i.d[] dVarArr = hVar3.e0;
                                if (i18 > dVarArr.length) {
                                    hVar3.e0 = (a.f.b.i.d[]) Arrays.copyOf(dVarArr, dVarArr.length * 2);
                                }
                                a.f.b.i.d[] dVarArr2 = hVar3.e0;
                                int i19 = hVar3.f0;
                                dVarArr2[i19] = e12;
                                hVar3.f0 = i19 + 1;
                            }
                        }
                    }
                    cVar.e.a(this.d);
                }
            }
        }
        for (int i20 = 0; i20 < i3; i20++) {
            View childAt4 = getChildAt(i20);
            if (childAt4 instanceof i) {
                i iVar = (i) childAt4;
                if (iVar.f408b == -1 && !iVar.isInEditMode()) {
                    iVar.setVisibility(iVar.d);
                }
                View findViewById = findViewById(iVar.f408b);
                iVar.f409c = findViewById;
                if (findViewById != null) {
                    ((a) findViewById.getLayoutParams()).a0 = true;
                    iVar.f409c.setVisibility(0);
                    iVar.setVisibility(0);
                }
            }
        }
        this.q.clear();
        this.q.put(0, this.d);
        this.q.put(getId(), this.d);
        for (int i21 = 0; i21 < i3; i21++) {
            View childAt5 = getChildAt(i21);
            this.q.put(childAt5.getId(), e(childAt5));
        }
        for (int i22 = 0; i22 < i3; i22++) {
            View childAt6 = getChildAt(i22);
            a.f.b.i.d e13 = e(childAt6);
            if (e13 != null) {
                a aVar6 = (a) childAt6.getLayoutParams();
                a.f.b.i.e eVar3 = this.d;
                eVar3.e0.add(e13);
                a.f.b.i.d dVar3 = e13.K;
                if (dVar3 != null) {
                    ((a.f.b.i.k) dVar3).e0.remove(e13);
                    e13.K = null;
                }
                e13.K = eVar3;
                a(z2, childAt6, e13, aVar6, this.q);
            }
        }
        return z3;
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            a aVar = (a) childAt.getLayoutParams();
            a.f.b.i.d dVar = aVar.l0;
            if ((childAt.getVisibility() != 8 || aVar.Y || aVar.Z || isInEditMode) && !aVar.a0) {
                int p2 = dVar.p();
                int q2 = dVar.q();
                int o2 = dVar.o() + p2;
                int i7 = dVar.i() + q2;
                childAt.layout(p2, q2, o2, i7);
                if ((childAt instanceof i) && (content = ((i) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(p2, q2, o2, i7);
                }
            }
        }
        int size = this.f876c.size();
        if (size > 0) {
            for (int i8 = 0; i8 < size; i8++) {
                this.f876c.get(i8).g();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x03c0  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x03e1  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x04cc  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x04df  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x0573  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0578  */
    /* JADX WARNING: Removed duplicated region for block: B:348:0x078d  */
    /* JADX WARNING: Removed duplicated region for block: B:350:0x0790  */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x0412 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0213 A[ADDED_TO_REGION] */
    public void onMeasure(int i2, int i3) {
        d.a aVar;
        d.a aVar2;
        int i4;
        int i5;
        int i6;
        int i7;
        d.a aVar3;
        int size;
        boolean a2;
        boolean z;
        boolean z2;
        int i8;
        int i9;
        int i10;
        b.AbstractC0008b bVar;
        c.a aVar4;
        c.a aVar5;
        boolean z3;
        int i11;
        boolean z4;
        boolean z5;
        int size2;
        boolean z6;
        boolean z7;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        b.AbstractC0008b bVar2;
        c.a aVar6;
        c.a aVar7;
        int i18;
        int i19;
        int i20;
        boolean z8;
        int i21;
        int i22;
        boolean z9;
        Iterator<m> it;
        Iterator<m> it2;
        boolean z10;
        d.a aVar8;
        int i23;
        int i24;
        d.a aVar9 = d.a.MATCH_PARENT;
        d.a aVar10 = d.a.MATCH_CONSTRAINT;
        this.d.i0 = f();
        if (this.i) {
            this.i = false;
            if (h()) {
                a.f.b.i.e eVar = this.d;
                a.f.b.i.l.b bVar3 = eVar.f0;
                bVar3.f349a.clear();
                int size3 = eVar.e0.size();
                for (int i25 = 0; i25 < size3; i25++) {
                    a.f.b.i.d dVar = eVar.e0.get(i25);
                    if (dVar.j() == aVar10 || dVar.j() == aVar9 || dVar.n() == aVar10 || dVar.n() == aVar9) {
                        bVar3.f349a.add(dVar);
                    }
                }
                eVar.I();
            }
        }
        a.f.b.i.e eVar2 = this.d;
        int i26 = this.j;
        d.a aVar11 = d.a.FIXED;
        int mode = View.MeasureSpec.getMode(i2);
        int size4 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size5 = View.MeasureSpec.getSize(i3);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i27 = max + max2;
        int paddingWidth = getPaddingWidth();
        b bVar4 = this.r;
        bVar4.f882b = max;
        bVar4.f883c = max2;
        bVar4.d = paddingWidth;
        bVar4.e = i27;
        bVar4.f = i2;
        bVar4.g = i3;
        int max3 = Math.max(0, getPaddingStart());
        int max4 = Math.max(0, getPaddingEnd());
        if (max3 <= 0 && max4 <= 0) {
            max3 = Math.max(0, getPaddingLeft());
        } else if (f()) {
            max3 = max4;
        }
        int i28 = size4 - paddingWidth;
        int i29 = size5 - i27;
        d.a aVar12 = d.a.WRAP_CONTENT;
        b bVar5 = this.r;
        int i30 = bVar5.e;
        int i31 = bVar5.d;
        int childCount = getChildCount();
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    aVar2 = aVar11;
                } else {
                    aVar = aVar12;
                    i4 = Integer.MIN_VALUE;
                    i5 = Math.min(this.g - i31, i28);
                    aVar2 = aVar11;
                    if (mode2 == i4) {
                        if (mode2 != 0) {
                            if (mode2 != 1073741824) {
                                aVar3 = aVar11;
                            } else {
                                i7 = Math.min(this.h - i30, i29);
                                i6 = i29;
                                aVar3 = aVar11;
                                if (!(i5 == eVar2.o() && i7 == eVar2.i())) {
                                    eVar2.g0.f357c = true;
                                }
                                eVar2.P = 0;
                                eVar2.Q = 0;
                                int[] iArr = eVar2.u;
                                iArr[0] = this.g - i31;
                                iArr[1] = this.h - i30;
                                eVar2.z(0);
                                eVar2.y(0);
                                eVar2.J[0] = aVar2;
                                eVar2.B(i5);
                                eVar2.J[1] = aVar3;
                                eVar2.w(i7);
                                eVar2.z(this.e - i31);
                                eVar2.y(this.f - i30);
                                eVar2.k0 = max3;
                                eVar2.l0 = max;
                                a.f.b.i.l.b bVar6 = eVar2.f0;
                                Objects.requireNonNull(bVar6);
                                c.a aVar13 = c.a.BOTTOM;
                                c.a aVar14 = c.a.RIGHT;
                                b.AbstractC0008b bVar7 = eVar2.h0;
                                size = eVar2.e0.size();
                                int o2 = eVar2.o();
                                int i32 = eVar2.i();
                                a2 = a.f.b.i.i.a(i26, 128);
                                z = !a2 || a.f.b.i.i.a(i26, 64);
                                if (z) {
                                    int i33 = 0;
                                    while (true) {
                                        if (i33 >= size) {
                                            break;
                                        }
                                        a.f.b.i.d dVar2 = eVar2.e0.get(i33);
                                        boolean z11 = (dVar2.j() == aVar10) && (dVar2.n() == aVar10) && dVar2.N > 0.0f;
                                        if ((!dVar2.s() || !z11) && ((!dVar2.t() || !z11) && !(dVar2 instanceof j) && !dVar2.s() && !dVar2.t())) {
                                            i33++;
                                            z = z;
                                        }
                                    }
                                    i8 = 1073741824;
                                    z2 = false;
                                    if (!z2 || !((mode != i8 && mode2 == i8) || a2)) {
                                        int min = Math.min(eVar2.u[0], i28);
                                        int min2 = Math.min(eVar2.u[1], i6);
                                        if (mode == 1073741824) {
                                            if (eVar2.o() != min) {
                                                eVar2.B(min);
                                                eVar2.I();
                                            }
                                            i18 = 1073741824;
                                        } else {
                                            i18 = 1073741824;
                                        }
                                        if (mode2 == i18 && eVar2.i() != min2) {
                                            eVar2.w(min2);
                                            eVar2.I();
                                        }
                                        if (mode == i18 && mode2 == i18) {
                                            a.f.b.i.l.e eVar3 = eVar2.g0;
                                            boolean z12 = a2 & true;
                                            if (eVar3.f356b || eVar3.f357c) {
                                                for (Iterator<a.f.b.i.d> it3 = eVar3.f355a.e0.iterator(); it3.hasNext(); it3 = it3) {
                                                    a.f.b.i.d next = it3.next();
                                                    next.f342a = false;
                                                    next.d.n();
                                                    next.e.m();
                                                }
                                                a.f.b.i.e eVar4 = eVar3.f355a;
                                                i22 = 0;
                                                eVar4.f342a = false;
                                                eVar4.d.n();
                                                eVar3.f355a.e.m();
                                                eVar3.f357c = false;
                                            } else {
                                                i22 = 0;
                                            }
                                            eVar3.b(eVar3.d);
                                            a.f.b.i.e eVar5 = eVar3.f355a;
                                            eVar5.P = i22;
                                            eVar5.Q = i22;
                                            d.a h2 = eVar5.h(i22);
                                            d.a h3 = eVar3.f355a.h(1);
                                            if (eVar3.f356b) {
                                                eVar3.c();
                                            }
                                            int p2 = eVar3.f355a.p();
                                            aVar5 = aVar13;
                                            int q2 = eVar3.f355a.q();
                                            aVar4 = aVar14;
                                            eVar3.f355a.d.h.c(p2);
                                            eVar3.f355a.e.h.c(q2);
                                            eVar3.g();
                                            if (h2 == aVar || h3 == aVar) {
                                                boolean z13 = z12;
                                                if (z12) {
                                                    Iterator<m> it4 = eVar3.e.iterator();
                                                    while (true) {
                                                        if (it4.hasNext()) {
                                                            if (!it4.next().k()) {
                                                                z13 = false;
                                                                break;
                                                            }
                                                        } else {
                                                            break;
                                                        }
                                                    }
                                                }
                                                if (!z13 || h2 != aVar) {
                                                    bVar = bVar7;
                                                    i10 = o2;
                                                } else {
                                                    a.f.b.i.e eVar6 = eVar3.f355a;
                                                    bVar = bVar7;
                                                    i10 = o2;
                                                    eVar6.J[0] = aVar11;
                                                    eVar6.B(eVar3.d(eVar6, 0));
                                                    a.f.b.i.e eVar7 = eVar3.f355a;
                                                    eVar7.d.e.c(eVar7.o());
                                                }
                                                if (z13 && h3 == aVar) {
                                                    a.f.b.i.e eVar8 = eVar3.f355a;
                                                    eVar8.J[1] = aVar11;
                                                    eVar8.w(eVar3.d(eVar8, 1));
                                                    a.f.b.i.e eVar9 = eVar3.f355a;
                                                    eVar9.e.e.c(eVar9.i());
                                                }
                                            } else {
                                                bVar = bVar7;
                                                i10 = o2;
                                            }
                                            a.f.b.i.e eVar10 = eVar3.f355a;
                                            d.a[] aVarArr = eVar10.J;
                                            aVar = aVar;
                                            i9 = i32;
                                            if (aVarArr[0] != aVar11) {
                                                d.a aVar15 = aVarArr[0];
                                                aVar8 = aVar9;
                                                if (aVar15 != aVar8) {
                                                    z9 = false;
                                                    it = eVar3.e.iterator();
                                                    while (it.hasNext()) {
                                                        m next2 = it.next();
                                                        if (next2.f368b != eVar3.f355a || next2.g) {
                                                            next2.e();
                                                        }
                                                    }
                                                    it2 = eVar3.e.iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            z10 = true;
                                                            break;
                                                        }
                                                        m next3 = it2.next();
                                                        if ((z9 || next3.f368b != eVar3.f355a) && (!next3.h.j || ((!next3.i.j && !(next3 instanceof a.f.b.i.l.h)) || (!next3.e.j && !(next3 instanceof a.f.b.i.l.c) && !(next3 instanceof a.f.b.i.l.h))))) {
                                                            z10 = false;
                                                        }
                                                    }
                                                    z10 = false;
                                                    eVar3.f355a.x(h2);
                                                    eVar3.f355a.A(h3);
                                                    z3 = z10;
                                                    i19 = 1073741824;
                                                    i11 = 2;
                                                }
                                            } else {
                                                aVar8 = aVar9;
                                            }
                                            int o3 = eVar10.o() + p2;
                                            eVar3.f355a.d.i.c(o3);
                                            eVar3.f355a.d.e.c(o3 - p2);
                                            eVar3.g();
                                            a.f.b.i.e eVar11 = eVar3.f355a;
                                            d.a[] aVarArr2 = eVar11.J;
                                            if (aVarArr2[1] == aVar11 || aVarArr2[1] == aVar8) {
                                                int i34 = eVar11.i() + q2;
                                                eVar3.f355a.e.i.c(i34);
                                                eVar3.f355a.e.e.c(i34 - q2);
                                            }
                                            eVar3.g();
                                            z9 = true;
                                            it = eVar3.e.iterator();
                                            while (it.hasNext()) {
                                            }
                                            it2 = eVar3.e.iterator();
                                            while (true) {
                                                if (it2.hasNext()) {
                                                }
                                            }
                                            z10 = false;
                                            eVar3.f355a.x(h2);
                                            eVar3.f355a.A(h3);
                                            z3 = z10;
                                            i19 = 1073741824;
                                            i11 = 2;
                                        } else {
                                            aVar5 = aVar13;
                                            aVar4 = aVar14;
                                            bVar = bVar7;
                                            i10 = o2;
                                            i9 = i32;
                                            a.f.b.i.l.e eVar12 = eVar2.g0;
                                            if (eVar12.f356b) {
                                                Iterator<a.f.b.i.d> it5 = eVar12.f355a.e0.iterator();
                                                while (it5.hasNext()) {
                                                    a.f.b.i.d next4 = it5.next();
                                                    next4.f342a = false;
                                                    a.f.b.i.l.j jVar = next4.d;
                                                    jVar.e.j = false;
                                                    jVar.g = false;
                                                    jVar.n();
                                                    a.f.b.i.l.l lVar = next4.e;
                                                    lVar.e.j = false;
                                                    lVar.g = false;
                                                    lVar.m();
                                                }
                                                i20 = 0;
                                                a.f.b.i.e eVar13 = eVar12.f355a;
                                                eVar13.f342a = false;
                                                a.f.b.i.l.j jVar2 = eVar13.d;
                                                jVar2.e.j = false;
                                                jVar2.g = false;
                                                jVar2.n();
                                                a.f.b.i.l.l lVar2 = eVar12.f355a.e;
                                                lVar2.e.j = false;
                                                lVar2.g = false;
                                                lVar2.m();
                                                eVar12.c();
                                            } else {
                                                i20 = 0;
                                            }
                                            eVar12.b(eVar12.d);
                                            a.f.b.i.e eVar14 = eVar12.f355a;
                                            eVar14.P = i20;
                                            eVar14.Q = i20;
                                            eVar14.d.h.c(i20);
                                            eVar12.f355a.e.h.c(i20);
                                            i19 = 1073741824;
                                            if (mode == 1073741824) {
                                                i21 = 1;
                                                i11 = 1;
                                                z8 = eVar2.H(a2, i20) & true;
                                            } else {
                                                i21 = 1;
                                                z8 = true;
                                                i11 = 0;
                                            }
                                            if (mode2 == 1073741824) {
                                                z3 = z8 & eVar2.H(a2, i21);
                                                i11++;
                                            } else {
                                                z3 = z8;
                                            }
                                        }
                                        if (z3) {
                                            eVar2.C(mode == i19, mode2 == i19);
                                        }
                                    } else {
                                        aVar5 = aVar13;
                                        aVar4 = aVar14;
                                        bVar = bVar7;
                                        i10 = o2;
                                        i9 = i32;
                                        i11 = 0;
                                        z3 = false;
                                    }
                                    if (!z3 || i11 != 2) {
                                        if (size > 0) {
                                            int size6 = eVar2.e0.size();
                                            b.AbstractC0008b bVar8 = eVar2.h0;
                                            for (int i35 = 0; i35 < size6; i35++) {
                                                a.f.b.i.d dVar3 = eVar2.e0.get(i35);
                                                if (!(dVar3 instanceof f) && (!dVar3.d.e.j || !dVar3.e.e.j)) {
                                                    if (!(dVar3.h(0) == aVar10 && dVar3.j != 1 && dVar3.h(1) == aVar10 && dVar3.k != 1)) {
                                                        bVar6.a(bVar8, dVar3, false);
                                                    }
                                                }
                                            }
                                            b bVar9 = (b) bVar8;
                                            int childCount2 = bVar9.f881a.getChildCount();
                                            for (int i36 = 0; i36 < childCount2; i36++) {
                                                View childAt = bVar9.f881a.getChildAt(i36);
                                                if (childAt instanceof i) {
                                                    ((i) childAt).a();
                                                }
                                            }
                                            int size7 = bVar9.f881a.f876c.size();
                                            if (size7 > 0) {
                                                for (int i37 = 0; i37 < size7; i37++) {
                                                    bVar9.f881a.f876c.get(i37).h();
                                                }
                                            }
                                        }
                                        int i38 = eVar2.q0;
                                        size2 = bVar6.f349a.size();
                                        int i39 = i10;
                                        int i40 = i9;
                                        if (size > 0) {
                                            bVar6.b(eVar2, i39, i40);
                                        }
                                        if (size2 > 0) {
                                            boolean z14 = eVar2.j() == aVar;
                                            boolean z15 = eVar2.n() == aVar;
                                            int max5 = Math.max(eVar2.o(), bVar6.f351c.S);
                                            int max6 = Math.max(eVar2.i(), bVar6.f351c.T);
                                            int i41 = 0;
                                            boolean z16 = false;
                                            while (i41 < size2) {
                                                a.f.b.i.d dVar4 = bVar6.f349a.get(i41);
                                                if (!(dVar4 instanceof j)) {
                                                    i17 = i38;
                                                    aVar6 = aVar5;
                                                    aVar7 = aVar4;
                                                    bVar2 = bVar;
                                                } else {
                                                    int o4 = dVar4.o();
                                                    int i42 = dVar4.i();
                                                    i17 = i38;
                                                    bVar2 = bVar;
                                                    boolean a3 = z16 | bVar6.a(bVar2, dVar4, true);
                                                    int o5 = dVar4.o();
                                                    boolean z17 = a3;
                                                    int i43 = dVar4.i();
                                                    if (o5 != o4) {
                                                        dVar4.B(o5);
                                                        if (!z14 || dVar4.m() <= max5) {
                                                            aVar7 = aVar4;
                                                        } else {
                                                            aVar7 = aVar4;
                                                            max5 = Math.max(max5, dVar4.f(aVar7).b() + dVar4.m());
                                                        }
                                                        z17 = true;
                                                    } else {
                                                        aVar7 = aVar4;
                                                    }
                                                    if (i43 != i42) {
                                                        dVar4.w(i43);
                                                        if (!z15 || dVar4.g() <= max6) {
                                                            aVar6 = aVar5;
                                                        } else {
                                                            aVar6 = aVar5;
                                                            max6 = Math.max(max6, dVar4.f(aVar6).b() + dVar4.g());
                                                        }
                                                        z17 = true;
                                                    } else {
                                                        aVar6 = aVar5;
                                                    }
                                                    j jVar3 = (j) dVar4;
                                                    z16 = z17 | false;
                                                }
                                                i41++;
                                                aVar4 = aVar7;
                                                aVar5 = aVar6;
                                                bVar = bVar2;
                                                i38 = i17;
                                            }
                                            int i44 = 0;
                                            int i45 = 2;
                                            while (i44 < i45) {
                                                boolean z18 = z16;
                                                int i46 = 0;
                                                while (i46 < size2) {
                                                    a.f.b.i.d dVar5 = bVar6.f349a.get(i46);
                                                    if ((!(dVar5 instanceof g) || (dVar5 instanceof j)) && !(dVar5 instanceof f)) {
                                                        i16 = i44;
                                                        if (dVar5.X != 8 && ((!dVar5.d.e.j || !dVar5.e.e.j) && !(dVar5 instanceof j))) {
                                                            int o6 = dVar5.o();
                                                            int i47 = dVar5.i();
                                                            i15 = i39;
                                                            int i48 = dVar5.R;
                                                            i14 = i40;
                                                            boolean a4 = z18 | bVar6.a(bVar, dVar5, true);
                                                            int o7 = dVar5.o();
                                                            int i49 = dVar5.i();
                                                            if (o7 != o6) {
                                                                dVar5.B(o7);
                                                                if (z14 && dVar5.m() > max5) {
                                                                    max5 = Math.max(max5, dVar5.f(aVar4).b() + dVar5.m());
                                                                }
                                                                a4 = true;
                                                            }
                                                            if (i49 != i47) {
                                                                dVar5.w(i49);
                                                                if (z15 && dVar5.g() > max6) {
                                                                    max6 = Math.max(max6, dVar5.f(aVar5).b() + dVar5.g());
                                                                }
                                                                a4 = true;
                                                            }
                                                            if (!dVar5.w || i48 == dVar5.R) {
                                                                z18 = a4;
                                                                i46++;
                                                                size2 = size2;
                                                                i44 = i16;
                                                                i39 = i15;
                                                                i40 = i14;
                                                            } else {
                                                                z18 = true;
                                                                i46++;
                                                                size2 = size2;
                                                                i44 = i16;
                                                                i39 = i15;
                                                                i40 = i14;
                                                            }
                                                        }
                                                    } else {
                                                        i16 = i44;
                                                    }
                                                    i15 = i39;
                                                    i14 = i40;
                                                    i46++;
                                                    size2 = size2;
                                                    i44 = i16;
                                                    i39 = i15;
                                                    i40 = i14;
                                                }
                                                if (z18) {
                                                    i13 = i39;
                                                    i12 = i40;
                                                    bVar6.b(eVar2, i13, i12);
                                                    z16 = false;
                                                } else {
                                                    i13 = i39;
                                                    i12 = i40;
                                                    z16 = z18;
                                                }
                                                i40 = i12;
                                                size2 = size2;
                                                i45 = 2;
                                                i39 = i13;
                                                i44++;
                                            }
                                            if (z16) {
                                                bVar6.b(eVar2, i39, i40);
                                                if (eVar2.o() < max5) {
                                                    eVar2.B(max5);
                                                    z6 = true;
                                                } else {
                                                    z6 = false;
                                                }
                                                if (eVar2.i() < max6) {
                                                    eVar2.w(max6);
                                                    z7 = true;
                                                } else {
                                                    z7 = z6;
                                                }
                                                if (z7) {
                                                    bVar6.b(eVar2, i39, i40);
                                                }
                                            }
                                            i38 = i38;
                                        }
                                        eVar2.J(i38);
                                    }
                                    int o8 = this.d.o();
                                    int i50 = this.d.i();
                                    a.f.b.i.e eVar15 = this.d;
                                    z4 = eVar15.r0;
                                    z5 = eVar15.s0;
                                    b bVar10 = this.r;
                                    int i51 = bVar10.e;
                                    int min3 = Math.min(this.g, ViewGroup.resolveSizeAndState(o8 + bVar10.d, i2, 0) & 16777215);
                                    int min4 = Math.min(this.h, ViewGroup.resolveSizeAndState(i50 + i51, i3, 0) & 16777215);
                                    if (z4) {
                                        min3 |= 16777216;
                                    }
                                    if (z5) {
                                        min4 |= 16777216;
                                    }
                                    setMeasuredDimension(min3, min4);
                                    this.o = min3;
                                    this.p = min4;
                                }
                                z2 = z;
                                i8 = 1073741824;
                                if (!z2 || !((mode != i8 && mode2 == i8) || a2)) {
                                }
                                if (size > 0) {
                                }
                                int i382 = eVar2.q0;
                                size2 = bVar6.f349a.size();
                                int i392 = i10;
                                int i402 = i9;
                                if (size > 0) {
                                }
                                if (size2 > 0) {
                                }
                                eVar2.J(i382);
                                int o82 = this.d.o();
                                int i502 = this.d.i();
                                a.f.b.i.e eVar152 = this.d;
                                z4 = eVar152.r0;
                                z5 = eVar152.s0;
                                b bVar102 = this.r;
                                int i512 = bVar102.e;
                                int min32 = Math.min(this.g, ViewGroup.resolveSizeAndState(o82 + bVar102.d, i2, 0) & 16777215);
                                int min42 = Math.min(this.h, ViewGroup.resolveSizeAndState(i502 + i512, i3, 0) & 16777215);
                                if (z4) {
                                }
                                if (z5) {
                                }
                                setMeasuredDimension(min32, min42);
                                this.o = min32;
                                this.p = min42;
                            }
                        } else if (childCount != 0) {
                            aVar3 = aVar;
                        }
                        i6 = i29;
                        i7 = 0;
                        eVar2.g0.f357c = true;
                        eVar2.P = 0;
                        eVar2.Q = 0;
                        int[] iArr2 = eVar2.u;
                        iArr2[0] = this.g - i31;
                        iArr2[1] = this.h - i30;
                        eVar2.z(0);
                        eVar2.y(0);
                        eVar2.J[0] = aVar2;
                        eVar2.B(i5);
                        eVar2.J[1] = aVar3;
                        eVar2.w(i7);
                        eVar2.z(this.e - i31);
                        eVar2.y(this.f - i30);
                        eVar2.k0 = max3;
                        eVar2.l0 = max;
                        a.f.b.i.l.b bVar62 = eVar2.f0;
                        Objects.requireNonNull(bVar62);
                        c.a aVar132 = c.a.BOTTOM;
                        c.a aVar142 = c.a.RIGHT;
                        b.AbstractC0008b bVar72 = eVar2.h0;
                        size = eVar2.e0.size();
                        int o22 = eVar2.o();
                        int i322 = eVar2.i();
                        a2 = a.f.b.i.i.a(i26, 128);
                        if (!a2) {
                        }
                        if (z) {
                        }
                        z2 = z;
                        i8 = 1073741824;
                        if (!z2 || !((mode != i8 && mode2 == i8) || a2)) {
                        }
                        if (size > 0) {
                        }
                        int i3822 = eVar2.q0;
                        size2 = bVar62.f349a.size();
                        int i3922 = i10;
                        int i4022 = i9;
                        if (size > 0) {
                        }
                        if (size2 > 0) {
                        }
                        eVar2.J(i3822);
                        int o822 = this.d.o();
                        int i5022 = this.d.i();
                        a.f.b.i.e eVar1522 = this.d;
                        z4 = eVar1522.r0;
                        z5 = eVar1522.s0;
                        b bVar1022 = this.r;
                        int i5122 = bVar1022.e;
                        int min322 = Math.min(this.g, ViewGroup.resolveSizeAndState(o822 + bVar1022.d, i2, 0) & 16777215);
                        int min422 = Math.min(this.h, ViewGroup.resolveSizeAndState(i5022 + i5122, i3, 0) & 16777215);
                        if (z4) {
                        }
                        if (z5) {
                        }
                        setMeasuredDimension(min322, min422);
                        this.o = min322;
                        this.p = min422;
                    } else if (childCount != 0) {
                        i23 = i29;
                        i7 = i23;
                        i6 = i29;
                        aVar3 = aVar;
                        eVar2.g0.f357c = true;
                        eVar2.P = 0;
                        eVar2.Q = 0;
                        int[] iArr22 = eVar2.u;
                        iArr22[0] = this.g - i31;
                        iArr22[1] = this.h - i30;
                        eVar2.z(0);
                        eVar2.y(0);
                        eVar2.J[0] = aVar2;
                        eVar2.B(i5);
                        eVar2.J[1] = aVar3;
                        eVar2.w(i7);
                        eVar2.z(this.e - i31);
                        eVar2.y(this.f - i30);
                        eVar2.k0 = max3;
                        eVar2.l0 = max;
                        a.f.b.i.l.b bVar622 = eVar2.f0;
                        Objects.requireNonNull(bVar622);
                        c.a aVar1322 = c.a.BOTTOM;
                        c.a aVar1422 = c.a.RIGHT;
                        b.AbstractC0008b bVar722 = eVar2.h0;
                        size = eVar2.e0.size();
                        int o222 = eVar2.o();
                        int i3222 = eVar2.i();
                        a2 = a.f.b.i.i.a(i26, 128);
                        if (!a2) {
                        }
                        if (z) {
                        }
                        z2 = z;
                        i8 = 1073741824;
                        if (!z2 || !((mode != i8 && mode2 == i8) || a2)) {
                        }
                        if (size > 0) {
                        }
                        int i38222 = eVar2.q0;
                        size2 = bVar622.f349a.size();
                        int i39222 = i10;
                        int i40222 = i9;
                        if (size > 0) {
                        }
                        if (size2 > 0) {
                        }
                        eVar2.J(i38222);
                        int o8222 = this.d.o();
                        int i50222 = this.d.i();
                        a.f.b.i.e eVar15222 = this.d;
                        z4 = eVar15222.r0;
                        z5 = eVar15222.s0;
                        b bVar10222 = this.r;
                        int i51222 = bVar10222.e;
                        int min3222 = Math.min(this.g, ViewGroup.resolveSizeAndState(o8222 + bVar10222.d, i2, 0) & 16777215);
                        int min4222 = Math.min(this.h, ViewGroup.resolveSizeAndState(i50222 + i51222, i3, 0) & 16777215);
                        if (z4) {
                        }
                        if (z5) {
                        }
                        setMeasuredDimension(min3222, min4222);
                        this.o = min3222;
                        this.p = min4222;
                    }
                    i23 = Math.max(0, this.f);
                    i7 = i23;
                    i6 = i29;
                    aVar3 = aVar;
                    eVar2.g0.f357c = true;
                    eVar2.P = 0;
                    eVar2.Q = 0;
                    int[] iArr222 = eVar2.u;
                    iArr222[0] = this.g - i31;
                    iArr222[1] = this.h - i30;
                    eVar2.z(0);
                    eVar2.y(0);
                    eVar2.J[0] = aVar2;
                    eVar2.B(i5);
                    eVar2.J[1] = aVar3;
                    eVar2.w(i7);
                    eVar2.z(this.e - i31);
                    eVar2.y(this.f - i30);
                    eVar2.k0 = max3;
                    eVar2.l0 = max;
                    a.f.b.i.l.b bVar6222 = eVar2.f0;
                    Objects.requireNonNull(bVar6222);
                    c.a aVar13222 = c.a.BOTTOM;
                    c.a aVar14222 = c.a.RIGHT;
                    b.AbstractC0008b bVar7222 = eVar2.h0;
                    size = eVar2.e0.size();
                    int o2222 = eVar2.o();
                    int i32222 = eVar2.i();
                    a2 = a.f.b.i.i.a(i26, 128);
                    if (!a2) {
                    }
                    if (z) {
                    }
                    z2 = z;
                    i8 = 1073741824;
                    if (!z2 || !((mode != i8 && mode2 == i8) || a2)) {
                    }
                    if (size > 0) {
                    }
                    int i382222 = eVar2.q0;
                    size2 = bVar6222.f349a.size();
                    int i392222 = i10;
                    int i402222 = i9;
                    if (size > 0) {
                    }
                    if (size2 > 0) {
                    }
                    eVar2.J(i382222);
                    int o82222 = this.d.o();
                    int i502222 = this.d.i();
                    a.f.b.i.e eVar152222 = this.d;
                    z4 = eVar152222.r0;
                    z5 = eVar152222.s0;
                    b bVar102222 = this.r;
                    int i512222 = bVar102222.e;
                    int min32222 = Math.min(this.g, ViewGroup.resolveSizeAndState(o82222 + bVar102222.d, i2, 0) & 16777215);
                    int min42222 = Math.min(this.h, ViewGroup.resolveSizeAndState(i502222 + i512222, i3, 0) & 16777215);
                    if (z4) {
                    }
                    if (z5) {
                    }
                    setMeasuredDimension(min32222, min42222);
                    this.o = min32222;
                    this.p = min42222;
                }
            } else if (childCount != 0) {
                aVar2 = aVar12;
            }
            aVar = aVar12;
            i4 = Integer.MIN_VALUE;
            i5 = 0;
            if (mode2 == i4) {
            }
            i23 = Math.max(0, this.f);
            i7 = i23;
            i6 = i29;
            aVar3 = aVar;
            eVar2.g0.f357c = true;
            eVar2.P = 0;
            eVar2.Q = 0;
            int[] iArr2222 = eVar2.u;
            iArr2222[0] = this.g - i31;
            iArr2222[1] = this.h - i30;
            eVar2.z(0);
            eVar2.y(0);
            eVar2.J[0] = aVar2;
            eVar2.B(i5);
            eVar2.J[1] = aVar3;
            eVar2.w(i7);
            eVar2.z(this.e - i31);
            eVar2.y(this.f - i30);
            eVar2.k0 = max3;
            eVar2.l0 = max;
            a.f.b.i.l.b bVar62222 = eVar2.f0;
            Objects.requireNonNull(bVar62222);
            c.a aVar132222 = c.a.BOTTOM;
            c.a aVar142222 = c.a.RIGHT;
            b.AbstractC0008b bVar72222 = eVar2.h0;
            size = eVar2.e0.size();
            int o22222 = eVar2.o();
            int i322222 = eVar2.i();
            a2 = a.f.b.i.i.a(i26, 128);
            if (!a2) {
            }
            if (z) {
            }
            z2 = z;
            i8 = 1073741824;
            if (!z2 || !((mode != i8 && mode2 == i8) || a2)) {
            }
            if (size > 0) {
            }
            int i3822222 = eVar2.q0;
            size2 = bVar62222.f349a.size();
            int i3922222 = i10;
            int i4022222 = i9;
            if (size > 0) {
            }
            if (size2 > 0) {
            }
            eVar2.J(i3822222);
            int o822222 = this.d.o();
            int i5022222 = this.d.i();
            a.f.b.i.e eVar1522222 = this.d;
            z4 = eVar1522222.r0;
            z5 = eVar1522222.s0;
            b bVar1022222 = this.r;
            int i5122222 = bVar1022222.e;
            int min322222 = Math.min(this.g, ViewGroup.resolveSizeAndState(o822222 + bVar1022222.d, i2, 0) & 16777215);
            int min422222 = Math.min(this.h, ViewGroup.resolveSizeAndState(i5022222 + i5122222, i3, 0) & 16777215);
            if (z4) {
            }
            if (z5) {
            }
            setMeasuredDimension(min322222, min422222);
            this.o = min322222;
            this.p = min422222;
        } else if (childCount != 0) {
            i24 = i28;
            aVar = aVar12;
            i5 = i24;
            aVar2 = aVar;
            i4 = Integer.MIN_VALUE;
            if (mode2 == i4) {
            }
            i23 = Math.max(0, this.f);
            i7 = i23;
            i6 = i29;
            aVar3 = aVar;
            eVar2.g0.f357c = true;
            eVar2.P = 0;
            eVar2.Q = 0;
            int[] iArr22222 = eVar2.u;
            iArr22222[0] = this.g - i31;
            iArr22222[1] = this.h - i30;
            eVar2.z(0);
            eVar2.y(0);
            eVar2.J[0] = aVar2;
            eVar2.B(i5);
            eVar2.J[1] = aVar3;
            eVar2.w(i7);
            eVar2.z(this.e - i31);
            eVar2.y(this.f - i30);
            eVar2.k0 = max3;
            eVar2.l0 = max;
            a.f.b.i.l.b bVar622222 = eVar2.f0;
            Objects.requireNonNull(bVar622222);
            c.a aVar1322222 = c.a.BOTTOM;
            c.a aVar1422222 = c.a.RIGHT;
            b.AbstractC0008b bVar722222 = eVar2.h0;
            size = eVar2.e0.size();
            int o222222 = eVar2.o();
            int i3222222 = eVar2.i();
            a2 = a.f.b.i.i.a(i26, 128);
            if (!a2) {
            }
            if (z) {
            }
            z2 = z;
            i8 = 1073741824;
            if (!z2 || !((mode != i8 && mode2 == i8) || a2)) {
            }
            if (size > 0) {
            }
            int i38222222 = eVar2.q0;
            size2 = bVar622222.f349a.size();
            int i39222222 = i10;
            int i40222222 = i9;
            if (size > 0) {
            }
            if (size2 > 0) {
            }
            eVar2.J(i38222222);
            int o8222222 = this.d.o();
            int i50222222 = this.d.i();
            a.f.b.i.e eVar15222222 = this.d;
            z4 = eVar15222222.r0;
            z5 = eVar15222222.s0;
            b bVar10222222 = this.r;
            int i51222222 = bVar10222222.e;
            int min3222222 = Math.min(this.g, ViewGroup.resolveSizeAndState(o8222222 + bVar10222222.d, i2, 0) & 16777215);
            int min4222222 = Math.min(this.h, ViewGroup.resolveSizeAndState(i50222222 + i51222222, i3, 0) & 16777215);
            if (z4) {
            }
            if (z5) {
            }
            setMeasuredDimension(min3222222, min4222222);
            this.o = min3222222;
            this.p = min4222222;
        }
        i24 = Math.max(0, this.e);
        aVar = aVar12;
        i5 = i24;
        aVar2 = aVar;
        i4 = Integer.MIN_VALUE;
        if (mode2 == i4) {
        }
        i23 = Math.max(0, this.f);
        i7 = i23;
        i6 = i29;
        aVar3 = aVar;
        eVar2.g0.f357c = true;
        eVar2.P = 0;
        eVar2.Q = 0;
        int[] iArr222222 = eVar2.u;
        iArr222222[0] = this.g - i31;
        iArr222222[1] = this.h - i30;
        eVar2.z(0);
        eVar2.y(0);
        eVar2.J[0] = aVar2;
        eVar2.B(i5);
        eVar2.J[1] = aVar3;
        eVar2.w(i7);
        eVar2.z(this.e - i31);
        eVar2.y(this.f - i30);
        eVar2.k0 = max3;
        eVar2.l0 = max;
        a.f.b.i.l.b bVar6222222 = eVar2.f0;
        Objects.requireNonNull(bVar6222222);
        c.a aVar13222222 = c.a.BOTTOM;
        c.a aVar14222222 = c.a.RIGHT;
        b.AbstractC0008b bVar7222222 = eVar2.h0;
        size = eVar2.e0.size();
        int o2222222 = eVar2.o();
        int i32222222 = eVar2.i();
        a2 = a.f.b.i.i.a(i26, 128);
        if (!a2) {
        }
        if (z) {
        }
        z2 = z;
        i8 = 1073741824;
        if (!z2 || !((mode != i8 && mode2 == i8) || a2)) {
        }
        if (size > 0) {
        }
        int i382222222 = eVar2.q0;
        size2 = bVar6222222.f349a.size();
        int i392222222 = i10;
        int i402222222 = i9;
        if (size > 0) {
        }
        if (size2 > 0) {
        }
        eVar2.J(i382222222);
        int o82222222 = this.d.o();
        int i502222222 = this.d.i();
        a.f.b.i.e eVar152222222 = this.d;
        z4 = eVar152222222.r0;
        z5 = eVar152222222.s0;
        b bVar102222222 = this.r;
        int i512222222 = bVar102222222.e;
        int min32222222 = Math.min(this.g, ViewGroup.resolveSizeAndState(o82222222 + bVar102222222.d, i2, 0) & 16777215);
        int min42222222 = Math.min(this.h, ViewGroup.resolveSizeAndState(i502222222 + i512222222, i3, 0) & 16777215);
        if (z4) {
        }
        if (z5) {
        }
        setMeasuredDimension(min32222222, min42222222);
        this.o = min32222222;
        this.p = min42222222;
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        a.f.b.i.d e2 = e(view);
        if ((view instanceof h) && !(e2 instanceof f)) {
            a aVar = (a) view.getLayoutParams();
            f fVar = new f();
            aVar.l0 = fVar;
            aVar.Y = true;
            fVar.E(aVar.R);
        }
        if (view instanceof a.f.c.c) {
            a.f.c.c cVar = (a.f.c.c) view;
            cVar.j();
            ((a) view.getLayoutParams()).Z = true;
            if (!this.f876c.contains(cVar)) {
                this.f876c.add(cVar);
            }
        }
        this.f875b.put(view.getId(), view);
        this.i = true;
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f875b.remove(view.getId());
        a.f.b.i.d e2 = e(view);
        this.d.e0.remove(e2);
        e2.K = null;
        this.f876c.remove(view);
        this.i = true;
    }

    public void removeView(View view) {
        super.removeView(view);
    }

    public void requestLayout() {
        this.i = true;
        this.o = -1;
        this.p = -1;
        super.requestLayout();
    }

    public void setConstraintSet(a.f.c.e eVar) {
        this.k = eVar;
    }

    public void setId(int i2) {
        this.f875b.remove(getId());
        super.setId(i2);
        this.f875b.put(getId(), this);
    }

    public void setMaxHeight(int i2) {
        if (i2 != this.h) {
            this.h = i2;
            requestLayout();
        }
    }

    public void setMaxWidth(int i2) {
        if (i2 != this.g) {
            this.g = i2;
            requestLayout();
        }
    }

    public void setMinHeight(int i2) {
        if (i2 != this.f) {
            this.f = i2;
            requestLayout();
        }
    }

    public void setMinWidth(int i2) {
        if (i2 != this.e) {
            this.e = i2;
            requestLayout();
        }
    }

    public void setOnConstraintsChanged(a.f.c.g gVar) {
        a.f.c.d dVar = this.l;
        if (dVar != null) {
            Objects.requireNonNull(dVar);
        }
    }

    public void setOptimizationLevel(int i2) {
        this.j = i2;
        this.d.q0 = i2;
        a.f.b.d.p = a.f.b.i.i.a(i2, 256);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
