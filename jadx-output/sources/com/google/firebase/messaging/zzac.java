package com.google.firebase.messaging;

/* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@20.2.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzac extends android.content.BroadcastReceiver {
    final /* synthetic */ com.google.firebase.messaging.zzad zza;
    private com.google.firebase.messaging.zzad zzb;

    public zzac(com.google.firebase.messaging.zzad zzadVar, com.google.firebase.messaging.zzad zzadVar2) {
        this.zza = zzadVar;
        this.zzb = zzadVar2;
    }

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(android.content.Context context, android.content.Intent intent) {
        com.google.firebase.messaging.zzad zzadVar = this.zzb;
        if (zzadVar == null) {
            return;
        }
        if (zzadVar.zzb()) {
            if (com.google.firebase.messaging.zzad.zzc()) {
                android.util.Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
            }
            this.zzb.zzd.zza(this.zzb, 0L);
            context.unregisterReceiver(this);
            this.zzb = null;
        }
    }
}
