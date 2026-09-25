.class public abstract Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/BaseActivityPeriodRepositoryImpl;
.super Ljava/lang/Object;
.source "BaseActivityPeriodRepositoryImpl.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AllRepository;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AddAllRepository;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/CacheRepository;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;",
        ">",
        "Ljava/lang/Object;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AllRepository<",
        "TT;>;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AddAllRepository<",
        "TT;>;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/CacheRepository;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008&\u0018\u0000*\u0008\u0008\u0000\u0010\u0001*\u00020\u00022\u0008\u0012\u0004\u0012\u0002H\u00010\u00032\u0008\u0012\u0004\u0012\u0002H\u00010\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J&\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\r2\u0006\u0010\u000e\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0010H&J$\u0010\u0011\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00130\u00122\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\u0008\u0010\u0015\u001a\u00020\u0016H\u0016J0\u0010\u0017\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00130\u00182\u0006\u0010\u000e\u001a\u00020\t2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\rH&J\u001c\u0010\u001a\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00130\u00182\u0006\u0010\u000e\u001a\u00020\tH&J\u0016\u0010\u001b\u001a\u00020\u001c2\u000c\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0013H&J\u001e\u0010\u001e\u001a\u00020\u001c2\u000c\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00132\u0006\u0010\u001f\u001a\u00020\u0010H\u0016R*\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008j\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/BaseActivityPeriodRepositoryImpl;",
        "T",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AllRepository;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AddAllRepository;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/CacheRepository;",
        "()V",
        "pageCache",
        "Ljava/util/HashMap;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;",
        "",
        "Lkotlin/collections/HashMap;",
        "activityIDs",
        "Lkotlin/Pair;",
        "page",
        "byUTC",
        "",
        "all",
        "Lio/reactivex/Observable;",
        "",
        "fromCache",
        "clearCache",
        "",
        "getCachePeriods",
        "Lio/reactivex/Single;",
        "startEndPair",
        "getCloudPeriods",
        "getSavePeriodsCompletable",
        "Lio/reactivex/Completable;",
        "items",
        "save",
        "toCacheOnly",
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
.field private final pageCache:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/BaseActivityPeriodRepositoryImpl;->pageCache:Ljava/util/HashMap;

    return-void
.end method

