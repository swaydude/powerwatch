package powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods;

/* JADX INFO: compiled from: BaseActivityPeriodRepositoryImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00020\u0005B\u0005¢\u0006\u0002\u0010\u0006J&\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\r2\u0006\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H&J$\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00130\u00122\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J0\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00130\u00182\u0006\u0010\u000e\u001a\u00020\t2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\rH&J\u001c\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00130\u00182\u0006\u0010\u000e\u001a\u00020\tH&J\u0016\u0010\u001b\u001a\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H&J\u001e\u0010\u001e\u001a\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\u0006\u0010\u001f\u001a\u00020\u0010H\u0016R*\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/BaseActivityPeriodRepositoryImpl;", "T", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AllRepository;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AddAllRepository;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/CacheRepository;", "()V", "pageCache", "Ljava/util/HashMap;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;", "", "Lkotlin/collections/HashMap;", "activityIDs", "Lkotlin/Pair;", "page", "byUTC", "", "all", "Lio/reactivex/Observable;", "", "fromCache", "clearCache", "", "getCachePeriods", "Lio/reactivex/Single;", "startEndPair", "getCloudPeriods", "getSavePeriodsCompletable", "Lio/reactivex/Completable;", "items", "save", "toCacheOnly", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class BaseActivityPeriodRepositoryImpl<T extends powerwatch.matrix.com.pwgen2android.shared.data.models.BaseActivityPeriod> implements powerwatch.matrix.com.pwgen2android.shared.data.repositories.AllRepository<T>, powerwatch.matrix.com.pwgen2android.shared.data.repositories.AddAllRepository<T>, powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.CacheRepository {
    private final java.util.HashMap<powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page, java.lang.Long> pageCache = new java.util.HashMap<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: all$lambda-5$lambda-4$lambda-3, reason: not valid java name */
    public static final java.util.List m3265all$lambda5$lambda4$lambda3(java.util.List days, java.lang.Throwable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(days, "$days");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return days;
    }

    public abstract kotlin.Pair<java.lang.Long, java.lang.Long> activityIDs(powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page page, boolean byUTC);

    public abstract io.reactivex.Single<java.util.List<T>> getCachePeriods(powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page page, kotlin.Pair<java.lang.Long, java.lang.Long> startEndPair);

    public abstract io.reactivex.Single<java.util.List<T>> getCloudPeriods(powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page page);

    public abstract io.reactivex.Completable getSavePeriodsCompletable(java.util.List<? extends T> items);

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.AddAllRepository
    public io.reactivex.Completable save(java.util.List<? extends T> items, boolean toCacheOnly) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "items");
        return getSavePeriodsCompletable(items);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.AllRepository
    public io.reactivex.Observable<java.util.List<T>> all(final powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page page, final boolean fromCache) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "page");
        io.reactivex.Observable<java.util.List<T>> observableDefer = io.reactivex.Observable.defer(new java.util.concurrent.Callable() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.-$$Lambda$BaseActivityPeriodRepositoryImpl$5PsJlqFj7dclbbTF8WRqPC0yUJE
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.BaseActivityPeriodRepositoryImpl.m3260all$lambda5(fromCache, this, page);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableDefer, "defer {\n\n        if (fromCache) {\n            return@defer getCachePeriods(page, activityIDs(page)).toObservable()\n                    .onErrorReturn { listOf() }\n        }\n\n        val lastSuccessfulResponseTime = pageCache[page]\n        if (!page.isPageExpired(lastSuccessfulResponseTime)) {\n            return@defer getCachePeriods(page, activityIDs(page)).toObservable()\n                    .onErrorReturn { listOf() }\n        }\n\n        val cloud = getCloudPeriods(page)\n                .subscribeOn(Schedulers.io())\n                .doOnSuccess {\n                    pageCache[page] = System.currentTimeMillis()\n                }\n                .flatMap { days ->\n                    getSavePeriodsCompletable(days)\n                            .toSingleDefault(days)\n                            // if error occurs, just catch it, we cannot retry here\n                            .onErrorReturn { days }\n                }\n                .toObservable()\n                .onErrorResumeNext(Observable.empty<List<T>>())\n\n\n        Observable.concat(getCachePeriods(page, activityIDs(page)).toObservable(),\n                cloud)\n                .subscribeOn(Schedulers.io())\n    }");
        return observableDefer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: all$lambda-5, reason: not valid java name */
    public static final io.reactivex.ObservableSource m3260all$lambda5(boolean z, final powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.BaseActivityPeriodRepositoryImpl this$0, final powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page page) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "$page");
        if (z) {
            return this$0.getCachePeriods(page, activityIDs$default(this$0, page, false, 2, null)).toObservable().onErrorReturn(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.-$$Lambda$BaseActivityPeriodRepositoryImpl$wbcAHVJI5lxIX7hJ080DmJmrfpw
                @Override // io.reactivex.functions.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.BaseActivityPeriodRepositoryImpl.m3261all$lambda5$lambda0((java.lang.Throwable) obj);
                }
            });
        }
        if (!page.isPageExpired(this$0.pageCache.get(page))) {
            return this$0.getCachePeriods(page, activityIDs$default(this$0, page, false, 2, null)).toObservable().onErrorReturn(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.-$$Lambda$BaseActivityPeriodRepositoryImpl$gColesBPMfmaam7S78l0pUdKeoM
                @Override // io.reactivex.functions.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.BaseActivityPeriodRepositoryImpl.m3262all$lambda5$lambda1((java.lang.Throwable) obj);
                }
            });
        }
        return io.reactivex.Observable.concat(this$0.getCachePeriods(page, activityIDs$default(this$0, page, false, 2, null)).toObservable(), this$0.getCloudPeriods(page).subscribeOn(io.reactivex.schedulers.Schedulers.io()).doOnSuccess(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.-$$Lambda$BaseActivityPeriodRepositoryImpl$sCxoVrvDCbtch7gHMmPcZ3QhHSE
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.BaseActivityPeriodRepositoryImpl.m3263all$lambda5$lambda2(this.f$0, page, (java.util.List) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.-$$Lambda$BaseActivityPeriodRepositoryImpl$uNryZp9T0BidxK57zykid_oUV1Q
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.BaseActivityPeriodRepositoryImpl.m3264all$lambda5$lambda4(this.f$0, (java.util.List) obj);
            }
        }).toObservable().onErrorResumeNext(io.reactivex.Observable.empty())).subscribeOn(io.reactivex.schedulers.Schedulers.io());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: all$lambda-5$lambda-0, reason: not valid java name */
    public static final java.util.List m3261all$lambda5$lambda0(java.lang.Throwable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return kotlin.collections.CollectionsKt.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: all$lambda-5$lambda-1, reason: not valid java name */
    public static final java.util.List m3262all$lambda5$lambda1(java.lang.Throwable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return kotlin.collections.CollectionsKt.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: all$lambda-5$lambda-2, reason: not valid java name */
    public static final void m3263all$lambda5$lambda2(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.BaseActivityPeriodRepositoryImpl this$0, powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page page, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "$page");
        this$0.pageCache.put(page, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: all$lambda-5$lambda-4, reason: not valid java name */
    public static final io.reactivex.SingleSource m3264all$lambda5$lambda4(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.BaseActivityPeriodRepositoryImpl this$0, final java.util.List days) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(days, "days");
        return this$0.getSavePeriodsCompletable(days).toSingleDefault(days).onErrorReturn(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.-$$Lambda$BaseActivityPeriodRepositoryImpl$FZQiHq8-PACnrWEUE6Ne4XT5hjA
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.BaseActivityPeriodRepositoryImpl.m3265all$lambda5$lambda4$lambda3(days, (java.lang.Throwable) obj);
            }
        });
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.CacheRepository
    public void clearCache() {
        this.pageCache.clear();
    }

    public static /* synthetic */ kotlin.Pair activityIDs$default(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.BaseActivityPeriodRepositoryImpl baseActivityPeriodRepositoryImpl, powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page page, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: activityIDs");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return baseActivityPeriodRepositoryImpl.activityIDs(page, z);
    }
}
