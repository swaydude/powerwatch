package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
final class zzaj extends com.google.android.gms.internal.clearcut.zzae<java.lang.Boolean> {
    zzaj(com.google.android.gms.internal.clearcut.zzao zzaoVar, java.lang.String str, java.lang.Boolean bool) {
        super(zzaoVar, str, bool, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.clearcut.zzae
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final java.lang.Boolean zza(android.content.SharedPreferences sharedPreferences) {
        try {
            return java.lang.Boolean.valueOf(sharedPreferences.getBoolean(this.zzds, false));
        } catch (java.lang.ClassCastException e) {
            java.lang.String strValueOf = java.lang.String.valueOf(this.zzds);
            android.util.Log.e("PhenotypeFlag", strValueOf.length() != 0 ? "Invalid boolean value in SharedPreferences for ".concat(strValueOf) : new java.lang.String("Invalid boolean value in SharedPreferences for "), e);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzae
    protected final /* synthetic */ java.lang.Boolean zzb(java.lang.String str) {
        if (com.google.android.gms.internal.clearcut.zzy.zzcr.matcher(str).matches()) {
            return true;
        }
        if (com.google.android.gms.internal.clearcut.zzy.zzcs.matcher(str).matches()) {
            return false;
        }
        java.lang.String str2 = this.zzds;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str2).length() + 28 + java.lang.String.valueOf(str).length());
        sb.append("Invalid boolean value for ");
        sb.append(str2);
        sb.append(": ");
        sb.append(str);
        android.util.Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
