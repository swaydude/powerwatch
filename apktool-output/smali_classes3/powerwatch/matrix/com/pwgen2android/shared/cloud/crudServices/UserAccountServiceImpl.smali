.class public final Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountServiceImpl;
.super Ljava/lang/Object;
.source "UserAccountService.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountService;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateService;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountService;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;",
        ">;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;",
        ">;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateService<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0008\u0012\u0004\u0012\u00020\u00030\u00042\u0008\u0012\u0004\u0012\u00020\u00030\u0005BE\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0004\u00a2\u0006\u0002\u0010\rJ/\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u001c\u0008\u0002\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012j\u0004\u0018\u0001`\u0014H\u0096\u0001J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0013H\u0016J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0013H\u0016J%\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u001b2\u0014\u0008\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012H\u0096\u0001J\u0010\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0013H\u0016J\u0010\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0011\u0010 \u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0003H\u0096\u0001J.\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\"0\u001b2\u0006\u0010!\u001a\u00020#2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012j\u0002`\u0014H\u0016R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountServiceImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountService;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateService;",
        "userAccountConfig",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountConfig;",
        "httpClient",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;",
        "updateService",
        "getService",
        "addService",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;)V",
        "add",
        "Lio/reactivex/Completable;",
        "item",
        "headers",
        "",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/Headers;",
        "addFirebaseToken",
        "Lio/reactivex/CompletableSource;",
        "token",
        "forgotPassword",
        "email",
        "get",
        "Lio/reactivex/Single;",
        "queries",
        "resendVerifyEmail",
        "resetPassword",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/ResetPassword;",
        "update",
        "verifyUser",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/VerifyUser;",
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
.field private final synthetic $$delegate_0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;",
            ">;"
        }
    .end annotation
.end field

.field private final synthetic $$delegate_1:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;",
            ">;"
        }
    .end annotation
.end field

.field private final synthetic $$delegate_2:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateService;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateService<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;",
            ">;"
        }
    .end annotation
.end field

.field private final httpClient:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;

.field private final userAccountConfig:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountConfig;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountConfig;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateService<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;",
            ">;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;",
            ">;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;",
            ">;)V"
        }
    .end annotation

    const-string v0, "userAccountConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "httpClient"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updateService"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getService"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "addService"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountServiceImpl;->userAccountConfig:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountConfig;

    .line 42
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountServiceImpl;->httpClient:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;

    .line 47
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountServiceImpl;->$$delegate_0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService;

    .line 48
    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountServiceImpl;->$$delegate_1:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;

    .line 49
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountServiceImpl;->$$delegate_2:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateService;

    return-void
.end method

