.class public final Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenProviderImpl;
.super Ljava/lang/Object;
.source "StravaTokenProvider.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenProvider;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenProviderImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenProvider;",
        "stravaTokenStorage",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenStorage;",
        "authService",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaAuthService;",
        "config",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaConfig;",
        "appContext",
        "Landroid/content/Context;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenStorage;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaAuthService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaConfig;Landroid/content/Context;)V",
        "clientID",
        "",
        "clientSecret",
        "provideToken",
        "Lio/reactivex/Maybe;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;",
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
.field private final authService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaAuthService;

.field private final clientID:Ljava/lang/String;

.field private final clientSecret:Ljava/lang/String;

.field private final config:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaConfig;

.field private final stravaTokenStorage:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenStorage;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenStorage;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaAuthService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaConfig;Landroid/content/Context;)V
    .locals 1

    const-string v0, "stravaTokenStorage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "authService"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appContext"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenProviderImpl;->stravaTokenStorage:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenStorage;

    .line 19
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenProviderImpl;->authService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaAuthService;

    .line 20
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenProviderImpl;->config:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaConfig;

    const p1, 0x7f0f0074

    .line 23
    invoke-virtual {p4, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string p2, "appContext.getString(R.string.client_id)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenProviderImpl;->clientID:Ljava/lang/String;

    const p1, 0x7f0f0075

    .line 24
    invoke-virtual {p4, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string p2, "appContext.getString(R.string.client_secret)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenProviderImpl;->clientSecret:Ljava/lang/String;

    return-void
.end method

.method public static synthetic lambda$7IzyiL9aKCWPUU3xDLgtgegYOcM(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenProviderImpl;->provideToken$lambda-3$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$7ejn82qadrx-AZXTNhN4QOSlcG4(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenProviderImpl;Lio/reactivex/ObservableEmitter;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenProviderImpl;->provideToken$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenProviderImpl;Lio/reactivex/ObservableEmitter;)V

    return-void
.end method

.method public static synthetic lambda$DUSbh7wO_NCDC2jH6UpksgcN244(Lkotlin/Pair;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenProviderImpl;->provideToken$lambda-4(Lkotlin/Pair;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$HWA4jeNU06YH7GiC_Ye-CpGLn38(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenProviderImpl;Lkotlin/Pair;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenProviderImpl;->provideToken$lambda-3(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenProviderImpl;Lkotlin/Pair;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$xSsahBf2eAqa80JD8eHACLDd5zE(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenProviderImpl;Lkotlin/Pair;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenProviderImpl;->provideToken$lambda-3$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenProviderImpl;Lkotlin/Pair;)V

    return-void
.end method

.method private static final provideToken$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenProviderImpl;Lio/reactivex/ObservableEmitter;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenProviderImpl;->stravaTokenStorage:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenStorage;

    invoke-interface {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenStorage;->loadCredentials()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;

    move-result-object p0

    if-nez p0, :cond_0

    .line 31
    invoke-interface {p1}, Lio/reactivex/ObservableEmitter;->onComplete()V

    goto :goto_0

    .line 33
    :cond_0
    new-instance v0, Lkotlin/Pair;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {p1, v0}, Lio/reactivex/ObservableEmitter;->onNext(Ljava/lang/Object;)V

    .line 34
    invoke-interface {p1}, Lio/reactivex/ObservableEmitter;->onComplete()V

    :goto_0
    return-void
.end method

.method private static final provideToken$lambda-3(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenProviderImpl;Lkotlin/Pair;)Lio/reactivex/ObservableSource;
    .locals 10

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "passCredentials"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->hasExpired()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 38
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenProviderImpl;->authService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaAuthService;

    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->getRefreshToken()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenProviderImpl;->config:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaConfig;

    new-instance v9, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;

    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenProviderImpl;->clientID:Ljava/lang/String;

    iget-object v4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenProviderImpl;->clientSecret:Ljava/lang/String;

    const/4 v6, 0x0

    const/16 v7, 0x8

    const/4 v8, 0x0

    const-string v5, ""

    move-object v2, v9

    invoke-direct/range {v2 .. v8}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, p1, v1, v9}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaAuthService;->refresh(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;)Lio/reactivex/Single;

    move-result-object p1

    .line 39
    invoke-virtual {p1}, Lio/reactivex/Single;->toObservable()Lio/reactivex/Observable;

    move-result-object p1

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/-$$Lambda$StravaTokenProviderImpl$7IzyiL9aKCWPUU3xDLgtgegYOcM;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/-$$Lambda$StravaTokenProviderImpl$7IzyiL9aKCWPUU3xDLgtgegYOcM;

    .line 40
    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    .line 41
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/-$$Lambda$StravaTokenProviderImpl$xSsahBf2eAqa80JD8eHACLDd5zE;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/-$$Lambda$StravaTokenProviderImpl$xSsahBf2eAqa80JD8eHACLDd5zE;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenProviderImpl;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0

    .line 45
    :cond_0
    invoke-static {p1}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final provideToken$lambda-3$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;)Lkotlin/Pair;
    .locals 2

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    new-instance v0, Lkotlin/Pair;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method private static final provideToken$lambda-3$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenProviderImpl;Lkotlin/Pair;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenProviderImpl;->stravaTokenStorage:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenStorage;

    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;

    invoke-interface {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenStorage;->storeCredentials(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;)V

    return-void
.end method

.method private static final provideToken$lambda-4(Lkotlin/Pair;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    invoke-virtual {p0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;

    return-object p0
.end method


# virtual methods
.method public provideToken()Lio/reactivex/Maybe;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Maybe<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;",
            ">;"
        }
    .end annotation

    .line 28
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/-$$Lambda$StravaTokenProviderImpl$7ejn82qadrx-AZXTNhN4QOSlcG4;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/-$$Lambda$StravaTokenProviderImpl$7ejn82qadrx-AZXTNhN4QOSlcG4;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenProviderImpl;)V

    invoke-static {v0}, Lio/reactivex/Observable;->create(Lio/reactivex/ObservableOnSubscribe;)Lio/reactivex/Observable;

    move-result-object v0

    .line 36
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/-$$Lambda$StravaTokenProviderImpl$HWA4jeNU06YH7GiC_Ye-CpGLn38;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/-$$Lambda$StravaTokenProviderImpl$HWA4jeNU06YH7GiC_Ye-CpGLn38;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenProviderImpl;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/-$$Lambda$StravaTokenProviderImpl$DUSbh7wO_NCDC2jH6UpksgcN244;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/-$$Lambda$StravaTokenProviderImpl$DUSbh7wO_NCDC2jH6UpksgcN244;

    .line 46
    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v0

    .line 48
    invoke-virtual {v0}, Lio/reactivex/Observable;->firstElement()Lio/reactivex/Maybe;

    move-result-object v0

    const-string v1, "create<Pair<Boolean, StravaPasswordCredentials>> {\n            val credentials = stravaTokenStorage.loadCredentials()\n            if (credentials == null) {\n                it.onComplete()\n            } else {\n                it.onNext(Pair(true, credentials))\n                it.onComplete()\n            }\n        }.flatMap { passCredentials ->\n            if (passCredentials.second.hasExpired()) {\n                return@flatMap authService.refresh(passCredentials.second.refreshToken, config, StravaHost(clientID, clientSecret, \"\"))\n                        .toObservable()\n                        .map { Pair(false, it) }\n                        .doOnNext {\n                            stravaTokenStorage.storeCredentials(it.second)\n                        }\n            }\n            return@flatMap Observable.just(passCredentials)\n        }.map {\n            it.second\n        }.firstElement()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
