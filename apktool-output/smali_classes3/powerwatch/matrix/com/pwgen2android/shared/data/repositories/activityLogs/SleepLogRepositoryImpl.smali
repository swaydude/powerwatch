.class public final Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepositoryImpl;
.super Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/BaseLogRepositoryImpl;
.source "SleepLogRepository.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepository;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/BaseLogRepositoryImpl<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;",
        ">;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepository;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\u0018\u00002\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00030\u0002B%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u000cJ\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001e\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00122\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0015H\u0016J\u0016\u0010\u0016\u001a\u00020\u00122\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0015H\u0016J\u0008\u0010\u0017\u001a\u00020\u0018H\u0016J\u0008\u0010\u0019\u001a\u00020\u0012H\u0016R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepositoryImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepository;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/BaseLogRepositoryImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;",
        "sleepLogDao",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao;",
        "sleepLogCloudService",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/SleepLogCloudService;",
        "googleFitController",
        "Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;",
        "metricsRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/SleepLogCloudService;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;)V",
        "copyItem",
        "item",
        "shouldSave",
        "",
        "getSaveCloudCompletable",
        "Lio/reactivex/Completable;",
        "kotlin.jvm.PlatformType",
        "logs",
        "",
        "getSaveLogsCompletable",
        "notSyncedCount",
        "",
        "sync",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field private final googleFitController:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;

.field private final sleepLogCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/SleepLogCloudService;

.field private final sleepLogDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/SleepLogCloudService;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;)V
    .locals 1

    const-string v0, "sleepLogDao"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sleepLogCloudService"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "googleFitController"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricsRepository"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-direct {p0, p4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/BaseLogRepositoryImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;)V

    .line 15
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepositoryImpl;->sleepLogDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao;

    .line 16
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepositoryImpl;->sleepLogCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/SleepLogCloudService;

    .line 17
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepositoryImpl;->googleFitController:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;

    return-void
.end method

