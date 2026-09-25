.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Version2PairExecutorImpl;
.super Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;
.source "Gen2Executor.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J.\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0016\u00a8\u0006\u000f"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Version2PairExecutorImpl;",
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

    .line 605
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;)V

    return-void
.end method

.method public static synthetic lambda$3O-ls3voBQUU8mYoNIwe79CRYYs(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Version2PairExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Version2PairExecutorImpl;->transferData$lambda-6$lambda-3(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Version2PairExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$AcSvCgOXDbyhW2eiWaJGk6y2Y-c(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Version2PairExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Version2PairExecutorImpl;->transferData$lambda-6$lambda-2(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Version2PairExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$Jk-R4Kf8N6n2qcWgjX69dmMx7eI(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Version2PairExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static/range {p0 .. p5}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Version2PairExecutorImpl;->transferData$lambda-6(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Version2PairExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$S_QrSlpLMH-bUTV_GOKJBTeukQg(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Version2PairExecutorImpl;->transferData$lambda-6$lambda-5(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$VPDmifCKVNuhclgT_8kJ13ihXtQ(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Version2PairExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Version2PairExecutorImpl;->transferData$lambda-6$lambda-4(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Version2PairExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$X_fxWT6uqKM-aj2gWP7LjDGe81k(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Version2PairExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Version2PairExecutorImpl;->transferData$lambda-6$lambda-1(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Version2PairExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$_o-U95BbMgcgOd_0jB_9wpw9PI0(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Version2PairExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;Lio/reactivex/ObservableEmitter;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Version2PairExecutorImpl;->transferData$lambda-0(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Version2PairExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;Lio/reactivex/ObservableEmitter;)V

    return-void
.end method

.method private static final transferData$lambda-0(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Version2PairExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;Lio/reactivex/ObservableEmitter;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$dataInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 610
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Version2PairExecutorImpl;->getSyncProgressChannel()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannel;

    move-result-object v0

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannelKt;->getPairConfigPowers2()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannel;->setTempPowersConfig(Lkotlin/jvm/functions/Function1;)V

    .line 611
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Version2PairExecutorImpl;->getSyncProgressChannel()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannel;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannel;->reset()V

    .line 612
    invoke-interface {p2, p1}, Lio/reactivex/ObservableEmitter;->onNext(Ljava/lang/Object;)V

    .line 613
    invoke-interface {p2}, Lio/reactivex/ObservableEmitter;->onComplete()V

    return-void
.end method

.method private static final transferData$lambda-6(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Version2PairExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;
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

    .line 616
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

    .line 618
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Version2PairExecutorImpl$X_fxWT6uqKM-aj2gWP7LjDGe81k;

    invoke-direct {p5, p0, p1, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Version2PairExecutorImpl$X_fxWT6uqKM-aj2gWP7LjDGe81k;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Version2PairExecutorImpl;Ljava/lang/String;F)V

    invoke-virtual {p2, p5}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p2

    .line 619
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Version2PairExecutorImpl$AcSvCgOXDbyhW2eiWaJGk6y2Y-c;

    invoke-direct {p5, p0, p1, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Version2PairExecutorImpl$AcSvCgOXDbyhW2eiWaJGk6y2Y-c;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Version2PairExecutorImpl;Ljava/lang/String;F)V

    invoke-virtual {p2, p5}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p2

    .line 620
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Version2PairExecutorImpl$3O-ls3voBQUU8mYoNIwe79CRYYs;

    invoke-direct {p5, p0, p4, p1, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Version2PairExecutorImpl$3O-ls3voBQUU8mYoNIwe79CRYYs;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Version2PairExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Ljava/lang/String;F)V

    invoke-virtual {p2, p5}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p2

    .line 622
    new-instance p4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Version2PairExecutorImpl$VPDmifCKVNuhclgT_8kJ13ihXtQ;

    invoke-direct {p4, p0, p1, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Version2PairExecutorImpl$VPDmifCKVNuhclgT_8kJ13ihXtQ;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Version2PairExecutorImpl;Ljava/lang/String;F)V

    invoke-virtual {p2, p4}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p0

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Version2PairExecutorImpl$S_QrSlpLMH-bUTV_GOKJBTeukQg;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Version2PairExecutorImpl$S_QrSlpLMH-bUTV_GOKJBTeukQg;

    .line 624
    invoke-virtual {p0, p1}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final transferData$lambda-6$lambda-1(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Version2PairExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;
    .locals 12

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 618
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

.method private static final transferData$lambda-6$lambda-2(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Version2PairExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 12

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 619
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;

    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2GetUserAndGoalsCommand;

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2GetUserAndGoalsCommand;-><init>()V

    move-object v2, p0

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    const p0, 0x3e99999a    # 0.3f

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

.method private static final transferData$lambda-6$lambda-3(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Version2PairExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 14

    move-object v0, p0

    move-object v1, p1

    const-string v2, "this$0"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "$pairingConfig"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "$uid"

    move-object/from16 v5, p2

    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "it"

    move-object/from16 v6, p4

    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 620
    move-object v3, v0

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendUserPrefsAndGoalsCommand;

    invoke-direct {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendUserPrefsAndGoalsCommand;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;)V

    move-object v4, v0

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    const v0, 0x3ecccccd    # 0.4f

    mul-float v8, p3, v0

    const/4 v7, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/16 v12, 0x68

    const/4 v13, 0x0

    invoke-static/range {v3 .. v13}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendSingleCommandWithAck$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;FJLjava/lang/String;ILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    check-cast v0, Lio/reactivex/ObservableSource;

    return-object v0
.end method

.method private static final transferData$lambda-6$lambda-4(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Version2PairExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 12

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 622
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

.method private static final transferData$lambda-6$lambda-5(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 624
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;->getDataInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object p0

    return-object p0
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

    .line 609
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Version2PairExecutorImpl$_o-U95BbMgcgOd_0jB_9wpw9PI0;

    invoke-direct {v0, p0, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Version2PairExecutorImpl$_o-U95BbMgcgOd_0jB_9wpw9PI0;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Version2PairExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)V

    invoke-static {v0}, Lio/reactivex/Observable;->create(Lio/reactivex/ObservableOnSubscribe;)Lio/reactivex/Observable;

    move-result-object v0

    .line 614
    new-instance v7, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Version2PairExecutorImpl$Jk-R4Kf8N6n2qcWgjX69dmMx7eI;

    move-object v1, v7

    move-object v2, p0

    move-object v3, p1

    move-object v4, p3

    move v5, p4

    move-object v6, p2

    invoke-direct/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Version2PairExecutorImpl$Jk-R4Kf8N6n2qcWgjX69dmMx7eI;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Version2PairExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;)V

    invoke-virtual {v0, v7}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "create<DataInfo> {\n            syncProgressChannel.tempPowersConfig = pairConfigPowers2\n            syncProgressChannel.reset()\n            it.onNext(dataInfo)\n            it.onComplete()\n        }.flatMap {\n\n            sendAndWait(uid, Gen2DeviceInfoCommand(), dataInfo = dataInfo, power = 0.1F * power)\n\n                    .flatMap { sendSingleCommandWithAck(Gen2StartPairingCommand(), uid, Gen2DataInfo(dataInfo = it), power = 0.1F * power) }\n                    .flatMap { sendSingleCommandWithAck(Gen2GetUserAndGoalsCommand(), uid, it, power = 0.3F * power) }\n                    .flatMap { sendSingleCommandWithAck(Gen2SendUserPrefsAndGoalsCommand(pairingConfig), uid, it, power = 0.4F * power) }\n\n                    .flatMap { sendSingleCommandWithAck(Gen2StopPairingCommand(), uid, it, power = 0.1F * power) }\n\n                    .map { it.dataInfo }\n        }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
