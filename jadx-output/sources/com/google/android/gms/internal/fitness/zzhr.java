package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzhr<T> implements com.google.android.gms.internal.fitness.zzic<T> {
    private final com.google.android.gms.internal.fitness.zzho zzxm;
    private final com.google.android.gms.internal.fitness.zziu<?, ?> zzxn;
    private final boolean zzxo;
    private final com.google.android.gms.internal.fitness.zzfw<?> zzxp;

    private zzhr(com.google.android.gms.internal.fitness.zziu<?, ?> zziuVar, com.google.android.gms.internal.fitness.zzfw<?> zzfwVar, com.google.android.gms.internal.fitness.zzho zzhoVar) {
        this.zzxn = zziuVar;
        this.zzxo = zzfwVar.zze(zzhoVar);
        this.zzxp = zzfwVar;
        this.zzxm = zzhoVar;
    }

    static <T> com.google.android.gms.internal.fitness.zzhr<T> zza(com.google.android.gms.internal.fitness.zziu<?, ?> zziuVar, com.google.android.gms.internal.fitness.zzfw<?> zzfwVar, com.google.android.gms.internal.fitness.zzho zzhoVar) {
        return new com.google.android.gms.internal.fitness.zzhr<>(zziuVar, zzfwVar, zzhoVar);
    }

    @Override // com.google.android.gms.internal.fitness.zzic
    public final boolean equals(T t, T t2) {
        if (!this.zzxn.zzm(t).equals(this.zzxn.zzm(t2))) {
            return false;
        }
        if (this.zzxo) {
            return this.zzxp.zza(t).equals(this.zzxp.zza(t2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.fitness.zzic
    public final int hashCode(T t) {
        int iHashCode = this.zzxn.zzm(t).hashCode();
        return this.zzxo ? (iHashCode * 53) + this.zzxp.zza(t).hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.fitness.zzic
    public final void zzd(T t, T t2) {
        com.google.android.gms.internal.fitness.zzie.zza(this.zzxn, t, t2);
        if (this.zzxo) {
            com.google.android.gms.internal.fitness.zzie.zza(this.zzxp, t, t2);
        }
    }

    @Override // com.google.android.gms.internal.fitness.zzic
    public final void zza(T t, com.google.android.gms.internal.fitness.zzjo zzjoVar) throws java.io.IOException {
        for (T t2 : this.zzxp.zza(t)) {
            com.google.android.gms.internal.fitness.zzgd zzgdVar = (com.google.android.gms.internal.fitness.zzgd) t2.getKey();
            if (zzgdVar.zzbh() != com.google.android.gms.internal.fitness.zzjl.MESSAGE || zzgdVar.zzbi() || zzgdVar.zzbj()) {
                throw new java.lang.IllegalStateException("Found invalid MessageSet item.");
            }
            if (t2 instanceof com.google.android.gms.internal.fitness.zzgr) {
                zzjoVar.zza(zzgdVar.zzc(), (java.lang.Object) ((com.google.android.gms.internal.fitness.zzgr) t2).zzbw().zzag());
            } else {
                zzjoVar.zza(zzgdVar.zzc(), t2.getValue());
            }
        }
        com.google.android.gms.internal.fitness.zziu<?, ?> zziuVar = this.zzxn;
        zziuVar.zzc(zziuVar.zzm(t), zzjoVar);
    }

    @Override // com.google.android.gms.internal.fitness.zzic
    public final void zzc(T t) {
        this.zzxn.zzc(t);
        this.zzxp.zzc(t);
    }

    @Override // com.google.android.gms.internal.fitness.zzic
    public final boolean zzj(T t) {
        return this.zzxp.zza(t).isInitialized();
    }

    @Override // com.google.android.gms.internal.fitness.zzic
    public final int zzk(T t) {
        com.google.android.gms.internal.fitness.zziu<?, ?> zziuVar = this.zzxn;
        int iZzn = zziuVar.zzn(zziuVar.zzm(t)) + 0;
        return this.zzxo ? iZzn + this.zzxp.zza(t).zzbf() : iZzn;
    }
}
