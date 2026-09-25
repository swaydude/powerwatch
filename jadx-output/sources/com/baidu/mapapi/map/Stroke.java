package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
public final class Stroke {
    public final int color;
    public final int strokeWidth;

    public Stroke(int i, int i2) {
        this.strokeWidth = i <= 0 ? 5 : i;
        this.color = i2;
    }

    android.os.Bundle a(android.os.Bundle bundle) {
        bundle.putInt(io.fabric.sdk.android.services.settings.SettingsJsonConstants.ICON_WIDTH_KEY, this.strokeWidth);
        com.baidu.mapapi.map.Overlay.a(this.color, bundle);
        return bundle;
    }
}
