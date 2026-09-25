.class public final Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;
.super Ljava/lang/Object;
.source "TCXWriter.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0013\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0008H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\nH\u00c6\u0003J;\u0010\u001c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010 \u001a\u00020\u0006H\u00d6\u0001J\t\u0010!\u001a\u00020\"H\u00d6\u0001R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006#"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;",
        "",
        "lat",
        "",
        "long",
        "heartRate",
        "",
        "time",
        "",
        "distanceFromStart",
        "",
        "(DDIJF)V",
        "getDistanceFromStart",
        "()F",
        "setDistanceFromStart",
        "(F)V",
        "getHeartRate",
        "()I",
        "getLat",
        "()D",
        "getLong",
        "getTime",
        "()J",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
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
.field private distanceFromStart:F

.field private final heartRate:I

.field private final lat:D

.field private final long:D

.field private final time:J


# direct methods
.method public constructor <init>(DDIJF)V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;->lat:D

    iput-wide p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;->long:D

    .line 11
    iput p5, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;->heartRate:I

    iput-wide p6, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;->time:J

    iput p8, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;->distanceFromStart:F

    return-void
.end method

.method public synthetic constructor <init>(DDIJFILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 10

    and-int/lit8 v0, p9, 0x10

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    const/4 v9, 0x0

    goto :goto_0

    :cond_0
    move/from16 v9, p8

    :goto_0
    move-object v1, p0

    move-wide v2, p1

    move-wide v4, p3

    move v6, p5

    move-wide/from16 v7, p6

    .line 10
    invoke-direct/range {v1 .. v9}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;-><init>(DDIJF)V

    return-void
.end method

.method public static synthetic copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;DDIJFILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;
    .locals 9

    move-object v0, p0

    and-int/lit8 v1, p9, 0x1

    if-eqz v1, :cond_0

    iget-wide v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;->lat:D

    goto :goto_0

    :cond_0
    move-wide v1, p1

    :goto_0
    and-int/lit8 v3, p9, 0x2

    if-eqz v3, :cond_1

    iget-wide v3, v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;->long:D

    goto :goto_1

    :cond_1
    move-wide v3, p3

    :goto_1
    and-int/lit8 v5, p9, 0x4

    if-eqz v5, :cond_2

    iget v5, v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;->heartRate:I

    goto :goto_2

    :cond_2
    move v5, p5

    :goto_2
    and-int/lit8 v6, p9, 0x8

    if-eqz v6, :cond_3

    iget-wide v6, v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;->time:J

    goto :goto_3

    :cond_3
    move-wide v6, p6

    :goto_3
    and-int/lit8 v8, p9, 0x10

    if-eqz v8, :cond_4

    iget v8, v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;->distanceFromStart:F

    goto :goto_4

    :cond_4
    move/from16 v8, p8

    :goto_4
    move-wide p1, v1

    move-wide p3, v3

    move p5, v5

    move-wide p6, v6

    move/from16 p8, v8

    invoke-virtual/range {p0 .. p8}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;->copy(DDIJF)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()D
    .locals 2

    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;->lat:D

    return-wide v0
.end method

.method public final component2()D
    .locals 2

    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;->long:D

    return-wide v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;->heartRate:I

    return v0
.end method

.method public final component4()J
    .locals 2

    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;->time:J

    return-wide v0
.end method

.method public final component5()F
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;->distanceFromStart:F

    return v0
.end method

.method public final copy(DDIJF)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;
    .locals 10

    new-instance v9, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;

    move-object v0, v9

    move-wide v1, p1

    move-wide v3, p3

    move v5, p5

    move-wide/from16 v6, p6

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;-><init>(DDIJF)V

    return-object v9
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;

    iget-wide v3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;->lat:D

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iget-wide v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;->lat:D

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;->long:D

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iget-wide v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;->long:D

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;->heartRate:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;->heartRate:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;->time:J

    iget-wide v5, p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;->time:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;->distanceFromStart:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iget p1, p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;->distanceFromStart:F

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getDistanceFromStart()F
    .locals 1

    .line 11
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;->distanceFromStart:F

    return v0
.end method

.method public final getHeartRate()I
    .locals 1

    .line 11
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;->heartRate:I

    return v0
.end method

.method public final getLat()D
    .locals 2

    .line 10
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;->lat:D

    return-wide v0
.end method

.method public final getLong()D
    .locals 2

    .line 10
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;->long:D

    return-wide v0
.end method

.method public final getTime()J
    .locals 2

    .line 11
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;->time:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;->lat:D

    invoke-static {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo-$$ExternalSynthetic0;->m0(D)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;->long:D

    invoke-static {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo-$$ExternalSynthetic0;->m0(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;->heartRate:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;->time:J

    invoke-static {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter$SleepSession-$$ExternalSynthetic0;->m0(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;->distanceFromStart:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setDistanceFromStart(F)V
    .locals 0

    .line 11
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;->distanceFromStart:F

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TCXPoint(lat="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;->lat:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", long="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;->long:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", heartRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;->heartRate:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", time="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;->time:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", distanceFromStart="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;->distanceFromStart:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
