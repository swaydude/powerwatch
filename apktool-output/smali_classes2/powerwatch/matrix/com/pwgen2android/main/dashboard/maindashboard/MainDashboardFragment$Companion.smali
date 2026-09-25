.class public final Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardFragment$Companion;
.super Ljava/lang/Object;
.source "MainDashboardFragment.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\u0005\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardFragment$Companion;",
        "",
        "()V",
        "MAIN_SCROLL_POSITION",
        "",
        "newInstance",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardFragment;",
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

    .line 235
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardFragment$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final newInstance()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardFragment;
    .locals 3
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 240
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardFragment;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardFragment;-><init>()V

    .line 241
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 243
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 241
    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardFragment;->setArguments(Landroid/os/Bundle;)V

    return-object v0
.end method
