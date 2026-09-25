package powerwatch.matrix.com.pwgen2android.main;

/* JADX INFO: compiled from: OtaProcessExecutorImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\t\b&\u0018\u00002\u00020\u00012\u00020\u0002BE\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J&\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00150$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H&J$\u0010+\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00150,0$2\b\b\u0002\u0010%\u001a\u00020&H\u0014J\b\u0010.\u001a\u00020/H\u0016J \u00100\u001a\u0002012\u0006\u00102\u001a\u00020&2\u0006\u00103\u001a\u00020&2\u0006\u00104\u001a\u000205H\u0014J\u0018\u00106\u001a\u0002012\u0006\u00102\u001a\u00020&2\u0006\u00103\u001a\u00020&H\u0014J\u0018\u00107\u001a\u0002012\u0006\u00102\u001a\u00020&2\u0006\u00103\u001a\u00020&H\u0014J\u0016\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u001e*\u0004\u0018\u00010\u00150\u00150\u001dH\u0016J\b\u00108\u001a\u000201H\u0016J\b\u00109\u001a\u000201H\u0014J(\u0010:\u001a\u0002012\u0006\u0010%\u001a\u00020&2\u0006\u0010)\u001a\u00020*2\u0006\u0010;\u001a\u00020&2\u0006\u0010<\u001a\u00020/H\u0016J\b\u0010=\u001a\u000201H\u0016R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u0012X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u001e*\u0004\u0018\u00010\u00150\u00150\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\u00020 X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u0006>"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;", "Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutor;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "communicator", "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;", "downloadExecutor", "Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;", "otaExecutor", "Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;", "deviceRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;", "deviceCommunicationQueuer", "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;", "deviceManager", "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;", "metricsRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;", "fileTransfer", "Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;", "(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;)V", "DEFAULT_OTA_STATE", "Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;", "getDeviceCommunicationQueuer", "()Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;", "getFileTransfer", "()Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;", "otaDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "otaOutput", "Lio/reactivex/subjects/BehaviorSubject;", "kotlin.jvm.PlatformType", "phasePowerConfig", "Lpowerwatch/matrix/com/pwgen2android/main/PhasePowerConfig;", "getPhasePowerConfig", "()Lpowerwatch/matrix/com/pwgen2android/main/PhasePowerConfig;", "createOTAOperation", "Lio/reactivex/Observable;", "downloadURL", "", "deviceInfo", "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;", "updateInfoData", "Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;", "downloadOperation", "Lkotlin/Pair;", "", "isOtaInProgress", "", "logOTAError", "", "firmwareVersionFrom", "firmwareVersionTo", "it", "", "logOTAStart", "logOTASuccess", "resetExecutorState", "setupPhasePower", "startOTA", "deviceID", "expectVersionUpgrade", "stopOTA", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class BaseOtaProcessExecutor implements powerwatch.matrix.com.pwgen2android.main.OtaProcessExecutor, powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    private final powerwatch.matrix.com.pwgen2android.main.OTAStatus DEFAULT_OTA_STATE;
    private final powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator;
    private final powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuer deviceCommunicationQueuer;
    private final powerwatch.matrix.com.pwgen2android.sdk.DeviceManager deviceManager;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository deviceRepository;
    private final powerwatch.matrix.com.pwgen2android.main.DownloadExecutor downloadExecutor;
    private final powerwatch.matrix.com.pwgen2android.main.FileTransfer fileTransfer;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepository metricsRepository;
    private final io.reactivex.disposables.CompositeDisposable otaDisposable;
    private final powerwatch.matrix.com.pwgen2android.main.OTAExecutor otaExecutor;
    private final io.reactivex.subjects.BehaviorSubject<powerwatch.matrix.com.pwgen2android.main.OTAStatus> otaOutput;
    private final powerwatch.matrix.com.pwgen2android.main.PhasePowerConfig phasePowerConfig;

    public abstract io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.main.OTAStatus> createOTAOperation(java.lang.String downloadURL, powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo, powerwatch.matrix.com.pwgen2android.main.update.FirmwareDisplayData updateInfoData);

    public BaseOtaProcessExecutor(powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator, powerwatch.matrix.com.pwgen2android.main.DownloadExecutor downloadExecutor, powerwatch.matrix.com.pwgen2android.main.OTAExecutor otaExecutor, powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository deviceRepository, powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuer deviceCommunicationQueuer, powerwatch.matrix.com.pwgen2android.sdk.DeviceManager deviceManager, powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepository metricsRepository, powerwatch.matrix.com.pwgen2android.main.FileTransfer fileTransfer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(communicator, "communicator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadExecutor, "downloadExecutor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(otaExecutor, "otaExecutor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceRepository, "deviceRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceCommunicationQueuer, "deviceCommunicationQueuer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceManager, "deviceManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsRepository, "metricsRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileTransfer, "fileTransfer");
        this.communicator = communicator;
        this.downloadExecutor = downloadExecutor;
        this.otaExecutor = otaExecutor;
        this.deviceRepository = deviceRepository;
        this.deviceCommunicationQueuer = deviceCommunicationQueuer;
        this.deviceManager = deviceManager;
        this.metricsRepository = metricsRepository;
        this.fileTransfer = fileTransfer;
        powerwatch.matrix.com.pwgen2android.main.OTAStatus oTAStatus = new powerwatch.matrix.com.pwgen2android.main.OTAStatus(0, powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.INITIAL.INSTANCE, 0.0f, 0, null, 28, null);
        this.DEFAULT_OTA_STATE = oTAStatus;
        this.otaDisposable = new io.reactivex.disposables.CompositeDisposable();
        io.reactivex.subjects.BehaviorSubject<powerwatch.matrix.com.pwgen2android.main.OTAStatus> behaviorSubjectCreateDefault = io.reactivex.subjects.BehaviorSubject.createDefault(oTAStatus);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreateDefault, "createDefault(DEFAULT_OTA_STATE)");
        this.otaOutput = behaviorSubjectCreateDefault;
        this.phasePowerConfig = new powerwatch.matrix.com.pwgen2android.main.PhasePowerConfig(0.05f, 0.15f, 0.8f);
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    protected final powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuer getDeviceCommunicationQueuer() {
        return this.deviceCommunicationQueuer;
    }

    protected final powerwatch.matrix.com.pwgen2android.main.FileTransfer getFileTransfer() {
        return this.fileTransfer;
    }

    protected powerwatch.matrix.com.pwgen2android.main.PhasePowerConfig getPhasePowerConfig() {
        return this.phasePowerConfig;
    }

    @Override // powerwatch.matrix.com.pwgen2android.main.OtaProcessExecutor
    public boolean isOtaInProgress() {
        powerwatch.matrix.com.pwgen2android.main.OTAStatus value = this.otaOutput.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNull(value);
        powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase phase = value.getPhase();
        return (kotlin.jvm.internal.Intrinsics.areEqual(phase, powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.INITIAL.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(phase, powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.COMPLETE.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(phase, powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.ERROR.INSTANCE)) ? false : true;
    }

    @Override // powerwatch.matrix.com.pwgen2android.main.OtaProcessExecutor
    public void stopOTA() {
        resetExecutorState();
        this.otaDisposable.clear();
    }

    @Override // powerwatch.matrix.com.pwgen2android.main.OtaProcessExecutor
    public void resetExecutorState() {
        this.otaOutput.onNext(this.DEFAULT_OTA_STATE);
    }

    @Override // powerwatch.matrix.com.pwgen2android.main.OtaProcessExecutor
    public io.reactivex.subjects.BehaviorSubject<powerwatch.matrix.com.pwgen2android.main.OTAStatus> otaOutput() {
        return this.otaOutput;
    }

    public static /* synthetic */ io.reactivex.Observable downloadOperation$default(powerwatch.matrix.com.pwgen2android.main.BaseOtaProcessExecutor baseOtaProcessExecutor, java.lang.String str, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: downloadOperation");
        }
        if ((i & 1) != 0) {
            str = "";
        }
        return baseOtaProcessExecutor.downloadOperation(str);
    }

    protected io.reactivex.Observable<kotlin.Pair<byte[], powerwatch.matrix.com.pwgen2android.main.OTAStatus>> downloadOperation(java.lang.String downloadURL) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadURL, "downloadURL");
        io.reactivex.Observable map = this.downloadExecutor.execute(downloadURL).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$BaseOtaProcessExecutor$HH2LMlv1s_ipRVQJEE5mZFSEpvw
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.BaseOtaProcessExecutor.m1513downloadOperation$lambda0(this.f$0, (kotlin.Pair) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(map, "downloadExecutor.execute(downloadURL)\n                .map { downloadResult ->\n                    Pair(downloadResult.second, OTAStatus(phaseProgress = downloadResult.first,\n                            phase = OtaProcessPhase.DOWNLOAD_FINISHED,\n                            phaseWeight = downloadExecutor.power))\n                }");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: downloadOperation$lambda-0, reason: not valid java name */
    public static final kotlin.Pair m1513downloadOperation$lambda0(powerwatch.matrix.com.pwgen2android.main.BaseOtaProcessExecutor this$0, kotlin.Pair downloadResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadResult, "downloadResult");
        return new kotlin.Pair(downloadResult.getSecond(), new powerwatch.matrix.com.pwgen2android.main.OTAStatus(((java.lang.Number) downloadResult.getFirst()).intValue(), powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.DOWNLOAD_FINISHED.INSTANCE, this$0.downloadExecutor.getPower(), 0, null, 24, null));
    }

    protected void setupPhasePower() {
        this.downloadExecutor.setPower(getPhasePowerConfig().getDownloadExecutorPower());
        this.otaExecutor.setPower(getPhasePowerConfig().getOtaExecutorPower());
    }

    @Override // powerwatch.matrix.com.pwgen2android.main.OtaProcessExecutor
    public void startOTA(final java.lang.String downloadURL, final powerwatch.matrix.com.pwgen2android.main.update.FirmwareDisplayData updateInfoData, java.lang.String deviceID, final boolean expectVersionUpgrade) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadURL, "downloadURL");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateInfoData, "updateInfoData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceID, "deviceID");
        stopOTA();
        setupPhasePower();
        this.otaDisposable.add(io.reactivex.Observable.concat(io.reactivex.Observable.just(new powerwatch.matrix.com.pwgen2android.main.OTAStatus(0, powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.CONNECTING.INSTANCE, 0.0f, 0, null, 29, null)).doOnComplete(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$BaseOtaProcessExecutor$MJ1meOSsdVIEJAGmR_B-rcXloaw
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.main.BaseOtaProcessExecutor.m1520startOTA$lambda1(this.f$0, updateInfoData);
            }
        }), this.deviceManager.connect(true).take(1L).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$BaseOtaProcessExecutor$CximnGhyr_PHqfFWhF0CW-hKdhE
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.BaseOtaProcessExecutor.m1524startOTA$lambda2(this.f$0, downloadURL, updateInfoData, (powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) obj);
            }
        })).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$BaseOtaProcessExecutor$TpZ-Vq17Fb5U-bRxU6wHSwXZYOc
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.BaseOtaProcessExecutor.m1525startOTA$lambda4(expectVersionUpgrade, this, updateInfoData, (powerwatch.matrix.com.pwgen2android.main.OTAStatus) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$BaseOtaProcessExecutor$aCf5EiqSK7s4clTVGSHj2bTiNQs
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.BaseOtaProcessExecutor.m1527startOTA$lambda5((powerwatch.matrix.com.pwgen2android.main.OTAStatus) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$BaseOtaProcessExecutor$4V3sA_Ak10qTIQhEZsVfZfHbFVE
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.BaseOtaProcessExecutor.m1528startOTA$lambda6((kotlin.Pair) obj);
            }
        }).scan(new io.reactivex.functions.BiFunction() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$BaseOtaProcessExecutor$pLXFz8sF8G5eLT6l2PKzRADN6rw
            @Override // io.reactivex.functions.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return powerwatch.matrix.com.pwgen2android.main.BaseOtaProcessExecutor.m1529startOTA$lambda7((kotlin.Pair) obj, (kotlin.Pair) obj2);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$BaseOtaProcessExecutor$tFKQoymbjRS7CrByhy6Z6xDxUNw
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.BaseOtaProcessExecutor.m1530startOTA$lambda8((kotlin.Pair) obj);
            }
        }).filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$BaseOtaProcessExecutor$YyqX1LCUSuN-0dugqSJRXH73YeU
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.BaseOtaProcessExecutor.m1531startOTA$lambda9((powerwatch.matrix.com.pwgen2android.main.OTAStatus) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$BaseOtaProcessExecutor$bvA2s0KRGByBW8UcKXbpOe_xgWo
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.BaseOtaProcessExecutor.m1521startOTA$lambda10((powerwatch.matrix.com.pwgen2android.main.OTAStatus) obj);
            }
        }).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$BaseOtaProcessExecutor$Kp-CergAR-Gmz3R88FXnKFXzFm8
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.BaseOtaProcessExecutor.m1522startOTA$lambda11(this.f$0, updateInfoData, (powerwatch.matrix.com.pwgen2android.main.OTAStatus) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$BaseOtaProcessExecutor$7p-ejOKnHC9JBA4MzOJimBNN5CQ
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.BaseOtaProcessExecutor.m1523startOTA$lambda12(this.f$0, updateInfoData, (java.lang.Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startOTA$lambda-1, reason: not valid java name */
    public static final void m1520startOTA$lambda1(powerwatch.matrix.com.pwgen2android.main.BaseOtaProcessExecutor this$0, powerwatch.matrix.com.pwgen2android.main.update.FirmwareDisplayData updateInfoData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateInfoData, "$updateInfoData");
        this$0.logOTAStart(updateInfoData.getInstalledVersion(), updateInfoData.getVersion());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startOTA$lambda-2, reason: not valid java name */
    public static final io.reactivex.ObservableSource m1524startOTA$lambda2(powerwatch.matrix.com.pwgen2android.main.BaseOtaProcessExecutor this$0, java.lang.String downloadURL, powerwatch.matrix.com.pwgen2android.main.update.FirmwareDisplayData updateInfoData, powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadURL, "$downloadURL");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateInfoData, "$updateInfoData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        if (deviceInfo.isConnected()) {
            return io.reactivex.Observable.concat(io.reactivex.Observable.just(new powerwatch.matrix.com.pwgen2android.main.OTAStatus(0, powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.DOWNLOAD_STARTED.INSTANCE, 1.0f, 0, null, 24, null)), this$0.createOTAOperation(downloadURL, deviceInfo, updateInfoData));
        }
        return io.reactivex.Observable.error(new powerwatch.matrix.com.pwgen2android.main.OTAError.DeviceNotConnected());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startOTA$lambda-4, reason: not valid java name */
    public static final io.reactivex.ObservableSource m1525startOTA$lambda4(boolean z, final powerwatch.matrix.com.pwgen2android.main.BaseOtaProcessExecutor this$0, final powerwatch.matrix.com.pwgen2android.main.update.FirmwareDisplayData updateInfoData, powerwatch.matrix.com.pwgen2android.main.OTAStatus it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateInfoData, "$updateInfoData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        if (kotlin.jvm.internal.Intrinsics.areEqual(it.getPhase(), powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.COMPLETE.INSTANCE) && z) {
            return this$0.deviceRepository.defaultDevice().flatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$BaseOtaProcessExecutor$dZ3r8gCytzUzv4HiZ51FJjaTTZ8
                @Override // io.reactivex.functions.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return powerwatch.matrix.com.pwgen2android.main.BaseOtaProcessExecutor.m1526startOTA$lambda4$lambda3(this.f$0, updateInfoData, (powerwatch.matrix.com.pwgen2android.shared.data.models.Device) obj);
                }
            }).andThen(io.reactivex.Observable.just(it));
        }
        return io.reactivex.Observable.just(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startOTA$lambda-4$lambda-3, reason: not valid java name */
    public static final io.reactivex.CompletableSource m1526startOTA$lambda4$lambda3(powerwatch.matrix.com.pwgen2android.main.BaseOtaProcessExecutor this$0, powerwatch.matrix.com.pwgen2android.main.update.FirmwareDisplayData updateInfoData, powerwatch.matrix.com.pwgen2android.shared.data.models.Device device) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateInfoData, "$updateInfoData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(device, "device");
        return this$0.deviceRepository.update(device.copy((1535 & 1) != 0 ? device.uid : 0L, (1535 & 2) != 0 ? device.serialNumber : null, (1535 & 4) != 0 ? device.bluetoothAddress : null, (1535 & 8) != 0 ? device.pid : 0, (1535 & 16) != 0 ? device.firmwareVersion : updateInfoData.getVersion(), (1535 & 32) != 0 ? device.productName : null, (1535 & 64) != 0 ? device.shouldSync : null, (1535 & 128) != 0 ? device.callNotification : false, (1535 & 256) != 0 ? device.messageNotification : false, (1535 & 512) != 0 ? device.activityGoalNotification : false, (1535 & 1024) != 0 ? device.alarmNotification : false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startOTA$lambda-5, reason: not valid java name */
    public static final kotlin.Pair m1527startOTA$lambda5(powerwatch.matrix.com.pwgen2android.main.OTAStatus it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return new kotlin.Pair(0, it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startOTA$lambda-6, reason: not valid java name */
    public static final void m1528startOTA$lambda6(kotlin.Pair pair) {
        java.lang.System.out.println((java.lang.Object) ("AGPS - received phase from file transfer " + ((powerwatch.matrix.com.pwgen2android.main.OTAStatus) pair.getSecond()).getPhase() + ", " + ((powerwatch.matrix.com.pwgen2android.main.OTAStatus) pair.getSecond()).getPhaseProgress()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startOTA$lambda-7, reason: not valid java name */
    public static final kotlin.Pair m1529startOTA$lambda7(kotlin.Pair oldProgressPair, kotlin.Pair newProgressPair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oldProgressPair, "oldProgressPair");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newProgressPair, "newProgressPair");
        if (kotlin.jvm.internal.Intrinsics.areEqual(((powerwatch.matrix.com.pwgen2android.main.OTAStatus) newProgressPair.getSecond()).getPhase(), powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.CONNECTING.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(((powerwatch.matrix.com.pwgen2android.main.OTAStatus) newProgressPair.getSecond()).getPhase(), powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.ERROR.INSTANCE)) {
            oldProgressPair = kotlin.Pair.copy$default(oldProgressPair, 0, null, 2, null);
        }
        int phaseProgress = ((powerwatch.matrix.com.pwgen2android.main.OTAStatus) newProgressPair.getSecond()).getPhaseProgress();
        return new kotlin.Pair(java.lang.Integer.valueOf(((java.lang.Number) oldProgressPair.getFirst()).intValue() + (phaseProgress == 100 ? (int) (phaseProgress * ((powerwatch.matrix.com.pwgen2android.main.OTAStatus) newProgressPair.getSecond()).getPhaseWeight()) : 0)), newProgressPair.getSecond());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startOTA$lambda-8, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.main.OTAStatus m1530startOTA$lambda8(kotlin.Pair updatePhaseProgress) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updatePhaseProgress, "updatePhaseProgress");
        int phaseProgress = ((powerwatch.matrix.com.pwgen2android.main.OTAStatus) updatePhaseProgress.getSecond()).getPhaseProgress();
        return new powerwatch.matrix.com.pwgen2android.main.OTAStatus(((powerwatch.matrix.com.pwgen2android.main.OTAStatus) updatePhaseProgress.getSecond()).getPhaseProgress(), ((powerwatch.matrix.com.pwgen2android.main.OTAStatus) updatePhaseProgress.getSecond()).getPhase(), ((powerwatch.matrix.com.pwgen2android.main.OTAStatus) updatePhaseProgress.getSecond()).getPhaseWeight(), ((java.lang.Number) updatePhaseProgress.getFirst()).intValue() + (phaseProgress < 100 ? (int) (phaseProgress * ((powerwatch.matrix.com.pwgen2android.main.OTAStatus) updatePhaseProgress.getSecond()).getPhaseWeight()) : 0), null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startOTA$lambda-9, reason: not valid java name */
    public static final boolean m1531startOTA$lambda9(powerwatch.matrix.com.pwgen2android.main.OTAStatus it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return !kotlin.jvm.internal.Intrinsics.areEqual(it.getPhase(), powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.INITIAL.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startOTA$lambda-10, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.main.OTAStatus m1521startOTA$lambda10(powerwatch.matrix.com.pwgen2android.main.OTAStatus it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it.getTotalProgress() > 100 ? powerwatch.matrix.com.pwgen2android.main.OTAStatus.copy$default(it, 0, null, 0.0f, 100, null, 23, null) : it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startOTA$lambda-11, reason: not valid java name */
    public static final void m1522startOTA$lambda11(powerwatch.matrix.com.pwgen2android.main.BaseOtaProcessExecutor this$0, powerwatch.matrix.com.pwgen2android.main.update.FirmwareDisplayData updateInfoData, powerwatch.matrix.com.pwgen2android.main.OTAStatus oTAStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateInfoData, "$updateInfoData");
        if (kotlin.jvm.internal.Intrinsics.areEqual(oTAStatus.getPhase(), powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.COMPLETE.INSTANCE)) {
            this$0.logOTASuccess(updateInfoData.getInstalledVersion(), updateInfoData.getVersion());
        }
        java.lang.System.out.println((java.lang.Object) ("AGPS - Setting phase to " + oTAStatus.getPhase() + ", " + oTAStatus.getPhaseProgress()));
        this$0.otaOutput.onNext(oTAStatus);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startOTA$lambda-12, reason: not valid java name */
    public static final void m1523startOTA$lambda12(powerwatch.matrix.com.pwgen2android.main.BaseOtaProcessExecutor this$0, powerwatch.matrix.com.pwgen2android.main.update.FirmwareDisplayData updateInfoData, java.lang.Throwable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateInfoData, "$updateInfoData");
        java.lang.String installedVersion = updateInfoData.getInstalledVersion();
        java.lang.String version = updateInfoData.getVersion();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        this$0.logOTAError(installedVersion, version, it);
        this$0.otaOutput.onNext(new powerwatch.matrix.com.pwgen2android.main.OTAStatus(0, powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.ERROR.INSTANCE, 0.0f, 0, it, 12, null));
        this$0.otaOutput.onNext(this$0.DEFAULT_OTA_STATE);
    }

    protected void logOTAStart(java.lang.String firmwareVersionFrom, java.lang.String firmwareVersionTo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firmwareVersionFrom, "firmwareVersionFrom");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firmwareVersionTo, "firmwareVersionTo");
        this.metricsRepository.logOTAEvent(new powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.DeviceOTALogEvent(powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventType.OtaStart.INSTANCE, null, null, firmwareVersionFrom, firmwareVersionTo, 4, null));
    }

    protected void logOTASuccess(java.lang.String firmwareVersionFrom, java.lang.String firmwareVersionTo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firmwareVersionFrom, "firmwareVersionFrom");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firmwareVersionTo, "firmwareVersionTo");
        this.metricsRepository.logOTAEvent(new powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.DeviceOTALogEvent(powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventType.OtaEnd.INSTANCE, powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.SUCCESS.INSTANCE, null, firmwareVersionFrom, firmwareVersionTo, 4, null));
    }

    protected void logOTAError(java.lang.String firmwareVersionFrom, java.lang.String firmwareVersionTo, java.lang.Throwable it) {
        powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.UNKNOWN unknown;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firmwareVersionFrom, "firmwareVersionFrom");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firmwareVersionTo, "firmwareVersionTo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof powerwatch.matrix.com.pwgen2android.main.OTAError.FileDownload) {
            unknown = powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.DOWNLOAD_FILE_FAILED.INSTANCE;
        } else if (it instanceof powerwatch.matrix.com.pwgen2android.main.OTAError.FileTransferInterrupted) {
            unknown = powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.FILE_TRANSFER_FAILED.INSTANCE;
        } else if (it instanceof powerwatch.matrix.com.pwgen2android.main.OTAError.DeviceNotAppeared) {
            unknown = powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.DEVICE_NOT_APPEARED.INSTANCE;
        } else if (it instanceof powerwatch.matrix.com.pwgen2android.main.OTAError.VersionMismatch) {
            unknown = powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.VERSION_MISMATCH.INSTANCE;
        } else {
            unknown = it instanceof powerwatch.matrix.com.pwgen2android.main.OTAError.DeviceNotConnected ? powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.OTA_DEVICE_DISCONNECTED.INSTANCE : new powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.UNKNOWN();
        }
        this.metricsRepository.logOTAEvent(new powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.DeviceOTALogEvent(powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventType.OtaEnd.INSTANCE, unknown, null, firmwareVersionFrom, firmwareVersionTo, 4, null));
    }
}
