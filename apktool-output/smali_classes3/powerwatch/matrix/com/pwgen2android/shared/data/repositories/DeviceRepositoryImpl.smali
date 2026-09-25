.class public final Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;
.super Ljava/lang/Object;
.source "DeviceRepository.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J$\u0010\t\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000c0\u000b0\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0008\u0010\u0011\u001a\u00020\u0012H\u0016J\u0016\u0010\u0013\u001a\u0010\u0012\u000c\u0012\n \u0015*\u0004\u0018\u00010\u000c0\u000c0\u0014H\u0016J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000cH\u0016J\u001e\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\n2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0008\u0010\u001c\u001a\u00020\u0010H\u0016J<\u0010\u001d\u001a&\u0012\u000c\u0012\n \u0015*\u0004\u0018\u00010\u000c0\u000c \u0015*\u0012\u0012\u000c\u0012\n \u0015*\u0004\u0018\u00010\u000c0\u000c\u0018\u00010\n0\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u0010H\u0016J\u0008\u0010\u001f\u001a\u00020 H\u0016J\u0018\u0010!\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000c2\u0006\u0010\"\u001a\u00020\u0010H\u0016J\u0008\u0010#\u001a\u00020\u0017H\u0016J\u0010\u0010$\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000cH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;",
        "deviceDao",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;",
        "deviceCloudService",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceCloudService;",
        "defaultPhoneWatchDao",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DefaultPhoneWatchDao;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DefaultPhoneWatchDao;)V",
        "all",
        "Lio/reactivex/Observable;",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
        "page",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;",
        "fromCache",
        "",
        "count",
        "",
        "defaultDevice",
        "Lio/reactivex/Single;",
        "kotlin.jvm.PlatformType",
        "delete",
        "Lio/reactivex/Completable;",
        "item",
        "getOne",
        "id",
        "",
        "isEmpty",
        "load",
        "forceCache",
        "notSyncedCount",
        "",
        "save",
        "toCacheOnly",
        "sync",
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
.field private final defaultPhoneWatchDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DefaultPhoneWatchDao;

.field private final deviceCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceCloudService;

.field private final deviceDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DefaultPhoneWatchDao;)V
    .locals 1

    const-string v0, "deviceDao"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceCloudService"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaultPhoneWatchDao"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;->deviceDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;

    .line 27
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;->deviceCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceCloudService;

    .line 28
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;->defaultPhoneWatchDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DefaultPhoneWatchDao;

    return-void
.end method

