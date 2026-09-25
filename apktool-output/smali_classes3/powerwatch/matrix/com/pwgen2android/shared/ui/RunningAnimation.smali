.class public final Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;
.super Ljava/lang/Object;
.source "RunningAnimator.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0002\u0008\'\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001BW\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\t\u0010/\u001a\u00020\u0006H\u00c6\u0003J\t\u00100\u001a\u00020\u0006H\u00c6\u0003J\t\u00101\u001a\u00020\tH\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\t\u00103\u001a\u00020\rH\u00c6\u0003J\t\u00104\u001a\u00020\u000fH\u00c6\u0003J[\u00105\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000fH\u00c6\u0001J\u0013\u00106\u001a\u0002072\u0008\u00108\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00109\u001a\u00020\rH\u00d6\u0001J\t\u0010:\u001a\u00020;H\u00d6\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014R\u001a\u0010\u0008\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016\"\u0004\u0008\u0017\u0010\u0018R\u001a\u0010\u000c\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0019\u0010\u001a\"\u0004\u0008\u001b\u0010\u001cR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001d\u0010\u001e\"\u0004\u0008\u001f\u0010 R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008!\u0010\"\"\u0004\u0008#\u0010$R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008%\u0010\"\"\u0004\u0008&\u0010$R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\'\u0010\u0012\"\u0004\u0008(\u0010\u0014R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008)\u0010*\"\u0004\u0008+\u0010,\u00a8\u0006<"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;",
        "",
        "lastLocation",
        "Landroid/location/Location;",
        "nextLocation",
        "distance",
        "",
        "step",
        "distanceUntil",
        "",
        "heartRate",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;",
        "elevation",
        "",
        "timestamp",
        "",
        "(Landroid/location/Location;Landroid/location/Location;DDFLpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;IJ)V",
        "getDistance",
        "()D",
        "setDistance",
        "(D)V",
        "getDistanceUntil",
        "()F",
        "setDistanceUntil",
        "(F)V",
        "getElevation",
        "()I",
        "setElevation",
        "(I)V",
        "getHeartRate",
        "()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;",
        "setHeartRate",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;)V",
        "getLastLocation",
        "()Landroid/location/Location;",
        "setLastLocation",
        "(Landroid/location/Location;)V",
        "getNextLocation",
        "setNextLocation",
        "getStep",
        "setStep",
        "getTimestamp",
        "()J",
        "setTimestamp",
        "(J)V",
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
.field private distance:D

.field private distanceUntil:F

.field private elevation:I

.field private heartRate:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;

.field private lastLocation:Landroid/location/Location;

.field private nextLocation:Landroid/location/Location;

.field private step:D

.field private timestamp:J


# direct methods
.method public constructor <init>()V
    .locals 14

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/16 v12, 0xff

    const/4 v13, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v13}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;-><init>(Landroid/location/Location;Landroid/location/Location;DDFLpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;IJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/location/Location;Landroid/location/Location;DDFLpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;IJ)V
    .locals 1

    const-string v0, "lastLocation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nextLocation"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->lastLocation:Landroid/location/Location;

    .line 20
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->nextLocation:Landroid/location/Location;

    .line 21
    iput-wide p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->distance:D

    .line 22
    iput-wide p5, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->step:D

    .line 23
    iput p7, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->distanceUntil:F

    .line 24
    iput-object p8, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->heartRate:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;

    .line 25
    iput p9, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->elevation:I

    .line 26
    iput-wide p10, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->timestamp:J

    return-void
.end method

