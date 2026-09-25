package com.baidu.mapapi.search.core;

/* JADX INFO: loaded from: classes.dex */
public class n extends com.baidu.mapapi.search.core.TransitBaseInfo {
    public static final android.os.Parcelable.Creator<com.baidu.mapapi.search.core.n> a = new com.baidu.mapapi.search.core.o();
    private double b;
    private java.lang.String c;

    public n() {
    }

    protected n(android.os.Parcel parcel) {
        super(parcel);
        this.b = parcel.readDouble();
        this.c = parcel.readString();
    }

    public void a(double d) {
        this.b = d;
    }

    public void a(java.lang.String str) {
        this.c = str;
    }

    @Override // com.baidu.mapapi.search.core.TransitBaseInfo, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.baidu.mapapi.search.core.TransitBaseInfo, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeDouble(this.b);
        parcel.writeString(this.c);
    }
}
