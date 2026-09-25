.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;
.super Ljava/lang/Object;
.source "Gen2Comands.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0005\n\u0002\u0008B\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u00a5\u0001\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u0008\u00a2\u0006\u0002\u0010\u0016J\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\t\u0010>\u001a\u00020\u0008H\u00c6\u0003J\t\u0010?\u001a\u00020\u0008H\u00c6\u0003J\t\u0010@\u001a\u00020\u0008H\u00c6\u0003J\t\u0010A\u001a\u00020\u0008H\u00c6\u0003J\t\u0010B\u001a\u00020\u0008H\u00c6\u0003J\t\u0010C\u001a\u00020\u0008H\u00c6\u0003J\t\u0010D\u001a\u00020\u0008H\u00c6\u0003J\t\u0010E\u001a\u00020\u0005H\u00c6\u0003J\t\u0010F\u001a\u00020\u0005H\u00c6\u0003J\t\u0010G\u001a\u00020\u0008H\u00c6\u0003J\t\u0010H\u001a\u00020\u0008H\u00c6\u0003J\t\u0010I\u001a\u00020\u0008H\u00c6\u0003J\t\u0010J\u001a\u00020\u000cH\u00c6\u0003J\t\u0010K\u001a\u00020\u000cH\u00c6\u0003J\t\u0010L\u001a\u00020\u0008H\u00c6\u0003J\u00a9\u0001\u0010M\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u0008H\u00c6\u0001J\u0013\u0010N\u001a\u00020O2\u0008\u0010P\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010Q\u001a\u00020\u0008H\u00d6\u0001J\u0008\u0010R\u001a\u00020SH\u0016R\u001a\u0010\u000f\u001a\u00020\u0008X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018\"\u0004\u0008\u0019\u0010\u001aR\u001a\u0010\u0015\u001a\u00020\u0008X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001b\u0010\u0018\"\u0004\u0008\u001c\u0010\u001aR\u001a\u0010\t\u001a\u00020\u0008X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001d\u0010\u0018\"\u0004\u0008\u001e\u0010\u001aR\u001a\u0010\n\u001a\u00020\u0008X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001f\u0010\u0018\"\u0004\u0008 \u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u0008X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008!\u0010\u0018\"\u0004\u0008\"\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\u000cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008#\u0010$\"\u0004\u0008%\u0010&R\u001a\u0010\r\u001a\u00020\u000cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\'\u0010$\"\u0004\u0008(\u0010&R\u001a\u0010\u0011\u001a\u00020\u0008X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008)\u0010\u0018\"\u0004\u0008*\u0010\u001aR\u001a\u0010\u0010\u001a\u00020\u0008X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008+\u0010\u0018\"\u0004\u0008,\u0010\u001aR\u001a\u0010\u0014\u001a\u00020\u0008X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008-\u0010\u0018\"\u0004\u0008.\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008/\u00100\"\u0004\u00081\u00102R\u001a\u0010\u000e\u001a\u00020\u0008X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00083\u0010\u0018\"\u0004\u00084\u0010\u001aR\u001a\u0010\u0013\u001a\u00020\u0008X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00085\u0010\u0018\"\u0004\u00086\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00087\u00100\"\u0004\u00088\u00102R\u001a\u0010\u0012\u001a\u00020\u0008X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00089\u0010\u0018\"\u0004\u0008:\u0010\u001aR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008;\u0010<\u00a8\u0006T"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;",
        "",
        "type",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;",
        "deltaStep",
        "",
        "deltaRunningStepCount",
        "deltaDistance",
        "",
        "deltaCalsActive",
        "deltaCalsBRM",
        "deltaGPSLat",
        "",
        "deltaGPSLong",
        "deltaSkinTemp",
        "deltCaseTemp",
        "deltaHeartRate",
        "deltaHRV",
        "deltaThermalGen",
        "deltaSolarGen",
        "deltaPowerConsumed",
        "deltaAltitude",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;JJIIIBBIIIIIIII)V",
        "getDeltCaseTemp",
        "()I",
        "setDeltCaseTemp",
        "(I)V",
        "getDeltaAltitude",
        "setDeltaAltitude",
        "getDeltaCalsActive",
        "setDeltaCalsActive",
        "getDeltaCalsBRM",
        "setDeltaCalsBRM",
        "getDeltaDistance",
        "setDeltaDistance",
        "getDeltaGPSLat",
        "()B",
        "setDeltaGPSLat",
        "(B)V",
        "getDeltaGPSLong",
        "setDeltaGPSLong",
        "getDeltaHRV",
        "setDeltaHRV",
        "getDeltaHeartRate",
        "setDeltaHeartRate",
        "getDeltaPowerConsumed",
        "setDeltaPowerConsumed",
        "getDeltaRunningStepCount",
        "()J",
        "setDeltaRunningStepCount",
        "(J)V",
        "getDeltaSkinTemp",
        "setDeltaSkinTemp",
        "getDeltaSolarGen",
        "setDeltaSolarGen",
        "getDeltaStep",
        "setDeltaStep",
        "getDeltaThermalGen",
        "setDeltaThermalGen",
        "getType",
        "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;",
        "component1",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
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
.field private deltCaseTemp:I

