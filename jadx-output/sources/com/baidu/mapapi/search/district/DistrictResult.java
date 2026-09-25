package com.baidu.mapapi.search.district;

/* JADX INFO: loaded from: classes.dex */
public class DistrictResult extends com.baidu.mapapi.search.core.SearchResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.baidu.mapapi.search.district.DistrictResult> CREATOR = new com.baidu.mapapi.search.district.a();
    public com.baidu.mapapi.model.LatLng centerPt;
    public int cityCode;
    public java.lang.String cityName;
    public java.util.List<java.util.List<com.baidu.mapapi.model.LatLng>> polylines;

    public DistrictResult() {
        this.centerPt = null;
        this.polylines = null;
        this.cityName = null;
    }

    protected DistrictResult(android.os.Parcel parcel) {
        super(parcel);
        this.centerPt = null;
        this.polylines = null;
        this.cityName = null;
        this.centerPt = (com.baidu.mapapi.model.LatLng) parcel.readParcelable(com.baidu.mapapi.model.LatLng.class.getClassLoader());
        int i = parcel.readInt();
        if (i > 0) {
            this.polylines = new java.util.ArrayList();
            for (int i2 = 0; i2 < i; i2++) {
                this.polylines.add(parcel.createTypedArrayList(com.baidu.mapapi.model.LatLng.CREATOR));
            }
        }
        this.cityCode = parcel.readInt();
        this.cityName = parcel.readString();
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public com.baidu.mapapi.model.LatLng getCenterPt() {
        return this.centerPt;
    }

    public int getCityCode() {
        return this.cityCode;
    }

    public java.lang.String getCityName() {
        return this.cityName;
    }

    public java.util.List<java.util.List<com.baidu.mapapi.model.LatLng>> getPolylines() {
        return this.polylines;
    }

    public void setCenterPt(com.baidu.mapapi.model.LatLng latLng) {
        this.centerPt = latLng;
    }

    public void setCityCode(int i) {
        this.cityCode = i;
    }

    public void setCityName(java.lang.String str) {
        this.cityName = str;
    }

    public void setPolylines(java.util.List<java.util.List<com.baidu.mapapi.model.LatLng>> list) {
        this.polylines = list;
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.centerPt, i);
        java.util.List<java.util.List<com.baidu.mapapi.model.LatLng>> list = this.polylines;
        parcel.writeInt(list == null ? 0 : list.size());
        java.util.Iterator<java.util.List<com.baidu.mapapi.model.LatLng>> it = this.polylines.iterator();
        while (it.hasNext()) {
            parcel.writeTypedList(it.next());
        }
        parcel.writeInt(this.cityCode);
        parcel.writeString(this.cityName);
    }
}
