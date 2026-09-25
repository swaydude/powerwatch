.class public final Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepositoryImpl;
.super Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/BaseLogRepositoryImpl;
.source "RestingLogRepository.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepository;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/BaseLogRepositoryImpl<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingLog;",
        ">;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepository;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\u0018\u00002\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004B%\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0002\u0010\rJ\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001e\u0010\u0012\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00132\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0016H\u0016J\u0016\u0010\u0017\u001a\u00020\u00132\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0016H\u0016J\u0008\u0010\u0018\u001a\u00020\u0019H\u0016J\u0008\u0010\u001a\u001a\u00020\u0013H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepositoryImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepository;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/BaseLogRepositoryImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingLog;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "restingLogDao",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/RestingLogDao;",
        "restingLogCloudService",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/RestingLogCloudService;",
        "googleFitController",
        "Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;",
        "metricsRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/RestingLogDao;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/RestingLogCloudService;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;)V",
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

.field private final restingLogCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/RestingLogCloudService;

.field private final restingLogDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/RestingLogDao;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/RestingLogDao;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/RestingLogCloudService;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;)V
    .locals 1

    const-string v0, "restingLogDao"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "restingLogCloudService"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "googleFitController"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricsRepository"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    invoke-direct {p0, p4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/BaseLogRepositoryImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;)V

    .line 19
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepositoryImpl;->restingLogDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/RestingLogDao;

    .line 20
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepositoryImpl;->restingLogCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/RestingLogCloudService;

    .line 21
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepositoryImpl;->googleFitController:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;

    return-void
.end method

