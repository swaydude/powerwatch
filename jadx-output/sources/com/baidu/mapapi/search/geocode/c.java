package com.baidu.mapapi.search.geocode;

/* JADX INFO: loaded from: classes.dex */
final class c implements android.os.Parcelable.Creator<com.baidu.mapapi.search.geocode.ReverseGeoCodeResult.AddressComponent> {
    c() {
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.geocode.ReverseGeoCodeResult.AddressComponent createFromParcel(android.os.Parcel parcel) {
        return new com.baidu.mapapi.search.geocode.ReverseGeoCodeResult.AddressComponent(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.geocode.ReverseGeoCodeResult.AddressComponent[] newArray(int i) {
        return new com.baidu.mapapi.search.geocode.ReverseGeoCodeResult.AddressComponent[i];
    }
}
