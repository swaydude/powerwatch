.class public final Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudServiceImpl;
.super Ljava/lang/Object;
.source "UserAccountCloudService.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u000cH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000cH\u0016J\u000e\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000cH\u0016J\u0018\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000c2\u0006\u0010\u0018\u001a\u00020\u000cH\u0016J\u0010\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudServiceImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;",
        "userAccountService",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountService;",
        "cloudConfig",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudConfig;",
        "userDao",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudConfig;Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;)V",
        "addPushNotificationsToken",
        "Lio/reactivex/CompletableSource;",
        "token",
        "",
        "addUser",
        "Lio/reactivex/Completable;",
        "user",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;",
        "forgotUserPassword",
        "email",
        "getUser",
        "Lio/reactivex/Single;",
        "resendVerifyEmail",
        "resetUserPassword",
        "oldPassword",
        "newPassword",
        "updateUser",
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
.field private final cloudConfig:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudConfig;

.field private final userAccountService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountService;

.field private final userDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudConfig;Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;)V
    .locals 1

    const-string v0, "userAccountService"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cloudConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userDao"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudServiceImpl;->userAccountService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountService;

    .line 56
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudServiceImpl;->cloudConfig:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudConfig;

    .line 57
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudServiceImpl;->userDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;

    return-void
.end method

.method private static final getUser$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudServiceImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Lio/reactivex/SingleSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudServiceImpl;->userDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;->addUserCompletable(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Lio/reactivex/Completable;

    move-result-object p0

    .line 78
    invoke-virtual {p0, p1}, Lio/reactivex/Completable;->toSingleDefault(Ljava/lang/Object;)Lio/reactivex/Single;

    move-result-object p0

    check-cast p0, Lio/reactivex/SingleSource;

    return-object p0
.end method

.method public static synthetic lambda$26RGRE1SYyALMRtOMLg5BxugInw(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudServiceImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Lio/reactivex/SingleSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudServiceImpl;->getUser$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudServiceImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Lio/reactivex/SingleSource;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public addPushNotificationsToken(Ljava/lang/String;)Lio/reactivex/CompletableSource;
    .locals 1

    const-string v0, "token"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudServiceImpl;->userAccountService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountService;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountService;->addFirebaseToken(Ljava/lang/String;)Lio/reactivex/CompletableSource;

    move-result-object p1

    return-object p1
.end method

.method public addUser(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Lio/reactivex/Completable;
    .locals 3

    const-string v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    new-instance v0, Lkotlin/Pair;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudServiceImpl;->cloudConfig:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudConfig;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudConfig;->getAuthConfig()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;

    move-result-object v1

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;->getEncodedBasicToken()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Basic "

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Authorization"

    invoke-direct {v0, v2, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    .line 93
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudServiceImpl;->userAccountService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountService;

    invoke-interface {v1, p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountService;->add(Ljava/lang/Object;Ljava/util/Map;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public forgotUserPassword(Ljava/lang/String;)Lio/reactivex/Completable;
    .locals 1

    const-string v0, "email"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudServiceImpl;->userAccountService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountService;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountService;->forgotPassword(Ljava/lang/String;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public getUser()Lio/reactivex/Single;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Single<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;",
            ">;"
        }
    .end annotation

    .line 75
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudServiceImpl;->userAccountService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountService;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService$DefaultImpls;->get$default(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService;Ljava/util/Map;ILjava/lang/Object;)Lio/reactivex/Single;

    move-result-object v0

    .line 76
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/-$$Lambda$UserAccountCloudServiceImpl$26RGRE1SYyALMRtOMLg5BxugInw;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/-$$Lambda$UserAccountCloudServiceImpl$26RGRE1SYyALMRtOMLg5BxugInw;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudServiceImpl;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Single;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object v0

    const-string v1, "userAccountService.get()\n                .flatMap {\n                    userDao.addUserCompletable(it)\n                            .toSingleDefault(it)\n                }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public resendVerifyEmail(Ljava/lang/String;)Lio/reactivex/Completable;
    .locals 1

    const-string v0, "email"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudServiceImpl;->userAccountService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountService;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountService;->resendVerifyEmail(Ljava/lang/String;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public resetUserPassword(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/Completable;
    .locals 2

    const-string v0, "oldPassword"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newPassword"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudServiceImpl;->userAccountService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountService;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/ResetPassword;

    invoke-direct {v1, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/ResetPassword;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountService;->resetPassword(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/ResetPassword;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public updateUser(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Lio/reactivex/Completable;
    .locals 1

    const-string v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudServiceImpl;->userAccountService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountService;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountService;->update(Ljava/lang/Object;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method
