.class public abstract Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBinding;
.super Landroidx/databinding/ViewDataBinding;
.source "FragmentPersonalSettingsBinding.java"


# instance fields
.field public final arrowAge:Landroid/widget/ImageView;

.field public final arrowGender:Landroid/widget/ImageView;

.field public final arrowHeight:Landroid/widget/ImageView;

.field public final arrowSleepTime:Landroid/widget/ImageView;

.field public final arrowWeight:Landroid/widget/ImageView;

.field protected mViewModel:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;
    .annotation runtime Landroidx/databinding/Bindable;
    .end annotation
.end field


# direct methods
.method protected constructor <init>(Ljava/lang/Object;Landroid/view/View;ILandroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;)V
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
            0x0
        }
        names = {
            "_bindingComponent",
            "_root",
            "_localFieldCount",
            "arrowAge",
            "arrowGender",
            "arrowHeight",
            "arrowSleepTime",
            "arrowWeight"
        }
    .end annotation

    .line 40
    invoke-direct {p0, p1, p2, p3}, Landroidx/databinding/ViewDataBinding;-><init>(Ljava/lang/Object;Landroid/view/View;I)V

    .line 41
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBinding;->arrowAge:Landroid/widget/ImageView;

    .line 42
    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBinding;->arrowGender:Landroid/widget/ImageView;

    .line 43
    iput-object p6, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBinding;->arrowHeight:Landroid/widget/ImageView;

    .line 44
    iput-object p7, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBinding;->arrowSleepTime:Landroid/widget/ImageView;

    .line 45
    iput-object p8, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBinding;->arrowWeight:Landroid/widget/ImageView;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBinding;
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "view"
        }
    .end annotation

    .line 95
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    move-result-object v0

    invoke-static {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBinding;->bind(Landroid/view/View;Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBinding;

    move-result-object p0

    return-object p0
.end method

.method public static bind(Landroid/view/View;Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBinding;
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

    const v0, 0x7f0b0071

    .line 108
    invoke-static {p1, p0, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBinding;->bind(Ljava/lang/Object;Landroid/view/View;I)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBinding;

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBinding;
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "inflater"
        }
    .end annotation

    .line 77
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    move-result-object v0

    invoke-static {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBinding;->inflate(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBinding;
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

    .line 58
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    move-result-object v0

    invoke-static {p0, p1, p2, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBinding;
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

    const v0, 0x7f0b0071

    .line 72
    invoke-static {p0, v0, p1, p2, p3}, Landroidx/databinding/ViewDataBinding;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBinding;

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBinding;
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

    const v0, 0x7f0b0071

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 91
    invoke-static {p0, v0, v1, v2, p1}, Landroidx/databinding/ViewDataBinding;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBinding;

    return-object p0
.end method


# virtual methods
.method public getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;
    .locals 1

    .line 52
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBinding;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;

    return-object v0
.end method

.method public abstract setViewModel(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "viewModel"
        }
    .end annotation
.end method
