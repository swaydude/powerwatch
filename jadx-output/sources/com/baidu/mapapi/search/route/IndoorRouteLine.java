package com.baidu.mapapi.search.route;

/* JADX INFO: loaded from: classes.dex */
public class IndoorRouteLine extends com.baidu.mapapi.search.core.RouteLine<com.baidu.mapapi.search.route.IndoorRouteLine.IndoorRouteStep> {
    public static final android.os.Parcelable.Creator<com.baidu.mapapi.search.route.IndoorRouteLine> CREATOR = new com.baidu.mapapi.search.route.g();

    public static class IndoorRouteStep extends com.baidu.mapapi.search.core.RouteStep {
        private com.baidu.mapapi.search.core.RouteNode d;
        private com.baidu.mapapi.search.core.RouteNode e;
        private java.lang.String f;
        private java.lang.String g;
        private java.lang.String h;
        private java.util.List<com.baidu.mapapi.search.route.IndoorRouteLine.IndoorRouteStep.IndoorStepNode> i;
        private java.util.List<java.lang.Double> j;

        public static class IndoorStepNode {
            private java.lang.String a;
            private int b;
            private com.baidu.mapapi.model.LatLng c;
            private java.lang.String d;

            public java.lang.String getDetail() {
                return this.d;
            }

            public com.baidu.mapapi.model.LatLng getLocation() {
                return this.c;
            }

            public java.lang.String getName() {
                return this.a;
            }

            public int getType() {
                return this.b;
            }

            public void setDetail(java.lang.String str) {
                this.d = str;
            }

            public void setLocation(com.baidu.mapapi.model.LatLng latLng) {
                this.c = latLng;
            }

            public void setName(java.lang.String str) {
                this.a = str;
            }

            public void setType(int i) {
                this.b = i;
            }
        }

        private java.util.List<com.baidu.mapapi.model.LatLng> a(java.util.List<java.lang.Double> list) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i = 0; i < list.size(); i += 2) {
                arrayList.add(new com.baidu.mapapi.model.LatLng(list.get(i).doubleValue(), list.get(i + 1).doubleValue()));
            }
            return arrayList;
        }

        public java.lang.String getBuildingId() {
            return this.h;
        }

        public com.baidu.mapapi.search.core.RouteNode getEntrace() {
            return this.d;
        }

        public com.baidu.mapapi.search.core.RouteNode getExit() {
            return this.e;
        }

        public java.lang.String getFloorId() {
            return this.g;
        }

        public java.lang.String getInstructions() {
            return this.f;
        }

        public java.util.List<com.baidu.mapapi.search.route.IndoorRouteLine.IndoorRouteStep.IndoorStepNode> getStepNodes() {
            return this.i;
        }

        @Override // com.baidu.mapapi.search.core.RouteStep
        public java.util.List<com.baidu.mapapi.model.LatLng> getWayPoints() {
            if (this.mWayPoints == null) {
                this.mWayPoints = a(this.j);
            }
            return this.mWayPoints;
        }

        public void setBuildingId(java.lang.String str) {
            this.h = str;
        }

        public void setEntrace(com.baidu.mapapi.search.core.RouteNode routeNode) {
            this.d = routeNode;
        }

        public void setExit(com.baidu.mapapi.search.core.RouteNode routeNode) {
            this.e = routeNode;
        }

        public void setFloorId(java.lang.String str) {
            this.g = str;
        }

        public void setInstructions(java.lang.String str) {
            this.f = str;
        }

        public void setPath(java.util.List<java.lang.Double> list) {
            this.j = list;
        }

        public void setStepNodes(java.util.List<com.baidu.mapapi.search.route.IndoorRouteLine.IndoorRouteStep.IndoorStepNode> list) {
            this.i = list;
        }
    }

    public IndoorRouteLine() {
        setType(com.baidu.mapapi.search.core.RouteLine.TYPE.WALKSTEP);
    }

    protected IndoorRouteLine(android.os.Parcel parcel) {
        super(parcel);
    }

    @Override // com.baidu.mapapi.search.core.RouteLine, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.baidu.mapapi.search.core.RouteLine
    public java.util.List<com.baidu.mapapi.search.route.IndoorRouteLine.IndoorRouteStep> getAllStep() {
        return super.getAllStep();
    }

    @Override // com.baidu.mapapi.search.core.RouteLine, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
