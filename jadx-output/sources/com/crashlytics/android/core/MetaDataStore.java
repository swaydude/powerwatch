package com.crashlytics.android.core;

/* JADX INFO: loaded from: classes.dex */
class MetaDataStore {
    private static final java.lang.String KEYDATA_SUFFIX = "keys";
    private static final java.lang.String KEY_USER_EMAIL = "userEmail";
    private static final java.lang.String KEY_USER_ID = "userId";
    private static final java.lang.String KEY_USER_NAME = "userName";
    private static final java.lang.String METADATA_EXT = ".meta";
    private static final java.lang.String USERDATA_SUFFIX = "user";
    private static final java.nio.charset.Charset UTF_8 = java.nio.charset.Charset.forName(io.fabric.sdk.android.services.network.HttpRequest.CHARSET_UTF8);
    private final java.io.File filesDir;

    public MetaDataStore(java.io.File file) {
        this.filesDir = file;
    }

    public void writeUserData(java.lang.String str, com.crashlytics.android.core.UserMetaData userMetaData) throws java.lang.Throwable {
        java.io.File userDataFileForSession = getUserDataFileForSession(str);
        java.io.BufferedWriter bufferedWriter = null;
        try {
            try {
                java.lang.String strUserDataToJson = userDataToJson(userMetaData);
                java.io.BufferedWriter bufferedWriter2 = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(userDataFileForSession), UTF_8));
                try {
                    bufferedWriter2.write(strUserDataToJson);
                    bufferedWriter2.flush();
                    io.fabric.sdk.android.services.common.CommonUtils.closeOrLog(bufferedWriter2, "Failed to close user metadata file.");
                } catch (java.lang.Exception e) {
                    e = e;
                    bufferedWriter = bufferedWriter2;
                    io.fabric.sdk.android.Fabric.getLogger().e(com.crashlytics.android.core.CrashlyticsCore.TAG, "Error serializing user metadata.", e);
                    io.fabric.sdk.android.services.common.CommonUtils.closeOrLog(bufferedWriter, "Failed to close user metadata file.");
                } catch (java.lang.Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    io.fabric.sdk.android.services.common.CommonUtils.closeOrLog(bufferedWriter, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (java.lang.Exception e2) {
                e = e2;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    public com.crashlytics.android.core.UserMetaData readUserData(java.lang.String str) throws java.lang.Throwable {
        java.io.File userDataFileForSession = getUserDataFileForSession(str);
        if (!userDataFileForSession.exists()) {
            return com.crashlytics.android.core.UserMetaData.EMPTY;
        }
        java.io.FileInputStream fileInputStream = null;
        try {
            try {
                java.io.FileInputStream fileInputStream2 = new java.io.FileInputStream(userDataFileForSession);
                try {
                    com.crashlytics.android.core.UserMetaData userMetaDataJsonToUserData = jsonToUserData(io.fabric.sdk.android.services.common.CommonUtils.streamToString(fileInputStream2));
                    io.fabric.sdk.android.services.common.CommonUtils.closeOrLog(fileInputStream2, "Failed to close user metadata file.");
                    return userMetaDataJsonToUserData;
                } catch (java.lang.Exception e) {
                    e = e;
                    fileInputStream = fileInputStream2;
                    io.fabric.sdk.android.Fabric.getLogger().e(com.crashlytics.android.core.CrashlyticsCore.TAG, "Error deserializing user metadata.", e);
                    io.fabric.sdk.android.services.common.CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
                    return com.crashlytics.android.core.UserMetaData.EMPTY;
                } catch (java.lang.Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    io.fabric.sdk.android.services.common.CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (java.lang.Exception e2) {
                e = e2;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    public void writeKeyData(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) throws java.lang.Throwable {
        java.io.File keysFileForSession = getKeysFileForSession(str);
        java.io.BufferedWriter bufferedWriter = null;
        try {
            try {
                java.lang.String strKeysDataToJson = keysDataToJson(map);
                java.io.BufferedWriter bufferedWriter2 = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(keysFileForSession), UTF_8));
                try {
                    bufferedWriter2.write(strKeysDataToJson);
                    bufferedWriter2.flush();
                    io.fabric.sdk.android.services.common.CommonUtils.closeOrLog(bufferedWriter2, "Failed to close key/value metadata file.");
                } catch (java.lang.Exception e) {
                    e = e;
                    bufferedWriter = bufferedWriter2;
                    io.fabric.sdk.android.Fabric.getLogger().e(com.crashlytics.android.core.CrashlyticsCore.TAG, "Error serializing key/value metadata.", e);
                    io.fabric.sdk.android.services.common.CommonUtils.closeOrLog(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (java.lang.Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    io.fabric.sdk.android.services.common.CommonUtils.closeOrLog(bufferedWriter, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (java.lang.Exception e2) {
                e = e2;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    public java.util.Map<java.lang.String, java.lang.String> readKeyData(java.lang.String str) throws java.lang.Throwable {
        java.io.File keysFileForSession = getKeysFileForSession(str);
        if (!keysFileForSession.exists()) {
            return java.util.Collections.emptyMap();
        }
        java.io.FileInputStream fileInputStream = null;
        try {
            try {
                java.io.FileInputStream fileInputStream2 = new java.io.FileInputStream(keysFileForSession);
                try {
                    java.util.Map<java.lang.String, java.lang.String> mapJsonToKeysData = jsonToKeysData(io.fabric.sdk.android.services.common.CommonUtils.streamToString(fileInputStream2));
                    io.fabric.sdk.android.services.common.CommonUtils.closeOrLog(fileInputStream2, "Failed to close user metadata file.");
                    return mapJsonToKeysData;
                } catch (java.lang.Exception e) {
                    e = e;
                    fileInputStream = fileInputStream2;
                    io.fabric.sdk.android.Fabric.getLogger().e(com.crashlytics.android.core.CrashlyticsCore.TAG, "Error deserializing user metadata.", e);
                    io.fabric.sdk.android.services.common.CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
                    return java.util.Collections.emptyMap();
                } catch (java.lang.Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    io.fabric.sdk.android.services.common.CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (java.lang.Exception e2) {
                e = e2;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    public java.io.File getUserDataFileForSession(java.lang.String str) {
        return new java.io.File(this.filesDir, str + USERDATA_SUFFIX + METADATA_EXT);
    }

    public java.io.File getKeysFileForSession(java.lang.String str) {
        return new java.io.File(this.filesDir, str + KEYDATA_SUFFIX + METADATA_EXT);
    }

    private static com.crashlytics.android.core.UserMetaData jsonToUserData(java.lang.String str) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        return new com.crashlytics.android.core.UserMetaData(valueOrNull(jSONObject, KEY_USER_ID), valueOrNull(jSONObject, KEY_USER_NAME), valueOrNull(jSONObject, KEY_USER_EMAIL));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.crashlytics.android.core.MetaDataStore$1] */
    private static java.lang.String userDataToJson(com.crashlytics.android.core.UserMetaData userMetaData) throws org.json.JSONException {
        return new org.json.JSONObject() { // from class: com.crashlytics.android.core.MetaDataStore.1
            {
                put(com.crashlytics.android.core.MetaDataStore.KEY_USER_ID, this.val$userData.id);
                put(com.crashlytics.android.core.MetaDataStore.KEY_USER_NAME, this.val$userData.name);
                put(com.crashlytics.android.core.MetaDataStore.KEY_USER_EMAIL, this.val$userData.email);
            }
        }.toString();
    }

    private static java.util.Map<java.lang.String, java.lang.String> jsonToKeysData(java.lang.String str) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        java.util.HashMap map = new java.util.HashMap();
        java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            java.lang.String next = itKeys.next();
            map.put(next, valueOrNull(jSONObject, next));
        }
        return map;
    }

    private static java.lang.String keysDataToJson(java.util.Map<java.lang.String, java.lang.String> map) throws org.json.JSONException {
        return new org.json.JSONObject(map).toString();
    }

    private static java.lang.String valueOrNull(org.json.JSONObject jSONObject, java.lang.String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }
}
