.class public final Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;
.super Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;
.source "NotificationsViewModel.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0010\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u00012\u00020\u0002Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0015\u0012\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0017J\u0008\u0010*\u001a\u00020+H\u0016J\u0010\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\u0004H\u0016J\u0010\u0010.\u001a\u00020+2\u0006\u0010-\u001a\u00020\u0004H\u0016J\u0006\u0010/\u001a\u00020+J\u0010\u00100\u001a\u00020+2\u0006\u0010-\u001a\u00020\u0004H\u0016R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0011\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001c\u001a\u0010\u0012\u000c\u0012\n \u001e*\u0004\u0018\u00010\u00060\u00060\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010 R\u001f\u0010!\u001a\u0010\u0012\u000c\u0012\n \u001e*\u0004\u0018\u00010#0#0\"\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010%R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010&\u001a\u0008\u0012\u0004\u0012\u00020#0\"X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\'\u0010%R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010)\u00a8\u00061"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;",
        "activityContext",
        "Landroid/content/Context;",
        "fragmentManager",
        "Landroidx/fragment/app/FragmentManager;",
        "appContext",
        "alertsStorage",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsStorage;",
        "dialogManager",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManager;",
        "appsResolver",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/OtherAppsResolver;",
        "whiteListResolver",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;",
        "appStorage",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ThirdPartyAppStorage;",
        "notificationTypeController",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;",
        "rxPermissions",
        "Lcom/tbruyelle/rxpermissions2/RxPermissions;",
        "savePreferencesViewModel",
        "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsStorage;Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManager;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/OtherAppsResolver;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ThirdPartyAppStorage;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;Lcom/tbruyelle/rxpermissions2/RxPermissions;Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;)V",
        "getAppStorage",
        "()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ThirdPartyAppStorage;",
        "getAppsResolver",
        "()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/OtherAppsResolver;",
        "fragmentManagerWeakReference",
        "Ljava/lang/ref/WeakReference;",
        "kotlin.jvm.PlatformType",
        "getNotificationTypeController",
        "()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;",
        "refreshView",
        "Landroidx/databinding/ObservableField;",
        "",
        "getRefreshView",
        "()Landroidx/databinding/ObservableField;",
        "showSaveProgress",
        "getShowSaveProgress",
        "getWhiteListResolver",
        "()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;",
        "onBackClicked",
        "",
        "onCreateView",
        "context",
        "onDestroyView",
        "onSaveClicked",
        "onStart",
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
.field private final synthetic $$delegate_0:Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;

.field private final alertsStorage:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsStorage;

.field private final appContext:Landroid/content/Context;

.field private final appStorage:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ThirdPartyAppStorage;

.field private final appsResolver:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/OtherAppsResolver;

.field private final dialogManager:Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManager;

.field private final fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroidx/fragment/app/FragmentManager;",
            ">;"
        }
    .end annotation
.end field

.field private final notificationTypeController:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;

.field private final refreshView:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final rxPermissions:Lcom/tbruyelle/rxpermissions2/RxPermissions;

