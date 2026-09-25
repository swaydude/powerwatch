.class public final Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$SyncProgress;
.super Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult;
.source "WatchSynchronizer.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "SyncProgress"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$SyncProgress;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult;",
        "progress",
        "",
        "dataInfo",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;",
        "error",
        "",
        "isAGPSNeeded",
        "",
        "(ILpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;Ljava/lang/Throwable;Z)V",
        "getDataInfo",
        "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;",
        "()Z",
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

.field private final isAGPSNeeded:Z


# direct methods
.method public constructor <init>(ILpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;Ljava/lang/Throwable;Z)V
    .locals 1

    const/4 v0, 0x0

    .line 99
    invoke-direct {p0, p1, p3, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult;-><init>(ILjava/lang/Throwable;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$SyncProgress;->dataInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    iput-boolean p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$SyncProgress;->isAGPSNeeded:Z

    return-void
.end method


# virtual methods
.method public final getDataInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;
    .locals 1

    .line 99
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$SyncProgress;->dataInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    return-object v0
.end method

.method public final isAGPSNeeded()Z
    .locals 1

    .line 99
    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$SyncProgress;->isAGPSNeeded:Z

    return v0
.end method
