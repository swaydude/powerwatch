.class public abstract Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentTimerSettingsBinding;
.super Landroidx/databinding/ViewDataBinding;
.source "FragmentTimerSettingsBinding.java"


# instance fields
.field public final hourPicker:Lcom/super_rabbit/wheel_picker/WheelPicker;

.field protected mViewModel:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;
    .annotation runtime Landroidx/databinding/Bindable;
    .end annotation
.end field

.field public final minutePicker:Lcom/super_rabbit/wheel_picker/WheelPicker;

.field public final pauseView:Landroid/widget/TextView;

.field public final resetView:Landroid/widget/TextView;

.field public final secondsPicker:Lcom/super_rabbit/wheel_picker/WheelPicker;

.field public final startView:Landroid/widget/TextView;


# direct methods
.method protected constructor <init>(Ljava/lang/Object;Landroid/view/View;ILcom/super_rabbit/wheel_picker/WheelPicker;Lcom/super_rabbit/wheel_picker/WheelPicker;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/super_rabbit/wheel_picker/WheelPicker;Landroid/widget/TextView;)V
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
            0x0
        }
        names = {
            "_bindingComponent",
            "_root",
            "_localFieldCount",
            "hourPicker",
            "minutePicker",
            "pauseView",
            "resetView",
            "secondsPicker",
            "startView"
        }
    .end annotation

    .line 44
    invoke-direct {p0, p1, p2, p3}, Landroidx/databinding/ViewDataBinding;-><init>(Ljava/lang/Object;Landroid/view/View;I)V

    .line 45
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentTimerSettingsBinding;->hourPicker:Lcom/super_rabbit/wheel_picker/WheelPicker;

    .line 46
    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentTimerSettingsBinding;->minutePicker:Lcom/super_rabbit/wheel_picker/WheelPicker;

    .line 47
    iput-object p6, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentTimerSettingsBinding;->pauseView:Landroid/widget/TextView;

    .line 48
    iput-object p7, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentTimerSettingsBinding;->resetView:Landroid/widget/TextView;

    .line 49
    iput-object p8, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentTimerSettingsBinding;->secondsPicker:Lcom/super_rabbit/wheel_picker/WheelPicker;

    .line 50
    iput-object p9, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentTimerSettingsBinding;->startView:Landroid/widget/TextView;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentTimerSettingsBinding;
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "view"
        }
    .end annotation

    .line 100
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    move-result-object v0

    invoke-static {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentTimerSettingsBinding;->bind(Landroid/view/View;Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentTimerSettingsBinding;

    move-result-object p0

    return-object p0
.end method

.method public static bind(Landroid/view/View;Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentTimerSettingsBinding;
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

    const v0, 0x7f0b007e

    .line 112
    invoke-static {p1, p0, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentTimerSettingsBinding;->bind(Ljava/lang/Object;Landroid/view/View;I)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentTimerSettingsBinding;

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentTimerSettingsBinding;
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "inflater"
        }
    .end annotation

    .line 82
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    move-result-object v0

    invoke-static {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentTimerSettingsBinding;->inflate(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentTimerSettingsBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentTimerSettingsBinding;
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

    .line 63
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    move-result-object v0

    invoke-static {p0, p1, p2, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentTimerSettingsBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentTimerSettingsBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentTimerSettingsBinding;
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

    const v0, 0x7f0b007e

    .line 77
    invoke-static {p0, v0, p1, p2, p3}, Landroidx/databinding/ViewDataBinding;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentTimerSettingsBinding;

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentTimerSettingsBinding;
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

    const v0, 0x7f0b007e

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 96
    invoke-static {p0, v0, v1, v2, p1}, Landroidx/databinding/ViewDataBinding;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentTimerSettingsBinding;

    return-object p0
.end method


# virtual methods
.method public getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;
    .locals 1

    .line 57
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentTimerSettingsBinding;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;

    return-object v0
.end method

.method public abstract setViewModel(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "viewModel"
        }
    .end annotation
.end method