.field private final whiteListResolver:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsStorage;Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManager;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/OtherAppsResolver;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ThirdPartyAppStorage;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;Lcom/tbruyelle/rxpermissions2/RxPermissions;Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;)V
    .locals 2

    const-string v0, "activityContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fragmentManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appContext"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "alertsStorage"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dialogManager"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appsResolver"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whiteListResolver"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appStorage"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notificationTypeController"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rxPermissions"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "savePreferencesViewModel"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    .line 37
    invoke-direct {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;-><init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 28
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;->appContext:Landroid/content/Context;

    .line 29
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;->alertsStorage:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsStorage;

    .line 30
    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;->dialogManager:Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManager;

    .line 31
    iput-object p6, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;->appsResolver:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/OtherAppsResolver;

    .line 32
    iput-object p7, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;->whiteListResolver:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;

    .line 33
    iput-object p8, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;->appStorage:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ThirdPartyAppStorage;

    .line 34
    iput-object p9, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;->notificationTypeController:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;

    .line 35
    iput-object p10, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;->rxPermissions:Lcom/tbruyelle/rxpermissions2/RxPermissions;

    .line 37
    iput-object p11, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;->$$delegate_0:Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;

    .line 40
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;->fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

    .line 41
    new-instance p1, Landroidx/databinding/ObservableField;

    const/4 p2, 0x0

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;->refreshView:Landroidx/databinding/ObservableField;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsStorage;Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManager;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/OtherAppsResolver;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ThirdPartyAppStorage;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;Lcom/tbruyelle/rxpermissions2/RxPermissions;Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 14

    move/from16 v0, p12

    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_0

    .line 35
    new-instance v1, Lcom/tbruyelle/rxpermissions2/RxPermissions;

    .line 26
    move-object v2, p1

    check-cast v2, Landroidx/fragment/app/FragmentActivity;

    .line 35
    invoke-direct {v1, v2}, Lcom/tbruyelle/rxpermissions2/RxPermissions;-><init>(Landroidx/fragment/app/FragmentActivity;)V

    move-object v12, v1

    goto :goto_0

    :cond_0
    move-object/from16 v12, p10

    :goto_0
    and-int/lit16 v0, v0, 0x400

    if-eqz v0, :cond_1

    .line 36
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModelImpl;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModelImpl;-><init>(Landroidx/databinding/ObservableField;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;

    move-object v13, v0

    goto :goto_1

    :cond_1
    move-object/from16 v13, p11

    :goto_1
    move-object v2, p0

    move-object v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move-object/from16 v11, p9

    .line 26
    invoke-direct/range {v2 .. v13}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;-><init>(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsStorage;Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManager;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/OtherAppsResolver;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ThirdPartyAppStorage;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;Lcom/tbruyelle/rxpermissions2/RxPermissions;Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;)V

    return-void
.end method

.method public static synthetic lambda$7EiF-C4YZ5TAPp9Awin7JFuWRao(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;->onSaveClicked$lambda-4(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$9BUFQVSO1YuFWDOTzm98jm4-GgM(Landroid/content/Context;Ljava/lang/Boolean;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;->onCreateView$lambda-0(Landroid/content/Context;Ljava/lang/Boolean;)V

    return-void
.end method

.method public static synthetic lambda$VTgucUQ-oOJaHJ9bOe4JV-TGhfM(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;->onSaveClicked$lambda-3(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;)V

    return-void
.end method

.method public static synthetic lambda$YSWJKFx_Nji_LAgpYGpZUzLpBqE(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;->onSaveClicked$lambda-2(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$eYZberYgCjwZ_oT3nVECPWVyfQs(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;->onSaveClicked$lambda-1(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;)V

    return-void
.end method

.method private static final onCreateView$lambda-0(Landroid/content/Context;Ljava/lang/Boolean;)V
    .locals 1

    const-string v0, "$context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    .line 55
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 56
    new-instance p1, Landroid/content/Intent;

    const-string v0, "android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS"

    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 58
    :cond_0
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->Companion:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl$Companion;

    invoke-virtual {p1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl$Companion;->userDeclinedGlobalService(Landroid/content/Context;)V

    :goto_0
    return-void
.end method

.method private static final onSaveClicked$lambda-1(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;->getWhiteListResolver()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;

    move-result-object v0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;->flushMemory()V

    .line 110
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;->getAppsResolver()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/OtherAppsResolver;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/OtherAppsResolver;->flushMemory()V

    return-void
.end method

.method private static final onSaveClicked$lambda-2(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;Ljava/lang/Throwable;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 125
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;->getShowSaveProgress()Landroidx/databinding/ObservableField;

    move-result-object p0

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    return-void
.end method

.method private static final onSaveClicked$lambda-3(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 128
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;->onBackClicked()V

    return-void
.end method

.method private static final onSaveClicked$lambda-4(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;Ljava/lang/Throwable;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 128
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;->onBackClicked()V

    return-void
.end method


# virtual methods
.method public final getAppStorage()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ThirdPartyAppStorage;
    .locals 1

    .line 33
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;->appStorage:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ThirdPartyAppStorage;

    return-object v0
.end method

.method public final getAppsResolver()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/OtherAppsResolver;
    .locals 1

    .line 31
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;->appsResolver:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/OtherAppsResolver;

    return-object v0
.end method

.method public final getNotificationTypeController()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;
    .locals 1

    .line 34
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;->notificationTypeController:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;

    return-object v0
.end method

.method public final getRefreshView()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 41
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;->refreshView:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public getShowSaveProgress()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;->$$delegate_0:Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;->getShowSaveProgress()Landroidx/databinding/ObservableField;

    move-result-object v0

    return-object v0
.end method

.method public final getWhiteListResolver()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;
    .locals 1

    .line 32
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;->whiteListResolver:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;

    return-object v0
.end method

.method public onBackClicked()V
    .locals 1

    .line 102
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;->onBackClicked()V

    .line 103
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;->fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/FragmentManager;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->popBackStack()V

    :goto_0
    return-void
.end method

.method public onCreateView(Landroid/content/Context;)V
    .locals 9

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    invoke-super {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;->onCreateView(Landroid/content/Context;)V

    .line 45
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;->appsResolver:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/OtherAppsResolver;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/OtherAppsResolver;->update()V

    .line 46
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->Companion:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl$Companion;

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl$Companion;->isNotificationServiceEnabled(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 50
    :cond_0
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object v0

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;->dialogManager:Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManager;

    const v3, 0x7f0f0142

    const v4, 0x7f0f0141

    const v5, 0x7f0f005d

    const/4 v6, 0x0

    const/16 v7, 0x10

    const/4 v8, 0x0

    move-object v2, p1

    invoke-static/range {v1 .. v8}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManager$DefaultImpls;->openAlertDialog$default(Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManager;Landroid/content/Context;IIIIILjava/lang/Object;)Lio/reactivex/Single;

    move-result-object v1

    .line 54
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/-$$Lambda$NotificationsViewModel$9BUFQVSO1YuFWDOTzm98jm4-GgM;

    invoke-direct {v2, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/-$$Lambda$NotificationsViewModel$9BUFQVSO1YuFWDOTzm98jm4-GgM;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Single;->subscribe(Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object p1

    .line 50
    invoke-virtual {v0, p1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method

.method public onDestroyView(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    invoke-super {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;->onDestroyView(Landroid/content/Context;)V

    .line 96
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;->whiteListResolver:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;->clearLocalMemory()V

    .line 97
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;->appsResolver:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/OtherAppsResolver;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/OtherAppsResolver;->clearLocalMemory()V

    .line 98
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;->notificationTypeController:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;

    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;->clearMemory()V

    return-void
.end method

.method public final onSaveClicked()V
    .locals 8

    .line 108
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/-$$Lambda$NotificationsViewModel$eYZberYgCjwZ_oT3nVECPWVyfQs;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/-$$Lambda$NotificationsViewModel$eYZberYgCjwZ_oT3nVECPWVyfQs;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;)V

    invoke-static {v0}, Lio/reactivex/Completable;->fromAction(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object v0

    const-string v1, "fromAction {\n            whiteListResolver.flushMemory()\n            appsResolver.flushMemory()\n        }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 113
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;->getShowSaveProgress()Landroidx/databinding/ObservableField;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 115
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object v1

    .line 118
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;->alertsStorage:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsStorage;

    .line 119
    invoke-interface {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsStorage;->getAreCallsEnabled()Z

    move-result v3

    iget-object v4, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;->alertsStorage:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsStorage;

    invoke-interface {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsStorage;->getAreMessagesEnabled()Z

    move-result v4

    .line 121
    iget-object v7, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;->appContext:Landroid/content/Context;

    const/4 v5, 0x0

    const/4 v6, 0x0

    .line 118
    invoke-interface/range {v2 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsStorage;->setNotificationTypesEnabled(ZZZZLandroid/content/Context;)Lio/reactivex/Completable;

    move-result-object v2

    check-cast v2, Lio/reactivex/CompletableSource;

    .line 117
    invoke-virtual {v0, v2}, Lio/reactivex/Completable;->andThen(Lio/reactivex/CompletableSource;)Lio/reactivex/Completable;

    move-result-object v0

    .line 124
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/-$$Lambda$NotificationsViewModel$YSWJKFx_Nji_LAgpYGpZUzLpBqE;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/-$$Lambda$NotificationsViewModel$YSWJKFx_Nji_LAgpYGpZUzLpBqE;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Completable;->doOnEvent(Lio/reactivex/functions/Consumer;)Lio/reactivex/Completable;

    move-result-object v0

    .line 127
    invoke-static {}, Lio/reactivex/android/schedulers/AndroidSchedulers;->mainThread()Lio/reactivex/Scheduler;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/Completable;->observeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Completable;

    move-result-object v0

    .line 128
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/-$$Lambda$NotificationsViewModel$VTgucUQ-oOJaHJ9bOe4JV-TGhfM;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/-$$Lambda$NotificationsViewModel$VTgucUQ-oOJaHJ9bOe4JV-TGhfM;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;)V

    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/-$$Lambda$NotificationsViewModel$7EiF-C4YZ5TAPp9Awin7JFuWRao;

    invoke-direct {v3, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/-$$Lambda$NotificationsViewModel$7EiF-C4YZ5TAPp9Awin7JFuWRao;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;)V

    invoke-virtual {v0, v2, v3}, Lio/reactivex/Completable;->subscribe(Lio/reactivex/functions/Action;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v0

    .line 115
    invoke-virtual {v1, v0}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method

.method public onStart(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    invoke-super {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;->onStart(Landroid/content/Context;)V

    .line 67
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;->rxPermissions:Lcom/tbruyelle/rxpermissions2/RxPermissions;

    const-string v0, "android.permission.READ_PHONE_STATE"

    invoke-virtual {p1, v0}, Lcom/tbruyelle/rxpermissions2/RxPermissions;->isGranted(Ljava/lang/String;)Z

    move-result p1

    .line 69
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;->whiteListResolver:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;->getMainDialerPackage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;->isAppEnabled(Ljava/lang/String;)Z

    const/4 v0, 0x1

    if-nez p1, :cond_0

    .line 71
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;->whiteListResolver:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;->enableCallsApp(ZZ)V

    .line 77
    :cond_0
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;->refreshView:Landroidx/databinding/ObservableField;

    invoke-virtual {p1}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    if-nez v1, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    xor-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    :goto_0
    invoke-virtual {p1, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    return-void
.end method
