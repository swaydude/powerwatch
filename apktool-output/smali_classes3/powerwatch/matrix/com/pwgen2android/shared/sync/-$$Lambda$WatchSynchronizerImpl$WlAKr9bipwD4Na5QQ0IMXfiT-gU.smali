.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$WlAKr9bipwD4Na5QQ0IMXfiT-gU;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/BiFunction;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$WlAKr9bipwD4Na5QQ0IMXfiT-gU;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$WlAKr9bipwD4Na5QQ0IMXfiT-gU;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

    invoke-static {v0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->lambda$WlAKr9bipwD4Na5QQ0IMXfiT-gU(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;

    move-result-object p1

    return-object p1
.end method
