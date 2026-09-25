package com.baidu.mapapi.search.route;

/* JADX INFO: loaded from: classes.dex */
public class DrivingRoutePlanOption {
    public java.lang.String mCityName;
    public com.baidu.mapapi.search.route.PlanNode mFrom = null;
    public com.baidu.mapapi.search.route.PlanNode mTo = null;
    public com.baidu.mapapi.search.route.DrivingRoutePlanOption.DrivingPolicy mPolicy = com.baidu.mapapi.search.route.DrivingRoutePlanOption.DrivingPolicy.ECAR_TIME_FIRST;
    public java.util.List<com.baidu.mapapi.search.route.PlanNode> mWayPoints = null;
    public com.baidu.mapapi.search.route.DrivingRoutePlanOption.DrivingTrafficPolicy mtrafficPolicy = com.baidu.mapapi.search.route.DrivingRoutePlanOption.DrivingTrafficPolicy.ROUTE_PATH;

    public enum DrivingPolicy {
        ECAR_AVOID_JAM(3),
        ECAR_TIME_FIRST(0),
        ECAR_DIS_FIRST(1),
        ECAR_FEE_FIRST(2);

        private int a;

        DrivingPolicy(int i) {
            this.a = i;
        }

        public int getInt() {
            return this.a;
        }
    }

    public enum DrivingTrafficPolicy {
        ROUTE_PATH(0),
        ROUTE_PATH_AND_TRAFFIC(1);

        private int a;

        DrivingTrafficPolicy(int i) {
            this.a = i;
        }

        public int getInt() {
            return this.a;
        }
    }

    public com.baidu.mapapi.search.route.DrivingRoutePlanOption currentCity(java.lang.String str) {
        this.mCityName = str;
        return this;
    }

    public com.baidu.mapapi.search.route.DrivingRoutePlanOption from(com.baidu.mapapi.search.route.PlanNode planNode) {
        this.mFrom = planNode;
        return this;
    }

    public com.baidu.mapapi.search.route.DrivingRoutePlanOption passBy(java.util.List<com.baidu.mapapi.search.route.PlanNode> list) {
        this.mWayPoints = list;
        return this;
    }

    public com.baidu.mapapi.search.route.DrivingRoutePlanOption policy(com.baidu.mapapi.search.route.DrivingRoutePlanOption.DrivingPolicy drivingPolicy) {
        this.mPolicy = drivingPolicy;
        return this;
    }

    public com.baidu.mapapi.search.route.DrivingRoutePlanOption to(com.baidu.mapapi.search.route.PlanNode planNode) {
        this.mTo = planNode;
        return this;
    }

    public com.baidu.mapapi.search.route.DrivingRoutePlanOption trafficPolicy(com.baidu.mapapi.search.route.DrivingRoutePlanOption.DrivingTrafficPolicy drivingTrafficPolicy) {
        this.mtrafficPolicy = drivingTrafficPolicy;
        return this;
    }
}
