package com.google.android.gms.maps;

/* JADX INFO: loaded from: classes.dex */
public final class Projection {
    private final com.google.android.gms.maps.internal.IProjectionDelegate zzbn;

    Projection(com.google.android.gms.maps.internal.IProjectionDelegate iProjectionDelegate) {
        this.zzbn = iProjectionDelegate;
    }

    public final com.google.android.gms.maps.model.LatLng fromScreenLocation(android.graphics.Point point) {
        try {
            return this.zzbn.fromScreenLocation(com.google.android.gms.dynamic.ObjectWrapper.wrap(point));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final android.graphics.Point toScreenLocation(com.google.android.gms.maps.model.LatLng latLng) {
        try {
            return (android.graphics.Point) com.google.android.gms.dynamic.ObjectWrapper.unwrap(this.zzbn.toScreenLocation(latLng));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final com.google.android.gms.maps.model.VisibleRegion getVisibleRegion() {
        try {
            return this.zzbn.getVisibleRegion();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }
}
