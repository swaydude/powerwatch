package powerwatch.matrix.com.pwgen2android.shared.data.repositories;

/* JADX INFO: compiled from: GoalConfigurationRepository.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J$\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u000eH\u0016J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0016J\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u000eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepositoryImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;", "goalConfigDao", "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao;", "goalConfigCloudService", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/goalConfiguration/GoalConfigurationCloudService;", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/goalConfiguration/GoalConfigurationCloudService;)V", "all", "Lio/reactivex/Observable;", "", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;", "page", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;", "fromCache", "", "deleteAll", "Lio/reactivex/Completable;", "isEmpty", "load", "forceCache", "save", "item", "toCacheOnly", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class GoalConfigurationRepositoryImpl implements powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository {
    private static final java.lang.String TAG = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepositoryImpl.class).getSimpleName();
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.goalConfiguration.GoalConfigurationCloudService goalConfigCloudService;
    private final powerwatch.matrix.com.pwgen2android.shared.data.db.GoalConfigurationDao goalConfigDao;

    public GoalConfigurationRepositoryImpl(powerwatch.matrix.com.pwgen2android.shared.data.db.GoalConfigurationDao goalConfigDao, powerwatch.matrix.com.pwgen2android.shared.cloud.goalConfiguration.GoalConfigurationCloudService goalConfigCloudService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalConfigDao, "goalConfigDao");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalConfigCloudService, "goalConfigCloudService");
        this.goalConfigDao = goalConfigDao;
        this.goalConfigCloudService = goalConfigCloudService;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeleteAllRepository
    public io.reactivex.Completable deleteAll() {
        return this.goalConfigDao.deleteAllCompletable();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.ObserveRepository
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration> load(boolean fromCache, boolean forceCache) {
        return this.goalConfigDao.lastByCreated();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository
    public boolean isEmpty() {
        return this.goalConfigDao.count() == 0;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.AddRepository
    public io.reactivex.Completable save(final powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration item, boolean toCacheOnly) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "item");
        io.reactivex.Completable completableOnErrorResumeNext = this.goalConfigCloudService.save(item).andThen(this.goalConfigDao.addCompletable(kotlin.collections.CollectionsKt.listOf(item))).onErrorResumeNext(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.-$$Lambda$GoalConfigurationRepositoryImpl$paf69FG2tnX0VBo6WI-9iclVknQ
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepositoryImpl.m3209save$lambda0(this.f$0, item, (java.lang.Throwable) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableOnErrorResumeNext, "goalConfigCloudService.save(item)\n                .andThen(goalConfigDao.addCompletable(listOf(item)))\n                .onErrorResumeNext { goalConfigDao.addCompletable(listOf(item.copy(shouldSync = true))) }");
        return completableOnErrorResumeNext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: save$lambda-0, reason: not valid java name */
    public static final io.reactivex.CompletableSource m3209save$lambda0(powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepositoryImpl this$0, powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration item, java.lang.Throwable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "$item");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.goalConfigDao.addCompletable(kotlin.collections.CollectionsKt.listOf(item.copy((223 & 1) != 0 ? item.id : 0L, (223 & 2) != 0 ? item.calories : 0, (223 & 4) != 0 ? item.distance : 0.0f, (223 & 8) != 0 ? item.power : 0, (223 & 16) != 0 ? item.sleep : 0, (223 & 32) != 0 ? item.steps : 0, (223 & 64) != 0 ? item.createdAt : 0L, (223 & 128) != 0 ? item.shouldSync : true)));
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.AllRepository
    public io.reactivex.Observable<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration>> all(powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page page, boolean fromCache) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "page");
        io.reactivex.Single map = this.goalConfigCloudService.getAllConfigurations().flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.-$$Lambda$GoalConfigurationRepositoryImpl$NQzo_kP84K4Iu9QFGkKq6FFm7ho
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepositoryImpl.m3203all$lambda1(this.f$0, (java.util.List) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.-$$Lambda$GoalConfigurationRepositoryImpl$Emn8FPYLoCxoI9PYW5t-3Kyh-SE
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepositoryImpl.m3204all$lambda3((java.util.List) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(map, "goalConfigCloudService.getAllConfigurations()\n                .flatMap {\n                    // if somehow there are no goals defined, return default one\n                    if (it.isEmpty()) {\n                      return@flatMap  goalConfigDao.addCompletable(listOf(GoalConfiguration()))\n                                .toSingleDefault(it)\n                    }\n                   return@flatMap goalConfigDao.addCompletable(it)\n                            .toSingleDefault(it)\n\n                }\n                .map {\n                    it.sortedBy { it.createdAt }\n                }");
        if (!fromCache) {
            io.reactivex.Observable<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration>> observable = map.onErrorResumeNext(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.-$$Lambda$GoalConfigurationRepositoryImpl$V0emQFX9nP5BSMRDhFjK5-at3CQ
                @Override // io.reactivex.functions.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepositoryImpl.m3205all$lambda4(this.f$0, (java.lang.Throwable) obj);
                }
            }).toObservable();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observable, "cloud\n                    .onErrorResumeNext { goalConfigDao.all() }\n                    .toObservable()");
            return observable;
        }
        io.reactivex.Observable<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration>> observable2 = this.goalConfigDao.all().toObservable();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observable2, "goalConfigDao.all()\n                .toObservable()");
        return observable2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: all$lambda-1, reason: not valid java name */
    public static final io.reactivex.SingleSource m3203all$lambda1(powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepositoryImpl this$0, java.util.List it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        if (it.isEmpty()) {
            return this$0.goalConfigDao.addCompletable(kotlin.collections.CollectionsKt.listOf(new powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration(0L, 0, 0.0f, 0, 0, 0, 0L, false, 255, null))).toSingleDefault(it);
        }
        return this$0.goalConfigDao.addCompletable(it).toSingleDefault(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: all$lambda-3, reason: not valid java name */
    public static final java.util.List m3204all$lambda3(java.util.List it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return kotlin.collections.CollectionsKt.sortedWith(it, new java.util.Comparator<T>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepositoryImpl$all$lambda-3$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Long.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration) t).getCreatedAt()), java.lang.Long.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration) t2).getCreatedAt()));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: all$lambda-4, reason: not valid java name */
    public static final io.reactivex.SingleSource m3205all$lambda4(powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepositoryImpl this$0, java.lang.Throwable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.goalConfigDao.all();
    }
}
