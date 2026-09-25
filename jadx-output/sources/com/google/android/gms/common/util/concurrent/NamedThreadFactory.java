package com.google.android.gms.common.util.concurrent;

/* JADX INFO: loaded from: classes.dex */
public class NamedThreadFactory implements java.util.concurrent.ThreadFactory {
    private final java.lang.String name;
    private final int priority;
    private final java.util.concurrent.ThreadFactory zzhr;

    public NamedThreadFactory(java.lang.String str) {
        this(str, 0);
    }

    private NamedThreadFactory(java.lang.String str, int i) {
        this.zzhr = java.util.concurrent.Executors.defaultThreadFactory();
        this.name = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str, "Name must not be null");
        this.priority = 0;
    }

    @Override // java.util.concurrent.ThreadFactory
    public java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.lang.Thread threadNewThread = this.zzhr.newThread(new com.google.android.gms.common.util.concurrent.zza(runnable, 0));
        threadNewThread.setName(this.name);
        return threadNewThread;
    }
}
