package com.google.android.gms.vision.face;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class LargestFaceFocusingProcessor extends com.google.android.gms.vision.FocusingProcessor<com.google.android.gms.vision.face.Face> {
    public LargestFaceFocusingProcessor(com.google.android.gms.vision.Detector<com.google.android.gms.vision.face.Face> detector, com.google.android.gms.vision.Tracker<com.google.android.gms.vision.face.Face> tracker) {
        super(detector, tracker);
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-vision@@19.0.0 */
    public static class Builder {
        private com.google.android.gms.vision.face.LargestFaceFocusingProcessor zzcp;

        public Builder(com.google.android.gms.vision.Detector<com.google.android.gms.vision.face.Face> detector, com.google.android.gms.vision.Tracker<com.google.android.gms.vision.face.Face> tracker) {
            this.zzcp = new com.google.android.gms.vision.face.LargestFaceFocusingProcessor(detector, tracker);
        }

        public com.google.android.gms.vision.face.LargestFaceFocusingProcessor.Builder setMaxGapFrames(int i) {
            this.zzcp.zza(i);
            return this;
        }

        public com.google.android.gms.vision.face.LargestFaceFocusingProcessor build() {
            return this.zzcp;
        }
    }

    @Override // com.google.android.gms.vision.FocusingProcessor
    public int selectFocus(com.google.android.gms.vision.Detector.Detections<com.google.android.gms.vision.face.Face> detections) {
        android.util.SparseArray<com.google.android.gms.vision.face.Face> detectedItems = detections.getDetectedItems();
        if (detectedItems.size() == 0) {
            throw new java.lang.IllegalArgumentException("No faces for selectFocus.");
        }
        int iKeyAt = detectedItems.keyAt(0);
        float width = detectedItems.valueAt(0).getWidth();
        for (int i = 1; i < detectedItems.size(); i++) {
            int iKeyAt2 = detectedItems.keyAt(i);
            float width2 = detectedItems.valueAt(i).getWidth();
            if (width2 > width) {
                iKeyAt = iKeyAt2;
                width = width2;
            }
        }
        return iKeyAt;
    }
}
