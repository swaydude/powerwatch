.class public final Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;
.super Ljava/lang/Object;
.source "WatchLogModels.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepBaseLog;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SaveSync;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/UserSpecificData;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\t\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008M\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0008\u0087\u0008\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u00cd\u0001\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0012\u0012\u0008\u0008\u0001\u0010\u0013\u001a\u00020\u0014\u0012\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u0017\u0012\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u0012\u0012\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u0012\u0012\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u0012\u0012\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u001c\u0012\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u0012\u00a2\u0006\u0002\u0010\u001eJ\t\u0010S\u001a\u00020\u0005H\u00c6\u0003J\t\u0010T\u001a\u00020\u0008H\u00c6\u0003J\t\u0010U\u001a\u00020\u0008H\u00c6\u0003J\t\u0010V\u001a\u00020\u0012H\u00c6\u0003J\t\u0010W\u001a\u00020\u0014H\u00c6\u0003J\t\u0010X\u001a\u00020\u0008H\u00c6\u0003J\t\u0010Y\u001a\u00020\u0017H\u00c6\u0003J\t\u0010Z\u001a\u00020\u0012H\u00c6\u0003J\t\u0010[\u001a\u00020\u0012H\u00c6\u0003J\t\u0010\\\u001a\u00020\u0012H\u00c6\u0003J\t\u0010]\u001a\u00020\u001cH\u00c6\u0003J\t\u0010^\u001a\u00020\u0005H\u00c6\u0003J\t\u0010_\u001a\u00020\u0012H\u00c6\u0003J\t\u0010`\u001a\u00020\u0008H\u00c6\u0003J\t\u0010a\u001a\u00020\u0008H\u00c6\u0003J\t\u0010b\u001a\u00020\u0008H\u00c6\u0003J\t\u0010c\u001a\u00020\u0008H\u00c6\u0003J\t\u0010d\u001a\u00020\u0008H\u00c6\u0003J\t\u0010e\u001a\u00020\u0008H\u00c6\u0003J\t\u0010f\u001a\u00020\u0008H\u00c6\u0003J\u00d1\u0001\u0010g\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00082\u0008\u0008\u0002\u0010\r\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00122\u0008\u0008\u0003\u0010\u0013\u001a\u00020\u00142\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00172\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00122\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u00122\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u00122\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u001c2\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u0012H\u00c6\u0001J\u0013\u0010h\u001a\u00020\u00172\u0008\u0010i\u001a\u0004\u0018\u00010jH\u00d6\u0003J\t\u0010k\u001a\u00020\u0012H\u00d6\u0001J\t\u0010l\u001a\u00020\u001cH\u00d6\u0001R\u001a\u0010\u0011\u001a\u00020\u0012X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001f\u0010 \"\u0004\u0008!\u0010\"R\u001a\u0010\u0018\u001a\u00020\u0012X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008#\u0010 \"\u0004\u0008$\u0010\"R\u001a\u0010\t\u001a\u00020\u0008X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008%\u0010&\"\u0004\u0008\'\u0010(R\u001a\u0010\u000e\u001a\u00020\u0008X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008)\u0010&\"\u0004\u0008*\u0010(R\u001e\u0010\u001b\u001a\u00020\u001c8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008+\u0010,\"\u0004\u0008-\u0010.R\u001a\u0010\u0006\u001a\u00020\u0005X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008/\u00100\"\u0004\u00081\u00102R\u001a\u0010\u0007\u001a\u00020\u0008X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00083\u0010&\"\u0004\u00084\u0010(R\u001a\u0010\u0015\u001a\u00020\u0008X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00085\u0010&\"\u0004\u00086\u0010(R\u001e\u0010\u000f\u001a\u00020\u00088\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00087\u0010&\"\u0004\u00088\u0010(R\u001e\u0010\u001a\u001a\u00020\u00128\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00089\u0010 \"\u0004\u0008:\u0010\"R\u001a\u0010\u000c\u001a\u00020\u0008X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008;\u0010&\"\u0004\u0008<\u0010(R\u001e\u0010\u0010\u001a\u00020\u00088\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008=\u0010&\"\u0004\u0008>\u0010(R\u001e\u0010\u0019\u001a\u00020\u00128\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008?\u0010 \"\u0004\u0008@\u0010\"R\u001a\u0010\r\u001a\u00020\u0008X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008A\u0010&\"\u0004\u0008B\u0010(R\u001e\u0010\u001d\u001a\u00020\u00128\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008C\u0010 \"\u0004\u0008D\u0010\"R\u001a\u0010\u0016\u001a\u00020\u0017X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008E\u0010F\"\u0004\u0008G\u0010HR\u001a\u0010\u000b\u001a\u00020\u0008X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008I\u0010&\"\u0004\u0008J\u0010(R\u001a\u0010\u0013\u001a\u00020\u0014X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008K\u0010L\"\u0004\u0008M\u0010NR\u001a\u0010\n\u001a\u00020\u0008X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008O\u0010&\"\u0004\u0008P\u0010(R\u001e\u0010\u0004\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008Q\u00100\"\u0004\u0008R\u00102\u00a8\u0006m"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepBaseLog;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SaveSync;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/UserSpecificData;",
        "startTime",
        "",
        "endTime",
        "heartRate",
        "",
        "bodyPower",
        "solarPower",
        "skinTemp",
        "maxSkinTemp",
        "minSkinTemp",
        "caseTemp",
        "maxCaseTemp",
        "minCaseTemp",
        "activeCalories",
        "",
        "sleepType",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;",
        "hrv",
        "shouldSend",
        "",
        "bmrCalories",
        "minHeartRate",
        "maxHeartRate",
        "email",
        "",
        "minsInPeriod",
        "(JJFFFFFFFFFILpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;FZIIILjava/lang/String;I)V",
        "getActiveCalories",
        "()I",
        "setActiveCalories",
        "(I)V",
        "getBmrCalories",
        "setBmrCalories",
        "getBodyPower",
        "()F",
        "setBodyPower",
        "(F)V",
        "getCaseTemp",
        "setCaseTemp",
        "getEmail",
        "()Ljava/lang/String;",
        "setEmail",
        "(Ljava/lang/String;)V",
        "getEndTime",
        "()J",
        "setEndTime",
        "(J)V",
        "getHeartRate",
        "setHeartRate",
        "getHrv",
        "setHrv",
        "getMaxCaseTemp",
        "setMaxCaseTemp",
        "getMaxHeartRate",
        "setMaxHeartRate",
        "getMaxSkinTemp",
        "setMaxSkinTemp",
        "getMinCaseTemp",
        "setMinCaseTemp",
        "getMinHeartRate",
        "setMinHeartRate",
        "getMinSkinTemp",
        "setMinSkinTemp",
        "getMinsInPeriod",
        "setMinsInPeriod",
        "getShouldSend",
        "()Z",
        "setShouldSend",
        "(Z)V",
        "getSkinTemp",
        "setSkinTemp",
        "getSleepType",
        "()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;",
        "setSleepType",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;)V",
        "getSolarPower",
        "setSolarPower",
        "getStartTime",
        "setStartTime",
        "component1",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "component17",
        "component18",
        "component19",
        "component2",
        "component20",
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
        "",
        "hashCode",
        "toString",
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

