.class public final Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/apps/dismissed/CellularCallAlertDismissedKt;
.super Ljava/lang/Object;
.source "CellularCallAlertDismissed.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\"\u001a\u0010\u0000\u001a\u00020\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0002\u0010\u0003\"\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "blockSendingMissedCall",
        "",
        "getBlockSendingMissedCall",
        "()Z",
        "setBlockSendingMissedCall",
        "(Z)V",
        "app_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field private static blockSendingMissedCall:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBlockSendingMissedCall()Z
    .locals 1

    .line 11
    sget-boolean v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/apps/dismissed/CellularCallAlertDismissedKt;->blockSendingMissedCall:Z

    return v0
.end method

.method public static final setBlockSendingMissedCall(Z)V
    .locals 0

    .line 11
    sput-boolean p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/apps/dismissed/CellularCallAlertDismissedKt;->blockSendingMissedCall:Z

    return-void
.end method
