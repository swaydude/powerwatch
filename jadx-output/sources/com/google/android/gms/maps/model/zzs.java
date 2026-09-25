package com.google.android.gms.maps.model;

/* JADX INFO: loaded from: classes.dex */
final class zzs implements com.google.android.gms.maps.model.TileProvider {
    private final com.google.android.gms.internal.maps.zzaf zzel;
    private final /* synthetic */ com.google.android.gms.maps.model.TileOverlayOptions zzem;

    zzs(com.google.android.gms.maps.model.TileOverlayOptions tileOverlayOptions) {
        this.zzem = tileOverlayOptions;
        this.zzel = tileOverlayOptions.zzei;
    }

    @Override // com.google.android.gms.maps.model.TileProvider
    public final com.google.android.gms.maps.model.Tile getTile(int i, int i2, int i3) {
        try {
            return this.zzel.getTile(i, i2, i3);
        } catch (android.os.RemoteException unused) {
            return null;
        }
    }
}
