.class public abstract Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodItemBinding;
.super Landroidx/databinding/ViewDataBinding;
.source "FragmentActivityPeriodItemBinding.java"


# instance fields
.field public final chartFragmentContainer:Landroid/widget/FrameLayout;

.field public final firstHeaderValueText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field public final firstHeaderValueTitle:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field public final fourthHeaderValueText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field public final fourthHeaderValueTitle:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field public final headerLayout:Landroid/widget/LinearLayout;

.field protected mViewModel:Lpowerwatch/matrix/com/pwgen2android/shared/ui/activityPeriods/BaseDashboardActivityPeriodItemViewModel;
    .annotation runtime Landroidx/databinding/Bindable;
    .end annotation
.end field

.field public final secondHeaderValueText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field public final secondHeaderValueTitle:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field public final thirdHeaderValueText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field public final thirdHeaderValueTitle:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;


# direct methods
.method protected constructor <init>(Ljava/lang/Object;Landroid/view/View;ILandroid/widget/FrameLayout;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;Landroid/widget/LinearLayout;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;)V
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
            0x0
        }
        names = {
            "_bindingComponent",
            "_root",
            "_localFieldCount",
            "chartFragmentContainer",
            "firstHeaderValueText",
            "firstHeaderValueTitle",
            "fourthHeaderValueText",
            "fourthHeaderValueTitle",
            "headerLayout",
            "secondHeaderValueText",
            "secondHeaderValueTitle",
            "thirdHeaderValueText",
            "thirdHeaderValueTitle"
        }
    .end annotation

    .line 61
    invoke-direct {p0, p1, p2, p3}, Landroidx/databinding/ViewDataBinding;-><init>(Ljava/lang/Object;Landroid/view/View;I)V

    .line 62
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodItemBinding;->chartFragmentContainer:Landroid/widget/FrameLayout;

    .line 63
    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodItemBinding;->firstHeaderValueText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 64
    iput-object p6, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodItemBinding;->firstHeaderValueTitle:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 65
    iput-object p7, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodItemBinding;->fourthHeaderValueText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 66
    iput-object p8, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodItemBinding;->fourthHeaderValueTitle:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 67
    iput-object p9, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodItemBinding;->headerLayout:Landroid/widget/LinearLayout;

    .line 68
    iput-object p10, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodItemBinding;->secondHeaderValueText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 69
    iput-object p11, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodItemBinding;->secondHeaderValueTitle:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 70
    iput-object p12, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodItemBinding;->thirdHeaderValueText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 71
    iput-object p13, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodItemBinding;->thirdHeaderValueTitle:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodItemBinding;
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "view"
        }
    .end annotation

    .line 121
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    move-result-object v0

    invoke-static {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodItemBinding;->bind(Landroid/view/View;Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodItemBinding;

    move-result-object p0

    return-object p0
.end method

.method public static bind(Landroid/view/View;Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodItemBinding;
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

    const v0, 0x7f0b0041

    .line 134
    invoke-static {p1, p0, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodItemBinding;->bind(Ljava/lang/Object;Landroid/view/View;I)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodItemBinding;

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodItemBinding;
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "inflater"
        }
    .end annotation

    .line 103
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    move-result-object v0

    invoke-static {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodItemBinding;->inflate(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodItemBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodItemBinding;
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

    .line 84
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    move-result-object v0

    invoke-static {p0, p1, p2, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodItemBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodItemBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodItemBinding;
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

    const v0, 0x7f0b0041

    .line 98
    invoke-static {p0, v0, p1, p2, p3}, Landroidx/databinding/ViewDataBinding;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodItemBinding;

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodItemBinding;
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

    const v0, 0x7f0b0041

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 117
    invoke-static {p0, v0, v1, v2, p1}, Landroidx/databinding/ViewDataBinding;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodItemBinding;

    return-object p0
.end method


# virtual methods
.method public getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/ui/activityPeriods/BaseDashboardActivityPeriodItemViewModel;
    .locals 1

    .line 78
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodItemBinding;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/shared/ui/activityPeriods/BaseDashboardActivityPeriodItemViewModel;

    return-object v0
.end method

.method public abstract setViewModel(Lpowerwatch/matrix/com/pwgen2android/shared/ui/activityPeriods/BaseDashboardActivityPeriodItemViewModel;)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "viewModel"
        }
    .end annotation
.end method
