.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeDataParser;
.super Ljava/lang/Object;
.source "RealtimeDataParser.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRealtimeDataParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealtimeDataParser.kt\npowerwatch/matrix/com/pwgen2android/sdk/RealtimeDataParser\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,96:1\n764#2:97\n855#2,2:98\n1547#2:100\n1618#2,3:101\n1849#2,2:104\n*S KotlinDebug\n*F\n+ 1 RealtimeDataParser.kt\npowerwatch/matrix/com/pwgen2android/sdk/RealtimeDataParser\n*L\n8#1:97\n8#1:98,2\n11#1:100\n11#1:101,3\n14#1:104,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J \u0010\u0007\u001a\u00020\u00082\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\rH\u0002\u00a8\u0006\u000e"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeDataParser;",
        "",
        "()V",
        "extractData",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;",
        "byteArray",
        "",
        "extractInt",
        "",
        "data",
        "",
        "",
        "signed",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final extractInt(Ljava/util/List;Z)I
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Byte;",
            ">;Z)I"
        }
    .end annotation

    .line 53
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x4

    .line 56
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 57
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 58
    check-cast p1, Ljava/util/Collection;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->toByteArray(Ljava/util/Collection;)[B

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    .line 60
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 61
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result p1

    int-to-double v0, p1

    if-eqz p2, :cond_1

    const/16 p1, 0x17

    int-to-double p1, p1

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    .line 62
    invoke-static {v2, v3, p1, p2}, Ljava/lang/Math;->pow(DD)D

    move-result-wide p1

    const/4 v4, 0x1

    int-to-double v4, v4

    sub-double/2addr p1, v4

    cmpl-double v4, v0, p1

    if-lez v4, :cond_1

    const-wide/high16 p1, 0x4038000000000000L    # 24.0

    invoke-static {v2, v3, p1, p2}, Ljava/lang/Math;->pow(DD)D

    move-result-wide p1

    sub-double/2addr v0, p1

    :cond_1
    double-to-int p1, v0

    return p1
.end method

.method static synthetic extractInt$default(Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeDataParser;Ljava/util/List;ZILjava/lang/Object;)I
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 52
    :cond_0
    invoke-direct {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeDataParser;->extractInt(Ljava/util/List;Z)I

    move-result p0

    return p0
.end method


# virtual methods
.method public final extractData([B)Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;
    .locals 21

    move-object/from16 v0, p0

    const-string v1, "byteArray"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-static/range {p1 .. p1}, Lkotlin/collections/ArraysKt;->toMutableList([B)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    const/4 v2, 0x4

    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->chunked(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .line 97
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    check-cast v3, Ljava/util/Collection;

    .line 98
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v4, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v7, v4

    check-cast v7, Ljava/util/List;

    .line 8
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    if-lt v7, v2, :cond_1

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    :goto_1
    if-eqz v5, :cond_0

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 99
    :cond_2
    check-cast v3, Ljava/util/List;

    .line 9
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x3ff

    const/16 v20, 0x0

    move-object v7, v1

    invoke-direct/range {v7 .. v20}, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;-><init>(IIIFIIJFFLpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 11
    check-cast v3, Ljava/lang/Iterable;

    .line 100
    new-instance v2, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v3, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v2, Ljava/util/Collection;

    .line 101
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 102
    check-cast v4, Ljava/util/List;

    .line 12
    move-object v7, v4

    check-cast v7, Ljava/lang/Iterable;

    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->reversed(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v7

    .line 13
    new-instance v8, Lkotlin/Pair;

    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    invoke-interface {v7, v5, v4}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v4

    invoke-direct {v8, v9, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v2, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 103
    :cond_3
    check-cast v2, Ljava/util/List;

    .line 100
    check-cast v2, Ljava/lang/Iterable;

    .line 104
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_4
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lkotlin/Pair;

    .line 15
    invoke-virtual {v3}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->byteValue()B

    move-result v4

    .line 16
    invoke-virtual {v3}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    .line 18
    sget-object v7, Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalSteps;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalSteps;

    invoke-virtual {v7}, Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalSteps;->getValue()B

    move-result v7

    const/4 v8, 0x0

    const/4 v9, 0x2

    if-ne v4, v7, :cond_5

    .line 19
    invoke-static {v0, v3, v6, v9, v8}, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeDataParser;->extractInt$default(Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeDataParser;Ljava/util/List;ZILjava/lang/Object;)I

    move-result v3

    invoke-virtual {v1, v3}, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->setTotalSteps(I)V

    goto :goto_3

    .line 22
    :cond_5
    sget-object v7, Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalCurrentCaloriesActive;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalCurrentCaloriesActive;

    invoke-virtual {v7}, Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalCurrentCaloriesActive;->getValue()B

    move-result v7

    const/16 v10, 0x3e8

    if-ne v4, v7, :cond_6

    .line 23
    invoke-static {v0, v3, v6, v9, v8}, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeDataParser;->extractInt$default(Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeDataParser;Ljava/util/List;ZILjava/lang/Object;)I

    move-result v3

    int-to-float v3, v3

    int-to-float v4, v10

    div-float/2addr v3, v4

    float-to-int v3, v3

    invoke-virtual {v1, v3}, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->setTotalActiveCalories(I)V

    goto :goto_3

    .line 26
    :cond_6
    sget-object v7, Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalSleep;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalSleep;

    invoke-virtual {v7}, Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalSleep;->getValue()B

    move-result v7

    if-ne v4, v7, :cond_7

    .line 27
    invoke-static {v0, v3, v6, v9, v8}, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeDataParser;->extractInt$default(Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeDataParser;Ljava/util/List;ZILjava/lang/Object;)I

    move-result v3

    invoke-virtual {v1, v3}, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->setTotalSleep(I)V

    goto :goto_3

    .line 30
    :cond_7
    sget-object v7, Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalDistance;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalDistance;

    invoke-virtual {v7}, Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalDistance;->getValue()B

    move-result v7

    if-ne v4, v7, :cond_8

    .line 31
    invoke-static {v0, v3, v6, v9, v8}, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeDataParser;->extractInt$default(Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeDataParser;Ljava/util/List;ZILjava/lang/Object;)I

    move-result v3

    int-to-float v3, v3

    int-to-float v4, v10

    div-float/2addr v3, v4

    invoke-virtual {v1, v3}, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->setTotalDistance(F)V

    goto :goto_3

    .line 33
    :cond_8
    sget-object v7, Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalThermalPower;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalThermalPower;

    invoke-virtual {v7}, Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalThermalPower;->getValue()B

    move-result v7

    if-ne v4, v7, :cond_9

    .line 34
    invoke-static {v0, v3, v6, v9, v8}, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeDataParser;->extractInt$default(Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeDataParser;Ljava/util/List;ZILjava/lang/Object;)I

    move-result v3

    invoke-virtual {v1, v3}, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->setTotalThermalPower(I)V

    goto :goto_3

    .line 36
    :cond_9
    sget-object v7, Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalSolarPower;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalSolarPower;

    invoke-virtual {v7}, Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalSolarPower;->getValue()B

    move-result v7

    if-ne v4, v7, :cond_a

    .line 37
    invoke-static {v0, v3, v6, v9, v8}, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeDataParser;->extractInt$default(Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeDataParser;Ljava/util/List;ZILjava/lang/Object;)I

    move-result v3

    invoke-virtual {v1, v3}, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->setTotalSolarPower(I)V

    goto/16 :goto_3

    .line 39
    :cond_a
    sget-object v7, Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalSkinTemp;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalSkinTemp;

    invoke-virtual {v7}, Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalSkinTemp;->getValue()B

    move-result v7

    if-ne v4, v7, :cond_b

    .line 40
    invoke-direct {v0, v3, v5}, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeDataParser;->extractInt(Ljava/util/List;Z)I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v1, v3}, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->setSkinTemp(F)V

    goto/16 :goto_3

    .line 42
    :cond_b
    sget-object v7, Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$BatteryPercentage;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$BatteryPercentage;

    invoke-virtual {v7}, Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$BatteryPercentage;->getValue()B

    move-result v7

    if-ne v4, v7, :cond_4

    .line 43
    invoke-static {v0, v3, v6, v9, v8}, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeDataParser;->extractInt$default(Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeDataParser;Ljava/util/List;ZILjava/lang/Object;)I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v1, v3}, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->setBatteryPercent(F)V

    goto/16 :goto_3

    :cond_c
    return-object v1
.end method
