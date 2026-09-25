.class public final Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
.source "BaseMapViewModel.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0007R#\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t0\u00070\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR+\u0010\u000c\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000f \u0010*\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e0\u000e0\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0013\u001a\u0010\u0012\u000c\u0012\n \u0010*\u0004\u0018\u00010\t0\t0\u0014\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0014\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0016\u00a8\u0006\u001d"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;",
        "runningAnimator",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimator;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimator;)V",
        "locationAnimationObservable",
        "Lio/reactivex/Observable;",
        "Lkotlin/Pair;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;",
        "",
        "getLocationAnimationObservable",
        "()Lio/reactivex/Observable;",
        "locationsSubject",
        "Lio/reactivex/subjects/BehaviorSubject;",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/MapPosition;",
        "kotlin.jvm.PlatformType",
        "getLocationsSubject",
        "()Lio/reactivex/subjects/BehaviorSubject;",
        "showProgressField",
        "Landroidx/databinding/ObservableField;",
        "getShowProgressField",
        "()Landroidx/databinding/ObservableField;",
        "zoomEnabled",
        "getZoomEnabled",
        "loadActivitySession",
        "",
        "activitySession",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
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
.field private final locationAnimationObservable:Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/Observable<",
            "Lkotlin/Pair<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation
.end field

.field private final locationsSubject:Lio/reactivex/subjects/BehaviorSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/BehaviorSubject<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/MapPosition;",
            ">;>;"
        }
    .end annotation
.end field

.field private final runningAnimator:Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimator;

.field private final showProgressField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final zoomEnabled:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimator;)V
    .locals 2

    const-string v0, "runningAnimator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x3

    .line 15
    invoke-direct {p0, v0, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;-><init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;->runningAnimator:Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimator;

    .line 16
    new-instance v0, Landroidx/databinding/ObservableField;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;->showProgressField:Landroidx/databinding/ObservableField;

    .line 18
    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimator;->runningAnimationEvents()Lio/reactivex/Observable;

    move-result-object p1

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/-$$Lambda$BaseMapViewModel$pCDrxhsQOrgShhNfhHdtZFgPtiQ;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/-$$Lambda$BaseMapViewModel$pCDrxhsQOrgShhNfhHdtZFgPtiQ;

    .line 19
    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "runningAnimator.runningAnimationEvents()\n            .map {\n                if (it.progress == 0) {\n                    Pair(it.currentAnimationItem, true)\n                } else {\n                    Pair(it.currentAnimationItem, false)\n                }\n            }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;->locationAnimationObservable:Lio/reactivex/Observable;

    .line 28
    new-instance p1, Landroidx/databinding/ObservableField;

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-direct {p1, v0}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;->zoomEnabled:Landroidx/databinding/ObservableField;

    .line 30
    invoke-static {}, Lio/reactivex/subjects/BehaviorSubject;->create()Lio/reactivex/subjects/BehaviorSubject;

    move-result-object p1

    const-string v0, "create<List<MapPosition>>()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;->locationsSubject:Lio/reactivex/subjects/BehaviorSubject;

    return-void
.end method

.method public static synthetic lambda$6ZXcHgTH9NMHaMQKa0HxqBQPQFE(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;Lio/reactivex/ObservableEmitter;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;->loadActivitySession$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;Lio/reactivex/ObservableEmitter;)V

    return-void
.end method

.method public static synthetic lambda$frFCAV3rHoFtteOqrlUOHzO2DYg(Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;->loadActivitySession$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic lambda$pCDrxhsQOrgShhNfhHdtZFgPtiQ(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MapAnimationData;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;->locationAnimationObservable$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MapAnimationData;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method private static final loadActivitySession$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;Lio/reactivex/ObservableEmitter;)V
    .locals 10

    const-string v0, "$activitySession"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/List;

    .line 39
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getGpsPositions()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_1

    const/4 v2, 0x0

    :goto_0
    add-int/lit8 v3, v2, 0x1

    .line 40
    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/MapPosition;

    .line 41
    new-instance v5, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getGpsPositions()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;

    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;->getLatitude()D

    move-result-wide v6

    .line 42
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getGpsPositions()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;

    invoke-virtual {v8}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;->getLongitude()D

    move-result-wide v8

    .line 41
    invoke-direct {v5, v6, v7, v8, v9}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    .line 42
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getHeartRates()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;

    .line 40
    invoke-direct {v4, v5, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/MapPosition;-><init>(Lcom/google/android/gms/maps/model/LatLng;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;)V

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-le v3, v1, :cond_0

    goto :goto_1

    :cond_0
    move v2, v3

    goto :goto_0

    .line 44
    :cond_1
    :goto_1
    invoke-interface {p1, v0}, Lio/reactivex/ObservableEmitter;->onNext(Ljava/lang/Object;)V

    .line 45
    invoke-interface {p1}, Lio/reactivex/ObservableEmitter;->onComplete()V

    return-void
.end method

.method private static final loadActivitySession$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;Ljava/util/List;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;->getLocationsSubject()Lio/reactivex/subjects/BehaviorSubject;

    move-result-object p0

    invoke-virtual {p0, p1}, Lio/reactivex/subjects/BehaviorSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method private static final locationAnimationObservable$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MapAnimationData;)Lkotlin/Pair;
    .locals 2

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/MapAnimationData;->getProgress()I

    move-result v0

    if-nez v0, :cond_0

    .line 21
    new-instance v0, Lkotlin/Pair;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/MapAnimationData;->getCurrentAnimationItem()Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;

    move-result-object p0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    .line 23
    :cond_0
    new-instance v0, Lkotlin/Pair;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/MapAnimationData;->getCurrentAnimationItem()Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;

    move-result-object p0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_0
    return-object v0
.end method


# virtual methods
.method public final getLocationAnimationObservable()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Pair<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation

    .line 18
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;->locationAnimationObservable:Lio/reactivex/Observable;

    return-object v0
.end method

.method public final getLocationsSubject()Lio/reactivex/subjects/BehaviorSubject;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/subjects/BehaviorSubject<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/MapPosition;",
            ">;>;"
        }
    .end annotation

    .line 30
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;->locationsSubject:Lio/reactivex/subjects/BehaviorSubject;

    return-object v0
.end method

.method public final getShowProgressField()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 16
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;->showProgressField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getZoomEnabled()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 28
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;->zoomEnabled:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final loadActivitySession(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)V
    .locals 1

    const-string v0, "activitySession"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/-$$Lambda$BaseMapViewModel$6ZXcHgTH9NMHaMQKa0HxqBQPQFE;

    invoke-direct {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/-$$Lambda$BaseMapViewModel$6ZXcHgTH9NMHaMQKa0HxqBQPQFE;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)V

    invoke-static {v0}, Lio/reactivex/Observable;->create(Lio/reactivex/ObservableOnSubscribe;)Lio/reactivex/Observable;

    move-result-object p1

    .line 47
    invoke-static {}, Lio/reactivex/schedulers/Schedulers;->computation()Lio/reactivex/Scheduler;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->subscribeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Observable;

    move-result-object p1

    .line 48
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/-$$Lambda$BaseMapViewModel$frFCAV3rHoFtteOqrlUOHzO2DYg;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/-$$Lambda$BaseMapViewModel$frFCAV3rHoFtteOqrlUOHzO2DYg;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    return-void
.end method
