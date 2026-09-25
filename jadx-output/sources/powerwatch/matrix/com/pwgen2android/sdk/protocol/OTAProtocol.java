package powerwatch.matrix.com.pwgen2android.sdk.protocol;

/* JADX INFO: compiled from: Protocol.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005H\u0096\u0001J\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0096\u0001J\b\u0010\t\u001a\u00020\nH\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\t\u0010\u000e\u001a\u00020\u0005H\u0096\u0001J\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0096\u0001R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/OTAProtocol;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Protocol;", "bleProtocolImpl", "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Protocol;)V", "close", "Lio/reactivex/Completable;", "connectToChannel", "channel", "Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;", "getType", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;", "messageOutput", "Lio/reactivex/Observable;", "Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;", "resubscribe", "sendMessage", "Lio/reactivex/Single;", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_MESSAGE_KEY, "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class OTAProtocol implements powerwatch.matrix.com.pwgen2android.sdk.protocol.Protocol {
    private final powerwatch.matrix.com.pwgen2android.sdk.protocol.Protocol bleProtocolImpl;

    /* JADX WARN: Multi-variable type inference failed */
    public OTAProtocol() {
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
    public io.reactivex.Completable resubscribe() {
        return this.bleProtocolImpl.resubscribe();
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.Protocol
    public io.reactivex.Single<powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage> sendMessage(powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        return this.bleProtocolImpl.sendMessage(message);
    }

    public OTAProtocol(powerwatch.matrix.com.pwgen2android.sdk.protocol.Protocol bleProtocolImpl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bleProtocolImpl, "bleProtocolImpl");
        this.bleProtocolImpl = bleProtocolImpl;
    }

    public /* synthetic */ OTAProtocol(powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolImpl protocolImpl, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolImpl(new powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolParserImpl()) : protocolImpl);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.Protocol
    public powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType getType() {
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType.BLE_OTA;
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.Protocol
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage> messageOutput() {
        io.reactivex.Observable map = this.bleProtocolImpl.messageOutput().map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.-$$Lambda$OTAProtocol$v0bVxVBMRiNdF_0APDfVOyTvhb4
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.OTAProtocol.m2309messageOutput$lambda0(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(map, "bleProtocolImpl\n                .messageOutput()\n                .map { it.copy(type = getType()) }");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: messageOutput$lambda-0, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage m2309messageOutput$lambda0(powerwatch.matrix.com.pwgen2android.sdk.protocol.OTAProtocol this$0, powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage.copy$default(it, null, this$0.getType(), null, 5, null);
    }
}
