.class public interface abstract Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;
.super Ljava/lang/Object;
.source "WatchSynchronizer.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u000e\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\tH&J\u000e\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\tH&J\u0012\u0010\r\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0010H&J$\u0010\u0011\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00120\tH&R\u0018\u0010\u0002\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0004\u0010\u0005\"\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0016"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;",
        "",
        "syncInProgress",
        "",
        "getSyncInProgress",
        "()Z",
        "setSyncInProgress",
        "(Z)V",
        "formattedDataOutput",
        "Lio/reactivex/Observable;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncEvent$SyncFinishedEvent;",
        "gpsTransferOutput",
        "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult;",
        "startSync",
        "",
        "syncConfig",
        "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;",
        "syncOutput",
        "Lkotlin/Triple;",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;",
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


# virtual methods
.method public abstract formattedDataOutput()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncEvent$SyncFinishedEvent;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getSyncInProgress()Z
.end method

.method public abstract gpsTransferOutput()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult;",
            ">;"
        }
    .end annotation
.end method

.method public abstract setSyncInProgress(Z)V
.end method

.method public abstract startSync(Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;)V
.end method

.method public abstract syncOutput()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Triple<",
            "Ljava/lang/Integer;",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;",
            "Ljava/lang/Throwable;",
            ">;>;"
        }
    .end annotation
.end method
