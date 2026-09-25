package powerwatch.matrix.com.pwgen2android.sdk.protocol.executors;

/* JADX INFO: compiled from: Gen2HeartRateExecutor.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeHeartRateExecutor;", "", "communicator", "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;", "(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;)V", "parser", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2HeartRateParser;", "receiveData", "Lio/reactivex/Observable;", "", "deviceID", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Gen2RealtimeHeartRateExecutor {
    private final powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator;
    private final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2HeartRateParser parser;

    public Gen2RealtimeHeartRateExecutor(powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(communicator, "communicator");
        this.communicator = communicator;
        this.parser = new powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2HeartRateParser();
    }

    public final io.reactivex.Observable<java.lang.Long> receiveData(java.lang.String deviceID) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceID, "deviceID");
        io.reactivex.Observable map = this.communicator.messageOutput().filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2RealtimeHeartRateExecutor$P44C3i6iSDyUANq-uMmNWM8ICv0
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2RealtimeHeartRateExecutor.m2520receiveData$lambda0((powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2RealtimeHeartRateExecutor$8uxOZ_L3ENOl_7gmGHfIiY8i81k
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2RealtimeHeartRateExecutor.m2521receiveData$lambda1(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(map, "communicator.messageOutput()\n                .filter { it.protocolType == ProtocolType.GEN2_HEART_RATE }\n                .map { parser.parse(it) }");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: receiveData$lambda-0, reason: not valid java name */
    public static final boolean m2520receiveData$lambda0(powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it.getProtocolType() == powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType.GEN2_HEART_RATE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: receiveData$lambda-1, reason: not valid java name */
    public static final java.lang.Long m2521receiveData$lambda1(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2RealtimeHeartRateExecutor this$0, powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return java.lang.Long.valueOf(this$0.parser.parse(it));
    }
}