.method private static final all$lambda-6(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;Ljava/util/List;)Lio/reactivex/SingleSource;
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "this$0"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "cloudDevices"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 105
    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;->defaultPhoneWatchDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DefaultPhoneWatchDao;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DefaultPhoneWatchDao;->getFirst()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/DefaultPhoneWatch;

    move-result-object v2

    .line 106
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v3

    invoke-interface {v1, v3}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v4

    move-object v6, v4

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    if-nez v2, :cond_1

    move-object v7, v5

    goto :goto_0

    .line 107
    :cond_1
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/DefaultPhoneWatch;->getSerialNumber()Ljava/lang/String;

    move-result-object v7

    :goto_0
    if-eqz v7, :cond_2

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/DefaultPhoneWatch;->getSerialNumber()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->getSerialNumber()Ljava/lang/String;

    move-result-object v6

    invoke-static {v7, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/4 v6, 0x1

    goto :goto_1

    :cond_2
    const/4 v6, 0x0

    :goto_1
    if-eqz v6, :cond_0

    goto :goto_2

    :cond_3
    move-object v4, v5

    .line 106
    :goto_2
    move-object v6, v4

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    if-nez v6, :cond_4

    goto :goto_3

    .line 111
    :cond_4
    iget-object v3, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;->deviceDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/DefaultPhoneWatch;->getBluetoothAddress()Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x7fb

    const/16 v20, 0x0

    invoke-static/range {v6 .. v20}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZZZZILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    move-result-object v2

    invoke-virtual {v3, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;->addDeviceCompletable(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)Lio/reactivex/Completable;

    move-result-object v5

    :goto_3
    if-nez v5, :cond_5

    .line 112
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$DeviceRepositoryImpl$T5VRitr37a0gp0il86gqAx_FeQg;

    invoke-direct {v2, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$DeviceRepositoryImpl$T5VRitr37a0gp0il86gqAx_FeQg;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;)V

    invoke-static {v2}, Lio/reactivex/Completable;->fromAction(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object v5

    .line 114
    :cond_5
    invoke-virtual {v5, v1}, Lio/reactivex/Completable;->toSingleDefault(Ljava/lang/Object;)Lio/reactivex/Single;

    move-result-object v0

    check-cast v0, Lio/reactivex/SingleSource;

    return-object v0
.end method

.method private static final all$lambda-6$lambda-5(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 113
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;->deviceDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;->deleteAll()V

    return-void
.end method

.method private static final all$lambda-7(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;Ljava/lang/Throwable;)Lio/reactivex/SingleSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 116
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;->deviceDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;->getAllDevices()Lio/reactivex/Single;

    move-result-object p0

    check-cast p0, Lio/reactivex/SingleSource;

    return-object p0
.end method

.method private static final delete$lambda-9(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;Ljava/lang/Throwable;)Lio/reactivex/CompletableSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 135
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;->deviceDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->getSerialNumber()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;->deleteDeviceCompletable(Ljava/lang/String;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    return-object p0
.end method

.method private static final getOne$lambda-8(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;Ljava/lang/String;Ljava/lang/Throwable;)Lio/reactivex/SingleSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 126
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;->deviceDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;->getDevice(Ljava/lang/String;)Lio/reactivex/Maybe;

    move-result-object p0

    invoke-virtual {p0}, Lio/reactivex/Maybe;->toSingle()Lio/reactivex/Single;

    move-result-object p0

    check-cast p0, Lio/reactivex/SingleSource;

    return-object p0
.end method

.method public static synthetic lambda$4X_V7a4ZwXi2yMSaUmOnpTgXww4(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;Ljava/util/List;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;->sync$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;Ljava/util/List;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$JXfWiNoUtP5Av0usNouzkLToQus(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;Ljava/lang/Throwable;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;->save$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;Ljava/lang/Throwable;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$RUbn3pYndcU-mc6zfsqW_RnSegE(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;Ljava/lang/Throwable;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;->update$lambda-10(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;Ljava/lang/Throwable;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$SpxkifP71S3Sq24Tq1oZPXKXKx0(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;->sync$lambda-1$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$T5VRitr37a0gp0il86gqAx_FeQg(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;->all$lambda-6$lambda-5(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;)V

    return-void
.end method

.method public static synthetic lambda$XJwK1u9pUVkcoSysPbzQl52y-Tk(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;Ljava/lang/String;Ljava/lang/Throwable;)Lio/reactivex/SingleSource;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;->getOne$lambda-8(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;Ljava/lang/String;Ljava/lang/Throwable;)Lio/reactivex/SingleSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$nrr6xkCi53VFnOJbbJ-KzlyRwG4(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;Ljava/lang/Throwable;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;->delete$lambda-9(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;Ljava/lang/Throwable;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$pVpYJCDtM5Zx84Ldez0w-FvEg5Q(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;Ljava/util/List;)Lio/reactivex/SingleSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;->all$lambda-6(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;Ljava/util/List;)Lio/reactivex/SingleSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$y42qyD3HI3dzv8qSwcJgzj0LxB4(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;Ljava/lang/Throwable;)Lio/reactivex/SingleSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;->all$lambda-7(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;Ljava/lang/Throwable;)Lio/reactivex/SingleSource;

    move-result-object p0

    return-object p0
.end method

.method private static final save$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;Ljava/lang/Throwable;)Lio/reactivex/CompletableSource;
    .locals 18

    move-object/from16 v0, p0

    const-string v1, "this$0"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "$item"

    move-object/from16 v15, p1

    invoke-static {v15, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "it"

    move-object/from16 v2, p2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    iget-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;->deviceDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x7bf

    const/16 v17, 0x0

    move-object/from16 v2, p1

    move/from16 v15, v16

    move-object/from16 v16, v17

    invoke-static/range {v2 .. v16}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZZZZILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    move-result-object v2

    invoke-virtual {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;->addDeviceCompletable(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)Lio/reactivex/Completable;

    move-result-object v1

    .line 92
    iget-object v0, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;->defaultPhoneWatchDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DefaultPhoneWatchDao;

    .line 93
    new-instance v9, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/DefaultPhoneWatch;

    .line 94
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->getBluetoothAddress()Ljava/lang/String;

    move-result-object v5

    .line 95
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->getSerialNumber()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x1

    move-object v2, v9

    .line 93
    invoke-direct/range {v2 .. v8}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/DefaultPhoneWatch;-><init>(JLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 92
    invoke-virtual {v0, v9}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DefaultPhoneWatchDao;->addCompletable(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/DefaultPhoneWatch;)Lio/reactivex/Completable;

    move-result-object v0

    check-cast v0, Lio/reactivex/CompletableSource;

    .line 91
    invoke-virtual {v1, v0}, Lio/reactivex/Completable;->andThen(Lio/reactivex/CompletableSource;)Lio/reactivex/Completable;

    move-result-object v0

    check-cast v0, Lio/reactivex/CompletableSource;

    return-object v0
.end method

.method private static final sync$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;Ljava/util/List;)Lio/reactivex/CompletableSource;
    .locals 4

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "devices"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 43
    invoke-static {}, Lio/reactivex/Completable;->complete()Lio/reactivex/Completable;

    move-result-object v0

    goto :goto_0

    .line 45
    :cond_0
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AllRepository;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AllRepository$DefaultImpls;->all$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AllRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;ZILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/Observable;->ignoreElements()Lio/reactivex/Completable;

    move-result-object v0

    .line 47
    :goto_0
    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lio/reactivex/Observable;->fromIterable(Ljava/lang/Iterable;)Lio/reactivex/Observable;

    move-result-object p1

    .line 48
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$DeviceRepositoryImpl$SpxkifP71S3Sq24Tq1oZPXKXKx0;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$DeviceRepositoryImpl$SpxkifP71S3Sq24Tq1oZPXKXKx0;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;)V

    invoke-virtual {p1, v1}, Lio/reactivex/Observable;->flatMapCompletable(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object p0

    .line 53
    check-cast v0, Lio/reactivex/CompletableSource;

    invoke-virtual {p0, v0}, Lio/reactivex/Completable;->andThen(Lio/reactivex/CompletableSource;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    return-object p0
.end method

.method private static final sync$lambda-1$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)Lio/reactivex/CompletableSource;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "this$0"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "deviceToSync"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;->deviceCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceCloudService;

    invoke-interface {v2, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceCloudService;->registerDevice(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)Lio/reactivex/Completable;

    move-result-object v15

    .line 51
    iget-object v14, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;->deviceDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x7bf

    const/16 v17, 0x0

    move-object/from16 v0, p1

    move-wide v1, v2

    move-object v3, v4

    move-object v4, v5

    move v5, v6

    move-object v6, v7

    move-object v7, v9

    move v9, v10

    move v10, v11

    move v11, v12

    move v12, v13

    move/from16 v13, v16

    move-object/from16 v16, v15

    move-object v15, v14

    move-object/from16 v14, v17

    invoke-static/range {v0 .. v14}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZZZZILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    move-result-object v0

    invoke-virtual {v15, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;->addDeviceCompletable(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)Lio/reactivex/Completable;

    move-result-object v0

    check-cast v0, Lio/reactivex/CompletableSource;

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lio/reactivex/Completable;->andThen(Lio/reactivex/CompletableSource;)Lio/reactivex/Completable;

    move-result-object v0

    check-cast v0, Lio/reactivex/CompletableSource;

    return-object v0
.end method

.method private static final update$lambda-10(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;Ljava/lang/Throwable;)Lio/reactivex/CompletableSource;
    .locals 17

    move-object/from16 v0, p0

    const-string v1, "this$0"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "$item"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "it"

    move-object/from16 v3, p2

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 145
    iget-object v0, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;->deviceDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v15, 0x7bf

    const/16 v16, 0x0

    invoke-static/range {v2 .. v16}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZZZZILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    move-result-object v1

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;->addDeviceCompletable(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)Lio/reactivex/Completable;

    move-result-object v0

    check-cast v0, Lio/reactivex/CompletableSource;

    return-object v0
.end method


# virtual methods
.method public all(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;Z)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;",
            "Z)",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
            ">;>;"
        }
    .end annotation

    const-string v0, "page"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p2, :cond_0

    .line 103
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;->deviceCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceCloudService;

    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceCloudService;->allDevices()Lio/reactivex/Single;

    move-result-object p1

    .line 104
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$DeviceRepositoryImpl$pVpYJCDtM5Zx84Ldez0w-FvEg5Q;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$DeviceRepositoryImpl$pVpYJCDtM5Zx84Ldez0w-FvEg5Q;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Single;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object p1

    .line 116
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$DeviceRepositoryImpl$y42qyD3HI3dzv8qSwcJgzj0LxB4;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$DeviceRepositoryImpl$y42qyD3HI3dzv8qSwcJgzj0LxB4;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Single;->onErrorResumeNext(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object p1

    .line 117
    invoke-virtual {p1}, Lio/reactivex/Single;->toObservable()Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "deviceCloudService.allDevices()\n                    .flatMap { cloudDevices ->\n                        val defaultDeviceUUID = defaultPhoneWatchDao.getFirst()\n                        val foundDevice = cloudDevices.findLast { cloudDevice ->\n                            defaultDeviceUUID?.serialNumber != null && defaultDeviceUUID.serialNumber == cloudDevice.serialNumber\n                        }\n\n                        (foundDevice?.let {\n                            deviceDao.addDeviceCompletable(it.copy(bluetoothAddress = defaultDeviceUUID!!.bluetoothAddress))\n                        } ?: Completable.fromAction {\n                            deviceDao.deleteAll()\n                        }).toSingleDefault(cloudDevices)\n                    }\n                    .onErrorResumeNext { deviceDao.getAllDevices() }\n                    .toObservable()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    .line 120
    :cond_0
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;->deviceDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;->getAllDevices()Lio/reactivex/Single;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/Single;->toObservable()Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "deviceDao.getAllDevices().toObservable()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public count()I
    .locals 1

    .line 63
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;->deviceDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;->count()I

    move-result v0

    return v0
.end method

.method public defaultDevice()Lio/reactivex/Single;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Single<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
            ">;"
        }
    .end annotation

    .line 32
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;->deviceDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;->getFirst()Lio/reactivex/Single;

    move-result-object v0

    .line 33
    invoke-static {}, Lio/reactivex/schedulers/Schedulers;->io()Lio/reactivex/Scheduler;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Single;->subscribeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Single;

    move-result-object v0

    const-string v1, "deviceDao.getFirst()\n            .subscribeOn(Schedulers.io())"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic delete(Ljava/lang/Object;)Lio/reactivex/Completable;
    .locals 0

    .line 26
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;->delete(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public delete(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)Lio/reactivex/Completable;
    .locals 2

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 134
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;->deviceCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceCloudService;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceCloudService;->removeDevice(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)Lio/reactivex/Completable;

    move-result-object v0

    .line 135
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$DeviceRepositoryImpl$nrr6xkCi53VFnOJbbJ-KzlyRwG4;

    invoke-direct {v1, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$DeviceRepositoryImpl$nrr6xkCi53VFnOJbbJ-KzlyRwG4;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Completable;->onErrorResumeNext(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object v0

    .line 136
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;->deviceDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->getSerialNumber()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;->deleteDeviceCompletable(Ljava/lang/String;)Lio/reactivex/Completable;

    move-result-object p1

    check-cast p1, Lio/reactivex/CompletableSource;

    invoke-virtual {v0, p1}, Lio/reactivex/Completable;->andThen(Lio/reactivex/CompletableSource;)Lio/reactivex/Completable;

    move-result-object p1

    const-string v0, "deviceCloudService.removeDevice(item)\n                .onErrorResumeNext { deviceDao.deleteDeviceCompletable(item.serialNumber) }\n                .andThen(deviceDao.deleteDeviceCompletable(item.serialNumber))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic getOne(Ljava/lang/Object;Z)Lio/reactivex/Observable;
    .locals 0

    .line 26
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;->getOne(Ljava/lang/String;Z)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public getOne(Ljava/lang/String;Z)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z)",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
            ">;"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p2, :cond_0

    .line 125
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;->deviceCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceCloudService;

    invoke-interface {p2, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceCloudService;->getDevice(Ljava/lang/String;)Lio/reactivex/Single;

    move-result-object p2

    .line 126
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$DeviceRepositoryImpl$XJwK1u9pUVkcoSysPbzQl52y-Tk;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$DeviceRepositoryImpl$XJwK1u9pUVkcoSysPbzQl52y-Tk;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Lio/reactivex/Single;->onErrorResumeNext(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object p1

    .line 127
    invoke-virtual {p1}, Lio/reactivex/Single;->toObservable()Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "deviceCloudService.getDevice(id)\n                    .onErrorResumeNext { deviceDao.getDevice(id).toSingle() }\n                    .toObservable()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    .line 130
    :cond_0
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;->deviceDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;

    invoke-virtual {p2, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;->getDevice(Ljava/lang/String;)Lio/reactivex/Maybe;

    move-result-object p2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;->deviceCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceCloudService;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceCloudService;->getDevice(Ljava/lang/String;)Lio/reactivex/Single;

    move-result-object p1

    check-cast p1, Lio/reactivex/SingleSource;

    invoke-virtual {p2, p1}, Lio/reactivex/Maybe;->switchIfEmpty(Lio/reactivex/SingleSource;)Lio/reactivex/Single;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/Single;->toObservable()Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "deviceDao.getDevice(id).switchIfEmpty(deviceCloudService.getDevice(id)).toObservable()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public isEmpty()Z
    .locals 1

    .line 59
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;->count()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public load(ZZ)Lio/reactivex/Observable;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ)",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
            ">;"
        }
    .end annotation

    .line 29
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;->deviceDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;->observeFirst()Lio/reactivex/Observable;

    move-result-object p1

    .line 30
    invoke-static {}, Lio/reactivex/schedulers/Schedulers;->io()Lio/reactivex/Scheduler;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->subscribeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public notSyncedCount()J
    .locals 3

    .line 36
    new-instance v0, Lkotlin/NotImplementedError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "An operation is not implemented: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "not implemented"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0
.end method

.method public bridge synthetic save(Ljava/lang/Object;Z)Lio/reactivex/Completable;
    .locals 0

    .line 26
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;->save(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;Z)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public save(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;Z)Lio/reactivex/Completable;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v15, p1

    const-string v1, "item"

    invoke-static {v15, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    if-eqz p2, :cond_0

    .line 70
    iget-object v14, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;->deviceDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x7bf

    const/16 v17, 0x0

    move-object/from16 v1, p1

    move-object/from16 v18, v14

    move/from16 v14, v16

    move-object/from16 v15, v17

    invoke-static/range {v1 .. v15}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZZZZILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    move-result-object v1

    move-object/from16 v2, v18

    invoke-virtual {v2, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;->addDeviceCompletable(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)Lio/reactivex/Completable;

    move-result-object v1

    .line 72
    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;->defaultPhoneWatchDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DefaultPhoneWatchDao;

    .line 73
    new-instance v10, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/DefaultPhoneWatch;

    const-wide/16 v4, 0x0

    .line 74
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->getBluetoothAddress()Ljava/lang/String;

    move-result-object v6

    .line 75
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->getSerialNumber()Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x1

    const/4 v9, 0x0

    move-object v3, v10

    .line 73
    invoke-direct/range {v3 .. v9}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/DefaultPhoneWatch;-><init>(JLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 72
    invoke-virtual {v2, v10}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DefaultPhoneWatchDao;->addCompletable(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/DefaultPhoneWatch;)Lio/reactivex/Completable;

    move-result-object v2

    check-cast v2, Lio/reactivex/CompletableSource;

    .line 71
    invoke-virtual {v1, v2}, Lio/reactivex/Completable;->andThen(Lio/reactivex/CompletableSource;)Lio/reactivex/Completable;

    move-result-object v1

    const-string v2, "deviceDao.addDeviceCompletable(item.copy(shouldSync = true))\n                    .andThen(\n                            defaultPhoneWatchDao.addCompletable(\n                                    DefaultPhoneWatch(\n                                            bluetoothAddress = item.bluetoothAddress,\n                                            serialNumber = item.serialNumber))\n                    )"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v1

    .line 79
    :cond_0
    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;->deviceCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceCloudService;

    move-object/from16 v3, p1

    invoke-interface {v2, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceCloudService;->registerDevice(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)Lio/reactivex/Completable;

    move-result-object v2

    .line 81
    iget-object v4, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;->deviceDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;

    invoke-virtual {v4, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;->addDeviceCompletable(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)Lio/reactivex/Completable;

    move-result-object v4

    check-cast v4, Lio/reactivex/CompletableSource;

    invoke-virtual {v2, v4}, Lio/reactivex/Completable;->andThen(Lio/reactivex/CompletableSource;)Lio/reactivex/Completable;

    move-result-object v2

    .line 83
    iget-object v4, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;->defaultPhoneWatchDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DefaultPhoneWatchDao;

    .line 84
    new-instance v12, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/DefaultPhoneWatch;

    const-wide/16 v6, 0x0

    .line 85
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->getBluetoothAddress()Ljava/lang/String;

    move-result-object v8

    .line 86
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->getSerialNumber()Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x1

    const/4 v11, 0x0

    move-object v5, v12

    .line 84
    invoke-direct/range {v5 .. v11}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/DefaultPhoneWatch;-><init>(JLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 83
    invoke-virtual {v4, v12}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DefaultPhoneWatchDao;->addCompletable(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/DefaultPhoneWatch;)Lio/reactivex/Completable;

    move-result-object v4

    check-cast v4, Lio/reactivex/CompletableSource;

    .line 82
    invoke-virtual {v2, v4}, Lio/reactivex/Completable;->andThen(Lio/reactivex/CompletableSource;)Lio/reactivex/Completable;

    move-result-object v2

    .line 88
    move-object v4, v0

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AllRepository;

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static {v4, v6, v5, v1, v6}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AllRepository$DefaultImpls;->all$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AllRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;ZILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v1

    invoke-virtual {v1}, Lio/reactivex/Observable;->ignoreElements()Lio/reactivex/Completable;

    move-result-object v1

    check-cast v1, Lio/reactivex/CompletableSource;

    invoke-virtual {v2, v1}, Lio/reactivex/Completable;->andThen(Lio/reactivex/CompletableSource;)Lio/reactivex/Completable;

    move-result-object v1

    .line 89
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$DeviceRepositoryImpl$JXfWiNoUtP5Av0usNouzkLToQus;

    invoke-direct {v2, v0, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$DeviceRepositoryImpl$JXfWiNoUtP5Av0usNouzkLToQus;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Completable;->onErrorResumeNext(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object v1

    const-string v2, "deviceCloudService.registerDevice(item)\n                // be sure to store it in local cache even if error occurs\n                .andThen(deviceDao.addDeviceCompletable(item))\n                .andThen(\n                        defaultPhoneWatchDao.addCompletable(\n                                DefaultPhoneWatch(\n                                        bluetoothAddress = item.bluetoothAddress,\n                                        serialNumber = item.serialNumber))\n                )\n                .andThen(all(fromCache = false).ignoreElements())\n                .onErrorResumeNext {\n                    deviceDao.addDeviceCompletable(item.copy(shouldSync = true))\n                            .andThen(\n                                    defaultPhoneWatchDao.addCompletable(\n                                            DefaultPhoneWatch(\n                                                    bluetoothAddress = item.bluetoothAddress,\n                                                    serialNumber = item.serialNumber))\n                            )\n                }"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v1
.end method

.method public sync()Lio/reactivex/Completable;
    .locals 2

    .line 40
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;->deviceDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;->getNotRegisteredDevices()Lio/reactivex/Single;

    move-result-object v0

    .line 41
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$DeviceRepositoryImpl$4X_V7a4ZwXi2yMSaUmOnpTgXww4;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$DeviceRepositoryImpl$4X_V7a4ZwXi2yMSaUmOnpTgXww4;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Single;->flatMapCompletable(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object v0

    const-string v1, "deviceDao.getNotRegisteredDevices()\n                .flatMapCompletable { devices ->\n                    val devicesRequest = if (devices.isEmpty()) {\n                        Completable.complete()\n                    } else {\n                        all(fromCache = false).ignoreElements()\n                    }\n                    Observable.fromIterable(devices)\n                            .flatMapCompletable { deviceToSync ->\n                                deviceCloudService.registerDevice(deviceToSync)\n                                        // after it is registered, update local storage\n                                        .andThen(deviceDao.addDeviceCompletable(deviceToSync.copy(shouldSync = false)))\n                            }\n                            .andThen(devicesRequest)\n                }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic update(Ljava/lang/Object;)Lio/reactivex/Completable;
    .locals 0

    .line 26
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;->update(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public update(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)Lio/reactivex/Completable;
    .locals 2

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 142
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;->deviceCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceCloudService;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceCloudService;->updateDevice(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)Lio/reactivex/Completable;

    move-result-object v0

    .line 143
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;->deviceDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;

    invoke-virtual {v1, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;->addDeviceCompletable(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)Lio/reactivex/Completable;

    move-result-object v1

    check-cast v1, Lio/reactivex/CompletableSource;

    invoke-virtual {v0, v1}, Lio/reactivex/Completable;->andThen(Lio/reactivex/CompletableSource;)Lio/reactivex/Completable;

    move-result-object v0

    .line 145
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$DeviceRepositoryImpl$RUbn3pYndcU-mc6zfsqW_RnSegE;

    invoke-direct {v1, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$DeviceRepositoryImpl$RUbn3pYndcU-mc6zfsqW_RnSegE;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Completable;->onErrorResumeNext(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object p1

    const-string v0, "deviceCloudService.updateDevice(item)\n                .andThen(deviceDao.addDeviceCompletable(item))\n                // be sure to store it in local cache even if error occurs\n                .onErrorResumeNext { deviceDao.addDeviceCompletable(item.copy(shouldSync = true)) }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
