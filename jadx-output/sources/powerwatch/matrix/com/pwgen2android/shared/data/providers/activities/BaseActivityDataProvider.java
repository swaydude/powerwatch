package powerwatch.matrix.com.pwgen2android.shared.data.providers.activities;

/* JADX INFO: compiled from: BaseActivityDataProvider.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004B#\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u001e\u0010\u0015\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0013\u0018\u00010\u00122\u0006\u0010\u0016\u001a\u00020\u000eH\u0002J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\u0006\u0010\u0018\u001a\u00020\u0019H&J\u001c\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u000eH\u0016J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u000eH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000e0\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000RB\u0010\u0010\u001a6\u0012\u0004\u0012\u00020\u000e\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00130\u00120\u0011j\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00130\u0012`\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/BaseActivityDataProvider;", "T", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/DataProvider;", "", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "activityPeriodRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AllRepository;", "watchSynchronizer", "Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;", "cloudSynchronizer", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AllRepository;Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;)V", "pageInput", "Lio/reactivex/subjects/PublishSubject;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;", "kotlin.jvm.PlatformType", "pages", "Ljava/util/HashMap;", "Lio/reactivex/Observable;", "", "Lkotlin/collections/HashMap;", "getPage", "page", "getPeriods", "periodsContainer", "Lpowerwatch/matrix/com/pwgen2android/shared/sync/PeriodsContainer;", "loadData", "removePage", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class BaseActivityDataProvider<T> implements powerwatch.matrix.com.pwgen2android.shared.data.providers.DataProvider<T, java.lang.Long>, powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.AllRepository<T> activityPeriodRepository;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizer cloudSynchronizer;
    private final io.reactivex.subjects.PublishSubject<powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page> pageInput;
    private final java.util.HashMap<powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page, io.reactivex.Observable<java.util.List<T>>> pages;
    private final powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizer watchSynchronizer;

    public abstract java.util.List<T> getPeriods(powerwatch.matrix.com.pwgen2android.shared.sync.PeriodsContainer periodsContainer);

    public BaseActivityDataProvider(powerwatch.matrix.com.pwgen2android.shared.data.repositories.AllRepository<T> activityPeriodRepository, powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizer watchSynchronizer, powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizer cloudSynchronizer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityPeriodRepository, "activityPeriodRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watchSynchronizer, "watchSynchronizer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cloudSynchronizer, "cloudSynchronizer");
        this.activityPeriodRepository = activityPeriodRepository;
        this.watchSynchronizer = watchSynchronizer;
        this.cloudSynchronizer = cloudSynchronizer;
        this.pages = new java.util.HashMap<>();
        io.reactivex.subjects.PublishSubject<powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page> publishSubjectCreate = io.reactivex.subjects.PublishSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "create<Page>()");
        this.pageInput = publishSubjectCreate;
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.providers.DataProvider
    public io.reactivex.Observable<java.util.List<T>> loadData(final powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page page) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "page");
        io.reactivex.Observable<java.util.List<T>> observableSubscribeOn = io.reactivex.Observable.defer(new java.util.concurrent.Callable() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.-$$Lambda$BaseActivityDataProvider$qnxEfSZpTXykgWiJbF6C5tnaX_U
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.BaseActivityDataProvider.m3171loadData$lambda2(page, this);
            }
        }).subscribeOn(io.reactivex.schedulers.Schedulers.io());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableSubscribeOn, "defer {\n\n            var pageWithCache = page.copy(offset = page.offset + page.correctedOffset)\n            if (watchSynchronizer.syncInProgress || cloudSynchronizer.hasBackgroundLogsToSync()) {\n                pageWithCache = page.copy(pageExpireTime = Long.MAX_VALUE, offset = page.offset + page.correctedOffset)\n            }\n\n\n            val pageObs = getPage(pageWithCache)\n\n            if (pageObs != null) return@defer pageObs\n\n            val response = Observable\n                    .merge(\n                            watchSynchronizer.formattedDataOutput()\n                                    .switchMap {\n                                        // if trigger is sync finished event, we should force cache\n                                        // sync logs are in parallel sent to the cloud\n                                        activityPeriodRepository.all(pageWithCache, fromCache = true)\n                                    },\n                            activityPeriodRepository.all(pageWithCache)\n                                    .doOnTerminate {\n//                                        debug(\"Terminate called for period observable, removing page from cache.\")\n                                        removePage(pageWithCache)\n                                    }\n                    )\n                    .replay(1)\n                    .autoConnect()\n            pages[pageWithCache] = response\n            response\n        }.subscribeOn(Schedulers.io())");
        return observableSubscribeOn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: loadData$lambda-2, reason: not valid java name */
    public static final io.reactivex.ObservableSource m3171loadData$lambda2(powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page page, final powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.BaseActivityDataProvider this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "$page");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        objectRef.element = (T) powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page.copy$default(page, 0, page.getOffset() + ((long) page.getCorrectedOffset()), 0L, 0, 13, null);
        if (this$0.watchSynchronizer.getSyncInProgress() || this$0.cloudSynchronizer.hasBackgroundLogsToSync()) {
            objectRef.element = (T) powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page.copy$default(page, 0, page.getOffset() + ((long) page.getCorrectedOffset()), kotlin.jvm.internal.LongCompanionObject.MAX_VALUE, 0, 9, null);
        }
        io.reactivex.Observable<java.util.List<T>> page2 = this$0.getPage((powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page) objectRef.element);
        if (page2 != null) {
            return page2;
        }
        io.reactivex.Observable<T> observableAutoConnect = io.reactivex.Observable.merge(this$0.watchSynchronizer.formattedDataOutput().switchMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.-$$Lambda$BaseActivityDataProvider$2uiEtIVzRaextMF9sjcGoorR_b4
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.BaseActivityDataProvider.m3172loadData$lambda2$lambda0(this.f$0, objectRef, (powerwatch.matrix.com.pwgen2android.shared.sync.SyncEvent.SyncFinishedEvent) obj);
            }
        }), powerwatch.matrix.com.pwgen2android.shared.data.repositories.AllRepository.DefaultImpls.all$default(this$0.activityPeriodRepository, (powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page) objectRef.element, false, 2, null).doOnTerminate(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.-$$Lambda$BaseActivityDataProvider$7IKx4pUPWoOU7XOPngkAexXPyqY
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.BaseActivityDataProvider.m3173loadData$lambda2$lambda1(this.f$0, objectRef);
            }
        })).replay(1).autoConnect();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableAutoConnect, "merge(\n                            watchSynchronizer.formattedDataOutput()\n                                    .switchMap {\n                                        // if trigger is sync finished event, we should force cache\n                                        // sync logs are in parallel sent to the cloud\n                                        activityPeriodRepository.all(pageWithCache, fromCache = true)\n                                    },\n                            activityPeriodRepository.all(pageWithCache)\n                                    .doOnTerminate {\n//                                        debug(\"Terminate called for period observable, removing page from cache.\")\n                                        removePage(pageWithCache)\n                                    }\n                    )\n                    .replay(1)\n                    .autoConnect()");
        this$0.pages.put(objectRef.element, observableAutoConnect);
        return observableAutoConnect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: loadData$lambda-2$lambda-0, reason: not valid java name */
    public static final io.reactivex.ObservableSource m3172loadData$lambda2$lambda0(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.BaseActivityDataProvider this$0, kotlin.jvm.internal.Ref.ObjectRef pageWithCache, powerwatch.matrix.com.pwgen2android.shared.sync.SyncEvent.SyncFinishedEvent it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pageWithCache, "$pageWithCache");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.activityPeriodRepository.all((powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page) pageWithCache.element, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: loadData$lambda-2$lambda-1, reason: not valid java name */
    public static final void m3173loadData$lambda2$lambda1(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.BaseActivityDataProvider this$0, kotlin.jvm.internal.Ref.ObjectRef pageWithCache) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pageWithCache, "$pageWithCache");
        this$0.removePage((powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page) pageWithCache.element);
    }

    private final synchronized io.reactivex.Observable<java.util.List<T>> getPage(powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page page) {
        return this.pages.get(page);
    }

    private final synchronized void removePage(powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page page) {
        this.pages.remove(page);
    }
}
