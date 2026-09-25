package powerwatch.matrix.com.pwgen2android.main;

/* JADX INFO: compiled from: OTAExecutor.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¨\u0006\u0011"}, d2 = {"powerwatch/matrix/com/pwgen2android/main/OTAExecutor$otaCallback$1", "Lpowerwatch/matrix/com/pwgen2android/main/OTACallback;", "connectingToDevice", "", "otaFailed", "detail", "", "otaProcessStarted", "otaStarted", "otaSuccess", "progressUpdate", androidx.core.app.NotificationCompat.CATEGORY_PROGRESS, "", "sendFwDataState", "state", "", "sendVerifyState", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class OTAExecutor$otaCallback$1 extends powerwatch.matrix.com.pwgen2android.main.OTACallback {
    final /* synthetic */ powerwatch.matrix.com.pwgen2android.main.OTAExecutor this$0;

    @Override // powerwatch.matrix.com.pwgen2android.main.OTACallback, powerwatch.matrix.com.pwgen2android.ota.AmotaCallback
    public void connectingToDevice() {
    }

    @Override // powerwatch.matrix.com.pwgen2android.main.OTACallback, powerwatch.matrix.com.pwgen2android.ota.AmotaCallback
    public void sendFwDataState(boolean state) {
    }

    @Override // powerwatch.matrix.com.pwgen2android.main.OTACallback, powerwatch.matrix.com.pwgen2android.ota.AmotaCallback
    public void sendVerifyState(boolean state) {
    }

    OTAExecutor$otaCallback$1(powerwatch.matrix.com.pwgen2android.main.OTAExecutor oTAExecutor) {
        this.this$0 = oTAExecutor;
    }

    @Override // powerwatch.matrix.com.pwgen2android.main.OTACallback, powerwatch.matrix.com.pwgen2android.ota.AmotaCallback
    public void otaProcessStarted() {
        this.this$0.otaProgress.onNext(new powerwatch.matrix.com.pwgen2android.main.OTAProgressData(0, powerwatch.matrix.com.pwgen2android.main.OtaPhase.STARTED.INSTANCE));
    }

    @Override // powerwatch.matrix.com.pwgen2android.main.OTACallback, powerwatch.matrix.com.pwgen2android.ota.AmotaCallback
    public void otaSuccess() {
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this.this$0, "OTA Success", null, 2, null);
        float f = 100;
        this.this$0.otaProgress.onNext(new powerwatch.matrix.com.pwgen2android.main.OTAProgressData((int) (getPhasePower() * f), powerwatch.matrix.com.pwgen2android.main.OtaPhase.SUCCESS.INSTANCE));
        this.this$0.otaProgress.onNext(new powerwatch.matrix.com.pwgen2android.main.OTAProgressData((int) (f * getPhasePower()), powerwatch.matrix.com.pwgen2android.main.OtaPhase.FINISHED.INSTANCE));
        this.this$0.service.dispose();
    }

    @Override // powerwatch.matrix.com.pwgen2android.main.OTACallback, powerwatch.matrix.com.pwgen2android.ota.AmotaCallback
    public void otaFailed(java.lang.String detail) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(detail, "detail");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.error$default(this.this$0, detail, null, null, 4, null);
        this.this$0.releaseResources();
        this.this$0.otaProgress.onError(new powerwatch.matrix.com.pwgen2android.main.OTAError.FileTransferInterrupted(detail));
        powerwatch.matrix.com.pwgen2android.main.OTAExecutor oTAExecutor = this.this$0;
        io.reactivex.subjects.PublishSubject publishSubjectCreate = io.reactivex.subjects.PublishSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "create<OTAProgressData>()");
        oTAExecutor.otaProgress = publishSubjectCreate;
    }

    @Override // powerwatch.matrix.com.pwgen2android.main.OTACallback, powerwatch.matrix.com.pwgen2android.ota.AmotaCallback
    public void progressUpdate(int progress) {
        super.progressUpdate(progress);
        this.this$0.otaProgress.onNext(new powerwatch.matrix.com.pwgen2android.main.OTAProgressData((int) (progress * getPhasePower()), powerwatch.matrix.com.pwgen2android.main.OtaPhase.TRANSFER.INSTANCE));
    }

    @Override // powerwatch.matrix.com.pwgen2android.main.OTACallback, powerwatch.matrix.com.pwgen2android.ota.AmotaCallback
    public void otaStarted() {
        this.this$0.otaProgress.onNext(new powerwatch.matrix.com.pwgen2android.main.OTAProgressData(0, powerwatch.matrix.com.pwgen2android.main.OtaPhase.STARTED.INSTANCE));
    }
}
