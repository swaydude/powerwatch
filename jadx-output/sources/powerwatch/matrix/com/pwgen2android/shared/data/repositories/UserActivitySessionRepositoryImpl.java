package powerwatch.matrix.com.pwgen2android.shared.data.repositories;

/* JADX INFO: compiled from: UserActivitySessionRepository.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u001c\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u00172\u0006\u0010\u001a\u001a\u00020\u0012H\u0016J$\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00180\u00172\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001cH\u0016J\u001e\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00172\u0006\u0010%\u001a\u00020&2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010'\u001a\u00020 2\u0006\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020\u0013H\u0016J\u001e\u0010+\u001a\u00020\"2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00182\u0006\u0010-\u001a\u00020\u001eH\u0016J\u0016\u0010.\u001a\u00020\"2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0016J\b\u00100\u001a\u00020\"H\u0016J\u0010\u00101\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001cH\u0016R*\u0010\u0010\u001a\u001e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011j\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013`\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u0015\u001a\u001e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011j\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013`\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "userActivityCloudService", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityCloudService;", "userActivityDao", "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;", "googleFitController", "Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;", "stravaController", "Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;", "dbDataRecovery", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DBDataRecovery;", "metricsRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;", "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DBDataRecovery;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;)V", "activitiesPageCache", "Ljava/util/HashMap;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;", "", "Lkotlin/collections/HashMap;", "datesPageCache", "activityDates", "Lio/reactivex/Observable;", "", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityDate;", "page", "all", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;", "fromCache", "", "clearCache", "", "delete", "Lio/reactivex/Completable;", "item", "getOne", "id", "", "logUploadFailedError", "it", "", "notSyncedCount", "save", "items", "toCacheOnly", "saveActivityDates", "dates", "sync", "update", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class UserActivitySessionRepositoryImpl implements powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepository, powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    private final java.util.HashMap<powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page, java.lang.Long> activitiesPageCache;
    private final java.util.HashMap<powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page, java.lang.Long> datesPageCache;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.DBDataRecovery dbDataRecovery;
    private final powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController googleFitController;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepository metricsRepository;
    private final powerwatch.matrix.com.pwgen2android.strava.StravaController stravaController;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.userActivities.UserActivityCloudService userActivityCloudService;
    private final powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao userActivityDao;

    public UserActivitySessionRepositoryImpl(powerwatch.matrix.com.pwgen2android.shared.cloud.userActivities.UserActivityCloudService userActivityCloudService, powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao userActivityDao, powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController googleFitController, powerwatch.matrix.com.pwgen2android.strava.StravaController stravaController, powerwatch.matrix.com.pwgen2android.shared.data.repositories.DBDataRecovery dbDataRecovery, powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepository metricsRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userActivityCloudService, "userActivityCloudService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userActivityDao, "userActivityDao");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googleFitController, "googleFitController");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stravaController, "stravaController");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dbDataRecovery, "dbDataRecovery");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsRepository, "metricsRepository");
        this.userActivityCloudService = userActivityCloudService;
        this.userActivityDao = userActivityDao;
        this.googleFitController = googleFitController;
        this.stravaController = stravaController;
        this.dbDataRecovery = dbDataRecovery;
        this.metricsRepository = metricsRepository;
        this.activitiesPageCache = new java.util.HashMap<>();
        this.datesPageCache = new java.util.HashMap<>();
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.UpdateRepository
    public io.reactivex.Completable update(powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "item");
        io.reactivex.Completable completableAndThen = this.userActivityCloudService.updateUserActivity(item).andThen(this.userActivityDao.updateCompletable(item));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableAndThen, "userActivityCloudService.updateUserActivity(item)\n                .andThen(userActivityDao.updateCompletable(item))");
        return completableAndThen;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.SyncDataRepository
    public long notSyncedCount() {
        return this.userActivityDao.notSyncedCount();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.SyncDataRepository
    public io.reactivex.Completable sync() {
        io.reactivex.Completable completableFlatMapCompletable = this.userActivityDao.notSyncedSessions().doOnError(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.-$$Lambda$UserActivitySessionRepositoryImpl$osWwwHIXhRhHoADAVrBdPiKjOGE
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                ((java.lang.Throwable) obj).printStackTrace();
            }
        }).onErrorReturn(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.-$$Lambda$UserActivitySessionRepositoryImpl$f_FPumGbdsn-yzV4v5KGH57GyBA
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepositoryImpl.m3234sync$lambda1(this.f$0, (java.lang.Throwable) obj);
            }
        }).flatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.-$$Lambda$UserActivitySessionRepositoryImpl$vdipl1K0JZjTorA6yRV4XaROkiU
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepositoryImpl.m3235sync$lambda5(this.f$0, (java.util.List) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "userActivityDao.notSyncedSessions()\n            .doOnError {\n                it.printStackTrace()\n            }\n            .onErrorReturn {\n                if (it is SQLiteBlobTooBigException) {\n                    dbDataRecovery.loadNotSyncedActivities()\n                } else emptyList()\n            }\n            .flatMapCompletable {\n                if (it.isEmpty()) return@flatMapCompletable Completable.complete()\n                userActivityCloudService.saveUserActivities(it)\n                        .doOnError { logUploadFailedError(it) }\n                        .andThen(userActivityDao.saveCompletable(it.map { it.copy(shouldSend = false) }))\n                        .doOnComplete {\n                            stravaController.writeSessionList(it)\n                            googleFitController.writeSessionList(it)\n                        }\n            }");
        return completableFlatMapCompletable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sync$lambda-1, reason: not valid java name */
    public static final java.util.List m3234sync$lambda1(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepositoryImpl this$0, java.lang.Throwable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof android.database.sqlite.SQLiteBlobTooBigException) {
            return this$0.dbDataRecovery.loadNotSyncedActivities();
        }
        return kotlin.collections.CollectionsKt.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sync$lambda-5, reason: not valid java name */
    public static final io.reactivex.CompletableSource m3235sync$lambda5(final powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepositoryImpl this$0, final java.util.List it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        if (it.isEmpty()) {
            return io.reactivex.Completable.complete();
        }
        io.reactivex.Completable completableDoOnError = this$0.userActivityCloudService.saveUserActivities(it).doOnError(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.-$$Lambda$UserActivitySessionRepositoryImpl$J0QE1ES-_4mbRXWWxMAilQLc-bc
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepositoryImpl.m3236sync$lambda5$lambda2(this.f$0, (java.lang.Throwable) obj);
            }
        });
        powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao userActivitySessionDao = this$0.userActivityDao;
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> list = it;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        for (powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession userActivitySession : list) {
            arrayList.add(userActivitySession.copy((114673 & 1) != 0 ? userActivitySession.id : null, (114673 & 2) != 0 ? userActivitySession.name : null, (114673 & 4) != 0 ? userActivitySession.activityType : null, (114673 & 8) != 0 ? userActivitySession.locationName : null, (114673 & 16) != 0 ? userActivitySession.distance : 0.0f, (114673 & 32) != 0 ? userActivitySession.steps : 0, (114673 & 64) != 0 ? userActivitySession.startTime : 0L, (114673 & 128) != 0 ? userActivitySession.endTime : 0L, (114673 & 256) != 0 ? userActivitySession.pace : 0.0f, (114673 & 512) != 0 ? userActivitySession.activeCalories : 0, (114673 & 1024) != 0 ? userActivitySession.bmrCalories : 0, (114673 & 2048) != 0 ? userActivitySession.splits : null, (114673 & 4096) != 0 ? userActivitySession.gpsPositions : null, (114673 & 8192) != 0 ? userActivitySession.heartRates : null, (114673 & 16384) != 0 ? userActivitySession.notes : null, (114673 & 32768) != 0 ? userActivitySession.getShouldSend() : false, (114673 & 65536) != 0 ? userActivitySession.getEmail() : null));
        }
        return completableDoOnError.andThen(userActivitySessionDao.saveCompletable(arrayList)).doOnComplete(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.-$$Lambda$UserActivitySessionRepositoryImpl$-vMHza9s-bm_px2n-zwhtTX8Tf4
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepositoryImpl.m3237sync$lambda5$lambda4(this.f$0, it);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sync$lambda-5$lambda-2, reason: not valid java name */
    public static final void m3236sync$lambda5$lambda2(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepositoryImpl this$0, java.lang.Throwable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        this$0.logUploadFailedError(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sync$lambda-5$lambda-4, reason: not valid java name */
    public static final void m3237sync$lambda5$lambda4(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepositoryImpl this$0, java.util.List it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "$it");
        this$0.stravaController.writeSessionList(it);
        this$0.googleFitController.writeSessionList(it);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.AddAllRepository
    public io.reactivex.Completable save(final java.util.List<? extends powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> items, boolean toCacheOnly) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "items");
        if (items.isEmpty()) {
            io.reactivex.Completable completableComplete = io.reactivex.Completable.complete();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableComplete, "complete()");
            return completableComplete;
        }
        if (toCacheOnly) {
            powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao userActivitySessionDao = this.userActivityDao;
            java.util.List<? extends powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> list = items;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            for (powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession userActivitySession : list) {
                arrayList.add(userActivitySession.copy((114673 & 1) != 0 ? userActivitySession.id : null, (114673 & 2) != 0 ? userActivitySession.name : null, (114673 & 4) != 0 ? userActivitySession.activityType : null, (114673 & 8) != 0 ? userActivitySession.locationName : null, (114673 & 16) != 0 ? userActivitySession.distance : 0.0f, (114673 & 32) != 0 ? userActivitySession.steps : 0, (114673 & 64) != 0 ? userActivitySession.startTime : 0L, (114673 & 128) != 0 ? userActivitySession.endTime : 0L, (114673 & 256) != 0 ? userActivitySession.pace : 0.0f, (114673 & 512) != 0 ? userActivitySession.activeCalories : 0, (114673 & 1024) != 0 ? userActivitySession.bmrCalories : 0, (114673 & 2048) != 0 ? userActivitySession.splits : null, (114673 & 4096) != 0 ? userActivitySession.gpsPositions : null, (114673 & 8192) != 0 ? userActivitySession.heartRates : null, (114673 & 16384) != 0 ? userActivitySession.notes : null, (114673 & 32768) != 0 ? userActivitySession.getShouldSend() : true, (114673 & 65536) != 0 ? userActivitySession.getEmail() : null));
            }
            return userActivitySessionDao.saveCompletable(arrayList);
        }
        io.reactivex.Completable completableOnErrorResumeNext = this.userActivityCloudService.saveUserActivities(items).doOnError(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.-$$Lambda$UserActivitySessionRepositoryImpl$Y_nIRflsXqYwsVVOaOIMAmqGap4
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepositoryImpl.m3231save$lambda7(this.f$0, (java.lang.Throwable) obj);
            }
        }).andThen(this.userActivityDao.saveCompletable(items)).onErrorResumeNext(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.-$$Lambda$UserActivitySessionRepositoryImpl$FdRL_e3Eolm7cWH_J1azXAkcxtM
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepositoryImpl.m3232save$lambda9(this.f$0, items, (java.lang.Throwable) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableOnErrorResumeNext, "userActivityCloudService.saveUserActivities(items)\n                .doOnError { logUploadFailedError(it) }\n                .andThen(userActivityDao.saveCompletable(items))\n                .onErrorResumeNext {\n                    userActivityDao.saveCompletable(items.map { it.copy(shouldSend = true) })\n                }");
        return completableOnErrorResumeNext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: save$lambda-7, reason: not valid java name */
    public static final void m3231save$lambda7(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepositoryImpl this$0, java.lang.Throwable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        this$0.logUploadFailedError(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: save$lambda-9, reason: not valid java name */
    public static final io.reactivex.CompletableSource m3232save$lambda9(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepositoryImpl this$0, java.util.List items, java.lang.Throwable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "$items");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao userActivitySessionDao = this$0.userActivityDao;
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> list = items;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        for (powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession userActivitySession : list) {
            arrayList.add(userActivitySession.copy((114673 & 1) != 0 ? userActivitySession.id : null, (114673 & 2) != 0 ? userActivitySession.name : null, (114673 & 4) != 0 ? userActivitySession.activityType : null, (114673 & 8) != 0 ? userActivitySession.locationName : null, (114673 & 16) != 0 ? userActivitySession.distance : 0.0f, (114673 & 32) != 0 ? userActivitySession.steps : 0, (114673 & 64) != 0 ? userActivitySession.startTime : 0L, (114673 & 128) != 0 ? userActivitySession.endTime : 0L, (114673 & 256) != 0 ? userActivitySession.pace : 0.0f, (114673 & 512) != 0 ? userActivitySession.activeCalories : 0, (114673 & 1024) != 0 ? userActivitySession.bmrCalories : 0, (114673 & 2048) != 0 ? userActivitySession.splits : null, (114673 & 4096) != 0 ? userActivitySession.gpsPositions : null, (114673 & 8192) != 0 ? userActivitySession.heartRates : null, (114673 & 16384) != 0 ? userActivitySession.notes : null, (114673 & 32768) != 0 ? userActivitySession.getShouldSend() : true, (114673 & 65536) != 0 ? userActivitySession.getEmail() : null));
        }
        return userActivitySessionDao.saveCompletable(arrayList);
    }

    private final void logUploadFailedError(java.lang.Throwable it) {
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this, "Error saving to cloud: " + ((java.lang.Object) it.getClass().getSimpleName()) + ' ' + ((java.lang.Object) it.getMessage()), null, 2, null);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.GetOneRepository
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> getOne(final java.lang.String id, boolean fromCache) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "id");
        if (fromCache) {
            io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> observable = this.userActivityDao.getOne(id).onErrorResumeNext(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.-$$Lambda$UserActivitySessionRepositoryImpl$SkTcFKU5cK166opN2z4iqzCF22M
                @Override // io.reactivex.functions.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepositoryImpl.m3223getOne$lambda10(this.f$0, id, (java.lang.Throwable) obj);
                }
            }).switchIfEmpty(io.reactivex.Single.error(new java.lang.Throwable("Activity not found!"))).toObservable();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observable, "userActivityDao.getOne(id)\n                    .onErrorResumeNext (Function {\n                        if (it is SQLiteBlobTooBigException) {\n                            val activity = dbDataRecovery.loadSingleActivity(id)\n                            if (activity != null) Maybe.just(activity) else Maybe.error(it)\n                        } else Maybe.error(it)\n                    })\n                    .switchIfEmpty(Single.error(Throwable(\"Activity not found!\")))\n                    .toObservable()");
            return observable;
        }
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> observableConcat = io.reactivex.Observable.concat(this.userActivityDao.getOne(id).onErrorResumeNext(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.-$$Lambda$UserActivitySessionRepositoryImpl$bBG8YnZ9BSuGrvxY0n7RwHhO0Mo
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepositoryImpl.m3224getOne$lambda11(this.f$0, id, (java.lang.Throwable) obj);
            }
        }).toObservable(), this.userActivityCloudService.getOneUserActivity(id).toObservable());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableConcat, "concat(userActivityDao.getOne(id)\n                .onErrorResumeNext (Function {\n                    if (it is SQLiteBlobTooBigException) {\n                        val activity = dbDataRecovery.loadSingleActivity(id)\n                        if (activity != null) Maybe.just(activity) else Maybe.error(it)\n                    } else Maybe.error(it)\n                }).toObservable(),\n                userActivityCloudService.getOneUserActivity(id).toObservable())");
        return observableConcat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getOne$lambda-10, reason: not valid java name */
    public static final io.reactivex.Maybe m3223getOne$lambda10(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepositoryImpl this$0, java.lang.String id, java.lang.Throwable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "$id");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof android.database.sqlite.SQLiteBlobTooBigException) {
            powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession userActivitySessionLoadSingleActivity = this$0.dbDataRecovery.loadSingleActivity(id);
            return userActivitySessionLoadSingleActivity != null ? io.reactivex.Maybe.just(userActivitySessionLoadSingleActivity) : io.reactivex.Maybe.error(it);
        }
        return io.reactivex.Maybe.error(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getOne$lambda-11, reason: not valid java name */
    public static final io.reactivex.Maybe m3224getOne$lambda11(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepositoryImpl this$0, java.lang.String id, java.lang.Throwable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "$id");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof android.database.sqlite.SQLiteBlobTooBigException) {
            powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession userActivitySessionLoadSingleActivity = this$0.dbDataRecovery.loadSingleActivity(id);
            return userActivitySessionLoadSingleActivity != null ? io.reactivex.Maybe.just(userActivitySessionLoadSingleActivity) : io.reactivex.Maybe.error(it);
        }
        return io.reactivex.Maybe.error(it);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeleteRepository
    public io.reactivex.Completable delete(powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "item");
        io.reactivex.Completable completableAndThen = this.userActivityCloudService.deleteUserActivity(item).andThen(this.userActivityDao.deleteCompletable(item)).andThen(this.userActivityDao.deleteActivityDateCompletable(item.getStartTime()));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableAndThen, "userActivityCloudService.deleteUserActivity(item)\n                .andThen(userActivityDao.deleteCompletable(item))\n                .andThen(userActivityDao.deleteActivityDateCompletable(item.startTime))");
        return completableAndThen;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.AllRepository
    public io.reactivex.Observable<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession>> all(final powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page page, final boolean fromCache) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "page");
        io.reactivex.Observable<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession>> observableDefer = io.reactivex.Observable.defer(new java.util.concurrent.Callable() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.-$$Lambda$UserActivitySessionRepositoryImpl$jXOXtEUDDwI1cNE34uO5x5RiJ94
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepositoryImpl.m3217all$lambda17(page, this, fromCache);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableDefer, "defer {\n\n        val startEndTime = page.dayStartEndTime()\n        val cloudObs = userActivityCloudService.getAllUserActivities(page)\n\n                .flatMap {\n                    userActivityDao.saveCompletable(it)\n                            .toSingleDefault(it)\n                }\n                .doOnSuccess {\n                    activitiesPageCache[page] = System.currentTimeMillis()\n                }\n                .toObservable()\n\n        if (fromCache) {\n            return@defer userActivityDao.getAll(startEndTime.first, startEndTime.second).toObservable()\n                    .onErrorReturn {\n                        if (it is SQLiteBlobTooBigException) {\n                            dbDataRecovery.loadActivities(startEndTime.first, startEndTime.second)\n                        } else emptyList()\n                    }\n        }\n\n        val lastSuccessStoredTime = activitiesPageCache[page]\n        if (!page.isPageExpired(lastSuccessStoredTime)) {\n            return@defer userActivityDao.getAll(startEndTime.first, startEndTime.second)\n                    .onErrorReturn {\n                        if (it is SQLiteBlobTooBigException) {\n                            dbDataRecovery.loadActivities(startEndTime.first, startEndTime.second)\n                        } else emptyList()\n                    }\n                    .toObservable()\n        }\n\n        Observable.concat(\n                userActivityDao.getAll(startEndTime.first, startEndTime.second).toObservable()\n                        .onErrorReturn {\n                            if (it is SQLiteBlobTooBigException) {\n                                dbDataRecovery.loadActivities(startEndTime.first, startEndTime.second)\n                            } else emptyList()\n                        },\n                cloudObs)\n    }");
        return observableDefer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: all$lambda-17, reason: not valid java name */
    public static final io.reactivex.ObservableSource m3217all$lambda17(final powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page page, final powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepositoryImpl this$0, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "$page");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        final kotlin.Pair<java.lang.Long, java.lang.Long> pairDayStartEndTime = powerwatch.matrix.com.pwgen2android.shared.extensions.ActivityPeriodsExtensionsKt.dayStartEndTime(page);
        io.reactivex.Observable observable = this$0.userActivityCloudService.getAllUserActivities(page).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.-$$Lambda$UserActivitySessionRepositoryImpl$PkiE3cwUcvM1kD_QTGsG1mYmnSU
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepositoryImpl.m3218all$lambda17$lambda12(this.f$0, (java.util.List) obj);
            }
        }).doOnSuccess(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.-$$Lambda$UserActivitySessionRepositoryImpl$l57-ImDqJZBn5IvbetDdLZQdL3c
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepositoryImpl.m3219all$lambda17$lambda13(this.f$0, page, (java.util.List) obj);
            }
        }).toObservable();
        if (z) {
            return this$0.userActivityDao.getAll(pairDayStartEndTime.getFirst().longValue(), pairDayStartEndTime.getSecond().longValue()).toObservable().onErrorReturn(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.-$$Lambda$UserActivitySessionRepositoryImpl$9uYYw0o-ne_TRYOrBX6z1INb2qg
                @Override // io.reactivex.functions.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepositoryImpl.m3220all$lambda17$lambda14(this.f$0, pairDayStartEndTime, (java.lang.Throwable) obj);
                }
            });
        }
        if (!page.isPageExpired(this$0.activitiesPageCache.get(page))) {
            return this$0.userActivityDao.getAll(pairDayStartEndTime.getFirst().longValue(), pairDayStartEndTime.getSecond().longValue()).onErrorReturn(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.-$$Lambda$UserActivitySessionRepositoryImpl$5bYTV0LliNpZjKS3GI_nuq0qEFs
                @Override // io.reactivex.functions.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepositoryImpl.m3221all$lambda17$lambda15(this.f$0, pairDayStartEndTime, (java.lang.Throwable) obj);
                }
            }).toObservable();
        }
        return io.reactivex.Observable.concat(this$0.userActivityDao.getAll(pairDayStartEndTime.getFirst().longValue(), pairDayStartEndTime.getSecond().longValue()).toObservable().onErrorReturn(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.-$$Lambda$UserActivitySessionRepositoryImpl$v3soeJM0LUvqQkM29xTLhtaXkHo
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepositoryImpl.m3222all$lambda17$lambda16(this.f$0, pairDayStartEndTime, (java.lang.Throwable) obj);
            }
        }), observable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: all$lambda-17$lambda-12, reason: not valid java name */
    public static final io.reactivex.SingleSource m3218all$lambda17$lambda12(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepositoryImpl this$0, java.util.List it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.userActivityDao.saveCompletable(it).toSingleDefault(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: all$lambda-17$lambda-13, reason: not valid java name */
    public static final void m3219all$lambda17$lambda13(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepositoryImpl this$0, powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page page, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "$page");
        this$0.activitiesPageCache.put(page, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: all$lambda-17$lambda-14, reason: not valid java name */
    public static final java.util.List m3220all$lambda17$lambda14(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepositoryImpl this$0, kotlin.Pair startEndTime, java.lang.Throwable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startEndTime, "$startEndTime");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof android.database.sqlite.SQLiteBlobTooBigException) {
            return this$0.dbDataRecovery.loadActivities(((java.lang.Number) startEndTime.getFirst()).longValue(), ((java.lang.Number) startEndTime.getSecond()).longValue());
        }
        return kotlin.collections.CollectionsKt.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: all$lambda-17$lambda-15, reason: not valid java name */
    public static final java.util.List m3221all$lambda17$lambda15(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepositoryImpl this$0, kotlin.Pair startEndTime, java.lang.Throwable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startEndTime, "$startEndTime");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof android.database.sqlite.SQLiteBlobTooBigException) {
            return this$0.dbDataRecovery.loadActivities(((java.lang.Number) startEndTime.getFirst()).longValue(), ((java.lang.Number) startEndTime.getSecond()).longValue());
        }
        return kotlin.collections.CollectionsKt.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: all$lambda-17$lambda-16, reason: not valid java name */
    public static final java.util.List m3222all$lambda17$lambda16(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepositoryImpl this$0, kotlin.Pair startEndTime, java.lang.Throwable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startEndTime, "$startEndTime");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof android.database.sqlite.SQLiteBlobTooBigException) {
            return this$0.dbDataRecovery.loadActivities(((java.lang.Number) startEndTime.getFirst()).longValue(), ((java.lang.Number) startEndTime.getSecond()).longValue());
        }
        return kotlin.collections.CollectionsKt.emptyList();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.CacheRepository
    public void clearCache() {
        this.activitiesPageCache.clear();
        this.datesPageCache.clear();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepository
    public io.reactivex.Completable saveActivityDates(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityDate> dates) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dates, "dates");
        return this.userActivityDao.saveActivityDatesCompletable(dates);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepository
    public io.reactivex.Observable<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityDate>> activityDates(final powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page page) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "page");
        if (!page.isPageExpired(this.datesPageCache.get(page))) {
            return this.userActivityDao.allActivityDates();
        }
        io.reactivex.Observable<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityDate>> observableMerge = io.reactivex.Observable.merge(this.userActivityCloudService.getAllUserActivityDates(page).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.-$$Lambda$UserActivitySessionRepositoryImpl$lGvI7wfw15hraZj0a0bAwVaxNi0
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepositoryImpl.m3215activityDates$lambda18(this.f$0, (java.util.List) obj);
            }
        }).doOnSuccess(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.-$$Lambda$UserActivitySessionRepositoryImpl$JfMYBmUfb1eEnLGL1OF3HD8M-lk
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepositoryImpl.m3216activityDates$lambda19(this.f$0, page, (java.util.List) obj);
            }
        }).toObservable().onErrorResumeNext(this.userActivityDao.allActivityDates()), this.userActivityDao.allActivityDates());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableMerge, "merge(userActivityCloudService.getAllUserActivityDates(page)\n\n                .flatMap { userActivityDao.saveActivityDatesCompletable(it).toSingleDefault(it) }\n                .doOnSuccess {\n                    datesPageCache[page] = System.currentTimeMillis()\n                }\n                .toObservable()\n                .onErrorResumeNext(userActivityDao.allActivityDates()),\n                userActivityDao.allActivityDates())");
        return observableMerge;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: activityDates$lambda-18, reason: not valid java name */
    public static final io.reactivex.SingleSource m3215activityDates$lambda18(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepositoryImpl this$0, java.util.List it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.userActivityDao.saveActivityDatesCompletable(it).toSingleDefault(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: activityDates$lambda-19, reason: not valid java name */
    public static final void m3216activityDates$lambda19(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepositoryImpl this$0, powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page page, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "$page");
        this$0.datesPageCache.put(page, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }
}
