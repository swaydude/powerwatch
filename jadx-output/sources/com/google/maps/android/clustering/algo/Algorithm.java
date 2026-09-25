package com.google.maps.android.clustering.algo;

/* JADX INFO: loaded from: classes2.dex */
public interface Algorithm<T extends com.google.maps.android.clustering.ClusterItem> {
    void addItem(T t);

    void addItems(java.util.Collection<T> collection);

    void clearItems();

    java.util.Set<? extends com.google.maps.android.clustering.Cluster<T>> getClusters(double d);

    java.util.Collection<T> getItems();

    void removeItem(T t);
}
