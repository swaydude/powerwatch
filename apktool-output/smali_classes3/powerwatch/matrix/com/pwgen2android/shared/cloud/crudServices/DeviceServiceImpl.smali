.class public final Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeviceServiceImpl;
.super Ljava/lang/Object;
.source "DeviceService.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeviceService;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeleteService;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateService;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeviceService;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
        ">;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
        ">;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeleteService<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
        ">;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateService<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
        ">;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0008\u0007\u0018\u00002\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0008\u0012\u0004\u0012\u00020\u00030\u00042\u0008\u0012\u0004\u0012\u00020\u00030\u00052\u0008\u0012\u0004\u0012\u00020\u00030\u00062\u0008\u0012\u0004\u0012\u00020\u00030\u0007Be\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\u0008\u0002\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u000e\u0008\u0002\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0004\u0012\u000e\u0008\u0002\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u000e\u0008\u0002\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0007\u00a2\u0006\u0002\u0010\u0011J/\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00032\u001c\u0008\u0002\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016j\u0004\u0018\u0001`\u0018H\u0096\u0001J+\u0010\u0019\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u001b0\u001a2\u0014\u0008\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u0016H\u0096\u0001J\'\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00032\u0014\u0008\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u0016H\u0096\u0001J%\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u001a2\u0014\u0008\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u0016H\u0096\u0001J\u0011\u0010!\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0003H\u0096\u0001\u00a8\u0006\""
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeviceServiceImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeviceService;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeleteService;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateService;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService;",
        "httpClient",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;",
        "deviceConfig",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceConfig;",
        "getService",
        "deleteService",
        "addService",
        "updateService",
        "getAllService",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeleteService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService;)V",
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
        "get",
        "queries",
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
.field private final synthetic $$delegate_0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
            ">;"
        }
    .end annotation
.end field

.field private final synthetic $$delegate_1:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
            ">;"
        }
    .end annotation
.end field

.field private final synthetic $$delegate_2:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeleteService;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeleteService<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
            ">;"
        }
    .end annotation
.end field

.field private final synthetic $$delegate_3:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateService;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateService<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
            ">;"
        }
    .end annotation
.end field

.field private final synthetic $$delegate_4:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeleteService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceConfig;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
            ">;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeleteService<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
            ">;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
            ">;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateService<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
            ">;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
            ">;)V"
        }
    .end annotation

    const-string v0, "httpClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "deviceConfig"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "getService"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "deleteService"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "addService"

    invoke-static {p5, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "updateService"

    invoke-static {p6, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "getAllService"

    invoke-static {p7, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeviceServiceImpl;->$$delegate_0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService;

    .line 28
    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeviceServiceImpl;->$$delegate_1:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;

    .line 29
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeviceServiceImpl;->$$delegate_2:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeleteService;

    .line 30
    iput-object p6, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeviceServiceImpl;->$$delegate_3:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateService;

    .line 31
    iput-object p7, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeviceServiceImpl;->$$delegate_4:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService;

    return-void
.end method

.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeleteService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    move-object v1, p1

    and-int/lit8 v0, p8, 0x4

    const-string v2, "object : TypeToken<ArrayList<Device>>() {}.type"

    if-eqz v0, :cond_0

    .line 21
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetServiceImpl;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceConfig;->getCrudServiceConfig()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;

    move-result-object v3

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;->getGetEndpoint()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeviceServiceImpl$1;

    invoke-direct {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeviceServiceImpl$1;-><init>()V

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeviceServiceImpl$1;->getType()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p1, v3, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetServiceImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Ljava/lang/String;Ljava/lang/reflect/Type;)V

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService;

    move-object v3, v0

    goto :goto_0

    :cond_0
    move-object v3, p3

    :goto_0
    and-int/lit8 v0, p8, 0x8

    if-eqz v0, :cond_1

    .line 22
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeleteServiceImpl;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceConfig;->getCrudServiceConfig()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;

    move-result-object v4

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;->getDeleteEndpoint()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, p1, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeleteServiceImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Ljava/lang/String;)V

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeleteService;

    move-object v4, v0

    goto :goto_1

    :cond_1
    move-object v4, p4

    :goto_1
    and-int/lit8 v0, p8, 0x10

    if-eqz v0, :cond_2

    .line 23
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddServiceImpl;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceConfig;->getCrudServiceConfig()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;

    move-result-object v5

    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;->getAddEndpoint()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v0, p1, v5}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddServiceImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Ljava/lang/String;)V

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;

    move-object v5, v0

    goto :goto_2

    :cond_2
    move-object v5, p5

    :goto_2
    and-int/lit8 v0, p8, 0x20

    if-eqz v0, :cond_3

    .line 24
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateServiceImpl;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceConfig;->getCrudServiceConfig()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;

    move-result-object v6

    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;->getUpdateEndpoint()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v0, p1, v6}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateServiceImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Ljava/lang/String;)V

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateService;

    move-object v6, v0

    goto :goto_3

    :cond_3
    move-object v6, p6

    :goto_3
    and-int/lit8 v0, p8, 0x40

    if-eqz v0, :cond_4

    .line 25
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllServiceImpl;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceConfig;->getCrudServiceConfig()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;

    move-result-object v7

    invoke-virtual {v7}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;->getGetAllEndpoint()Ljava/lang/String;

    move-result-object v7

    new-instance v8, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeviceServiceImpl$2;

    invoke-direct {v8}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeviceServiceImpl$2;-><init>()V

    invoke-virtual {v8}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeviceServiceImpl$2;->getType()Ljava/lang/reflect/Type;

    move-result-object v8

    invoke-static {v8, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p1, v7, v8}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllServiceImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Ljava/lang/String;Ljava/lang/reflect/Type;)V

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService;

    move-object v7, v0

    goto :goto_4

    :cond_4
    move-object/from16 v7, p7

    :goto_4
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    .line 18
    invoke-direct/range {v0 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeviceServiceImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeleteService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic add(Ljava/lang/Object;Ljava/util/Map;)Lio/reactivex/Completable;
    .locals 0

    .line 18
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeviceServiceImpl;->add(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;Ljava/util/Map;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public add(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;Ljava/util/Map;)Lio/reactivex/Completable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lio/reactivex/Completable;"
        }
    .end annotation

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeviceServiceImpl;->$$delegate_1:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;

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
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
            ">;>;"
        }
    .end annotation

    const-string v0, "queryParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeviceServiceImpl;->$$delegate_4:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService;->all(Ljava/util/Map;)Lio/reactivex/Single;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic delete(Ljava/lang/Object;Ljava/util/Map;)Lio/reactivex/Completable;
    .locals 0

    .line 18
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeviceServiceImpl;->delete(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;Ljava/util/Map;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public delete(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;Ljava/util/Map;)Lio/reactivex/Completable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
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

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeviceServiceImpl;->$$delegate_2:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeleteService;

    invoke-interface {v0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeleteService;->delete(Ljava/lang/Object;Ljava/util/Map;)Lio/reactivex/Completable;

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
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
            ">;"
        }
    .end annotation

    const-string v0, "queries"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeviceServiceImpl;->$$delegate_0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService;->get(Ljava/util/Map;)Lio/reactivex/Single;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic update(Ljava/lang/Object;)Lio/reactivex/Completable;
    .locals 0

    .line 18
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeviceServiceImpl;->update(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public update(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)Lio/reactivex/Completable;
    .locals 1

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeviceServiceImpl;->$$delegate_3:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateService;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateService;->update(Ljava/lang/Object;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method
