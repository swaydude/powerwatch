package com.baidu.mapapi.search.core;

/* JADX INFO: loaded from: classes.dex */
public class PoiInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.baidu.mapapi.search.core.PoiInfo> CREATOR = new com.baidu.mapapi.search.core.g();
    public java.lang.String address;
    public java.lang.String area;
    public java.lang.String city;
    public int detail;
    public java.lang.String direction;
    public int distance;
    public boolean hasCaterDetails;
    public boolean isPano;
    public com.baidu.mapapi.model.LatLng location;
    public java.lang.String name;
    public com.baidu.mapapi.search.core.PoiInfo.ParentPoiInfo parentPoiInfo;
    public java.lang.String phoneNum;
    public com.baidu.mapapi.search.core.PoiDetailInfo poiDetailInfo;
    public java.lang.String postCode;
    public java.lang.String province;
    public java.lang.String street_id;
    public java.lang.String tag;
    public com.baidu.mapapi.search.core.PoiInfo.POITYPE type;
    public java.lang.String uid;

    public enum POITYPE {
        POINT(0),
        BUS_STATION(1),
        BUS_LINE(2),
        SUBWAY_STATION(3),
        SUBWAY_LINE(4);

        private int a;

        POITYPE(int i) {
            this.a = i;
        }

        public static com.baidu.mapapi.search.core.PoiInfo.POITYPE fromInt(int i) {
            if (i == 0) {
                return POINT;
            }
            if (i == 1) {
                return BUS_STATION;
            }
            if (i == 2) {
                return BUS_LINE;
            }
            if (i == 3) {
                return SUBWAY_STATION;
            }
            if (i != 4) {
                return null;
            }
            return SUBWAY_LINE;
        }

        public int getInt() {
            return this.a;
        }
    }

    public static class ParentPoiInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.baidu.mapapi.search.core.PoiInfo.ParentPoiInfo> CREATOR = new com.baidu.mapapi.search.core.h();
        public java.lang.String parentPoiAddress;
        public java.lang.String parentPoiDirection;
        public int parentPoiDistance;
        public com.baidu.mapapi.model.LatLng parentPoiLocation;
        public java.lang.String parentPoiName;
        public java.lang.String parentPoiTag;
        public java.lang.String parentPoiUid;

        public ParentPoiInfo() {
        }

        protected ParentPoiInfo(android.os.Parcel parcel) {
            this.parentPoiName = parcel.readString();
            this.parentPoiTag = parcel.readString();
            this.parentPoiAddress = parcel.readString();
            this.parentPoiLocation = (com.baidu.mapapi.model.LatLng) parcel.readParcelable(com.baidu.mapapi.model.LatLng.class.getClassLoader());
            this.parentPoiDirection = parcel.readString();
            this.parentPoiDistance = parcel.readInt();
            this.parentPoiUid = parcel.readString();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public java.lang.String getParentPoiAddress() {
            return this.parentPoiAddress;
        }

        public java.lang.String getParentPoiDirection() {
            return this.parentPoiDirection;
        }

        public int getParentPoiDistance() {
            return this.parentPoiDistance;
        }

        public com.baidu.mapapi.model.LatLng getParentPoiLocation() {
            return this.parentPoiLocation;
        }

        public java.lang.String getParentPoiName() {
            return this.parentPoiName;
        }

        public java.lang.String getParentPoiTag() {
            return this.parentPoiTag;
        }

        public java.lang.String getParentPoiUid() {
            return this.parentPoiUid;
        }

        public void setParentPoiAddress(java.lang.String str) {
            this.parentPoiAddress = str;
        }

        public void setParentPoiDirection(java.lang.String str) {
            this.parentPoiDirection = str;
        }

        public void setParentPoiDistance(int i) {
            this.parentPoiDistance = i;
        }

        public void setParentPoiLocation(com.baidu.mapapi.model.LatLng latLng) {
            this.parentPoiLocation = latLng;
        }

        public void setParentPoiName(java.lang.String str) {
            this.parentPoiName = str;
        }

        public void setParentPoiTag(java.lang.String str) {
            this.parentPoiTag = str;
        }

        public void setParentPoiUid(java.lang.String str) {
            this.parentPoiUid = str;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeString(this.parentPoiName);
            parcel.writeString(this.parentPoiTag);
            parcel.writeString(this.parentPoiAddress);
            parcel.writeParcelable(this.parentPoiLocation, i);
            parcel.writeString(this.parentPoiDirection);
            parcel.writeInt(this.parentPoiDistance);
            parcel.writeString(this.parentPoiUid);
        }
    }

    public PoiInfo() {
    }

    protected PoiInfo(android.os.Parcel parcel) {
        this.name = parcel.readString();
        this.uid = parcel.readString();
        this.tag = parcel.readString();
        this.address = parcel.readString();
        this.province = parcel.readString();
        this.city = parcel.readString();
        this.area = parcel.readString();
        this.street_id = parcel.readString();
        this.phoneNum = parcel.readString();
        this.postCode = parcel.readString();
        this.detail = ((java.lang.Integer) parcel.readValue(java.lang.Integer.class.getClassLoader())).intValue();
        this.type = (com.baidu.mapapi.search.core.PoiInfo.POITYPE) parcel.readValue(com.baidu.mapapi.search.core.PoiInfo.POITYPE.class.getClassLoader());
        this.location = (com.baidu.mapapi.model.LatLng) parcel.readParcelable(com.baidu.mapapi.model.LatLng.class.getClassLoader());
        this.hasCaterDetails = ((java.lang.Boolean) parcel.readValue(java.lang.Boolean.class.getClassLoader())).booleanValue();
        this.isPano = ((java.lang.Boolean) parcel.readValue(java.lang.Boolean.class.getClassLoader())).booleanValue();
        this.poiDetailInfo = (com.baidu.mapapi.search.core.PoiDetailInfo) parcel.readParcelable(com.baidu.mapapi.search.core.PoiDetailInfo.class.getClassLoader());
        this.direction = parcel.readString();
        this.distance = parcel.readInt();
        this.parentPoiInfo = (com.baidu.mapapi.search.core.PoiInfo.ParentPoiInfo) parcel.readParcelable(com.baidu.mapapi.search.core.PoiInfo.ParentPoiInfo.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String getAddress() {
        return this.address;
    }

    public java.lang.String getArea() {
        return this.area;
    }

    public java.lang.String getCity() {
        return this.city;
    }

    public int getDetail() {
        return this.detail;
    }

    public java.lang.String getDirection() {
        return this.direction;
    }

    public int getDistance() {
        return this.distance;
    }

    public com.baidu.mapapi.model.LatLng getLocation() {
        return this.location;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public com.baidu.mapapi.search.core.PoiInfo.ParentPoiInfo getParentPoi() {
        return this.parentPoiInfo;
    }

    public java.lang.String getPhoneNum() {
        return this.phoneNum;
    }

    public com.baidu.mapapi.search.core.PoiDetailInfo getPoiDetailInfo() {
        return this.poiDetailInfo;
    }

    public java.lang.String getPostCode() {
        return this.postCode;
    }

    public java.lang.String getProvince() {
        return this.province;
    }

    public java.lang.String getStreetId() {
        return this.street_id;
    }

    public java.lang.String getTag() {
        return this.tag;
    }

    public com.baidu.mapapi.search.core.PoiInfo.POITYPE getType() {
        return this.type;
    }

    public java.lang.String getUid() {
        return this.uid;
    }

    public boolean isHasCaterDetails() {
        return this.hasCaterDetails;
    }

    public boolean isPano() {
        return this.isPano;
    }

    public void setAddress(java.lang.String str) {
        this.address = str;
    }

    public void setArea(java.lang.String str) {
        this.area = str;
    }

    public void setCity(java.lang.String str) {
        this.city = str;
    }

    public void setDetail(int i) {
        this.detail = i;
    }

    public void setDirection(java.lang.String str) {
        this.direction = str;
    }

    public void setDistance(int i) {
        this.distance = i;
    }

    public void setHasCaterDetails(boolean z) {
        this.hasCaterDetails = z;
    }

    public void setLocation(com.baidu.mapapi.model.LatLng latLng) {
        this.location = latLng;
    }

    public void setName(java.lang.String str) {
        this.name = str;
    }

    public void setPano(boolean z) {
        this.isPano = z;
    }

    public void setParentPoi(com.baidu.mapapi.search.core.PoiInfo.ParentPoiInfo parentPoiInfo) {
        this.parentPoiInfo = parentPoiInfo;
    }

    public void setPhoneNum(java.lang.String str) {
        this.phoneNum = str;
    }

    public void setPoiDetailInfo(com.baidu.mapapi.search.core.PoiDetailInfo poiDetailInfo) {
        this.poiDetailInfo = poiDetailInfo;
    }

    public void setPostCode(java.lang.String str) {
        this.postCode = str;
    }

    public void setProvince(java.lang.String str) {
        this.province = str;
    }

    public void setStreetId(java.lang.String str) {
        this.street_id = str;
    }

    public void setTag(java.lang.String str) {
        this.tag = str;
    }

    public void setType(com.baidu.mapapi.search.core.PoiInfo.POITYPE poitype) {
        this.type = poitype;
    }

    public void setUid(java.lang.String str) {
        this.uid = str;
    }

    public java.lang.String toString() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("PoiInfo: ");
        stringBuffer.append("name = ");
        stringBuffer.append(this.name);
        stringBuffer.append("; uid = ");
        stringBuffer.append(this.uid);
        stringBuffer.append("; address = ");
        stringBuffer.append(this.address);
        stringBuffer.append("; province = ");
        stringBuffer.append(this.province);
        stringBuffer.append("; city = ");
        stringBuffer.append(this.city);
        stringBuffer.append("; area = ");
        stringBuffer.append(this.area);
        stringBuffer.append("; street_id = ");
        stringBuffer.append(this.street_id);
        stringBuffer.append("; phoneNum = ");
        stringBuffer.append(this.phoneNum);
        stringBuffer.append("; postCode = ");
        stringBuffer.append(this.postCode);
        stringBuffer.append("; detail = ");
        stringBuffer.append(this.detail);
        stringBuffer.append("; location = ");
        com.baidu.mapapi.model.LatLng latLng = this.location;
        if (latLng != null) {
            stringBuffer.append(latLng.toString());
        } else {
            stringBuffer.append("null");
        }
        stringBuffer.append("; hasCaterDetails = ");
        stringBuffer.append(this.hasCaterDetails);
        stringBuffer.append("; isPano = ");
        stringBuffer.append(this.isPano);
        stringBuffer.append("; tag = ");
        stringBuffer.append(this.tag);
        stringBuffer.append("; poiDetailInfo = ");
        com.baidu.mapapi.search.core.PoiDetailInfo poiDetailInfo = this.poiDetailInfo;
        if (poiDetailInfo != null) {
            stringBuffer.append(poiDetailInfo.toString());
        } else {
            stringBuffer.append("null");
        }
        stringBuffer.append("; direction = ");
        stringBuffer.append(this.direction);
        stringBuffer.append("; distance = ");
        stringBuffer.append(this.distance);
        if (this.parentPoiInfo != null) {
            stringBuffer.append("; parentPoiAddress = ");
            stringBuffer.append(this.parentPoiInfo.getParentPoiAddress());
            stringBuffer.append("; parentPoiDirection = ");
            stringBuffer.append(this.parentPoiInfo.getParentPoiDirection());
            stringBuffer.append("; parentPoiDistance = ");
            stringBuffer.append(this.parentPoiInfo.getParentPoiDistance());
            stringBuffer.append("; parentPoiName = ");
            stringBuffer.append(this.parentPoiInfo.getParentPoiName());
            stringBuffer.append("; parentPoiTag = ");
            stringBuffer.append(this.parentPoiInfo.getParentPoiTag());
            stringBuffer.append("; parentPoiUid = ");
            stringBuffer.append(this.parentPoiInfo.getParentPoiUid());
            stringBuffer.append("; parentPoiLocation = ");
            stringBuffer.append(this.parentPoiInfo.getParentPoiLocation());
        }
        return stringBuffer.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.uid);
        parcel.writeString(this.address);
        parcel.writeString(this.province);
        parcel.writeString(this.city);
        parcel.writeString(this.area);
        parcel.writeString(this.street_id);
        parcel.writeString(this.phoneNum);
        parcel.writeString(this.postCode);
        parcel.writeString(this.tag);
        parcel.writeValue(java.lang.Integer.valueOf(this.detail));
        parcel.writeValue(this.type);
        parcel.writeParcelable(this.location, 1);
        parcel.writeValue(java.lang.Boolean.valueOf(this.hasCaterDetails));
        parcel.writeValue(java.lang.Boolean.valueOf(this.isPano));
        parcel.writeParcelable(this.poiDetailInfo, 1);
        parcel.writeString(this.direction);
        parcel.writeInt(this.distance);
        parcel.writeParcelable(this.parentPoiInfo, 1);
    }
}
