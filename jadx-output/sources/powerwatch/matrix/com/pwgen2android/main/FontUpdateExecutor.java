package powerwatch.matrix.com.pwgen2android.main;

/* JADX INFO: compiled from: FontUpdateExecutor.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J&\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J \u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020%H\u0014J\u0018\u0010&\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u001bH\u0014J\u0018\u0010'\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u001bH\u0014R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u0014X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006("}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateExecutor;", "Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;", "communicator", "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;", "downloadExecutor", "Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;", "otaExecutor", "Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;", "deviceRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;", "deviceCommunicationQueuer", "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;", "deviceManager", "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;", "metricsRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;", "fileTransfer", "Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;", "(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;)V", "phasePowerConfig", "Lpowerwatch/matrix/com/pwgen2android/main/PhasePowerConfig;", "getPhasePowerConfig", "()Lpowerwatch/matrix/com/pwgen2android/main/PhasePowerConfig;", "createOTAOperation", "Lio/reactivex/Observable;", "Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;", "downloadURL", "", "deviceInfo", "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;", "updateInfoData", "Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;", "logOTAError", "", "firmwareVersionFrom", "firmwareVersionTo", "it", "", "logOTAStart", "logOTASuccess", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class FontUpdateExecutor extends powerwatch.matrix.com.pwgen2android.main.BaseOtaProcessExecutor {
    private final powerwatch.matrix.com.pwgen2android.sdk.DeviceManager deviceManager;
    private final powerwatch.matrix.com.pwgen2android.main.PhasePowerConfig phasePowerConfig;

    @Override // powerwatch.matrix.com.pwgen2android.main.BaseOtaProcessExecutor
    protected void logOTAError(java.lang.String firmwareVersionFrom, java.lang.String firmwareVersionTo, java.lang.Throwable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firmwareVersionFrom, "firmwareVersionFrom");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firmwareVersionTo, "firmwareVersionTo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
    }

    @Override // powerwatch.matrix.com.pwgen2android.main.BaseOtaProcessExecutor
    protected void logOTAStart(java.lang.String firmwareVersionFrom, java.lang.String firmwareVersionTo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firmwareVersionFrom, "firmwareVersionFrom");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firmwareVersionTo, "firmwareVersionTo");
    }

    @Override // powerwatch.matrix.com.pwgen2android.main.BaseOtaProcessExecutor
    protected void logOTASuccess(java.lang.String firmwareVersionFrom, java.lang.String firmwareVersionTo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firmwareVersionFrom, "firmwareVersionFrom");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firmwareVersionTo, "firmwareVersionTo");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontUpdateExecutor(powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator, powerwatch.matrix.com.pwgen2android.main.DownloadExecutor downloadExecutor, powerwatch.matrix.com.pwgen2android.main.OTAExecutor otaExecutor, powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository deviceRepository, powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuer deviceCommunicationQueuer, powerwatch.matrix.com.pwgen2android.sdk.DeviceManager deviceManager, powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepository metricsRepository, powerwatch.matrix.com.pwgen2android.main.FileTransfer fileTransfer) {
        super(communicator, downloadExecutor, otaExecutor, deviceRepository, deviceCommunicationQueuer, deviceManager, metricsRepository, fileTransfer);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(communicator, "communicator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadExecutor, "downloadExecutor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(otaExecutor, "otaExecutor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceRepository, "deviceRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceCommunicationQueuer, "deviceCommunicationQueuer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceManager, "deviceManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsRepository, "metricsRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileTransfer, "fileTransfer");
        this.deviceManager = deviceManager;
        this.phasePowerConfig = new powerwatch.matrix.com.pwgen2android.main.PhasePowerConfig(0.2f, 0.2f, 0.6f);
    }

    @Override // powerwatch.matrix.com.pwgen2android.main.BaseOtaProcessExecutor
    protected powerwatch.matrix.com.pwgen2android.main.PhasePowerConfig getPhasePowerConfig() {
        return this.phasePowerConfig;
    }

    @Override // powerwatch.matrix.com.pwgen2android.main.BaseOtaProcessExecutor
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.main.OTAStatus> createOTAOperation(final java.lang.String downloadURL, final powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo, final powerwatch.matrix.com.pwgen2android.main.update.FirmwareDisplayData updateInfoData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadURL, "downloadURL");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateInfoData, "updateInfoData");
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.main.OTAStatus> observableFlatMap = io.reactivex.Observable.just(deviceInfo).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$FontUpdateExecutor$OoMM7JcssnOCRCxkECf9nQYrTJg
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.FontUpdateExecutor.m1560createOTAOperation$lambda3(this.f$0, downloadURL, deviceInfo, updateInfoData, (powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableFlatMap, "just(deviceInfo)\n                .flatMap {\n\n                    downloadOperation(downloadURL)\n                            .flatMap { data ->\n                                val otaOperation = Observable.defer {\n                                    fileTransfer.transferFile(deviceInfo, updateInfoData, data.first, false)\n                                }\n                                deviceCommunicationQueuer.queue(DeviceCommunicationOperation(otaOperation, OperationType.Blocker))\n                            }\n                            .doOnNext {\n                                println(\"Font update - File transfer emitting from queue ${it.phase}, ${it.phaseProgress}\")\n                            }\n                }");
        return observableFlatMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createOTAOperation$lambda-3, reason: not valid java name */
    public static final io.reactivex.ObservableSource m1560createOTAOperation$lambda3(final powerwatch.matrix.com.pwgen2android.main.FontUpdateExecutor this$0, java.lang.String downloadURL, final powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo, final powerwatch.matrix.com.pwgen2android.main.update.FirmwareDisplayData updateInfoData, powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadURL, "$downloadURL");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfo, "$deviceInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateInfoData, "$updateInfoData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.downloadOperation(downloadURL).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$FontUpdateExecutor$_znXg3ukv8vTiP9gLAxNiG5srQA
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.FontUpdateExecutor.m1561createOTAOperation$lambda3$lambda1(this.f$0, deviceInfo, updateInfoData, (kotlin.Pair) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$FontUpdateExecutor$-ABwGJQLePNq1VSp5szJfFBqjeg
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.FontUpdateExecutor.m1563createOTAOperation$lambda3$lambda2((powerwatch.matrix.com.pwgen2android.main.OTAStatus) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createOTAOperation$lambda-3$lambda-1, reason: not valid java name */
    public static final io.reactivex.ObservableSource m1561createOTAOperation$lambda3$lambda1(final powerwatch.matrix.com.pwgen2android.main.FontUpdateExecutor this$0, final powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo, final powerwatch.matrix.com.pwgen2android.main.update.FirmwareDisplayData updateInfoData, final kotlin.Pair data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfo, "$deviceInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateInfoData, "$updateInfoData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        io.reactivex.Observable observableDefer = io.reactivex.Observable.defer(new java.util.concurrent.Callable() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$FontUpdateExecutor$iJKCeKWM26DNK4sxPxnAUrDuQfg
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return powerwatch.matrix.com.pwgen2android.main.FontUpdateExecutor.m1562createOTAOperation$lambda3$lambda1$lambda0(this.f$0, deviceInfo, updateInfoData, data);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableDefer, "defer {\n                                    fileTransfer.transferFile(deviceInfo, updateInfoData, data.first, false)\n                                }");
        return this$0.getDeviceCommunicationQueuer().queue(new powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationOperation(observableDefer, powerwatch.matrix.com.pwgen2android.sdk.OperationType.Blocker.INSTANCE, null, 4, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createOTAOperation$lambda-3$lambda-1$lambda-0, reason: not valid java name */
    public static final io.reactivex.ObservableSource m1562createOTAOperation$lambda3$lambda1$lambda0(powerwatch.matrix.com.pwgen2android.main.FontUpdateExecutor this$0, powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo, powerwatch.matrix.com.pwgen2android.main.update.FirmwareDisplayData updateInfoData, kotlin.Pair data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfo, "$deviceInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateInfoData, "$updateInfoData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "$data");
        return this$0.getFileTransfer().transferFile(deviceInfo, updateInfoData, (byte[]) data.getFirst(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createOTAOperation$lambda-3$lambda-2, reason: not valid java name */
    public static final void m1563createOTAOperation$lambda3$lambda2(powerwatch.matrix.com.pwgen2android.main.OTAStatus oTAStatus) {
        java.lang.System.out.println((java.lang.Object) ("Font update - File transfer emitting from queue " + oTAStatus.getPhase() + ", " + oTAStatus.getPhaseProgress()));
    }
}
