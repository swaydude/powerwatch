.class public final Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WatchEntryToSleepFormatter;
.super Ljava/lang/Object;
.source "WatchEntryToLogFormatter.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nWatchEntryToLogFormatter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WatchEntryToLogFormatter.kt\npowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WatchEntryToSleepFormatter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,163:1\n1557#2:164\n1588#2,4:165\n*S KotlinDebug\n*F\n+ 1 WatchEntryToLogFormatter.kt\npowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WatchEntryToSleepFormatter\n*L\n96#1:164\n96#1:165,4\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J2\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WatchEntryToSleepFormatter;",
        "",
        "()V",
        "format",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;",
        "watchLogEntries",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;",
        "lastEntryTime",
        "",
        "logInterval",
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

    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final format(Ljava/util/List;JJZ)Ljava/util/List;
    .locals 37
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;",
            ">;JJZ)",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "watchLogEntries"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    if-eqz p6, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/16 v2, 0x3e8

    .line 94
    :goto_0
    check-cast v0, Ljava/lang/Iterable;

    .line 95
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->reversed(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 164
    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v0, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v3, Ljava/util/Collection;

    const/4 v4, 0x0

    .line 166
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v6, v4, 0x1

    if-gez v4, :cond_1

    .line 167
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_1
    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;

    .line 97
    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->getTimestamp()J

    move-result-wide v7

    const v9, 0xea60

    int-to-long v10, v9

    add-long/2addr v10, v7

    if-nez p6, :cond_2

    int-to-long v7, v4

    mul-long v7, v7, p4

    sub-long v10, p2, v7

    sub-long v7, v10, p4

    :cond_2
    move-wide v13, v7

    move-wide v15, v10

    .line 103
    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->isSleep()Z

    move-result v4

    if-eqz v4, :cond_6

    .line 104
    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->getState()I

    move-result v4

    if-eq v4, v1, :cond_5

    const/4 v7, 0x3

    if-eq v4, v7, :cond_4

    const/4 v7, 0x5

    if-eq v4, v7, :cond_3

    .line 108
    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;->SLEEP_AWAKE:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;

    goto :goto_2

    .line 107
    :cond_3
    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;->DEEP:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;

    goto :goto_2

    .line 106
    :cond_4
    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;->LIGHT:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;

    goto :goto_2

    .line 105
    :cond_5
    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;->RESTLESS:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;

    :goto_2
    move-object/from16 v27, v4

    sub-long v7, v15, v13

    long-to-double v7, v7

    int-to-double v9, v9

    div-double/2addr v7, v9

    .line 114
    invoke-static {v7, v8}, Lkotlin/math/MathKt;->roundToInt(D)I

    move-result v34

    .line 115
    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->getActiveCalories()I

    move-result v4

    mul-int v26, v4, v2

    .line 116
    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->getBmrCalories()I

    move-result v4

    mul-int v30, v4, v2

    .line 117
    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->getPulseCount()I

    move-result v4

    int-to-float v4, v4

    move/from16 v17, v4

    .line 118
    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->getPulseCount()I

    move-result v31

    .line 119
    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->getPulseCount()I

    move-result v32

    .line 120
    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->getHrv()I

    move-result v4

    int-to-float v4, v4

    move/from16 v28, v4

    .line 122
    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->getWatchPowerLog()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;

    move-result-object v4

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;->getThermalGen()I

    move-result v4

    int-to-float v4, v4

    move/from16 v18, v4

    .line 123
    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->getWatchPowerLog()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;

    move-result-object v4

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;->getSolarGen()I

    move-result v4

    int-to-float v4, v4

    move/from16 v19, v4

    .line 124
    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->getWatchPowerLog()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;

    move-result-object v4

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;->getCaseTemp()I

    move-result v4

    int-to-float v4, v4

    move/from16 v23, v4

    .line 125
    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->getWatchPowerLog()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;

    move-result-object v4

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;->getSkinTemp()I

    move-result v4

    int-to-float v4, v4

    move/from16 v20, v4

    .line 111
    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;

    move-object v12, v4

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v29, 0x0

    const/16 v33, 0x0

    const v35, 0x446c0

    const/16 v36, 0x0

    invoke-direct/range {v12 .. v36}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;-><init>(JJFFFFFFFFFILpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;FZIIILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_3

    :cond_6
    const/4 v4, 0x0

    .line 127
    :goto_3
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v4, v6

    goto/16 :goto_1

    .line 168
    :cond_7
    check-cast v3, Ljava/util/List;

    .line 164
    check-cast v3, Ljava/lang/Iterable;

    .line 129
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->filterNotNull(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
