.class public final Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityCloudServiceImpl;
.super Ljava/lang/Object;
.source "UserActivityCloudService.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityCloudService;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008H\u0016J\u001c\u0010\t\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u000b0\n2\u0006\u0010\u000c\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000f0\u000b0\n2\u0006\u0010\u000c\u001a\u00020\rH\u0016J\u0016\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00080\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0016\u0010\u0013\u001a\u00020\u00062\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u000bH\u0016J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityCloudServiceImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityCloudService;",
        "crudUserActivityService",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserActivityService;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserActivityService;)V",
        "deleteUserActivity",
        "Lio/reactivex/Completable;",
        "userActivity",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
        "getAllUserActivities",
        "Lio/reactivex/Single;",
        "",
        "page",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;",
        "getAllUserActivityDates",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityDate;",
        "getOneUserActivity",
        "id",
        "",
        "saveUserActivities",
        "userActivities",
        "updateUserActivity",
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
.field private final crudUserActivityService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserActivityService;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserActivityService;)V
    .locals 1

    const-string v0, "crudUserActivityService"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityCloudServiceImpl;->crudUserActivityService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserActivityService;

    return-void
.end method


# virtual methods
.method public deleteUserActivity(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)Lio/reactivex/Completable;
    .locals 3

    const-string v0, "userActivity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    new-instance v0, Lkotlin/Pair;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getId()Ljava/lang/String;

    move-result-object v1

    const-string v2, "id"

    invoke-direct {v0, v2, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 48
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    .line 52
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityCloudServiceImpl;->crudUserActivityService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserActivityService;

    invoke-interface {v1, p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserActivityService;->delete(Ljava/lang/Object;Ljava/util/Map;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public getAllUserActivities(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;)Lio/reactivex/Single;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;",
            ")",
            "Lio/reactivex/Single<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
            ">;>;"
        }
    .end annotation

    const-string v0, "page"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    new-array v0, v0, [Lkotlin/Pair;

    .line 57
    new-instance v1, Lkotlin/Pair;

    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/TimeZone;->getID()Ljava/lang/String;

    move-result-object v2

    const-string v3, "timezone"

    invoke-direct {v1, v3, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v0}, Lkotlin/collections/MapsKt;->mutableMapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    .line 58
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;->getOffset()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    const-string v2, "offset"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;->getLimit()I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    const-string v1, "limit"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityCloudServiceImpl;->crudUserActivityService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserActivityService;

    invoke-interface {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserActivityService;->all(Ljava/util/Map;)Lio/reactivex/Single;

    move-result-object p1

    return-object p1
.end method

.method public getAllUserActivityDates(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;)Lio/reactivex/Single;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;",
            ")",
            "Lio/reactivex/Single<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityDate;",
            ">;>;"
        }
    .end annotation

    const-string v0, "page"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    new-array v0, v0, [Lkotlin/Pair;

    .line 32
    new-instance v1, Lkotlin/Pair;

    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/TimeZone;->getID()Ljava/lang/String;

    move-result-object v2

    const-string v3, "timezone"

    invoke-direct {v1, v3, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v0}, Lkotlin/collections/MapsKt;->mutableMapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    .line 33
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;->getOffset()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    const-string v2, "offset"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;->getLimit()I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    const-string v1, "limit"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityCloudServiceImpl;->crudUserActivityService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserActivityService;

    invoke-interface {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserActivityService;->getAllUserActivityDates(Ljava/util/Map;)Lio/reactivex/Single;

    move-result-object p1

    return-object p1
.end method

.method public getOneUserActivity(Ljava/lang/String;)Lio/reactivex/Single;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Single<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
            ">;"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    new-instance p1, Lkotlin/NotImplementedError;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "An operation is not implemented: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "not implemented"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1
.end method

.method public saveUserActivities(Ljava/util/List;)Lio/reactivex/Completable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
            ">;)",
            "Lio/reactivex/Completable;"
        }
    .end annotation

    const-string v0, "userActivities"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityCloudServiceImpl;->crudUserActivityService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserActivityService;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, p1, v1, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService$DefaultImpls;->add$default(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;Ljava/lang/Object;Ljava/util/Map;ILjava/lang/Object;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public updateUserActivity(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)Lio/reactivex/Completable;
    .locals 1

    const-string v0, "userActivity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityCloudServiceImpl;->crudUserActivityService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserActivityService;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserActivityService;->update(Ljava/lang/Object;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method
