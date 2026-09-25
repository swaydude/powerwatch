package com.google.firebase.iid;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@20.2.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzba extends android.content.BroadcastReceiver {

    @javax.annotation.Nullable
    private com.google.firebase.iid.zzbb zza;

    public zzba(com.google.firebase.iid.zzbb zzbbVar) {
        this.zza = zzbbVar;
    }

    public final void zza() {
        if (com.google.firebase.iid.FirebaseInstanceId.zzd()) {
            android.util.Log.d("FirebaseInstanceId", "Connectivity change received registered");
        }
        this.zza.zza().registerReceiver(this, new android.content.IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        com.google.firebase.iid.zzbb zzbbVar = this.zza;
        if (zzbbVar != null && zzbbVar.zzb()) {
            if (com.google.firebase.iid.FirebaseInstanceId.zzd()) {
                android.util.Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
            }
            com.google.firebase.iid.FirebaseInstanceId.zza(this.zza, 0L);
            this.zza.zza().unregisterReceiver(this);
            this.zza = null;
        }
    }
}
