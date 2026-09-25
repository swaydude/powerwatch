.class public final Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;
.super Ljava/lang/Object;
.source "LocationUpdateProvider.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u001d\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020 \u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001f0\u001eH\u0002J\u000c\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u001eJ\u000c\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020 0\u001eR\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000fR\u0019\u0010\u0010\u001a\n \u0007*\u0004\u0018\u00010\u00110\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \u0007*\u0004\u0018\u00010\u00150\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "context",
        "Landroid/content/Context;",
        "(Landroid/content/Context;)V",
        "builder",
        "Lcom/google/android/gms/location/LocationSettingsRequest$Builder;",
        "kotlin.jvm.PlatformType",
        "getBuilder",
        "()Lcom/google/android/gms/location/LocationSettingsRequest$Builder;",
        "callback",
        "Lcom/google/android/gms/location/LocationCallback;",
        "getCallback",
        "()Lcom/google/android/gms/location/LocationCallback;",
        "setCallback",
        "(Lcom/google/android/gms/location/LocationCallback;)V",
        "client",
        "Lcom/google/android/gms/location/SettingsClient;",
        "getClient",
        "()Lcom/google/android/gms/location/SettingsClient;",
        "locationProvider",
        "Lcom/google/android/gms/location/FusedLocationProviderClient;",
        "locationRequest",
        "Lcom/google/android/gms/location/LocationRequest;",
        "getLocationRequest",
        "()Lcom/google/android/gms/location/LocationRequest;",
        "removeSubject",
        "Lio/reactivex/subjects/PublishSubject;",
        "Landroid/location/Location;",
        "lastLocation",
        "Lio/reactivex/Single;",
        "Lkotlin/Pair;",
        "",
        "location",
        "register",
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
.field private final builder:Lcom/google/android/gms/location/LocationSettingsRequest$Builder;

.field private callback:Lcom/google/android/gms/location/LocationCallback;

.field private final client:Lcom/google/android/gms/location/SettingsClient;

.field private final context:Landroid/content/Context;

.field private final locationProvider:Lcom/google/android/gms/location/FusedLocationProviderClient;

.field private final locationRequest:Lcom/google/android/gms/location/LocationRequest;

.field private final removeSubject:Lio/reactivex/subjects/PublishSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/PublishSubject<",
            "Landroid/location/Location;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;->context:Landroid/content/Context;

    .line 16
    invoke-static {p1}, Lcom/google/android/gms/location/LocationServices;->getFusedLocationProviderClient(Landroid/content/Context;)Lcom/google/android/gms/location/FusedLocationProviderClient;

    move-result-object v0

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;->locationProvider:Lcom/google/android/gms/location/FusedLocationProviderClient;

    .line 18
    invoke-static {}, Lcom/google/android/gms/location/LocationRequest;->create()Lcom/google/android/gms/location/LocationRequest;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const-wide/16 v1, 0x1388

    .line 19
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/location/LocationRequest;->setInterval(J)Lcom/google/android/gms/location/LocationRequest;

    const-wide/16 v1, 0x3e8

    .line 20
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/location/LocationRequest;->setFastestInterval(J)Lcom/google/android/gms/location/LocationRequest;

    const/16 v1, 0x64

    .line 21
    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/LocationRequest;->setPriority(I)Lcom/google/android/gms/location/LocationRequest;

    .line 22
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 18
    :goto_0
    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;->locationRequest:Lcom/google/android/gms/location/LocationRequest;

    .line 24
    new-instance v1, Lcom/google/android/gms/location/LocationSettingsRequest$Builder;

    invoke-direct {v1}, Lcom/google/android/gms/location/LocationSettingsRequest$Builder;-><init>()V

    .line 25
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v1, v0}, Lcom/google/android/gms/location/LocationSettingsRequest$Builder;->addLocationRequest(Lcom/google/android/gms/location/LocationRequest;)Lcom/google/android/gms/location/LocationSettingsRequest$Builder;

    move-result-object v0

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;->builder:Lcom/google/android/gms/location/LocationSettingsRequest$Builder;

    .line 27
    invoke-static {p1}, Lcom/google/android/gms/location/LocationServices;->getSettingsClient(Landroid/content/Context;)Lcom/google/android/gms/location/SettingsClient;

    move-result-object p1

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;->client:Lcom/google/android/gms/location/SettingsClient;

    .line 29
    invoke-static {}, Lio/reactivex/subjects/PublishSubject;->create()Lio/reactivex/subjects/PublishSubject;

    move-result-object p1

    const-string v0, "create<Location>()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;->removeSubject:Lio/reactivex/subjects/PublishSubject;

    .line 39
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider$1;

    invoke-direct {p1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;)V

    check-cast p1, Lcom/google/android/gms/location/LocationCallback;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;->callback:Lcom/google/android/gms/location/LocationCallback;

    return-void
