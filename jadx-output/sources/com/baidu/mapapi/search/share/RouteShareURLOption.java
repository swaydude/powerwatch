package com.baidu.mapapi.search.share;

/* JADX INFO: loaded from: classes.dex */
public class RouteShareURLOption {
    public com.baidu.mapapi.search.share.RouteShareURLOption.RouteShareMode mMode;
    public com.baidu.mapapi.search.route.PlanNode mFrom = null;
    public com.baidu.mapapi.search.route.PlanNode mTo = null;
    public int mPn = 0;
    public int mCityCode = -1;

    public enum RouteShareMode {
        CAR_ROUTE_SHARE_MODE(0),
        FOOT_ROUTE_SHARE_MODE(1),
        CYCLE_ROUTE_SHARE_MODE(2),
        BUS_ROUTE_SHARE_MODE(3);

        private int a;

        RouteShareMode(int i) {
            this.a = -1;
            this.a = i;
        }

        public int getRouteShareMode() {
            return this.a;
        }
    }

    public com.baidu.mapapi.search.share.RouteShareURLOption cityCode(int i) {
        this.mCityCode = i;
        return this;
    }

    public com.baidu.mapapi.search.share.RouteShareURLOption from(com.baidu.mapapi.search.route.PlanNode planNode) {
        this.mFrom = planNode;
        return this;
    }

    public com.baidu.mapapi.search.share.RouteShareURLOption.RouteShareMode getmMode() {
        return this.mMode;
    }

    public com.baidu.mapapi.search.share.RouteShareURLOption pn(int i) {
        this.mPn = i;
        return this;
    }

    public com.baidu.mapapi.search.share.RouteShareURLOption routMode(com.baidu.mapapi.search.share.RouteShareURLOption.RouteShareMode routeShareMode) {
        this.mMode = routeShareMode;
        return this;
    }

    public com.baidu.mapapi.search.share.RouteShareURLOption to(com.baidu.mapapi.search.route.PlanNode planNode) {
        this.mTo = planNode;
        return this;
    }
}
