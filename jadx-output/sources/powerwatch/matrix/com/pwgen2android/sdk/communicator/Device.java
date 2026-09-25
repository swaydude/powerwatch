package powerwatch.matrix.com.pwgen2android.sdk.communicator;

/* JADX INFO: compiled from: Device.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\b\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0006H&J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H&J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0012H&¨\u0006\u0013"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Device;", "", "deviceInfo", "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;", "messageOutput", "Lio/reactivex/Observable;", "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;", "refresh", "", "resubscribeCharacteristics", "Lio/reactivex/Completable;", "protocolType", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;", "sendMessage", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_MESSAGE_KEY, "updateInfo", "updateWithAccessory", "accessory", "Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface Device {
    powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo();

    io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage> messageOutput();

    void refresh();

    io.reactivex.Completable resubscribeCharacteristics(powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType protocolType);

    io.reactivex.Completable sendMessage(powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage message);

    io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo> updateInfo();

    void updateWithAccessory(powerwatch.matrix.com.pwgen2android.sdk.model.Accessory accessory);
}
