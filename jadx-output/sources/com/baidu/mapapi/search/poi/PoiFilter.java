package com.baidu.mapapi.search.poi;

/* JADX INFO: loaded from: classes.dex */
public final class PoiFilter implements android.os.Parcelable {
    private java.lang.String a;
    private java.lang.String b;
    private java.lang.String c;
    private java.lang.String d;
    private java.lang.String e;
    private static java.util.Map<com.baidu.mapapi.search.poi.PoiFilter.SortName, java.lang.String> f = new java.util.HashMap();
    public static final android.os.Parcelable.Creator<com.baidu.mapapi.search.poi.PoiFilter> CREATOR = new com.baidu.mapapi.search.poi.c();

    public static final class Builder {
        private java.lang.String a;
        private java.lang.String b;
        private java.lang.String c;
        private java.lang.String d;
        private java.lang.String e;

        public Builder() {
            com.baidu.mapapi.search.poi.PoiFilter.f.put(com.baidu.mapapi.search.poi.PoiFilter.SortName.HotelSortName.DEFAULT, "default");
            com.baidu.mapapi.search.poi.PoiFilter.f.put(com.baidu.mapapi.search.poi.PoiFilter.SortName.HotelSortName.HOTEL_LEVEL, com.google.firebase.analytics.FirebaseAnalytics.Param.LEVEL);
            com.baidu.mapapi.search.poi.PoiFilter.f.put(com.baidu.mapapi.search.poi.PoiFilter.SortName.HotelSortName.HOTEL_PRICE, com.google.firebase.analytics.FirebaseAnalytics.Param.PRICE);
            com.baidu.mapapi.search.poi.PoiFilter.f.put(com.baidu.mapapi.search.poi.PoiFilter.SortName.HotelSortName.HOTEL_DISTANCE, "distance");
            com.baidu.mapapi.search.poi.PoiFilter.f.put(com.baidu.mapapi.search.poi.PoiFilter.SortName.HotelSortName.HOTEL_HEALTH_SCORE, "health_score");
            com.baidu.mapapi.search.poi.PoiFilter.f.put(com.baidu.mapapi.search.poi.PoiFilter.SortName.HotelSortName.HOTEL_TOTAL_SCORE, "total_score");
            com.baidu.mapapi.search.poi.PoiFilter.f.put(com.baidu.mapapi.search.poi.PoiFilter.SortName.CaterSortName.DEFAULT, "default");
            com.baidu.mapapi.search.poi.PoiFilter.f.put(com.baidu.mapapi.search.poi.PoiFilter.SortName.CaterSortName.CATER_DISTANCE, "distance");
            com.baidu.mapapi.search.poi.PoiFilter.f.put(com.baidu.mapapi.search.poi.PoiFilter.SortName.CaterSortName.CATER_PRICE, com.google.firebase.analytics.FirebaseAnalytics.Param.PRICE);
            com.baidu.mapapi.search.poi.PoiFilter.f.put(com.baidu.mapapi.search.poi.PoiFilter.SortName.CaterSortName.CATER_OVERALL_RATING, "overall_rating");
            com.baidu.mapapi.search.poi.PoiFilter.f.put(com.baidu.mapapi.search.poi.PoiFilter.SortName.CaterSortName.CATER_SERVICE_RATING, "service_rating");
            com.baidu.mapapi.search.poi.PoiFilter.f.put(com.baidu.mapapi.search.poi.PoiFilter.SortName.CaterSortName.CATER_TASTE_RATING, "taste_rating");
            com.baidu.mapapi.search.poi.PoiFilter.f.put(com.baidu.mapapi.search.poi.PoiFilter.SortName.LifeSortName.DEFAULT, "default");
            com.baidu.mapapi.search.poi.PoiFilter.f.put(com.baidu.mapapi.search.poi.PoiFilter.SortName.LifeSortName.PRICE, com.google.firebase.analytics.FirebaseAnalytics.Param.PRICE);
            com.baidu.mapapi.search.poi.PoiFilter.f.put(com.baidu.mapapi.search.poi.PoiFilter.SortName.LifeSortName.LIFE_COMMENT_RATING, "comment_num");
            com.baidu.mapapi.search.poi.PoiFilter.f.put(com.baidu.mapapi.search.poi.PoiFilter.SortName.LifeSortName.LIFE_OVERALL_RATING, "overall_rating");
            com.baidu.mapapi.search.poi.PoiFilter.f.put(com.baidu.mapapi.search.poi.PoiFilter.SortName.LifeSortName.DISTANCE, "distance");
        }

