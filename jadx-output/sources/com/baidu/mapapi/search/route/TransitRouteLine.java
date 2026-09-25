package com.baidu.mapapi.search.route;

/* JADX INFO: loaded from: classes.dex */
public final class TransitRouteLine extends com.baidu.mapapi.search.core.RouteLine<com.baidu.mapapi.search.route.TransitRouteLine.TransitStep> implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.baidu.mapapi.search.route.TransitRouteLine> CREATOR = new com.baidu.mapapi.search.route.o();
    private com.baidu.mapapi.search.core.TaxiInfo b;

    public static class TransitStep extends com.baidu.mapapi.search.core.RouteStep implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.baidu.mapapi.search.route.TransitRouteLine.TransitStep> CREATOR = new com.baidu.mapapi.search.route.p();
        private com.baidu.mapapi.search.core.VehicleInfo d;
        private com.baidu.mapapi.search.core.RouteNode e;
        private com.baidu.mapapi.search.core.RouteNode f;
        private com.baidu.mapapi.search.route.TransitRouteLine.TransitStep.TransitRouteStepType g;
        private java.lang.String h;
        private java.lang.String i;

        public enum TransitRouteStepType {
            BUSLINE,
            SUBWAY,
            WAKLING
        }

        public TransitStep() {
        }

        protected TransitStep(android.os.Parcel parcel) {
            super(parcel);
            this.d = (com.baidu.mapapi.search.core.VehicleInfo) parcel.readParcelable(com.baidu.mapapi.search.core.VehicleInfo.class.getClassLoader());
            this.e = (com.baidu.mapapi.search.core.RouteNode) parcel.readParcelable(com.baidu.mapapi.search.core.RouteNode.class.getClassLoader());
            this.f = (com.baidu.mapapi.search.core.RouteNode) parcel.readParcelable(com.baidu.mapapi.search.core.RouteNode.class.getClassLoader());
            int i = parcel.readInt();
            this.g = i == -1 ? null : com.baidu.mapapi.search.route.TransitRouteLine.TransitStep.TransitRouteStepType.values()[i];
            this.h = parcel.readString();
            this.i = parcel.readString();
        }

        @Override // com.baidu.mapapi.search.core.RouteStep, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public com.baidu.mapapi.search.core.RouteNode getEntrance() {
            return this.e;
        }

        public com.baidu.mapapi.search.core.RouteNode getExit() {
            return this.f;
        }

        public java.lang.String getInstructions() {
            return this.h;
        }

        public com.baidu.mapapi.search.route.TransitRouteLine.TransitStep.TransitRouteStepType getStepType() {
            return this.g;
        }

        public com.baidu.mapapi.search.core.VehicleInfo getVehicleInfo() {
            return this.d;
        }

        @Override // com.baidu.mapapi.search.core.RouteStep
        public java.util.List<com.baidu.mapapi.model.LatLng> getWayPoints() {
            if (this.mWayPoints == null) {
                this.mWayPoints = com.baidu.mapapi.model.CoordUtil.decodeLocationList(this.i);
            }
            return this.mWayPoints;
        }

        public void setEntrace(com.baidu.mapapi.search.core.RouteNode routeNode) {
            this.e = routeNode;
        }

        public void setExit(com.baidu.mapapi.search.core.RouteNode routeNode) {
            this.f = routeNode;
        }

        public void setInstructions(java.lang.String str) {
            this.h = str;
        }

        public void setPathString(java.lang.String str) {
            this.i = str;
        }

        public void setStepType(com.baidu.mapapi.search.route.TransitRouteLine.TransitStep.TransitRouteStepType transitRouteStepType) {
            this.g = transitRouteStepType;
        }

        public void setVehicleInfo(com.baidu.mapapi.search.core.VehicleInfo vehicleInfo) {
            this.d = vehicleInfo;
        }

        @Override // com.baidu.mapapi.search.core.RouteStep, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.d, 1);
            parcel.writeParcelable(this.e, 1);
            parcel.writeParcelable(this.f, 1);
            com.baidu.mapapi.search.route.TransitRouteLine.TransitStep.TransitRouteStepType transitRouteStepType = this.g;
            parcel.writeInt(transitRouteStepType == null ? -1 : transitRouteStepType.ordinal());
            parcel.writeString(this.h);
            parcel.writeString(this.i);
        }
    }

    public TransitRouteLine() {
    }

    protected TransitRouteLine(android.os.Parcel parcel) {
        super(parcel);
        this.b = (com.baidu.mapapi.search.core.TaxiInfo) parcel.readParcelable(com.baidu.mapapi.search.core.TaxiInfo.class.getClassLoader());
    }

    @Override // com.baidu.mapapi.search.core.RouteLine, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @java.lang.Deprecated
    public com.baidu.mapapi.search.core.TaxiInfo getTaxitInfo() {
        return this.b;
    }

    public void setTaxitInfo(com.baidu.mapapi.search.core.TaxiInfo taxiInfo) {
        this.b = taxiInfo;
    }

    @Override // com.baidu.mapapi.search.core.RouteLine, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        super.setType(com.baidu.mapapi.search.core.RouteLine.TYPE.TRANSITSTEP);
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.b, 1);
    }
}
