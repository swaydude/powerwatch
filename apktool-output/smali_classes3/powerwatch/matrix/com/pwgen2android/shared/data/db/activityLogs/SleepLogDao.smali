.class public abstract Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao;
.super Ljava/lang/Object;
.source "SleepLogDao.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0004\u0008\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\'J\u0016\u0010\u0006\u001a\u00020\u00072\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00050\tH\'J\u0016\u0010\n\u001a\u00020\u000b2\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00050\tH\u0007J\u0014\u0010\u000c\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\t0\u0004H\'J\u0008\u0010\r\u001a\u00020\u000eH\'J\u0016\u0010\u000f\u001a\u00020\u00072\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00050\tH\'J\u0016\u0010\u0011\u001a\u00020\u000b2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00050\tH\u0007\u00a8\u0006\u0012"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao;",
        "",
        "()V",
        "all",
        "Lio/reactivex/Single;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;",
        "delete",
        "",
        "sleepLogs",
        "",
        "deleteCompletable",
        "Lio/reactivex/Completable;",
        "notSyncedLogs",
        "notSyncedLogsCount",
        "",
        "save",
        "walkingLogs",
        "saveCompletable",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final deleteCompletable$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao;Ljava/util/List;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$sleepLogs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao;->delete(Ljava/util/List;)V

    return-void
.end method

.method public static synthetic lambda$pS8U1rzWxxdtLmZ02G0ApLu2BqI(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao;Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao;->saveCompletable$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic lambda$uR4cUCRzAjA6SDseoPWm180LAGE(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao;Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao;->deleteCompletable$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao;Ljava/util/List;)V

    return-void
.end method

.method private static final saveCompletable$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao;Ljava/util/List;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$walkingLogs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao;->save(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public abstract all()Lio/reactivex/Single;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Single<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;",
            ">;"
        }
    .end annotation
.end method

.method public abstract delete(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;",
            ">;)V"
        }
    .end annotation
.end method

.method public final deleteCompletable(Ljava/util/List;)Lio/reactivex/Completable;
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

    const-string v0, "sleepLogs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/-$$Lambda$SleepLogDao$uR4cUCRzAjA6SDseoPWm180LAGE;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/-$$Lambda$SleepLogDao$uR4cUCRzAjA6SDseoPWm180LAGE;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao;Ljava/util/List;)V

    invoke-static {v0}, Lio/reactivex/Completable;->fromAction(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object p1

    const-string v0, "fromAction {\n        delete(sleepLogs)\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public abstract notSyncedLogs()Lio/reactivex/Single;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Single<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract notSyncedLogsCount()J
.end method

.method public abstract save(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;",
            ">;)V"
        }
    .end annotation
.end method

.method public final saveCompletable(Ljava/util/List;)Lio/reactivex/Completable;
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

    const-string v0, "walkingLogs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/-$$Lambda$SleepLogDao$pS8U1rzWxxdtLmZ02G0ApLu2BqI;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/-$$Lambda$SleepLogDao$pS8U1rzWxxdtLmZ02G0ApLu2BqI;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao;Ljava/util/List;)V

    invoke-static {v0}, Lio/reactivex/Completable;->fromAction(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object p1

    const-string v0, "fromAction {\n        save(walkingLogs)\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
