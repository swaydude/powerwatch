.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver2SyncExecutorImpl$CrbEiTd6hu9rrMKg1ig73tZDdY0;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver2SyncExecutorImpl;

.field public final synthetic f$1:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver2SyncExecutorImpl;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver2SyncExecutorImpl$CrbEiTd6hu9rrMKg1ig73tZDdY0;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver2SyncExecutorImpl;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver2SyncExecutorImpl$CrbEiTd6hu9rrMKg1ig73tZDdY0;->f$1:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver2SyncExecutorImpl$CrbEiTd6hu9rrMKg1ig73tZDdY0;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver2SyncExecutorImpl;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver2SyncExecutorImpl$CrbEiTd6hu9rrMKg1ig73tZDdY0;->f$1:Ljava/lang/String;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver2SyncExecutorImpl;->lambda$CrbEiTd6hu9rrMKg1ig73tZDdY0(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver2SyncExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p1

    return-object p1
.end method
