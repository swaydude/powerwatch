.class public final Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WatchEntryToRestingFormatter;
.super Ljava/lang/Object;
.source "WatchEntryToLogFormatter.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nWatchEntryToLogFormatter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WatchEntryToLogFormatter.kt\npowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WatchEntryToRestingFormatter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,163:1\n1557#2:164\n1588#2,4:165\n*S KotlinDebug\n*F\n+ 1 WatchEntryToLogFormatter.kt\npowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WatchEntryToRestingFormatter\n*L\n60#1:164\n60#1:165,4\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J2\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WatchEntryToRestingFormatter;",
        "",
        "()V",
        "format",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingLog;",
        "watchLogEntries",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;",
        "totalDisplayedData",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TotalActivityData;",
        "logInterval",
        "",
        "isGen2",
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

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final format(Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TotalActivityData;JZ)Ljava/util/List;
    .locals 37
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;",
            ">;",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TotalActivityData;",
            "JZ)",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingLog;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "watchLogEntries"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "totalDisplayedData"

    move-object/from16 v2, p2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TotalActivityData;->getLastLogTime()J

    move-result-wide v1

    .line 54
    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->reversed(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    if-eqz p5, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/16 v3, 0x3e8

    .line 59
    :goto_0
    check-cast v0, Ljava/lang/Iterable;

    .line 164
    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v0, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v4, Ljava/util/Collection;

    const/4 v5, 0x0

    .line 166
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    add-int/lit8 v7, v5, 0x1

    if-gez v5, :cond_1

    .line 167
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_1
    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;

    .line 61
    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->getTimestamp()J

    move-result-wide v8

    const v10, 0xea60

    int-to-long v11, v10

    add-long/2addr v11, v8

    if-nez p5, :cond_2

    int-to-long v8, v5

    mul-long v8, v8, p3

    sub-long v11, v1, v8

    sub-long v8, v11, p3

    :cond_2
    move-wide v14, v8

    move-wide/from16 v16, v11

    .line 67
    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->getWalkingSteps()J

    move-result-wide v8

    const-wide/16 v11, 0x0

    cmp-long v5, v8, v11

    if-nez v5, :cond_3

    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->isSleep()Z

    move-result v5

    if-nez v5, :cond_3

    sub-long v8, v16, v14

    long-to-double v8, v8

    int-to-double v10, v10

    div-double/2addr v8, v10

    .line 71
    invoke-static {v8, v9}, Lkotlin/math/MathKt;->roundToInt(D)I

    move-result v34

    .line 72
    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->getPulseCount()I

    move-result v5

    int-to-float v5, v5

    move/from16 v18, v5

    .line 73
    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->getPulseCount()I

    move-result v31

    .line 74
    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->getPulseCount()I

    move-result v32

    .line 75
    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->getHrv()I

    move-result v5

    int-to-float v5, v5

    move/from16 v28, v5

    .line 76
    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->getActiveCalories()I

    move-result v5

    mul-int v27, v5, v3

    .line 77
    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->getBmrCalories()I

    move-result v5

    mul-int v30, v5, v3

    .line 78
    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->getWatchPowerLog()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;

    move-result-object v5

    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;->getThermalGen()I

    move-result v5

    int-to-float v5, v5

    move/from16 v19, v5

    .line 79
    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->getWatchPowerLog()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;

    move-result-object v5

    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;->getSolarGen()I

    move-result v5

    int-to-float v5, v5

    move/from16 v20, v5

    .line 80
    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->getWatchPowerLog()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;

    move-result-object v5

    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;->getCaseTemp()I

    move-result v5

    int-to-float v5, v5

    move/from16 v24, v5

    .line 81
    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->getWatchPowerLog()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;

    move-result-object v5

    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;->getSkinTemp()I

    move-result v5

    int-to-float v5, v5

    move/from16 v21, v5

    .line 68
    new-instance v5, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingLog;

    move-object v13, v5

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v29, 0x0

    const/16 v33, 0x0

    const v35, 0x226c0

    const/16 v36, 0x0

    invoke-direct/range {v13 .. v36}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingLog;-><init>(JJFFFFFFFFFIFZIIILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_2

    :cond_3
    const/4 v5, 0x0

    .line 83
    :goto_2
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v5, v7

    goto/16 :goto_1

    .line 168
    :cond_4
    check-cast v4, Ljava/util/List;

    .line 164
    check-cast v4, Ljava/lang/Iterable;

    .line 85
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->filterNotNull(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
