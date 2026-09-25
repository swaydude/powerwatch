.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/-$$Lambda$WatchSettingExecutorImpl$AYo7FEHigmZu1HMkAUfVXBcUCCg;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/-$$Lambda$WatchSettingExecutorImpl$AYo7FEHigmZu1HMkAUfVXBcUCCg;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/-$$Lambda$WatchSettingExecutorImpl$AYo7FEHigmZu1HMkAUfVXBcUCCg;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/-$$Lambda$WatchSettingExecutorImpl$AYo7FEHigmZu1HMkAUfVXBcUCCg;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/-$$Lambda$WatchSettingExecutorImpl$AYo7FEHigmZu1HMkAUfVXBcUCCg;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl;->lambda$AYo7FEHigmZu1HMkAUfVXBcUCCg(Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Ljava/lang/String;)Lio/reactivex/CompletableSource;

    move-result-object p1

    return-object p1
.end method
