.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;
.super Ljava/lang/Object;
.source "RealtimeDataParser.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008)\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001Bk\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u0007\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0002\u0010\u0010J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\t\u0010/\u001a\u00020\u0003H\u00c6\u0003J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\t\u00101\u001a\u00020\u0007H\u00c6\u0003J\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\u000bH\u00c6\u0003J\t\u00105\u001a\u00020\u0007H\u00c6\u0003J\t\u00106\u001a\u00020\u0007H\u00c6\u0003Jo\u00107\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00032\u0008\u0008\u0002\u0010\t\u001a\u00020\u00032\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00072\u0008\u0008\u0002\u0010\r\u001a\u00020\u00072\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00c6\u0001J\u0013\u00108\u001a\u0002092\u0008\u0010:\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010;\u001a\u00020\u0003H\u00d6\u0001J\u0006\u0010<\u001a\u000209J\t\u0010=\u001a\u00020>H\u00d6\u0001R\u001a\u0010\r\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016\"\u0004\u0008\u0017\u0010\u0018R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0019\u0010\u001a\"\u0004\u0008\u001b\u0010\u001cR\u001a\u0010\u000c\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001d\u0010\u0012\"\u0004\u0008\u001e\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001f\u0010 \"\u0004\u0008!\u0010\"R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008#\u0010\u0012\"\u0004\u0008$\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008%\u0010 \"\u0004\u0008&\u0010\"R\u001a\u0010\u0008\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\'\u0010 \"\u0004\u0008(\u0010\"R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008)\u0010 \"\u0004\u0008*\u0010\"R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008+\u0010 \"\u0004\u0008,\u0010\"\u00a8\u0006?"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;",
        "",
        "totalSteps",
        "",
        "totalActiveCalories",
        "totalSleep",
        "totalDistance",
        "",
        "totalSolarPower",
        "totalThermalPower",
        "heartRate",
        "",
        "skinTemp",
        "batteryPercent",
        "settingsData",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;",
        "(IIIFIIJFFLpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;)V",
        "getBatteryPercent",
        "()F",
        "setBatteryPercent",
        "(F)V",
        "getHeartRate",
        "()J",
        "setHeartRate",
        "(J)V",
        "getSettingsData",
        "()Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;",
        "setSettingsData",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;)V",
        "getSkinTemp",
        "setSkinTemp",
        "getTotalActiveCalories",
        "()I",
        "setTotalActiveCalories",
        "(I)V",
        "getTotalDistance",
        "setTotalDistance",
        "getTotalSleep",
        "setTotalSleep",
        "getTotalSolarPower",
        "setTotalSolarPower",
        "getTotalSteps",
        "setTotalSteps",
        "getTotalThermalPower",
        "setTotalThermalPower",
        "component1",
        "component10",
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
        "isBatteryValid",
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
.field private batteryPercent:F

.field private heartRate:J

.field private settingsData:Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;

.field private skinTemp:F

.field private totalActiveCalories:I

.field private totalDistance:F

.field private totalSleep:I

.field private totalSolarPower:I

.field private totalSteps:I

.field private totalThermalPower:I


# direct methods
.method public constructor <init>()V
    .locals 14

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v12, 0x3ff

    const/4 v13, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v13}, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;-><init>(IIIFIIJFFLpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIIFIIJFFLpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;)V
    .locals 0

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->totalSteps:I

    .line 71
    iput p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->totalActiveCalories:I

    .line 72
    iput p3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->totalSleep:I

    .line 73
    iput p4, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->totalDistance:F

    .line 74
    iput p5, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->totalSolarPower:I

    .line 75
    iput p6, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->totalThermalPower:I

    .line 76
    iput-wide p7, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->heartRate:J

    .line 77
    iput p9, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->skinTemp:F

    .line 78
    iput p10, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->batteryPercent:F

    .line 79
    iput-object p11, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->settingsData:Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;

    return-void
.end method

