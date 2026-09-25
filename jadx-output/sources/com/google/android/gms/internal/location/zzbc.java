package com.google.android.gms.internal.location;

/* JADX INFO: loaded from: classes.dex */
final class zzbc extends com.google.android.gms.internal.location.zzar {
    private com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.location.LocationSettingsResult> zzdf;

    public zzbc(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.location.LocationSettingsResult> resultHolder) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(resultHolder != null, "listener can't be null.");
        this.zzdf = resultHolder;
    }

    @Override // com.google.android.gms.internal.location.zzaq
    public final void zza(com.google.android.gms.location.LocationSettingsResult locationSettingsResult) throws android.os.RemoteException {
        this.zzdf.setResult(locationSettingsResult);
        this.zzdf = null;
    }
}
