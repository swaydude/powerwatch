package com.google.firebase.iid;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@20.2.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaz {
    private final android.content.SharedPreferences zza;
    private final android.content.Context zzb;
    private final java.util.Map<java.lang.String, java.lang.Long> zzc = new androidx.collection.ArrayMap();

    public zzaz(android.content.Context context) {
        this.zzb = context;
        this.zza = context.getSharedPreferences("com.google.android.gms.appid", 0);
        java.io.File file = new java.io.File(androidx.core.content.ContextCompat.getNoBackupFilesDir(context), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || zzb()) {
                return;
            }
            android.util.Log.i("FirebaseInstanceId", "App restored, clearing state");
            zza();
            com.google.firebase.iid.FirebaseInstanceId.getInstance().zze();
        } catch (java.io.IOException e) {
            if (android.util.Log.isLoggable("FirebaseInstanceId", 3)) {
                java.lang.String strValueOf = java.lang.String.valueOf(e.getMessage());
                android.util.Log.d("FirebaseInstanceId", strValueOf.length() != 0 ? "Error creating file in no backup dir: ".concat(strValueOf) : new java.lang.String("Error creating file in no backup dir: "));
            }
        }
    }

    private final synchronized boolean zzb() {
        return this.zza.getAll().isEmpty();
    }

    private static java.lang.String zzc(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 4 + java.lang.String.valueOf(str2).length() + java.lang.String.valueOf(str3).length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        return sb.toString();
    }

    private static java.lang.String zza(java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 3 + java.lang.String.valueOf(str2).length());
        sb.append(str);
        sb.append("|S|");
        sb.append(str2);
        return sb.toString();
    }

    public final synchronized void zza() {
        this.zzc.clear();
        this.zza.edit().clear().commit();
    }

    public final synchronized com.google.firebase.iid.zzay zza(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return com.google.firebase.iid.zzay.zza(this.zza.getString(zzc(str, str2, str3), null));
    }

    public final synchronized void zza(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        java.lang.String strZza = com.google.firebase.iid.zzay.zza(str4, str5, java.lang.System.currentTimeMillis());
        if (strZza == null) {
            return;
        }
        android.content.SharedPreferences.Editor editorEdit = this.zza.edit();
        editorEdit.putString(zzc(str, str2, str3), strZza);
        editorEdit.commit();
    }

    public final synchronized void zzb(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String strZzc = zzc(str, str2, str3);
        android.content.SharedPreferences.Editor editorEdit = this.zza.edit();
        editorEdit.remove(strZzc);
        editorEdit.commit();
    }

    public final synchronized long zza(java.lang.String str) {
        java.lang.Long l = this.zzc.get(str);
        if (l != null) {
            return l.longValue();
        }
        return zzd(str);
    }

    private final long zzd(java.lang.String str) {
        java.lang.String string = this.zza.getString(zza(str, "cre"), null);
        if (string == null) {
            return 0L;
        }
        try {
            return java.lang.Long.parseLong(string);
        } catch (java.lang.NumberFormatException unused) {
            return 0L;
        }
    }

    public final synchronized long zzb(java.lang.String str) {
        long jCurrentTimeMillis;
        jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        if (!this.zza.contains(zza(str, "cre"))) {
            android.content.SharedPreferences.Editor editorEdit = this.zza.edit();
            editorEdit.putString(zza(str, "cre"), java.lang.String.valueOf(jCurrentTimeMillis));
            editorEdit.commit();
        } else {
            jCurrentTimeMillis = zzd(str);
        }
        this.zzc.put(str, java.lang.Long.valueOf(jCurrentTimeMillis));
        return jCurrentTimeMillis;
    }

    public final synchronized void zzc(java.lang.String str) {
        java.lang.String strConcat = java.lang.String.valueOf(str).concat("|T|");
        android.content.SharedPreferences.Editor editorEdit = this.zza.edit();
        for (java.lang.String str2 : this.zza.getAll().keySet()) {
            if (str2.startsWith(strConcat)) {
                editorEdit.remove(str2);
            }
        }
        editorEdit.commit();
    }
}
