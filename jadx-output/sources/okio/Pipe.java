package okio;

/* JADX INFO: loaded from: classes2.dex */
public final class Pipe {
    final long maxBufferSize;
    boolean sinkClosed;
    boolean sourceClosed;
    final okio.Buffer buffer = new okio.Buffer();
    private final okio.Sink sink = new okio.Pipe.PipeSink();
    private final okio.Source source = new okio.Pipe.PipeSource();

    public Pipe(long j) {
        if (j < 1) {
            throw new java.lang.IllegalArgumentException("maxBufferSize < 1: " + j);
        }
        this.maxBufferSize = j;
    }

    public final okio.Source source() {
        return this.source;
    }

    public final okio.Sink sink() {
        return this.sink;
    }

    final class PipeSink implements okio.Sink {
        final okio.Timeout timeout = new okio.Timeout();

        PipeSink() {
        }

        @Override // okio.Sink
        public void write(okio.Buffer buffer, long j) throws java.io.IOException {
            synchronized (okio.Pipe.this.buffer) {
                if (okio.Pipe.this.sinkClosed) {
                    throw new java.lang.IllegalStateException("closed");
                }
                while (j > 0) {
                    if (okio.Pipe.this.sourceClosed) {
                        throw new java.io.IOException("source is closed");
                    }
                    long size = okio.Pipe.this.maxBufferSize - okio.Pipe.this.buffer.size();
                    if (size == 0) {
                        this.timeout.waitUntilNotified(okio.Pipe.this.buffer);
                    } else {
                        long jMin = java.lang.Math.min(size, j);
                        okio.Pipe.this.buffer.write(buffer, jMin);
                        j -= jMin;
                        okio.Pipe.this.buffer.notifyAll();
                    }
                }
            }
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() throws java.io.IOException {
            synchronized (okio.Pipe.this.buffer) {
                if (okio.Pipe.this.sinkClosed) {
                    throw new java.lang.IllegalStateException("closed");
                }
                if (okio.Pipe.this.sourceClosed && okio.Pipe.this.buffer.size() > 0) {
                    throw new java.io.IOException("source is closed");
                }
            }
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
            synchronized (okio.Pipe.this.buffer) {
                if (okio.Pipe.this.sinkClosed) {
                    return;
                }
                if (okio.Pipe.this.sourceClosed && okio.Pipe.this.buffer.size() > 0) {
                    throw new java.io.IOException("source is closed");
                }
                okio.Pipe.this.sinkClosed = true;
                okio.Pipe.this.buffer.notifyAll();
            }
        }

        @Override // okio.Sink
        public okio.Timeout timeout() {
            return this.timeout;
        }
    }

    final class PipeSource implements okio.Source {
        final okio.Timeout timeout = new okio.Timeout();

        PipeSource() {
        }

        @Override // okio.Source
        public long read(okio.Buffer buffer, long j) throws java.io.IOException {
            synchronized (okio.Pipe.this.buffer) {
                if (okio.Pipe.this.sourceClosed) {
                    throw new java.lang.IllegalStateException("closed");
                }
                while (okio.Pipe.this.buffer.size() == 0) {
                    if (okio.Pipe.this.sinkClosed) {
                        return -1L;
                    }
                    this.timeout.waitUntilNotified(okio.Pipe.this.buffer);
                }
                long j2 = okio.Pipe.this.buffer.read(buffer, j);
                okio.Pipe.this.buffer.notifyAll();
                return j2;
            }
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
            synchronized (okio.Pipe.this.buffer) {
                okio.Pipe.this.sourceClosed = true;
                okio.Pipe.this.buffer.notifyAll();
            }
        }

        @Override // okio.Source
        public okio.Timeout timeout() {
            return this.timeout;
        }
    }
}
