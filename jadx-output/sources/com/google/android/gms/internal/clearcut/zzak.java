package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
final class zzak extends com.google.android.gms.internal.clearcut.zzae<java.lang.String> {
    zzak(com.google.android.gms.internal.clearcut.zzao zzaoVar, java.lang.String str, java.lang.String str2) {
        super(zzaoVar, str, str2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.clearcut.zzae
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final java.lang.String zza(android.content.SharedPreferences sharedPreferences) {
        try {
            return sharedPreferences.getString(this.zzds, null);
        } catch (java.lang.ClassCastException e) {
            java.lang.String strValueOf = java.lang.String.valueOf(this.zzds);
            android.util.Log.e("PhenotypeFlag", strValueOf.length() != 0 ? "Invalid string value in SharedPreferences for ".concat(strValueOf) : new java.lang.String("Invalid string value in SharedPreferences for "), e);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzae
    protected final /* synthetic */ java.lang.String zzb(java.lang.String str) {
        return str;
    }
}
