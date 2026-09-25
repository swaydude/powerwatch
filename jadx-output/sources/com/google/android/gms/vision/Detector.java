package com.google.android.gms.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class Detector<T> {
    private final java.lang.Object zzah = new java.lang.Object();
    private com.google.android.gms.vision.Detector.Processor<T> zzai;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
    public interface Processor<T> {
        void receiveDetections(com.google.android.gms.vision.Detector.Detections<T> detections);

        void release();
    }

    public abstract android.util.SparseArray<T> detect(com.google.android.gms.vision.Frame frame);

    public boolean isOperational() {
        return true;
    }

    public boolean setFocus(int i) {
        return true;
    }

    public void release() {
        synchronized (this.zzah) {
            com.google.android.gms.vision.Detector.Processor<T> processor = this.zzai;
            if (processor != null) {
                processor.release();
                this.zzai = null;
            }
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
    public static class Detections<T> {
        private final android.util.SparseArray<T> zzae;
        private final com.google.android.gms.vision.Frame.Metadata zzaf;
        private final boolean zzag;

        public Detections(android.util.SparseArray<T> sparseArray, com.google.android.gms.vision.Frame.Metadata metadata, boolean z) {
            this.zzae = sparseArray;
            this.zzaf = metadata;
            this.zzag = z;
        }

        public android.util.SparseArray<T> getDetectedItems() {
            return this.zzae;
        }

        public com.google.android.gms.vision.Frame.Metadata getFrameMetadata() {
            return this.zzaf;
        }

        public boolean detectorIsOperational() {
            return this.zzag;
        }
    }

    public void receiveFrame(com.google.android.gms.vision.Frame frame) {
        com.google.android.gms.vision.Frame.Metadata metadata = new com.google.android.gms.vision.Frame.Metadata(frame.getMetadata());
        metadata.zzd();
        com.google.android.gms.vision.Detector.Detections<T> detections = new com.google.android.gms.vision.Detector.Detections<>(detect(frame), metadata, isOperational());
        synchronized (this.zzah) {
            com.google.android.gms.vision.Detector.Processor<T> processor = this.zzai;
            if (processor == null) {
                throw new java.lang.IllegalStateException("Detector processor must first be set with setProcessor in order to receive detection results.");
            }
            processor.receiveDetections(detections);
        }
    }

    public void setProcessor(com.google.android.gms.vision.Detector.Processor<T> processor) {
        synchronized (this.zzah) {
            com.google.android.gms.vision.Detector.Processor<T> processor2 = this.zzai;
            if (processor2 != null) {
                processor2.release();
            }
            this.zzai = processor;
        }
    }
}
