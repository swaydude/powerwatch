.class public Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/PairingFailedError;
.super Ljava/lang/Throwable;
.source "Gen2PairingProgressViewModel.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0008\u0016\u0018\u00002\u00020\u0001B\u0019\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\u0007\u00a8\u0006\t"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/PairingFailedError;",
        "",
        "deviceId",
        "",
        "fwVersion",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "getDeviceId",
        "()Ljava/lang/String;",
        "getFwVersion",
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
.field private final deviceId:Ljava/lang/String;

.field private final fwVersion:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 185
    invoke-direct {p0}, Ljava/lang/Throwable;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/PairingFailedError;->deviceId:Ljava/lang/String;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/PairingFailedError;->fwVersion:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final getDeviceId()Ljava/lang/String;
    .locals 1

    .line 185
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/PairingFailedError;->deviceId:Ljava/lang/String;

    return-object v0
.end method

.method public final getFwVersion()Ljava/lang/String;
    .locals 1

    .line 185
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/PairingFailedError;->fwVersion:Ljava/lang/String;

    return-object v0
.end method
