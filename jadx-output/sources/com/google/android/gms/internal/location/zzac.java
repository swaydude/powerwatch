package com.google.android.gms.internal.location;

/* JADX INFO: loaded from: classes.dex */
final class zzac extends com.google.android.gms.internal.location.zzak {
    private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> zzcq;

    public zzac(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> resultHolder) {
        this.zzcq = resultHolder;
    }

    @Override // com.google.android.gms.internal.location.zzaj
    public final void zza(com.google.android.gms.internal.location.zzad zzadVar) {
        this.zzcq.setResult(zzadVar.getStatus());
    }
}
