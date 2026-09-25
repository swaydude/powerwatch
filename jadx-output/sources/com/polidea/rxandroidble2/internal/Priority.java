package com.polidea.rxandroidble2.internal;

/* JADX INFO: loaded from: classes2.dex */
public class Priority {
    final int priority;
    public static final com.polidea.rxandroidble2.internal.Priority HIGH = new com.polidea.rxandroidble2.internal.Priority(100);
    public static final com.polidea.rxandroidble2.internal.Priority NORMAL = new com.polidea.rxandroidble2.internal.Priority(50);
    public static final com.polidea.rxandroidble2.internal.Priority LOW = new com.polidea.rxandroidble2.internal.Priority(0);

    private Priority(int i) {
        this.priority = i;
    }
}
