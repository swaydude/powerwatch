.class public final Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsFragment$Companion;
.super Ljava/lang/Object;
.source "NotificationSettingsFragment.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0008"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsFragment$Companion;",
        "",
        "()V",
        "DEVICE_KEY",
        "",
        "newInstance",
        "Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsFragment;",
        "pairedDeviceId",
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

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsFragment$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final newInstance(Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsFragment;
    .locals 3

    .line 61
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsFragment;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsFragment;-><init>()V

    .line 62
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "device_key"

    .line 63
    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 62
    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsFragment;->setArguments(Landroid/os/Bundle;)V

    return-object v0
.end method
