package com.google.android.gms.internal.location;

/* JADX INFO: loaded from: classes.dex */
final class zzbb extends com.google.android.gms.internal.location.zzan {
    private com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> zzdf;

    public zzbb(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> resultHolder) {
        this.zzdf = resultHolder;
    }

    private final void zze(int i) {
        if (this.zzdf == null) {
            android.util.Log.wtf("LocationClientImpl", "onRemoveGeofencesResult called multiple times");
            return;
        }
        this.zzdf.setResult(com.google.android.gms.location.LocationStatusCodes.zzd(com.google.android.gms.location.LocationStatusCodes.zzc(i)));
        this.zzdf = null;
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zza(int i, android.app.PendingIntent pendingIntent) {
        zze(i);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zza(int i, java.lang.String[] strArr) {
        android.util.Log.wtf("LocationClientImpl", "Unexpected call to onAddGeofencesResult");
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzb(int i, java.lang.String[] strArr) {
        zze(i);
    }
}
