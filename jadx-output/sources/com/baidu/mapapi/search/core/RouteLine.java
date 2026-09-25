package com.baidu.mapapi.search.core;

/* JADX INFO: loaded from: classes.dex */
public class RouteLine<T extends com.baidu.mapapi.search.core.RouteStep> implements android.os.Parcelable {
    com.baidu.mapapi.search.core.RouteLine.TYPE a;
    private com.baidu.mapapi.search.core.RouteNode b;
    private com.baidu.mapapi.search.core.RouteNode c;
    private java.lang.String d;
    private java.util.List<T> e;
    private int f;
    private int g;

    protected enum TYPE {
        DRIVESTEP(0),
        TRANSITSTEP(1),
        WALKSTEP(2),
        BIKINGSTEP(3);

        private int a;

        TYPE(int i) {
            this.a = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int a() {
            return this.a;
        }
    }

    protected RouteLine() {
    }

    protected RouteLine(android.os.Parcel parcel) {
        java.lang.Object obj;
        int i = parcel.readInt();
        this.b = (com.baidu.mapapi.search.core.RouteNode) parcel.readValue(com.baidu.mapapi.search.core.RouteNode.class.getClassLoader());
        this.c = (com.baidu.mapapi.search.core.RouteNode) parcel.readValue(com.baidu.mapapi.search.core.RouteNode.class.getClassLoader());
        this.d = parcel.readString();
        if (i == 0) {
            obj = com.baidu.mapapi.search.route.DrivingRouteLine.DrivingStep.CREATOR;
        } else if (i == 1) {
            obj = com.baidu.mapapi.search.route.TransitRouteLine.TransitStep.CREATOR;
        } else {
            if (i != 2) {
                if (i == 3) {
                    obj = com.baidu.mapapi.search.route.BikingRouteLine.BikingStep.CREATOR;
                }
                this.f = parcel.readInt();
                this.g = parcel.readInt();
            }
            obj = com.baidu.mapapi.search.route.WalkingRouteLine.WalkingStep.CREATOR;
        }
        this.e = parcel.createTypedArrayList(obj);
        this.f = parcel.readInt();
        this.g = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.util.List<T> getAllStep() {
        return this.e;
    }

    public int getDistance() {
        return this.f;
    }

    public int getDuration() {
        return this.g;
    }

    public com.baidu.mapapi.search.core.RouteNode getStarting() {
        return this.b;
    }

    public com.baidu.mapapi.search.core.RouteNode getTerminal() {
        return this.c;
    }

    public java.lang.String getTitle() {
        return this.d;
    }

    protected com.baidu.mapapi.search.core.RouteLine.TYPE getType() {
        return this.a;
    }

    public void setDistance(int i) {
        this.f = i;
    }

    public void setDuration(int i) {
        this.g = i;
    }

    public void setStarting(com.baidu.mapapi.search.core.RouteNode routeNode) {
        this.b = routeNode;
    }

    public void setSteps(java.util.List<T> list) {
        this.e = list;
    }

    public void setTerminal(com.baidu.mapapi.search.core.RouteNode routeNode) {
        this.c = routeNode;
    }

    public void setTitle(java.lang.String str) {
        this.d = str;
    }

    protected void setType(com.baidu.mapapi.search.core.RouteLine.TYPE type) {
        this.a = type;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        com.baidu.mapapi.search.core.RouteLine.TYPE type = this.a;
        parcel.writeInt(type != null ? type.a() : 10);
        parcel.writeValue(this.b);
        parcel.writeValue(this.c);
        parcel.writeString(this.d);
        if (this.a != null) {
            parcel.writeTypedList(this.e);
        }
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
    }
}
