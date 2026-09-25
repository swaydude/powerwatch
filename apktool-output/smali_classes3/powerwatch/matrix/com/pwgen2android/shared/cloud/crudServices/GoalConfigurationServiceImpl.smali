.class public final Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GoalConfigurationServiceImpl;
.super Ljava/lang/Object;
.source "GoalConfigurationService.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GoalConfigurationService;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeleteService;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GoalConfigurationService;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;",
        ">;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeleteService<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;",
        ">;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0008\u0004\u0018\u00002\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0008\u0012\u0004\u0012\u00020\u00030\u00042\u0008\u0012\u0004\u0012\u00020\u00030\u0005BE\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0004\u0012\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0005\u00a2\u0006\u0002\u0010\rJ/\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u001c\u0008\u0002\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012j\u0004\u0018\u0001`\u0014H\u0096\u0001J+\u0010\u0015\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u00170\u00162\u0014\u0008\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012H\u0096\u0001J\'\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u0014\u0008\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012H\u0096\u0001\u00a8\u0006\u001b"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GoalConfigurationServiceImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GoalConfigurationService;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeleteService;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService;",
        "httpClient",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;",
        "goalConfigurationConfig",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/goalConfiguration/GoalConfigurationConfig;",
        "deleteService",
        "addService",
        "getAllService",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/goalConfiguration/GoalConfigurationConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeleteService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService;)V",
        "add",
        "Lio/reactivex/Completable;",
        "item",
        "headers",
        "",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/Headers;",
        "all",
        "Lio/reactivex/Single;",
        "",
        "queryParams",
        "delete",
        "params",
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
.field private final synthetic $$delegate_0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;",
            ">;"
        }
    .end annotation
.end field

.field private final synthetic $$delegate_1:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeleteService;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeleteService<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;",
            ">;"
        }
    .end annotation
.end field

.field private final synthetic $$delegate_2:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/goalConfiguration/GoalConfigurationConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeleteService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/goalConfiguration/GoalConfigurationConfig;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeleteService<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;",
            ">;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;",
            ">;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;",
            ">;)V"
        }
    .end annotation

    const-string v0, "httpClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "goalConfigurationConfig"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "deleteService"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "addService"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "getAllService"

    invoke-static {p5, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GoalConfigurationServiceImpl;->$$delegate_0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;

    .line 20
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GoalConfigurationServiceImpl;->$$delegate_1:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeleteService;

    .line 21
    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GoalConfigurationServiceImpl;->$$delegate_2:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService;

    return-void
.end method

.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/goalConfiguration/GoalConfigurationConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeleteService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_0

    .line 16
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeleteServiceImpl;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/goalConfiguration/GoalConfigurationConfig;->getCrudServiceConfig()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;

    move-result-object p7

    invoke-virtual {p7}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;->getDeleteEndpoint()Ljava/lang/String;

    move-result-object p7

    invoke-direct {p3, p1, p7}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeleteServiceImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Ljava/lang/String;)V

    check-cast p3, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeleteService;

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, p6, 0x8

    if-eqz p3, :cond_1

    .line 17
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddServiceImpl;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/goalConfiguration/GoalConfigurationConfig;->getCrudServiceConfig()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;

    move-result-object p4

    invoke-virtual {p4}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;->getAddEndpoint()Ljava/lang/String;

    move-result-object p4

    invoke-direct {p3, p1, p4}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddServiceImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Ljava/lang/String;)V

    move-object p4, p3

    check-cast p4, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;

    :cond_1
    move-object v4, p4

    and-int/lit8 p3, p6, 0x10

    if-eqz p3, :cond_2

    .line 18
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllServiceImpl;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/goalConfiguration/GoalConfigurationConfig;->getCrudServiceConfig()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;

    move-result-object p4

    invoke-virtual {p4}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;->getGetAllEndpoint()Ljava/lang/String;

    move-result-object p4

    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GoalConfigurationServiceImpl$1;

    invoke-direct {p5}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GoalConfigurationServiceImpl$1;-><init>()V

    invoke-virtual {p5}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GoalConfigurationServiceImpl$1;->getType()Ljava/lang/reflect/Type;

    move-result-object p5

    const-string p6, "object : TypeToken<ArrayList<GoalConfiguration>>() {}.type"

    invoke-static {p5, p6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p3, p1, p4, p5}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllServiceImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Ljava/lang/String;Ljava/lang/reflect/Type;)V

    move-object p5, p3

    check-cast p5, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService;

    :cond_2
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    .line 13
    invoke-direct/range {v0 .. v5}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GoalConfigurationServiceImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/goalConfiguration/GoalConfigurationConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeleteService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic add(Ljava/lang/Object;Ljava/util/Map;)Lio/reactivex/Completable;
    .locals 0

    .line 13
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GoalConfigurationServiceImpl;->add(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;Ljava/util/Map;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public add(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;Ljava/util/Map;)Lio/reactivex/Completable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lio/reactivex/Completable;"
        }
    .end annotation

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GoalConfigurationServiceImpl;->$$delegate_0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;

    invoke-interface {v0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;->add(Ljava/lang/Object;Ljava/util/Map;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public all(Ljava/util/Map;)Lio/reactivex/Single;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lio/reactivex/Single<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;",
            ">;>;"
        }
    .end annotation

    const-string v0, "queryParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GoalConfigurationServiceImpl;->$$delegate_2:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService;->all(Ljava/util/Map;)Lio/reactivex/Single;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic delete(Ljava/lang/Object;Ljava/util/Map;)Lio/reactivex/Completable;
    .locals 0

    .line 13
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GoalConfigurationServiceImpl;->delete(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;Ljava/util/Map;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public delete(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;Ljava/util/Map;)Lio/reactivex/Completable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lio/reactivex/Completable;"
        }
    .end annotation

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GoalConfigurationServiceImpl;->$$delegate_1:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeleteService;

    invoke-interface {v0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeleteService;->delete(Ljava/lang/Object;Ljava/util/Map;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method