.method private static final getSaveCloudCompletable$lambda-4(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepositoryImpl;Ljava/util/List;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$logs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string v0, "Saved resting data to cloud, size: "

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final getSaveCloudCompletable$lambda-5(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepositoryImpl;Ljava/lang/Throwable;)V
    .locals 4

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string v1, "Error saving resting data to cloud"

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 52
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 53
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepositoryImpl;->logUploadFailedError()V

    return-void
.end method

.method public static synthetic lambda$3u0X7dFwYrazPBwknBXvdEyGipA(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepositoryImpl;Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepositoryImpl;->sync$lambda-3$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepositoryImpl;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic lambda$AlMKNWw1iI0gBSMUZRjqgtgXnKw(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepositoryImpl;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepositoryImpl;->getSaveCloudCompletable$lambda-5(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepositoryImpl;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$MGJsAMhkIF8WJgGHFCpRQGMAdfE(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepositoryImpl;Ljava/util/List;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepositoryImpl;->sync$lambda-3(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepositoryImpl;Ljava/util/List;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$S-VYDKuJAwCC17q6jvuI991MdUE(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepositoryImpl;Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepositoryImpl;->sync$lambda-3$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepositoryImpl;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic lambda$bdkkx6PWzv9SiKFFmP6HS5b-Lr0(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepositoryImpl;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepositoryImpl;->sync$lambda-3$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepositoryImpl;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$qNiLVtIkpmw6vp0R3MH7pnelrg8(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepositoryImpl;Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepositoryImpl;->getSaveCloudCompletable$lambda-4(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepositoryImpl;Ljava/util/List;)V

    return-void
.end method

.method private static final sync$lambda-3(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepositoryImpl;Ljava/util/List;)Lio/reactivex/CompletableSource;
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lio/reactivex/Completable;->complete()Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    return-object p0

    .line 31
    :cond_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepositoryImpl;->restingLogCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/RestingLogCloudService;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/RestingLogCloudService;->saveAllRestingLogs(Ljava/util/List;)Lio/reactivex/Completable;

    move-result-object v0

    .line 32
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/-$$Lambda$RestingLogRepositoryImpl$3u0X7dFwYrazPBwknBXvdEyGipA;

    invoke-direct {v1, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/-$$Lambda$RestingLogRepositoryImpl$3u0X7dFwYrazPBwknBXvdEyGipA;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepositoryImpl;Ljava/util/List;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Completable;->doOnComplete(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object v0

    .line 33
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/-$$Lambda$RestingLogRepositoryImpl$bdkkx6PWzv9SiKFFmP6HS5b-Lr0;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/-$$Lambda$RestingLogRepositoryImpl$bdkkx6PWzv9SiKFFmP6HS5b-Lr0;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepositoryImpl;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Completable;->doOnError(Lio/reactivex/functions/Consumer;)Lio/reactivex/Completable;

    move-result-object v0

    .line 38
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepositoryImpl;->restingLogDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/RestingLogDao;

    invoke-virtual {v1, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/RestingLogDao;->deleteCompletable(Ljava/util/List;)Lio/reactivex/Completable;

    move-result-object v1

    check-cast v1, Lio/reactivex/CompletableSource;

    invoke-virtual {v0, v1}, Lio/reactivex/Completable;->andThen(Lio/reactivex/CompletableSource;)Lio/reactivex/Completable;

    move-result-object v0

    .line 39
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/-$$Lambda$RestingLogRepositoryImpl$S-VYDKuJAwCC17q6jvuI991MdUE;

    invoke-direct {v1, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/-$$Lambda$RestingLogRepositoryImpl$S-VYDKuJAwCC17q6jvuI991MdUE;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepositoryImpl;Ljava/util/List;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Completable;->doOnComplete(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    return-object p0
.end method

.method private static final sync$lambda-3$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepositoryImpl;Ljava/util/List;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string v0, "Saved resting data to cloud, size: "

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final sync$lambda-3$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepositoryImpl;Ljava/lang/Throwable;)V
    .locals 4

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string v1, "Error saving resting data to cloud"

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 35
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 36
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepositoryImpl;->logUploadFailedError()V

    return-void
.end method

.method private static final sync$lambda-3$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepositoryImpl;Ljava/util/List;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepositoryImpl;->googleFitController:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->saveRestingLogs(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public copyItem(Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingLog;Z)Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingLog;
    .locals 24

    move-object/from16 v0, p1

    move/from16 v16, p2

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

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const v22, 0x7dfff

    const/16 v23, 0x0

    .line 46
    invoke-static/range {v0 .. v23}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingLog;->copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingLog;JJFFFFFFFFFIFZIIILjava/lang/String;IILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingLog;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic copyItem(Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WatchBaseLog;Z)Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WatchBaseLog;
    .locals 0

    .line 19
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingLog;

    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepositoryImpl;->copyItem(Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingLog;Z)Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingLog;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WatchBaseLog;

    return-object p1
.end method

.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 19
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method public getSaveCloudCompletable(Ljava/util/List;)Lio/reactivex/Completable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingLog;",
            ">;)",
            "Lio/reactivex/Completable;"
        }
    .end annotation

    const-string v0, "logs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepositoryImpl;->restingLogCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/RestingLogCloudService;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/RestingLogCloudService;->saveAllRestingLogs(Ljava/util/List;)Lio/reactivex/Completable;

    move-result-object v0

    .line 50
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/-$$Lambda$RestingLogRepositoryImpl$qNiLVtIkpmw6vp0R3MH7pnelrg8;

    invoke-direct {v1, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/-$$Lambda$RestingLogRepositoryImpl$qNiLVtIkpmw6vp0R3MH7pnelrg8;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepositoryImpl;Ljava/util/List;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Completable;->doOnComplete(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object p1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/-$$Lambda$RestingLogRepositoryImpl$AlMKNWw1iI0gBSMUZRjqgtgXnKw;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/-$$Lambda$RestingLogRepositoryImpl$AlMKNWw1iI0gBSMUZRjqgtgXnKw;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepositoryImpl;)V

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
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingLog;",
            ">;)",
            "Lio/reactivex/Completable;"
        }
    .end annotation

    const-string v0, "logs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepositoryImpl;->restingLogDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/RestingLogDao;

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/RestingLogDao;->saveCompletable(Ljava/util/List;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public notSyncedCount()J
    .locals 2

    .line 25
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepositoryImpl;->restingLogDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/RestingLogDao;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/RestingLogDao;->notSyncedLogsCount()J

    move-result-wide v0

    return-wide v0
.end method

.method public sync()Lio/reactivex/Completable;
    .locals 2

    .line 28
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepositoryImpl;->restingLogDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/RestingLogDao;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/RestingLogDao;->notSyncedLogs()Lio/reactivex/Single;

    move-result-object v0

    .line 29
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/-$$Lambda$RestingLogRepositoryImpl$MGJsAMhkIF8WJgGHFCpRQGMAdfE;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/-$$Lambda$RestingLogRepositoryImpl$MGJsAMhkIF8WJgGHFCpRQGMAdfE;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepositoryImpl;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Single;->flatMapCompletable(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object v0

    const-string v1, "restingLogDao.notSyncedLogs()\n            .flatMapCompletable {\n                if (it.isEmpty()) return@flatMapCompletable Completable.complete()\n                restingLogCloudService.saveAllRestingLogs(it)\n                        .doOnComplete { debug(\"Saved resting data to cloud, size: ${it.size}\") }\n                        .doOnError {error ->\n                            debug(\"Error saving resting data to cloud\")\n                            error.printStackTrace()\n                            logUploadFailedError()\n                        }\n                        .andThen(restingLogDao.deleteCompletable(it))\n                        .doOnComplete { googleFitController.saveRestingLogs(it) }\n            }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
