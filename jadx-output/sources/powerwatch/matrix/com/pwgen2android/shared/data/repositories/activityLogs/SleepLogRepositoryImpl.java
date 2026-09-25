package powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs;

/* JADX INFO: compiled from: SleepLogRepository.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001e\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015H\u0016J\u0016\u0010\u0016\u001a\u00020\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0012H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepositoryImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepository;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/BaseLogRepositoryImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;", "sleepLogDao", "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao;", "sleepLogCloudService", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/SleepLogCloudService;", "googleFitController", "Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;", "metricsRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/SleepLogCloudService;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;)V", "copyItem", "item", "shouldSave", "", "getSaveCloudCompletable", "Lio/reactivex/Completable;", "kotlin.jvm.PlatformType", "logs", "", "getSaveLogsCompletable", "notSyncedCount", "", "sync", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SleepLogRepositoryImpl extends powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.BaseLogRepositoryImpl<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog> implements powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.SleepLogRepository {
    private final powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController googleFitController;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs.SleepLogCloudService sleepLogCloudService;
    private final powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.SleepLogDao sleepLogDao;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepLogRepositoryImpl(powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.SleepLogDao sleepLogDao, powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs.SleepLogCloudService sleepLogCloudService, powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController googleFitController, powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepository metricsRepository) {
        super(metricsRepository);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepLogDao, "sleepLogDao");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepLogCloudService, "sleepLogCloudService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googleFitController, "googleFitController");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsRepository, "metricsRepository");
        this.sleepLogDao = sleepLogDao;
        this.sleepLogCloudService = sleepLogCloudService;
        this.googleFitController = googleFitController;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.SyncDataRepository
    public long notSyncedCount() {
        return this.sleepLogDao.notSyncedLogsCount();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.SyncDataRepository
    public io.reactivex.Completable sync() {
        io.reactivex.Completable completableFlatMapCompletable = this.sleepLogDao.notSyncedLogs().flatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.-$$Lambda$SleepLogRepositoryImpl$1ZD9NBQot2BeZOO4O6rDrT_Er1w
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.SleepLogRepositoryImpl.m3249sync$lambda2(this.f$0, (java.util.List) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "sleepLogDao.notSyncedLogs()\n            .flatMapCompletable {\n                if (it.isEmpty()) return@flatMapCompletable Completable.complete()\n                sleepLogCloudService.saveAllSleepLogs(it)\n                        .doOnError { logUploadFailedError() }\n                        .andThen(sleepLogDao.deleteCompletable(it))\n                        .doOnComplete { googleFitController.saveSleepingLogs(it) }\n            }");
        return completableFlatMapCompletable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sync$lambda-2, reason: not valid java name */
    public static final io.reactivex.CompletableSource m3249sync$lambda2(final powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.SleepLogRepositoryImpl this$0, final java.util.List it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it.isEmpty() ? io.reactivex.Completable.complete() : this$0.sleepLogCloudService.saveAllSleepLogs(it).doOnError(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.-$$Lambda$SleepLogRepositoryImpl$MCiKyJ0TB86hCBp0ga0rlXjehTU
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.SleepLogRepositoryImpl.m3250sync$lambda2$lambda0(this.f$0, (java.lang.Throwable) obj);
            }
        }).andThen(this$0.sleepLogDao.deleteCompletable(it)).doOnComplete(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.-$$Lambda$SleepLogRepositoryImpl$h9NREUR1Xq9jlvzuhHV_HjYIwWc
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.SleepLogRepositoryImpl.m3251sync$lambda2$lambda1(this.f$0, it);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sync$lambda-2$lambda-0, reason: not valid java name */
    public static final void m3250sync$lambda2$lambda0(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.SleepLogRepositoryImpl this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.logUploadFailedError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sync$lambda-2$lambda-1, reason: not valid java name */
    public static final void m3251sync$lambda2$lambda1(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.SleepLogRepositoryImpl this$0, java.util.List it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "$it");
        this$0.googleFitController.saveSleepingLogs(it);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.BaseLogRepositoryImpl
    public io.reactivex.Completable getSaveLogsCompletable(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog> logs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logs, "logs");
        return this.sleepLogDao.saveCompletable(logs);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.BaseLogRepositoryImpl
    public powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog copyItem(powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog item, boolean shouldSave) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "item");
        return item.copy((1032191 & 1) != 0 ? item.getStartTime() : 0L, (1032191 & 2) != 0 ? item.getEndTime() : 0L, (1032191 & 4) != 0 ? item.getHeartRate() : 0.0f, (1032191 & 8) != 0 ? item.getBodyPower() : 0.0f, (1032191 & 16) != 0 ? item.getSolarPower() : 0.0f, (1032191 & 32) != 0 ? item.getSkinTemp() : 0.0f, (1032191 & 64) != 0 ? item.getMaxSkinTemp() : 0.0f, (1032191 & 128) != 0 ? item.getMinSkinTemp() : 0.0f, (1032191 & 256) != 0 ? item.getCaseTemp() : 0.0f, (1032191 & 512) != 0 ? item.getMaxCaseTemp() : 0.0f, (1032191 & 1024) != 0 ? item.getMinCaseTemp() : 0.0f, (1032191 & 2048) != 0 ? item.getActiveCalories() : 0, (1032191 & 4096) != 0 ? item.getSleepType() : null, (1032191 & 8192) != 0 ? item.getHrv() : 0.0f, (1032191 & 16384) != 0 ? item.getShouldSend() : shouldSave, (1032191 & 32768) != 0 ? item.getBmrCalories() : 0, (1032191 & 65536) != 0 ? item.getMinHeartRate() : 0, (1032191 & 131072) != 0 ? item.getMaxHeartRate() : 0, (1032191 & 262144) != 0 ? item.getEmail() : null, (1032191 & 524288) != 0 ? item.getMinsInPeriod() : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getSaveCloudCompletable$lambda-3, reason: not valid java name */
    public static final void m3248getSaveCloudCompletable$lambda3(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.SleepLogRepositoryImpl this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.logUploadFailedError();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.BaseLogRepositoryImpl
    public io.reactivex.Completable getSaveCloudCompletable(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog> logs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logs, "logs");
        return this.sleepLogCloudService.saveAllSleepLogs(logs).doOnError(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.-$$Lambda$SleepLogRepositoryImpl$rqqBO2yL__zFQOdo8BIp5Ga07c8
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.SleepLogRepositoryImpl.m3248getSaveCloudCompletable$lambda3(this.f$0, (java.lang.Throwable) obj);
            }
        });
    }
}
