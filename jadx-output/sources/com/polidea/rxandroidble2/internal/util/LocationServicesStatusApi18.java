package com.polidea.rxandroidble2.internal.util;

/* JADX INFO: loaded from: classes2.dex */
public class LocationServicesStatusApi18 implements com.polidea.rxandroidble2.internal.util.LocationServicesStatus {
    @Override // com.polidea.rxandroidble2.internal.util.LocationServicesStatus
    public boolean isLocationPermissionOk() {
        return true;
    }

    @Override // com.polidea.rxandroidble2.internal.util.LocationServicesStatus
    public boolean isLocationProviderOk() {
        return true;
    }

    @bleshadow.javax.inject.Inject
    LocationServicesStatusApi18() {
    }
}
