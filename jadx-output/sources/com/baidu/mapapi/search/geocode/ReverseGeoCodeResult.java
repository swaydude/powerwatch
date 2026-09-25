package com.baidu.mapapi.search.geocode;

/* JADX INFO: loaded from: classes.dex */
public class ReverseGeoCodeResult extends com.baidu.mapapi.search.core.SearchResult {
    public static final android.os.Parcelable.Creator<com.baidu.mapapi.search.geocode.ReverseGeoCodeResult> CREATOR = new com.baidu.mapapi.search.geocode.b();
    private java.lang.String a;
    private java.lang.String b;
    private com.baidu.mapapi.search.geocode.ReverseGeoCodeResult.AddressComponent c;
    private com.baidu.mapapi.model.LatLng d;
    private int e;
    private java.util.List<com.baidu.mapapi.search.core.PoiInfo> f;
    private java.lang.String g;
    private java.util.List<com.baidu.mapapi.search.geocode.ReverseGeoCodeResult.PoiRegionsInfo> h;
    private int i;

    public static class AddressComponent implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.baidu.mapapi.search.geocode.ReverseGeoCodeResult.AddressComponent> CREATOR = new com.baidu.mapapi.search.geocode.c();
        public int adcode;
        public java.lang.String city;
        public int countryCode;
        public java.lang.String countryName;
        public java.lang.String direction;
        public java.lang.String distance;
        public java.lang.String district;
        public java.lang.String province;
        public java.lang.String street;
        public java.lang.String streetNumber;
        public java.lang.String town;

        public AddressComponent() {
        }

        protected AddressComponent(android.os.Parcel parcel) {
            this.streetNumber = parcel.readString();
            this.street = parcel.readString();
            this.town = parcel.readString();
            this.district = parcel.readString();
            this.city = parcel.readString();
            this.province = parcel.readString();
            this.countryName = parcel.readString();
            this.countryCode = parcel.readInt();
            this.adcode = parcel.readInt();
            this.direction = parcel.readString();
            this.distance = parcel.readString();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public java.lang.String getDirection() {
            return this.direction;
        }

        public java.lang.String getDistance() {
            return this.distance;
        }

        public java.lang.String getTown() {
            return this.town;
        }

        public void setDirection(java.lang.String str) {
            this.direction = str;
        }

        public void setDistance(java.lang.String str) {
            this.distance = str;
        }

        public void setTown(java.lang.String str) {
            this.town = str;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeString(this.streetNumber);
            parcel.writeString(this.street);
            parcel.writeString(this.town);
            parcel.writeString(this.district);
            parcel.writeString(this.city);
            parcel.writeString(this.province);
            parcel.writeString(this.countryName);
            parcel.writeInt(this.countryCode);
            parcel.writeInt(this.adcode);
            parcel.writeString(this.direction);
            parcel.writeString(this.distance);
        }
    }

    public static class PoiRegionsInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.baidu.mapapi.search.geocode.ReverseGeoCodeResult.PoiRegionsInfo> CREATOR = new com.baidu.mapapi.search.geocode.d();
        public java.lang.String directionDesc;
        public java.lang.String regionName;
        public java.lang.String regionTag;

        public PoiRegionsInfo() {
        }

        protected PoiRegionsInfo(android.os.Parcel parcel) {
            this.directionDesc = parcel.readString();
            this.regionName = parcel.readString();
            this.regionTag = parcel.readString();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public java.lang.String getDirectionDesc() {
            return this.directionDesc;
        }

        public java.lang.String getRegionName() {
            return this.regionName;
        }

        public java.lang.String getRegionTag() {
            return this.regionTag;
        }

        public void setDirectionDesc(java.lang.String str) {
            this.directionDesc = str;
        }

        public void setRegionName(java.lang.String str) {
            this.regionName = str;
        }

        public void setRegionTag(java.lang.String str) {
            this.regionTag = str;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeString(this.directionDesc);
            parcel.writeString(this.regionName);
            parcel.writeString(this.regionTag);
        }
    }

