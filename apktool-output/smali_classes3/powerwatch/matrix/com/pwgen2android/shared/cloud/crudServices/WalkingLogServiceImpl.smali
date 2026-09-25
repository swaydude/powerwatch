.class public final Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingLogServiceImpl;
.super Ljava/lang/Object;
.source "LogServices.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingLogService;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingLogService;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService<",
        "Ljava/util/List<",
        "+",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u00030\u0002B+\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u00a2\u0006\u0002\u0010\nJ5\u0010\u000b\u001a\u00020\u000c2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u001c\u0008\u0002\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fj\u0004\u0018\u0001`\u0011H\u0096\u0001\u00a8\u0006\u0012"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingLogServiceImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingLogService;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;",
        "httpClient",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;",
        "logCloudConfig",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/LogCloudConfig;",
        "addService",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/LogCloudConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;)V",
        "add",
        "Lio/reactivex/Completable;",
        "item",
        "headers",
        "",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/Headers;",
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
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/LogCloudConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/LogCloudConfig;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;",
            ">;>;)V"
        }
    .end annotation

    const-string v0, "httpClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "logCloudConfig"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "addService"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingLogServiceImpl;->$$delegate_0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;

    return-void
.end method

.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/LogCloudConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 15
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddServiceImpl;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/LogCloudConfig;->getCrudServiceConfig()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;

    move-result-object p4

    invoke-virtual {p4}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;->getAddEndpoint()Ljava/lang/String;

    move-result-object p4

    invoke-direct {p3, p1, p4}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddServiceImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Ljava/lang/String;)V

    check-cast p3, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;

    .line 12
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingLogServiceImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/LogCloudConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic add(Ljava/lang/Object;Ljava/util/Map;)Lio/reactivex/Completable;
    .locals 0

    .line 12
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingLogServiceImpl;->add(Ljava/util/List;Ljava/util/Map;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public add(Ljava/util/List;Ljava/util/Map;)Lio/reactivex/Completable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;",
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

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingLogServiceImpl;->$$delegate_0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;

    invoke-interface {v0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;->add(Ljava/lang/Object;Ljava/util/Map;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method
