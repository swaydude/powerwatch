package com.google.android.gms.maps.model;

/* JADX INFO: loaded from: classes.dex */
final class zzt extends com.google.android.gms.internal.maps.zzag {
    private final /* synthetic */ com.google.android.gms.maps.model.TileProvider zzen;

    zzt(com.google.android.gms.maps.model.TileOverlayOptions tileOverlayOptions, com.google.android.gms.maps.model.TileProvider tileProvider) {
        this.zzen = tileProvider;
    }

    @Override // com.google.android.gms.internal.maps.zzaf
    public final com.google.android.gms.maps.model.Tile getTile(int i, int i2, int i3) {
        return this.zzen.getTile(i, i2, i3);
    }
}
