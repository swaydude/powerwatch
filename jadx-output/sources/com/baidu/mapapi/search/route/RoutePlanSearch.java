package com.baidu.mapapi.search.route;

/* JADX INFO: loaded from: classes.dex */
public class RoutePlanSearch extends com.baidu.mapapi.search.core.l {
    private boolean b = false;
    private com.baidu.platform.core.d.e a = new com.baidu.platform.core.d.j();

    RoutePlanSearch() {
    }

    public static com.baidu.mapapi.search.route.RoutePlanSearch newInstance() {
        com.baidu.mapapi.BMapManager.init();
        return new com.baidu.mapapi.search.route.RoutePlanSearch();
    }

    public boolean bikingSearch(com.baidu.mapapi.search.route.BikingRoutePlanOption bikingRoutePlanOption) {
        if (this.a == null) {
            throw new java.lang.IllegalStateException("BDMapSDKException: RoutePlanSearch is null, please call newInstance() first.");
        }
        if (bikingRoutePlanOption == null || bikingRoutePlanOption.mTo == null || bikingRoutePlanOption.mFrom == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: route plan option , origin or destination can not be null");
        }
        if (bikingRoutePlanOption.mFrom.getLocation() == null && (bikingRoutePlanOption.mFrom.getName() == null || bikingRoutePlanOption.mFrom.getName() == "")) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: route plan option , origin is illegal");
        }
        if (bikingRoutePlanOption.mTo.getLocation() == null && (bikingRoutePlanOption.mTo.getName() == null || bikingRoutePlanOption.mTo.getName() == "")) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: route plan option , destination is illegal");
        }
        return this.a.a(bikingRoutePlanOption);
    }

    public void destroy() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.a.a();
        com.baidu.mapapi.BMapManager.destroy();
    }

    public boolean drivingSearch(com.baidu.mapapi.search.route.DrivingRoutePlanOption drivingRoutePlanOption) {
        if (this.a == null) {
            throw new java.lang.IllegalStateException("BDMapSDKException: RoutePlanSearch is null, please call newInstance() first.");
        }
        if (drivingRoutePlanOption == null || drivingRoutePlanOption.mTo == null || drivingRoutePlanOption.mFrom == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: route plan option , origin or destination can not be null");
        }
        return this.a.a(drivingRoutePlanOption);
    }

    public boolean masstransitSearch(com.baidu.mapapi.search.route.MassTransitRoutePlanOption massTransitRoutePlanOption) {
        if (this.a == null) {
            throw new java.lang.IllegalStateException("BDMapSDKException: RoutePlanSearch is null, please call newInstance() first.");
        }
        if (massTransitRoutePlanOption == null || massTransitRoutePlanOption.mTo == null || massTransitRoutePlanOption.mFrom == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: route plan option,origin or destination can not be null");
        }
        if (massTransitRoutePlanOption.mFrom.getLocation() == null && (massTransitRoutePlanOption.mFrom.getName() == null || massTransitRoutePlanOption.mFrom.getCity() == null)) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: route plan option,origin is illegal");
        }
        if (massTransitRoutePlanOption.mTo.getLocation() == null && (massTransitRoutePlanOption.mTo.getName() == null || massTransitRoutePlanOption.mTo.getCity() == null)) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: route plan option,destination is illegal");
        }
        return this.a.a(massTransitRoutePlanOption);
    }

    public void setOnGetRoutePlanResultListener(com.baidu.mapapi.search.route.OnGetRoutePlanResultListener onGetRoutePlanResultListener) {
        com.baidu.platform.core.d.e eVar = this.a;
        if (eVar == null) {
            throw new java.lang.IllegalStateException("BDMapSDKException: RoutePlanSearch is null, please call newInstance() first.");
        }
        if (onGetRoutePlanResultListener == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: listener can not be null");
        }
        eVar.a(onGetRoutePlanResultListener);
    }

    public boolean transitSearch(com.baidu.mapapi.search.route.TransitRoutePlanOption transitRoutePlanOption) {
        if (this.a == null) {
            throw new java.lang.IllegalStateException("BDMapSDKException: RoutePlanSearch is null, please call newInstance() first.");
        }
        if (transitRoutePlanOption == null || transitRoutePlanOption.mCityName == null || transitRoutePlanOption.mTo == null || transitRoutePlanOption.mFrom == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: route plan option,origin or destination or city can not be null");
        }
        return this.a.a(transitRoutePlanOption);
    }

    public boolean walkingIndoorSearch(com.baidu.mapapi.search.route.IndoorRoutePlanOption indoorRoutePlanOption) {
        if (this.a == null) {
            throw new java.lang.IllegalStateException("BDMapSDKException: RoutePlanSearch is null, please call newInstance() first.");
        }
        if (indoorRoutePlanOption == null || indoorRoutePlanOption.mTo == null || indoorRoutePlanOption.mFrom == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: option , origin or destination can not be null");
        }
        return this.a.a(indoorRoutePlanOption);
    }

    public boolean walkingSearch(com.baidu.mapapi.search.route.WalkingRoutePlanOption walkingRoutePlanOption) {
        if (this.a == null) {
            throw new java.lang.IllegalStateException("BDMapSDKException: RoutePlanSearch is null, please call newInstance() first.");
        }
        if (walkingRoutePlanOption == null || walkingRoutePlanOption.mTo == null || walkingRoutePlanOption.mFrom == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: option , origin or destination can not be null");
        }
        return this.a.a(walkingRoutePlanOption);
    }
}
