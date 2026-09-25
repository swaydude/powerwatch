package com.google.firebase.messaging;

/* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@20.2.0 */
/* JADX INFO: loaded from: classes2.dex */
public class FirebaseMessagingRegistrar implements com.google.firebase.components.ComponentRegistrar {

    /* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@20.2.0 */
    public static class zzb implements com.google.android.datatransport.TransportFactory {
        @Override // com.google.android.datatransport.TransportFactory
        public final <T> com.google.android.datatransport.Transport<T> getTransport(java.lang.String str, java.lang.Class<T> cls, com.google.android.datatransport.Transformer<T, byte[]> transformer) {
            return new com.google.firebase.messaging.FirebaseMessagingRegistrar.zza();
        }

        @Override // com.google.android.datatransport.TransportFactory
        public final <T> com.google.android.datatransport.Transport<T> getTransport(java.lang.String str, java.lang.Class<T> cls, com.google.android.datatransport.Encoding encoding, com.google.android.datatransport.Transformer<T, byte[]> transformer) {
            return new com.google.firebase.messaging.FirebaseMessagingRegistrar.zza();
        }
    }

    /* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@20.2.0 */
    private static class zza<T> implements com.google.android.datatransport.Transport<T> {
        private zza() {
        }

        @Override // com.google.android.datatransport.Transport
        public final void send(com.google.android.datatransport.Event<T> event) {
        }

        @Override // com.google.android.datatransport.Transport
        public final void schedule(com.google.android.datatransport.Event<T> event, com.google.android.datatransport.TransportScheduleCallback transportScheduleCallback) {
            transportScheduleCallback.onSchedule(null);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public java.util.List<com.google.firebase.components.Component<?>> getComponents() {
        return java.util.Arrays.asList(com.google.firebase.components.Component.builder(com.google.firebase.messaging.FirebaseMessaging.class).add(com.google.firebase.components.Dependency.required(com.google.firebase.FirebaseApp.class)).add(com.google.firebase.components.Dependency.required(com.google.firebase.iid.FirebaseInstanceId.class)).add(com.google.firebase.components.Dependency.required(com.google.firebase.platforminfo.UserAgentPublisher.class)).add(com.google.firebase.components.Dependency.required(com.google.firebase.heartbeatinfo.HeartBeatInfo.class)).add(com.google.firebase.components.Dependency.optional(com.google.android.datatransport.TransportFactory.class)).add(com.google.firebase.components.Dependency.required(com.google.firebase.installations.FirebaseInstallationsApi.class)).factory(com.google.firebase.messaging.zzn.zza).alwaysEager().build(), com.google.firebase.platforminfo.LibraryVersionComponent.create("fire-fcm", "20.2.0"));
    }
}
