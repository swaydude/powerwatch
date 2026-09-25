package powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs;

/* JADX INFO: compiled from: RestingLogRepository.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004B%\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001e\u0010\u0012\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016H\u0016J\u0016\u0010\u0017\u001a\u00020\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0013H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepositoryImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepository;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/BaseLogRepositoryImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingLog;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "restingLogDao", "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/RestingLogDao;", "restingLogCloudService", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/RestingLogCloudService;", "googleFitController", "Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;", "metricsRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/RestingLogDao;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/RestingLogCloudService;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;)V", "copyItem", "item", "shouldSave", "", "getSaveCloudCompletable", "Lio/reactivex/Completable;", "kotlin.jvm.PlatformType", "logs", "", "getSaveLogsCompletable", "notSyncedCount", "", "sync", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class RestingLogRepositoryImpl extends powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.BaseLogRepositoryImpl<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingLog> implements powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.RestingLogRepository, powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    private final powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController googleFitController;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs.RestingLogCloudService restingLogCloudService;
    private final powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.RestingLogDao restingLogDao;

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RestingLogRepositoryImpl(powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.RestingLogDao restingLogDao, powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs.RestingLogCloudService restingLogCloudService, powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController googleFitController, powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepository metricsRepository) {
        super(metricsRepository);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingLogDao, "restingLogDao");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingLogCloudService, "restingLogCloudService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googleFitController, "googleFitController");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsRepository, "metricsRepository");
        this.restingLogDao = restingLogDao;
        this.restingLogCloudService = restingLogCloudService;
        this.googleFitController = googleFitController;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.SyncDataRepository
    public long notSyncedCount() {
        return this.restingLogDao.notSyncedLogsCount();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.SyncDataRepository
    public io.reactivex.Completable sync() {
        io.reactivex.Completable completableFlatMapCompletable = this.restingLogDao.notSyncedLogs().flatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.-$$Lambda$RestingLogRepositoryImpl$MGJsAMhkIF8WJgGHFCpRQGMAdfE
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.RestingLogRepositoryImpl.m3244sync$lambda3(this.f$0, (java.util.List) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "restingLogDao.notSyncedLogs()\n            .flatMapCompletable {\n                if (it.isEmpty()) return@flatMapCompletable Completable.complete()\n                restingLogCloudService.saveAllRestingLogs(it)\n                        .doOnComplete { debug(\"Saved resting data to cloud, size: ${it.size}\") }\n                        .doOnError {error ->\n                            debug(\"Error saving resting data to cloud\")\n                            error.printStackTrace()\n                            logUploadFailedError()\n                        }\n                        .andThen(restingLogDao.deleteCompletable(it))\n                        .doOnComplete { googleFitController.saveRestingLogs(it) }\n            }");
        return completableFlatMapCompletable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sync$lambda-3, reason: not valid java name */
    public static final io.reactivex.CompletableSource m3244sync$lambda3(final powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.RestingLogRepositoryImpl this$0, final java.util.List it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it.isEmpty() ? io.reactivex.Completable.complete() : this$0.restingLogCloudService.saveAllRestingLogs(it).doOnComplete(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.-$$Lambda$RestingLogRepositoryImpl$3u0X7dFwYrazPBwknBXvdEyGipA
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.RestingLogRepositoryImpl.m3245sync$lambda3$lambda0(this.f$0, it);
            }
        }).doOnError(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.-$$Lambda$RestingLogRepositoryImpl$bdkkx6PWzv9SiKFFmP6HS5b-Lr0
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.RestingLogRepositoryImpl.m3246sync$lambda3$lambda1(this.f$0, (java.lang.Throwable) obj);
            }
        }).andThen(this$0.restingLogDao.deleteCompletable(it)).doOnComplete(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.-$$Lambda$RestingLogRepositoryImpl$S-VYDKuJAwCC17q6jvuI991MdUE
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.RestingLogRepositoryImpl.m3247sync$lambda3$lambda2(this.f$0, it);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sync$lambda-3$lambda-0, reason: not valid java name */
    public static final void m3245sync$lambda3$lambda0(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.RestingLogRepositoryImpl this$0, java.util.List it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "$it");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, kotlin.jvm.internal.Intrinsics.stringPlus("Saved resting data to cloud, size: ", java.lang.Integer.valueOf(it.size())), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sync$lambda-3$lambda-1, reason: not valid java name */
    public static final void m3246sync$lambda3$lambda1(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.RestingLogRepositoryImpl this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Error saving resting data to cloud", null, 2, null);
        th.printStackTrace();
        this$0.logUploadFailedError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sync$lambda-3$lambda-2, reason: not valid java name */
    public static final void m3247sync$lambda3$lambda2(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.RestingLogRepositoryImpl this$0, java.util.List it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "$it");
        this$0.googleFitController.saveRestingLogs(it);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.BaseLogRepositoryImpl
    public io.reactivex.Completable getSaveLogsCompletable(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingLog> logs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logs, "logs");
        return this.restingLogDao.saveCompletable(logs);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.BaseLogRepositoryImpl
    public powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingLog copyItem(powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingLog item, boolean shouldSave) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "item");
        return item.copy((516095 & 1) != 0 ? item.getStartTime() : 0L, (516095 & 2) != 0 ? item.getEndTime() : 0L, (516095 & 4) != 0 ? item.getHeartRate() : 0.0f, (516095 & 8) != 0 ? item.getBodyPower() : 0.0f, (516095 & 16) != 0 ? item.getSolarPower() : 0.0f, (516095 & 32) != 0 ? item.getSkinTemp() : 0.0f, (516095 & 64) != 0 ? item.getMaxSkinTemp() : 0.0f, (516095 & 128) != 0 ? item.getMinSkinTemp() : 0.0f, (516095 & 256) != 0 ? item.getCaseTemp() : 0.0f, (516095 & 512) != 0 ? item.getMaxCaseTemp() : 0.0f, (516095 & 1024) != 0 ? item.getMinCaseTemp() : 0.0f, (516095 & 2048) != 0 ? item.getActiveCalories() : 0, (516095 & 4096) != 0 ? item.getHrv() : 0.0f, (516095 & 8192) != 0 ? item.getShouldSend() : shouldSave, (516095 & 16384) != 0 ? item.getBmrCalories() : 0, (516095 & 32768) != 0 ? item.getMinHeartRate() : 0, (516095 & 65536) != 0 ? item.getMaxHeartRate() : 0, (516095 & 131072) != 0 ? item.getEmail() : null, (516095 & 262144) != 0 ? item.getMinsInPeriod() : 0);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.BaseLogRepositoryImpl
    public io.reactivex.Completable getSaveCloudCompletable(final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingLog> logs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logs, "logs");
        return this.restingLogCloudService.saveAllRestingLogs(logs).doOnComplete(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.-$$Lambda$RestingLogRepositoryImpl$qNiLVtIkpmw6vp0R3MH7pnelrg8
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.RestingLogRepositoryImpl.m3240getSaveCloudCompletable$lambda4(this.f$0, logs);
            }
        }).doOnError(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.-$$Lambda$RestingLogRepositoryImpl$AlMKNWw1iI0gBSMUZRjqgtgXnKw
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.RestingLogRepositoryImpl.m3241getSaveCloudCompletable$lambda5(this.f$0, (java.lang.Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getSaveCloudCompletable$lambda-4, reason: not valid java name */
    public static final void m3240getSaveCloudCompletable$lambda4(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.RestingLogRepositoryImpl this$0, java.util.List logs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logs, "$logs");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, kotlin.jvm.internal.Intrinsics.stringPlus("Saved resting data to cloud, size: ", java.lang.Integer.valueOf(logs.size())), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getSaveCloudCompletable$lambda-5, reason: not valid java name */
    public static final void m3241getSaveCloudCompletable$lambda5(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.RestingLogRepositoryImpl this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Error saving resting data to cloud", null, 2, null);
        th.printStackTrace();
        this$0.logUploadFailedError();
    }
}
