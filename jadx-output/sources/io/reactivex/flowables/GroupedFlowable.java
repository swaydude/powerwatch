package io.reactivex.flowables;

/* JADX INFO: loaded from: classes2.dex */
public abstract class GroupedFlowable<K, T> extends io.reactivex.Flowable<T> {
    final K key;

    protected GroupedFlowable(K k) {
        this.key = k;
    }

    public K getKey() {
        return this.key;
    }
}
