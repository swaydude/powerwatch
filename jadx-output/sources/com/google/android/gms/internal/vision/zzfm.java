package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzfm implements com.google.android.gms.internal.vision.zzfq {
    zzfm() {
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
