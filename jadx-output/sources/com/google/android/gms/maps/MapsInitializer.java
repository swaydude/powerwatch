package com.google.android.gms.maps;

/* JADX INFO: loaded from: classes.dex */
public final class MapsInitializer {
    private static boolean zzbm = false;

    public static synchronized int initialize(android.content.Context context) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "Context is null");
        if (zzbm) {
            return 0;
        }
        try {
            com.google.android.gms.maps.internal.zze zzeVarZza = com.google.android.gms.maps.internal.zzbz.zza(context);
            try {
                com.google.android.gms.maps.CameraUpdateFactory.zza(zzeVarZza.zze());
                com.google.android.gms.maps.model.BitmapDescriptorFactory.zza(zzeVarZza.zzf());
                zzbm = true;
                return 0;
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            }
        } catch (com.google.android.gms.common.GooglePlayServicesNotAvailableException e2) {
            return e2.errorCode;
        }
    }

    private MapsInitializer() {
    }
}
