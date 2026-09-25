package com.google.firebase.datatransport;

/* JADX INFO: compiled from: com.google.firebase:firebase-datatransport@@17.0.3 */
/* JADX INFO: loaded from: classes2.dex */
public class TransportRegistrar implements com.google.firebase.components.ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public java.util.List<com.google.firebase.components.Component<?>> getComponents() {
        return java.util.Collections.singletonList(com.google.firebase.components.Component.builder(com.google.android.datatransport.TransportFactory.class).add(com.google.firebase.components.Dependency.required(android.content.Context.class)).factory(com.google.firebase.datatransport.TransportRegistrar$$Lambda$1.instance).build());
    }

    static /* synthetic */ com.google.android.datatransport.TransportFactory lambda$getComponents$0(com.google.firebase.components.ComponentContainer componentContainer) {
        com.google.android.datatransport.runtime.TransportRuntime.initialize((android.content.Context) componentContainer.get(android.content.Context.class));
        return com.google.android.datatransport.runtime.TransportRuntime.getInstance().newFactory(com.google.android.datatransport.cct.CCTDestination.LEGACY_INSTANCE);
    }
}