.field private bmrCalories:I

.field private bodyPower:F

.field private caseTemp:F

.field private email:Ljava/lang/String;
    .annotation runtime Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/GsonExclude;
    .end annotation
.end field

.field private endTime:J

.field private heartRate:F

.field private hrv:F

.field private maxCaseTemp:F
    .annotation runtime Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/GsonExclude;
    .end annotation
.end field

.field private maxHeartRate:I
    .annotation runtime Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/GsonExclude;
    .end annotation
.end field

.field private maxSkinTemp:F

.field private minCaseTemp:F
    .annotation runtime Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/GsonExclude;
    .end annotation
.end field

.field private minHeartRate:I
    .annotation runtime Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/GsonExclude;
    .end annotation
.end field

.field private minSkinTemp:F

.field private minsInPeriod:I
    .annotation runtime Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/GsonExclude;
    .end annotation
.end field

.field private shouldSend:Z

.field private skinTemp:F

.field private sleepType:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;

.field private solarPower:F

.field private startTime:J


# direct methods
.method public constructor <init>(JJFFFFFFFFFILpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;FZIIILjava/lang/String;I)V
    .locals 5

    move-object v0, p0

    move-object/from16 v1, p15

    move-object/from16 v2, p21

    const-string v3, "sleepType"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "email"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-wide v3, p1

    .line 103
    iput-wide v3, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->startTime:J

    move-wide v3, p3

    .line 104
    iput-wide v3, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->endTime:J

    move v3, p5

    .line 105
    iput v3, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->heartRate:F

    move v3, p6

    .line 106
    iput v3, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->bodyPower:F

    move v3, p7

    .line 107
    iput v3, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->solarPower:F

    move v3, p8

    .line 108
    iput v3, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->skinTemp:F

    move v3, p9

    .line 109
    iput v3, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->maxSkinTemp:F

    move v3, p10

    .line 110
    iput v3, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->minSkinTemp:F

    move/from16 v3, p11

    .line 111
    iput v3, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->caseTemp:F

    move/from16 v3, p12

    .line 112
    iput v3, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->maxCaseTemp:F

    move/from16 v3, p13

    .line 113
    iput v3, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->minCaseTemp:F

    move/from16 v3, p14

    .line 114
    iput v3, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->activeCalories:I

    .line 115
    iput-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->sleepType:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;

    move/from16 v1, p16

    .line 117
    iput v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->hrv:F

    move/from16 v1, p17

    .line 118
    iput-boolean v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->shouldSend:Z

    move/from16 v1, p18

    .line 119
    iput v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->bmrCalories:I

    move/from16 v1, p19

    .line 120
    iput v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->minHeartRate:I

    move/from16 v1, p20

    .line 121
    iput v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->maxHeartRate:I

    .line 122
    iput-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->email:Ljava/lang/String;

    move/from16 v1, p22

    .line 123
    iput v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->minsInPeriod:I

    return-void
