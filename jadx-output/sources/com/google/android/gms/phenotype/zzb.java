package com.google.android.gms.phenotype;

/* JADX INFO: loaded from: classes.dex */
final class zzb extends android.database.ContentObserver {
    private final /* synthetic */ com.google.android.gms.phenotype.zza zzm;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzb(com.google.android.gms.phenotype.zza zzaVar, android.os.Handler handler) {
        super(null);
        this.zzm = zzaVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.zzm.zzb();
    }
}
