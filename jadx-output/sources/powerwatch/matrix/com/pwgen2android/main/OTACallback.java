package powerwatch.matrix.com.pwgen2android.main;

/* JADX INFO: compiled from: OTAModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016J\b\u0010\u0010\u001a\u00020\nH\u0016J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0018"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/OTACallback;", "Lpowerwatch/matrix/com/pwgen2android/ota/AmotaCallback;", "()V", "phasePower", "", "getPhasePower", "()F", "setPhasePower", "(F)V", "connectingToDevice", "", "otaFailed", "detail", "", "otaProcessStarted", "otaStarted", "otaSuccess", "progressUpdate", androidx.core.app.NotificationCompat.CATEGORY_PROGRESS, "", "sendFwDataState", "state", "", "sendVerifyState", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public class OTACallback implements powerwatch.matrix.com.pwgen2android.ota.AmotaCallback {
    private float phasePower = 1.0f;

    @Override // powerwatch.matrix.com.pwgen2android.ota.AmotaCallback
    public void sendFwDataState(boolean state) {
    }

    @Override // powerwatch.matrix.com.pwgen2android.ota.AmotaCallback
    public void sendVerifyState(boolean state) {
    }

    public final float getPhasePower() {
        return this.phasePower;
    }

    public final void setPhasePower(float f) {
        this.phasePower = f;
    }

    @Override // powerwatch.matrix.com.pwgen2android.ota.AmotaCallback
    public void progressUpdate(int progress) {
        android.util.Log.d("ota_process", kotlin.jvm.internal.Intrinsics.stringPlus("Running: ", java.lang.Integer.valueOf(progress)));
    }

    @Override // powerwatch.matrix.com.pwgen2android.ota.AmotaCallback
    public void otaFailed(java.lang.String detail) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(detail, "detail");
        android.util.Log.d("ota_process", kotlin.jvm.internal.Intrinsics.stringPlus("Failed: ", detail));
    }

    @Override // powerwatch.matrix.com.pwgen2android.ota.AmotaCallback
    public void otaSuccess() {
        android.util.Log.d("ota_process", "Success!");
    }

    @Override // powerwatch.matrix.com.pwgen2android.ota.AmotaCallback
    public void otaStarted() {
        android.util.Log.d("ota_process", "Started");
    }

    @Override // powerwatch.matrix.com.pwgen2android.ota.AmotaCallback
    public void connectingToDevice() {
        android.util.Log.d("ota_process", "Connecting...");
    }

    @Override // powerwatch.matrix.com.pwgen2android.ota.AmotaCallback
    public void otaProcessStarted() {
        android.util.Log.d("ota_process", "Started");
    }
}
