.class public abstract Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBinding;
.super Landroidx/databinding/ViewDataBinding;
.source "FragmentCreateAccountBinding.java"


# instance fields
.field public final biometricsContainer:Landroid/widget/FrameLayout;

.field public final createAccount:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableButton;

.field public final emailEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

.field public final loginDetails:Landroid/widget/LinearLayout;

.field protected mViewModel:Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;
    .annotation runtime Landroidx/databinding/Bindable;
    .end annotation
.end field

.field public final nameEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

.field public final passwordConfirmEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

.field public final passwordEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

.field public final termsAndConditionsLayout:Landroid/widget/RelativeLayout;

.field public final termsCheckBox:Landroidx/appcompat/widget/AppCompatCheckBox;


# direct methods
.method protected constructor <init>(Ljava/lang/Object;Landroid/view/View;ILandroid/widget/FrameLayout;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableButton;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;Landroid/widget/LinearLayout;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;Landroid/widget/RelativeLayout;Landroidx/appcompat/widget/AppCompatCheckBox;)V
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
            "biometricsContainer",
            "createAccount",
            "emailEditText",
            "loginDetails",
            "nameEditText",
            "passwordConfirmEditText",
            "passwordEditText",
            "termsAndConditionsLayout",
            "termsCheckBox"
        }
    .end annotation

    .line 59
    invoke-direct {p0, p1, p2, p3}, Landroidx/databinding/ViewDataBinding;-><init>(Ljava/lang/Object;Landroid/view/View;I)V

    .line 60
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBinding;->biometricsContainer:Landroid/widget/FrameLayout;

    .line 61
    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBinding;->createAccount:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableButton;

    .line 62
    iput-object p6, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBinding;->emailEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    .line 63
    iput-object p7, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBinding;->loginDetails:Landroid/widget/LinearLayout;

    .line 64
    iput-object p8, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBinding;->nameEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    .line 65
    iput-object p9, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBinding;->passwordConfirmEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    .line 66
    iput-object p10, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBinding;->passwordEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    .line 67
    iput-object p11, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBinding;->termsAndConditionsLayout:Landroid/widget/RelativeLayout;

    .line 68
    iput-object p12, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBinding;->termsCheckBox:Landroidx/appcompat/widget/AppCompatCheckBox;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBinding;
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "view"
        }
    .end annotation

    .line 118
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    move-result-object v0

    invoke-static {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBinding;->bind(Landroid/view/View;Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBinding;

    move-result-object p0

    return-object p0
.end method

.method public static bind(Landroid/view/View;Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBinding;
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

    const v0, 0x7f0b0050

    .line 130
    invoke-static {p1, p0, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBinding;->bind(Ljava/lang/Object;Landroid/view/View;I)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBinding;

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBinding;
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "inflater"
        }
    .end annotation

    .line 100
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    move-result-object v0

    invoke-static {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBinding;->inflate(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBinding;
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

    .line 81
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    move-result-object v0

    invoke-static {p0, p1, p2, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBinding;
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

    const v0, 0x7f0b0050

    .line 95
    invoke-static {p0, v0, p1, p2, p3}, Landroidx/databinding/ViewDataBinding;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBinding;

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBinding;
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

    const v0, 0x7f0b0050

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 114
    invoke-static {p0, v0, v1, v2, p1}, Landroidx/databinding/ViewDataBinding;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBinding;

    return-object p0
.end method


# virtual methods
.method public getViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;
    .locals 1

    .line 75
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBinding;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;

    return-object v0
.end method

.method public abstract setViewModel(Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "viewModel"
        }
    .end annotation
.end method
