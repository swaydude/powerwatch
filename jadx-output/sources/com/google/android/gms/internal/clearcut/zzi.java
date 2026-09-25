package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
final class zzi extends com.google.android.gms.internal.clearcut.zzg {
    private final /* synthetic */ com.google.android.gms.internal.clearcut.zzh zzap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzi(com.google.android.gms.internal.clearcut.zzh zzhVar) {
        super(null);
        this.zzap = zzhVar;
    }

    @Override // com.google.android.gms.internal.clearcut.zzg, com.google.android.gms.internal.clearcut.zzl
    public final void zza(com.google.android.gms.common.api.Status status) {
        this.zzap.setResult(status);
    }
}
