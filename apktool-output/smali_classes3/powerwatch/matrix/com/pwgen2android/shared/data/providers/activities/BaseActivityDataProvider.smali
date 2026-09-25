.class public abstract Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/BaseActivityDataProvider;
.super Ljava/lang/Object;
.source "BaseActivityDataProvider.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/DataProvider;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/DataProvider<",
        "TT;",
        "Ljava/lang/Long;",
        ">;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\u0008&\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004B#\u0012\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u001e\u0010\u0015\u001a\u0010\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0013\u0018\u00010\u00122\u0006\u0010\u0016\u001a\u00020\u000eH\u0002J\u0016\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00132\u0006\u0010\u0018\u001a\u00020\u0019H&J\u001c\u0010\u001a\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u000eH\u0016J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u000eH\u0002R\u0014\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000c\u001a\u0010\u0012\u000c\u0012\n \u000f*\u0004\u0018\u00010\u000e0\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000RB\u0010\u0010\u001a6\u0012\u0004\u0012\u00020\u000e\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00130\u00120\u0011j\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00130\u0012`\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/BaseActivityDataProvider;",
        "T",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/DataProvider;",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "activityPeriodRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AllRepository;",
        "watchSynchronizer",
        "Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;",
        "cloudSynchronizer",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AllRepository;Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;)V",
        "pageInput",
        "Lio/reactivex/subjects/PublishSubject;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;",
        "kotlin.jvm.PlatformType",
        "pages",
        "Ljava/util/HashMap;",
        "Lio/reactivex/Observable;",
        "",
        "Lkotlin/collections/HashMap;",
        "getPage",
        "page",
        "getPeriods",
        "periodsContainer",
        "Lpowerwatch/matrix/com/pwgen2android/shared/sync/PeriodsContainer;",
        "loadData",
        "removePage",
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
.field private final activityPeriodRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AllRepository;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AllRepository<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final cloudSynchronizer:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;

.field private final pageInput:Lio/reactivex/subjects/PublishSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/PublishSubject<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;",
            ">;"
        }
    .end annotation
.end field

.field private final pages:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "TT;>;>;>;"
        }
    .end annotation
.end field

.field private final watchSynchronizer:Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AllRepository;Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AllRepository<",
            "TT;>;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;",
            ")V"
        }
    .end annotation

    const-string v0, "activityPeriodRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "watchSynchronizer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cloudSynchronizer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/BaseActivityDataProvider;->activityPeriodRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AllRepository;

    .line 18
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/BaseActivityDataProvider;->watchSynchronizer:Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;

    .line 19
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/BaseActivityDataProvider;->cloudSynchronizer:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;

    .line 25
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/BaseActivityDataProvider;->pages:Ljava/util/HashMap;

    .line 27
    invoke-static {}, Lio/reactivex/subjects/PublishSubject;->create()Lio/reactivex/subjects/PublishSubject;

    move-result-object p1

    const-string p2, "create<Page>()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/BaseActivityDataProvider;->pageInput:Lio/reactivex/subjects/PublishSubject;

    return-void
.end method

