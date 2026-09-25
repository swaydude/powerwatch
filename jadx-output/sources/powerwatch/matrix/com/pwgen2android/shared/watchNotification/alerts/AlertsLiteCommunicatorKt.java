package powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts;

/* JADX INFO: compiled from: AlertsLiteCommunicator.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"createMessage", "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;", "deviceId", "", "data", "", "app_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class AlertsLiteCommunicatorKt {
    public static final powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage createMessage(java.lang.String deviceId, byte[] data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        return new powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage(deviceId, new powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage(new powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolPayload(data), powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType.BLE_DTP_X, null, 4, null), powerwatch.matrix.com.pwgen2android.sdk.technologies.TechnologyType.BLE_COMMUNICATION, powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType.BLE_DTP_X);
    }
}
