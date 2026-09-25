package powerwatch.matrix.com.pwgen2android.shared.sync;

/* JADX INFO: compiled from: PostSyncDataTransferCoordinator.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\rJ\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\n2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u001e\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00120\n2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;", "", "gpsUpdateProcessExecutor", "Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;", "fontUpdateController", "Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;", "deviceManager", "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;", "(Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;)V", "createInternalAGPSObs", "Lio/reactivex/Observable;", "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$AGPSProgress;", "isAGPSUpdateNeeded", "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;", "deviceCommunicationQueuer", "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;", "syncResult", "readAGPSAndRunFontUpdate", "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult;", "deviceInfo", "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;", "runFontUpdate", "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$FontUpdateProgress;", "runMainProcess", "internalResult", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class PostSyncDataTransferCoordinator {
    private final powerwatch.matrix.com.pwgen2android.sdk.DeviceManager deviceManager;
    private final powerwatch.matrix.com.pwgen2android.main.FontUpdateController fontUpdateController;
    private final powerwatch.matrix.com.pwgen2android.main.GPSUpdateProcessExecutor gpsUpdateProcessExecutor;

    public PostSyncDataTransferCoordinator(powerwatch.matrix.com.pwgen2android.main.GPSUpdateProcessExecutor gpsUpdateProcessExecutor, powerwatch.matrix.com.pwgen2android.main.FontUpdateController fontUpdateController, powerwatch.matrix.com.pwgen2android.sdk.DeviceManager deviceManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gpsUpdateProcessExecutor, "gpsUpdateProcessExecutor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fontUpdateController, "fontUpdateController");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceManager, "deviceManager");
        this.gpsUpdateProcessExecutor = gpsUpdateProcessExecutor;
        this.fontUpdateController = fontUpdateController;
        this.deviceManager = deviceManager;
    }

    public final io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.sync.SyncInternalResult> isAGPSUpdateNeeded(powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuer deviceCommunicationQueuer, final powerwatch.matrix.com.pwgen2android.shared.sync.SyncInternalResult syncResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceCommunicationQueuer, "deviceCommunicationQueuer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(syncResult, "syncResult");
        powerwatch.matrix.com.pwgen2android.main.GPSUpdateProcessExecutor gPSUpdateProcessExecutor = this.gpsUpdateProcessExecutor;
        powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo = syncResult.getSyncConfig().getDeviceInfo();
        kotlin.jvm.internal.Intrinsics.checkNotNull(deviceInfo);
        io.reactivex.Observable observable = powerwatch.matrix.com.pwgen2android.main.GPSUpdateProcessExecutor.isUpdateNeeded$default(gPSUpdateProcessExecutor, deviceInfo, false, 2, null).toObservable();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observable, "gpsUpdateProcessExecutor.isUpdateNeeded(syncResult.syncConfig.deviceInfo!!).toObservable()");
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.sync.SyncInternalResult> observableOnErrorResumeNext = deviceCommunicationQueuer.queue(new powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationOperation(observable, null, null, 6, null)).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$PostSyncDataTransferCoordinator$9j0KjFxs6_cg8ILQqMvD7vy9feM
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.sync.PostSyncDataTransferCoordinator.m3355isAGPSUpdateNeeded$lambda1(syncResult, (java.lang.Boolean) obj);
            }
        }).onErrorResumeNext(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$PostSyncDataTransferCoordinator$0at_O8KW0ICjlFgAfzVtvbRo87Y
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.sync.PostSyncDataTransferCoordinator.m3356isAGPSUpdateNeeded$lambda2(syncResult, (java.lang.Throwable) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableOnErrorResumeNext, "deviceCommunicationQueuer.queue(DeviceCommunicationOperation(gpsUpdateProcessExecutor.isUpdateNeeded(syncResult.syncConfig.deviceInfo!!).toObservable()))\n                .map { syncResult.apply { syncConfig.isGPSUpdateNeeded = it } }\n                .onErrorResumeNext(Function {\n                    Observable.just(syncResult.copy(throwable = AGPSReadError(it.message)))\n                })");
        return observableOnErrorResumeNext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: isAGPSUpdateNeeded$lambda-1, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.sync.SyncInternalResult m3355isAGPSUpdateNeeded$lambda1(powerwatch.matrix.com.pwgen2android.shared.sync.SyncInternalResult syncResult, java.lang.Boolean it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(syncResult, "$syncResult");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        syncResult.getSyncConfig().setGPSUpdateNeeded(it.booleanValue());
        return syncResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: isAGPSUpdateNeeded$lambda-2, reason: not valid java name */
    public static final io.reactivex.Observable m3356isAGPSUpdateNeeded$lambda2(powerwatch.matrix.com.pwgen2android.shared.sync.SyncInternalResult syncResult, java.lang.Throwable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(syncResult, "$syncResult");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return io.reactivex.Observable.just(powerwatch.matrix.com.pwgen2android.shared.sync.SyncInternalResult.copy$default(syncResult, 0, null, null, new powerwatch.matrix.com.pwgen2android.shared.sync.AGPSReadError(it.getMessage()), 7, null));
    }

    public final io.reactivex.Observable<? extends powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult> runMainProcess(final powerwatch.matrix.com.pwgen2android.shared.sync.SyncInternalResult internalResult, final powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuer deviceCommunicationQueuer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalResult, "internalResult");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceCommunicationQueuer, "deviceCommunicationQueuer");
        if (internalResult.getThrowable() instanceof powerwatch.matrix.com.pwgen2android.shared.sync.AGPSReadError) {
            io.reactivex.Observable<? extends powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult> observableJust = io.reactivex.Observable.just(new powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult.FontUpdateProgress(100, false, true, internalResult.getThrowable()));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableJust, "just(SyncProcessResult.FontUpdateProgress(100, false, true, internalResult.throwable))");
            return observableJust;
        }
        if (internalResult.getSyncConfig().isGPSUpdateNeeded()) {
            io.reactivex.Observable observableFlatMap = createInternalAGPSObs().flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$PostSyncDataTransferCoordinator$G3XtH-srQbnf4qfgZnukZ-rdpdo
                @Override // io.reactivex.functions.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return powerwatch.matrix.com.pwgen2android.shared.sync.PostSyncDataTransferCoordinator.m3373runMainProcess$lambda3(this.f$0, internalResult, deviceCommunicationQueuer, (powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult.AGPSProgress) obj);
                }
            });
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableFlatMap, "createInternalAGPSObs()\n                    .flatMap { progress ->\n                        if (progress.completed && progress.error == null) {\n                            readAGPSAndRunFontUpdate(internalResult.syncConfig.deviceInfo!!, deviceCommunicationQueuer)\n                        } else Observable.just(progress)\n                    }");
            return observableFlatMap;
        }
        powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo = internalResult.getSyncConfig().getDeviceInfo();
        kotlin.jvm.internal.Intrinsics.checkNotNull(deviceInfo);
        return runFontUpdate(deviceCommunicationQueuer, deviceInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: runMainProcess$lambda-3, reason: not valid java name */
    public static final io.reactivex.ObservableSource m3373runMainProcess$lambda3(powerwatch.matrix.com.pwgen2android.shared.sync.PostSyncDataTransferCoordinator this$0, powerwatch.matrix.com.pwgen2android.shared.sync.SyncInternalResult internalResult, powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuer deviceCommunicationQueuer, powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult.AGPSProgress progress) {
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult> observableJust;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalResult, "$internalResult");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceCommunicationQueuer, "$deviceCommunicationQueuer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(progress, "progress");
        if (progress.getCompleted() && progress.getError() == null) {
            powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo = internalResult.getSyncConfig().getDeviceInfo();
            kotlin.jvm.internal.Intrinsics.checkNotNull(deviceInfo);
            observableJust = this$0.readAGPSAndRunFontUpdate(deviceInfo, deviceCommunicationQueuer);
        } else {
            observableJust = io.reactivex.Observable.just(progress);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableJust, "just(progress)");
        }
        return observableJust;
    }

    private final io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult.AGPSProgress> createInternalAGPSObs() {
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult.AGPSProgress> observableMerge = io.reactivex.Observable.merge(this.gpsUpdateProcessExecutor.otaOutput().filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$PostSyncDataTransferCoordinator$VO1VwN3Ii0Q2VKEch_gffS57Y2Q
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.sync.PostSyncDataTransferCoordinator.m3349createInternalAGPSObs$lambda4((powerwatch.matrix.com.pwgen2android.main.OTAStatus) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$PostSyncDataTransferCoordinator$wrLA559rJiMvKg62nGTLKKVOEIU
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.sync.PostSyncDataTransferCoordinator.m3350createInternalAGPSObs$lambda5((powerwatch.matrix.com.pwgen2android.main.OTAStatus) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$PostSyncDataTransferCoordinator$airHJUzs8Wv_FWgX7z5JauQCQuw
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.sync.PostSyncDataTransferCoordinator.m3351createInternalAGPSObs$lambda6((powerwatch.matrix.com.pwgen2android.main.OTAStatus) obj);
            }
        }).takeUntil(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$PostSyncDataTransferCoordinator$P_7pMLoVutFTHxUnktiO6OD_4Kw
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.sync.PostSyncDataTransferCoordinator.m3352createInternalAGPSObs$lambda7((powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult.AGPSProgress) obj);
            }
        }).doOnComplete(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$PostSyncDataTransferCoordinator$yUiCulI74Dtx_7WIVN8uqsyWS78
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.sync.PostSyncDataTransferCoordinator.m3353createInternalAGPSObs$lambda8(this.f$0);
            }
        }), io.reactivex.Observable.create(new io.reactivex.ObservableOnSubscribe() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$PostSyncDataTransferCoordinator$G_AN69kPC4ecjO6NYNzk2a7n3Ww
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(io.reactivex.ObservableEmitter observableEmitter) {
                powerwatch.matrix.com.pwgen2android.shared.sync.PostSyncDataTransferCoordinator.m3354createInternalAGPSObs$lambda9(this.f$0, observableEmitter);
            }
        }));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableMerge, "merge(\n                gpsUpdateProcessExecutor.otaOutput()\n                        .filter { it.phase != OtaProcessPhase.INITIAL }\n                        .doOnNext { println(\"Main AGPS running : ${it.phaseProgress}, phase: ${it.phase}\") }\n                        .map {\n                            SyncProcessResult.AGPSProgress(it.phaseProgress, true, it.phase == OtaProcessPhase.COMPLETE || it.phase == OtaProcessPhase.ERROR,\n                                    if (it.phase == OtaProcessPhase.ERROR) AgpsTransferError.TransferFailed else null)\n                        }\n                        .takeUntil { it.completed }\n                        .doOnComplete {\n                            println(\"AGPS - Main AGPS completed\")\n                            gpsUpdateProcessExecutor.resetExecutorState()\n                        },\n                Observable.create {\n                    gpsUpdateProcessExecutor.startOTA(expectVersionUpgrade = false)\n                    it.onComplete()\n                }\n        )");
        return observableMerge;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createInternalAGPSObs$lambda-4, reason: not valid java name */
    public static final boolean m3349createInternalAGPSObs$lambda4(powerwatch.matrix.com.pwgen2android.main.OTAStatus it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return !kotlin.jvm.internal.Intrinsics.areEqual(it.getPhase(), powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.INITIAL.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createInternalAGPSObs$lambda-5, reason: not valid java name */
    public static final void m3350createInternalAGPSObs$lambda5(powerwatch.matrix.com.pwgen2android.main.OTAStatus oTAStatus) {
        java.lang.System.out.println((java.lang.Object) ("Main AGPS running : " + oTAStatus.getPhaseProgress() + ", phase: " + oTAStatus.getPhase()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createInternalAGPSObs$lambda-6, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult.AGPSProgress m3351createInternalAGPSObs$lambda6(powerwatch.matrix.com.pwgen2android.main.OTAStatus it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return new powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult.AGPSProgress(it.getPhaseProgress(), true, kotlin.jvm.internal.Intrinsics.areEqual(it.getPhase(), powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.COMPLETE.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(it.getPhase(), powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.ERROR.INSTANCE), kotlin.jvm.internal.Intrinsics.areEqual(it.getPhase(), powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.ERROR.INSTANCE) ? powerwatch.matrix.com.pwgen2android.shared.sync.AgpsTransferError.TransferFailed.INSTANCE : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createInternalAGPSObs$lambda-7, reason: not valid java name */
    public static final boolean m3352createInternalAGPSObs$lambda7(powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult.AGPSProgress it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it.getCompleted();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createInternalAGPSObs$lambda-8, reason: not valid java name */
    public static final void m3353createInternalAGPSObs$lambda8(powerwatch.matrix.com.pwgen2android.shared.sync.PostSyncDataTransferCoordinator this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        java.lang.System.out.println((java.lang.Object) "AGPS - Main AGPS completed");
        this$0.gpsUpdateProcessExecutor.resetExecutorState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createInternalAGPSObs$lambda-9, reason: not valid java name */
    public static final void m3354createInternalAGPSObs$lambda9(powerwatch.matrix.com.pwgen2android.shared.sync.PostSyncDataTransferCoordinator this$0, io.reactivex.ObservableEmitter it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        powerwatch.matrix.com.pwgen2android.main.OtaProcessExecutor.DefaultImpls.startOTA$default(this$0.gpsUpdateProcessExecutor, null, null, null, false, 7, null);
        it.onComplete();
    }

    private final io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult> readAGPSAndRunFontUpdate(final powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo, final powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuer deviceCommunicationQueuer) {
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult> observableFlatMap = io.reactivex.Observable.just(deviceInfo).delay(400L, java.util.concurrent.TimeUnit.MILLISECONDS).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$PostSyncDataTransferCoordinator$UC4rDPQQ-Brq5KJfCknmYpgSJQg
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.sync.PostSyncDataTransferCoordinator.m3364readAGPSAndRunFontUpdate$lambda10((powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$PostSyncDataTransferCoordinator$RjyB6R-bjQixJAcvIMjx3sXmmy8
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.sync.PostSyncDataTransferCoordinator.m3365readAGPSAndRunFontUpdate$lambda13(deviceCommunicationQueuer, this, (powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$PostSyncDataTransferCoordinator$CbdZSkRLFmTmyKGuWhAw1J0KUBc
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.sync.PostSyncDataTransferCoordinator.m3368readAGPSAndRunFontUpdate$lambda14((kotlin.Pair) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$PostSyncDataTransferCoordinator$--lAXrXrbifs-KAUI_ybi3vBgMI
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.sync.PostSyncDataTransferCoordinator.m3369readAGPSAndRunFontUpdate$lambda15(this.f$0, deviceCommunicationQueuer, deviceInfo, (kotlin.Pair) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableFlatMap, "just(deviceInfo).delay(400, TimeUnit.MILLISECONDS)\n                .doOnNext { println(\"Reading AGPS timestamp!!!\") }\n                .flatMap {device ->\n                    deviceCommunicationQueuer.queue(\n                            DeviceCommunicationOperation(\n                                    gpsUpdateProcessExecutor.isUpdateNeeded(device).toObservable()))\n                            .map { Pair<Boolean, Throwable?>(it, null) }\n                            //if error occurred -> wrap it and report as 'false'\n                            .onErrorResumeNext(Function {\n                                Observable.just(Pair(false, it))\n                            })\n                }\n                .doOnNext { println(\"Reading AGPS timestamp, need update: $it\") }\n                .flatMap {updateNeededWithError ->\n                    //if error occurred -> report error; if update is not needed -> go to font update; otherwise -> return\n                    when {\n                        updateNeededWithError.second != null -> Observable.just(SyncProcessResult.AGPSProgress(100, false, true, updateNeededWithError.second))\n                        !updateNeededWithError.first -> runFontUpdate(deviceCommunicationQueuer, deviceInfo)\n                        else -> Observable.just(SyncProcessResult.AGPSProgress(100, false, true, null))\n                    }\n                }");
        return observableFlatMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: readAGPSAndRunFontUpdate$lambda-10, reason: not valid java name */
    public static final void m3364readAGPSAndRunFontUpdate$lambda10(powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo) {
        java.lang.System.out.println((java.lang.Object) "Reading AGPS timestamp!!!");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: readAGPSAndRunFontUpdate$lambda-13, reason: not valid java name */
    public static final io.reactivex.ObservableSource m3365readAGPSAndRunFontUpdate$lambda13(powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuer deviceCommunicationQueuer, powerwatch.matrix.com.pwgen2android.shared.sync.PostSyncDataTransferCoordinator this$0, powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo device) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceCommunicationQueuer, "$deviceCommunicationQueuer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(device, "device");
        io.reactivex.Observable observable = powerwatch.matrix.com.pwgen2android.main.GPSUpdateProcessExecutor.isUpdateNeeded$default(this$0.gpsUpdateProcessExecutor, device, false, 2, null).toObservable();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observable, "gpsUpdateProcessExecutor.isUpdateNeeded(device).toObservable()");
        return deviceCommunicationQueuer.queue(new powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationOperation(observable, null, null, 6, null)).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$PostSyncDataTransferCoordinator$G160hN243tUv5dYInvMppXpPK6c
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.sync.PostSyncDataTransferCoordinator.m3366readAGPSAndRunFontUpdate$lambda13$lambda11((java.lang.Boolean) obj);
            }
        }).onErrorResumeNext(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$PostSyncDataTransferCoordinator$MrY8P7OVZ7bgArz6t6Z8-ISjl20
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.sync.PostSyncDataTransferCoordinator.m3367readAGPSAndRunFontUpdate$lambda13$lambda12((java.lang.Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: readAGPSAndRunFontUpdate$lambda-13$lambda-11, reason: not valid java name */
    public static final kotlin.Pair m3366readAGPSAndRunFontUpdate$lambda13$lambda11(java.lang.Boolean it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return new kotlin.Pair(it, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: readAGPSAndRunFontUpdate$lambda-13$lambda-12, reason: not valid java name */
    public static final io.reactivex.Observable m3367readAGPSAndRunFontUpdate$lambda13$lambda12(java.lang.Throwable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return io.reactivex.Observable.just(new kotlin.Pair(false, it));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: readAGPSAndRunFontUpdate$lambda-14, reason: not valid java name */
    public static final void m3368readAGPSAndRunFontUpdate$lambda14(kotlin.Pair pair) {
        java.lang.System.out.println((java.lang.Object) kotlin.jvm.internal.Intrinsics.stringPlus("Reading AGPS timestamp, need update: ", pair));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: readAGPSAndRunFontUpdate$lambda-15, reason: not valid java name */
    public static final io.reactivex.ObservableSource m3369readAGPSAndRunFontUpdate$lambda15(powerwatch.matrix.com.pwgen2android.shared.sync.PostSyncDataTransferCoordinator this$0, powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuer deviceCommunicationQueuer, powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo, kotlin.Pair updateNeededWithError) {
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult.FontUpdateProgress> observableJust;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceCommunicationQueuer, "$deviceCommunicationQueuer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfo, "$deviceInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateNeededWithError, "updateNeededWithError");
        if (updateNeededWithError.getSecond() != null) {
            observableJust = io.reactivex.Observable.just(new powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult.AGPSProgress(100, false, true, (java.lang.Throwable) updateNeededWithError.getSecond()));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableJust, "just(SyncProcessResult.AGPSProgress(100, false, true, updateNeededWithError.second))");
        } else if (((java.lang.Boolean) updateNeededWithError.getFirst()).booleanValue()) {
            observableJust = io.reactivex.Observable.just(new powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult.AGPSProgress(100, false, true, null));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableJust, "just(SyncProcessResult.AGPSProgress(100, false, true, null))");
        } else {
            observableJust = this$0.runFontUpdate(deviceCommunicationQueuer, deviceInfo);
        }
        return observableJust;
    }

    private final io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult.FontUpdateProgress> runFontUpdate(powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuer deviceCommunicationQueuer, powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo) {
        io.reactivex.Observable observable = powerwatch.matrix.com.pwgen2android.sdk.DeviceManager.DefaultImpls.readDeviceInfo$default(this.deviceManager, deviceInfo, null, 2, null).toObservable();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observable, "deviceManager.readDeviceInfo(deviceInfo).toObservable()");
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult.FontUpdateProgress> observableOnErrorResumeNext = deviceCommunicationQueuer.queue(new powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationOperation(observable, null, null, 6, null)).flatMapMaybe(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$PostSyncDataTransferCoordinator$62nJmskhPgRbA_-sM-sZaUaWaM0
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.sync.PostSyncDataTransferCoordinator.m3370runFontUpdate$lambda16(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$PostSyncDataTransferCoordinator$LWwLb2EoDw9Q7TLtPu4UvC7Yu9Q
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.sync.PostSyncDataTransferCoordinator.m3371runFontUpdate$lambda17(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontUpdateInfo) obj);
            }
        }).onErrorResumeNext(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.sync.-$$Lambda$PostSyncDataTransferCoordinator$bonAZ49q5QuC0K-_c5x08Ufy37E
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.sync.PostSyncDataTransferCoordinator.m3372runFontUpdate$lambda18((java.lang.Throwable) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableOnErrorResumeNext, "deviceCommunicationQueuer.queue(\n                DeviceCommunicationOperation(deviceManager.readDeviceInfo(deviceInfo).toObservable()))\n                .flatMapMaybe { info ->\n                    fontUpdateController.checkForUpdate(info.sectionInfoMap).toMaybe()\n                }\n                .flatMap { fontUpdateController.startUpdate(it) }\n                .onErrorResumeNext(Function {\n                    Observable.just(SyncProcessResult.FontUpdateProgress(100, false, true,\n                    if (it is NoSuchElementException) null else it))\n                })");
        return observableOnErrorResumeNext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: runFontUpdate$lambda-16, reason: not valid java name */
    public static final io.reactivex.MaybeSource m3370runFontUpdate$lambda16(powerwatch.matrix.com.pwgen2android.shared.sync.PostSyncDataTransferCoordinator this$0, powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo info) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "info");
        return this$0.fontUpdateController.checkForUpdate(info.getSectionInfoMap()).toMaybe();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: runFontUpdate$lambda-17, reason: not valid java name */
    public static final io.reactivex.ObservableSource m3371runFontUpdate$lambda17(powerwatch.matrix.com.pwgen2android.shared.sync.PostSyncDataTransferCoordinator this$0, powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontUpdateInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.fontUpdateController.startUpdate(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: runFontUpdate$lambda-18, reason: not valid java name */
    public static final io.reactivex.Observable m3372runFontUpdate$lambda18(java.lang.Throwable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof java.util.NoSuchElementException) {
            it = null;
        }
        return io.reactivex.Observable.just(new powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult.FontUpdateProgress(100, false, true, it));
    }
}
