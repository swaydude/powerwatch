package com.google.firebase.messaging;

/* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@20.2.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzx {
    private final android.content.SharedPreferences zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private final java.util.concurrent.Executor zze;
    private final java.util.ArrayDeque<java.lang.String> zzd = new java.util.ArrayDeque<>();
    private boolean zzf = false;

    private zzx(android.content.SharedPreferences sharedPreferences, java.lang.String str, java.lang.String str2, java.util.concurrent.Executor executor) {
        this.zza = sharedPreferences;
        this.zzb = str;
        this.zzc = str2;
        this.zze = executor;
    }

    static com.google.firebase.messaging.zzx zza(android.content.SharedPreferences sharedPreferences, java.lang.String str, java.lang.String str2, java.util.concurrent.Executor executor) {
        com.google.firebase.messaging.zzx zzxVar = new com.google.firebase.messaging.zzx(sharedPreferences, str, str2, executor);
        synchronized (zzxVar.zzd) {
            zzxVar.zzd.clear();
            java.lang.String string = zzxVar.zza.getString(zzxVar.zzb, "");
            if (!android.text.TextUtils.isEmpty(string) && string.contains(zzxVar.zzc)) {
                java.lang.String[] strArrSplit = string.split(zzxVar.zzc, -1);
                if (strArrSplit.length == 0) {
                    android.util.Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                }
                for (java.lang.String str3 : strArrSplit) {
                    if (!android.text.TextUtils.isEmpty(str3)) {
                        zzxVar.zzd.add(str3);
                    }
                }
            }
        }
        return zzxVar;
    }

    public final boolean zza(java.lang.String str) {
        boolean zZza;
        if (android.text.TextUtils.isEmpty(str) || str.contains(this.zzc)) {
            return false;
        }
        synchronized (this.zzd) {
            zZza = zza(this.zzd.add(str));
        }
        return zZza;
    }

    private final boolean zza(boolean z) {
        if (z) {
            this.zze.execute(new java.lang.Runnable(this) { // from class: com.google.firebase.messaging.zzw
                private final com.google.firebase.messaging.zzx zza;

                {
                    this.zza = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzb();
                }
            });
        }
        return z;
    }

    public final boolean zza(java.lang.Object obj) {
        boolean zZza;
        synchronized (this.zzd) {
            zZza = zza(this.zzd.remove(obj));
        }
        return zZza;
    }

    public final java.lang.String zza() {
        java.lang.String strPeek;
        synchronized (this.zzd) {
            strPeek = this.zzd.peek();
        }
        return strPeek;
    }

    final /* synthetic */ void zzb() {
        synchronized (this.zzd) {
            android.content.SharedPreferences.Editor editorEdit = this.zza.edit();
            java.lang.String str = this.zzb;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.util.Iterator<java.lang.String> it = this.zzd.iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append(this.zzc);
            }
            editorEdit.putString(str, sb.toString()).commit();
        }
    }
}
