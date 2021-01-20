package a.k.a;

import a.k.a.n;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int[] f572a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<String> f573b;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f574c;
    public final int[] d;
    public final int e;
    public final int f;
    public final String g;
    public final int h;
    public final int i;
    public final CharSequence j;
    public final int k;
    public final CharSequence l;
    public final ArrayList<String> m;
    public final ArrayList<String> n;
    public final boolean o;

    public static class a implements Parcelable.Creator<b> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public b[] newArray(int i) {
            return new b[i];
        }
    }

    public b(a aVar) {
        int size = aVar.f597a.size();
        this.f572a = new int[(size * 5)];
        if (aVar.h) {
            this.f573b = new ArrayList<>(size);
            this.f574c = new int[size];
            this.d = new int[size];
            int i2 = 0;
            int i3 = 0;
            while (i2 < size) {
                n.a aVar2 = aVar.f597a.get(i2);
                int i4 = i3 + 1;
                this.f572a[i3] = aVar2.f600a;
                ArrayList<String> arrayList = this.f573b;
                Fragment fragment = aVar2.f601b;
                arrayList.add(fragment != null ? fragment.e : null);
                int[] iArr = this.f572a;
                int i5 = i4 + 1;
                iArr[i4] = aVar2.f602c;
                int i6 = i5 + 1;
                iArr[i5] = aVar2.d;
                int i7 = i6 + 1;
                iArr[i6] = aVar2.e;
                iArr[i7] = aVar2.f;
                this.f574c[i2] = aVar2.g.ordinal();
                this.d[i2] = aVar2.h.ordinal();
                i2++;
                i3 = i7 + 1;
            }
            this.e = aVar.f;
            this.f = aVar.g;
            this.g = aVar.i;
            this.h = aVar.r;
            this.i = aVar.j;
            this.j = aVar.k;
            this.k = aVar.l;
            this.l = aVar.m;
            this.m = aVar.n;
            this.n = aVar.o;
            this.o = aVar.p;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public b(Parcel parcel) {
        this.f572a = parcel.createIntArray();
        this.f573b = parcel.createStringArrayList();
        this.f574c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readString();
        this.h = parcel.readInt();
        this.i = parcel.readInt();
        this.j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.k = parcel.readInt();
        this.l = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.m = parcel.createStringArrayList();
        this.n = parcel.createStringArrayList();
        this.o = parcel.readInt() != 0;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeIntArray(this.f572a);
        parcel.writeStringList(this.f573b);
        parcel.writeIntArray(this.f574c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeString(this.g);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
        TextUtils.writeToParcel(this.j, parcel, 0);
        parcel.writeInt(this.k);
        TextUtils.writeToParcel(this.l, parcel, 0);
        parcel.writeStringList(this.m);
        parcel.writeStringList(this.n);
        parcel.writeInt(this.o ? 1 : 0);
    }
}
