package com.google.firebase.iid;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@20.2.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzat {
    private final java.util.concurrent.Executor zza;
    private final java.util.Map<android.util.Pair<java.lang.String, java.lang.String>, com.google.android.gms.tasks.Task<com.google.firebase.iid.InstanceIdResult>> zzb = new androidx.collection.ArrayMap();

    zzat(java.util.concurrent.Executor executor) {
        this.zza = executor;
    }

    final synchronized com.google.android.gms.tasks.Task<com.google.firebase.iid.InstanceIdResult> zza(java.lang.String str, java.lang.String str2, com.google.firebase.iid.zzav zzavVar) {
        final android.util.Pair<java.lang.String, java.lang.String> pair = new android.util.Pair<>(str, str2);
        com.google.android.gms.tasks.Task<com.google.firebase.iid.InstanceIdResult> task = this.zzb.get(pair);
        if (task != null) {
            if (android.util.Log.isLoggable("FirebaseInstanceId", 3)) {
                java.lang.String strValueOf = java.lang.String.valueOf(pair);
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 29);
                sb.append("Joining ongoing request for: ");
                sb.append(strValueOf);
                android.util.Log.d("FirebaseInstanceId", sb.toString());
            }
            return task;
        }
        if (android.util.Log.isLoggable("FirebaseInstanceId", 3)) {
            java.lang.String strValueOf2 = java.lang.String.valueOf(pair);
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf2).length() + 24);
            sb2.append("Making new request for: ");
            sb2.append(strValueOf2);
            android.util.Log.d("FirebaseInstanceId", sb2.toString());
        }
        com.google.android.gms.tasks.Task taskContinueWithTask = zzavVar.zza().continueWithTask(this.zza, new com.google.android.gms.tasks.Continuation(this, pair) { // from class: com.google.firebase.iid.zzas
            private final com.google.firebase.iid.zzat zza;
            private final android.util.Pair zzb;

            {
                this.zza = this;
                this.zzb = pair;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public final java.lang.Object then(com.google.android.gms.tasks.Task task2) {
                return this.zza.zza(this.zzb, task2);
            }
        });
        this.zzb.put(pair, (com.google.android.gms.tasks.Task<com.google.firebase.iid.InstanceIdResult>) taskContinueWithTask);
        return taskContinueWithTask;
    }

    final /* synthetic */ com.google.android.gms.tasks.Task zza(android.util.Pair pair, com.google.android.gms.tasks.Task task) throws java.lang.Exception {
        synchronized (this) {
            this.zzb.remove(pair);
        }
        return task;
    }
}
