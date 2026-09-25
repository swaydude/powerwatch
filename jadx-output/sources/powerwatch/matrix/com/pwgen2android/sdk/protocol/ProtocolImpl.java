package powerwatch.matrix.com.pwgen2android.sdk.protocol;

/* JADX INFO: compiled from: Protocol.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u000eH\u0016J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u00172\u0006\u0010\u0018\u001a\u00020\u0014H\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolImpl;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Protocol;", "parser", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolParser;", "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolParser;)V", "channel", "Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;", "getChannel", "()Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;", "setChannel", "(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;)V", "getParser", "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolParser;", "close", "Lio/reactivex/Completable;", "connectToChannel", "getType", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;", "messageOutput", "Lio/reactivex/Observable;", "Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;", "resubscribe", "sendMessage", "Lio/reactivex/Single;", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_MESSAGE_KEY, "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public class ProtocolImpl implements powerwatch.matrix.com.pwgen2android.sdk.protocol.Protocol {
    private powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel channel;
    private final powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolParser parser;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendMessage$lambda-5$lambda-4, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage m2315sendMessage$lambda5$lambda4(powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage message, byte[] it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "$message");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return message;
    }

    public ProtocolImpl(powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolParser parser) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parser, "parser");
        this.parser = parser;
    }

    protected final powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolParser getParser() {
        return this.parser;
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.Protocol
    public io.reactivex.Completable resubscribe() {
        powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel communicationChannel = this.channel;
        io.reactivex.Completable completableResubscribeCharacteristics = communicationChannel == null ? null : communicationChannel.resubscribeCharacteristics();
        if (completableResubscribeCharacteristics != null) {
            return completableResubscribeCharacteristics;
        }
        io.reactivex.Completable completableComplete = io.reactivex.Completable.complete();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableComplete, "complete()");
        return completableComplete;
    }

    protected final powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel getChannel() {
        return this.channel;
    }

    protected final void setChannel(powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel communicationChannel) {
        this.channel = communicationChannel;
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.Protocol
    public powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType getType() {
        throw new kotlin.NotImplementedError("An operation is not implemented: not implemented");
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.Protocol
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage> messageOutput() {
        powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel communicationChannel = this.channel;
        if (communicationChannel == null) {
            io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage> observableError = io.reactivex.Observable.error(new java.lang.Throwable("Calling messageOutput, but channel is not initialized!"));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableError, "error(Throwable(\"Calling messageOutput, but channel is not initialized!\"))");
            return observableError;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(communicationChannel);
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage> observableDoOnSubscribe = communicationChannel.receivedData().map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.-$$Lambda$ProtocolImpl$2VnOlXiadf9V3wOxQAFMI6Eiz3w
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolImpl.m2310messageOutput$lambda0(this.f$0, (byte[]) obj);
            }
        }).doOnSubscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.-$$Lambda$ProtocolImpl$Q74jnqvpNERRGQyvMWo3gDdTa3g
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                android.util.Log.d("test_sub", "Subscribe called");
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableDoOnSubscribe, "channel!!.receivedData()\n                .map {\n                    parser.parseResponse(it)\n                }\n                .doOnSubscribe {\n                    Log.d(\"test_sub\", \"Subscribe called\")\n                }");
        return observableDoOnSubscribe;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: messageOutput$lambda-0, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage m2310messageOutput$lambda0(powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolImpl this$0, byte[] it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.getParser().parseResponse(it);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.Protocol
    public io.reactivex.Single<powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage> sendMessage(final powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        if (this.channel == null) {
            io.reactivex.Single<powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage> singleError = io.reactivex.Single.error(new java.lang.Throwable("Calling sendMessage, but channel is not initialized!"));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singleError, "error(Throwable(\"Calling sendMessage, but channel is not initialized!\"))");
            return singleError;
        }
        io.reactivex.Single<powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage> singleFlatMap = io.reactivex.Single.just(message).doOnSuccess(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.-$$Lambda$ProtocolImpl$abHRpp33_gxZRVTlL2nwuBJEWTE
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolImpl.m2312sendMessage$lambda2(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.-$$Lambda$ProtocolImpl$YKX_ndHSIX5bvI3dwlnNPftDJYA
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolImpl.m2313sendMessage$lambda3(this.f$0, message, (powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.-$$Lambda$ProtocolImpl$7k9vAWpUXRYuGvAGRY_X3wq20Wg
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolImpl.m2314sendMessage$lambda5(this.f$0, message, (byte[]) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singleFlatMap, "just(message)\n                .doOnSuccess { Log.d(javaClass.simpleName, \"Sending message to parser\") }\n                .map { parser.parseMessage(message) }\n                .flatMap {\n                    channel!!.send(it)\n                            .map { message }\n                }");
        return singleFlatMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendMessage$lambda-2, reason: not valid java name */
    public static final void m2312sendMessage$lambda2(powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage protocolMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        android.util.Log.d(this$0.getClass().getSimpleName(), "Sending message to parser");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendMessage$lambda-3, reason: not valid java name */
    public static final byte[] m2313sendMessage$lambda3(powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage message, powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "$message");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.getParser().parseMessage(message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendMessage$lambda-5, reason: not valid java name */
    public static final io.reactivex.SingleSource m2314sendMessage$lambda5(powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolImpl this$0, final powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage message, byte[] it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "$message");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel channel = this$0.getChannel();
        kotlin.jvm.internal.Intrinsics.checkNotNull(channel);
        return channel.send(it).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.-$$Lambda$ProtocolImpl$zW96FteXA2FS_v_fzTD6bz8ZZw8
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolImpl.m2315sendMessage$lambda5$lambda4(message, (byte[]) obj);
            }
        });
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.Protocol
    public io.reactivex.Completable connectToChannel(powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel channel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(channel, "channel");
        this.channel = channel;
        return channel.open();
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.Protocol
    public io.reactivex.Completable close() {
        powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel communicationChannel = this.channel;
        if (communicationChannel != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(communicationChannel);
            return communicationChannel.close();
        }
        io.reactivex.Completable completableError = io.reactivex.Completable.error(new java.lang.Throwable("Calling close, but channel is not initialized!"));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableError, "error(Throwable(\"Calling close, but channel is not initialized!\"))");
        return completableError;
    }
}
