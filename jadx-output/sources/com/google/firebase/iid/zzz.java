package com.google.firebase.iid;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@20.2.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzz implements com.google.firebase.iid.zzb {
    private final java.util.concurrent.ExecutorService zza;

    zzz(java.util.concurrent.ExecutorService executorService) {
        this.zza = executorService;
    }

    @Override // com.google.firebase.iid.zzb
    public final com.google.android.gms.tasks.Task<java.lang.Integer> zza(final android.content.Intent intent) {
        return com.google.android.gms.tasks.Tasks.call(this.zza, new java.util.concurrent.Callable(intent) { // from class: com.google.firebase.iid.zzy
            private final android.content.Intent zza;

            {
                this.zza = intent;
            }

            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                android.content.Intent intent2 = this.zza;
                java.lang.String stringExtra = intent2.getStringExtra("CMD");
                if (stringExtra != null) {
                    if (android.util.Log.isLoggable("FirebaseInstanceId", 3)) {
                        java.lang.String strValueOf = java.lang.String.valueOf(intent2.getExtras());
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(stringExtra).length() + 21 + java.lang.String.valueOf(strValueOf).length());
                        sb.append("Received command: ");
                        sb.append(stringExtra);
                        sb.append(" - ");
                        sb.append(strValueOf);
                        android.util.Log.d("FirebaseInstanceId", sb.toString());
                    }
                    if ("RST".equals(stringExtra) || "RST_FULL".equals(stringExtra)) {
                        com.google.firebase.iid.FirebaseInstanceId.getInstance().zze();
                    } else if ("SYNC".equals(stringExtra)) {
                        com.google.firebase.iid.FirebaseInstanceId.getInstance().zzg();
                    }
                }
                return -1;
            }
        });
    }
}
