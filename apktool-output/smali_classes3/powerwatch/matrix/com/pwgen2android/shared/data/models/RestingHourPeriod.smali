.class public final Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;
.super Ljava/lang/Object;
.source "ActivityPeriodsModels.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingBasePeriod;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008U\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u00cd\u0001\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u0008\u00a2\u0006\u0002\u0010\u0019J\t\u0010H\u001a\u00020\u0003H\u00c6\u0003J\t\u0010I\u001a\u00020\u0008H\u00c6\u0003J\t\u0010J\u001a\u00020\u0008H\u00c6\u0003J\t\u0010K\u001a\u00020\u0008H\u00c6\u0003J\t\u0010L\u001a\u00020\u0008H\u00c6\u0003J\t\u0010M\u001a\u00020\u0006H\u00c6\u0003J\t\u0010N\u001a\u00020\u0003H\u00c6\u0003J\t\u0010O\u001a\u00020\u0006H\u00c6\u0003J\t\u0010P\u001a\u00020\u0006H\u00c6\u0003J\t\u0010Q\u001a\u00020\u0008H\u00c6\u0003J\t\u0010R\u001a\u00020\u0008H\u00c6\u0003J\t\u0010S\u001a\u00020\u0003H\u00c6\u0003J\t\u0010T\u001a\u00020\u0008H\u00c6\u0003J\t\u0010U\u001a\u00020\u0006H\u00c6\u0003J\t\u0010V\u001a\u00020\u0008H\u00c6\u0003J\t\u0010W\u001a\u00020\u0006H\u00c6\u0003J\t\u0010X\u001a\u00020\u0006H\u00c6\u0003J\t\u0010Y\u001a\u00020\u0008H\u00c6\u0003J\t\u0010Z\u001a\u00020\u0008H\u00c6\u0003J\t\u0010[\u001a\u00020\u0008H\u00c6\u0003J\u00d1\u0001\u0010\\\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\u00062\u0008\u0008\u0002\u0010\n\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00082\u0008\u0008\u0002\u0010\r\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u0008H\u00c6\u0001J\u0013\u0010]\u001a\u00020^2\u0008\u0010_\u001a\u0004\u0018\u00010`H\u00d6\u0003J\t\u0010a\u001a\u00020\u0006H\u00d6\u0001J\t\u0010b\u001a\u00020cH\u00d6\u0001R\u001a\u0010\u0012\u001a\u00020\u0006X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001a\u0010\u001b\"\u0004\u0008\u001c\u0010\u001dR\u001a\u0010\u0015\u001a\u00020\u0006X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001e\u0010\u001b\"\u0004\u0008\u001f\u0010\u001dR\u001a\u0010\u000f\u001a\u00020\u0008X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008 \u0010!\"\u0004\u0008\"\u0010#R\u001a\u0010\u0016\u001a\u00020\u0008X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008$\u0010!\"\u0004\u0008%\u0010#R\u001a\u0010\u0004\u001a\u00020\u0003X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008&\u0010\'\"\u0004\u0008(\u0010)R\u001a\u0010\u0007\u001a\u00020\u0008X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008*\u0010!\"\u0004\u0008+\u0010#R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008,\u0010\u001b\"\u0004\u0008-\u0010\u001dR\u001a\u0010\u000b\u001a\u00020\u0008X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008.\u0010!\"\u0004\u0008/\u0010#R\u001a\u0010\u0013\u001a\u00020\u0003X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00080\u0010\'\"\u0004\u00081\u0010)R\u001a\u0010\u0018\u001a\u00020\u0008X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00082\u0010!\"\u0004\u00083\u0010#R\u001a\u0010\t\u001a\u00020\u0006X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00084\u0010\u001b\"\u0004\u00085\u0010\u001dR\u001a\u0010\r\u001a\u00020\u0008X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00086\u0010!\"\u0004\u00087\u0010#R\u001a\u0010\u0017\u001a\u00020\u0008X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00088\u0010!\"\u0004\u00089\u0010#R\u001a\u0010\n\u001a\u00020\u0006X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008:\u0010\u001b\"\u0004\u0008;\u0010\u001dR\u001a\u0010\u000e\u001a\u00020\u0008X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008<\u0010!\"\u0004\u0008=\u0010#R\u001a\u0010\u0014\u001a\u00020\u0006X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008>\u0010\u001b\"\u0004\u0008?\u0010\u001dR\u001a\u0010\u0011\u001a\u00020\u0008X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008@\u0010!\"\u0004\u0008A\u0010#R\u001a\u0010\u000c\u001a\u00020\u0008X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008B\u0010!\"\u0004\u0008C\u0010#R\u001a\u0010\u0010\u001a\u00020\u0008X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008D\u0010!\"\u0004\u0008E\u0010#R\u001e\u0010\u0002\u001a\u00020\u00038\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008F\u0010\'\"\u0004\u0008G\u0010)\u00a8\u0006d"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingBasePeriod;",
        "startTime",
        "",
        "endTime",
        "hourInDay",
        "",
        "heartRate",
        "",
        "maxHeartRate",
        "minHeartRate",
        "hrv",
        "skinTemp",
        "maxSkinTemp",
        "minSkinTemp",
        "bodyPower",
        "solarPower",
        "peakTemp",
        "activeCalories",
        "lastUpdated",
        "minsInPeriod",
        "bmrCalories",
        "caseTemp",
        "minCaseTemp",
        "maxCaseTemp",
        "(JJIFIIFFFFFFFIJIIFFF)V",
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
        "getEndTime",
        "()J",
        "setEndTime",
        "(J)V",
        "getHeartRate",
        "setHeartRate",
        "getHourInDay",
        "setHourInDay",
        "getHrv",
        "setHrv",
        "getLastUpdated",
        "setLastUpdated",
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
        "getPeakTemp",
        "setPeakTemp",
        "getSkinTemp",
        "setSkinTemp",
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
        "",
        "other",
        "",
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

