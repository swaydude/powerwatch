package com.google.android.gms.common.api;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class DataBufferResponse<T, R extends com.google.android.gms.common.data.AbstractDataBuffer<T> & com.google.android.gms.common.api.Result> extends com.google.android.gms.common.api.Response<R> implements com.google.android.gms.common.data.DataBuffer<T> {
    public DataBufferResponse() {
    }

    /* JADX WARN: Incorrect types in method signature: (TR;)V */
    /* JADX WARN: Multi-variable type inference failed */
    public DataBufferResponse(com.google.android.gms.common.data.AbstractDataBuffer abstractDataBuffer) {
        super(abstractDataBuffer);
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    public int getCount() {
        return ((com.google.android.gms.common.data.AbstractDataBuffer) getResult()).getCount();
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    public T get(int i) {
        return (T) ((com.google.android.gms.common.data.AbstractDataBuffer) getResult()).get(i);
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    public android.os.Bundle getMetadata() {
        return ((com.google.android.gms.common.data.AbstractDataBuffer) getResult()).getMetadata();
    }

    @Override // com.google.android.gms.common.data.DataBuffer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ((com.google.android.gms.common.data.AbstractDataBuffer) getResult()).close();
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    public boolean isClosed() {
        return ((com.google.android.gms.common.data.AbstractDataBuffer) getResult()).isClosed();
    }

    @Override // com.google.android.gms.common.data.DataBuffer, java.lang.Iterable
    public java.util.Iterator<T> iterator() {
        return ((com.google.android.gms.common.data.AbstractDataBuffer) getResult()).iterator();
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    public java.util.Iterator<T> singleRefIterator() {
        return ((com.google.android.gms.common.data.AbstractDataBuffer) getResult()).singleRefIterator();
    }

    @Override // com.google.android.gms.common.data.DataBuffer, com.google.android.gms.common.api.Releasable
    public void release() {
        ((com.google.android.gms.common.data.AbstractDataBuffer) getResult()).release();
    }
}
