package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class y {
    public static final com.bugfender.sdk.y d = new com.bugfender.sdk.y.b().b(false).a(false).a(0).a();
    private final boolean a;
    private final boolean b;
    private final int c;

    public static class b {
        private boolean a;
        private boolean b;
        private int c;

        public b() {
        }

        public b(com.bugfender.sdk.y yVar) {
            yVar = yVar == null ? com.bugfender.sdk.y.d : yVar;
            this.a = yVar.c();
            this.c = yVar.a();
            this.b = yVar.b();
        }

        public com.bugfender.sdk.y.b a(int i) {
            this.c = i;
            return this;
        }

        public com.bugfender.sdk.y.b a(boolean z) {
            this.a = z;
            return this;
        }

        public com.bugfender.sdk.y a() {
            return new com.bugfender.sdk.y(this.a, this.b, this.c);
        }

        public com.bugfender.sdk.y.b b(boolean z) {
            this.b = z;
            return this;
        }
    }

    private y(boolean z, boolean z2, int i) {
        this.a = z;
        this.b = z2;
        this.c = i;
    }

    public int a() {
        return this.c;
    }

    public boolean b() {
        return this.b;
    }

    public boolean c() {
        return this.a;
    }
}
