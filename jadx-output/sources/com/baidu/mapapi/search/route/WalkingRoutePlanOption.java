package com.baidu.mapapi.search.route;

/* JADX INFO: loaded from: classes.dex */
public class WalkingRoutePlanOption {
    public com.baidu.mapapi.search.route.PlanNode mFrom = null;
    public com.baidu.mapapi.search.route.PlanNode mTo = null;

    public com.baidu.mapapi.search.route.WalkingRoutePlanOption from(com.baidu.mapapi.search.route.PlanNode planNode) {
        this.mFrom = planNode;
        return this;
    }

    public com.baidu.mapapi.search.route.WalkingRoutePlanOption to(com.baidu.mapapi.search.route.PlanNode planNode) {
        this.mTo = planNode;
        return this;
    }
}
