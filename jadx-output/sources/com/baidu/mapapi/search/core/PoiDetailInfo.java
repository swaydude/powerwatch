package com.baidu.mapapi.search.core;

/* JADX INFO: loaded from: classes.dex */
public class PoiDetailInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.baidu.mapapi.search.core.PoiDetailInfo> CREATOR = new com.baidu.mapapi.search.core.f();
    private java.lang.String a;
    private com.baidu.mapapi.model.LatLng b;
    private java.lang.String c;
    public int checkinNum;
    public int commentNum;
    private java.lang.String d;
    public java.lang.String detailUrl;
    public int discountNum;
    public int distance;
    private java.lang.String e;
    public double environmentRating;
    private java.lang.String f;
    public double facilityRating;
    public int favoriteNum;
    private java.lang.String g;
    public int grouponNum;
    private java.lang.String h;
    public double hygieneRating;
    private java.lang.String i;
    public int imageNum;
    private int j;
    private java.util.List<com.baidu.mapapi.search.core.PoiChildrenInfo> k;
    public com.baidu.mapapi.model.LatLng naviLocation;
    public double overallRating;
    public double price;
    public double serviceRating;
    public java.lang.String shopHours;
    public java.lang.String tag;
    public double tasteRating;
    public double technologyRating;
    public java.lang.String type;

    public PoiDetailInfo() {
    }

    protected PoiDetailInfo(android.os.Parcel parcel) {
        this.a = parcel.readString();
        this.b = (com.baidu.mapapi.model.LatLng) parcel.readParcelable(com.baidu.mapapi.model.LatLng.class.getClassLoader());
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readString();
        this.i = parcel.readString();
        this.j = parcel.readInt();
        this.distance = parcel.readInt();
        this.type = parcel.readString();
        this.tag = parcel.readString();
        this.naviLocation = (com.baidu.mapapi.model.LatLng) parcel.readParcelable(com.baidu.mapapi.model.LatLng.class.getClassLoader());
        this.detailUrl = parcel.readString();
        this.price = parcel.readDouble();
        this.shopHours = parcel.readString();
        this.overallRating = parcel.readDouble();
        this.tasteRating = parcel.readDouble();
        this.serviceRating = parcel.readDouble();
        this.environmentRating = parcel.readDouble();
        this.facilityRating = parcel.readDouble();
        this.hygieneRating = parcel.readDouble();
        this.technologyRating = parcel.readDouble();
        this.imageNum = parcel.readInt();
        this.grouponNum = parcel.readInt();
        this.discountNum = parcel.readInt();
        this.commentNum = parcel.readInt();
        this.favoriteNum = parcel.readInt();
        this.checkinNum = parcel.readInt();
        this.k = parcel.createTypedArrayList(com.baidu.mapapi.search.core.PoiChildrenInfo.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String getAddress() {
        return this.c;
    }

    public java.lang.String getArea() {
        return this.f;
    }

    public int getCheckinNum() {
        return this.checkinNum;
    }

    public java.lang.String getCity() {
        return this.e;
    }

    public int getCommentNum() {
        return this.commentNum;
    }

    public int getDetail() {
        return this.j;
    }

    public java.lang.String getDetailUrl() {
        return this.detailUrl;
    }

    public int getDiscountNum() {
        return this.discountNum;
    }

    public int getDistance() {
        return this.distance;
    }

    public double getEnvironmentRating() {
        return this.environmentRating;
    }

    public double getFacilityRating() {
        return this.facilityRating;
    }

    public int getFavoriteNum() {
        return this.favoriteNum;
    }

    public int getGrouponNum() {
        return this.grouponNum;
    }

    public double getHygieneRating() {
        return this.hygieneRating;
    }

    public int getImageNum() {
        return this.imageNum;
    }

    public com.baidu.mapapi.model.LatLng getLocation() {
        return this.b;
    }

    public java.lang.String getName() {
        return this.a;
    }

    public com.baidu.mapapi.model.LatLng getNaviLocation() {
        return this.naviLocation;
    }

    public double getOverallRating() {
        return this.overallRating;
    }

    public java.util.List<com.baidu.mapapi.search.core.PoiChildrenInfo> getPoiChildrenInfoList() {
        return this.k;
    }

    public double getPrice() {
        return this.price;
    }

    public java.lang.String getProvince() {
        return this.d;
    }

    public double getServiceRating() {
        return this.serviceRating;
    }

    public java.lang.String getShopHours() {
        return this.shopHours;
    }

    public java.lang.String getStreetId() {
        return this.i;
    }

    public java.lang.String getTag() {
        return this.tag;
    }

    public double getTasteRating() {
        return this.tasteRating;
    }

    public double getTechnologyRating() {
        return this.technologyRating;
    }

    public java.lang.String getTelephone() {
        return this.g;
    }

    public java.lang.String getType() {
        return this.type;
    }

    public java.lang.String getUid() {
        return this.h;
    }

    public void setAddress(java.lang.String str) {
        this.c = str;
    }

    public void setArea(java.lang.String str) {
        this.f = str;
    }

    public void setCheckinNum(int i) {
        this.checkinNum = i;
    }

    public void setCity(java.lang.String str) {
        this.e = str;
    }

    public void setCommentNum(int i) {
        this.commentNum = i;
    }

    public void setDetail(java.lang.String str) {
        try {
            this.j = java.lang.Integer.parseInt(str);
        } catch (java.lang.NumberFormatException unused) {
            this.j = 0;
        }
    }

    public void setDetailUrl(java.lang.String str) {
        this.detailUrl = str;
    }

    public void setDiscountNum(int i) {
        this.discountNum = i;
    }

    public void setDistance(int i) {
        this.distance = i;
    }

    public void setEnvironmentRating(double d) {
        this.environmentRating = d;
    }

    public void setFacilityRating(double d) {
        this.facilityRating = d;
    }

    public void setFavoriteNum(int i) {
        this.favoriteNum = i;
    }

    public void setGrouponNum(int i) {
        this.grouponNum = i;
    }

    public void setHygieneRating(double d) {
        this.hygieneRating = d;
    }

    public void setImageNum(int i) {
        this.imageNum = i;
    }

    public void setLocation(com.baidu.mapapi.model.LatLng latLng) {
        this.b = latLng;
    }

    public void setName(java.lang.String str) {
        this.a = str;
    }

    public void setNaviLocation(com.baidu.mapapi.model.LatLng latLng) {
        this.naviLocation = latLng;
    }

    public void setOverallRating(double d) {
        this.overallRating = d;
    }

    public void setPoiChildrenInfoList(java.util.List<com.baidu.mapapi.search.core.PoiChildrenInfo> list) {
        this.k = list;
    }

    public void setPrice(double d) {
        this.price = d;
    }

    public void setProvince(java.lang.String str) {
        this.d = str;
    }

    public void setServiceRating(double d) {
        this.serviceRating = d;
    }

    public void setShopHours(java.lang.String str) {
        this.shopHours = str;
    }

    public void setStreetId(java.lang.String str) {
        this.i = str;
    }

    public void setTag(java.lang.String str) {
        this.tag = str;
    }

    public void setTasteRating(double d) {
        this.tasteRating = d;
    }

    public void setTechnologyRating(double d) {
        this.technologyRating = d;
    }

    public void setTelephone(java.lang.String str) {
        this.g = str;
    }

    public void setType(java.lang.String str) {
        this.type = str;
    }

    public void setUid(java.lang.String str) {
        this.h = str;
    }

    public java.lang.String toString() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("PoiDetailInfo: ");
        stringBuffer.append("name = ");
        stringBuffer.append(this.a);
        stringBuffer.append("; location = ");
        com.baidu.mapapi.model.LatLng latLng = this.b;
        if (latLng != null) {
            stringBuffer.append(latLng.toString());
        } else {
            stringBuffer.append("null");
        }
        stringBuffer.append("; address = ");
        stringBuffer.append(this.c);
        stringBuffer.append("; province = ");
        stringBuffer.append(this.d);
        stringBuffer.append("; city = ");
        stringBuffer.append(this.e);
        stringBuffer.append("; area = ");
        stringBuffer.append(this.f);
        stringBuffer.append("; telephone = ");
        stringBuffer.append(this.g);
        stringBuffer.append("; uid = ");
        stringBuffer.append(this.h);
        stringBuffer.append("; detail = ");
        stringBuffer.append(this.j);
        stringBuffer.append("; distance = ");
        stringBuffer.append(this.distance);
        stringBuffer.append("; type = ");
        stringBuffer.append(this.type);
        stringBuffer.append("; tag = ");
        stringBuffer.append(this.tag);
        stringBuffer.append("; naviLocation = ");
        com.baidu.mapapi.model.LatLng latLng2 = this.naviLocation;
        if (latLng2 != null) {
            stringBuffer.append(latLng2.toString());
        } else {
            stringBuffer.append("null");
        }
        stringBuffer.append("; detailUrl = ");
        stringBuffer.append(this.detailUrl);
        stringBuffer.append("; price = ");
        stringBuffer.append(this.price);
        stringBuffer.append("; shopHours = ");
        stringBuffer.append(this.shopHours);
        stringBuffer.append("; overallRating = ");
        stringBuffer.append(this.overallRating);
        stringBuffer.append("; tasteRating = ");
        stringBuffer.append(this.tasteRating);
        stringBuffer.append("; serviceRating = ");
        stringBuffer.append(this.serviceRating);
        stringBuffer.append("; environmentRating = ");
        stringBuffer.append(this.environmentRating);
        stringBuffer.append("; facilityRating = ");
        stringBuffer.append(this.facilityRating);
        stringBuffer.append("; hygieneRating = ");
        stringBuffer.append(this.hygieneRating);
        stringBuffer.append("; technologyRating = ");
        stringBuffer.append(this.technologyRating);
        stringBuffer.append("; imageNum = ");
        stringBuffer.append(this.imageNum);
        stringBuffer.append("; grouponNum = ");
        stringBuffer.append(this.grouponNum);
        stringBuffer.append("; discountNum = ");
        stringBuffer.append(this.discountNum);
        stringBuffer.append("; commentNum = ");
        stringBuffer.append(this.commentNum);
        stringBuffer.append("; favoriteNum = ");
        stringBuffer.append(this.favoriteNum);
        stringBuffer.append("; checkinNum = ");
        stringBuffer.append(this.checkinNum);
        java.util.List<com.baidu.mapapi.search.core.PoiChildrenInfo> list = this.k;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < this.k.size(); i++) {
                stringBuffer.append("; The ");
                stringBuffer.append(i);
                stringBuffer.append(" poiChildrenInfo is: ");
                com.baidu.mapapi.search.core.PoiChildrenInfo poiChildrenInfo = this.k.get(i);
                if (poiChildrenInfo != null) {
                    stringBuffer.append(poiChildrenInfo.toString());
                } else {
                    stringBuffer.append("null");
                }
            }
        }
        return stringBuffer.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeInt(this.j);
        parcel.writeInt(this.distance);
        parcel.writeString(this.type);
        parcel.writeString(this.tag);
        parcel.writeParcelable(this.naviLocation, i);
        parcel.writeString(this.detailUrl);
        parcel.writeDouble(this.price);
        parcel.writeString(this.shopHours);
        parcel.writeDouble(this.overallRating);
        parcel.writeDouble(this.tasteRating);
        parcel.writeDouble(this.serviceRating);
        parcel.writeDouble(this.environmentRating);
        parcel.writeDouble(this.facilityRating);
        parcel.writeDouble(this.hygieneRating);
        parcel.writeDouble(this.technologyRating);
        parcel.writeInt(this.imageNum);
        parcel.writeInt(this.grouponNum);
        parcel.writeInt(this.discountNum);
        parcel.writeInt(this.commentNum);
        parcel.writeInt(this.favoriteNum);
        parcel.writeInt(this.checkinNum);
        parcel.writeTypedList(this.k);
    }
}