.method private static final getSaveCloudCompletable$lambda-3(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepositoryImpl;Ljava/lang/Throwable;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepositoryImpl;->logUploadFailedError()V

    return-void
.end method

.method public static synthetic lambda$1ZD9NBQot2BeZOO4O6rDrT_Er1w(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepositoryImpl;Ljava/util/List;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepositoryImpl;->sync$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepositoryImpl;Ljava/util/List;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$MCiKyJ0TB86hCBp0ga0rlXjehTU(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepositoryImpl;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepositoryImpl;->sync$lambda-2$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepositoryImpl;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$h9NREUR1Xq9jlvzuhHV_HjYIwWc(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepositoryImpl;Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepositoryImpl;->sync$lambda-2$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepositoryImpl;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic lambda$rqqBO2yL__zFQOdo8BIp5Ga07c8(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepositoryImpl;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepositoryImpl;->getSaveCloudCompletable$lambda-3(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepositoryImpl;Ljava/lang/Throwable;)V

    return-void
.end method

.method private static final sync$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepositoryImpl;Ljava/util/List;)Lio/reactivex/CompletableSource;
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lio/reactivex/Completable;->complete()Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    return-object p0

    .line 26
    :cond_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepositoryImpl;->sleepLogCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/SleepLogCloudService;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/SleepLogCloudService;->saveAllSleepLogs(Ljava/util/List;)Lio/reactivex/Completable;

    move-result-object v0

    .line 27
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/-$$Lambda$SleepLogRepositoryImpl$MCiKyJ0TB86hCBp0ga0rlXjehTU;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/-$$Lambda$SleepLogRepositoryImpl$MCiKyJ0TB86hCBp0ga0rlXjehTU;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepositoryImpl;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Completable;->doOnError(Lio/reactivex/functions/Consumer;)Lio/reactivex/Completable;

    move-result-object v0

    .line 28
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepositoryImpl;->sleepLogDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao;

    invoke-virtual {v1, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao;->deleteCompletable(Ljava/util/List;)Lio/reactivex/Completable;

    move-result-object v1

    check-cast v1, Lio/reactivex/CompletableSource;

    invoke-virtual {v0, v1}, Lio/reactivex/Completable;->andThen(Lio/reactivex/CompletableSource;)Lio/reactivex/Completable;

    move-result-object v0

    .line 29
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/-$$Lambda$SleepLogRepositoryImpl$h9NREUR1Xq9jlvzuhHV_HjYIwWc;

    invoke-direct {v1, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/-$$Lambda$SleepLogRepositoryImpl$h9NREUR1Xq9jlvzuhHV_HjYIwWc;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepositoryImpl;Ljava/util/List;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Completable;->doOnComplete(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    return-object p0
.end method

.method private static final sync$lambda-2$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepositoryImpl;Ljava/lang/Throwable;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepositoryImpl;->logUploadFailedError()V

    return-void
.end method

.method private static final sync$lambda-2$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepositoryImpl;Ljava/util/List;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepositoryImpl;->googleFitController:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->saveSleepingLogs(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public copyItem(Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;Z)Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;
    .locals 25

    move-object/from16 v0, p1

    move/from16 v17, p2

    const-string v1, "item"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const v23, 0xfbfff

    const/16 v24, 0x0

    .line 36
    invoke-static/range {v0 .. v24}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;JJFFFFFFFFFILpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;FZIIILjava/lang/String;IILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic copyItem(Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WatchBaseLog;Z)Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WatchBaseLog;
    .locals 0

    .line 15
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;

    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepositoryImpl;->copyItem(Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;Z)Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WatchBaseLog;

    return-object p1
.end method

.method public getSaveCloudCompletable(Ljava/util/List;)Lio/reactivex/Completable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;",
            ">;)",
            "Lio/reactivex/Completable;"
        }
    .end annotation

    const-string v0, "logs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepositoryImpl;->sleepLogCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/SleepLogCloudService;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/SleepLogCloudService;->saveAllSleepLogs(Ljava/util/List;)Lio/reactivex/Completable;

    move-result-object p1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/-$$Lambda$SleepLogRepositoryImpl$rqqBO2yL__zFQOdo8BIp5Ga07c8;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/-$$Lambda$SleepLogRepositoryImpl$rqqBO2yL__zFQOdo8BIp5Ga07c8;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepositoryImpl;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Completable;->doOnError(Lio/reactivex/functions/Consumer;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public getSaveLogsCompletable(Ljava/util/List;)Lio/reactivex/Completable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;",
            ">;)",
            "Lio/reactivex/Completable;"
        }
    .end annotation

    const-string v0, "logs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepositoryImpl;->sleepLogDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao;

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao;->saveCompletable(Ljava/util/List;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public notSyncedCount()J
    .locals 2

    .line 21
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepositoryImpl;->sleepLogDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao;->notSyncedLogsCount()J

    move-result-wide v0

    return-wide v0
.end method

.method public sync()Lio/reactivex/Completable;
    .locals 2

    .line 23
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepositoryImpl;->sleepLogDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao;->notSyncedLogs()Lio/reactivex/Single;

    move-result-object v0

    .line 24
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/-$$Lambda$SleepLogRepositoryImpl$1ZD9NBQot2BeZOO4O6rDrT_Er1w;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/-$$Lambda$SleepLogRepositoryImpl$1ZD9NBQot2BeZOO4O6rDrT_Er1w;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepositoryImpl;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Single;->flatMapCompletable(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object v0

    const-string v1, "sleepLogDao.notSyncedLogs()\n            .flatMapCompletable {\n                if (it.isEmpty()) return@flatMapCompletable Completable.complete()\n                sleepLogCloudService.saveAllSleepLogs(it)\n                        .doOnError { logUploadFailedError() }\n                        .andThen(sleepLogDao.deleteCompletable(it))\n                        .doOnComplete { googleFitController.saveSleepingLogs(it) }\n            }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
