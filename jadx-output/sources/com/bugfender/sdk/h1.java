package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class h1 implements java.lang.Cloneable, java.lang.Runnable {
    private static final java.lang.String f = "Logcat";
    private java.lang.Process a;
    private java.io.BufferedReader b;
    private com.bugfender.sdk.h1.a c;
    private volatile boolean d = true;
    private final java.lang.String e;

    public interface a {
        void a(java.lang.String str);
    }

    public h1(java.lang.String str) {
        this.e = str;
    }

    private java.io.BufferedReader a() {
        if (this.b == null && this.a != null) {
            this.b = new java.io.BufferedReader(new java.io.InputStreamReader(this.a.getInputStream()));
        }
        return this.b;
    }

    private void a(java.lang.String str) {
        com.bugfender.sdk.h1.a aVar = this.c;
        if (aVar != null) {
            aVar.a(str);
        }
    }

    private void c() {
        java.io.BufferedReader bufferedReaderA = a();
        if (bufferedReaderA == null) {
            return;
        }
        while (true) {
            try {
                java.lang.String line = bufferedReaderA.readLine();
                if (line == null || !this.d) {
                    return;
                } else {
                    a(line);
                }
            } catch (java.io.IOException e) {
                com.bugfender.sdk.d1.a(f, "IOException reading logcat trace.", e);
                return;
            }
        }
    }

    public void a(com.bugfender.sdk.h1.a aVar) {
        this.c = aVar;
    }

    public com.bugfender.sdk.h1.a b() {
        return this.c;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            java.lang.Runtime runtime = java.lang.Runtime.getRuntime();
            runtime.exec("logcat -c").waitFor();
            this.a = runtime.exec("logcat -v brief " + this.e);
        } catch (java.io.IOException | java.lang.InterruptedException e) {
            com.bugfender.sdk.d1.a(f, "Exception executing logcat command.", e);
        }
        c();
        com.bugfender.sdk.d1.a(f, "run: Logcat thread finished");
    }
}
