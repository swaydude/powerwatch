package com.baidu.mapapi.search.core;

/* JADX INFO: loaded from: classes.dex */
public class CityInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.baidu.mapapi.search.core.CityInfo> CREATOR = new com.baidu.mapapi.search.core.b();
    public java.lang.String city;
    public int num;

    public CityInfo() {
    }

    protected CityInfo(android.os.Parcel parcel) {
        this.city = parcel.readString();
        this.num = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.city);
        parcel.writeInt(this.num);
    }
}
