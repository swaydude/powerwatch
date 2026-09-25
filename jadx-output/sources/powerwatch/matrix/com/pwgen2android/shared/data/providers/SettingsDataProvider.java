package powerwatch.matrix.com.pwgen2android.shared.data.providers;

/* JADX INFO: compiled from: SettingsDataProvider.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rJ\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;", "", "settingsDataRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;", "communicator", "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;)V", "settingDataParser", "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsDataParser;", "loadSettingsFromWatch", "Lio/reactivex/Observable;", "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;", "deviceID", "", "loadStoredSettings", "observe", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SettingsDataProvider {
    private final powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator;
    private final powerwatch.matrix.com.pwgen2android.sdk.SettingsDataParser settingDataParser;
    private final powerwatch.matrix.com.pwgen2android.shared.data.providers.SettingsDataRepository settingsDataRepository;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: loadSettingsFromWatch$lambda-2, reason: not valid java name */
    public static final void m3167loadSettingsFromWatch$lambda2(powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage communicationMessage) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: loadSettingsFromWatch$lambda-5, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.sdk.SettingsData m3170loadSettingsFromWatch$lambda5(powerwatch.matrix.com.pwgen2android.sdk.SettingsData response, byte[] noName_1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(noName_1, "$noName_1");
        return response;
    }

    public SettingsDataProvider(powerwatch.matrix.com.pwgen2android.shared.data.providers.SettingsDataRepository settingsDataRepository, powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsDataRepository, "settingsDataRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(communicator, "communicator");
        this.settingsDataRepository = settingsDataRepository;
        this.communicator = communicator;
        this.settingDataParser = new powerwatch.matrix.com.pwgen2android.sdk.SettingsDataParser();
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.SettingsData loadStoredSettings(java.lang.String deviceID) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceID, "deviceID");
        return this.settingsDataRepository.loadSettings(deviceID);
    }

    public final io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.SettingsData> loadSettingsFromWatch(final java.lang.String deviceID) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceID, "deviceID");
        io.reactivex.Observable observableDefer = io.reactivex.Observable.defer(new java.util.concurrent.Callable() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.providers.-$$Lambda$SettingsDataProvider$fEyjpOnZ-HyumEcPMWYqIQx9Si4
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return powerwatch.matrix.com.pwgen2android.shared.data.providers.SettingsDataProvider.m3165loadSettingsFromWatch$lambda0(this.f$0, deviceID);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableDefer, "defer {\n            return@defer communicator.sendMessage(CommunicationMessage(deviceID, ProtocolMessage(ProtocolPayload(byteArrayOf()),\n                    messageType = ProtocolMessageType.GEN2_SETTINGS_REQUEST),\n                    TechnologyType.BLE_COMMUNICATION,\n                    ProtocolType.GEN2_STANDARD_BASICS))\n                    .toSingleDefault(byteArrayOf())\n                    .toObservable()\n        }");
        io.reactivex.Observable observable = this.communicator.messageOutput().timeout(10L, java.util.concurrent.TimeUnit.SECONDS).filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.providers.-$$Lambda$SettingsDataProvider$2W1bqYZEZihZs4vU-2b38SZAY98
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.data.providers.SettingsDataProvider.m3166loadSettingsFromWatch$lambda1((powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.providers.-$$Lambda$SettingsDataProvider$R6z-TUx1WxflLnpR3LqNjpVwf_c
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.data.providers.SettingsDataProvider.m3167loadSettingsFromWatch$lambda2((powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.providers.-$$Lambda$SettingsDataProvider$16ZSxsVVqwWwCmGnZY-i6RDvXWo
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.data.providers.SettingsDataProvider.m3168loadSettingsFromWatch$lambda3(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.providers.-$$Lambda$SettingsDataProvider$O41941bYPn_IzgH4JYu9RgstWEk
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.data.providers.SettingsDataProvider.m3169loadSettingsFromWatch$lambda4(this.f$0, deviceID, (powerwatch.matrix.com.pwgen2android.sdk.SettingsData) obj);
            }
        }).firstOrError().toObservable();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observable, "communicator.messageOutput()\n                .timeout(10, TimeUnit.SECONDS)\n                .filter { it.protocolType == ProtocolType.GEN2_STANDARD_BASICS }\n                .doOnNext {\n//                    debug(\"Realtime data: ${it.protocolMessage.payload.data.formatToString()}\")\n                }\n                .map { settingDataParser.extractData(it.protocolMessage.payload.data) }\n                .doOnNext {\n                    val old = settingsDataRepository.loadSettings(deviceID)\n                    println(\"settings_data_load_new: ${it?.homeScreen ?: -1}\")\n                    println(\"settings_data_load_old: ${old?.homeScreen ?: -1}\")\n\n                    if (old != it) settingsDataRepository.saveSettings(deviceID, it)\n                }\n                .firstOrError()\n                .toObservable()");
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.SettingsData> observableZip = io.reactivex.Observable.zip(observable, observableDefer, new io.reactivex.functions.BiFunction() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.providers.-$$Lambda$SettingsDataProvider$5916lOi4WvjN9qj4OyEvm3f3Atw
            @Override // io.reactivex.functions.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return powerwatch.matrix.com.pwgen2android.shared.data.providers.SettingsDataProvider.m3170loadSettingsFromWatch$lambda5((powerwatch.matrix.com.pwgen2android.sdk.SettingsData) obj, (byte[]) obj2);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableZip, "zip(responseObservable, requestObservable,\n                BiFunction<SettingsData, ByteArray, SettingsData> { response, _ -> response })");
        return observableZip;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: loadSettingsFromWatch$lambda-0, reason: not valid java name */
    public static final io.reactivex.ObservableSource m3165loadSettingsFromWatch$lambda0(powerwatch.matrix.com.pwgen2android.shared.data.providers.SettingsDataProvider this$0, java.lang.String deviceID) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceID, "$deviceID");
        return this$0.communicator.sendMessage(new powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage(deviceID, new powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage(new powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolPayload(new byte[0]), null, powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolMessageType.GEN2_SETTINGS_REQUEST, 2, null), powerwatch.matrix.com.pwgen2android.sdk.technologies.TechnologyType.BLE_COMMUNICATION, powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType.GEN2_STANDARD_BASICS)).toSingleDefault(new byte[0]).toObservable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: loadSettingsFromWatch$lambda-1, reason: not valid java name */
    public static final boolean m3166loadSettingsFromWatch$lambda1(powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it.getProtocolType() == powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType.GEN2_STANDARD_BASICS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: loadSettingsFromWatch$lambda-3, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.sdk.SettingsData m3168loadSettingsFromWatch$lambda3(powerwatch.matrix.com.pwgen2android.shared.data.providers.SettingsDataProvider this$0, powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.settingDataParser.extractData(it.getProtocolMessage().getPayload().getData());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: loadSettingsFromWatch$lambda-4, reason: not valid java name */
    public static final void m3169loadSettingsFromWatch$lambda4(powerwatch.matrix.com.pwgen2android.shared.data.providers.SettingsDataProvider this$0, java.lang.String deviceID, powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceID, "$deviceID");
        powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsDataLoadSettings = this$0.settingsDataRepository.loadSettings(deviceID);
        java.lang.System.out.println((java.lang.Object) kotlin.jvm.internal.Intrinsics.stringPlus("settings_data_load_new: ", java.lang.Integer.valueOf(settingsData == null ? -1 : settingsData.getHomeScreen())));
        java.lang.System.out.println((java.lang.Object) kotlin.jvm.internal.Intrinsics.stringPlus("settings_data_load_old: ", java.lang.Integer.valueOf(settingsDataLoadSettings != null ? settingsDataLoadSettings.getHomeScreen() : -1)));
        if (kotlin.jvm.internal.Intrinsics.areEqual(settingsDataLoadSettings, settingsData)) {
            return;
        }
        this$0.settingsDataRepository.saveSettings(deviceID, settingsData);
    }

    public final io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.SettingsData> observe() {
        return this.settingsDataRepository.listen();
    }
}
