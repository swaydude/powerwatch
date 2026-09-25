.class public abstract Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBinding;
.super Landroidx/databinding/ViewDataBinding;
.source "FragmentWatchAlarmBinding.java"


# instance fields
.field public final activationLayout:Landroid/widget/LinearLayout;

.field public final amPmPicker:Lcom/super_rabbit/wheel_picker/WheelPicker;

.field public final arrowActivationSet:Landroid/widget/ImageView;

.field public final arrowAlarmSet:Landroid/widget/ImageView;

.field public final hourPicker:Lcom/super_rabbit/wheel_picker/WheelPicker;

.field protected mViewModel:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;
    .annotation runtime Landroidx/databinding/Bindable;
    .end annotation
.end field

.field public final minutePicker:Lcom/super_rabbit/wheel_picker/WheelPicker;

.field public final oldAlarmActivationMode:Landroid/widget/TextView;

.field public final oldAlarmLabel:Landroid/widget/TextView;

.field public final oldAlarmRepeatMode:Landroid/widget/TextView;

.field public final previousAlarmLayout:Landroid/widget/LinearLayout;


# direct methods
.method protected constructor <init>(Ljava/lang/Object;Landroid/view/View;ILandroid/widget/LinearLayout;Lcom/super_rabbit/wheel_picker/WheelPicker;Landroid/widget/ImageView;Landroid/widget/ImageView;Lcom/super_rabbit/wheel_picker/WheelPicker;Lcom/super_rabbit/wheel_picker/WheelPicker;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/LinearLayout;)V
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
            "activationLayout",
            "amPmPicker",
            "arrowActivationSet",
            "arrowAlarmSet",
            "hourPicker",
            "minutePicker",
            "oldAlarmActivationMode",
            "oldAlarmLabel",
            "oldAlarmRepeatMode",
            "previousAlarmLayout"
        }
    .end annotation

    .line 60
    invoke-direct {p0, p1, p2, p3}, Landroidx/databinding/ViewDataBinding;-><init>(Ljava/lang/Object;Landroid/view/View;I)V

    .line 61
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBinding;->activationLayout:Landroid/widget/LinearLayout;

    .line 62
    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBinding;->amPmPicker:Lcom/super_rabbit/wheel_picker/WheelPicker;

    .line 63
    iput-object p6, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBinding;->arrowActivationSet:Landroid/widget/ImageView;

    .line 64
    iput-object p7, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBinding;->arrowAlarmSet:Landroid/widget/ImageView;

    .line 65
    iput-object p8, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBinding;->hourPicker:Lcom/super_rabbit/wheel_picker/WheelPicker;

    .line 66
    iput-object p9, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBinding;->minutePicker:Lcom/super_rabbit/wheel_picker/WheelPicker;

    .line 67
    iput-object p10, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBinding;->oldAlarmActivationMode:Landroid/widget/TextView;

    .line 68
    iput-object p11, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBinding;->oldAlarmLabel:Landroid/widget/TextView;

    .line 69
    iput-object p12, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBinding;->oldAlarmRepeatMode:Landroid/widget/TextView;

    .line 70
    iput-object p13, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBinding;->previousAlarmLayout:Landroid/widget/LinearLayout;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBinding;
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "view"
        }
    .end annotation

    .line 120
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    move-result-object v0

    invoke-static {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBinding;->bind(Landroid/view/View;Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBinding;

    move-result-object p0

    return-object p0
.end method

.method public static bind(Landroid/view/View;Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBinding;
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

    const v0, 0x7f0b0082

    .line 132
    invoke-static {p1, p0, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBinding;->bind(Ljava/lang/Object;Landroid/view/View;I)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBinding;

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBinding;
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "inflater"
        }
    .end annotation

    .line 102
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    move-result-object v0

    invoke-static {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBinding;->inflate(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBinding;
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

    .line 83
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    move-result-object v0

    invoke-static {p0, p1, p2, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBinding;
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

    const v0, 0x7f0b0082

    .line 97
    invoke-static {p0, v0, p1, p2, p3}, Landroidx/databinding/ViewDataBinding;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBinding;

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBinding;
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

    const v0, 0x7f0b0082

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 116
    invoke-static {p0, v0, v1, v2, p1}, Landroidx/databinding/ViewDataBinding;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBinding;

    return-object p0
.end method


# virtual methods
.method public getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;
    .locals 1

    .line 77
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBinding;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;

    return-object v0
.end method

.method public abstract setViewModel(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "viewModel"
        }
    .end annotation
.end method
