package com.google.firebase.messaging;

/* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@20.2.0 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzn implements com.google.firebase.components.ComponentFactory {
    static final com.google.firebase.components.ComponentFactory zza = new com.google.firebase.messaging.zzn();

    private zzn() {
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final java.lang.Object create(com.google.firebase.components.ComponentContainer componentContainer) {
        com.google.firebase.FirebaseApp firebaseApp = (com.google.firebase.FirebaseApp) componentContainer.get(com.google.firebase.FirebaseApp.class);
        com.google.firebase.iid.FirebaseInstanceId firebaseInstanceId = (com.google.firebase.iid.FirebaseInstanceId) componentContainer.get(com.google.firebase.iid.FirebaseInstanceId.class);
        com.google.firebase.platforminfo.UserAgentPublisher userAgentPublisher = (com.google.firebase.platforminfo.UserAgentPublisher) componentContainer.get(com.google.firebase.platforminfo.UserAgentPublisher.class);
        com.google.firebase.heartbeatinfo.HeartBeatInfo heartBeatInfo = (com.google.firebase.heartbeatinfo.HeartBeatInfo) componentContainer.get(com.google.firebase.heartbeatinfo.HeartBeatInfo.class);
        com.google.firebase.installations.FirebaseInstallationsApi firebaseInstallationsApi = (com.google.firebase.installations.FirebaseInstallationsApi) componentContainer.get(com.google.firebase.installations.FirebaseInstallationsApi.class);
        com.google.android.datatransport.TransportFactory zzbVar = (com.google.android.datatransport.TransportFactory) componentContainer.get(com.google.android.datatransport.TransportFactory.class);
        if (zzbVar == null || !com.google.android.datatransport.cct.CCTDestination.LEGACY_INSTANCE.getSupportedEncodings().contains(com.google.android.datatransport.Encoding.of("json"))) {
            zzbVar = new com.google.firebase.messaging.FirebaseMessagingRegistrar.zzb();
        }
        return new com.google.firebase.messaging.FirebaseMessaging(firebaseApp, firebaseInstanceId, userAgentPublisher, heartBeatInfo, firebaseInstallationsApi, zzbVar);
    }
}