.field private deltaAltitude:I

.field private deltaCalsActive:I

.field private deltaCalsBRM:I

.field private deltaDistance:I

.field private deltaGPSLat:B

.field private deltaGPSLong:B

.field private deltaHRV:I

.field private deltaHeartRate:I

.field private deltaPowerConsumed:I

.field private deltaRunningStepCount:J

.field private deltaSkinTemp:I

.field private deltaSolarGen:I

.field private deltaStep:J

.field private deltaThermalGen:I

.field private final type:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;


# direct methods
.method public constructor <init>()V
    .locals 21

    move-object/from16 v0, p0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const v19, 0xffff

    const/16 v20, 0x0

    invoke-direct/range {v0 .. v20}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;JJIIIBBIIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;JJIIIBBIIIIIIII)V
    .locals 3

    move-object v0, p0

    move-object v1, p1

    const-string v2, "type"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 339
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->type:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;

    move-wide v1, p2

    .line 340
    iput-wide v1, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaStep:J

    move-wide v1, p4

    .line 341
    iput-wide v1, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaRunningStepCount:J

    move v1, p6

    .line 342
    iput v1, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaDistance:I

    move v1, p7

    .line 343
    iput v1, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaCalsActive:I

    move v1, p8

    .line 344
    iput v1, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaCalsBRM:I

    move v1, p9

    .line 345
    iput-byte v1, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaGPSLat:B

    move v1, p10

    .line 346
    iput-byte v1, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaGPSLong:B

    move v1, p11

    .line 347
    iput v1, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaSkinTemp:I

    move v1, p12

    .line 348
    iput v1, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltCaseTemp:I

    move/from16 v1, p13

    .line 349
    iput v1, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaHeartRate:I

    move/from16 v1, p14

    .line 350
    iput v1, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaHRV:I

    move/from16 v1, p15

    .line 351
    iput v1, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaThermalGen:I

    move/from16 v1, p16

    .line 352
    iput v1, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaSolarGen:I

    move/from16 v1, p17

    .line 353
    iput v1, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaPowerConsumed:I

    move/from16 v1, p18

    .line 354
    iput v1, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaAltitude:I

    return-void
.end method

