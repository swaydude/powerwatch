.class public final Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/RestingHourPeriodRepositoryImpl;
.super Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/BaseActivityPeriodRepositoryImpl;
.source "RestingHourPeriodRepository.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/RestingHourPeriodRepository;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/RestingHourPeriodRepositoryImpl$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/BaseActivityPeriodRepositoryImpl<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;",
        ">;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/RestingHourPeriodRepository;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u0000 \u001d2\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u001dB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u000c2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J0\u0010\u0012\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u00140\u00132\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u000cH\u0016J\u001c\u0010\u0016\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u00140\u00132\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u0016J\u0016\u0010\u0018\u001a\u00020\u00192\u000c\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0014H\u0016J\u001e\u0010\u001b\u001a\u00020\u00192\u000c\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00142\u0006\u0010\u001c\u001a\u00020\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/RestingHourPeriodRepositoryImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/RestingHourPeriodRepository;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/BaseActivityPeriodRepositoryImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;",
        "restingPeriodService",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/RestingHourPeriodCloudService;",
        "restingWeekPeriodDao",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao;",
        "type",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodType;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/RestingHourPeriodCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodType;)V",
        "activityIDs",
        "Lkotlin/Pair;",
        "",
        "page",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;",
        "byUTC",
        "",
        "getCachePeriods",
        "Lio/reactivex/Single;",
        "",
        "startEndPair",
        "getCloudPeriods",
        "getLastPeriod",
        "getSavePeriodsCompletable",
        "Lio/reactivex/Completable;",
        "items",
        "save",
        "toCacheOnly",
        "Companion",
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


# static fields
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/RestingHourPeriodRepositoryImpl$Companion;

.field private static final TAG:Ljava/lang/String;


# instance fields
.field private final restingPeriodService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/RestingHourPeriodCloudService;

.field private final restingWeekPeriodDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao;

.field private final type:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodType;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/RestingHourPeriodRepositoryImpl$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/RestingHourPeriodRepositoryImpl$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/RestingHourPeriodRepositoryImpl;->Companion:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/RestingHourPeriodRepositoryImpl$Companion;

    .line 39
    const-class v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/RestingHourPeriodRepository;

    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/reflect/KClass;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/RestingHourPeriodRepositoryImpl;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/RestingHourPeriodCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodType;)V
    .locals 1

    const-string v0, "restingPeriodService"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "restingWeekPeriodDao"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/BaseActivityPeriodRepositoryImpl;-><init>()V

    .line 21
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/RestingHourPeriodRepositoryImpl;->restingPeriodService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/RestingHourPeriodCloudService;

    .line 22
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/RestingHourPeriodRepositoryImpl;->restingWeekPeriodDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao;

    .line 23
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/RestingHourPeriodRepositoryImpl;->type:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodType;

    return-void
.end method

.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/RestingHourPeriodCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 23
    sget-object p3, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodType$Hour;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodType$Hour;

    check-cast p3, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodType;

    .line 21
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/RestingHourPeriodRepositoryImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/RestingHourPeriodCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodType;)V

    return-void
.end method


# virtual methods
.method public activityIDs(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;Z)Lkotlin/Pair;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;",
            "Z)",
            "Lkotlin/Pair<",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    const-string p2, "page"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ActivityPeriodsExtensionsKt;->startEndTime(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method

.method public getCachePeriods(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;Lkotlin/Pair;)Lio/reactivex/Single;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;",
            "Lkotlin/Pair<",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            ">;)",
            "Lio/reactivex/Single<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;",
            ">;>;"
        }
    .end annotation

    const-string v0, "page"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "startEndPair"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/RestingHourPeriodRepositoryImpl;->restingWeekPeriodDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao;

    invoke-virtual {p2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p2}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    invoke-virtual {p1, v0, v1, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao;->getRestingHourPeriods(JJ)Lio/reactivex/Single;

    move-result-object p1

    return-object p1
.end method

.method public getCloudPeriods(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;)Lio/reactivex/Single;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;",
            ")",
            "Lio/reactivex/Single<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;",
            ">;>;"
        }
    .end annotation

    const-string v0, "page"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/RestingHourPeriodRepositoryImpl;->restingPeriodService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/RestingHourPeriodCloudService;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/RestingHourPeriodRepositoryImpl;->type:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodType;

    invoke-interface {v0, p1, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/RestingHourPeriodCloudService;->getAllRestingPeriods(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodType;)Lio/reactivex/Single;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getLastPeriod()Ljava/lang/Object;
    .locals 1

    .line 21
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/RestingHourPeriodRepositoryImpl;->getLastPeriod()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;

    move-result-object v0

    return-object v0
.end method

.method public getLastPeriod()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;
    .locals 1

    .line 26
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/RestingHourPeriodRepositoryImpl;->restingWeekPeriodDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao;->lastRestingHour()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;

    move-result-object v0

    return-object v0
.end method

.method public getSavePeriodsCompletable(Ljava/util/List;)Lio/reactivex/Completable;
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

    const-string v0, "items"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/RestingHourPeriodRepositoryImpl;->restingWeekPeriodDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao;

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao;->addRestingHourPeriodsCompletable(Ljava/util/List;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public save(Ljava/util/List;Z)Lio/reactivex/Completable;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;",
            ">;Z)",
            "Lio/reactivex/Completable;"
        }
    .end annotation

    const-string p2, "items"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/RestingHourPeriodRepositoryImpl;->restingWeekPeriodDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao;

    invoke-virtual {p2, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao;->addRestingHourPeriodsCompletable(Ljava/util/List;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method
