package com.google.android.gms.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class MultiDetector extends com.google.android.gms.vision.Detector<java.lang.Object> {
    private java.util.List<com.google.android.gms.vision.Detector<? extends java.lang.Object>> zzaw;

    @Override // com.google.android.gms.vision.Detector
    public void release() {
        java.util.Iterator<com.google.android.gms.vision.Detector<? extends java.lang.Object>> it = this.zzaw.iterator();
        while (it.hasNext()) {
            it.next().release();
        }
        this.zzaw.clear();
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
    public static class Builder {
        private com.google.android.gms.vision.MultiDetector zzaz = new com.google.android.gms.vision.MultiDetector();

        public com.google.android.gms.vision.MultiDetector.Builder add(com.google.android.gms.vision.Detector<? extends java.lang.Object> detector) {
            this.zzaz.zzaw.add(detector);
            return this;
        }

        public com.google.android.gms.vision.MultiDetector build() {
            if (this.zzaz.zzaw.size() == 0) {
                throw new java.lang.RuntimeException("No underlying detectors added to MultiDetector.");
            }
            return this.zzaz;
        }
    }

    @Override // com.google.android.gms.vision.Detector
    public android.util.SparseArray<java.lang.Object> detect(com.google.android.gms.vision.Frame frame) {
        android.util.SparseArray<java.lang.Object> sparseArray = new android.util.SparseArray<>();
        java.util.Iterator<com.google.android.gms.vision.Detector<? extends java.lang.Object>> it = this.zzaw.iterator();
        while (it.hasNext()) {
            android.util.SparseArray<? extends java.lang.Object> sparseArrayDetect = it.next().detect(frame);
            for (int i = 0; i < sparseArrayDetect.size(); i++) {
                int iKeyAt = sparseArrayDetect.keyAt(i);
                if (sparseArray.get(iKeyAt) != null) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(104);
                    sb.append("Detection ID overlap for id = ");
                    sb.append(iKeyAt);
                    sb.append("  This means that one of the detectors is not using global IDs.");
                    throw new java.lang.IllegalStateException(sb.toString());
                }
                sparseArray.append(iKeyAt, sparseArrayDetect.valueAt(i));
            }
        }
        return sparseArray;
    }

    @Override // com.google.android.gms.vision.Detector
    public void receiveFrame(com.google.android.gms.vision.Frame frame) {
        java.util.Iterator<com.google.android.gms.vision.Detector<? extends java.lang.Object>> it = this.zzaw.iterator();
        while (it.hasNext()) {
            it.next().receiveFrame(frame);
        }
    }

    @Override // com.google.android.gms.vision.Detector
    public void setProcessor(com.google.android.gms.vision.Detector.Processor<java.lang.Object> processor) {
        throw new java.lang.UnsupportedOperationException("MultiDetector.setProcessor is not supported.  You should set a processor instance on each underlying detector instead.");
    }

    @Override // com.google.android.gms.vision.Detector
    public boolean isOperational() {
        java.util.Iterator<com.google.android.gms.vision.Detector<? extends java.lang.Object>> it = this.zzaw.iterator();
        while (it.hasNext()) {
            if (!it.next().isOperational()) {
                return false;
            }
        }
        return true;
    }

    private MultiDetector() {
        this.zzaw = new java.util.ArrayList();
    }
}
