.class public final Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;
.super Ljava/lang/Object;
.source "TCXWriter.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\"\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0086\u0008\u0018\u00002\u00020\u0001B]\u0012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0012J\u000f\u0010$\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0006H\u00c6\u0003J\t\u0010&\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0008H\u00c6\u0003J\t\u0010(\u001a\u00020\nH\u00c6\u0003J\t\u0010)\u001a\u00020\nH\u00c6\u0003J\t\u0010*\u001a\u00020\rH\u00c6\u0003J\t\u0010+\u001a\u00020\rH\u00c6\u0003J\t\u0010,\u001a\u00020\rH\u00c6\u0003J\t\u0010-\u001a\u00020\rH\u00c6\u0003Js\u0010.\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010/\u001a\u0002002\u0008\u00101\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00102\u001a\u00020\rH\u00d6\u0001J\t\u00103\u001a\u00020\u0008H\u00d6\u0001R\u0011\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0011\u0010\u000f\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001aR\u001a\u0010\u0011\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001b\u0010\u0018\"\u0004\u0008\u001c\u0010\u001dR\u0011\u0010\u0010\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u0014R\u0017\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010 R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010#\u00a8\u00064"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;",
        "",
        "points",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;",
        "distance",
        "",
        "type",
        "",
        "startTime",
        "",
        "endTime",
        "activeCalories",
        "",
        "bmrCalories",
        "avgHeartRate",
        "maxHeartRate",
        "lastDistance",
        "(Ljava/util/List;FLjava/lang/String;JJIIIIF)V",
        "getActiveCalories",
        "()I",
        "getAvgHeartRate",
        "getBmrCalories",
        "getDistance",
        "()F",
        "getEndTime",
        "()J",
        "getLastDistance",
        "setLastDistance",
        "(F)V",
        "getMaxHeartRate",
        "getPoints",
        "()Ljava/util/List;",
        "getStartTime",
        "getType",
        "()Ljava/lang/String;",
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
.field private final activeCalories:I

.field private final avgHeartRate:I

.field private final bmrCalories:I

.field private final distance:F

.field private final endTime:J

.field private lastDistance:F

.field private final maxHeartRate:I

.field private final points:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;",
            ">;"
        }
    .end annotation
.end field

.field private final startTime:J

.field private final type:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/util/List;FLjava/lang/String;JJIIIIF)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;",
            ">;F",
            "Ljava/lang/String;",
            "JJIIIIF)V"
        }
    .end annotation

    const-string v0, "points"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->points:Ljava/util/List;

    .line 14
    iput p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->distance:F

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->type:Ljava/lang/String;

    .line 15
    iput-wide p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->startTime:J

    iput-wide p6, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->endTime:J

    .line 16
    iput p8, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->activeCalories:I

    iput p9, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->bmrCalories:I

    .line 17
    iput p10, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->avgHeartRate:I

    iput p11, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->maxHeartRate:I

    iput p12, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->lastDistance:F

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;FLjava/lang/String;JJIIIIFILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 14

    move/from16 v0, p13

    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    const/4 v13, 0x0

    goto :goto_0

    :cond_0
    move/from16 v13, p12

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move/from16 v3, p2

    move-object/from16 v4, p3

    move-wide/from16 v5, p4

    move-wide/from16 v7, p6

    move/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move/from16 v12, p11

    .line 13
    invoke-direct/range {v1 .. v13}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;-><init>(Ljava/util/List;FLjava/lang/String;JJIIIIF)V

    return-void
.end method

