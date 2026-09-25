.class public final Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;
.super Ljava/lang/Object;
.source "WatchLogModels.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingBaseLog;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SaveSync;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/UserSpecificData;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u000b\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008P\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0008\u0087\u0008\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u00d7\u0001\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u0018\u0012\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u001d\u0012\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u001fJ\t\u0010V\u001a\u00020\u0005H\u00c6\u0003J\t\u0010W\u001a\u00020\u000cH\u00c6\u0003J\t\u0010X\u001a\u00020\u000cH\u00c6\u0003J\t\u0010Y\u001a\u00020\u000cH\u00c6\u0003J\t\u0010Z\u001a\u00020\u000cH\u00c6\u0003J\t\u0010[\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\\\u001a\u00020\u000cH\u00c6\u0003J\t\u0010]\u001a\u00020\u0018H\u00c6\u0003J\t\u0010^\u001a\u00020\u0007H\u00c6\u0003J\t\u0010_\u001a\u00020\u0007H\u00c6\u0003J\t\u0010`\u001a\u00020\u0007H\u00c6\u0003J\t\u0010a\u001a\u00020\u0007H\u00c6\u0003J\t\u0010b\u001a\u00020\u001dH\u00c6\u0003J\t\u0010c\u001a\u00020\u0007H\u00c6\u0003J\t\u0010d\u001a\u00020\tH\u00c6\u0003J\t\u0010e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010f\u001a\u00020\u000cH\u00c6\u0003J\t\u0010g\u001a\u00020\u000cH\u00c6\u0003J\t\u0010h\u001a\u00020\u000cH\u00c6\u0003J\t\u0010i\u001a\u00020\u000cH\u00c6\u0003J\t\u0010j\u001a\u00020\u000cH\u00c6\u0003J\u00db\u0001\u0010k\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00182\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u001d2\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010l\u001a\u00020\u00182\u0008\u0010m\u001a\u0004\u0018\u00010nH\u00d6\u0003J\t\u0010o\u001a\u00020\u0007H\u00d6\u0001J\t\u0010p\u001a\u00020\u001dH\u00d6\u0001R\u001a\u0010\u0015\u001a\u00020\u0007X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008 \u0010!\"\u0004\u0008\"\u0010#R\u001a\u0010\u0019\u001a\u00020\u0007X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008$\u0010!\"\u0004\u0008%\u0010#R\u001a\u0010\r\u001a\u00020\u000cX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008&\u0010\'\"\u0004\u0008(\u0010)R\u001a\u0010\u0012\u001a\u00020\u000cX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008*\u0010\'\"\u0004\u0008+\u0010)R\u001a\u0010\u0008\u001a\u00020\tX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008,\u0010-\"\u0004\u0008.\u0010/R\u001e\u0010\u001c\u001a\u00020\u001d8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00080\u00101\"\u0004\u00082\u00103R\u001a\u0010\n\u001a\u00020\u0005X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00084\u00105\"\u0004\u00086\u00107R\u001a\u0010\u000b\u001a\u00020\u000cX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00088\u0010\'\"\u0004\u00089\u0010)R\u001a\u0010\u0016\u001a\u00020\u000cX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008:\u0010\'\"\u0004\u0008;\u0010)R\u001e\u0010\u0013\u001a\u00020\u000c8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008<\u0010\'\"\u0004\u0008=\u0010)R\u001e\u0010\u001b\u001a\u00020\u00078\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008>\u0010!\"\u0004\u0008?\u0010#R\u001a\u0010\u0010\u001a\u00020\u000cX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008@\u0010\'\"\u0004\u0008A\u0010)R\u001e\u0010\u0014\u001a\u00020\u000c8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008B\u0010\'\"\u0004\u0008C\u0010)R\u001e\u0010\u001a\u001a\u00020\u00078\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008D\u0010!\"\u0004\u0008E\u0010#R\u001a\u0010\u0011\u001a\u00020\u000cX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008F\u0010\'\"\u0004\u0008G\u0010)R\u001e\u0010\u001e\u001a\u00020\u00078\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008H\u0010!\"\u0004\u0008I\u0010#R\u001a\u0010\u0017\u001a\u00020\u0018X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008J\u0010K\"\u0004\u0008L\u0010MR\u001a\u0010\u000f\u001a\u00020\u000cX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008N\u0010\'\"\u0004\u0008O\u0010)R\u001a\u0010\u000e\u001a\u00020\u000cX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008P\u0010\'\"\u0004\u0008Q\u0010)R\u001e\u0010\u0004\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008R\u00105\"\u0004\u0008S\u00107R\u001a\u0010\u0006\u001a\u00020\u0007X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008T\u0010!\"\u0004\u0008U\u0010#\u00a8\u0006q"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingBaseLog;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SaveSync;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/UserSpecificData;",
        "startTime",
        "",
        "steps",
        "",
        "distance",
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
        "hrv",
        "shouldSend",
        "",
        "bmrCalories",
        "minHeartRate",
        "maxHeartRate",
        "email",
        "",
        "minsInPeriod",
        "(JIDJFFFFFFFFFIFZIIILjava/lang/String;I)V",
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
        "getDistance",
        "()D",
        "setDistance",
        "(D)V",
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
        "getSolarPower",
        "setSolarPower",
        "getStartTime",
        "setStartTime",
        "getSteps",
        "setSteps",
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
        "component21",
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

