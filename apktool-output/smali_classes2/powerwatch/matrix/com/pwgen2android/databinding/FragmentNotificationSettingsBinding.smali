.class public abstract Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBinding;
.super Landroidx/databinding/ViewDataBinding;
.source "FragmentNotificationSettingsBinding.java"


# instance fields
.field public final batteryNotification:Landroidx/appcompat/widget/SwitchCompat;

.field public final connectionNotification:Landroidx/appcompat/widget/SwitchCompat;

.field public final goalsNotifications:Landroidx/appcompat/widget/SwitchCompat;

.field protected mViewModel:Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;
    .annotation runtime Landroidx/databinding/Bindable;
    .end annotation
.end field


# direct methods
.method protected constructor <init>(Ljava/lang/Object;Landroid/view/View;ILandroidx/appcompat/widget/SwitchCompat;Landroidx/appcompat/widget/SwitchCompat;Landroidx/appcompat/widget/SwitchCompat;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
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
            "batteryNotification",
            "connectionNotification",
            "goalsNotifications"
        }
    .end annotation

    .line 34
    invoke-direct {p0, p1, p2, p3}, Landroidx/databinding/ViewDataBinding;-><init>(Ljava/lang/Object;Landroid/view/View;I)V

    .line 35
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBinding;->batteryNotification:Landroidx/appcompat/widget/SwitchCompat;

    .line 36
    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBinding;->connectionNotification:Landroidx/appcompat/widget/SwitchCompat;

    .line 37
    iput-object p6, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBinding;->goalsNotifications:Landroidx/appcompat/widget/SwitchCompat;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBinding;
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "view"
        }
    .end annotation

    .line 87
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    move-result-object v0

    invoke-static {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBinding;->bind(Landroid/view/View;Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBinding;

    move-result-object p0

    return-object p0
.end method

.method public static bind(Landroid/view/View;Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBinding;
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

    const v0, 0x7f0b0069

    .line 100
    invoke-static {p1, p0, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBinding;->bind(Ljava/lang/Object;Landroid/view/View;I)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBinding;

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBinding;
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "inflater"
        }
    .end annotation

    .line 69
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    move-result-object v0

    invoke-static {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBinding;->inflate(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBinding;
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

    .line 50
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    move-result-object v0

    invoke-static {p0, p1, p2, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBinding;
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

    const v0, 0x7f0b0069

    .line 64
    invoke-static {p0, v0, p1, p2, p3}, Landroidx/databinding/ViewDataBinding;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBinding;

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBinding;
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

    const v0, 0x7f0b0069

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 83
    invoke-static {p0, v0, v1, v2, p1}, Landroidx/databinding/ViewDataBinding;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBinding;

    return-object p0
.end method


# virtual methods
.method public getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;
    .locals 1

    .line 44
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBinding;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;

    return-object v0
.end method

.method public abstract setViewModel(Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "viewModel"
        }
    .end annotation
.end method
