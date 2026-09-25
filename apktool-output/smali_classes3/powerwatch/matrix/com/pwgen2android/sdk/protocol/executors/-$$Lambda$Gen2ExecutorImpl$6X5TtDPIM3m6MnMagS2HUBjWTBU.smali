.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$6X5TtDPIM3m6MnMagS2HUBjWTBU;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lio/reactivex/Observable;


# direct methods
.method public synthetic constructor <init>(Lio/reactivex/Observable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$6X5TtDPIM3m6MnMagS2HUBjWTBU;->f$0:Lio/reactivex/Observable;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$6X5TtDPIM3m6MnMagS2HUBjWTBU;->f$0:Lio/reactivex/Observable;

    check-cast p1, [B

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->lambda$6X5TtDPIM3m6MnMagS2HUBjWTBU(Lio/reactivex/Observable;[B)Lio/reactivex/ObservableSource;

    move-result-object p1

    return-object p1
.end method
