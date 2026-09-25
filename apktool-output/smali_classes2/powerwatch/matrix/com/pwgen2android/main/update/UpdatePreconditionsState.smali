.class public final Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;
.super Ljava/lang/Object;
.source "FirmwareAvailableViewModel.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000e\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u000e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0008R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u0008\u00a8\u0006\u0015"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;",
        "",
        "bluetooth",
        "",
        "network",
        "deviceConnection",
        "(ZZZ)V",
        "getBluetooth",
        "()Z",
        "getDeviceConnection",
        "getNetwork",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "",
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
.field private final bluetooth:Z

.field private final deviceConnection:Z

.field private final network:Z


# direct methods
.method public constructor <init>(ZZZ)V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;->bluetooth:Z

    iput-boolean p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;->network:Z

    iput-boolean p3, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;->deviceConnection:Z

    return-void
.end method

.method public static synthetic copy$default(Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;ZZZILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-boolean p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;->bluetooth:Z

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-boolean p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;->network:Z

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-boolean p3, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;->deviceConnection:Z

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;->copy(ZZZ)Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;->bluetooth:Z

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;->network:Z

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;->deviceConnection:Z

    return v0
.end method

.method public final copy(ZZZ)Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;

    invoke-direct {v0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;-><init>(ZZZ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;

    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;->bluetooth:Z

    iget-boolean v3, p1, Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;->bluetooth:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;->network:Z

    iget-boolean v3, p1, Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;->network:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;->deviceConnection:Z

    iget-boolean p1, p1, Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;->deviceConnection:Z

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getBluetooth()Z
    .locals 1

    .line 43
    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;->bluetooth:Z

    return v0
.end method

.method public final getDeviceConnection()Z
    .locals 1

    .line 43
    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;->deviceConnection:Z

    return v0
.end method

.method public final getNetwork()Z
    .locals 1

    .line 43
    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;->network:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;->bluetooth:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;->network:Z

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    :cond_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;->deviceConnection:Z

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_2
    move v1, v2

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "UpdatePreconditionsState(bluetooth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;->bluetooth:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", network="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;->network:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", deviceConnection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;->deviceConnection:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
