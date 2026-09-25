package com.baidu.mapapi.search.route;

/* JADX INFO: loaded from: classes.dex */
public class TransitRoutePlanOption {
    public com.baidu.mapapi.search.route.PlanNode mFrom = null;
    public com.baidu.mapapi.search.route.PlanNode mTo = null;
    public java.lang.String mCityName = null;
    public com.baidu.mapapi.search.route.TransitRoutePlanOption.TransitPolicy mPolicy = com.baidu.mapapi.search.route.TransitRoutePlanOption.TransitPolicy.EBUS_TIME_FIRST;

    public enum TransitPolicy {
        EBUS_TIME_FIRST(0),
        EBUS_TRANSFER_FIRST(2),
        EBUS_WALK_FIRST(3),
        EBUS_NO_SUBWAY(4);

        private int a;

        TransitPolicy(int i) {
            this.a = 0;
            this.a = i;
        }

        public int getInt() {
            return this.a;
        }
    }

    public com.baidu.mapapi.search.route.TransitRoutePlanOption city(java.lang.String str) {
        this.mCityName = str;
        return this;
    }

    public com.baidu.mapapi.search.route.TransitRoutePlanOption from(com.baidu.mapapi.search.route.PlanNode planNode) {
        this.mFrom = planNode;
        return this;
    }

    public com.baidu.mapapi.search.route.TransitRoutePlanOption policy(com.baidu.mapapi.search.route.TransitRoutePlanOption.TransitPolicy transitPolicy) {
        this.mPolicy = transitPolicy;
        return this;
    }

    public com.baidu.mapapi.search.route.TransitRoutePlanOption to(com.baidu.mapapi.search.route.PlanNode planNode) {
        this.mTo = planNode;
        return this;
    }
}
