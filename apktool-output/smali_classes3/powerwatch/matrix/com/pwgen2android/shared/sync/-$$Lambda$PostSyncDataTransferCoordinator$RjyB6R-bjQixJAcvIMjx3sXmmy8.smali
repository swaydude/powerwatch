.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$RjyB6R-bjQixJAcvIMjx3sXmmy8;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$RjyB6R-bjQixJAcvIMjx3sXmmy8;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$RjyB6R-bjQixJAcvIMjx3sXmmy8;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$RjyB6R-bjQixJAcvIMjx3sXmmy8;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$RjyB6R-bjQixJAcvIMjx3sXmmy8;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;->lambda$RjyB6R-bjQixJAcvIMjx3sXmmy8(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lio/reactivex/ObservableSource;

    move-result-object p1

    return-object p1
.end method
