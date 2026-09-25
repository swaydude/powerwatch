package com.google.android.gms.common.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class DataBufferIterator<T> implements java.util.Iterator<T> {
    protected final com.google.android.gms.common.data.DataBuffer<T> zaln;
    protected int zalo = -1;

    public DataBufferIterator(com.google.android.gms.common.data.DataBuffer<T> dataBuffer) {
        this.zaln = (com.google.android.gms.common.data.DataBuffer) com.google.android.gms.common.internal.Preconditions.checkNotNull(dataBuffer);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.zalo < this.zaln.getCount() - 1;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!hasNext()) {
            int i = this.zalo;
            java.lang.StringBuilder sb = new java.lang.StringBuilder(46);
            sb.append("Cannot advance the iterator beyond ");
            sb.append(i);
            throw new java.util.NoSuchElementException(sb.toString());
        }
        com.google.android.gms.common.data.DataBuffer<T> dataBuffer = this.zaln;
        int i2 = this.zalo + 1;
        this.zalo = i2;
        return dataBuffer.get(i2);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
