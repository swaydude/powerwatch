package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzcp extends com.google.android.gms.internal.measurement.zzcl<java.lang.Double> {
    zzcp(com.google.android.gms.internal.measurement.zzcr zzcrVar, java.lang.String str, java.lang.Double d) {
        super(zzcrVar, str, d, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.measurement.zzcl
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final java.lang.Double zza(java.lang.Object obj) {
        if (obj instanceof java.lang.Double) {
            return (java.lang.Double) obj;
        }
        if (obj instanceof java.lang.Float) {
            return java.lang.Double.valueOf(((java.lang.Float) obj).doubleValue());
        }
        if (obj instanceof java.lang.String) {
            try {
                return java.lang.Double.valueOf(java.lang.Double.parseDouble((java.lang.String) obj));
            } catch (java.lang.NumberFormatException unused) {
            }
        }
        java.lang.String strZzb = super.zzb();
        java.lang.String strValueOf = java.lang.String.valueOf(obj);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strZzb).length() + 27 + java.lang.String.valueOf(strValueOf).length());
        sb.append("Invalid double value for ");
        sb.append(strZzb);
        sb.append(": ");
        sb.append(strValueOf);
        android.util.Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
