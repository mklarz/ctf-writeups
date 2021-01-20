package a.b.g;

public class p0 {

    /* renamed from: a  reason: collision with root package name */
    public int f201a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f202b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f203c = Integer.MIN_VALUE;
    public int d = Integer.MIN_VALUE;
    public int e = 0;
    public int f = 0;
    public boolean g = false;
    public boolean h = false;

    public void a(int i, int i2) {
        this.f203c = i;
        this.d = i2;
        this.h = true;
        if (this.g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f201a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f202b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f201a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f202b = i2;
        }
    }
}
