package com.polidea.rxandroidble2.internal.util;

/* JADX INFO: loaded from: classes2.dex */
public class ObservableUtil {
    private static final io.reactivex.ObservableTransformer<?, ?> IDENTITY_TRANSFORMER = new io.reactivex.ObservableTransformer<java.lang.Object, java.lang.Object>() { // from class: com.polidea.rxandroidble2.internal.util.ObservableUtil.1
        @Override // io.reactivex.ObservableTransformer
        /* JADX INFO: renamed from: apply, reason: merged with bridge method [inline-methods] */
        public io.reactivex.ObservableSource<java.lang.Object> apply2(io.reactivex.Observable<java.lang.Object> observable) {
            return observable;
        }
    };

    private ObservableUtil() {
    }

    public static <T> io.reactivex.Observable<T> justOnNext(T t) {
        return io.reactivex.Observable.never().startWith(t);
    }

    public static <T> io.reactivex.ObservableTransformer<T, T> identityTransformer() {
        return (io.reactivex.ObservableTransformer<T, T>) IDENTITY_TRANSFORMER;
    }
}