.method public static synthetic activityIDs$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/BaseActivityPeriodRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;ZILjava/lang/Object;)Lkotlin/Pair;
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x1

    .line 69
    :cond_0
    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/BaseActivityPeriodRepositoryImpl;->activityIDs(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;Z)Lkotlin/Pair;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: activityIDs"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final all$lambda-5(ZLpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/BaseActivityPeriodRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;)Lio/reactivex/ObservableSource;
    .locals 4

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$page"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz p0, :cond_0

    .line 31
    invoke-static {p1, p2, v2, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/BaseActivityPeriodRepositoryImpl;->activityIDs$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/BaseActivityPeriodRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;ZILjava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    invoke-virtual {p1, p2, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/BaseActivityPeriodRepositoryImpl;->getCachePeriods(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;Lkotlin/Pair;)Lio/reactivex/Single;

    move-result-object p0

    invoke-virtual {p0}, Lio/reactivex/Single;->toObservable()Lio/reactivex/Observable;

    move-result-object p0

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/-$$Lambda$BaseActivityPeriodRepositoryImpl$wbcAHVJI5lxIX7hJ080DmJmrfpw;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/-$$Lambda$BaseActivityPeriodRepositoryImpl$wbcAHVJI5lxIX7hJ080DmJmrfpw;

    .line 32
    invoke-virtual {p0, p1}, Lio/reactivex/Observable;->onErrorReturn(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0

    .line 35
    :cond_0
    iget-object p0, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/BaseActivityPeriodRepositoryImpl;->pageCache:Ljava/util/HashMap;

    invoke-virtual {p0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Long;

    .line 36
    invoke-virtual {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;->isPageExpired(Ljava/lang/Long;)Z

    move-result p0

    if-nez p0, :cond_1

    .line 37
    invoke-static {p1, p2, v2, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/BaseActivityPeriodRepositoryImpl;->activityIDs$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/BaseActivityPeriodRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;ZILjava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    invoke-virtual {p1, p2, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/BaseActivityPeriodRepositoryImpl;->getCachePeriods(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;Lkotlin/Pair;)Lio/reactivex/Single;

    move-result-object p0

    invoke-virtual {p0}, Lio/reactivex/Single;->toObservable()Lio/reactivex/Observable;

    move-result-object p0

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/-$$Lambda$BaseActivityPeriodRepositoryImpl$gColesBPMfmaam7S78l0pUdKeoM;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/-$$Lambda$BaseActivityPeriodRepositoryImpl$gColesBPMfmaam7S78l0pUdKeoM;

    .line 38
    invoke-virtual {p0, p1}, Lio/reactivex/Observable;->onErrorReturn(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0

    .line 41
    :cond_1
    invoke-virtual {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/BaseActivityPeriodRepositoryImpl;->getCloudPeriods(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;)Lio/reactivex/Single;

    move-result-object p0

    .line 42
    invoke-static {}, Lio/reactivex/schedulers/Schedulers;->io()Lio/reactivex/Scheduler;

    move-result-object v3

    invoke-virtual {p0, v3}, Lio/reactivex/Single;->subscribeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Single;

    move-result-object p0

    .line 43
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/-$$Lambda$BaseActivityPeriodRepositoryImpl$sCxoVrvDCbtch7gHMmPcZ3QhHSE;

    invoke-direct {v3, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/-$$Lambda$BaseActivityPeriodRepositoryImpl$sCxoVrvDCbtch7gHMmPcZ3QhHSE;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/BaseActivityPeriodRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;)V

    invoke-virtual {p0, v3}, Lio/reactivex/Single;->doOnSuccess(Lio/reactivex/functions/Consumer;)Lio/reactivex/Single;

    move-result-object p0

    .line 46
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/-$$Lambda$BaseActivityPeriodRepositoryImpl$uNryZp9T0BidxK57zykid_oUV1Q;

    invoke-direct {v3, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/-$$Lambda$BaseActivityPeriodRepositoryImpl$uNryZp9T0BidxK57zykid_oUV1Q;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/BaseActivityPeriodRepositoryImpl;)V

    invoke-virtual {p0, v3}, Lio/reactivex/Single;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object p0

    .line 52
    invoke-virtual {p0}, Lio/reactivex/Single;->toObservable()Lio/reactivex/Observable;

    move-result-object p0

    .line 53
    invoke-static {}, Lio/reactivex/Observable;->empty()Lio/reactivex/Observable;

    move-result-object v3

    check-cast v3, Lio/reactivex/ObservableSource;

    invoke-virtual {p0, v3}, Lio/reactivex/Observable;->onErrorResumeNext(Lio/reactivex/ObservableSource;)Lio/reactivex/Observable;

    move-result-object p0

    .line 56
    invoke-static {p1, p2, v2, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/BaseActivityPeriodRepositoryImpl;->activityIDs$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/BaseActivityPeriodRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;ZILjava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/BaseActivityPeriodRepositoryImpl;->getCachePeriods(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;Lkotlin/Pair;)Lio/reactivex/Single;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/Single;->toObservable()Lio/reactivex/Observable;

    move-result-object p1

    check-cast p1, Lio/reactivex/ObservableSource;

    .line 57
    check-cast p0, Lio/reactivex/ObservableSource;

    .line 56
    invoke-static {p1, p0}, Lio/reactivex/Observable;->concat(Lio/reactivex/ObservableSource;Lio/reactivex/ObservableSource;)Lio/reactivex/Observable;

    move-result-object p0

    .line 58
    invoke-static {}, Lio/reactivex/schedulers/Schedulers;->io()Lio/reactivex/Scheduler;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/reactivex/Observable;->subscribeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final all$lambda-5$lambda-0(Ljava/lang/Throwable;)Ljava/util/List;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final all$lambda-5$lambda-1(Ljava/lang/Throwable;)Ljava/util/List;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final all$lambda-5$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/BaseActivityPeriodRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;Ljava/util/List;)V
    .locals 2

    const-string p2, "this$0"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "$page"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/BaseActivityPeriodRepositoryImpl;->pageCache:Ljava/util/HashMap;

    check-cast p0, Ljava/util/Map;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-interface {p0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final all$lambda-5$lambda-4(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/BaseActivityPeriodRepositoryImpl;Ljava/util/List;)Lio/reactivex/SingleSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "days"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/BaseActivityPeriodRepositoryImpl;->getSavePeriodsCompletable(Ljava/util/List;)Lio/reactivex/Completable;

    move-result-object p0

    .line 48
    invoke-virtual {p0, p1}, Lio/reactivex/Completable;->toSingleDefault(Ljava/lang/Object;)Lio/reactivex/Single;

    move-result-object p0

    .line 50
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/-$$Lambda$BaseActivityPeriodRepositoryImpl$FZQiHq8-PACnrWEUE6Ne4XT5hjA;

    invoke-direct {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/-$$Lambda$BaseActivityPeriodRepositoryImpl$FZQiHq8-PACnrWEUE6Ne4XT5hjA;-><init>(Ljava/util/List;)V

    invoke-virtual {p0, v0}, Lio/reactivex/Single;->onErrorReturn(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object p0

    check-cast p0, Lio/reactivex/SingleSource;

    return-object p0
.end method

.method private static final all$lambda-5$lambda-4$lambda-3(Ljava/util/List;Ljava/lang/Throwable;)Ljava/util/List;
    .locals 1

    const-string v0, "$days"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static synthetic lambda$5PsJlqFj7dclbbTF8WRqPC0yUJE(ZLpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/BaseActivityPeriodRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/BaseActivityPeriodRepositoryImpl;->all$lambda-5(ZLpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/BaseActivityPeriodRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$FZQiHq8-PACnrWEUE6Ne4XT5hjA(Ljava/util/List;Ljava/lang/Throwable;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/BaseActivityPeriodRepositoryImpl;->all$lambda-5$lambda-4$lambda-3(Ljava/util/List;Ljava/lang/Throwable;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$gColesBPMfmaam7S78l0pUdKeoM(Ljava/lang/Throwable;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/BaseActivityPeriodRepositoryImpl;->all$lambda-5$lambda-1(Ljava/lang/Throwable;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$sCxoVrvDCbtch7gHMmPcZ3QhHSE(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/BaseActivityPeriodRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/BaseActivityPeriodRepositoryImpl;->all$lambda-5$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/BaseActivityPeriodRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic lambda$uNryZp9T0BidxK57zykid_oUV1Q(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/BaseActivityPeriodRepositoryImpl;Ljava/util/List;)Lio/reactivex/SingleSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/BaseActivityPeriodRepositoryImpl;->all$lambda-5$lambda-4(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/BaseActivityPeriodRepositoryImpl;Ljava/util/List;)Lio/reactivex/SingleSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$wbcAHVJI5lxIX7hJ080DmJmrfpw(Ljava/lang/Throwable;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/BaseActivityPeriodRepositoryImpl;->all$lambda-5$lambda-0(Ljava/lang/Throwable;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract activityIDs(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;Z)Lkotlin/Pair;
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
.end method

.method public all(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;Z)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;",
            "Z)",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "TT;>;>;"
        }
    .end annotation

    const-string v0, "page"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/-$$Lambda$BaseActivityPeriodRepositoryImpl$5PsJlqFj7dclbbTF8WRqPC0yUJE;

    invoke-direct {v0, p2, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/-$$Lambda$BaseActivityPeriodRepositoryImpl$5PsJlqFj7dclbbTF8WRqPC0yUJE;-><init>(ZLpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/BaseActivityPeriodRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;)V

    invoke-static {v0}, Lio/reactivex/Observable;->defer(Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "defer {\n\n        if (fromCache) {\n            return@defer getCachePeriods(page, activityIDs(page)).toObservable()\n                    .onErrorReturn { listOf() }\n        }\n\n        val lastSuccessfulResponseTime = pageCache[page]\n        if (!page.isPageExpired(lastSuccessfulResponseTime)) {\n            return@defer getCachePeriods(page, activityIDs(page)).toObservable()\n                    .onErrorReturn { listOf() }\n        }\n\n        val cloud = getCloudPeriods(page)\n                .subscribeOn(Schedulers.io())\n                .doOnSuccess {\n                    pageCache[page] = System.currentTimeMillis()\n                }\n                .flatMap { days ->\n                    getSavePeriodsCompletable(days)\n                            .toSingleDefault(days)\n                            // if error occurs, just catch it, we cannot retry here\n                            .onErrorReturn { days }\n                }\n                .toObservable()\n                .onErrorResumeNext(Observable.empty<List<T>>())\n\n\n        Observable.concat(getCachePeriods(page, activityIDs(page)).toObservable(),\n                cloud)\n                .subscribeOn(Schedulers.io())\n    }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public clearCache()V
    .locals 1

    .line 62
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/BaseActivityPeriodRepositoryImpl;->pageCache:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    return-void
.end method

.method public abstract getCachePeriods(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;Lkotlin/Pair;)Lio/reactivex/Single;
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
            "TT;>;>;"
        }
    .end annotation
.end method

.method public abstract getCloudPeriods(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;)Lio/reactivex/Single;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;",
            ")",
            "Lio/reactivex/Single<",
            "Ljava/util/List<",
            "TT;>;>;"
        }
    .end annotation
.end method

.method public abstract getSavePeriodsCompletable(Ljava/util/List;)Lio/reactivex/Completable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+TT;>;)",
            "Lio/reactivex/Completable;"
        }
    .end annotation
.end method

.method public save(Ljava/util/List;Z)Lio/reactivex/Completable;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+TT;>;Z)",
            "Lio/reactivex/Completable;"
        }
    .end annotation

    const-string p2, "items"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/BaseActivityPeriodRepositoryImpl;->getSavePeriodsCompletable(Ljava/util/List;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method
