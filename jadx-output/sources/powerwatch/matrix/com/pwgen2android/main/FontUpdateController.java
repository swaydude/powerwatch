package powerwatch.matrix.com.pwgen2android.main;

/* JADX INFO: compiled from: FontUpdateController.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\bJ \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bJ\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "fontUpdateService", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateService;", "fontUpdateExecutor", "Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateExecutor;", "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateService;Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateExecutor;)V", "checkForUpdate", "Lio/reactivex/Single;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateInfo;", "sectionsInfo", "", "", "", "createUpdateObservableForPackage", "Lio/reactivex/Observable;", "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$FontUpdateProgress;", "updateInfo", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontComponent;", "getUpdateInfo", "startUpdate", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class FontUpdateController implements powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    private final powerwatch.matrix.com.pwgen2android.main.FontUpdateExecutor fontUpdateExecutor;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontUpdateService fontUpdateService;

    public FontUpdateController(powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontUpdateService fontUpdateService, powerwatch.matrix.com.pwgen2android.main.FontUpdateExecutor fontUpdateExecutor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fontUpdateService, "fontUpdateService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fontUpdateExecutor, "fontUpdateExecutor");
        this.fontUpdateService = fontUpdateService;
        this.fontUpdateExecutor = fontUpdateExecutor;
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    public final io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontUpdateInfo> getUpdateInfo() {
        return powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetService.DefaultImpls.get$default(this.fontUpdateService, null, 1, null);
    }

    public final io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontUpdateInfo> checkForUpdate(final java.util.Map<java.lang.String, java.lang.Long> sectionsInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sectionsInfo, "sectionsInfo");
        io.reactivex.Single map = getUpdateInfo().doOnSuccess(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$FontUpdateController$un8xV04SwqM8DLDAW9dzhtdGBo8
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.FontUpdateController.m1548checkForUpdate$lambda0(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontUpdateInfo) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$FontUpdateController$v93GuJNrzbguG4P6UzrhuEaDTQ4
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.FontUpdateController.m1549checkForUpdate$lambda2(sectionsInfo, (powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontUpdateInfo) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(map, "getUpdateInfo()\n                .doOnSuccess { debug(\"Font update info received from cloud\") }\n                .map { info ->\n\n                    //filter out components that matches the watch AND that are outdated\n                    val trimmedComponents = info.components.filter { component ->\n                        sectionsInfo[component.type] != null &&\n                                (sectionsInfo[component.type] as Long) < component.timestamp\n                    }\n                    info.copy(components = trimmedComponents)\n                }");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: checkForUpdate$lambda-0, reason: not valid java name */
    public static final void m1548checkForUpdate$lambda0(powerwatch.matrix.com.pwgen2android.main.FontUpdateController this$0, powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontUpdateInfo fontUpdateInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Font update info received from cloud", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:10:0x004f  */
    /* JADX INFO: renamed from: checkForUpdate$lambda-2, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontUpdateInfo m1549checkForUpdate$lambda2(java.util.Map sectionsInfo, powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontUpdateInfo info) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sectionsInfo, "$sectionsInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "info");
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontComponent> components = info.getComponents();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : components) {
            powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontComponent fontComponent = (powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontComponent) obj;
            if (sectionsInfo.get(fontComponent.getType()) != null) {
                java.lang.Object obj2 = sectionsInfo.get(fontComponent.getType());
                java.util.Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Long");
                if (((java.lang.Long) obj2).longValue() < fontComponent.getTimestamp()) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(obj);
            }
        }
        return powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontUpdateInfo.copy$default(info, 0L, 0L, arrayList, 3, null);
    }

    public final io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult.FontUpdateProgress> startUpdate(java.util.Map<java.lang.String, java.lang.Long> sectionsInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sectionsInfo, "sectionsInfo");
        io.reactivex.Observable observableFlatMapObservable = checkForUpdate(sectionsInfo).flatMapObservable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$FontUpdateController$X8oyLIls_-gSreZObG_11FuVhfM
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.FontUpdateController.m1557startUpdate$lambda3(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontUpdateInfo) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableFlatMapObservable, "checkForUpdate(sectionsInfo)\n                .flatMapObservable { fontUpdateInfo ->\n                    startUpdate(fontUpdateInfo)\n                }");
        return observableFlatMapObservable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startUpdate$lambda-3, reason: not valid java name */
    public static final io.reactivex.ObservableSource m1557startUpdate$lambda3(powerwatch.matrix.com.pwgen2android.main.FontUpdateController this$0, powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontUpdateInfo fontUpdateInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fontUpdateInfo, "fontUpdateInfo");
        return this$0.startUpdate(fontUpdateInfo);
    }

    public final io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult.FontUpdateProgress> startUpdate(powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontUpdateInfo updateInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateInfo, "updateInfo");
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult.FontUpdateProgress> observableFlatMap = io.reactivex.Observable.just(updateInfo).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$FontUpdateController$pRqJBa5U4YoNsbDr_rPe0H9vYgY
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.FontUpdateController.m1558startUpdate$lambda4(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontUpdateInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$FontUpdateController$shpQLoNaXZONJLbqowOlNFk6I18
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.FontUpdateController.m1559startUpdate$lambda6(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontUpdateInfo) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableFlatMap, "just(updateInfo)\n                .doOnNext { debug(\"Starting font update with components: ${it.components.size}\") }\n                .flatMap { fontUpdateInfo ->\n                    if (fontUpdateInfo.components.isEmpty()) Observable.just(SyncProcessResult.FontUpdateProgress(completed = true, progress = 100))\n                    else {\n                        Observable.concat(\n                                fontUpdateInfo.components.map { createUpdateObservableForPackage(it) }\n                        )\n                    }\n                }");
        return observableFlatMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startUpdate$lambda-4, reason: not valid java name */
    public static final void m1558startUpdate$lambda4(powerwatch.matrix.com.pwgen2android.main.FontUpdateController this$0, powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontUpdateInfo fontUpdateInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, kotlin.jvm.internal.Intrinsics.stringPlus("Starting font update with components: ", java.lang.Integer.valueOf(fontUpdateInfo.getComponents().size())), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startUpdate$lambda-6, reason: not valid java name */
    public static final io.reactivex.ObservableSource m1559startUpdate$lambda6(powerwatch.matrix.com.pwgen2android.main.FontUpdateController this$0, powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontUpdateInfo fontUpdateInfo) {
        io.reactivex.Observable observableConcat;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fontUpdateInfo, "fontUpdateInfo");
        if (fontUpdateInfo.getComponents().isEmpty()) {
            observableConcat = io.reactivex.Observable.just(new powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult.FontUpdateProgress(100, false, true, null, 10, null));
        } else {
            java.util.List<powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontComponent> components = fontUpdateInfo.getComponents();
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(components, 10));
            java.util.Iterator<T> it = components.iterator();
            while (it.hasNext()) {
                arrayList.add(this$0.createUpdateObservableForPackage((powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontComponent) it.next()));
            }
            observableConcat = io.reactivex.Observable.concat(arrayList);
        }
        return observableConcat;
    }

    private final io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult.FontUpdateProgress> createUpdateObservableForPackage(final powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontComponent updateInfo) {
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult.FontUpdateProgress> observableMerge = io.reactivex.Observable.merge(this.fontUpdateExecutor.otaOutput().filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$FontUpdateController$jIaXx1oxeWCJ81LgTEWUSvy4WTg
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.FontUpdateController.m1553createUpdateObservableForPackage$lambda7((powerwatch.matrix.com.pwgen2android.main.OTAStatus) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$FontUpdateController$zDC1qhNA3f4CF4bbuOHKpaXWNLo
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.FontUpdateController.m1554createUpdateObservableForPackage$lambda8((powerwatch.matrix.com.pwgen2android.main.OTAStatus) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$FontUpdateController$ho8banqcMzvWC_jnV28R0u4IynA
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.FontUpdateController.m1555createUpdateObservableForPackage$lambda9((powerwatch.matrix.com.pwgen2android.main.OTAStatus) obj);
            }
        }).takeUntil(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$FontUpdateController$7u153K22eZYormyD7KlH6B36wY4
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.FontUpdateController.m1550createUpdateObservableForPackage$lambda10((powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult.FontUpdateProgress) obj);
            }
        }).doOnComplete(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$FontUpdateController$wGOtBRRPErT_0AQ3eIDz1YuEOZ0
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.main.FontUpdateController.m1551createUpdateObservableForPackage$lambda11(this.f$0);
            }
        }), io.reactivex.Observable.create(new io.reactivex.ObservableOnSubscribe() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$FontUpdateController$d3570L0heI1_SLwmV7os6fn4KR4
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(io.reactivex.ObservableEmitter observableEmitter) {
                powerwatch.matrix.com.pwgen2android.main.FontUpdateController.m1552createUpdateObservableForPackage$lambda12(this.f$0, updateInfo, observableEmitter);
            }
        }));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableMerge, "merge(\n                fontUpdateExecutor.otaOutput()\n                        .filter { it.phase != OtaProcessPhase.INITIAL }\n                        .doOnNext { println(\"Main AGPS running : ${it.phaseProgress}, phase: ${it.phase}\") }\n                        .map {\n                            //TODO Include new types or simplify to data transfer result\n                            SyncProcessResult.FontUpdateProgress(it.phaseProgress, true, it.phase == OtaProcessPhase.COMPLETE || it.phase == OtaProcessPhase.ERROR,\n                                    if (it.phase == OtaProcessPhase.ERROR) AgpsTransferError.TransferFailed else null)\n                        }\n                        .takeUntil { it.completed }\n                        .doOnComplete {\n                            println(\"AGPS - Main AGPS completed\")\n                            fontUpdateExecutor.resetExecutorState()\n                        },\n                Observable.create {\n                    fontUpdateExecutor.startOTA(downloadURL = updateInfo.downloadURL, expectVersionUpgrade = false)\n                    it.onComplete()\n                })");
        return observableMerge;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createUpdateObservableForPackage$lambda-7, reason: not valid java name */
    public static final boolean m1553createUpdateObservableForPackage$lambda7(powerwatch.matrix.com.pwgen2android.main.OTAStatus it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return !kotlin.jvm.internal.Intrinsics.areEqual(it.getPhase(), powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.INITIAL.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createUpdateObservableForPackage$lambda-8, reason: not valid java name */
    public static final void m1554createUpdateObservableForPackage$lambda8(powerwatch.matrix.com.pwgen2android.main.OTAStatus oTAStatus) {
        java.lang.System.out.println((java.lang.Object) ("Main AGPS running : " + oTAStatus.getPhaseProgress() + ", phase: " + oTAStatus.getPhase()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createUpdateObservableForPackage$lambda-9, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult.FontUpdateProgress m1555createUpdateObservableForPackage$lambda9(powerwatch.matrix.com.pwgen2android.main.OTAStatus it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return new powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult.FontUpdateProgress(it.getPhaseProgress(), true, kotlin.jvm.internal.Intrinsics.areEqual(it.getPhase(), powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.COMPLETE.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(it.getPhase(), powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.ERROR.INSTANCE), kotlin.jvm.internal.Intrinsics.areEqual(it.getPhase(), powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.ERROR.INSTANCE) ? powerwatch.matrix.com.pwgen2android.shared.sync.AgpsTransferError.TransferFailed.INSTANCE : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createUpdateObservableForPackage$lambda-10, reason: not valid java name */
    public static final boolean m1550createUpdateObservableForPackage$lambda10(powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult.FontUpdateProgress it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it.getCompleted();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createUpdateObservableForPackage$lambda-11, reason: not valid java name */
    public static final void m1551createUpdateObservableForPackage$lambda11(powerwatch.matrix.com.pwgen2android.main.FontUpdateController this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        java.lang.System.out.println((java.lang.Object) "AGPS - Main AGPS completed");
        this$0.fontUpdateExecutor.resetExecutorState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createUpdateObservableForPackage$lambda-12, reason: not valid java name */
    public static final void m1552createUpdateObservableForPackage$lambda12(powerwatch.matrix.com.pwgen2android.main.FontUpdateController this$0, powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontComponent updateInfo, io.reactivex.ObservableEmitter it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateInfo, "$updateInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        powerwatch.matrix.com.pwgen2android.main.OtaProcessExecutor.DefaultImpls.startOTA$default(this$0.fontUpdateExecutor, updateInfo.getDownloadURL(), null, null, false, 6, null);
        it.onComplete();
    }
}
