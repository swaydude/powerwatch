.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;
.super Ljava/lang/Object;
.source "Commands.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008.\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\u000c\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J\t\u0010/\u001a\u00020\u0003H\u00c6\u0003J\t\u00100\u001a\u00020\u0005H\u00c6\u0003J\t\u00101\u001a\u00020\u0005H\u00c6\u0003J\t\u00102\u001a\u00020\u0011H\u00c6\u0003J\t\u00103\u001a\u00020\u0005H\u00c6\u0003J\t\u00104\u001a\u00020\u0007H\u00c6\u0003J\t\u00105\u001a\u00020\u0007H\u00c6\u0003J\t\u00106\u001a\u00020\u0007H\u00c6\u0003J\t\u00107\u001a\u00020\u0007H\u00c6\u0003J\t\u00108\u001a\u00020\u0007H\u00c6\u0003J\t\u00109\u001a\u00020\u0007H\u00c6\u0003J\t\u0010:\u001a\u00020\u0005H\u00c6\u0003J\u0081\u0001\u0010;\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00072\u0008\u0008\u0002\u0010\r\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0011H\u00c6\u0001J\u0013\u0010<\u001a\u00020\u00032\u0008\u0010=\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010>\u001a\u00020\u0007H\u00d6\u0001J\t\u0010?\u001a\u00020@H\u00d6\u0001R\u001a\u0010\t\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014\"\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u0008\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0017\u0010\u0014\"\u0004\u0008\u0018\u0010\u0016R\u001a\u0010\n\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0019\u0010\u0014\"\u0004\u0008\u001a\u0010\u0016R\u001a\u0010\u000f\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001b\u0010\u001c\"\u0004\u0008\u001d\u0010\u001eR\u001a\u0010\u000b\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001f\u0010\u0014\"\u0004\u0008 \u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0002\u0010!R\u001a\u0010\u000c\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\"\u0010\u0014\"\u0004\u0008#\u0010\u0016R\u001a\u0010\u000e\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008$\u0010\u001c\"\u0004\u0008%\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008&\u0010\u0014\"\u0004\u0008\'\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010\u001cR\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008)\u0010\u001c\"\u0004\u0008*\u0010\u001eR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008+\u0010,\"\u0004\u0008-\u0010.\u00a8\u0006A"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;",
        "",
        "isSleep",
        "",
        "timestamp",
        "",
        "state",
        "",
        "battery",
        "activeCalories",
        "bmrCalories",
        "hrv",
        "pulseCount",
        "walkingSteps",
        "runningSteps",
        "distance",
        "watchPowerLog",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;",
        "(ZJIIIIIIJJJLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;)V",
        "getActiveCalories",
        "()I",
        "setActiveCalories",
        "(I)V",
        "getBattery",
        "setBattery",
        "getBmrCalories",
        "setBmrCalories",
        "getDistance",
        "()J",
        "setDistance",
        "(J)V",
        "getHrv",
        "setHrv",
        "()Z",
        "getPulseCount",
        "setPulseCount",
        "getRunningSteps",
        "setRunningSteps",
        "getState",
        "setState",
        "getTimestamp",
        "getWalkingSteps",
        "setWalkingSteps",
        "getWatchPowerLog",
        "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;",
        "setWatchPowerLog",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;)V",
        "component1",
        "component10",
        "component11",
        "component12",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "equals",
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
.field private activeCalories:I

.field private battery:I

.field private bmrCalories:I

.field private distance:J

.field private hrv:I

.field private final isSleep:Z

.field private pulseCount:I

.field private runningSteps:J

.field private state:I

.field private final timestamp:J

.field private walkingSteps:J

.field private watchPowerLog:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;


# direct methods
.method public constructor <init>(ZJIIIIIIJJJLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;)V
    .locals 4

    move-object v0, p0

    move-object/from16 v1, p16

    const-string v2, "watchPowerLog"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move v2, p1

    iput-boolean v2, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->isSleep:Z

    move-wide v2, p2

    .line 74
    iput-wide v2, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->timestamp:J

    move v2, p4

    .line 75
    iput v2, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->state:I

    move v2, p5

    .line 76
    iput v2, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->battery:I

    move v2, p6

    .line 77
    iput v2, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->activeCalories:I

    move v2, p7

    .line 78
    iput v2, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->bmrCalories:I

    move v2, p8

    .line 79
    iput v2, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->hrv:I

    move v2, p9

    .line 80
    iput v2, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->pulseCount:I

    move-wide v2, p10

    .line 81
    iput-wide v2, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->walkingSteps:J

    move-wide/from16 v2, p12

    .line 82
    iput-wide v2, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->runningSteps:J

    move-wide/from16 v2, p14

    .line 83
    iput-wide v2, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->distance:J

    .line 84
    iput-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->watchPowerLog:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;

    return-void
.end method

