package com.google.android.gms.common.internal;

/* JADX INFO: loaded from: classes.dex */
public class LibraryVersion {
    private static final com.google.android.gms.common.internal.GmsLogger zzel = new com.google.android.gms.common.internal.GmsLogger("LibraryVersion", "");
    private static com.google.android.gms.common.internal.LibraryVersion zzem = new com.google.android.gms.common.internal.LibraryVersion();
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> zzen = new java.util.concurrent.ConcurrentHashMap<>();

    public static com.google.android.gms.common.internal.LibraryVersion getInstance() {
        return zzem;
    }

    protected LibraryVersion() {
    }

    public java.lang.String getVersion(java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str, "Please provide a valid libraryName");
        if (this.zzen.containsKey(str)) {
            return this.zzen.get(str);
        }
        java.util.Properties properties = new java.util.Properties();
        java.lang.String property = null;
        try {
            java.io.InputStream resourceAsStream = com.google.android.gms.common.internal.LibraryVersion.class.getResourceAsStream(java.lang.String.format("/%s.properties", str));
            if (resourceAsStream != null) {
                properties.load(resourceAsStream);
                property = properties.getProperty("version", null);
                com.google.android.gms.common.internal.GmsLogger gmsLogger = zzel;
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 12 + java.lang.String.valueOf(property).length());
                sb.append(str);
                sb.append(" version is ");
                sb.append(property);
                gmsLogger.v("LibraryVersion", sb.toString());
            } else {
                com.google.android.gms.common.internal.GmsLogger gmsLogger2 = zzel;
                java.lang.String strValueOf = java.lang.String.valueOf(str);
                gmsLogger2.e("LibraryVersion", strValueOf.length() != 0 ? "Failed to get app version for libraryName: ".concat(strValueOf) : new java.lang.String("Failed to get app version for libraryName: "));
            }
        } catch (java.io.IOException e) {
            com.google.android.gms.common.internal.GmsLogger gmsLogger3 = zzel;
            java.lang.String strValueOf2 = java.lang.String.valueOf(str);
            gmsLogger3.e("LibraryVersion", strValueOf2.length() != 0 ? "Failed to get app version for libraryName: ".concat(strValueOf2) : new java.lang.String("Failed to get app version for libraryName: "), e);
        }
        if (property == null) {
            zzel.d("LibraryVersion", ".properties file is dropped during release process. Failure to read app version isexpected druing Google internal testing where locally-built libraries are used");
            property = "UNKNOWN";
        }
        this.zzen.put(str, property);
        return property;
    }
}
