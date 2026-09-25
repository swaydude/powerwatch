package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzcq extends com.google.android.gms.internal.measurement.zzcl<java.lang.Boolean> {
    zzcq(com.google.android.gms.internal.measurement.zzcr zzcrVar, java.lang.String str, java.lang.Boolean bool) {
        super(zzcrVar, str, bool, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcl
    final /* synthetic */ java.lang.Boolean zza(java.lang.Object obj) {
        if (obj instanceof java.lang.Boolean) {
            return (java.lang.Boolean) obj;
        }
        if (obj instanceof java.lang.String) {
            java.lang.String str = (java.lang.String) obj;
            if (com.google.android.gms.internal.measurement.zzbw.zzb.matcher(str).matches()) {
                return true;
            }
            if (com.google.android.gms.internal.measurement.zzbw.zzc.matcher(str).matches()) {
                return false;
            }
        }
        java.lang.String strZzb = super.zzb();
        java.lang.String strValueOf = java.lang.String.valueOf(obj);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strZzb).length() + 28 + java.lang.String.valueOf(strValueOf).length());
        sb.append("Invalid boolean value for ");
        sb.append(strZzb);
        sb.append(": ");
        sb.append(strValueOf);
        android.util.Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
