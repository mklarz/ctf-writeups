package a.f.c;

import a.f.c.f;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

public class e {
    public static final int[] d = {0, 4, 8};
    public static SparseIntArray e;

    /* renamed from: a  reason: collision with root package name */
    public HashMap<String, b> f389a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public boolean f390b = true;

    /* renamed from: c  reason: collision with root package name */
    public HashMap<Integer, a> f391c = new HashMap<>();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f392a;

        /* renamed from: b  reason: collision with root package name */
        public final d f393b = new d();

        /* renamed from: c  reason: collision with root package name */
        public final c f394c = new c();
        public final b d = new b();
        public final C0009e e = new C0009e();
        public HashMap<String, b> f = new HashMap<>();

        public void a(ConstraintLayout.a aVar) {
            b bVar = this.d;
            aVar.d = bVar.h;
            aVar.e = bVar.i;
            aVar.f = bVar.j;
            aVar.g = bVar.k;
            aVar.h = bVar.l;
            aVar.i = bVar.m;
            aVar.j = bVar.n;
            aVar.k = bVar.o;
            aVar.l = bVar.p;
            aVar.p = bVar.q;
            aVar.q = bVar.r;
            aVar.r = bVar.s;
            aVar.s = bVar.t;
            ((ViewGroup.MarginLayoutParams) aVar).leftMargin = bVar.D;
            ((ViewGroup.MarginLayoutParams) aVar).rightMargin = bVar.E;
            ((ViewGroup.MarginLayoutParams) aVar).topMargin = bVar.F;
            ((ViewGroup.MarginLayoutParams) aVar).bottomMargin = bVar.G;
            aVar.x = bVar.O;
            aVar.y = bVar.N;
            aVar.u = bVar.K;
            aVar.w = bVar.M;
            aVar.z = bVar.u;
            aVar.A = bVar.v;
            aVar.m = bVar.x;
            aVar.n = bVar.y;
            b bVar2 = this.d;
            aVar.o = bVar2.z;
            aVar.B = bVar2.w;
            aVar.P = bVar2.A;
            aVar.Q = bVar2.B;
            aVar.E = bVar2.P;
            aVar.D = bVar2.Q;
            aVar.G = bVar2.S;
            aVar.F = bVar2.R;
            aVar.S = bVar2.h0;
            aVar.T = bVar2.i0;
            aVar.H = bVar2.T;
            aVar.I = bVar2.U;
            aVar.L = bVar2.V;
            aVar.M = bVar2.W;
            aVar.J = bVar2.X;
            aVar.K = bVar2.Y;
            aVar.N = bVar2.Z;
            aVar.O = bVar2.a0;
            aVar.R = bVar2.C;
            aVar.f879c = bVar2.g;
            aVar.f877a = bVar2.e;
            aVar.f878b = bVar2.f;
            ((ViewGroup.MarginLayoutParams) aVar).width = bVar2.f397c;
            ((ViewGroup.MarginLayoutParams) aVar).height = bVar2.d;
            String str = bVar2.g0;
            if (str != null) {
                aVar.U = str;
            }
            aVar.setMarginStart(this.d.I);
            aVar.setMarginEnd(this.d.H);
            aVar.a();
        }

        public final void b(int i, ConstraintLayout.a aVar) {
            this.f392a = i;
            b bVar = this.d;
            bVar.h = aVar.d;
            bVar.i = aVar.e;
            bVar.j = aVar.f;
            bVar.k = aVar.g;
            bVar.l = aVar.h;
            bVar.m = aVar.i;
            bVar.n = aVar.j;
            bVar.o = aVar.k;
            bVar.p = aVar.l;
            bVar.q = aVar.p;
            bVar.r = aVar.q;
            bVar.s = aVar.r;
            bVar.t = aVar.s;
            bVar.u = aVar.z;
            bVar.v = aVar.A;
            bVar.w = aVar.B;
            bVar.x = aVar.m;
            bVar.y = aVar.n;
            bVar.z = aVar.o;
            bVar.A = aVar.P;
            bVar.B = aVar.Q;
            bVar.C = aVar.R;
            bVar.g = aVar.f879c;
            bVar.e = aVar.f877a;
            bVar.f = aVar.f878b;
            b bVar2 = this.d;
            bVar2.f397c = ((ViewGroup.MarginLayoutParams) aVar).width;
            bVar2.d = ((ViewGroup.MarginLayoutParams) aVar).height;
            bVar2.D = ((ViewGroup.MarginLayoutParams) aVar).leftMargin;
            bVar2.E = ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
            bVar2.F = ((ViewGroup.MarginLayoutParams) aVar).topMargin;
            bVar2.G = ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
            bVar2.P = aVar.E;
            bVar2.Q = aVar.D;
            bVar2.S = aVar.G;
            bVar2.R = aVar.F;
            bVar2.h0 = aVar.S;
            bVar2.i0 = aVar.T;
            bVar2.T = aVar.H;
            bVar2.U = aVar.I;
            bVar2.V = aVar.L;
            bVar2.W = aVar.M;
            bVar2.X = aVar.J;
            bVar2.Y = aVar.K;
            bVar2.Z = aVar.N;
            bVar2.a0 = aVar.O;
            bVar2.g0 = aVar.U;
            bVar2.K = aVar.u;
            bVar2.M = aVar.w;
            bVar2.J = aVar.t;
            bVar2.L = aVar.v;
            b bVar3 = this.d;
            bVar3.O = aVar.x;
            bVar3.N = aVar.y;
            bVar3.H = aVar.getMarginEnd();
            this.d.I = aVar.getMarginStart();
        }

        public final void c(int i, f.a aVar) {
            b(i, aVar);
            this.f393b.d = aVar.m0;
            C0009e eVar = this.e;
            eVar.f405b = aVar.p0;
            eVar.f406c = aVar.q0;
            eVar.d = aVar.r0;
            eVar.e = aVar.s0;
            eVar.f = aVar.t0;
            eVar.g = aVar.u0;
            eVar.h = aVar.v0;
            eVar.i = aVar.w0;
            eVar.j = aVar.x0;
            eVar.k = aVar.y0;
            eVar.m = aVar.o0;
            eVar.l = aVar.n0;
        }

