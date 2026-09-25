package powerwatch.matrix.com.pwgen2android.sdk.protocol;

/* JADX INFO: compiled from: Protocol.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\u0006\u0010\u0010\u001a\u00020\rH\u0016R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2ProtocolBasics;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolImpl;", "characteristicTypeMap", "", "Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;", "", "bleProtocolParser", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolParser;", "(Ljava/util/Map;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolParser;)V", "getType", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;", "messageOutput", "Lio/reactivex/Observable;", "Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;", "sendMessage", "Lio/reactivex/Single;", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_MESSAGE_KEY, "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Gen2ProtocolBasics extends powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolImpl {
    private final java.util.Map<powerwatch.matrix.com.pwgen2android.sdk.channels.CharacteristicType, java.lang.String> characteristicTypeMap;

    /* JADX INFO: compiled from: Protocol.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolMessageType.valuesCustom().length];
            iArr[powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolMessageType.GEN2_FIRMWARE_REQUEST.ordinal()] = 1;
            iArr[powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolMessageType.GEN2_SERIAL_REQUEST.ordinal()] = 2;
            iArr[powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolMessageType.GEN2_SETTINGS_REQUEST.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gen2ProtocolBasics(java.util.Map<powerwatch.matrix.com.pwgen2android.sdk.channels.CharacteristicType, java.lang.String> characteristicTypeMap, powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolParser bleProtocolParser) {
        super(bleProtocolParser);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(characteristicTypeMap, "characteristicTypeMap");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bleProtocolParser, "bleProtocolParser");
        this.characteristicTypeMap = characteristicTypeMap;
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolImpl, powerwatch.matrix.com.pwgen2android.sdk.protocol.Protocol
    public powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType getType() {
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType.GEN2_STANDARD_BASICS;
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolImpl, powerwatch.matrix.com.pwgen2android.sdk.protocol.Protocol
    public io.reactivex.Single<powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage> sendMessage(final powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        if (getChannel() == null) {
            io.reactivex.Single<powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage> singleError = io.reactivex.Single.error(new java.lang.Throwable("Calling sendMessage, but channel is not initialized!"));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singleError, "error(Throwable(\"Calling sendMessage, but channel is not initialized!\"))");
            return singleError;
        }
        io.reactivex.Single<powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage> singleFlatMap = io.reactivex.Single.just(message).doOnSuccess(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.-$$Lambda$Gen2ProtocolBasics$SY6Er7MK-fjPiUWKDLH8lmmz-KE
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.Gen2ProtocolBasics.m2304sendMessage$lambda0(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.-$$Lambda$Gen2ProtocolBasics$iXfTC4_wDwMoTvC-rfc1XRbj4Gg
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.Gen2ProtocolBasics.m2305sendMessage$lambda1(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.-$$Lambda$Gen2ProtocolBasics$Tc-22GvZKhjsppozQkkgy4DP6vA
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.Gen2ProtocolBasics.m2306sendMessage$lambda4(this.f$0, message, (java.lang.String) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singleFlatMap, "just(message)\n                .doOnSuccess { Log.d(javaClass.simpleName, \"Sending message to parser\") }\n                .map {\n                    when (it.messageType) {\n                        ProtocolMessageType.GEN2_FIRMWARE_REQUEST -> characteristicTypeMap[CharacteristicType.FIRMWARE]\n                        ProtocolMessageType.GEN2_SERIAL_REQUEST -> characteristicTypeMap[CharacteristicType.SERIAL]\n                        ProtocolMessageType.GEN2_SETTINGS_REQUEST -> characteristicTypeMap[CharacteristicType.SETTINGS_INFO]\n                        else -> TODO(\"Unsupported type\")\n                    }\n\n                }\n                .flatMap {\n                    channel!!.read(it)\n                            .map { message -> ProtocolMessage(ProtocolPayload(message), type = getType(), messageType = ProtocolMessageType.RESPONSE) }\n                            .doOnSuccess {\n                                if (message.messageType == ProtocolMessageType.GEN2_SETTINGS_REQUEST){\n                                    println(\"Received settings: ${it.payload.data.formatToString(false)}\")\n                                }\n                            }\n                }");
        return singleFlatMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendMessage$lambda-0, reason: not valid java name */
    public static final void m2304sendMessage$lambda0(powerwatch.matrix.com.pwgen2android.sdk.protocol.Gen2ProtocolBasics this$0, powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage protocolMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        android.util.Log.d(this$0.getClass().getSimpleName(), "Sending message to parser");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendMessage$lambda-1, reason: not valid java name */
    public static final java.lang.String m2305sendMessage$lambda1(powerwatch.matrix.com.pwgen2android.sdk.protocol.Gen2ProtocolBasics this$0, powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        int i = powerwatch.matrix.com.pwgen2android.sdk.protocol.Gen2ProtocolBasics.WhenMappings.$EnumSwitchMapping$0[it.getMessageType().ordinal()];
        if (i == 1) {
            return this$0.characteristicTypeMap.get(powerwatch.matrix.com.pwgen2android.sdk.channels.CharacteristicType.FIRMWARE);
        }
        if (i == 2) {
            return this$0.characteristicTypeMap.get(powerwatch.matrix.com.pwgen2android.sdk.channels.CharacteristicType.SERIAL);
        }
        if (i == 3) {
            return this$0.characteristicTypeMap.get(powerwatch.matrix.com.pwgen2android.sdk.channels.CharacteristicType.SETTINGS_INFO);
        }
        throw new kotlin.NotImplementedError("An operation is not implemented: Unsupported type");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendMessage$lambda-4, reason: not valid java name */
    public static final io.reactivex.SingleSource m2306sendMessage$lambda4(final powerwatch.matrix.com.pwgen2android.sdk.protocol.Gen2ProtocolBasics this$0, final powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage message, java.lang.String it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "$message");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel channel = this$0.getChannel();
        kotlin.jvm.internal.Intrinsics.checkNotNull(channel);
        return channel.read(it).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.-$$Lambda$Gen2ProtocolBasics$GpvI53ve8y0x1pOvXT244Bkaq_0
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.Gen2ProtocolBasics.m2307sendMessage$lambda4$lambda2(this.f$0, (byte[]) obj);
            }
        }).doOnSuccess(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.-$$Lambda$Gen2ProtocolBasics$sVTTf2TliOM5ukzKOXiuYLBpuFU
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.Gen2ProtocolBasics.m2308sendMessage$lambda4$lambda3(message, (powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendMessage$lambda-4$lambda-2, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage m2307sendMessage$lambda4$lambda2(powerwatch.matrix.com.pwgen2android.sdk.protocol.Gen2ProtocolBasics this$0, byte[] message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        return new powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage(new powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolPayload(message), this$0.getType(), powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolMessageType.RESPONSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendMessage$lambda-4$lambda-3, reason: not valid java name */
    public static final void m2308sendMessage$lambda4$lambda3(powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage message, powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage protocolMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "$message");
        if (message.getMessageType() == powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolMessageType.GEN2_SETTINGS_REQUEST) {
            java.lang.System.out.println((java.lang.Object) kotlin.jvm.internal.Intrinsics.stringPlus("Received settings: ", powerwatch.matrix.com.pwgen2android.shared.extensions.BluetoothExtensionsKt.formatToString(protocolMessage.getPayload().getData(), false)));
        }
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolImpl, powerwatch.matrix.com.pwgen2android.sdk.protocol.Protocol
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage> messageOutput() {
        if (getChannel() == null) {
            io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage> observableError = io.reactivex.Observable.error(new java.lang.Throwable("Calling messageOutput, but channel is not initialized!"));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableError, "error(Throwable(\"Calling messageOutput, but channel is not initialized!\"))");
            return observableError;
        }
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage> observable = io.reactivex.Completable.complete().toObservable();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observable, "complete().toObservable()");
        return observable;
    }
}
