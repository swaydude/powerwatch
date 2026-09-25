.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;
.super Ljava/lang/Object;
.source "Gen2Comands.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008.\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0010\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0012J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\t\u00102\u001a\u00020\u0005H\u00c6\u0003J\t\u00103\u001a\u00020\u0010H\u00c6\u0003J\t\u00104\u001a\u00020\u0005H\u00c6\u0003J\t\u00105\u001a\u00020\u0005H\u00c6\u0003J\t\u00106\u001a\u00020\u0007H\u00c6\u0003J\t\u00107\u001a\u00020\u0005H\u00c6\u0003J\t\u00108\u001a\u00020\u0005H\u00c6\u0003J\t\u00109\u001a\u00020\u0005H\u00c6\u0003J\t\u0010:\u001a\u00020\u0005H\u00c6\u0003J\t\u0010;\u001a\u00020\u0005H\u00c6\u0003J\t\u0010<\u001a\u00020\u0005H\u00c6\u0003J\u0081\u0001\u0010=\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00052\u0008\u0008\u0002\u0010\t\u001a\u00020\u00052\u0008\u0008\u0002\u0010\n\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00052\u0008\u0008\u0002\u0010\r\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010>\u001a\u00020?2\u0008\u0010@\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010A\u001a\u00020\u0005H\u00d6\u0001J\u0008\u0010B\u001a\u00020CH\u0016R\u001a\u0010\u000c\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014\"\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u000b\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0017\u0010\u0014\"\u0004\u0008\u0018\u0010\u0016R\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0019\u0010\u0014\"\u0004\u0008\u001a\u0010\u0016R\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001b\u0010\u0014\"\u0004\u0008\u001c\u0010\u0016R\u001a\u0010\u000e\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001d\u0010\u0014\"\u0004\u0008\u001e\u0010\u0016R\u001a\u0010\u0011\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001f\u0010\u0014\"\u0004\u0008 \u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008!\u0010\"\"\u0004\u0008#\u0010$R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008%\u0010\u0014\"\u0004\u0008&\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010(R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008)\u0010*\"\u0004\u0008+\u0010,R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008-\u0010\u0014\"\u0004\u0008.\u0010\u0016R\u001a\u0010\u0008\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008/\u0010\u0014\"\u0004\u00080\u0010\u0016\u00a8\u0006D"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;",
        "",
        "logType",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType;",
        "logTimeIndex",
        "",
        "logTableTime",
        "",
        "walkStepDelta",
        "runningStepDelta",
        "distanceDelta",
        "battery",
        "activeCalories",
        "bmrCalories",
        "heartRate",
        "powerLog",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;",
        "hrv",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType;IJIIIIIIILpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;I)V",
        "getActiveCalories",
        "()I",
        "setActiveCalories",
        "(I)V",
        "getBattery",
        "setBattery",
        "getBmrCalories",
        "setBmrCalories",
        "getDistanceDelta",
        "setDistanceDelta",
        "getHeartRate",
        "setHeartRate",
        "getHrv",
        "setHrv",
        "getLogTableTime",
        "()J",
        "setLogTableTime",
        "(J)V",
        "getLogTimeIndex",
        "setLogTimeIndex",
        "getLogType",
        "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType;",
        "getPowerLog",
        "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;",
        "setPowerLog",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;)V",
        "getRunningStepDelta",
        "setRunningStepDelta",
        "getWalkStepDelta",
        "setWalkStepDelta",
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
.field private activeCalories:I

.field private battery:I

.field private bmrCalories:I

.field private distanceDelta:I

.field private heartRate:I

.field private hrv:I

.field private logTableTime:J

.field private logTimeIndex:I

.field private final logType:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType;

.field private powerLog:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;

.field private runningStepDelta:I

