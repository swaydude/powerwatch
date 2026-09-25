package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
public class Tile {
    public final byte[] data;
    public final int height;
    public final int width;

    public Tile(int i, int i2, byte[] bArr) {
        this.width = i;
        this.height = i2;
        this.data = bArr;
    }

    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("image_width", this.width);
        bundle.putInt("image_height", this.height);
        bundle.putByteArray("image_data", this.data);
        return bundle;
    }
}