.method public static synthetic copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;Ljava/util/List;FLjava/lang/String;JJIIIIFILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;
    .locals 13

    move-object v0, p0

    move/from16 v1, p13

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->points:Ljava/util/List;

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget v3, v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->distance:F

    goto :goto_1

    :cond_1
    move v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->type:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-wide v5, v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->startTime:J

    goto :goto_3

    :cond_3
    move-wide/from16 v5, p4

    :goto_3
    and-int/lit8 v7, v1, 0x10

    if-eqz v7, :cond_4

    iget-wide v7, v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->endTime:J

    goto :goto_4

    :cond_4
    move-wide/from16 v7, p6

    :goto_4
    and-int/lit8 v9, v1, 0x20

    if-eqz v9, :cond_5

    iget v9, v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->activeCalories:I

    goto :goto_5

    :cond_5
    move/from16 v9, p8

    :goto_5
    and-int/lit8 v10, v1, 0x40

    if-eqz v10, :cond_6

    iget v10, v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->bmrCalories:I

    goto :goto_6

    :cond_6
    move/from16 v10, p9

    :goto_6
    and-int/lit16 v11, v1, 0x80

    if-eqz v11, :cond_7

    iget v11, v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->avgHeartRate:I

    goto :goto_7

    :cond_7
    move/from16 v11, p10

    :goto_7
    and-int/lit16 v12, v1, 0x100

    if-eqz v12, :cond_8

    iget v12, v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->maxHeartRate:I

    goto :goto_8

    :cond_8
    move/from16 v12, p11

    :goto_8
    and-int/lit16 v1, v1, 0x200

    if-eqz v1, :cond_9

    iget v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->lastDistance:F

    goto :goto_9

    :cond_9
    move/from16 v1, p12

    :goto_9
    move-object p1, v2

    move p2, v3

    move-object/from16 p3, v4

    move-wide/from16 p4, v5

    move-wide/from16 p6, v7

    move/from16 p8, v9

    move/from16 p9, v10

    move/from16 p10, v11

    move/from16 p11, v12

    move/from16 p12, v1

    invoke-virtual/range {p0 .. p12}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->copy(Ljava/util/List;FLjava/lang/String;JJIIIIF)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->points:Ljava/util/List;

    return-object v0
.end method

.method public final component10()F
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->lastDistance:F

    return v0
.end method

.method public final component2()F
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->distance:F

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()J
    .locals 2

    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->startTime:J

    return-wide v0
.end method

.method public final component5()J
    .locals 2

    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->endTime:J

    return-wide v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->activeCalories:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->bmrCalories:I

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->avgHeartRate:I

    return v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->maxHeartRate:I

    return v0
.end method

.method public final copy(Ljava/util/List;FLjava/lang/String;JJIIIIF)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;",
            ">;F",
            "Ljava/lang/String;",
            "JJIIIIF)",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;"
        }
    .end annotation

    const-string v0, "points"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;

    move-object v1, v0

    move/from16 v3, p2

    move-wide/from16 v5, p4

    move-wide/from16 v7, p6

    move/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move/from16 v12, p11

    move/from16 v13, p12

    invoke-direct/range {v1 .. v13}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;-><init>(Ljava/util/List;FLjava/lang/String;JJIIIIF)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->points:Ljava/util/List;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->points:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->distance:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->distance:F

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->type:Ljava/lang/String;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->startTime:J

    iget-wide v5, p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->startTime:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->endTime:J

    iget-wide v5, p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->endTime:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->activeCalories:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->activeCalories:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->bmrCalories:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->bmrCalories:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->avgHeartRate:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->avgHeartRate:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->maxHeartRate:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->maxHeartRate:I

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->lastDistance:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iget p1, p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->lastDistance:F

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getActiveCalories()I
    .locals 1

    .line 16
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->activeCalories:I

    return v0
.end method

.method public final getAvgHeartRate()I
    .locals 1

    .line 17
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->avgHeartRate:I

    return v0
.end method

.method public final getBmrCalories()I
    .locals 1

    .line 16
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->bmrCalories:I

    return v0
.end method

.method public final getDistance()F
    .locals 1

    .line 14
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->distance:F

    return v0
.end method

.method public final getEndTime()J
    .locals 2

    .line 15
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->endTime:J

    return-wide v0
.end method

.method public final getLastDistance()F
    .locals 1

    .line 17
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->lastDistance:F

    return v0
.end method

.method public final getMaxHeartRate()I
    .locals 1

    .line 17
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->maxHeartRate:I

    return v0
.end method

.method public final getPoints()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;",
            ">;"
        }
    .end annotation

    .line 13
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->points:Ljava/util/List;

    return-object v0
.end method

.method public final getStartTime()J
    .locals 2

    .line 15
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->startTime:J

    return-wide v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    .line 14
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->type:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->points:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->distance:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->type:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->startTime:J

    invoke-static {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter$SleepSession-$$ExternalSynthetic0;->m0(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->endTime:J

    invoke-static {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter$SleepSession-$$ExternalSynthetic0;->m0(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->activeCalories:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->bmrCalories:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->avgHeartRate:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->maxHeartRate:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->lastDistance:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setLastDistance(F)V
    .locals 0

    .line 17
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->lastDistance:F

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TCXActivity(points="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->points:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", distance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->distance:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->type:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", startTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->startTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", endTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->endTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", activeCalories="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->activeCalories:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", bmrCalories="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->bmrCalories:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", avgHeartRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->avgHeartRate:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", maxHeartRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->maxHeartRate:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", lastDistance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->lastDistance:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
