package powerwatch.matrix.com.pwgen2android.sdk.communicator;

/* JADX INFO: compiled from: Communicator.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0004H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H&J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H&J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006H&J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u000fH&J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H&J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\rH&J\u0016\u0010\u0019\u001a\u00020\u000f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u0003H&J\u001a\u0010\u001b\u001a\u00020\u000f2\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0003H&J\b\u0010\u001e\u001a\u00020\u000fH&J\b\u0010\u001f\u001a\u00020\u000fH&J\b\u0010 \u001a\u00020\u000fH&J\u0010\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u0011H&¨\u0006#"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;", "", "connectedDevices", "", "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;", "connectedDevicesChange", "Lio/reactivex/Observable;", "defaultConnectedDevice", "disconnectedDevicesChange", "foundDevices", "foundDevicesChange", "lostDevicesChange", "messageOutput", "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;", "refreshConnection", "", "uid", "", "releaseScanningResources", "resubscribeCharacteristics", "Lio/reactivex/Completable;", "protocolType", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;", "sendMessage", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_MESSAGE_KEY, "startConnection", "devicesToConnect", "startScanning", "scanFilters", "Lcom/polidea/rxandroidble2/scan/ScanFilter;", "stopConnection", "stopScanning", "unpairConnectedDevices", "unpairDevice", "bluetoothAddress", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface Communicator {
    java.util.List<powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo> connectedDevices();

    io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo> connectedDevicesChange();

    powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo defaultConnectedDevice();

    io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo> disconnectedDevicesChange();

    java.util.List<powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo> foundDevices();

    io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo> foundDevicesChange();

    io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo> lostDevicesChange();

    io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage> messageOutput();

    void refreshConnection(java.lang.String uid);

    void releaseScanningResources();

    io.reactivex.Completable resubscribeCharacteristics(powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType protocolType);

    io.reactivex.Completable sendMessage(powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage message);

    void startConnection(java.util.List<java.lang.String> devicesToConnect);

    void startScanning(java.util.List<? extends com.polidea.rxandroidble2.scan.ScanFilter> scanFilters);

    void stopConnection();

    void stopScanning();

    void unpairConnectedDevices();

    void unpairDevice(java.lang.String bluetoothAddress);

    /* JADX INFO: compiled from: Communicator.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void startScanning$default(powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator, java.util.List list, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startScanning");
            }
            if ((i & 1) != 0) {
                list = null;
            }
            communicator.startScanning(list);
        }
    }
}
