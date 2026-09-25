package com.google.android.gms.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class FocusingProcessor<T> implements com.google.android.gms.vision.Detector.Processor<T> {
    private com.google.android.gms.vision.Tracker<T> zzaj;
    private int zzam;
    private com.google.android.gms.vision.Detector<T> zzt;
    private int zzak = 3;
    private boolean zzal = false;
    private int zzan = 0;

    public FocusingProcessor(com.google.android.gms.vision.Detector<T> detector, com.google.android.gms.vision.Tracker<T> tracker) {
        this.zzt = detector;
        this.zzaj = tracker;
    }

    public abstract int selectFocus(com.google.android.gms.vision.Detector.Detections<T> detections);

    @Override // com.google.android.gms.vision.Detector.Processor
    public void release() {
        this.zzaj.onDone();
    }

    @Override // com.google.android.gms.vision.Detector.Processor
    public void receiveDetections(com.google.android.gms.vision.Detector.Detections<T> detections) {
        android.util.SparseArray<T> detectedItems = detections.getDetectedItems();
        if (detectedItems.size() == 0) {
            if (this.zzan == this.zzak) {
                this.zzaj.onDone();
                this.zzal = false;
            } else {
                this.zzaj.onMissing(detections);
            }
            this.zzan++;
            return;
        }
        this.zzan = 0;
        if (this.zzal) {
            T t = detectedItems.get(this.zzam);
            if (t != null) {
                this.zzaj.onUpdate(detections, t);
                return;
            } else {
                this.zzaj.onDone();
                this.zzal = false;
            }
        }
        int iSelectFocus = selectFocus(detections);
        T t2 = detectedItems.get(iSelectFocus);
        if (t2 == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(35);
            sb.append("Invalid focus selected: ");
            sb.append(iSelectFocus);
            android.util.Log.w("FocusingProcessor", sb.toString());
            return;
        }
        this.zzal = true;
        this.zzam = iSelectFocus;
        this.zzt.setFocus(iSelectFocus);
        this.zzaj.onNewItem(this.zzam, t2);
        this.zzaj.onUpdate(detections, t2);
    }

    protected final void zza(int i) {
        if (i < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(28);
            sb.append("Invalid max gap: ");
            sb.append(i);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        this.zzak = i;
    }
}
