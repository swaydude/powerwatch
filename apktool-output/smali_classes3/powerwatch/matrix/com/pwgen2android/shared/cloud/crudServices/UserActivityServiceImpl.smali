.class public final Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserActivityServiceImpl;
.super Ljava/lang/Object;
.source "UserActivityServices.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserActivityService;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeleteService;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateService;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserActivityService;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService<",
        "Ljava/util/List<",
        "+",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
        ">;>;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
        ">;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeleteService<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
        ">;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateService<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u00012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0008\u0012\u0004\u0012\u00020\u00040\u00052\u0008\u0012\u0004\u0012\u00020\u00040\u00062\u0008\u0012\u0004\u0012\u00020\u00040\u0007B[\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0005\u0012\u0014\u0008\u0002\u0010\r\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\u000e\u0008\u0002\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u000e\u0008\u0002\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0007\u00a2\u0006\u0002\u0010\u0010J5\u0010\u0011\u001a\u00020\u00122\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u001c\u0008\u0002\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015j\u0004\u0018\u0001`\u0017H\u0096\u0001J+\u0010\u0018\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u00030\u00192\u0014\u0008\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u0015H\u0096\u0001J\'\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00042\u0014\u0008\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u0015H\u0096\u0001J(\u0010\u001d\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001e0\u00030\u00192\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u0015H\u0016J\u0011\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0004H\u0096\u0001R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserActivityServiceImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserActivityService;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeleteService;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateService;",
        "httpClient",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;",
        "config",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityConfig;",
        "getAllService",
        "addService",
        "deleteService",
        "updateService",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeleteService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateService;)V",
        "add",
        "Lio/reactivex/Completable;",
        "item",
        "headers",
        "",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/Headers;",
        "all",
        "Lio/reactivex/Single;",
        "queryParams",
        "delete",
        "params",
        "getAllUserActivityDates",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityDate;",
        "update",
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
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
            ">;>;"
        }
    .end annotation
.end field

.field private final synthetic $$delegate_1:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
            ">;"
        }
    .end annotation
.end field

.field private final synthetic $$delegate_2:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeleteService;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeleteService<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
            ">;"
        }
    .end annotation
.end field

.field private final synthetic $$delegate_3:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateService;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateService<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
            ">;"
        }
    .end annotation
.end field

.field private final config:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityConfig;

.field private final httpClient:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeleteService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateService;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityConfig;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
            ">;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
            ">;>;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeleteService<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
            ">;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateService<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
            ">;)V"
        }
    .end annotation

    const-string v0, "httpClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getAllService"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "addService"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deleteService"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updateService"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserActivityServiceImpl;->httpClient:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;

    .line 17
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserActivityServiceImpl;->config:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityConfig;

    .line 24
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserActivityServiceImpl;->$$delegate_0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;

    .line 25
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserActivityServiceImpl;->$$delegate_1:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService;

    .line 26
    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserActivityServiceImpl;->$$delegate_2:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeleteService;

    .line 27
    iput-object p6, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserActivityServiceImpl;->$$delegate_3:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateService;

    return-void
.end method

.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeleteService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateService;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_0

    .line 18
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllServiceImpl;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityConfig;->getDayEndpoint()Ljava/lang/String;

    move-result-object p8

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserActivityServiceImpl$1;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserActivityServiceImpl$1;-><init>()V

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserActivityServiceImpl$1;->getType()Ljava/lang/reflect/Type;

    move-result-object v0

    const-string v1, "object : TypeToken<List<UserActivitySession>>() {}.type"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p3, p1, p8, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllServiceImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Ljava/lang/String;Ljava/lang/reflect/Type;)V

    check-cast p3, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService;

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, p7, 0x8

    if-eqz p3, :cond_1

    .line 19
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddServiceImpl;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityConfig;->getCrudServiceConfig()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;

    move-result-object p4

    invoke-virtual {p4}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;->getAddEndpoint()Ljava/lang/String;

    move-result-object p4

    invoke-direct {p3, p1, p4}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddServiceImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Ljava/lang/String;)V

    move-object p4, p3

    check-cast p4, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;

    :cond_1
    move-object v4, p4

    and-int/lit8 p3, p7, 0x10

    if-eqz p3, :cond_2

    .line 20
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeleteServiceImpl;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityConfig;->getCrudServiceConfig()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;

    move-result-object p4

    invoke-virtual {p4}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;->getDeleteEndpoint()Ljava/lang/String;

    move-result-object p4

    invoke-direct {p3, p1, p4}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeleteServiceImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Ljava/lang/String;)V

    move-object p5, p3

    check-cast p5, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeleteService;

    :cond_2
    move-object v5, p5

    and-int/lit8 p3, p7, 0x20

    if-eqz p3, :cond_3

    .line 21
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateServiceImpl;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityConfig;->getCrudServiceConfig()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;

    move-result-object p4

    invoke-virtual {p4}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;->getUpdateEndpoint()Ljava/lang/String;

    move-result-object p4

    invoke-direct {p3, p1, p4}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateServiceImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Ljava/lang/String;)V

    move-object p6, p3

    check-cast p6, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateService;

    :cond_3
    move-object v6, p6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    .line 15
    invoke-direct/range {v0 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserActivityServiceImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeleteService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateService;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic add(Ljava/lang/Object;Ljava/util/Map;)Lio/reactivex/Completable;
    .locals 0

    .line 15
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserActivityServiceImpl;->add(Ljava/util/List;Ljava/util/Map;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public add(Ljava/util/List;Ljava/util/Map;)Lio/reactivex/Completable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lio/reactivex/Completable;"
        }
    .end annotation

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserActivityServiceImpl;->$$delegate_0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;

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
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
            ">;>;"
        }
    .end annotation

    const-string v0, "queryParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserActivityServiceImpl;->$$delegate_1:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService;->all(Ljava/util/Map;)Lio/reactivex/Single;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic delete(Ljava/lang/Object;Ljava/util/Map;)Lio/reactivex/Completable;
    .locals 0

    .line 15
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;

    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserActivityServiceImpl;->delete(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;Ljava/util/Map;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public delete(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;Ljava/util/Map;)Lio/reactivex/Completable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
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

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserActivityServiceImpl;->$$delegate_2:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeleteService;

    invoke-interface {v0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeleteService;->delete(Ljava/lang/Object;Ljava/util/Map;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public getAllUserActivityDates(Ljava/util/Map;)Lio/reactivex/Single;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lio/reactivex/Single<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityDate;",
            ">;>;"
        }
    .end annotation

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserActivityServiceImpl;->httpClient:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserActivityServiceImpl;->config:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityConfig;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityConfig;->getActivityDatesEndpoint()Ljava/lang/String;

    move-result-object v2

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserActivityServiceImpl$getAllUserActivityDates$1;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserActivityServiceImpl$getAllUserActivityDates$1;-><init>()V

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserActivityServiceImpl$getAllUserActivityDates$1;->getType()Ljava/lang/reflect/Type;

    move-result-object v5

    const-string v0, "object : TypeToken<List<UserActivityDate>>() {}.type"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v6, 0x2

    const/4 v7, 0x0

    move-object v4, p1

    invoke-static/range {v1 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient$DefaultImpls;->get$default(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/reflect/Type;ILjava/lang/Object;)Lio/reactivex/Single;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic update(Ljava/lang/Object;)Lio/reactivex/Completable;
    .locals 0

    .line 15
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserActivityServiceImpl;->update(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public update(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)Lio/reactivex/Completable;
    .locals 1

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserActivityServiceImpl;->$$delegate_3:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateService;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateService;->update(Ljava/lang/Object;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method
