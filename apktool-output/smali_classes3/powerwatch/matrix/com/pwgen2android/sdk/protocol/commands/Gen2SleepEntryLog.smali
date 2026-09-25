.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;
.super Ljava/lang/Object;
.source "Gen2Comands.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008$\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001BU\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u000cJ\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0006H\u00c6\u0003J\t\u0010$\u001a\u00020\u0006H\u00c6\u0003J\t\u0010%\u001a\u00020\u0006H\u00c6\u0003J\t\u0010&\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0006H\u00c6\u0003J\t\u0010(\u001a\u00020\u0006H\u00c6\u0003JY\u0010)\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00062\u0008\u0008\u0002\u0010\n\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010*\u001a\u00020+2\u0008\u0010,\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010-\u001a\u00020\u0006H\u00d6\u0001J\t\u0010.\u001a\u00020/H\u00d6\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0015\u0010\u0012\"\u0004\u0008\u0016\u0010\u0014R\u001a\u0010\n\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0017\u0010\u0012\"\u0004\u0008\u0018\u0010\u0014R\u001a\u0010\t\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0019\u0010\u0012\"\u0004\u0008\u001a\u0010\u0014R\u001a\u0010\u0008\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001b\u0010\u0012\"\u0004\u0008\u001c\u0010\u0014R\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001d\u0010\u0012\"\u0004\u0008\u001e\u0010\u0014R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001f\u0010\u000e\"\u0004\u0008 \u0010\u0010\u00a8\u00060"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;",
        "",
        "startSleepTime",
        "",
        "endSleepTime",
        "hoursSlept",
        "",
        "minutesSlept",
        "percentRestless",
        "percentLightSleep",
        "percentDeepSleep",
        "sleepQuality",
        "(JJIIIIII)V",
        "getEndSleepTime",
        "()J",
        "setEndSleepTime",
        "(J)V",
        "getHoursSlept",
        "()I",
        "setHoursSlept",
        "(I)V",
        "getMinutesSlept",
        "setMinutesSlept",
        "getPercentDeepSleep",
        "setPercentDeepSleep",
        "getPercentLightSleep",
        "setPercentLightSleep",
        "getPercentRestless",
        "setPercentRestless",
        "getSleepQuality",
        "setSleepQuality",
        "getStartSleepTime",
        "setStartSleepTime",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
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
.field private endSleepTime:J

.field private hoursSlept:I

.field private minutesSlept:I

.field private percentDeepSleep:I

.field private percentLightSleep:I

.field private percentRestless:I

.field private sleepQuality:I

.field private startSleepTime:J


