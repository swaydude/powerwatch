package com.google.android.gms.vision.barcode;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class BarcodeDetector extends com.google.android.gms.vision.Detector<com.google.android.gms.vision.barcode.Barcode> {
    private final com.google.android.gms.internal.vision.zzh zzbk;

    private BarcodeDetector() {
        throw new java.lang.IllegalStateException("Default constructor called");
    }

    private BarcodeDetector(com.google.android.gms.internal.vision.zzh zzhVar) {
        this.zzbk = zzhVar;
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-vision@@19.0.0 */
    public static class Builder {
        private com.google.android.gms.internal.vision.zzf zzbl = new com.google.android.gms.internal.vision.zzf();
        private android.content.Context zze;

        public Builder(android.content.Context context) {
            this.zze = context;
        }

        public com.google.android.gms.vision.barcode.BarcodeDetector.Builder setBarcodeFormats(int i) {
            this.zzbl.zzbm = i;
            return this;
        }

        public com.google.android.gms.vision.barcode.BarcodeDetector build() {
            return new com.google.android.gms.vision.barcode.BarcodeDetector(new com.google.android.gms.internal.vision.zzh(this.zze, this.zzbl));
        }
    }

    @Override // com.google.android.gms.vision.Detector
    public final void release() {
        super.release();
        this.zzbk.zzo();
    }

    @Override // com.google.android.gms.vision.Detector
    public final android.util.SparseArray<com.google.android.gms.vision.barcode.Barcode> detect(com.google.android.gms.vision.Frame frame) {
        com.google.android.gms.vision.barcode.Barcode[] barcodeArrZza;
        if (frame == null) {
            throw new java.lang.IllegalArgumentException("No frame supplied.");
        }
        com.google.android.gms.internal.vision.zzp zzpVarZzc = com.google.android.gms.internal.vision.zzp.zzc(frame);
        if (frame.getBitmap() != null) {
            barcodeArrZza = this.zzbk.zza(frame.getBitmap(), zzpVarZzc);
            if (barcodeArrZza == null) {
                throw new java.lang.IllegalArgumentException("Internal barcode detector error; check logcat output.");
            }
        } else {
            barcodeArrZza = this.zzbk.zza(frame.getGrayscaleImageData(), zzpVarZzc);
        }
        android.util.SparseArray<com.google.android.gms.vision.barcode.Barcode> sparseArray = new android.util.SparseArray<>(barcodeArrZza.length);
        for (com.google.android.gms.vision.barcode.Barcode barcode : barcodeArrZza) {
            sparseArray.append(barcode.rawValue.hashCode(), barcode);
        }
        return sparseArray;
    }

    @Override // com.google.android.gms.vision.Detector
    public final boolean isOperational() {
        return this.zzbk.isOperational();
    }
}