.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;JJIIIBBIIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 18

    move/from16 v0, p19

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    .line 339
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$RUNNING;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$RUNNING;

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;

    goto :goto_0

    :cond_0
    move-object/from16 v1, p1

    :goto_0
    and-int/lit8 v2, v0, 0x2

    const-wide/16 v3, 0x0

    if-eqz v2, :cond_1

    move-wide v5, v3

    goto :goto_1

    :cond_1
    move-wide/from16 v5, p2

    :goto_1
    and-int/lit8 v2, v0, 0x4

    if-eqz v2, :cond_2

    goto :goto_2

    :cond_2
    move-wide/from16 v3, p4

    :goto_2
    and-int/lit8 v2, v0, 0x8

    if-eqz v2, :cond_3

    const/4 v2, 0x0

    goto :goto_3

    :cond_3
    move/from16 v2, p6

    :goto_3
    and-int/lit8 v8, v0, 0x10

    if-eqz v8, :cond_4

    const/4 v8, 0x0

    goto :goto_4

    :cond_4
    move/from16 v8, p7

    :goto_4
    and-int/lit8 v9, v0, 0x20

    if-eqz v9, :cond_5

    const/4 v9, 0x0

    goto :goto_5

    :cond_5
    move/from16 v9, p8

    :goto_5
    and-int/lit8 v10, v0, 0x40

    if-eqz v10, :cond_6

    const/4 v10, 0x0

    goto :goto_6

    :cond_6
    move/from16 v10, p9

    :goto_6
    and-int/lit16 v11, v0, 0x80

    if-eqz v11, :cond_7

    const/4 v11, 0x0

    goto :goto_7

    :cond_7
    move/from16 v11, p10

    :goto_7
    and-int/lit16 v12, v0, 0x100

    if-eqz v12, :cond_8

    const/4 v12, 0x0

    goto :goto_8

    :cond_8
    move/from16 v12, p11

    :goto_8
    and-int/lit16 v13, v0, 0x200

    if-eqz v13, :cond_9

    const/4 v13, 0x0

    goto :goto_9

    :cond_9
    move/from16 v13, p12

    :goto_9
    and-int/lit16 v14, v0, 0x400

    if-eqz v14, :cond_a

    const/4 v14, 0x0

    goto :goto_a

    :cond_a
    move/from16 v14, p13

    :goto_a
    and-int/lit16 v15, v0, 0x800

    if-eqz v15, :cond_b

    const/4 v15, 0x0

    goto :goto_b

    :cond_b
    move/from16 v15, p14

    :goto_b
    and-int/lit16 v7, v0, 0x1000

    if-eqz v7, :cond_c

    const/4 v7, 0x0

    goto :goto_c

    :cond_c
    move/from16 v7, p15

    :goto_c
    move/from16 p20, v7

    and-int/lit16 v7, v0, 0x2000

    if-eqz v7, :cond_d

    const/4 v7, 0x0

    goto :goto_d

    :cond_d
    move/from16 v7, p16

    :goto_d
    move/from16 v16, v7

    and-int/lit16 v7, v0, 0x4000

    if-eqz v7, :cond_e

    const/4 v7, 0x0

    goto :goto_e

    :cond_e
    move/from16 v7, p17

    :goto_e
    const v17, 0x8000

    and-int v0, v0, v17

    if-eqz v0, :cond_f

    const/4 v0, 0x0

    goto :goto_f

    :cond_f
    move/from16 v0, p18

    :goto_f
    move-object/from16 p1, p0

    move-object/from16 p2, v1

    move-wide/from16 p3, v5

    move-wide/from16 p5, v3

    move/from16 p7, v2

    move/from16 p8, v8

    move/from16 p9, v9

    move/from16 p10, v10

    move/from16 p11, v11

    move/from16 p12, v12

    move/from16 p13, v13

    move/from16 p14, v14

    move/from16 p15, v15

    move/from16 p16, p20

    move/from16 p17, v16

    move/from16 p18, v7

    move/from16 p19, v0

    invoke-direct/range {p1 .. p19}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;JJIIIBBIIIIIIII)V

    return-void
.end method

