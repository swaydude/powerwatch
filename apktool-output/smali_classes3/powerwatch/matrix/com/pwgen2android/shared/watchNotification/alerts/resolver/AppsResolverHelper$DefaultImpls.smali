.class public final Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppsResolverHelper$DefaultImpls;
.super Ljava/lang/Object;
.source "OtherAppsResolver.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppsResolverHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method public static enableCallsApp(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppsResolverHelper;ZZ)V
    .locals 0

    const-string p1, "this"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic enableCallsApp$default(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppsResolverHelper;ZZILjava/lang/Object;)V
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 49
    :cond_0
    invoke-interface {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppsResolverHelper;->enableCallsApp(ZZ)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: enableCallsApp"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static shouldResolve(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppsResolverHelper;Landroid/service/notification/StatusBarNotification;)Z
    .locals 1

    const-string v0, "this"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notification"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    invoke-interface {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppsResolverHelper;->isAppSupported(Landroid/service/notification/StatusBarNotification;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/service/notification/StatusBarNotification;->getPackageName()Ljava/lang/String;

    move-result-object p1

    const-string v0, "notification.packageName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppsResolverHelper;->isAppEnabled(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
