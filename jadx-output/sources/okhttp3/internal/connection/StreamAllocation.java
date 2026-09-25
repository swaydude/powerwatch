package okhttp3.internal.connection;

/* JADX INFO: loaded from: classes2.dex */
public final class StreamAllocation {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public final okhttp3.Address address;
    public final okhttp3.Call call;
    private final java.lang.Object callStackTrace;
    private boolean canceled;
    private okhttp3.internal.http.HttpCodec codec;
    private okhttp3.internal.connection.RealConnection connection;
    private final okhttp3.ConnectionPool connectionPool;
    public final okhttp3.EventListener eventListener;
    private int refusedStreamCount;
    private boolean released;
    private boolean reportedAcquired;
    private okhttp3.Route route;
    private okhttp3.internal.connection.RouteSelector.Selection routeSelection;
    private final okhttp3.internal.connection.RouteSelector routeSelector;

    public StreamAllocation(okhttp3.ConnectionPool connectionPool, okhttp3.Address address, okhttp3.Call call, okhttp3.EventListener eventListener, java.lang.Object obj) {
        this.connectionPool = connectionPool;
        this.address = address;
        this.call = call;
        this.eventListener = eventListener;
        this.routeSelector = new okhttp3.internal.connection.RouteSelector(address, routeDatabase(), call, eventListener);
        this.callStackTrace = obj;
    }

    public okhttp3.internal.http.HttpCodec newStream(okhttp3.OkHttpClient okHttpClient, okhttp3.Interceptor.Chain chain, boolean z) {
        try {
            okhttp3.internal.http.HttpCodec httpCodecNewCodec = findHealthyConnection(chain.connectTimeoutMillis(), chain.readTimeoutMillis(), chain.writeTimeoutMillis(), okHttpClient.pingIntervalMillis(), okHttpClient.retryOnConnectionFailure(), z).newCodec(okHttpClient, chain, this);
            synchronized (this.connectionPool) {
                this.codec = httpCodecNewCodec;
            }
            return httpCodecNewCodec;
        } catch (java.io.IOException e) {
            throw new okhttp3.internal.connection.RouteException(e);
        }
    }

    private okhttp3.internal.connection.RealConnection findHealthyConnection(int i, int i2, int i3, int i4, boolean z, boolean z2) throws java.lang.Throwable {
        while (true) {
            okhttp3.internal.connection.RealConnection realConnectionFindConnection = findConnection(i, i2, i3, i4, z);
            synchronized (this.connectionPool) {
                if (realConnectionFindConnection.successCount == 0) {
                    return realConnectionFindConnection;
                }
                if (realConnectionFindConnection.isHealthy(z2)) {
                    return realConnectionFindConnection;
                }
                noNewStreams();
            }
        }
    }

    private okhttp3.internal.connection.RealConnection findConnection(int i, int i2, int i3, int i4, boolean z) throws java.lang.Throwable {
        okhttp3.internal.connection.RealConnection realConnection;
        java.net.Socket socketReleaseIfNoNewStreams;
        okhttp3.internal.connection.RealConnection realConnection2;
        java.net.Socket socketDeduplicate;
        okhttp3.Route next;
        boolean z2;
        boolean z3;
        okhttp3.internal.connection.RouteSelector.Selection selection;
        synchronized (this.connectionPool) {
            if (this.released) {
                throw new java.lang.IllegalStateException("released");
            }
            if (this.codec != null) {
                throw new java.lang.IllegalStateException("codec != null");
            }
            if (this.canceled) {
                throw new java.io.IOException("Canceled");
            }
            realConnection = this.connection;
            socketReleaseIfNoNewStreams = releaseIfNoNewStreams();
            realConnection2 = this.connection;
            socketDeduplicate = null;
            if (realConnection2 != null) {
                realConnection = null;
            } else {
                realConnection2 = null;
            }
            if (!this.reportedAcquired) {
                realConnection = null;
            }
            if (realConnection2 == null) {
                okhttp3.internal.Internal.instance.get(this.connectionPool, this.address, this, null);
                okhttp3.internal.connection.RealConnection realConnection3 = this.connection;
                if (realConnection3 != null) {
                    realConnection2 = realConnection3;
                    z2 = true;
                    next = null;
                } else {
                    next = this.route;
                }
            } else {
                next = null;
            }
            z2 = false;
        }
        okhttp3.internal.Util.closeQuietly(socketReleaseIfNoNewStreams);
        if (realConnection != null) {
            this.eventListener.connectionReleased(this.call, realConnection);
        }
        if (z2) {
            this.eventListener.connectionAcquired(this.call, realConnection2);
        }
        if (realConnection2 != null) {
            return realConnection2;
        }
        if (next != null || ((selection = this.routeSelection) != null && selection.hasNext())) {
            z3 = false;
        } else {
            this.routeSelection = this.routeSelector.next();
            z3 = true;
        }
        synchronized (this.connectionPool) {
            if (this.canceled) {
                throw new java.io.IOException("Canceled");
            }
            if (z3) {
                java.util.List<okhttp3.Route> all = this.routeSelection.getAll();
                int size = all.size();
                for (int i5 = 0; i5 < size; i5++) {
                    okhttp3.Route route = all.get(i5);
                    okhttp3.internal.Internal.instance.get(this.connectionPool, this.address, this, route);
                    okhttp3.internal.connection.RealConnection realConnection4 = this.connection;
                    if (realConnection4 != null) {
                        this.route = route;
                        realConnection2 = realConnection4;
                        z2 = true;
                        break;
                    }
                }
            }
            if (!z2) {
                if (next == null) {
                    next = this.routeSelection.next();
                }
                this.route = next;
                this.refusedStreamCount = 0;
                realConnection2 = new okhttp3.internal.connection.RealConnection(this.connectionPool, next);
                acquire(realConnection2, false);
            }
        }
        if (z2) {
            this.eventListener.connectionAcquired(this.call, realConnection2);
            return realConnection2;
        }
        realConnection2.connect(i, i2, i3, i4, z, this.call, this.eventListener);
        routeDatabase().connected(realConnection2.route());
        synchronized (this.connectionPool) {
            this.reportedAcquired = true;
            okhttp3.internal.Internal.instance.put(this.connectionPool, realConnection2);
            if (realConnection2.isMultiplexed()) {
                socketDeduplicate = okhttp3.internal.Internal.instance.deduplicate(this.connectionPool, this.address, this);
                realConnection2 = this.connection;
            }
        }
        okhttp3.internal.Util.closeQuietly(socketDeduplicate);
        this.eventListener.connectionAcquired(this.call, realConnection2);
        return realConnection2;
    }

