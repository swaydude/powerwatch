package com.baidu.mapapi.search.share;

/* JADX INFO: loaded from: classes.dex */
public class ShareUrlResult extends com.baidu.mapapi.search.core.SearchResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.baidu.mapapi.search.share.ShareUrlResult> CREATOR = new com.baidu.mapapi.search.share.a();
    private java.lang.String a;
    private int b;

    public ShareUrlResult() {
    }

    protected ShareUrlResult(android.os.Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readInt();
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String getUrl() {
        return this.a;
    }

    public void setType(int i) {
        this.b = i;
    }

    public void setUrl(java.lang.String str) {
        this.a = str;
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
    }
}
