package com.google.firebase.analytics.connector;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@17.2.3 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zza implements com.google.firebase.events.EventHandler {
    static final com.google.firebase.events.EventHandler zza = new com.google.firebase.analytics.connector.zza();

    private zza() {
    }

    @Override // com.google.firebase.events.EventHandler
    public final void handle(com.google.firebase.events.Event event) {
        com.google.firebase.analytics.connector.AnalyticsConnectorImpl.zza(event);
    }
}
