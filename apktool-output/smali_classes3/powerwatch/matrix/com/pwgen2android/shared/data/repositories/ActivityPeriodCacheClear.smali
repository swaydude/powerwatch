.class public final Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ActivityPeriodCacheClear;
.super Ljava/lang/Object;
.source "ActivityPeriodCacheClear.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\u000b\u001a\u00020\u000cR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ActivityPeriodCacheClear;",
        "",
        "walkingRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/WalkingHourPeriodRepository;",
        "restingRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/RestingHourPeriodRepository;",
        "sleepRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/SleepHourPeriodRepository;",
        "userActivitySessionRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/WalkingHourPeriodRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/RestingHourPeriodRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/SleepHourPeriodRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;)V",
        "clear",
        "Lio/reactivex/Completable;",
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
.field private final restingRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/RestingHourPeriodRepository;

.field private final sleepRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/SleepHourPeriodRepository;

.field private final userActivitySessionRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;

.field private final walkingRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/WalkingHourPeriodRepository;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/WalkingHourPeriodRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/RestingHourPeriodRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/SleepHourPeriodRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;)V
    .locals 1

    const-string v0, "walkingRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "restingRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sleepRepository"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userActivitySessionRepository"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ActivityPeriodCacheClear;->walkingRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/WalkingHourPeriodRepository;

    .line 9
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ActivityPeriodCacheClear;->restingRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/RestingHourPeriodRepository;

    .line 10
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ActivityPeriodCacheClear;->sleepRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/SleepHourPeriodRepository;

    .line 11
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ActivityPeriodCacheClear;->userActivitySessionRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;

    return-void
.end method

.method private static final clear$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ActivityPeriodCacheClear;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ActivityPeriodCacheClear;->walkingRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/WalkingHourPeriodRepository;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/WalkingHourPeriodRepository;->clearCache()V

    .line 15
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ActivityPeriodCacheClear;->restingRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/RestingHourPeriodRepository;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/RestingHourPeriodRepository;->clearCache()V

    .line 16
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ActivityPeriodCacheClear;->sleepRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/SleepHourPeriodRepository;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/SleepHourPeriodRepository;->clearCache()V

    .line 17
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ActivityPeriodCacheClear;->userActivitySessionRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;

    invoke-interface {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;->clearCache()V

    return-void
.end method

.method public static synthetic lambda$41MX1N23eNK0vSGWMgdI2SA4AhU(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ActivityPeriodCacheClear;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ActivityPeriodCacheClear;->clear$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ActivityPeriodCacheClear;)V

    return-void
.end method


# virtual methods
.method public final clear()Lio/reactivex/Completable;
    .locals 2

    .line 13
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$ActivityPeriodCacheClear$41MX1N23eNK0vSGWMgdI2SA4AhU;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$ActivityPeriodCacheClear$41MX1N23eNK0vSGWMgdI2SA4AhU;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ActivityPeriodCacheClear;)V

    invoke-static {v0}, Lio/reactivex/Completable;->fromAction(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object v0

    const-string v1, "fromAction {\n        walkingRepository.clearCache()\n        restingRepository.clearCache()\n        sleepRepository.clearCache()\n        userActivitySessionRepository.clearCache()\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
