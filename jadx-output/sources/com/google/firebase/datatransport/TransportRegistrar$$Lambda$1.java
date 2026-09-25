package com.google.firebase.datatransport;

/* JADX INFO: compiled from: com.google.firebase:firebase-datatransport@@17.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class TransportRegistrar$$Lambda$1 implements com.google.firebase.components.ComponentFactory {
    private static final com.google.firebase.datatransport.TransportRegistrar$$Lambda$1 instance = new com.google.firebase.datatransport.TransportRegistrar$$Lambda$1();

    private TransportRegistrar$$Lambda$1() {
    }

    @Override // com.google.firebase.components.ComponentFactory
    public java.lang.Object create(com.google.firebase.components.ComponentContainer componentContainer) {
        return com.google.firebase.datatransport.TransportRegistrar.lambda$getComponents$0(componentContainer);
    }
}