.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_0

    .line 43
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateServiceImpl;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountConfig;->getCrudServiceConfig()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;

    move-result-object p7

    invoke-virtual {p7}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;->getUpdateEndpoint()Ljava/lang/String;

    move-result-object p7

    invoke-direct {p3, p2, p7}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateServiceImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Ljava/lang/String;)V

    check-cast p3, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateService;

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, p6, 0x8

    if-eqz p3, :cond_1

    .line 44
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetServiceImpl;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountConfig;->getCrudServiceConfig()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;

    move-result-object p4

    invoke-virtual {p4}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;->getGetEndpoint()Ljava/lang/String;

    move-result-object p4

    new-instance p7, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountServiceImpl$1;

    invoke-direct {p7}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountServiceImpl$1;-><init>()V

    invoke-virtual {p7}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountServiceImpl$1;->getType()Ljava/lang/reflect/Type;

    move-result-object p7

    const-string v0, "object : TypeToken<User>() {}.type"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p3, p2, p4, p7}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetServiceImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Ljava/lang/String;Ljava/lang/reflect/Type;)V

    move-object p4, p3

    check-cast p4, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService;

    :cond_1
    move-object v4, p4

    and-int/lit8 p3, p6, 0x10

    if-eqz p3, :cond_2

    .line 45
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddServiceImpl;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountConfig;->getCrudServiceConfig()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;

    move-result-object p4

    invoke-virtual {p4}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;->getAddEndpoint()Ljava/lang/String;

    move-result-object p4

    invoke-direct {p3, p2, p4}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddServiceImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Ljava/lang/String;)V

    move-object p5, p3

    check-cast p5, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;

    :cond_2
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    .line 41
    invoke-direct/range {v0 .. v5}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountServiceImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic add(Ljava/lang/Object;Ljava/util/Map;)Lio/reactivex/Completable;
    .locals 0

    .line 41
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountServiceImpl;->add(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;Ljava/util/Map;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public add(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;Ljava/util/Map;)Lio/reactivex/Completable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lio/reactivex/Completable;"
        }
    .end annotation

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountServiceImpl;->$$delegate_1:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;

    invoke-interface {v0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;->add(Ljava/lang/Object;Ljava/util/Map;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public addFirebaseToken(Ljava/lang/String;)Lio/reactivex/CompletableSource;
    .locals 9

    const-string v0, "token"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    new-instance v1, Lkotlin/Pair;

    invoke-direct {v1, v0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v6

    .line 52
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountServiceImpl;->httpClient:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;

    .line 53
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountServiceImpl;->userAccountConfig:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountConfig;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountConfig;->getFirebaseTokenUrl()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x0

    .line 52
    invoke-static/range {v2 .. v8}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient$DefaultImpls;->postCompletable$default(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/util/Map;ILjava/lang/Object;)Lio/reactivex/Completable;

    move-result-object p1

    check-cast p1, Lio/reactivex/CompletableSource;

    return-object p1
.end method

.method public forgotPassword(Ljava/lang/String;)Lio/reactivex/Completable;
    .locals 8

    const-string v0, "email"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    new-instance v1, Lkotlin/Pair;

    invoke-direct {v1, v0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v5

    .line 72
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountServiceImpl;->httpClient:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;

    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountServiceImpl;->userAccountConfig:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountConfig;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountConfig;->getForgotPasswordUrl()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v6, 0x2

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient$DefaultImpls;->getCompletable$default(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public get(Ljava/util/Map;)Lio/reactivex/Single;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lio/reactivex/Single<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;",
            ">;"
        }
    .end annotation

    const-string v0, "queries"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountServiceImpl;->$$delegate_0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService;->get(Ljava/util/Map;)Lio/reactivex/Single;

    move-result-object p1

    return-object p1
.end method

.method public resendVerifyEmail(Ljava/lang/String;)Lio/reactivex/Completable;
    .locals 8

    const-string v0, "email"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    new-instance v1, Lkotlin/Pair;

    invoke-direct {v1, v0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v5

    .line 61
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountServiceImpl;->httpClient:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;

    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountServiceImpl;->userAccountConfig:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountConfig;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountConfig;->getResendVerifyEmailUrl()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v6, 0x2

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient$DefaultImpls;->getCompletable$default(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public resetPassword(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/ResetPassword;)Lio/reactivex/Completable;
    .locals 8

    const-string v0, "resetPassword"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountServiceImpl;->httpClient:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountServiceImpl;->userAccountConfig:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountConfig;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountConfig;->getResetPasswordUrl()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xa

    const/4 v7, 0x0

    move-object v4, p1

    invoke-static/range {v1 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient$DefaultImpls;->postCompletable$default(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/util/Map;ILjava/lang/Object;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic update(Ljava/lang/Object;)Lio/reactivex/Completable;
    .locals 0

    .line 41
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountServiceImpl;->update(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public update(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Lio/reactivex/Completable;
    .locals 1

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountServiceImpl;->$$delegate_2:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateService;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateService;->update(Ljava/lang/Object;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public verifyUser(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/VerifyUser;Ljava/util/Map;)Lio/reactivex/Single;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/VerifyUser;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lio/reactivex/Single<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;",
            ">;"
        }
    .end annotation

    const-string v0, "verifyUser"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "headers"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountServiceImpl;->httpClient:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountServiceImpl;->userAccountConfig:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountConfig;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountConfig;->getVerifyAccountUrl()Ljava/lang/String;

    move-result-object v2

    const-class v6, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;

    const/4 v5, 0x0

    const/16 v7, 0x8

    const/4 v8, 0x0

    move-object v3, p2

    move-object v4, p1

    invoke-static/range {v1 .. v8}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient$DefaultImpls;->postSingle$default(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/util/Map;Ljava/lang/Class;ILjava/lang/Object;)Lio/reactivex/Single;

    move-result-object p1

    return-object p1
.end method
