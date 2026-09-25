.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$G3XtH-srQbnf4qfgZnukZ-rdpdo;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;

.field public final synthetic f$2:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$G3XtH-srQbnf4qfgZnukZ-rdpdo;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$G3XtH-srQbnf4qfgZnukZ-rdpdo;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$G3XtH-srQbnf4qfgZnukZ-rdpdo;->f$2:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$G3XtH-srQbnf4qfgZnukZ-rdpdo;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$G3XtH-srQbnf4qfgZnukZ-rdpdo;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$G3XtH-srQbnf4qfgZnukZ-rdpdo;->f$2:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$AGPSProgress;

    invoke-static {v0, v1, v2, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;->lambda$G3XtH-srQbnf4qfgZnukZ-rdpdo(Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$AGPSProgress;)Lio/reactivex/ObservableSource;

    move-result-object p1

    return-object p1
.end method
