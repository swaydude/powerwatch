.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$1zjjF8wd1c_k5x1UBxUOwKkx6Y0;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;

.field public final synthetic f$1:Ljava/lang/String;

.field public final synthetic f$2:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;

.field public final synthetic f$3:F


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;F)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$1zjjF8wd1c_k5x1UBxUOwKkx6Y0;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$1zjjF8wd1c_k5x1UBxUOwKkx6Y0;->f$1:Ljava/lang/String;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$1zjjF8wd1c_k5x1UBxUOwKkx6Y0;->f$2:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;

    iput p4, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$1zjjF8wd1c_k5x1UBxUOwKkx6Y0;->f$3:F

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$1zjjF8wd1c_k5x1UBxUOwKkx6Y0;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$1zjjF8wd1c_k5x1UBxUOwKkx6Y0;->f$1:Ljava/lang/String;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$1zjjF8wd1c_k5x1UBxUOwKkx6Y0;->f$2:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;

    iget v3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$1zjjF8wd1c_k5x1UBxUOwKkx6Y0;->f$3:F

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;

    invoke-static {v0, v1, v2, v3, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;->lambda$1zjjF8wd1c_k5x1UBxUOwKkx6Y0(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p1

    return-object p1
.end method
