package io.fabric.sdk.android.services.common;

/* JADX INFO: loaded from: classes2.dex */
public class InstallerPackageNameProvider {
    private static final java.lang.String NO_INSTALLER_PACKAGE_NAME = "";
    private final io.fabric.sdk.android.services.cache.ValueLoader<java.lang.String> installerPackageNameLoader = new io.fabric.sdk.android.services.cache.ValueLoader<java.lang.String>() { // from class: io.fabric.sdk.android.services.common.InstallerPackageNameProvider.1
        @Override // io.fabric.sdk.android.services.cache.ValueLoader
        public java.lang.String load(android.content.Context context) throws java.lang.Exception {
            java.lang.String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
            return installerPackageName == null ? "" : installerPackageName;
        }
    };
    private final io.fabric.sdk.android.services.cache.MemoryValueCache<java.lang.String> installerPackageNameCache = new io.fabric.sdk.android.services.cache.MemoryValueCache<>();

    public java.lang.String getInstallerPackageName(android.content.Context context) {
        try {
            java.lang.String str = this.installerPackageNameCache.get(context, this.installerPackageNameLoader);
            if ("".equals(str)) {
                return null;
            }
            return str;
        } catch (java.lang.Exception e) {
            io.fabric.sdk.android.Fabric.getLogger().e(io.fabric.sdk.android.Fabric.TAG, "Failed to determine installer package name", e);
            return null;
        }
    }
}
