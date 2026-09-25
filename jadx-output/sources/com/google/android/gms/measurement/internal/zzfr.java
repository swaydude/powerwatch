package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
class zzfr extends android.content.BroadcastReceiver {
    private static final java.lang.String zza = "com.google.android.gms.measurement.internal.zzfr";
    private final com.google.android.gms.measurement.internal.zzks zzb;
    private boolean zzc;
    private boolean zzd;

    zzfr(com.google.android.gms.measurement.internal.zzks zzksVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzksVar);
        this.zzb = zzksVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        this.zzb.zzk();
        java.lang.String action = intent.getAction();
        this.zzb.zzr().zzx().zza("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean zZzf = this.zzb.zzd().zzf();
            if (this.zzd != zZzf) {
                this.zzd = zZzf;
                this.zzb.zzq().zza(new com.google.android.gms.measurement.internal.zzfu(this, zZzf));
                return;
            }
            return;
        }
        this.zzb.zzr().zzi().zza("NetworkBroadcastReceiver received unknown action", action);
    }

    public final void zza() {
        this.zzb.zzk();
        this.zzb.zzq().zzd();
        if (this.zzc) {
            return;
        }
        this.zzb.zzn().registerReceiver(this, new android.content.IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.zzd = this.zzb.zzd().zzf();
        this.zzb.zzr().zzx().zza("Registering connectivity change receiver. Network connected", java.lang.Boolean.valueOf(this.zzd));
        this.zzc = true;
    }

    public final void zzb() {
        this.zzb.zzk();
        this.zzb.zzq().zzd();
        this.zzb.zzq().zzd();
        if (this.zzc) {
            this.zzb.zzr().zzx().zza("Unregistering connectivity change receiver");
            this.zzc = false;
            this.zzd = false;
            try {
                this.zzb.zzn().unregisterReceiver(this);
            } catch (java.lang.IllegalArgumentException e) {
                this.zzb.zzr().zzf().zza("Failed to unregister the network broadcast receiver", e);
            }
        }
    }
}
