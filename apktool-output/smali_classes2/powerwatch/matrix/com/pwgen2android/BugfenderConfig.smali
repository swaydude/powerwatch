.class public final Lpowerwatch/matrix/com/pwgen2android/BugfenderConfig;
.super Ljava/lang/Object;
.source "BugfenderConfig.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000cJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\t\u00a8\u0006\u0010"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/BugfenderConfig;",
        "",
        "()V",
        "initBugfender",
        "",
        "appContext",
        "Landroid/content/Context;",
        "setAppBuild",
        "appBuild",
        "",
        "setStravaAndFitStatus",
        "stravaStatus",
        "",
        "googleFitStatus",
        "setUserEmail",
        "userEmail",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final initBugfender(Landroid/content/Context;)V
    .locals 2

    const-string v0, "appContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "doUHqHUAhouAncAdrQHvO2SVw3ZGwg28"

    const/4 v1, 0x0

    .line 9
    invoke-static {p1, v0, v1}, Lcom/bugfender/sdk/Bugfender;->init(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 10
    invoke-static {}, Lcom/bugfender/sdk/Bugfender;->enableCrashReporting()V

    const/4 p1, 0x1

    .line 11
    invoke-static {p1}, Lcom/bugfender/sdk/Bugfender;->disableReflection(Z)V

    return-void
.end method

.method public final setAppBuild(Ljava/lang/String;)V
    .locals 1

    const-string v0, "appBuild"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "app build"

    .line 15
    invoke-static {v0, p1}, Lcom/bugfender/sdk/Bugfender;->setDeviceString(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final setStravaAndFitStatus(ZZ)V
    .locals 1

    .line 23
    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object p1

    const-string v0, "strava"

    invoke-static {v0, p1}, Lcom/bugfender/sdk/Bugfender;->setDeviceString(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    invoke-static {p2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object p1

    const-string p2, "google_fit"

    invoke-static {p2, p1}, Lcom/bugfender/sdk/Bugfender;->setDeviceString(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final setUserEmail(Ljava/lang/String;)V
    .locals 1

    const-string v0, "userEmail"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "user email"

    .line 19
    invoke-static {v0, p1}, Lcom/bugfender/sdk/Bugfender;->setDeviceString(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
