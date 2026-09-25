.class public final Lpowerwatch/matrix/com/pwgen2android/main/update/UpdateAvailableData;
.super Ljava/lang/Object;
.source "FirmwareAvailableFragment.kt"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/update/UpdateAvailableData;",
        "Ljava/io/Serializable;",
        "version",
        "Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;",
        "deviceInfo",
        "Lpowerwatch/matrix/com/pwgen2android/main/update/DeviceUpdateData;",
        "updateAvailable",
        "",
        "(Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Lpowerwatch/matrix/com/pwgen2android/main/update/DeviceUpdateData;Z)V",
        "getDeviceInfo",
        "()Lpowerwatch/matrix/com/pwgen2android/main/update/DeviceUpdateData;",
        "getUpdateAvailable",
        "()Z",
        "getVersion",
        "()Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;",
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
.field private final deviceInfo:Lpowerwatch/matrix/com/pwgen2android/main/update/DeviceUpdateData;

.field private final updateAvailable:Z

.field private final version:Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Lpowerwatch/matrix/com/pwgen2android/main/update/DeviceUpdateData;Z)V
    .locals 1

    const-string v0, "version"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceInfo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 105
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/UpdateAvailableData;->version:Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/UpdateAvailableData;->deviceInfo:Lpowerwatch/matrix/com/pwgen2android/main/update/DeviceUpdateData;

    iput-boolean p3, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/UpdateAvailableData;->updateAvailable:Z

    return-void
.end method


# virtual methods
.method public final getDeviceInfo()Lpowerwatch/matrix/com/pwgen2android/main/update/DeviceUpdateData;
    .locals 1

    .line 105
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/UpdateAvailableData;->deviceInfo:Lpowerwatch/matrix/com/pwgen2android/main/update/DeviceUpdateData;

    return-object v0
.end method

.method public final getUpdateAvailable()Z
    .locals 1

    .line 105
    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/UpdateAvailableData;->updateAvailable:Z

    return v0
.end method

.method public final getVersion()Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;
    .locals 1

    .line 105
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/UpdateAvailableData;->version:Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;

    return-object v0
.end method
