package com.google.android.gms.common.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public interface DataBuffer<T> extends com.google.android.gms.common.api.Releasable, java.io.Closeable, java.lang.Iterable<T> {
    void close();

    T get(int i);

    int getCount();

    android.os.Bundle getMetadata();

    @java.lang.Deprecated
    boolean isClosed();

    java.util.Iterator<T> iterator();

    @Override // com.google.android.gms.common.api.Releasable
    void release();

    java.util.Iterator<T> singleRefIterator();
}
