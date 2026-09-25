package okio;

/* JADX INFO: loaded from: classes2.dex */
public class AsyncTimeout extends okio.Timeout {
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    private static final int TIMEOUT_WRITE_SIZE = 65536;

    @javax.annotation.Nullable
    static okio.AsyncTimeout head;
    private boolean inQueue;

    @javax.annotation.Nullable
    private okio.AsyncTimeout next;
    private long timeoutAt;

    protected void timedOut() {
    }

    static {
        long millis = java.util.concurrent.TimeUnit.SECONDS.toMillis(60L);
        IDLE_TIMEOUT_MILLIS = millis;
        IDLE_TIMEOUT_NANOS = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void enter() {
        if (this.inQueue) {
            throw new java.lang.IllegalStateException("Unbalanced enter/exit");
        }
        long jTimeoutNanos = timeoutNanos();
        boolean zHasDeadline = hasDeadline();
        if (jTimeoutNanos != 0 || zHasDeadline) {
            this.inQueue = true;
            scheduleTimeout(this, jTimeoutNanos, zHasDeadline);
        }
    }

    private static synchronized void scheduleTimeout(okio.AsyncTimeout asyncTimeout, long j, boolean z) {
        if (head == null) {
            head = new okio.AsyncTimeout();
            new okio.AsyncTimeout.Watchdog().start();
        }
        long jNanoTime = java.lang.System.nanoTime();
        if (j != 0 && z) {
            asyncTimeout.timeoutAt = java.lang.Math.min(j, asyncTimeout.deadlineNanoTime() - jNanoTime) + jNanoTime;
        } else if (j != 0) {
            asyncTimeout.timeoutAt = j + jNanoTime;
        } else if (z) {
            asyncTimeout.timeoutAt = asyncTimeout.deadlineNanoTime();
        } else {
            throw new java.lang.AssertionError();
        }
        long jRemainingNanos = asyncTimeout.remainingNanos(jNanoTime);
        okio.AsyncTimeout asyncTimeout2 = head;
        while (true) {
            okio.AsyncTimeout asyncTimeout3 = asyncTimeout2.next;
            if (asyncTimeout3 == null || jRemainingNanos < asyncTimeout3.remainingNanos(jNanoTime)) {
                break;
                break;
            }
            asyncTimeout2 = asyncTimeout2.next;
        }
        asyncTimeout.next = asyncTimeout2.next;
        asyncTimeout2.next = asyncTimeout;
        if (asyncTimeout2 == head) {
            okio.AsyncTimeout.class.notify();
        }
    }

    public final boolean exit() {
        if (!this.inQueue) {
            return false;
        }
        this.inQueue = false;
        return cancelScheduledTimeout(this);
    }

    private static synchronized boolean cancelScheduledTimeout(okio.AsyncTimeout asyncTimeout) {
        okio.AsyncTimeout asyncTimeout2 = head;
        while (asyncTimeout2 != null) {
            okio.AsyncTimeout asyncTimeout3 = asyncTimeout2.next;
            if (asyncTimeout3 == asyncTimeout) {
                asyncTimeout2.next = asyncTimeout.next;
                asyncTimeout.next = null;
                return false;
            }
            asyncTimeout2 = asyncTimeout3;
        }
        return true;
    }

    private long remainingNanos(long j) {
        return this.timeoutAt - j;
    }

    public final okio.Sink sink(final okio.Sink sink) {
        return new okio.Sink() { // from class: okio.AsyncTimeout.1
            @Override // okio.Sink
            public void write(okio.Buffer buffer, long j) throws java.io.IOException {
                okio.Util.checkOffsetAndCount(buffer.size, 0L, j);
                while (true) {
                    long j2 = 0;
                    if (j <= 0) {
                        return;
                    }
                    okio.Segment segment = buffer.head;
                    while (j2 < android.support.v4.media.session.PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                        j2 += (long) (segment.limit - segment.pos);
                        if (j2 >= j) {
                            j2 = j;
                            break;
                        }
                        segment = segment.next;
                    }
                    okio.AsyncTimeout.this.enter();
                    try {
                        try {
                            sink.write(buffer, j2);
                            j -= j2;
                            okio.AsyncTimeout.this.exit(true);
                        } catch (java.io.IOException e) {
                            throw okio.AsyncTimeout.this.exit(e);
                        }
                    } catch (java.lang.Throwable th) {
                        okio.AsyncTimeout.this.exit(false);
                        throw th;
                    }
                }
            }

            @Override // okio.Sink, java.io.Flushable
            public void flush() throws java.io.IOException {
                okio.AsyncTimeout.this.enter();
                try {
                    try {
                        sink.flush();
                        okio.AsyncTimeout.this.exit(true);
                    } catch (java.io.IOException e) {
                        throw okio.AsyncTimeout.this.exit(e);
                    }
                } catch (java.lang.Throwable th) {
                    okio.AsyncTimeout.this.exit(false);
                    throw th;
                }
            }

            @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws java.io.IOException {
                okio.AsyncTimeout.this.enter();
                try {
                    try {
                        sink.close();
                        okio.AsyncTimeout.this.exit(true);
                    } catch (java.io.IOException e) {
                        throw okio.AsyncTimeout.this.exit(e);
                    }
                } catch (java.lang.Throwable th) {
                    okio.AsyncTimeout.this.exit(false);
                    throw th;
                }
            }

            @Override // okio.Sink
            public okio.Timeout timeout() {
                return okio.AsyncTimeout.this;
            }

            public java.lang.String toString() {
                return "AsyncTimeout.sink(" + sink + ")";
            }
        };
    }

    public final okio.Source source(final okio.Source source) {
        return new okio.Source() { // from class: okio.AsyncTimeout.2
            @Override // okio.Source
            public long read(okio.Buffer buffer, long j) throws java.io.IOException {
                okio.AsyncTimeout.this.enter();
                try {
                    try {
                        long j2 = source.read(buffer, j);
                        okio.AsyncTimeout.this.exit(true);
                        return j2;
                    } catch (java.io.IOException e) {
                        throw okio.AsyncTimeout.this.exit(e);
                    }
                } catch (java.lang.Throwable th) {
                    okio.AsyncTimeout.this.exit(false);
                    throw th;
                }
            }

            @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws java.io.IOException {
                try {
                    try {
                        source.close();
                        okio.AsyncTimeout.this.exit(true);
                    } catch (java.io.IOException e) {
                        throw okio.AsyncTimeout.this.exit(e);
                    }
                } catch (java.lang.Throwable th) {
                    okio.AsyncTimeout.this.exit(false);
                    throw th;
                }
            }

            @Override // okio.Source
            public okio.Timeout timeout() {
                return okio.AsyncTimeout.this;
            }

            public java.lang.String toString() {
                return "AsyncTimeout.source(" + source + ")";
            }
        };
    }

    final void exit(boolean z) throws java.io.IOException {
        if (exit() && z) {
            throw newTimeoutException(null);
        }
    }

    final java.io.IOException exit(java.io.IOException iOException) throws java.io.IOException {
        return !exit() ? iOException : newTimeoutException(iOException);
    }

    protected java.io.IOException newTimeoutException(@javax.annotation.Nullable java.io.IOException iOException) {
        java.io.InterruptedIOException interruptedIOException = new java.io.InterruptedIOException(com.polidea.rxandroidble2.ClientComponent.NamedSchedulers.TIMEOUT);
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    private static final class Watchdog extends java.lang.Thread {
        Watchdog() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0015, code lost:
        
            r1.timedOut();
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r3 = this;
            L0:
                java.lang.Class<okio.AsyncTimeout> r0 = okio.AsyncTimeout.class
                monitor-enter(r0)     // Catch: java.lang.InterruptedException -> L0
                okio.AsyncTimeout r1 = okio.AsyncTimeout.awaitTimeout()     // Catch: java.lang.Throwable -> L19
                if (r1 != 0) goto Lb
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                goto L0
            Lb:
                okio.AsyncTimeout r2 = okio.AsyncTimeout.head     // Catch: java.lang.Throwable -> L19
                if (r1 != r2) goto L14
                r1 = 0
                okio.AsyncTimeout.head = r1     // Catch: java.lang.Throwable -> L19
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                return
            L14:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                r1.timedOut()     // Catch: java.lang.InterruptedException -> L0
                goto L0
            L19:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                throw r1     // Catch: java.lang.InterruptedException -> L0
            */
            throw new UnsupportedOperationException("Method not decompiled: okio.AsyncTimeout.Watchdog.run():void");
        }
    }

    @javax.annotation.Nullable
    static okio.AsyncTimeout awaitTimeout() throws java.lang.InterruptedException {
        okio.AsyncTimeout asyncTimeout = head.next;
        if (asyncTimeout == null) {
            long jNanoTime = java.lang.System.nanoTime();
            okio.AsyncTimeout.class.wait(IDLE_TIMEOUT_MILLIS);
            if (head.next != null || java.lang.System.nanoTime() - jNanoTime < IDLE_TIMEOUT_NANOS) {
                return null;
            }
            return head;
        }
        long jRemainingNanos = asyncTimeout.remainingNanos(java.lang.System.nanoTime());
        if (jRemainingNanos > 0) {
            long j = jRemainingNanos / 1000000;
            okio.AsyncTimeout.class.wait(j, (int) (jRemainingNanos - (1000000 * j)));
            return null;
        }
        head.next = asyncTimeout.next;
        asyncTimeout.next = null;
        return asyncTimeout;
    }
}
