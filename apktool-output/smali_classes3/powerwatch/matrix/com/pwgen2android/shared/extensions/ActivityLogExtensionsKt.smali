.class public final Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ActivityLogExtensionsKt;
.super Ljava/lang/Object;
.source "ActivityLogExtensions.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nActivityLogExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityLogExtensions.kt\npowerwatch/matrix/com/pwgen2android/shared/extensions/ActivityLogExtensionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,80:1\n1858#2,3:81\n3287#2,7:84\n1547#2:91\n1618#2,2:92\n1620#2:95\n1#3:94\n*S KotlinDebug\n*F\n+ 1 ActivityLogExtensions.kt\npowerwatch/matrix/com/pwgen2android/shared/extensions/ActivityLogExtensionsKt\n*L\n19#1:81,3\n35#1:84,7\n41#1:91\n41#1:92,2\n41#1:95\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0010\u0008\n\u0000\u001a\u0010\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003\u001a\u0010\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003\u001a\u001a\u0010\u0005\u001a\u00020\u0002*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t\u001a.\u0010\n\u001a&\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\r0\u000c\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e0\u000c\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000f0\u000c0\u000b*\u00020\u0010\u001a\n\u0010\u0011\u001a\u00020\u0012*\u00020\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "exportActivityDataLogs",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDataLog;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2TempActivityInfo;",
        "exportPaired",
        "extractDeltaLogs",
        "startLog",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLog;",
        "endLog",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityEndLog;",
        "mapSplits",
        "Lkotlin/Triple;",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RunningSplit;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;",
        "parseValueToFloat",
        "",
        "",
        "app_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final exportActivityDataLogs(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2TempActivityInfo;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2TempActivityInfo;",
            ")",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDataLog;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2TempActivityInfo;->getTempStartLogs()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2TempActivityInfo;->getTempEndLogs()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .line 84
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 85
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .line 86
    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v0, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-static {v1, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-direct {v4, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 87
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 88
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityEndLog;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLog;

    .line 36
    invoke-static {p0, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ActivityLogExtensionsKt;->extractDeltaLogs(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2TempActivityInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLog;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityEndLog;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDataLog;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 90
    :cond_0
    check-cast v4, Ljava/util/List;

    return-object v4
.end method

.method public static final exportPaired(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2TempActivityInfo;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2TempActivityInfo;",
            ")",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDataLog;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2TempActivityInfo;->getTempStartLogs()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 91
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v1, Ljava/util/Collection;

    .line 92
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 93
    move-object v5, v2

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLog;

    .line 42
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2TempActivityInfo;->getTempEndLogs()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityEndLog;

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityEndLog;->getActivityId()I

    move-result v4

    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLog;->getActivityId()I

    move-result v6

    if-ne v4, v6, :cond_1

    const/4 v4, 0x1

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-eqz v4, :cond_0

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    :goto_2
    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityEndLog;

    if-eqz v3, :cond_3

    .line 44
    invoke-static {p0, v5, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ActivityLogExtensionsKt;->extractDeltaLogs(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2TempActivityInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLog;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityEndLog;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDataLog;

    move-result-object v2

    goto :goto_3

    .line 46
    :cond_3
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDataLog;

    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLog;->getType()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;

    move-result-object v4

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0xc

    const/4 v9, 0x0

    move-object v3, v2

    invoke-direct/range {v3 .. v9}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDataLog;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLog;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityEndLog;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 43
    :goto_3
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 95
    :cond_4
    check-cast v1, Ljava/util/List;

    return-object v1
.end method

.method public static final extractDeltaLogs(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2TempActivityInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLog;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityEndLog;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDataLog;
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "startLog"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "endLog"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDataLog;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xf

    const/4 v7, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDataLog;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLog;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityEndLog;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 55
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLog;->getStartLogIndex()I

    move-result v1

    .line 56
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityEndLog;->getEndLogIndex()I

    move-result v2

    .line 57
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2TempActivityInfo;->getTempDeltaLogs()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    .line 59
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLog;->getType()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;

    move-result-object v4

    invoke-virtual {v0, v4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDataLog;->setType(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;)V

    .line 60
    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDataLog;->setStartLog(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLog;)V

    .line 61
    invoke-virtual {v0, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDataLog;->setEndLog(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityEndLog;)V

    .line 63
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Activity transform: start: "

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ", end: "

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v4, "activity_tracker"

    invoke-static {v4, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 65
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLog;->getStartLatitude()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    move-result p1

    if-nez p1, :cond_1

    if-ltz v1, :cond_2

    if-lt v2, v3, :cond_0

    move v2, v3

    .line 68
    :cond_0
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2TempActivityInfo;->getTempDeltaLogs()Ljava/util/List;

    move-result-object p0

    add-int/lit8 v2, v2, 0x1

    invoke-interface {p0, v1, v2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p0

    .line 70
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string p2, "Running transform: "

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "gen2_pair"

    invoke-static {p2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 72
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDataLog;->getDeltaLogs()Ljava/util/List;

    move-result-object p1

    check-cast p0, Ljava/util/Collection;

    invoke-interface {p1, p0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_1
    const-string p0, "No valid gps locations found, will skip delta logs for this activity"

    .line 76
    invoke-static {v4, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    :goto_0
    return-object v0
.end method

.method public static final mapSplits(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;)Lkotlin/Triple;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;",
            ")",
            "Lkotlin/Triple<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RunningSplit;",
            ">;",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;",
            ">;",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;",
            ">;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/List;

    .line 16
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/List;

    .line 17
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/List;

    .line 19
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->getRunningSplits()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    .line 82
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v3, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v5, v3, 0x1

    if-gez v3, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_0
    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningSplitEntry;

    .line 20
    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningSplitEntry;->getRunningSplit()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RunningSplit;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 21
    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningSplitEntry;->getGpsPosition()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 22
    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningSplitEntry;->getHeartRate()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v3, v5

    goto :goto_0

    .line 25
    :cond_1
    new-instance p0, Lkotlin/Triple;

    invoke-direct {p0, v0, v1, v2}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0
.end method

.method public static final parseValueToFloat(I)F
    .locals 0

    .line 30
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p0

    return p0
.end method
