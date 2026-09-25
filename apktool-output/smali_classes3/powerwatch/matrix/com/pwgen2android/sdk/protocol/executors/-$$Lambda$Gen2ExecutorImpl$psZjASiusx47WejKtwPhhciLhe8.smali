.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$psZjASiusx47WejKtwPhhciLhe8;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic f$0:Z

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;

.field public final synthetic f$2:Ljava/lang/String;

.field public final synthetic f$3:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;


# direct methods
.method public synthetic constructor <init>(ZLpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$psZjASiusx47WejKtwPhhciLhe8;->f$0:Z

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$psZjASiusx47WejKtwPhhciLhe8;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$psZjASiusx47WejKtwPhhciLhe8;->f$2:Ljava/lang/String;

    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$psZjASiusx47WejKtwPhhciLhe8;->f$3:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 4

    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$psZjASiusx47WejKtwPhhciLhe8;->f$0:Z

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$psZjASiusx47WejKtwPhhciLhe8;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$psZjASiusx47WejKtwPhhciLhe8;->f$2:Ljava/lang/String;

    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$psZjASiusx47WejKtwPhhciLhe8;->f$3:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    invoke-static {v0, v1, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->lambda$psZjASiusx47WejKtwPhhciLhe8(ZLpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)Lio/reactivex/ObservableSource;

    move-result-object v0

    return-object v0
.end method