        public com.baidu.mapapi.search.poi.PoiFilter build() {
            return new com.baidu.mapapi.search.poi.PoiFilter(this.a, this.b, this.c, this.e, this.d);
        }

        public com.baidu.mapapi.search.poi.PoiFilter.Builder industryType(com.baidu.mapapi.search.poi.PoiFilter.IndustryType industryType) {
            java.lang.String str;
            int i = com.baidu.mapapi.search.poi.d.a[industryType.ordinal()];
            if (i == 1) {
                str = "hotel";
            } else if (i != 2) {
                str = i != 3 ? "" : "life";
            } else {
                str = "cater";
            }
            this.a = str;
            return this;
        }

        public com.baidu.mapapi.search.poi.PoiFilter.Builder isDiscount(boolean z) {
            this.e = z ? "1" : "0";
            return this;
        }

        public com.baidu.mapapi.search.poi.PoiFilter.Builder isGroupon(boolean z) {
            this.d = z ? "1" : "0";
            return this;
        }

        public com.baidu.mapapi.search.poi.PoiFilter.Builder sortName(com.baidu.mapapi.search.poi.PoiFilter.SortName sortName) {
            if (!android.text.TextUtils.isEmpty(this.a) && sortName != null) {
                this.b = (java.lang.String) com.baidu.mapapi.search.poi.PoiFilter.f.get(sortName);
            }
            return this;
        }

        public com.baidu.mapapi.search.poi.PoiFilter.Builder sortRule(int i) {
            this.c = i + "";
            return this;
        }
    }

    public enum IndustryType {
        HOTEL,
        CATER,
        LIFE
    }

    public interface SortName {

        public enum CaterSortName implements com.baidu.mapapi.search.poi.PoiFilter.SortName {
            DEFAULT,
            CATER_PRICE,
            CATER_DISTANCE,
            CATER_TASTE_RATING,
            CATER_OVERALL_RATING,
            CATER_SERVICE_RATING
        }

        public enum HotelSortName implements com.baidu.mapapi.search.poi.PoiFilter.SortName {
            DEFAULT,
            HOTEL_PRICE,
            HOTEL_DISTANCE,
            HOTEL_TOTAL_SCORE,
            HOTEL_LEVEL,
            HOTEL_HEALTH_SCORE
        }

        public enum LifeSortName implements com.baidu.mapapi.search.poi.PoiFilter.SortName {
            DEFAULT,
            PRICE,
            DISTANCE,
            LIFE_OVERALL_RATING,
            LIFE_COMMENT_RATING
        }
    }

    protected PoiFilter(android.os.Parcel parcel) {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.e = parcel.readString();
        this.d = parcel.readString();
    }

    PoiFilter(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.e = str4;
        this.d = str5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (!android.text.TextUtils.isEmpty(this.a)) {
            sb.append("industry_type:");
            sb.append(this.a);
            sb.append("|");
        }
        if (!android.text.TextUtils.isEmpty(this.b)) {
            sb.append("sort_name:");
            sb.append(this.b);
            sb.append("|");
        }
        if (!android.text.TextUtils.isEmpty(this.c)) {
            sb.append("sort_rule:");
            sb.append(this.c);
            sb.append("|");
        }
        if (!android.text.TextUtils.isEmpty(this.e)) {
            sb.append("discount:");
            sb.append(this.e);
            sb.append("|");
        }
        if (!android.text.TextUtils.isEmpty(this.d)) {
            sb.append("groupon:");
            sb.append(this.d);
            sb.append("|");
        }
        if (!android.text.TextUtils.isEmpty(sb.toString())) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.e);
        parcel.writeString(this.d);
    }
}
