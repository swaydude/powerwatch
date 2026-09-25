package com.crashlytics.android.answers;

/* JADX INFO: loaded from: classes.dex */
final class SessionEventMetadata {
    public final java.lang.String appBundleId;
    public final java.lang.String appVersionCode;
    public final java.lang.String appVersionName;
    public final java.lang.String betaDeviceToken;
    public final java.lang.String buildId;
    public final java.lang.String deviceModel;
    public final java.lang.String executionId;
    public final java.lang.String installationId;
    public final java.lang.Boolean limitAdTrackingEnabled;
    public final java.lang.String osVersion;
    private java.lang.String stringRepresentation;

    public SessionEventMetadata(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Boolean bool, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9) {
        this.appBundleId = str;
        this.executionId = str2;
        this.installationId = str3;
        this.limitAdTrackingEnabled = bool;
        this.betaDeviceToken = str4;
        this.buildId = str5;
        this.osVersion = str6;
        this.deviceModel = str7;
        this.appVersionCode = str8;
        this.appVersionName = str9;
    }

    public java.lang.String toString() {
        if (this.stringRepresentation == null) {
            this.stringRepresentation = "appBundleId=" + this.appBundleId + ", executionId=" + this.executionId + ", installationId=" + this.installationId + ", limitAdTrackingEnabled=" + this.limitAdTrackingEnabled + ", betaDeviceToken=" + this.betaDeviceToken + ", buildId=" + this.buildId + ", osVersion=" + this.osVersion + ", deviceModel=" + this.deviceModel + ", appVersionCode=" + this.appVersionCode + ", appVersionName=" + this.appVersionName;
        }
        return this.stringRepresentation;
    }
}
