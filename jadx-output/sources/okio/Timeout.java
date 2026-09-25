package okio;

/* JADX INFO: loaded from: classes2.dex */
public class Timeout {
    public static final okio.Timeout NONE = new okio.Timeout() { // from class: okio.Timeout.1
        @Override // okio.Timeout
        public okio.Timeout deadlineNanoTime(long j) {
            return this;
        }

        @Override // okio.Timeout
        public void throwIfReached() throws java.io.IOException {
        }

        @Override // okio.Timeout
        public okio.Timeout timeout(long j, java.util.concurrent.TimeUnit timeUnit) {
            return this;
        }
    };
    private long deadlineNanoTime;
    private boolean hasDeadline;
    private long timeoutNanos;

    public okio.Timeout timeout(long j, java.util.concurrent.TimeUnit timeUnit) {
        if (j >= 0) {
            if (timeUnit == null) {
                throw new java.lang.IllegalArgumentException("unit == null");
            }
            this.timeoutNanos = timeUnit.toNanos(j);
            return this;
        }
        throw new java.lang.IllegalArgumentException("timeout < 0: " + j);
    }

    public long timeoutNanos() {
        return this.timeoutNanos;
    }

    public boolean hasDeadline() {
        return this.hasDeadline;
    }

    public long deadlineNanoTime() {
        if (!this.hasDeadline) {
            throw new java.lang.IllegalStateException("No deadline");
        }
        return this.deadlineNanoTime;
    }

    public okio.Timeout deadlineNanoTime(long j) {
        this.hasDeadline = true;
        this.deadlineNanoTime = j;
        return this;
    }

    public final okio.Timeout deadline(long j, java.util.concurrent.TimeUnit timeUnit) {
        if (j > 0) {
            if (timeUnit == null) {
                throw new java.lang.IllegalArgumentException("unit == null");
            }
            return deadlineNanoTime(java.lang.System.nanoTime() + timeUnit.toNanos(j));
        }
        throw new java.lang.IllegalArgumentException("duration <= 0: " + j);
    }

    public okio.Timeout clearTimeout() {
        this.timeoutNanos = 0L;
        return this;
    }

    public okio.Timeout clearDeadline() {
        this.hasDeadline = false;
        return this;
    }

    public void throwIfReached() throws java.io.IOException {
        if (java.lang.Thread.interrupted()) {
            java.lang.Thread.currentThread().interrupt();
            throw new java.io.InterruptedIOException("interrupted");
        }
        if (this.hasDeadline && this.deadlineNanoTime - java.lang.System.nanoTime() <= 0) {
            throw new java.io.InterruptedIOException("deadline reached");
        }
    }

    public final void waitUntilNotified(java.lang.Object obj) throws java.io.InterruptedIOException {
        try {
            boolean zHasDeadline = hasDeadline();
            long jTimeoutNanos = timeoutNanos();
            long jNanoTime = 0;
            if (!zHasDeadline && jTimeoutNanos == 0) {
                obj.wait();
                return;
            }
            long jNanoTime2 = java.lang.System.nanoTime();
            if (zHasDeadline && jTimeoutNanos != 0) {
                jTimeoutNanos = java.lang.Math.min(jTimeoutNanos, deadlineNanoTime() - jNanoTime2);
            } else if (zHasDeadline) {
                jTimeoutNanos = deadlineNanoTime() - jNanoTime2;
            }
            if (jTimeoutNanos > 0) {
                long j = jTimeoutNanos / 1000000;
                java.lang.Long.signum(j);
                obj.wait(j, (int) (jTimeoutNanos - (1000000 * j)));
                jNanoTime = java.lang.System.nanoTime() - jNanoTime2;
            }
            if (jNanoTime >= jTimeoutNanos) {
                throw new java.io.InterruptedIOException(com.polidea.rxandroidble2.ClientComponent.NamedSchedulers.TIMEOUT);
            }
        } catch (java.lang.InterruptedException unused) {
            java.lang.Thread.currentThread().interrupt();
            throw new java.io.InterruptedIOException("interrupted");
        }
    }
}
