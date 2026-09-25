package powerwatch.matrix.com.pwgen2android.main;

/* JADX INFO: compiled from: GPSUpdateProcessExecutor.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017¢\u0006\u0002\u0010\u0018J&\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J\"\u0010&\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u001f0'0\u001e2\u0006\u0010 \u001a\u00020!H\u0014J\u001e\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010,\u001a\u00020#2\b\b\u0002\u0010-\u001a\u00020+J \u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020!2\u0006\u00101\u001a\u00020!2\u0006\u00102\u001a\u000203H\u0014J\u0018\u00104\u001a\u00020/2\u0006\u00100\u001a\u00020!2\u0006\u00101\u001a\u00020!H\u0014J\u0018\u00105\u001a\u00020/2\u0006\u00100\u001a\u00020!2\u0006\u00101\u001a\u00020!H\u0014R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\u001aX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u00066"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;", "Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;", "communicator", "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;", "downloadExecutor", "Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;", "otaExecutor", "Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;", "deviceRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;", "deviceCommunicationQueuer", "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;", "deviceManager", "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;", "metricsRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;", "fileTransfer", "Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;", "gpsDownloadExecutor", "Lpowerwatch/matrix/com/pwgen2android/main/GPSDownloadExecutor;", "context", "Landroid/content/Context;", "agpsRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepository;", "(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;Lpowerwatch/matrix/com/pwgen2android/main/GPSDownloadExecutor;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepository;)V", "phasePowerConfig", "Lpowerwatch/matrix/com/pwgen2android/main/PhasePowerConfig;", "getPhasePowerConfig", "()Lpowerwatch/matrix/com/pwgen2android/main/PhasePowerConfig;", "createOTAOperation", "Lio/reactivex/Observable;", "Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;", "downloadURL", "", "deviceInfo", "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;", "updateInfoData", "Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;", "downloadOperation", "Lkotlin/Pair;", "", "isUpdateNeeded", "Lio/reactivex/Single;", "", "deviceInfoToCheck", "shouldRefresh", "logOTAError", "", "firmwareVersionFrom", "firmwareVersionTo", "it", "", "logOTAStart", "logOTASuccess", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class GPSUpdateProcessExecutor extends powerwatch.matrix.com.pwgen2android.main.BaseOtaProcessExecutor {
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.agps.AGPSRepository agpsRepository;
    private final powerwatch.matrix.com.pwgen2android.sdk.DeviceManager deviceManager;
    private final powerwatch.matrix.com.pwgen2android.main.GPSDownloadExecutor gpsDownloadExecutor;
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

    public /* synthetic */ GPSUpdateProcessExecutor(powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator, powerwatch.matrix.com.pwgen2android.main.DownloadExecutor downloadExecutor, powerwatch.matrix.com.pwgen2android.main.OTAExecutor oTAExecutor, powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository deviceRepository, powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuer deviceCommunicationQueuer, powerwatch.matrix.com.pwgen2android.sdk.DeviceManager deviceManager, powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepository metricsRepository, powerwatch.matrix.com.pwgen2android.main.FileTransfer fileTransfer, powerwatch.matrix.com.pwgen2android.main.GPSDownloadExecutor gPSDownloadExecutor, android.content.Context context, powerwatch.matrix.com.pwgen2android.shared.data.repositories.agps.AGPSRepository aGPSRepository, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(communicator, downloadExecutor, oTAExecutor, deviceRepository, deviceCommunicationQueuer, deviceManager, metricsRepository, fileTransfer, gPSDownloadExecutor, context, (i & 1024) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.data.repositories.agps.AGPSRepositoryImpl(gPSDownloadExecutor, context, null, 4, null) : aGPSRepository);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GPSUpdateProcessExecutor(powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator, powerwatch.matrix.com.pwgen2android.main.DownloadExecutor downloadExecutor, powerwatch.matrix.com.pwgen2android.main.OTAExecutor otaExecutor, powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository deviceRepository, powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuer deviceCommunicationQueuer, powerwatch.matrix.com.pwgen2android.sdk.DeviceManager deviceManager, powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepository metricsRepository, powerwatch.matrix.com.pwgen2android.main.FileTransfer fileTransfer, powerwatch.matrix.com.pwgen2android.main.GPSDownloadExecutor gpsDownloadExecutor, android.content.Context context, powerwatch.matrix.com.pwgen2android.shared.data.repositories.agps.AGPSRepository agpsRepository) {
        super(communicator, downloadExecutor, otaExecutor, deviceRepository, deviceCommunicationQueuer, deviceManager, metricsRepository, fileTransfer);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(communicator, "communicator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadExecutor, "downloadExecutor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(otaExecutor, "otaExecutor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceRepository, "deviceRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceCommunicationQueuer, "deviceCommunicationQueuer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceManager, "deviceManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsRepository, "metricsRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileTransfer, "fileTransfer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gpsDownloadExecutor, "gpsDownloadExecutor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agpsRepository, "agpsRepository");
        this.deviceManager = deviceManager;
        this.gpsDownloadExecutor = gpsDownloadExecutor;
        this.agpsRepository = agpsRepository;
        this.phasePowerConfig = new powerwatch.matrix.com.pwgen2android.main.PhasePowerConfig(0.2f, 0.2f, 0.6f);
    }

    @Override // powerwatch.matrix.com.pwgen2android.main.BaseOtaProcessExecutor
    protected powerwatch.matrix.com.pwgen2android.main.PhasePowerConfig getPhasePowerConfig() {
        return this.phasePowerConfig;
    }

    @Override // powerwatch.matrix.com.pwgen2android.main.BaseOtaProcessExecutor
    protected io.reactivex.Observable<kotlin.Pair<byte[], powerwatch.matrix.com.pwgen2android.main.OTAStatus>> downloadOperation(java.lang.String downloadURL) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadURL, "downloadURL");
        io.reactivex.Observable<kotlin.Pair<byte[], powerwatch.matrix.com.pwgen2android.main.OTAStatus>> map = powerwatch.matrix.com.pwgen2android.shared.data.repositories.GetOneRepository.DefaultImpls.getOne$default(this.agpsRepository, downloadURL, false, 2, null).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$GPSUpdateProcessExecutor$YRfpD2xJ6FOhPaWR9aZfhOqWv44
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.GPSUpdateProcessExecutor.m1570downloadOperation$lambda0(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.data.repositories.agps.GPSFile) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(map, "agpsRepository.getOne(downloadURL)\n                .map { downloadResult ->\n                    Pair(downloadResult.content, OTAStatus(phaseProgress = 100,\n                            phase = OtaProcessPhase.DOWNLOAD_FINISHED,\n                            phaseWeight = gpsDownloadExecutor.power))\n                }");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: downloadOperation$lambda-0, reason: not valid java name */
    public static final kotlin.Pair m1570downloadOperation$lambda0(powerwatch.matrix.com.pwgen2android.main.GPSUpdateProcessExecutor this$0, powerwatch.matrix.com.pwgen2android.shared.data.repositories.agps.GPSFile downloadResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadResult, "downloadResult");
        return new kotlin.Pair(downloadResult.getContent(), new powerwatch.matrix.com.pwgen2android.main.OTAStatus(100, powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.DOWNLOAD_FINISHED.INSTANCE, this$0.gpsDownloadExecutor.getPower(), 0, null, 24, null));
    }

    @Override // powerwatch.matrix.com.pwgen2android.main.BaseOtaProcessExecutor
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.main.OTAStatus> createOTAOperation(java.lang.String downloadURL, final powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo, final powerwatch.matrix.com.pwgen2android.main.update.FirmwareDisplayData updateInfoData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadURL, "downloadURL");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateInfoData, "updateInfoData");
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.main.OTAStatus> observableFlatMap = io.reactivex.Observable.just(deviceInfo).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$GPSUpdateProcessExecutor$ZhqDOcLoGhMTgtzbzSeoN96NgeQ
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.GPSUpdateProcessExecutor.m1565createOTAOperation$lambda5(this.f$0, deviceInfo, updateInfoData, (powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableFlatMap, "just(deviceInfo)\n                .flatMap {\n\n                    downloadOperation()\n                            .flatMap { data ->\n                                val otaOperation = Observable.defer {\n                                    fileTransfer.transferFile(deviceInfo, updateInfoData, data.first, false)\n                                            .doOnNext {\n                                                if (it.phase == OtaProcessPhase.COMPLETE) {\n                                                    agpsRepository.storeLastUpdateTimestamp()\n                                                }\n                                            }\n                                }\n                                deviceCommunicationQueuer.queue(DeviceCommunicationOperation(otaOperation, OperationType.Blocker))\n                            }\n                            .doOnNext {\n                                println(\"AGPS - File transfer emitting from queue ${it.phase}, ${it.phaseProgress}\")\n                            }\n                }");
        return observableFlatMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createOTAOperation$lambda-5, reason: not valid java name */
    public static final io.reactivex.ObservableSource m1565createOTAOperation$lambda5(final powerwatch.matrix.com.pwgen2android.main.GPSUpdateProcessExecutor this$0, final powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo, final powerwatch.matrix.com.pwgen2android.main.update.FirmwareDisplayData updateInfoData, powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfo, "$deviceInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateInfoData, "$updateInfoData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.main.BaseOtaProcessExecutor.downloadOperation$default(this$0, null, 1, null).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$GPSUpdateProcessExecutor$DmqpN2SBtlw3mM3h6WFwlY-w0B8
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.GPSUpdateProcessExecutor.m1566createOTAOperation$lambda5$lambda3(this.f$0, deviceInfo, updateInfoData, (kotlin.Pair) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$GPSUpdateProcessExecutor$Yl7XASNiZCRdyUOETv4ht22zuEw
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.GPSUpdateProcessExecutor.m1569createOTAOperation$lambda5$lambda4((powerwatch.matrix.com.pwgen2android.main.OTAStatus) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createOTAOperation$lambda-5$lambda-3, reason: not valid java name */
    public static final io.reactivex.ObservableSource m1566createOTAOperation$lambda5$lambda3(final powerwatch.matrix.com.pwgen2android.main.GPSUpdateProcessExecutor this$0, final powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo, final powerwatch.matrix.com.pwgen2android.main.update.FirmwareDisplayData updateInfoData, final kotlin.Pair data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfo, "$deviceInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateInfoData, "$updateInfoData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        io.reactivex.Observable observableDefer = io.reactivex.Observable.defer(new java.util.concurrent.Callable() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$GPSUpdateProcessExecutor$aBjVFxSMtCSdrgx23V0yYecJcsg
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return powerwatch.matrix.com.pwgen2android.main.GPSUpdateProcessExecutor.m1567createOTAOperation$lambda5$lambda3$lambda2(this.f$0, deviceInfo, updateInfoData, data);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableDefer, "defer {\n                                    fileTransfer.transferFile(deviceInfo, updateInfoData, data.first, false)\n                                            .doOnNext {\n                                                if (it.phase == OtaProcessPhase.COMPLETE) {\n                                                    agpsRepository.storeLastUpdateTimestamp()\n                                                }\n                                            }\n                                }");
        return this$0.getDeviceCommunicationQueuer().queue(new powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationOperation(observableDefer, powerwatch.matrix.com.pwgen2android.sdk.OperationType.Blocker.INSTANCE, null, 4, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createOTAOperation$lambda-5$lambda-3$lambda-2, reason: not valid java name */
    public static final io.reactivex.ObservableSource m1567createOTAOperation$lambda5$lambda3$lambda2(final powerwatch.matrix.com.pwgen2android.main.GPSUpdateProcessExecutor this$0, powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo, powerwatch.matrix.com.pwgen2android.main.update.FirmwareDisplayData updateInfoData, kotlin.Pair data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfo, "$deviceInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateInfoData, "$updateInfoData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "$data");
        return this$0.getFileTransfer().transferFile(deviceInfo, updateInfoData, (byte[]) data.getFirst(), false).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$GPSUpdateProcessExecutor$8nONN-tlwjbU7T5joxuhPqG42fU
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.GPSUpdateProcessExecutor.m1568createOTAOperation$lambda5$lambda3$lambda2$lambda1(this.f$0, (powerwatch.matrix.com.pwgen2android.main.OTAStatus) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createOTAOperation$lambda-5$lambda-3$lambda-2$lambda-1, reason: not valid java name */
    public static final void m1568createOTAOperation$lambda5$lambda3$lambda2$lambda1(powerwatch.matrix.com.pwgen2android.main.GPSUpdateProcessExecutor this$0, powerwatch.matrix.com.pwgen2android.main.OTAStatus oTAStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (kotlin.jvm.internal.Intrinsics.areEqual(oTAStatus.getPhase(), powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.COMPLETE.INSTANCE)) {
            this$0.agpsRepository.storeLastUpdateTimestamp();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createOTAOperation$lambda-5$lambda-4, reason: not valid java name */
    public static final void m1569createOTAOperation$lambda5$lambda4(powerwatch.matrix.com.pwgen2android.main.OTAStatus oTAStatus) {
        java.lang.System.out.println((java.lang.Object) ("AGPS - File transfer emitting from queue " + oTAStatus.getPhase() + ", " + oTAStatus.getPhaseProgress()));
    }

    public static /* synthetic */ io.reactivex.Single isUpdateNeeded$default(powerwatch.matrix.com.pwgen2android.main.GPSUpdateProcessExecutor gPSUpdateProcessExecutor, powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return gPSUpdateProcessExecutor.isUpdateNeeded(deviceInfo, z);
    }

    public final io.reactivex.Single<java.lang.Boolean> isUpdateNeeded(powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfoToCheck, boolean shouldRefresh) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfoToCheck, "deviceInfoToCheck");
        io.reactivex.Single<java.lang.Boolean> map = (!shouldRefresh ? io.reactivex.Single.just(deviceInfoToCheck) : powerwatch.matrix.com.pwgen2android.sdk.DeviceManager.DefaultImpls.readDeviceInfo$default(this.deviceManager, deviceInfoToCheck, null, 2, null)).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$GPSUpdateProcessExecutor$jRdN9SsX0CMqrsfgLZtyvJubwlY
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.GPSUpdateProcessExecutor.m1571isUpdateNeeded$lambda6((powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(map, "if (!shouldRefresh) Single.just(deviceInfoToCheck) else deviceManager.readDeviceInfo(deviceInfoToCheck))\n                .map {\n                    if (it.time == -1) return@map false\n                    val currentTime: Long = System.currentTimeMillis()\n                    val watchTime: Long = it.time * 1000L\n                    currentTime > watchTime\n                }");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: isUpdateNeeded$lambda-6, reason: not valid java name */
    public static final java.lang.Boolean m1571isUpdateNeeded$lambda6(powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        if (it.getTime() == -1) {
            return false;
        }
        return java.lang.Boolean.valueOf(java.lang.System.currentTimeMillis() > ((long) it.getTime()) * 1000);
    }
}
