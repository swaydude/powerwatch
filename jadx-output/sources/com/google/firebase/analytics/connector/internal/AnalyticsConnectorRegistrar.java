package com.google.firebase.analytics.connector.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@17.2.3 */
/* JADX INFO: loaded from: classes2.dex */
public class AnalyticsConnectorRegistrar implements com.google.firebase.components.ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public java.util.List<com.google.firebase.components.Component<?>> getComponents() {
        return java.util.Arrays.asList(com.google.firebase.components.Component.builder(com.google.firebase.analytics.connector.AnalyticsConnector.class).add(com.google.firebase.components.Dependency.required(com.google.firebase.FirebaseApp.class)).add(com.google.firebase.components.Dependency.required(android.content.Context.class)).add(com.google.firebase.components.Dependency.required(com.google.firebase.events.Subscriber.class)).factory(com.google.firebase.analytics.connector.internal.zzb.zza).eagerInDefaultApp().build(), com.google.firebase.platforminfo.LibraryVersionComponent.create("fire-analytics", "17.2.3"));
    }
}
