package com.google.android.gms.maps.model;

/* JADX INFO: loaded from: classes.dex */
public abstract class UrlTileProvider implements com.google.android.gms.maps.model.TileProvider {
    private final int height;
    private final int width;

    public UrlTileProvider(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public abstract java.net.URL getTileUrl(int i, int i2, int i3);

    @Override // com.google.android.gms.maps.model.TileProvider
    public final com.google.android.gms.maps.model.Tile getTile(int i, int i2, int i3) {
        java.net.URL tileUrl = getTileUrl(i, i2, i3);
        if (tileUrl == null) {
            return NO_TILE;
        }
        try {
            int i4 = this.width;
            int i5 = this.height;
            java.io.InputStream inputStreamOpenStream = tileUrl.openStream();
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            byte[] bArr = new byte[4096];
            while (true) {
                int i6 = inputStreamOpenStream.read(bArr);
                if (i6 != -1) {
                    byteArrayOutputStream.write(bArr, 0, i6);
                } else {
                    return new com.google.android.gms.maps.model.Tile(i4, i5, byteArrayOutputStream.toByteArray());
                }
            }
        } catch (java.io.IOException unused) {
            return null;
        }
    }
}