    private java.net.Socket releaseIfNoNewStreams() {
        okhttp3.internal.connection.RealConnection realConnection = this.connection;
        if (realConnection == null || !realConnection.noNewStreams) {
            return null;
        }
        return deallocate(false, false, true);
    }

    public void streamFinished(boolean z, okhttp3.internal.http.HttpCodec httpCodec, long j, java.io.IOException iOException) {
        okhttp3.internal.connection.RealConnection realConnection;
        java.net.Socket socketDeallocate;
        boolean z2;
        this.eventListener.responseBodyEnd(this.call, j);
        synchronized (this.connectionPool) {
            if (httpCodec != null) {
                if (httpCodec == this.codec) {
                    if (!z) {
                        this.connection.successCount++;
                    }
                    realConnection = this.connection;
                    socketDeallocate = deallocate(z, false, true);
                    if (this.connection != null) {
                        realConnection = null;
                    }
                    z2 = this.released;
                }
            }
            throw new java.lang.IllegalStateException("expected " + this.codec + " but was " + httpCodec);
        }
        okhttp3.internal.Util.closeQuietly(socketDeallocate);
        if (realConnection != null) {
            this.eventListener.connectionReleased(this.call, realConnection);
        }
        if (iOException != null) {
            this.eventListener.callFailed(this.call, okhttp3.internal.Internal.instance.timeoutExit(this.call, iOException));
        } else if (z2) {
            okhttp3.internal.Internal.instance.timeoutExit(this.call, null);
            this.eventListener.callEnd(this.call);
        }
    }

    public okhttp3.internal.http.HttpCodec codec() {
        okhttp3.internal.http.HttpCodec httpCodec;
        synchronized (this.connectionPool) {
            httpCodec = this.codec;
        }
        return httpCodec;
    }

    private okhttp3.internal.connection.RouteDatabase routeDatabase() {
        return okhttp3.internal.Internal.instance.routeDatabase(this.connectionPool);
    }

    public okhttp3.Route route() {
        return this.route;
    }

    public synchronized okhttp3.internal.connection.RealConnection connection() {
        return this.connection;
    }

    public void release() {
        okhttp3.internal.connection.RealConnection realConnection;
        java.net.Socket socketDeallocate;
        synchronized (this.connectionPool) {
            realConnection = this.connection;
            socketDeallocate = deallocate(false, true, false);
            if (this.connection != null) {
                realConnection = null;
            }
        }
        okhttp3.internal.Util.closeQuietly(socketDeallocate);
        if (realConnection != null) {
            okhttp3.internal.Internal.instance.timeoutExit(this.call, null);
            this.eventListener.connectionReleased(this.call, realConnection);
            this.eventListener.callEnd(this.call);
        }
    }

