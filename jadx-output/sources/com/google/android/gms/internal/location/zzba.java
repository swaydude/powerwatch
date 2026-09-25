package com.google.android.gms.internal.location;

/* JADX INFO: loaded from: classes.dex */
final class zzba extends com.google.android.gms.internal.location.zzan {
    private com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> zzdf;

    public zzba(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> resultHolder) {
        this.zzdf = resultHolder;
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zza(int i, android.app.PendingIntent pendingIntent) {
        android.util.Log.wtf("LocationClientImpl", "Unexpected call to onRemoveGeofencesByPendingIntentResult");
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zza(int i, java.lang.String[] strArr) {
        if (this.zzdf == null) {
            android.util.Log.wtf("LocationClientImpl", "onAddGeofenceResult called multiple times");
            return;
        }
        this.zzdf.setResult(com.google.android.gms.location.LocationStatusCodes.zzd(com.google.android.gms.location.LocationStatusCodes.zzc(i)));
        this.zzdf = null;
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzb(int i, java.lang.String[] strArr) {
        android.util.Log.wtf("LocationClientImpl", "Unexpected call to onRemoveGeofencesByRequestIdsResult");
    }
}
