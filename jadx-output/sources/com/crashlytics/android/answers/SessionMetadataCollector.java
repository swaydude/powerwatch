package com.crashlytics.android.answers;

/* JADX INFO: loaded from: classes.dex */
class SessionMetadataCollector {
    private final android.content.Context context;
    private final io.fabric.sdk.android.services.common.IdManager idManager;
    private final java.lang.String versionCode;
    private final java.lang.String versionName;

    public SessionMetadataCollector(android.content.Context context, io.fabric.sdk.android.services.common.IdManager idManager, java.lang.String str, java.lang.String str2) {
        this.context = context;
        this.idManager = idManager;
        this.versionCode = str;
        this.versionName = str2;
    }

    public com.crashlytics.android.answers.SessionEventMetadata getMetadata() {
        java.util.Map<io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType, java.lang.String> deviceIdentifiers = this.idManager.getDeviceIdentifiers();
        return new com.crashlytics.android.answers.SessionEventMetadata(this.idManager.getAppIdentifier(), java.util.UUID.randomUUID().toString(), this.idManager.getAppInstallIdentifier(), this.idManager.isLimitAdTrackingEnabled(), deviceIdentifiers.get(io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType.FONT_TOKEN), io.fabric.sdk.android.services.common.CommonUtils.resolveBuildId(this.context), this.idManager.getOsVersionString(), this.idManager.getModelName(), this.versionCode, this.versionName);
    }
}