.method public static synthetic copy$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;JJIIIBBIIIIIIIIILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p19

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->type:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-wide v3, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaStep:J

    goto :goto_1

    :cond_1
    move-wide/from16 v3, p2

    :goto_1
    and-int/lit8 v5, v1, 0x4

    if-eqz v5, :cond_2

    iget-wide v5, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaRunningStepCount:J

    goto :goto_2

    :cond_2
    move-wide/from16 v5, p4

    :goto_2
    and-int/lit8 v7, v1, 0x8

    if-eqz v7, :cond_3

    iget v7, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaDistance:I

    goto :goto_3

    :cond_3
    move/from16 v7, p6

    :goto_3
    and-int/lit8 v8, v1, 0x10

    if-eqz v8, :cond_4

    iget v8, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaCalsActive:I

    goto :goto_4

    :cond_4
    move/from16 v8, p7

    :goto_4
    and-int/lit8 v9, v1, 0x20

    if-eqz v9, :cond_5

    iget v9, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaCalsBRM:I

    goto :goto_5

    :cond_5
    move/from16 v9, p8

    :goto_5
    and-int/lit8 v10, v1, 0x40

    if-eqz v10, :cond_6

    iget-byte v10, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaGPSLat:B

    goto :goto_6

    :cond_6
    move/from16 v10, p9

    :goto_6
    and-int/lit16 v11, v1, 0x80

    if-eqz v11, :cond_7

    iget-byte v11, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaGPSLong:B

    goto :goto_7

    :cond_7
    move/from16 v11, p10

    :goto_7
    and-int/lit16 v12, v1, 0x100

    if-eqz v12, :cond_8

    iget v12, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaSkinTemp:I

    goto :goto_8

    :cond_8
    move/from16 v12, p11

    :goto_8
    and-int/lit16 v13, v1, 0x200

    if-eqz v13, :cond_9

    iget v13, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltCaseTemp:I

    goto :goto_9

    :cond_9
    move/from16 v13, p12

    :goto_9
    and-int/lit16 v14, v1, 0x400

    if-eqz v14, :cond_a

    iget v14, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaHeartRate:I

    goto :goto_a

    :cond_a
    move/from16 v14, p13

    :goto_a
    and-int/lit16 v15, v1, 0x800

    if-eqz v15, :cond_b

    iget v15, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaHRV:I

    goto :goto_b

    :cond_b
    move/from16 v15, p14

    :goto_b
    move/from16 p14, v15

    and-int/lit16 v15, v1, 0x1000

    if-eqz v15, :cond_c

    iget v15, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaThermalGen:I

    goto :goto_c

    :cond_c
    move/from16 v15, p15

    :goto_c
    move/from16 p15, v15

    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget v15, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaSolarGen:I

    goto :goto_d

    :cond_d
    move/from16 v15, p16

    :goto_d
    move/from16 p16, v15

    and-int/lit16 v15, v1, 0x4000

    if-eqz v15, :cond_e

    iget v15, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaPowerConsumed:I

    goto :goto_e

    :cond_e
    move/from16 v15, p17

    :goto_e
    const v16, 0x8000

    and-int v1, v1, v16

    if-eqz v1, :cond_f

    iget v1, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaAltitude:I

    goto :goto_f

    :cond_f
    move/from16 v1, p18

    :goto_f
    move-object/from16 p1, v2

    move-wide/from16 p2, v3

    move-wide/from16 p4, v5

    move/from16 p6, v7

    move/from16 p7, v8

    move/from16 p8, v9

    move/from16 p9, v10

    move/from16 p10, v11

    move/from16 p11, v12

    move/from16 p12, v13

    move/from16 p13, v14

    move/from16 p17, v15

    move/from16 p18, v1

    invoke-virtual/range {p0 .. p18}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->copy(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;JJIIIBBIIIIIIII)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->type:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;

    return-object v0
.end method

.method public final component10()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltCaseTemp:I

    return v0
.end method

.method public final component11()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaHeartRate:I

    return v0
.end method

.method public final component12()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaHRV:I

    return v0
.end method

.method public final component13()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaThermalGen:I

    return v0
.end method

.method public final component14()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaSolarGen:I

    return v0
