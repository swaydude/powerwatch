package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class b1 {
    private final java.util.concurrent.ThreadPoolExecutor a;
    private final int b;
    private final int c;
    private int e;
    private final com.bugfender.sdk.b1.c f;
    private boolean d = true;
    private final com.bugfender.sdk.b1.b g = new com.bugfender.sdk.b1.b();

    private static class b {
        private float a;
        private final android.os.Handler b;
        private final java.lang.Runnable c;
        private boolean d;

        class a implements java.lang.Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                com.bugfender.sdk.b1.b.this.a = (1.0f - (java.lang.Runtime.getRuntime().totalMemory() / java.lang.Runtime.getRuntime().maxMemory())) * 100.0f;
                com.bugfender.sdk.b1.b.this.b.postDelayed(com.bugfender.sdk.b1.b.this.c, java.util.concurrent.TimeUnit.SECONDS.toMillis(1L));
            }
        }

        private b() {
            this.a = 100.0f;
            this.b = new android.os.Handler();
            this.c = new com.bugfender.sdk.b1.b.a();
            this.d = false;
        }

        float a() {
            return this.a;
        }

        void b() {
            if (this.d) {
                return;
            }
            this.d = true;
            this.c.run();
        }

        void c() {
            if (this.d) {
                this.b.removeCallbacksAndMessages(null);
                this.d = false;
            }
        }
    }

    public interface c {
        void a(java.util.concurrent.ThreadPoolExecutor threadPoolExecutor, boolean z);
    }

    public b1(java.util.concurrent.ThreadPoolExecutor threadPoolExecutor, int i, int i2, com.bugfender.sdk.b1.c cVar) {
        this.a = threadPoolExecutor;
        this.b = i;
        this.c = i2;
        this.f = cVar;
    }

    private float a() {
        this.g.b();
        return this.g.a();
    }

    private void c() {
        com.bugfender.sdk.b1.c cVar;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor;
        int size = this.a.getQueue().size();
        boolean z = true;
        if (this.d && size >= this.b && a() < this.c) {
            this.e = size;
            this.d = false;
            cVar = this.f;
            if (cVar == null) {
                return;
            } else {
                threadPoolExecutor = this.a;
            }
        } else {
            if (this.d || size >= this.e / 2) {
                return;
            }
            this.d = true;
            this.g.c();
            cVar = this.f;
            if (cVar == null) {
                return;
            }
            threadPoolExecutor = this.a;
            z = true ^ this.d;
        }
        cVar.a(threadPoolExecutor, z);
    }

    public synchronized <T> java.util.concurrent.Future<T> a(java.util.concurrent.Callable<T> callable) {
        c();
        if (!this.d) {
            return null;
        }
        return this.a.submit(callable);
    }

    public void b() {
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = this.a;
        if (threadPoolExecutor != null) {
            threadPoolExecutor.shutdown();
        }
    }
}
