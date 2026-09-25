package powerwatch.matrix.com.pwgen2android.sdk.protocol.executors;

/* JADX INFO: compiled from: Gen2RealtimeDataExecutor.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\n2\u0006\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeDataExecutor;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "communicator", "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;", "settingsDataProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;", "(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;)V", "parser", "Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeDataParser;", "readData", "Lio/reactivex/Observable;", "Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;", "deviceID", "", "readSettingsData", "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Gen2RealtimeDataExecutor implements powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    private final powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator;
    private final powerwatch.matrix.com.pwgen2android.sdk.RealtimeDataParser parser;
    private final powerwatch.matrix.com.pwgen2android.shared.data.providers.SettingsDataProvider settingsDataProvider;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: readData$lambda-2, reason: not valid java name */
    public static final void m2513readData$lambda2(powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage communicationMessage) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: readData$lambda-4, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.sdk.RealtimeWatchData m2515readData$lambda4(powerwatch.matrix.com.pwgen2android.sdk.RealtimeWatchData response, byte[] noName_1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(noName_1, "$noName_1");
        return response;
    }

    public Gen2RealtimeDataExecutor(powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator, powerwatch.matrix.com.pwgen2android.shared.data.providers.SettingsDataProvider settingsDataProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(communicator, "communicator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsDataProvider, "settingsDataProvider");
        this.communicator = communicator;
        this.settingsDataProvider = settingsDataProvider;
        this.parser = new powerwatch.matrix.com.pwgen2android.sdk.RealtimeDataParser();
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    public final io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.RealtimeWatchData> readData(final java.lang.String deviceID) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceID, "deviceID");
        io.reactivex.Observable observableDefer = io.reactivex.Observable.defer(new java.util.concurrent.Callable() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2RealtimeDataExecutor$zttXhlhIYM1Jd6IvTV6fbf9luDY
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2RealtimeDataExecutor.m2511readData$lambda0(this.f$0, deviceID);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableDefer, "defer {\n            return@defer communicator.sendMessage(CommunicationMessage(deviceID, ProtocolMessage(ProtocolPayload(byteArrayOf()),\n                    messageType = ProtocolMessageType.GEN2_SERIAL_REQUEST),\n                    TechnologyType.BLE_COMMUNICATION,\n                    ProtocolType.GEN2_STANDARD_BASICS))\n                    .toSingleDefault(byteArrayOf())\n                    .toObservable()\n        }");
        io.reactivex.Observable observable = this.communicator.messageOutput().timeout(10L, java.util.concurrent.TimeUnit.SECONDS).filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2RealtimeDataExecutor$zSSa9mGV2LdCdfdjKaAJ-VV5q8I
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2RealtimeDataExecutor.m2512readData$lambda1((powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2RealtimeDataExecutor$VOFeDjjKbOJES325gLuCjqBCLNc
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2RealtimeDataExecutor.m2513readData$lambda2((powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2RealtimeDataExecutor$Neukcr4SuPyg75wpLMy-M6iZk70
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2RealtimeDataExecutor.m2514readData$lambda3(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage) obj);
            }
        }).firstOrError().toObservable();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observable, "communicator.messageOutput()\n                .timeout(10, TimeUnit.SECONDS)\n                .filter { it.protocolType == ProtocolType.GEN2_STANDARD_BASICS }\n                .doOnNext {\n//                    debug(\"Realtime data: ${it.protocolMessage.payload.data.formatToString()}\")\n                }\n                .map { parser.extractData(it.protocolMessage.payload.data) }\n                .firstOrError()\n                .toObservable()");
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.RealtimeWatchData> observableFlatMap = io.reactivex.Observable.zip(observable, observableDefer, new io.reactivex.functions.BiFunction() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2RealtimeDataExecutor$RWRxEhJW3JgNoYZlOXXf0YAoZPs
            @Override // io.reactivex.functions.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2RealtimeDataExecutor.m2515readData$lambda4((powerwatch.matrix.com.pwgen2android.sdk.RealtimeWatchData) obj, (byte[]) obj2);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2RealtimeDataExecutor$5hONqitXIr48mZZhsNrdjhvwA0U
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2RealtimeDataExecutor.m2516readData$lambda8(this.f$0, deviceID, (powerwatch.matrix.com.pwgen2android.sdk.RealtimeWatchData) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableFlatMap, "zip(responseObservable, requestObservable,\n                BiFunction<RealtimeWatchData, ByteArray, RealtimeWatchData> { response, _ -> response })\n                .flatMap { data ->\n                    readSettingsData(deviceID).map { settingsData ->\n                        data.apply {\n                            this.settingsData = settingsData\n                        }\n                    }.doOnNext {\n                        println(\"settings_data_load_new_exec: ${it?.settingsData?.homeScreen ?: -1}\")\n                    }\n                }");
        return observableFlatMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: readData$lambda-0, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2511readData$lambda0(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2RealtimeDataExecutor this$0, java.lang.String deviceID) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceID, "$deviceID");
        return this$0.communicator.sendMessage(new powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage(deviceID, new powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage(new powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolPayload(new byte[0]), null, powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolMessageType.GEN2_SERIAL_REQUEST, 2, null), powerwatch.matrix.com.pwgen2android.sdk.technologies.TechnologyType.BLE_COMMUNICATION, powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType.GEN2_STANDARD_BASICS)).toSingleDefault(new byte[0]).toObservable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: readData$lambda-1, reason: not valid java name */
    public static final boolean m2512readData$lambda1(powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it.getProtocolType() == powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType.GEN2_STANDARD_BASICS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: readData$lambda-3, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.sdk.RealtimeWatchData m2514readData$lambda3(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2RealtimeDataExecutor this$0, powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.parser.extractData(it.getProtocolMessage().getPayload().getData());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: readData$lambda-8, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2516readData$lambda8(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2RealtimeDataExecutor this$0, java.lang.String deviceID, final powerwatch.matrix.com.pwgen2android.sdk.RealtimeWatchData data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceID, "$deviceID");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        return this$0.readSettingsData(deviceID).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2RealtimeDataExecutor$vAuqmX2UwQbNBXNCSOJGOnO7oGw
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2RealtimeDataExecutor.m2517readData$lambda8$lambda6(data, (powerwatch.matrix.com.pwgen2android.sdk.SettingsData) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2RealtimeDataExecutor$lrRW15ylnRQSXQlTUwVoARyso6U
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2RealtimeDataExecutor.m2518readData$lambda8$lambda7((powerwatch.matrix.com.pwgen2android.sdk.RealtimeWatchData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: readData$lambda-8$lambda-6, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.sdk.RealtimeWatchData m2517readData$lambda8$lambda6(powerwatch.matrix.com.pwgen2android.sdk.RealtimeWatchData data, powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "$data");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsData, "settingsData");
        data.setSettingsData(settingsData);
        return data;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: readData$lambda-8$lambda-7, reason: not valid java name */
    public static final void m2518readData$lambda8$lambda7(powerwatch.matrix.com.pwgen2android.sdk.RealtimeWatchData realtimeWatchData) {
        powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData = realtimeWatchData == null ? null : realtimeWatchData.getSettingsData();
        java.lang.System.out.println((java.lang.Object) kotlin.jvm.internal.Intrinsics.stringPlus("settings_data_load_new_exec: ", java.lang.Integer.valueOf(settingsData == null ? -1 : settingsData.getHomeScreen())));
    }

    private final io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.SettingsData> readSettingsData(java.lang.String deviceID) {
        return this.settingsDataProvider.loadSettingsFromWatch(deviceID);
    }
}
