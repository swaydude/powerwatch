.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$isocrRS6vdIfDst6ziBvr9V6fTE;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$isocrRS6vdIfDst6ziBvr9V6fTE;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$isocrRS6vdIfDst6ziBvr9V6fTE;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->lambda$isocrRS6vdIfDst6ziBvr9V6fTE(Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method
