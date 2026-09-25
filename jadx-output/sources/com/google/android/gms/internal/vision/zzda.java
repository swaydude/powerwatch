package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzda {
    static void zza(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            java.lang.String strValueOf = java.lang.String.valueOf(obj2);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 24);
            sb.append("null key in entry: null=");
            sb.append(strValueOf);
            throw new java.lang.NullPointerException(sb.toString());
        }
        if (obj2 != null) {
            return;
        }
        java.lang.String strValueOf2 = java.lang.String.valueOf(obj);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf2).length() + 26);
        sb2.append("null value in entry: ");
        sb2.append(strValueOf2);
        sb2.append("=null");
        throw new java.lang.NullPointerException(sb2.toString());
    }
}