.end method

.method public synthetic constructor <init>(JJFFFFFFFFFILpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;FZIIILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 27

    move/from16 v0, p23

    and-int/lit8 v1, v0, 0x1

    const-wide/16 v2, 0x0

    if-eqz v1, :cond_0

    move-wide v5, v2

    goto :goto_0

    :cond_0
    move-wide/from16 v5, p1

    :goto_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    move-wide v7, v2

    goto :goto_1

    :cond_1
    move-wide/from16 v7, p3

    :goto_1
    and-int/lit8 v1, v0, 0x4

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    const/4 v9, 0x0

    goto :goto_2

    :cond_2
    move/from16 v9, p5

    :goto_2
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_3

    const/4 v10, 0x0

    goto :goto_3

    :cond_3
    move/from16 v10, p6

    :goto_3
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_4

    const/4 v11, 0x0

    goto :goto_4

    :cond_4
    move/from16 v11, p7

    :goto_4
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_5

    const/4 v12, 0x0

    goto :goto_5

    :cond_5
    move/from16 v12, p8

    :goto_5
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_6

    move v13, v12

    goto :goto_6

    :cond_6
    move/from16 v13, p9

    :goto_6
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_7

    move v14, v12

    goto :goto_7

    :cond_7
    move/from16 v14, p10

    :goto_7
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_8

    const/4 v15, 0x0

    goto :goto_8

    :cond_8
    move/from16 v15, p11

    :goto_8
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_9

    move/from16 v16, v15

    goto :goto_9

    :cond_9
    move/from16 v16, p12

    :goto_9
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_a

    move/from16 v17, v15

    goto :goto_a

    :cond_a
    move/from16 v17, p13

    :goto_a
    and-int/lit16 v1, v0, 0x800

    const/4 v3, 0x0

    if-eqz v1, :cond_b

    const/16 v18, 0x0

    goto :goto_b

    :cond_b
    move/from16 v18, p14

    :goto_b
    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_c

    const/16 v20, 0x0

    goto :goto_c

    :cond_c
    move/from16 v20, p16

    :goto_c
    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_d

    const/16 v21, 0x0

    goto :goto_d

    :cond_d
    move/from16 v21, p17

    :goto_d
    const v1, 0x8000

    and-int/2addr v1, v0

    if-eqz v1, :cond_e

    const/16 v22, 0x0

    goto :goto_e

    :cond_e
    move/from16 v22, p18

    :goto_e
    const/high16 v1, 0x10000

    and-int/2addr v1, v0

    if-eqz v1, :cond_f

    const/16 v23, 0x0

    goto :goto_f

    :cond_f
    move/from16 v23, p19

    :goto_f
    const/high16 v1, 0x20000

    and-int/2addr v1, v0

    if-eqz v1, :cond_10

    const/16 v24, 0x0

    goto :goto_10

    :cond_10
    move/from16 v24, p20

    :goto_10
    const/high16 v1, 0x40000

    and-int/2addr v1, v0

    if-eqz v1, :cond_11

    const-string v1, ""

    move-object/from16 v25, v1

    goto :goto_11

    :cond_11
    move-object/from16 v25, p21

    :goto_11
    const/high16 v1, 0x80000

    and-int/2addr v0, v1

    if-eqz v0, :cond_12

    const/16 v26, 0x0

    goto :goto_12

    :cond_12
    move/from16 v26, p22

    :goto_12
    move-object/from16 v4, p0

    move-object/from16 v19, p15

    .line 103
    invoke-direct/range {v4 .. v26}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;-><init>(JJFFFFFFFFFILpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;FZIIILjava/lang/String;I)V

    return-void
.end method

.method public static synthetic copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;JJFFFFFFFFFILpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;FZIIILjava/lang/String;IILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;
    .locals 21

    move/from16 v0, p23

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getStartTime()J

    move-result-wide v1

    goto :goto_0

    :cond_0
    move-wide/from16 v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getEndTime()J

    move-result-wide v3

    goto :goto_1

    :cond_1
    move-wide/from16 v3, p3

    :goto_1
    and-int/lit8 v5, v0, 0x4

    if-eqz v5, :cond_2

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getHeartRate()F

    move-result v5

    goto :goto_2

    :cond_2
    move/from16 v5, p5

    :goto_2
    and-int/lit8 v6, v0, 0x8

    if-eqz v6, :cond_3

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getBodyPower()F

    move-result v6

    goto :goto_3

    :cond_3
    move/from16 v6, p6

    :goto_3
    and-int/lit8 v7, v0, 0x10

    if-eqz v7, :cond_4

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getSolarPower()F

    move-result v7

    goto :goto_4

    :cond_4
    move/from16 v7, p7

    :goto_4
    and-int/lit8 v8, v0, 0x20

    if-eqz v8, :cond_5

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getSkinTemp()F

    move-result v8

    goto :goto_5

    :cond_5
    move/from16 v8, p8

    :goto_5
    and-int/lit8 v9, v0, 0x40

    if-eqz v9, :cond_6

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getMaxSkinTemp()F

    move-result v9

    goto :goto_6

    :cond_6
    move/from16 v9, p9

    :goto_6
    and-int/lit16 v10, v0, 0x80

    if-eqz v10, :cond_7

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getMinSkinTemp()F

    move-result v10

    goto :goto_7

    :cond_7
    move/from16 v10, p10

    :goto_7
    and-int/lit16 v11, v0, 0x100

    if-eqz v11, :cond_8

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getCaseTemp()F

    move-result v11

    goto :goto_8

    :cond_8
    move/from16 v11, p11

    :goto_8
    and-int/lit16 v12, v0, 0x200

    if-eqz v12, :cond_9

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getMaxCaseTemp()F

    move-result v12

    goto :goto_9

    :cond_9
    move/from16 v12, p12

    :goto_9
    and-int/lit16 v13, v0, 0x400

    if-eqz v13, :cond_a

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getMinCaseTemp()F

    move-result v13

    goto :goto_a

    :cond_a
    move/from16 v13, p13

    :goto_a
    and-int/lit16 v14, v0, 0x800

    if-eqz v14, :cond_b

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getActiveCalories()I

    move-result v14

    goto :goto_b

    :cond_b
    move/from16 v14, p14

    :goto_b
    and-int/lit16 v15, v0, 0x1000

    if-eqz v15, :cond_c

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getSleepType()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;

    move-result-object v15

    goto :goto_c

    :cond_c
    move-object/from16 v15, p15

    :goto_c
    move-object/from16 p15, v15

    and-int/lit16 v15, v0, 0x2000

    if-eqz v15, :cond_d

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getHrv()F

    move-result v15

    goto :goto_d

    :cond_d
    move/from16 v15, p16

    :goto_d
    move/from16 p16, v15

    and-int/lit16 v15, v0, 0x4000

    if-eqz v15, :cond_e

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getShouldSend()Z

    move-result v15

    goto :goto_e

    :cond_e
    move/from16 v15, p17

    :goto_e
    const v16, 0x8000

    and-int v16, v0, v16

    if-eqz v16, :cond_f

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getBmrCalories()I

    move-result v16

    goto :goto_f

    :cond_f
    move/from16 v16, p18

    :goto_f
    const/high16 v17, 0x10000

    and-int v17, v0, v17

    if-eqz v17, :cond_10

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getMinHeartRate()I

    move-result v17

    goto :goto_10

    :cond_10
    move/from16 v17, p19

    :goto_10
    const/high16 v18, 0x20000

    and-int v18, v0, v18

    if-eqz v18, :cond_11

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getMaxHeartRate()I

    move-result v18

    goto :goto_11

    :cond_11
    move/from16 v18, p20

    :goto_11
    const/high16 v19, 0x40000

    and-int v19, v0, v19

    if-eqz v19, :cond_12

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getEmail()Ljava/lang/String;

    move-result-object v19

    goto :goto_12

    :cond_12
    move-object/from16 v19, p21

    :goto_12
    const/high16 v20, 0x80000

    and-int v0, v0, v20

    if-eqz v0, :cond_13

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getMinsInPeriod()I

    move-result v0

    goto :goto_13

    :cond_13
    move/from16 v0, p22

    :goto_13
    move-wide/from16 p1, v1

    move-wide/from16 p3, v3

    move/from16 p5, v5

    move/from16 p6, v6

    move/from16 p7, v7

    move/from16 p8, v8

    move/from16 p9, v9

    move/from16 p10, v10

    move/from16 p11, v11

    move/from16 p12, v12

    move/from16 p13, v13

    move/from16 p14, v14

    move/from16 p17, v15

    move/from16 p18, v16

    move/from16 p19, v17

    move/from16 p20, v18

    move-object/from16 p21, v19

    move/from16 p22, v0

    invoke-virtual/range {p0 .. p22}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->copy(JJFFFFFFFFFILpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;FZIIILjava/lang/String;I)Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getStartTime()J

    move-result-wide v0

    return-wide v0
.end method

.method public final component10()F
    .locals 1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getMaxCaseTemp()F

    move-result v0

    return v0
.end method

.method public final component11()F
    .locals 1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getMinCaseTemp()F

    move-result v0

    return v0
.end method

.method public final component12()I
    .locals 1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getActiveCalories()I

    move-result v0

    return v0
.end method

.method public final component13()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;
    .locals 1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getSleepType()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;

    move-result-object v0

    return-object v0
.end method

.method public final component14()F
    .locals 1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getHrv()F

    move-result v0

    return v0
.end method

.method public final component15()Z
    .locals 1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getShouldSend()Z

    move-result v0

    return v0
.end method

.method public final component16()I
    .locals 1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getBmrCalories()I

    move-result v0

    return v0
.end method

.method public final component17()I
    .locals 1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getMinHeartRate()I

    move-result v0

    return v0
.end method

.method public final component18()I
    .locals 1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getMaxHeartRate()I

    move-result v0

    return v0
.end method

.method public final component19()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getEmail()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final component2()J
    .locals 2

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getEndTime()J

    move-result-wide v0

    return-wide v0
.end method

.method public final component20()I
    .locals 1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getMinsInPeriod()I

    move-result v0

    return v0
.end method

.method public final component3()F
    .locals 1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getHeartRate()F

    move-result v0

    return v0
.end method

.method public final component4()F
    .locals 1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getBodyPower()F

    move-result v0

    return v0
.end method

.method public final component5()F
    .locals 1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getSolarPower()F

    move-result v0

    return v0
.end method

.method public final component6()F
    .locals 1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getSkinTemp()F

    move-result v0

    return v0
.end method

.method public final component7()F
    .locals 1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getMaxSkinTemp()F

    move-result v0

    return v0
.end method

.method public final component8()F
    .locals 1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getMinSkinTemp()F

    move-result v0

    return v0
.end method

.method public final component9()F
    .locals 1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getCaseTemp()F

    move-result v0

    return v0
.end method

.method public final copy(JJFFFFFFFFFILpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;FZIIILjava/lang/String;I)Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;
    .locals 24

    move-wide/from16 v1, p1

    move-wide/from16 v3, p3

    move/from16 v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    move/from16 v10, p10

    move/from16 v11, p11

    move/from16 v12, p12

    move/from16 v13, p13

    move/from16 v14, p14

    move-object/from16 v15, p15

    move/from16 v16, p16

    move/from16 v17, p17

    move/from16 v18, p18

    move/from16 v19, p19

    move/from16 v20, p20

    move-object/from16 v21, p21

    move/from16 v22, p22

    const-string v0, "sleepType"

    move-object/from16 v1, p15

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "email"

    move-object/from16 v1, p21

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v23, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;

    move-object/from16 v0, v23

    move-wide/from16 v1, p1

    invoke-direct/range {v0 .. v22}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;-><init>(JJFFFFFFFFFILpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;FZIIILjava/lang/String;I)V

    return-object v23
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getStartTime()J

    move-result-wide v3

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getStartTime()J

    move-result-wide v5

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getEndTime()J

    move-result-wide v3

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getEndTime()J

    move-result-wide v5

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getHeartRate()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getHeartRate()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getBodyPower()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getBodyPower()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getSolarPower()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getSolarPower()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getSkinTemp()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getSkinTemp()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getMaxSkinTemp()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getMaxSkinTemp()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getMinSkinTemp()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getMinSkinTemp()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getCaseTemp()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getCaseTemp()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getMaxCaseTemp()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getMaxCaseTemp()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getMinCaseTemp()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getMinCaseTemp()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getActiveCalories()I

    move-result v1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getActiveCalories()I

    move-result v3

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getSleepType()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;

    move-result-object v1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getSleepType()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;

    move-result-object v3

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getHrv()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getHrv()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getShouldSend()Z

    move-result v1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getShouldSend()Z

    move-result v3

    if-eq v1, v3, :cond_10

    return v2

    :cond_10
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getBmrCalories()I

    move-result v1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getBmrCalories()I

    move-result v3

    if-eq v1, v3, :cond_11

    return v2

    :cond_11
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getMinHeartRate()I

    move-result v1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getMinHeartRate()I

    move-result v3

    if-eq v1, v3, :cond_12

    return v2

    :cond_12
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getMaxHeartRate()I

    move-result v1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getMaxHeartRate()I

    move-result v3

    if-eq v1, v3, :cond_13

    return v2

    :cond_13
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getEmail()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getEmail()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getMinsInPeriod()I

    move-result v1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getMinsInPeriod()I

    move-result p1

    if-eq v1, p1, :cond_15

    return v2

    :cond_15
    return v0
.end method

.method public getActiveCalories()I
    .locals 1

    .line 114
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->activeCalories:I

    return v0
.end method

.method public getBmrCalories()I
    .locals 1

    .line 119
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->bmrCalories:I

    return v0
.end method

.method public getBodyPower()F
    .locals 1

    .line 106
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->bodyPower:F

    return v0
.end method

.method public getCaseTemp()F
    .locals 1

    .line 111
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->caseTemp:F

    return v0
.end method

.method public getEmail()Ljava/lang/String;
    .locals 1

    .line 122
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->email:Ljava/lang/String;

    return-object v0
.end method

.method public getEndTime()J
    .locals 2

    .line 104
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->endTime:J

    return-wide v0
.end method

.method public getHeartRate()F
    .locals 1

    .line 105
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->heartRate:F

    return v0
.end method

.method public getHrv()F
    .locals 1

    .line 117
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->hrv:F

    return v0
.end method

.method public getMaxCaseTemp()F
    .locals 1

    .line 112
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->maxCaseTemp:F

    return v0
.end method

.method public getMaxHeartRate()I
    .locals 1

    .line 121
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->maxHeartRate:I

    return v0
.end method

.method public getMaxSkinTemp()F
    .locals 1

    .line 109
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->maxSkinTemp:F

    return v0
.end method

.method public getMinCaseTemp()F
    .locals 1

    .line 113
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->minCaseTemp:F

    return v0
.end method

.method public getMinHeartRate()I
    .locals 1

    .line 120
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->minHeartRate:I

    return v0
.end method

.method public getMinSkinTemp()F
    .locals 1

    .line 110
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->minSkinTemp:F

    return v0
.end method

.method public getMinsInPeriod()I
    .locals 1

    .line 123
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->minsInPeriod:I

    return v0
.end method

.method public getShouldSend()Z
    .locals 1

    .line 118
    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->shouldSend:Z

    return v0
.end method

.method public getSkinTemp()F
    .locals 1

    .line 108
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->skinTemp:F

    return v0
.end method

.method public getSleepType()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;
    .locals 1

    .line 116
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->sleepType:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;

    return-object v0
.end method

.method public getSolarPower()F
    .locals 1

    .line 107
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->solarPower:F

    return v0
.end method

.method public getStartTime()J
    .locals 2

    .line 103
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->startTime:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter$SleepSession-$$ExternalSynthetic0;->m0(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getEndTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter$SleepSession-$$ExternalSynthetic0;->m0(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getHeartRate()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getBodyPower()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getSolarPower()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getSkinTemp()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getMaxSkinTemp()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getMinSkinTemp()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getCaseTemp()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getMaxCaseTemp()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getMinCaseTemp()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getActiveCalories()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getSleepType()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;

    move-result-object v1

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getHrv()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getShouldSend()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    :cond_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getBmrCalories()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getMinHeartRate()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getMaxHeartRate()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getEmail()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getMinsInPeriod()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public setActiveCalories(I)V
    .locals 0

    .line 114
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->activeCalories:I

    return-void
.end method

.method public setBmrCalories(I)V
    .locals 0

    .line 119
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->bmrCalories:I

    return-void
.end method

.method public setBodyPower(F)V
    .locals 0

    .line 106
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->bodyPower:F

    return-void
.end method

.method public setCaseTemp(F)V
    .locals 0

    .line 111
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->caseTemp:F

    return-void
.end method

.method public setEmail(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 122
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->email:Ljava/lang/String;

    return-void
.end method

.method public setEndTime(J)V
    .locals 0

    .line 104
    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->endTime:J

    return-void
.end method

.method public setHeartRate(F)V
    .locals 0

    .line 105
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->heartRate:F

    return-void
.end method

.method public setHrv(F)V
    .locals 0

    .line 117
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->hrv:F

    return-void
.end method

.method public setMaxCaseTemp(F)V
    .locals 0

    .line 112
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->maxCaseTemp:F

    return-void
.end method

.method public setMaxHeartRate(I)V
    .locals 0

    .line 121
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->maxHeartRate:I

    return-void
.end method

.method public setMaxSkinTemp(F)V
    .locals 0

    .line 109
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->maxSkinTemp:F

    return-void
.end method

.method public setMinCaseTemp(F)V
    .locals 0

    .line 113
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->minCaseTemp:F

    return-void
.end method

.method public setMinHeartRate(I)V
    .locals 0

    .line 120
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->minHeartRate:I

    return-void
.end method

.method public setMinSkinTemp(F)V
    .locals 0

    .line 110
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->minSkinTemp:F

    return-void
.end method

.method public setMinsInPeriod(I)V
    .locals 0

    .line 123
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->minsInPeriod:I

    return-void
.end method

.method public setShouldSend(Z)V
    .locals 0

    .line 118
    iput-boolean p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->shouldSend:Z

    return-void
.end method

.method public setSkinTemp(F)V
    .locals 0

    .line 108
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->skinTemp:F

    return-void
.end method

.method public setSleepType(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 116
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->sleepType:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;

    return-void
.end method

.method public setSolarPower(F)V
    .locals 0

    .line 107
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->solarPower:F

    return-void
.end method

.method public setStartTime(J)V
    .locals 0

    .line 103
    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->startTime:J

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SleepLog(startTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getStartTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", endTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getEndTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", heartRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getHeartRate()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", bodyPower="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getBodyPower()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", solarPower="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getSolarPower()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", skinTemp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getSkinTemp()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", maxSkinTemp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getMaxSkinTemp()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", minSkinTemp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getMinSkinTemp()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", caseTemp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getCaseTemp()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", maxCaseTemp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getMaxCaseTemp()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", minCaseTemp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getMinCaseTemp()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", activeCalories="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getActiveCalories()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", sleepType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getSleepType()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", hrv="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getHrv()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", shouldSend="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getShouldSend()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", bmrCalories="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getBmrCalories()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", minHeartRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getMinHeartRate()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", maxHeartRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getMaxHeartRate()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", email="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getEmail()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", minsInPeriod="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getMinsInPeriod()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
