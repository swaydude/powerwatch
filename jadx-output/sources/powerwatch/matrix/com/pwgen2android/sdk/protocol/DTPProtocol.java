package powerwatch.matrix.com.pwgen2android.sdk.protocol;

/* JADX INFO: compiled from: Protocol.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005H\u0096\u0001J\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0096\u0001J\b\u0010\t\u001a\u00020\nH\u0016J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0096\u0001J\t\u0010\u000e\u001a\u00020\u0005H\u0096\u0001J\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0096\u0001R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/DTPProtocol;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Protocol;", "bleProtocolImpl", "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Protocol;)V", "close", "Lio/reactivex/Completable;", "connectToChannel", "channel", "Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;", "getType", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;", "messageOutput", "Lio/reactivex/Observable;", "Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;", "resubscribe", "sendMessage", "Lio/reactivex/Single;", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_MESSAGE_KEY, "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class DTPProtocol implements powerwatch.matrix.com.pwgen2android.sdk.protocol.Protocol {
    private final powerwatch.matrix.com.pwgen2android.sdk.protocol.Protocol bleProtocolImpl;

    /* JADX WARN: Multi-variable type inference failed */
    public DTPProtocol() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.Protocol
    public io.reactivex.Completable close() {
        return this.bleProtocolImpl.close();
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.Protocol
    public io.reactivex.Completable connectToChannel(powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel channel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(channel, "channel");
        return this.bleProtocolImpl.connectToChannel(channel);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.Protocol
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage> messageOutput() {
        return this.bleProtocolImpl.messageOutput();
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.Protocol
    public io.reactivex.Completable resubscribe() {
        return this.bleProtocolImpl.resubscribe();
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.Protocol
    public io.reactivex.Single<powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage> sendMessage(powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        return this.bleProtocolImpl.sendMessage(message);
    }

    public DTPProtocol(powerwatch.matrix.com.pwgen2android.sdk.protocol.Protocol bleProtocolImpl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bleProtocolImpl, "bleProtocolImpl");
        this.bleProtocolImpl = bleProtocolImpl;
    }

    public /* synthetic */ DTPProtocol(powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolImpl protocolImpl, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolImpl(new powerwatch.matrix.com.pwgen2android.sdk.protocol.SimpleProtocolParser()) : protocolImpl);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.Protocol
    public powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType getType() {
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType.BLE_DTP;
    }
}
