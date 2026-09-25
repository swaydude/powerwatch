.class public abstract Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao;
.super Ljava/lang/Object;
.source "SleepHourPeriodDao.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0016\u0010\t\u001a\u00020\u00042\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000bH\'J\u0016\u0010\u000c\u001a\u00020\u00082\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000bH\u0007J\u0008\u0010\r\u001a\u00020\u0004H\'J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010H\'J\u0010\u0010\u0011\u001a\u00020\u00082\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0016\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00132\u0006\u0010\u000f\u001a\u00020\u0010H\'J$\u0010\u0014\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u000b0\u00152\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0010H\'J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\'\u00a8\u0006\u0019"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao;",
        "",
        "()V",
        "addSleepHourPeriod",
        "",
        "period",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;",
        "addSleepHourPeriodCompletable",
        "Lio/reactivex/Completable;",
        "addSleepHourPeriods",
        "periods",
        "",
        "addSleepHourPeriodsCompletable",
        "deleteAll",
        "deleteSleepHourPeriod",
        "id",
        "",
        "deleteSleepHourPeriodCompletable",
        "getSleepHourPeriod",
        "Lio/reactivex/Maybe;",
        "getSleepHourPeriods",
        "Lio/reactivex/Single;",
        "startTime",
        "endTime",
        "lastSleepHour",
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

.method private static final addSleepHourPeriodCompletable$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$period"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao;->addSleepHourPeriod(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;)V

    return-void
.end method

.method private static final addSleepHourPeriodsCompletable$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao;Ljava/util/List;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$periods"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao;->addSleepHourPeriods(Ljava/util/List;)V

    return-void
.end method

.method private static final deleteSleepHourPeriodCompletable$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao;J)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao;->deleteSleepHourPeriod(J)V

    return-void
.end method

.method public static synthetic lambda$55pUqlLnFBdihmqO-avT7qd76F4(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao;->addSleepHourPeriodCompletable$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;)V

    return-void
.end method

.method public static synthetic lambda$EF8AQY8WLga_z9DHJExt_jxbSbA(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao;Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao;->addSleepHourPeriodsCompletable$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic lambda$zv76NXYVTGlMV_SBAPewxJmKhEU(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao;J)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao;->deleteSleepHourPeriodCompletable$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao;J)V

    return-void
.end method


# virtual methods
.method public abstract addSleepHourPeriod(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;)V
.end method

.method public final addSleepHourPeriodCompletable(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;)Lio/reactivex/Completable;
    .locals 1

    const-string v0, "period"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/-$$Lambda$SleepHourPeriodDao$55pUqlLnFBdihmqO-avT7qd76F4;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/-$$Lambda$SleepHourPeriodDao$55pUqlLnFBdihmqO-avT7qd76F4;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;)V

    invoke-static {v0}, Lio/reactivex/Completable;->fromAction(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object p1

    const-string v0, "fromAction {\n            addSleepHourPeriod(period)\n        }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public abstract addSleepHourPeriods(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;",
            ">;)V"
        }
    .end annotation
.end method

.method public final addSleepHourPeriodsCompletable(Ljava/util/List;)Lio/reactivex/Completable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;",
            ">;)",
            "Lio/reactivex/Completable;"
        }
    .end annotation

    const-string v0, "periods"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/-$$Lambda$SleepHourPeriodDao$EF8AQY8WLga_z9DHJExt_jxbSbA;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/-$$Lambda$SleepHourPeriodDao$EF8AQY8WLga_z9DHJExt_jxbSbA;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao;Ljava/util/List;)V

    invoke-static {v0}, Lio/reactivex/Completable;->fromAction(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object p1

    const-string v0, "fromAction {\n            addSleepHourPeriods(periods)\n        }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public abstract deleteAll()V
.end method

.method public abstract deleteSleepHourPeriod(J)V
.end method

.method public final deleteSleepHourPeriodCompletable(J)Lio/reactivex/Completable;
    .locals 1

    .line 43
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/-$$Lambda$SleepHourPeriodDao$zv76NXYVTGlMV_SBAPewxJmKhEU;

    invoke-direct {v0, p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/-$$Lambda$SleepHourPeriodDao$zv76NXYVTGlMV_SBAPewxJmKhEU;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao;J)V

    invoke-static {v0}, Lio/reactivex/Completable;->fromAction(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object p1

    const-string p2, "fromAction {\n            deleteSleepHourPeriod(id)\n        }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public abstract getSleepHourPeriod(J)Lio/reactivex/Maybe;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Lio/reactivex/Maybe<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getSleepHourPeriods(JJ)Lio/reactivex/Single;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ)",
            "Lio/reactivex/Single<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract lastSleepHour()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;
.end method
