.class public final Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/WalkingHourPeriodCloudServiceImpl;
.super Ljava/lang/Object;
.source "WalkingHourPeriodCloudService.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/WalkingHourPeriodCloudService;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u000bJ$\u0010\u000c\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0008\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/WalkingHourPeriodCloudServiceImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/WalkingHourPeriodCloudService;",
        "httpClient",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;",
        "periodConfig",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/HourPeriodConfig;",
        "crudHoursPeriodService",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingHourPeriodService;",
        "crudDayPeriodService",
        "crudWeekPeriodService",
        "crudMonthPeriodService",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/HourPeriodConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingHourPeriodService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingHourPeriodService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingHourPeriodService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingHourPeriodService;)V",
        "getAllWalkingPeriods",
        "Lio/reactivex/Single;",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;",
        "page",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;",
        "type",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodType;",
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
.field private final crudDayPeriodService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingHourPeriodService;

.field private final crudHoursPeriodService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingHourPeriodService;

.field private final crudMonthPeriodService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingHourPeriodService;

.field private final crudWeekPeriodService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingHourPeriodService;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/HourPeriodConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingHourPeriodService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingHourPeriodService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingHourPeriodService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingHourPeriodService;)V
    .locals 1

    const-string v0, "httpClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "periodConfig"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "crudHoursPeriodService"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "crudDayPeriodService"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "crudWeekPeriodService"

    invoke-static {p5, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "crudMonthPeriodService"

    invoke-static {p6, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/WalkingHourPeriodCloudServiceImpl;->crudHoursPeriodService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingHourPeriodService;

    .line 24
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/WalkingHourPeriodCloudServiceImpl;->crudDayPeriodService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingHourPeriodService;

    .line 25
    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/WalkingHourPeriodCloudServiceImpl;->crudWeekPeriodService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingHourPeriodService;

    .line 26
    iput-object p6, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/WalkingHourPeriodCloudServiceImpl;->crudMonthPeriodService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingHourPeriodService;

    return-void
.end method

.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/HourPeriodConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingHourPeriodService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingHourPeriodService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingHourPeriodService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingHourPeriodService;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 12

    and-int/lit8 v0, p7, 0x4

    if-eqz v0, :cond_0

    .line 23
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingHourPeriodServiceImpl;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/HourPeriodConfig;->getHoursEndpoint()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, v0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingHourPeriodServiceImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingHourPeriodService;

    move-object v4, v0

    goto :goto_0

    :cond_0
    move-object v4, p3

    :goto_0
    and-int/lit8 v0, p7, 0x8

    if-eqz v0, :cond_1

    .line 24
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingHourPeriodServiceImpl;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/HourPeriodConfig;->getDayHoursEndpoint()Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    const/4 v9, 0x4

    const/4 v10, 0x0

    move-object v5, v0

    move-object v6, p1

    invoke-direct/range {v5 .. v10}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingHourPeriodServiceImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingHourPeriodService;

    move-object v5, v0

    goto :goto_1

    :cond_1
    move-object/from16 v5, p4

    :goto_1
    and-int/lit8 v0, p7, 0x10

    if-eqz v0, :cond_2

    .line 25
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingHourPeriodServiceImpl;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/HourPeriodConfig;->getWeekHoursEndpoint()Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    const/4 v10, 0x4

    const/4 v11, 0x0

    move-object v6, v0

    move-object v7, p1

    invoke-direct/range {v6 .. v11}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingHourPeriodServiceImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingHourPeriodService;

    move-object v6, v0

    goto :goto_2

    :cond_2
    move-object/from16 v6, p5

    :goto_2
    and-int/lit8 v0, p7, 0x20

    if-eqz v0, :cond_3

    .line 26
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingHourPeriodServiceImpl;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/HourPeriodConfig;->getMonthHoursEndpoint()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x4

    const/4 v7, 0x0

    move-object p3, v0

    move-object/from16 p4, p1

    move-object/from16 p5, v1

    move-object/from16 p6, v2

    move/from16 p7, v3

    move-object/from16 p8, v7

    invoke-direct/range {p3 .. p8}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingHourPeriodServiceImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingHourPeriodService;

    move-object v7, v0

    goto :goto_3

    :cond_3
    move-object/from16 v7, p6

    :goto_3
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    .line 20
    invoke-direct/range {v1 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/WalkingHourPeriodCloudServiceImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/HourPeriodConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingHourPeriodService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingHourPeriodService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingHourPeriodService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingHourPeriodService;)V

    return-void
.end method


# virtual methods
.method public getAllWalkingPeriods(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodType;)Lio/reactivex/Single;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodType;",
            ")",
            "Lio/reactivex/Single<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;",
            ">;>;"
        }
    .end annotation

    const-string v0, "page"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    new-array v0, v0, [Lkotlin/Pair;

    .line 31
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

    .line 32
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;->getOffset()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    const-string v2, "offset"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;->getLimit()I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    const-string v1, "limit"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodType$Hour;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodType$Hour;

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/WalkingHourPeriodCloudServiceImpl;->crudHoursPeriodService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingHourPeriodService;

    goto :goto_0

    .line 37
    :cond_0
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodType$Day;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodType$Day;

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/WalkingHourPeriodCloudServiceImpl;->crudDayPeriodService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingHourPeriodService;

    goto :goto_0

    .line 38
    :cond_1
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodType$Week;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodType$Week;

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/WalkingHourPeriodCloudServiceImpl;->crudWeekPeriodService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingHourPeriodService;

    goto :goto_0

    .line 39
    :cond_2
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodType$Month;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodType$Month;

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/WalkingHourPeriodCloudServiceImpl;->crudMonthPeriodService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingHourPeriodService;

    .line 41
    :goto_0
    invoke-interface {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingHourPeriodService;->all(Ljava/util/Map;)Lio/reactivex/Single;

    move-result-object p1

    return-object p1

    .line 39
    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
