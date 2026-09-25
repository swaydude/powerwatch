package retrofit2.adapter.rxjava2;

/* JADX INFO: loaded from: classes3.dex */
public final class RxJava2CallAdapterFactory extends retrofit2.CallAdapter.Factory {
    private final boolean isAsync;

    @javax.annotation.Nullable
    private final io.reactivex.Scheduler scheduler;

    public static retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory create() {
        return new retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory(null, false);
    }

    public static retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory createAsync() {
        return new retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory(null, true);
    }

    public static retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory createWithScheduler(io.reactivex.Scheduler scheduler) {
        java.util.Objects.requireNonNull(scheduler, "scheduler == null");
        return new retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory(scheduler, false);
    }

    private RxJava2CallAdapterFactory(@javax.annotation.Nullable io.reactivex.Scheduler scheduler, boolean z) {
        this.scheduler = scheduler;
        this.isAsync = z;
    }

    @Override // retrofit2.CallAdapter.Factory
    @javax.annotation.Nullable
    public retrofit2.CallAdapter<?, ?> get(java.lang.reflect.Type type, java.lang.annotation.Annotation[] annotationArr, retrofit2.Retrofit retrofit) {
        java.lang.reflect.Type parameterUpperBound;
        boolean z;
        boolean z2;
        java.lang.String str;
        java.lang.Class<?> rawType = getRawType(type);
        if (rawType == io.reactivex.Completable.class) {
            return new retrofit2.adapter.rxjava2.RxJava2CallAdapter(java.lang.Void.class, this.scheduler, this.isAsync, false, true, false, false, false, true);
        }
        boolean z3 = rawType == io.reactivex.Flowable.class;
        boolean z4 = rawType == io.reactivex.Single.class;
        boolean z5 = rawType == io.reactivex.Maybe.class;
        if (rawType != io.reactivex.Observable.class && !z3 && !z4 && !z5) {
            return null;
        }
        if (!(type instanceof java.lang.reflect.ParameterizedType)) {
            if (z3) {
                str = "Flowable";
            } else if (z4) {
                str = "Single";
            } else {
                str = z5 ? "Maybe" : "Observable";
            }
            throw new java.lang.IllegalStateException(str + " return type must be parameterized as " + str + "<Foo> or " + str + "<? extends Foo>");
        }
        java.lang.reflect.Type parameterUpperBound2 = getParameterUpperBound(0, (java.lang.reflect.ParameterizedType) type);
        java.lang.Class<?> rawType2 = getRawType(parameterUpperBound2);
        if (rawType2 == retrofit2.Response.class) {
            if (!(parameterUpperBound2 instanceof java.lang.reflect.ParameterizedType)) {
                throw new java.lang.IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
            }
            parameterUpperBound = getParameterUpperBound(0, (java.lang.reflect.ParameterizedType) parameterUpperBound2);
            z = false;
        } else {
            if (rawType2 != retrofit2.adapter.rxjava2.Result.class) {
                parameterUpperBound = parameterUpperBound2;
                z = false;
                z2 = true;
            } else {
                if (!(parameterUpperBound2 instanceof java.lang.reflect.ParameterizedType)) {
                    throw new java.lang.IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
                }
                parameterUpperBound = getParameterUpperBound(0, (java.lang.reflect.ParameterizedType) parameterUpperBound2);
                z = true;
            }
            return new retrofit2.adapter.rxjava2.RxJava2CallAdapter(parameterUpperBound, this.scheduler, this.isAsync, z, z2, z3, z4, z5, false);
        }
        z2 = false;
        return new retrofit2.adapter.rxjava2.RxJava2CallAdapter(parameterUpperBound, this.scheduler, this.isAsync, z, z2, z3, z4, z5, false);
    }
}
