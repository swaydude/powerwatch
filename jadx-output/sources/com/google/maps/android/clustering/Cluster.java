package com.google.maps.android.clustering;

/* JADX INFO: loaded from: classes2.dex */
public interface Cluster<T extends com.google.maps.android.clustering.ClusterItem> {
    java.util.Collection<T> getItems();

    com.google.android.gms.maps.model.LatLng getPosition();

    int getSize();
}