.end method

.method public final component15()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaPowerConsumed:I

    return v0
.end method

.method public final component16()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaAltitude:I

    return v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaStep:J

    return-wide v0
.end method

.method public final component3()J
    .locals 2

    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaRunningStepCount:J

    return-wide v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaDistance:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaCalsActive:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaCalsBRM:I

    return v0
.end method

.method public final component7()B
    .locals 1

    iget-byte v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaGPSLat:B

    return v0
.end method

.method public final component8()B
    .locals 1

    iget-byte v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaGPSLong:B

    return v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaSkinTemp:I

    return v0
.end method

.method public final copy(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;JJIIIBBIIIIIIII)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;
    .locals 21

    move-object/from16 v1, p1

    move-wide/from16 v2, p2

    move-wide/from16 v4, p4

    move/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    move/from16 v10, p10

    move/from16 v11, p11

    move/from16 v12, p12

    move/from16 v13, p13

    move/from16 v14, p14

    move/from16 v15, p15

    move/from16 v16, p16

    move/from16 v17, p17

    move/from16 v18, p18

    const-string v0, "type"

    move-object/from16 v19, v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v20, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;

    move-object/from16 v0, v20

    invoke-direct/range {v0 .. v18}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;JJIIIBBIIIIIIII)V

    return-object v20
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->type:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->type:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaStep:J

    iget-wide v5, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaStep:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaRunningStepCount:J

    iget-wide v5, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaRunningStepCount:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaDistance:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaDistance:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaCalsActive:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaCalsActive:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaCalsBRM:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaCalsBRM:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-byte v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaGPSLat:B

    iget-byte v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaGPSLat:B

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-byte v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaGPSLong:B

    iget-byte v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaGPSLong:B

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaSkinTemp:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaSkinTemp:I

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltCaseTemp:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltCaseTemp:I

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaHeartRate:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaHeartRate:I

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaHRV:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaHRV:I

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaThermalGen:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaThermalGen:I

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaSolarGen:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaSolarGen:I

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaPowerConsumed:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaPowerConsumed:I

    if-eq v1, v3, :cond_10

    return v2

    :cond_10
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaAltitude:I

    iget p1, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaAltitude:I

    if-eq v1, p1, :cond_11

    return v2

    :cond_11
    return v0
.end method

.method public final getDeltCaseTemp()I
    .locals 1

    .line 348
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltCaseTemp:I

    return v0
.end method

.method public final getDeltaAltitude()I
    .locals 1

    .line 354
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaAltitude:I

    return v0
.end method

.method public final getDeltaCalsActive()I
    .locals 1

    .line 343
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaCalsActive:I

    return v0
.end method

.method public final getDeltaCalsBRM()I
    .locals 1

    .line 344
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaCalsBRM:I

    return v0
.end method

.method public final getDeltaDistance()I
    .locals 1

    .line 342
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaDistance:I

    return v0
.end method

.method public final getDeltaGPSLat()B
    .locals 1

    .line 345
    iget-byte v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaGPSLat:B

    return v0
.end method

.method public final getDeltaGPSLong()B
    .locals 1

    .line 346
    iget-byte v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaGPSLong:B

    return v0
.end method

.method public final getDeltaHRV()I
    .locals 1

    .line 350
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaHRV:I

    return v0
.end method

.method public final getDeltaHeartRate()I
    .locals 1

    .line 349
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaHeartRate:I

    return v0
.end method

.method public final getDeltaPowerConsumed()I
    .locals 1

    .line 353
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaPowerConsumed:I

    return v0
.end method

.method public final getDeltaRunningStepCount()J
    .locals 2

    .line 341
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaRunningStepCount:J

    return-wide v0
.end method

.method public final getDeltaSkinTemp()I
    .locals 1

    .line 347
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaSkinTemp:I

    return v0
.end method

.method public final getDeltaSolarGen()I
    .locals 1

    .line 352
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaSolarGen:I

    return v0
