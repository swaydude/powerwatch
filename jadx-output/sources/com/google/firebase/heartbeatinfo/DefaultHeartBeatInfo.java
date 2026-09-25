package com.google.firebase.heartbeatinfo;

/* JADX INFO: compiled from: com.google.firebase:firebase-common@@19.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public class DefaultHeartBeatInfo implements com.google.firebase.heartbeatinfo.HeartBeatInfo {
    private com.google.firebase.heartbeatinfo.HeartBeatInfoStorage storage;

    private DefaultHeartBeatInfo(android.content.Context context) {
        this.storage = com.google.firebase.heartbeatinfo.HeartBeatInfoStorage.getInstance(context);
    }

    DefaultHeartBeatInfo(com.google.firebase.heartbeatinfo.HeartBeatInfoStorage heartBeatInfoStorage) {
        this.storage = heartBeatInfoStorage;
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatInfo
    public com.google.firebase.heartbeatinfo.HeartBeatInfo.HeartBeat getHeartBeatCode(java.lang.String str) {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        boolean zShouldSendSdkHeartBeat = this.storage.shouldSendSdkHeartBeat(str, jCurrentTimeMillis);
        boolean zShouldSendGlobalHeartBeat = this.storage.shouldSendGlobalHeartBeat(jCurrentTimeMillis);
        if (zShouldSendSdkHeartBeat && zShouldSendGlobalHeartBeat) {
            return com.google.firebase.heartbeatinfo.HeartBeatInfo.HeartBeat.COMBINED;
        }
        if (zShouldSendGlobalHeartBeat) {
            return com.google.firebase.heartbeatinfo.HeartBeatInfo.HeartBeat.GLOBAL;
        }
        if (zShouldSendSdkHeartBeat) {
            return com.google.firebase.heartbeatinfo.HeartBeatInfo.HeartBeat.SDK;
        }
        return com.google.firebase.heartbeatinfo.HeartBeatInfo.HeartBeat.NONE;
    }

    public static com.google.firebase.components.Component<com.google.firebase.heartbeatinfo.HeartBeatInfo> component() {
        return com.google.firebase.components.Component.builder(com.google.firebase.heartbeatinfo.HeartBeatInfo.class).add(com.google.firebase.components.Dependency.required(android.content.Context.class)).factory(com.google.firebase.heartbeatinfo.DefaultHeartBeatInfo$$Lambda$1.instance).build();
    }

    static /* synthetic */ com.google.firebase.heartbeatinfo.HeartBeatInfo lambda$component$0(com.google.firebase.components.ComponentContainer componentContainer) {
        return new com.google.firebase.heartbeatinfo.DefaultHeartBeatInfo((android.content.Context) componentContainer.get(android.content.Context.class));
    }
}
