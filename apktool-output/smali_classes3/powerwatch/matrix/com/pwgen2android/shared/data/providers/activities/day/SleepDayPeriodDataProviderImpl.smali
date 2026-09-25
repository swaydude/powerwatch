.class public final Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProviderImpl;
.super Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/BaseActivityDataProvider;
.source "SleepDayPeriodDataProvider.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/BaseActivityDataProvider<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;",
        ">;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProviderImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/BaseActivityDataProvider;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;",
        "sleepDayPeriodRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/day/SleepDayPeriodRepository;",
        "watchSynchronizer",
        "Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;",
        "cloudSynchronizer",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/day/SleepDayPeriodRepository;Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;)V",
        "getPeriods",
        "",
        "periodsContainer",
        "Lpowerwatch/matrix/com/pwgen2android/shared/sync/PeriodsContainer;",
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
.field private final watchSynchronizer:Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/day/SleepDayPeriodRepository;Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;)V
    .locals 1

    const-string v0, "sleepDayPeriodRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "watchSynchronizer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cloudSynchronizer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AllRepository;

    invoke-direct {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/BaseActivityDataProvider;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AllRepository;Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;)V

    .line 18
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProviderImpl;->watchSynchronizer:Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;

    return-void
.end method


# virtual methods
.method public getPeriods(Lpowerwatch/matrix/com/pwgen2android/shared/sync/PeriodsContainer;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/sync/PeriodsContainer;",
            ")",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;",
            ">;"
        }
    .end annotation

    const-string v0, "periodsContainer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/PeriodsContainer;->getSleepDayPeriods()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
