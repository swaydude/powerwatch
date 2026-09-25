package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzfg implements com.google.android.gms.internal.fitness.zzfk {
    zzfg() {
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public /* synthetic */ java.lang.Byte next() {
        return java.lang.Byte.valueOf(nextByte());
    }
}
