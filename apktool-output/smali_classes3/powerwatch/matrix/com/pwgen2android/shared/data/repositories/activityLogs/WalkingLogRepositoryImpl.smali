.class public final Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepositoryImpl;
.super Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/BaseLogRepositoryImpl;
.source "WalkingLogRepository.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepository;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/BaseLogRepositoryImpl<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;",
        ">;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepository;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\u0018\u00002\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00030\u0002B%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u000cJ\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001e\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00122\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0015H\u0016J\u0016\u0010\u0016\u001a\u00020\u00122\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0015H\u0016J\u0008\u0010\u0017\u001a\u00020\u0018H\u0016J\u0008\u0010\u0019\u001a\u00020\u0012H\u0016R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepositoryImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepository;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/BaseLogRepositoryImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;",
        "walkingLogDao",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/WalkingLogDao;",
        "walkingLogCloudService",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/WalkingLogCloudService;",
        "googleFitController",
        "Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;",
        "metricsRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/WalkingLogDao;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/WalkingLogCloudService;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;)V",
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

.field private final walkingLogCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/WalkingLogCloudService;

.field private final walkingLogDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/WalkingLogDao;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/WalkingLogDao;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/WalkingLogCloudService;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;)V
    .locals 1

    const-string v0, "walkingLogDao"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "walkingLogCloudService"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "googleFitController"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricsRepository"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    invoke-direct {p0, p4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/BaseLogRepositoryImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;)V

    .line 17
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepositoryImpl;->walkingLogDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/WalkingLogDao;

    .line 18
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepositoryImpl;->walkingLogCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/WalkingLogCloudService;

    .line 19
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepositoryImpl;->googleFitController:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;

    return-void
.end method

