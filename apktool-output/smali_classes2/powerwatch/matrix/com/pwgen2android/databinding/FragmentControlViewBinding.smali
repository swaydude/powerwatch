.class public abstract Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBinding;
.super Landroidx/databinding/ViewDataBinding;
.source "FragmentControlViewBinding.java"


# instance fields
.field protected mViewModel:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/control/ControlViewViewModel;
    .annotation runtime Landroidx/databinding/Bindable;
    .end annotation
.end field

.field public final playButton:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;


# direct methods
.method protected constructor <init>(Ljava/lang/Object;Landroid/view/View;ILcom/google/android/material/floatingactionbutton/FloatingActionButton;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "_bindingComponent",
            "_root",
            "_localFieldCount",
            "playButton"
        }
    .end annotation

    .line 27
    invoke-direct {p0, p1, p2, p3}, Landroidx/databinding/ViewDataBinding;-><init>(Ljava/lang/Object;Landroid/view/View;I)V

    .line 28
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBinding;->playButton:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBinding;
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "view"
        }
    .end annotation

    .line 78
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    move-result-object v0

    invoke-static {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBinding;->bind(Landroid/view/View;Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBinding;

    move-result-object p0

    return-object p0
.end method

.method public static bind(Landroid/view/View;Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBinding;
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

    const v0, 0x7f0b004f

    .line 90
    invoke-static {p1, p0, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBinding;->bind(Ljava/lang/Object;Landroid/view/View;I)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBinding;

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBinding;
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "inflater"
        }
    .end annotation

    .line 60
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    move-result-object v0

    invoke-static {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBinding;->inflate(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBinding;
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

    .line 41
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    move-result-object v0

    invoke-static {p0, p1, p2, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBinding;
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

    const v0, 0x7f0b004f

    .line 55
    invoke-static {p0, v0, p1, p2, p3}, Landroidx/databinding/ViewDataBinding;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBinding;

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBinding;
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

    const v0, 0x7f0b004f

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 74
    invoke-static {p0, v0, v1, v2, p1}, Landroidx/databinding/ViewDataBinding;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBinding;

    return-object p0
.end method


# virtual methods
.method public getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/control/ControlViewViewModel;
    .locals 1

    .line 35
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBinding;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/control/ControlViewViewModel;

    return-object v0
.end method

.method public abstract setViewModel(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/control/ControlViewViewModel;)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "viewModel"
        }
    .end annotation
.end method
