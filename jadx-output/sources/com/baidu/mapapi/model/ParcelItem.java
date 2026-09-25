package com.baidu.mapapi.model;

/* JADX INFO: loaded from: classes.dex */
public class ParcelItem implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.baidu.mapapi.model.ParcelItem> CREATOR = new com.baidu.mapapi.model.c();
    private android.os.Bundle a;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public android.os.Bundle getBundle() {
        return this.a;
    }

    public void setBundle(android.os.Bundle bundle) {
        this.a = bundle;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeBundle(this.a);
    }
}
