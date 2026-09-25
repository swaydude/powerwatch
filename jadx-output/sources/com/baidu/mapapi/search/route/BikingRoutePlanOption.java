package com.baidu.mapapi.search.route;

/* JADX INFO: loaded from: classes.dex */
public class BikingRoutePlanOption {
    public com.baidu.mapapi.search.route.PlanNode mFrom = null;
    public com.baidu.mapapi.search.route.PlanNode mTo = null;
    public int mRidingType = 0;

    public com.baidu.mapapi.search.route.BikingRoutePlanOption from(com.baidu.mapapi.search.route.PlanNode planNode) {
        this.mFrom = planNode;
        return this;
    }

    public com.baidu.mapapi.search.route.BikingRoutePlanOption ridingType(int i) {
        this.mRidingType = i;
        return this;
    }

    public com.baidu.mapapi.search.route.BikingRoutePlanOption to(com.baidu.mapapi.search.route.PlanNode planNode) {
        this.mTo = planNode;
        return this;
    }
}
