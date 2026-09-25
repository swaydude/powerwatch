package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzcn extends com.google.android.gms.internal.measurement.zzcl<java.lang.Long> {
    zzcn(com.google.android.gms.internal.measurement.zzcr zzcrVar, java.lang.String str, java.lang.Long l) {
        super(zzcrVar, str, l, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.measurement.zzcl
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final java.lang.Long zza(java.lang.Object obj) {
        if (obj instanceof java.lang.Long) {
            return (java.lang.Long) obj;
        }
        if (obj instanceof java.lang.String) {
            try {
                return java.lang.Long.valueOf(java.lang.Long.parseLong((java.lang.String) obj));
            } catch (java.lang.NumberFormatException unused) {
            }
        }
        java.lang.String strZzb = super.zzb();
        java.lang.String strValueOf = java.lang.String.valueOf(obj);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strZzb).length() + 25 + java.lang.String.valueOf(strValueOf).length());
        sb.append("Invalid long value for ");
        sb.append(strZzb);
        sb.append(": ");
        sb.append(strValueOf);
        android.util.Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
