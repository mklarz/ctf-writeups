package a.k.a;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
public final class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<m> f589a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<String> f590b;

    /* renamed from: c  reason: collision with root package name */
    public b[] f591c;
    public String d = null;
    public int e;

    public static class a implements Parcelable.Creator<k> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public k[] newArray(int i) {
            return new k[i];
        }
    }

    public k() {
    }

    public k(Parcel parcel) {
        this.f589a = parcel.createTypedArrayList(m.CREATOR);
        this.f590b = parcel.createStringArrayList();
        this.f591c = (b[]) parcel.createTypedArray(b.CREATOR);
        this.d = parcel.readString();
        this.e = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f589a);
        parcel.writeStringList(this.f590b);
        parcel.writeTypedArray(this.f591c, i);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
    }
}
