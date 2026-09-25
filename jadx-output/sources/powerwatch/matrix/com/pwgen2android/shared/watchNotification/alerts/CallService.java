package powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts;

/* JADX INFO: compiled from: CallService.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/CallService;", "Landroid/telecom/CallScreeningService;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "()V", "onScreenCall", "", "callDetails", "Landroid/telecom/Call$Details;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class CallService extends android.telecom.CallScreeningService implements powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    @Override // android.telecom.CallScreeningService
    public void onScreenCall(android.telecom.Call.Details callDetails) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callDetails, "callDetails");
        android.util.Log.d("call_service", "onCallAdded");
        if (android.os.Build.VERSION.SDK_INT >= 29 && callDetails.getCallDirection() == 0) {
            android.net.Uri handle = callDetails.getHandle();
            powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.CallServiceKt.setLatestIncomingCall(handle == null ? null : handle.getSchemeSpecificPart());
            powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this, "incoming call", null, 2, null);
        }
        respondToCall(callDetails, new android.telecom.CallScreeningService.CallResponse.Builder().setDisallowCall(false).setRejectCall(false).setSkipCallLog(false).setSkipNotification(false).build());
    }
}