.field private walkStepDelta:I


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType;IJIIIIIIILpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;I)V
    .locals 1

    const-string v0, "logType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "powerLog"

    invoke-static {p12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 319
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 320
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->logType:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType;

    .line 321
    iput p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->logTimeIndex:I

    iput-wide p3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->logTableTime:J

    iput p5, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->walkStepDelta:I

    iput p6, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->runningStepDelta:I

    iput p7, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->distanceDelta:I

    .line 322
    iput p8, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->battery:I

    iput p9, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->activeCalories:I

    iput p10, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->bmrCalories:I

    iput p11, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->heartRate:I

    iput-object p12, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->powerLog:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;

    iput p13, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->hrv:I

    return-void
.end method

.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType;IJIIIIIIILpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 18

    move/from16 v0, p14

    and-int/lit8 v1, v0, 0x2

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    const/4 v5, 0x0

    goto :goto_0

    :cond_0
    move/from16 v5, p2

    :goto_0
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_1

    const/4 v8, 0x0

    goto :goto_1

    :cond_1
    move/from16 v8, p5

    :goto_1
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_2

    const/4 v9, 0x0

    goto :goto_2

    :cond_2
    move/from16 v9, p6

    :goto_2
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_3

    const/4 v10, 0x0

    goto :goto_3

    :cond_3
    move/from16 v10, p7

    :goto_3
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_4

    const/4 v11, 0x0

    goto :goto_4

    :cond_4
    move/from16 v11, p8

    :goto_4
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_5

    const/4 v12, 0x0

    goto :goto_5

    :cond_5
    move/from16 v12, p9

    :goto_5
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_6

    const/4 v13, 0x0

    goto :goto_6

    :cond_6
    move/from16 v13, p10

    :goto_6
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_7

    const/4 v14, 0x0

    goto :goto_7

    :cond_7
    move/from16 v14, p11

    :goto_7
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_8

    .line 322
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x1f

    const/16 v17, 0x0

    move-object/from16 p5, v1

    move/from16 p6, v3

    move/from16 p7, v4

    move/from16 p8, v6

    move/from16 p9, v7

    move/from16 p10, v15

    move/from16 p11, v16

    move-object/from16 p12, v17

    invoke-direct/range {p5 .. p12}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;-><init>(IIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v15, v1

    goto :goto_8

    :cond_8
    move-object/from16 v15, p12

    :goto_8
    and-int/lit16 v0, v0, 0x800

    if-eqz v0, :cond_9

    const/16 v16, 0x0

    goto :goto_9

    :cond_9
    move/from16 v16, p13

    :goto_9
    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-wide/from16 v6, p3

    .line 319
    invoke-direct/range {v3 .. v16}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType;IJIIIIIIILpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;I)V

    return-void
.end method

.method public static synthetic copy$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType;IJIIIIIIILpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;IILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;
    .locals 14

    move-object v0, p0

    move/from16 v1, p14

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->logType:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType;

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget v3, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->logTimeIndex:I

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-wide v4, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->logTableTime:J

    goto :goto_2

    :cond_2
    move-wide/from16 v4, p3

    :goto_2
    and-int/lit8 v6, v1, 0x8

    if-eqz v6, :cond_3

    iget v6, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->walkStepDelta:I

    goto :goto_3

    :cond_3
    move/from16 v6, p5

    :goto_3
    and-int/lit8 v7, v1, 0x10

    if-eqz v7, :cond_4

    iget v7, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->runningStepDelta:I

    goto :goto_4

    :cond_4
    move/from16 v7, p6

    :goto_4
    and-int/lit8 v8, v1, 0x20

    if-eqz v8, :cond_5

    iget v8, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->distanceDelta:I

    goto :goto_5

    :cond_5
    move/from16 v8, p7

    :goto_5
    and-int/lit8 v9, v1, 0x40

    if-eqz v9, :cond_6

    iget v9, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->battery:I

    goto :goto_6

    :cond_6
    move/from16 v9, p8

    :goto_6
    and-int/lit16 v10, v1, 0x80

    if-eqz v10, :cond_7

    iget v10, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->activeCalories:I

    goto :goto_7

    :cond_7
    move/from16 v10, p9

    :goto_7
    and-int/lit16 v11, v1, 0x100

    if-eqz v11, :cond_8

    iget v11, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->bmrCalories:I

    goto :goto_8

    :cond_8
    move/from16 v11, p10

    :goto_8
    and-int/lit16 v12, v1, 0x200

    if-eqz v12, :cond_9

    iget v12, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->heartRate:I

    goto :goto_9

    :cond_9
    move/from16 v12, p11

    :goto_9
    and-int/lit16 v13, v1, 0x400

    if-eqz v13, :cond_a

    iget-object v13, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->powerLog:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;

    goto :goto_a

    :cond_a
    move-object/from16 v13, p12

    :goto_a
    and-int/lit16 v1, v1, 0x800

    if-eqz v1, :cond_b

    iget v1, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->hrv:I

    goto :goto_b

    :cond_b
    move/from16 v1, p13

    :goto_b
    move-object p1, v2

    move/from16 p2, v3

    move-wide/from16 p3, v4

    move/from16 p5, v6

    move/from16 p6, v7

    move/from16 p7, v8

    move/from16 p8, v9

    move/from16 p9, v10

    move/from16 p10, v11

    move/from16 p11, v12

    move-object/from16 p12, v13

    move/from16 p13, v1

    invoke-virtual/range {p0 .. p13}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->copy(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType;IJIIIIIIILpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;I)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->logType:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType;

    return-object v0
.end method

.method public final component10()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->heartRate:I

    return v0
.end method

.method public final component11()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->powerLog:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;

    return-object v0
.end method

.method public final component12()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->hrv:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->logTimeIndex:I

    return v0
.end method

.method public final component3()J
    .locals 2

    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->logTableTime:J

    return-wide v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->walkStepDelta:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->runningStepDelta:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->distanceDelta:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->battery:I

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->activeCalories:I

    return v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->bmrCalories:I

    return v0
.end method

.method public final copy(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType;IJIIIIIIILpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;I)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;
    .locals 15

    const-string v0, "logType"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "powerLog"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;

    move-object v1, v0

    move/from16 v3, p2

    move-wide/from16 v4, p3

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move/from16 v12, p11

    move/from16 v14, p13

    invoke-direct/range {v1 .. v14}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType;IJIIIIIIILpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;I)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->logType:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->logType:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->logTimeIndex:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->logTimeIndex:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->logTableTime:J

    iget-wide v5, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->logTableTime:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->walkStepDelta:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->walkStepDelta:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->runningStepDelta:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->runningStepDelta:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->distanceDelta:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->distanceDelta:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->battery:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->battery:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->activeCalories:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->activeCalories:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->bmrCalories:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->bmrCalories:I

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->heartRate:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->heartRate:I

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->powerLog:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->powerLog:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->hrv:I

    iget p1, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->hrv:I

    if-eq v1, p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final getActiveCalories()I
    .locals 1

    .line 322
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->activeCalories:I

    return v0
