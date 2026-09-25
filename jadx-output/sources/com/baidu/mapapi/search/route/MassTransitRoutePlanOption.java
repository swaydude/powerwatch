package com.baidu.mapapi.search.route;

/* JADX INFO: loaded from: classes.dex */
public class MassTransitRoutePlanOption {
    public com.baidu.mapapi.search.route.PlanNode mFrom = null;
    public com.baidu.mapapi.search.route.PlanNode mTo = null;
    public java.lang.String mCoordType = com.baidu.mapsdkplatform.comapi.location.CoordinateType.BD09LL;
    public com.baidu.mapapi.search.route.MassTransitRoutePlanOption.TacticsIncity mTacticsIncity = com.baidu.mapapi.search.route.MassTransitRoutePlanOption.TacticsIncity.ETRANS_SUGGEST;
    public com.baidu.mapapi.search.route.MassTransitRoutePlanOption.TacticsIntercity mTacticsIntercity = com.baidu.mapapi.search.route.MassTransitRoutePlanOption.TacticsIntercity.ETRANS_LEAST_TIME;
    public com.baidu.mapapi.search.route.MassTransitRoutePlanOption.TransTypeIntercity mTransTypeIntercity = com.baidu.mapapi.search.route.MassTransitRoutePlanOption.TransTypeIntercity.ETRANS_TRAIN_FIRST;
    public int mPageSize = 10;
    public int mPageIndex = 1;

    public enum TacticsIncity {
        ETRANS_SUGGEST(0),
        ETRANS_LEAST_TRANSFER(1),
        ETRANS_LEAST_WALK(2),
        ETRANS_NO_SUBWAY(3),
        ETRANS_LEAST_TIME(4),
        ETRANS_SUBWAY_FIRST(5);

        private int a;

        TacticsIncity(int i) {
            this.a = 0;
            this.a = i;
        }

        public int getInt() {
            return this.a;
        }
    }

    public enum TacticsIntercity {
        ETRANS_LEAST_TIME(0),
        ETRANS_START_EARLY(1),
        ETRANS_LEAST_PRICE(2);

        private int a;

        TacticsIntercity(int i) {
            this.a = 0;
            this.a = i;
        }

        public int getInt() {
            return this.a;
        }
    }

    public enum TransTypeIntercity {
        ETRANS_TRAIN_FIRST(0),
        ETRANS_PLANE_FIRST(1),
        ETRANS_COACH_FIRST(2);

        private int a;

        TransTypeIntercity(int i) {
            this.a = 0;
            this.a = i;
        }

        public int getInt() {
            return this.a;
        }
    }

    @java.lang.Deprecated
    public com.baidu.mapapi.search.route.MassTransitRoutePlanOption coordType(java.lang.String str) {
        this.mCoordType = str;
        return this;
    }

    public com.baidu.mapapi.search.route.MassTransitRoutePlanOption from(com.baidu.mapapi.search.route.PlanNode planNode) {
        this.mFrom = planNode;
        return this;
    }

    public com.baidu.mapapi.search.route.MassTransitRoutePlanOption pageIndex(int i) {
        if (i >= 0 && i <= 2147483646) {
            this.mPageIndex = i + 1;
        }
        return this;
    }

    public com.baidu.mapapi.search.route.MassTransitRoutePlanOption pageSize(int i) {
        if (i >= 1 && i <= 10) {
            this.mPageSize = i;
        }
        return this;
    }

    public com.baidu.mapapi.search.route.MassTransitRoutePlanOption tacticsIncity(com.baidu.mapapi.search.route.MassTransitRoutePlanOption.TacticsIncity tacticsIncity) {
        this.mTacticsIncity = tacticsIncity;
        return this;
    }

    public com.baidu.mapapi.search.route.MassTransitRoutePlanOption tacticsIntercity(com.baidu.mapapi.search.route.MassTransitRoutePlanOption.TacticsIntercity tacticsIntercity) {
        this.mTacticsIntercity = tacticsIntercity;
        return this;
    }

    public com.baidu.mapapi.search.route.MassTransitRoutePlanOption to(com.baidu.mapapi.search.route.PlanNode planNode) {
        this.mTo = planNode;
        return this;
    }

    public com.baidu.mapapi.search.route.MassTransitRoutePlanOption transtypeintercity(com.baidu.mapapi.search.route.MassTransitRoutePlanOption.TransTypeIntercity transTypeIntercity) {
        this.mTransTypeIntercity = transTypeIntercity;
        return this;
    }
}
