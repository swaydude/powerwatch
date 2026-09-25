.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$QeD6jGALJE7dC1yqwIhWsIXJSNs;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/sync/LogsContainer;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/sync/LogsContainer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$QeD6jGALJE7dC1yqwIhWsIXJSNs;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/sync/LogsContainer;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$QeD6jGALJE7dC1yqwIhWsIXJSNs;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/sync/LogsContainer;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/LastPeriodsContainer;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->lambda$QeD6jGALJE7dC1yqwIhWsIXJSNs(Lpowerwatch/matrix/com/pwgen2android/shared/sync/LogsContainer;Lpowerwatch/matrix/com/pwgen2android/shared/sync/LastPeriodsContainer;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method