.end method

.method public final getBattery()I
    .locals 1

    .line 322
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->battery:I

    return v0
.end method

.method public final getBmrCalories()I
    .locals 1

    .line 322
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->bmrCalories:I

    return v0
.end method

.method public final getDistanceDelta()I
    .locals 1

    .line 321
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->distanceDelta:I

    return v0
.end method

.method public final getHeartRate()I
    .locals 1

    .line 322
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->heartRate:I

    return v0
.end method

.method public final getHrv()I
    .locals 1

    .line 322
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->hrv:I

    return v0
.end method

.method public final getLogTableTime()J
    .locals 2

    .line 321
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->logTableTime:J

    return-wide v0
.end method

.method public final getLogTimeIndex()I
    .locals 1

    .line 321
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->logTimeIndex:I

    return v0
.end method

.method public final getLogType()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType;
    .locals 1

    .line 320
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->logType:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType;

    return-object v0
.end method

.method public final getPowerLog()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;
    .locals 1

    .line 322
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->powerLog:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;

    return-object v0
.end method

.method public final getRunningStepDelta()I
    .locals 1

    .line 321
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->runningStepDelta:I

    return v0
.end method

.method public final getWalkStepDelta()I
    .locals 1

    .line 321
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->walkStepDelta:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->logType:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->logTimeIndex:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->logTableTime:J

    invoke-static {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter$SleepSession-$$ExternalSynthetic0;->m0(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->walkStepDelta:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->runningStepDelta:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->distanceDelta:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->battery:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->activeCalories:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->bmrCalories:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->heartRate:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->powerLog:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->hrv:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final setActiveCalories(I)V
    .locals 0

    .line 322
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->activeCalories:I

    return-void
.end method

.method public final setBattery(I)V
    .locals 0

    .line 322
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->battery:I

    return-void
.end method

.method public final setBmrCalories(I)V
    .locals 0

    .line 322
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->bmrCalories:I

    return-void
.end method

.method public final setDistanceDelta(I)V
    .locals 0

    .line 321
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->distanceDelta:I

    return-void
.end method

.method public final setHeartRate(I)V
    .locals 0

    .line 322
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->heartRate:I

    return-void
.end method

.method public final setHrv(I)V
    .locals 0

    .line 322
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->hrv:I

    return-void
.end method

.method public final setLogTableTime(J)V
    .locals 0

    .line 321
    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->logTableTime:J

    return-void
.end method

.method public final setLogTimeIndex(I)V
    .locals 0

    .line 321
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->logTimeIndex:I

    return-void
.end method

.method public final setPowerLog(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 322
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->powerLog:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;

    return-void
.end method

.method public final setRunningStepDelta(I)V
    .locals 0

    .line 321
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->runningStepDelta:I

    return-void
.end method

.method public final setWalkStepDelta(I)V
    .locals 0

    .line 321
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->walkStepDelta:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 328
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RTL Index: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->logTimeIndex:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " Activity: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->logType:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType;->getEnumValue()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "  Delta Walk Steps: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->walkStepDelta:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " Delta Run Steps: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->runningStepDelta:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " Delta Distance: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->distanceDelta:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " Delta Act Cals: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 329
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->activeCalories:I

    .line 328
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " Delta BMR Cals: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 329
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->bmrCalories:I

    .line 328
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " Heart Rate: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 329
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->heartRate:I

    .line 328
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " HRV: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 330
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->hrv:I

    .line 328
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " Skin Temp: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 330
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->powerLog:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;->getSkinTemp()I

    move-result v1

    .line 328
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " Case Temp: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 330
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->powerLog:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;->getCaseTemp()I

    move-result v1

    .line 328
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " Thermal Gen: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 330
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->powerLog:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;->getThermalGen()I

    move-result v1

    .line 328
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " Solar Gen: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 330
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->powerLog:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;->getSolarGen()I

    move-result v1

    .line 328
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " Power Consumed: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 331
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->powerLog:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;->getPowerConsumed()I

    move-result v1

    .line 328
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " Battery: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 331
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;->battery:I

    .line 328
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
