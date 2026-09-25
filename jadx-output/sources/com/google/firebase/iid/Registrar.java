package com.google.firebase.iid;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@20.2.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class Registrar implements com.google.firebase.components.ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final java.util.List<com.google.firebase.components.Component<?>> getComponents() {
        return java.util.Arrays.asList(com.google.firebase.components.Component.builder(com.google.firebase.iid.FirebaseInstanceId.class).add(com.google.firebase.components.Dependency.required(com.google.firebase.FirebaseApp.class)).add(com.google.firebase.components.Dependency.required(com.google.firebase.events.Subscriber.class)).add(com.google.firebase.components.Dependency.required(com.google.firebase.platforminfo.UserAgentPublisher.class)).add(com.google.firebase.components.Dependency.required(com.google.firebase.heartbeatinfo.HeartBeatInfo.class)).add(com.google.firebase.components.Dependency.required(com.google.firebase.installations.FirebaseInstallationsApi.class)).factory(com.google.firebase.iid.zzaq.zza).alwaysEager().build(), com.google.firebase.components.Component.builder(com.google.firebase.iid.internal.FirebaseInstanceIdInternal.class).add(com.google.firebase.components.Dependency.required(com.google.firebase.iid.FirebaseInstanceId.class)).factory(com.google.firebase.iid.zzar.zza).build(), com.google.firebase.platforminfo.LibraryVersionComponent.create("fire-iid", "20.2.0"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: com.google.firebase:firebase-iid@@20.2.0 */
    static class zza implements com.google.firebase.iid.internal.FirebaseInstanceIdInternal {
        private final com.google.firebase.iid.FirebaseInstanceId zza;

        public zza(com.google.firebase.iid.FirebaseInstanceId firebaseInstanceId) {
            this.zza = firebaseInstanceId;
        }

        @Override // com.google.firebase.iid.internal.FirebaseInstanceIdInternal
        public final java.lang.String getId() {
            return this.zza.getId();
        }

        @Override // com.google.firebase.iid.internal.FirebaseInstanceIdInternal
        public final java.lang.String getToken() {
            return this.zza.getToken();
        }
    }
}
