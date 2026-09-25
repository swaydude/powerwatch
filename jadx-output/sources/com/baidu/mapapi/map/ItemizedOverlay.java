package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
public class ItemizedOverlay extends com.baidu.mapapi.map.Overlay {
    com.baidu.mapapi.map.MapView a;

    public ItemizedOverlay(android.graphics.drawable.Drawable drawable, com.baidu.mapapi.map.MapView mapView) {
        this.type = com.baidu.mapsdkplatform.comapi.map.j.marker;
        this.a = mapView;
    }

    public void addItem(com.baidu.mapapi.map.OverlayOptions overlayOptions) {
        if (overlayOptions == null || overlayOptions == null) {
            return;
        }
        this.a.getMap().addOverlay(overlayOptions);
    }

    public void reAddAll() {
    }

    public void removeAll() {
        this.a.getMap().clear();
    }
}
