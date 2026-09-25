package com.google.android.gms.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementReceiver extends androidx.legacy.content.WakefulBroadcastReceiver implements com.google.android.gms.measurement.internal.zzgf {
    private com.google.android.gms.measurement.internal.zzge zza;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        if (this.zza == null) {
            this.zza = new com.google.android.gms.measurement.internal.zzge(this);
        }
        this.zza.zza(context, intent);
    }

    @Override // com.google.android.gms.measurement.internal.zzgf
    public final void doStartService(android.content.Context context, android.content.Intent intent) {
        startWakefulService(context, intent);
    }

    @Override // com.google.android.gms.measurement.internal.zzgf
    public final android.content.BroadcastReceiver.PendingResult doGoAsync() {
        return goAsync();
    }
}
