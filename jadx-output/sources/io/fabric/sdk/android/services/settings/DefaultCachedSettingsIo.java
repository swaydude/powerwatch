package io.fabric.sdk.android.services.settings;

/* JADX INFO: loaded from: classes2.dex */
class DefaultCachedSettingsIo implements io.fabric.sdk.android.services.settings.CachedSettingsIo {
    private final io.fabric.sdk.android.Kit kit;

    public DefaultCachedSettingsIo(io.fabric.sdk.android.Kit kit) {
        this.kit = kit;
    }

    @Override // io.fabric.sdk.android.services.settings.CachedSettingsIo
    public org.json.JSONObject readCachedSettings() throws java.lang.Throwable {
        java.lang.Throwable th;
        java.io.FileInputStream fileInputStream;
        org.json.JSONObject jSONObject;
        io.fabric.sdk.android.Fabric.getLogger().d(io.fabric.sdk.android.Fabric.TAG, "Reading cached settings...");
        java.io.FileInputStream fileInputStream2 = null;
        try {
            try {
                java.io.File file = new java.io.File(new io.fabric.sdk.android.services.persistence.FileStoreImpl(this.kit).getFilesDir(), io.fabric.sdk.android.services.settings.Settings.SETTINGS_CACHE_FILENAME);
                if (file.exists()) {
                    fileInputStream = new java.io.FileInputStream(file);
                    try {
                        jSONObject = new org.json.JSONObject(io.fabric.sdk.android.services.common.CommonUtils.streamToString(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (java.lang.Exception e) {
                        e = e;
                        io.fabric.sdk.android.Fabric.getLogger().e(io.fabric.sdk.android.Fabric.TAG, "Failed to fetch cached settings", e);
                        io.fabric.sdk.android.services.common.CommonUtils.closeOrLog(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } else {
                    io.fabric.sdk.android.Fabric.getLogger().d(io.fabric.sdk.android.Fabric.TAG, "No cached settings found.");
                    jSONObject = null;
                }
                io.fabric.sdk.android.services.common.CommonUtils.closeOrLog(fileInputStream2, "Error while closing settings cache file.");
                return jSONObject;
            } catch (java.lang.Throwable th2) {
                th = th2;
                io.fabric.sdk.android.services.common.CommonUtils.closeOrLog(null, "Error while closing settings cache file.");
                throw th;
            }
        } catch (java.lang.Exception e2) {
            e = e2;
            fileInputStream = null;
        } catch (java.lang.Throwable th3) {
            th = th3;
            io.fabric.sdk.android.services.common.CommonUtils.closeOrLog(null, "Error while closing settings cache file.");
            throw th;
        }
    }

    @Override // io.fabric.sdk.android.services.settings.CachedSettingsIo
    public void writeCachedSettings(long j, org.json.JSONObject jSONObject) throws java.lang.Throwable {
        io.fabric.sdk.android.Fabric.getLogger().d(io.fabric.sdk.android.Fabric.TAG, "Writing settings to cache file...");
        if (jSONObject != null) {
            java.io.FileWriter fileWriter = null;
            try {
                try {
                    jSONObject.put(io.fabric.sdk.android.services.settings.SettingsJsonConstants.EXPIRES_AT_KEY, j);
                    java.io.FileWriter fileWriter2 = new java.io.FileWriter(new java.io.File(new io.fabric.sdk.android.services.persistence.FileStoreImpl(this.kit).getFilesDir(), io.fabric.sdk.android.services.settings.Settings.SETTINGS_CACHE_FILENAME));
                    try {
                        fileWriter2.write(jSONObject.toString());
                        fileWriter2.flush();
                        io.fabric.sdk.android.services.common.CommonUtils.closeOrLog(fileWriter2, "Failed to close settings writer.");
                    } catch (java.lang.Exception e) {
                        e = e;
                        fileWriter = fileWriter2;
                        io.fabric.sdk.android.Fabric.getLogger().e(io.fabric.sdk.android.Fabric.TAG, "Failed to cache settings", e);
                        io.fabric.sdk.android.services.common.CommonUtils.closeOrLog(fileWriter, "Failed to close settings writer.");
                    } catch (java.lang.Throwable th) {
                        th = th;
                        fileWriter = fileWriter2;
                        io.fabric.sdk.android.services.common.CommonUtils.closeOrLog(fileWriter, "Failed to close settings writer.");
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                }
            } catch (java.lang.Exception e2) {
                e = e2;
            }
        }
    }
}
