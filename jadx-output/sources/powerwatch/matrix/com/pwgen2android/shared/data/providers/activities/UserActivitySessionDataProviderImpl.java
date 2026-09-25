package powerwatch.matrix.com.pwgen2android.shared.data.providers.activities;

/* JADX INFO: compiled from: UserActivitySessionDataProvider.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0012\u001a\u00020\u0013J\u001c\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0006\u0010\u0015\u001a\u00020\fH\u0016J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000RB\u0010\n\u001a6\u0012\u0004\u0012\u00020\f\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r0\u000bj\u001a\u0012\u0004\u0012\u00020\f\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r`\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProviderImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProvider;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "userActivitySessionRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;", "watchSynchronizer", "Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;", "cloudSynchronizer", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;)V", "pages", "Ljava/util/HashMap;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;", "Lio/reactivex/Observable;", "", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;", "Lkotlin/collections/HashMap;", "getPeriods", "periodsContainer", "Lpowerwatch/matrix/com/pwgen2android/shared/sync/PeriodsContainer;", "loadData", "page", "loadSessionById", "id", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class UserActivitySessionDataProviderImpl implements powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.UserActivitySessionDataProvider, powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizer cloudSynchronizer;
    private final java.util.HashMap<powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page, io.reactivex.Observable<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession>>> pages;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepository userActivitySessionRepository;
    private final powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizer watchSynchronizer;

    public UserActivitySessionDataProviderImpl(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepository userActivitySessionRepository, powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizer watchSynchronizer, powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizer cloudSynchronizer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userActivitySessionRepository, "userActivitySessionRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watchSynchronizer, "watchSynchronizer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cloudSynchronizer, "cloudSynchronizer");
        this.userActivitySessionRepository = userActivitySessionRepository;
        this.watchSynchronizer = watchSynchronizer;
        this.cloudSynchronizer = cloudSynchronizer;
        this.pages = new java.util.HashMap<>();
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.UserActivitySessionDataProvider
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> loadSessionById(java.lang.String id) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "id");
        return this.userActivitySessionRepository.getOne(id, true);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.providers.DataProvider
    public io.reactivex.Observable<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession>> loadData(final powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page page) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "page");
        io.reactivex.Observable<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession>> observableDefer = io.reactivex.Observable.defer(new java.util.concurrent.Callable() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.-$$Lambda$UserActivitySessionDataProviderImpl$GhEyDOa5E7AKcxF8qajx1OCVFvU
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.UserActivitySessionDataProviderImpl.m3175loadData$lambda3(page, this);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableDefer, "defer {\n\n        var pageWithCache = page.copy(offset = page.offset + page.correctedOffset)\n        if (watchSynchronizer.syncInProgress || cloudSynchronizer.hasActivitySessionsToSync()) {\n            pageWithCache = page.copy(pageExpireTime = Long.MAX_VALUE)\n        }\n\n        if (pages.containsKey(pageWithCache)) {\n            return@defer pages[pageWithCache]\n        }\n        Observable.merge(watchSynchronizer.formattedDataOutput()\n                .doOnNext {  debug(\"Sync event done arrived, triggering activitySessions read.\") }\n                .switchMap {\n                    // if trigger is sync finished event, we should force cache\n                    // sync logs are in parallel sent to the cloud\n                    userActivitySessionRepository.all(pageWithCache, fromCache = true)\n                },\n                userActivitySessionRepository.all(pageWithCache)\n                .doOnTerminate {\n                    pages.remove(pageWithCache)\n                })\n                .publish()\n                .autoConnect()\n    }");
        return observableDefer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [T, powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page] */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page] */
    /* JADX INFO: renamed from: loadData$lambda-3, reason: not valid java name */
    public static final io.reactivex.ObservableSource m3175loadData$lambda3(powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page page, final powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.UserActivitySessionDataProviderImpl this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "$page");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        objectRef.element = powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page.copy$default(page, 0, page.getOffset() + ((long) page.getCorrectedOffset()), 0L, 0, 13, null);
        if (this$0.watchSynchronizer.getSyncInProgress() || this$0.cloudSynchronizer.hasActivitySessionsToSync()) {
            objectRef.element = powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page.copy$default(page, 0, 0L, kotlin.jvm.internal.LongCompanionObject.MAX_VALUE, 0, 11, null);
        }
        if (this$0.pages.containsKey(objectRef.element)) {
            return this$0.pages.get(objectRef.element);
        }
        return io.reactivex.Observable.merge(this$0.watchSynchronizer.formattedDataOutput().doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.-$$Lambda$UserActivitySessionDataProviderImpl$uIYShWIQB7YE0lUKDE9Q6JibUik
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.UserActivitySessionDataProviderImpl.m3176loadData$lambda3$lambda0(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.sync.SyncEvent.SyncFinishedEvent) obj);
            }
        }).switchMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.-$$Lambda$UserActivitySessionDataProviderImpl$-NwGjEVHRsRdJCarwpkr0LPeYIk
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.UserActivitySessionDataProviderImpl.m3177loadData$lambda3$lambda1(this.f$0, objectRef, (powerwatch.matrix.com.pwgen2android.shared.sync.SyncEvent.SyncFinishedEvent) obj);
            }
        }), powerwatch.matrix.com.pwgen2android.shared.data.repositories.AllRepository.DefaultImpls.all$default(this$0.userActivitySessionRepository, (powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page) objectRef.element, false, 2, null).doOnTerminate(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.-$$Lambda$UserActivitySessionDataProviderImpl$EWRHgnEThAcMpjGBiylrOaN_j2Y
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.UserActivitySessionDataProviderImpl.m3178loadData$lambda3$lambda2(this.f$0, objectRef);
            }
        })).publish().autoConnect();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: loadData$lambda-3$lambda-0, reason: not valid java name */
    public static final void m3176loadData$lambda3$lambda0(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.UserActivitySessionDataProviderImpl this$0, powerwatch.matrix.com.pwgen2android.shared.sync.SyncEvent.SyncFinishedEvent syncFinishedEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Sync event done arrived, triggering activitySessions read.", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: loadData$lambda-3$lambda-1, reason: not valid java name */
    public static final io.reactivex.ObservableSource m3177loadData$lambda3$lambda1(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.UserActivitySessionDataProviderImpl this$0, kotlin.jvm.internal.Ref.ObjectRef pageWithCache, powerwatch.matrix.com.pwgen2android.shared.sync.SyncEvent.SyncFinishedEvent it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pageWithCache, "$pageWithCache");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.userActivitySessionRepository.all((powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page) pageWithCache.element, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: loadData$lambda-3$lambda-2, reason: not valid java name */
    public static final void m3178loadData$lambda3$lambda2(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.UserActivitySessionDataProviderImpl this$0, kotlin.jvm.internal.Ref.ObjectRef pageWithCache) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pageWithCache, "$pageWithCache");
        this$0.pages.remove(pageWithCache.element);
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> getPeriods(powerwatch.matrix.com.pwgen2android.shared.sync.PeriodsContainer periodsContainer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(periodsContainer, "periodsContainer");
        return periodsContainer.getDayActivitySessions();
    }
}
