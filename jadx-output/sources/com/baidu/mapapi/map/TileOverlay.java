package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
public final class TileOverlay {
    private static final java.lang.String b = "TileOverlay";
    private static int f;
    com.baidu.mapapi.map.BaiduMap a;
    private com.baidu.mapapi.map.TileProvider g;
    private java.util.HashMap<java.lang.String, com.baidu.mapapi.map.Tile> d = new java.util.HashMap<>();
    private java.util.HashSet<java.lang.String> e = new java.util.HashSet<>();
    private java.util.concurrent.ExecutorService c = java.util.concurrent.Executors.newFixedThreadPool(1);

    public TileOverlay(com.baidu.mapapi.map.BaiduMap baiduMap, com.baidu.mapapi.map.TileProvider tileProvider) {
        this.a = baiduMap;
        this.g = tileProvider;
    }

    private synchronized com.baidu.mapapi.map.Tile a(java.lang.String str) {
        if (!this.d.containsKey(str)) {
            return null;
        }
        com.baidu.mapapi.map.Tile tile = this.d.get(str);
        this.d.remove(str);
        return tile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(java.lang.String str, com.baidu.mapapi.map.Tile tile) {
        this.d.put(str, tile);
    }

    private synchronized boolean b(java.lang.String str) {
        return this.e.contains(str);
    }

    private synchronized void c(java.lang.String str) {
        this.e.add(str);
    }

    com.baidu.mapapi.map.Tile a(int i, int i2, int i3) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3 = i + io.fabric.sdk.android.services.events.EventsFilesManager.ROLL_OVER_FILE_NAME_SEPARATOR + i2 + io.fabric.sdk.android.services.events.EventsFilesManager.ROLL_OVER_FILE_NAME_SEPARATOR + i3;
        com.baidu.mapapi.map.Tile tileA = a(str3);
        if (tileA != null) {
            return tileA;
        }
        com.baidu.mapapi.map.BaiduMap baiduMap = this.a;
        if (baiduMap != null && f == 0) {
            com.baidu.mapapi.map.MapStatus mapStatus = baiduMap.getMapStatus();
            f = (((mapStatus.a.j.right - mapStatus.a.j.left) / 256) + 2) * (((mapStatus.a.j.bottom - mapStatus.a.j.top) / 256) + 2);
        }
        if (this.d.size() > f) {
            a();
        }
        if (b(str3) || this.c.isShutdown()) {
            return null;
        }
        try {
            c(str3);
            this.c.execute(new com.baidu.mapapi.map.y(this, i, i2, i3, str3));
            return null;
        } catch (java.util.concurrent.RejectedExecutionException unused) {
            str = b;
            str2 = "ThreadPool excepiton";
            android.util.Log.e(str, str2);
            return null;
        } catch (java.lang.Exception unused2) {
            str = b;
            str2 = "fileDir is not legal";
            android.util.Log.e(str, str2);
            return null;
        }
    }

    synchronized void a() {
        com.baidu.mapapi.common.Logger.logE(b, "clearTaskSet");
        this.e.clear();
        this.d.clear();
    }

    void b() {
        this.c.shutdownNow();
    }

    public boolean clearTileCache() {
        com.baidu.mapapi.map.BaiduMap baiduMap = this.a;
        if (baiduMap == null) {
            return false;
        }
        return baiduMap.b();
    }

    public void removeTileOverlay() {
        com.baidu.mapapi.map.BaiduMap baiduMap = this.a;
        if (baiduMap == null) {
            return;
        }
        baiduMap.a(this);
    }
}
