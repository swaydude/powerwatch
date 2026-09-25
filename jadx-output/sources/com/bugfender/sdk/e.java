package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class e {
    private java.lang.String a;

    public e(java.lang.String str) {
        a(str);
        this.a = str;
    }

    private void a(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Key must be not null");
    }

    public static com.bugfender.sdk.e b(java.lang.String str) {
        return new com.bugfender.sdk.e(str);
    }

    public java.lang.String a() {
        return this.a;
    }
}
