.class public final Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer$DefaultImpls;
.super Ljava/lang/Object;
.source "WatchSynchronizer.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic startSync$default(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;ILjava/lang/Object;)V
    .locals 8

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 111
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x1f

    const/4 v7, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;-><init>(ZLjava/util/concurrent/TimeUnit;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_0
    invoke-interface {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;->startSync(Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: startSync"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
