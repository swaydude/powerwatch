package com.google.firebase.iid;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@20.2.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbc extends android.os.Binder {
    private final com.google.firebase.iid.zzbe zza;

    public zzbc(com.google.firebase.iid.zzbe zzbeVar) {
        this.zza = zzbeVar;
    }

    final void zza(final com.google.firebase.iid.zzbg zzbgVar) {
        if (android.os.Binder.getCallingUid() != android.os.Process.myUid()) {
            throw new java.lang.SecurityException("Binding only allowed within app");
        }
        if (android.util.Log.isLoggable("FirebaseInstanceId", 3)) {
            android.util.Log.d("FirebaseInstanceId", "service received new intent via bind strategy");
        }
        this.zza.zza(zzbgVar.zza).addOnCompleteListener(com.google.firebase.iid.zzh.zza(), new com.google.android.gms.tasks.OnCompleteListener(zzbgVar) { // from class: com.google.firebase.iid.zzbf
            private final com.google.firebase.iid.zzbg zza;

            {
                this.zza = zzbgVar;
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(com.google.android.gms.tasks.Task task) {
                this.zza.zzb();
            }
        });
    }
}
