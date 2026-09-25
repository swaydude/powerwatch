package powerwatch.matrix.com.pwgen2android.sdk.protocol;

/* JADX INFO: compiled from: Protocol.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2Protocol;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolImpl;", "characteristicTypeMap", "", "Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;", "", "bleProtocolParser", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolParser;", "(Ljava/util/Map;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolParser;)V", "getType", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;", "sendMessage", "Lio/reactivex/Single;", "Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_MESSAGE_KEY, "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Gen2Protocol extends powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolImpl {
    private final java.util.Map<powerwatch.matrix.com.pwgen2android.sdk.channels.CharacteristicType, java.lang.String> characteristicTypeMap;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendMessage$lambda-4$lambda-2, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage m2299sendMessage$lambda4$lambda2(powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage message, byte[] it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "$message");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return message;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendMessage$lambda-4$lambda-3, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage m2300sendMessage$lambda4$lambda3(powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage message, byte[] it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "$message");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return message;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gen2Protocol(java.util.Map<powerwatch.matrix.com.pwgen2android.sdk.channels.CharacteristicType, java.lang.String> characteristicTypeMap, powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolParser bleProtocolParser) {
        super(bleProtocolParser);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(characteristicTypeMap, "characteristicTypeMap");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bleProtocolParser, "bleProtocolParser");
        this.characteristicTypeMap = characteristicTypeMap;
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolImpl, powerwatch.matrix.com.pwgen2android.sdk.protocol.Protocol
    public powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType getType() {
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType.GEN2_DTP;
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolImpl, powerwatch.matrix.com.pwgen2android.sdk.protocol.Protocol
    public io.reactivex.Single<powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage> sendMessage(final powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        if (getChannel() == null) {
            io.reactivex.Single<powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage> singleError = io.reactivex.Single.error(new java.lang.Throwable("Calling sendMessage, but channel is not initialized!"));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singleError, "error(Throwable(\"Calling sendMessage, but channel is not initialized!\"))");
            return singleError;
        }
        io.reactivex.Single<powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage> singleFlatMap = io.reactivex.Single.just(message).doOnSuccess(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.-$$Lambda$Gen2Protocol$eXZPvupLkfyIeY7VaTun6Q7M4zM
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.Gen2Protocol.m2296sendMessage$lambda0(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.-$$Lambda$Gen2Protocol$Wenvj5nPcnYDqSQNxtXQAyG5aHc
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.Gen2Protocol.m2297sendMessage$lambda1(message, this, (powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.-$$Lambda$Gen2Protocol$bySLvbSuCHZELmuNdpzemFV_Unc
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.Gen2Protocol.m2298sendMessage$lambda4(this.f$0, message, (kotlin.Pair) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singleFlatMap, "just(message)\n                .doOnSuccess { Log.d(javaClass.simpleName, \"Sending message to parser\") }\n                .map { Pair(message.messageType, parser.parseMessage(message)) }\n                .flatMap {\n                    if (it.first == ProtocolMessageType.ACK_MESSAGE) {\n                        channel!!.sendEvent(it.second)\n                                .map { message }\n                    } else\n                        channel!!.send(it.second)\n                                .map { message }\n                }");
        return singleFlatMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendMessage$lambda-0, reason: not valid java name */
    public static final void m2296sendMessage$lambda0(powerwatch.matrix.com.pwgen2android.sdk.protocol.Gen2Protocol this$0, powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage protocolMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        android.util.Log.d(this$0.getClass().getSimpleName(), "Sending message to parser");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendMessage$lambda-1, reason: not valid java name */
    public static final kotlin.Pair m2297sendMessage$lambda1(powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage message, powerwatch.matrix.com.pwgen2android.sdk.protocol.Gen2Protocol this$0, powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "$message");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return new kotlin.Pair(message.getMessageType(), this$0.getParser().parseMessage(message));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendMessage$lambda-4, reason: not valid java name */
    public static final io.reactivex.SingleSource m2298sendMessage$lambda4(powerwatch.matrix.com.pwgen2android.sdk.protocol.Gen2Protocol this$0, final powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage message, kotlin.Pair it) {
        io.reactivex.SingleSource map;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "$message");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        if (it.getFirst() == powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolMessageType.ACK_MESSAGE) {
            powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel channel = this$0.getChannel();
            kotlin.jvm.internal.Intrinsics.checkNotNull(channel);
            map = channel.sendEvent((byte[]) it.getSecond()).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.-$$Lambda$Gen2Protocol$SNsPdr3ZT9QwY0xk_7pT-dHQGmc
                @Override // io.reactivex.functions.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return powerwatch.matrix.com.pwgen2android.sdk.protocol.Gen2Protocol.m2299sendMessage$lambda4$lambda2(message, (byte[]) obj);
                }
            });
        } else {
            powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel channel2 = this$0.getChannel();
            kotlin.jvm.internal.Intrinsics.checkNotNull(channel2);
            map = channel2.send((byte[]) it.getSecond()).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.-$$Lambda$Gen2Protocol$s-vQi6rERKCwsoex4p4tqYUxWPU
                @Override // io.reactivex.functions.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return powerwatch.matrix.com.pwgen2android.sdk.protocol.Gen2Protocol.m2300sendMessage$lambda4$lambda3(message, (byte[]) obj);
                }
            });
        }
        return map;
    }
}
