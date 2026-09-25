.class public abstract Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCalendarBinding;
.super Landroidx/databinding/ViewDataBinding;
.source "FragmentCalendarBinding.java"


# instance fields
.field public final calendarView:Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;

.field public final dayFive:Landroid/widget/Button;

.field public final dayFour:Landroid/widget/Button;

.field public final dayOne:Landroid/widget/Button;

.field public final daySeven:Landroid/widget/Button;

.field public final daySix:Landroid/widget/Button;

.field public final dayThree:Landroid/widget/Button;

.field public final dayTwo:Landroid/widget/Button;

.field protected mViewModel:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;
    .annotation runtime Landroidx/databinding/Bindable;
    .end annotation
.end field


# direct methods
.method protected constructor <init>(Ljava/lang/Object;Landroid/view/View;ILpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/Button;)V
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
            0x0
        }
        names = {
            "_bindingComponent",
            "_root",
            "_localFieldCount",
            "calendarView",
            "dayFive",
            "dayFour",
            "dayOne",
            "daySeven",
            "daySix",
            "dayThree",
            "dayTwo"
        }
    .end annotation

    .line 50
    invoke-direct {p0, p1, p2, p3}, Landroidx/databinding/ViewDataBinding;-><init>(Ljava/lang/Object;Landroid/view/View;I)V

    .line 51
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCalendarBinding;->calendarView:Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;

    .line 52
    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCalendarBinding;->dayFive:Landroid/widget/Button;

    .line 53
    iput-object p6, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCalendarBinding;->dayFour:Landroid/widget/Button;

    .line 54
    iput-object p7, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCalendarBinding;->dayOne:Landroid/widget/Button;

    .line 55
    iput-object p8, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCalendarBinding;->daySeven:Landroid/widget/Button;

    .line 56
    iput-object p9, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCalendarBinding;->daySix:Landroid/widget/Button;

    .line 57
    iput-object p10, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCalendarBinding;->dayThree:Landroid/widget/Button;

    .line 58
    iput-object p11, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCalendarBinding;->dayTwo:Landroid/widget/Button;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCalendarBinding;
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "view"
        }
    .end annotation

    .line 108
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    move-result-object v0

    invoke-static {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCalendarBinding;->bind(Landroid/view/View;Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCalendarBinding;

    move-result-object p0

    return-object p0
.end method

.method public static bind(Landroid/view/View;Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCalendarBinding;
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

    const v0, 0x7f0b0046

    .line 120
    invoke-static {p1, p0, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCalendarBinding;->bind(Ljava/lang/Object;Landroid/view/View;I)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCalendarBinding;

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCalendarBinding;
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "inflater"
        }
    .end annotation

    .line 90
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    move-result-object v0

    invoke-static {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCalendarBinding;->inflate(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCalendarBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCalendarBinding;
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

    .line 71
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    move-result-object v0

    invoke-static {p0, p1, p2, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCalendarBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCalendarBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCalendarBinding;
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

    const v0, 0x7f0b0046

    .line 85
    invoke-static {p0, v0, p1, p2, p3}, Landroidx/databinding/ViewDataBinding;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCalendarBinding;

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCalendarBinding;
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

    const v0, 0x7f0b0046

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 104
    invoke-static {p0, v0, v1, v2, p1}, Landroidx/databinding/ViewDataBinding;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCalendarBinding;

    return-object p0
.end method


# virtual methods
.method public getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;
    .locals 1

    .line 65
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCalendarBinding;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;

    return-object v0
.end method

.method public abstract setViewModel(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "viewModel"
        }
    .end annotation
.end method
