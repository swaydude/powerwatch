.class public Lpowerwatch/matrix/com/pwgen2android/main/OTACallback;
.super Ljava/lang/Object;
.source "OTAModel.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/ota/AmotaCallback;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0008\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\rH\u0016J\u0008\u0010\u000e\u001a\u00020\nH\u0016J\u0008\u0010\u000f\u001a\u00020\nH\u0016J\u0008\u0010\u0010\u001a\u00020\nH\u0016J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\"\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u0018"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/OTACallback;",
        "Lpowerwatch/matrix/com/pwgen2android/ota/AmotaCallback;",
        "()V",
        "phasePower",
        "",
        "getPhasePower",
        "()F",
        "setPhasePower",
        "(F)V",
        "connectingToDevice",
        "",
        "otaFailed",
        "detail",
        "",
        "otaProcessStarted",
        "otaStarted",
        "otaSuccess",
        "progressUpdate",
        "progress",
        "",
        "sendFwDataState",
        "state",
        "",
        "sendVerifyState",
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
.field private phasePower:F


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    .line 8
    iput v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTACallback;->phasePower:F

    return-void
.end method


# virtual methods
.method public connectingToDevice()V
    .locals 2

    const-string v0, "ota_process"

    const-string v1, "Connecting..."

    .line 34
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public final getPhasePower()F
    .locals 1

    .line 8
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTACallback;->phasePower:F

    return v0
.end method

.method public otaFailed(Ljava/lang/String;)V
    .locals 1

    const-string v0, "detail"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "Failed: "

    .line 22
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "ota_process"

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public otaProcessStarted()V
    .locals 2

    const-string v0, "ota_process"

    const-string v1, "Started"

    .line 38
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public otaStarted()V
    .locals 2

    const-string v0, "ota_process"

    const-string v1, "Started"

    .line 30
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public otaSuccess()V
    .locals 2

    const-string v0, "ota_process"

    const-string v1, "Success!"

    .line 26
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public progressUpdate(I)V
    .locals 1

    .line 10
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string v0, "Running: "

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "ota_process"

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public sendFwDataState(Z)V
    .locals 0

    return-void
.end method

.method public sendVerifyState(Z)V
    .locals 0

    return-void
.end method

.method public final setPhasePower(F)V
    .locals 0

    .line 8
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTACallback;->phasePower:F

    return-void
.end method
