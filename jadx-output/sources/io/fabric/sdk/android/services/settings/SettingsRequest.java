package io.fabric.sdk.android.services.settings;

/* JADX INFO: loaded from: classes2.dex */
public class SettingsRequest {
    public final java.lang.String apiKey;
    public final java.lang.String buildVersion;
    public final java.lang.String deviceModel;
    public final java.lang.String displayVersion;
    public final java.lang.String iconHash;
    public final java.lang.String installationId;
    public final java.lang.String instanceId;
    public final java.lang.String osBuildVersion;
    public final java.lang.String osDisplayVersion;
    public final int source;

    public SettingsRequest(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, int i, java.lang.String str9) {
        this.apiKey = str;
        this.deviceModel = str2;
        this.osBuildVersion = str3;
        this.osDisplayVersion = str4;
        this.installationId = str5;
        this.instanceId = str6;
        this.displayVersion = str7;
        this.buildVersion = str8;
        this.source = i;
        this.iconHash = str9;
    }
}
