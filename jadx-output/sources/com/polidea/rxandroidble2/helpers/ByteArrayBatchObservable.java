package com.polidea.rxandroidble2.helpers;

/* JADX INFO: loaded from: classes2.dex */
public class ByteArrayBatchObservable extends io.reactivex.Flowable<byte[]> {
    private final java.nio.ByteBuffer byteBuffer;
    private final int maxBatchSize;

    public ByteArrayBatchObservable(byte[] bArr, int i) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("maxBatchSize must be > 0 but found: " + i);
        }
        this.byteBuffer = java.nio.ByteBuffer.wrap(bArr);
        this.maxBatchSize = i;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super byte[]> subscriber) {
        io.reactivex.Flowable.generate(new io.reactivex.functions.Consumer<io.reactivex.Emitter<byte[]>>() { // from class: com.polidea.rxandroidble2.helpers.ByteArrayBatchObservable.1
            @Override // io.reactivex.functions.Consumer
            public void accept(io.reactivex.Emitter<byte[]> emitter) throws java.lang.Exception {
                int iMin = java.lang.Math.min(com.polidea.rxandroidble2.helpers.ByteArrayBatchObservable.this.byteBuffer.remaining(), com.polidea.rxandroidble2.helpers.ByteArrayBatchObservable.this.maxBatchSize);
                if (iMin == 0) {
                    emitter.onComplete();
                    return;
                }
                byte[] bArr = new byte[iMin];
                com.polidea.rxandroidble2.helpers.ByteArrayBatchObservable.this.byteBuffer.get(bArr);
                emitter.onNext(bArr);
            }
        }).subscribe(subscriber);
    }
}
