package powerwatch.matrix.com.pwgen2android.pair.camera;

/* JADX INFO: compiled from: CameraReader.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/pair/camera/BarcodeTrackerFactory;", "Lcom/google/android/gms/vision/MultiProcessor$Factory;", "Lcom/google/android/gms/vision/barcode/Barcode;", "l", "Lpowerwatch/matrix/com/pwgen2android/pair/camera/Listen;", "(Lpowerwatch/matrix/com/pwgen2android/pair/camera/Listen;)V", "getL", "()Lpowerwatch/matrix/com/pwgen2android/pair/camera/Listen;", "create", "Lcom/google/android/gms/vision/Tracker;", "p0", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class BarcodeTrackerFactory implements com.google.android.gms.vision.MultiProcessor.Factory<com.google.android.gms.vision.barcode.Barcode> {
    private final powerwatch.matrix.com.pwgen2android.pair.camera.Listen l;

    public BarcodeTrackerFactory(powerwatch.matrix.com.pwgen2android.pair.camera.Listen l) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(l, "l");
        this.l = l;
    }

    public final powerwatch.matrix.com.pwgen2android.pair.camera.Listen getL() {
        return this.l;
    }

    @Override // com.google.android.gms.vision.MultiProcessor.Factory
    public com.google.android.gms.vision.Tracker<com.google.android.gms.vision.barcode.Barcode> create(com.google.android.gms.vision.barcode.Barcode p0) {
        return new powerwatch.matrix.com.pwgen2android.pair.camera.MyTracker(this.l);
    }
}
