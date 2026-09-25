.class public final Lpowerwatch/matrix/com/pwgen2android/main/dashboard/DashboardContainerViewModel;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
.source "DasboardContainerViewModel.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/DashboardContainerViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;",
        "activity",
        "Landroid/app/Activity;",
        "fragmentManager",
        "Landroidx/fragment/app/FragmentManager;",
        "selectDate",
        "Lpowerwatch/matrix/com/pwgen2android/shared/SelectDate;",
        "(Landroid/app/Activity;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/shared/SelectDate;)V",
        "onDestroy",
        "",
        "context",
        "Landroid/content/Context;",
        "onResume",
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
.field private final selectDate:Lpowerwatch/matrix/com/pwgen2android/shared/SelectDate;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/shared/SelectDate;)V
    .locals 7

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "fragmentManager"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "selectDate"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    const/4 v0, 0x3

    .line 15
    invoke-direct {p0, p1, p1, v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;-><init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/DashboardContainerViewModel;->selectDate:Lpowerwatch/matrix/com/pwgen2android/shared/SelectDate;

    .line 19
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardFragment$Companion;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardFragment;

    move-result-object p1

    .line 21
    move-object v1, p1

    check-cast v1, Landroidx/fragment/app/Fragment;

    const v2, 0x7f0800db

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/16 v5, 0x8

    const/4 v6, 0x0

    move-object v0, p2

    invoke-static/range {v0 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment$default(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;ILjava/lang/Object;)V

    return-void
.end method

.method public static synthetic lambda$VL2BUgsoCkPoufvgs6ZpZKF43mI(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/DashboardContainerViewModel;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/DashboardContainerViewModel;->onDestroy$lambda-0(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/DashboardContainerViewModel;)V

    return-void
.end method

.method private static final onDestroy$lambda-0(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/DashboardContainerViewModel;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/DashboardContainerViewModel;->selectDate:Lpowerwatch/matrix/com/pwgen2android/shared/SelectDate;

    invoke-interface {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/SelectDate;->reset()V

    return-void
.end method


# virtual methods
.method public onDestroy(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    invoke-super {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;->onDestroy(Landroid/content/Context;)V

    .line 26
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/-$$Lambda$DashboardContainerViewModel$VL2BUgsoCkPoufvgs6ZpZKF43mI;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/-$$Lambda$DashboardContainerViewModel$VL2BUgsoCkPoufvgs6ZpZKF43mI;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/DashboardContainerViewModel;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public onResume(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    invoke-super {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;->onResume(Landroid/content/Context;)V

    .line 33
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/DashboardContainerViewModel;->selectDate:Lpowerwatch/matrix/com/pwgen2android/shared/SelectDate;

    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/SelectDate;->update()V

    return-void
.end method
