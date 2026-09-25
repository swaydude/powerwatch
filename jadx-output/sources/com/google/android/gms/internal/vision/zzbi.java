package com.google.android.gms.internal.vision;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzbi<T> extends com.google.android.gms.internal.vision.zzbe<T> {
    private final /* synthetic */ com.google.android.gms.internal.vision.zzbh zzgg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbi(com.google.android.gms.internal.vision.zzbk zzbkVar, java.lang.String str, java.lang.Object obj, com.google.android.gms.internal.vision.zzbh zzbhVar) {
        super(zzbkVar, str, obj, null);
        this.zzgg = zzbhVar;
    }

    @Override // com.google.android.gms.internal.vision.zzbe
    final T zza(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            try {
                return (T) this.zzgg.zzb(android.util.Base64.decode((java.lang.String) obj, 3));
            } catch (java.io.IOException | java.lang.IllegalArgumentException unused) {
            }
        }
        java.lang.String strZzac = super.zzac();
        java.lang.String strValueOf = java.lang.String.valueOf(obj);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strZzac).length() + 27 + java.lang.String.valueOf(strValueOf).length());
        sb.append("Invalid byte[] value for ");
        sb.append(strZzac);
        sb.append(": ");
        sb.append(strValueOf);
        android.util.Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
