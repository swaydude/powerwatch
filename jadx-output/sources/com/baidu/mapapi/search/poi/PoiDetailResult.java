package com.baidu.mapapi.search.poi;

/* JADX INFO: loaded from: classes.dex */
public class PoiDetailResult extends com.baidu.mapapi.search.core.SearchResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.baidu.mapapi.search.poi.PoiDetailResult> CREATOR = new com.baidu.mapapi.search.poi.a();
    public java.lang.String address;
    public int checkinNum;
    public int commentNum;
    public java.lang.String detailUrl;
    public int discountNum;
    public double environmentRating;
    public double facilityRating;
    public int favoriteNum;
    public int grouponNum;
    public double hygieneRating;
    public int imageNum;
    public com.baidu.mapapi.model.LatLng location;
    public java.lang.String name;
    public double overallRating;
    public double price;
    public double serviceRating;
    public java.lang.String shopHours;
    public java.lang.String tag;
    public double tasteRating;
    public double technologyRating;
    public java.lang.String telephone;
    public java.lang.String type;
    public java.lang.String uid;

    public PoiDetailResult() {
    }

    protected PoiDetailResult(android.os.Parcel parcel) {
        super(parcel);
        this.name = parcel.readString();
        this.location = (com.baidu.mapapi.model.LatLng) parcel.readParcelable(com.baidu.mapapi.model.LatLng.class.getClassLoader());
        this.address = parcel.readString();
        this.telephone = parcel.readString();
        this.uid = parcel.readString();
        this.tag = parcel.readString();
        this.detailUrl = parcel.readString();
        this.type = parcel.readString();
        this.price = parcel.readDouble();
        this.overallRating = parcel.readDouble();
        this.tasteRating = parcel.readDouble();
        this.serviceRating = parcel.readDouble();
        this.environmentRating = parcel.readDouble();
        this.facilityRating = parcel.readDouble();
        this.hygieneRating = parcel.readDouble();
        this.technologyRating = parcel.readDouble();
        this.imageNum = parcel.readInt();
        this.grouponNum = parcel.readInt();
        this.commentNum = parcel.readInt();
        this.discountNum = parcel.readInt();
        this.favoriteNum = parcel.readInt();
        this.checkinNum = parcel.readInt();
        this.shopHours = parcel.readString();
    }

    public PoiDetailResult(com.baidu.mapapi.search.core.SearchResult.ERRORNO errorno) {
        super(errorno);
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String getAddress() {
        return this.address;
    }

    public int getCheckinNum() {
        return this.checkinNum;
    }

    public int getCommentNum() {
        return this.commentNum;
    }

    public java.lang.String getDetailUrl() {
        return this.detailUrl;
    }

    public int getDiscountNum() {
        return this.discountNum;
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
        return this.location;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public double getOverallRating() {
        return this.overallRating;
    }

    public double getPrice() {
        return this.price;
    }

    public double getServiceRating() {
        return this.serviceRating;
    }

    public java.lang.String getShopHours() {
        return this.shopHours;
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
        return this.telephone;
    }

    public java.lang.String getType() {
        return this.type;
    }

    public java.lang.String getUid() {
        return this.uid;
    }

    public void setAddress(java.lang.String str) {
        this.address = str;
    }

    public void setCheckinNum(int i) {
        this.checkinNum = i;
    }

    public void setCommentNum(int i) {
        this.commentNum = i;
    }

    public void setDetailUrl(java.lang.String str) {
        this.detailUrl = str;
    }

    public void setDiscountNum(int i) {
        this.discountNum = i;
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
        this.location = latLng;
    }

    public void setName(java.lang.String str) {
        this.name = str;
    }

    public void setOverallRating(double d) {
        this.overallRating = d;
    }

    public void setPrice(double d) {
        this.price = d;
    }

    public void setServiceRating(double d) {
        this.serviceRating = d;
    }

    public void setShopHours(java.lang.String str) {
        this.shopHours = str;
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
        this.telephone = str;
    }

    public void setType(java.lang.String str) {
        this.type = str;
    }

    public void setUid(java.lang.String str) {
        this.uid = str;
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.name);
        parcel.writeParcelable(this.location, i);
        parcel.writeString(this.address);
        parcel.writeString(this.telephone);
        parcel.writeString(this.uid);
        parcel.writeString(this.tag);
        parcel.writeString(this.detailUrl);
        parcel.writeString(this.type);
        parcel.writeDouble(this.price);
        parcel.writeDouble(this.overallRating);
        parcel.writeDouble(this.tasteRating);
        parcel.writeDouble(this.serviceRating);
        parcel.writeDouble(this.environmentRating);
        parcel.writeDouble(this.facilityRating);
        parcel.writeDouble(this.hygieneRating);
        parcel.writeDouble(this.technologyRating);
        parcel.writeInt(this.imageNum);
        parcel.writeInt(this.grouponNum);
        parcel.writeInt(this.commentNum);
        parcel.writeInt(this.discountNum);
        parcel.writeInt(this.favoriteNum);
        parcel.writeInt(this.checkinNum);
        parcel.writeString(this.shopHours);
    }
}