        public Object clone() {
            a aVar = new a();
            b bVar = aVar.d;
            b bVar2 = this.d;
            Objects.requireNonNull(bVar);
            bVar.f395a = bVar2.f395a;
            bVar.f397c = bVar2.f397c;
            bVar.f396b = bVar2.f396b;
            bVar.d = bVar2.d;
            bVar.e = bVar2.e;
            bVar.f = bVar2.f;
            bVar.g = bVar2.g;
            bVar.h = bVar2.h;
            bVar.i = bVar2.i;
            bVar.j = bVar2.j;
            bVar.k = bVar2.k;
            bVar.l = bVar2.l;
            bVar.m = bVar2.m;
            bVar.n = bVar2.n;
            bVar.o = bVar2.o;
            bVar.p = bVar2.p;
            bVar.q = bVar2.q;
            bVar.r = bVar2.r;
            bVar.s = bVar2.s;
            bVar.t = bVar2.t;
            bVar.u = bVar2.u;
            bVar.v = bVar2.v;
            bVar.w = bVar2.w;
            bVar.x = bVar2.x;
            bVar.y = bVar2.y;
            bVar.z = bVar2.z;
            bVar.A = bVar2.A;
            bVar.B = bVar2.B;
            bVar.C = bVar2.C;
            bVar.D = bVar2.D;
            bVar.E = bVar2.E;
            bVar.F = bVar2.F;
            bVar.G = bVar2.G;
            bVar.H = bVar2.H;
            bVar.I = bVar2.I;
            bVar.J = bVar2.J;
            bVar.K = bVar2.K;
            bVar.L = bVar2.L;
            bVar.M = bVar2.M;
            bVar.N = bVar2.N;
            bVar.O = bVar2.O;
            bVar.P = bVar2.P;
            bVar.Q = bVar2.Q;
            bVar.R = bVar2.R;
            bVar.S = bVar2.S;
            bVar.T = bVar2.T;
            bVar.U = bVar2.U;
            bVar.V = bVar2.V;
            bVar.W = bVar2.W;
            bVar.X = bVar2.X;
            bVar.Y = bVar2.Y;
            bVar.Z = bVar2.Z;
            bVar.a0 = bVar2.a0;
            bVar.b0 = bVar2.b0;
            bVar.c0 = bVar2.c0;
            bVar.d0 = bVar2.d0;
            bVar.g0 = bVar2.g0;
            int[] iArr = bVar2.e0;
            if (iArr != null) {
                bVar.e0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                bVar.e0 = null;
            }
            bVar.f0 = bVar2.f0;
            bVar.h0 = bVar2.h0;
            bVar.i0 = bVar2.i0;
            bVar.j0 = bVar2.j0;
            c cVar = aVar.f394c;
            c cVar2 = this.f394c;
            Objects.requireNonNull(cVar);
            cVar.f398a = cVar2.f398a;
            cVar.f399b = cVar2.f399b;
            cVar.f400c = cVar2.f400c;
            cVar.d = cVar2.d;
            cVar.e = cVar2.e;
            cVar.g = cVar2.g;
            cVar.f = cVar2.f;
            d dVar = aVar.f393b;
            d dVar2 = this.f393b;
            Objects.requireNonNull(dVar);
            dVar.f401a = dVar2.f401a;
            dVar.f402b = dVar2.f402b;
            dVar.d = dVar2.d;
            dVar.e = dVar2.e;
            dVar.f403c = dVar2.f403c;
            C0009e eVar = aVar.e;
            C0009e eVar2 = this.e;
            Objects.requireNonNull(eVar);
            eVar.f404a = eVar2.f404a;
            eVar.f405b = eVar2.f405b;
            eVar.f406c = eVar2.f406c;
            eVar.d = eVar2.d;
            eVar.e = eVar2.e;
            eVar.f = eVar2.f;
            eVar.g = eVar2.g;
            eVar.h = eVar2.h;
            eVar.i = eVar2.i;
            eVar.j = eVar2.j;
            eVar.k = eVar2.k;
            eVar.l = eVar2.l;
            eVar.m = eVar2.m;
            aVar.f392a = this.f392a;
            return aVar;
        }
    }

    public static class b {
        public static SparseIntArray k0;
        public int A = -1;
        public int B = -1;
        public int C = -1;
        public int D = -1;
        public int E = -1;
        public int F = -1;
        public int G = -1;
        public int H = -1;
        public int I = -1;
        public int J = -1;
        public int K = -1;
        public int L = -1;
        public int M = -1;
        public int N = -1;
        public int O = -1;
        public float P = -1.0f;
        public float Q = -1.0f;
        public int R = 0;
        public int S = 0;
        public int T = 0;
        public int U = 0;
        public int V = -1;
        public int W = -1;
        public int X = -1;
        public int Y = -1;
        public float Z = 1.0f;

        /* renamed from: a  reason: collision with root package name */
        public boolean f395a = false;
        public float a0 = 1.0f;

        /* renamed from: b  reason: collision with root package name */
        public boolean f396b = false;
        public int b0 = -1;

        /* renamed from: c  reason: collision with root package name */
        public int f397c;
        public int c0 = 0;
        public int d;
        public int d0 = -1;
        public int e = -1;
        public int[] e0;
        public int f = -1;
        public String f0;
        public float g = -1.0f;
        public String g0;
        public int h = -1;
        public boolean h0 = false;
        public int i = -1;
        public boolean i0 = false;
        public int j = -1;
        public boolean j0 = true;
        public int k = -1;
        public int l = -1;
        public int m = -1;
        public int n = -1;
        public int o = -1;
        public int p = -1;
        public int q = -1;
        public int r = -1;
        public int s = -1;
        public int t = -1;
        public float u = 0.5f;
        public float v = 0.5f;
        public String w = null;
        public int x = -1;
        public int y = 0;
        public float z = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            k0 = sparseIntArray;
            sparseIntArray.append(38, 24);
            k0.append(39, 25);
            k0.append(41, 28);
            k0.append(42, 29);
            k0.append(47, 35);
            k0.append(46, 34);
            k0.append(20, 4);
            k0.append(19, 3);
            k0.append(17, 1);
            k0.append(55, 6);
            k0.append(56, 7);
            k0.append(27, 17);
            k0.append(28, 18);
            k0.append(29, 19);
            k0.append(0, 26);
            k0.append(43, 31);
            k0.append(44, 32);
            k0.append(26, 10);
            k0.append(25, 9);
            k0.append(59, 13);
            k0.append(62, 16);
            k0.append(60, 14);
            k0.append(57, 11);
            k0.append(61, 15);
            k0.append(58, 12);
            k0.append(50, 38);
            k0.append(36, 37);
            k0.append(35, 39);
            k0.append(49, 40);
            k0.append(34, 20);
            k0.append(48, 36);
            k0.append(24, 5);
            k0.append(37, 76);
            k0.append(45, 76);
            k0.append(40, 76);
            k0.append(18, 76);
            k0.append(16, 76);
            k0.append(3, 23);
            k0.append(5, 27);
            k0.append(7, 30);
            k0.append(8, 8);
            k0.append(4, 33);
            k0.append(6, 2);
            k0.append(1, 22);
            k0.append(2, 21);
            k0.append(21, 61);
            k0.append(23, 62);
            k0.append(22, 63);
            k0.append(54, 69);
            k0.append(33, 70);
            k0.append(12, 71);
            k0.append(10, 72);
            k0.append(11, 73);
            k0.append(13, 74);
            k0.append(9, 75);
        }

        public void a(Context context, AttributeSet attributeSet) {
            String str;
            StringBuilder sb;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.e);
            this.f396b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                int i3 = k0.get(index);
                if (i3 == 80) {
                    this.h0 = obtainStyledAttributes.getBoolean(index, this.h0);
                } else if (i3 != 81) {
                    switch (i3) {
                        case 1:
                            int i4 = this.p;
                            int[] iArr = e.d;
                            int resourceId = obtainStyledAttributes.getResourceId(index, i4);
                            if (resourceId == -1) {
                                resourceId = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.p = resourceId;
                            continue;
                        case 2:
                            this.G = obtainStyledAttributes.getDimensionPixelSize(index, this.G);
                            continue;
                        case 3:
                            int i5 = this.o;
                            int[] iArr2 = e.d;
                            int resourceId2 = obtainStyledAttributes.getResourceId(index, i5);
                            if (resourceId2 == -1) {
                                resourceId2 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.o = resourceId2;
                            continue;
                        case 4:
                            int i6 = this.n;
                            int[] iArr3 = e.d;
                            int resourceId3 = obtainStyledAttributes.getResourceId(index, i6);
                            if (resourceId3 == -1) {
                                resourceId3 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.n = resourceId3;
                            continue;
                        case 5:
                            this.w = obtainStyledAttributes.getString(index);
                            continue;
                        case 6:
                            this.A = obtainStyledAttributes.getDimensionPixelOffset(index, this.A);
                            continue;
                        case 7:
                            this.B = obtainStyledAttributes.getDimensionPixelOffset(index, this.B);
                            continue;
                        case 8:
                            this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                            continue;
                        case 9:
                            int i7 = this.t;
                            int[] iArr4 = e.d;
                            int resourceId4 = obtainStyledAttributes.getResourceId(index, i7);
                            if (resourceId4 == -1) {
                                resourceId4 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.t = resourceId4;
                            continue;
                        case 10:
                            int i8 = this.s;
                            int[] iArr5 = e.d;
                            int resourceId5 = obtainStyledAttributes.getResourceId(index, i8);
                            if (resourceId5 == -1) {
                                resourceId5 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.s = resourceId5;
                            continue;
                        case 11:
                            this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                            continue;
                        case 12:
                            this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            continue;
                        case 13:
                            this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                            continue;
                        case 14:
                            this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            continue;
                        case 15:
                            this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                            continue;
                        case 16:
                            this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                            continue;
                        case 17:
                            this.e = obtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                            continue;
                        case 18:
                            this.f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                            continue;
                        case 19:
                            this.g = obtainStyledAttributes.getFloat(index, this.g);
                            continue;
                        case 20:
                            this.u = obtainStyledAttributes.getFloat(index, this.u);
                            continue;
                        case 21:
                            this.d = obtainStyledAttributes.getLayoutDimension(index, this.d);
                            continue;
                        case 22:
                            this.f397c = obtainStyledAttributes.getLayoutDimension(index, this.f397c);
                            continue;
                        case 23:
                            this.D = obtainStyledAttributes.getDimensionPixelSize(index, this.D);
                            continue;
                        case 24:
                            int i9 = this.h;
                            int[] iArr6 = e.d;
                            int resourceId6 = obtainStyledAttributes.getResourceId(index, i9);
                            if (resourceId6 == -1) {
                                resourceId6 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.h = resourceId6;
                            continue;
                        case 25:
                            int i10 = this.i;
                            int[] iArr7 = e.d;
                            int resourceId7 = obtainStyledAttributes.getResourceId(index, i10);
                            if (resourceId7 == -1) {
                                resourceId7 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.i = resourceId7;
                            continue;
                        case 26:
                            this.C = obtainStyledAttributes.getInt(index, this.C);
                            continue;
                        case 27:
                            this.E = obtainStyledAttributes.getDimensionPixelSize(index, this.E);
                            continue;
                        case 28:
                            int i11 = this.j;
                            int[] iArr8 = e.d;
                            int resourceId8 = obtainStyledAttributes.getResourceId(index, i11);
                            if (resourceId8 == -1) {
                                resourceId8 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.j = resourceId8;
                            continue;
                        case 29:
                            int i12 = this.k;
                            int[] iArr9 = e.d;
                            int resourceId9 = obtainStyledAttributes.getResourceId(index, i12);
                            if (resourceId9 == -1) {
                                resourceId9 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.k = resourceId9;
                            continue;
                        case 30:
                            this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                            continue;
                        case 31:
                            int i13 = this.q;
                            int[] iArr10 = e.d;
                            int resourceId10 = obtainStyledAttributes.getResourceId(index, i13);
                            if (resourceId10 == -1) {
                                resourceId10 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.q = resourceId10;
                            continue;
                        case 32:
                            int i14 = this.r;
                            int[] iArr11 = e.d;
                            int resourceId11 = obtainStyledAttributes.getResourceId(index, i14);
                            if (resourceId11 == -1) {
                                resourceId11 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.r = resourceId11;
                            continue;
                        case 33:
                            this.F = obtainStyledAttributes.getDimensionPixelSize(index, this.F);
                            continue;
                        case 34:
                            int i15 = this.m;
                            int[] iArr12 = e.d;
                            int resourceId12 = obtainStyledAttributes.getResourceId(index, i15);
                            if (resourceId12 == -1) {
                                resourceId12 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.m = resourceId12;
                            continue;
                        case 35:
                            int i16 = this.l;
                            int[] iArr13 = e.d;
                            int resourceId13 = obtainStyledAttributes.getResourceId(index, i16);
                            if (resourceId13 == -1) {
                                resourceId13 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.l = resourceId13;
                            continue;
                        case 36:
                            this.v = obtainStyledAttributes.getFloat(index, this.v);
                            continue;
                        case 37:
                            this.Q = obtainStyledAttributes.getFloat(index, this.Q);
                            continue;
                        case 38:
                            this.P = obtainStyledAttributes.getFloat(index, this.P);
                            continue;
                        case 39:
                            this.R = obtainStyledAttributes.getInt(index, this.R);
                            continue;
                        case 40:
                            this.S = obtainStyledAttributes.getInt(index, this.S);
                            continue;
                        default:
                            switch (i3) {
                                case 54:
                                    this.T = obtainStyledAttributes.getInt(index, this.T);
                                    continue;
                                case 55:
                                    this.U = obtainStyledAttributes.getInt(index, this.U);
                                    continue;
                                case 56:
                                    this.V = obtainStyledAttributes.getDimensionPixelSize(index, this.V);
                                    continue;
                                case 57:
                                    this.W = obtainStyledAttributes.getDimensionPixelSize(index, this.W);
                                    continue;
                                case 58:
                                    this.X = obtainStyledAttributes.getDimensionPixelSize(index, this.X);
                                    continue;
                                case 59:
                                    this.Y = obtainStyledAttributes.getDimensionPixelSize(index, this.Y);
                                    continue;
                                    continue;
                                default:
                                    switch (i3) {
                                        case 61:
                                            int i17 = this.x;
                                            int[] iArr14 = e.d;
                                            int resourceId14 = obtainStyledAttributes.getResourceId(index, i17);
                                            if (resourceId14 == -1) {
                                                resourceId14 = obtainStyledAttributes.getInt(index, -1);
                                            }
                                            this.x = resourceId14;
                                            continue;
                                        case 62:
                                            this.y = obtainStyledAttributes.getDimensionPixelSize(index, this.y);
                                            continue;
                                        case 63:
                                            this.z = obtainStyledAttributes.getFloat(index, this.z);
                                            continue;
                                            continue;
                                        default:
                                            switch (i3) {
                                                case 69:
                                                    this.Z = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 70:
                                                    this.a0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 71:
                                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                    break;
                                                case 72:
                                                    this.b0 = obtainStyledAttributes.getInt(index, this.b0);
                                                    break;
                                                case 73:
                                                    this.c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.c0);
                                                    break;
                                                case 74:
                                                    this.f0 = obtainStyledAttributes.getString(index);
                                                    break;
                                                case 75:
                                                    this.j0 = obtainStyledAttributes.getBoolean(index, this.j0);
                                                    break;
                                                case 76:
                                                    sb = new StringBuilder();
                                                    str = "unused attribute 0x";
                                                    sb.append(str);
                                                    sb.append(Integer.toHexString(index));
                                                    sb.append("   ");
                                                    sb.append(k0.get(index));
                                                    Log.w("ConstraintSet", sb.toString());
                                                    break;
                                                case 77:
                                                    this.g0 = obtainStyledAttributes.getString(index);
                                                    continue;
                                                default:
                                                    sb = new StringBuilder();
                                                    str = "Unknown attribute 0x";
                                                    sb.append(str);
                                                    sb.append(Integer.toHexString(index));
                                                    sb.append("   ");
                                                    sb.append(k0.get(index));
                                                    Log.w("ConstraintSet", sb.toString());
                                                    break;
                                            }
                                    }
                            }
                    }
                } else {
                    this.i0 = obtainStyledAttributes.getBoolean(index, this.i0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class c {
        public static SparseIntArray h;

        /* renamed from: a  reason: collision with root package name */
        public boolean f398a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f399b = -1;

        /* renamed from: c  reason: collision with root package name */
        public String f400c = null;
        public int d = -1;
        public int e = 0;
        public float f = Float.NaN;
        public float g = Float.NaN;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            h = sparseIntArray;
            sparseIntArray.append(2, 1);
            h.append(4, 2);
            h.append(5, 3);
            h.append(1, 4);
            h.append(0, 5);
            h.append(3, 6);
        }

        public void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f);
            this.f398a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (h.get(index)) {
                    case 1:
                        this.g = obtainStyledAttributes.getFloat(index, this.g);
                        break;
                    case 2:
                        this.d = obtainStyledAttributes.getInt(index, this.d);
                        break;
                    case 3:
                        this.f400c = obtainStyledAttributes.peekValue(index).type == 3 ? obtainStyledAttributes.getString(index) : a.f.a.a.a.f307a[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    case 4:
                        this.e = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        int i2 = this.f399b;
                        int[] iArr = e.d;
                        int resourceId = obtainStyledAttributes.getResourceId(index, i2);
                        if (resourceId == -1) {
                            resourceId = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f399b = resourceId;
                        break;
                    case 6:
                        this.f = obtainStyledAttributes.getFloat(index, this.f);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public boolean f401a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f402b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f403c = 0;
        public float d = 1.0f;
        public float e = Float.NaN;

        public void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.g);
            this.f401a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 1) {
                    this.d = obtainStyledAttributes.getFloat(index, this.d);
                } else if (index == 0) {
                    int i2 = obtainStyledAttributes.getInt(index, this.f402b);
                    this.f402b = i2;
                    int[] iArr = e.d;
                    this.f402b = e.d[i2];
                } else if (index == 4) {
                    this.f403c = obtainStyledAttributes.getInt(index, this.f403c);
                } else if (index == 3) {
                    this.e = obtainStyledAttributes.getFloat(index, this.e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a.f.c.e$e  reason: collision with other inner class name */
    public static class C0009e {
        public static SparseIntArray n;

        /* renamed from: a  reason: collision with root package name */
        public boolean f404a = false;

        /* renamed from: b  reason: collision with root package name */
        public float f405b = 0.0f;

        /* renamed from: c  reason: collision with root package name */
        public float f406c = 0.0f;
        public float d = 0.0f;
        public float e = 1.0f;
        public float f = 1.0f;
        public float g = Float.NaN;
        public float h = Float.NaN;
        public float i = 0.0f;
        public float j = 0.0f;
        public float k = 0.0f;
        public boolean l = false;
        public float m = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            n = sparseIntArray;
            sparseIntArray.append(6, 1);
            n.append(7, 2);
            n.append(8, 3);
            n.append(4, 4);
            n.append(5, 5);
            n.append(0, 6);
            n.append(1, 7);
            n.append(2, 8);
            n.append(3, 9);
            n.append(9, 10);
            n.append(10, 11);
        }

        public void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.i);
            this.f404a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                switch (n.get(index)) {
                    case 1:
                        this.f405b = obtainStyledAttributes.getFloat(index, this.f405b);
                        break;
                    case 2:
                        this.f406c = obtainStyledAttributes.getFloat(index, this.f406c);
                        break;
                    case 3:
                        this.d = obtainStyledAttributes.getFloat(index, this.d);
                        break;
                    case 4:
                        this.e = obtainStyledAttributes.getFloat(index, this.e);
                        break;
                    case 5:
                        this.f = obtainStyledAttributes.getFloat(index, this.f);
                        break;
                    case 6:
                        this.g = obtainStyledAttributes.getDimension(index, this.g);
                        break;
                    case 7:
                        this.h = obtainStyledAttributes.getDimension(index, this.h);
                        break;
                    case 8:
                        this.i = obtainStyledAttributes.getDimension(index, this.i);
                        break;
                    case 9:
                        this.j = obtainStyledAttributes.getDimension(index, this.j);
                        break;
                    case 10:
                        this.k = obtainStyledAttributes.getDimension(index, this.k);
                        break;
                    case 11:
                        this.l = true;
                        this.m = obtainStyledAttributes.getDimension(index, this.m);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        e = sparseIntArray;
        sparseIntArray.append(76, 25);
        e.append(77, 26);
        e.append(79, 29);
        e.append(80, 30);
        e.append(86, 36);
        e.append(85, 35);
        e.append(58, 4);
        e.append(57, 3);
        e.append(55, 1);
        e.append(94, 6);
        e.append(95, 7);
        e.append(65, 17);
        e.append(66, 18);
        e.append(67, 19);
        e.append(0, 27);
        e.append(81, 32);
        e.append(82, 33);
        e.append(64, 10);
        e.append(63, 9);
        e.append(98, 13);
        e.append(101, 16);
        e.append(99, 14);
        e.append(96, 11);
        e.append(100, 15);
        e.append(97, 12);
        e.append(89, 40);
        e.append(74, 39);
        e.append(73, 41);
        e.append(88, 42);
        e.append(72, 20);
        e.append(87, 37);
        e.append(62, 5);
        e.append(75, 82);
        e.append(84, 82);
        e.append(78, 82);
        e.append(56, 82);
        e.append(54, 82);
        e.append(5, 24);
        e.append(7, 28);
        e.append(23, 31);
        e.append(24, 8);
        e.append(6, 34);
        e.append(8, 2);
        e.append(3, 23);
        e.append(4, 21);
        e.append(2, 22);
        e.append(13, 43);
        e.append(26, 44);
        e.append(21, 45);
        e.append(22, 46);
        e.append(20, 60);
        e.append(18, 47);
        e.append(19, 48);
        e.append(14, 49);
        e.append(15, 50);
        e.append(16, 51);
        e.append(17, 52);
        e.append(25, 53);
        e.append(90, 54);
        e.append(68, 55);
        e.append(91, 56);
        e.append(69, 57);
        e.append(92, 58);
        e.append(70, 59);
        e.append(59, 61);
        e.append(61, 62);
        e.append(60, 63);
        e.append(27, 64);
        e.append(106, 65);
        e.append(33, 66);
        e.append(107, 67);
        e.append(103, 79);
        e.append(1, 38);
        e.append(102, 68);
        e.append(93, 69);
        e.append(71, 70);
        e.append(31, 71);
        e.append(29, 72);
        e.append(30, 73);
        e.append(32, 74);
        e.append(28, 75);
        e.append(104, 76);
        e.append(83, 77);
        e.append(108, 78);
        e.append(53, 80);
        e.append(52, 81);
    }

    public void a(Context context, int i) {
        NoSuchMethodException e2;
        IllegalAccessException e3;
        InvocationTargetException e4;
        b bVar;
        e eVar = this;
        ConstraintLayout constraintLayout = (ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null);
        int childCount = constraintLayout.getChildCount();
        eVar.f391c.clear();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = constraintLayout.getChildAt(i2);
            ConstraintLayout.a aVar = (ConstraintLayout.a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!eVar.f390b || id != -1) {
                if (!eVar.f391c.containsKey(Integer.valueOf(id))) {
                    eVar.f391c.put(Integer.valueOf(id), new a());
                }
                a aVar2 = eVar.f391c.get(Integer.valueOf(id));
                HashMap<String, b> hashMap = eVar.f389a;
                HashMap<String, b> hashMap2 = new HashMap<>();
                Class<?> cls = childAt.getClass();
                for (String str : hashMap.keySet()) {
                    b bVar2 = hashMap.get(str);
                    try {
                        if (str.equals("BackgroundColor")) {
                            bVar = new b(bVar2, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor()));
                        } else {
                            try {
                                bVar = new b(bVar2, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0]));
                            } catch (NoSuchMethodException e5) {
                                e2 = e5;
                                e2.printStackTrace();
                            } catch (IllegalAccessException e6) {
                                e3 = e6;
                                e3.printStackTrace();
                            } catch (InvocationTargetException e7) {
                                e4 = e7;
                                e4.printStackTrace();
                            }
                        }
                        hashMap2.put(str, bVar);
                    } catch (NoSuchMethodException e8) {
                        e2 = e8;
                        e2.printStackTrace();
                    } catch (IllegalAccessException e9) {
                        e3 = e9;
                        e3.printStackTrace();
                    } catch (InvocationTargetException e10) {
                        e4 = e10;
                        e4.printStackTrace();
                    }
                }
                aVar2.f = hashMap2;
                aVar2.b(id, aVar);
                aVar2.f393b.f402b = childAt.getVisibility();
                aVar2.f393b.d = childAt.getAlpha();
                aVar2.e.f405b = childAt.getRotation();
                aVar2.e.f406c = childAt.getRotationX();
                aVar2.e.d = childAt.getRotationY();
                aVar2.e.e = childAt.getScaleX();
                aVar2.e.f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                    C0009e eVar2 = aVar2.e;
                    eVar2.g = pivotX;
                    eVar2.h = pivotY;
                }
                aVar2.e.i = childAt.getTranslationX();
                aVar2.e.j = childAt.getTranslationY();
                aVar2.e.k = childAt.getTranslationZ();
                C0009e eVar3 = aVar2.e;
                if (eVar3.l) {
                    eVar3.m = childAt.getElevation();
                }
                if (childAt instanceof a) {
                    a aVar3 = (a) childAt;
                    b bVar3 = aVar2.d;
                    bVar3.j0 = aVar3.j.h0;
                    bVar3.e0 = aVar3.getReferencedIds();
                    aVar2.d.b0 = aVar3.getType();
                    aVar2.d.c0 = aVar3.getMargin();
                }
                i2++;
                eVar = this;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public final int[] b(View view, String str) {
        int i;
        Object c2;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = j.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (c2 = ((ConstraintLayout) view.getParent()).c(0, trim)) != null && (c2 instanceof Integer)) {
                i = ((Integer) c2).intValue();
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        return i3 != split.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    public final a c(Context context, AttributeSet attributeSet) {
        String str;
        StringBuilder sb;
        c cVar;
        String str2;
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f410a);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (!(index == 1 || 23 == index || 24 == index)) {
                aVar.f394c.f398a = true;
                aVar.d.f396b = true;
                aVar.f393b.f401a = true;
                aVar.e.f404a = true;
            }
            switch (e.get(index)) {
                case 1:
                    b bVar = aVar.d;
                    int resourceId = obtainStyledAttributes.getResourceId(index, bVar.p);
                    if (resourceId == -1) {
                        resourceId = obtainStyledAttributes.getInt(index, -1);
                    }
                    bVar.p = resourceId;
                    continue;
                case 2:
                    b bVar2 = aVar.d;
                    bVar2.G = obtainStyledAttributes.getDimensionPixelSize(index, bVar2.G);
                    continue;
                case 3:
                    b bVar3 = aVar.d;
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, bVar3.o);
                    if (resourceId2 == -1) {
                        resourceId2 = obtainStyledAttributes.getInt(index, -1);
                    }
                    bVar3.o = resourceId2;
                    continue;
                case 4:
                    b bVar4 = aVar.d;
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, bVar4.n);
                    if (resourceId3 == -1) {
                        resourceId3 = obtainStyledAttributes.getInt(index, -1);
                    }
                    bVar4.n = resourceId3;
                    continue;
                case 5:
                    aVar.d.w = obtainStyledAttributes.getString(index);
                    continue;
                case 6:
                    b bVar5 = aVar.d;
                    bVar5.A = obtainStyledAttributes.getDimensionPixelOffset(index, bVar5.A);
                    continue;
                case 7:
                    b bVar6 = aVar.d;
                    bVar6.B = obtainStyledAttributes.getDimensionPixelOffset(index, bVar6.B);
                    continue;
                case 8:
                    b bVar7 = aVar.d;
                    bVar7.H = obtainStyledAttributes.getDimensionPixelSize(index, bVar7.H);
                    continue;
                case 9:
                    b bVar8 = aVar.d;
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, bVar8.t);
                    if (resourceId4 == -1) {
                        resourceId4 = obtainStyledAttributes.getInt(index, -1);
                    }
                    bVar8.t = resourceId4;
                    continue;
                case 10:
                    b bVar9 = aVar.d;
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, bVar9.s);
                    if (resourceId5 == -1) {
                        resourceId5 = obtainStyledAttributes.getInt(index, -1);
                    }
                    bVar9.s = resourceId5;
                    continue;
                case 11:
                    b bVar10 = aVar.d;
                    bVar10.M = obtainStyledAttributes.getDimensionPixelSize(index, bVar10.M);
                    continue;
                case 12:
                    b bVar11 = aVar.d;
                    bVar11.N = obtainStyledAttributes.getDimensionPixelSize(index, bVar11.N);
                    continue;
                case 13:
                    b bVar12 = aVar.d;
                    bVar12.J = obtainStyledAttributes.getDimensionPixelSize(index, bVar12.J);
                    continue;
                case 14:
                    b bVar13 = aVar.d;
                    bVar13.L = obtainStyledAttributes.getDimensionPixelSize(index, bVar13.L);
                    continue;
                case 15:
                    b bVar14 = aVar.d;
                    bVar14.O = obtainStyledAttributes.getDimensionPixelSize(index, bVar14.O);
                    continue;
                case 16:
                    b bVar15 = aVar.d;
                    bVar15.K = obtainStyledAttributes.getDimensionPixelSize(index, bVar15.K);
                    continue;
                case 17:
                    b bVar16 = aVar.d;
                    bVar16.e = obtainStyledAttributes.getDimensionPixelOffset(index, bVar16.e);
                    continue;
                case 18:
                    b bVar17 = aVar.d;
                    bVar17.f = obtainStyledAttributes.getDimensionPixelOffset(index, bVar17.f);
                    continue;
                case 19:
                    b bVar18 = aVar.d;
                    bVar18.g = obtainStyledAttributes.getFloat(index, bVar18.g);
                    continue;
                case 20:
                    b bVar19 = aVar.d;
                    bVar19.u = obtainStyledAttributes.getFloat(index, bVar19.u);
                    continue;
                case 21:
                    b bVar20 = aVar.d;
                    bVar20.d = obtainStyledAttributes.getLayoutDimension(index, bVar20.d);
                    continue;
                case 22:
                    d dVar = aVar.f393b;
                    dVar.f402b = obtainStyledAttributes.getInt(index, dVar.f402b);
                    d dVar2 = aVar.f393b;
                    dVar2.f402b = d[dVar2.f402b];
                    continue;
                case 23:
                    b bVar21 = aVar.d;
                    bVar21.f397c = obtainStyledAttributes.getLayoutDimension(index, bVar21.f397c);
                    continue;
                case 24:
                    b bVar22 = aVar.d;
                    bVar22.D = obtainStyledAttributes.getDimensionPixelSize(index, bVar22.D);
                    continue;
                case 25:
                    b bVar23 = aVar.d;
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, bVar23.h);
                    if (resourceId6 == -1) {
                        resourceId6 = obtainStyledAttributes.getInt(index, -1);
                    }
                    bVar23.h = resourceId6;
                    continue;
                case 26:
                    b bVar24 = aVar.d;
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, bVar24.i);
                    if (resourceId7 == -1) {
                        resourceId7 = obtainStyledAttributes.getInt(index, -1);
                    }
                    bVar24.i = resourceId7;
                    continue;
                case 27:
                    b bVar25 = aVar.d;
                    bVar25.C = obtainStyledAttributes.getInt(index, bVar25.C);
                    continue;
                case 28:
                    b bVar26 = aVar.d;
                    bVar26.E = obtainStyledAttributes.getDimensionPixelSize(index, bVar26.E);
                    continue;
                case 29:
                    b bVar27 = aVar.d;
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, bVar27.j);
                    if (resourceId8 == -1) {
                        resourceId8 = obtainStyledAttributes.getInt(index, -1);
                    }
                    bVar27.j = resourceId8;
                    continue;
                case 30:
                    b bVar28 = aVar.d;
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, bVar28.k);
                    if (resourceId9 == -1) {
                        resourceId9 = obtainStyledAttributes.getInt(index, -1);
                    }
                    bVar28.k = resourceId9;
                    continue;
                case 31:
                    b bVar29 = aVar.d;
                    bVar29.I = obtainStyledAttributes.getDimensionPixelSize(index, bVar29.I);
                    continue;
                case 32:
                    b bVar30 = aVar.d;
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, bVar30.q);
                    if (resourceId10 == -1) {
                        resourceId10 = obtainStyledAttributes.getInt(index, -1);
                    }
                    bVar30.q = resourceId10;
                    continue;
                case 33:
                    b bVar31 = aVar.d;
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, bVar31.r);
                    if (resourceId11 == -1) {
                        resourceId11 = obtainStyledAttributes.getInt(index, -1);
                    }
                    bVar31.r = resourceId11;
                    continue;
                case 34:
                    b bVar32 = aVar.d;
                    bVar32.F = obtainStyledAttributes.getDimensionPixelSize(index, bVar32.F);
                    continue;
                case 35:
                    b bVar33 = aVar.d;
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, bVar33.m);
                    if (resourceId12 == -1) {
                        resourceId12 = obtainStyledAttributes.getInt(index, -1);
                    }
                    bVar33.m = resourceId12;
                    continue;
                case 36:
                    b bVar34 = aVar.d;
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, bVar34.l);
                    if (resourceId13 == -1) {
                        resourceId13 = obtainStyledAttributes.getInt(index, -1);
                    }
                    bVar34.l = resourceId13;
                    continue;
                case 37:
                    b bVar35 = aVar.d;
                    bVar35.v = obtainStyledAttributes.getFloat(index, bVar35.v);
                    continue;
                case 38:
                    aVar.f392a = obtainStyledAttributes.getResourceId(index, aVar.f392a);
                    continue;
                case 39:
                    b bVar36 = aVar.d;
                    bVar36.Q = obtainStyledAttributes.getFloat(index, bVar36.Q);
                    continue;
                case 40:
                    b bVar37 = aVar.d;
                    bVar37.P = obtainStyledAttributes.getFloat(index, bVar37.P);
                    continue;
                case 41:
                    b bVar38 = aVar.d;
                    bVar38.R = obtainStyledAttributes.getInt(index, bVar38.R);
                    continue;
                case 42:
                    b bVar39 = aVar.d;
                    bVar39.S = obtainStyledAttributes.getInt(index, bVar39.S);
                    continue;
                case 43:
                    d dVar3 = aVar.f393b;
                    dVar3.d = obtainStyledAttributes.getFloat(index, dVar3.d);
                    continue;
                case 44:
                    C0009e eVar = aVar.e;
                    eVar.l = true;
                    eVar.m = obtainStyledAttributes.getDimension(index, eVar.m);
                    continue;
                case 45:
                    C0009e eVar2 = aVar.e;
                    eVar2.f406c = obtainStyledAttributes.getFloat(index, eVar2.f406c);
                    continue;
                case 46:
                    C0009e eVar3 = aVar.e;
                    eVar3.d = obtainStyledAttributes.getFloat(index, eVar3.d);
                    continue;
                case 47:
                    C0009e eVar4 = aVar.e;
                    eVar4.e = obtainStyledAttributes.getFloat(index, eVar4.e);
                    continue;
                case 48:
                    C0009e eVar5 = aVar.e;
                    eVar5.f = obtainStyledAttributes.getFloat(index, eVar5.f);
                    continue;
                case 49:
                    C0009e eVar6 = aVar.e;
                    eVar6.g = obtainStyledAttributes.getDimension(index, eVar6.g);
                    continue;
                case 50:
                    C0009e eVar7 = aVar.e;
                    eVar7.h = obtainStyledAttributes.getDimension(index, eVar7.h);
                    continue;
                case 51:
                    C0009e eVar8 = aVar.e;
                    eVar8.i = obtainStyledAttributes.getDimension(index, eVar8.i);
                    continue;
                case 52:
                    C0009e eVar9 = aVar.e;
                    eVar9.j = obtainStyledAttributes.getDimension(index, eVar9.j);
                    continue;
                case 53:
                    C0009e eVar10 = aVar.e;
                    eVar10.k = obtainStyledAttributes.getDimension(index, eVar10.k);
                    continue;
                case 54:
                    b bVar40 = aVar.d;
                    bVar40.T = obtainStyledAttributes.getInt(index, bVar40.T);
                    continue;
                case 55:
                    b bVar41 = aVar.d;
                    bVar41.U = obtainStyledAttributes.getInt(index, bVar41.U);
                    continue;
                case 56:
                    b bVar42 = aVar.d;
                    bVar42.V = obtainStyledAttributes.getDimensionPixelSize(index, bVar42.V);
                    continue;
                case 57:
                    b bVar43 = aVar.d;
                    bVar43.W = obtainStyledAttributes.getDimensionPixelSize(index, bVar43.W);
                    continue;
                case 58:
                    b bVar44 = aVar.d;
                    bVar44.X = obtainStyledAttributes.getDimensionPixelSize(index, bVar44.X);
                    continue;
                case 59:
                    b bVar45 = aVar.d;
                    bVar45.Y = obtainStyledAttributes.getDimensionPixelSize(index, bVar45.Y);
                    continue;
                case 60:
                    C0009e eVar11 = aVar.e;
                    eVar11.f405b = obtainStyledAttributes.getFloat(index, eVar11.f405b);
                    continue;
                case 61:
                    b bVar46 = aVar.d;
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, bVar46.x);
                    if (resourceId14 == -1) {
                        resourceId14 = obtainStyledAttributes.getInt(index, -1);
                    }
                    bVar46.x = resourceId14;
                    continue;
                case 62:
                    b bVar47 = aVar.d;
                    bVar47.y = obtainStyledAttributes.getDimensionPixelSize(index, bVar47.y);
                    continue;
                case 63:
                    b bVar48 = aVar.d;
                    bVar48.z = obtainStyledAttributes.getFloat(index, bVar48.z);
                    continue;
                case 64:
                    c cVar2 = aVar.f394c;
                    int resourceId15 = obtainStyledAttributes.getResourceId(index, cVar2.f399b);
                    if (resourceId15 == -1) {
                        resourceId15 = obtainStyledAttributes.getInt(index, -1);
                    }
                    cVar2.f399b = resourceId15;
                    continue;
                case 65:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        cVar = aVar.f394c;
                        str2 = obtainStyledAttributes.getString(index);
                    } else {
                        cVar = aVar.f394c;
                        str2 = a.f.a.a.a.f307a[obtainStyledAttributes.getInteger(index, 0)];
                    }
                    cVar.f400c = str2;
                    continue;
                case 66:
                    aVar.f394c.e = obtainStyledAttributes.getInt(index, 0);
                    continue;
                case 67:
                    c cVar3 = aVar.f394c;
                    cVar3.g = obtainStyledAttributes.getFloat(index, cVar3.g);
                    continue;
                case 68:
                    d dVar4 = aVar.f393b;
                    dVar4.e = obtainStyledAttributes.getFloat(index, dVar4.e);
                    continue;
                case 69:
                    aVar.d.Z = obtainStyledAttributes.getFloat(index, 1.0f);
                    continue;
                case 70:
                    aVar.d.a0 = obtainStyledAttributes.getFloat(index, 1.0f);
                    continue;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    continue;
                case 72:
                    b bVar49 = aVar.d;
                    bVar49.b0 = obtainStyledAttributes.getInt(index, bVar49.b0);
                    continue;
                case 73:
                    b bVar50 = aVar.d;
                    bVar50.c0 = obtainStyledAttributes.getDimensionPixelSize(index, bVar50.c0);
                    continue;
                case 74:
                    aVar.d.f0 = obtainStyledAttributes.getString(index);
                    continue;
                case 75:
                    b bVar51 = aVar.d;
                    bVar51.j0 = obtainStyledAttributes.getBoolean(index, bVar51.j0);
                    continue;
                case 76:
                    c cVar4 = aVar.f394c;
                    cVar4.d = obtainStyledAttributes.getInt(index, cVar4.d);
                    continue;
                case 77:
                    aVar.d.g0 = obtainStyledAttributes.getString(index);
                    continue;
                case 78:
                    d dVar5 = aVar.f393b;
                    dVar5.f403c = obtainStyledAttributes.getInt(index, dVar5.f403c);
                    continue;
                case 79:
                    c cVar5 = aVar.f394c;
                    cVar5.f = obtainStyledAttributes.getFloat(index, cVar5.f);
                    continue;
                case 80:
                    b bVar52 = aVar.d;
                    bVar52.h0 = obtainStyledAttributes.getBoolean(index, bVar52.h0);
                    continue;
                case 81:
                    b bVar53 = aVar.d;
                    bVar53.i0 = obtainStyledAttributes.getBoolean(index, bVar53.i0);
                    continue;
                case 82:
                    sb = new StringBuilder();
                    str = "unused attribute 0x";
                    break;
                default:
                    sb = new StringBuilder();
                    str = "Unknown attribute 0x";
                    break;
            }
            sb.append(str);
            sb.append(Integer.toHexString(index));
            sb.append("   ");
            sb.append(e.get(index));
            Log.w("ConstraintSet", sb.toString());
        }
        obtainStyledAttributes.recycle();
        return aVar;
    }

    public void d(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a c2 = c(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        c2.d.f395a = true;
                    }
                    this.f391c.put(Integer.valueOf(c2.f392a), c2);
                }
            }
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        } catch (IOException e3) {
            e3.printStackTrace();
        }
    }
}
