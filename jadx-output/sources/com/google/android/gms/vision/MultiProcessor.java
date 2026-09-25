package com.google.android.gms.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class MultiProcessor<T> implements com.google.android.gms.vision.Detector.Processor<T> {
    private int zzak;
    private com.google.android.gms.vision.MultiProcessor.Factory<T> zzax;
    private android.util.SparseArray<com.google.android.gms.vision.MultiProcessor.zza> zzay;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
    public interface Factory<T> {
        com.google.android.gms.vision.Tracker<T> create(T t);
    }

    @Override // com.google.android.gms.vision.Detector.Processor
    public void release() {
        for (int i = 0; i < this.zzay.size(); i++) {
            this.zzay.valueAt(i).zzaj.onDone();
        }
        this.zzay.clear();
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
    class zza {
        private com.google.android.gms.vision.Tracker<T> zzaj;
        private int zzan;

        private zza(com.google.android.gms.vision.MultiProcessor multiProcessor) {
            this.zzan = 0;
        }

        static /* synthetic */ int zzb(com.google.android.gms.vision.MultiProcessor.zza zzaVar) {
            int i = zzaVar.zzan;
            zzaVar.zzan = i + 1;
            return i;
        }

        static /* synthetic */ int zza(com.google.android.gms.vision.MultiProcessor.zza zzaVar, int i) {
            zzaVar.zzan = 0;
            return 0;
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
    public static class Builder<T> {
        private com.google.android.gms.vision.MultiProcessor<T> zzba;

        public Builder(com.google.android.gms.vision.MultiProcessor.Factory<T> factory) {
            com.google.android.gms.vision.MultiProcessor<T> multiProcessor = new com.google.android.gms.vision.MultiProcessor<>();
            this.zzba = multiProcessor;
            if (factory == null) {
                throw new java.lang.IllegalArgumentException("No factory supplied.");
            }
            ((com.google.android.gms.vision.MultiProcessor) multiProcessor).zzax = factory;
        }

        public com.google.android.gms.vision.MultiProcessor.Builder<T> setMaxGapFrames(int i) {
            if (i < 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(28);
                sb.append("Invalid max gap: ");
                sb.append(i);
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            ((com.google.android.gms.vision.MultiProcessor) this.zzba).zzak = i;
            return this;
        }

        public com.google.android.gms.vision.MultiProcessor<T> build() {
            return this.zzba;
        }
    }

    @Override // com.google.android.gms.vision.Detector.Processor
    public void receiveDetections(com.google.android.gms.vision.Detector.Detections<T> detections) {
        android.util.SparseArray<T> detectedItems = detections.getDetectedItems();
        for (int i = 0; i < detectedItems.size(); i++) {
            int iKeyAt = detectedItems.keyAt(i);
            T tValueAt = detectedItems.valueAt(i);
            if (this.zzay.get(iKeyAt) == null) {
                com.google.android.gms.vision.MultiProcessor.zza zzaVar = new com.google.android.gms.vision.MultiProcessor.zza();
                zzaVar.zzaj = this.zzax.create(tValueAt);
                zzaVar.zzaj.onNewItem(iKeyAt, tValueAt);
                this.zzay.append(iKeyAt, zzaVar);
            }
        }
        android.util.SparseArray<T> detectedItems2 = detections.getDetectedItems();
        java.util.HashSet hashSet = new java.util.HashSet();
        for (int i2 = 0; i2 < this.zzay.size(); i2++) {
            int iKeyAt2 = this.zzay.keyAt(i2);
            if (detectedItems2.get(iKeyAt2) == null) {
                com.google.android.gms.vision.MultiProcessor.zza zzaVarValueAt = this.zzay.valueAt(i2);
                com.google.android.gms.vision.MultiProcessor.zza.zzb(zzaVarValueAt);
                if (zzaVarValueAt.zzan >= this.zzak) {
                    zzaVarValueAt.zzaj.onDone();
                    hashSet.add(java.lang.Integer.valueOf(iKeyAt2));
                } else {
                    zzaVarValueAt.zzaj.onMissing(detections);
                }
            }
        }
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            this.zzay.delete(((java.lang.Integer) it.next()).intValue());
        }
        android.util.SparseArray<T> detectedItems3 = detections.getDetectedItems();
        for (int i3 = 0; i3 < detectedItems3.size(); i3++) {
            int iKeyAt3 = detectedItems3.keyAt(i3);
            T tValueAt2 = detectedItems3.valueAt(i3);
            com.google.android.gms.vision.MultiProcessor.zza zzaVar2 = this.zzay.get(iKeyAt3);
            com.google.android.gms.vision.MultiProcessor.zza.zza(zzaVar2, 0);
            zzaVar2.zzaj.onUpdate(detections, tValueAt2);
        }
    }

    private MultiProcessor() {
        this.zzay = new android.util.SparseArray<>();
        this.zzak = 3;
    }
}
