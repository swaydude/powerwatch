package com.google.android.gms.common.api;

/* JADX INFO: loaded from: classes.dex */
public final class UnsupportedApiCallException extends java.lang.UnsupportedOperationException {
    private final com.google.android.gms.common.Feature zzas;

    public UnsupportedApiCallException(com.google.android.gms.common.Feature feature) {
        this.zzas = feature;
    }

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
        java.lang.String strValueOf = java.lang.String.valueOf(this.zzas);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 8);
        sb.append("Missing ");
        sb.append(strValueOf);
        return sb.toString();
    }
}
