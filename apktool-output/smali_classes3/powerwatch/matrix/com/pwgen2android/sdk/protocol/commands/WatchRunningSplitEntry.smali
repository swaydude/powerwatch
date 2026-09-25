.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningSplitEntry;
.super Ljava/lang/Object;
.source "Commands.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0018\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\t\u0010\n\"\u0004\u0008\u000b\u0010\u000cR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014\u00a8\u0006 "
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningSplitEntry;",
        "",
        "gpsPosition",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;",
        "heartRate",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;",
        "runningSplit",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RunningSplit;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RunningSplit;)V",
        "getGpsPosition",
        "()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;",
        "setGpsPosition",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;)V",
        "getHeartRate",
        "()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;",
        "setHeartRate",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;)V",
        "getRunningSplit",
        "()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RunningSplit;",
        "setRunningSplit",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RunningSplit;)V",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
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
.field private gpsPosition:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;

.field private heartRate:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;

.field private runningSplit:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RunningSplit;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RunningSplit;)V
    .locals 1

    const-string v0, "gpsPosition"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "heartRate"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "runningSplit"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningSplitEntry;->gpsPosition:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningSplitEntry;->heartRate:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningSplitEntry;->runningSplit:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RunningSplit;

    return-void
.end method

.method public static synthetic copy$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningSplitEntry;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RunningSplit;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningSplitEntry;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningSplitEntry;->gpsPosition:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningSplitEntry;->heartRate:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningSplitEntry;->runningSplit:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RunningSplit;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningSplitEntry;->copy(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RunningSplit;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningSplitEntry;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningSplitEntry;->gpsPosition:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;

    return-object v0
.end method

.method public final component2()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningSplitEntry;->heartRate:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;

    return-object v0
.end method

.method public final component3()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RunningSplit;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningSplitEntry;->runningSplit:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RunningSplit;

    return-object v0
.end method

.method public final copy(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RunningSplit;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningSplitEntry;
    .locals 1

    const-string v0, "gpsPosition"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "heartRate"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "runningSplit"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningSplitEntry;

    invoke-direct {v0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningSplitEntry;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RunningSplit;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningSplitEntry;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningSplitEntry;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningSplitEntry;->gpsPosition:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningSplitEntry;->gpsPosition:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningSplitEntry;->heartRate:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningSplitEntry;->heartRate:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningSplitEntry;->runningSplit:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RunningSplit;

    iget-object p1, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningSplitEntry;->runningSplit:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RunningSplit;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getGpsPosition()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;
    .locals 1

    .line 99
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningSplitEntry;->gpsPosition:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;

    return-object v0
.end method

.method public final getHeartRate()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;
    .locals 1

    .line 99
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningSplitEntry;->heartRate:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;

    return-object v0
.end method

.method public final getRunningSplit()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RunningSplit;
    .locals 1

    .line 99
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningSplitEntry;->runningSplit:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RunningSplit;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningSplitEntry;->gpsPosition:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningSplitEntry;->heartRate:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningSplitEntry;->runningSplit:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RunningSplit;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RunningSplit;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setGpsPosition(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningSplitEntry;->gpsPosition:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;

    return-void
.end method

.method public final setHeartRate(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningSplitEntry;->heartRate:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;

    return-void
.end method

.method public final setRunningSplit(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RunningSplit;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningSplitEntry;->runningSplit:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RunningSplit;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "WatchRunningSplitEntry(gpsPosition="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningSplitEntry;->gpsPosition:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", heartRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningSplitEntry;->heartRate:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", runningSplit="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningSplitEntry;->runningSplit:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RunningSplit;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
