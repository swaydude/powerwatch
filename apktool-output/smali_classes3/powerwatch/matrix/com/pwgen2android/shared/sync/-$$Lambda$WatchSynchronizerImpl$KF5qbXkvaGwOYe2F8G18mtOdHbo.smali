.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$KF5qbXkvaGwOYe2F8G18mtOdHbo;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$KF5qbXkvaGwOYe2F8G18mtOdHbo;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$KF5qbXkvaGwOYe2F8G18mtOdHbo;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$KF5qbXkvaGwOYe2F8G18mtOdHbo;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$KF5qbXkvaGwOYe2F8G18mtOdHbo;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->lambda$KF5qbXkvaGwOYe2F8G18mtOdHbo(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;)Lio/reactivex/ObservableSource;

    move-result-object p1

    return-object p1
.end method
