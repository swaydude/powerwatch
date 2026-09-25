package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzfk extends com.google.android.gms.internal.vision.zzfm {
    private final int limit;
    private int position = 0;
    private final /* synthetic */ com.google.android.gms.internal.vision.zzfh zzsa;

    zzfk(com.google.android.gms.internal.vision.zzfh zzfhVar) {
        this.zzsa = zzfhVar;
        this.limit = zzfhVar.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.position < this.limit;
    }

    @Override // com.google.android.gms.internal.vision.zzfq
    public final byte nextByte() {
        int i = this.position;
        if (i >= this.limit) {
            throw new java.util.NoSuchElementException();
        }
        this.position = i + 1;
        return this.zzsa.zzao(i);
    }
}
