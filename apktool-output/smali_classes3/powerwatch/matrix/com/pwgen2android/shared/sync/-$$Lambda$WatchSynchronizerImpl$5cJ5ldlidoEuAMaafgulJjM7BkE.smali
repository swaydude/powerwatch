.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$5cJ5ldlidoEuAMaafgulJjM7BkE;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$5cJ5ldlidoEuAMaafgulJjM7BkE;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$5cJ5ldlidoEuAMaafgulJjM7BkE;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$5cJ5ldlidoEuAMaafgulJjM7BkE;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$5cJ5ldlidoEuAMaafgulJjM7BkE;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->lambda$5cJ5ldlidoEuAMaafgulJjM7BkE(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;)Lio/reactivex/ObservableSource;

    move-result-object p1

    return-object p1
.end method
