.class public final Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;
.super Ljava/lang/Object;
.source "LocationInfoProvider.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u0000 12\u00020\u00012\u00020\u0002:\u00011B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0008\u0010 \u001a\u00020\u0014H\u0002J\u001c\u0010!\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010$0#0\"H\u0016J\u001c\u0010%\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010&0#0\"H\u0016J\u0012\u0010\'\u001a\u00020\u00142\u0008\u0010(\u001a\u0004\u0018\u00010&H\u0016J\u0008\u0010)\u001a\u00020\u0011H\u0002J\u0010\u0010*\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u0004H\u0016J\u0010\u0010,\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u0004H\u0016J\u0008\u0010-\u001a\u00020.H\u0016J\u0016\u0010/\u001a\u0008\u0012\u0004\u0012\u00020\u00140\"2\u0006\u00100\u001a\u00020$H\u0003R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\u000c\u0012\n \u000c*\u0004\u0018\u00010\u00040\u00040\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0010\u0012\u000c\u0012\n \u000c*\u0004\u0018\u00010\u00110\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u00138VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0015R\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001a\u001a\u0010\u0012\u000c\u0012\n \u000c*\u0004\u0018\u00010\u00140\u00140\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00062"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "context",
        "Landroid/content/Context;",
        "(Landroid/content/Context;)V",
        "LOCATION_ALT",
        "",
        "LOCATION_LAT",
        "LOCATION_LONG",
        "contextWeakReference",
        "Ljava/lang/ref/WeakReference;",
        "kotlin.jvm.PlatformType",
        "disposable",
        "Lio/reactivex/disposables/CompositeDisposable;",
        "internalLocationUpdateSubject",
        "Lio/reactivex/subjects/PublishSubject;",
        "",
        "isProviderEnabled",
        "Lio/reactivex/Observable;",
        "",
        "()Lio/reactivex/Observable;",
        "locationManager",
        "Landroid/location/LocationManager;",
        "locationReceiver",
        "Landroid/content/BroadcastReceiver;",
        "locationSubject",
        "Lio/reactivex/subjects/BehaviorSubject;",
        "locationUpdateProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;",
        "myScheduler",
        "Lio/reactivex/Scheduler;",
        "checkLocation",
        "getLastKnownLocation",
        "Lio/reactivex/Single;",
        "Lkotlin/Pair;",
        "Landroid/location/Location;",
        "getLastStoredLocation",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;",
        "isLocationValid",
        "gpsPosition",
        "registerReceiverGPS",
        "showDialog",
        "activityContext",
        "showDialogForLocation",
        "updateLocationInternal",
        "Lio/reactivex/Completable;",
        "updateStorage",
        "location",
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
.field private static final ACTION_GPS:Ljava/lang/String; = "android.location.PROVIDERS_CHANGED"

.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl$Companion;


# instance fields
.field private final LOCATION_ALT:Ljava/lang/String;

.field private final LOCATION_LAT:Ljava/lang/String;

.field private final LOCATION_LONG:Ljava/lang/String;

.field private final contextWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private final disposable:Lio/reactivex/disposables/CompositeDisposable;

.field private final internalLocationUpdateSubject:Lio/reactivex/subjects/PublishSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/PublishSubject<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final locationManager:Landroid/location/LocationManager;

.field private locationReceiver:Landroid/content/BroadcastReceiver;

.field private final locationSubject:Lio/reactivex/subjects/BehaviorSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/BehaviorSubject<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final locationUpdateProvider:Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;

