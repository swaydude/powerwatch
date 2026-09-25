.class public final Lpowerwatch/matrix/com/pwgen2android/main/SyncProcessExecutor;
.super Ljava/lang/Object;
.source "PairingProcessExecutor.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\"\u0004\u0008\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/SyncProcessExecutor;",
        "",
        "watchSynchronizer",
        "Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;)V",
        "power",
        "",
        "getPower",
        "()F",
        "setPower",
        "(F)V",
        "execute",
        "Lio/reactivex/Observable;",
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
.field private power:F

.field private final watchSynchronizer:Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;)V
    .locals 1

    const-string v0, "watchSynchronizer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/SyncProcessExecutor;->watchSynchronizer:Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;

    const/high16 p1, 0x3f800000    # 1.0f

    .line 22
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/SyncProcessExecutor;->power:F

    return-void
.end method

.method private static final execute$lambda-0(Lpowerwatch/matrix/com/pwgen2android/main/SyncProcessExecutor;Lio/reactivex/ObservableEmitter;)V
    .locals 9

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/SyncProcessExecutor;->watchSynchronizer:Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;

    new-instance v8, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x1e

    const/4 v7, 0x0

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;-><init>(ZLjava/util/concurrent/TimeUnit;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v8}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;->startSync(Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;)V

    .line 28
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-interface {p1, p0}, Lio/reactivex/ObservableEmitter;->onNext(Ljava/lang/Object;)V

    .line 29
    invoke-interface {p1}, Lio/reactivex/ObservableEmitter;->onComplete()V

    return-void
.end method

.method private static final execute$lambda-1(Lkotlin/Triple;Lkotlin/Unit;)Lkotlin/Triple;
    .locals 1

    const-string v0, "sync"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$noName_1"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final execute$lambda-2(Lkotlin/Triple;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    invoke-virtual {p0}, Lkotlin/Triple;->getSecond()Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static final execute$lambda-3(Lkotlin/Triple;)Lio/reactivex/ObservableSource;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    invoke-virtual {p0}, Lkotlin/Triple;->getThird()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lkotlin/Triple;->getThird()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Throwable;

    invoke-static {p0}, Lio/reactivex/Observable;->error(Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0

    .line 42
    :cond_0
    invoke-virtual {p0}, Lkotlin/Triple;->getFirst()Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method public static synthetic lambda$WdycbW_l09p2iBEqHkmvFEbtWzQ(Lkotlin/Triple;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/SyncProcessExecutor;->execute$lambda-3(Lkotlin/Triple;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$YtGjbHGn9Q8ksoG0hnkQas6-WGo(Lkotlin/Triple;Lkotlin/Unit;)Lkotlin/Triple;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/SyncProcessExecutor;->execute$lambda-1(Lkotlin/Triple;Lkotlin/Unit;)Lkotlin/Triple;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$grX2mXX7UHeKh7REQ8Kq8Ubbwkw(Lkotlin/Triple;)Z
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/SyncProcessExecutor;->execute$lambda-2(Lkotlin/Triple;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$xkQaN_H8dhvyIs6hFb0eR4NcwJc(Lpowerwatch/matrix/com/pwgen2android/main/SyncProcessExecutor;Lio/reactivex/ObservableEmitter;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/SyncProcessExecutor;->execute$lambda-0(Lpowerwatch/matrix/com/pwgen2android/main/SyncProcessExecutor;Lio/reactivex/ObservableEmitter;)V

    return-void
.end method


# virtual methods
.method public final execute()Lio/reactivex/Observable;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 26
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$SyncProcessExecutor$xkQaN_H8dhvyIs6hFb0eR4NcwJc;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$SyncProcessExecutor$xkQaN_H8dhvyIs6hFb0eR4NcwJc;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/SyncProcessExecutor;)V

    invoke-static {v0}, Lio/reactivex/Observable;->create(Lio/reactivex/ObservableOnSubscribe;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "create<Unit> {\n            watchSynchronizer.startSync(SyncConfig(false))\n            it.onNext(Unit)\n            it.onComplete()\n        }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/SyncProcessExecutor;->watchSynchronizer:Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;

    invoke-interface {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;->syncOutput()Lio/reactivex/Observable;

    move-result-object v1

    const-wide/16 v2, 0x1

    .line 33
    invoke-virtual {v1, v2, v3}, Lio/reactivex/Observable;->skip(J)Lio/reactivex/Observable;

    move-result-object v1

    check-cast v1, Lio/reactivex/ObservableSource;

    .line 34
    check-cast v0, Lio/reactivex/ObservableSource;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$SyncProcessExecutor$YtGjbHGn9Q8ksoG0hnkQas6-WGo;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$SyncProcessExecutor$YtGjbHGn9Q8ksoG0hnkQas6-WGo;

    .line 31
    invoke-static {v1, v0, v2}, Lio/reactivex/Observable;->combineLatest(Lio/reactivex/ObservableSource;Lio/reactivex/ObservableSource;Lio/reactivex/functions/BiFunction;)Lio/reactivex/Observable;

    move-result-object v0

    .line 38
    invoke-virtual {v0}, Lio/reactivex/Observable;->distinctUntilChanged()Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$SyncProcessExecutor$grX2mXX7UHeKh7REQ8Kq8Ubbwkw;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$SyncProcessExecutor$grX2mXX7UHeKh7REQ8Kq8Ubbwkw;

    .line 39
    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->takeUntil(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$SyncProcessExecutor$WdycbW_l09p2iBEqHkmvFEbtWzQ;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$SyncProcessExecutor$WdycbW_l09p2iBEqHkmvFEbtWzQ;

    .line 40
    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "combineLatest(\n                watchSynchronizer.syncOutput()\n                        .skip(1),\n                requestObs,\n                BiFunction<Triple<Int, DataInfo?, Throwable?>, Unit, Triple<Int, DataInfo?, Throwable?>> { sync, _ ->\n                    sync\n                })\n                .distinctUntilChanged()\n                .takeUntil { it.second != null }\n                .flatMap {\n                    if (it.third != null) return@flatMap Observable.error<Int>(it.third)\n                    else return@flatMap Observable.just(it.first)\n                }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getPower()F
    .locals 1

    .line 22
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/SyncProcessExecutor;->power:F

    return v0
.end method

.method public final setPower(F)V
    .locals 0

    .line 22
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/SyncProcessExecutor;->power:F

    return-void
.end method
