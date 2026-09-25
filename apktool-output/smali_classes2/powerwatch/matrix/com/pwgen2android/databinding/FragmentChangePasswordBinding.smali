.class public abstract Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBinding;
.super Landroidx/databinding/ViewDataBinding;
.source "FragmentChangePasswordBinding.java"


# instance fields
.field public final biometricsContainer:Landroid/widget/FrameLayout;

.field public final createAccount:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableButton;

.field public final loginDetails:Landroid/widget/LinearLayout;

.field protected mViewModel:Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;
    .annotation runtime Landroidx/databinding/Bindable;
    .end annotation
.end field

.field public final mainSyncCircle:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;

.field public final oldPasswordEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

.field public final passwordConfirmEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

.field public final passwordEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;


# direct methods
.method protected constructor <init>(Ljava/lang/Object;Landroid/view/View;ILandroid/widget/FrameLayout;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableButton;Landroid/widget/LinearLayout;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;)V
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
            0x0
        }
        names = {
            "_bindingComponent",
            "_root",
            "_localFieldCount",
            "biometricsContainer",
            "createAccount",
            "loginDetails",
            "mainSyncCircle",
            "oldPasswordEditText",
            "passwordConfirmEditText",
            "passwordEditText"
        }
    .end annotation

    .line 52
    invoke-direct {p0, p1, p2, p3}, Landroidx/databinding/ViewDataBinding;-><init>(Ljava/lang/Object;Landroid/view/View;I)V

    .line 53
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBinding;->biometricsContainer:Landroid/widget/FrameLayout;

    .line 54
    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBinding;->createAccount:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableButton;

    .line 55
    iput-object p6, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBinding;->loginDetails:Landroid/widget/LinearLayout;

    .line 56
    iput-object p7, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBinding;->mainSyncCircle:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;

    .line 57
    iput-object p8, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBinding;->oldPasswordEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    .line 58
    iput-object p9, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBinding;->passwordConfirmEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    .line 59
    iput-object p10, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBinding;->passwordEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBinding;
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "view"
        }
    .end annotation

    .line 109
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    move-result-object v0

    invoke-static {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBinding;->bind(Landroid/view/View;Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBinding;

    move-result-object p0

    return-object p0
.end method

.method public static bind(Landroid/view/View;Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBinding;
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

    const v0, 0x7f0b0048

    .line 121
    invoke-static {p1, p0, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBinding;->bind(Ljava/lang/Object;Landroid/view/View;I)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBinding;

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBinding;
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "inflater"
        }
    .end annotation

    .line 91
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    move-result-object v0

    invoke-static {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBinding;->inflate(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBinding;
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

    .line 72
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    move-result-object v0

    invoke-static {p0, p1, p2, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBinding;
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

    const v0, 0x7f0b0048

    .line 86
    invoke-static {p0, v0, p1, p2, p3}, Landroidx/databinding/ViewDataBinding;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBinding;

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBinding;
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

    const v0, 0x7f0b0048

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 105
    invoke-static {p0, v0, v1, v2, p1}, Landroidx/databinding/ViewDataBinding;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBinding;

    return-object p0
.end method


# virtual methods
.method public getViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;
    .locals 1

    .line 66
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBinding;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;

    return-object v0
.end method

.method public abstract setViewModel(Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "viewModel"
        }
    .end annotation
.end method
