package io.fabric.sdk.android;

/* JADX INFO: loaded from: classes2.dex */
public class KitInfo {
    private final java.lang.String buildType;
    private final java.lang.String identifier;
    private final java.lang.String version;

    public KitInfo(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.identifier = str;
        this.version = str2;
        this.buildType = str3;
    }

    public java.lang.String getIdentifier() {
        return this.identifier;
    }

    public java.lang.String getVersion() {
        return this.version;
    }

    public java.lang.String getBuildType() {
        return this.buildType;
    }
}
