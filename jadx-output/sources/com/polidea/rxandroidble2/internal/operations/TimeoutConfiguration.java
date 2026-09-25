package com.polidea.rxandroidble2.internal.operations;

/* JADX INFO: loaded from: classes2.dex */
public class TimeoutConfiguration {
    public final long timeout;
    public final io.reactivex.Scheduler timeoutScheduler;
    public final java.util.concurrent.TimeUnit timeoutTimeUnit;

    public TimeoutConfiguration(long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
        this.timeout = j;
        this.timeoutTimeUnit = timeUnit;
        this.timeoutScheduler = scheduler;
    }

    public java.lang.String toString() {
        return "{value=" + this.timeout + ", timeUnit=" + this.timeoutTimeUnit + '}';
    }
}