# direct methods
.method public constructor <init>()V
    .locals 13

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v11, 0xff

    const/4 v12, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v12}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;-><init>(JJIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(JJIIIIII)V
    .locals 0

    .line 335
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->startSleepTime:J

    iput-wide p3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->endSleepTime:J

    .line 336
    iput p5, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->hoursSlept:I

    iput p6, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->minutesSlept:I

    iput p7, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->percentRestless:I

    .line 337
    iput p8, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->percentLightSleep:I

    iput p9, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->percentDeepSleep:I

    iput p10, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->sleepQuality:I

    return-void
.end method

.method public synthetic constructor <init>(JJIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 11

    move/from16 v0, p11

    and-int/lit8 v1, v0, 0x1

    const-wide/16 v2, 0x0

    if-eqz v1, :cond_0

    move-wide v4, v2

    goto :goto_0

    :cond_0
    move-wide v4, p1

    :goto_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    move-wide v2, p3

    :goto_1
    and-int/lit8 v1, v0, 0x4

    const/4 v6, 0x0

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    goto :goto_2

    :cond_2
    move/from16 v1, p5

    :goto_2
    and-int/lit8 v7, v0, 0x8

    if-eqz v7, :cond_3

    const/4 v7, 0x0

    goto :goto_3

    :cond_3
    move/from16 v7, p6

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
    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_7

    goto :goto_7

    :cond_7
    move/from16 v6, p10

    :goto_7
    move-object p1, p0

    move-wide p2, v4

    move-wide p4, v2

    move/from16 p6, v1

    move/from16 p7, v7

    move/from16 p8, v8

    move/from16 p9, v9

    move/from16 p10, v10

    move/from16 p11, v6

    .line 335
    invoke-direct/range {p1 .. p11}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;-><init>(JJIIIIII)V

    return-void
.end method

.method public static synthetic copy$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;JJIIIIIIILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;
    .locals 11

    move-object v0, p0

    move/from16 v1, p11

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-wide v2, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->startSleepTime:J

    goto :goto_0

    :cond_0
    move-wide v2, p1

    :goto_0
    and-int/lit8 v4, v1, 0x2

    if-eqz v4, :cond_1

    iget-wide v4, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->endSleepTime:J

    goto :goto_1

    :cond_1
    move-wide v4, p3

    :goto_1
    and-int/lit8 v6, v1, 0x4

    if-eqz v6, :cond_2

    iget v6, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->hoursSlept:I

    goto :goto_2

    :cond_2
    move/from16 v6, p5

    :goto_2
    and-int/lit8 v7, v1, 0x8

    if-eqz v7, :cond_3

    iget v7, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->minutesSlept:I

    goto :goto_3

    :cond_3
    move/from16 v7, p6

    :goto_3
    and-int/lit8 v8, v1, 0x10

    if-eqz v8, :cond_4

    iget v8, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->percentRestless:I

    goto :goto_4

    :cond_4
    move/from16 v8, p7

    :goto_4
    and-int/lit8 v9, v1, 0x20

    if-eqz v9, :cond_5

    iget v9, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->percentLightSleep:I

    goto :goto_5

    :cond_5
    move/from16 v9, p8

    :goto_5
    and-int/lit8 v10, v1, 0x40

    if-eqz v10, :cond_6

    iget v10, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->percentDeepSleep:I

    goto :goto_6

    :cond_6
    move/from16 v10, p9

    :goto_6
    and-int/lit16 v1, v1, 0x80

    if-eqz v1, :cond_7

    iget v1, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->sleepQuality:I

    goto :goto_7

    :cond_7
    move/from16 v1, p10

    :goto_7
    move-wide p1, v2

    move-wide p3, v4

    move/from16 p5, v6

    move/from16 p6, v7

    move/from16 p7, v8

    move/from16 p8, v9

    move/from16 p9, v10

    move/from16 p10, v1

    invoke-virtual/range {p0 .. p10}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->copy(JJIIIIII)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->startSleepTime:J

    return-wide v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->endSleepTime:J

    return-wide v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->hoursSlept:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->minutesSlept:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->percentRestless:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->percentLightSleep:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->percentDeepSleep:I

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->sleepQuality:I

    return v0
.end method

.method public final copy(JJIIIIII)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;
    .locals 12

    new-instance v11, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;

    move-object v0, v11

    move-wide v1, p1

    move-wide v3, p3

    move/from16 v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    move/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;-><init>(JJIIIIII)V

    return-object v11
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;

    iget-wide v3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->startSleepTime:J

    iget-wide v5, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->startSleepTime:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->endSleepTime:J

    iget-wide v5, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->endSleepTime:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->hoursSlept:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->hoursSlept:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->minutesSlept:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->minutesSlept:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->percentRestless:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->percentRestless:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->percentLightSleep:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->percentLightSleep:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->percentDeepSleep:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->percentDeepSleep:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->sleepQuality:I

    iget p1, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->sleepQuality:I

    if-eq v1, p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getEndSleepTime()J
    .locals 2

    .line 335
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->endSleepTime:J

    return-wide v0
.end method

.method public final getHoursSlept()I
    .locals 1

    .line 336
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->hoursSlept:I

    return v0
.end method

.method public final getMinutesSlept()I
    .locals 1

    .line 336
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->minutesSlept:I

    return v0
.end method

.method public final getPercentDeepSleep()I
    .locals 1

    .line 337
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->percentDeepSleep:I

    return v0
.end method

.method public final getPercentLightSleep()I
    .locals 1

    .line 337
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->percentLightSleep:I

    return v0
.end method

.method public final getPercentRestless()I
    .locals 1

    .line 336
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->percentRestless:I

    return v0
.end method

.method public final getSleepQuality()I
    .locals 1

    .line 337
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->sleepQuality:I

    return v0
.end method

.method public final getStartSleepTime()J
    .locals 2

    .line 335
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->startSleepTime:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->startSleepTime:J

    invoke-static {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter$SleepSession-$$ExternalSynthetic0;->m0(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->endSleepTime:J

    invoke-static {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter$SleepSession-$$ExternalSynthetic0;->m0(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->hoursSlept:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->minutesSlept:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->percentRestless:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->percentLightSleep:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->percentDeepSleep:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->sleepQuality:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final setEndSleepTime(J)V
    .locals 0

    .line 335
    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->endSleepTime:J

    return-void
.end method

.method public final setHoursSlept(I)V
    .locals 0

    .line 336
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->hoursSlept:I

    return-void
.end method

.method public final setMinutesSlept(I)V
    .locals 0

    .line 336
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->minutesSlept:I

    return-void
.end method

.method public final setPercentDeepSleep(I)V
    .locals 0

    .line 337
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->percentDeepSleep:I

    return-void
.end method

.method public final setPercentLightSleep(I)V
    .locals 0

    .line 337
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->percentLightSleep:I

    return-void
.end method

.method public final setPercentRestless(I)V
    .locals 0

    .line 336
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->percentRestless:I

    return-void
.end method

.method public final setSleepQuality(I)V
    .locals 0

    .line 337
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->sleepQuality:I

    return-void
.end method

.method public final setStartSleepTime(J)V
    .locals 0

    .line 335
    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->startSleepTime:J

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Gen2SleepEntryLog(startSleepTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->startSleepTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", endSleepTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->endSleepTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", hoursSlept="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->hoursSlept:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", minutesSlept="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->minutesSlept:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", percentRestless="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->percentRestless:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", percentLightSleep="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->percentLightSleep:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", percentDeepSleep="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->percentDeepSleep:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", sleepQuality="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;->sleepQuality:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
