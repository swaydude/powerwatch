.class public final Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;
.super Ljava/lang/Object;
.source "WatchSynchronizer.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B1\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tH\u00c6\u0003J5\u0010\u0017\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\tH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0013\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u001e"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;",
        "",
        "progress",
        "",
        "syncConfig",
        "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;",
        "dataInfo",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;",
        "throwable",
        "",
        "(ILpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;Ljava/lang/Throwable;)V",
        "getDataInfo",
        "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;",
        "getProgress",
        "()I",
        "getSyncConfig",
        "()Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;",
        "getThrowable",
        "()Ljava/lang/Throwable;",
        "component1",
        "component2",
        "component3",
        "component4",
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
.field private final dataInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

.field private final progress:I

.field private final syncConfig:Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;

.field private final throwable:Ljava/lang/Throwable;


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

    invoke-direct/range {v0 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;-><init>(ILpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ILpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "syncConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 116
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;->progress:I

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;->syncConfig:Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;->dataInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;->throwable:Ljava/lang/Throwable;

    return-void
.end method

.method public synthetic constructor <init>(ILpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 8

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    .line 116
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x1f

    const/4 v7, 0x0

    move-object v0, p2

    invoke-direct/range {v0 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;-><init>(ZLjava/util/concurrent/TimeUnit;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_1
    and-int/lit8 p6, p5, 0x4

    const/4 v0, 0x0

    if-eqz p6, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    move-object p4, v0

    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;-><init>(ILpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;ILpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;Ljava/lang/Throwable;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;->progress:I

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;->syncConfig:Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;->dataInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;->throwable:Ljava/lang/Throwable;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;->copy(ILpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;Ljava/lang/Throwable;)Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;->progress:I

    return v0
.end method

.method public final component2()Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;->syncConfig:Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;

    return-object v0
.end method

.method public final component3()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;->dataInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    return-object v0
.end method

.method public final component4()Ljava/lang/Throwable;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;->throwable:Ljava/lang/Throwable;

    return-object v0
.end method

.method public final copy(ILpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;Ljava/lang/Throwable;)Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;
    .locals 1

    const-string v0, "syncConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;

    invoke-direct {v0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;-><init>(ILpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;->progress:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;->progress:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;->syncConfig:Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;->syncConfig:Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;->dataInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;->dataInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;->throwable:Ljava/lang/Throwable;

    iget-object p1, p1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;->throwable:Ljava/lang/Throwable;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getDataInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;
    .locals 1

    .line 116
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;->dataInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    return-object v0
.end method

.method public final getProgress()I
    .locals 1

    .line 116
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;->progress:I

    return v0
.end method

.method public final getSyncConfig()Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;
    .locals 1

    .line 116
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;->syncConfig:Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;

    return-object v0
.end method

.method public final getThrowable()Ljava/lang/Throwable;
    .locals 1

    .line 116
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;->throwable:Ljava/lang/Throwable;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;->progress:I

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;->syncConfig:Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;->dataInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;->throwable:Ljava/lang/Throwable;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Throwable;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SyncInternalResult(progress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;->progress:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", syncConfig="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;->syncConfig:Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", dataInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;->dataInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", throwable="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;->throwable:Ljava/lang/Throwable;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
