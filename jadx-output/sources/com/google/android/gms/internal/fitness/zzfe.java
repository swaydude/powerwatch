package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzfe extends com.google.android.gms.internal.fitness.zzfg {
    private final int limit;
    private int position = 0;
    private final /* synthetic */ com.google.android.gms.internal.fitness.zzff zzrh;

    zzfe(com.google.android.gms.internal.fitness.zzff zzffVar) {
        this.zzrh = zzffVar;
        this.limit = zzffVar.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.position < this.limit;
    }

    @Override // com.google.android.gms.internal.fitness.zzfk
    public final byte nextByte() {
        int i = this.position;
        if (i >= this.limit) {
            throw new java.util.NoSuchElementException();
        }
        this.position = i + 1;
        return this.zzrh.zzi(i);
    }
}
