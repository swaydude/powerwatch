.class public final Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXPoint;
.super Ljava/lang/Object;
.source "GPXXMLWriter.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u000e\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0008H\u00c6\u0003J1\u0010\u0015\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u001c"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXPoint;",
        "",
        "lat",
        "",
        "long",
        "heartRate",
        "",
        "time",
        "",
        "(DDIJ)V",
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
.field private final heartRate:I

.field private final lat:D

.field private final long:D

.field private final time:J


# direct methods
.method public constructor <init>(DDIJ)V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXPoint;->lat:D

    iput-wide p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXPoint;->long:D

    iput p5, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXPoint;->heartRate:I

    iput-wide p6, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXPoint;->time:J

    return-void
.end method

.method public static synthetic copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXPoint;DDIJILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXPoint;
    .locals 8

    move-object v0, p0

    and-int/lit8 v1, p8, 0x1

    if-eqz v1, :cond_0

    iget-wide v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXPoint;->lat:D

    goto :goto_0

    :cond_0
    move-wide v1, p1

    :goto_0
    and-int/lit8 v3, p8, 0x2

    if-eqz v3, :cond_1

    iget-wide v3, v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXPoint;->long:D

    goto :goto_1

    :cond_1
    move-wide v3, p3

    :goto_1
    and-int/lit8 v5, p8, 0x4

    if-eqz v5, :cond_2

    iget v5, v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXPoint;->heartRate:I

    goto :goto_2

    :cond_2
    move v5, p5

    :goto_2
    and-int/lit8 v6, p8, 0x8

    if-eqz v6, :cond_3

    iget-wide v6, v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXPoint;->time:J

    goto :goto_3

    :cond_3
    move-wide v6, p6

    :goto_3
    move-wide p1, v1

    move-wide p3, v3

    move p5, v5

    move-wide p6, v6

    invoke-virtual/range {p0 .. p7}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXPoint;->copy(DDIJ)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXPoint;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()D
    .locals 2

    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXPoint;->lat:D

    return-wide v0
.end method

.method public final component2()D
    .locals 2

    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXPoint;->long:D

    return-wide v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXPoint;->heartRate:I

    return v0
.end method

.method public final component4()J
    .locals 2

    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXPoint;->time:J

    return-wide v0
.end method

.method public final copy(DDIJ)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXPoint;
    .locals 9

    new-instance v8, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXPoint;

    move-object v0, v8

    move-wide v1, p1

    move-wide v3, p3

    move v5, p5

    move-wide v6, p6

    invoke-direct/range {v0 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXPoint;-><init>(DDIJ)V

    return-object v8
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXPoint;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXPoint;

    iget-wide v3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXPoint;->lat:D

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iget-wide v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXPoint;->lat:D

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXPoint;->long:D

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iget-wide v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXPoint;->long:D

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXPoint;->heartRate:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXPoint;->heartRate:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXPoint;->time:J

    iget-wide v5, p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXPoint;->time:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getHeartRate()I
    .locals 1

    .line 21
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXPoint;->heartRate:I

    return v0
.end method

.method public final getLat()D
    .locals 2

    .line 21
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXPoint;->lat:D

    return-wide v0
.end method

.method public final getLong()D
    .locals 2

    .line 21
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXPoint;->long:D

    return-wide v0
.end method

.method public final getTime()J
    .locals 2

    .line 21
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXPoint;->time:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXPoint;->lat:D

    invoke-static {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo-$$ExternalSynthetic0;->m0(D)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXPoint;->long:D

    invoke-static {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo-$$ExternalSynthetic0;->m0(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXPoint;->heartRate:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXPoint;->time:J

    invoke-static {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter$SleepSession-$$ExternalSynthetic0;->m0(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "GPXPoint(lat="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXPoint;->lat:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", long="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXPoint;->long:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", heartRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXPoint;->heartRate:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", time="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXPoint;->time:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
