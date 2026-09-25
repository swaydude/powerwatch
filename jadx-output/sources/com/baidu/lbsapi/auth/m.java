package com.baidu.lbsapi.auth;

/* JADX INFO: loaded from: classes.dex */
class m extends java.lang.Thread {
    android.os.Handler a;
    private java.lang.Object b;
    private boolean c;

    m() {
        this.a = null;
        this.b = new java.lang.Object();
        this.c = false;
    }

    m(java.lang.String str) {
        super(str);
        this.a = null;
        this.b = new java.lang.Object();
        this.c = false;
    }

    public void a() {
        if (com.baidu.lbsapi.auth.a.a) {
            com.baidu.lbsapi.auth.a.a("Looper thread quit()");
        }
        this.a.getLooper().quit();
    }

    public void b() {
        synchronized (this.b) {
            try {
                if (!this.c) {
                    this.b.wait();
                }
            } catch (java.lang.InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void c() {
        synchronized (this.b) {
            this.c = true;
            this.b.notifyAll();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        android.os.Looper.prepare();
        this.a = new android.os.Handler();
        if (com.baidu.lbsapi.auth.a.a) {
            com.baidu.lbsapi.auth.a.a("new Handler() finish!!");
        }
        android.os.Looper.loop();
        if (com.baidu.lbsapi.auth.a.a) {
            com.baidu.lbsapi.auth.a.a("LooperThread run() thread id:" + java.lang.String.valueOf(java.lang.Thread.currentThread().getId()));
        }
    }
}
