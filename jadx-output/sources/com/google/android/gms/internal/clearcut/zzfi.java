package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
final class zzfi extends java.lang.IllegalArgumentException {
    zzfi(int i, int i2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(54);
        sb.append("Unpaired surrogate at index ");
        sb.append(i);
        sb.append(" of ");
        sb.append(i2);
        super(sb.toString());
    }
}
