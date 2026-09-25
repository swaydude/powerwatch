.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$4WXGpBWSWWC28WY9kHZQLDkc4GA;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;

.field public final synthetic f$2:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$4WXGpBWSWWC28WY9kHZQLDkc4GA;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$4WXGpBWSWWC28WY9kHZQLDkc4GA;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$4WXGpBWSWWC28WY9kHZQLDkc4GA;->f$2:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$4WXGpBWSWWC28WY9kHZQLDkc4GA;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$4WXGpBWSWWC28WY9kHZQLDkc4GA;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$4WXGpBWSWWC28WY9kHZQLDkc4GA;->f$2:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;

    invoke-static {v0, v1, v2, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->lambda$4WXGpBWSWWC28WY9kHZQLDkc4GA(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;)Lio/reactivex/ObservableSource;

    move-result-object p1

    return-object p1
.end method
