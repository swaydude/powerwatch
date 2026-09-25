package com.google.firebase.analytics.connector.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@17.2.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzf implements com.google.android.gms.measurement.AppMeasurement.OnEventListener {
    private final /* synthetic */ com.google.firebase.analytics.connector.internal.zzc zza;

    public zzf(com.google.firebase.analytics.connector.internal.zzc zzcVar) {
        this.zza = zzcVar;
    }

    @Override // com.google.android.gms.measurement.AppMeasurement.OnEventListener, com.google.android.gms.measurement.internal.zzhn
    public final void onEvent(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, long j) {
        if (this.zza.zza.contains(str2)) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putString("events", com.google.firebase.analytics.connector.internal.zzd.zze(str2));
            this.zza.zzb.onMessageTriggered(2, bundle2);
        }
    }
}
