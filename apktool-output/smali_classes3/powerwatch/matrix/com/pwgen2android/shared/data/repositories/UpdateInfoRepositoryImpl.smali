.class public final Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepositoryImpl;
.super Ljava/lang/Object;
.source "UpdateInfoRepository.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepository;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0008\u0010\u0007\u001a\u00020\u0008H\u0016J\u001e\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001e\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepositoryImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepository;",
        "updateInfoCloudService",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/updateInfo/UpdateInfoCloudService;",
        "updateInfoDao",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/updateInfo/UpdateInfoCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao;)V",
        "delete",
        "Lio/reactivex/Completable;",
        "getOne",
        "Lio/reactivex/Observable;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;",
        "id",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoParams;",
        "fromCache",
        "",
        "load",
        "forceCache",
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
.field private final updateInfoCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/updateInfo/UpdateInfoCloudService;

.field private final updateInfoDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/updateInfo/UpdateInfoCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao;)V
    .locals 1

    const-string v0, "updateInfoCloudService"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updateInfoDao"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepositoryImpl;->updateInfoCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/updateInfo/UpdateInfoCloudService;

    .line 19
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepositoryImpl;->updateInfoDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao;

    return-void
.end method

.method private static final delete$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepositoryImpl;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepositoryImpl;->updateInfoDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao;->delete()V

    return-void
.end method

.method private static final getOne$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;)Lio/reactivex/SingleSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepositoryImpl;->updateInfoDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao;->addCompletable(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;)Lio/reactivex/Completable;

    move-result-object p0

    invoke-virtual {p0, p1}, Lio/reactivex/Completable;->toSingleDefault(Ljava/lang/Object;)Lio/reactivex/Single;

    move-result-object p0

    check-cast p0, Lio/reactivex/SingleSource;

    return-object p0
.end method

.method public static synthetic lambda$Aa8Imi5D_sLmVhBZ0AQAmNLacfU(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepositoryImpl;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepositoryImpl;->delete$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepositoryImpl;)V

    return-void
.end method

.method public static synthetic lambda$bPtA32RaCt8PJWCln2I1v_R8NLw(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;)Lio/reactivex/SingleSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepositoryImpl;->getOne$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;)Lio/reactivex/SingleSource;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public delete()Lio/reactivex/Completable;
    .locals 2

    .line 20
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UpdateInfoRepositoryImpl$Aa8Imi5D_sLmVhBZ0AQAmNLacfU;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UpdateInfoRepositoryImpl$Aa8Imi5D_sLmVhBZ0AQAmNLacfU;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepositoryImpl;)V

    invoke-static {v0}, Lio/reactivex/Completable;->fromAction(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object v0

    const-string v1, "fromAction {\n        updateInfoDao.delete()\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic getOne(Ljava/lang/Object;Z)Lio/reactivex/Observable;
    .locals 0

    .line 18
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoParams;

    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepositoryImpl;->getOne(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoParams;Z)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public getOne(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoParams;Z)Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoParams;",
            "Z)",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;",
            ">;"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    .line 33
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepositoryImpl;->updateInfoDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao;->get()Lio/reactivex/Maybe;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/Maybe;->toObservable()Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "updateInfoDao.get().toObservable()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    .line 35
    :cond_0
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepositoryImpl;->updateInfoDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao;->get()Lio/reactivex/Maybe;

    move-result-object p2

    invoke-virtual {p2}, Lio/reactivex/Maybe;->toObservable()Lio/reactivex/Observable;

    move-result-object p2

    check-cast p2, Lio/reactivex/ObservableSource;

    .line 36
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepositoryImpl;->updateInfoCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/updateInfo/UpdateInfoCloudService;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoParams;->getProductID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoParams;->getLanguage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/updateInfo/UpdateInfoCloudService;->getUpdateInfo(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/Single;

    move-result-object p1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UpdateInfoRepositoryImpl$bPtA32RaCt8PJWCln2I1v_R8NLw;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UpdateInfoRepositoryImpl$bPtA32RaCt8PJWCln2I1v_R8NLw;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepositoryImpl;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Single;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object p1

    .line 38
    invoke-virtual {p1}, Lio/reactivex/Single;->toObservable()Lio/reactivex/Observable;

    move-result-object p1

    check-cast p1, Lio/reactivex/ObservableSource;

    .line 35
    invoke-static {p2, p1}, Lio/reactivex/Observable;->concat(Lio/reactivex/ObservableSource;Lio/reactivex/ObservableSource;)Lio/reactivex/Observable;

    move-result-object p1

    .line 39
    invoke-static {}, Lio/reactivex/schedulers/Schedulers;->io()Lio/reactivex/Scheduler;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->subscribeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "concat(updateInfoDao.get().toObservable(),\n                updateInfoCloudService.getUpdateInfo(id.productID, id.language).flatMap {\n                    updateInfoDao.addCompletable(it).toSingleDefault(it)\n                }.toObservable())\n                .subscribeOn(Schedulers.io())"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public load(ZZ)Lio/reactivex/Observable;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ)",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;",
            ">;"
        }
    .end annotation

    .line 26
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepositoryImpl;->updateInfoDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao;->observeUpdateInfo()Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method
