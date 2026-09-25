package com.google.firebase.analytics.connector.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@17.2.3 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzc implements com.google.firebase.analytics.connector.internal.zza {
    java.util.Set<java.lang.String> zza;
    private com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorListener zzb;
    private com.google.android.gms.measurement.AppMeasurement zzc;
    private com.google.firebase.analytics.connector.internal.zzf zzd;

    public zzc(com.google.android.gms.measurement.AppMeasurement appMeasurement, com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        this.zzb = analyticsConnectorListener;
        this.zzc = appMeasurement;
        com.google.firebase.analytics.connector.internal.zzf zzfVar = new com.google.firebase.analytics.connector.internal.zzf(this);
        this.zzd = zzfVar;
        this.zzc.registerOnMeasurementEventListener(zzfVar);
        this.zza = new java.util.HashSet();
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorListener zza() {
        return this.zzb;
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final void zza(java.util.Set<java.lang.String> set) {
        this.zza.clear();
        java.util.Set<java.lang.String> set2 = this.zza;
        java.util.HashSet hashSet = new java.util.HashSet();
        for (java.lang.String str : set) {
            if (hashSet.size() >= 50) {
                break;
            } else if (com.google.firebase.analytics.connector.internal.zzd.zzd(str) && com.google.firebase.analytics.connector.internal.zzd.zzc(str)) {
                hashSet.add(com.google.firebase.analytics.connector.internal.zzd.zzf(str));
            }
        }
        set2.addAll(hashSet);
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final void zzb() {
        this.zza.clear();
    }
}