.end method

.method public static final synthetic access$getLocationProvider$p(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;)Lcom/google/android/gms/location/FusedLocationProviderClient;
    .locals 0

    .line 15
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;->locationProvider:Lcom/google/android/gms/location/FusedLocationProviderClient;

    return-object p0
.end method

.method public static final synthetic access$getRemoveSubject$p(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;)Lio/reactivex/subjects/PublishSubject;
    .locals 0

    .line 15
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;->removeSubject:Lio/reactivex/subjects/PublishSubject;

    return-object p0
.end method

.method public static synthetic lambda$2OdsTgH61SUOJ9L5Hwk5Idp0YlI(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;Ljava/lang/Boolean;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;->location$lambda-9$lambda-7(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;Ljava/lang/Boolean;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$7lpFzmEIHsKnzk0U5IKMMuA3drE(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;Lkotlin/jvm/internal/Ref$ObjectRef;Lio/reactivex/SingleEmitter;Lcom/google/android/gms/location/LocationSettingsResponse;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;->register$lambda-3$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;Lkotlin/jvm/internal/Ref$ObjectRef;Lio/reactivex/SingleEmitter;Lcom/google/android/gms/location/LocationSettingsResponse;)V

    return-void
.end method

.method public static synthetic lambda$Aeubbrc3ZwDBOTB6OiVK-v_iLcE(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;Lio/reactivex/SingleEmitter;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;->lastLocation$lambda-6(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;Lio/reactivex/SingleEmitter;)V

    return-void
.end method

.method public static synthetic lambda$LOY1k4UQE-cqMtwMKw4j79K-KEg(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;Lio/reactivex/SingleEmitter;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;->register$lambda-3(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;Lio/reactivex/SingleEmitter;)V

    return-void
.end method

.method public static synthetic lambda$P2dpEA_8wBOODaSgpDWBwBMaQ6w(Lio/reactivex/SingleEmitter;Ljava/lang/Exception;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;->lastLocation$lambda-6$lambda-5(Lio/reactivex/SingleEmitter;Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic lambda$QBiQCQlAGR7w8TYJzIgl08rrfzI(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;Lkotlin/Pair;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;->location$lambda-9(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;Lkotlin/Pair;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$UQf8VFc-jVSI6TreA6ZvGY93TpY(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;Landroid/location/Location;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;->location$lambda-9$lambda-8(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;Landroid/location/Location;)V

    return-void
.end method

.method public static synthetic lambda$kISiR1E1XHmesQi_gqW_wRIw1rc(Ljava/lang/Exception;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;->register$lambda-3$lambda-2(Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic lambda$nKDaDZLqRJsnEnn_etfjhfMmXmg(Lio/reactivex/SingleEmitter;Landroid/location/Location;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;->lastLocation$lambda-6$lambda-4(Lio/reactivex/SingleEmitter;Landroid/location/Location;)V

    return-void
.end method

.method private final lastLocation()Lio/reactivex/Single;
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

    .line 98
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationUpdateProvider$Aeubbrc3ZwDBOTB6OiVK-v_iLcE;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationUpdateProvider$Aeubbrc3ZwDBOTB6OiVK-v_iLcE;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;)V

    invoke-static {v0}, Lio/reactivex/Single;->create(Lio/reactivex/SingleOnSubscribe;)Lio/reactivex/Single;

    move-result-object v0

    const-string v1, "create { emitter ->\n            locationProvider.lastLocation\n                    .addOnSuccessListener { location ->\n                        emitter.onSuccess(Pair(true, location))\n                    }\n                    .addOnFailureListener { error ->\n                        error.printStackTrace()\n                        emitter.onError(error)\n                    }\n        }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private static final lastLocation$lambda-6(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;Lio/reactivex/SingleEmitter;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "emitter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;->locationProvider:Lcom/google/android/gms/location/FusedLocationProviderClient;

    invoke-virtual {p0}, Lcom/google/android/gms/location/FusedLocationProviderClient;->getLastLocation()Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    .line 100
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationUpdateProvider$nKDaDZLqRJsnEnn_etfjhfMmXmg;

    invoke-direct {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationUpdateProvider$nKDaDZLqRJsnEnn_etfjhfMmXmg;-><init>(Lio/reactivex/SingleEmitter;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    .line 103
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationUpdateProvider$P2dpEA_8wBOODaSgpDWBwBMaQ6w;

    invoke-direct {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationUpdateProvider$P2dpEA_8wBOODaSgpDWBwBMaQ6w;-><init>(Lio/reactivex/SingleEmitter;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method private static final lastLocation$lambda-6$lambda-4(Lio/reactivex/SingleEmitter;Landroid/location/Location;)V
    .locals 2

    const-string v0, "$emitter"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    new-instance v0, Lkotlin/Pair;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {p0, v0}, Lio/reactivex/SingleEmitter;->onSuccess(Ljava/lang/Object;)V

    return-void
.end method

.method private static final lastLocation$lambda-6$lambda-5(Lio/reactivex/SingleEmitter;Ljava/lang/Exception;)V
    .locals 1

    const-string v0, "$emitter"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    .line 105
    check-cast p1, Ljava/lang/Throwable;

    invoke-interface {p0, p1}, Lio/reactivex/SingleEmitter;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method private static final location$lambda-9(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;Lkotlin/Pair;)Lio/reactivex/ObservableSource;
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 114
    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    .line 115
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;->register()Lio/reactivex/Single;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/Single;->toObservable()Lio/reactivex/Observable;

    move-result-object p1

    .line 116
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationUpdateProvider$2OdsTgH61SUOJ9L5Hwk5Idp0YlI;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationUpdateProvider$2OdsTgH61SUOJ9L5Hwk5Idp0YlI;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    const-wide/16 v0, 0x1

    .line 117
    invoke-virtual {p1, v0, v1}, Lio/reactivex/Observable;->take(J)Lio/reactivex/Observable;

    move-result-object p1

    .line 118
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationUpdateProvider$UQf8VFc-jVSI6TreA6ZvGY93TpY;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationUpdateProvider$UQf8VFc-jVSI6TreA6ZvGY93TpY;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p0

    goto :goto_0

    .line 122
    :cond_0
    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    :goto_0
    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final location$lambda-9$lambda-7(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;Ljava/lang/Boolean;)Lio/reactivex/ObservableSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 116
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;->removeSubject:Lio/reactivex/subjects/PublishSubject;

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final location$lambda-9$lambda-8(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;Landroid/location/Location;)V
    .locals 1

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v0, "Removing location"

    invoke-virtual {p1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 120
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;->locationProvider:Lcom/google/android/gms/location/FusedLocationProviderClient;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;->getCallback()Lcom/google/android/gms/location/LocationCallback;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/google/android/gms/location/FusedLocationProviderClient;->removeLocationUpdates(Lcom/google/android/gms/location/LocationCallback;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method private static final register$lambda-3(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;Lio/reactivex/SingleEmitter;)V
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "emitter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    new-instance v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 59
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider$register$1$1;

    invoke-direct {v1, p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider$register$1$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;Lkotlin/jvm/internal/Ref$ObjectRef;)V

    iput-object v1, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 72
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;->getClient()Lcom/google/android/gms/location/SettingsClient;

    move-result-object v1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;->getBuilder()Lcom/google/android/gms/location/LocationSettingsRequest$Builder;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/location/LocationSettingsRequest$Builder;->build()Lcom/google/android/gms/location/LocationSettingsRequest;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/location/SettingsClient;->checkLocationSettings(Lcom/google/android/gms/location/LocationSettingsRequest;)Lcom/google/android/gms/tasks/Task;

    move-result-object v1

    .line 73
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationUpdateProvider$7lpFzmEIHsKnzk0U5IKMMuA3drE;

    invoke-direct {v2, p0, v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationUpdateProvider$7lpFzmEIHsKnzk0U5IKMMuA3drE;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;Lkotlin/jvm/internal/Ref$ObjectRef;Lio/reactivex/SingleEmitter;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationUpdateProvider$kISiR1E1XHmesQi_gqW_wRIw1rc;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationUpdateProvider$kISiR1E1XHmesQi_gqW_wRIw1rc;

    .line 77
    invoke-virtual {p0, p1}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method private static final register$lambda-3$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;Lkotlin/jvm/internal/Ref$ObjectRef;Lio/reactivex/SingleEmitter;Lcom/google/android/gms/location/LocationSettingsResponse;)V
    .locals 1

    const-string p3, "this$0"

    invoke-static {p0, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "$c"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "$emitter"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    iget-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;->locationProvider:Lcom/google/android/gms/location/FusedLocationProviderClient;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;->getLocationRequest()Lcom/google/android/gms/location/LocationRequest;

    move-result-object p0

    iget-object p1, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p1, Lcom/google/android/gms/location/LocationCallback;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {p3, p0, p1, v0}, Lcom/google/android/gms/location/FusedLocationProviderClient;->requestLocationUpdates(Lcom/google/android/gms/location/LocationRequest;Lcom/google/android/gms/location/LocationCallback;Landroid/os/Looper;)Lcom/google/android/gms/tasks/Task;

    const/4 p0, 0x1

    .line 75
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-interface {p2, p0}, Lio/reactivex/SingleEmitter;->onSuccess(Ljava/lang/Object;)V

    return-void
.end method

.method private static final register$lambda-3$lambda-2(Ljava/lang/Exception;)V
    .locals 1

    const-string v0, "exception"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    .line 80
    instance-of p0, p0, Lcom/google/android/gms/common/api/ResolvableApiException;

    return-void
.end method


# virtual methods
.method public final getBuilder()Lcom/google/android/gms/location/LocationSettingsRequest$Builder;
    .locals 1

    .line 24
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;->builder:Lcom/google/android/gms/location/LocationSettingsRequest$Builder;

    return-object v0
.end method

.method public final getCallback()Lcom/google/android/gms/location/LocationCallback;
    .locals 1

    .line 31
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;->callback:Lcom/google/android/gms/location/LocationCallback;

    return-object v0
.end method

.method public final getClient()Lcom/google/android/gms/location/SettingsClient;
    .locals 1

    .line 27
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;->client:Lcom/google/android/gms/location/SettingsClient;

    return-object v0
.end method

.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 15
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method public final getLocationRequest()Lcom/google/android/gms/location/LocationRequest;
    .locals 1

    .line 18
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;->locationRequest:Lcom/google/android/gms/location/LocationRequest;

    return-object v0
.end method

.method public final location()Lio/reactivex/Single;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Single<",
            "Landroid/location/Location;",
            ">;"
        }
    .end annotation

    .line 111
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;->lastLocation()Lio/reactivex/Single;

    move-result-object v0

    .line 112
    invoke-virtual {v0}, Lio/reactivex/Single;->toObservable()Lio/reactivex/Observable;

    move-result-object v0

    .line 113
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationUpdateProvider$QBiQCQlAGR7w8TYJzIgl08rrfzI;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationUpdateProvider$QBiQCQlAGR7w8TYJzIgl08rrfzI;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v0

    .line 124
    invoke-virtual {v0}, Lio/reactivex/Observable;->firstOrError()Lio/reactivex/Single;

    move-result-object v0

    const-string v1, "lastLocation()\n                .toObservable()\n                .flatMap {\n                    if (it.second == null) {\n                        register().toObservable()\n                                .flatMap { removeSubject }\n                                .take(1)\n                                .doOnNext { location ->\n                                    println(\"Removing location\")\n                                    locationProvider.removeLocationUpdates(callback)\n                                }\n                    } else Observable.just<Location>(it.second)\n                }\n                .firstOrError()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final register()Lio/reactivex/Single;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Single<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 55
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationUpdateProvider$LOY1k4UQE-cqMtwMKw4j79K-KEg;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationUpdateProvider$LOY1k4UQE-cqMtwMKw4j79K-KEg;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;)V

    invoke-static {v0}, Lio/reactivex/Single;->create(Lio/reactivex/SingleOnSubscribe;)Lio/reactivex/Single;

    move-result-object v0

    const-string v1, "create<Boolean> { emitter ->\n\n            var c : LocationCallback? = null\n\n            c = object : LocationCallback() {\n                override fun onLocationResult(locationResult: LocationResult?) {\n                    locationResult ?: return\n                    if (locationResult.locations.size > 0) {\n                        val location = locationResult.locations[0]\n                        if (location != null && location.latitude != null) {\n                            debug(\"altitude value: ${location.hasAltitude()} - ${location.altitude}\")\n                            removeSubject.onNext(location)\n                            locationProvider.removeLocationUpdates(c)\n                        }\n                    }\n                }\n            }\n            client.checkLocationSettings(builder.build())\n                    .addOnSuccessListener {\n                        locationProvider.requestLocationUpdates(locationRequest, c, Looper.getMainLooper())\n                        emitter.onSuccess(true)\n                    }\n                    .addOnFailureListener { exception ->\n                        exception.printStackTrace()\n\n                        if (exception is ResolvableApiException) {\n                            try {\n                                // Show the dialog by calling startResolutionForResult(),\n                                // and check the result in onActivityResult().\n                                //TODO Request location on fragment here\n//                                exception.startResolutionForResult(contextWeakReference.get()!!,\n//                                        13)\n                            } catch (sendEx: IntentSender.SendIntentException) {\n                                // Ignore the error.\n                            }\n                        }\n\n                    }\n\n        }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final setCallback(Lcom/google/android/gms/location/LocationCallback;)V
    .locals 0

    .line 31
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;->callback:Lcom/google/android/gms/location/LocationCallback;

    return-void
.end method
