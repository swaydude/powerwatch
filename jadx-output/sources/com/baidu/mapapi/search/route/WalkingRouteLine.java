package com.baidu.mapapi.search.route;

/* JADX INFO: loaded from: classes.dex */
public class WalkingRouteLine extends com.baidu.mapapi.search.core.RouteLine<com.baidu.mapapi.search.route.WalkingRouteLine.WalkingStep> implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.baidu.mapapi.search.route.WalkingRouteLine> CREATOR = new com.baidu.mapapi.search.route.r();

    public static class WalkingStep extends com.baidu.mapapi.search.core.RouteStep implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.baidu.mapapi.search.route.WalkingRouteLine.WalkingStep> CREATOR = new com.baidu.mapapi.search.route.s();
        private int d;
        private com.baidu.mapapi.search.core.RouteNode e;
        private com.baidu.mapapi.search.core.RouteNode f;
        private java.lang.String g;
        private java.lang.String h;
        private java.lang.String i;
        private java.lang.String j;

        public WalkingStep() {
        }

        protected WalkingStep(android.os.Parcel parcel) {
            super(parcel);
            this.d = parcel.readInt();
            this.e = (com.baidu.mapapi.search.core.RouteNode) parcel.readParcelable(com.baidu.mapapi.search.core.RouteNode.class.getClassLoader());
            this.f = (com.baidu.mapapi.search.core.RouteNode) parcel.readParcelable(com.baidu.mapapi.search.core.RouteNode.class.getClassLoader());
            this.g = parcel.readString();
            this.h = parcel.readString();
            this.i = parcel.readString();
            this.j = parcel.readString();
        }

        @Override // com.baidu.mapapi.search.core.RouteStep, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public int getDirection() {
            return this.d;
        }

        public com.baidu.mapapi.search.core.RouteNode getEntrance() {
            return this.e;
        }

        public java.lang.String getEntranceInstructions() {
            return this.h;
        }

        public com.baidu.mapapi.search.core.RouteNode getExit() {
            return this.f;
        }

        public java.lang.String getExitInstructions() {
            return this.i;
        }

        public java.lang.String getInstructions() {
            return this.j;
        }

        @Override // com.baidu.mapapi.search.core.RouteStep
        public java.util.List<com.baidu.mapapi.model.LatLng> getWayPoints() {
            if (this.mWayPoints == null) {
                this.mWayPoints = com.baidu.mapapi.model.CoordUtil.decodeLocationList(this.g);
            }
            return this.mWayPoints;
        }

        public void setDirection(int i) {
            this.d = i;
        }

        public void setEntrance(com.baidu.mapapi.search.core.RouteNode routeNode) {
            this.e = routeNode;
        }

        public void setEntranceInstructions(java.lang.String str) {
            this.h = str;
        }

        public void setExit(com.baidu.mapapi.search.core.RouteNode routeNode) {
            this.f = routeNode;
        }

        public void setExitInstructions(java.lang.String str) {
            this.i = str;
        }

        public void setInstructions(java.lang.String str) {
            this.j = str;
        }

        public void setPathString(java.lang.String str) {
            this.g = str;
        }

        @Override // com.baidu.mapapi.search.core.RouteStep, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, 1);
            parcel.writeInt(this.d);
            parcel.writeParcelable(this.e, 1);
            parcel.writeParcelable(this.f, 1);
            parcel.writeString(this.g);
            parcel.writeString(this.h);
            parcel.writeString(this.i);
            parcel.writeString(this.j);
        }
    }

    public WalkingRouteLine() {
    }

    protected WalkingRouteLine(android.os.Parcel parcel) {
        super(parcel);
    }

    @Override // com.baidu.mapapi.search.core.RouteLine, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.baidu.mapapi.search.core.RouteLine
    public java.util.List<com.baidu.mapapi.search.route.WalkingRouteLine.WalkingStep> getAllStep() {
        return super.getAllStep();
    }

    @Override // com.baidu.mapapi.search.core.RouteLine, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        super.setType(com.baidu.mapapi.search.core.RouteLine.TYPE.WALKSTEP);
        super.writeToParcel(parcel, 1);
    }
}
