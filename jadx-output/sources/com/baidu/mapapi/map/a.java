package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
class a implements com.baidu.mapapi.map.Overlay.a {
    final /* synthetic */ com.baidu.mapapi.map.BaiduMap a;

    a(com.baidu.mapapi.map.BaiduMap baiduMap) {
        this.a = baiduMap;
    }

    @Override // com.baidu.mapapi.map.Overlay.a
    public void a(com.baidu.mapapi.map.Overlay overlay) {
        if (overlay != null && this.a.k.contains(overlay)) {
            android.os.Bundle bundleA = overlay.a();
            if (this.a.i != null) {
                this.a.i.d(bundleA);
            }
            this.a.k.remove(overlay);
        }
        if (overlay != null && this.a.m.contains(overlay)) {
            this.a.m.remove(overlay);
        }
        if (overlay == null || !this.a.l.contains(overlay)) {
            return;
        }
        com.baidu.mapapi.map.Marker marker = (com.baidu.mapapi.map.Marker) overlay;
        if (marker.p != null) {
            this.a.l.remove(marker);
            if (this.a.l.size() != 0 || this.a.i == null) {
                return;
            }
            this.a.i.b(false);
        }
    }

    @Override // com.baidu.mapapi.map.Overlay.a
    public void b(com.baidu.mapapi.map.Overlay overlay) {
        if (overlay != null && this.a.k.contains(overlay)) {
            boolean z = false;
            if (overlay instanceof com.baidu.mapapi.map.Marker) {
                com.baidu.mapapi.map.Marker marker = (com.baidu.mapapi.map.Marker) overlay;
                if (marker.b != null) {
                    if (marker.p != null && marker.p.size() > 1) {
                        android.os.Bundle bundle = new android.os.Bundle();
                        if (this.a.i != null) {
                            marker.remove();
                            marker.p.clear();
                            this.a.i.b(overlay.a(bundle));
                            this.a.k.add(overlay);
                            z = true;
                        }
                    }
                } else if (marker.p != null && marker.p.size() != 0) {
                    if (this.a.l.contains(marker)) {
                        this.a.l.remove(marker);
                    }
                    this.a.l.add(marker);
                    if (this.a.i != null) {
                        this.a.i.b(true);
                    }
                }
            }
            if (this.a.i != null && !z) {
                this.a.i.c(overlay.a(new android.os.Bundle()));
            }
        }
        if (this.a.m.contains(overlay)) {
            this.a.m.remove(overlay);
        }
        if (overlay instanceof com.baidu.mapapi.map.Marker) {
            this.a.m.add((com.baidu.mapapi.map.Marker) overlay);
        }
    }

    @Override // com.baidu.mapapi.map.Overlay.a
    public boolean c(com.baidu.mapapi.map.Overlay overlay) {
        return (this.a.k == null || this.a.k.contains(overlay)) ? false : true;
    }
}
