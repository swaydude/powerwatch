package com.google.android.gms.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class Frame {
    public static final int ROTATION_0 = 0;
    public static final int ROTATION_180 = 2;
    public static final int ROTATION_270 = 3;
    public static final int ROTATION_90 = 1;
    private com.google.android.gms.vision.Frame.Metadata zzao;
    private java.nio.ByteBuffer zzap;
    private android.graphics.Bitmap zzaq;

    public com.google.android.gms.vision.Frame.Metadata getMetadata() {
        return this.zzao;
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
    public static class Builder {
        private com.google.android.gms.vision.Frame zzas = new com.google.android.gms.vision.Frame();

        public com.google.android.gms.vision.Frame.Builder setBitmap(android.graphics.Bitmap bitmap) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            this.zzas.zzaq = bitmap;
            com.google.android.gms.vision.Frame.Metadata metadata = this.zzas.getMetadata();
            metadata.width = width;
            metadata.height = height;
            return this;
        }

        public com.google.android.gms.vision.Frame.Builder setImageData(java.nio.ByteBuffer byteBuffer, int i, int i2, int i3) {
            if (byteBuffer == null) {
                throw new java.lang.IllegalArgumentException("Null image data supplied.");
            }
            if (byteBuffer.capacity() < i * i2) {
                throw new java.lang.IllegalArgumentException("Invalid image data size.");
            }
            if (i3 != 16 && i3 != 17 && i3 != 842094169) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(37);
                sb.append("Unsupported image format: ");
                sb.append(i3);
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            this.zzas.zzap = byteBuffer;
            com.google.android.gms.vision.Frame.Metadata metadata = this.zzas.getMetadata();
            metadata.width = i;
            metadata.height = i2;
            metadata.format = i3;
            return this;
        }

        public com.google.android.gms.vision.Frame.Builder setId(int i) {
            this.zzas.getMetadata().id = i;
            return this;
        }

        public com.google.android.gms.vision.Frame.Builder setTimestampMillis(long j) {
            this.zzas.getMetadata().zzar = j;
            return this;
        }

        public com.google.android.gms.vision.Frame.Builder setRotation(int i) {
            this.zzas.getMetadata().rotation = i;
            return this;
        }

        public com.google.android.gms.vision.Frame build() {
            if (this.zzas.zzap == null && this.zzas.zzaq == null) {
                throw new java.lang.IllegalStateException("Missing image data.  Call either setBitmap or setImageData to specify the image");
            }
            return this.zzas;
        }
    }

    public java.nio.ByteBuffer getGrayscaleImageData() {
        android.graphics.Bitmap bitmap = this.zzaq;
        if (bitmap == null) {
            return this.zzap;
        }
        int width = bitmap.getWidth();
        int height = this.zzaq.getHeight();
        int i = width * height;
        int[] iArr = new int[i];
        this.zzaq.getPixels(iArr, 0, width, 0, 0, width, height);
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((android.graphics.Color.red(iArr[i2]) * 0.299f) + (android.graphics.Color.green(iArr[i2]) * 0.587f) + (android.graphics.Color.blue(iArr[i2]) * 0.114f));
        }
        return java.nio.ByteBuffer.wrap(bArr);
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
    public static class Metadata {
        private int format = -1;
        private int height;
        private int id;
        private int rotation;
        private int width;
        private long zzar;

        public Metadata() {
        }

        public Metadata(com.google.android.gms.vision.Frame.Metadata metadata) {
            this.width = metadata.getWidth();
            this.height = metadata.getHeight();
            this.id = metadata.getId();
            this.zzar = metadata.getTimestampMillis();
            this.rotation = metadata.getRotation();
        }

        public int getWidth() {
            return this.width;
        }

        public int getHeight() {
            return this.height;
        }

        public int getId() {
            return this.id;
        }

        public long getTimestampMillis() {
            return this.zzar;
        }

        public int getRotation() {
            return this.rotation;
        }

        public int getFormat() {
            return this.format;
        }

        public final void zzd() {
            if (this.rotation % 2 != 0) {
                int i = this.width;
                this.width = this.height;
                this.height = i;
            }
            this.rotation = 0;
        }
    }

    public android.graphics.Bitmap getBitmap() {
        return this.zzaq;
    }

    private Frame() {
        this.zzao = new com.google.android.gms.vision.Frame.Metadata();
        this.zzap = null;
        this.zzaq = null;
    }
}
