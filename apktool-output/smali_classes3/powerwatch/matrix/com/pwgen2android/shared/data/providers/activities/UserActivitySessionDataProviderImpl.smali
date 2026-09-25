.class public final Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProviderImpl;
.super Ljava/lang/Object;
.source "UserActivitySessionDataProvider.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProvider;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0002\u0010\tJ\u0014\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0012\u001a\u00020\u0013J\u001c\u0010\u0014\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0006\u0010\u0015\u001a\u00020\u000cH\u0016J\u0016\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000RB\u0010\n\u001a6\u0012\u0004\u0012\u00020\u000c\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000f0\u000e0\r0\u000bj\u001a\u0012\u0004\u0012\u00020\u000c\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000f0\u000e0\r`\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProviderImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProvider;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "userActivitySessionRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;",
        "watchSynchronizer",
        "Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;",
        "cloudSynchronizer",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;)V",
        "pages",
        "Ljava/util/HashMap;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;",
        "Lio/reactivex/Observable;",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
        "Lkotlin/collections/HashMap;",
        "getPeriods",
        "periodsContainer",
        "Lpowerwatch/matrix/com/pwgen2android/shared/sync/PeriodsContainer;",
        "loadData",
        "page",
        "loadSessionById",
        "id",
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
.field private final cloudSynchronizer:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;

.field private final pages:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
            ">;>;>;"
        }
    .end annotation
.end field

.field private final userActivitySessionRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;

.field private final watchSynchronizer:Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;)V
    .locals 1

    const-string v0, "userActivitySessionRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "watchSynchronizer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cloudSynchronizer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProviderImpl;->userActivitySessionRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;

    .line 22
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProviderImpl;->watchSynchronizer:Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;

    .line 23
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProviderImpl;->cloudSynchronizer:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;

    .line 26
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProviderImpl;->pages:Ljava/util/HashMap;

    return-void
.end method

