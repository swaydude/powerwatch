.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RealtimeData;
.super Ljava/lang/Object;
.source "ReceiveRealTimeCommand.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\r\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0007H\u00c6\u0003J1\u0010\u0013\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000cR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000c\u00a8\u0006\u001a"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RealtimeData;",
        "",
        "timestamp",
        "",
        "currentSteps",
        "currentDistance",
        "currentCalories",
        "",
        "(JJJI)V",
        "getCurrentCalories",
        "()I",
        "getCurrentDistance",
        "()J",
        "getCurrentSteps",
        "getTimestamp",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
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
.field private final currentCalories:I

.field private final currentDistance:J

.field private final currentSteps:J

.field private final timestamp:J


# direct methods
.method public constructor <init>(JJJI)V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RealtimeData;->timestamp:J

    iput-wide p3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RealtimeData;->currentSteps:J

    iput-wide p5, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RealtimeData;->currentDistance:J

    iput p7, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RealtimeData;->currentCalories:I

    return-void
.end method

.method public static synthetic copy$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RealtimeData;JJJIILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RealtimeData;
    .locals 8

    move-object v0, p0

    and-int/lit8 v1, p8, 0x1

    if-eqz v1, :cond_0

    iget-wide v1, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RealtimeData;->timestamp:J

    goto :goto_0

    :cond_0
    move-wide v1, p1

    :goto_0
    and-int/lit8 v3, p8, 0x2

    if-eqz v3, :cond_1

    iget-wide v3, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RealtimeData;->currentSteps:J

    goto :goto_1

    :cond_1
    move-wide v3, p3

    :goto_1
    and-int/lit8 v5, p8, 0x4

    if-eqz v5, :cond_2

    iget-wide v5, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RealtimeData;->currentDistance:J

    goto :goto_2

    :cond_2
    move-wide v5, p5

    :goto_2
    and-int/lit8 v7, p8, 0x8

    if-eqz v7, :cond_3

    iget v7, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RealtimeData;->currentCalories:I

    goto :goto_3

    :cond_3
    move v7, p7

    :goto_3
    move-wide p1, v1

    move-wide p3, v3

    move-wide p5, v5

    move p7, v7

    invoke-virtual/range {p0 .. p7}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RealtimeData;->copy(JJJI)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RealtimeData;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RealtimeData;->timestamp:J

    return-wide v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RealtimeData;->currentSteps:J

    return-wide v0
.end method

.method public final component3()J
    .locals 2

    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RealtimeData;->currentDistance:J

    return-wide v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RealtimeData;->currentCalories:I

    return v0
.end method

.method public final copy(JJJI)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RealtimeData;
    .locals 9

    new-instance v8, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RealtimeData;

    move-object v0, v8

    move-wide v1, p1

    move-wide v3, p3

    move-wide v5, p5

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RealtimeData;-><init>(JJJI)V

    return-object v8
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RealtimeData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RealtimeData;

    iget-wide v3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RealtimeData;->timestamp:J

    iget-wide v5, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RealtimeData;->timestamp:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RealtimeData;->currentSteps:J

    iget-wide v5, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RealtimeData;->currentSteps:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RealtimeData;->currentDistance:J

    iget-wide v5, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RealtimeData;->currentDistance:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RealtimeData;->currentCalories:I

    iget p1, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RealtimeData;->currentCalories:I

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getCurrentCalories()I
    .locals 1

    .line 5
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RealtimeData;->currentCalories:I

    return v0
.end method

.method public final getCurrentDistance()J
    .locals 2

    .line 5
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RealtimeData;->currentDistance:J

    return-wide v0
.end method

.method public final getCurrentSteps()J
    .locals 2

    .line 5
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RealtimeData;->currentSteps:J

    return-wide v0
.end method

.method public final getTimestamp()J
    .locals 2

    .line 5
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RealtimeData;->timestamp:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RealtimeData;->timestamp:J

    invoke-static {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter$SleepSession-$$ExternalSynthetic0;->m0(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RealtimeData;->currentSteps:J

    invoke-static {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter$SleepSession-$$ExternalSynthetic0;->m0(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RealtimeData;->currentDistance:J

    invoke-static {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter$SleepSession-$$ExternalSynthetic0;->m0(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RealtimeData;->currentCalories:I

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RealtimeData(timestamp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RealtimeData;->timestamp:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", currentSteps="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RealtimeData;->currentSteps:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", currentDistance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RealtimeData;->currentDistance:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", currentCalories="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RealtimeData;->currentCalories:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
