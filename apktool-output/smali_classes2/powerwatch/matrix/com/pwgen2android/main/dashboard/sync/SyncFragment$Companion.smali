.class public final Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncFragment$Companion;
.super Ljava/lang/Object;
.source "SyncFragment.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\u0003\u001a\u00020\u0004H\u0007\u00a8\u0006\u0005"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncFragment$Companion;",
        "",
        "()V",
        "newInstance",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncFragment;",
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

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncFragment$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final newInstance()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncFragment;
    .locals 3
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 30
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncFragment;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncFragment;-><init>()V

    .line 31
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 33
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 31
    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncFragment;->setArguments(Landroid/os/Bundle;)V

    return-object v0
.end method