.method public static synthetic lambda$-NwGjEVHRsRdJCarwpkr0LPeYIk(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProviderImpl;Lkotlin/jvm/internal/Ref$ObjectRef;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncEvent$SyncFinishedEvent;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProviderImpl;->loadData$lambda-3$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProviderImpl;Lkotlin/jvm/internal/Ref$ObjectRef;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncEvent$SyncFinishedEvent;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$EWRHgnEThAcMpjGBiylrOaN_j2Y(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProviderImpl;Lkotlin/jvm/internal/Ref$ObjectRef;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProviderImpl;->loadData$lambda-3$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProviderImpl;Lkotlin/jvm/internal/Ref$ObjectRef;)V

    return-void
.end method

.method public static synthetic lambda$GhEyDOa5E7AKcxF8qajx1OCVFvU(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProviderImpl;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProviderImpl;->loadData$lambda-3(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProviderImpl;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$uIYShWIQB7YE0lUKDE9Q6JibUik(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProviderImpl;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncEvent$SyncFinishedEvent;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProviderImpl;->loadData$lambda-3$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProviderImpl;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncEvent$SyncFinishedEvent;)V

    return-void
.end method

.method private static final loadData$lambda-3(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProviderImpl;)Lio/reactivex/ObservableSource;
    .locals 14

    const-string v0, "$page"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    new-instance v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;->getOffset()J

    move-result-wide v1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;->getCorrectedOffset()I

    move-result v3

    int-to-long v3, v3

    add-long v7, v1, v3

    const/4 v6, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/16 v12, 0xd

    const/4 v13, 0x0

    move-object v5, p0

    invoke-static/range {v5 .. v13}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;->copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;IJJIILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;

    move-result-object v1

    iput-object v1, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 36
    iget-object v1, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProviderImpl;->watchSynchronizer:Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;

    invoke-interface {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;->getSyncInProgress()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProviderImpl;->cloudSynchronizer:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;

    invoke-interface {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;->hasActivitySessionsToSync()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const-wide v6, 0x7fffffffffffffffL

    const/4 v8, 0x0

    const/16 v9, 0xb

    const/4 v10, 0x0

    move-object v2, p0

    .line 37
    invoke-static/range {v2 .. v10}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;->copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;IJJIILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;

    move-result-object p0

    iput-object p0, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 40
    :cond_1
    iget-object p0, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProviderImpl;->pages:Ljava/util/HashMap;

    iget-object v1, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    invoke-virtual {p0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    .line 41
    iget-object p0, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProviderImpl;->pages:Ljava/util/HashMap;

    iget-object p1, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0

    .line 43
    :cond_2
    iget-object p0, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProviderImpl;->watchSynchronizer:Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;

    invoke-interface {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;->formattedDataOutput()Lio/reactivex/Observable;

    move-result-object p0

    .line 44
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/-$$Lambda$UserActivitySessionDataProviderImpl$uIYShWIQB7YE0lUKDE9Q6JibUik;

    invoke-direct {v1, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/-$$Lambda$UserActivitySessionDataProviderImpl$uIYShWIQB7YE0lUKDE9Q6JibUik;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProviderImpl;)V

    invoke-virtual {p0, v1}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p0

    .line 45
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/-$$Lambda$UserActivitySessionDataProviderImpl$-NwGjEVHRsRdJCarwpkr0LPeYIk;

    invoke-direct {v1, p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/-$$Lambda$UserActivitySessionDataProviderImpl$-NwGjEVHRsRdJCarwpkr0LPeYIk;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProviderImpl;Lkotlin/jvm/internal/Ref$ObjectRef;)V

    invoke-virtual {p0, v1}, Lio/reactivex/Observable;->switchMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    .line 50
    iget-object v1, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProviderImpl;->userActivitySessionRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AllRepository;

    iget-object v2, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v1, v2, v3, v4, v5}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AllRepository$DefaultImpls;->all$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AllRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;ZILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v1

    .line 51
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/-$$Lambda$UserActivitySessionDataProviderImpl$EWRHgnEThAcMpjGBiylrOaN_j2Y;

    invoke-direct {v2, p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/-$$Lambda$UserActivitySessionDataProviderImpl$EWRHgnEThAcMpjGBiylrOaN_j2Y;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProviderImpl;Lkotlin/jvm/internal/Ref$ObjectRef;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->doOnTerminate(Lio/reactivex/functions/Action;)Lio/reactivex/Observable;

    move-result-object p1

    check-cast p1, Lio/reactivex/ObservableSource;

    .line 43
    invoke-static {p0, p1}, Lio/reactivex/Observable;->merge(Lio/reactivex/ObservableSource;Lio/reactivex/ObservableSource;)Lio/reactivex/Observable;

    move-result-object p0

    .line 54
    invoke-virtual {p0}, Lio/reactivex/Observable;->publish()Lio/reactivex/observables/ConnectableObservable;

    move-result-object p0

    .line 55
    invoke-virtual {p0}, Lio/reactivex/observables/ConnectableObservable;->autoConnect()Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final loadData$lambda-3$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProviderImpl;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncEvent$SyncFinishedEvent;)V
    .locals 2

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p1, "Sync event done arrived, triggering activitySessions read."

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final loadData$lambda-3$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProviderImpl;Lkotlin/jvm/internal/Ref$ObjectRef;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncEvent$SyncFinishedEvent;)Lio/reactivex/ObservableSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$pageWithCache"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProviderImpl;->userActivitySessionRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;

    iget-object p1, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;

    const/4 p2, 0x1

    invoke-interface {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;->all(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;Z)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final loadData$lambda-3$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProviderImpl;Lkotlin/jvm/internal/Ref$ObjectRef;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$pageWithCache"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProviderImpl;->pages:Ljava/util/HashMap;

    iget-object p1, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    invoke-virtual {p0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 20
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method public final getPeriods(Lpowerwatch/matrix/com/pwgen2android/shared/sync/PeriodsContainer;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/sync/PeriodsContainer;",
            ")",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
            ">;"
        }
    .end annotation

    const-string v0, "periodsContainer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/PeriodsContainer;->getDayActivitySessions()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public loadData(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;",
            ")",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
            ">;>;"
        }
    .end annotation

    const-string v0, "page"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/-$$Lambda$UserActivitySessionDataProviderImpl$GhEyDOa5E7AKcxF8qajx1OCVFvU;

    invoke-direct {v0, p1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/-$$Lambda$UserActivitySessionDataProviderImpl$GhEyDOa5E7AKcxF8qajx1OCVFvU;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProviderImpl;)V

    invoke-static {v0}, Lio/reactivex/Observable;->defer(Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "defer {\n\n        var pageWithCache = page.copy(offset = page.offset + page.correctedOffset)\n        if (watchSynchronizer.syncInProgress || cloudSynchronizer.hasActivitySessionsToSync()) {\n            pageWithCache = page.copy(pageExpireTime = Long.MAX_VALUE)\n        }\n\n        if (pages.containsKey(pageWithCache)) {\n            return@defer pages[pageWithCache]\n        }\n        Observable.merge(watchSynchronizer.formattedDataOutput()\n                .doOnNext {  debug(\"Sync event done arrived, triggering activitySessions read.\") }\n                .switchMap {\n                    // if trigger is sync finished event, we should force cache\n                    // sync logs are in parallel sent to the cloud\n                    userActivitySessionRepository.all(pageWithCache, fromCache = true)\n                },\n                userActivitySessionRepository.all(pageWithCache)\n                .doOnTerminate {\n                    pages.remove(pageWithCache)\n                })\n                .publish()\n                .autoConnect()\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public loadSessionById(Ljava/lang/String;)Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
            ">;"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProviderImpl;->userActivitySessionRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;

    const/4 v1, 0x1

    invoke-interface {v0, p1, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;->getOne(Ljava/lang/Object;Z)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method
