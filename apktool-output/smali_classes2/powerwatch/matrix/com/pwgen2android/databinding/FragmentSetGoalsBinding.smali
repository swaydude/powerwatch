.class public abstract Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBinding;
.super Landroidx/databinding/ViewDataBinding;
.source "FragmentSetGoalsBinding.java"


# instance fields
.field public final caloriesEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

.field public final caloriesTitle:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field public final distanceEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

.field public final distanceTitle:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field protected mViewModel:Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;
    .annotation runtime Landroidx/databinding/Bindable;
    .end annotation
.end field

.field public final mainView:Landroid/widget/LinearLayout;

.field public final sleepEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

.field public final sleepTitle:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field public final stepsEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

.field public final stepsTitle:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;


# direct methods
.method protected constructor <init>(Ljava/lang/Object;Landroid/view/View;ILpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;Landroid/widget/LinearLayout;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;)V
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
            0x0
        }
        names = {
            "_bindingComponent",
            "_root",
            "_localFieldCount",
            "caloriesEditText",
            "caloriesTitle",
            "distanceEditText",
            "distanceTitle",
            "mainView",
            "sleepEditText",
            "sleepTitle",
            "stepsEditText",
            "stepsTitle"
        }
    .end annotation

    .line 56
    invoke-direct {p0, p1, p2, p3}, Landroidx/databinding/ViewDataBinding;-><init>(Ljava/lang/Object;Landroid/view/View;I)V

    .line 57
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBinding;->caloriesEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    .line 58
    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBinding;->caloriesTitle:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 59
    iput-object p6, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBinding;->distanceEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    .line 60
    iput-object p7, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBinding;->distanceTitle:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 61
    iput-object p8, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBinding;->mainView:Landroid/widget/LinearLayout;

    .line 62
    iput-object p9, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBinding;->sleepEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    .line 63
    iput-object p10, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBinding;->sleepTitle:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 64
    iput-object p11, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBinding;->stepsEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    .line 65
    iput-object p12, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBinding;->stepsTitle:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBinding;
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "view"
        }
    .end annotation

    .line 115
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    move-result-object v0

    invoke-static {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBinding;->bind(Landroid/view/View;Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBinding;

    move-result-object p0

    return-object p0
.end method

.method public static bind(Landroid/view/View;Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBinding;
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

    const v0, 0x7f0b0076

    .line 127
    invoke-static {p1, p0, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBinding;->bind(Ljava/lang/Object;Landroid/view/View;I)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBinding;

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBinding;
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "inflater"
        }
    .end annotation

    .line 97
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    move-result-object v0

    invoke-static {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBinding;->inflate(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBinding;
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

    .line 78
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    move-result-object v0

    invoke-static {p0, p1, p2, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBinding;
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

    const v0, 0x7f0b0076

    .line 92
    invoke-static {p0, v0, p1, p2, p3}, Landroidx/databinding/ViewDataBinding;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBinding;

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBinding;
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

    const v0, 0x7f0b0076

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 111
    invoke-static {p0, v0, v1, v2, p1}, Landroidx/databinding/ViewDataBinding;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBinding;

    return-object p0
.end method


# virtual methods
.method public getViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;
    .locals 1

    .line 72
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBinding;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;

    return-object v0
.end method

.method public abstract setViewModel(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "viewModel"
        }
    .end annotation
.end method
