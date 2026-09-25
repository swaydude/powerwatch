.class public interface abstract Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppsResolverHelper;
.super Ljava/lang/Object;
.source "OtherAppsResolver.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppsResolver;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppsController;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppsResolverHelper$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008`\u0018\u00002\u00020\u00012\u00020\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u0008\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0016\u00a8\u0006\u000c"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppsResolverHelper;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppsResolver;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppsController;",
        "enableCallsApp",
        "",
        "enable",
        "",
        "store",
        "isAppSupported",
        "notification",
        "Landroid/service/notification/StatusBarNotification;",
        "shouldResolve",
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


# virtual methods
.method public abstract enableCallsApp(ZZ)V
.end method

.method public abstract isAppSupported(Landroid/service/notification/StatusBarNotification;)Z
.end method

.method public abstract shouldResolve(Landroid/service/notification/StatusBarNotification;)Z
.end method