.method private static final getSaveCloudCompletable$lambda-4(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepositoryImpl;Ljava/util/List;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$logs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string v0, "Saved walking data to cloud, size: "

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final getSaveCloudCompletable$lambda-5(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepositoryImpl;Ljava/lang/Throwable;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepositoryImpl;->logUploadFailedError()V

    return-void
.end method

.method public static synthetic lambda$-ntGgPfNQ1rQaHpNsyRQmldMoP0(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepositoryImpl;Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepositoryImpl;->getSaveCloudCompletable$lambda-4(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepositoryImpl;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic lambda$REFAuHOZkezru8e91Tv16KDskTI(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepositoryImpl;Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepositoryImpl;->sync$lambda-3$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepositoryImpl;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic lambda$XX-odWKzWI--jV6EGf1F3XYbM4c(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepositoryImpl;Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepositoryImpl;->sync$lambda-3$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepositoryImpl;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic lambda$m6iMJDk4WrJIHHM4RYsXQeGeii4(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepositoryImpl;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepositoryImpl;->sync$lambda-3$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepositoryImpl;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$otjVEJEiXKfEnA2bkxlla8OLItM(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepositoryImpl;Ljava/util/List;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepositoryImpl;->sync$lambda-3(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepositoryImpl;Ljava/util/List;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$vZcgdkUE9unU3dsOIG2DwAC8EmQ(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepositoryImpl;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepositoryImpl;->getSaveCloudCompletable$lambda-5(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepositoryImpl;Ljava/lang/Throwable;)V

    return-void
.end method

.method private static final sync$lambda-3(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepositoryImpl;Ljava/util/List;)Lio/reactivex/CompletableSource;
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lio/reactivex/Completable;->complete()Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    return-object p0

    .line 29
    :cond_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepositoryImpl;->walkingLogCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/WalkingLogCloudService;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/WalkingLogCloudService;->saveAllWalkingLogs(Ljava/util/List;)Lio/reactivex/Completable;

    move-result-object v0

    .line 30
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/-$$Lambda$WalkingLogRepositoryImpl$XX-odWKzWI--jV6EGf1F3XYbM4c;

    invoke-direct {v1, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/-$$Lambda$WalkingLogRepositoryImpl$XX-odWKzWI--jV6EGf1F3XYbM4c;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepositoryImpl;Ljava/util/List;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Completable;->doOnComplete(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object v0

    .line 31
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/-$$Lambda$WalkingLogRepositoryImpl$m6iMJDk4WrJIHHM4RYsXQeGeii4;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/-$$Lambda$WalkingLogRepositoryImpl$m6iMJDk4WrJIHHM4RYsXQeGeii4;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepositoryImpl;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Completable;->doOnError(Lio/reactivex/functions/Consumer;)Lio/reactivex/Completable;

    move-result-object v0

    .line 36
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepositoryImpl;->walkingLogDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/WalkingLogDao;

    invoke-virtual {v1, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/WalkingLogDao;->deleteCompletable(Ljava/util/List;)Lio/reactivex/Completable;

    move-result-object v1

    check-cast v1, Lio/reactivex/CompletableSource;

    invoke-virtual {v0, v1}, Lio/reactivex/Completable;->andThen(Lio/reactivex/CompletableSource;)Lio/reactivex/Completable;

    move-result-object v0

    .line 37
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/-$$Lambda$WalkingLogRepositoryImpl$REFAuHOZkezru8e91Tv16KDskTI;

    invoke-direct {v1, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/-$$Lambda$WalkingLogRepositoryImpl$REFAuHOZkezru8e91Tv16KDskTI;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepositoryImpl;Ljava/util/List;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Completable;->doOnComplete(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    return-object p0
.end method

.method private static final sync$lambda-3$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepositoryImpl;Ljava/util/List;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string v0, "Saved walking data to cloud, size: "

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final sync$lambda-3$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepositoryImpl;Ljava/lang/Throwable;)V
    .locals 7

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Error saving walking data to cloud - "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " , "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v3, p1

    invoke-static/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->error$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 33
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 34
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepositoryImpl;->logUploadFailedError()V

    return-void
.end method

.method private static final sync$lambda-3$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepositoryImpl;Ljava/util/List;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepositoryImpl;->googleFitController:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->saveWalkingLogs(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public copyItem(Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;Z)Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;
    .locals 27

    move-object/from16 v0, p1

    move/from16 v19, p2

    const-string v1, "item"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const v25, 0x1f7fff

    const/16 v26, 0x0

    .line 44
    invoke-static/range {v0 .. v26}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;JIDJFFFFFFFFFIFZIIILjava/lang/String;IILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic copyItem(Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WatchBaseLog;Z)Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WatchBaseLog;
    .locals 0

    .line 17
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;

    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepositoryImpl;->copyItem(Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;Z)Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WatchBaseLog;

    return-object p1
.end method

.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 17
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepository;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepository$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepository;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method public getSaveCloudCompletable(Ljava/util/List;)Lio/reactivex/Completable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;",
            ">;)",
            "Lio/reactivex/Completable;"
        }
    .end annotation

    const-string v0, "logs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepositoryImpl;->walkingLogCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/WalkingLogCloudService;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/WalkingLogCloudService;->saveAllWalkingLogs(Ljava/util/List;)Lio/reactivex/Completable;

    move-result-object v0

    .line 48
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/-$$Lambda$WalkingLogRepositoryImpl$-ntGgPfNQ1rQaHpNsyRQmldMoP0;

    invoke-direct {v1, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/-$$Lambda$WalkingLogRepositoryImpl$-ntGgPfNQ1rQaHpNsyRQmldMoP0;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepositoryImpl;Ljava/util/List;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Completable;->doOnComplete(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object p1

    .line 49
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/-$$Lambda$WalkingLogRepositoryImpl$vZcgdkUE9unU3dsOIG2DwAC8EmQ;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/-$$Lambda$WalkingLogRepositoryImpl$vZcgdkUE9unU3dsOIG2DwAC8EmQ;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepositoryImpl;)V

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
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;",
            ">;)",
            "Lio/reactivex/Completable;"
        }
    .end annotation

    const-string v0, "logs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepositoryImpl;->walkingLogDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/WalkingLogDao;

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/WalkingLogDao;->saveCompletable(Ljava/util/List;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public notSyncedCount()J
    .locals 2

    .line 23
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepositoryImpl;->walkingLogDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/WalkingLogDao;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/WalkingLogDao;->notSyncedLogsCount()J

    move-result-wide v0

    return-wide v0
.end method

.method public sync()Lio/reactivex/Completable;
    .locals 2

    .line 26
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepositoryImpl;->walkingLogDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/WalkingLogDao;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/WalkingLogDao;->notSyncedLogs()Lio/reactivex/Single;

    move-result-object v0

    .line 27
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/-$$Lambda$WalkingLogRepositoryImpl$otjVEJEiXKfEnA2bkxlla8OLItM;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/-$$Lambda$WalkingLogRepositoryImpl$otjVEJEiXKfEnA2bkxlla8OLItM;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepositoryImpl;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Single;->flatMapCompletable(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object v0

    const-string v1, "walkingLogDao.notSyncedLogs()\n            .flatMapCompletable {\n                if (it.isEmpty()) return@flatMapCompletable Completable.complete()\n                walkingLogCloudService.saveAllWalkingLogs(it)\n                        .doOnComplete { debug(\"Saved walking data to cloud, size: ${it.size}\") }\n                        .doOnError {error ->\n                            error(\"Error saving walking data to cloud - ${error.javaClass.simpleName} , ${error.message}\", error)\n                            error.printStackTrace()\n                            logUploadFailedError()\n                        }\n                        .andThen(walkingLogDao.deleteCompletable(it))\n                        .doOnComplete { googleFitController.saveWalkingLogs(it) }\n            }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
