package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class b0 {
    private boolean a;
    private com.bugfender.sdk.b0.b b;
    private com.bugfender.sdk.b0.a c;
    private boolean d;

    public static class a {
        private java.lang.String a;
        private int b;

        public a(java.lang.String str, int i) {
            this.a = str;
            this.b = i;
        }

        public int a() {
            return this.b;
        }

        public java.lang.String b() {
            return this.a;
        }
    }

    public static class b {
        private int a;
        private int b;

        public b() {
        }

        public b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public int a() {
            return this.a;
        }

        public int b() {
            return this.b;
        }
    }

    public com.bugfender.sdk.b0.a a() {
        return this.c;
    }

    public void a(com.bugfender.sdk.b0.a aVar) {
        this.c = aVar;
    }

    public void a(com.bugfender.sdk.b0.b bVar) {
        this.b = bVar;
    }

    public void a(boolean z) {
        this.d = z;
    }

    public com.bugfender.sdk.b0.b b() {
        return this.b;
    }

    public void b(boolean z) {
        this.a = z;
    }

    public boolean c() {
        return this.d;
    }

    public boolean d() {
        return this.a;
    }
}
