.class public abstract Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBinding;
.super Landroidx/databinding/ViewDataBinding;
.source "FragmentMainDashboardBinding.java"


# instance fields
.field public final caloriesDayFragment:Landroid/widget/FrameLayout;

.field public final heartRateDayFragment:Landroid/widget/FrameLayout;

.field protected mViewModel:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;
    .annotation runtime Landroidx/databinding/Bindable;
    .end annotation
.end field

.field public final mainScroll:Landroidx/core/widget/NestedScrollView;

.field public final pedometerDayFragment:Landroid/widget/FrameLayout;

.field public final powerDayFragment:Landroid/widget/FrameLayout;

.field public final realTimeFragment:Landroid/widget/FrameLayout;

.field public final refreshLayout:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

.field public final sleepDayFragment:Landroid/widget/FrameLayout;

.field public final syncFragment:Landroid/widget/FrameLayout;

.field public final temperatureDayFragment:Landroid/widget/FrameLayout;

.field public final userActivityFragment:Landroid/widget/FrameLayout;


# direct methods
.method protected constructor <init>(Ljava/lang/Object;Landroid/view/View;ILandroid/widget/FrameLayout;Landroid/widget/FrameLayout;Landroidx/core/widget/NestedScrollView;Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "_bindingComponent",
            "_root",
            "_localFieldCount",
            "caloriesDayFragment",
            "heartRateDayFragment",
            "mainScroll",
            "pedometerDayFragment",
            "powerDayFragment",
            "realTimeFragment",
            "refreshLayout",
            "sleepDayFragment",
            "syncFragment",
            "temperatureDayFragment",
            "userActivityFragment"
        }
    .end annotation

    .line 63
    invoke-direct {p0, p1, p2, p3}, Landroidx/databinding/ViewDataBinding;-><init>(Ljava/lang/Object;Landroid/view/View;I)V

    .line 64
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBinding;->caloriesDayFragment:Landroid/widget/FrameLayout;

    .line 65
    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBinding;->heartRateDayFragment:Landroid/widget/FrameLayout;

    .line 66
    iput-object p6, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBinding;->mainScroll:Landroidx/core/widget/NestedScrollView;

    .line 67
    iput-object p7, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBinding;->pedometerDayFragment:Landroid/widget/FrameLayout;

    .line 68
    iput-object p8, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBinding;->powerDayFragment:Landroid/widget/FrameLayout;

    .line 69
    iput-object p9, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBinding;->realTimeFragment:Landroid/widget/FrameLayout;

    .line 70
    iput-object p10, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBinding;->refreshLayout:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 71
    iput-object p11, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBinding;->sleepDayFragment:Landroid/widget/FrameLayout;

    .line 72
    iput-object p12, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBinding;->syncFragment:Landroid/widget/FrameLayout;

    .line 73
    iput-object p13, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBinding;->temperatureDayFragment:Landroid/widget/FrameLayout;

    .line 74
    iput-object p14, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBinding;->userActivityFragment:Landroid/widget/FrameLayout;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBinding;
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "view"
        }
    .end annotation

    .line 124
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    move-result-object v0

    invoke-static {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBinding;->bind(Landroid/view/View;Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBinding;

    move-result-object p0

    return-object p0
.end method

.method public static bind(Landroid/view/View;Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBinding;
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "view",
            "component"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const v0, 0x7f0b0064

    .line 136
    invoke-static {p1, p0, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBinding;->bind(Ljava/lang/Object;Landroid/view/View;I)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBinding;

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBinding;
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "inflater"
        }
    .end annotation

    .line 106
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    move-result-object v0

    invoke-static {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBinding;->inflate(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBinding;
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "inflater",
            "root",
            "attachToRoot"
        }
    .end annotation

    .line 87
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    move-result-object v0

    invoke-static {p0, p1, p2, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBinding;
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "inflater",
            "root",
            "attachToRoot",
            "component"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const v0, 0x7f0b0064

    .line 101
    invoke-static {p0, v0, p1, p2, p3}, Landroidx/databinding/ViewDataBinding;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBinding;

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBinding;
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "inflater",
            "component"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const v0, 0x7f0b0064

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 120
    invoke-static {p0, v0, v1, v2, p1}, Landroidx/databinding/ViewDataBinding;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBinding;

    return-object p0
.end method


# virtual methods
.method public getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;
    .locals 1

    .line 81
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBinding;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;

    return-object v0
.end method

.method public abstract setViewModel(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "viewModel"
        }
    .end annotation
.end method
