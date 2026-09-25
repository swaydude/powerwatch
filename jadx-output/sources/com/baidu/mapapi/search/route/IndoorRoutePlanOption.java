package com.baidu.mapapi.search.route;

/* JADX INFO: loaded from: classes.dex */
public class IndoorRoutePlanOption {
    public com.baidu.mapapi.search.route.IndoorPlanNode mFrom = null;
    public com.baidu.mapapi.search.route.IndoorPlanNode mTo = null;

    public com.baidu.mapapi.search.route.IndoorRoutePlanOption from(com.baidu.mapapi.search.route.IndoorPlanNode indoorPlanNode) {
        this.mFrom = indoorPlanNode;
        return this;
    }

    public com.baidu.mapapi.search.route.IndoorRoutePlanOption to(com.baidu.mapapi.search.route.IndoorPlanNode indoorPlanNode) {
        this.mTo = indoorPlanNode;
        return this;
    }
}
