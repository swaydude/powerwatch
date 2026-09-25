.class public final Lpowerwatch/matrix/com/pwgen2android/shared/host/NotificationServicePermission;
.super Ljava/lang/Object;
.source "AppPermissions.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\n\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0010\u0012\u000c\u0012\n \t*\u0004\u0018\u00010\u00030\u00030\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000c"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/host/NotificationServicePermission;",
        "",
        "context",
        "Landroid/content/Context;",
        "(Landroid/content/Context;)V",
        "getContext",
        "()Landroid/content/Context;",
        "contextWeakReference",
        "Ljava/lang/ref/WeakReference;",
        "kotlin.jvm.PlatformType",
        "getCurrentPermissionState",
        "Lpowerwatch/matrix/com/pwgen2android/shared/host/AppPermission;",
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
.field private final context:Landroid/content/Context;

.field private final contextWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/NotificationServicePermission;->context:Landroid/content/Context;

    .line 51
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/NotificationServicePermission;->contextWeakReference:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public final getContext()Landroid/content/Context;
    .locals 1

    .line 50
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/NotificationServicePermission;->context:Landroid/content/Context;

    return-object v0
.end method

.method public final getCurrentPermissionState()Lpowerwatch/matrix/com/pwgen2android/shared/host/AppPermission;
    .locals 3

    .line 54
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->Companion:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl$Companion;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/NotificationServicePermission;->contextWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl$Companion;->isNotificationServiceEnabled(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 55
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/host/AppPermission;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/host/Apps$NotificationService;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/host/Apps$NotificationService;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/host/Apps$NotificationService;->getName()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/shared/host/AppState$StateOn;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/host/AppState$StateOn;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/host/AppState$StateOn;->getState()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/host/AppPermission;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 56
    :cond_0
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->Companion:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl$Companion;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/NotificationServicePermission;->contextWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl$Companion;->isGlobalServiceUserDeclined(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 57
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/host/AppPermission;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/host/Apps$NotificationService;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/host/Apps$NotificationService;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/host/Apps$NotificationService;->getName()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/shared/host/AppState$StateOff;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/host/AppState$StateOff;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/host/AppState$StateOff;->getState()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/host/AppPermission;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 59
    :cond_1
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/host/AppPermission;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/host/Apps$NotificationService;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/host/Apps$NotificationService;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/host/Apps$NotificationService;->getName()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/shared/host/AppState$StateUndefined;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/host/AppState$StateUndefined;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/host/AppState$StateUndefined;->getState()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/host/AppPermission;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-object v0
.end method
