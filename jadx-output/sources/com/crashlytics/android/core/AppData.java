package com.crashlytics.android.core;

/* JADX INFO: loaded from: classes.dex */
class AppData {
    public final java.lang.String apiKey;
    public final java.lang.String buildId;
    public final java.lang.String installerPackageName;
    public final java.lang.String packageName;
    public final java.lang.String versionCode;
    public final java.lang.String versionName;

    public static com.crashlytics.android.core.AppData create(android.content.Context context, io.fabric.sdk.android.services.common.IdManager idManager, java.lang.String str, java.lang.String str2) throws android.content.pm.PackageManager.NameNotFoundException {
        java.lang.String packageName = context.getPackageName();
        java.lang.String installerPackageName = idManager.getInstallerPackageName();
        android.content.pm.PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        return new com.crashlytics.android.core.AppData(str, str2, installerPackageName, packageName, java.lang.Integer.toString(packageInfo.versionCode), packageInfo.versionName == null ? io.fabric.sdk.android.services.common.IdManager.DEFAULT_VERSION_NAME : packageInfo.versionName);
    }

    AppData(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        this.apiKey = str;
        this.buildId = str2;
        this.installerPackageName = str3;
        this.packageName = str4;
        this.versionCode = str5;
        this.versionName = str6;
    }
}
