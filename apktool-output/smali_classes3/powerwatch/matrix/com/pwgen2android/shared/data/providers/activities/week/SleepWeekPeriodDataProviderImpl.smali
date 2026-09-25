.class public final Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/SleepWeekPeriodDataProviderImpl;
.super Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/BaseActivityDataProvider;
.source "SleepWeekPeriodDataProvider.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/SleepWeekPeriodDataProvider;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/BaseActivityDataProvider<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepWeekPeriod;",
        ">;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/SleepWeekPeriodDataProvider;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSleepWeekPeriodDataProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepWeekPeriodDataProvider.kt\npowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/SleepWeekPeriodDataProviderImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,38:1\n1547#2:39\n1618#2,3:40\n*S KotlinDebug\n*F\n+ 1 SleepWeekPeriodDataProvider.kt\npowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/SleepWeekPeriodDataProviderImpl\n*L\n31#1:39\n31#1:40,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u000c0\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016\u00a8\u0006\u0013"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/SleepWeekPeriodDataProviderImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/BaseActivityDataProvider;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepWeekPeriod;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/SleepWeekPeriodDataProvider;",
        "sleepWeekPeriodRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/week/SleepWeekPeriodRepository;",
        "watchSynchronizer",
        "Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;",
        "cloudSynchronizer",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/week/SleepWeekPeriodRepository;Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;)V",
        "getPeriods",
        "",
        "periodsContainer",
        "Lpowerwatch/matrix/com/pwgen2android/shared/sync/PeriodsContainer;",
        "loadData",
        "Lio/reactivex/Observable;",
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


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/week/SleepWeekPeriodRepository;Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;)V
    .locals 1

    const-string v0, "sleepWeekPeriodRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "watchSynchronizer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cloudSynchronizer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AllRepository;

    invoke-direct {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/BaseActivityDataProvider;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AllRepository;Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;)V

    return-void
.end method

.method public static synthetic lambda$NTHld7MBMr14xouE-6tGkfYzVac(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;Ljava/util/List;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/SleepWeekPeriodDataProviderImpl;->loadData$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final loadData$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;Ljava/util/List;)Ljava/util/List;
    .locals 4

    const-string v0, "$page"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    check-cast p1, Ljava/lang/Iterable;

    .line 39
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v0, Ljava/util/Collection;

    .line 40
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 41
    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepWeekPeriod;

    const/4 v2, 0x1

    .line 32
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;->getCorrectedOffset()I

    move-result v3

    invoke-static {v1, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ActivityPeriodsExtensionsKt;->fillWithEmptyDays(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepWeekPeriod;ZI)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepWeekPeriod;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 42
    :cond_0
    check-cast v0, Ljava/util/List;

    return-object v0
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
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepWeekPeriod;",
            ">;"
        }
    .end annotation

    const-string v0, "periodsContainer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/PeriodsContainer;->getSleepWeekPeriods()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public loadData(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;)Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;",
            ")",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepWeekPeriod;",
            ">;>;"
        }
    .end annotation

    const-string v0, "page"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    invoke-super {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/BaseActivityDataProvider;->loadData(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;)Lio/reactivex/Observable;

    move-result-object v0

    .line 30
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/-$$Lambda$SleepWeekPeriodDataProviderImpl$NTHld7MBMr14xouE-6tGkfYzVac;

    invoke-direct {v1, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/-$$Lambda$SleepWeekPeriodDataProviderImpl$NTHld7MBMr14xouE-6tGkfYzVac;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "super.loadData(page)\n                .map {\n                    it.map { week ->\n                        week.fillWithEmptyDays(true, page.correctedOffset)\n                    }\n                }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
