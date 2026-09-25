package com.baidu.platform.core.d;

/* JADX INFO: loaded from: classes.dex */
public class j extends com.baidu.platform.base.a implements com.baidu.platform.core.d.e {
    private com.baidu.mapapi.search.route.OnGetRoutePlanResultListener b = null;

    @Override // com.baidu.platform.core.d.e
    public void a() {
        this.a.lock();
        this.b = null;
        this.a.unlock();
    }

    @Override // com.baidu.platform.core.d.e
    public void a(com.baidu.mapapi.search.route.OnGetRoutePlanResultListener onGetRoutePlanResultListener) {
        this.a.lock();
        this.b = onGetRoutePlanResultListener;
        this.a.unlock();
    }

    @Override // com.baidu.platform.core.d.e
    public boolean a(com.baidu.mapapi.search.route.BikingRoutePlanOption bikingRoutePlanOption) {
        com.baidu.platform.core.d.a aVar = new com.baidu.platform.core.d.a();
        aVar.a(com.baidu.platform.base.SearchType.BIKE_ROUTE);
        return a(new com.baidu.platform.core.d.b(bikingRoutePlanOption), this.b, aVar);
    }

    @Override // com.baidu.platform.core.d.e
    public boolean a(com.baidu.mapapi.search.route.DrivingRoutePlanOption drivingRoutePlanOption) {
        com.baidu.platform.core.d.c cVar = new com.baidu.platform.core.d.c();
        cVar.a(com.baidu.platform.base.SearchType.DRIVE_ROUTE);
        return a(new com.baidu.platform.core.d.d(drivingRoutePlanOption), this.b, cVar);
    }

    @Override // com.baidu.platform.core.d.e
    public boolean a(com.baidu.mapapi.search.route.IndoorRoutePlanOption indoorRoutePlanOption) {
        com.baidu.platform.core.d.f fVar = new com.baidu.platform.core.d.f();
        fVar.a(com.baidu.platform.base.SearchType.INDOOR_ROUTE);
        return a(new com.baidu.platform.core.d.g(indoorRoutePlanOption), this.b, fVar);
    }

    @Override // com.baidu.platform.core.d.e
    public boolean a(com.baidu.mapapi.search.route.MassTransitRoutePlanOption massTransitRoutePlanOption) {
        com.baidu.platform.core.d.h hVar = new com.baidu.platform.core.d.h();
        hVar.a(com.baidu.platform.base.SearchType.MASS_TRANSIT_ROUTE);
        return a(new com.baidu.platform.core.d.i(massTransitRoutePlanOption), this.b, hVar);
    }

    @Override // com.baidu.platform.core.d.e
    public boolean a(com.baidu.mapapi.search.route.TransitRoutePlanOption transitRoutePlanOption) {
        com.baidu.platform.core.d.m mVar = new com.baidu.platform.core.d.m();
        mVar.a(com.baidu.platform.base.SearchType.TRANSIT_ROUTE);
        return a(new com.baidu.platform.core.d.n(transitRoutePlanOption), this.b, mVar);
    }

    @Override // com.baidu.platform.core.d.e
    public boolean a(com.baidu.mapapi.search.route.WalkingRoutePlanOption walkingRoutePlanOption) {
        com.baidu.platform.core.d.o oVar = new com.baidu.platform.core.d.o();
        oVar.a(com.baidu.platform.base.SearchType.WALK_ROUTE);
        return a(new com.baidu.platform.core.d.p(walkingRoutePlanOption), this.b, oVar);
    }
}
