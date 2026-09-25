.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/CommandsKt;
.super Ljava/lang/Object;
.source "Commands.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCommands.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Commands.kt\npowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/CommandsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,709:1\n1849#2,2:710\n2505#2,7:712\n*S KotlinDebug\n*F\n+ 1 Commands.kt\npowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/CommandsKt\n*L\n129#1:710,2\n133#1:712,7\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "isFirmwareVersionValid",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;",
        "logLogs",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;",
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
.method public static final isFirmwareVersionValid(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;)Z
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;->getFirmwareVersion()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    const-string v1, "v"

    invoke-static {p0, v1, v0}, Lkotlin/text/StringsKt;->startsWith(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p0

    :goto_0
    return p0
.end method

.method public static final logLogs(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Ljava/lang/String;
    .locals 22

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 127
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->getActivityLogs()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "No logs"

    return-object v0

    .line 128
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/List;

    .line 129
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->getActivityLogs()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .line 710
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const-wide/16 v15, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0xfff

    const/16 v21, 0x0

    .line 130
    invoke-static/range {v3 .. v21}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->copy$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;ZJIIIIIIJJJLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 133
    :cond_1
    check-cast v0, Ljava/lang/Iterable;

    .line 712
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 713
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 714
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 715
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 716
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;

    .line 134
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->getActiveCalories()I

    move-result v3

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->getActiveCalories()I

    move-result v4

    add-int/2addr v3, v4

    invoke-virtual {v1, v3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->setActiveCalories(I)V

    .line 135
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->getDistance()J

    move-result-wide v3

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->getDistance()J

    move-result-wide v5

    add-long/2addr v3, v5

    invoke-virtual {v1, v3, v4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->setDistance(J)V

    .line 136
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->getWalkingSteps()J

    move-result-wide v3

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->getWalkingSteps()J

    move-result-wide v5

    add-long/2addr v3, v5

    invoke-virtual {v1, v3, v4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->setWalkingSteps(J)V

    .line 137
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->getRunningSteps()J

    move-result-wide v3

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->getRunningSteps()J

    move-result-wide v5

    add-long/2addr v3, v5

    invoke-virtual {v1, v3, v4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->setRunningSteps(J)V

    goto :goto_1

    .line 133
    :cond_2
    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;

    .line 142
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->isSleep()Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "Active: "

    goto :goto_2

    :cond_3
    const-string v0, "Sleep: "

    :goto_2
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 713
    :cond_4
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Empty collection can\'t be reduced."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0
.end method
