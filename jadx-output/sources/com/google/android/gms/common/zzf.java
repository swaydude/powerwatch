package com.google.android.gms.common;

/* JADX INFO: loaded from: classes.dex */
final class zzf extends com.google.android.gms.common.zze {
    private final byte[] zzu;

    zzf(byte[] bArr) {
        super(java.util.Arrays.copyOfRange(bArr, 0, 25));
        this.zzu = bArr;
    }

    @Override // com.google.android.gms.common.zze
    final byte[] getBytes() {
        return this.zzu;
    }
}
