package com.google.android.play.core.install.model;

/* JADX INFO: loaded from: classes2.dex */
public final class a {
    private static final java.util.Map<java.lang.Integer, java.lang.String> a;
    private static final java.util.Map<java.lang.Integer, java.lang.String> b;

    static {
        java.util.HashMap map = new java.util.HashMap();
        a = map;
        java.util.HashMap map2 = new java.util.HashMap();
        b = map2;
        map.put(1, "No error occurred; only some types of update flow are allowed, while others are forbidden.");
        map.put(-2, "An unknown error occurred.");
        map.put(-3, "The API is not available on this device.");
        map.put(-4, "The request that was sent by the app is malformed.");
        map.put(-5, "The install is unavailable to this user or device.");
        map.put(-6, "The download/install is not allowed, due to the current device state (e.g. low battery, low disk space, ...).");
        map.put(-7, "The install/update has not been (fully) downloaded yet.");
        map.put(-8, "The install is already in progress and there is no UI flow to resume.");
        map.put(-100, "An internal error happened in the Play Store.");
        map2.put(1, "NO_ERROR_PARTIALLY_ALLOWED");
        map2.put(-2, "ERROR_UNKNOWN");
        map2.put(-3, "ERROR_API_NOT_AVAILABLE");
        map2.put(-4, "ERROR_INVALID_REQUEST");
        map2.put(-5, "ERROR_INSTALL_UNAVAILABLE");
        map2.put(-6, "ERROR_INSTALL_NOT_ALLOWED");
        map2.put(-7, "ERROR_DOWNLOAD_NOT_PRESENT");
        map2.put(-8, "ERROR_INSTALL_IN_PROGRESS");
        map2.put(-100, "ERROR_INTERNAL_ERROR");
    }

    public static java.lang.String a(int i) {
        java.util.Map<java.lang.Integer, java.lang.String> map = a;
        if (!map.containsKey(java.lang.Integer.valueOf(i))) {
            return "";
        }
        java.util.Map<java.lang.Integer, java.lang.String> map2 = b;
        if (!map2.containsKey(java.lang.Integer.valueOf(i))) {
            return "";
        }
        java.lang.String str = map.get(java.lang.Integer.valueOf(i));
        java.lang.String str2 = map2.get(java.lang.Integer.valueOf(i));
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 103 + java.lang.String.valueOf(str2).length());
        sb.append(str);
        sb.append(" (https://developer.android.com/reference/com/google/android/play/core/install/model/InstallErrorCode");
        sb.append("#");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