.field private distance:D

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

.field private solarPower:F

.field private startTime:J

.field private steps:I


# direct methods
.method public constructor <init>()V
    .locals 27

    move-object/from16 v0, p0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

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

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const v25, 0x1fffff

    const/16 v26, 0x0

    invoke-direct/range {v0 .. v26}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;-><init>(JIDJFFFFFFFFFIFZIIILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(JIDJFFFFFFFFFIFZIIILjava/lang/String;I)V
    .locals 4

    move-object v0, p0

    move-object/from16 v1, p23

    const-string v2, "email"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-wide v2, p1

    .line 49
    iput-wide v2, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->startTime:J

    move v2, p3

    .line 50
    iput v2, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->steps:I

    move-wide v2, p4

    .line 51
    iput-wide v2, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->distance:D

    move-wide v2, p6

    .line 52
    iput-wide v2, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->endTime:J

    move v2, p8

    .line 53
    iput v2, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->heartRate:F

    move v2, p9

    .line 54
    iput v2, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->bodyPower:F

    move v2, p10

    .line 55
    iput v2, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->solarPower:F

    move v2, p11

    .line 56
    iput v2, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->skinTemp:F

    move/from16 v2, p12

    .line 57
    iput v2, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->maxSkinTemp:F

    move/from16 v2, p13

    .line 58
    iput v2, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->minSkinTemp:F

    move/from16 v2, p14

    .line 59
    iput v2, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->caseTemp:F

    move/from16 v2, p15

    .line 60
    iput v2, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->maxCaseTemp:F

    move/from16 v2, p16

    .line 61
    iput v2, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->minCaseTemp:F

    move/from16 v2, p17

    .line 62
    iput v2, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->activeCalories:I

    move/from16 v2, p18

    .line 63
    iput v2, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->hrv:F

    move/from16 v2, p19

    .line 64
    iput-boolean v2, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->shouldSend:Z

    move/from16 v2, p20

    .line 65
    iput v2, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->bmrCalories:I

    move/from16 v2, p21

    .line 66
    iput v2, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->minHeartRate:I

    move/from16 v2, p22

    .line 67
    iput v2, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->maxHeartRate:I

    .line 68
    iput-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->email:Ljava/lang/String;

    move/from16 v1, p24

    .line 69
    iput v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->minsInPeriod:I

    return-void
.end method

.method public synthetic constructor <init>(JIDJFFFFFFFFFIFZIIILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 24

    move/from16 v0, p25

    and-int/lit8 v1, v0, 0x1

    const-wide/16 v2, 0x0

    if-eqz v1, :cond_0

    move-wide v4, v2

    goto :goto_0

    :cond_0
    move-wide/from16 v4, p1

    :goto_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    move/from16 v1, p3

    :goto_1
    and-int/lit8 v7, v0, 0x4

    if-eqz v7, :cond_2

    const-wide/16 v7, 0x0

    goto :goto_2

    :cond_2
    move-wide/from16 v7, p4

    :goto_2
    and-int/lit8 v9, v0, 0x8

    if-eqz v9, :cond_3

    goto :goto_3

    :cond_3
    move-wide/from16 v2, p6

    :goto_3
    and-int/lit8 v9, v0, 0x10

    if-eqz v9, :cond_4

    const/4 v9, 0x0

    goto :goto_4

    :cond_4
    move/from16 v9, p8

    :goto_4
    and-int/lit8 v11, v0, 0x20

    if-eqz v11, :cond_5

    const/4 v11, 0x0

    goto :goto_5

    :cond_5
    move/from16 v11, p9

    :goto_5
    and-int/lit8 v12, v0, 0x40

    if-eqz v12, :cond_6

    const/4 v12, 0x0

    goto :goto_6

    :cond_6
    move/from16 v12, p10

    :goto_6
    and-int/lit16 v13, v0, 0x80

    if-eqz v13, :cond_7

    const/4 v13, 0x0

    goto :goto_7

    :cond_7
    move/from16 v13, p11

    :goto_7
    and-int/lit16 v14, v0, 0x100

    if-eqz v14, :cond_8

    move v14, v13

    goto :goto_8

    :cond_8
    move/from16 v14, p12

    :goto_8
    and-int/lit16 v15, v0, 0x200

    if-eqz v15, :cond_9

    move v15, v13

    goto :goto_9

    :cond_9
    move/from16 v15, p13

    :goto_9
    and-int/lit16 v6, v0, 0x400

    if-eqz v6, :cond_a

    const/4 v6, 0x0

    goto :goto_a

    :cond_a
    move/from16 v6, p14

    :goto_a
    and-int/lit16 v10, v0, 0x800

    if-eqz v10, :cond_b

    move v10, v6

    goto :goto_b

    :cond_b
    move/from16 v10, p15

    :goto_b
    move/from16 p26, v10

    and-int/lit16 v10, v0, 0x1000

    if-eqz v10, :cond_c

    move v10, v6

    goto :goto_c

    :cond_c
    move/from16 v10, p16

    :goto_c
    move/from16 v16, v10

    and-int/lit16 v10, v0, 0x2000

    if-eqz v10, :cond_d

    const/4 v10, 0x0

    goto :goto_d

    :cond_d
    move/from16 v10, p17

    :goto_d
    move/from16 v17, v10

    and-int/lit16 v10, v0, 0x4000

    if-eqz v10, :cond_e

    const/4 v10, 0x0

    goto :goto_e

    :cond_e
    move/from16 v10, p18

    :goto_e
    const v18, 0x8000

    and-int v18, v0, v18

    if-eqz v18, :cond_f

    const/16 v18, 0x0

    goto :goto_f

    :cond_f
    move/from16 v18, p19

    :goto_f
    const/high16 v19, 0x10000

    and-int v19, v0, v19

    if-eqz v19, :cond_10

    const/16 v19, 0x0

    goto :goto_10

    :cond_10
    move/from16 v19, p20

    :goto_10
    const/high16 v20, 0x20000

    and-int v20, v0, v20

    if-eqz v20, :cond_11

    const/16 v20, 0x0

    goto :goto_11

    :cond_11
    move/from16 v20, p21

    :goto_11
    const/high16 v21, 0x40000

    and-int v21, v0, v21

    if-eqz v21, :cond_12

    const/16 v21, 0x0

    goto :goto_12

    :cond_12
    move/from16 v21, p22

    :goto_12
    const/high16 v22, 0x80000

    and-int v22, v0, v22

    if-eqz v22, :cond_13

    const-string v22, ""

    goto :goto_13

    :cond_13
    move-object/from16 v22, p23

    :goto_13
    const/high16 v23, 0x100000

    and-int v0, v0, v23

    if-eqz v0, :cond_14

    const/4 v0, 0x0

    goto :goto_14

    :cond_14
    move/from16 v0, p24

    :goto_14
    move-object/from16 p1, p0

    move-wide/from16 p2, v4

    move/from16 p4, v1

    move-wide/from16 p5, v7

    move-wide/from16 p7, v2

    move/from16 p9, v9

    move/from16 p10, v11

    move/from16 p11, v12

    move/from16 p12, v13

    move/from16 p13, v14

    move/from16 p14, v15

    move/from16 p15, v6

    move/from16 p16, p26

    move/from16 p17, v16

    move/from16 p18, v17

    move/from16 p19, v10

    move/from16 p20, v18

    move/from16 p21, v19

    move/from16 p22, v20

    move/from16 p23, v21

    move-object/from16 p24, v22

    move/from16 p25, v0

    .line 49
    invoke-direct/range {p1 .. p25}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;-><init>(JIDJFFFFFFFFFIFZIIILjava/lang/String;I)V

    return-void
.end method

.method public static synthetic copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;JIDJFFFFFFFFFIFZIIILjava/lang/String;IILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;
    .locals 22

    move/from16 v0, p25

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getStartTime()J

    move-result-wide v1

    goto :goto_0

    :cond_0
    move-wide/from16 v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getSteps()I

    move-result v3

    goto :goto_1

    :cond_1
    move/from16 v3, p3

    :goto_1
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_2

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getDistance()D

    move-result-wide v4

    goto :goto_2

    :cond_2
    move-wide/from16 v4, p4

    :goto_2
    and-int/lit8 v6, v0, 0x8

    if-eqz v6, :cond_3

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getEndTime()J

    move-result-wide v6

    goto :goto_3

    :cond_3
    move-wide/from16 v6, p6

    :goto_3
    and-int/lit8 v8, v0, 0x10

    if-eqz v8, :cond_4

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getHeartRate()F

    move-result v8

    goto :goto_4

    :cond_4
    move/from16 v8, p8

    :goto_4
    and-int/lit8 v9, v0, 0x20

    if-eqz v9, :cond_5

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getBodyPower()F

    move-result v9

    goto :goto_5

    :cond_5
    move/from16 v9, p9

    :goto_5
    and-int/lit8 v10, v0, 0x40

    if-eqz v10, :cond_6

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getSolarPower()F

    move-result v10

    goto :goto_6

    :cond_6
    move/from16 v10, p10

    :goto_6
    and-int/lit16 v11, v0, 0x80

    if-eqz v11, :cond_7

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getSkinTemp()F

    move-result v11

    goto :goto_7

    :cond_7
    move/from16 v11, p11

    :goto_7
    and-int/lit16 v12, v0, 0x100

    if-eqz v12, :cond_8

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getMaxSkinTemp()F

    move-result v12

    goto :goto_8

    :cond_8
    move/from16 v12, p12

    :goto_8
    and-int/lit16 v13, v0, 0x200

    if-eqz v13, :cond_9

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getMinSkinTemp()F

    move-result v13

    goto :goto_9

    :cond_9
    move/from16 v13, p13

    :goto_9
    and-int/lit16 v14, v0, 0x400

    if-eqz v14, :cond_a

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getCaseTemp()F

    move-result v14

    goto :goto_a

    :cond_a
    move/from16 v14, p14

    :goto_a
    and-int/lit16 v15, v0, 0x800

    if-eqz v15, :cond_b

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getMaxCaseTemp()F

    move-result v15

    goto :goto_b

    :cond_b
    move/from16 v15, p15

    :goto_b
    move/from16 p15, v15

    and-int/lit16 v15, v0, 0x1000

    if-eqz v15, :cond_c

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getMinCaseTemp()F

    move-result v15

    goto :goto_c

    :cond_c
    move/from16 v15, p16

    :goto_c
    move/from16 p16, v15

    and-int/lit16 v15, v0, 0x2000

    if-eqz v15, :cond_d

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getActiveCalories()I

    move-result v15

    goto :goto_d

    :cond_d
    move/from16 v15, p17

    :goto_d
    move/from16 p17, v15

    and-int/lit16 v15, v0, 0x4000

    if-eqz v15, :cond_e

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getHrv()F

    move-result v15

    goto :goto_e

    :cond_e
    move/from16 v15, p18

    :goto_e
    const v16, 0x8000

    and-int v16, v0, v16

    if-eqz v16, :cond_f

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getShouldSend()Z

    move-result v16

    goto :goto_f

    :cond_f
    move/from16 v16, p19

    :goto_f
    const/high16 v17, 0x10000

    and-int v17, v0, v17

    if-eqz v17, :cond_10

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getBmrCalories()I

    move-result v17

    goto :goto_10

    :cond_10
    move/from16 v17, p20

    :goto_10
    const/high16 v18, 0x20000

    and-int v18, v0, v18

    if-eqz v18, :cond_11

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getMinHeartRate()I

    move-result v18

    goto :goto_11

    :cond_11
    move/from16 v18, p21

    :goto_11
    const/high16 v19, 0x40000

    and-int v19, v0, v19

    if-eqz v19, :cond_12

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getMaxHeartRate()I

    move-result v19

    goto :goto_12

    :cond_12
    move/from16 v19, p22

    :goto_12
    const/high16 v20, 0x80000

    and-int v20, v0, v20

    if-eqz v20, :cond_13

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getEmail()Ljava/lang/String;

    move-result-object v20

    goto :goto_13

    :cond_13
    move-object/from16 v20, p23

    :goto_13
    const/high16 v21, 0x100000

    and-int v0, v0, v21

    if-eqz v0, :cond_14

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getMinsInPeriod()I

    move-result v0

    goto :goto_14

    :cond_14
    move/from16 v0, p24

    :goto_14
    move-wide/from16 p1, v1

    move/from16 p3, v3

    move-wide/from16 p4, v4

    move-wide/from16 p6, v6

    move/from16 p8, v8

    move/from16 p9, v9

    move/from16 p10, v10

    move/from16 p11, v11

    move/from16 p12, v12

    move/from16 p13, v13

    move/from16 p14, v14

    move/from16 p18, v15

    move/from16 p19, v16

    move/from16 p20, v17

    move/from16 p21, v18

    move/from16 p22, v19

    move-object/from16 p23, v20

    move/from16 p24, v0

    invoke-virtual/range {p0 .. p24}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->copy(JIDJFFFFFFFFFIFZIIILjava/lang/String;I)Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getStartTime()J

    move-result-wide v0

    return-wide v0
.end method

.method public final component10()F
    .locals 1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getMinSkinTemp()F

    move-result v0

    return v0
.end method

.method public final component11()F
    .locals 1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getCaseTemp()F

    move-result v0

    return v0
.end method

.method public final component12()F
    .locals 1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getMaxCaseTemp()F

    move-result v0

    return v0
.end method

.method public final component13()F
    .locals 1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getMinCaseTemp()F

    move-result v0

    return v0
.end method

.method public final component14()I
    .locals 1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getActiveCalories()I

    move-result v0

    return v0
.end method

.method public final component15()F
    .locals 1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getHrv()F

    move-result v0

    return v0
.end method

.method public final component16()Z
    .locals 1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getShouldSend()Z

    move-result v0

    return v0
.end method

.method public final component17()I
    .locals 1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getBmrCalories()I

    move-result v0

    return v0
.end method

.method public final component18()I
    .locals 1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getMinHeartRate()I

    move-result v0

    return v0
.end method

.method public final component19()I
    .locals 1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getMaxHeartRate()I

    move-result v0

    return v0
.end method

.method public final component2()I
    .locals 1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getSteps()I

    move-result v0

    return v0
.end method

.method public final component20()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getEmail()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final component21()I
    .locals 1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getMinsInPeriod()I

    move-result v0

    return v0
.end method

.method public final component3()D
    .locals 2

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getDistance()D

    move-result-wide v0

    return-wide v0
.end method

.method public final component4()J
    .locals 2

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getEndTime()J

    move-result-wide v0

    return-wide v0
.end method

.method public final component5()F
    .locals 1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getHeartRate()F

    move-result v0

    return v0
.end method

.method public final component6()F
    .locals 1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getBodyPower()F

    move-result v0

    return v0
.end method

.method public final component7()F
    .locals 1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getSolarPower()F

    move-result v0

    return v0
.end method

.method public final component8()F
    .locals 1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getSkinTemp()F

    move-result v0

    return v0
.end method

.method public final component9()F
    .locals 1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getMaxSkinTemp()F

    move-result v0

    return v0
.end method

.method public final copy(JIDJFFFFFFFFFIFZIIILjava/lang/String;I)Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;
    .locals 26

    move-wide/from16 v1, p1

    move/from16 v3, p3

    move-wide/from16 v4, p4

    move-wide/from16 v6, p6

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

    move/from16 v19, p19

    move/from16 v20, p20

    move/from16 v21, p21

    move/from16 v22, p22

    move-object/from16 v23, p23

    move/from16 v24, p24

    const-string v0, "email"

    move-object/from16 v1, p23

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v25, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;

    move-object/from16 v0, v25

    move-wide/from16 v1, p1

    invoke-direct/range {v0 .. v24}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;-><init>(JIDJFFFFFFFFFIFZIIILjava/lang/String;I)V

    return-object v25
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getStartTime()J

    move-result-wide v3

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getStartTime()J

    move-result-wide v5

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getSteps()I

    move-result v1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getSteps()I

    move-result v3

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getDistance()D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getDistance()D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getEndTime()J

    move-result-wide v3

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getEndTime()J

    move-result-wide v5

    cmp-long v1, v3, v5

    if-eqz v1, :cond_5

    return v2

    :cond_5
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getHeartRate()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getHeartRate()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getBodyPower()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getBodyPower()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getSolarPower()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getSolarPower()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getSkinTemp()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getSkinTemp()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getMaxSkinTemp()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getMaxSkinTemp()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getMinSkinTemp()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getMinSkinTemp()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getCaseTemp()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getCaseTemp()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getMaxCaseTemp()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getMaxCaseTemp()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getMinCaseTemp()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getMinCaseTemp()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getActiveCalories()I

    move-result v1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getActiveCalories()I

    move-result v3

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getHrv()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getHrv()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getShouldSend()Z

    move-result v1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getShouldSend()Z

    move-result v3

    if-eq v1, v3, :cond_11

    return v2

    :cond_11
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getBmrCalories()I

    move-result v1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getBmrCalories()I

    move-result v3

    if-eq v1, v3, :cond_12

    return v2

    :cond_12
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getMinHeartRate()I

    move-result v1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getMinHeartRate()I

    move-result v3

    if-eq v1, v3, :cond_13

    return v2

    :cond_13
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getMaxHeartRate()I

    move-result v1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getMaxHeartRate()I

    move-result v3

    if-eq v1, v3, :cond_14

    return v2

    :cond_14
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getEmail()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getEmail()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getMinsInPeriod()I

    move-result v1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getMinsInPeriod()I

    move-result p1

    if-eq v1, p1, :cond_16

    return v2

    :cond_16
    return v0
.end method

.method public getActiveCalories()I
    .locals 1

    .line 62
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->activeCalories:I

    return v0
.end method

.method public getBmrCalories()I
    .locals 1

    .line 65
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->bmrCalories:I

    return v0
.end method

.method public getBodyPower()F
    .locals 1

    .line 54
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->bodyPower:F

    return v0
.end method

.method public getCaseTemp()F
    .locals 1

    .line 59
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->caseTemp:F

    return v0
.end method

.method public getDistance()D
    .locals 2

    .line 51
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->distance:D

    return-wide v0
.end method

.method public getEmail()Ljava/lang/String;
    .locals 1

    .line 68
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->email:Ljava/lang/String;

    return-object v0
.end method

.method public getEndTime()J
    .locals 2

    .line 52
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->endTime:J

    return-wide v0
.end method

.method public getHeartRate()F
    .locals 1

    .line 53
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->heartRate:F

    return v0
.end method

.method public getHrv()F
    .locals 1

    .line 63
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->hrv:F

    return v0
.end method

.method public getMaxCaseTemp()F
    .locals 1

    .line 60
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->maxCaseTemp:F

    return v0
.end method

.method public getMaxHeartRate()I
    .locals 1

    .line 67
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->maxHeartRate:I

    return v0
.end method

.method public getMaxSkinTemp()F
    .locals 1

    .line 57
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->maxSkinTemp:F

    return v0
.end method

.method public getMinCaseTemp()F
    .locals 1

    .line 61
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->minCaseTemp:F

    return v0
.end method

.method public getMinHeartRate()I
    .locals 1

    .line 66
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->minHeartRate:I

    return v0
.end method

.method public getMinSkinTemp()F
    .locals 1

    .line 58
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->minSkinTemp:F

    return v0
.end method

.method public getMinsInPeriod()I
    .locals 1

    .line 69
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->minsInPeriod:I

    return v0
.end method

.method public getShouldSend()Z
    .locals 1

    .line 64
    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->shouldSend:Z

    return v0
.end method

.method public getSkinTemp()F
    .locals 1

    .line 56
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->skinTemp:F

    return v0
.end method

.method public getSolarPower()F
    .locals 1

    .line 55
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->solarPower:F

    return v0
.end method

.method public getStartTime()J
    .locals 2

    .line 49
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->startTime:J

    return-wide v0
.end method

.method public getSteps()I
    .locals 1

    .line 50
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->steps:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter$SleepSession-$$ExternalSynthetic0;->m0(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getSteps()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getDistance()D

    move-result-wide v1

    invoke-static {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo-$$ExternalSynthetic0;->m0(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getEndTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter$SleepSession-$$ExternalSynthetic0;->m0(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getHeartRate()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getBodyPower()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getSolarPower()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getSkinTemp()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getMaxSkinTemp()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getMinSkinTemp()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getCaseTemp()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getMaxCaseTemp()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getMinCaseTemp()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getActiveCalories()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getHrv()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getShouldSend()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    :cond_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getBmrCalories()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getMinHeartRate()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getMaxHeartRate()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getEmail()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getMinsInPeriod()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public setActiveCalories(I)V
    .locals 0

    .line 62
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->activeCalories:I

    return-void
.end method

.method public setBmrCalories(I)V
    .locals 0

    .line 65
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->bmrCalories:I

    return-void
.end method

.method public setBodyPower(F)V
    .locals 0

    .line 54
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->bodyPower:F

    return-void
.end method

.method public setCaseTemp(F)V
    .locals 0

    .line 59
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->caseTemp:F

    return-void
.end method

.method public setDistance(D)V
    .locals 0

    .line 51
    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->distance:D

    return-void
.end method

.method public setEmail(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->email:Ljava/lang/String;

    return-void
.end method

.method public setEndTime(J)V
    .locals 0

    .line 52
    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->endTime:J

    return-void
.end method

.method public setHeartRate(F)V
    .locals 0

    .line 53
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->heartRate:F

    return-void
.end method

.method public setHrv(F)V
    .locals 0

    .line 63
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->hrv:F

    return-void
.end method

.method public setMaxCaseTemp(F)V
    .locals 0

    .line 60
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->maxCaseTemp:F

    return-void
.end method

.method public setMaxHeartRate(I)V
    .locals 0

    .line 67
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->maxHeartRate:I

    return-void
.end method

.method public setMaxSkinTemp(F)V
    .locals 0

    .line 57
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->maxSkinTemp:F

    return-void
.end method

.method public setMinCaseTemp(F)V
    .locals 0

    .line 61
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->minCaseTemp:F

    return-void
.end method

.method public setMinHeartRate(I)V
    .locals 0

    .line 66
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->minHeartRate:I

    return-void
.end method

.method public setMinSkinTemp(F)V
    .locals 0

    .line 58
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->minSkinTemp:F

    return-void
.end method

.method public setMinsInPeriod(I)V
    .locals 0

    .line 69
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->minsInPeriod:I

    return-void
.end method

.method public setShouldSend(Z)V
    .locals 0

    .line 64
    iput-boolean p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->shouldSend:Z

    return-void
.end method

.method public setSkinTemp(F)V
    .locals 0

    .line 56
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->skinTemp:F

    return-void
.end method

.method public setSolarPower(F)V
    .locals 0

    .line 55
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->solarPower:F

    return-void
.end method

.method public setStartTime(J)V
    .locals 0

    .line 49
    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->startTime:J

    return-void
.end method

.method public setSteps(I)V
    .locals 0

    .line 50
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->steps:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "WalkingLog(startTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getStartTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", steps="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getSteps()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", distance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getDistance()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", endTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getEndTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", heartRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getHeartRate()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", bodyPower="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getBodyPower()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", solarPower="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getSolarPower()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", skinTemp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getSkinTemp()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", maxSkinTemp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getMaxSkinTemp()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", minSkinTemp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getMinSkinTemp()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", caseTemp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getCaseTemp()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", maxCaseTemp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getMaxCaseTemp()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", minCaseTemp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getMinCaseTemp()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", activeCalories="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getActiveCalories()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", hrv="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getHrv()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", shouldSend="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getShouldSend()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", bmrCalories="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getBmrCalories()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", minHeartRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getMinHeartRate()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", maxHeartRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getMaxHeartRate()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", email="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getEmail()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", minsInPeriod="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getMinsInPeriod()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
