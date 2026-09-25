.class public final Lpowerwatch/matrix/com/pwgen2android/shared/ui/TimeAnimator;
.super Ljava/lang/Object;
.source "TimeAnimator.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTimeAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeAnimator.kt\npowerwatch/matrix/com/pwgen2android/shared/ui/TimeAnimator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,70:1\n3287#2,7:71\n3318#2,10:78\n1358#2:88\n1444#2,2:89\n1849#2,2:91\n1446#2,3:93\n3318#2,10:96\n1547#2:106\n1618#2,3:107\n1557#2:110\n1588#2,4:111\n*S KotlinDebug\n*F\n+ 1 TimeAnimator.kt\npowerwatch/matrix/com/pwgen2android/shared/ui/TimeAnimator\n*L\n15#1:71,7\n18#1:78,10\n28#1:88\n28#1:89,2\n35#1:91,2\n28#1:93,3\n46#1:96,10\n53#1:106\n53#1:107,3\n61#1:110\n61#1:111,4\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\u0008\u001a\u00020\t\u00a8\u0006\n"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/TimeAnimator;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "()V",
        "create",
        "Lkotlin/Pair;",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/MapAnimationData;",
        "",
        "userActivitySession",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
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

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final create(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)Lkotlin/Pair;
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
            ")",
            "Lkotlin/Pair<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/MapAnimationData;",
            ">;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    const-string v0, "userActivitySession"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getGpsPositions()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 15
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getHeartRates()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .line 71
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 72
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .line 73
    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v0, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-static {v1, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-direct {v4, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 74
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 75
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;

    .line 16
    new-instance v6, Lkotlin/Triple;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;->getTimestamp()J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-direct {v6, v0, v1, v7}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 77
    :cond_0
    check-cast v4, Ljava/util/List;

    check-cast v4, Ljava/lang/Iterable;

    .line 78
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 79
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    goto/16 :goto_2

    .line 80
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/List;

    .line 81
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 82
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 83
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 84
    move-object v4, v3

    check-cast v4, Lkotlin/Triple;

    check-cast v2, Lkotlin/Triple;

    .line 19
    new-instance v15, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0xff

    const/16 v20, 0x0

    move-object v6, v15

    move-object v5, v15

    move/from16 v15, v16

    move-wide/from16 v16, v17

    move/from16 v18, v19

    move-object/from16 v19, v20

    invoke-direct/range {v6 .. v19}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;-><init>(Landroid/location/Location;Landroid/location/Location;DDFLpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;IJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 20
    invoke-virtual {v2}, Lkotlin/Triple;->getFirst()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;

    invoke-static {v6}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/ActivityPeriodsModelsKt;->toLocation(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;)Landroid/location/Location;

    move-result-object v6

    invoke-virtual {v5, v6}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->setLastLocation(Landroid/location/Location;)V

    .line 21
    invoke-virtual {v4}, Lkotlin/Triple;->getFirst()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;

    invoke-static {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/ActivityPeriodsModelsKt;->toLocation(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;)Landroid/location/Location;

    move-result-object v4

    invoke-virtual {v5, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->setNextLocation(Landroid/location/Location;)V

    .line 22
    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->getLastLocation()Landroid/location/Location;

    move-result-object v4

    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->getNextLocation()Landroid/location/Location;

    move-result-object v6

    invoke-virtual {v4, v6}, Landroid/location/Location;->distanceTo(Landroid/location/Location;)F

    move-result v4

    float-to-double v6, v4

    invoke-virtual {v5, v6, v7}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->setDistance(D)V

    .line 23
    invoke-virtual {v2}, Lkotlin/Triple;->getSecond()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;

    invoke-virtual {v5, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->setHeartRate(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;)V

    const-wide/16 v6, 0x3e8

    .line 24
    invoke-virtual {v5, v6, v7}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->setTimestamp(J)V

    .line 25
    invoke-virtual {v2}, Lkotlin/Triple;->getFirst()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;->getAltitude()D

    move-result-wide v6

    invoke-static {v6, v7}, Lkotlin/math/MathKt;->roundToInt(D)I

    move-result v2

    invoke-virtual {v5, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->setElevation(I)V

    .line 19
    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object v2, v3

    const/16 v5, 0xa

    goto :goto_1

    :cond_2
    move-object v0, v1

    .line 87
    :goto_2
    check-cast v0, Ljava/lang/Iterable;

    .line 88
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/Collection;

    .line 89
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 90
    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;

    .line 29
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    move-object v15, v3

    check-cast v15, Ljava/util/List;

    .line 30
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->getDistance()D

    move-result-wide v3

    invoke-static {v3, v4}, Lkotlin/math/MathKt;->roundToInt(D)I

    move-result v13

    if-nez v13, :cond_3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0xff

    const/16 v19, 0x0

    move-object v3, v2

    move/from16 v21, v13

    move-wide/from16 v13, v16

    move-object/from16 v22, v15

    move/from16 v15, v18

    move-object/from16 v16, v19

    .line 32
    invoke-static/range {v3 .. v16}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;Landroid/location/Location;Landroid/location/Location;DDFLpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;IJILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;

    move-result-object v3

    move-object/from16 v15, v22

    .line 33
    invoke-interface {v15, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_3
    move/from16 v21, v13

    .line 35
    :goto_4
    new-instance v3, Lkotlin/ranges/IntRange;

    const/4 v4, 0x1

    move/from16 v13, v21

    invoke-direct {v3, v4, v13}, Lkotlin/ranges/IntRange;-><init>(II)V

    check-cast v3, Ljava/lang/Iterable;

    .line 91
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v17

    :goto_5
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    move-object/from16 v3, v17

    check-cast v3, Lkotlin/collections/IntIterator;

    invoke-virtual {v3}, Lkotlin/collections/IntIterator;->nextInt()I

    .line 36
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->getDistance()D

    move-result-wide v3

    int-to-double v5, v13

    div-double v6, v3, v5

    .line 37
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->getStep()D

    move-result-wide v3

    add-double/2addr v3, v6

    invoke-virtual {v2, v3, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->setStep(D)V

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v18, 0x0

    const/16 v16, 0xfb

    const/16 v20, 0x0

    move-object v3, v2

    move/from16 v23, v13

    move-wide/from16 v13, v18

    move-object/from16 v24, v15

    move/from16 v15, v16

    move-object/from16 v16, v20

    .line 38
    invoke-static/range {v3 .. v16}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;Landroid/location/Location;Landroid/location/Location;DDFLpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;IJILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;

    move-result-object v3

    .line 40
    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->getTimestamp()J

    move-result-wide v4

    move/from16 v6, v23

    int-to-long v7, v6

    div-long/2addr v4, v7

    invoke-virtual {v3, v4, v5}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->setTimestamp(J)V

    move-object/from16 v4, v24

    .line 42
    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object v15, v4

    move v13, v6

    goto :goto_5

    :cond_4
    move-object v4, v15

    .line 44
    move-object v15, v4

    check-cast v15, Ljava/lang/Iterable;

    .line 93
    invoke-static {v1, v15}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto/16 :goto_3

    .line 95
    :cond_5
    check-cast v1, Ljava/util/List;

    .line 88
    check-cast v1, Ljava/lang/Iterable;

    .line 96
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 97
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_6

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    goto :goto_7

    .line 98
    :cond_6
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/List;

    .line 99
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 100
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    .line 101
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 102
    move-object v4, v3

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;

    .line 47
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->getDistanceUntil()F

    move-result v5

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->getTimestamp()J

    move-result-wide v6

    long-to-float v6, v6

    add-float/2addr v5, v6

    invoke-virtual {v2, v5}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->setDistanceUntil(F)V

    .line 48
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->getDistanceUntil()F

    move-result v5

    invoke-virtual {v4, v5}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->setDistanceUntil(F)V

    .line 50
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object v2, v3

    goto :goto_6

    :cond_7
    move-object v0, v1

    .line 105
    :goto_7
    check-cast v0, Ljava/lang/Iterable;

    .line 106
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v1, Ljava/util/Collection;

    .line 107
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 108
    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;

    .line 53
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_8

    .line 109
    :cond_8
    check-cast v1, Ljava/util/List;

    .line 56
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;

    if-nez v0, :cond_9

    const/4 v0, 0x0

    goto :goto_9

    .line 57
    :cond_9
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->getDistanceUntil()F

    move-result v0

    .line 60
    :goto_9
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    .line 61
    check-cast v1, Ljava/lang/Iterable;

    .line 110
    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v1, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v3, Ljava/util/Collection;

    const/4 v4, 0x0

    .line 112
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v6, v4, 0x1

    if-gez v4, :cond_a

    .line 113
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_a
    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;

    int-to-float v4, v4

    const/high16 v7, 0x42c80000    # 100.0f

    int-to-float v8, v2

    div-float/2addr v7, v8

    mul-float v4, v4, v7

    .line 62
    invoke-static {v4}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v4

    .line 63
    new-instance v7, Lpowerwatch/matrix/com/pwgen2android/shared/ui/MapAnimationData;

    invoke-direct {v7, v5, v0, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/MapAnimationData;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;FI)V

    invoke-interface {v3, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v4, v6

    goto :goto_a

    .line 114
    :cond_b
    check-cast v3, Ljava/util/List;

    .line 110
    check-cast v3, Ljava/lang/Iterable;

    .line 66
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->distinct(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    .line 68
    new-instance v1, Lkotlin/Pair;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1
.end method

.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 9
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method
