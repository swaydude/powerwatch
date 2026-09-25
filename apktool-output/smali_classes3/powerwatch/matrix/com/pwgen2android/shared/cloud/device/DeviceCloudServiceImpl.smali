.class public final Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceCloudServiceImpl;
.super Ljava/lang/Object;
.source "DeviceCloudService.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceCloudService;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\n0\t0\u0008H\u0016J\u0016\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00082\u0006\u0010\u000c\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\nH\u0016J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\nH\u0016J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceCloudServiceImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceCloudService;",
        "deviceService",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeviceService;",
        "deviceConfig",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceConfig;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeviceService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceConfig;)V",
        "allDevices",
        "Lio/reactivex/Single;",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
        "getDevice",
        "serialNumber",
        "",
        "registerDevice",
        "Lio/reactivex/Completable;",
        "device",
        "removeDevice",
        "updateDevice",
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
.field private final deviceService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeviceService;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeviceService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceConfig;)V
    .locals 1

    const-string v0, "deviceService"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceCloudServiceImpl;->deviceService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeviceService;

    return-void
.end method


# virtual methods
.method public allDevices()Lio/reactivex/Single;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Single<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
            ">;>;"
        }
    .end annotation

    .line 52
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceCloudServiceImpl;->deviceService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeviceService;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService$DefaultImpls;->all$default(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService;Ljava/util/Map;ILjava/lang/Object;)Lio/reactivex/Single;

    move-result-object v0

    return-object v0
.end method

.method public getDevice(Ljava/lang/String;)Lio/reactivex/Single;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Single<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
            ">;"
        }
    .end annotation

    const-string v0, "serialNumber"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceCloudServiceImpl;->deviceService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeviceService;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService$DefaultImpls;->get$default(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService;Ljava/util/Map;ILjava/lang/Object;)Lio/reactivex/Single;

    move-result-object p1

    return-object p1
.end method

.method public registerDevice(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)Lio/reactivex/Completable;
    .locals 3

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceCloudServiceImpl;->deviceService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeviceService;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, p1, v1, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService$DefaultImpls;->add$default(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;Ljava/lang/Object;Ljava/util/Map;ILjava/lang/Object;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public removeDevice(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)Lio/reactivex/Completable;
    .locals 4

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    new-array v0, v0, [Lkotlin/Pair;

    .line 48
    new-instance v1, Lkotlin/Pair;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->getSerialNumber()Ljava/lang/String;

    move-result-object v2

    const-string v3, "deviceSerial"

    invoke-direct {v1, v3, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v0}, Lkotlin/collections/MapsKt;->mutableMapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    .line 49
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceCloudServiceImpl;->deviceService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeviceService;

    invoke-interface {v1, p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeviceService;->delete(Ljava/lang/Object;Ljava/util/Map;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public updateDevice(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)Lio/reactivex/Completable;
    .locals 1

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceCloudServiceImpl;->deviceService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeviceService;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeviceService;->update(Ljava/lang/Object;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method
