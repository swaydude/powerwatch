package com.baidu.mapapi.search.core;

/* JADX INFO: loaded from: classes.dex */
public class PriceInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.baidu.mapapi.search.core.PriceInfo> CREATOR = new com.baidu.mapapi.search.core.i();
    private int a;
    private double b;

    public PriceInfo() {
    }

    protected PriceInfo(android.os.Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readDouble();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public double getTicketPrice() {
        return this.b;
    }

    public int getTicketType() {
        return this.a;
    }

    public void setTicketPrice(double d) {
        this.b = d;
    }

    public void setTicketType(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeDouble(this.b);
    }
}