.end method

.method public final getDeltaStep()J
    .locals 2

    .line 340
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaStep:J

    return-wide v0
.end method

.method public final getDeltaThermalGen()I
    .locals 1

    .line 351
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaThermalGen:I

    return v0
.end method

.method public final getType()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;
    .locals 1

    .line 339
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->type:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->type:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaStep:J

    invoke-static {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter$SleepSession-$$ExternalSynthetic0;->m0(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaRunningStepCount:J

    invoke-static {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter$SleepSession-$$ExternalSynthetic0;->m0(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaDistance:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaCalsActive:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaCalsBRM:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-byte v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaGPSLat:B

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-byte v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaGPSLong:B

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaSkinTemp:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltCaseTemp:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaHeartRate:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaHRV:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaThermalGen:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaSolarGen:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaPowerConsumed:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaAltitude:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final setDeltCaseTemp(I)V
    .locals 0

    .line 348
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltCaseTemp:I

    return-void
.end method

.method public final setDeltaAltitude(I)V
    .locals 0

    .line 354
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaAltitude:I

    return-void
.end method

.method public final setDeltaCalsActive(I)V
    .locals 0

    .line 343
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaCalsActive:I

    return-void
.end method

.method public final setDeltaCalsBRM(I)V
    .locals 0

    .line 344
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaCalsBRM:I

    return-void
.end method

.method public final setDeltaDistance(I)V
    .locals 0

    .line 342
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaDistance:I

    return-void
.end method

.method public final setDeltaGPSLat(B)V
    .locals 0

    .line 345
    iput-byte p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaGPSLat:B

    return-void
.end method

.method public final setDeltaGPSLong(B)V
    .locals 0

    .line 346
    iput-byte p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaGPSLong:B

    return-void
.end method

.method public final setDeltaHRV(I)V
    .locals 0

    .line 350
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaHRV:I

    return-void
.end method

.method public final setDeltaHeartRate(I)V
    .locals 0

    .line 349
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaHeartRate:I

    return-void
.end method

.method public final setDeltaPowerConsumed(I)V
    .locals 0

    .line 353
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaPowerConsumed:I

    return-void
.end method

.method public final setDeltaRunningStepCount(J)V
    .locals 0

    .line 341
    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaRunningStepCount:J

    return-void
.end method

.method public final setDeltaSkinTemp(I)V
    .locals 0

    .line 347
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaSkinTemp:I

    return-void
.end method

.method public final setDeltaSolarGen(I)V
    .locals 0

    .line 352
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaSolarGen:I

    return-void
.end method

.method public final setDeltaStep(J)V
    .locals 0

    .line 340
    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaStep:J

    return-void
.end method

.method public final setDeltaThermalGen(I)V
    .locals 0

    .line 351
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaThermalGen:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 357
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Activity: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->type:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;->getType()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " Delta Walk Steps: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaStep:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " Delta Run Steps: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaRunningStepCount:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " Delta Distance: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaDistance:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " Delta Active Cals: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaCalsActive:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " Delta BMR Cals: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 358
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaCalsBRM:I

    .line 357
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " Heart Rate: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 358
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaHeartRate:I

    .line 357
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " HRV: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 358
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaHRV:I

    .line 357
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " Skin Temp: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 358
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaSkinTemp:I

    .line 357
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " Case Temp: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 358
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltCaseTemp:I

    .line 357
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " Thermal Gen: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 359
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaThermalGen:I

    .line 357
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " Solar Gen: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 359
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaSolarGen:I

    .line 357
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " Power Consumed: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 359
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaPowerConsumed:I

    .line 357
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " Delta GPS Lat: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 359
    iget-byte v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaGPSLat:B

    .line 357
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " Delta GPS Long: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 360
    iget-byte v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaGPSLong:B

    .line 357
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " Delta Altitude: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 360
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->deltaAltitude:I

    .line 357
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
