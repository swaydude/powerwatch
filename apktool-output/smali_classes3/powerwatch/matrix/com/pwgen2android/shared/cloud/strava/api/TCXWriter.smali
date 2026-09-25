.class public final Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXWriter;
.super Ljava/lang/Object;
.source "TCXWriter.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTCXWriter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TCXWriter.kt\npowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXWriter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,133:1\n1547#2:134\n1618#2,3:135\n764#2:138\n855#2,2:139\n3318#2,10:141\n1798#2,4:151\n1895#2,14:155\n1547#2:169\n1618#2,3:170\n1849#2,2:173\n*S KotlinDebug\n*F\n+ 1 TCXWriter.kt\npowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXWriter\n*L\n37#1:134\n37#1:135,3\n44#1:138\n44#1:139,2\n44#1:141,10\n49#1:151,4\n56#1:155,14\n57#1:169\n57#1:170,3\n104#1:173,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u000e\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u0008\u00a8\u0006\r"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXWriter;",
        "",
        "()V",
        "gpsPosition",
        "",
        "point",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;",
        "mapToTCXActivity",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;",
        "userActivitySession",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
        "write",
        "tcxActivity",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final gpsPosition(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;)Ljava/lang/String;
    .locals 7

    .line 126
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;->getLat()D

    move-result-wide v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    cmpg-double v6, v0, v4

    if-nez v6, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;->getLong()D

    move-result-wide v0

    cmpg-double v6, v0, v4

    if-nez v6, :cond_1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_2

    const-string p1, ""

    goto :goto_2

    .line 127
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, " <Position>\n                            <LatitudeDegrees>"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;->getLat()D

    move-result-wide v1

    .line 127
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, "</LatitudeDegrees>\n                            <LongitudeDegrees>"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;->getLong()D

    move-result-wide v1

    .line 127
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string p1, "</LongitudeDegrees>\n                          </Position>\n            "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_2
    return-object p1
.end method


