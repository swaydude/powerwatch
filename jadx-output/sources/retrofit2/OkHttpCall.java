package retrofit2;

/* JADX INFO: loaded from: classes3.dex */
final class OkHttpCall<T> implements retrofit2.Call<T> {
    private final java.lang.Object[] args;
    private final okhttp3.Call.Factory callFactory;
    private volatile boolean canceled;

    @javax.annotation.Nullable
    private java.lang.Throwable creationFailure;
    private boolean executed;

    @javax.annotation.Nullable
    private okhttp3.Call rawCall;
    private final retrofit2.RequestFactory requestFactory;
    private final retrofit2.Converter<okhttp3.ResponseBody, T> responseConverter;

    OkHttpCall(retrofit2.RequestFactory requestFactory, java.lang.Object[] objArr, okhttp3.Call.Factory factory, retrofit2.Converter<okhttp3.ResponseBody, T> converter) {
        this.requestFactory = requestFactory;
        this.args = objArr;
        this.callFactory = factory;
        this.responseConverter = converter;
    }

    @Override // retrofit2.Call
    public retrofit2.OkHttpCall<T> clone() {
        return new retrofit2.OkHttpCall<>(this.requestFactory, this.args, this.callFactory, this.responseConverter);
    }

    @Override // retrofit2.Call
    public synchronized okhttp3.Request request() {
        okhttp3.Call call = this.rawCall;
        if (call != null) {
            return call.request();
        }
        java.lang.Throwable th = this.creationFailure;
        if (th != null) {
            if (th instanceof java.io.IOException) {
                throw new java.lang.RuntimeException("Unable to create request.", this.creationFailure);
            }
            if (th instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) th);
            }
            throw ((java.lang.Error) th);
        }
        try {
            okhttp3.Call callCreateRawCall = createRawCall();
            this.rawCall = callCreateRawCall;
            return callCreateRawCall.request();
        } catch (java.io.IOException e) {
            this.creationFailure = e;
            throw new java.lang.RuntimeException("Unable to create request.", e);
        } catch (java.lang.Error e2) {
            e = e2;
            retrofit2.Utils.throwIfFatal(e);
            this.creationFailure = e;
            throw e;
        } catch (java.lang.RuntimeException e3) {
            e = e3;
            retrofit2.Utils.throwIfFatal(e);
            this.creationFailure = e;
            throw e;
        }
    }

    @Override // retrofit2.Call
    public void enqueue(final retrofit2.Callback<T> callback) {
        okhttp3.Call call;
        java.lang.Throwable th;
        retrofit2.Utils.checkNotNull(callback, "callback == null");
        synchronized (this) {
            if (this.executed) {
                throw new java.lang.IllegalStateException("Already executed.");
            }
            this.executed = true;
            call = this.rawCall;
            th = this.creationFailure;
            if (call == null && th == null) {
                try {
                    okhttp3.Call callCreateRawCall = createRawCall();
                    this.rawCall = callCreateRawCall;
                    call = callCreateRawCall;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    retrofit2.Utils.throwIfFatal(th);
                    this.creationFailure = th;
                }
            }
        }
        if (th != null) {
            callback.onFailure(this, th);
            return;
        }
        if (this.canceled) {
            call.cancel();
        }
        call.enqueue(new okhttp3.Callback() { // from class: retrofit2.OkHttpCall.1
            @Override // okhttp3.Callback
            public void onResponse(okhttp3.Call call2, okhttp3.Response response) {
                try {
                    try {
                        callback.onResponse(retrofit2.OkHttpCall.this, retrofit2.OkHttpCall.this.parseResponse(response));
                    } catch (java.lang.Throwable th3) {
                        th3.printStackTrace();
                    }
                } catch (java.lang.Throwable th4) {
                    retrofit2.Utils.throwIfFatal(th4);
                    callFailure(th4);
                }
            }

            @Override // okhttp3.Callback
            public void onFailure(okhttp3.Call call2, java.io.IOException iOException) {
                callFailure(iOException);
            }

            private void callFailure(java.lang.Throwable th3) {
                try {
                    callback.onFailure(retrofit2.OkHttpCall.this, th3);
                } catch (java.lang.Throwable th4) {
                    th4.printStackTrace();
                }
            }
        });
    }

    @Override // retrofit2.Call
    public synchronized boolean isExecuted() {
        return this.executed;
    }

    @Override // retrofit2.Call
    public retrofit2.Response<T> execute() throws java.io.IOException {
        okhttp3.Call callCreateRawCall;
        synchronized (this) {
            if (this.executed) {
                throw new java.lang.IllegalStateException("Already executed.");
            }
            this.executed = true;
            java.lang.Throwable th = this.creationFailure;
            if (th != null) {
                if (th instanceof java.io.IOException) {
                    throw ((java.io.IOException) th);
                }
                if (th instanceof java.lang.RuntimeException) {
                    throw ((java.lang.RuntimeException) th);
                }
                throw ((java.lang.Error) th);
            }
            callCreateRawCall = this.rawCall;
            if (callCreateRawCall == null) {
                try {
                    callCreateRawCall = createRawCall();
                    this.rawCall = callCreateRawCall;
                } catch (java.io.IOException | java.lang.Error | java.lang.RuntimeException e) {
                    retrofit2.Utils.throwIfFatal(e);
                    this.creationFailure = e;
                    throw e;
                }
            }
        }
        if (this.canceled) {
            callCreateRawCall.cancel();
        }
        return parseResponse(callCreateRawCall.execute());
    }

    private okhttp3.Call createRawCall() throws java.io.IOException {
        okhttp3.Call callNewCall = this.callFactory.newCall(this.requestFactory.create(this.args));
        java.util.Objects.requireNonNull(callNewCall, "Call.Factory returned null.");
        return callNewCall;
    }

    retrofit2.Response<T> parseResponse(okhttp3.Response response) throws java.io.IOException {
        okhttp3.ResponseBody responseBodyBody = response.body();
        okhttp3.Response responseBuild = response.newBuilder().body(new retrofit2.OkHttpCall.NoContentResponseBody(responseBodyBody.contentType(), responseBodyBody.contentLength())).build();
        int iCode = responseBuild.code();
        if (iCode < 200 || iCode >= 300) {
            try {
                return retrofit2.Response.error(retrofit2.Utils.buffer(responseBodyBody), responseBuild);
            } finally {
                responseBodyBody.close();
            }
        }
        if (iCode == 204 || iCode == 205) {
            responseBodyBody.close();
            return retrofit2.Response.success((java.lang.Object) null, responseBuild);
        }
        retrofit2.OkHttpCall.ExceptionCatchingResponseBody exceptionCatchingResponseBody = new retrofit2.OkHttpCall.ExceptionCatchingResponseBody(responseBodyBody);
        try {
            return retrofit2.Response.success(this.responseConverter.convert(exceptionCatchingResponseBody), responseBuild);
        } catch (java.lang.RuntimeException e) {
            exceptionCatchingResponseBody.throwIfCaught();
            throw e;
        }
    }

    @Override // retrofit2.Call
    public void cancel() {
        okhttp3.Call call;
        this.canceled = true;
        synchronized (this) {
            call = this.rawCall;
        }
        if (call != null) {
            call.cancel();
        }
    }

    @Override // retrofit2.Call
    public boolean isCanceled() {
        boolean z = true;
        if (this.canceled) {
            return true;
        }
        synchronized (this) {
            okhttp3.Call call = this.rawCall;
            if (call == null || !call.isCanceled()) {
                z = false;
            }
        }
        return z;
    }

    static final class NoContentResponseBody extends okhttp3.ResponseBody {
        private final long contentLength;

        @javax.annotation.Nullable
        private final okhttp3.MediaType contentType;

        NoContentResponseBody(@javax.annotation.Nullable okhttp3.MediaType mediaType, long j) {
            this.contentType = mediaType;
            this.contentLength = j;
        }

        @Override // okhttp3.ResponseBody
        public okhttp3.MediaType contentType() {
            return this.contentType;
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            return this.contentLength;
        }

        @Override // okhttp3.ResponseBody
        public okio.BufferedSource source() {
            throw new java.lang.IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    static final class ExceptionCatchingResponseBody extends okhttp3.ResponseBody {
        private final okhttp3.ResponseBody delegate;

        @javax.annotation.Nullable
        java.io.IOException thrownException;

        ExceptionCatchingResponseBody(okhttp3.ResponseBody responseBody) {
            this.delegate = responseBody;
        }

        @Override // okhttp3.ResponseBody
        public okhttp3.MediaType contentType() {
            return this.delegate.contentType();
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            return this.delegate.contentLength();
        }

        @Override // okhttp3.ResponseBody
        public okio.BufferedSource source() {
            return okio.Okio.buffer(new okio.ForwardingSource(this.delegate.source()) { // from class: retrofit2.OkHttpCall.ExceptionCatchingResponseBody.1
                @Override // okio.ForwardingSource, okio.Source
                public long read(okio.Buffer buffer, long j) throws java.io.IOException {
                    try {
                        return super.read(buffer, j);
                    } catch (java.io.IOException e) {
                        retrofit2.OkHttpCall.ExceptionCatchingResponseBody.this.thrownException = e;
                        throw e;
                    }
                }
            });
        }

        @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.delegate.close();
        }

        void throwIfCaught() throws java.io.IOException {
            java.io.IOException iOException = this.thrownException;
            if (iOException != null) {
                throw iOException;
            }
        }
    }
}
