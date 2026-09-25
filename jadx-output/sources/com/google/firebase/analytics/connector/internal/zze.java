package com.google.firebase.analytics.connector.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@17.2.3 */
/* JADX INFO: loaded from: classes2.dex */
public final class zze implements com.google.firebase.analytics.connector.internal.zza {
    private com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorListener zza;
    private com.google.android.gms.measurement.AppMeasurement zzb;
    private com.google.firebase.analytics.connector.internal.zzg zzc;

    public zze(com.google.android.gms.measurement.AppMeasurement appMeasurement, com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        this.zza = analyticsConnectorListener;
        this.zzb = appMeasurement;
        com.google.firebase.analytics.connector.internal.zzg zzgVar = new com.google.firebase.analytics.connector.internal.zzg(this);
        this.zzc = zzgVar;
        this.zzb.registerOnMeasurementEventListener(zzgVar);
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final void zza(java.util.Set<java.lang.String> set) {
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final void zzb() {
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorListener zza() {
        return this.zza;
    }
}
