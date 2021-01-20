package a.j.a;

import android.os.Parcel;
import android.os.Parcelable;

public abstract class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final a f566b = new C0016a();

    /* renamed from: a  reason: collision with root package name */
    public final Parcelable f567a;

    /* renamed from: a.j.a.a$a  reason: collision with other inner class name */
    public static class C0016a extends a {
        public C0016a() {
            super((C0016a) null);
        }
    }

    public static class b implements Parcelable.ClassLoaderCreator<a> {
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            if (parcel.readParcelable(null) == null) {
                return a.f566b;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new a[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.ClassLoaderCreator
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.f566b;
            }
            throw new IllegalStateException("superState must be null");
        }
    }

    public a(C0016a aVar) {
        this.f567a = null;
    }

    public a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f567a = readParcelable == null ? f566b : readParcelable;
    }

    public a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f567a = parcelable == f566b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f567a, i);
    }
}
