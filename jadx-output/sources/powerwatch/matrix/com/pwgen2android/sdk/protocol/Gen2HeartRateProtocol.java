package powerwatch.matrix.com.pwgen2android.sdk.protocol;

/* JADX INFO: compiled from: Protocol.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2HeartRateProtocol;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolImpl;", "characteristic", "Ljava/util/UUID;", "bleProtocolParser", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolParser;", "(Ljava/util/UUID;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolParser;)V", "connectToChannel", "Lio/reactivex/Completable;", "channel", "Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;", "getType", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;", "sendMessage", "Lio/reactivex/Single;", "Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_MESSAGE_KEY, "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Gen2HeartRateProtocol extends powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolImpl {
    private final java.util.UUID characteristic;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gen2HeartRateProtocol(java.util.UUID characteristic, powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolParser bleProtocolParser) {
        super(bleProtocolParser);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(characteristic, "characteristic");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bleProtocolParser, "bleProtocolParser");
        this.characteristic = characteristic;
    }

    public /* synthetic */ Gen2HeartRateProtocol(java.util.UUID uuid, powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolParserImpl protocolParserImpl, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, (i & 2) != 0 ? new powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolParserImpl() : protocolParserImpl);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolImpl, powerwatch.matrix.com.pwgen2android.sdk.protocol.Protocol
    public powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType getType() {
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType.GEN2_HEART_RATE;
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolImpl, powerwatch.matrix.com.pwgen2android.sdk.protocol.Protocol
    public io.reactivex.Single<powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage> sendMessage(powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        io.reactivex.Single<powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage> singleError = io.reactivex.Single.error(new java.lang.Throwable("not implemented"));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singleError, "error(Throwable(\"not implemented\"))");
        return singleError;
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolImpl, powerwatch.matrix.com.pwgen2android.sdk.protocol.Protocol
    public io.reactivex.Completable connectToChannel(final powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel channel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(channel, "channel");
        io.reactivex.Completable completableDefer = io.reactivex.Completable.defer(new java.util.concurrent.Callable() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.-$$Lambda$Gen2HeartRateProtocol$q5ICi84c19kFrmw5aVPCxC7gDdo
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.Gen2HeartRateProtocol.m2293connectToChannel$lambda0(this.f$0, channel);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableDefer, "defer {\n            this.channel = channel\n            this.channel?.open(this.characteristic)\n        }");
        return completableDefer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: connectToChannel$lambda-0, reason: not valid java name */
    public static final io.reactivex.CompletableSource m2293connectToChannel$lambda0(powerwatch.matrix.com.pwgen2android.sdk.protocol.Gen2HeartRateProtocol this$0, powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel channel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(channel, "$channel");
        this$0.setChannel(channel);
        powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel channel2 = this$0.getChannel();
        return channel2 == null ? null : channel2.open(this$0.characteristic);
    }
}
