.class public abstract Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError;
.super Ljava/lang/Throwable;
.source "WatchSynchronizer.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$DeviceNotConnected;,
        Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$ActivityInProgress;,
        Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$WatchBusy;,
        Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$SyncParsingError;,
        Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$SyncTimeoutError;,
        Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$Unknown;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0006\u0005\u0006\u0007\u0008\t\nB\u000f\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u0082\u0001\u0006\u000b\u000c\r\u000e\u000f\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError;",
        "",
        "errorDesc",
        "",
        "(Ljava/lang/String;)V",
        "ActivityInProgress",
        "DeviceNotConnected",
        "SyncParsingError",
        "SyncTimeoutError",
        "Unknown",
        "WatchBusy",
        "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$DeviceNotConnected;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$ActivityInProgress;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$WatchBusy;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$SyncParsingError;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$SyncTimeoutError;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$Unknown;",
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
.method private constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 74
    invoke-direct {p0, p1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError;-><init>(Ljava/lang/String;)V

    return-void
.end method
