.class public final Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressFragment$Companion;
.super Ljava/lang/Object;
.source "PairingProgressFragment.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressFragment$Companion;",
        "",
        "()V",
        "DEVICE_INFO_KEY",
        "",
        "newInstance",
        "Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressFragment;",
        "deviceInfo",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;",
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

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressFragment$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final newInstance(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressFragment;
    .locals 3
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "deviceInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressFragment;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressFragment;-><init>()V

    .line 46
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 47
    check-cast p1, Landroid/os/Parcelable;

    const-string v2, "deviceInfoKey"

    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 48
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 46
    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressFragment;->setArguments(Landroid/os/Bundle;)V

    return-object v0
.end method