.method public synthetic constructor <init>(ZJIIIIIIJJJLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 20

    move/from16 v0, p17

    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_0

    const-wide/16 v1, -0x1

    move-wide v5, v1

    goto :goto_0

    :cond_0
    move-wide/from16 v5, p2

    :goto_0
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    const/4 v11, 0x0

    goto :goto_1

    :cond_1
    move/from16 v11, p8

    :goto_1
    and-int/lit16 v1, v0, 0x100

    const-wide/16 v2, 0x0

    if-eqz v1, :cond_2

    move-wide v13, v2

    goto :goto_2

    :cond_2
    move-wide/from16 v13, p10

    :goto_2
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_3

    move-wide v15, v2

    goto :goto_3

    :cond_3
    move-wide/from16 v15, p12

    :goto_3
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_4

    move-wide/from16 v17, v2

    goto :goto_4

    :cond_4
    move-wide/from16 v17, p14

    :goto_4
    and-int/lit16 v0, v0, 0x800

    if-eqz v0, :cond_5

    .line 84
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/16 v8, 0x1f

    const/4 v9, 0x0

    move-object/from16 p10, v0

    move/from16 p11, v1

    move/from16 p12, v2

    move/from16 p13, v3

    move/from16 p14, v4

    move/from16 p15, v7

    move/from16 p16, v8

    move-object/from16 p17, v9

    invoke-direct/range {p10 .. p17}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;-><init>(IIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v19, v0

    goto :goto_5

    :cond_5
    move-object/from16 v19, p16

    :goto_5
    move-object/from16 v3, p0

    move/from16 v4, p1

    move/from16 v7, p4

    move/from16 v8, p5

    move/from16 v9, p6

    move/from16 v10, p7

    move/from16 v12, p9

    .line 73
    invoke-direct/range {v3 .. v19}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;-><init>(ZJIIIIIIJJJLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;)V

    return-void
.end method

.method public static synthetic copy$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;ZJIIIIIIJJJLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p17

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-boolean v2, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->isSleep:Z

    goto :goto_0

    :cond_0
    move/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-wide v3, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->timestamp:J

    goto :goto_1

    :cond_1
    move-wide/from16 v3, p2

    :goto_1
    and-int/lit8 v5, v1, 0x4

    if-eqz v5, :cond_2

    iget v5, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->state:I

    goto :goto_2

    :cond_2
    move/from16 v5, p4

    :goto_2
    and-int/lit8 v6, v1, 0x8

    if-eqz v6, :cond_3

    iget v6, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->battery:I

    goto :goto_3

    :cond_3
    move/from16 v6, p5

    :goto_3
    and-int/lit8 v7, v1, 0x10

    if-eqz v7, :cond_4

    iget v7, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->activeCalories:I

    goto :goto_4

    :cond_4
    move/from16 v7, p6

    :goto_4
    and-int/lit8 v8, v1, 0x20

    if-eqz v8, :cond_5

    iget v8, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->bmrCalories:I

    goto :goto_5

    :cond_5
    move/from16 v8, p7

    :goto_5
    and-int/lit8 v9, v1, 0x40

    if-eqz v9, :cond_6

    iget v9, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->hrv:I

    goto :goto_6

    :cond_6
    move/from16 v9, p8

    :goto_6
    and-int/lit16 v10, v1, 0x80

    if-eqz v10, :cond_7

    iget v10, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->pulseCount:I

    goto :goto_7

    :cond_7
    move/from16 v10, p9

    :goto_7
    and-int/lit16 v11, v1, 0x100

    if-eqz v11, :cond_8

    iget-wide v11, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->walkingSteps:J

    goto :goto_8

    :cond_8
    move-wide/from16 v11, p10

    :goto_8
    and-int/lit16 v13, v1, 0x200

    if-eqz v13, :cond_9

    iget-wide v13, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->runningSteps:J

    goto :goto_9

    :cond_9
    move-wide/from16 v13, p12

    :goto_9
    and-int/lit16 v15, v1, 0x400

    move-wide/from16 p12, v13

    if-eqz v15, :cond_a

    iget-wide v13, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->distance:J

    goto :goto_a

    :cond_a
    move-wide/from16 v13, p14

    :goto_a
    and-int/lit16 v1, v1, 0x800

    if-eqz v1, :cond_b

    iget-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->watchPowerLog:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;

    goto :goto_b

    :cond_b
    move-object/from16 v1, p16

    :goto_b
    move/from16 p1, v2

    move-wide/from16 p2, v3

    move/from16 p4, v5

    move/from16 p5, v6

    move/from16 p6, v7

    move/from16 p7, v8

    move/from16 p8, v9

    move/from16 p9, v10

    move-wide/from16 p10, v11

    move-wide/from16 p14, v13

    move-object/from16 p16, v1

    invoke-virtual/range {p0 .. p16}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->copy(ZJIIIIIIJJJLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->isSleep:Z

    return v0
.end method

.method public final component10()J
    .locals 2

    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->runningSteps:J

    return-wide v0
.end method

.method public final component11()J
    .locals 2

    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->distance:J

    return-wide v0
.end method

.method public final component12()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->watchPowerLog:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;

    return-object v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->timestamp:J

    return-wide v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->state:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->battery:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->activeCalories:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->bmrCalories:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->hrv:I

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->pulseCount:I

    return v0
.end method

.method public final component9()J
    .locals 2

    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->walkingSteps:J

    return-wide v0
.end method

.method public final copy(ZJIIIIIIJJJLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;
    .locals 18

    move/from16 v1, p1

    move-wide/from16 v2, p2

    move/from16 v4, p4

    move/from16 v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    move-wide/from16 v10, p10

    move-wide/from16 v12, p12

    move-wide/from16 v14, p14

    move-object/from16 v16, p16

    const-string v0, "watchPowerLog"

    move-object/from16 v1, p16

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v17, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;

    move-object/from16 v0, v17

    move/from16 v1, p1

    invoke-direct/range {v0 .. v16}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;-><init>(ZJIIIIIIJJJLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;)V

    return-object v17
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;

    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->isSleep:Z

    iget-boolean v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->isSleep:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->timestamp:J

    iget-wide v5, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->timestamp:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->state:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->state:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->battery:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->battery:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->activeCalories:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->activeCalories:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->bmrCalories:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->bmrCalories:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->hrv:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->hrv:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->pulseCount:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->pulseCount:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-wide v3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->walkingSteps:J

    iget-wide v5, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->walkingSteps:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_a

    return v2

    :cond_a
    iget-wide v3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->runningSteps:J

    iget-wide v5, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->runningSteps:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_b

    return v2

    :cond_b
    iget-wide v3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->distance:J

    iget-wide v5, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->distance:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->watchPowerLog:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;

    iget-object p1, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->watchPowerLog:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final getActiveCalories()I
    .locals 1

    .line 77
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->activeCalories:I

    return v0
.end method

.method public final getBattery()I
    .locals 1

    .line 76
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->battery:I

    return v0
.end method

.method public final getBmrCalories()I
    .locals 1

    .line 78
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->bmrCalories:I

    return v0
.end method

.method public final getDistance()J
    .locals 2

    .line 83
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->distance:J

    return-wide v0
.end method

.method public final getHrv()I
    .locals 1

    .line 79
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->hrv:I

    return v0
.end method

.method public final getPulseCount()I
    .locals 1

    .line 80
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->pulseCount:I

    return v0
.end method

.method public final getRunningSteps()J
    .locals 2

    .line 82
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->runningSteps:J

    return-wide v0
.end method

.method public final getState()I
    .locals 1

    .line 75
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->state:I

    return v0
.end method

.method public final getTimestamp()J
    .locals 2

    .line 74
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->timestamp:J

    return-wide v0
.end method

.method public final getWalkingSteps()J
    .locals 2

    .line 81
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->walkingSteps:J

    return-wide v0
.end method

.method public final getWatchPowerLog()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;
    .locals 1

    .line 84
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->watchPowerLog:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->isSleep:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->timestamp:J

    invoke-static {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter$SleepSession-$$ExternalSynthetic0;->m0(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->state:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->battery:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->activeCalories:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->bmrCalories:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->hrv:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->pulseCount:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->walkingSteps:J

    invoke-static {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter$SleepSession-$$ExternalSynthetic0;->m0(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->runningSteps:J

    invoke-static {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter$SleepSession-$$ExternalSynthetic0;->m0(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->distance:J

    invoke-static {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter$SleepSession-$$ExternalSynthetic0;->m0(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->watchPowerLog:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isSleep()Z
    .locals 1

    .line 73
    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->isSleep:Z

    return v0
.end method

.method public final setActiveCalories(I)V
    .locals 0

    .line 77
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->activeCalories:I

    return-void
.end method

.method public final setBattery(I)V
    .locals 0

    .line 76
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->battery:I

    return-void
.end method

.method public final setBmrCalories(I)V
    .locals 0

    .line 78
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->bmrCalories:I

    return-void
.end method

.method public final setDistance(J)V
    .locals 0

    .line 83
    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->distance:J

    return-void
.end method

.method public final setHrv(I)V
    .locals 0

    .line 79
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->hrv:I

    return-void
.end method

.method public final setPulseCount(I)V
    .locals 0

    .line 80
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->pulseCount:I

    return-void
.end method

.method public final setRunningSteps(J)V
    .locals 0

    .line 82
    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->runningSteps:J

    return-void
.end method

.method public final setState(I)V
    .locals 0

    .line 75
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->state:I

    return-void
.end method

.method public final setWalkingSteps(J)V
    .locals 0

    .line 81
    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->walkingSteps:J

    return-void
.end method

.method public final setWatchPowerLog(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->watchPowerLog:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "WatchLogEntry(isSleep="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->isSleep:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", timestamp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->timestamp:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", state="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->state:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", battery="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->battery:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", activeCalories="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->activeCalories:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", bmrCalories="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->bmrCalories:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", hrv="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->hrv:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", pulseCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->pulseCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", walkingSteps="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->walkingSteps:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", runningSteps="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->runningSteps:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", distance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->distance:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", watchPowerLog="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->watchPowerLog:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
