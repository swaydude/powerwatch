.class public final Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateService;
.super Ljava/lang/Object;
.source "FontUpdateService.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateInfo;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u00a2\u0006\u0002\u0010\nJ\"\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000c2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateService;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateInfo;",
        "httpClient",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;",
        "fontUpdateConfiguration",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateConfiguration;",
        "downloadExecutor",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DownloadJSONServiceImpl;",
        "getService",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateConfiguration;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DownloadJSONServiceImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService;)V",
        "get",
        "Lio/reactivex/Single;",
        "queries",
        "",
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
.field private final downloadExecutor:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DownloadJSONServiceImpl;

.field private final getService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateInfo;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateConfiguration;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DownloadJSONServiceImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateConfiguration;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DownloadJSONServiceImpl;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateInfo;",
            ">;)V"
        }
    .end annotation

    const-string v0, "httpClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "fontUpdateConfiguration"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "downloadExecutor"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "getService"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateService;->downloadExecutor:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DownloadJSONServiceImpl;

    .line 17
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateService;->getService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService;

    return-void
.end method

.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateConfiguration;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DownloadJSONServiceImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    .line 18
    new-instance p4, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetServiceImpl;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateConfiguration;->getGetUpdateInfoEndpoint()Ljava/lang/String;

    move-result-object p5

    new-instance p6, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateService$1;

    invoke-direct {p6}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateService$1;-><init>()V

    invoke-virtual {p6}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateService$1;->getType()Ljava/lang/reflect/Type;

    move-result-object p6

    const-string v0, "object : TypeToken<FontUpdateInfo>() {}.type"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p4, p1, p5, p6}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetServiceImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Ljava/lang/String;Ljava/lang/reflect/Type;)V

    check-cast p4, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService;

    .line 13
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateService;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateConfiguration;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DownloadJSONServiceImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService;)V

    return-void
.end method


# virtual methods
.method public get(Ljava/util/Map;)Lio/reactivex/Single;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lio/reactivex/Single<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateInfo;",
            ">;"
        }
    .end annotation

    const-string v0, "queries"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateService;->getService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService$DefaultImpls;->get$default(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService;Ljava/util/Map;ILjava/lang/Object;)Lio/reactivex/Single;

    move-result-object p1

    return-object p1
.end method
