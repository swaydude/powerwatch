.class public final Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;
.super Ljava/lang/Object;
.source "WatchSynchronizer.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0016\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B;\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J?\u0010\u001a\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00032\u0008\u0008\u0002\u0010\t\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u00032\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\"\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0008\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\u000fR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\t\u0010\u000f\"\u0004\u0008\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006!"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;",
        "",
        "putInOperationQueue",
        "",
        "scheduleTime",
        "Ljava/util/concurrent/TimeUnit;",
        "deviceInfo",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;",
        "isFromOTA",
        "isGPSUpdateNeeded",
        "(ZLjava/util/concurrent/TimeUnit;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;ZZ)V",
        "getDeviceInfo",
        "()Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;",
        "setDeviceInfo",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V",
        "()Z",
        "setGPSUpdateNeeded",
        "(Z)V",
        "getPutInOperationQueue",
        "getScheduleTime",
        "()Ljava/util/concurrent/TimeUnit;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
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
.field private deviceInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

.field private final isFromOTA:Z

.field private isGPSUpdateNeeded:Z

.field private final putInOperationQueue:Z

.field private final scheduleTime:Ljava/util/concurrent/TimeUnit;


# direct methods
.method public constructor <init>()V
    .locals 8

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x1f

    const/4 v7, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;-><init>(ZLjava/util/concurrent/TimeUnit;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZLjava/util/concurrent/TimeUnit;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;ZZ)V
    .locals 0

    .line 92
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;->putInOperationQueue:Z

    .line 93
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;->scheduleTime:Ljava/util/concurrent/TimeUnit;

    .line 94
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;->deviceInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    .line 95
    iput-boolean p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;->isFromOTA:Z

    .line 96
    iput-boolean p5, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;->isGPSUpdateNeeded:Z

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/util/concurrent/TimeUnit;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 3

    and-int/lit8 p7, p6, 0x1

    const/4 v0, 0x1

    if-eqz p7, :cond_0

    const/4 p7, 0x1

    goto :goto_0

    :cond_0
    move p7, p1

    :goto_0
    and-int/lit8 p1, p6, 0x2

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    move-object v2, v1

    goto :goto_1

    :cond_1
    move-object v2, p2

    :goto_1
    and-int/lit8 p1, p6, 0x4

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    move-object v1, p3

    :goto_2
    and-int/lit8 p1, p6, 0x8

    if-eqz p1, :cond_3

    goto :goto_3

    :cond_3
    move v0, p4

    :goto_3
    and-int/lit8 p1, p6, 0x10

    if-eqz p1, :cond_4

    const/4 p5, 0x0

    const/4 p6, 0x0

    goto :goto_4

    :cond_4
    move p6, p5

    :goto_4
    move-object p1, p0

    move p2, p7

    move-object p3, v2

    move-object p4, v1

    move p5, v0

    .line 92
    invoke-direct/range {p1 .. p6}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;-><init>(ZLjava/util/concurrent/TimeUnit;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;ZZ)V

    return-void
.end method

.method public static synthetic copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;ZLjava/util/concurrent/TimeUnit;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;ZZILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-boolean p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;->putInOperationQueue:Z

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;->scheduleTime:Ljava/util/concurrent/TimeUnit;

    :cond_1
    move-object p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    iget-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;->deviceInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    iget-boolean p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;->isFromOTA:Z

    :cond_3
    move v1, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    iget-boolean p5, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;->isGPSUpdateNeeded:Z

    :cond_4
    move v2, p5

    move-object p2, p0

    move p3, p1

    move-object p4, p7

    move-object p5, v0

    move p6, v1

    move p7, v2

    invoke-virtual/range {p2 .. p7}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;->copy(ZLjava/util/concurrent/TimeUnit;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;ZZ)Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;->putInOperationQueue:Z

    return v0
.end method

.method public final component2()Ljava/util/concurrent/TimeUnit;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;->scheduleTime:Ljava/util/concurrent/TimeUnit;

    return-object v0
.end method

.method public final component3()Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;->deviceInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;->isFromOTA:Z

    return v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;->isGPSUpdateNeeded:Z

    return v0
.end method

.method public final copy(ZLjava/util/concurrent/TimeUnit;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;ZZ)Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;
    .locals 7

    new-instance v6, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;

    move-object v0, v6

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v5}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;-><init>(ZLjava/util/concurrent/TimeUnit;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;ZZ)V

    return-object v6
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;

    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;->putInOperationQueue:Z

    iget-boolean v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;->putInOperationQueue:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;->scheduleTime:Ljava/util/concurrent/TimeUnit;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;->scheduleTime:Ljava/util/concurrent/TimeUnit;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;->deviceInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;->deviceInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;->isFromOTA:Z

    iget-boolean v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;->isFromOTA:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;->isGPSUpdateNeeded:Z

    iget-boolean p1, p1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;->isGPSUpdateNeeded:Z

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getDeviceInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;
    .locals 1

    .line 94
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;->deviceInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    return-object v0
.end method

.method public final getPutInOperationQueue()Z
    .locals 1

    .line 92
    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;->putInOperationQueue:Z

    return v0
.end method

.method public final getScheduleTime()Ljava/util/concurrent/TimeUnit;
    .locals 1

    .line 93
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;->scheduleTime:Ljava/util/concurrent/TimeUnit;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;->putInOperationQueue:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;->scheduleTime:Ljava/util/concurrent/TimeUnit;

    const/4 v3, 0x0

    if-nez v2, :cond_1

    const/4 v2, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Ljava/util/concurrent/TimeUnit;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;->deviceInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    if-nez v2, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;->isFromOTA:Z

    if-eqz v2, :cond_3

    const/4 v2, 0x1

    :cond_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;->isGPSUpdateNeeded:Z

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    move v1, v2

    :goto_2
    add-int/2addr v0, v1

    return v0
.end method

.method public final isFromOTA()Z
    .locals 1

    .line 95
    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;->isFromOTA:Z

    return v0
.end method

.method public final isGPSUpdateNeeded()Z
    .locals 1

    .line 96
    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;->isGPSUpdateNeeded:Z

    return v0
.end method

.method public final setDeviceInfo(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V
    .locals 0

    .line 94
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;->deviceInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    return-void
.end method

.method public final setGPSUpdateNeeded(Z)V
    .locals 0

    .line 96
    iput-boolean p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;->isGPSUpdateNeeded:Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SyncConfig(putInOperationQueue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;->putInOperationQueue:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", scheduleTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;->scheduleTime:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", deviceInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;->deviceInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isFromOTA="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;->isFromOTA:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isGPSUpdateNeeded="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;->isGPSUpdateNeeded:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