.field private final myScheduler:Lio/reactivex/Scheduler;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;->Companion:Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 5

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "location_lat"

    .line 48
    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;->LOCATION_LAT:Ljava/lang/String;

    const-string v0, "location_long"

    .line 49
    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;->LOCATION_LONG:Ljava/lang/String;

    const-string v0, "location_alt"

    .line 50
    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;->LOCATION_ALT:Ljava/lang/String;

    .line 52
    invoke-static {}, Lio/reactivex/subjects/BehaviorSubject;->create()Lio/reactivex/subjects/BehaviorSubject;

    move-result-object v0

    const-string v1, "create<Boolean>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;->locationSubject:Lio/reactivex/subjects/BehaviorSubject;

    .line 53
    invoke-static {}, Lio/reactivex/subjects/PublishSubject;->create()Lio/reactivex/subjects/PublishSubject;

    move-result-object v1

    const-string v2, "create<Unit>()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;->internalLocationUpdateSubject:Lio/reactivex/subjects/PublishSubject;

    .line 54
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v2

    check-cast v2, Ljava/util/concurrent/Executor;

    invoke-static {v2}, Lio/reactivex/schedulers/Schedulers;->from(Ljava/util/concurrent/Executor;)Lio/reactivex/Scheduler;

    move-result-object v2

    const-string v3, "from(Executors.newSingleThreadExecutor())"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;->myScheduler:Lio/reactivex/Scheduler;

    .line 55
    new-instance v3, Lio/reactivex/disposables/CompositeDisposable;

    invoke-direct {v3}, Lio/reactivex/disposables/CompositeDisposable;-><init>()V

    iput-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;->disposable:Lio/reactivex/disposables/CompositeDisposable;

    .line 60
    new-instance v4, Ljava/lang/ref/WeakReference;

    invoke-direct {v4, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;->contextWeakReference:Ljava/lang/ref/WeakReference;

    .line 62
    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;

    invoke-direct {v4, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;-><init>(Landroid/content/Context;)V

    iput-object v4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;->locationUpdateProvider:Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;

    const-string v4, "location"

    .line 71
    invoke-virtual {p1, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v4, "null cannot be cast to non-null type android.location.LocationManager"

    invoke-static {p1, v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p1, Landroid/location/LocationManager;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;->locationManager:Landroid/location/LocationManager;

    .line 72
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;->checkLocation()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/subjects/BehaviorSubject;->onNext(Ljava/lang/Object;)V

    .line 73
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;->registerReceiverGPS()V

    .line 76
    invoke-virtual {v1, v2}, Lio/reactivex/subjects/PublishSubject;->observeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Observable;

    move-result-object p1

    .line 77
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationInfoProviderImpl$meO8y6o2ek8s0ro6YSX74XNNyJg;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationInfoProviderImpl$meO8y6o2ek8s0ro6YSX74XNNyJg;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->concatMapSingle(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    .line 80
    invoke-virtual {p1}, Lio/reactivex/Observable;->repeat()Lio/reactivex/Observable;

    move-result-object p1

    .line 81
    invoke-virtual {p1}, Lio/reactivex/Observable;->retry()Lio/reactivex/Observable;

    move-result-object p1

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationInfoProviderImpl$pNatW0gW3oXog2SwCXL_dP8iS4c;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationInfoProviderImpl$pNatW0gW3oXog2SwCXL_dP8iS4c;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationInfoProviderImpl$PNZjRehOz5WXSzzLujr_OqrgvG0;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationInfoProviderImpl$PNZjRehOz5WXSzzLujr_OqrgvG0;

    .line 82
    invoke-virtual {p1, v0, v1}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object p1

    .line 75
    invoke-virtual {v3, p1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method

.method private static final _get_isProviderEnabled_$lambda-0(Ljava/lang/Boolean;)Ljava/lang/Boolean;
    .locals 2

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x1

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method private static final _init_$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;Lkotlin/Unit;)Lio/reactivex/SingleSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;->getLastKnownLocation()Lio/reactivex/Single;

    move-result-object p0

    check-cast p0, Lio/reactivex/SingleSource;

    return-object p0
.end method

.method private static final _init_$lambda-2(Lkotlin/Pair;)V
    .locals 0

    return-void
.end method

.method private static final _init_$lambda-3(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method public static final synthetic access$checkLocation(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;)Z
    .locals 0

    .line 46
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;->checkLocation()Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$getLocationSubject$p(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;)Lio/reactivex/subjects/BehaviorSubject;
    .locals 0

    .line 46
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;->locationSubject:Lio/reactivex/subjects/BehaviorSubject;

    return-object p0
.end method

.method private final checkLocation()Z
    .locals 2

    .line 92
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;->locationManager:Landroid/location/LocationManager;

    if-eqz v0, :cond_0

    const-string v1, "gps"

    .line 94
    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private static final getLastKnownLocation$lambda-10(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;Ljava/lang/Boolean;)Lio/reactivex/SingleSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 140
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 141
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;->locationUpdateProvider:Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;->location()Lio/reactivex/Single;

    move-result-object p1

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationInfoProviderImpl$CDWg3QvQ5FgaMCam0TmqssBcCiI;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationInfoProviderImpl$CDWg3QvQ5FgaMCam0TmqssBcCiI;

    invoke-virtual {p1, v0}, Lio/reactivex/Single;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object p1

    .line 142
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationInfoProviderImpl$SueuCpDM1KPH3T2nOhVFbi19TO8;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationInfoProviderImpl$SueuCpDM1KPH3T2nOhVFbi19TO8;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Single;->doOnSuccess(Lio/reactivex/functions/Consumer;)Lio/reactivex/Single;

    move-result-object p1

    .line 143
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationInfoProviderImpl$YpvQ3rKhh_7wFsUdElEjPjcUBLo;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationInfoProviderImpl$YpvQ3rKhh_7wFsUdElEjPjcUBLo;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Single;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object p0

    const-string p1, "{\n                        locationUpdateProvider.location().map {l -> Pair(true, l) }\n                                .doOnSuccess { debug(\"updating location storage\") }\n                                .flatMap {location ->\n                                    updateStorage(location.second).map { location }\n                                }\n                    }"

    .line 140
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    .line 147
    :cond_0
    new-instance p0, Lkotlin/Pair;

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lio/reactivex/Single;->just(Ljava/lang/Object;)Lio/reactivex/Single;

    move-result-object p0

    const-string p1, "just(Pair(false, null)\n                    )"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    check-cast p0, Lio/reactivex/SingleSource;

    return-object p0
.end method

.method private static final getLastKnownLocation$lambda-10$lambda-6(Landroid/location/Location;)Lkotlin/Pair;
    .locals 2

    const-string v0, "l"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 141
    new-instance v0, Lkotlin/Pair;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method private static final getLastKnownLocation$lambda-10$lambda-7(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;Lkotlin/Pair;)V
    .locals 2

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 142
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p1, "updating location storage"

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final getLastKnownLocation$lambda-10$lambda-9(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;Lkotlin/Pair;)Lio/reactivex/SingleSource;
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 144
    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "location.second"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/location/Location;

    invoke-direct {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;->updateStorage(Landroid/location/Location;)Lio/reactivex/Single;

    move-result-object p0

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationInfoProviderImpl$D2FERxj6DXCJ-_x8RK_ly3HI2mc;

    invoke-direct {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationInfoProviderImpl$D2FERxj6DXCJ-_x8RK_ly3HI2mc;-><init>(Lkotlin/Pair;)V

    invoke-virtual {p0, v0}, Lio/reactivex/Single;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object p0

    check-cast p0, Lio/reactivex/SingleSource;

    return-object p0
.end method

.method private static final getLastKnownLocation$lambda-10$lambda-9$lambda-8(Lkotlin/Pair;Ljava/lang/Boolean;)Lkotlin/Pair;
    .locals 1

    const-string v0, "$location"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final getLastStoredLocation$lambda-11(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;Lio/reactivex/SingleEmitter;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "this$0"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "it"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 155
    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;->contextWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/Context;

    if-eqz v2, :cond_0

    .line 158
    invoke-static {v2}, Landroidx/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v2

    .line 159
    iget-object v3, v0, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;->LOCATION_LAT:Ljava/lang/String;

    const/4 v4, 0x1

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    move-result v3

    .line 160
    iget-object v5, v0, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;->LOCATION_LONG:Ljava/lang/String;

    invoke-interface {v2, v5, v4}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    move-result v5

    .line 161
    iget-object v6, v0, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;->LOCATION_ALT:Ljava/lang/String;

    invoke-interface {v2, v6, v4}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    move-result v2

    .line 162
    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    const-string v6, "Reading altitude value: "

    invoke-static {v6, v4}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x2

    const/4 v7, 0x0

    invoke-static {v0, v4, v7, v6, v7}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 163
    new-instance v0, Lkotlin/Pair;

    const/4 v4, 0x1

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    new-instance v15, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;

    float-to-double v7, v5

    float-to-double v9, v3

    float-to-double v11, v2

    const-wide/16 v13, 0x0

    const-wide/16 v2, 0x0

    const/16 v17, 0x18

    const/16 v18, 0x0

    move-object v6, v15

    move-object v5, v15

    move-wide v15, v2

    invoke-direct/range {v6 .. v18}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;-><init>(DDDDJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v0, v4, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v1, v0}, Lio/reactivex/SingleEmitter;->onSuccess(Ljava/lang/Object;)V

    goto :goto_0

    .line 165
    :cond_0
    new-instance v0, Lkotlin/Pair;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    new-instance v15, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;

    const-wide/16 v10, 0x0

    const-wide/16 v12, 0x0

    const/16 v14, 0x18

    const/16 v16, 0x0

    const-wide/high16 v8, 0x36a0000000000000L    # 1.401298464324817E-45

    move-object v3, v15

    move-wide v4, v8

    move-wide v6, v8

    move-object v1, v15

    move-object/from16 v15, v16

    invoke-direct/range {v3 .. v15}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;-><init>(DDDDJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v0, v2, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Lio/reactivex/SingleEmitter;->onSuccess(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public static synthetic lambda$-9H50o617-38auTjjq51VnLO98M(Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;->showDialog$lambda-5(Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic lambda$-JFUZfuZGhWQO16eKfGb7mHrRBU(Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;->showDialogForLocation$lambda-15(Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic lambda$6cZBnyIS0QhdOWRcqmyo1JoAc8Q(Landroid/content/Context;Ljava/lang/String;Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;->showDialogForLocation$lambda-14(Landroid/content/Context;Ljava/lang/String;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic lambda$CDWg3QvQ5FgaMCam0TmqssBcCiI(Landroid/location/Location;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;->getLastKnownLocation$lambda-10$lambda-6(Landroid/location/Location;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$D2FERxj6DXCJ-_x8RK_ly3HI2mc(Lkotlin/Pair;Ljava/lang/Boolean;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;->getLastKnownLocation$lambda-10$lambda-9$lambda-8(Lkotlin/Pair;Ljava/lang/Boolean;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$NxyR6GT3sLnaLcA49H24YR2YJWA(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;Ljava/lang/Boolean;)Lio/reactivex/SingleSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;->getLastKnownLocation$lambda-10(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;Ljava/lang/Boolean;)Lio/reactivex/SingleSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$PNZjRehOz5WXSzzLujr_OqrgvG0(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;->_init_$lambda-3(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$SueuCpDM1KPH3T2nOhVFbi19TO8(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;Lkotlin/Pair;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;->getLastKnownLocation$lambda-10$lambda-7(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;Lkotlin/Pair;)V

    return-void
.end method

.method public static synthetic lambda$XohhAvf5sP8B81-HqZepMgUVEB8(Landroid/content/Context;Ljava/lang/String;Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;->showDialog$lambda-4(Landroid/content/Context;Ljava/lang/String;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic lambda$YpvQ3rKhh_7wFsUdElEjPjcUBLo(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;Lkotlin/Pair;)Lio/reactivex/SingleSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;->getLastKnownLocation$lambda-10$lambda-9(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;Lkotlin/Pair;)Lio/reactivex/SingleSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$bw3TpTzzqFQmjONuf9XpfNrje80(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;->updateLocationInternal$lambda-12(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;)V

    return-void
.end method

.method public static synthetic lambda$jCgqKthXwgablP3SloafkNy7-U4(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;Lio/reactivex/SingleEmitter;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;->getLastStoredLocation$lambda-11(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;Lio/reactivex/SingleEmitter;)V

    return-void
.end method

.method public static synthetic lambda$k7IfDIAd56T4Xk4A5pqkmbCyoDQ(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;Landroid/location/Location;Lio/reactivex/SingleEmitter;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;->updateStorage$lambda-13(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;Landroid/location/Location;Lio/reactivex/SingleEmitter;)V

    return-void
.end method

.method public static synthetic lambda$meO8y6o2ek8s0ro6YSX74XNNyJg(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;Lkotlin/Unit;)Lio/reactivex/SingleSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;->_init_$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;Lkotlin/Unit;)Lio/reactivex/SingleSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$ntJnrJlXEN89Yo6apPw3OY_Zo9Q(Ljava/lang/Boolean;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;->_get_isProviderEnabled_$lambda-0(Ljava/lang/Boolean;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$pNatW0gW3oXog2SwCXL_dP8iS4c(Lkotlin/Pair;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;->_init_$lambda-2(Lkotlin/Pair;)V

    return-void
.end method

.method private final registerReceiverGPS()V
    .locals 3

    .line 100
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;->locationReceiver:Landroid/content/BroadcastReceiver;

    if-nez v0, :cond_1

    .line 102
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "android.location.PROVIDERS_CHANGED"

    .line 103
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 104
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl$registerReceiverGPS$1;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl$registerReceiverGPS$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;)V

    check-cast v1, Landroid/content/BroadcastReceiver;

    iput-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;->locationReceiver:Landroid/content/BroadcastReceiver;

    .line 116
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;->contextWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;->locationReceiver:Landroid/content/BroadcastReceiver;

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    :cond_1
    :goto_0
    return-void
.end method

.method private static final showDialog$lambda-4(Landroid/content/Context;Ljava/lang/String;Landroid/content/DialogInterface;I)V
    .locals 0

    const-string p3, "$activityContext"

    invoke-static {p0, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "$action"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 128
    new-instance p3, Landroid/content/Intent;

    invoke-direct {p3, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 129
    invoke-interface {p2}, Landroid/content/DialogInterface;->dismiss()V

    return-void
.end method

.method private static final showDialog$lambda-5(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 132
    invoke-interface {p0}, Landroid/content/DialogInterface;->cancel()V

    return-void
.end method

.method private static final showDialogForLocation$lambda-14(Landroid/content/Context;Ljava/lang/String;Landroid/content/DialogInterface;I)V
    .locals 0

    const-string p3, "$activityContext"

    invoke-static {p0, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "$action"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 209
    new-instance p3, Landroid/content/Intent;

    invoke-direct {p3, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 210
    invoke-interface {p2}, Landroid/content/DialogInterface;->dismiss()V

    return-void
.end method

.method private static final showDialogForLocation$lambda-15(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 213
    invoke-interface {p0}, Landroid/content/DialogInterface;->cancel()V

    return-void
.end method

.method private static final updateLocationInternal$lambda-12(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 178
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "started location search"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 179
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;->internalLocationUpdateSubject:Lio/reactivex/subjects/PublishSubject;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p0, v0}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method private final updateStorage(Landroid/location/Location;)Lio/reactivex/Single;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/location/Location;",
            ")",
            "Lio/reactivex/Single<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 185
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationInfoProviderImpl$k7IfDIAd56T4Xk4A5pqkmbCyoDQ;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationInfoProviderImpl$k7IfDIAd56T4Xk4A5pqkmbCyoDQ;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;Landroid/location/Location;)V

    invoke-static {v0}, Lio/reactivex/Single;->create(Lio/reactivex/SingleOnSubscribe;)Lio/reactivex/Single;

    move-result-object p1

    const-string v0, "create {\n            val context = contextWeakReference.get()\n            if (context != null) {\n                debug(\"Storing altitude value: ${location.altitude}\")\n                val sharedPrefs = PreferenceManager.getDefaultSharedPreferences(context)\n                sharedPrefs.edit().putFloat(LOCATION_LAT, location.latitude.toFloat()).commit()\n                sharedPrefs.edit().putFloat(LOCATION_LONG, location.longitude.toFloat()).commit()\n                if (location.hasAltitude()) {\n                    sharedPrefs.edit().putFloat(LOCATION_ALT, location.altitude.toFloat()).commit()\n                }\n            }\n            it.onSuccess(true)\n        }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final updateStorage$lambda-13(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;Landroid/location/Location;Lio/reactivex/SingleEmitter;)V
    .locals 5

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$location"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 186
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;->contextWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 188
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-virtual {p1}, Landroid/location/Location;->getAltitude()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const-string v3, "Storing altitude value: "

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v1, v2, v4, v3, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 189
    invoke-static {v0}, Landroidx/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 190
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;->LOCATION_LAT:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v3

    double-to-float v3, v3

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 191
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;->LOCATION_LONG:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v3

    double-to-float v3, v3

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 192
    invoke-virtual {p1}, Landroid/location/Location;->hasAltitude()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 193
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;->LOCATION_ALT:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/location/Location;->getAltitude()D

    move-result-wide v1

    double-to-float p1, v1

    invoke-interface {v0, p0, p1}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :cond_0
    const/4 p0, 0x1

    .line 196
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-interface {p2, p0}, Lio/reactivex/SingleEmitter;->onSuccess(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 46
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method public getLastKnownLocation()Lio/reactivex/Single;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Single<",
            "Lkotlin/Pair<",
            "Ljava/lang/Boolean;",
            "Landroid/location/Location;",
            ">;>;"
        }
    .end annotation

    .line 137
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;->isProviderEnabled()Lio/reactivex/Observable;

    move-result-object v0

    .line 138
    invoke-virtual {v0}, Lio/reactivex/Observable;->firstOrError()Lio/reactivex/Single;

    move-result-object v0

    .line 139
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationInfoProviderImpl$NxyR6GT3sLnaLcA49H24YR2YJWA;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationInfoProviderImpl$NxyR6GT3sLnaLcA49H24YR2YJWA;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Single;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object v0

    const-string v1, "isProviderEnabled\n                .firstOrError()\n                .flatMap {\n                    if (it) {\n                        locationUpdateProvider.location().map {l -> Pair(true, l) }\n                                .doOnSuccess { debug(\"updating location storage\") }\n                                .flatMap {location ->\n                                    updateStorage(location.second).map { location }\n                                }\n                    } else\n                        Single.just(Pair(false, null)\n                    )\n                }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public getLastStoredLocation()Lio/reactivex/Single;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Single<",
            "Lkotlin/Pair<",
            "Ljava/lang/Boolean;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;",
            ">;>;"
        }
    .end annotation

    .line 153
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationInfoProviderImpl$jCgqKthXwgablP3SloafkNy7-U4;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationInfoProviderImpl$jCgqKthXwgablP3SloafkNy7-U4;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;)V

    invoke-static {v0}, Lio/reactivex/Single;->create(Lio/reactivex/SingleOnSubscribe;)Lio/reactivex/Single;

    move-result-object v0

    const-string v1, "create {\n\n            val context = contextWeakReference.get()\n            val defaultValue = Float.MIN_VALUE.toDouble()\n            if (context != null) {\n                val sharedPrefs = PreferenceManager.getDefaultSharedPreferences(context)\n                val lat = sharedPrefs.getFloat(LOCATION_LAT, Float.MIN_VALUE)\n                val long = sharedPrefs.getFloat(LOCATION_LONG, Float.MIN_VALUE)\n                val alt: Float = sharedPrefs.getFloat(LOCATION_ALT, Float.MIN_VALUE)\n                debug(\"Reading altitude value: $alt\")\n                it.onSuccess(Pair(true, GPSPosition(long.toDouble(), lat.toDouble(), alt.toDouble())))\n            } else\n                it.onSuccess(Pair(false, GPSPosition(defaultValue, defaultValue, defaultValue)))\n        }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public isLocationValid(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;)Z
    .locals 6

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_3

    .line 171
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;->getLatitude()D

    move-result-wide v2

    double-to-float v2, v2

    const/4 v3, 0x1

    cmpg-float v2, v2, v3

    if-nez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-nez v2, :cond_3

    .line 172
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;->getLongitude()D

    move-result-wide v4

    double-to-float v2, v4

    cmpg-float v2, v2, v3

    if-nez v2, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    if-nez v2, :cond_3

    .line 173
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;->getAltitude()D

    move-result-wide v4

    double-to-float p1, v4

    cmpg-float p1, p1, v3

    if-nez p1, :cond_2

    const/4 p1, 0x1

    goto :goto_2

    :cond_2
    const/4 p1, 0x0

    :goto_2
    if-nez p1, :cond_3

    goto :goto_3

    :cond_3
    const/4 v0, 0x0

    :goto_3
    return v0
.end method

.method public isProviderEnabled()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 65
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;->locationSubject:Lio/reactivex/subjects/BehaviorSubject;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationInfoProviderImpl$ntJnrJlXEN89Yo6apPw3OY_Zo9Q;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationInfoProviderImpl$ntJnrJlXEN89Yo6apPw3OY_Zo9Q;

    .line 66
    invoke-virtual {v0, v1}, Lio/reactivex/subjects/BehaviorSubject;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "locationSubject\n                .map {\n                    if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) it else true\n                }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public showDialog(Landroid/content/Context;)V
    .locals 5

    const-string v0, "activityContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 121
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f0f00bb

    .line 123
    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "activityContext.getString(R.string.enable_locations_alert_text)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 124
    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const v2, 0x7f0f00bc

    .line 125
    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const v2, 0x7f0f005f

    .line 126
    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    .line 127
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationInfoProviderImpl$XohhAvf5sP8B81-HqZepMgUVEB8;

    const-string v4, "android.settings.LOCATION_SOURCE_SETTINGS"

    invoke-direct {v3, p1, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationInfoProviderImpl$XohhAvf5sP8B81-HqZepMgUVEB8;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 126
    invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const v2, 0x7f0f0065

    .line 131
    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationInfoProviderImpl$-9H50o617-38auTjjq51VnLO98M;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationInfoProviderImpl$-9H50o617-38auTjjq51VnLO98M;

    invoke-virtual {v1, p1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 133
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/AlertDialog;->show()V

    return-void
.end method

.method public showDialogForLocation(Landroid/content/Context;)V
    .locals 5

    const-string v0, "activityContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 201
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const-string v1, "Please enable Location Services. This step is required to improve GPS data on your watch."

    .line 205
    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const-string v2, "Enable Location Services"

    .line 206
    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const-string v2, "OK"

    .line 207
    check-cast v2, Ljava/lang/CharSequence;

    .line 208
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationInfoProviderImpl$6cZBnyIS0QhdOWRcqmyo1JoAc8Q;

    const-string v4, "android.settings.LOCATION_SOURCE_SETTINGS"

    invoke-direct {v3, p1, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationInfoProviderImpl$6cZBnyIS0QhdOWRcqmyo1JoAc8Q;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 207
    invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    const-string v1, "Cancel"

    .line 212
    check-cast v1, Ljava/lang/CharSequence;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationInfoProviderImpl$-JFUZfuZGhWQO16eKfGb7mHrRBU;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationInfoProviderImpl$-JFUZfuZGhWQO16eKfGb7mHrRBU;

    invoke-virtual {p1, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 214
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/AlertDialog;->show()V

    return-void
.end method

.method public updateLocationInternal()Lio/reactivex/Completable;
    .locals 2

    .line 177
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationInfoProviderImpl$bw3TpTzzqFQmjONuf9XpfNrje80;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationInfoProviderImpl$bw3TpTzzqFQmjONuf9XpfNrje80;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;)V

    invoke-static {v0}, Lio/reactivex/Completable;->fromAction(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object v0

    const-string v1, "fromAction {\n            println(\"started location search\")\n            internalLocationUpdateSubject.onNext(Unit)\n        }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
