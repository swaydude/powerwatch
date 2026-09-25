package com.google.firebase.iid;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@20.2.0 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzaq implements com.google.firebase.components.ComponentFactory {
    static final com.google.firebase.components.ComponentFactory zza = new com.google.firebase.iid.zzaq();

    private zzaq() {
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final java.lang.Object create(com.google.firebase.components.ComponentContainer componentContainer) {
        return new com.google.firebase.iid.FirebaseInstanceId((com.google.firebase.FirebaseApp) componentContainer.get(com.google.firebase.FirebaseApp.class), (com.google.firebase.events.Subscriber) componentContainer.get(com.google.firebase.events.Subscriber.class), (com.google.firebase.platforminfo.UserAgentPublisher) componentContainer.get(com.google.firebase.platforminfo.UserAgentPublisher.class), (com.google.firebase.heartbeatinfo.HeartBeatInfo) componentContainer.get(com.google.firebase.heartbeatinfo.HeartBeatInfo.class), (com.google.firebase.installations.FirebaseInstallationsApi) componentContainer.get(com.google.firebase.installations.FirebaseInstallationsApi.class));
    }
}
