package b.b.a.a.n;

import a.e.h;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public class a extends a.j.a.a {
    public static final Parcelable.Creator<a> CREATOR = new C0030a();

    /* renamed from: c  reason: collision with root package name */
    public final h<String, Bundle> f1080c;

    /* renamed from: b.b.a.a.n.a$a  reason: collision with other inner class name */
    public static class C0030a implements Parcelable.ClassLoaderCreator<a> {
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new a(parcel, null, null);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new a[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.ClassLoaderCreator
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new a(parcel, classLoader, null);
        }
    }

    public a(Parcel parcel, ClassLoader classLoader, C0030a aVar) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f1080c = new h<>(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f1080c.put(strArr[i], bundleArr[i]);
        }
    }

    public String toString() {
        StringBuilder d = b.a.a.a.a.d("ExtendableSavedState{");
        d.append(Integer.toHexString(System.identityHashCode(this)));
        d.append(" states=");
        d.append(this.f1080c);
        d.append("}");
        return d.toString();
    }

    @Override // a.j.a.a
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f567a, i);
        int i2 = this.f1080c.f303c;
        parcel.writeInt(i2);
        String[] strArr = new String[i2];
        Bundle[] bundleArr = new Bundle[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = this.f1080c.h(i3);
            bundleArr[i3] = this.f1080c.k(i3);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }
}
