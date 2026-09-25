.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$--lAXrXrbifs-KAUI_ybi3vBgMI;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;

.field public final synthetic f$2:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$--lAXrXrbifs-KAUI_ybi3vBgMI;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$--lAXrXrbifs-KAUI_ybi3vBgMI;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$--lAXrXrbifs-KAUI_ybi3vBgMI;->f$2:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$--lAXrXrbifs-KAUI_ybi3vBgMI;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$--lAXrXrbifs-KAUI_ybi3vBgMI;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$--lAXrXrbifs-KAUI_ybi3vBgMI;->f$2:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    check-cast p1, Lkotlin/Pair;

    invoke-static {v0, v1, v2, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;->lambda$--lAXrXrbifs-KAUI_ybi3vBgMI(Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lkotlin/Pair;)Lio/reactivex/ObservableSource;

    move-result-object p1

    return-object p1
.end method
