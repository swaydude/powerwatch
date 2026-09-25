.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;
.super Ljava/lang/Object;
.source "Commands.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008#\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001BO\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\u0002\u0010\u000fJ\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0005H\u00c6\u0003J\t\u0010*\u001a\u00020\u0005H\u00c6\u0003J\t\u0010+\u001a\u00020\u0005H\u00c6\u0003J\t\u0010,\u001a\u00020\u0005H\u00c6\u0003J\t\u0010-\u001a\u00020\nH\u00c6\u0003J\t\u0010.\u001a\u00020\nH\u00c6\u0003J\u000f\u0010/\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\rH\u00c6\u0003J_\u00100\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00052\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\rH\u00c6\u0001J\u0013\u00101\u001a\u0002022\u0008\u00103\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00104\u001a\u00020\nH\u00d6\u0001J\t\u00105\u001a\u000206H\u00d6\u0001R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\"\u0004\u0008\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015\"\u0004\u0008\u0016\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0018\u0010\u0011\"\u0004\u0008\u0019\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001a\u0010\u0015\"\u0004\u0008\u001b\u0010\u0017R \u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001c\u0010\u001d\"\u0004\u0008\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008 \u0010\u0015\"\u0004\u0008!\u0010\u0017R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\"\u0010#\"\u0004\u0008$\u0010%R\u001a\u0010\u0008\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008&\u0010\u0015\"\u0004\u0008\'\u0010\u0017\u00a8\u00067"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;",
        "",
        "sessionType",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;",
        "runningStart",
        "",
        "runningEnd",
        "distance",
        "steps",
        "activeCalories",
        "",
        "elapsed",
        "runningSplits",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningSplitEntry;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;JJJJIILjava/util/List;)V",
        "getActiveCalories",
        "()I",
        "setActiveCalories",
        "(I)V",
        "getDistance",
        "()J",
        "setDistance",
        "(J)V",
        "getElapsed",
        "setElapsed",
        "getRunningEnd",
        "setRunningEnd",
        "getRunningSplits",
        "()Ljava/util/List;",
        "setRunningSplits",
        "(Ljava/util/List;)V",
        "getRunningStart",
        "setRunningStart",
        "getSessionType",
        "()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;",
        "setSessionType",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;)V",
        "getSteps",
        "setSteps",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
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
.field private activeCalories:I

.field private distance:J

.field private elapsed:I

.field private runningEnd:J

.field private runningSplits:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningSplitEntry;",
            ">;"
        }
    .end annotation
.end field

.field private runningStart:J

.field private sessionType:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;

.field private steps:J


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;JJJJIILjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;",
            "JJJJII",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningSplitEntry;",
            ">;)V"
        }
    .end annotation

    const-string v0, "sessionType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "runningSplits"

    invoke-static {p12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->sessionType:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;

    .line 91
    iput-wide p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->runningStart:J

    .line 92
    iput-wide p4, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->runningEnd:J

    .line 93
    iput-wide p6, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->distance:J

    .line 94
    iput-wide p8, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->steps:J

    .line 95
    iput p10, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->activeCalories:I

    .line 96
    iput p11, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->elapsed:I

    .line 97
    iput-object p12, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->runningSplits:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;JJJJIILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 15

    move/from16 v0, p13

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    .line 90
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;->ACTIVITY_RUNNING:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;

    move-object v3, v1

    goto :goto_0

    :cond_0
    move-object/from16 v3, p1

    :goto_0
    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_1

    .line 97
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/List;

    move-object v14, v0

    goto :goto_1

    :cond_1
    move-object/from16 v14, p12

    :goto_1
    move-object v2, p0

    move-wide/from16 v4, p2

    move-wide/from16 v6, p4

    move-wide/from16 v8, p6

    move-wide/from16 v10, p8

    move/from16 v12, p10

    move/from16 v13, p11

    .line 90
    invoke-direct/range {v2 .. v14}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;JJJJIILjava/util/List;)V

    return-void
.end method

