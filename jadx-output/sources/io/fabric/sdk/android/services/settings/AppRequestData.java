package io.fabric.sdk.android.services.settings;

/* JADX INFO: loaded from: classes2.dex */
public class AppRequestData {
    public final java.lang.String apiKey;
    public final java.lang.String appId;
    public final java.lang.String buildVersion;
    public final java.lang.String builtSdkVersion;
    public final java.lang.String displayVersion;
    public final io.fabric.sdk.android.services.settings.IconRequest icon;
    public final java.lang.String instanceIdentifier;
    public final java.lang.String minSdkVersion;
    public final java.lang.String name;
    public final java.util.Collection<io.fabric.sdk.android.KitInfo> sdkKits;
    public final int source;

    public AppRequestData(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, java.lang.String str7, java.lang.String str8, io.fabric.sdk.android.services.settings.IconRequest iconRequest, java.util.Collection<io.fabric.sdk.android.KitInfo> collection) {
        this.apiKey = str;
        this.appId = str2;
        this.displayVersion = str3;
        this.buildVersion = str4;
        this.instanceIdentifier = str5;
        this.name = str6;
        this.source = i;
        this.minSdkVersion = str7;
        this.builtSdkVersion = str8;
        this.icon = iconRequest;
        this.sdkKits = collection;
    }
}
