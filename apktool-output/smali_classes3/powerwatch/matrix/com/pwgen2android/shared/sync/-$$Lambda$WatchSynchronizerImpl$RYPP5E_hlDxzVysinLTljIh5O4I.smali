.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$RYPP5E_hlDxzVysinLTljIh5O4I;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lio/reactivex/Single;


# direct methods
.method public synthetic constructor <init>(Lio/reactivex/Single;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$RYPP5E_hlDxzVysinLTljIh5O4I;->f$0:Lio/reactivex/Single;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$RYPP5E_hlDxzVysinLTljIh5O4I;->f$0:Lio/reactivex/Single;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/LogsContainer;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->lambda$RYPP5E_hlDxzVysinLTljIh5O4I(Lio/reactivex/Single;Lpowerwatch/matrix/com/pwgen2android/shared/sync/LogsContainer;)Lio/reactivex/ObservableSource;

    move-result-object p1

    return-object p1
.end method