# virtual methods
.method public final mapToTCXActivity(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;
    .locals 32

    const-string v0, "userActivitySession"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getGpsPositions()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 36
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getHeartRates()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->zip(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 134
    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v2, Ljava/util/Collection;

    .line 135
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 136
    check-cast v4, Lkotlin/Pair;

    .line 38
    invoke-virtual {v4}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;

    .line 39
    invoke-virtual {v4}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;

    .line 40
    new-instance v15, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;

    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;->getLatitude()D

    move-result-wide v7

    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;->getLongitude()D

    move-result-wide v9

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;->getValue()I

    move-result v11

    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;->getTimestamp()J

    move-result-wide v12

    const/4 v14, 0x0

    const/16 v4, 0x10

    const/16 v16, 0x0

    move-object v6, v15

    move-object v5, v15

    move v15, v4

    invoke-direct/range {v6 .. v16}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;-><init>(DDIJFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v2, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 137
    :cond_0
    move-object v0, v2

    check-cast v0, Ljava/util/List;

    .line 44
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getGpsPositions()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .line 138
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    check-cast v4, Ljava/util/Collection;

    .line 139
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v7, v5

    check-cast v7, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;

    .line 44
    invoke-virtual {v7}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;->getLatitude()D

    move-result-wide v8

    const-wide/16 v10, 0x0

    const/4 v12, 0x1

    cmpg-double v13, v8, v10

    if-nez v13, :cond_2

    const/4 v8, 0x1

    goto :goto_2

    :cond_2
    const/4 v8, 0x0

    :goto_2
    if-nez v8, :cond_4

    invoke-virtual {v7}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;->getLongitude()D

    move-result-wide v7

    cmpg-double v9, v7, v10

    if-nez v9, :cond_3

    const/4 v7, 0x1

    goto :goto_3

    :cond_3
    const/4 v7, 0x0

    :goto_3
    if-nez v7, :cond_4

    const/4 v6, 0x1

    :cond_4
    if-eqz v6, :cond_1

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 140
    :cond_5
    check-cast v4, Ljava/util/List;

    .line 138
    check-cast v4, Ljava/lang/Iterable;

    .line 141
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 142
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_6

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v2

    goto :goto_5

    .line 143
    :cond_6
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    check-cast v4, Ljava/util/List;

    .line 144
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 145
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_7

    .line 146
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 147
    move-object v8, v7

    check-cast v8, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;

    .line 45
    invoke-static {v5}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/ActivityPeriodsModelsKt;->toLocation(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;)Landroid/location/Location;

    move-result-object v5

    invoke-static {v8}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/ActivityPeriodsModelsKt;->toLocation(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;)Landroid/location/Location;

    move-result-object v8

    invoke-virtual {v5, v8}, Landroid/location/Location;->distanceTo(Landroid/location/Location;)F

    move-result v5

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object v5, v7

    goto :goto_4

    :cond_7
    move-object v2, v4

    .line 49
    :goto_5
    check-cast v2, Ljava/lang/Iterable;

    const/4 v4, 0x0

    .line 153
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v5, 0x0

    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    add-int/lit8 v8, v5, 0x1

    if-gez v5, :cond_8

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_8
    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    move-result v7

    .line 50
    invoke-static {v0, v5}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;

    if-nez v5, :cond_9

    goto :goto_8

    :cond_9
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getDistance()F

    move-result v9

    cmpl-float v9, v4, v9

    if-lez v9, :cond_a

    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getDistance()F

    move-result v9

    goto :goto_7

    :cond_a
    move v9, v4

    :goto_7
    invoke-virtual {v5, v9}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;->setDistanceFromStart(F)V

    :goto_8
    add-float/2addr v4, v7

    move v5, v8

    goto :goto_6

    .line 54
    :cond_b
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;

    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getDistance()F

    move-result v4

    invoke-virtual {v2, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;->setDistanceFromStart(F)V

    .line 56
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getHeartRates()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .line 155
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 156
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_c

    const/4 v2, 0x0

    goto :goto_a

    .line 157
    :cond_c
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 158
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_d

    :goto_9
    move-object v2, v4

    goto :goto_a

    .line 159
    :cond_d
    move-object v5, v4

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;

    .line 56
    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;->getValue()I

    move-result v5

    .line 161
    :cond_e
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 162
    move-object v8, v7

    check-cast v8, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;

    .line 56
    invoke-virtual {v8}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;->getValue()I

    move-result v8

    if-ge v5, v8, :cond_f

    move-object v4, v7

    move v5, v8

    .line 167
    :cond_f
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-nez v7, :cond_e

    goto :goto_9

    .line 56
    :goto_a
    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;

    if-nez v2, :cond_10

    const/16 v28, 0x0

    goto :goto_b

    :cond_10
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;->getValue()I

    move-result v2

    move/from16 v28, v2

    .line 57
    :goto_b
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getHeartRates()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .line 169
    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v2, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v4, Ljava/util/Collection;

    .line 170
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_11

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 171
    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;

    .line 57
    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;->getValue()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v4, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_c

    .line 172
    :cond_11
    check-cast v4, Ljava/util/List;

    .line 169
    check-cast v4, Ljava/lang/Iterable;

    .line 57
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->averageOfInt(Ljava/lang/Iterable;)D

    move-result-wide v2

    double-to-int v2, v2

    .line 59
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;

    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getDistance()F

    move-result v19

    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getActivityType()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;

    move-result-object v4

    invoke-static {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXWriterKt;->getTCXType(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;)Ljava/lang/String;

    move-result-object v20

    .line 60
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getStartTime()J

    move-result-wide v21

    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getEndTime()J

    move-result-wide v23

    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getActiveCalories()I

    move-result v25

    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getBmrCalories()I

    move-result v26

    const/16 v29, 0x0

    const/16 v30, 0x200

    const/16 v31, 0x0

    move-object/from16 v17, v3

    move-object/from16 v18, v0

    move/from16 v27, v2

    .line 59
    invoke-direct/range {v17 .. v31}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;-><init>(Ljava/util/List;FLjava/lang/String;JJIIIIFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3
.end method

.method public final write(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;)Ljava/lang/String;
    .locals 7

    const-string v0, "tcxActivity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->gpxTimeFormat(J)Ljava/lang/String;

    move-result-object v0

    .line 68
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->getEndTime()J

    move-result-wide v1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->getStartTime()J

    move-result-wide v3

    sub-long/2addr v1, v3

    const/16 v3, 0x3e8

    int-to-long v4, v3

    div-long/2addr v1, v4

    .line 69
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->getActiveCalories()I

    move-result v4

    int-to-float v4, v4

    const/high16 v5, 0x3f800000    # 1.0f

    mul-float v4, v4, v5

    int-to-float v3, v3

    div-float/2addr v4, v3

    .line 70
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->getDistance()F

    move-result v3

    .line 71
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "\n<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\" ?> \n    <TrainingCenterDatabase xmlns=\"http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" \n                            xsi:schemaLocation=\"http://www.garmin.com/xmlschemas/ActivityExtension/v2 http://www.garmin.com/xmlschemas/ActivityExtensionv2.xsd \n                            http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2 http://www.garmin.com/xmlschemas/TrainingCenterDatabasev2.xsd\">\n        <Activities>\n            <Activity Sport=\""

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->getType()Ljava/lang/String;

    move-result-object v6

    .line 71
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "\">\n                <Id>"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "</Id>\n                <Lap StartTime=\""

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\">\n                    <TotalTimeSeconds>"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, "</TotalTimeSeconds>\n                    <DistanceMeters>"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, "</DistanceMeters>\n                    <Calories>"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, "</Calories>\n                    <AverageHeartRateBpm xsi:type=\"HeartRateInBeatsPerMinute_t\">\n                        <Value>"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->getAvgHeartRate()I

    move-result v0

    .line 71
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "</Value>\n                    </AverageHeartRateBpm>\n                    <MaximumHeartRateBpm xsi:type=\"HeartRateInBeatsPerMinute_t\">\n                        <Value>"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->getMaxHeartRate()I

    move-result v0

    .line 71
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "</Value>\n                    </MaximumHeartRateBpm>\n                    <Intensity>Active</Intensity>\n                    <TriggerMethod>Location</TriggerMethod>\n                    <Track>\n"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 103
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 104
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;->getPoints()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 173
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;

    .line 105
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "\n                        <Trackpoint>\n                        <DistanceMeters>"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;->getDistanceFromStart()F

    move-result v4

    .line 105
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v4, "</DistanceMeters>\n                        <Time>"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;->getTime()J

    move-result-wide v4

    invoke-static {v4, v5}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->gpxTimeFormat(J)Ljava/lang/String;

    move-result-object v4

    .line 105
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "</Time>\n                        "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    invoke-direct {p0, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXWriter;->gpsPosition(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;)Ljava/lang/String;

    move-result-object v4

    .line 105
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "\n                          <HeartRateBpm xsi:type=\"HeartRateInBeatsPerMinute_t\">\n                            <Value>"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;->getHeartRate()I

    move-result v2

    .line 105
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "</Value>\n                          </HeartRateBpm>\n                          <SensorState>Present</SensorState>\n                            <Extensions>\n                            <ns3:TPX/>\n                            </Extensions>\n                        </Trackpoint>\n                        "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 120
    :cond_0
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "pointBuild.toString()"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 122
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\n                    </Track>\n                </Lap>\n            </Activity>\n        </Activities>\n    </TrainingCenterDatabase>\n   "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
