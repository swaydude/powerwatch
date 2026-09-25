package com.google.android.gms.maps;

/* JADX INFO: loaded from: classes.dex */
public final class CameraUpdateFactory {
    private static com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate zzf;

    private CameraUpdateFactory() {
    }

    private static com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate zzc() {
        return (com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzf, "CameraUpdateFactory is not initialized");
    }

    public static void zza(com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate iCameraUpdateFactoryDelegate) {
        zzf = (com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate) com.google.android.gms.common.internal.Preconditions.checkNotNull(iCameraUpdateFactoryDelegate);
    }

    public static com.google.android.gms.maps.CameraUpdate zoomIn() {
        try {
            return new com.google.android.gms.maps.CameraUpdate(zzc().zoomIn());
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public static com.google.android.gms.maps.CameraUpdate zoomOut() {
        try {
            return new com.google.android.gms.maps.CameraUpdate(zzc().zoomOut());
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public static com.google.android.gms.maps.CameraUpdate scrollBy(float f, float f2) {
        try {
            return new com.google.android.gms.maps.CameraUpdate(zzc().scrollBy(f, f2));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public static com.google.android.gms.maps.CameraUpdate zoomTo(float f) {
        try {
            return new com.google.android.gms.maps.CameraUpdate(zzc().zoomTo(f));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public static com.google.android.gms.maps.CameraUpdate zoomBy(float f) {
        try {
            return new com.google.android.gms.maps.CameraUpdate(zzc().zoomBy(f));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public static com.google.android.gms.maps.CameraUpdate zoomBy(float f, android.graphics.Point point) {
        try {
            return new com.google.android.gms.maps.CameraUpdate(zzc().zoomByWithFocus(f, point.x, point.y));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public static com.google.android.gms.maps.CameraUpdate newCameraPosition(com.google.android.gms.maps.model.CameraPosition cameraPosition) {
        try {
            return new com.google.android.gms.maps.CameraUpdate(zzc().newCameraPosition(cameraPosition));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public static com.google.android.gms.maps.CameraUpdate newLatLng(com.google.android.gms.maps.model.LatLng latLng) {
        try {
            return new com.google.android.gms.maps.CameraUpdate(zzc().newLatLng(latLng));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public static com.google.android.gms.maps.CameraUpdate newLatLngZoom(com.google.android.gms.maps.model.LatLng latLng, float f) {
        try {
            return new com.google.android.gms.maps.CameraUpdate(zzc().newLatLngZoom(latLng, f));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public static com.google.android.gms.maps.CameraUpdate newLatLngBounds(com.google.android.gms.maps.model.LatLngBounds latLngBounds, int i) {
        try {
            return new com.google.android.gms.maps.CameraUpdate(zzc().newLatLngBounds(latLngBounds, i));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public static com.google.android.gms.maps.CameraUpdate newLatLngBounds(com.google.android.gms.maps.model.LatLngBounds latLngBounds, int i, int i2, int i3) {
        try {
            return new com.google.android.gms.maps.CameraUpdate(zzc().newLatLngBoundsWithSize(latLngBounds, i, i2, i3));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }
}