.method public static synthetic copy$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;JJJJIILjava/util/List;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;
    .locals 13

    move-object v0, p0

    move/from16 v1, p13

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->sessionType:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-wide v3, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->runningStart:J

    goto :goto_1

    :cond_1
    move-wide v3, p2

    :goto_1
    and-int/lit8 v5, v1, 0x4

    if-eqz v5, :cond_2

    iget-wide v5, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->runningEnd:J

    goto :goto_2

    :cond_2
    move-wide/from16 v5, p4

    :goto_2
    and-int/lit8 v7, v1, 0x8

    if-eqz v7, :cond_3

    iget-wide v7, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->distance:J

    goto :goto_3

    :cond_3
    move-wide/from16 v7, p6

    :goto_3
    and-int/lit8 v9, v1, 0x10

    if-eqz v9, :cond_4

    iget-wide v9, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->steps:J

    goto :goto_4

    :cond_4
    move-wide/from16 v9, p8

    :goto_4
    and-int/lit8 v11, v1, 0x20

    if-eqz v11, :cond_5

    iget v11, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->activeCalories:I

    goto :goto_5

    :cond_5
    move/from16 v11, p10

    :goto_5
    and-int/lit8 v12, v1, 0x40

    if-eqz v12, :cond_6

    iget v12, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->elapsed:I

    goto :goto_6

    :cond_6
    move/from16 v12, p11

    :goto_6
    and-int/lit16 v1, v1, 0x80

    if-eqz v1, :cond_7

    iget-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->runningSplits:Ljava/util/List;

    goto :goto_7

    :cond_7
    move-object/from16 v1, p12

    :goto_7
    move-object p1, v2

    move-wide p2, v3

    move-wide/from16 p4, v5

    move-wide/from16 p6, v7

    move-wide/from16 p8, v9

    move/from16 p10, v11

    move/from16 p11, v12

    move-object/from16 p12, v1

    invoke-virtual/range {p0 .. p12}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->copy(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;JJJJIILjava/util/List;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->sessionType:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;

    return-object v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->runningStart:J

    return-wide v0
.end method

.method public final component3()J
    .locals 2

    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->runningEnd:J

    return-wide v0
.end method

.method public final component4()J
    .locals 2

    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->distance:J

    return-wide v0
.end method

.method public final component5()J
    .locals 2

    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->steps:J

    return-wide v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->activeCalories:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->elapsed:I

    return v0
.end method

.method public final component8()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningSplitEntry;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->runningSplits:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;JJJJIILjava/util/List;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;",
            "JJJJII",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningSplitEntry;",
            ">;)",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;"
        }
    .end annotation

    const-string v0, "sessionType"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "runningSplits"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;

    move-object v1, v0

    move-wide/from16 v3, p2

    move-wide/from16 v5, p4

    move-wide/from16 v7, p6

    move-wide/from16 v9, p8

    move/from16 v11, p10

    move/from16 v12, p11

    invoke-direct/range {v1 .. v13}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;JJJJIILjava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->sessionType:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->sessionType:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->runningStart:J

    iget-wide v5, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->runningStart:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->runningEnd:J

    iget-wide v5, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->runningEnd:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->distance:J

    iget-wide v5, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->distance:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->steps:J

    iget-wide v5, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->steps:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->activeCalories:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->activeCalories:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->elapsed:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->elapsed:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->runningSplits:Ljava/util/List;

    iget-object p1, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->runningSplits:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getActiveCalories()I
    .locals 1

    .line 95
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->activeCalories:I

    return v0
.end method

.method public final getDistance()J
    .locals 2

    .line 93
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->distance:J

    return-wide v0
.end method

.method public final getElapsed()I
    .locals 1

    .line 96
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->elapsed:I

    return v0
.end method

.method public final getRunningEnd()J
    .locals 2

    .line 92
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->runningEnd:J

    return-wide v0
.end method

.method public final getRunningSplits()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningSplitEntry;",
            ">;"
        }
    .end annotation

    .line 97
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->runningSplits:Ljava/util/List;

    return-object v0
.end method

.method public final getRunningStart()J
    .locals 2

    .line 91
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->runningStart:J

    return-wide v0
.end method

.method public final getSessionType()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;
    .locals 1

    .line 90
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->sessionType:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;

    return-object v0
.end method

.method public final getSteps()J
    .locals 2

    .line 94
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->steps:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->sessionType:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->runningStart:J

    invoke-static {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter$SleepSession-$$ExternalSynthetic0;->m0(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->runningEnd:J

    invoke-static {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter$SleepSession-$$ExternalSynthetic0;->m0(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->distance:J

    invoke-static {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter$SleepSession-$$ExternalSynthetic0;->m0(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->steps:J

    invoke-static {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter$SleepSession-$$ExternalSynthetic0;->m0(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->activeCalories:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->elapsed:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->runningSplits:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setActiveCalories(I)V
    .locals 0

    .line 95
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->activeCalories:I

    return-void
.end method

.method public final setDistance(J)V
    .locals 0

    .line 93
    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->distance:J

    return-void
.end method

.method public final setElapsed(I)V
    .locals 0

    .line 96
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->elapsed:I

    return-void
.end method

.method public final setRunningEnd(J)V
    .locals 0

    .line 92
    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->runningEnd:J

    return-void
.end method

.method public final setRunningSplits(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningSplitEntry;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->runningSplits:Ljava/util/List;

    return-void
.end method

.method public final setRunningStart(J)V
    .locals 0

    .line 91
    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->runningStart:J

    return-void
.end method

.method public final setSessionType(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->sessionType:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;

    return-void
.end method

.method public final setSteps(J)V
    .locals 0

    .line 94
    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->steps:J

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "WatchRunningLogEntry(sessionType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->sessionType:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", runningStart="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->runningStart:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", runningEnd="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->runningEnd:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", distance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->distance:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", steps="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->steps:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", activeCalories="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->activeCalories:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", elapsed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->elapsed:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", runningSplits="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->runningSplits:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
