package io.fabric.sdk.android.services.settings;

/* JADX INFO: loaded from: classes2.dex */
public class AppSettingsData {
    public static final java.lang.String STATUS_ACTIVATED = "activated";
    public static final java.lang.String STATUS_CONFIGURED = "configured";
    public static final java.lang.String STATUS_NEW = "new";
    public final io.fabric.sdk.android.services.settings.AppIconSettingsData icon;
    public final java.lang.String identifier;
    public final java.lang.String ndkReportsUrl;
    public final java.lang.String reportsUrl;
    public final java.lang.String status;
    public final boolean updateRequired;
    public final java.lang.String url;

    public AppSettingsData(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z, io.fabric.sdk.android.services.settings.AppIconSettingsData appIconSettingsData) {
        this.identifier = str;
        this.status = str2;
        this.url = str3;
        this.reportsUrl = str4;
        this.ndkReportsUrl = str5;
        this.updateRequired = z;
        this.icon = appIconSettingsData;
    }
}