.field private bmrCalories:I

.field private bodyPower:F

.field private caseTemp:F

.field private endTime:J

.field private heartRate:F

.field private hourInDay:I

.field private hrv:F

.field private lastUpdated:J

.field private maxCaseTemp:F

.field private maxHeartRate:I

.field private maxSkinTemp:F

.field private minCaseTemp:F

.field private minHeartRate:I

.field private minSkinTemp:F

.field private minsInPeriod:I

.field private peakTemp:F

.field private skinTemp:F

.field private solarPower:F

.field private startTime:J


# direct methods
.method public constructor <init>()V
    .locals 26

    move-object/from16 v0, p0

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

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

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const v24, 0xfffff

    const/16 v25, 0x0

    invoke-direct/range {v0 .. v25}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;-><init>(JJIFIIFFFFFFFIJIIFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(JJIFIIFFFFFFFIJIIFFF)V
    .locals 3

    move-object v0, p0

    .line 153
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-wide v1, p1

    .line 155
    iput-wide v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->startTime:J

    move-wide v1, p3

    .line 156
    iput-wide v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->endTime:J

    move v1, p5

    .line 157
    iput v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->hourInDay:I

    move v1, p6

    .line 158
    iput v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->heartRate:F

    move v1, p7

    .line 159
    iput v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->maxHeartRate:I

    move v1, p8

    .line 160
    iput v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->minHeartRate:I

    move v1, p9

    .line 161
    iput v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->hrv:F

    move v1, p10

    .line 162
    iput v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->skinTemp:F

    move v1, p11

    .line 163
    iput v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->maxSkinTemp:F

    move v1, p12

    .line 164
    iput v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->minSkinTemp:F

    move/from16 v1, p13

    .line 165
    iput v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->bodyPower:F

    move/from16 v1, p14

    .line 166
    iput v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->solarPower:F

    move/from16 v1, p15

    .line 167
    iput v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->peakTemp:F

    move/from16 v1, p16

    .line 168
    iput v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->activeCalories:I

    move-wide/from16 v1, p17

    .line 169
    iput-wide v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->lastUpdated:J

    move/from16 v1, p19

    .line 170
    iput v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->minsInPeriod:I

    move/from16 v1, p20

    .line 171
    iput v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->bmrCalories:I

    move/from16 v1, p21

    .line 172
    iput v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->caseTemp:F

    move/from16 v1, p22

    .line 173
    iput v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->minCaseTemp:F

    move/from16 v1, p23

    .line 174
    iput v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->maxCaseTemp:F

    return-void
.end method

.method public synthetic constructor <init>(JJIFIIFFFFFFFIJIIFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 23

    move/from16 v0, p24

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    const-wide/16 v4, 0x0

    goto :goto_0

    :cond_0
    move-wide/from16 v4, p1

    :goto_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    const-wide/16 v6, 0x0

    goto :goto_1

    :cond_1
    move-wide/from16 v6, p3

    :goto_1
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    goto :goto_2

    :cond_2
    move/from16 v1, p5

    :goto_2
    and-int/lit8 v9, v0, 0x8

    if-eqz v9, :cond_3

    const/4 v9, 0x0

    goto :goto_3

    :cond_3
    move/from16 v9, p6

    :goto_3
    and-int/lit8 v11, v0, 0x10

    if-eqz v11, :cond_4

    const/4 v11, 0x0

    goto :goto_4

    :cond_4
    move/from16 v11, p7

    :goto_4
    and-int/lit8 v12, v0, 0x20

    if-eqz v12, :cond_5

    const/4 v12, 0x0

    goto :goto_5

    :cond_5
    move/from16 v12, p8

    :goto_5
    and-int/lit8 v13, v0, 0x40

    if-eqz v13, :cond_6

    const/4 v13, 0x0

    goto :goto_6

    :cond_6
    move/from16 v13, p9

    :goto_6
    and-int/lit16 v14, v0, 0x80

    if-eqz v14, :cond_7

    const/4 v14, 0x0

    goto :goto_7

    :cond_7
    move/from16 v14, p10

    :goto_7
    and-int/lit16 v15, v0, 0x100

    if-eqz v15, :cond_8

    move v15, v14

    goto :goto_8

    :cond_8
    move/from16 v15, p11

    :goto_8
    and-int/lit16 v2, v0, 0x200

    if-eqz v2, :cond_9

    move v2, v14

    goto :goto_9

    :cond_9
    move/from16 v2, p12

    :goto_9
    and-int/lit16 v3, v0, 0x400

    if-eqz v3, :cond_a

    const/4 v3, 0x0

    goto :goto_a

    :cond_a
    move/from16 v3, p13

    :goto_a
    and-int/lit16 v8, v0, 0x800

    if-eqz v8, :cond_b

    const/4 v8, 0x0

    goto :goto_b

    :cond_b
    move/from16 v8, p14

    :goto_b
    and-int/lit16 v10, v0, 0x1000

    if-eqz v10, :cond_c

    const/4 v10, 0x0

    goto :goto_c

    :cond_c
    move/from16 v10, p15

    :goto_c
    move/from16 p25, v10

    and-int/lit16 v10, v0, 0x2000

    if-eqz v10, :cond_d

    const/4 v10, 0x0

    goto :goto_d

    :cond_d
    move/from16 v10, p16

    :goto_d
    move/from16 v18, v10

    and-int/lit16 v10, v0, 0x4000

    if-eqz v10, :cond_e

    const-wide/16 v16, 0x0

    goto :goto_e

    :cond_e
    move-wide/from16 v16, p17

    :goto_e
    const v10, 0x8000

    and-int/2addr v10, v0

    if-eqz v10, :cond_f

    const/4 v10, 0x0

    goto :goto_f

    :cond_f
    move/from16 v10, p19

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

    move/from16 v21, v20

    goto :goto_12

    :cond_12
    move/from16 v21, p22

    :goto_12
    const/high16 v22, 0x80000

    and-int v0, v0, v22

    if-eqz v0, :cond_13

    move/from16 v0, v20

    goto :goto_13

    :cond_13
    move/from16 v0, p23

    :goto_13
    move-object/from16 p1, p0

    move-wide/from16 p2, v4

    move-wide/from16 p4, v6

    move/from16 p6, v1

    move/from16 p7, v9

    move/from16 p8, v11

    move/from16 p9, v12

    move/from16 p10, v13

    move/from16 p11, v14

    move/from16 p12, v15

    move/from16 p13, v2

    move/from16 p14, v3

    move/from16 p15, v8

    move/from16 p16, p25

    move/from16 p17, v18

    move-wide/from16 p18, v16

    move/from16 p20, v10

    move/from16 p21, v19

    move/from16 p22, v20

    move/from16 p23, v21

    move/from16 p24, v0

    .line 154
    invoke-direct/range {p1 .. p24}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;-><init>(JJIFIIFFFFFFFIJIIFFF)V

    return-void
.end method

.method public static synthetic copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;JJIFIIFFFFFFFIJIIFFFILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;
    .locals 22

    move/from16 v0, p24

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getStartTime()J

    move-result-wide v1

    goto :goto_0

    :cond_0
    move-wide/from16 v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getEndTime()J

    move-result-wide v3

    goto :goto_1

    :cond_1
    move-wide/from16 v3, p3

    :goto_1
    and-int/lit8 v5, v0, 0x4

    if-eqz v5, :cond_2

    move-object/from16 v5, p0

    iget v6, v5, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->hourInDay:I

    goto :goto_2

    :cond_2
    move-object/from16 v5, p0

    move/from16 v6, p5

    :goto_2
    and-int/lit8 v7, v0, 0x8

    if-eqz v7, :cond_3

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getHeartRate()F

    move-result v7

    goto :goto_3

    :cond_3
    move/from16 v7, p6

    :goto_3
    and-int/lit8 v8, v0, 0x10

    if-eqz v8, :cond_4

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getMaxHeartRate()I

    move-result v8

    goto :goto_4

    :cond_4
    move/from16 v8, p7

    :goto_4
    and-int/lit8 v9, v0, 0x20

    if-eqz v9, :cond_5

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getMinHeartRate()I

    move-result v9

    goto :goto_5

    :cond_5
    move/from16 v9, p8

    :goto_5
    and-int/lit8 v10, v0, 0x40

    if-eqz v10, :cond_6

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getHrv()F

    move-result v10

    goto :goto_6

    :cond_6
    move/from16 v10, p9

    :goto_6
    and-int/lit16 v11, v0, 0x80

    if-eqz v11, :cond_7

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getSkinTemp()F

    move-result v11

    goto :goto_7

    :cond_7
    move/from16 v11, p10

    :goto_7
    and-int/lit16 v12, v0, 0x100

    if-eqz v12, :cond_8

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getMaxSkinTemp()F

    move-result v12

    goto :goto_8

    :cond_8
    move/from16 v12, p11

    :goto_8
    and-int/lit16 v13, v0, 0x200

    if-eqz v13, :cond_9

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getMinSkinTemp()F

    move-result v13

    goto :goto_9

    :cond_9
    move/from16 v13, p12

    :goto_9
    and-int/lit16 v14, v0, 0x400

    if-eqz v14, :cond_a

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getBodyPower()F

    move-result v14

    goto :goto_a

    :cond_a
    move/from16 v14, p13

    :goto_a
    and-int/lit16 v15, v0, 0x800

    if-eqz v15, :cond_b

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getSolarPower()F

    move-result v15

    goto :goto_b

    :cond_b
    move/from16 v15, p14

    :goto_b
    and-int/lit16 v5, v0, 0x1000

    if-eqz v5, :cond_c

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getPeakTemp()F

    move-result v5

    goto :goto_c

    :cond_c
    move/from16 v5, p15

    :goto_c
    move/from16 p15, v5

    and-int/lit16 v5, v0, 0x2000

    if-eqz v5, :cond_d

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getActiveCalories()I

    move-result v5

    goto :goto_d

    :cond_d
    move/from16 v5, p16

    :goto_d
    move/from16 p16, v5

    and-int/lit16 v5, v0, 0x4000

    if-eqz v5, :cond_e

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getLastUpdated()J

    move-result-wide v16

    goto :goto_e

    :cond_e
    move-wide/from16 v16, p17

    :goto_e
    const v5, 0x8000

    and-int/2addr v5, v0

    if-eqz v5, :cond_f

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getMinsInPeriod()I

    move-result v5

    goto :goto_f

    :cond_f
    move/from16 v5, p19

    :goto_f
    const/high16 v18, 0x10000

    and-int v18, v0, v18

    if-eqz v18, :cond_10

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getBmrCalories()I

    move-result v18

    goto :goto_10

    :cond_10
    move/from16 v18, p20

    :goto_10
    const/high16 v19, 0x20000

    and-int v19, v0, v19

    if-eqz v19, :cond_11

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getCaseTemp()F

    move-result v19

    goto :goto_11

    :cond_11
    move/from16 v19, p21

    :goto_11
    const/high16 v20, 0x40000

    and-int v20, v0, v20

    if-eqz v20, :cond_12

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getMinCaseTemp()F

    move-result v20

    goto :goto_12

    :cond_12
    move/from16 v20, p22

    :goto_12
    const/high16 v21, 0x80000

    and-int v0, v0, v21

    if-eqz v0, :cond_13

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getMaxCaseTemp()F

    move-result v0

    goto :goto_13

    :cond_13
    move/from16 v0, p23

    :goto_13
    move-wide/from16 p1, v1

    move-wide/from16 p3, v3

    move/from16 p5, v6

    move/from16 p6, v7

    move/from16 p7, v8

    move/from16 p8, v9

    move/from16 p9, v10

    move/from16 p10, v11

    move/from16 p11, v12

    move/from16 p12, v13

    move/from16 p13, v14

    move/from16 p14, v15

    move-wide/from16 p17, v16

    move/from16 p19, v5

    move/from16 p20, v18

    move/from16 p21, v19

    move/from16 p22, v20

    move/from16 p23, v0

    invoke-virtual/range {p0 .. p23}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->copy(JJIFIIFFFFFFFIJIIFFF)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getStartTime()J

    move-result-wide v0

    return-wide v0
.end method

.method public final component10()F
    .locals 1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getMinSkinTemp()F

    move-result v0

    return v0
.end method

.method public final component11()F
    .locals 1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getBodyPower()F

    move-result v0

    return v0
.end method

.method public final component12()F
    .locals 1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getSolarPower()F

    move-result v0

    return v0
.end method

.method public final component13()F
    .locals 1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getPeakTemp()F

    move-result v0

    return v0
.end method

.method public final component14()I
    .locals 1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getActiveCalories()I

    move-result v0

    return v0
.end method

.method public final component15()J
    .locals 2

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getLastUpdated()J

    move-result-wide v0

    return-wide v0
.end method

.method public final component16()I
    .locals 1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getMinsInPeriod()I

    move-result v0

    return v0
.end method

.method public final component17()I
    .locals 1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getBmrCalories()I

    move-result v0

    return v0
.end method

.method public final component18()F
    .locals 1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getCaseTemp()F

    move-result v0

    return v0
.end method

.method public final component19()F
    .locals 1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getMinCaseTemp()F

    move-result v0

    return v0
.end method

.method public final component2()J
    .locals 2

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getEndTime()J

    move-result-wide v0

    return-wide v0
.end method

.method public final component20()F
    .locals 1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getMaxCaseTemp()F

    move-result v0

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->hourInDay:I

    return v0
.end method

.method public final component4()F
    .locals 1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getHeartRate()F

    move-result v0

    return v0
.end method

.method public final component5()I
    .locals 1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getMaxHeartRate()I

    move-result v0

    return v0
.end method

.method public final component6()I
    .locals 1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getMinHeartRate()I

    move-result v0

    return v0
.end method

.method public final component7()F
    .locals 1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getHrv()F

    move-result v0

    return v0
.end method

.method public final component8()F
    .locals 1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getSkinTemp()F

    move-result v0

    return v0
.end method

.method public final component9()F
    .locals 1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getMaxSkinTemp()F

    move-result v0

    return v0
.end method

.method public final copy(JJIFIIFFFFFFFIJIIFFF)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;
    .locals 25

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

    move/from16 v15, p15

    move/from16 v16, p16

    move-wide/from16 v17, p17

    move/from16 v19, p19

    move/from16 v20, p20

    move/from16 v21, p21

    move/from16 v22, p22

    move/from16 v23, p23

    new-instance v24, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;

    move-object/from16 v0, v24

    invoke-direct/range {v0 .. v23}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;-><init>(JJIFIIFFFFFFFIJIIFFF)V

    return-object v24
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getStartTime()J

    move-result-wide v3

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getStartTime()J

    move-result-wide v5

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getEndTime()J

    move-result-wide v3

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getEndTime()J

    move-result-wide v5

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->hourInDay:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->hourInDay:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getHeartRate()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getHeartRate()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getMaxHeartRate()I

    move-result v1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getMaxHeartRate()I

    move-result v3

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getMinHeartRate()I

    move-result v1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getMinHeartRate()I

    move-result v3

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getHrv()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getHrv()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getSkinTemp()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getSkinTemp()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getMaxSkinTemp()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getMaxSkinTemp()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getMinSkinTemp()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getMinSkinTemp()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getBodyPower()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getBodyPower()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getSolarPower()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getSolarPower()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getPeakTemp()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getPeakTemp()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getActiveCalories()I

    move-result v1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getActiveCalories()I

    move-result v3

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getLastUpdated()J

    move-result-wide v3

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getLastUpdated()J

    move-result-wide v5

    cmp-long v1, v3, v5

    if-eqz v1, :cond_10

    return v2

    :cond_10
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getMinsInPeriod()I

    move-result v1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getMinsInPeriod()I

    move-result v3

    if-eq v1, v3, :cond_11

    return v2

    :cond_11
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getBmrCalories()I

    move-result v1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getBmrCalories()I

    move-result v3

    if-eq v1, v3, :cond_12

    return v2

    :cond_12
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getCaseTemp()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getCaseTemp()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getMinCaseTemp()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getMinCaseTemp()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getMaxCaseTemp()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getMaxCaseTemp()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_15

    return v2

    :cond_15
    return v0
.end method

.method public getActiveCalories()I
    .locals 1

    .line 168
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->activeCalories:I

    return v0
.end method

.method public getBmrCalories()I
    .locals 1

    .line 171
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->bmrCalories:I

    return v0
.end method

.method public getBodyPower()F
    .locals 1

    .line 165
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->bodyPower:F

    return v0
.end method

.method public getCaseTemp()F
    .locals 1

    .line 172
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->caseTemp:F

    return v0
.end method

.method public getEndTime()J
    .locals 2

    .line 156
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->endTime:J

    return-wide v0
.end method

.method public getHeartRate()F
    .locals 1

    .line 158
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->heartRate:F

    return v0
.end method

.method public final getHourInDay()I
    .locals 1

    .line 157
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->hourInDay:I

    return v0
.end method

.method public getHrv()F
    .locals 1

    .line 161
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->hrv:F

    return v0
.end method

.method public getLastUpdated()J
    .locals 2

    .line 169
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->lastUpdated:J

    return-wide v0
.end method

.method public getMaxCaseTemp()F
    .locals 1

    .line 174
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->maxCaseTemp:F

    return v0
.end method

.method public getMaxHeartRate()I
    .locals 1

    .line 159
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->maxHeartRate:I

    return v0
.end method

.method public getMaxSkinTemp()F
    .locals 1

    .line 163
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->maxSkinTemp:F

    return v0
.end method

.method public getMinCaseTemp()F
    .locals 1

    .line 173
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->minCaseTemp:F

    return v0
.end method

.method public getMinHeartRate()I
    .locals 1

    .line 160
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->minHeartRate:I

    return v0
.end method

.method public getMinSkinTemp()F
    .locals 1

    .line 164
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->minSkinTemp:F

    return v0
.end method

.method public getMinsInPeriod()I
    .locals 1

    .line 170
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->minsInPeriod:I

    return v0
.end method

.method public getPeakTemp()F
    .locals 1

    .line 167
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->peakTemp:F

    return v0
.end method

.method public getSkinTemp()F
    .locals 1

    .line 162
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->skinTemp:F

    return v0
.end method

.method public getSolarPower()F
    .locals 1

    .line 166
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->solarPower:F

    return v0
.end method

.method public getStartTime()J
    .locals 2

    .line 155
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->startTime:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter$SleepSession-$$ExternalSynthetic0;->m0(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getEndTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter$SleepSession-$$ExternalSynthetic0;->m0(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->hourInDay:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getHeartRate()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getMaxHeartRate()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getMinHeartRate()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getHrv()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getSkinTemp()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getMaxSkinTemp()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getMinSkinTemp()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getBodyPower()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getSolarPower()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getPeakTemp()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getActiveCalories()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getLastUpdated()J

    move-result-wide v1

    invoke-static {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter$SleepSession-$$ExternalSynthetic0;->m0(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getMinsInPeriod()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getBmrCalories()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getCaseTemp()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getMinCaseTemp()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getMaxCaseTemp()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public setActiveCalories(I)V
    .locals 0

    .line 168
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->activeCalories:I

    return-void
.end method

.method public setBmrCalories(I)V
    .locals 0

    .line 171
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->bmrCalories:I

    return-void
.end method

.method public setBodyPower(F)V
    .locals 0

    .line 165
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->bodyPower:F

    return-void
.end method

.method public setCaseTemp(F)V
    .locals 0

    .line 172
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->caseTemp:F

    return-void
.end method

.method public setEndTime(J)V
    .locals 0

    .line 156
    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->endTime:J

    return-void
.end method

.method public setHeartRate(F)V
    .locals 0

    .line 158
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->heartRate:F

    return-void
.end method

.method public final setHourInDay(I)V
    .locals 0

    .line 157
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->hourInDay:I

    return-void
.end method

.method public setHrv(F)V
    .locals 0

    .line 161
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->hrv:F

    return-void
.end method

.method public setLastUpdated(J)V
    .locals 0

    .line 169
    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->lastUpdated:J

    return-void
.end method

.method public setMaxCaseTemp(F)V
    .locals 0

    .line 174
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->maxCaseTemp:F

    return-void
.end method

.method public setMaxHeartRate(I)V
    .locals 0

    .line 159
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->maxHeartRate:I

    return-void
.end method

.method public setMaxSkinTemp(F)V
    .locals 0

    .line 163
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->maxSkinTemp:F

    return-void
.end method

.method public setMinCaseTemp(F)V
    .locals 0

    .line 173
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->minCaseTemp:F

    return-void
.end method

.method public setMinHeartRate(I)V
    .locals 0

    .line 160
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->minHeartRate:I

    return-void
.end method

.method public setMinSkinTemp(F)V
    .locals 0

    .line 164
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->minSkinTemp:F

    return-void
.end method

.method public setMinsInPeriod(I)V
    .locals 0

    .line 170
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->minsInPeriod:I

    return-void
.end method

.method public setPeakTemp(F)V
    .locals 0

    .line 167
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->peakTemp:F

    return-void
.end method

.method public setSkinTemp(F)V
    .locals 0

    .line 162
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->skinTemp:F

    return-void
.end method

.method public setSolarPower(F)V
    .locals 0

    .line 166
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->solarPower:F

    return-void
.end method

.method public setStartTime(J)V
    .locals 0

    .line 155
    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->startTime:J

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RestingHourPeriod(startTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getStartTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", endTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getEndTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", hourInDay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->hourInDay:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", heartRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getHeartRate()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", maxHeartRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getMaxHeartRate()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", minHeartRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getMinHeartRate()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", hrv="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getHrv()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", skinTemp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getSkinTemp()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", maxSkinTemp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getMaxSkinTemp()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", minSkinTemp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getMinSkinTemp()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", bodyPower="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getBodyPower()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", solarPower="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getSolarPower()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", peakTemp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getPeakTemp()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", activeCalories="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getActiveCalories()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", lastUpdated="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getLastUpdated()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", minsInPeriod="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getMinsInPeriod()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", bmrCalories="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getBmrCalories()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", caseTemp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getCaseTemp()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", minCaseTemp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getMinCaseTemp()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", maxCaseTemp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getMaxCaseTemp()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
