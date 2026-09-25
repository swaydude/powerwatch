.class public abstract Lpowerwatch/matrix/com/pwgen2android/databinding/SecretScreenFragmentBinding;
.super Landroidx/databinding/ViewDataBinding;
.source "SecretScreenFragmentBinding.java"


# instance fields
.field public final calls:Landroid/widget/FrameLayout;

.field public final callsToggle:Landroidx/appcompat/widget/SwitchCompat;

.field public final cloutContent:Landroid/widget/LinearLayout;

.field public final databaseContent:Landroid/widget/LinearLayout;

.field public final loggerContent:Landroid/widget/LinearLayout;

.field protected mViewModel:Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;
    .annotation runtime Landroidx/databinding/Bindable;
    .end annotation
.end field

.field public final radioDev:Landroid/widget/RadioButton;

.field public final radioProd:Landroid/widget/RadioButton;

.field public final setupFragmentContainer:Landroid/widget/LinearLayout;

.field public final watchSettings:Landroid/widget/LinearLayout;


# direct methods
.method protected constructor <init>(Ljava/lang/Object;Landroid/view/View;ILandroid/widget/FrameLayout;Landroidx/appcompat/widget/SwitchCompat;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/RadioButton;Landroid/widget/RadioButton;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;)V
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
            "calls",
            "callsToggle",
            "cloutContent",
            "databaseContent",
            "loggerContent",
            "radioDev",
            "radioProd",
            "setupFragmentContainer",
            "watchSettings"
        }
    .end annotation

    .line 56
    invoke-direct {p0, p1, p2, p3}, Landroidx/databinding/ViewDataBinding;-><init>(Ljava/lang/Object;Landroid/view/View;I)V

    .line 57
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/SecretScreenFragmentBinding;->calls:Landroid/widget/FrameLayout;

    .line 58
    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/SecretScreenFragmentBinding;->callsToggle:Landroidx/appcompat/widget/SwitchCompat;

    .line 59
    iput-object p6, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/SecretScreenFragmentBinding;->cloutContent:Landroid/widget/LinearLayout;

    .line 60
    iput-object p7, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/SecretScreenFragmentBinding;->databaseContent:Landroid/widget/LinearLayout;

    .line 61
    iput-object p8, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/SecretScreenFragmentBinding;->loggerContent:Landroid/widget/LinearLayout;

    .line 62
    iput-object p9, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/SecretScreenFragmentBinding;->radioDev:Landroid/widget/RadioButton;

    .line 63
    iput-object p10, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/SecretScreenFragmentBinding;->radioProd:Landroid/widget/RadioButton;

    .line 64
    iput-object p11, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/SecretScreenFragmentBinding;->setupFragmentContainer:Landroid/widget/LinearLayout;

    .line 65
    iput-object p12, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/SecretScreenFragmentBinding;->watchSettings:Landroid/widget/LinearLayout;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lpowerwatch/matrix/com/pwgen2android/databinding/SecretScreenFragmentBinding;
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

    invoke-static {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/SecretScreenFragmentBinding;->bind(Landroid/view/View;Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/SecretScreenFragmentBinding;

    move-result-object p0

    return-object p0
.end method

.method public static bind(Landroid/view/View;Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/SecretScreenFragmentBinding;
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

    const v0, 0x7f0b00cc

    .line 127
    invoke-static {p1, p0, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/SecretScreenFragmentBinding;->bind(Ljava/lang/Object;Landroid/view/View;I)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/databinding/SecretScreenFragmentBinding;

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;)Lpowerwatch/matrix/com/pwgen2android/databinding/SecretScreenFragmentBinding;
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

    invoke-static {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/SecretScreenFragmentBinding;->inflate(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/SecretScreenFragmentBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lpowerwatch/matrix/com/pwgen2android/databinding/SecretScreenFragmentBinding;
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

    invoke-static {p0, p1, p2, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/SecretScreenFragmentBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/SecretScreenFragmentBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/SecretScreenFragmentBinding;
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

    const v0, 0x7f0b00cc

    .line 92
    invoke-static {p0, v0, p1, p2, p3}, Landroidx/databinding/ViewDataBinding;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/databinding/SecretScreenFragmentBinding;

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/SecretScreenFragmentBinding;
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

    const v0, 0x7f0b00cc

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 111
    invoke-static {p0, v0, v1, v2, p1}, Landroidx/databinding/ViewDataBinding;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/databinding/SecretScreenFragmentBinding;

    return-object p0
.end method


# virtual methods
.method public getViewModel()Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;
    .locals 1

    .line 72
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/SecretScreenFragmentBinding;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;

    return-object v0
.end method

.method public abstract setViewModel(Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "viewModel"
        }
    .end annotation
.end method
