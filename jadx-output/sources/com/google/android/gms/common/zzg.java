package com.google.android.gms.common;

/* JADX INFO: loaded from: classes.dex */
abstract class zzg extends com.google.android.gms.common.zze {
    private static final java.lang.ref.WeakReference<byte[]> zzw = new java.lang.ref.WeakReference<>(null);
    private java.lang.ref.WeakReference<byte[]> zzv;

    zzg(byte[] bArr) {
        super(bArr);
        this.zzv = zzw;
    }

    protected abstract byte[] zzd();

    @Override // com.google.android.gms.common.zze
    final byte[] getBytes() {
        byte[] bArrZzd;
        synchronized (this) {
            bArrZzd = this.zzv.get();
            if (bArrZzd == null) {
                bArrZzd = zzd();
                this.zzv = new java.lang.ref.WeakReference<>(bArrZzd);
            }
        }
        return bArrZzd;
    }
}
