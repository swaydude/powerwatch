.class public final Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/week/WalkingWeekPeriodCloudServiceImpl;
.super Ljava/lang/Object;
.source "WalkingWeekPeriodCloudService.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/week/WalkingWeekPeriodCloudService;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u00070\u00062\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/week/WalkingWeekPeriodCloudServiceImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/week/WalkingWeekPeriodCloudService;",
        "crudDayPeriodService",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingWeekPeriodService;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingWeekPeriodService;)V",
        "getAllWalkingWeeks",
        "Lio/reactivex/Single;",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingWeekPeriod;",
        "page",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;",
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
.field private final crudDayPeriodService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingWeekPeriodService;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingWeekPeriodService;)V
    .locals 1

    const-string v0, "crudDayPeriodService"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/week/WalkingWeekPeriodCloudServiceImpl;->crudDayPeriodService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingWeekPeriodService;

    return-void
.end method


# virtual methods
.method public getAllWalkingWeeks(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;)Lio/reactivex/Single;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;",
            ")",
            "Lio/reactivex/Single<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingWeekPeriod;",
            ">;>;"
        }
    .end annotation

    const-string v0, "page"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    new-array v0, v0, [Lkotlin/Pair;

    .line 22
    new-instance v1, Lkotlin/Pair;

    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/TimeZone;->getID()Ljava/lang/String;

    move-result-object v2

    const-string v3, "timezone"

    invoke-direct {v1, v3, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v0}, Lkotlin/collections/MapsKt;->mutableMapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    .line 23
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;->getOffset()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    const-string v2, "offset"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;->getLimit()I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    const-string v1, "limit"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/week/WalkingWeekPeriodCloudServiceImpl;->crudDayPeriodService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingWeekPeriodService;

    invoke-interface {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingWeekPeriodService;->all(Ljava/util/Map;)Lio/reactivex/Single;

    move-result-object p1

    return-object p1
.end method
