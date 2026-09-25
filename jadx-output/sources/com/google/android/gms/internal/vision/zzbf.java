package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzbf extends com.google.android.gms.internal.vision.zzbe<java.lang.Boolean> {
    zzbf(com.google.android.gms.internal.vision.zzbk zzbkVar, java.lang.String str, java.lang.Boolean bool) {
        super(zzbkVar, str, bool, null);
    }

    @Override // com.google.android.gms.internal.vision.zzbe
    final /* synthetic */ java.lang.Boolean zza(java.lang.Object obj) {
        if (obj instanceof java.lang.Boolean) {
            return (java.lang.Boolean) obj;
        }
        if (obj instanceof java.lang.String) {
            java.lang.String str = (java.lang.String) obj;
            if (com.google.android.gms.internal.vision.zzal.zzeu.matcher(str).matches()) {
                return true;
            }
            if (com.google.android.gms.internal.vision.zzal.zzev.matcher(str).matches()) {
                return false;
            }
        }
        java.lang.String strZzac = super.zzac();
        java.lang.String strValueOf = java.lang.String.valueOf(obj);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strZzac).length() + 28 + java.lang.String.valueOf(strValueOf).length());
        sb.append("Invalid boolean value for ");
        sb.append(strZzac);
        sb.append(": ");
        sb.append(strValueOf);
        android.util.Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
