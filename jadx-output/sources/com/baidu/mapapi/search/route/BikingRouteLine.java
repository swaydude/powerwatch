package com.baidu.mapapi.search.route;

/* JADX INFO: loaded from: classes.dex */
public class BikingRouteLine extends com.baidu.mapapi.search.core.RouteLine<com.baidu.mapapi.search.route.BikingRouteLine.BikingStep> implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.baidu.mapapi.search.route.BikingRouteLine> CREATOR = new com.baidu.mapapi.search.route.a();

    public static class BikingStep extends com.baidu.mapapi.search.core.RouteStep implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.baidu.mapapi.search.route.BikingRouteLine.BikingStep> CREATOR = new com.baidu.mapapi.search.route.b();
        private int d;
        private com.baidu.mapapi.search.core.RouteNode e;
        private com.baidu.mapapi.search.core.RouteNode f;
        private java.lang.String g;
        private java.lang.String h;
        private java.lang.String i;
        private java.lang.String j;
        private java.lang.String k;

        public BikingStep() {
        }

        protected BikingStep(android.os.Parcel parcel) {
            super(parcel);
            this.d = parcel.readInt();
            this.e = (com.baidu.mapapi.search.core.RouteNode) parcel.readParcelable(com.baidu.mapapi.search.core.RouteNode.class.getClassLoader());
            this.f = (com.baidu.mapapi.search.core.RouteNode) parcel.readParcelable(com.baidu.mapapi.search.core.RouteNode.class.getClassLoader());
            this.g = parcel.readString();
            this.h = parcel.readString();
            this.i = parcel.readString();
            this.j = parcel.readString();
            this.k = parcel.readString();
        }

        private java.util.List<com.baidu.mapapi.model.LatLng> a(java.lang.String str) {
            if (str != null && str.length() != 0) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.String[] strArrSplit = str.split(";");
                if (strArrSplit != null && strArrSplit.length != 0) {
                    for (java.lang.String str2 : strArrSplit) {
                        java.lang.String[] strArrSplit2 = str2.split(",");
                        if (strArrSplit2 != null && strArrSplit2.length >= 2) {
                            com.baidu.mapapi.model.LatLng latLng = new com.baidu.mapapi.model.LatLng(java.lang.Double.valueOf(strArrSplit2[1]).doubleValue(), java.lang.Double.valueOf(strArrSplit2[0]).doubleValue());
                            if (com.baidu.mapapi.SDKInitializer.getCoordType() == com.baidu.mapapi.CoordType.GCJ02) {
                                latLng = com.baidu.mapsdkplatform.comapi.util.CoordTrans.baiduToGcj(latLng);
                            }
                            arrayList.add(latLng);
                        }
                    }
                    return arrayList;
                }
            }
            return null;
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

        public java.lang.String getTurnType() {
            return this.k;
        }

        @Override // com.baidu.mapapi.search.core.RouteStep
        public java.util.List<com.baidu.mapapi.model.LatLng> getWayPoints() {
            if (this.mWayPoints == null) {
                this.mWayPoints = a(this.g);
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

        public void setTurnType(java.lang.String str) {
            this.k = str;
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
            parcel.writeString(this.k);
        }
    }

    public BikingRouteLine() {
    }

    protected BikingRouteLine(android.os.Parcel parcel) {
        super(parcel);
    }

    @Override // com.baidu.mapapi.search.core.RouteLine, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.baidu.mapapi.search.core.RouteLine
    public java.util.List<com.baidu.mapapi.search.route.BikingRouteLine.BikingStep> getAllStep() {
        return super.getAllStep();
    }

    @Override // com.baidu.mapapi.search.core.RouteLine, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        super.setType(com.baidu.mapapi.search.core.RouteLine.TYPE.BIKINGSTEP);
        super.writeToParcel(parcel, 1);
    }
}