.method private final declared-synchronized getPage(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;",
            ")",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "TT;>;>;"
        }
    .end annotation

    monitor-enter p0

    .line 73
    :try_start_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/BaseActivityDataProvider;->pages:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/reactivex/Observable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public static synthetic lambda$2uiEtIVzRaextMF9sjcGoorR_b4(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/BaseActivityDataProvider;Lkotlin/jvm/internal/Ref$ObjectRef;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncEvent$SyncFinishedEvent;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/BaseActivityDataProvider;->loadData$lambda-2$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/BaseActivityDataProvider;Lkotlin/jvm/internal/Ref$ObjectRef;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncEvent$SyncFinishedEvent;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$7IKx4pUPWoOU7XOPngkAexXPyqY(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/BaseActivityDataProvider;Lkotlin/jvm/internal/Ref$ObjectRef;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/BaseActivityDataProvider;->loadData$lambda-2$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/BaseActivityDataProvider;Lkotlin/jvm/internal/Ref$ObjectRef;)V

    return-void
.end method

.method public static synthetic lambda$qnxEfSZpTXykgWiJbF6C5tnaX_U(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/BaseActivityDataProvider;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/BaseActivityDataProvider;->loadData$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/BaseActivityDataProvider;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method private static final loadData$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/BaseActivityDataProvider;)Lio/reactivex/ObservableSource;
    .locals 14

    const-string v0, "$page"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
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

    .line 39
    iget-object v1, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/BaseActivityDataProvider;->watchSynchronizer:Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;

    invoke-interface {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;->getSyncInProgress()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/BaseActivityDataProvider;->cloudSynchronizer:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;

    invoke-interface {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;->hasBackgroundLogsToSync()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 40
    :cond_0
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;->getOffset()J

    move-result-wide v1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;->getCorrectedOffset()I

    move-result v3

    int-to-long v3, v3

    add-long v7, v1, v3

    const/4 v6, 0x0

    const-wide v9, 0x7fffffffffffffffL

    const/4 v11, 0x0

    const/16 v12, 0x9

    const/4 v13, 0x0

    move-object v5, p0

    invoke-static/range {v5 .. v13}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;->copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;IJJIILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;

    move-result-object p0

    iput-object p0, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 44
    :cond_1
    iget-object p0, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;

    invoke-direct {p1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/BaseActivityDataProvider;->getPage(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;)Lio/reactivex/Observable;

    move-result-object p0

    if-eqz p0, :cond_2

    .line 46
    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0

    .line 50
    :cond_2
    iget-object p0, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/BaseActivityDataProvider;->watchSynchronizer:Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;

    invoke-interface {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;->formattedDataOutput()Lio/reactivex/Observable;

    move-result-object p0

    .line 51
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/-$$Lambda$BaseActivityDataProvider$2uiEtIVzRaextMF9sjcGoorR_b4;

    invoke-direct {v1, p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/-$$Lambda$BaseActivityDataProvider$2uiEtIVzRaextMF9sjcGoorR_b4;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/BaseActivityDataProvider;Lkotlin/jvm/internal/Ref$ObjectRef;)V

    invoke-virtual {p0, v1}, Lio/reactivex/Observable;->switchMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    .line 56
    iget-object v1, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/BaseActivityDataProvider;->activityPeriodRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AllRepository;

    iget-object v2, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v1, v2, v3, v4, v5}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AllRepository$DefaultImpls;->all$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AllRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;ZILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v1

    .line 57
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/-$$Lambda$BaseActivityDataProvider$7IKx4pUPWoOU7XOPngkAexXPyqY;

    invoke-direct {v2, p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/-$$Lambda$BaseActivityDataProvider$7IKx4pUPWoOU7XOPngkAexXPyqY;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/BaseActivityDataProvider;Lkotlin/jvm/internal/Ref$ObjectRef;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->doOnTerminate(Lio/reactivex/functions/Action;)Lio/reactivex/Observable;

    move-result-object v1

    check-cast v1, Lio/reactivex/ObservableSource;

    .line 49
    invoke-static {p0, v1}, Lio/reactivex/Observable;->merge(Lio/reactivex/ObservableSource;Lio/reactivex/ObservableSource;)Lio/reactivex/Observable;

    move-result-object p0

    const/4 v1, 0x1

    .line 62
    invoke-virtual {p0, v1}, Lio/reactivex/Observable;->replay(I)Lio/reactivex/observables/ConnectableObservable;

    move-result-object p0

    .line 63
    invoke-virtual {p0}, Lio/reactivex/observables/ConnectableObservable;->autoConnect()Lio/reactivex/Observable;

    move-result-object p0

    const-string v1, "merge(\n                            watchSynchronizer.formattedDataOutput()\n                                    .switchMap {\n                                        // if trigger is sync finished event, we should force cache\n                                        // sync logs are in parallel sent to the cloud\n                                        activityPeriodRepository.all(pageWithCache, fromCache = true)\n                                    },\n                            activityPeriodRepository.all(pageWithCache)\n                                    .doOnTerminate {\n//                                        debug(\"Terminate called for period observable, removing page from cache.\")\n                                        removePage(pageWithCache)\n                                    }\n                    )\n                    .replay(1)\n                    .autoConnect()"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    iget-object p1, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/BaseActivityDataProvider;->pages:Ljava/util/HashMap;

    check-cast p1, Ljava/util/Map;

    iget-object v0, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    invoke-interface {p1, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final loadData$lambda-2$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/BaseActivityDataProvider;Lkotlin/jvm/internal/Ref$ObjectRef;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncEvent$SyncFinishedEvent;)Lio/reactivex/ObservableSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$pageWithCache"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/BaseActivityDataProvider;->activityPeriodRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AllRepository;

    iget-object p1, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;

    const/4 p2, 0x1

    invoke-interface {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AllRepository;->all(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;Z)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final loadData$lambda-2$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/BaseActivityDataProvider;Lkotlin/jvm/internal/Ref$ObjectRef;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$pageWithCache"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    iget-object p1, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;

    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/BaseActivityDataProvider;->removePage(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;)V

    return-void
.end method

.method private final declared-synchronized removePage(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;)V
    .locals 1

    monitor-enter p0

    .line 79
    :try_start_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/BaseActivityDataProvider;->pages:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method


# virtual methods
.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 17
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method public abstract getPeriods(Lpowerwatch/matrix/com/pwgen2android/shared/sync/PeriodsContainer;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/sync/PeriodsContainer;",
            ")",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation
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
            "TT;>;>;"
        }
    .end annotation

    const-string v0, "page"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/-$$Lambda$BaseActivityDataProvider$qnxEfSZpTXykgWiJbF6C5tnaX_U;

    invoke-direct {v0, p1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/-$$Lambda$BaseActivityDataProvider$qnxEfSZpTXykgWiJbF6C5tnaX_U;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/BaseActivityDataProvider;)V

    invoke-static {v0}, Lio/reactivex/Observable;->defer(Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object p1

    .line 66
    invoke-static {}, Lio/reactivex/schedulers/Schedulers;->io()Lio/reactivex/Scheduler;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->subscribeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "defer {\n\n            var pageWithCache = page.copy(offset = page.offset + page.correctedOffset)\n            if (watchSynchronizer.syncInProgress || cloudSynchronizer.hasBackgroundLogsToSync()) {\n                pageWithCache = page.copy(pageExpireTime = Long.MAX_VALUE, offset = page.offset + page.correctedOffset)\n            }\n\n\n            val pageObs = getPage(pageWithCache)\n\n            if (pageObs != null) return@defer pageObs\n\n            val response = Observable\n                    .merge(\n                            watchSynchronizer.formattedDataOutput()\n                                    .switchMap {\n                                        // if trigger is sync finished event, we should force cache\n                                        // sync logs are in parallel sent to the cloud\n                                        activityPeriodRepository.all(pageWithCache, fromCache = true)\n                                    },\n                            activityPeriodRepository.all(pageWithCache)\n                                    .doOnTerminate {\n//                                        debug(\"Terminate called for period observable, removing page from cache.\")\n                                        removePage(pageWithCache)\n                                    }\n                    )\n                    .replay(1)\n                    .autoConnect()\n            pages[pageWithCache] = response\n            response\n        }.subscribeOn(Schedulers.io())"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
