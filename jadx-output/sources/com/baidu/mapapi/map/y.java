package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
class y implements java.lang.Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ java.lang.String d;
    final /* synthetic */ com.baidu.mapapi.map.TileOverlay e;

    y(com.baidu.mapapi.map.TileOverlay tileOverlay, int i, int i2, int i3, java.lang.String str) {
        this.e = tileOverlay;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        java.lang.String str2;
        com.baidu.mapapi.map.Tile tile = ((com.baidu.mapapi.map.FileTileProvider) this.e.g).getTile(this.a, this.b, this.c);
        if (tile != null) {
            if (tile.width == 256 && tile.height == 256) {
                this.e.a(this.a + io.fabric.sdk.android.services.events.EventsFilesManager.ROLL_OVER_FILE_NAME_SEPARATOR + this.b + io.fabric.sdk.android.services.events.EventsFilesManager.ROLL_OVER_FILE_NAME_SEPARATOR + this.c, tile);
            } else {
                str = com.baidu.mapapi.map.TileOverlay.b;
                str2 = "FileTile pic must be 256 * 256";
            }
            this.e.e.remove(this.d);
        }
        str = com.baidu.mapapi.map.TileOverlay.b;
        str2 = "FileTile pic is null";
        android.util.Log.e(str, str2);
        this.e.e.remove(this.d);
    }
}
