package com.google.android.play.core.internal;

/* JADX INFO: loaded from: classes2.dex */
public class ag {
    public static android.content.Context a(android.content.Context context) {
        android.content.Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    public static android.os.Bundle a(java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("session_id", 0);
        bundle.putInt("status", 5);
        bundle.putInt(com.baidu.mapapi.SDKInitializer.SDK_BROADTCAST_INTENT_EXTRA_INFO_KEY_ERROR_CODE, 0);
        if (!list.isEmpty()) {
            bundle.putStringArrayList("module_names", new java.util.ArrayList<>(list));
        }
        if (!list2.isEmpty()) {
            bundle.putStringArrayList("languages", new java.util.ArrayList<>(list2));
        }
        bundle.putLong("total_bytes_to_download", 0L);
        bundle.putLong("bytes_downloaded", 0L);
        return bundle;
    }

    public static com.google.android.play.core.internal.ad a() {
        if (android.os.Build.VERSION.SDK_INT < 21) {
            throw new java.lang.AssertionError("Unsupported Android Version");
        }
        switch (android.os.Build.VERSION.SDK_INT) {
            case 21:
                return new com.google.android.play.core.internal.af();
            case 22:
                return new com.google.android.play.core.internal.am();
            case 23:
                return new com.google.android.play.core.internal.al();
            case 24:
                return new com.google.android.play.core.internal.ap();
            case 25:
                return new com.google.android.play.core.internal.as();
            case 26:
                return new com.google.android.play.core.internal.ar();
            case 27:
                if (android.os.Build.VERSION.PREVIEW_SDK_INT == 0) {
                    return new com.google.android.play.core.internal.aw();
                }
                break;
        }
        return new com.google.android.play.core.internal.av();
    }

    public static <T> T a(T t, java.lang.Object obj) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(java.lang.String.valueOf(obj));
    }

    public static java.lang.String a(byte[] bArr) {
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance(io.fabric.sdk.android.services.common.CommonUtils.SHA256_INSTANCE);
            messageDigest.update(bArr);
            return android.util.Base64.encodeToString(messageDigest.digest(), 11);
        } catch (java.security.NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public static void a(boolean z, java.lang.Object obj) {
        if (!z) {
            throw new java.lang.IllegalStateException(java.lang.String.valueOf(obj));
        }
    }

    public static java.security.cert.X509Certificate[][] a(java.lang.String str) throws com.google.android.play.core.internal.c, java.io.IOException {
        return com.google.android.play.core.internal.h.a(str);
    }
}
