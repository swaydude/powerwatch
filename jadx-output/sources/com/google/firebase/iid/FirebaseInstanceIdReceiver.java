package com.google.firebase.iid;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@20.2.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class FirebaseInstanceIdReceiver extends androidx.legacy.content.WakefulBroadcastReceiver {
    private final java.util.concurrent.ExecutorService zza = com.google.firebase.iid.zzh.zzb();

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        com.google.firebase.iid.zzb zzaVar;
        if (intent == null) {
            return;
        }
        android.os.Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
        android.content.Intent intent2 = parcelableExtra instanceof android.content.Intent ? (android.content.Intent) parcelableExtra : null;
        if (intent2 != null) {
            intent = intent2;
        }
        intent.setComponent(null);
        intent.setPackage(context.getPackageName());
        if (android.os.Build.VERSION.SDK_INT <= 18) {
            intent.removeCategory(context.getPackageName());
        }
        if ("google.com/iid".equals(intent.getStringExtra("from"))) {
            zzaVar = new com.google.firebase.iid.zzz(this.zza);
        } else {
            zzaVar = new com.google.firebase.iid.zza(context, this.zza);
        }
        final boolean zIsOrderedBroadcast = isOrderedBroadcast();
        final android.content.BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        zzaVar.zza(intent).addOnCompleteListener(this.zza, new com.google.android.gms.tasks.OnCompleteListener(zIsOrderedBroadcast, pendingResultGoAsync) { // from class: com.google.firebase.iid.zzr
            private final boolean zza;
            private final android.content.BroadcastReceiver.PendingResult zzb;

            {
                this.zza = zIsOrderedBroadcast;
                this.zzb = pendingResultGoAsync;
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(com.google.android.gms.tasks.Task task) {
                com.google.firebase.iid.FirebaseInstanceIdReceiver.zza(this.zza, this.zzb, task);
            }
        });
    }

    static final /* synthetic */ void zza(boolean z, android.content.BroadcastReceiver.PendingResult pendingResult, com.google.android.gms.tasks.Task task) {
        if (z) {
            pendingResult.setResultCode(task.isSuccessful() ? ((java.lang.Integer) task.getResult()).intValue() : com.baidu.mapapi.UIMsg.d_ResultType.SHORT_URL);
        }
        pendingResult.finish();
    }
}
