.class public interface abstract Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceCloudService;
.super Ljava/lang/Object;
.source "DeviceCloudService.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&J\u0016\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0007\u001a\u00020\u0008H&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005H&J\u0010\u0010\u000c\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005H&J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005H&\u00a8\u0006\u000e"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceCloudService;",
        "",
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


# virtual methods
.method public abstract allDevices()Lio/reactivex/Single;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Single<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract getDevice(Ljava/lang/String;)Lio/reactivex/Single;
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
.end method

.method public abstract registerDevice(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)Lio/reactivex/Completable;
.end method

.method public abstract removeDevice(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)Lio/reactivex/Completable;
.end method

.method public abstract updateDevice(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)Lio/reactivex/Completable;
.end method
