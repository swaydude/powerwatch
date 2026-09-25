.class public final Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddServiceImpl;
.super Ljava/lang/Object;
.source "CrudServices.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Entity:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService<",
        "TEntity;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000*\u0008\u0008\u0000\u0010\u0001*\u00020\u00022\u0008\u0012\u0004\u0012\u0002H\u00010\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J1\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u00002\u001a\u0010\u000c\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\rj\u0004\u0018\u0001`\u000eH\u0016\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddServiceImpl;",
        "Entity",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;",
        "httpClient",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;",
        "endpoint",
        "",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Ljava/lang/String;)V",
        "add",
        "Lio/reactivex/Completable;",
        "item",
        "headers",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/Headers;",
        "(Ljava/lang/Object;Ljava/util/Map;)Lio/reactivex/Completable;",
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
.field private final endpoint:Ljava/lang/String;

.field private final httpClient:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Ljava/lang/String;)V
    .locals 1

    const-string v0, "httpClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "endpoint"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddServiceImpl;->httpClient:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddServiceImpl;->endpoint:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public add(Ljava/lang/Object;Ljava/util/Map;)Lio/reactivex/Completable;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TEntity;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lio/reactivex/Completable;"
        }
    .end annotation

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddServiceImpl;->endpoint:Ljava/lang/String;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddServiceImpl;->httpClient:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;

    const/4 v5, 0x0

    const/16 v6, 0x8

    const/4 v7, 0x0

    move-object v3, p2

    move-object v4, p1

    invoke-static/range {v1 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient$DefaultImpls;->postCompletable$default(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/util/Map;ILjava/lang/Object;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method
