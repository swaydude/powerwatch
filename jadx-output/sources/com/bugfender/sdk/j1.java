package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class j1 implements com.bugfender.sdk.i1 {
    private static final int f = 0;
    private static final java.lang.String g = "logcat";
    private static final java.lang.String h = "Logcat";
    private final com.bugfender.sdk.k1 a;
    private final java.lang.String b;
    private final java.util.concurrent.ExecutorService d;
    private java.util.concurrent.Future<?> e = null;
    private final int c = android.os.Process.myPid();

    class a implements com.bugfender.sdk.h1.a {
        final /* synthetic */ com.bugfender.sdk.logcat.LogcatInterceptor a;

        a(com.bugfender.sdk.logcat.LogcatInterceptor logcatInterceptor) {
            this.a = logcatInterceptor;
        }

        @Override // com.bugfender.sdk.h1.a
        public void a(java.lang.String str) {
            try {
                com.bugfender.sdk.a3 a3VarA = com.bugfender.sdk.a3.a(str, com.bugfender.sdk.j1.this.c);
                if (android.text.TextUtils.isEmpty(a3VarA.b())) {
                    return;
                }
                com.bugfender.sdk.j1.this.a(a3VarA, this.a);
            } catch (com.bugfender.sdk.s0 unused) {
            }
        }
    }

    class b implements java.lang.Runnable {
        final /* synthetic */ com.bugfender.sdk.h1 a;

        b(com.bugfender.sdk.h1 h1Var) {
            this.a = h1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.bugfender.sdk.j1.this.e.isDone() || com.bugfender.sdk.j1.this.e.isCancelled()) {
                com.bugfender.sdk.j1.this.a.a(0, com.bugfender.sdk.j1.g, com.bugfender.sdk.j1.h, com.bugfender.sdk.e1.c.W, com.bugfender.sdk.k1.G, "Logcat process has exited prematurely, restarting it in 5 minutes to continue delivering the logs. During this time logs will not be collected.");
                com.bugfender.sdk.j1 j1Var = com.bugfender.sdk.j1.this;
                j1Var.e = j1Var.d.submit(this.a);
            }
        }
    }

    public j1(java.lang.String str, com.bugfender.sdk.k1 k1Var, java.util.concurrent.ExecutorService executorService) {
        this.b = str;
        this.a = k1Var;
        this.d = executorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.bugfender.sdk.a3 a3Var, com.bugfender.sdk.logcat.LogcatInterceptor logcatInterceptor) {
        com.bugfender.sdk.logcat.InterceptedLog interceptedLogIntercept;
        if (a3Var.c().startsWith("BF/") || (interceptedLogIntercept = logcatInterceptor.intercept(new com.bugfender.sdk.logcat.InterceptedLog(0, g, h, a3Var.a().b(), a3Var.c(), a3Var.b()))) == null) {
            return;
        }
        a(interceptedLogIntercept);
    }

    private void a(com.bugfender.sdk.logcat.InterceptedLog interceptedLog) {
        this.a.a(interceptedLog.getLineNumber(), interceptedLog.getMethod(), interceptedLog.getFile(), com.bugfender.sdk.e1.c.a(interceptedLog.getLevel()), interceptedLog.getTag(), interceptedLog.getMessage());
    }

    @Override // com.bugfender.sdk.i1
    public void a(com.bugfender.sdk.logcat.LogcatInterceptor logcatInterceptor) {
        com.bugfender.sdk.j1.a aVar = new com.bugfender.sdk.j1.a(logcatInterceptor);
        com.bugfender.sdk.h1 h1Var = new com.bugfender.sdk.h1(this.b);
        h1Var.a(aVar);
        this.e = this.d.submit(h1Var);
        java.util.concurrent.Executors.newSingleThreadScheduledExecutor().scheduleWithFixedDelay(new com.bugfender.sdk.j1.b(h1Var), 1L, 5L, java.util.concurrent.TimeUnit.MINUTES);
    }
}
