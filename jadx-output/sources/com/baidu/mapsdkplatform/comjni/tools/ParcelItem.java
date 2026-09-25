package com.baidu.mapsdkplatform.comjni.tools;

/* JADX INFO: loaded from: classes.dex */
public class ParcelItem implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.baidu.mapsdkplatform.comjni.tools.ParcelItem> a = new com.baidu.mapsdkplatform.comjni.tools.b();
    private android.os.Bundle b;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public android.os.Bundle getBundle() {
        return this.b;
    }

    public void setBundle(android.os.Bundle bundle) {
        this.b = bundle;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeBundle(this.b);
    }
}
