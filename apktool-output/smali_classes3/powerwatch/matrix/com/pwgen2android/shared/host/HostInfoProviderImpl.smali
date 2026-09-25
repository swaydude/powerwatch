.class public final Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProviderImpl;
.super Ljava/lang/Object;
.source "HostInfoProvider.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u000e\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u0016H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u000e8\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProviderImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;",
        "context",
        "Landroid/content/Context;",
        "googleFitController",
        "Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;",
        "stravaController",
        "Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;",
        "(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;)V",
        "googleFitPermission",
        "Lpowerwatch/matrix/com/pwgen2android/shared/host/GoogleFitPermission;",
        "notificationServicePermission",
        "Lpowerwatch/matrix/com/pwgen2android/shared/host/NotificationServicePermission;",
        "phoneUUID",
        "",
        "stravaPermission",
        "Lpowerwatch/matrix/com/pwgen2android/shared/host/StravaPermission;",
        "hostInfo",
        "Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;",
        "fillAdditionalInfo",
        "",
        "loadAppPermissions",
        "",
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
.field private final googleFitPermission:Lpowerwatch/matrix/com/pwgen2android/shared/host/GoogleFitPermission;

.field private final notificationServicePermission:Lpowerwatch/matrix/com/pwgen2android/shared/host/NotificationServicePermission;

.field private final phoneUUID:Ljava/lang/String;

.field private final stravaPermission:Lpowerwatch/matrix/com/pwgen2android/shared/host/StravaPermission;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "googleFitController"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stravaController"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/host/GoogleFitPermission;

    invoke-direct {v0, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/host/GoogleFitPermission;-><init>(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProviderImpl;->googleFitPermission:Lpowerwatch/matrix/com/pwgen2android/shared/host/GoogleFitPermission;

    .line 33
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/shared/host/StravaPermission;

    invoke-direct {p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/host/StravaPermission;-><init>(Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;)V

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProviderImpl;->stravaPermission:Lpowerwatch/matrix/com/pwgen2android/shared/host/StravaPermission;

    .line 34
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/shared/host/NotificationServicePermission;

    invoke-direct {p2, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/host/NotificationServicePermission;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProviderImpl;->notificationServicePermission:Lpowerwatch/matrix/com/pwgen2android/shared/host/NotificationServicePermission;

    .line 37
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p1

    const-string p2, "android_id"

    invoke-static {p1, p2}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "getString(context.contentResolver, Settings.Secure.ANDROID_ID)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    sget-object p2, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p1, p2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    const-string p2, "(this as java.lang.String).getBytes(charset)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    invoke-static {p1}, Ljava/util/UUID;->nameUUIDFromBytes([B)Ljava/util/UUID;

    move-result-object p1

    .line 39
    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "nameUUIDFromBytes((Settings.Secure.getString(context.contentResolver, Settings.Secure.ANDROID_ID))\n            .toByteArray())\n            .toString()"

    .line 37
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p1

    const-string p2, "(this as java.lang.String).toUpperCase()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProviderImpl;->phoneUUID:Ljava/lang/String;

    return-void
.end method

.method private final loadAppPermissions()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/host/AppPermission;",
            ">;"
        }
    .end annotation

    .line 45
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProviderImpl;->googleFitPermission:Lpowerwatch/matrix/com/pwgen2android/shared/host/GoogleFitPermission;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/host/GoogleFitPermission;->getCurrentPermissionState()Lpowerwatch/matrix/com/pwgen2android/shared/host/AppPermission;

    move-result-object v0

    .line 46
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProviderImpl;->stravaPermission:Lpowerwatch/matrix/com/pwgen2android/shared/host/StravaPermission;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/host/StravaPermission;->getCurrentPermissionState()Lpowerwatch/matrix/com/pwgen2android/shared/host/AppPermission;

    move-result-object v1

    .line 47
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProviderImpl;->notificationServicePermission:Lpowerwatch/matrix/com/pwgen2android/shared/host/NotificationServicePermission;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/host/NotificationServicePermission;->getCurrentPermissionState()Lpowerwatch/matrix/com/pwgen2android/shared/host/AppPermission;

    move-result-object v2

    const/4 v3, 0x3

    new-array v3, v3, [Lpowerwatch/matrix/com/pwgen2android/shared/host/AppPermission;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    aput-object v1, v3, v0

    const/4 v0, 0x2

    aput-object v2, v3, v0

    .line 49
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public hostInfo(Z)Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;
    .locals 10

    if-eqz p1, :cond_0

    .line 54
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProviderImpl;->loadAppPermissions()Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    move-object v7, p1

    .line 57
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProviderImpl;->phoneUUID:Ljava/lang/String;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v8, 0x3e

    const/4 v9, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v9}, Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method
