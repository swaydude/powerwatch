package com.google.android.gms.common.util;

/* JADX INFO: loaded from: classes.dex */
public class SharedPreferencesUtils {
    private SharedPreferencesUtils() {
    }

    @java.lang.Deprecated
    public static void publishWorldReadableSharedPreferences(android.content.Context context, android.content.SharedPreferences.Editor editor, java.lang.String str) {
        java.io.File file = new java.io.File(context.getApplicationInfo().dataDir, "shared_prefs");
        java.io.File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.setExecutable(true, false);
        }
        file.setExecutable(true, false);
        editor.commit();
        new java.io.File(file, java.lang.String.valueOf(str).concat(".xml")).setReadable(true, false);
    }
}