    public void noNewStreams() {
        okhttp3.internal.connection.RealConnection realConnection;
        java.net.Socket socketDeallocate;
        synchronized (this.connectionPool) {
            realConnection = this.connection;
            socketDeallocate = deallocate(true, false, false);
            if (this.connection != null) {
                realConnection = null;
            }
        }
        okhttp3.internal.Util.closeQuietly(socketDeallocate);
        if (realConnection != null) {
            this.eventListener.connectionReleased(this.call, realConnection);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    private java.net.Socket deallocate(boolean z, boolean z2, boolean z3) {
        java.net.Socket socket;
        if (z3) {
            this.codec = null;
        }
        if (z2) {
            this.released = true;
        }
        okhttp3.internal.connection.RealConnection realConnection = this.connection;
        if (realConnection == null) {
            return null;
        }
        if (z) {
            realConnection.noNewStreams = true;
        }
        if (this.codec != null) {
            return null;
        }
        if (!this.released && !this.connection.noNewStreams) {
            return null;
        }
        release(this.connection);
        if (this.connection.allocations.isEmpty()) {
            this.connection.idleAtNanos = java.lang.System.nanoTime();
            if (okhttp3.internal.Internal.instance.connectionBecameIdle(this.connectionPool, this.connection)) {
                socket = this.connection.socket();
            } else {
                socket = null;
            }
        } else {
            socket = null;
        }
        this.connection = null;
        return socket;
    }

    public void cancel() {
        okhttp3.internal.http.HttpCodec httpCodec;
        okhttp3.internal.connection.RealConnection realConnection;
        synchronized (this.connectionPool) {
            this.canceled = true;
            httpCodec = this.codec;
            realConnection = this.connection;
        }
        if (httpCodec != null) {
            httpCodec.cancel();
        } else if (realConnection != null) {
            realConnection.cancel();
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0046  */
    public void streamFailed(java.io.IOException iOException) {
        okhttp3.internal.connection.RealConnection realConnection;
        boolean z;
        java.net.Socket socketDeallocate;
        synchronized (this.connectionPool) {
            realConnection = null;
            if (iOException instanceof okhttp3.internal.http2.StreamResetException) {
                okhttp3.internal.http2.ErrorCode errorCode = ((okhttp3.internal.http2.StreamResetException) iOException).errorCode;
                if (errorCode == okhttp3.internal.http2.ErrorCode.REFUSED_STREAM) {
                    int i = this.refusedStreamCount + 1;
                    this.refusedStreamCount = i;
                    if (i > 1) {
                        this.route = null;
                        z = true;
                    } else {
                        z = false;
                    }
                } else if (errorCode != okhttp3.internal.http2.ErrorCode.CANCEL) {
                    this.route = null;
                    z = true;
                } else {
                    z = false;
                }
            } else {
                okhttp3.internal.connection.RealConnection realConnection2 = this.connection;
                if (realConnection2 == null || (realConnection2.isMultiplexed() && !(iOException instanceof okhttp3.internal.http2.ConnectionShutdownException))) {
                    z = false;
                } else {
                    if (this.connection.successCount == 0) {
                        okhttp3.Route route = this.route;
                        if (route != null && iOException != null) {
                            this.routeSelector.connectFailed(route, iOException);
                        }
                        this.route = null;
                    }
                    z = true;
                }
            }
            okhttp3.internal.connection.RealConnection realConnection3 = this.connection;
            socketDeallocate = deallocate(z, false, true);
            if (this.connection == null && this.reportedAcquired) {
                realConnection = realConnection3;
            }
        }
        okhttp3.internal.Util.closeQuietly(socketDeallocate);
        if (realConnection != null) {
            this.eventListener.connectionReleased(this.call, realConnection);
        }
    }

    public void acquire(okhttp3.internal.connection.RealConnection realConnection, boolean z) {
        if (this.connection != null) {
            throw new java.lang.IllegalStateException();
        }
        this.connection = realConnection;
        this.reportedAcquired = z;
        realConnection.allocations.add(new okhttp3.internal.connection.StreamAllocation.StreamAllocationReference(this, this.callStackTrace));
    }

    private void release(okhttp3.internal.connection.RealConnection realConnection) {
        int size = realConnection.allocations.size();
        for (int i = 0; i < size; i++) {
            if (realConnection.allocations.get(i).get() == this) {
                realConnection.allocations.remove(i);
                return;
            }
        }
        throw new java.lang.IllegalStateException();
    }

    public java.net.Socket releaseAndAcquire(okhttp3.internal.connection.RealConnection realConnection) {
        if (this.codec != null || this.connection.allocations.size() != 1) {
            throw new java.lang.IllegalStateException();
        }
        java.lang.ref.Reference<okhttp3.internal.connection.StreamAllocation> reference = this.connection.allocations.get(0);
        java.net.Socket socketDeallocate = deallocate(true, false, false);
        this.connection = realConnection;
        realConnection.allocations.add(reference);
        return socketDeallocate;
    }

    public boolean hasMoreRoutes() {
        okhttp3.internal.connection.RouteSelector.Selection selection;
        return this.route != null || ((selection = this.routeSelection) != null && selection.hasNext()) || this.routeSelector.hasNext();
    }

    public java.lang.String toString() {
        okhttp3.internal.connection.RealConnection realConnectionConnection = connection();
        return realConnectionConnection != null ? realConnectionConnection.toString() : this.address.toString();
    }

    public static final class StreamAllocationReference extends java.lang.ref.WeakReference<okhttp3.internal.connection.StreamAllocation> {
        public final java.lang.Object callStackTrace;

        StreamAllocationReference(okhttp3.internal.connection.StreamAllocation streamAllocation, java.lang.Object obj) {
            super(streamAllocation);
            this.callStackTrace = obj;
        }
    }
}
