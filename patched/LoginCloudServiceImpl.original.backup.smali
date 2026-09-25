.class final Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudServiceImpl;
.super Ljava/lang/Object;
.source "Cloud.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0002\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J\u0008\u0010\u0011\u001a\u00020\u0012H\u0016J\u001e\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0008\u0010\u0019\u001a\u00020\u001aH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudServiceImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;",
        "authService",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/AuthService;",
        "authConfig",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;",
        "tokenProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;",
        "hostInfoProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;",
        "userAccountCloudService",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;",
        "pushMessagingTokenProvider",
        "Lpowerwatch/matrix/com/pwgen2android/fcm/PushMessagingTokenProvider;",
        "userDao",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/AuthService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;Lpowerwatch/matrix/com/pwgen2android/fcm/PushMessagingTokenProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;)V",
        "isLoggedIn",
        "",
        "login",
        "Lio/reactivex/Single;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;",
        "email",
        "",
        "password",
        "logout",
        "Lio/reactivex/Completable;",
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
.field private final authConfig:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;

.field private final authService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/AuthService;

.field private final hostInfoProvider:Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;

.field private final pushMessagingTokenProvider:Lpowerwatch/matrix/com/pwgen2android/fcm/PushMessagingTokenProvider;

.field private final tokenProvider:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;

.field private final userAccountCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;

.field private final userDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/AuthService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;Lpowerwatch/matrix/com/pwgen2android/fcm/PushMessagingTokenProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;)V
    .locals 1

    const-string v0, "authService"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "authConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tokenProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hostInfoProvider"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userAccountCloudService"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pushMessagingTokenProvider"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userDao"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudServiceImpl;->authService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/AuthService;

    .line 55
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudServiceImpl;->authConfig:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;

    .line 56
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudServiceImpl;->tokenProvider:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;

    .line 57
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudServiceImpl;->hostInfoProvider:Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;

    .line 58
    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudServiceImpl;->userAccountCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;

    .line 59
    iput-object p6, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudServiceImpl;->pushMessagingTokenProvider:Lpowerwatch/matrix/com/pwgen2android/fcm/PushMessagingTokenProvider;

    .line 60
    iput-object p7, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudServiceImpl;->userDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;

    .line 81
    invoke-interface {p6}, Lpowerwatch/matrix/com/pwgen2android/fcm/PushMessagingTokenProvider;->getToken()Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/Observable;->firstOrError()Lio/reactivex/Single;

    move-result-object p1

    .line 82
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$LoginCloudServiceImpl$OTpuumO07VQKCUr75nI-d8ITxAg;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$LoginCloudServiceImpl$OTpuumO07VQKCUr75nI-d8ITxAg;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudServiceImpl;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Single;->flatMapCompletable(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object p1

    sget-object p2, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$LoginCloudServiceImpl$WOb1yhbIX0IndwgQ5cAT34_9lzE;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$LoginCloudServiceImpl$WOb1yhbIX0IndwgQ5cAT34_9lzE;

    sget-object p3, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$LoginCloudServiceImpl$2L5_pnWixbBMzzVu0lJr5qX3pe8;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$LoginCloudServiceImpl$2L5_pnWixbBMzzVu0lJr5qX3pe8;

    .line 83
    invoke-virtual {p1, p2, p3}, Lio/reactivex/Completable;->subscribe(Lio/reactivex/functions/Action;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    return-void
.end method

.method private static final _init_$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudServiceImpl;Ljava/lang/String;)Lio/reactivex/CompletableSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudServiceImpl;->userAccountCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;

    invoke-interface {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;->addPushNotificationsToken(Ljava/lang/String;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method private static final _init_$lambda-2()V
    .locals 0

    return-void
.end method

.method private static final _init_$lambda-3(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method public static synthetic lambda$1LanDXDO6a7fUvvd5NxwBwtYzSI(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudServiceImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudServiceImpl;->login$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudServiceImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$2L5_pnWixbBMzzVu0lJr5qX3pe8(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudServiceImpl;->_init_$lambda-3(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$OTpuumO07VQKCUr75nI-d8ITxAg(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudServiceImpl;Ljava/lang/String;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudServiceImpl;->_init_$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudServiceImpl;Ljava/lang/String;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$WOb1yhbIX0IndwgQ5cAT34_9lzE()V
    .locals 0

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudServiceImpl;->_init_$lambda-2()V

    return-void
.end method

.method private static final login$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudServiceImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;)Lio/reactivex/CompletableSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudServiceImpl;->tokenProvider:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;->add(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    return-object p0
.end method


# virtual methods
.method public isLoggedIn()Z
    .locals 1

    # PATCHED: always return true to bypass login check
    const/4 v0, 0x1
    return v0
.end method

.method public login(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/Single;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Single<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;",
            ">;"
        }
    .end annotation

    const-string v0, "email"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "password"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    # --- PATCHED: bypass API, return hardcoded User (test@test.com / test1234) ---
    const-string v1, "accessToken_patch"
    const-string v2, "Bearer"
    const-string v3, "refreshToken_patch"
    const-wide/16 v4, 0xe10
    const-string v6, "read write"
    const-wide/16 v7, 0x0
    const-string v8, "test@test.com"
    const-string v11, "test1234"
    new-instance v12, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;
    invoke-direct/range {v1 .. v12}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudServiceImpl;->tokenProvider:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;
    invoke-virtual {v0, v12}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;->add(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;)Lio/reactivex/Completable;

    new-instance v0, Ljava/lang/String;
    const-string v1, "Test"
    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V
    const-string v1, "test@test.com"
    const-string v2, "test1234"
    const/4 v3, 0x19
    const/16 v4, 0xb4
    const/16 v5, 0x50
    const/16 v6, 0x40
    const v7, 0x42800000    # 80.0f as float bit pattern
    const-string v8, "Male"
    const/4 v9, 0x0
    new-instance v10, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;
    const-string v11, "en_US"
    const-string v12, "metric"
    const/4 v13, 0x0
    invoke-direct {v10, v11, v12, v13}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;-><init>(Ljava/lang/String;Ljava/lang/String;I)V
    const-wide/16 v11, 0x1
    const/4 v12, 0x1
    new-instance v13, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;
    invoke-direct/range {v13 .. v13}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;-><init>(JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFLjava/lang/String;ZLpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;)V

    invoke-static {v13}, Lio/reactivex/Single;->just(Ljava/lang/Object;)Lio/reactivex/Single;
    move-result-object v0
    return-object v0
.end method

.method public logout()Lio/reactivex/Completable;
    .locals 1

    .line 76
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudServiceImpl;->tokenProvider:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;->deleteToken()Lio/reactivex/Completable;

    move-result-object v0

    return-object v0
.end method
