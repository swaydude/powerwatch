package powerwatch.matrix.com.pwgen2android.pair.camera;

/* JADX INFO: compiled from: CameraReader.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0016J\"\u0010\r\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/pair/camera/MyTracker;", "Lcom/google/android/gms/vision/Tracker;", "Lcom/google/android/gms/vision/barcode/Barcode;", "l", "Lpowerwatch/matrix/com/pwgen2android/pair/camera/Listen;", "(Lpowerwatch/matrix/com/pwgen2android/pair/camera/Listen;)V", "getL", "()Lpowerwatch/matrix/com/pwgen2android/pair/camera/Listen;", "onNewItem", "", "p0", "", "p1", "onUpdate", "Lcom/google/android/gms/vision/Detector$Detections;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class MyTracker extends com.google.android.gms.vision.Tracker<com.google.android.gms.vision.barcode.Barcode> {
    private final powerwatch.matrix.com.pwgen2android.pair.camera.Listen l;

    public MyTracker(powerwatch.matrix.com.pwgen2android.pair.camera.Listen l) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(l, "l");
        this.l = l;
    }

    public final powerwatch.matrix.com.pwgen2android.pair.camera.Listen getL() {
        return this.l;
    }

    @Override // com.google.android.gms.vision.Tracker
    public void onNewItem(int p0, com.google.android.gms.vision.barcode.Barcode p1) {
        super.onNewItem(p0, p1);
    }

    @Override // com.google.android.gms.vision.Tracker
    public void onUpdate(com.google.android.gms.vision.Detector.Detections<com.google.android.gms.vision.barcode.Barcode> p0, com.google.android.gms.vision.barcode.Barcode p1) {
        super.onUpdate(p0, p1);
        this.l.onResult(p1);
    }
}
