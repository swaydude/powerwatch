package powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs;

/* JADX INFO: compiled from: WalkingLogRepository.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001e\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015H\u0016J\u0016\u0010\u0016\u001a\u00020\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0012H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepositoryImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepository;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/BaseLogRepositoryImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;", "walkingLogDao", "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/WalkingLogDao;", "walkingLogCloudService", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/WalkingLogCloudService;", "googleFitController", "Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;", "metricsRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/WalkingLogDao;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/WalkingLogCloudService;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;)V", "copyItem", "item", "shouldSave", "", "getSaveCloudCompletable", "Lio/reactivex/Completable;", "kotlin.jvm.PlatformType", "logs", "", "getSaveLogsCompletable", "notSyncedCount", "", "sync", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class WalkingLogRepositoryImpl extends powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.BaseLogRepositoryImpl<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingLog> implements powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.WalkingLogRepository {
    private final powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController googleFitController;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs.WalkingLogCloudService walkingLogCloudService;
    private final powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.WalkingLogDao walkingLogDao;

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.WalkingLogRepository.DefaultImpls.getKoin(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalkingLogRepositoryImpl(powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.WalkingLogDao walkingLogDao, powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs.WalkingLogCloudService walkingLogCloudService, powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController googleFitController, powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepository metricsRepository) {
        super(metricsRepository);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingLogDao, "walkingLogDao");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingLogCloudService, "walkingLogCloudService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googleFitController, "googleFitController");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsRepository, "metricsRepository");
        this.walkingLogDao = walkingLogDao;
        this.walkingLogCloudService = walkingLogCloudService;
        this.googleFitController = googleFitController;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.SyncDataRepository
    public long notSyncedCount() {
        return this.walkingLogDao.notSyncedLogsCount();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.SyncDataRepository
    public io.reactivex.Completable sync() {
        io.reactivex.Completable completableFlatMapCompletable = this.walkingLogDao.notSyncedLogs().flatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.-$$Lambda$WalkingLogRepositoryImpl$otjVEJEiXKfEnA2bkxlla8OLItM
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.WalkingLogRepositoryImpl.m3256sync$lambda3(this.f$0, (java.util.List) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "walkingLogDao.notSyncedLogs()\n            .flatMapCompletable {\n                if (it.isEmpty()) return@flatMapCompletable Completable.complete()\n                walkingLogCloudService.saveAllWalkingLogs(it)\n                        .doOnComplete { debug(\"Saved walking data to cloud, size: ${it.size}\") }\n                        .doOnError {error ->\n                            error(\"Error saving walking data to cloud - ${error.javaClass.simpleName} , ${error.message}\", error)\n                            error.printStackTrace()\n                            logUploadFailedError()\n                        }\n                        .andThen(walkingLogDao.deleteCompletable(it))\n                        .doOnComplete { googleFitController.saveWalkingLogs(it) }\n            }");
        return completableFlatMapCompletable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sync$lambda-3, reason: not valid java name */
    public static final io.reactivex.CompletableSource m3256sync$lambda3(final powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.WalkingLogRepositoryImpl this$0, final java.util.List it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it.isEmpty() ? io.reactivex.Completable.complete() : this$0.walkingLogCloudService.saveAllWalkingLogs(it).doOnComplete(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.-$$Lambda$WalkingLogRepositoryImpl$XX-odWKzWI--jV6EGf1F3XYbM4c
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.WalkingLogRepositoryImpl.m3257sync$lambda3$lambda0(this.f$0, it);
            }
        }).doOnError(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.-$$Lambda$WalkingLogRepositoryImpl$m6iMJDk4WrJIHHM4RYsXQeGeii4
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.WalkingLogRepositoryImpl.m3258sync$lambda3$lambda1(this.f$0, (java.lang.Throwable) obj);
            }
        }).andThen(this$0.walkingLogDao.deleteCompletable(it)).doOnComplete(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.-$$Lambda$WalkingLogRepositoryImpl$REFAuHOZkezru8e91Tv16KDskTI
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.WalkingLogRepositoryImpl.m3259sync$lambda3$lambda2(this.f$0, it);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sync$lambda-3$lambda-0, reason: not valid java name */
    public static final void m3257sync$lambda3$lambda0(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.WalkingLogRepositoryImpl this$0, java.util.List it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "$it");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, kotlin.jvm.internal.Intrinsics.stringPlus("Saved walking data to cloud, size: ", java.lang.Integer.valueOf(it.size())), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sync$lambda-3$lambda-1, reason: not valid java name */
    public static final void m3258sync$lambda3$lambda1(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.WalkingLogRepositoryImpl this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.error$default(this$0, "Error saving walking data to cloud - " + ((java.lang.Object) th.getClass().getSimpleName()) + " , " + ((java.lang.Object) th.getMessage()), th, null, 4, null);
        th.printStackTrace();
        this$0.logUploadFailedError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sync$lambda-3$lambda-2, reason: not valid java name */
    public static final void m3259sync$lambda3$lambda2(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.WalkingLogRepositoryImpl this$0, java.util.List it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "$it");
        this$0.googleFitController.saveWalkingLogs(it);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.BaseLogRepositoryImpl
    public io.reactivex.Completable getSaveLogsCompletable(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingLog> logs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logs, "logs");
        return this.walkingLogDao.saveCompletable(logs);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.BaseLogRepositoryImpl
    public powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingLog copyItem(powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingLog item, boolean shouldSave) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "item");
        return item.copy((2064383 & 1) != 0 ? item.getStartTime() : 0L, (2064383 & 2) != 0 ? item.getSteps() : 0, (2064383 & 4) != 0 ? item.getDistance() : 0.0d, (2064383 & 8) != 0 ? item.getEndTime() : 0L, (2064383 & 16) != 0 ? item.getHeartRate() : 0.0f, (2064383 & 32) != 0 ? item.getBodyPower() : 0.0f, (2064383 & 64) != 0 ? item.getSolarPower() : 0.0f, (2064383 & 128) != 0 ? item.getSkinTemp() : 0.0f, (2064383 & 256) != 0 ? item.getMaxSkinTemp() : 0.0f, (2064383 & 512) != 0 ? item.getMinSkinTemp() : 0.0f, (2064383 & 1024) != 0 ? item.getCaseTemp() : 0.0f, (2064383 & 2048) != 0 ? item.getMaxCaseTemp() : 0.0f, (2064383 & 4096) != 0 ? item.getMinCaseTemp() : 0.0f, (2064383 & 8192) != 0 ? item.getActiveCalories() : 0, (2064383 & 16384) != 0 ? item.getHrv() : 0.0f, (2064383 & 32768) != 0 ? item.getShouldSend() : shouldSave, (2064383 & 65536) != 0 ? item.getBmrCalories() : 0, (2064383 & 131072) != 0 ? item.getMinHeartRate() : 0, (2064383 & 262144) != 0 ? item.getMaxHeartRate() : 0, (2064383 & 524288) != 0 ? item.getEmail() : null, (2064383 & 1048576) != 0 ? item.getMinsInPeriod() : 0);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.BaseLogRepositoryImpl
    public io.reactivex.Completable getSaveCloudCompletable(final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingLog> logs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logs, "logs");
        return this.walkingLogCloudService.saveAllWalkingLogs(logs).doOnComplete(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.-$$Lambda$WalkingLogRepositoryImpl$-ntGgPfNQ1rQaHpNsyRQmldMoP0
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.WalkingLogRepositoryImpl.m3252getSaveCloudCompletable$lambda4(this.f$0, logs);
            }
        }).doOnError(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.-$$Lambda$WalkingLogRepositoryImpl$vZcgdkUE9unU3dsOIG2DwAC8EmQ
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.WalkingLogRepositoryImpl.m3253getSaveCloudCompletable$lambda5(this.f$0, (java.lang.Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getSaveCloudCompletable$lambda-4, reason: not valid java name */
    public static final void m3252getSaveCloudCompletable$lambda4(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.WalkingLogRepositoryImpl this$0, java.util.List logs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logs, "$logs");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, kotlin.jvm.internal.Intrinsics.stringPlus("Saved walking data to cloud, size: ", java.lang.Integer.valueOf(logs.size())), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getSaveCloudCompletable$lambda-5, reason: not valid java name */
    public static final void m3253getSaveCloudCompletable$lambda5(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.WalkingLogRepositoryImpl this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.logUploadFailedError();
    }
}