    public ReverseGeoCodeResult() {
    }

    protected ReverseGeoCodeResult(android.os.Parcel parcel) {
        super(parcel);
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = (com.baidu.mapapi.search.geocode.ReverseGeoCodeResult.AddressComponent) parcel.readParcelable(com.baidu.mapapi.search.geocode.ReverseGeoCodeResult.AddressComponent.class.getClassLoader());
        this.d = (com.baidu.mapapi.model.LatLng) parcel.readValue(com.baidu.mapapi.model.LatLng.class.getClassLoader());
        this.f = parcel.createTypedArrayList(com.baidu.mapapi.search.core.PoiInfo.CREATOR);
        this.g = parcel.readString();
        this.h = parcel.createTypedArrayList(com.baidu.mapapi.search.geocode.ReverseGeoCodeResult.PoiRegionsInfo.CREATOR);
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getAdcode() {
        return this.i;
    }

    public java.lang.String getAddress() {
        return this.b;
    }

    public com.baidu.mapapi.search.geocode.ReverseGeoCodeResult.AddressComponent getAddressDetail() {
        return this.c;
    }

    public java.lang.String getBusinessCircle() {
        return this.a;
    }

    public int getCityCode() {
        return this.e;
    }

    public com.baidu.mapapi.model.LatLng getLocation() {
        return this.d;
    }

    public java.util.List<com.baidu.mapapi.search.core.PoiInfo> getPoiList() {
        return this.f;
    }

    public java.util.List<com.baidu.mapapi.search.geocode.ReverseGeoCodeResult.PoiRegionsInfo> getPoiRegionsInfoList() {
        return this.h;
    }

    public java.lang.String getSematicDescription() {
        return this.g;
    }

    public void setAdcode(int i) {
        this.i = i;
    }

    public void setAddress(java.lang.String str) {
        this.b = str;
    }

    public void setAddressDetail(com.baidu.mapapi.search.geocode.ReverseGeoCodeResult.AddressComponent addressComponent) {
        this.c = addressComponent;
    }

    public void setBusinessCircle(java.lang.String str) {
        this.a = str;
    }

    public void setCityCode(int i) {
        this.e = i;
    }

    public void setLocation(com.baidu.mapapi.model.LatLng latLng) {
        this.d = latLng;
    }

    public void setPoiList(java.util.List<com.baidu.mapapi.search.core.PoiInfo> list) {
        this.f = list;
    }

    public void setPoiRegionsInfoList(java.util.List<com.baidu.mapapi.search.geocode.ReverseGeoCodeResult.PoiRegionsInfo> list) {
        this.h = list;
    }

    public void setSematicDescription(java.lang.String str) {
        this.g = str;
    }

    public java.lang.String toString() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ReverseGeoCodeResult: \n");
        stringBuffer.append("businessCircle = ");
        stringBuffer.append(this.a);
        stringBuffer.append("; address = ");
        stringBuffer.append(this.b);
        stringBuffer.append("; location = ");
        stringBuffer.append(this.d);
        stringBuffer.append("; sematicDescription = ");
        stringBuffer.append(this.g);
        if (this.c != null) {
            stringBuffer.append("\n#AddressComponent Info BEGIN# \n");
            stringBuffer.append("streetNumber = ");
            stringBuffer.append(this.c.streetNumber);
            stringBuffer.append("; street = ");
            stringBuffer.append(this.c.street);
            stringBuffer.append("; town = ");
            stringBuffer.append(this.c.town);
            stringBuffer.append("; district = ");
            stringBuffer.append(this.c.district);
            stringBuffer.append("; city = ");
            stringBuffer.append(this.c.city);
            stringBuffer.append("; province = ");
            stringBuffer.append(this.c.province);
            stringBuffer.append("; countryName = ");
            stringBuffer.append(this.c.countryName);
            stringBuffer.append("; countryCode = ");
            stringBuffer.append(this.c.countryCode);
            stringBuffer.append("; adcode = ");
            stringBuffer.append(this.c.adcode);
            stringBuffer.append("; direction = ");
            stringBuffer.append(this.c.direction);
            stringBuffer.append("; distance = ");
            stringBuffer.append(this.c.distance);
            stringBuffer.append("\n#AddressComponent Info END# \n");
        }
        java.util.List<com.baidu.mapapi.search.geocode.ReverseGeoCodeResult.PoiRegionsInfo> list = this.h;
        if (list != null && !list.isEmpty()) {
            stringBuffer.append("\n#PoiRegions Info  BEGIN#");
            for (int i = 0; i < this.h.size(); i++) {
                com.baidu.mapapi.search.geocode.ReverseGeoCodeResult.PoiRegionsInfo poiRegionsInfo = this.h.get(i);
                if (poiRegionsInfo != null) {
                    stringBuffer.append("\ndirectionDesc = ");
                    stringBuffer.append(poiRegionsInfo.getDirectionDesc());
                    stringBuffer.append("; regionName = ");
                    stringBuffer.append(poiRegionsInfo.getRegionName());
                    stringBuffer.append("; regionTag = ");
                    stringBuffer.append(poiRegionsInfo.getRegionTag());
                }
            }
            stringBuffer.append("\n#PoiRegions Info  END# \n");
        }
        java.util.List<com.baidu.mapapi.search.core.PoiInfo> list2 = this.f;
        if (list2 != null && !list2.isEmpty()) {
            stringBuffer.append("\n #PoiList Info  BEGIN#");
            for (int i2 = 0; i2 < this.f.size(); i2++) {
                com.baidu.mapapi.search.core.PoiInfo poiInfo = this.f.get(i2);
                if (poiInfo != null) {
                    stringBuffer.append("\n address = ");
                    stringBuffer.append(poiInfo.getAddress());
                    stringBuffer.append("; phoneNumber = ");
                    stringBuffer.append(poiInfo.getPhoneNum());
                    stringBuffer.append("; uid = ");
                    stringBuffer.append(poiInfo.getUid());
                    stringBuffer.append("; postCode = ");
                    stringBuffer.append(poiInfo.getPostCode());
                    stringBuffer.append("; name = ");
                    stringBuffer.append(poiInfo.getName());
                    stringBuffer.append("; location = ");
                    stringBuffer.append(poiInfo.getLocation());
                    stringBuffer.append("; city = ");
                    stringBuffer.append(poiInfo.getCity());
                    stringBuffer.append("; direction = ");
                    stringBuffer.append(poiInfo.getDirection());
                    stringBuffer.append("; distance = ");
                    stringBuffer.append(poiInfo.getDistance());
                    if (poiInfo.getParentPoi() != null) {
                        stringBuffer.append("\n parentPoiAddress = ");
                        stringBuffer.append(poiInfo.getParentPoi().getParentPoiAddress());
                        stringBuffer.append("; parentPoiDirection = ");
                        stringBuffer.append(poiInfo.getParentPoi().getParentPoiDirection());
                        stringBuffer.append("; parentPoiDistance = ");
                        stringBuffer.append(poiInfo.getParentPoi().getParentPoiDistance());
                        stringBuffer.append("; parentPoiName = ");
                        stringBuffer.append(poiInfo.getParentPoi().getParentPoiName());
                        stringBuffer.append("; parentPoiTag = ");
                        stringBuffer.append(poiInfo.getParentPoi().getParentPoiTag());
                        stringBuffer.append("; parentPoiUid = ");
                        stringBuffer.append(poiInfo.getParentPoi().getParentPoiUid());
                        stringBuffer.append("; parentPoiLocation = ");
                        stringBuffer.append(poiInfo.getParentPoi().getParentPoiLocation());
                    }
                }
            }
            stringBuffer.append("\n #PoiList Info  END# \n");
        }
        return stringBuffer.toString();
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, 0);
        parcel.writeValue(this.d);
        parcel.writeTypedList(this.f);
        parcel.writeString(this.g);
        parcel.writeTypedList(this.h);
    }
}
