.class public final Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment$Companion;
.super Ljava/lang/Object;
.source "FirmwareAvailableFragment.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment$Companion;",
        "",
        "()V",
        "DEVICE_DATA",
        "",
        "UPDATE_AVAILABLE",
        "VERSION_FIELD",
        "newInstance",
        "Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment;",
        "version",
        "Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;",
        "deviceInfo",
        "Lpowerwatch/matrix/com/pwgen2android/main/update/DeviceUpdateData;",
        "updateAvailable",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final newInstance(Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Lpowerwatch/matrix/com/pwgen2android/main/update/DeviceUpdateData;Z)Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment;
    .locals 3
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "version"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceInfo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment;-><init>()V

    .line 81
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 82
    check-cast p1, Ljava/io/Serializable;

    const-string v2, "firmware_version"

    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 83
    check-cast p2, Ljava/io/Serializable;

    const-string p1, "device_data"

    invoke-virtual {v1, p1, p2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    const-string p1, "update_available"

    .line 84
    invoke-virtual {v1, p1, p3}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 85
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 81
    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment;->setArguments(Landroid/os/Bundle;)V

    return-object v0
.end method
