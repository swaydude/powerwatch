.class public final Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;
.super Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;
.source "NotificationSettingsVM.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\u0008\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u001f2\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\u0010\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u0006H\u0016J\u0006\u0010#\u001a\u00020\u001fR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0014R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0019\u001a\u0010\u0012\u000c\u0012\n \u001b*\u0004\u0018\u00010\u00040\u00040\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u0014\u00a8\u0006$"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;",
        "Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "fragmentManager",
        "Landroidx/fragment/app/FragmentManager;",
        "activityContext",
        "Landroid/content/Context;",
        "deviceRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;",
        "batteryNotificationPersistence",
        "Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationPersistence;",
        "goalsNotificationPersistence",
        "Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;",
        "connectionNotificationPersistence",
        "Lpowerwatch/matrix/com/pwgen2android/main/notification/ConnectionNotificationPersistence;",
        "(Landroidx/fragment/app/FragmentManager;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationPersistence;Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;Lpowerwatch/matrix/com/pwgen2android/main/notification/ConnectionNotificationPersistence;)V",
        "batteryNotificationStatus",
        "Landroidx/databinding/ObservableField;",
        "",
        "getBatteryNotificationStatus",
        "()Landroidx/databinding/ObservableField;",
        "connectionNotificationStatus",
        "getConnectionNotificationStatus",
        "deviceId",
        "",
        "fragmentManagerWeakReference",
        "Ljava/lang/ref/WeakReference;",
        "kotlin.jvm.PlatformType",
        "goalsNotificationStatus",
        "getGoalsNotificationStatus",
        "onBackClicked",
        "",
        "onCreate",
        "onDestroy",
        "context",
        "onSaveClicked",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field private final batteryNotificationPersistence:Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationPersistence;

.field private final batteryNotificationStatus:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final connectionNotificationPersistence:Lpowerwatch/matrix/com/pwgen2android/main/notification/ConnectionNotificationPersistence;

.field private final connectionNotificationStatus:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private deviceId:Ljava/lang/String;

.field private final deviceRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;

.field private final fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroidx/fragment/app/FragmentManager;",
            ">;"
        }
    .end annotation
.end field

.field private final goalsNotificationPersistence:Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;

.field private final goalsNotificationStatus:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/fragment/app/FragmentManager;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationPersistence;Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;Lpowerwatch/matrix/com/pwgen2android/main/notification/ConnectionNotificationPersistence;)V
    .locals 2

    const-string v0, "fragmentManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activityContext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceRepository"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "batteryNotificationPersistence"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "goalsNotificationPersistence"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connectionNotificationPersistence"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    .line 24
    invoke-direct {p0, p2, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;-><init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 21
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;->deviceRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;

    .line 22
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;->batteryNotificationPersistence:Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationPersistence;

    .line 23
    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;->goalsNotificationPersistence:Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;

    .line 24
    iput-object p6, p0, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;->connectionNotificationPersistence:Lpowerwatch/matrix/com/pwgen2android/main/notification/ConnectionNotificationPersistence;

    .line 26
    new-instance p2, Ljava/lang/ref/WeakReference;

    invoke-direct {p2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;->fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

    .line 27
    new-instance p1, Landroidx/databinding/ObservableField;

    const/4 p2, 0x0

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;->connectionNotificationStatus:Landroidx/databinding/ObservableField;

    .line 28
    new-instance p1, Landroidx/databinding/ObservableField;

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;->batteryNotificationStatus:Landroidx/databinding/ObservableField;

    .line 29
    new-instance p1, Landroidx/databinding/ObservableField;

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;->goalsNotificationStatus:Landroidx/databinding/ObservableField;

    return-void
.end method


# virtual methods
.method public final getBatteryNotificationStatus()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 28
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;->batteryNotificationStatus:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getConnectionNotificationStatus()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 27
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;->connectionNotificationStatus:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getGoalsNotificationStatus()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 29
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;->goalsNotificationStatus:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 18
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method public onBackClicked()V
    .locals 1

    .line 47
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;->onBackClicked()V

    .line 48
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;->fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/FragmentManager;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->popBackStackAllowingStateLoss(Landroidx/fragment/app/FragmentManager;)V

    :goto_0
    return-void
.end method

.method public final onCreate(Ljava/lang/String;)V
    .locals 2

    .line 35
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;->deviceId:Ljava/lang/String;

    .line 36
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;->connectionNotificationStatus:Landroidx/databinding/ObservableField;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;->connectionNotificationPersistence:Lpowerwatch/matrix/com/pwgen2android/main/notification/ConnectionNotificationPersistence;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v1, p1}, Lpowerwatch/matrix/com/pwgen2android/main/notification/ConnectionNotificationPersistence;->isWatchConnectionNotificationEnabled(Ljava/lang/String;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 37
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;->batteryNotificationStatus:Landroidx/databinding/ObservableField;

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;->batteryNotificationPersistence:Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationPersistence;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;->deviceId:Ljava/lang/String;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationPersistence;->isBatteryNotificationEnabled(Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 38
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;->goalsNotificationStatus:Landroidx/databinding/ObservableField;

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;->goalsNotificationPersistence:Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;->isGoalsNotificationsEnabled()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public onDestroy(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    invoke-super {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;->onDestroy(Landroid/content/Context;)V

    .line 43
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/disposables/CompositeDisposable;->clear()V

    return-void
.end method

.method public final onSaveClicked()V
    .locals 3

    .line 53
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;->connectionNotificationStatus:Landroidx/databinding/ObservableField;

    invoke-virtual {v0}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 54
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;->deviceId:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 55
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;->connectionNotificationPersistence:Lpowerwatch/matrix/com/pwgen2android/main/notification/ConnectionNotificationPersistence;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/main/notification/ConnectionNotificationPersistence;->enableWatchConnectionNotification(ZLjava/lang/String;)V

    .line 57
    :cond_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;->batteryNotificationStatus:Landroidx/databinding/ObservableField;

    invoke-virtual {v0}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 58
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;->deviceId:Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 59
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;->batteryNotificationPersistence:Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationPersistence;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationPersistence;->enableBatteryNotification(ZLjava/lang/String;)V

    .line 61
    :cond_1
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;->goalsNotificationStatus:Landroidx/databinding/ObservableField;

    invoke-virtual {v0}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 62
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;->goalsNotificationPersistence:Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;

    invoke-virtual {v1, v0}, Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;->enableUserGoalsNotification(Z)V

    .line 64
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;->onBackClicked()V

    return-void
.end method
