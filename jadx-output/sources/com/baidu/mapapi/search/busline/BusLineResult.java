package com.baidu.mapapi.search.busline;

/* JADX INFO: loaded from: classes.dex */
public class BusLineResult extends com.baidu.mapapi.search.core.SearchResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.baidu.mapapi.search.busline.BusLineResult> CREATOR = new com.baidu.mapapi.search.busline.a();
    private java.lang.String a;
    private java.lang.String b;
    private boolean c;
    private java.util.Date d;
    private java.util.Date e;
    private java.lang.String f;
    private java.util.List<com.baidu.mapapi.search.busline.BusLineResult.BusStation> g;
    private java.util.List<com.baidu.mapapi.search.busline.BusLineResult.BusStep> h;
    private float i;
    private float j;
    private java.lang.String k;

    public static class BusStation extends com.baidu.mapapi.search.core.RouteNode {
    }

    public static class BusStep extends com.baidu.mapapi.search.core.RouteStep {
    }

    public BusLineResult() {
        this.a = null;
        this.b = null;
        this.g = null;
        this.h = null;
        this.k = null;
    }

    BusLineResult(android.os.Parcel parcel) {
        this.a = null;
        this.b = null;
        this.g = null;
        this.h = null;
        this.k = null;
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = ((java.lang.Boolean) parcel.readValue(java.lang.Boolean.class.getClassLoader())).booleanValue();
        this.d = (java.util.Date) parcel.readValue(java.util.Date.class.getClassLoader());
        this.e = (java.util.Date) parcel.readValue(java.util.Date.class.getClassLoader());
        this.f = parcel.readString();
        this.g = parcel.readArrayList(com.baidu.mapapi.search.busline.BusLineResult.BusStation.class.getClassLoader());
        this.h = parcel.readArrayList(com.baidu.mapapi.search.core.RouteStep.class.getClassLoader());
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public float getBasePrice() {
        return this.i;
    }

    public java.lang.String getBusCompany() {
        return this.a;
    }

    public java.lang.String getBusLineName() {
        return this.b;
    }

    public java.util.Date getEndTime() {
        return this.e;
    }

    public java.lang.String getLineDirection() {
        return this.k;
    }

    public float getMaxPrice() {
        return this.j;
    }

    public java.util.Date getStartTime() {
        return this.d;
    }

    public java.util.List<com.baidu.mapapi.search.busline.BusLineResult.BusStation> getStations() {
        return this.g;
    }

    public java.util.List<com.baidu.mapapi.search.busline.BusLineResult.BusStep> getSteps() {
        return this.h;
    }

    public java.lang.String getUid() {
        return this.f;
    }

    public boolean isMonthTicket() {
        return this.c;
    }

    public void setBasePrice(float f) {
        this.i = f;
    }

    public void setBusLineName(java.lang.String str) {
        this.b = str;
    }

    public void setEndTime(java.util.Date date) {
        this.e = date;
    }

    public void setLineDirection(java.lang.String str) {
        this.k = str;
    }

    public void setMaxPrice(float f) {
        this.j = f;
    }

    public void setMonthTicket(boolean z) {
        this.c = z;
    }

    public void setStartTime(java.util.Date date) {
        this.d = date;
    }

    public void setStations(java.util.List<com.baidu.mapapi.search.busline.BusLineResult.BusStation> list) {
        this.g = list;
    }

    public void setSteps(java.util.List<com.baidu.mapapi.search.busline.BusLineResult.BusStep> list) {
        this.h = list;
    }

    public void setUid(java.lang.String str) {
        this.f = str;
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeValue(java.lang.Boolean.valueOf(this.c));
        parcel.writeValue(this.d);
        parcel.writeValue(this.e);
        parcel.writeString(this.f);
        parcel.writeList(this.g);
        parcel.writeList(this.h);
    }
}
