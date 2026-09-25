.class public final Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;
.super Ljava/lang/Object;
.source "StravaCloud.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloud;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0008\u0010\u000c\u001a\u00020\rH\u0016J\u000e\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J\u0016\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloud;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "config",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaConfig;",
        "authService",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaAuthService;",
        "stravaTokenStorage",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenStorage;",
        "apiService",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaApiService;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaAuthService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenStorage;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaApiService;)V",
        "hasToken",
        "",
        "loadStoredCredentials",
        "Lio/reactivex/Observable;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;",
        "login",
        "Lio/reactivex/Single;",
        "stravaHost",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;",
        "logout",
        "Lio/reactivex/Completable;",
        "uploadActivity",
        "data",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/UploadData;",
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
.field private final apiService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaApiService;

.field private final authService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaAuthService;

.field private final config:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaConfig;

.field private final stravaTokenStorage:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenStorage;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaAuthService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenStorage;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaApiService;)V
    .locals 1

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "authService"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stravaTokenStorage"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "apiService"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;->config:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaConfig;

    .line 24
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;->authService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaAuthService;

    .line 25
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;->stravaTokenStorage:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenStorage;

    .line 26
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;->apiService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaApiService;

    return-void
.end method

.method public static synthetic lambda$AbR5szaqXtOMIkljUSEqx9NJqZc(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;->login$lambda-7(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$CubKBQBJlCtgt_MTyouLLJ1T-0I(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;Lio/reactivex/ObservableEmitter;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;->login$lambda-4(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;Lio/reactivex/ObservableEmitter;)V

    return-void
.end method

.method public static synthetic lambda$ENplg1zIHHi-YteDPE5D2JMstnY(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;->logout$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$GAse6FS8gHTHbxKhfh7D1EYcdXI(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;->login$lambda-6$lambda-5(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$QxMbFmhtx9sBbY4t6oEUXH90HM8(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;Lkotlin/Pair;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;->login$lambda-6(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;Lkotlin/Pair;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$ZZ3cNrYCyLGpsFAJQHBzSCcrXOc(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;Lio/reactivex/ObservableEmitter;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;->loadStoredCredentials$lambda-3(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;Lio/reactivex/ObservableEmitter;)V

    return-void
.end method

.method public static synthetic lambda$dIsTQysJCT4LOtXVB1CV4K_qsK0(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;->login$lambda-10(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$dOhUJXAhE_eiycBG6bqWmxGK8GQ(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;Lkotlin/Pair;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;->login$lambda-8(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;Lkotlin/Pair;)V

    return-void
.end method

.method public static synthetic lambda$pL5MLaWNvK3pUdMKH1p5ZOC-M3w(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;->logout$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$tk2CpLtwWPdQUvmuiDKkjt87RU8(Lkotlin/Pair;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;->login$lambda-9(Lkotlin/Pair;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$xlKLm5DUm4yfDSuaHolejYlcgfE(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;->uploadActivity$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;Ljava/lang/Throwable;)V

    return-void
.end method

.method private static final loadStoredCredentials$lambda-3(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;Lio/reactivex/ObservableEmitter;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;->stravaTokenStorage:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenStorage;

    invoke-interface {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenStorage;->loadCredentials()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 53
    invoke-interface {p1, p0}, Lio/reactivex/ObservableEmitter;->onNext(Ljava/lang/Object;)V

    .line 55
    :cond_0
    invoke-interface {p1}, Lio/reactivex/ObservableEmitter;->onComplete()V

    return-void
.end method

.method private static final login$lambda-10(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;Ljava/lang/Throwable;)V
    .locals 7

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    const-string v0, "Error during Strava login: "

    invoke-static {v0, p0}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v3, p1

    invoke-static/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->error$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 85
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method private static final login$lambda-4(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;Lio/reactivex/ObservableEmitter;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;->stravaTokenStorage:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenStorage;

    invoke-interface {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenStorage;->loadCredentials()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;

    move-result-object p0

    if-nez p0, :cond_0

    .line 63
    invoke-interface {p1}, Lio/reactivex/ObservableEmitter;->onComplete()V

    goto :goto_0

    .line 65
    :cond_0
    new-instance v0, Lkotlin/Pair;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {p1, v0}, Lio/reactivex/ObservableEmitter;->onNext(Ljava/lang/Object;)V

    .line 66
    invoke-interface {p1}, Lio/reactivex/ObservableEmitter;->onComplete()V

    :goto_0
    return-void
.end method

.method private static final login$lambda-6(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;Lkotlin/Pair;)Lio/reactivex/ObservableSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$stravaHost"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "passCredentials"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    invoke-virtual {p2}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->hasExpired()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 70
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;->authService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaAuthService;

    invoke-virtual {p2}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->getRefreshToken()Ljava/lang/String;

    move-result-object p2

    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;->config:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaConfig;

    invoke-interface {v0, p2, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaAuthService;->refresh(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;)Lio/reactivex/Single;

    move-result-object p0

    .line 71
    invoke-virtual {p0}, Lio/reactivex/Single;->toObservable()Lio/reactivex/Observable;

    move-result-object p0

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/-$$Lambda$StravaCloudImpl$GAse6FS8gHTHbxKhfh7D1EYcdXI;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/-$$Lambda$StravaCloudImpl$GAse6FS8gHTHbxKhfh7D1EYcdXI;

    .line 72
    invoke-virtual {p0, p1}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0

    .line 74
    :cond_0
    invoke-static {p2}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final login$lambda-6$lambda-5(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;)Lkotlin/Pair;
    .locals 2

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    new-instance v0, Lkotlin/Pair;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method private static final login$lambda-7(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;)Lkotlin/Pair;
    .locals 2

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    new-instance v0, Lkotlin/Pair;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method private static final login$lambda-8(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;Lkotlin/Pair;)V
    .locals 13

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$stravaHost"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    invoke-virtual {p2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    .line 79
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;->stravaTokenStorage:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenStorage;

    invoke-virtual {p2}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p2

    const-string v0, "it.second"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, p2

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;->getCode()Ljava/lang/String;

    move-result-object v10

    const/16 v11, 0x3f

    const/4 v12, 0x0

    invoke-static/range {v1 .. v12}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;

    move-result-object p1

    invoke-interface {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenStorage;->storeCredentials(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;)V

    :cond_0
    return-void
.end method

.method private static final login$lambda-9(Lkotlin/Pair;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    invoke-virtual {p0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;

    return-object p0
.end method

.method private static final logout$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;)Lio/reactivex/CompletableSource;
    .locals 8

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$stravaHost"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;->authService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaAuthService;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->getCode()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->getAccessToken()Ljava/lang/String;

    move-result-object v5

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x3

    const/4 v7, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;->copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;

    move-result-object p1

    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;->config:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaConfig;

    invoke-interface {v0, p1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaAuthService;->logout(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaConfig;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    return-object p0
.end method

.method private static final logout$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;Ljava/lang/Throwable;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;->stravaTokenStorage:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenStorage;

    invoke-interface {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenStorage;->clearCredentials()V

    return-void
.end method

.method private static final uploadActivity$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;Ljava/lang/Throwable;)V
    .locals 7

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    const-string v0, "Error occurred during upload: "

    invoke-static {v0, p0}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v3, p1

    invoke-static/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->error$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 36
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method


# virtual methods
.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 23
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method public hasToken()Z
    .locals 1

    .line 29
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;->stravaTokenStorage:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenStorage;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenStorage;->loadCredentials()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->getAccessToken()Ljava/lang/String;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method public loadStoredCredentials()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;",
            ">;"
        }
    .end annotation

    .line 50
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/-$$Lambda$StravaCloudImpl$ZZ3cNrYCyLGpsFAJQHBzSCcrXOc;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/-$$Lambda$StravaCloudImpl$ZZ3cNrYCyLGpsFAJQHBzSCcrXOc;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;)V

    invoke-static {v0}, Lio/reactivex/Observable;->create(Lio/reactivex/ObservableOnSubscribe;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "create {\n            val credentials = stravaTokenStorage.loadCredentials()\n            if (credentials != null) {\n                it.onNext(credentials)\n            }\n            it.onComplete()\n        }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public login(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;)Lio/reactivex/Single;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;",
            ")",
            "Lio/reactivex/Single<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;",
            ">;"
        }
    .end annotation

    const-string v0, "stravaHost"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/-$$Lambda$StravaCloudImpl$CubKBQBJlCtgt_MTyouLLJ1T-0I;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/-$$Lambda$StravaCloudImpl$CubKBQBJlCtgt_MTyouLLJ1T-0I;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;)V

    invoke-static {v0}, Lio/reactivex/Observable;->create(Lio/reactivex/ObservableOnSubscribe;)Lio/reactivex/Observable;

    move-result-object v0

    .line 68
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/-$$Lambda$StravaCloudImpl$QxMbFmhtx9sBbY4t6oEUXH90HM8;

    invoke-direct {v1, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/-$$Lambda$StravaCloudImpl$QxMbFmhtx9sBbY4t6oEUXH90HM8;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v0

    .line 75
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;->authService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaAuthService;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;->config:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaConfig;

    invoke-interface {v1, v2, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaAuthService;->authorize(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;)Lio/reactivex/Single;

    move-result-object v1

    invoke-virtual {v1}, Lio/reactivex/Single;->toObservable()Lio/reactivex/Observable;

    move-result-object v1

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/-$$Lambda$StravaCloudImpl$AbR5szaqXtOMIkljUSEqx9NJqZc;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/-$$Lambda$StravaCloudImpl$AbR5szaqXtOMIkljUSEqx9NJqZc;

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v1

    check-cast v1, Lio/reactivex/ObservableSource;

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->switchIfEmpty(Lio/reactivex/ObservableSource;)Lio/reactivex/Observable;

    move-result-object v0

    .line 76
    invoke-virtual {v0}, Lio/reactivex/Observable;->firstOrError()Lio/reactivex/Single;

    move-result-object v0

    .line 77
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/-$$Lambda$StravaCloudImpl$dOhUJXAhE_eiycBG6bqWmxGK8GQ;

    invoke-direct {v1, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/-$$Lambda$StravaCloudImpl$dOhUJXAhE_eiycBG6bqWmxGK8GQ;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Single;->doOnSuccess(Lio/reactivex/functions/Consumer;)Lio/reactivex/Single;

    move-result-object p1

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/-$$Lambda$StravaCloudImpl$tk2CpLtwWPdQUvmuiDKkjt87RU8;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/-$$Lambda$StravaCloudImpl$tk2CpLtwWPdQUvmuiDKkjt87RU8;

    .line 82
    invoke-virtual {p1, v0}, Lio/reactivex/Single;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object p1

    .line 83
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/-$$Lambda$StravaCloudImpl$dIsTQysJCT4LOtXVB1CV4K_qsK0;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/-$$Lambda$StravaCloudImpl$dIsTQysJCT4LOtXVB1CV4K_qsK0;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Single;->doOnError(Lio/reactivex/functions/Consumer;)Lio/reactivex/Single;

    move-result-object p1

    const-string v0, "create<Pair<Boolean, StravaPasswordCredentials>> {\n            val credentials = stravaTokenStorage.loadCredentials()\n            if (credentials == null) {\n                it.onComplete()\n            } else {\n                it.onNext(Pair(true, credentials))\n                it.onComplete()\n            }\n        }.flatMap { passCredentials ->\n            if (passCredentials.second.hasExpired()) {\n                return@flatMap authService.refresh(passCredentials.second.refreshToken, config, stravaHost)\n                        .toObservable()\n                        .map { Pair(false, it) }\n            }\n            return@flatMap Observable.just(passCredentials)\n        }.switchIfEmpty(authService.authorize(config, stravaHost).toObservable().map { Pair(false, it) })\n                .firstOrError()\n                .doOnSuccess {\n                    if (!it.first) {\n                        stravaTokenStorage.storeCredentials(it.second.copy(code = stravaHost.code))\n                    }\n                }\n                .map { it.second }\n                .doOnError {\n                    error(\"Error during Strava login: ${it.javaClass.simpleName}\", it)\n                    it.printStackTrace()\n                }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public logout(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;)Lio/reactivex/Completable;
    .locals 2

    const-string v0, "stravaHost"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;->loadStoredCredentials()Lio/reactivex/Observable;

    move-result-object v0

    .line 42
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/-$$Lambda$StravaCloudImpl$ENplg1zIHHi-YteDPE5D2JMstnY;

    invoke-direct {v1, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/-$$Lambda$StravaCloudImpl$ENplg1zIHHi-YteDPE5D2JMstnY;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->flatMapCompletable(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object p1

    .line 44
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/-$$Lambda$StravaCloudImpl$pL5MLaWNvK3pUdMKH1p5ZOC-M3w;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/-$$Lambda$StravaCloudImpl$pL5MLaWNvK3pUdMKH1p5ZOC-M3w;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Completable;->doOnEvent(Lio/reactivex/functions/Consumer;)Lio/reactivex/Completable;

    move-result-object p1

    const-string v0, "loadStoredCredentials()\n                .flatMapCompletable {\n                    authService.logout(stravaHost.copy(code = it.code, accessToken = it.accessToken), config)\n                }.doOnEvent {\n                    stravaTokenStorage.clearCredentials()\n                }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public uploadActivity(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/UploadData;)Lio/reactivex/Completable;
    .locals 2

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;->apiService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaApiService;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;->config:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaConfig;

    invoke-interface {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaApiService;->uploadActivity(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/UploadData;)Lio/reactivex/Completable;

    move-result-object p1

    .line 34
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/-$$Lambda$StravaCloudImpl$xlKLm5DUm4yfDSuaHolejYlcgfE;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/-$$Lambda$StravaCloudImpl$xlKLm5DUm4yfDSuaHolejYlcgfE;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Completable;->doOnError(Lio/reactivex/functions/Consumer;)Lio/reactivex/Completable;

    move-result-object p1

    const-string v0, "apiService.uploadActivity(config, data)\n                .doOnError {\n                    error(\"Error occurred during upload: ${it.javaClass.simpleName}\", it)\n                    it.printStackTrace()\n                }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