.method public synthetic constructor <init>(IIIFIIJFFLpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 11

    move/from16 v0, p12

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    move v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    move v3, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_2

    const/4 v4, 0x0

    goto :goto_2

    :cond_2
    move v4, p3

    :goto_2
    and-int/lit8 v5, v0, 0x8

    const/4 v6, 0x0

    if-eqz v5, :cond_3

    const/4 v5, 0x0

    goto :goto_3

    :cond_3
    move v5, p4

    :goto_3
    and-int/lit8 v7, v0, 0x10

    if-eqz v7, :cond_4

    const/4 v7, 0x0

    goto :goto_4

    :cond_4
    move/from16 v7, p5

    :goto_4
    and-int/lit8 v8, v0, 0x20

    if-eqz v8, :cond_5

    goto :goto_5

    :cond_5
    move/from16 v2, p6

    :goto_5
    and-int/lit8 v8, v0, 0x40

    if-eqz v8, :cond_6

    const-wide/16 v8, 0x0

    goto :goto_6

    :cond_6
    move-wide/from16 v8, p7

    :goto_6
    and-int/lit16 v10, v0, 0x80

    if-eqz v10, :cond_7

    goto :goto_7

    :cond_7
    move/from16 v6, p9

    :goto_7
    and-int/lit16 v10, v0, 0x100

    if-eqz v10, :cond_8

    const/4 v10, 0x1

    goto :goto_8

    :cond_8
    move/from16 v10, p10

    :goto_8
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_9

    const/4 v0, 0x0

    goto :goto_9

    :cond_9
    move-object/from16 v0, p11

    :goto_9
    move-object p1, p0

    move p2, v1

    move p3, v3

    move p4, v4

    move/from16 p5, v5

    move/from16 p6, v7

    move/from16 p7, v2

    move-wide/from16 p8, v8

    move/from16 p10, v6

    move/from16 p11, v10

    move-object/from16 p12, v0

    .line 70
    invoke-direct/range {p1 .. p12}, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;-><init>(IIIFIIJFFLpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;)V

    return-void
.end method

.method public static synthetic copy$default(Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;IIIFIIJFFLpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;
    .locals 12

    move-object v0, p0

    move/from16 v1, p12

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget v2, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->totalSteps:I

    goto :goto_0

    :cond_0
    move v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget v3, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->totalActiveCalories:I

    goto :goto_1

    :cond_1
    move v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget v4, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->totalSleep:I

    goto :goto_2

    :cond_2
    move v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget v5, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->totalDistance:F

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget v6, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->totalSolarPower:I

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget v7, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->totalThermalPower:I

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-wide v8, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->heartRate:J

    goto :goto_6

    :cond_6
    move-wide/from16 v8, p7

    :goto_6
    and-int/lit16 v10, v1, 0x80

    if-eqz v10, :cond_7

    iget v10, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->skinTemp:F

    goto :goto_7

    :cond_7
    move/from16 v10, p9

    :goto_7
    and-int/lit16 v11, v1, 0x100

    if-eqz v11, :cond_8

    iget v11, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->batteryPercent:F

    goto :goto_8

    :cond_8
    move/from16 v11, p10

    :goto_8
    and-int/lit16 v1, v1, 0x200

    if-eqz v1, :cond_9

    iget-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->settingsData:Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;

    goto :goto_9

    :cond_9
    move-object/from16 v1, p11

    :goto_9
    move p1, v2

    move p2, v3

    move p3, v4

    move/from16 p4, v5

    move/from16 p5, v6

    move/from16 p6, v7

    move-wide/from16 p7, v8

    move/from16 p9, v10

    move/from16 p10, v11

    move-object/from16 p11, v1

    invoke-virtual/range {p0 .. p11}, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->copy(IIIFIIJFFLpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;)Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->totalSteps:I

    return v0
.end method

.method public final component10()Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->settingsData:Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->totalActiveCalories:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->totalSleep:I

    return v0
.end method

.method public final component4()F
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->totalDistance:F

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->totalSolarPower:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->totalThermalPower:I

    return v0
.end method

.method public final component7()J
    .locals 2

    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->heartRate:J

    return-wide v0
.end method

.method public final component8()F
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->skinTemp:F

    return v0
.end method

.method public final component9()F
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->batteryPercent:F

    return v0
.end method

.method public final copy(IIIFIIJFFLpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;)Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;
    .locals 13

    new-instance v12, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;

    move-object v0, v12

    move v1, p1

    move v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    move/from16 v6, p6

    move-wide/from16 v7, p7

    move/from16 v9, p9

    move/from16 v10, p10

    move-object/from16 v11, p11

    invoke-direct/range {v0 .. v11}, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;-><init>(IIIFIIJFFLpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;)V

    return-object v12
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->totalSteps:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->totalSteps:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->totalActiveCalories:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->totalActiveCalories:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->totalSleep:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->totalSleep:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->totalDistance:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->totalDistance:F

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->totalSolarPower:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->totalSolarPower:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->totalThermalPower:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->totalThermalPower:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-wide v3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->heartRate:J

    iget-wide v5, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->heartRate:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->skinTemp:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->skinTemp:F

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->batteryPercent:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->batteryPercent:F

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->settingsData:Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;

    iget-object p1, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->settingsData:Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getBatteryPercent()F
    .locals 1

    .line 78
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->batteryPercent:F

    return v0
.end method

.method public final getHeartRate()J
    .locals 2

    .line 76
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->heartRate:J

    return-wide v0
.end method

.method public final getSettingsData()Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;
    .locals 1

    .line 79
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->settingsData:Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;

    return-object v0
.end method

.method public final getSkinTemp()F
    .locals 1

    .line 77
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->skinTemp:F

    return v0
.end method

.method public final getTotalActiveCalories()I
    .locals 1

    .line 71
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->totalActiveCalories:I

    return v0
.end method

.method public final getTotalDistance()F
    .locals 1

    .line 73
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->totalDistance:F

    return v0
.end method

.method public final getTotalSleep()I
    .locals 1

    .line 72
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->totalSleep:I

    return v0
.end method

.method public final getTotalSolarPower()I
    .locals 1

    .line 74
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->totalSolarPower:I

    return v0
.end method

.method public final getTotalSteps()I
    .locals 1

    .line 70
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->totalSteps:I

    return v0
.end method

.method public final getTotalThermalPower()I
    .locals 1

    .line 75
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->totalThermalPower:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->totalSteps:I

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->totalActiveCalories:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->totalSleep:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->totalDistance:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->totalSolarPower:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->totalThermalPower:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->heartRate:J

    invoke-static {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter$SleepSession-$$ExternalSynthetic0;->m0(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->skinTemp:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->batteryPercent:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->settingsData:Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public final isBatteryValid()Z
    .locals 3

    .line 80
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->batteryPercent:F

    const/4 v1, 0x1

    const/4 v2, 0x1

    cmpg-float v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    xor-int/2addr v0, v1

    return v0
.end method

.method public final setBatteryPercent(F)V
    .locals 0

    .line 78
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->batteryPercent:F

    return-void
.end method

.method public final setHeartRate(J)V
    .locals 0

    .line 76
    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->heartRate:J

    return-void
.end method

.method public final setSettingsData(Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;)V
    .locals 0

    .line 79
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->settingsData:Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;

    return-void
.end method

.method public final setSkinTemp(F)V
    .locals 0

    .line 77
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->skinTemp:F

    return-void
.end method

.method public final setTotalActiveCalories(I)V
    .locals 0

    .line 71
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->totalActiveCalories:I

    return-void
.end method

.method public final setTotalDistance(F)V
    .locals 0

    .line 73
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->totalDistance:F

    return-void
.end method

.method public final setTotalSleep(I)V
    .locals 0

    .line 72
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->totalSleep:I

    return-void
.end method

.method public final setTotalSolarPower(I)V
    .locals 0

    .line 74
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->totalSolarPower:I

    return-void
.end method

.method public final setTotalSteps(I)V
    .locals 0

    .line 70
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->totalSteps:I

    return-void
.end method

.method public final setTotalThermalPower(I)V
    .locals 0

    .line 75
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->totalThermalPower:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RealtimeWatchData(totalSteps="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->totalSteps:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", totalActiveCalories="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->totalActiveCalories:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", totalSleep="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->totalSleep:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", totalDistance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->totalDistance:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", totalSolarPower="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->totalSolarPower:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", totalThermalPower="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->totalThermalPower:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", heartRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->heartRate:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", skinTemp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->skinTemp:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", batteryPercent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->batteryPercent:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", settingsData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->settingsData:Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
