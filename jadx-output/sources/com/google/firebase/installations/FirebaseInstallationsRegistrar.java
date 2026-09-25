package com.google.firebase.installations;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseInstallationsRegistrar implements com.google.firebase.components.ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public java.util.List<com.google.firebase.components.Component<?>> getComponents() {
        return java.util.Arrays.asList(com.google.firebase.components.Component.builder(com.google.firebase.installations.FirebaseInstallationsApi.class).add(com.google.firebase.components.Dependency.required(com.google.firebase.FirebaseApp.class)).add(com.google.firebase.components.Dependency.required(com.google.firebase.heartbeatinfo.HeartBeatInfo.class)).add(com.google.firebase.components.Dependency.required(com.google.firebase.platforminfo.UserAgentPublisher.class)).factory(com.google.firebase.installations.FirebaseInstallationsRegistrar$$Lambda$1.instance).build(), com.google.firebase.platforminfo.LibraryVersionComponent.create("fire-installations", com.google.firebase.installations.BuildConfig.VERSION_NAME));
    }

    static /* synthetic */ com.google.firebase.installations.FirebaseInstallationsApi lambda$getComponents$0(com.google.firebase.components.ComponentContainer componentContainer) {
        return new com.google.firebase.installations.FirebaseInstallations((com.google.firebase.FirebaseApp) componentContainer.get(com.google.firebase.FirebaseApp.class), (com.google.firebase.platforminfo.UserAgentPublisher) componentContainer.get(com.google.firebase.platforminfo.UserAgentPublisher.class), (com.google.firebase.heartbeatinfo.HeartBeatInfo) componentContainer.get(com.google.firebase.heartbeatinfo.HeartBeatInfo.class));
    }
}
