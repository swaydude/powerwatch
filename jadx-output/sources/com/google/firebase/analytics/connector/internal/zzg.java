package com.google.firebase.analytics.connector.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@17.2.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzg implements com.google.android.gms.measurement.AppMeasurement.OnEventListener {
    private final /* synthetic */ com.google.firebase.analytics.connector.internal.zze zza;

    public zzg(com.google.firebase.analytics.connector.internal.zze zzeVar) {
        this.zza = zzeVar;
    }

    @Override // com.google.android.gms.measurement.AppMeasurement.OnEventListener, com.google.android.gms.measurement.internal.zzhn
    public final void onEvent(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, long j) {
        if (str == null || str.equals("crash") || !com.google.firebase.analytics.connector.internal.zzd.zzb(str2)) {
            return;
        }
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, str2);
        bundle2.putLong("timestampInMillis", j);
        bundle2.putBundle("params", bundle);
        this.zza.zza.onMessageTriggered(3, bundle2);
    }
}
