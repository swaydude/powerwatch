package com.google.android.gms.internal.clearcut;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes.dex */
final class zzal<T> extends com.google.android.gms.internal.clearcut.zzae<T> {
    private final java.lang.Object lock;
    private java.lang.String zzec;
    private T zzed;
    private final /* synthetic */ com.google.android.gms.internal.clearcut.zzan zzee;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzal(com.google.android.gms.internal.clearcut.zzao zzaoVar, java.lang.String str, java.lang.Object obj, com.google.android.gms.internal.clearcut.zzan zzanVar) {
        super(zzaoVar, str, obj, null);
        this.zzee = zzanVar;
        this.lock = new java.lang.Object();
    }

    @Override // com.google.android.gms.internal.clearcut.zzae
    protected final T zza(android.content.SharedPreferences sharedPreferences) {
        try {
            return zzb(sharedPreferences.getString(this.zzds, ""));
        } catch (java.lang.ClassCastException e) {
            java.lang.String strValueOf = java.lang.String.valueOf(this.zzds);
            android.util.Log.e("PhenotypeFlag", strValueOf.length() != 0 ? "Invalid byte[] value in SharedPreferences for ".concat(strValueOf) : new java.lang.String("Invalid byte[] value in SharedPreferences for "), e);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzae
    protected final T zzb(java.lang.String str) {
        T t;
        try {
            synchronized (this.lock) {
                if (!str.equals(this.zzec)) {
                    T t2 = (T) this.zzee.zzb(android.util.Base64.decode(str, 3));
                    this.zzec = str;
                    this.zzed = t2;
                }
                t = this.zzed;
            }
            return t;
        } catch (java.io.IOException | java.lang.IllegalArgumentException unused) {
            java.lang.String str2 = this.zzds;
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str2).length() + 27 + java.lang.String.valueOf(str).length());
            sb.append("Invalid byte[] value for ");
            sb.append(str2);
            sb.append(": ");
            sb.append(str);
            android.util.Log.e("PhenotypeFlag", sb.toString());
            return null;
        }
    }
}
