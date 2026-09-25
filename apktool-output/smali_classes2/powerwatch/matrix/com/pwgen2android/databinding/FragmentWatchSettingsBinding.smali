.class public abstract Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchSettingsBinding;
.super Landroidx/databinding/ViewDataBinding;
.source "FragmentWatchSettingsBinding.java"


# instance fields
.field public final arrowAlarmSet:Landroid/widget/ImageView;

.field public final arrowAlertSet:Landroid/widget/ImageView;

.field public final arrowBacklight:Landroid/widget/ImageView;

.field public final arrowBacklightDuration:Landroid/widget/ImageView;

.field public final arrowBleAlert:Landroid/widget/ImageView;

.field public final arrowClock:Landroid/widget/ImageView;

.field public final arrowDnd:Landroid/widget/ImageView;

.field public final arrowGps:Landroid/widget/ImageView;

.field public final arrowHomeScreen:Landroid/widget/ImageView;

.field public final arrowLanguage:Landroid/widget/ImageView;

.field public final arrowPopupDuration:Landroid/widget/ImageView;

.field public final arrowRingtoneAlert:Landroid/widget/ImageView;

.field public final arrowTimerSet:Landroid/widget/ImageView;

.field public final arrowUnits:Landroid/widget/ImageView;

.field protected mViewModel:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;
    .annotation runtime Landroidx/databinding/Bindable;
    .end annotation
.end field


# direct methods
.method protected constructor <init>(Ljava/lang/Object;Landroid/view/View;ILandroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;)V
    .locals 2
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
            "arrowAlarmSet",
            "arrowAlertSet",
            "arrowBacklight",
            "arrowBacklightDuration",
            "arrowBleAlert",
            "arrowClock",
            "arrowDnd",
            "arrowGps",
            "arrowHomeScreen",
            "arrowLanguage",
            "arrowPopupDuration",
            "arrowRingtoneAlert",
            "arrowTimerSet",
            "arrowUnits"
        }
    .end annotation

    move-object v0, p0

    .line 70
    invoke-direct {p0, p1, p2, p3}, Landroidx/databinding/ViewDataBinding;-><init>(Ljava/lang/Object;Landroid/view/View;I)V

    move-object v1, p4

    .line 71
    iput-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchSettingsBinding;->arrowAlarmSet:Landroid/widget/ImageView;

    move-object v1, p5

    .line 72
    iput-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchSettingsBinding;->arrowAlertSet:Landroid/widget/ImageView;

    move-object v1, p6

    .line 73
    iput-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchSettingsBinding;->arrowBacklight:Landroid/widget/ImageView;

    move-object v1, p7

    .line 74
    iput-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchSettingsBinding;->arrowBacklightDuration:Landroid/widget/ImageView;

    move-object v1, p8

    .line 75
    iput-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchSettingsBinding;->arrowBleAlert:Landroid/widget/ImageView;

    move-object v1, p9

    .line 76
    iput-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchSettingsBinding;->arrowClock:Landroid/widget/ImageView;

    move-object v1, p10

    .line 77
    iput-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchSettingsBinding;->arrowDnd:Landroid/widget/ImageView;

    move-object v1, p11

    .line 78
    iput-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchSettingsBinding;->arrowGps:Landroid/widget/ImageView;

    move-object v1, p12

    .line 79
    iput-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchSettingsBinding;->arrowHomeScreen:Landroid/widget/ImageView;

    move-object v1, p13

    .line 80
    iput-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchSettingsBinding;->arrowLanguage:Landroid/widget/ImageView;

    move-object/from16 v1, p14

    .line 81
    iput-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchSettingsBinding;->arrowPopupDuration:Landroid/widget/ImageView;

    move-object/from16 v1, p15

    .line 82
    iput-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchSettingsBinding;->arrowRingtoneAlert:Landroid/widget/ImageView;

    move-object/from16 v1, p16

    .line 83
    iput-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchSettingsBinding;->arrowTimerSet:Landroid/widget/ImageView;

    move-object/from16 v1, p17

    .line 84
    iput-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchSettingsBinding;->arrowUnits:Landroid/widget/ImageView;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchSettingsBinding;
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "view"
        }
    .end annotation

    .line 134
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    move-result-object v0

    invoke-static {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchSettingsBinding;->bind(Landroid/view/View;Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchSettingsBinding;

    move-result-object p0

    return-object p0
.end method

.method public static bind(Landroid/view/View;Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchSettingsBinding;
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

    const v0, 0x7f0b0085

    .line 146
    invoke-static {p1, p0, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchSettingsBinding;->bind(Ljava/lang/Object;Landroid/view/View;I)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchSettingsBinding;

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchSettingsBinding;
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "inflater"
        }
    .end annotation

    .line 116
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    move-result-object v0

    invoke-static {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchSettingsBinding;->inflate(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchSettingsBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchSettingsBinding;
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

    .line 97
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    move-result-object v0

    invoke-static {p0, p1, p2, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchSettingsBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchSettingsBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchSettingsBinding;
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

    const v0, 0x7f0b0085

    .line 111
    invoke-static {p0, v0, p1, p2, p3}, Landroidx/databinding/ViewDataBinding;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchSettingsBinding;

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchSettingsBinding;
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

    const v0, 0x7f0b0085

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 130
    invoke-static {p0, v0, v1, v2, p1}, Landroidx/databinding/ViewDataBinding;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchSettingsBinding;

    return-object p0
.end method


# virtual methods
.method public getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;
    .locals 1

    .line 91
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchSettingsBinding;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;

    return-object v0
.end method

.method public abstract setViewModel(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "viewModel"
        }
    .end annotation
.end method
