.class public abstract Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao;
.super Ljava/lang/Object;
.source "WalkingHourPeriodDao.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0016\u0010\t\u001a\u00020\u00042\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000bH\'J\u0016\u0010\u000c\u001a\u00020\u00082\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000bH\u0007J\u0008\u0010\r\u001a\u00020\u0004H\'J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010H\'J\u0010\u0010\u0011\u001a\u00020\u00082\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0016\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00132\u0006\u0010\u000f\u001a\u00020\u0010H\'J$\u0010\u0014\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u000b0\u00152\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0010H\'J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\'\u00a8\u0006\u0019"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao;",
        "",
        "()V",
        "addWalkingHourPeriod",
        "",
        "period",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;",
        "addWalkingHourPeriodCompletable",
        "Lio/reactivex/Completable;",
        "addWalkingHourPeriods",
        "periods",
        "",
        "addWalkingHourPeriodsCompletable",
        "deleteAll",
        "deleteWalkingHourPeriod",
        "id",
        "",
        "deleteWalkingHourPeriodCompletable",
        "getWalkingHourPeriod",
        "Lio/reactivex/Maybe;",
        "getWalkingHourPeriods",
        "Lio/reactivex/Single;",
        "startTime",
        "endTime",
        "lastWalkingHour",
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

.method private static final addWalkingHourPeriodCompletable$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$period"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao;->addWalkingHourPeriod(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;)V

    return-void
.end method

.method private static final addWalkingHourPeriodsCompletable$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao;Ljava/util/List;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$periods"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao;->addWalkingHourPeriods(Ljava/util/List;)V

    return-void
.end method

.method private static final deleteWalkingHourPeriodCompletable$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao;J)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao;->deleteWalkingHourPeriod(J)V

    return-void
.end method

.method public static synthetic lambda$Mv7Nbdha69AvdNi1oglQHcefhnA(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao;->addWalkingHourPeriodCompletable$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;)V

    return-void
.end method

.method public static synthetic lambda$NVvR-DKjJ4sWm-5p4gIUXpHi2ac(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao;Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao;->addWalkingHourPeriodsCompletable$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic lambda$sUmLZ4mmHBr3IICbTM2uaMatZqQ(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao;J)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao;->deleteWalkingHourPeriodCompletable$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao;J)V

    return-void
.end method


# virtual methods
.method public abstract addWalkingHourPeriod(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;)V
.end method

.method public final addWalkingHourPeriodCompletable(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;)Lio/reactivex/Completable;
    .locals 1

    const-string v0, "period"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/-$$Lambda$WalkingHourPeriodDao$Mv7Nbdha69AvdNi1oglQHcefhnA;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/-$$Lambda$WalkingHourPeriodDao$Mv7Nbdha69AvdNi1oglQHcefhnA;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;)V

    invoke-static {v0}, Lio/reactivex/Completable;->fromAction(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object p1

    const-string v0, "fromAction {\n            addWalkingHourPeriod(period)\n        }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public abstract addWalkingHourPeriods(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;",
            ">;)V"
        }
    .end annotation
.end method

.method public final addWalkingHourPeriodsCompletable(Ljava/util/List;)Lio/reactivex/Completable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;",
            ">;)",
            "Lio/reactivex/Completable;"
        }
    .end annotation

    const-string v0, "periods"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/-$$Lambda$WalkingHourPeriodDao$NVvR-DKjJ4sWm-5p4gIUXpHi2ac;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/-$$Lambda$WalkingHourPeriodDao$NVvR-DKjJ4sWm-5p4gIUXpHi2ac;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao;Ljava/util/List;)V

    invoke-static {v0}, Lio/reactivex/Completable;->fromAction(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object p1

    const-string v0, "fromAction {\n            addWalkingHourPeriods(periods)\n        }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public abstract deleteAll()V
.end method

.method public abstract deleteWalkingHourPeriod(J)V
.end method

.method public final deleteWalkingHourPeriodCompletable(J)Lio/reactivex/Completable;
    .locals 1

    .line 46
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/-$$Lambda$WalkingHourPeriodDao$sUmLZ4mmHBr3IICbTM2uaMatZqQ;

    invoke-direct {v0, p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/-$$Lambda$WalkingHourPeriodDao$sUmLZ4mmHBr3IICbTM2uaMatZqQ;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao;J)V

    invoke-static {v0}, Lio/reactivex/Completable;->fromAction(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object p1

    const-string p2, "fromAction {\n            deleteWalkingHourPeriod(id)\n        }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public abstract getWalkingHourPeriod(J)Lio/reactivex/Maybe;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Lio/reactivex/Maybe<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getWalkingHourPeriods(JJ)Lio/reactivex/Single;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ)",
            "Lio/reactivex/Single<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract lastWalkingHour()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;
.end method
