package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class i0 {
    public com.bugfender.sdk.q2 a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        try {
            if (android.text.TextUtils.isEmpty(str)) {
                str = com.bugfender.android.BuildConfig.BUGFENDER_API_URL;
            }
            return new com.bugfender.sdk.q2(new java.net.URL(str), str2, str3);
        } catch (java.net.MalformedURLException unused) {
            throw new java.lang.IllegalArgumentException("Illegal URL");
        }
    }
}
