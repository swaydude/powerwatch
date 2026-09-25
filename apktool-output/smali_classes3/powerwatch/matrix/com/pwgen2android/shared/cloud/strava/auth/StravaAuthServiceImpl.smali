.class public final Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaAuthServiceImpl;
.super Ljava/lang/Object;
.source "StravaAuthServiceImpl.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaAuthService;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u001e\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000c2\u0006\u0010\t\u001a\u00020\nH\u0016J&\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaAuthServiceImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaAuthService;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "httpClient",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;)V",
        "authorize",
        "Lio/reactivex/Single;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;",
        "config",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaConfig;",
        "host",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;",
        "logout",
        "Lio/reactivex/Completable;",
        "stravaHost",
        "refresh",
        "refreshToken",
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
.field private final httpClient:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;)V
    .locals 2

    const-string v0, "httpClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaAuthServiceImpl;->httpClient:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;

    .line 28
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "just(emptyMap())"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaAuthServiceImpl$1;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaAuthServiceImpl$1;

    check-cast v1, Lkotlin/jvm/functions/Function0;

    invoke-interface {p1, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;->setHeadersProvider(Lio/reactivex/Observable;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method private static final authorize$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaAuthServiceImpl;Ljava/lang/Throwable;)V
    .locals 7

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string v2, "Strava Cloud Authorization Failed: HTTP response is: "

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v3, p1

    invoke-static/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->error$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method public static synthetic lambda$-GrVSU84DwTjQGF82RJvRyMfRAI(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaAuthServiceImpl;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaAuthServiceImpl;->authorize$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaAuthServiceImpl;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$7fy6I9Ff14d2PaC5iif_rbgIJYU(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaAuthServiceImpl;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaAuthServiceImpl;->logout$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaAuthServiceImpl;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$i_dZ9XW9iHORLmOEtKrRzYYBP78(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaAuthServiceImpl;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaAuthServiceImpl;->refresh$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaAuthServiceImpl;Ljava/lang/Throwable;)V

    return-void
.end method

.method private static final logout$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaAuthServiceImpl;Ljava/lang/Throwable;)V
    .locals 7

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string v2, "Strava Cloud Authorization Failed: HTTP response is: "

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v3, p1

    invoke-static/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->error$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final refresh$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaAuthServiceImpl;Ljava/lang/Throwable;)V
    .locals 7

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string v2, "Strava Cloud Refresh token Failed: HTTP response is: "

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v3, p1

    invoke-static/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->error$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public authorize(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;)Lio/reactivex/Single;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaConfig;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;",
            ")",
            "Lio/reactivex/Single<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;",
            ">;"
        }
    .end annotation

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "host"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    new-array v0, v0, [Lkotlin/Pair;

    .line 45
    new-instance v1, Lkotlin/Pair;

    const-string v2, "grant_type"

    const-string v3, "authorization_code"

    invoke-direct {v1, v2, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 46
    new-instance v1, Lkotlin/Pair;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;->getClientID()Ljava/lang/String;

    move-result-object v2

    const-string v3, "client_id"

    invoke-direct {v1, v3, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 47
    new-instance v1, Lkotlin/Pair;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;->getClientSecret()Ljava/lang/String;

    move-result-object v2

    const-string v3, "client_secret"

    invoke-direct {v1, v3, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v2, 0x2

    aput-object v1, v0, v2

    .line 48
    new-instance v1, Lkotlin/Pair;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;->getCode()Ljava/lang/String;

    move-result-object p2

    const-string v2, "code"

    invoke-direct {v1, v2, p2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 p2, 0x3

    aput-object v1, v0, p2

    .line 45
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v6

    .line 50
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaAuthServiceImpl;->httpClient:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaConfig;->getAuthEndpoint()Ljava/lang/String;

    move-result-object v3

    const-class v7, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x2

    const/4 v9, 0x0

    invoke-static/range {v2 .. v9}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient$DefaultImpls;->postSingle$default(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/util/Map;Ljava/lang/Class;ILjava/lang/Object;)Lio/reactivex/Single;

    move-result-object p1

    .line 51
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/-$$Lambda$StravaAuthServiceImpl$-GrVSU84DwTjQGF82RJvRyMfRAI;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/-$$Lambda$StravaAuthServiceImpl$-GrVSU84DwTjQGF82RJvRyMfRAI;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaAuthServiceImpl;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Single;->doOnError(Lio/reactivex/functions/Consumer;)Lio/reactivex/Single;

    move-result-object p1

    const-string p2, "httpClient.postSingle(config.authEndpoint, body = null, queries = queries, clazz = StravaPasswordCredentials::class.java)\n                .doOnError {\n                    error(\"Strava Cloud Authorization Failed: HTTP response is: \", it)\n                }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 25
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method public logout(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaConfig;)Lio/reactivex/Completable;
    .locals 9

    const-string v0, "stravaHost"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    new-array v0, v0, [Lkotlin/Pair;

    .line 59
    new-instance v1, Lkotlin/Pair;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;->getAccessToken()Ljava/lang/String;

    move-result-object v2

    const-string v3, "access_token"

    invoke-direct {v1, v3, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 60
    new-instance v1, Lkotlin/Pair;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;->getClientID()Ljava/lang/String;

    move-result-object v2

    const-string v3, "client_id"

    invoke-direct {v1, v3, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 61
    new-instance v1, Lkotlin/Pair;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;->getClientSecret()Ljava/lang/String;

    move-result-object v2

    const-string v3, "client_secret"

    invoke-direct {v1, v3, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v2, 0x2

    aput-object v1, v0, v2

    .line 62
    new-instance v1, Lkotlin/Pair;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;->getCode()Ljava/lang/String;

    move-result-object p1

    const-string v2, "code"

    invoke-direct {v1, v2, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x3

    aput-object v1, v0, p1

    .line 59
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v6

    .line 65
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaAuthServiceImpl;->httpClient:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaConfig;->getRevokeEndpoint()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static/range {v2 .. v8}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient$DefaultImpls;->postCompletable$default(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/util/Map;ILjava/lang/Object;)Lio/reactivex/Completable;

    move-result-object p1

    .line 66
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/-$$Lambda$StravaAuthServiceImpl$7fy6I9Ff14d2PaC5iif_rbgIJYU;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/-$$Lambda$StravaAuthServiceImpl$7fy6I9Ff14d2PaC5iif_rbgIJYU;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaAuthServiceImpl;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Completable;->doOnError(Lio/reactivex/functions/Consumer;)Lio/reactivex/Completable;

    move-result-object p1

    const-string p2, "httpClient.postCompletable(config.revokeEndpoint, body = null, queries = queries)\n                .doOnError {\n                    error(\"Strava Cloud Authorization Failed: HTTP response is: \", it)\n                }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public refresh(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;)Lio/reactivex/Single;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaConfig;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;",
            ")",
            "Lio/reactivex/Single<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;",
            ">;"
        }
    .end annotation

    const-string v0, "refreshToken"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "host"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    new-array v0, v0, [Lkotlin/Pair;

    .line 32
    new-instance v1, Lkotlin/Pair;

    const-string v2, "grant_type"

    const-string v3, "refresh_token"

    invoke-direct {v1, v2, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 33
    new-instance v1, Lkotlin/Pair;

    invoke-direct {v1, v3, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x1

    aput-object v1, v0, p1

    .line 34
    new-instance p1, Lkotlin/Pair;

    invoke-virtual {p3}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;->getClientID()Ljava/lang/String;

    move-result-object v1

    const-string v2, "client_id"

    invoke-direct {p1, v2, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v1, 0x2

    aput-object p1, v0, v1

    .line 35
    new-instance p1, Lkotlin/Pair;

    invoke-virtual {p3}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;->getClientSecret()Ljava/lang/String;

    move-result-object p3

    const-string v1, "client_secret"

    invoke-direct {p1, v1, p3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 p3, 0x3

    aput-object p1, v0, p3

    .line 32
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v5

    .line 37
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaAuthServiceImpl;->httpClient:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaConfig;->getAuthEndpoint()Ljava/lang/String;

    move-result-object v2

    const-class v6, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient$DefaultImpls;->postSingle$default(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/util/Map;Ljava/lang/Class;ILjava/lang/Object;)Lio/reactivex/Single;

    move-result-object p1

    .line 38
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/-$$Lambda$StravaAuthServiceImpl$i_dZ9XW9iHORLmOEtKrRzYYBP78;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/-$$Lambda$StravaAuthServiceImpl$i_dZ9XW9iHORLmOEtKrRzYYBP78;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaAuthServiceImpl;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Single;->doOnError(Lio/reactivex/functions/Consumer;)Lio/reactivex/Single;

    move-result-object p1

    const-string p2, "httpClient.postSingle(config.authEndpoint, body = null, queries = queries, clazz = StravaPasswordCredentials::class.java)\n                .doOnError {\n                    error(\"Strava Cloud Refresh token Failed: HTTP response is: \", it)\n                }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
