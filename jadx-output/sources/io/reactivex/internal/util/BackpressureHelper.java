package io.reactivex.internal.util;

/* JADX INFO: loaded from: classes2.dex */
public final class BackpressureHelper {
    public static long addCap(long j, long j2) {
        long j3 = j + j2;
        return j3 < 0 ? kotlin.jvm.internal.LongCompanionObject.MAX_VALUE : j3;
    }

    private BackpressureHelper() {
        throw new java.lang.IllegalStateException("No instances!");
    }

    public static long multiplyCap(long j, long j2) {
        long j3 = j * j2;
        return (((j | j2) >>> 31) == 0 || j3 / j == j2) ? j3 : kotlin.jvm.internal.LongCompanionObject.MAX_VALUE;
    }

    public static long add(java.util.concurrent.atomic.AtomicLong atomicLong, long j) {
        long j2;
        do {
            j2 = atomicLong.get();
            if (j2 == kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                return kotlin.jvm.internal.LongCompanionObject.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j2, addCap(j2, j)));
        return j2;
    }

    public static long addCancel(java.util.concurrent.atomic.AtomicLong atomicLong, long j) {
        long j2;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            if (j2 == kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                return kotlin.jvm.internal.LongCompanionObject.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j2, addCap(j2, j)));
        return j2;
    }

    public static long produced(java.util.concurrent.atomic.AtomicLong atomicLong, long j) {
        long j2;
        long j3;
        do {
            j2 = atomicLong.get();
            if (j2 == kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                return kotlin.jvm.internal.LongCompanionObject.MAX_VALUE;
            }
            j3 = j2 - j;
            if (j3 < 0) {
                io.reactivex.plugins.RxJavaPlugins.onError(new java.lang.IllegalStateException("More produced than requested: " + j3));
                j3 = 0L;
            }
        } while (!atomicLong.compareAndSet(j2, j3));
        return j3;
    }

    public static long producedCancel(java.util.concurrent.atomic.AtomicLong atomicLong, long j) {
        long j2;
        long j3;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            if (j2 == kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                return kotlin.jvm.internal.LongCompanionObject.MAX_VALUE;
            }
            j3 = j2 - j;
            if (j3 < 0) {
                io.reactivex.plugins.RxJavaPlugins.onError(new java.lang.IllegalStateException("More produced than requested: " + j3));
                j3 = 0L;
            }
        } while (!atomicLong.compareAndSet(j2, j3));
        return j3;
    }
}
