.class public interface abstract Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;
.super Ljava/lang/Object;
.source "CloudSynchronizer.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H&J\u0008\u0010\u0004\u001a\u00020\u0003H&J\u000e\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H&J\u0014\u0010\u0008\u001a\u00020\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\u0008\u0010\u000c\u001a\u00020\rH&J\u0014\u0010\u000e\u001a\u00020\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH&\u00a8\u0006\u000f"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;",
        "",
        "hasActivitySessionsToSync",
        "",
        "hasBackgroundLogsToSync",
        "hasDataToSync",
        "Lio/reactivex/Single;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/SyncDataInfo;",
        "syncAllDataToCloud",
        "Lio/reactivex/Completable;",
        "scheduleTime",
        "Ljava/util/concurrent/TimeUnit;",
        "syncData",
        "",
        "syncWatchLogsToCloud",
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


# virtual methods
.method public abstract hasActivitySessionsToSync()Z
.end method

.method public abstract hasBackgroundLogsToSync()Z
.end method

.method public abstract hasDataToSync()Lio/reactivex/Single;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Single<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/SyncDataInfo;",
            ">;"
        }
    .end annotation
.end method

.method public abstract syncAllDataToCloud(Ljava/util/concurrent/TimeUnit;)Lio/reactivex/Completable;
.end method

.method public abstract syncData()V
.end method

.method public abstract syncWatchLogsToCloud(Ljava/util/concurrent/TimeUnit;)Lio/reactivex/Completable;
.end method
