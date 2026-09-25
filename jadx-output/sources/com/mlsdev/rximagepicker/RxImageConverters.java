package com.mlsdev.rximagepicker;

/* JADX INFO: compiled from: RxImageConverters.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ$\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bJ\u0014\u0010\r\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002¨\u0006\u0011"}, d2 = {"Lcom/mlsdev/rximagepicker/RxImageConverters;", "", "()V", "uriToBitmap", "Lio/reactivex/Observable;", "Landroid/graphics/Bitmap;", "context", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "uriToFile", "Ljava/io/File;", "file", "copyInputStreamToFile", "", "inputStream", "Ljava/io/InputStream;", "library_release"}, k = 1, mv = {1, 1, 13})
public final class RxImageConverters {
    public static final com.mlsdev.rximagepicker.RxImageConverters INSTANCE = new com.mlsdev.rximagepicker.RxImageConverters();

    private RxImageConverters() {
    }

    public final io.reactivex.Observable<java.io.File> uriToFile(final android.content.Context context, final android.net.Uri uri, final java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(context, "context");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(uri, "uri");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(file, "file");
        io.reactivex.Observable<java.io.File> observableObserveOn = io.reactivex.Observable.create(new io.reactivex.ObservableOnSubscribe<java.io.File>() { // from class: com.mlsdev.rximagepicker.RxImageConverters.uriToFile.1
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(io.reactivex.ObservableEmitter<java.io.File> emitter) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(emitter, "emitter");
                try {
                    java.io.InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                    com.mlsdev.rximagepicker.RxImageConverters rxImageConverters = com.mlsdev.rximagepicker.RxImageConverters.INSTANCE;
                    java.io.File file2 = file;
                    if (inputStreamOpenInputStream == null) {
                        kotlin.jvm.internal.Intrinsics.throwNpe();
                    }
                    rxImageConverters.copyInputStreamToFile(file2, inputStreamOpenInputStream);
                    emitter.onNext(file);
                    emitter.onComplete();
                } catch (java.lang.Exception e) {
                    java.lang.Exception exc = e;
                    android.util.Log.e(com.mlsdev.rximagepicker.RxImageConverters.class.getSimpleName(), "Error converting uri", exc);
                    emitter.onError(exc);
                }
            }
        }).subscribeOn(io.reactivex.schedulers.Schedulers.newThread()).observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread());
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(observableObserveOn, "Observable.create(Observ…dSchedulers.mainThread())");
        return observableObserveOn;
    }

    public final io.reactivex.Observable<android.graphics.Bitmap> uriToBitmap(final android.content.Context context, final android.net.Uri uri) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(context, "context");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(uri, "uri");
        io.reactivex.Observable<android.graphics.Bitmap> observableObserveOn = io.reactivex.Observable.create(new io.reactivex.ObservableOnSubscribe<android.graphics.Bitmap>() { // from class: com.mlsdev.rximagepicker.RxImageConverters.uriToBitmap.1
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(io.reactivex.ObservableEmitter<android.graphics.Bitmap> emitter) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(emitter, "emitter");
                try {
                    emitter.onNext(android.provider.MediaStore.Images.Media.getBitmap(context.getContentResolver(), uri));
                    emitter.onComplete();
                } catch (java.io.IOException e) {
                    java.io.IOException iOException = e;
                    android.util.Log.e(com.mlsdev.rximagepicker.RxImageConverters.class.getSimpleName(), "Error converting uri", iOException);
                    emitter.onError(iOException);
                }
            }
        }).subscribeOn(io.reactivex.schedulers.Schedulers.newThread()).observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread());
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(observableObserveOn, "Observable.create(Observ…dSchedulers.mainThread())");
        return observableObserveOn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copyInputStreamToFile(java.io.File file, java.io.InputStream inputStream) throws java.io.IOException {
        java.io.InputStream inputStream2 = inputStream;
        java.lang.Throwable th = (java.lang.Throwable) null;
        try {
            java.io.InputStream inputStream3 = inputStream2;
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
            java.lang.Throwable th2 = (java.lang.Throwable) null;
            try {
                kotlin.io.ByteStreamsKt.copyTo$default(inputStream3, fileOutputStream, 0, 2, null);
                kotlin.io.CloseableKt.closeFinally(fileOutputStream, th2);
                kotlin.io.CloseableKt.closeFinally(inputStream2, th);
            } catch (java.lang.Throwable th3) {
                try {
                    throw th3;
                } catch (java.lang.Throwable th4) {
                    kotlin.io.CloseableKt.closeFinally(fileOutputStream, th3);
                    throw th4;
                }
            }
        } catch (java.lang.Throwable th5) {
            try {
                throw th5;
            } catch (java.lang.Throwable th6) {
                kotlin.io.CloseableKt.closeFinally(inputStream2, th5);
                throw th6;
            }
        }
    }
}
