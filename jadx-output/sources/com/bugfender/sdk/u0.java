package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class u0 {
    private java.util.UUID a;
    private java.lang.String b;
    private java.lang.String c;
    private java.lang.String d;
    private java.lang.String e;
    private java.lang.Long f;
    private com.bugfender.sdk.e g;

    public static final class b {
        private java.util.UUID a;
        private java.lang.String b;
        private java.lang.String c;
        private java.lang.String d;
        private java.lang.String e;
        private long f;
        private com.bugfender.sdk.e g;

        private b() {
        }

        public com.bugfender.sdk.u0.b a(long j) {
            this.f = j;
            return this;
        }

        public com.bugfender.sdk.u0.b a(com.bugfender.sdk.e eVar) {
            this.g = eVar;
            return this;
        }

        public com.bugfender.sdk.u0.b a(java.lang.String str) {
            this.e = str;
            return this;
        }

        public com.bugfender.sdk.u0.b a(java.util.UUID uuid) {
            this.a = uuid;
            return this;
        }

        public com.bugfender.sdk.u0 a() {
            return new com.bugfender.sdk.u0(this);
        }

        public com.bugfender.sdk.u0.b b(java.lang.String str) {
            this.d = str;
            return this;
        }

        public com.bugfender.sdk.u0.b c(java.lang.String str) {
            this.c = str;
            return this;
        }

        public com.bugfender.sdk.u0.b d(java.lang.String str) {
            this.b = str;
            return this;
        }
    }

    private u0(com.bugfender.sdk.u0.b bVar) {
        this.a = bVar.a;
        this.b = android.text.TextUtils.isEmpty(bVar.b) ? "issue" : bVar.b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e;
        this.f = java.lang.Long.valueOf(bVar.f);
        this.g = bVar.g;
    }

    public u0(java.util.UUID uuid, java.lang.String str, java.lang.String str2, long j, com.bugfender.sdk.e eVar) {
        this.a = uuid;
        this.c = str;
        this.d = str2;
        this.f = java.lang.Long.valueOf(j);
        this.g = eVar;
    }

    public static com.bugfender.sdk.u0.b a() {
        return new com.bugfender.sdk.u0.b();
    }

    public void a(long j) {
        this.f = java.lang.Long.valueOf(j);
    }

    public void a(com.bugfender.sdk.e eVar) {
        this.g = eVar;
    }

    public com.bugfender.sdk.e b() {
        return this.g;
    }

    public java.lang.String c() {
        return this.e;
    }

    public java.lang.Long d() {
        return this.f;
    }

    public java.lang.String e() {
        return this.d;
    }

    public java.lang.String f() {
        return this.c;
    }

    public java.lang.String g() {
        return this.b;
    }

    public java.util.UUID h() {
        return this.a;
    }
}
