package powerwatch.matrix.com.pwgen2android.ota;

/* JADX INFO: compiled from: OtaCommunicatorImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/ota/OtaCommunicatorImpl;", "Lpowerwatch/matrix/com/pwgen2android/ota/OTACommunicator;", "communicator", "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;", "(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;)V", "receivedData", "Lio/reactivex/Observable;", "", "sendMessage", "", "deviceId", "", "data", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class OtaCommunicatorImpl implements powerwatch.matrix.com.pwgen2android.ota.OTACommunicator {
    private final powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendMessage$lambda-2, reason: not valid java name */
    public static final void m2014sendMessage$lambda2() {
    }

    public OtaCommunicatorImpl(powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(communicator, "communicator");
        this.communicator = communicator;
    }

    @Override // powerwatch.matrix.com.pwgen2android.ota.OTACommunicator
    public io.reactivex.Observable<byte[]> receivedData() {
        io.reactivex.Observable map = this.communicator.messageOutput().filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.ota.-$$Lambda$OtaCommunicatorImpl$GjOZoXgjygaSzt1wYOf850hOB80
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.ota.OtaCommunicatorImpl.m2012receivedData$lambda0((powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.ota.-$$Lambda$OtaCommunicatorImpl$m1g3ScQpHdkgg8hVf4mHzg9NFKY
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.ota.OtaCommunicatorImpl.m2013receivedData$lambda1((powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(map, "communicator.messageOutput()\n                .filter { it.protocolType == ProtocolType.BLE_OTA }\n                .map { it.protocolMessage.payload.data }");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: receivedData$lambda-0, reason: not valid java name */
    public static final boolean m2012receivedData$lambda0(powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it.getProtocolType() == powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType.BLE_OTA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: receivedData$lambda-1, reason: not valid java name */
    public static final byte[] m2013receivedData$lambda1(powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it.getProtocolMessage().getPayload().getData();
    }

    @Override // powerwatch.matrix.com.pwgen2android.ota.OTACommunicator
    public void sendMessage(java.lang.String deviceId, byte[] data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        this.communicator.sendMessage(new powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage(deviceId, new powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage(new powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolPayload(data), powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType.BLE_OTA, null, 4, null), powerwatch.matrix.com.pwgen2android.sdk.technologies.TechnologyType.BLE_COMMUNICATION, powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType.BLE_OTA)).subscribe(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.ota.-$$Lambda$OtaCommunicatorImpl$zhpKZtDTzxuNzW92kF3uiY1NrGY
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.ota.OtaCommunicatorImpl.m2014sendMessage$lambda2();
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.ota.-$$Lambda$OtaCommunicatorImpl$29ySyUpLHMPZE2S1PqL3L-YYzyQ
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                ((java.lang.Throwable) obj).printStackTrace();
            }
        });
    }
}
