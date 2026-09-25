package com.google.android.gms.maps.model;

/* JADX INFO: loaded from: classes.dex */
public final class BitmapDescriptorFactory {
    public static final float HUE_AZURE = 210.0f;
    public static final float HUE_BLUE = 240.0f;
    public static final float HUE_CYAN = 180.0f;
    public static final float HUE_GREEN = 120.0f;
    public static final float HUE_MAGENTA = 300.0f;
    public static final float HUE_ORANGE = 30.0f;
    public static final float HUE_RED = 0.0f;
    public static final float HUE_ROSE = 330.0f;
    public static final float HUE_VIOLET = 270.0f;
    public static final float HUE_YELLOW = 60.0f;
    private static com.google.android.gms.internal.maps.zze zzcm;

    private BitmapDescriptorFactory() {
    }

    private static com.google.android.gms.internal.maps.zze zzg() {
        return (com.google.android.gms.internal.maps.zze) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzcm, "IBitmapDescriptorFactory is not initialized");
    }

    public static void zza(com.google.android.gms.internal.maps.zze zzeVar) {
        if (zzcm != null) {
            return;
        }
        zzcm = (com.google.android.gms.internal.maps.zze) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzeVar);
    }

    public static com.google.android.gms.maps.model.BitmapDescriptor fromResource(int i) {
        try {
            return new com.google.android.gms.maps.model.BitmapDescriptor(zzg().zza(i));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public static com.google.android.gms.maps.model.BitmapDescriptor fromAsset(java.lang.String str) {
        try {
            return new com.google.android.gms.maps.model.BitmapDescriptor(zzg().zza(str));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public static com.google.android.gms.maps.model.BitmapDescriptor fromFile(java.lang.String str) {
        try {
            return new com.google.android.gms.maps.model.BitmapDescriptor(zzg().zzb(str));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public static com.google.android.gms.maps.model.BitmapDescriptor fromPath(java.lang.String str) {
        try {
            return new com.google.android.gms.maps.model.BitmapDescriptor(zzg().zzc(str));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public static com.google.android.gms.maps.model.BitmapDescriptor defaultMarker() {
        try {
            return new com.google.android.gms.maps.model.BitmapDescriptor(zzg().zzi());
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public static com.google.android.gms.maps.model.BitmapDescriptor defaultMarker(float f) {
        try {
            return new com.google.android.gms.maps.model.BitmapDescriptor(zzg().zza(f));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public static com.google.android.gms.maps.model.BitmapDescriptor fromBitmap(android.graphics.Bitmap bitmap) {
        try {
            return new com.google.android.gms.maps.model.BitmapDescriptor(zzg().zza(bitmap));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }
}
