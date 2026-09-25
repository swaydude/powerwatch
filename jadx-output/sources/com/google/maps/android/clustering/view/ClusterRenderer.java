package com.google.maps.android.clustering.view;

/* JADX INFO: loaded from: classes2.dex */
public interface ClusterRenderer<T extends com.google.maps.android.clustering.ClusterItem> {
    void onAdd();

    void onClustersChanged(java.util.Set<? extends com.google.maps.android.clustering.Cluster<T>> set);

    void onRemove();

    void setAnimation(boolean z);

    void setOnClusterClickListener(com.google.maps.android.clustering.ClusterManager.OnClusterClickListener<T> onClusterClickListener);

    void setOnClusterInfoWindowClickListener(com.google.maps.android.clustering.ClusterManager.OnClusterInfoWindowClickListener<T> onClusterInfoWindowClickListener);

    void setOnClusterItemClickListener(com.google.maps.android.clustering.ClusterManager.OnClusterItemClickListener<T> onClusterItemClickListener);

    void setOnClusterItemInfoWindowClickListener(com.google.maps.android.clustering.ClusterManager.OnClusterItemInfoWindowClickListener<T> onClusterItemInfoWindowClickListener);
}
