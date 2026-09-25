package com.google.firebase.analytics.connector.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@17.2.3 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzb implements com.google.firebase.components.ComponentFactory {
    static final com.google.firebase.components.ComponentFactory zza = new com.google.firebase.analytics.connector.internal.zzb();

    private zzb() {
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final java.lang.Object create(com.google.firebase.components.ComponentContainer componentContainer) {
        return com.google.firebase.analytics.connector.AnalyticsConnectorImpl.getInstance((com.google.firebase.FirebaseApp) componentContainer.get(com.google.firebase.FirebaseApp.class), (android.content.Context) componentContainer.get(android.content.Context.class), (com.google.firebase.events.Subscriber) componentContainer.get(com.google.firebase.events.Subscriber.class));
    }
}
