package io.fabric.sdk.android;

/* JADX INFO: loaded from: classes2.dex */
class FabricKitsFinder implements java.util.concurrent.Callable<java.util.Map<java.lang.String, io.fabric.sdk.android.KitInfo>> {
    private static final java.lang.String FABRIC_BUILD_TYPE_KEY = "fabric-build-type";
    static final java.lang.String FABRIC_DIR = "fabric/";
    private static final java.lang.String FABRIC_IDENTIFIER_KEY = "fabric-identifier";
    private static final java.lang.String FABRIC_VERSION_KEY = "fabric-version";
    final java.lang.String apkFileName;

    FabricKitsFinder(java.lang.String str) {
        this.apkFileName = str;
    }

    @Override // java.util.concurrent.Callable
    public java.util.Map<java.lang.String, io.fabric.sdk.android.KitInfo> call() throws java.lang.Exception {
        java.util.HashMap map = new java.util.HashMap();
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        map.putAll(findImplicitKits());
        map.putAll(findRegisteredKits());
        io.fabric.sdk.android.Fabric.getLogger().v(io.fabric.sdk.android.Fabric.TAG, "finish scanning in " + (android.os.SystemClock.elapsedRealtime() - jElapsedRealtime));
        return map;
    }

    private java.util.Map<java.lang.String, io.fabric.sdk.android.KitInfo> findImplicitKits() {
        java.util.HashMap map = new java.util.HashMap();
        try {
            java.lang.Class.forName("com.google.android.gms.ads.AdView");
            io.fabric.sdk.android.KitInfo kitInfo = new io.fabric.sdk.android.KitInfo("com.google.firebase.firebase-ads", "0.0.0", "binary");
            map.put(kitInfo.getIdentifier(), kitInfo);
            io.fabric.sdk.android.Fabric.getLogger().v(io.fabric.sdk.android.Fabric.TAG, "Found kit: com.google.firebase.firebase-ads");
        } catch (java.lang.Exception unused) {
        }
        return map;
    }

    private java.util.Map<java.lang.String, io.fabric.sdk.android.KitInfo> findRegisteredKits() throws java.lang.Exception {
        io.fabric.sdk.android.KitInfo kitInfoLoadKitInfo;
        java.util.HashMap map = new java.util.HashMap();
        java.util.zip.ZipFile zipFileLoadApkFile = loadApkFile();
        java.util.Enumeration<? extends java.util.zip.ZipEntry> enumerationEntries = zipFileLoadApkFile.entries();
        while (enumerationEntries.hasMoreElements()) {
            java.util.zip.ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
            if (zipEntryNextElement.getName().startsWith(FABRIC_DIR) && zipEntryNextElement.getName().length() > 7 && (kitInfoLoadKitInfo = loadKitInfo(zipEntryNextElement, zipFileLoadApkFile)) != null) {
                map.put(kitInfoLoadKitInfo.getIdentifier(), kitInfoLoadKitInfo);
                io.fabric.sdk.android.Fabric.getLogger().v(io.fabric.sdk.android.Fabric.TAG, java.lang.String.format("Found kit:[%s] version:[%s]", kitInfoLoadKitInfo.getIdentifier(), kitInfoLoadKitInfo.getVersion()));
            }
        }
        if (zipFileLoadApkFile != null) {
            try {
                zipFileLoadApkFile.close();
            } catch (java.io.IOException unused) {
            }
        }
        return map;
    }

    private io.fabric.sdk.android.KitInfo loadKitInfo(java.util.zip.ZipEntry zipEntry, java.util.zip.ZipFile zipFile) throws java.lang.Throwable {
        java.io.InputStream inputStream;
        java.util.zip.ZipFile zipFile2 = null;
        try {
            try {
                inputStream = zipFile.getInputStream(zipEntry);
                try {
                    java.util.Properties properties = new java.util.Properties();
                    properties.load(inputStream);
                    java.lang.String property = properties.getProperty(FABRIC_IDENTIFIER_KEY);
                    java.lang.String property2 = properties.getProperty(FABRIC_VERSION_KEY);
                    java.lang.String property3 = properties.getProperty(FABRIC_BUILD_TYPE_KEY);
                    if (android.text.TextUtils.isEmpty(property) || android.text.TextUtils.isEmpty(property2)) {
                        throw new java.lang.IllegalStateException("Invalid format of fabric file," + zipEntry.getName());
                    }
                    io.fabric.sdk.android.KitInfo kitInfo = new io.fabric.sdk.android.KitInfo(property, property2, property3);
                    io.fabric.sdk.android.services.common.CommonUtils.closeQuietly(inputStream);
                    return kitInfo;
                } catch (java.io.IOException e) {
                    e = e;
                    io.fabric.sdk.android.Fabric.getLogger().e(io.fabric.sdk.android.Fabric.TAG, "Error when parsing fabric properties " + zipEntry.getName(), e);
                    io.fabric.sdk.android.services.common.CommonUtils.closeQuietly(inputStream);
                    return null;
                }
            } catch (java.lang.Throwable th) {
                th = th;
                zipFile2 = zipFile;
                io.fabric.sdk.android.services.common.CommonUtils.closeQuietly(zipFile2);
                throw th;
            }
        } catch (java.io.IOException e2) {
            e = e2;
            inputStream = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            io.fabric.sdk.android.services.common.CommonUtils.closeQuietly(zipFile2);
            throw th;
        }
    }

    protected java.util.zip.ZipFile loadApkFile() throws java.io.IOException {
        return new java.util.zip.ZipFile(this.apkFileName);
    }
}
