.class public final Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/SleepWeekPeriodServiceImpl;
.super Ljava/lang/Object;
.source "SleepPeriodServices.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/SleepWeekPeriodService;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/SleepWeekPeriodService;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepWeekPeriod;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00030\u0002B%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0002\u0010\tJ+\u0010\n\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u000c0\u000b2\u0014\u0008\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000eH\u0096\u0001\u00a8\u0006\u0010"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/SleepWeekPeriodServiceImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/SleepWeekPeriodService;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepWeekPeriod;",
        "httpClient",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;",
        "periodConfig",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodConfig;",
        "getAllService",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService;)V",
        "all",
        "Lio/reactivex/Single;",
        "",
        "queryParams",
        "",
        "",
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
.field private final synthetic $$delegate_0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepWeekPeriod;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodConfig;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepWeekPeriod;",
            ">;)V"
        }
    .end annotation

    const-string v0, "httpClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "periodConfig"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "getAllService"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/SleepWeekPeriodServiceImpl;->$$delegate_0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService;

    return-void
.end method

.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 32
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllServiceImpl;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodConfig;->getCrudServiceConfig()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;

    move-result-object p4

    invoke-virtual {p4}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;->getGetAllEndpoint()Ljava/lang/String;

    move-result-object p4

    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/SleepWeekPeriodServiceImpl$1;

    invoke-direct {p5}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/SleepWeekPeriodServiceImpl$1;-><init>()V

    invoke-virtual {p5}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/SleepWeekPeriodServiceImpl$1;->getType()Ljava/lang/reflect/Type;

    move-result-object p5

    const-string v0, "object : TypeToken<List<SleepWeekPeriod>>() {}.type"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p3, p1, p4, p5}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllServiceImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Ljava/lang/String;Ljava/lang/reflect/Type;)V

    check-cast p3, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService;

    .line 29
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/SleepWeekPeriodServiceImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService;)V

    return-void
.end method


# virtual methods
.method public all(Ljava/util/Map;)Lio/reactivex/Single;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lio/reactivex/Single<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepWeekPeriod;",
            ">;>;"
        }
    .end annotation

    const-string v0, "queryParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/SleepWeekPeriodServiceImpl;->$$delegate_0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService;->all(Ljava/util/Map;)Lio/reactivex/Single;

    move-result-object p1

    return-object p1
.end method
