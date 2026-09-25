package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class c0 {
    private long a = -1;

    public synchronized long a() {
        return this.a;
    }

    public synchronized void a(long j) {
        if (b()) {
            this.a += j;
        }
    }

    public synchronized void b(long j) {
        this.a = j;
    }

    public synchronized boolean b() {
        return this.a != -1;
    }

    public synchronized void c(long j) {
        if (b()) {
            this.a -= j;
        }
    }
}
