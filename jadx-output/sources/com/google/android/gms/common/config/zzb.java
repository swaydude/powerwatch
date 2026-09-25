package com.google.android.gms.common.config;

/* JADX INFO: loaded from: classes.dex */
final class zzb extends com.google.android.gms.common.config.GservicesValue<java.lang.Long> {
    zzb(java.lang.String str, java.lang.Long l) {
        super(str, l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.config.GservicesValue
    protected final /* synthetic */ java.lang.Long zzd(java.lang.String str) {
        com.google.android.gms.common.config.GservicesValue.zza zzaVar = null;
        return zzaVar.getLong(this.mKey, (java.lang.Long) this.zzbq);
    }
}
