package com.google.android.gms.common.util.concurrent;

/* JADX INFO: loaded from: classes.dex */
public class NumberedThreadFactory implements java.util.concurrent.ThreadFactory {
    private final int priority;
    private final java.util.concurrent.ThreadFactory zzhr;
    private final java.lang.String zzhs;
    private final java.util.concurrent.atomic.AtomicInteger zzht;

    public NumberedThreadFactory(java.lang.String str) {
        this(str, 0);
    }

    private NumberedThreadFactory(java.lang.String str, int i) {
        this.zzht = new java.util.concurrent.atomic.AtomicInteger();
        this.zzhr = java.util.concurrent.Executors.defaultThreadFactory();
        this.zzhs = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str, "Name must not be null");
        this.priority = 0;
    }

    @Override // java.util.concurrent.ThreadFactory
    public java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.lang.Thread threadNewThread = this.zzhr.newThread(new com.google.android.gms.common.util.concurrent.zza(runnable, 0));
        java.lang.String str = this.zzhs;
        int andIncrement = this.zzht.getAndIncrement();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 13);
        sb.append(str);
        sb.append("[");
        sb.append(andIncrement);
        sb.append("]");
        threadNewThread.setName(sb.toString());
        return threadNewThread;
    }
}
