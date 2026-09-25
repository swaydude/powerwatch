package com.google.android.gms.vision.text;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class TextRecognizer extends com.google.android.gms.vision.Detector<com.google.android.gms.vision.text.TextBlock> {
    private final com.google.android.gms.internal.vision.zzai zzee;

    private TextRecognizer() {
        throw new java.lang.IllegalStateException("Default constructor called");
    }

    private TextRecognizer(com.google.android.gms.internal.vision.zzai zzaiVar) {
        this.zzee = zzaiVar;
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-vision@@19.0.0 */
    public static class Builder {
        private android.content.Context zze;
        private com.google.android.gms.internal.vision.zzah zzef = new com.google.android.gms.internal.vision.zzah();

        public Builder(android.content.Context context) {
            this.zze = context;
        }

        public com.google.android.gms.vision.text.TextRecognizer build() {
            return new com.google.android.gms.vision.text.TextRecognizer(new com.google.android.gms.internal.vision.zzai(this.zze, this.zzef));
        }
    }

    @Override // com.google.android.gms.vision.Detector
    public final android.util.SparseArray<com.google.android.gms.vision.text.TextBlock> detect(com.google.android.gms.vision.Frame frame) {
        byte[] bArrArray;
        android.graphics.Bitmap bitmapDecodeByteArray;
        com.google.android.gms.internal.vision.zzae zzaeVar = new com.google.android.gms.internal.vision.zzae(new android.graphics.Rect());
        if (frame == null) {
            throw new java.lang.IllegalArgumentException("No frame supplied.");
        }
        com.google.android.gms.internal.vision.zzp zzpVarZzc = com.google.android.gms.internal.vision.zzp.zzc(frame);
        if (frame.getBitmap() != null) {
            bitmapDecodeByteArray = frame.getBitmap();
        } else {
            com.google.android.gms.vision.Frame.Metadata metadata = frame.getMetadata();
            java.nio.ByteBuffer grayscaleImageData = frame.getGrayscaleImageData();
            int format = metadata.getFormat();
            int i = zzpVarZzc.width;
            int i2 = zzpVarZzc.height;
            if (grayscaleImageData.hasArray() && grayscaleImageData.arrayOffset() == 0) {
                bArrArray = grayscaleImageData.array();
            } else {
                byte[] bArr = new byte[grayscaleImageData.capacity()];
                grayscaleImageData.get(bArr);
                bArrArray = bArr;
            }
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            new android.graphics.YuvImage(bArrArray, format, i, i2, null).compressToJpeg(new android.graphics.Rect(0, 0, i, i2), 100, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            bitmapDecodeByteArray = android.graphics.BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
        }
        android.graphics.Bitmap bitmapZzb = com.google.android.gms.internal.vision.zzq.zzb(bitmapDecodeByteArray, zzpVarZzc);
        if (!zzaeVar.zzeq.isEmpty()) {
            android.graphics.Rect rect = zzaeVar.zzeq;
            int width = frame.getMetadata().getWidth();
            int height = frame.getMetadata().getHeight();
            int i3 = zzpVarZzc.rotation;
            if (i3 == 1) {
                rect = new android.graphics.Rect(height - rect.bottom, rect.left, height - rect.top, rect.right);
            } else if (i3 == 2) {
                rect = new android.graphics.Rect(width - rect.right, height - rect.bottom, width - rect.left, height - rect.top);
            } else if (i3 == 3) {
                rect = new android.graphics.Rect(rect.top, width - rect.right, rect.bottom, width - rect.left);
            }
            zzaeVar.zzeq.set(rect);
        }
        zzpVarZzc.rotation = 0;
        com.google.android.gms.internal.vision.zzac[] zzacVarArrZza = this.zzee.zza(bitmapZzb, zzpVarZzc, zzaeVar);
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        for (com.google.android.gms.internal.vision.zzac zzacVar : zzacVarArrZza) {
            android.util.SparseArray sparseArray2 = (android.util.SparseArray) sparseArray.get(zzacVar.zzeo);
            if (sparseArray2 == null) {
                sparseArray2 = new android.util.SparseArray();
                sparseArray.append(zzacVar.zzeo, sparseArray2);
            }
            sparseArray2.append(zzacVar.zzep, zzacVar);
        }
        android.util.SparseArray<com.google.android.gms.vision.text.TextBlock> sparseArray3 = new android.util.SparseArray<>(sparseArray.size());
        for (int i4 = 0; i4 < sparseArray.size(); i4++) {
            sparseArray3.append(sparseArray.keyAt(i4), new com.google.android.gms.vision.text.TextBlock((android.util.SparseArray) sparseArray.valueAt(i4)));
        }
        return sparseArray3;
    }

    @Override // com.google.android.gms.vision.Detector
    public final boolean isOperational() {
        return this.zzee.isOperational();
    }

    @Override // com.google.android.gms.vision.Detector
    public final void release() {
        super.release();
        this.zzee.zzo();
    }
}
