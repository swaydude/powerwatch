package com.google.android.gms.vision.face;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class FaceDetector extends com.google.android.gms.vision.Detector<com.google.android.gms.vision.face.Face> {
    public static final int ACCURATE_MODE = 1;
    public static final int ALL_CLASSIFICATIONS = 1;
    public static final int ALL_LANDMARKS = 1;
    public static final int CONTOUR_LANDMARKS = 2;
    public static final int FAST_MODE = 0;
    public static final int NO_CLASSIFICATIONS = 0;
    public static final int NO_LANDMARKS = 0;
    public static final int SELFIE_MODE = 2;
    private final java.lang.Object lock;
    private final com.google.android.gms.vision.zzc zzcj;
    private final com.google.android.gms.vision.face.internal.client.zzb zzck;
    private boolean zzcl;

    @Override // com.google.android.gms.vision.Detector
    public final void release() {
        super.release();
        synchronized (this.lock) {
            if (this.zzcl) {
                this.zzck.zzo();
                this.zzcl = false;
            }
        }
    }

    protected final void finalize() throws java.lang.Throwable {
        try {
            synchronized (this.lock) {
                if (this.zzcl) {
                    android.util.Log.w("FaceDetector", "FaceDetector was not released with FaceDetector.release()");
                    release();
                }
            }
            super.finalize();
        } catch (java.lang.Throwable th) {
            super.finalize();
            throw th;
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-vision@@19.0.0 */
    public static class Builder {
        private final android.content.Context zze;
        private int landmarkType = 0;
        private boolean zzcn = false;
        private int zzco = 0;
        private boolean trackingEnabled = true;
        private int mode = 0;
        private float proportionalMinFaceSize = -1.0f;

        public Builder(android.content.Context context) {
            this.zze = context;
        }

        public com.google.android.gms.vision.face.FaceDetector.Builder setLandmarkType(int i) {
            if (i != 0 && i != 1 && i != 2) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(34);
                sb.append("Invalid landmark type: ");
                sb.append(i);
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            this.landmarkType = i;
            return this;
        }

        public com.google.android.gms.vision.face.FaceDetector.Builder setProminentFaceOnly(boolean z) {
            this.zzcn = z;
            return this;
        }

        public com.google.android.gms.vision.face.FaceDetector.Builder setClassificationType(int i) {
            if (i != 0 && i != 1) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(40);
                sb.append("Invalid classification type: ");
                sb.append(i);
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            this.zzco = i;
            return this;
        }

        public com.google.android.gms.vision.face.FaceDetector.Builder setTrackingEnabled(boolean z) {
            this.trackingEnabled = z;
            return this;
        }

        public com.google.android.gms.vision.face.FaceDetector.Builder setMode(int i) {
            if (i != 0 && i != 1 && i != 2) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(25);
                sb.append("Invalid mode: ");
                sb.append(i);
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            this.mode = i;
            return this;
        }

        public com.google.android.gms.vision.face.FaceDetector.Builder setMinFaceSize(float f) {
            if (f < 0.0f || f > 1.0f) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(47);
                sb.append("Invalid proportional face size: ");
                sb.append(f);
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            this.proportionalMinFaceSize = f;
            return this;
        }

        public com.google.android.gms.vision.face.FaceDetector build() {
            com.google.android.gms.vision.face.internal.client.zzf zzfVar = new com.google.android.gms.vision.face.internal.client.zzf();
            zzfVar.mode = this.mode;
            zzfVar.landmarkType = this.landmarkType;
            zzfVar.zzco = this.zzco;
            zzfVar.zzcn = this.zzcn;
            zzfVar.trackingEnabled = this.trackingEnabled;
            zzfVar.proportionalMinFaceSize = this.proportionalMinFaceSize;
            if (!com.google.android.gms.vision.face.FaceDetector.zza(zzfVar)) {
                throw new java.lang.IllegalArgumentException("Invalid build options");
            }
            return new com.google.android.gms.vision.face.FaceDetector(new com.google.android.gms.vision.face.internal.client.zzb(this.zze, zzfVar));
        }
    }

    @Override // com.google.android.gms.vision.Detector
    public final android.util.SparseArray<com.google.android.gms.vision.face.Face> detect(com.google.android.gms.vision.Frame frame) {
        java.nio.ByteBuffer grayscaleImageData;
        com.google.android.gms.vision.face.Face[] faceArrZzb;
        if (frame == null) {
            throw new java.lang.IllegalArgumentException("No frame supplied.");
        }
        if (frame.getBitmap() != null) {
            android.graphics.Bitmap bitmap = frame.getBitmap();
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i = width * height;
            grayscaleImageData = java.nio.ByteBuffer.allocateDirect(((((width + 1) / 2) * ((height + 1) / 2)) << 1) + i);
            int i2 = i;
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = i3 % width;
                int i5 = i3 / width;
                int pixel = bitmap.getPixel(i4, i5);
                float fRed = android.graphics.Color.red(pixel);
                float fGreen = android.graphics.Color.green(pixel);
                float fBlue = android.graphics.Color.blue(pixel);
                grayscaleImageData.put(i3, (byte) ((0.299f * fRed) + (0.587f * fGreen) + (0.114f * fBlue)));
                if (i5 % 2 == 0 && i4 % 2 == 0) {
                    int i6 = i2 + 1;
                    grayscaleImageData.put(i2, (byte) (((-0.169f) * fRed) + ((-0.331f) * fGreen) + (fBlue * 0.5f) + 128.0f));
                    i2 = i6 + 1;
                    grayscaleImageData.put(i6, (byte) ((fRed * 0.5f) + (fGreen * (-0.419f)) + (fBlue * (-0.081f)) + 128.0f));
                }
            }
        } else {
            grayscaleImageData = frame.getGrayscaleImageData();
        }
        synchronized (this.lock) {
            if (!this.zzcl) {
                throw new java.lang.RuntimeException("Cannot use detector after release()");
            }
            faceArrZzb = this.zzck.zzb(grayscaleImageData, com.google.android.gms.internal.vision.zzp.zzc(frame));
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        android.util.SparseArray<com.google.android.gms.vision.face.Face> sparseArray = new android.util.SparseArray<>(faceArrZzb.length);
        int iMax = 0;
        for (com.google.android.gms.vision.face.Face face : faceArrZzb) {
            int id = face.getId();
            iMax = java.lang.Math.max(iMax, id);
            if (hashSet.contains(java.lang.Integer.valueOf(id))) {
                id = iMax + 1;
                iMax = id;
            }
            hashSet.add(java.lang.Integer.valueOf(id));
            sparseArray.append(this.zzcj.zzb(id), face);
        }
        return sparseArray;
    }

    @Override // com.google.android.gms.vision.Detector
    public final boolean setFocus(int i) {
        boolean zZzd;
        int iZzc = this.zzcj.zzc(i);
        synchronized (this.lock) {
            if (!this.zzcl) {
                throw new java.lang.RuntimeException("Cannot use detector after release()");
            }
            zZzd = this.zzck.zzd(iZzc);
        }
        return zZzd;
    }

    @Override // com.google.android.gms.vision.Detector
    public final boolean isOperational() {
        return this.zzck.isOperational();
    }

    private FaceDetector() {
        this.zzcj = new com.google.android.gms.vision.zzc();
        this.lock = new java.lang.Object();
        this.zzcl = true;
        throw new java.lang.IllegalStateException("Default constructor called");
    }

    private FaceDetector(com.google.android.gms.vision.face.internal.client.zzb zzbVar) {
        this.zzcj = new com.google.android.gms.vision.zzc();
        this.lock = new java.lang.Object();
        this.zzcl = true;
        this.zzck = zzbVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zza(com.google.android.gms.vision.face.internal.client.zzf zzfVar) {
        boolean z;
        if (zzfVar.mode == 2 || zzfVar.landmarkType != 2) {
            z = true;
        } else {
            android.util.Log.e("FaceDetector", "Contour is not supported for non-SELFIE mode.");
            z = false;
        }
        if (zzfVar.landmarkType != 2 || zzfVar.zzco != 1) {
            return z;
        }
        android.util.Log.e("FaceDetector", "Classification is not supported with contour.");
        return false;
    }
}
