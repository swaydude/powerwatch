.class public abstract Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao;
.super Ljava/lang/Object;
.source "RestingHourPeriodDao.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0016\u0010\t\u001a\u00020\u00042\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000bH\'J\u0016\u0010\u000c\u001a\u00020\u00082\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000bH\u0007J\u0008\u0010\r\u001a\u00020\u0004H\'J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010H\'J\u0010\u0010\u0011\u001a\u00020\u00082\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0016\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00132\u0006\u0010\u000f\u001a\u00020\u0010H\'J$\u0010\u0014\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u000b0\u00152\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0010H\'J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\'\u00a8\u0006\u0019"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao;",
        "",
        "()V",
        "addRestingHourPeriod",
        "",
        "period",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;",
        "addRestingHourPeriodCompletable",
        "Lio/reactivex/Completable;",
        "addRestingHourPeriods",
        "periods",
        "",
        "addRestingHourPeriodsCompletable",
        "deleteAll",
        "deleteRestingHourPeriod",
        "id",
        "",
        "deleteRestingHourPeriodCompletable",
        "getRestingHourPeriod",
        "Lio/reactivex/Maybe;",
        "getRestingHourPeriods",
        "Lio/reactivex/Single;",
        "startTime",
        "endTime",
        "lastRestingHour",
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

.method private static final addRestingHourPeriodCompletable$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$period"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao;->addRestingHourPeriod(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;)V

    return-void
.end method

.method private static final addRestingHourPeriodsCompletable$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao;Ljava/util/List;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$periods"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao;->addRestingHourPeriods(Ljava/util/List;)V

    return-void
.end method

.method private static final deleteRestingHourPeriodCompletable$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao;J)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao;->deleteRestingHourPeriod(J)V

    return-void
.end method

.method public static synthetic lambda$NTQ5DYQHaWfzH7-Q_f3pTfe2SNg(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao;Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao;->addRestingHourPeriodsCompletable$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic lambda$lLiG3Pyu5h0o9QZKe-upCc7Ctmc(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao;->addRestingHourPeriodCompletable$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;)V

    return-void
.end method

.method public static synthetic lambda$q05sjuTe9UfvDEt1ew5B00GGze8(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao;J)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao;->deleteRestingHourPeriodCompletable$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao;J)V

    return-void
.end method


# virtual methods
.method public abstract addRestingHourPeriod(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;)V
.end method

.method public final addRestingHourPeriodCompletable(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;)Lio/reactivex/Completable;
    .locals 1

    const-string v0, "period"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/-$$Lambda$RestingHourPeriodDao$lLiG3Pyu5h0o9QZKe-upCc7Ctmc;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/-$$Lambda$RestingHourPeriodDao$lLiG3Pyu5h0o9QZKe-upCc7Ctmc;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;)V

    invoke-static {v0}, Lio/reactivex/Completable;->fromAction(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object p1

    const-string v0, "fromAction {\n            addRestingHourPeriod(period)\n        }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public abstract addRestingHourPeriods(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;",
            ">;)V"
        }
    .end annotation
.end method

.method public final addRestingHourPeriodsCompletable(Ljava/util/List;)Lio/reactivex/Completable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;",
            ">;)",
            "Lio/reactivex/Completable;"
        }
    .end annotation

    const-string v0, "periods"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/-$$Lambda$RestingHourPeriodDao$NTQ5DYQHaWfzH7-Q_f3pTfe2SNg;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/-$$Lambda$RestingHourPeriodDao$NTQ5DYQHaWfzH7-Q_f3pTfe2SNg;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao;Ljava/util/List;)V

    invoke-static {v0}, Lio/reactivex/Completable;->fromAction(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object p1

    const-string v0, "fromAction {\n            addRestingHourPeriods(periods)\n        }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public abstract deleteAll()V
.end method

.method public abstract deleteRestingHourPeriod(J)V
.end method

.method public final deleteRestingHourPeriodCompletable(J)Lio/reactivex/Completable;
    .locals 1

    .line 43
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/-$$Lambda$RestingHourPeriodDao$q05sjuTe9UfvDEt1ew5B00GGze8;

    invoke-direct {v0, p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/-$$Lambda$RestingHourPeriodDao$q05sjuTe9UfvDEt1ew5B00GGze8;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao;J)V

    invoke-static {v0}, Lio/reactivex/Completable;->fromAction(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object p1

    const-string p2, "fromAction {\n            deleteRestingHourPeriod(id)\n        }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public abstract getRestingHourPeriod(J)Lio/reactivex/Maybe;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Lio/reactivex/Maybe<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getRestingHourPeriods(JJ)Lio/reactivex/Single;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ)",
            "Lio/reactivex/Single<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract lastRestingHour()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;
.end method
