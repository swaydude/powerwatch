.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;
.super Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;
.source "Gen2Executor.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J.\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0016\u00a8\u0006\u000f"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;",
        "communicator",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;)V",
        "transferData",
        "Lio/reactivex/Observable;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;",
        "uid",
        "",
        "pairingConfig",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;",
        "dataInfo",
        "power",
        "",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;)V
    .locals 1

    const-string v0, "communicator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 579
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;)V

    return-void
.end method

.method public static synthetic lambda$1pv-qWTDWdg5HwHB2dUWWvymbL0(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;->transferData$lambda-12$lambda-3(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$4M7YoZ_LyNxz1LBneCve3N0Jfdk(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;->transferData$lambda-12$lambda-6(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V

    return-void
.end method

.method public static synthetic lambda$8jy3T7rNjzKWKXWdUsse7qGZy7c(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;->transferData$lambda-12$lambda-8(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$LxaRgECsLluK9hemP6Tf4jQ_50Y(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;->transferData$lambda-12$lambda-7(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$XLm7gP0AUO81mUqlkDfB8hQ-Ltw(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;Lio/reactivex/ObservableEmitter;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;->transferData$lambda-0(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;Lio/reactivex/ObservableEmitter;)V

    return-void
.end method

.method public static synthetic lambda$ZwqI_uZz2hq2xxcu2G_GpthCOBs(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;->transferData$lambda-12$lambda-1(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$_d7qA21r_AMdlfvk04tJOubJVjQ(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;->transferData$lambda-12$lambda-10(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$lwx8JPk4vGKo2_A222rgHKXoD1g(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;->transferData$lambda-12$lambda-2(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$m20blTbUydhiANbnhZ2SuJ2l-5A(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static/range {p0 .. p5}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;->transferData$lambda-12(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$ri5mt3BmzHe_r-se2P64F-wVHtM(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;->transferData$lambda-12$lambda-9(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$sls6pv_BpbdQlud0PJ5NldsOIjU(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;->transferData$lambda-12$lambda-11(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$ysD19o9tWoIuo-vb93Ujapm7cnY(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;->transferData$lambda-12$lambda-4(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$zDrYSn8cDcmayVUaqPC7zEnIcrE(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;->transferData$lambda-12$lambda-5(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method private static final transferData$lambda-0(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;Lio/reactivex/ObservableEmitter;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$dataInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 582
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;->getSyncProgressChannel()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannel;

    move-result-object v0

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannelKt;->getPairConfigPowers()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannel;->setTempPowersConfig(Lkotlin/jvm/functions/Function1;)V

    .line 583
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;->getSyncProgressChannel()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannel;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannel;->reset()V

    .line 584
    invoke-interface {p2, p1}, Lio/reactivex/ObservableEmitter;->onNext(Ljava/lang/Object;)V

    .line 585
    invoke-interface {p2}, Lio/reactivex/ObservableEmitter;->onComplete()V

    return-void
.end method

.method private static final transferData$lambda-12(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;
    .locals 9

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$dataInfo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$pairingConfig"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 587
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;

    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DeviceInfoCommand;

    invoke-direct {p5}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DeviceInfoCommand;-><init>()V

    move-object v3, p5

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;

    const p5, 0x3dcccccd    # 0.1f

    mul-float v5, p3, p5

    const/4 v6, 0x0

    const/16 v7, 0x10

    const/4 v8, 0x0

    move-object v2, p1

    move-object v4, p2

    invoke-static/range {v1 .. v8}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor$DefaultImpls;->sendAndWait$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;FIILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p2

    .line 589
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2PairExecutorImpl$ZwqI_uZz2hq2xxcu2G_GpthCOBs;

    invoke-direct {p5, p0, p1, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2PairExecutorImpl$ZwqI_uZz2hq2xxcu2G_GpthCOBs;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;Ljava/lang/String;F)V

    invoke-virtual {p2, p5}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p2

    .line 591
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2PairExecutorImpl$lwx8JPk4vGKo2_A222rgHKXoD1g;

    invoke-direct {p5, p0, p1, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2PairExecutorImpl$lwx8JPk4vGKo2_A222rgHKXoD1g;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;Ljava/lang/String;F)V

    invoke-virtual {p2, p5}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p2

    .line 592
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2PairExecutorImpl$1pv-qWTDWdg5HwHB2dUWWvymbL0;

    invoke-direct {p5, p0, p4, p1, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2PairExecutorImpl$1pv-qWTDWdg5HwHB2dUWWvymbL0;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Ljava/lang/String;F)V

    invoke-virtual {p2, p5}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p2

    .line 593
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2PairExecutorImpl$ysD19o9tWoIuo-vb93Ujapm7cnY;

    invoke-direct {p5, p0, p4, p1, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2PairExecutorImpl$ysD19o9tWoIuo-vb93Ujapm7cnY;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Ljava/lang/String;F)V

    invoke-virtual {p2, p5}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p2

    .line 594
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2PairExecutorImpl$zDrYSn8cDcmayVUaqPC7zEnIcrE;

    invoke-direct {p5, p0, p4, p1, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2PairExecutorImpl$zDrYSn8cDcmayVUaqPC7zEnIcrE;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Ljava/lang/String;F)V

    invoke-virtual {p2, p5}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p2

    .line 595
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2PairExecutorImpl$4M7YoZ_LyNxz1LBneCve3N0Jfdk;

    invoke-direct {p5, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2PairExecutorImpl$4M7YoZ_LyNxz1LBneCve3N0Jfdk;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;)V

    invoke-virtual {p2, p5}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p2

    .line 596
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2PairExecutorImpl$LxaRgECsLluK9hemP6Tf4jQ_50Y;

    invoke-direct {p5, p0, p1, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2PairExecutorImpl$LxaRgECsLluK9hemP6Tf4jQ_50Y;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;Ljava/lang/String;F)V

    invoke-virtual {p2, p5}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p2

    .line 597
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2PairExecutorImpl$8jy3T7rNjzKWKXWdUsse7qGZy7c;

    invoke-direct {p5, p0, p4, p1, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2PairExecutorImpl$8jy3T7rNjzKWKXWdUsse7qGZy7c;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Ljava/lang/String;F)V

    invoke-virtual {p2, p5}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p2

    .line 598
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2PairExecutorImpl$ri5mt3BmzHe_r-se2P64F-wVHtM;

    invoke-direct {p5, p0, p4, p1, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2PairExecutorImpl$ri5mt3BmzHe_r-se2P64F-wVHtM;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Ljava/lang/String;F)V

    invoke-virtual {p2, p5}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p2

    .line 599
    new-instance p4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2PairExecutorImpl$_d7qA21r_AMdlfvk04tJOubJVjQ;

    invoke-direct {p4, p0, p1, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2PairExecutorImpl$_d7qA21r_AMdlfvk04tJOubJVjQ;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;Ljava/lang/String;F)V

    invoke-virtual {p2, p4}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p0

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2PairExecutorImpl$sls6pv_BpbdQlud0PJ5NldsOIjU;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2PairExecutorImpl$sls6pv_BpbdQlud0PJ5NldsOIjU;

    .line 600
    invoke-virtual {p0, p1}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final transferData$lambda-12$lambda-1(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;
    .locals 12

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 589
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;

    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2StartPairingCommand;

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2StartPairingCommand;-><init>()V

    move-object v2, p0

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v10, 0x37

    const/4 v11, 0x0

    move-object v3, p0

    move-object v7, p3

    invoke-direct/range {v3 .. v11}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;-><init>(Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2TempActivityInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2LogsCount;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const p3, 0x3dcccccd    # 0.1f

    mul-float v6, p2, p3

    const-wide/16 v7, 0x0

    const/16 v10, 0x68

    move-object v3, p1

    move-object v4, p0

    invoke-static/range {v1 .. v11}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendSingleCommandWithAck$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;FJLjava/lang/String;ILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final transferData$lambda-12$lambda-10(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 12

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 599
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;

    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2StopPairingCommand;

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2StopPairingCommand;-><init>()V

    move-object v2, p0

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    const p0, 0x3dcccccd    # 0.1f

    mul-float v6, p2, p0

    const/4 v5, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/16 v10, 0x68

    const/4 v11, 0x0

    move-object v3, p1

    move-object v4, p3

    invoke-static/range {v1 .. v11}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendSingleCommandWithAck$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;FJLjava/lang/String;ILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final transferData$lambda-12$lambda-11(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 600
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;->getDataInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object p0

    return-object p0
.end method

.method private static final transferData$lambda-12$lambda-2(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 12

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 591
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;

    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ReceiveUserInformationCommand;

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ReceiveUserInformationCommand;-><init>()V

    move-object v2, p0

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    const p0, 0x3dcccccd    # 0.1f

    mul-float v6, p2, p0

    const/4 v5, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/16 v10, 0x68

    const/4 v11, 0x0

    move-object v3, p1

    move-object v4, p3

    invoke-static/range {v1 .. v11}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendSingleCommandWithAck$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;FJLjava/lang/String;ILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final transferData$lambda-12$lambda-3(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 13

    move-object v0, p0

    const-string v1, "this$0"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "$pairingConfig"

    move-object v2, p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "$uid"

    move-object v4, p2

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "it"

    move-object/from16 v5, p4

    invoke-static {v5, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 592
    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendUserInformationCommand;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;->getUnitsInfoData()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UnitsInfoData;

    move-result-object v2

    invoke-direct {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendUserInformationCommand;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UnitsInfoData;)V

    move-object v3, v1

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    const v1, 0x3dcccccd    # 0.1f

    mul-float v7, p3, v1

    const/4 v6, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/16 v11, 0x68

    const/4 v12, 0x0

    move-object v2, v0

    invoke-static/range {v2 .. v12}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendSingleCommandWithAck$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;FJLjava/lang/String;ILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    check-cast v0, Lio/reactivex/ObservableSource;

    return-object v0
.end method

.method private static final transferData$lambda-12$lambda-4(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 13

    move-object v0, p0

    const-string v1, "this$0"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "$pairingConfig"

    move-object v2, p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "$uid"

    move-object v4, p2

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "it"

    move-object/from16 v5, p4

    invoke-static {v5, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 593
    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendBiometricsCommand;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;->getUserInfoData()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;

    move-result-object v2

    invoke-direct {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendBiometricsCommand;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;)V

    move-object v3, v1

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    const v1, 0x3dcccccd    # 0.1f

    mul-float v7, p3, v1

    const/4 v6, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/16 v11, 0x68

    const/4 v12, 0x0

    move-object v2, v0

    invoke-static/range {v2 .. v12}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendSingleCommandWithAck$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;FJLjava/lang/String;ILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    check-cast v0, Lio/reactivex/ObservableSource;

    return-object v0
.end method

.method private static final transferData$lambda-12$lambda-5(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 13

    move-object v0, p0

    const-string v1, "this$0"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "$pairingConfig"

    move-object v2, p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "$uid"

    move-object v4, p2

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "it"

    move-object/from16 v5, p4

    invoke-static {v5, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 594
    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendLanguageCommand;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;->getLanguageInfoData()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/LanguageInfoData;

    move-result-object v2

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/LanguageInfoData;->getLocale()Ljava/util/Locale;

    move-result-object v2

    invoke-direct {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendLanguageCommand;-><init>(Ljava/util/Locale;)V

    move-object v3, v1

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    const v1, 0x3dcccccd    # 0.1f

    mul-float v7, p3, v1

    const/4 v6, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/16 v11, 0x68

    const/4 v12, 0x0

    move-object v2, v0

    invoke-static/range {v2 .. v12}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendSingleCommandWithAck$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;FJLjava/lang/String;ILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    check-cast v0, Lio/reactivex/ObservableSource;

    return-object v0
.end method

.method private static final transferData$lambda-12$lambda-6(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 2

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 595
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p1, "Gen2SendLanguageCommand finished successfully."

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final transferData$lambda-12$lambda-7(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 12

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 596
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;

    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ReceiveStepsDistanceGoals;

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ReceiveStepsDistanceGoals;-><init>()V

    move-object v2, p0

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    const p0, 0x3dcccccd    # 0.1f

    mul-float v6, p2, p0

    const/4 v5, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/16 v10, 0x68

    const/4 v11, 0x0

    move-object v3, p1

    move-object v4, p3

    invoke-static/range {v1 .. v11}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendSingleCommandWithAck$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;FJLjava/lang/String;ILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final transferData$lambda-12$lambda-8(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 13

    move-object v0, p0

    const-string v1, "this$0"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "$pairingConfig"

    move-object v2, p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "$uid"

    move-object v4, p2

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "it"

    move-object/from16 v5, p4

    invoke-static {v5, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 597
    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendStepsDistanceGoal;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;->getGoalInfoData()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;

    move-result-object v2

    invoke-direct {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendStepsDistanceGoal;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;)V

    move-object v3, v1

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    const v1, 0x3dcccccd    # 0.1f

    mul-float v7, p3, v1

    const/4 v6, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/16 v11, 0x68

    const/4 v12, 0x0

    move-object v2, v0

    invoke-static/range {v2 .. v12}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendSingleCommandWithAck$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;FJLjava/lang/String;ILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    check-cast v0, Lio/reactivex/ObservableSource;

    return-object v0
.end method

.method private static final transferData$lambda-12$lambda-9(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 13

    move-object v0, p0

    const-string v1, "this$0"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "$pairingConfig"

    move-object v2, p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "$uid"

    move-object v4, p2

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "it"

    move-object/from16 v5, p4

    invoke-static {v5, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 598
    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendCaloriesSleepGoal;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;->getGoalInfoData()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;

    move-result-object v2

    invoke-direct {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendCaloriesSleepGoal;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;)V

    move-object v3, v1

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    const v1, 0x3dcccccd    # 0.1f

    mul-float v7, p3, v1

    const/4 v6, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/16 v11, 0x68

    const/4 v12, 0x0

    move-object v2, v0

    invoke-static/range {v2 .. v12}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendSingleCommandWithAck$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;FJLjava/lang/String;ILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    check-cast v0, Lio/reactivex/ObservableSource;

    return-object v0
.end method


# virtual methods
.method public transferData(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;F)Lio/reactivex/Observable;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;",
            "F)",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;",
            ">;"
        }
    .end annotation

    const-string v0, "uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pairingConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataInfo"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 581
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2PairExecutorImpl$XLm7gP0AUO81mUqlkDfB8hQ-Ltw;

    invoke-direct {v0, p0, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2PairExecutorImpl$XLm7gP0AUO81mUqlkDfB8hQ-Ltw;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)V

    invoke-static {v0}, Lio/reactivex/Observable;->create(Lio/reactivex/ObservableOnSubscribe;)Lio/reactivex/Observable;

    move-result-object v0

    .line 586
    new-instance v7, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2PairExecutorImpl$m20blTbUydhiANbnhZ2SuJ2l-5A;

    move-object v1, v7

    move-object v2, p0

    move-object v3, p1

    move-object v4, p3

    move v5, p4

    move-object v6, p2

    invoke-direct/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2PairExecutorImpl$m20blTbUydhiANbnhZ2SuJ2l-5A;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;)V

    invoke-virtual {v0, v7}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "create<DataInfo> {\n            syncProgressChannel.tempPowersConfig = pairConfigPowers\n            syncProgressChannel.reset()\n            it.onNext(dataInfo)\n            it.onComplete()\n        }.flatMap {\n            sendAndWait(uid, Gen2DeviceInfoCommand(), dataInfo = dataInfo, power = 0.1F * power)\n\n                    .flatMap { sendSingleCommandWithAck(Gen2StartPairingCommand(), uid, Gen2DataInfo(dataInfo = it), power = 0.1F * power) }\n\n                    .flatMap { sendSingleCommandWithAck(Gen2ReceiveUserInformationCommand(), uid, it, power = 0.1F * power) }\n                    .flatMap { sendSingleCommandWithAck(Gen2SendUserInformationCommand(pairingConfig.unitsInfoData), uid, it, power = 0.1F * power) }\n                    .flatMap { sendSingleCommandWithAck(Gen2SendBiometricsCommand(pairingConfig.userInfoData), uid, it, power = 0.1F * power) }\n                    .flatMap { sendSingleCommandWithAck(Gen2SendLanguageCommand(pairingConfig.languageInfoData.locale), uid, it, power = 0.1F * power) }\n                    .doOnNext { debug(\"Gen2SendLanguageCommand finished successfully.\") }\n                    .flatMap { sendSingleCommandWithAck(Gen2ReceiveStepsDistanceGoals(), uid, it, power = 0.1F * power) }\n                    .flatMap { sendSingleCommandWithAck(Gen2SendStepsDistanceGoal(pairingConfig.goalInfoData), uid, it, power = 0.1F * power) }\n                    .flatMap { sendSingleCommandWithAck(Gen2SendCaloriesSleepGoal(pairingConfig.goalInfoData), uid, it, power = 0.1F * power) }\n                    .flatMap { sendSingleCommandWithAck(Gen2StopPairingCommand(), uid, it, power = 0.1F * power) }\n                    .map { it.dataInfo }\n        }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
