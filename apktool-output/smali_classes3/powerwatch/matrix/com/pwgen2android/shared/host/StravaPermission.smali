.class public final Lpowerwatch/matrix/com/pwgen2android/shared/host/StravaPermission;
.super Ljava/lang/Object;
.source "AppPermissions.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/host/StravaPermission;",
        "",
        "stravaController",
        "Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;",
        "(Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;)V",
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
.field private final stravaController:Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;)V
    .locals 1

    const-string v0, "stravaController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/StravaPermission;->stravaController:Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;

    return-void
.end method


# virtual methods
.method public final getCurrentPermissionState()Lpowerwatch/matrix/com/pwgen2android/shared/host/AppPermission;
    .locals 3

    .line 44
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/StravaPermission;->stravaController:Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->hasAuthorize()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 45
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/host/AppPermission;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/host/Apps$Strava;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/host/Apps$Strava;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/host/Apps$Strava;->getName()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/shared/host/AppState$StateOn;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/host/AppState$StateOn;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/host/AppState$StateOn;->getState()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/host/AppPermission;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/host/AppPermission;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/host/Apps$Strava;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/host/Apps$Strava;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/host/Apps$Strava;->getName()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/shared/host/AppState$StateOff;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/host/AppState$StateOff;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/host/AppState$StateOff;->getState()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/host/AppPermission;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-object v0
.end method
