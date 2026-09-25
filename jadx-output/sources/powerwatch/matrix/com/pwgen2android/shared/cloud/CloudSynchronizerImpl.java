package powerwatch.matrix.com.pwgen2android.shared.cloud;

/* JADX INFO: compiled from: CloudSynchronizer.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002BM\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J\b\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\"H\u0016J\u0016\u0010$\u001a\u0010\u0012\f\u0012\n \u001f*\u0004\u0018\u00010&0&0%H\u0016J\u0012\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010+\u001a\u00020,H\u0016J\u0012\u0010-\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u001e0\u001e0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "deviceRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;", "goalsRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;", "userAccountRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;", "walkingLogRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepository;", "restingLogRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepository;", "sleepLogRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepository;", "userActivitySessionRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;", "networkConnectionInfo", "Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProvider;", "metricsRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProvider;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;)V", "activityOperationQuerer", "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "restingOperationQuerer", "sleepOperationQuerer", "syncSubject", "Lio/reactivex/subjects/PublishSubject;", "", "kotlin.jvm.PlatformType", "walkingOperationQuerer", "hasActivitySessionsToSync", "", "hasBackgroundLogsToSync", "hasDataToSync", "Lio/reactivex/Single;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/SyncDataInfo;", "syncAllDataToCloud", "Lio/reactivex/Completable;", "scheduleTime", "Ljava/util/concurrent/TimeUnit;", "syncData", "", "syncWatchLogsToCloud", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class CloudSynchronizerImpl implements powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizer, powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    private final powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuerImpl activityOperationQuerer;
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository deviceRepository;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository goalsRepository;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepository metricsRepository;
    private final powerwatch.matrix.com.pwgen2android.shared.host.NetworkInfoProvider networkConnectionInfo;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.RestingLogRepository restingLogRepository;
    private final powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuerImpl restingOperationQuerer;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.SleepLogRepository sleepLogRepository;
    private final powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuerImpl sleepOperationQuerer;
    private final io.reactivex.subjects.PublishSubject<java.lang.Integer> syncSubject;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository userAccountRepository;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepository userActivitySessionRepository;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.WalkingLogRepository walkingLogRepository;
    private final powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuerImpl walkingOperationQuerer;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-5, reason: not valid java name */
    public static final void m3000_init_$lambda5(java.lang.Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-7, reason: not valid java name */
    public static final void m3002_init_$lambda7() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-8, reason: not valid java name */
    public static final void m3003_init_$lambda8(java.lang.Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-1$lambda-0, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.host.NetworkStatus m3011lambda1$lambda0(powerwatch.matrix.com.pwgen2android.shared.host.NetworkStatus it, kotlin.ranges.IntRange noName_0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "$it");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(noName_0, "$noName_0");
        return it;
    }

    public CloudSynchronizerImpl(powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository deviceRepository, powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository goalsRepository, powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository userAccountRepository, powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.WalkingLogRepository walkingLogRepository, powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.RestingLogRepository restingLogRepository, powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.SleepLogRepository sleepLogRepository, powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepository userActivitySessionRepository, powerwatch.matrix.com.pwgen2android.shared.host.NetworkInfoProvider networkConnectionInfo, powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepository metricsRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceRepository, "deviceRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalsRepository, "goalsRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAccountRepository, "userAccountRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingLogRepository, "walkingLogRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingLogRepository, "restingLogRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepLogRepository, "sleepLogRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userActivitySessionRepository, "userActivitySessionRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkConnectionInfo, "networkConnectionInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsRepository, "metricsRepository");
        this.deviceRepository = deviceRepository;
        this.goalsRepository = goalsRepository;
        this.userAccountRepository = userAccountRepository;
        this.walkingLogRepository = walkingLogRepository;
        this.restingLogRepository = restingLogRepository;
        this.sleepLogRepository = sleepLogRepository;
        this.userActivitySessionRepository = userActivitySessionRepository;
        this.networkConnectionInfo = networkConnectionInfo;
        this.metricsRepository = metricsRepository;
        io.reactivex.subjects.PublishSubject<java.lang.Integer> publishSubjectCreate = io.reactivex.subjects.PublishSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "create<Int>()");
        this.syncSubject = publishSubjectCreate;
        this.walkingOperationQuerer = new powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuerImpl();
        this.restingOperationQuerer = new powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuerImpl();
        this.sleepOperationQuerer = new powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuerImpl();
        this.activityOperationQuerer = new powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuerImpl();
        io.reactivex.disposables.CompositeDisposable compositeDisposable = new io.reactivex.disposables.CompositeDisposable();
        this.compositeDisposable = compositeDisposable;
        compositeDisposable.add(networkConnectionInfo.getNetworkStatusChange().distinctUntilChanged().flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.-$$Lambda$CloudSynchronizerImpl$_tG8q96-jwIDTdZpJqUaogKTjXE
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizerImpl.m2996_init_$lambda1((powerwatch.matrix.com.pwgen2android.shared.host.NetworkStatus) obj);
            }
        }).filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.-$$Lambda$CloudSynchronizerImpl$RRnhu1-mYHLOGt1zKEWbhuUZeTg
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizerImpl.m2997_init_$lambda2((powerwatch.matrix.com.pwgen2android.shared.host.NetworkStatus) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.-$$Lambda$CloudSynchronizerImpl$V3ptiED9Pyv41BvKJTLiZyw0fMM
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizerImpl.m2998_init_$lambda3(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.host.NetworkStatus) obj);
            }
        }).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.-$$Lambda$CloudSynchronizerImpl$yXn68uk6KWxUB4J-0ZZb7KuENi4
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizerImpl.m2999_init_$lambda4(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.host.NetworkStatus) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.-$$Lambda$CloudSynchronizerImpl$HP4bu8U0nBzsbVgNCsdlkpBv94A
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizerImpl.m3000_init_$lambda5((java.lang.Throwable) obj);
            }
        }));
        compositeDisposable.add(publishSubjectCreate.flatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.-$$Lambda$CloudSynchronizerImpl$pSG7rDw55uP-S-s0WZt5-8Gm4vM
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizerImpl.m3001_init_$lambda6(this.f$0, (java.lang.Integer) obj);
            }
        }).repeat().retry().subscribe(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.-$$Lambda$CloudSynchronizerImpl$w6-33Fr99G08ksXNB0T4x3W8Pr4
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizerImpl.m3002_init_$lambda7();
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.-$$Lambda$CloudSynchronizerImpl$oz90npI-y7TiMIH-jgNeKX058zg
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizerImpl.m3003_init_$lambda8((java.lang.Throwable) obj);
            }
        }));
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-1, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2996_init_$lambda1(final powerwatch.matrix.com.pwgen2android.shared.host.NetworkStatus it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return io.reactivex.Observable.just(new kotlin.ranges.IntRange(0, 7)).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.-$$Lambda$CloudSynchronizerImpl$BzuPfvI5jis3HNGsid5zDqP5DCo
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizerImpl.m3011lambda1$lambda0(it, (kotlin.ranges.IntRange) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-2, reason: not valid java name */
    public static final boolean m2997_init_$lambda2(powerwatch.matrix.com.pwgen2android.shared.host.NetworkStatus it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.shared.host.NetworkStatus.Connected.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-3, reason: not valid java name */
    public static final void m2998_init_$lambda3(powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizerImpl this$0, powerwatch.matrix.com.pwgen2android.shared.host.NetworkStatus networkStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.info$default(this$0, "Network connection established, sync with the cloud will be triggered now.", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-4, reason: not valid java name */
    public static final void m2999_init_$lambda4(powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizerImpl this$0, powerwatch.matrix.com.pwgen2android.shared.host.NetworkStatus networkStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.syncData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-6, reason: not valid java name */
    public static final io.reactivex.CompletableSource m3001_init_$lambda6(powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizerImpl this$0, java.lang.Integer it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizer.DefaultImpls.syncAllDataToCloud$default(this$0, null, 1, null);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizer
    public void syncData() {
        this.syncSubject.onNext(0);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizer
    public boolean hasActivitySessionsToSync() {
        return this.userActivitySessionRepository.notSyncedCount() > 0;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizer
    public boolean hasBackgroundLogsToSync() {
        return this.walkingLogRepository.notSyncedCount() > 0 || this.restingLogRepository.notSyncedCount() > 0 || this.sleepLogRepository.notSyncedCount() > 0;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizer
    public io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.cloud.SyncDataInfo> hasDataToSync() {
        io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.cloud.SyncDataInfo> singleCreate = io.reactivex.Single.create(new io.reactivex.SingleOnSubscribe() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.-$$Lambda$CloudSynchronizerImpl$BdU4N6fJEckDA0l8yKf_zumlzxs
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(io.reactivex.SingleEmitter singleEmitter) {
                powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizerImpl.m3004hasDataToSync$lambda9(this.f$0, singleEmitter);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singleCreate, "create<SyncDataInfo> {\n        val syncDataInfo = SyncDataInfo(\n                shouldSyncWalkingLogs = walkingLogRepository.notSyncedCount() > 0,\n                shouldSyncRestingLogs = restingLogRepository.notSyncedCount() > 0,\n                shouldSyncSleepLogs = sleepLogRepository.notSyncedCount() > 0,\n                shouldSyncActivitySession = userActivitySessionRepository.notSyncedCount() > 0\n        )\n        it.onSuccess(syncDataInfo)\n    }");
        return singleCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: hasDataToSync$lambda-9, reason: not valid java name */
    public static final void m3004hasDataToSync$lambda9(powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizerImpl this$0, io.reactivex.SingleEmitter it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        it.onSuccess(new powerwatch.matrix.com.pwgen2android.shared.cloud.SyncDataInfo(this$0.walkingLogRepository.notSyncedCount() > 0, this$0.sleepLogRepository.notSyncedCount() > 0, this$0.restingLogRepository.notSyncedCount() > 0, this$0.userActivitySessionRepository.notSyncedCount() > 0));
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizer
    public io.reactivex.Completable syncAllDataToCloud(java.util.concurrent.TimeUnit scheduleTime) {
        io.reactivex.Completable completableDefer = io.reactivex.Completable.defer(new java.util.concurrent.Callable() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.-$$Lambda$CloudSynchronizerImpl$usVU8CHK65skVgrfx7sZIwtkNMg
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizerImpl.m3012syncAllDataToCloud$lambda10(this.f$0);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableDefer, "defer {\n\n        val notSyncedDevices = deviceRepository.sync()\n\n        Completable.mergeArray(\n                notSyncedDevices,\n                syncWatchLogsToCloud()\n        )\n    }");
        return completableDefer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: syncAllDataToCloud$lambda-10, reason: not valid java name */
    public static final io.reactivex.CompletableSource m3012syncAllDataToCloud$lambda10(powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizerImpl this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        return io.reactivex.Completable.mergeArray(this$0.deviceRepository.sync(), powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizer.DefaultImpls.syncWatchLogsToCloud$default(this$0, null, 1, null));
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizer
    public io.reactivex.Completable syncWatchLogsToCloud(java.util.concurrent.TimeUnit scheduleTime) {
        io.reactivex.Completable completableDefer = io.reactivex.Completable.defer(new java.util.concurrent.Callable() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.-$$Lambda$CloudSynchronizerImpl$h32zgSDa7mgyPNc3gYxbIsCHnVs
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizerImpl.m3013syncWatchLogsToCloud$lambda11(this.f$0);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableDefer, "defer {\n        val walkingLogs = DeviceCommunicationOperation(walkingLogRepository.sync().toObservable<Unit>())\n        val restingLogs = DeviceCommunicationOperation(restingLogRepository.sync().toObservable<Unit>())\n        val sleepLogs = DeviceCommunicationOperation(sleepLogRepository.sync().toObservable<Unit>())\n        val activitySessions = DeviceCommunicationOperation(userActivitySessionRepository.sync().toObservable<Unit>())\n\n        val dataObs = Completable\n                .mergeArray(walkingOperationQuerer.queue(walkingLogs).ignoreElements(),\n                        restingOperationQuerer.queue(restingLogs).ignoreElements(),\n                        sleepOperationQuerer.queue(sleepLogs).ignoreElements(),\n                        activityOperationQuerer.queue(activitySessions).ignoreElements()\n                )\n\n        dataObs\n    }");
        return completableDefer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: syncWatchLogsToCloud$lambda-11, reason: not valid java name */
    public static final io.reactivex.CompletableSource m3013syncWatchLogsToCloud$lambda11(powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizerImpl this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        io.reactivex.Observable observable = this$0.walkingLogRepository.sync().toObservable();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observable, "walkingLogRepository.sync().toObservable<Unit>()");
        powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationOperation deviceCommunicationOperation = new powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationOperation(observable, null, null, 6, null);
        io.reactivex.Observable observable2 = this$0.restingLogRepository.sync().toObservable();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observable2, "restingLogRepository.sync().toObservable<Unit>()");
        powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationOperation deviceCommunicationOperation2 = new powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationOperation(observable2, null, null, 6, null);
        io.reactivex.Observable observable3 = this$0.sleepLogRepository.sync().toObservable();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observable3, "sleepLogRepository.sync().toObservable<Unit>()");
        powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationOperation deviceCommunicationOperation3 = new powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationOperation(observable3, null, null, 6, null);
        io.reactivex.Observable observable4 = this$0.userActivitySessionRepository.sync().toObservable();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observable4, "userActivitySessionRepository.sync().toObservable<Unit>()");
        io.reactivex.Completable completableMergeArray = io.reactivex.Completable.mergeArray(this$0.walkingOperationQuerer.queue(deviceCommunicationOperation).ignoreElements(), this$0.restingOperationQuerer.queue(deviceCommunicationOperation2).ignoreElements(), this$0.sleepOperationQuerer.queue(deviceCommunicationOperation3).ignoreElements(), this$0.activityOperationQuerer.queue(new powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationOperation(observable4, null, null, 6, null)).ignoreElements());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableMergeArray, "mergeArray(walkingOperationQuerer.queue(walkingLogs).ignoreElements(),\n                        restingOperationQuerer.queue(restingLogs).ignoreElements(),\n                        sleepOperationQuerer.queue(sleepLogs).ignoreElements(),\n                        activityOperationQuerer.queue(activitySessions).ignoreElements()\n                )");
        return completableMergeArray;
    }
}
