package com.google.android.gms.common.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractDataBuffer<T> implements com.google.android.gms.common.data.DataBuffer<T> {
    protected final com.google.android.gms.common.data.DataHolder mDataHolder;

    protected AbstractDataBuffer(com.google.android.gms.common.data.DataHolder dataHolder) {
        this.mDataHolder = dataHolder;
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    public abstract T get(int i);

    @Override // com.google.android.gms.common.data.DataBuffer
    public int getCount() {
        com.google.android.gms.common.data.DataHolder dataHolder = this.mDataHolder;
        if (dataHolder == null) {
            return 0;
        }
        return dataHolder.getCount();
    }

    @Override // com.google.android.gms.common.data.DataBuffer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        release();
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    @java.lang.Deprecated
    public boolean isClosed() {
        com.google.android.gms.common.data.DataHolder dataHolder = this.mDataHolder;
        return dataHolder == null || dataHolder.isClosed();
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    public android.os.Bundle getMetadata() {
        return this.mDataHolder.getMetadata();
    }

    @Override // com.google.android.gms.common.data.DataBuffer, java.lang.Iterable
    public java.util.Iterator<T> iterator() {
        return new com.google.android.gms.common.data.DataBufferIterator(this);
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    public java.util.Iterator<T> singleRefIterator() {
        return new com.google.android.gms.common.data.SingleRefDataBufferIterator(this);
    }

    @Override // com.google.android.gms.common.data.DataBuffer, com.google.android.gms.common.api.Releasable
    public void release() {
        com.google.android.gms.common.data.DataHolder dataHolder = this.mDataHolder;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }
}
