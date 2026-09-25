.class public final Lpowerwatch/matrix/com/pwgen2android/shared/ui/DistanceAnimator;
.super Ljava/lang/Object;
.source "DistanceAnimator.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDistanceAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DistanceAnimator.kt\npowerwatch/matrix/com/pwgen2android/shared/ui/DistanceAnimator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,67:1\n3287#2,7:68\n3318#2,10:75\n1358#2:85\n1444#2,2:86\n1849#2,2:88\n1446#2,3:90\n3318#2,10:93\n764#2:103\n855#2,2:104\n1557#2:106\n1588#2,4:107\n*S KotlinDebug\n*F\n+ 1 DistanceAnimator.kt\npowerwatch/matrix/com/pwgen2android/shared/ui/DistanceAnimator\n*L\n16#1:68,7\n19#1:75,10\n28#1:85\n28#1:86,2\n36#1:88,2\n28#1:90,3\n44#1:93,10\n49#1:103\n49#1:104,2\n58#1:106\n58#1:107,4\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\u0008\u001a\u00020\t\u00a8\u0006\n"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/DistanceAnimator;",
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
    .locals 21
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

    .line 12
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getGpsPositions()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 16
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getHeartRates()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .line 68
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 69
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .line 70
    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v0, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-static {v1, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-direct {v4, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 71
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 72
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;

    .line 17
    new-instance v6, Lkotlin/Pair;

    invoke-direct {v6, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 74
    :cond_0
    check-cast v4, Ljava/util/List;

    check-cast v4, Ljava/lang/Iterable;

    .line 75
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 76
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    goto/16 :goto_2

    .line 77
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/List;

    .line 78
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 79
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 80
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 81
    move-object v4, v3

    check-cast v4, Lkotlin/Pair;

    check-cast v2, Lkotlin/Pair;

    .line 20
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

    .line 21
    invoke-virtual {v2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;

    invoke-static {v6}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/ActivityPeriodsModelsKt;->toLocation(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;)Landroid/location/Location;

    move-result-object v6

    invoke-virtual {v5, v6}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->setLastLocation(Landroid/location/Location;)V

    .line 22
    invoke-virtual {v4}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;

    invoke-static {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/ActivityPeriodsModelsKt;->toLocation(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;)Landroid/location/Location;

    move-result-object v4

    invoke-virtual {v5, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->setNextLocation(Landroid/location/Location;)V

    .line 23
    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->getLastLocation()Landroid/location/Location;

    move-result-object v4

    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->getNextLocation()Landroid/location/Location;

    move-result-object v6

    invoke-virtual {v4, v6}, Landroid/location/Location;->distanceTo(Landroid/location/Location;)F

    move-result v4

    float-to-double v6, v4

    invoke-virtual {v5, v6, v7}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->setDistance(D)V

    .line 24
    invoke-virtual {v2}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;

    invoke-virtual {v5, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->setHeartRate(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;)V

    .line 25
    invoke-virtual {v2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;->getAltitude()D

    move-result-wide v6

    invoke-static {v6, v7}, Lkotlin/math/MathKt;->roundToInt(D)I

    move-result v2

    invoke-virtual {v5, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->setElevation(I)V

    .line 20
    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object v2, v3

    const/16 v5, 0xa

    goto :goto_1

    :cond_2
    move-object v0, v1

    .line 84
    :goto_2
    check-cast v0, Ljava/lang/Iterable;

    .line 85
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/Collection;

    .line 86
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x2

    const/4 v5, 0x0

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 87
    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;

    .line 29
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    move-object v15, v6

    check-cast v15, Ljava/util/List;

    .line 30
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->getDistance()D

    move-result-wide v6

    invoke-static {v6, v7}, Lkotlin/math/MathKt;->roundToInt(D)I

    move-result v14

    .line 31
    move-object/from16 v6, p0

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->getDistance()D

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v7

    const-string v8, "Gps location mapping: Distance between previous: "

    invoke-static {v8, v7}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7, v5, v3, v5}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    if-nez v14, :cond_3

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0xff

    const/16 v19, 0x0

    move-object v6, v2

    move v4, v14

    move-object v14, v3

    move-object v3, v15

    move v15, v5

    .line 33
    invoke-static/range {v6 .. v19}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;Landroid/location/Location;Landroid/location/Location;DDFLpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;IJILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;

    move-result-object v5

    .line 34
    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_3
    move v4, v14

    move-object v3, v15

    .line 36
    :goto_4
    new-instance v5, Lkotlin/ranges/IntRange;

    const/4 v6, 0x1

    invoke-direct {v5, v6, v4}, Lkotlin/ranges/IntRange;-><init>(II)V

    check-cast v5, Ljava/lang/Iterable;

    .line 88
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    move-object v6, v5

    check-cast v6, Lkotlin/collections/IntIterator;

    invoke-virtual {v6}, Lkotlin/collections/IntIterator;->nextInt()I

    .line 37
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->getDistance()D

    move-result-wide v6

    int-to-double v8, v4

    div-double v9, v6, v8

    .line 38
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->getStep()D

    move-result-wide v6

    add-double/2addr v6, v9

    invoke-virtual {v2, v6, v7}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->setStep(D)V

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0xfb

    const/16 v19, 0x0

    move-object v6, v2

    .line 39
    invoke-static/range {v6 .. v19}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;Landroid/location/Location;Landroid/location/Location;DDFLpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;IJILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;

    move-result-object v6

    .line 40
    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 42
    :cond_4
    move-object v15, v3

    check-cast v15, Ljava/lang/Iterable;

    .line 90
    invoke-static {v1, v15}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto/16 :goto_3

    :cond_5
    const/4 v6, 0x1

    .line 92
    check-cast v1, Ljava/util/List;

    .line 85
    check-cast v1, Ljava/lang/Iterable;

    .line 93
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 94
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_6

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    goto :goto_7

    .line 95
    :cond_6
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/List;

    .line 96
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 97
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_7

    .line 98
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 99
    move-object v7, v4

    check-cast v7, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;

    .line 45
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->getDistanceUntil()F

    move-result v8

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->getDistance()D

    move-result-wide v9

    double-to-float v9, v9

    add-float/2addr v8, v9

    invoke-virtual {v2, v8}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->setDistanceUntil(F)V

    .line 46
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->getDistanceUntil()F

    move-result v8

    invoke-virtual {v7, v8}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->setDistanceUntil(F)V

    .line 47
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object v2, v4

    goto :goto_6

    :cond_7
    move-object v0, v1

    .line 102
    :goto_7
    check-cast v0, Ljava/lang/Iterable;

    .line 103
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/Collection;

    .line 104
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_8
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v4, 0x0

    if-eqz v2, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;

    .line 49
    invoke-virtual {v7}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->getDistance()D

    move-result-wide v7

    const-wide/16 v9, 0x0

    cmpl-double v11, v7, v9

    if-lez v11, :cond_9

    const/4 v4, 0x1

    :cond_9
    if-eqz v4, :cond_8

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_8

    .line 105
    :cond_a
    check-cast v1, Ljava/util/List;

    .line 51
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;

    if-nez v0, :cond_b

    const/4 v0, 0x0

    goto :goto_9

    .line 53
    :cond_b
    move-object/from16 v2, p0

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->getDistanceUntil()F

    move-result v6

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    const-string v7, "Activity animation calculated, DistanceUntil total: "

    invoke-static {v7, v6}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v2, v6, v5, v3, v5}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 54
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->getDistanceUntil()F

    move-result v0

    .line 57
    :goto_9
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    .line 58
    check-cast v1, Ljava/lang/Iterable;

    .line 106
    new-instance v3, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v1, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v3, Ljava/util/Collection;

    .line 108
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_d

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v6, v4, 0x1

    if-gez v4, :cond_c

    .line 109
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_c
    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;

    int-to-float v4, v4

    const/high16 v7, 0x42c80000    # 100.0f

    int-to-float v8, v2

    div-float/2addr v7, v8

    mul-float v4, v4, v7

    .line 59
    invoke-static {v4}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v4

    .line 60
    new-instance v7, Lpowerwatch/matrix/com/pwgen2android/shared/ui/MapAnimationData;

    invoke-direct {v7, v5, v0, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/MapAnimationData;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;FI)V

    invoke-interface {v3, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v4, v6

    goto :goto_a

    .line 110
    :cond_d
    check-cast v3, Ljava/util/List;

    .line 106
    check-cast v3, Ljava/lang/Iterable;

    .line 63
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->distinct(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    .line 65
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
