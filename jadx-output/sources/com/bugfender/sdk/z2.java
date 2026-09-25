package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class z2 {
    public static final long b = java.util.concurrent.TimeUnit.SECONDS.toMillis(12);
    private java.util.Timer a;

    public static class a extends com.bugfender.sdk.z2.c {
        private final com.bugfender.sdk.z2.c a;

        public a(com.bugfender.sdk.z2.c cVar) {
            this.a = cVar;
        }

        @Override // com.bugfender.sdk.z2.c
        public void a() throws java.lang.Exception {
            this.a.a();
        }

        @Override // com.bugfender.sdk.z2.c
        public void a(java.lang.Exception exc) {
            this.a.a(exc);
        }
    }

    public static abstract class b extends com.bugfender.sdk.z2.c {
        private final java.util.Random a = new java.util.Random();
        final long b = com.bugfender.sdk.z2.b;
        int c = 0;

        private void c() {
            int i = this.c + 1;
            this.c = i;
            a(a(i, this.b));
        }

        public long a(int i, long j) {
            long jPow = (long) ((j / 1000) * java.lang.Math.pow(2.0d, java.lang.Math.min(i, 15)));
            double dNextDouble = this.a.nextDouble() * java.lang.Math.min(jPow, 18000L);
            return ((long) java.lang.Math.min(jPow + dNextDouble, dNextDouble + 43200.0d)) * 1000;
        }

        @Override // com.bugfender.sdk.z2.c
        public void a() throws java.lang.Exception {
            b();
            if (this.c > 0) {
                d();
                a(com.bugfender.sdk.z2.b);
            }
        }

        protected abstract void a(long j);

        @Override // com.bugfender.sdk.z2.c
        public void a(java.lang.Exception exc) {
            if (exc instanceof com.bugfender.sdk.p1) {
                c();
            } else {
                com.bugfender.sdk.d1.a(exc);
            }
        }

        public abstract void b() throws java.lang.Exception;

        public void d() {
            this.c = 0;
        }
    }

    public static abstract class c extends java.util.TimerTask {
        public abstract void a() throws java.lang.Exception;

        public abstract void a(java.lang.Exception exc);

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                a();
            } catch (java.lang.Exception e) {
                a(e);
            }
        }
    }

    public void a() {
        java.util.Timer timer = this.a;
        if (timer != null) {
            timer.cancel();
            this.a = null;
        }
    }

    public void a(long j, com.bugfender.sdk.z2.c cVar) {
        java.util.Timer timer = new java.util.Timer();
        this.a = timer;
        timer.schedule(cVar, j, j);
    }
}
