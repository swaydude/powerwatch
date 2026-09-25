package powerwatch.matrix.com.pwgen2android.main;

/* JADX INFO: compiled from: OtaProcessExecutorImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002BM\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J&\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0014J\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutorImpl;", "Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "communicator", "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;", "downloadExecutor", "Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;", "otaExecutor", "Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;", "syncProcessExecutor", "Lpowerwatch/matrix/com/pwgen2android/main/SyncProcessExecutor;", "deviceRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;", "deviceCommunicationQueuer", "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;", "deviceManager", "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;", "metricsRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;", "fileTransfer", "Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;", "(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;Lpowerwatch/matrix/com/pwgen2android/main/SyncProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;)V", "createOTAOperation", "Lio/reactivex/Observable;", "Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;", "downloadURL", "", "deviceInfo", "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;", "updateInfoData", "Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;", "setupPhasePower", "", "syncOperation", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public class OtaProcessExecutorImpl extends powerwatch.matrix.com.pwgen2android.main.BaseOtaProcessExecutor implements powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    private final powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator;
    private final powerwatch.matrix.com.pwgen2android.sdk.DeviceManager deviceManager;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository deviceRepository;
    private final powerwatch.matrix.com.pwgen2android.main.DownloadExecutor downloadExecutor;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepository metricsRepository;
    private final powerwatch.matrix.com.pwgen2android.main.OTAExecutor otaExecutor;
    private final powerwatch.matrix.com.pwgen2android.main.SyncProcessExecutor syncProcessExecutor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtaProcessExecutorImpl(powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator, powerwatch.matrix.com.pwgen2android.main.DownloadExecutor downloadExecutor, powerwatch.matrix.com.pwgen2android.main.OTAExecutor otaExecutor, powerwatch.matrix.com.pwgen2android.main.SyncProcessExecutor syncProcessExecutor, powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository deviceRepository, powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuer deviceCommunicationQueuer, powerwatch.matrix.com.pwgen2android.sdk.DeviceManager deviceManager, powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepository metricsRepository, powerwatch.matrix.com.pwgen2android.main.FileTransfer fileTransfer) {
        super(communicator, downloadExecutor, otaExecutor, deviceRepository, deviceCommunicationQueuer, deviceManager, metricsRepository, fileTransfer);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(communicator, "communicator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadExecutor, "downloadExecutor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(otaExecutor, "otaExecutor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(syncProcessExecutor, "syncProcessExecutor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceRepository, "deviceRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceCommunicationQueuer, "deviceCommunicationQueuer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceManager, "deviceManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsRepository, "metricsRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileTransfer, "fileTransfer");
        this.communicator = communicator;
        this.downloadExecutor = downloadExecutor;
        this.otaExecutor = otaExecutor;
        this.syncProcessExecutor = syncProcessExecutor;
        this.deviceRepository = deviceRepository;
        this.deviceManager = deviceManager;
        this.metricsRepository = metricsRepository;
    }

    @Override // powerwatch.matrix.com.pwgen2android.main.BaseOtaProcessExecutor
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.main.OTAStatus> createOTAOperation(java.lang.String downloadURL, final powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo, final powerwatch.matrix.com.pwgen2android.main.update.FirmwareDisplayData updateInfoData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadURL, "downloadURL");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateInfoData, "updateInfoData");
        io.reactivex.Observable observableFlatMap = downloadOperation(downloadURL).onErrorResumeNext(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$OtaProcessExecutorImpl$GGFoFLKw5AxahJ3ZjqfQfJNsjGk
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.OtaProcessExecutorImpl.m1618createOTAOperation$lambda0((java.lang.Throwable) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$OtaProcessExecutorImpl$0TNKAK2WMn7pUOY4fB4ZefK9uLE
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.OtaProcessExecutorImpl.m1619createOTAOperation$lambda3(this.f$0, deviceInfo, updateInfoData, (kotlin.Pair) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableFlatMap, "downloadOperation(downloadURL)\n                .onErrorResumeNext(Function {\n                    Observable.error(OTAError.FileDownload(\"File Download failed\"))\n                })\n                // once we sure that download is done, start with OTA phase\n                // OTA PHASE START\n                .flatMap { fileDataOTAStatusPair ->\n                    val otaOperation: Observable<OTAStatus> = Observable.defer {\n                        val transferFileOperation = fileTransfer.transferFile(deviceInfo, updateInfoData, fileDataOTAStatusPair.first)\n                        Observable.concat(\n                                syncOperation().onErrorResumeNext(Function {\n                                    debug(\"Sync throws error during Sync phase, continue with OTA - ${it.javaClass.simpleName} : ${it.message}\")\n                                    Observable.empty<OTAStatus>()\n                                }),\n                                transferFileOperation)\n                    }\n                    deviceCommunicationQueuer.queue(DeviceCommunicationOperation(otaOperation, OperationType.Blocker))\n\n                }");
        return observableFlatMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createOTAOperation$lambda-0, reason: not valid java name */
    public static final io.reactivex.Observable m1618createOTAOperation$lambda0(java.lang.Throwable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return io.reactivex.Observable.error(new powerwatch.matrix.com.pwgen2android.main.OTAError.FileDownload("File Download failed"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createOTAOperation$lambda-3, reason: not valid java name */
    public static final io.reactivex.ObservableSource m1619createOTAOperation$lambda3(final powerwatch.matrix.com.pwgen2android.main.OtaProcessExecutorImpl this$0, final powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo, final powerwatch.matrix.com.pwgen2android.main.update.FirmwareDisplayData updateInfoData, final kotlin.Pair fileDataOTAStatusPair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfo, "$deviceInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateInfoData, "$updateInfoData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileDataOTAStatusPair, "fileDataOTAStatusPair");
        io.reactivex.Observable observableDefer = io.reactivex.Observable.defer(new java.util.concurrent.Callable() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$OtaProcessExecutorImpl$RO8NdxcwP66OzM97Bb8D3jnBqH4
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return powerwatch.matrix.com.pwgen2android.main.OtaProcessExecutorImpl.m1620createOTAOperation$lambda3$lambda2(this.f$0, deviceInfo, updateInfoData, fileDataOTAStatusPair);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableDefer, "defer {\n                        val transferFileOperation = fileTransfer.transferFile(deviceInfo, updateInfoData, fileDataOTAStatusPair.first)\n                        Observable.concat(\n                                syncOperation().onErrorResumeNext(Function {\n                                    debug(\"Sync throws error during Sync phase, continue with OTA - ${it.javaClass.simpleName} : ${it.message}\")\n                                    Observable.empty<OTAStatus>()\n                                }),\n                                transferFileOperation)\n                    }");
        return this$0.getDeviceCommunicationQueuer().queue(new powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationOperation(observableDefer, powerwatch.matrix.com.pwgen2android.sdk.OperationType.Blocker.INSTANCE, null, 4, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createOTAOperation$lambda-3$lambda-2, reason: not valid java name */
    public static final io.reactivex.ObservableSource m1620createOTAOperation$lambda3$lambda2(final powerwatch.matrix.com.pwgen2android.main.OtaProcessExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo, powerwatch.matrix.com.pwgen2android.main.update.FirmwareDisplayData updateInfoData, kotlin.Pair fileDataOTAStatusPair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfo, "$deviceInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateInfoData, "$updateInfoData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileDataOTAStatusPair, "$fileDataOTAStatusPair");
        return io.reactivex.Observable.concat(this$0.syncOperation().onErrorResumeNext(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$OtaProcessExecutorImpl$vmSJ1rwrDIqt2n8I7Eu7AInKMLs
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.OtaProcessExecutorImpl.m1621createOTAOperation$lambda3$lambda2$lambda1(this.f$0, (java.lang.Throwable) obj);
            }
        }), powerwatch.matrix.com.pwgen2android.main.FileTransfer.transferFile$default(this$0.getFileTransfer(), deviceInfo, updateInfoData, (byte[]) fileDataOTAStatusPair.getFirst(), false, 8, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createOTAOperation$lambda-3$lambda-2$lambda-1, reason: not valid java name */
    public static final io.reactivex.Observable m1621createOTAOperation$lambda3$lambda2$lambda1(powerwatch.matrix.com.pwgen2android.main.OtaProcessExecutorImpl this$0, java.lang.Throwable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Sync throws error during Sync phase, continue with OTA - " + ((java.lang.Object) it.getClass().getSimpleName()) + " : " + ((java.lang.Object) it.getMessage()), null, 2, null);
        return io.reactivex.Observable.empty();
    }

    public final io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.main.OTAStatus> syncOperation() {
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.main.OTAStatus> observableDistinctUntilChanged = this.syncProcessExecutor.execute().map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$OtaProcessExecutorImpl$Pmr8i3qLIuenTU72M1KqBGDoUhc
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.OtaProcessExecutorImpl.m1622syncOperation$lambda4(this.f$0, (java.lang.Integer) obj);
            }
        }).distinctUntilChanged();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "syncProcessExecutor.execute()\n                .map { OTAStatus(it, OtaProcessPhase.SYNC, syncProcessExecutor.power) }\n                // need to filter same progress values\n                .distinctUntilChanged()");
        return observableDistinctUntilChanged;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: syncOperation$lambda-4, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.main.OTAStatus m1622syncOperation$lambda4(powerwatch.matrix.com.pwgen2android.main.OtaProcessExecutorImpl this$0, java.lang.Integer it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return new powerwatch.matrix.com.pwgen2android.main.OTAStatus(it.intValue(), powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.SYNC.INSTANCE, this$0.syncProcessExecutor.getPower(), 0, null, 24, null);
    }

    @Override // powerwatch.matrix.com.pwgen2android.main.BaseOtaProcessExecutor
    protected void setupPhasePower() {
        super.setupPhasePower();
        this.syncProcessExecutor.setPower(getPhasePowerConfig().getSyncExecutorPower());
    }
}
