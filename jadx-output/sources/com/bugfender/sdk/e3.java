package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class e3 {
    private final java.lang.String a;
    private final java.lang.String b;

    public e3(java.lang.String str, java.lang.String str2) {
        this.b = str2;
        this.a = com.bugfender.sdk.c.a(str);
    }

    private java.net.URL a(java.lang.String str, java.lang.String str2) {
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(this.b);
            if (!this.b.endsWith("/")) {
                sb.append("/");
            }
            if (!this.b.contains("intent")) {
                sb.append("intent");
                sb.append("/");
            }
            sb.append(this.a);
            sb.append("/");
            sb.append(str);
            sb.append("/");
            sb.append(str2);
            return new java.net.URL(sb.toString());
        } catch (java.net.MalformedURLException unused) {
            return null;
        }
    }

    public java.net.URL a(java.lang.String str) {
        return a("device", str);
    }

    public java.net.URL b(java.lang.String str) {
        return a("issue", str);
    }

    public java.net.URL c(java.lang.String str) {
        return a(io.fabric.sdk.android.services.settings.SettingsJsonConstants.SESSION_KEY, str);
    }
}
