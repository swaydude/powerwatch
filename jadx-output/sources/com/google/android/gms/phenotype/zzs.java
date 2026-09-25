package com.google.android.gms.phenotype;

/* JADX INFO: loaded from: classes.dex */
final class zzs extends com.google.android.gms.phenotype.PhenotypeFlag<java.lang.String> {
    zzs(com.google.android.gms.phenotype.PhenotypeFlag.Factory factory, java.lang.String str, java.lang.String str2) {
        super(factory, str, str2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.phenotype.PhenotypeFlag
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final java.lang.String zza(android.content.SharedPreferences sharedPreferences) {
        try {
            return sharedPreferences.getString(this.zzap, null);
        } catch (java.lang.ClassCastException e) {
            java.lang.String strValueOf = java.lang.String.valueOf(this.zzap);
            android.util.Log.e("PhenotypeFlag", strValueOf.length() != 0 ? "Invalid string value in SharedPreferences for ".concat(strValueOf) : new java.lang.String("Invalid string value in SharedPreferences for "), e);
            return null;
        }
    }

    @Override // com.google.android.gms.phenotype.PhenotypeFlag
    public final /* synthetic */ java.lang.String zza(java.lang.String str) {
        return str;
    }
}
