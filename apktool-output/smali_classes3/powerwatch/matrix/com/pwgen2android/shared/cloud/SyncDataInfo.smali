.class public final Lpowerwatch/matrix/com/pwgen2android/shared/cloud/SyncDataInfo;
.super Ljava/lang/Object;
.source "CloudSynchronizer.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0011\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B-\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0011\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\t\u00a8\u0006\u0018"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/SyncDataInfo;",
        "",
        "shouldSyncWalkingLogs",
        "",
        "shouldSyncSleepLogs",
        "shouldSyncRestingLogs",
        "shouldSyncActivitySession",
        "(ZZZZ)V",
        "getShouldSyncActivitySession",
        "()Z",
        "getShouldSyncRestingLogs",
        "getShouldSyncSleepLogs",
        "getShouldSyncWalkingLogs",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
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
.field private final shouldSyncActivitySession:Z

.field private final shouldSyncRestingLogs:Z

.field private final shouldSyncSleepLogs:Z

.field private final shouldSyncWalkingLogs:Z


# direct methods
.method public constructor <init>()V
    .locals 7

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0xf

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/SyncDataInfo;-><init>(ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZZZZ)V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/SyncDataInfo;->shouldSyncWalkingLogs:Z

    .line 28
    iput-boolean p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/SyncDataInfo;->shouldSyncSleepLogs:Z

    .line 29
    iput-boolean p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/SyncDataInfo;->shouldSyncRestingLogs:Z

    .line 30
    iput-boolean p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/SyncDataInfo;->shouldSyncActivitySession:Z

    return-void
.end method

.method public synthetic constructor <init>(ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    const/4 p2, 0x0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    const/4 p3, 0x0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    const/4 p4, 0x0

    .line 27
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/SyncDataInfo;-><init>(ZZZZ)V

    return-void
.end method

.method public static synthetic copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/SyncDataInfo;ZZZZILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/SyncDataInfo;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-boolean p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/SyncDataInfo;->shouldSyncWalkingLogs:Z

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-boolean p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/SyncDataInfo;->shouldSyncSleepLogs:Z

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-boolean p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/SyncDataInfo;->shouldSyncRestingLogs:Z

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-boolean p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/SyncDataInfo;->shouldSyncActivitySession:Z

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/SyncDataInfo;->copy(ZZZZ)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/SyncDataInfo;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/SyncDataInfo;->shouldSyncWalkingLogs:Z

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/SyncDataInfo;->shouldSyncSleepLogs:Z

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/SyncDataInfo;->shouldSyncRestingLogs:Z

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/SyncDataInfo;->shouldSyncActivitySession:Z

    return v0
.end method

.method public final copy(ZZZZ)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/SyncDataInfo;
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/SyncDataInfo;

    invoke-direct {v0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/SyncDataInfo;-><init>(ZZZZ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/SyncDataInfo;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/SyncDataInfo;

    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/SyncDataInfo;->shouldSyncWalkingLogs:Z

    iget-boolean v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/SyncDataInfo;->shouldSyncWalkingLogs:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/SyncDataInfo;->shouldSyncSleepLogs:Z

    iget-boolean v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/SyncDataInfo;->shouldSyncSleepLogs:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/SyncDataInfo;->shouldSyncRestingLogs:Z

    iget-boolean v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/SyncDataInfo;->shouldSyncRestingLogs:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/SyncDataInfo;->shouldSyncActivitySession:Z

    iget-boolean p1, p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/SyncDataInfo;->shouldSyncActivitySession:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getShouldSyncActivitySession()Z
    .locals 1

    .line 30
    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/SyncDataInfo;->shouldSyncActivitySession:Z

    return v0
.end method

.method public final getShouldSyncRestingLogs()Z
    .locals 1

    .line 29
    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/SyncDataInfo;->shouldSyncRestingLogs:Z

    return v0
.end method

.method public final getShouldSyncSleepLogs()Z
    .locals 1

    .line 28
    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/SyncDataInfo;->shouldSyncSleepLogs:Z

    return v0
.end method

.method public final getShouldSyncWalkingLogs()Z
    .locals 1

    .line 27
    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/SyncDataInfo;->shouldSyncWalkingLogs:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/SyncDataInfo;->shouldSyncWalkingLogs:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/SyncDataInfo;->shouldSyncSleepLogs:Z

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    :cond_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/SyncDataInfo;->shouldSyncRestingLogs:Z

    if-eqz v2, :cond_2

    const/4 v2, 0x1

    :cond_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/SyncDataInfo;->shouldSyncActivitySession:Z

    if-eqz v2, :cond_3

    goto :goto_0

    :cond_3
    move v1, v2

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SyncDataInfo(shouldSyncWalkingLogs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/SyncDataInfo;->shouldSyncWalkingLogs:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", shouldSyncSleepLogs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/SyncDataInfo;->shouldSyncSleepLogs:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", shouldSyncRestingLogs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/SyncDataInfo;->shouldSyncRestingLogs:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", shouldSyncActivitySession="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/SyncDataInfo;->shouldSyncActivitySession:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
