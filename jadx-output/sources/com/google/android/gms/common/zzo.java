package com.google.android.gms.common;

/* JADX INFO: loaded from: classes.dex */
final class zzo extends com.google.android.gms.common.zzm {
    private final java.util.concurrent.Callable<java.lang.String> zzaf;

    private zzo(java.util.concurrent.Callable<java.lang.String> callable) {
        super(false, null, null);
        this.zzaf = callable;
    }

    @Override // com.google.android.gms.common.zzm
    final java.lang.String getErrorMessage() {
        try {
            return this.zzaf.call();
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException(e);
        }
    }
}
