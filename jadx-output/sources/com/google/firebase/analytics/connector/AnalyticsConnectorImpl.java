package com.google.firebase.analytics.connector;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@17.2.3 */
/* JADX INFO: loaded from: classes2.dex */
public class AnalyticsConnectorImpl implements com.google.firebase.analytics.connector.AnalyticsConnector {
    private static volatile com.google.firebase.analytics.connector.AnalyticsConnector zzb;
    final java.util.Map<java.lang.String, com.google.firebase.analytics.connector.internal.zza> zza;
    private final com.google.android.gms.measurement.AppMeasurement zzc;

    private AnalyticsConnectorImpl(com.google.android.gms.measurement.AppMeasurement appMeasurement) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(appMeasurement);
        this.zzc = appMeasurement;
        this.zza = new java.util.concurrent.ConcurrentHashMap();
    }

    public static com.google.firebase.analytics.connector.AnalyticsConnector getInstance(com.google.firebase.FirebaseApp firebaseApp, android.content.Context context, com.google.firebase.events.Subscriber subscriber) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(firebaseApp);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(subscriber);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context.getApplicationContext());
        if (zzb == null) {
            synchronized (com.google.firebase.analytics.connector.AnalyticsConnectorImpl.class) {
                if (zzb == null) {
                    android.os.Bundle bundle = new android.os.Bundle(1);
                    if (firebaseApp.isDefaultApp()) {
                        subscriber.subscribe(com.google.firebase.DataCollectionDefaultChange.class, com.google.firebase.analytics.connector.zzb.zza, com.google.firebase.analytics.connector.zza.zza);
                        bundle.putBoolean("dataCollectionDefaultEnabled", firebaseApp.isDataCollectionDefaultEnabled());
                    }
                    zzb = new com.google.firebase.analytics.connector.AnalyticsConnectorImpl(com.google.android.gms.measurement.AppMeasurement.zza(context, bundle));
                }
            }
        }
        return zzb;
    }

    public static com.google.firebase.analytics.connector.AnalyticsConnector getInstance() {
        return getInstance(com.google.firebase.FirebaseApp.getInstance());
    }

    public static com.google.firebase.analytics.connector.AnalyticsConnector getInstance(com.google.firebase.FirebaseApp firebaseApp) {
        return (com.google.firebase.analytics.connector.AnalyticsConnector) firebaseApp.get(com.google.firebase.analytics.connector.AnalyticsConnector.class);
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public void logEvent(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        if (bundle == null) {
            bundle = new android.os.Bundle();
        }
        if (com.google.firebase.analytics.connector.internal.zzd.zza(str) && com.google.firebase.analytics.connector.internal.zzd.zza(str2, bundle) && com.google.firebase.analytics.connector.internal.zzd.zza(str, str2, bundle)) {
            com.google.firebase.analytics.connector.internal.zzd.zzb(str, str2, bundle);
            this.zzc.logEventInternal(str, str2, bundle);
        }
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public void setUserProperty(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        if (com.google.firebase.analytics.connector.internal.zzd.zza(str) && com.google.firebase.analytics.connector.internal.zzd.zza(str, str2)) {
            this.zzc.setUserPropertyInternal(str, str2, obj);
        }
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public java.util.Map<java.lang.String, java.lang.Object> getUserProperties(boolean z) {
        return this.zzc.getUserProperties(z);
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorHandle registerAnalyticsConnectorListener(final java.lang.String str, com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        com.google.firebase.analytics.connector.internal.zza zzeVar;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(analyticsConnectorListener);
        if (!com.google.firebase.analytics.connector.internal.zzd.zza(str) || zza(str)) {
            return null;
        }
        com.google.android.gms.measurement.AppMeasurement appMeasurement = this.zzc;
        if ("fiam".equals(str)) {
            zzeVar = new com.google.firebase.analytics.connector.internal.zzc(appMeasurement, analyticsConnectorListener);
        } else {
            zzeVar = ("crash".equals(str) || "clx".equals(str)) ? new com.google.firebase.analytics.connector.internal.zze(appMeasurement, analyticsConnectorListener) : null;
        }
        if (zzeVar == null) {
            return null;
        }
        this.zza.put(str, zzeVar);
        return new com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorHandle() { // from class: com.google.firebase.analytics.connector.AnalyticsConnectorImpl.1
            @Override // com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorHandle
            public void unregister() {
                if (com.google.firebase.analytics.connector.AnalyticsConnectorImpl.this.zza(str)) {
                    com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListenerZza = com.google.firebase.analytics.connector.AnalyticsConnectorImpl.this.zza.get(str).zza();
                    if (analyticsConnectorListenerZza != null) {
                        analyticsConnectorListenerZza.onMessageTriggered(0, null);
                    }
                    com.google.firebase.analytics.connector.AnalyticsConnectorImpl.this.zza.remove(str);
                }
            }

            @Override // com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorHandle
            public void registerEventNames(java.util.Set<java.lang.String> set) {
                if (!com.google.firebase.analytics.connector.AnalyticsConnectorImpl.this.zza(str) || !str.equals("fiam") || set == null || set.isEmpty()) {
                    return;
                }
                com.google.firebase.analytics.connector.AnalyticsConnectorImpl.this.zza.get(str).zza(set);
            }

            @Override // com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorHandle
            public void unregisterEventNames() {
                if (com.google.firebase.analytics.connector.AnalyticsConnectorImpl.this.zza(str) && str.equals("fiam")) {
                    com.google.firebase.analytics.connector.AnalyticsConnectorImpl.this.zza.get(str).zzb();
                }
            }
        };
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public void setConditionalUserProperty(com.google.firebase.analytics.connector.AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
        if (com.google.firebase.analytics.connector.internal.zzd.zza(conditionalUserProperty)) {
            this.zzc.setConditionalUserProperty(com.google.firebase.analytics.connector.internal.zzd.zzb(conditionalUserProperty));
        }
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public void clearConditionalUserProperty(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        if (str2 == null || com.google.firebase.analytics.connector.internal.zzd.zza(str2, bundle)) {
            this.zzc.clearConditionalUserProperty(str, str2, bundle);
        }
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public java.util.List<com.google.firebase.analytics.connector.AnalyticsConnector.ConditionalUserProperty> getConditionalUserProperties(java.lang.String str, java.lang.String str2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty> it = this.zzc.getConditionalUserProperties(str, str2).iterator();
        while (it.hasNext()) {
            arrayList.add(com.google.firebase.analytics.connector.internal.zzd.zza(it.next()));
        }
        return arrayList;
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public int getMaxUserProperties(java.lang.String str) {
        return this.zzc.getMaxUserProperties(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zza(java.lang.String str) {
        return (str.isEmpty() || !this.zza.containsKey(str) || this.zza.get(str) == null) ? false : true;
    }

    static final /* synthetic */ void zza(com.google.firebase.events.Event event) {
        boolean z = ((com.google.firebase.DataCollectionDefaultChange) event.getPayload()).enabled;
        synchronized (com.google.firebase.analytics.connector.AnalyticsConnectorImpl.class) {
            ((com.google.firebase.analytics.connector.AnalyticsConnectorImpl) zzb).zzc.zza(z);
        }
    }
}
