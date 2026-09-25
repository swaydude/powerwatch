package retrofit2;

/* JADX INFO: loaded from: classes3.dex */
final class ExecutorCallAdapterFactory extends retrofit2.CallAdapter.Factory {
    final java.util.concurrent.Executor callbackExecutor;

    ExecutorCallAdapterFactory(java.util.concurrent.Executor executor) {
        this.callbackExecutor = executor;
    }

    @Override // retrofit2.CallAdapter.Factory
    @javax.annotation.Nullable
    public retrofit2.CallAdapter<?, ?> get(java.lang.reflect.Type type, java.lang.annotation.Annotation[] annotationArr, retrofit2.Retrofit retrofit) {
        if (getRawType(type) != retrofit2.Call.class) {
            return null;
        }
        final java.lang.reflect.Type callResponseType = retrofit2.Utils.getCallResponseType(type);
        return new retrofit2.CallAdapter<java.lang.Object, retrofit2.Call<?>>() { // from class: retrofit2.ExecutorCallAdapterFactory.1
            @Override // retrofit2.CallAdapter
            public java.lang.reflect.Type responseType() {
                return callResponseType;
            }

            @Override // retrofit2.CallAdapter
            public retrofit2.Call<?> adapt(retrofit2.Call<java.lang.Object> call) {
                return new retrofit2.ExecutorCallAdapterFactory.ExecutorCallbackCall(retrofit2.ExecutorCallAdapterFactory.this.callbackExecutor, call);
            }
        };
    }

    static final class ExecutorCallbackCall<T> implements retrofit2.Call<T> {
        final java.util.concurrent.Executor callbackExecutor;
        final retrofit2.Call<T> delegate;

        ExecutorCallbackCall(java.util.concurrent.Executor executor, retrofit2.Call<T> call) {
            this.callbackExecutor = executor;
            this.delegate = call;
        }

        @Override // retrofit2.Call
        public void enqueue(final retrofit2.Callback<T> callback) {
            retrofit2.Utils.checkNotNull(callback, "callback == null");
            this.delegate.enqueue(new retrofit2.Callback<T>() { // from class: retrofit2.ExecutorCallAdapterFactory.ExecutorCallbackCall.1
                @Override // retrofit2.Callback
                public void onResponse(retrofit2.Call<T> call, final retrofit2.Response<T> response) {
                    retrofit2.ExecutorCallAdapterFactory.ExecutorCallbackCall.this.callbackExecutor.execute(new java.lang.Runnable() { // from class: retrofit2.ExecutorCallAdapterFactory.ExecutorCallbackCall.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (retrofit2.ExecutorCallAdapterFactory.ExecutorCallbackCall.this.delegate.isCanceled()) {
                                callback.onFailure(retrofit2.ExecutorCallAdapterFactory.ExecutorCallbackCall.this, new java.io.IOException("Canceled"));
                            } else {
                                callback.onResponse(retrofit2.ExecutorCallAdapterFactory.ExecutorCallbackCall.this, response);
                            }
                        }
                    });
                }

                @Override // retrofit2.Callback
                public void onFailure(retrofit2.Call<T> call, final java.lang.Throwable th) {
                    retrofit2.ExecutorCallAdapterFactory.ExecutorCallbackCall.this.callbackExecutor.execute(new java.lang.Runnable() { // from class: retrofit2.ExecutorCallAdapterFactory.ExecutorCallbackCall.1.2
                        @Override // java.lang.Runnable
                        public void run() {
                            callback.onFailure(retrofit2.ExecutorCallAdapterFactory.ExecutorCallbackCall.this, th);
                        }
                    });
                }
            });
        }

        @Override // retrofit2.Call
        public boolean isExecuted() {
            return this.delegate.isExecuted();
        }

        @Override // retrofit2.Call
        public retrofit2.Response<T> execute() throws java.io.IOException {
            return this.delegate.execute();
        }

        @Override // retrofit2.Call
        public void cancel() {
            this.delegate.cancel();
        }

        @Override // retrofit2.Call
        public boolean isCanceled() {
            return this.delegate.isCanceled();
        }

        @Override // retrofit2.Call
        public retrofit2.Call<T> clone() {
            return new retrofit2.ExecutorCallAdapterFactory.ExecutorCallbackCall(this.callbackExecutor, this.delegate.clone());
        }

        @Override // retrofit2.Call
        public okhttp3.Request request() {
            return this.delegate.request();
        }
    }
}