.method public synthetic constructor <init>(Landroid/location/Location;Landroid/location/Location;DDFLpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;IJILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 12

    move/from16 v0, p12

    and-int/lit8 v1, v0, 0x1

    const-string v2, ""

    if-eqz v1, :cond_0

    .line 19
    new-instance v1, Landroid/location/Location;

    invoke-direct {v1, v2}, Landroid/location/Location;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    move-object v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    .line 20
    new-instance v3, Landroid/location/Location;

    invoke-direct {v3, v2}, Landroid/location/Location;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    move-object v3, p2

    :goto_1
    and-int/lit8 v2, v0, 0x4

    const-wide/16 v4, 0x0

    if-eqz v2, :cond_2

    move-wide v6, v4

    goto :goto_2

    :cond_2
    move-wide v6, p3

    :goto_2
    and-int/lit8 v2, v0, 0x8

    if-eqz v2, :cond_3

    goto :goto_3

    :cond_3
    move-wide/from16 v4, p5

    :goto_3
    and-int/lit8 v2, v0, 0x10

    if-eqz v2, :cond_4

    const/4 v2, 0x0

    goto :goto_4

    :cond_4
    move/from16 v2, p7

    :goto_4
    and-int/lit8 v8, v0, 0x20

    if-eqz v8, :cond_5

    const/4 v8, 0x0

    goto :goto_5

    :cond_5
    move-object/from16 v8, p8

    :goto_5
    and-int/lit8 v9, v0, 0x40

    if-eqz v9, :cond_6

    const/4 v9, 0x0

    goto :goto_6

    :cond_6
    move/from16 v9, p9

    :goto_6
    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_7

    const-wide/16 v10, 0x0

    goto :goto_7

    :cond_7
    move-wide/from16 v10, p10

    :goto_7
    move-object p1, p0

    move-object p2, v1

    move-object p3, v3

    move-wide/from16 p4, v6

    move-wide/from16 p6, v4

    move/from16 p8, v2

    move-object/from16 p9, v8

    move/from16 p10, v9

    move-wide/from16 p11, v10

    .line 19
    invoke-direct/range {p1 .. p12}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;-><init>(Landroid/location/Location;Landroid/location/Location;DDFLpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;IJ)V

    return-void
.end method

.method public static synthetic copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;Landroid/location/Location;Landroid/location/Location;DDFLpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;IJILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;
    .locals 13

    move-object v0, p0

    move/from16 v1, p12

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->lastLocation:Landroid/location/Location;

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->nextLocation:Landroid/location/Location;

    goto :goto_1

    :cond_1
    move-object v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-wide v4, v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->distance:D

    goto :goto_2

    :cond_2
    move-wide/from16 v4, p3

    :goto_2
    and-int/lit8 v6, v1, 0x8

    if-eqz v6, :cond_3

    iget-wide v6, v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->step:D

    goto :goto_3

    :cond_3
    move-wide/from16 v6, p5

    :goto_3
    and-int/lit8 v8, v1, 0x10

    if-eqz v8, :cond_4

    iget v8, v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->distanceUntil:F

    goto :goto_4

    :cond_4
    move/from16 v8, p7

    :goto_4
    and-int/lit8 v9, v1, 0x20

    if-eqz v9, :cond_5

    iget-object v9, v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->heartRate:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;

    goto :goto_5

    :cond_5
    move-object/from16 v9, p8

    :goto_5
    and-int/lit8 v10, v1, 0x40

    if-eqz v10, :cond_6

    iget v10, v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->elevation:I

    goto :goto_6

    :cond_6
    move/from16 v10, p9

    :goto_6
    and-int/lit16 v1, v1, 0x80

    if-eqz v1, :cond_7

    iget-wide v11, v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->timestamp:J

    goto :goto_7

    :cond_7
    move-wide/from16 v11, p10

    :goto_7
    move-object p1, v2

    move-object p2, v3

    move-wide/from16 p3, v4

    move-wide/from16 p5, v6

    move/from16 p7, v8

    move-object/from16 p8, v9

    move/from16 p9, v10

    move-wide/from16 p10, v11

    invoke-virtual/range {p0 .. p11}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->copy(Landroid/location/Location;Landroid/location/Location;DDFLpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;IJ)Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Landroid/location/Location;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->lastLocation:Landroid/location/Location;

    return-object v0
.end method

.method public final component2()Landroid/location/Location;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->nextLocation:Landroid/location/Location;

    return-object v0
.end method

.method public final component3()D
    .locals 2

    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->distance:D

    return-wide v0
.end method

.method public final component4()D
    .locals 2

    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->step:D

    return-wide v0
.end method

.method public final component5()F
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->distanceUntil:F

    return v0
.end method

.method public final component6()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->heartRate:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;

    return-object v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->elevation:I

    return v0
.end method

.method public final component8()J
    .locals 2

    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->timestamp:J

    return-wide v0
.end method

.method public final copy(Landroid/location/Location;Landroid/location/Location;DDFLpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;IJ)Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;
    .locals 13

    const-string v0, "lastLocation"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nextLocation"

    move-object v3, p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;

    move-object v1, v0

    move-wide/from16 v4, p3

    move-wide/from16 v6, p5

    move/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p9

    move-wide/from16 v11, p10

    invoke-direct/range {v1 .. v12}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;-><init>(Landroid/location/Location;Landroid/location/Location;DDFLpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;IJ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->lastLocation:Landroid/location/Location;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->lastLocation:Landroid/location/Location;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->nextLocation:Landroid/location/Location;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->nextLocation:Landroid/location/Location;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->distance:D

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iget-wide v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->distance:D

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->step:D

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iget-wide v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->step:D

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->distanceUntil:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->distanceUntil:F

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->heartRate:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->heartRate:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->elevation:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->elevation:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-wide v3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->timestamp:J

    iget-wide v5, p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->timestamp:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getDistance()D
    .locals 2

    .line 21
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->distance:D

    return-wide v0
.end method

.method public final getDistanceUntil()F
    .locals 1

    .line 23
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->distanceUntil:F

    return v0
.end method

.method public final getElevation()I
    .locals 1

    .line 25
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->elevation:I

    return v0
.end method

.method public final getHeartRate()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;
    .locals 1

    .line 24
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->heartRate:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;

    return-object v0
.end method

.method public final getLastLocation()Landroid/location/Location;
    .locals 1

    .line 19
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->lastLocation:Landroid/location/Location;

    return-object v0
.end method

.method public final getNextLocation()Landroid/location/Location;
    .locals 1

    .line 20
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->nextLocation:Landroid/location/Location;

    return-object v0
.end method

.method public final getStep()D
    .locals 2

    .line 22
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->step:D

    return-wide v0
.end method

.method public final getTimestamp()J
    .locals 2

    .line 26
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->timestamp:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->lastLocation:Landroid/location/Location;

    invoke-virtual {v0}, Landroid/location/Location;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->nextLocation:Landroid/location/Location;

    invoke-virtual {v1}, Landroid/location/Location;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->distance:D

    invoke-static {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo-$$ExternalSynthetic0;->m0(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->step:D

    invoke-static {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo-$$ExternalSynthetic0;->m0(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->distanceUntil:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->heartRate:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->elevation:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->timestamp:J

    invoke-static {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter$SleepSession-$$ExternalSynthetic0;->m0(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setDistance(D)V
    .locals 0

    .line 21
    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->distance:D

    return-void
.end method

.method public final setDistanceUntil(F)V
    .locals 0

    .line 23
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->distanceUntil:F

    return-void
.end method

.method public final setElevation(I)V
    .locals 0

    .line 25
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->elevation:I

    return-void
.end method

.method public final setHeartRate(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;)V
    .locals 0

    .line 24
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->heartRate:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;

    return-void
.end method

.method public final setLastLocation(Landroid/location/Location;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->lastLocation:Landroid/location/Location;

    return-void
.end method

.method public final setNextLocation(Landroid/location/Location;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->nextLocation:Landroid/location/Location;

    return-void
.end method

.method public final setStep(D)V
    .locals 0

    .line 22
    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->step:D

    return-void
.end method

.method public final setTimestamp(J)V
    .locals 0

    .line 26
    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->timestamp:J

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RunningAnimation(lastLocation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->lastLocation:Landroid/location/Location;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", nextLocation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->nextLocation:Landroid/location/Location;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", distance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->distance:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", step="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->step:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", distanceUntil="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->distanceUntil:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", heartRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->heartRate:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", elevation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->elevation:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", timestamp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->timestamp:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
