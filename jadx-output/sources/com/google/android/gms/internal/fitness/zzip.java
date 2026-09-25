package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzip implements com.google.android.gms.internal.fitness.zzis {
    private final /* synthetic */ com.google.android.gms.internal.fitness.zzff zzza;

    zzip(com.google.android.gms.internal.fitness.zzff zzffVar) {
        this.zzza = zzffVar;
    }

    @Override // com.google.android.gms.internal.fitness.zzis
    public final int size() {
        return this.zzza.size();
    }

    @Override // com.google.android.gms.internal.fitness.zzis
    public final byte zzh(int i) {
        return this.zzza.zzh(i);
    }
}
