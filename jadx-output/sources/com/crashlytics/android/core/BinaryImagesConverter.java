package com.crashlytics.android.core;

/* JADX INFO: loaded from: classes.dex */
class BinaryImagesConverter {
    private static final java.lang.String DATA_DIR = "/data";
    private final android.content.Context context;
    private final com.crashlytics.android.core.BinaryImagesConverter.FileIdStrategy fileIdStrategy;

    interface FileIdStrategy {
        java.lang.String createId(java.io.File file) throws java.io.IOException;
    }

    BinaryImagesConverter(android.content.Context context, com.crashlytics.android.core.BinaryImagesConverter.FileIdStrategy fileIdStrategy) {
        this.context = context;
        this.fileIdStrategy = fileIdStrategy;
    }

    byte[] convert(java.lang.String str) throws java.io.IOException {
        return generateBinaryImagesJsonString(parseProcMapsJsonFromString(str));
    }

    byte[] convert(java.io.BufferedReader bufferedReader) throws java.io.IOException {
        return generateBinaryImagesJsonString(parseProcMapsJsonFromStream(bufferedReader));
    }

    private org.json.JSONArray parseProcMapsJsonFromStream(java.io.BufferedReader bufferedReader) throws java.io.IOException {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        while (true) {
            java.lang.String line = bufferedReader.readLine();
            if (line == null) {
                return jSONArray;
            }
            org.json.JSONObject jSONObjectJsonFromMapEntryString = jsonFromMapEntryString(line);
            if (jSONObjectJsonFromMapEntryString != null) {
                jSONArray.put(jSONObjectJsonFromMapEntryString);
            }
        }
    }

    private org.json.JSONArray parseProcMapsJsonFromString(java.lang.String str) {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        try {
            for (java.lang.String str2 : joinMapsEntries(new org.json.JSONObject(str).getJSONArray("maps")).split("\\|")) {
                org.json.JSONObject jSONObjectJsonFromMapEntryString = jsonFromMapEntryString(str2);
                if (jSONObjectJsonFromMapEntryString != null) {
                    jSONArray.put(jSONObjectJsonFromMapEntryString);
                }
            }
            return jSONArray;
        } catch (org.json.JSONException e) {
            io.fabric.sdk.android.Fabric.getLogger().w(com.crashlytics.android.core.CrashlyticsCore.TAG, "Unable to parse proc maps string", e);
            return jSONArray;
        }
    }

    private org.json.JSONObject jsonFromMapEntryString(java.lang.String str) {
        com.crashlytics.android.core.ProcMapEntry procMapEntry = com.crashlytics.android.core.ProcMapEntryParser.parse(str);
        if (procMapEntry != null && isRelevant(procMapEntry)) {
            try {
                try {
                    return createBinaryImageJson(this.fileIdStrategy.createId(getLibraryFile(procMapEntry.path)), procMapEntry);
                } catch (org.json.JSONException e) {
                    io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, "Could not create a binary image json string", e);
                    return null;
                }
            } catch (java.io.IOException e2) {
                io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, "Could not generate ID for file " + procMapEntry.path, e2);
            }
        }
        return null;
    }

    private java.io.File getLibraryFile(java.lang.String str) {
        java.io.File file = new java.io.File(str);
        return !file.exists() ? correctDataPath(file) : file;
    }

    private java.io.File correctDataPath(java.io.File file) {
        if (android.os.Build.VERSION.SDK_INT < 9 || !file.getAbsolutePath().startsWith(DATA_DIR)) {
            return file;
        }
        try {
            return new java.io.File(this.context.getPackageManager().getApplicationInfo(this.context.getPackageName(), 0).nativeLibraryDir, file.getName());
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            io.fabric.sdk.android.Fabric.getLogger().e(com.crashlytics.android.core.CrashlyticsCore.TAG, "Error getting ApplicationInfo", e);
            return file;
        }
    }

    private static byte[] generateBinaryImagesJsonString(org.json.JSONArray jSONArray) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("binary_images", jSONArray);
            return jSONObject.toString().getBytes();
        } catch (org.json.JSONException e) {
            io.fabric.sdk.android.Fabric.getLogger().w(com.crashlytics.android.core.CrashlyticsCore.TAG, "Binary images string is null", e);
            return new byte[0];
        }
    }

    private static org.json.JSONObject createBinaryImageJson(java.lang.String str, com.crashlytics.android.core.ProcMapEntry procMapEntry) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("base_address", procMapEntry.address);
        jSONObject.put("size", procMapEntry.size);
        jSONObject.put(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, procMapEntry.path);
        jSONObject.put("uuid", str);
        return jSONObject;
    }

    private static java.lang.String joinMapsEntries(org.json.JSONArray jSONArray) throws org.json.JSONException {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i = 0; i < jSONArray.length(); i++) {
            sb.append(jSONArray.getString(i));
        }
        return sb.toString();
    }

    private static boolean isRelevant(com.crashlytics.android.core.ProcMapEntry procMapEntry) {
        return (procMapEntry.perms.indexOf(120) == -1 || procMapEntry.path.indexOf(47) == -1) ? false : true;
    }
}
