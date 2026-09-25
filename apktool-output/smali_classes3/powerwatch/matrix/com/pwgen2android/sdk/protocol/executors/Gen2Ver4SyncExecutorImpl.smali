.class public Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;
.super Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;
.source "Gen2Executor.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGen2Executor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Gen2Executor.kt\npowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1045:1\n1849#2,2:1046\n2820#2,5:1048\n2820#2,5:1053\n1768#2,4:1058\n*S KotlinDebug\n*F\n+ 1 Gen2Executor.kt\npowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl\n*L\n964#1:1046,2\n1007#1:1048,5\n1008#1:1053,5\n1011#1:1058,4\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0000\u0008\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J.\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u00082\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\u00080\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;",
        "communicator",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;",
        "locationInfoProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;)V",
        "TAG",
        "",
        "kotlin.jvm.PlatformType",
        "getLocationInfoProvider",
        "()Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;",
        "logsCountChecker",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/LogsCountChecker;",
        "transferData",
        "Lio/reactivex/Observable;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;",
        "uid",
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


# instance fields
.field private final TAG:Ljava/lang/String;

.field private final locationInfoProvider:Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;

.field private final logsCountChecker:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/LogsCountChecker;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;)V
    .locals 1

    const-string v0, "communicator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "locationInfoProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 899
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;)V

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;->locationInfoProvider:Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;

    .line 901
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;->TAG:Ljava/lang/String;

    .line 903
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/LogsCountChecker;

    invoke-direct {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/LogsCountChecker;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;->logsCountChecker:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/LogsCountChecker;

    return-void
.end method

.method public static synthetic lambda$1zjjF8wd1c_k5x1UBxUOwKkx6Y0(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;->transferData$lambda-42$lambda-6(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$3mLE3fnd9ez1WpcRWnZxG6U7Lmk(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;->transferData$lambda-42$lambda-3(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V

    return-void
.end method

.method public static synthetic lambda$4k-J07mOehPm67xw982AgmhVQXA(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;->transferData$lambda-42$lambda-8(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V

    return-void
.end method

.method public static synthetic lambda$5Wh7aF975BVglojDvEf-HsWgIE8(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;->transferData$lambda-42$lambda-18(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V

    return-void
.end method

.method public static synthetic lambda$7EHOvgDezo0C9Hfhr3HU8RfKpq8(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;->transferData$lambda-42$lambda-33(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V

    return-void
.end method

.method public static synthetic lambda$7p-wM2RQRoV0v5_CSsV-rrWLWDU(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;->transferData$lambda-42$lambda-19(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$AK-fdQaq2_7sg5ixt5DEEdl0yzc(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;->transferData$lambda-42$lambda-39(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V

    return-void
.end method

.method public static synthetic lambda$A_PIUTfLbJXfPD8TjGH6Y3YtCNc(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static/range {p0 .. p5}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;->transferData$lambda-42$lambda-11(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$EmFAXK38GyTNCA4f2ZhQFRxC3AQ(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;->transferData$lambda-42$lambda-2(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$LUNJV8FrME4hTFu5AsdKPToru4w(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;->transferData$lambda-42$lambda-27(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V

    return-void
.end method

.method public static synthetic lambda$MUOFxD34LlOuA6zaSCmohsz1Dfo(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;FLjava/lang/Object;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;->transferData$lambda-42$lambda-7(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;FLjava/lang/Object;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$OkmWFqkLkRuO2Yc-IgOM554gnas(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;->transferData$lambda-42$lambda-12(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V

    return-void
.end method

.method public static synthetic lambda$QzOdZy2m6Dqv1UuN6_nAdW-ohY4(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;->transferData$lambda-42$lambda-32(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$RzaEwswSdh9ZerxLeaK_EhgtjjM(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;->transferData$lambda-42$lambda-40(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$TBjzraXjwm3pKvLgPvq1MvAI7wQ(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;->transferData$lambda-42$lambda-14(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V

    return-void
.end method

.method public static synthetic lambda$TvB94u9fTBHESzaiROB3x6Zz7Do(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;->transferData$lambda-42$lambda-13(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$UmbZxjVmtjgrnEaIcWwAhuiyyYs(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;->transferData$lambda-42$lambda-22(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$YDGrDCreyoaLif2ap4m-gdPbTN0(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;->transferData$lambda-42$lambda-35(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V

    return-void
.end method

.method public static synthetic lambda$Z3cqzrPQJe-F5msCbhCj8xwgFgw(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;->transferData$lambda-42$lambda-30(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$ZovTXbUSnulQkVUFLUCVu7AWKC0(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;->transferData$lambda-42$lambda-1(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)V

    return-void
.end method

.method public static synthetic lambda$_bVRZ8H0s0iFD8opbzLJ_qJ-t0U(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;->transferData$lambda-42$lambda-23(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V

    return-void
.end method

.method public static synthetic lambda$aIGTHxyvAzm0a5hrpkpejPtRqvw(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;->transferData$lambda-42$lambda-41(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$aav9nQkN2v15v7xtNQiuf44HiM0(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;->transferData$lambda-42$lambda-31(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V

    return-void
.end method

.method public static synthetic lambda$ar_GRrTZ0Jl4gBwsJAi_0oiu9rg(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;->transferData$lambda-42$lambda-16(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V

    return-void
.end method

.method public static synthetic lambda$eSKfB-7yVf-DjzSApRPnJ_pHy8w(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;->transferData$lambda-42$lambda-25(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$epL3VNBHxAZumlulvqU_3mzmuCY(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;->transferData$lambda-42$lambda-15(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$gREWA2ENJ-7FyUrptRW1Jw8g-JY(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;->transferData$lambda-42$lambda-17(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$grcit7KB73xn1eDjZ7qiCojwbaE(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;->transferData$lambda-42$lambda-10(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V

    return-void
.end method

.method public static synthetic lambda$iPz8LOThkstNfprVoXx6_QyCQUA(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;Lio/reactivex/ObservableEmitter;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;->transferData$lambda-0(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;Lio/reactivex/ObservableEmitter;)V

    return-void
.end method

.method public static synthetic lambda$k9iEZhAlOfvvDJSBQVKxjQ47Kcw(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;FLkotlin/Pair;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;->transferData$lambda-42$lambda-6$lambda-4(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;FLkotlin/Pair;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$kYjSX6pf23IBBZDdii3KQdJdOag(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;->transferData$lambda-42$lambda-26(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V

    return-void
.end method

.method public static synthetic lambda$onhTefiQKGO5kIh8qPUTnOM7SX4(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;->transferData$lambda-42$lambda-6$lambda-5(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic lambda$p3ifsTyYtTY5krgbjZv-34eipt4(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static/range {p0 .. p6}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;->transferData$lambda-42(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$pRSEkcJgnIKZpIbB8CbNow6xqMM(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;->transferData$lambda-42$lambda-28(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$pVmXNK5vcejjj6r_NKYUx7C2O7c(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;->transferData$lambda-42$lambda-21(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V

    return-void
.end method

.method public static synthetic lambda$pzQxr2L5_esGdyWL9pWRDi2fNlA(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;->transferData$lambda-42$lambda-29(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V

    return-void
.end method

.method public static synthetic lambda$r3VfhpfvrtKvX4ygWfhe6IOlyks(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;->transferData$lambda-42$lambda-34(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$rDJyb84-tJlEw8581FKwLh6FIoQ(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;->transferData$lambda-42$lambda-9(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$s2N_RgVv6FYGokDRdhMpCI5sD4s(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;->transferData$lambda-42$lambda-24(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V

    return-void
.end method

.method private static final transferData$lambda-0(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;Lio/reactivex/ObservableEmitter;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$dataInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 910
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;->getSyncProgressChannel()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannel;

    move-result-object v0

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannelKt;->getSyncConfigPowers2Ver3()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannel;->setTempPowersConfig(Lkotlin/jvm/functions/Function1;)V

    .line 911
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;->getSyncProgressChannel()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannel;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannel;->reset()V

    .line 912
    invoke-interface {p2, p1}, Lio/reactivex/ObservableEmitter;->onNext(Ljava/lang/Object;)V

    .line 913
    invoke-interface {p2}, Lio/reactivex/ObservableEmitter;->onComplete()V

    return-void
.end method

.method private static final transferData$lambda-42(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;
    .locals 9

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$dataInfo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$dataInfoWrapper"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$pairingConfig"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 915
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;

    new-instance p6, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DeviceInfoCommand;

    invoke-direct {p6}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DeviceInfoCommand;-><init>()V

    move-object v3, p6

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;

    const p6, 0x3d4ccccd    # 0.05f

    mul-float v5, p3, p6

    const/4 v6, 0x0

    const/16 v7, 0x10

    const/4 v8, 0x0

    move-object v2, p1

    move-object v4, p2

    invoke-static/range {v1 .. v8}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor$DefaultImpls;->sendAndWait$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;FIILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p2

    .line 916
    new-instance p6, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$ZovTXbUSnulQkVUFLUCVu7AWKC0;

    invoke-direct {p6, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$ZovTXbUSnulQkVUFLUCVu7AWKC0;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;)V

    invoke-virtual {p2, p6}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p2

    .line 917
    new-instance p6, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$EmFAXK38GyTNCA4f2ZhQFRxC3AQ;

    invoke-direct {p6, p0, p1, p4, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$EmFAXK38GyTNCA4f2ZhQFRxC3AQ;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;F)V

    invoke-virtual {p2, p6}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p2

    .line 918
    new-instance p6, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$3mLE3fnd9ez1WpcRWnZxG6U7Lmk;

    invoke-direct {p6, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$3mLE3fnd9ez1WpcRWnZxG6U7Lmk;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;)V

    invoke-virtual {p2, p6}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p2

    .line 920
    new-instance p6, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$1zjjF8wd1c_k5x1UBxUOwKkx6Y0;

    invoke-direct {p6, p0, p1, p4, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$1zjjF8wd1c_k5x1UBxUOwKkx6Y0;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;F)V

    invoke-virtual {p2, p6}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p2

    .line 932
    new-instance p6, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$MUOFxD34LlOuA6zaSCmohsz1Dfo;

    invoke-direct {p6, p0, p1, p4, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$MUOFxD34LlOuA6zaSCmohsz1Dfo;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;F)V

    invoke-virtual {p2, p6}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p2

    .line 933
    new-instance p6, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$4k-J07mOehPm67xw982AgmhVQXA;

    invoke-direct {p6, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$4k-J07mOehPm67xw982AgmhVQXA;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;)V

    invoke-virtual {p2, p6}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p2

    .line 937
    new-instance p6, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$rDJyb84-tJlEw8581FKwLh6FIoQ;

    invoke-direct {p6, p0, p1, p4, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$rDJyb84-tJlEw8581FKwLh6FIoQ;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;F)V

    invoke-virtual {p2, p6}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p2

    .line 938
    new-instance p6, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$grcit7KB73xn1eDjZ7qiCojwbaE;

    invoke-direct {p6, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$grcit7KB73xn1eDjZ7qiCojwbaE;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;)V

    invoke-virtual {p2, p6}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p2

    .line 940
    new-instance p6, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$A_PIUTfLbJXfPD8TjGH6Y3YtCNc;

    move-object v0, p6

    move-object v1, p0

    move-object v2, p5

    move-object v3, p1

    move-object v4, p4

    move v5, p3

    invoke-direct/range {v0 .. v5}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$A_PIUTfLbJXfPD8TjGH6Y3YtCNc;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;F)V

    invoke-virtual {p2, p6}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p2

    .line 941
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$OkmWFqkLkRuO2Yc-IgOM554gnas;

    invoke-direct {p5, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$OkmWFqkLkRuO2Yc-IgOM554gnas;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;)V

    invoke-virtual {p2, p5}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p2

    .line 943
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$TvB94u9fTBHESzaiROB3x6Zz7Do;

    invoke-direct {p5, p0, p1, p4, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$TvB94u9fTBHESzaiROB3x6Zz7Do;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;F)V

    invoke-virtual {p2, p5}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p2

    .line 944
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$TBjzraXjwm3pKvLgPvq1MvAI7wQ;

    invoke-direct {p5, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$TBjzraXjwm3pKvLgPvq1MvAI7wQ;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;)V

    invoke-virtual {p2, p5}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p2

    .line 946
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$epL3VNBHxAZumlulvqU_3mzmuCY;

    invoke-direct {p5, p0, p1, p4, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$epL3VNBHxAZumlulvqU_3mzmuCY;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;F)V

    invoke-virtual {p2, p5}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p2

    .line 947
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$ar_GRrTZ0Jl4gBwsJAi_0oiu9rg;

    invoke-direct {p5, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$ar_GRrTZ0Jl4gBwsJAi_0oiu9rg;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;)V

    invoke-virtual {p2, p5}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p2

    .line 949
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$gREWA2ENJ-7FyUrptRW1Jw8g-JY;

    invoke-direct {p5, p0, p1, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$gREWA2ENJ-7FyUrptRW1Jw8g-JY;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;F)V

    invoke-virtual {p2, p5}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p2

    .line 950
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$5Wh7aF975BVglojDvEf-HsWgIE8;

    invoke-direct {p5, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$5Wh7aF975BVglojDvEf-HsWgIE8;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;)V

    invoke-virtual {p2, p5}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p2

    .line 957
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$7p-wM2RQRoV0v5_CSsV-rrWLWDU;

    invoke-direct {p5, p0, p1, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$7p-wM2RQRoV0v5_CSsV-rrWLWDU;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;F)V

    invoke-virtual {p2, p5}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p2

    .line 958
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$pVmXNK5vcejjj6r_NKYUx7C2O7c;

    invoke-direct {p5, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$pVmXNK5vcejjj6r_NKYUx7C2O7c;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;)V

    invoke-virtual {p2, p5}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p2

    .line 969
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$UmbZxjVmtjgrnEaIcWwAhuiyyYs;

    invoke-direct {p5, p0, p1, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$UmbZxjVmtjgrnEaIcWwAhuiyyYs;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;F)V

    invoke-virtual {p2, p5}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p2

    .line 970
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$_bVRZ8H0s0iFD8opbzLJ_qJ-t0U;

    invoke-direct {p5, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$_bVRZ8H0s0iFD8opbzLJ_qJ-t0U;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;)V

    invoke-virtual {p2, p5}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p2

    .line 976
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$s2N_RgVv6FYGokDRdhMpCI5sD4s;

    invoke-direct {p5, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$s2N_RgVv6FYGokDRdhMpCI5sD4s;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;)V

    invoke-virtual {p2, p5}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p2

    .line 977
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$eSKfB-7yVf-DjzSApRPnJ_pHy8w;

    invoke-direct {p5, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$eSKfB-7yVf-DjzSApRPnJ_pHy8w;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;)V

    invoke-virtual {p2, p5}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p2

    .line 978
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$kYjSX6pf23IBBZDdii3KQdJdOag;

    invoke-direct {p5, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$kYjSX6pf23IBBZDdii3KQdJdOag;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;)V

    invoke-virtual {p2, p5}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p2

    .line 984
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$LUNJV8FrME4hTFu5AsdKPToru4w;

    invoke-direct {p5, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$LUNJV8FrME4hTFu5AsdKPToru4w;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;)V

    invoke-virtual {p2, p5}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p2

    .line 985
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$pRSEkcJgnIKZpIbB8CbNow6xqMM;

    invoke-direct {p5, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$pRSEkcJgnIKZpIbB8CbNow6xqMM;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;)V

    invoke-virtual {p2, p5}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p2

    .line 986
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$pzQxr2L5_esGdyWL9pWRDi2fNlA;

    invoke-direct {p5, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$pzQxr2L5_esGdyWL9pWRDi2fNlA;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;)V

    invoke-virtual {p2, p5}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p2

    .line 992
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$Z3cqzrPQJe-F5msCbhCj8xwgFgw;

    invoke-direct {p5, p0, p1, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$Z3cqzrPQJe-F5msCbhCj8xwgFgw;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;F)V

    invoke-virtual {p2, p5}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p2

    .line 993
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$aav9nQkN2v15v7xtNQiuf44HiM0;

    invoke-direct {p5, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$aav9nQkN2v15v7xtNQiuf44HiM0;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;)V

    invoke-virtual {p2, p5}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p2

    .line 995
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$QzOdZy2m6Dqv1UuN6_nAdW-ohY4;

    invoke-direct {p5, p0, p1, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$QzOdZy2m6Dqv1UuN6_nAdW-ohY4;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;F)V

    invoke-virtual {p2, p5}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p2

    .line 996
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$7EHOvgDezo0C9Hfhr3HU8RfKpq8;

    invoke-direct {p5, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$7EHOvgDezo0C9Hfhr3HU8RfKpq8;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;)V

    invoke-virtual {p2, p5}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p2

    .line 1002
    invoke-virtual {p0, p1, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;->handleSyncError(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/functions/Function;

    move-result-object p4

    invoke-virtual {p2, p4}, Lio/reactivex/Observable;->onErrorResumeNext(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p2

    .line 1003
    new-instance p4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$r3VfhpfvrtKvX4ygWfhe6IOlyks;

    invoke-direct {p4, p0, p1, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$r3VfhpfvrtKvX4ygWfhe6IOlyks;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;F)V

    invoke-virtual {p2, p4}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    .line 1004
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$YDGrDCreyoaLif2ap4m-gdPbTN0;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$YDGrDCreyoaLif2ap4m-gdPbTN0;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p1

    .line 1005
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$AK-fdQaq2_7sg5ixt5DEEdl0yzc;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$AK-fdQaq2_7sg5ixt5DEEdl0yzc;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p1

    .line 1017
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$RzaEwswSdh9ZerxLeaK_EhgtjjM;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$RzaEwswSdh9ZerxLeaK_EhgtjjM;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    .line 1018
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$aIGTHxyvAzm0a5hrpkpejPtRqvw;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$aIGTHxyvAzm0a5hrpkpejPtRqvw;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->doOnError(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final transferData$lambda-42$lambda-1(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)V
    .locals 2

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 916
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p1, "Gen2DeviceInfoCommand finished successfully."

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final transferData$lambda-42$lambda-10(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 2

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 938
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p1, "Gen2GetUserAndGoalsCommand finished successfully."

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final transferData$lambda-42$lambda-11(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
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

    const-string v2, "$dataInfoWrapper"

    move-object/from16 v6, p3

    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "it"

    move-object/from16 v3, p5

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 940
    move-object v3, v0

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendUserPrefsAndGoalsCommandVer3;

    invoke-direct {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendUserPrefsAndGoalsCommandVer3;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;)V

    move-object v4, v0

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    const v0, 0x3d4ccccd    # 0.05f

    mul-float v8, p4, v0

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

.method private static final transferData$lambda-42$lambda-12(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 2

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 941
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p1, "Gen2SendUserPrefsAndGoalsCommand finished successfully."

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final transferData$lambda-42$lambda-13(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 13

    move-object v0, p0

    const-string v1, "this$0"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "$uid"

    move-object v4, p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "$dataInfoWrapper"

    move-object v5, p2

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "it"

    move-object/from16 v2, p4

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 943
    move-object v2, v0

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RTLStatusCommand;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RTLStatusCommand;-><init>()V

    move-object v3, v0

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    const v0, 0x3d4ccccd    # 0.05f

    mul-float v7, p3, v0

    const/4 v6, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/16 v11, 0x68

    const/4 v12, 0x0

    invoke-static/range {v2 .. v12}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendSingleCommandWithAck$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;FJLjava/lang/String;ILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    check-cast v0, Lio/reactivex/ObservableSource;

    return-object v0
.end method

.method private static final transferData$lambda-42$lambda-14(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 2

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 944
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p1, "RTLStatusCommand finished successfully."

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final transferData$lambda-42$lambda-15(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 13

    move-object v0, p0

    const-string v1, "this$0"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "$uid"

    move-object v4, p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "$dataInfoWrapper"

    move-object v5, p2

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "it"

    move-object/from16 v2, p4

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 946
    move-object v2, v0

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RTLTimeCommand;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RTLTimeCommand;-><init>()V

    move-object v3, v0

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    const v0, 0x3d4ccccd    # 0.05f

    mul-float v7, p3, v0

    const/4 v6, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/16 v11, 0x68

    const/4 v12, 0x0

    invoke-static/range {v2 .. v12}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendSingleCommandWithAck$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;FJLjava/lang/String;ILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    check-cast v0, Lio/reactivex/ObservableSource;

    return-object v0
.end method

.method private static final transferData$lambda-42$lambda-16(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 2

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 947
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p1, "RTLTimeCommand finished successfully."

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final transferData$lambda-42$lambda-17(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 12

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 949
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;

    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Ver3ActivityHeaderCommand;

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Ver3ActivityHeaderCommand;-><init>()V

    move-object v2, p0

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    const p0, 0x3d4ccccd    # 0.05f

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

.method private static final transferData$lambda-42$lambda-18(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 4

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 951
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;->logsCountChecker:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/LogsCountChecker;

    const-string v1, "it"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/LogsCountChecker;->checkForHeaderLogs(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Z

    .line 952
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string v1, "Gen2ActivityHeaderCommand finished successfully."

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 953
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;->getTempActivityLog()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2TempActivityInfo;

    move-result-object v0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2TempActivityInfo;->getTempStartLogs()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;->printStartLogs(Ljava/util/List;)V

    .line 954
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;->getTempActivityLog()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2TempActivityInfo;

    move-result-object p1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2TempActivityInfo;->getTempEndLogs()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;->printEndLogs(Ljava/util/List;)V

    return-void
.end method

.method private static final transferData$lambda-42$lambda-19(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 12

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 957
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;

    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Ver3ActivityDeltaCommand;

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Ver3ActivityDeltaCommand;-><init>()V

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

.method private static final transferData$lambda-42$lambda-2(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;
    .locals 13

    move-object v0, p0

    const-string v1, "this$0"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "$uid"

    move-object v4, p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "$dataInfoWrapper"

    move-object v5, p2

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "it"

    move-object/from16 v2, p4

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 917
    move-object v2, v0

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2StartAmDTPCommand;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2StartAmDTPCommand;-><init>()V

    move-object v3, v0

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    const v0, 0x3d4ccccd    # 0.05f

    mul-float v7, p3, v0

    const/4 v6, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/16 v11, 0x68

    const/4 v12, 0x0

    invoke-static/range {v2 .. v12}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendSingleCommandWithAck$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;FJLjava/lang/String;ILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    check-cast v0, Lio/reactivex/ObservableSource;

    return-object v0
.end method

.method private static final transferData$lambda-42$lambda-21(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 4

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 959
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string v1, "Gen2ActivityDeltaLogCommand finished successfully."

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 960
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;->logsCountChecker:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/LogsCountChecker;

    const-string v1, "gen2DataInfo"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/LogsCountChecker;->checkForDeltaLogsCount(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Z

    .line 962
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;->getTempActivityLog()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2TempActivityInfo;

    move-result-object v0

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ActivityLogExtensionsKt;->exportPaired(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2TempActivityInfo;)Ljava/util/List;

    move-result-object v0

    .line 963
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;->getActivityInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo;

    move-result-object v1

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo;->getActivityDataLogs()Ljava/util/List;

    move-result-object v1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 964
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;->getActivityInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo;

    move-result-object p1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo;->getActivityDataLogs()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 1046
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDataLog;

    .line 965
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDataLog;->getDeltaLogs()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;->printActivityDeltaLogs(Ljava/util/List;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private static final transferData$lambda-42$lambda-22(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 12

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 969
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;

    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLogCommand;

    invoke-virtual {p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;->getRtlData()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLogCommand;-><init>(Ljava/util/List;)V

    move-object v2, p0

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    const p0, 0x3e4ccccd    # 0.2f

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

.method private static final transferData$lambda-42$lambda-23(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 971
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;->logsCountChecker:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/LogsCountChecker;

    const-string v1, "it"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/LogsCountChecker;->checkForBackgroundLogsCount(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Z

    .line 972
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p1, "Gen2BackgroundLogCommand finished successfully."

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final transferData$lambda-42$lambda-24(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 2

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 976
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;->getTraceLogger()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TraceLogger;

    move-result-object p0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "---- Header start "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->toCalendar(J)Ljava/util/Calendar;

    move-result-object v0

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->toDateStringDashed(Ljava/util/Calendar;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "----\n"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType$Header;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType$Header;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType;

    invoke-interface {p0, p1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TraceLogger;->log(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType;)V

    return-void
.end method

.method private static final transferData$lambda-42$lambda-25(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 12

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 977
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;

    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2HeaderTraceLogCommand;

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2HeaderTraceLogCommand;-><init>()V

    move-object v2, p0

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    const/4 v5, 0x0

    const/high16 v6, 0x3f800000    # 1.0f

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/16 v10, 0x68

    const/4 v11, 0x0

    move-object v3, p1

    move-object v4, p2

    invoke-static/range {v1 .. v11}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendSingleCommandWithAck$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;FJLjava/lang/String;ILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final transferData$lambda-42$lambda-26(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 2

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 979
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;->getTraceLogger()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TraceLogger;

    move-result-object p1

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType$Header;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType$Header;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType;

    const-string v1, "\n---- Header end ----\n"

    invoke-interface {p1, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TraceLogger;->log(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType;)V

    .line 980
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p1, "Gen2HeaderTraceLogCommand finished successfully."

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final transferData$lambda-42$lambda-27(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 1

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 984
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;->getTraceLogger()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TraceLogger;

    move-result-object p0

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType$Accel;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType$Accel;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType;

    const-string v0, "---- Accel data start ----\n"

    invoke-interface {p0, v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TraceLogger;->log(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType;)V

    return-void
.end method

.method private static final transferData$lambda-42$lambda-28(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 12

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 985
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;

    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AccelDataTraceLogCommand;

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AccelDataTraceLogCommand;-><init>()V

    move-object v2, p0

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    const/4 v5, 0x0

    const/high16 v6, 0x3f800000    # 1.0f

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/16 v10, 0x68

    const/4 v11, 0x0

    move-object v3, p1

    move-object v4, p2

    invoke-static/range {v1 .. v11}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendSingleCommandWithAck$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;FJLjava/lang/String;ILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final transferData$lambda-42$lambda-29(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 2

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 987
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;->getTraceLogger()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TraceLogger;

    move-result-object p1

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType$Accel;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType$Accel;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType;

    const-string v1, "\n---- Accel data end ----\n"

    invoke-interface {p1, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TraceLogger;->log(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType;)V

    .line 988
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p1, "Gen2AccelDataTraceLogCommand finished successfully."

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final transferData$lambda-42$lambda-3(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 2

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 918
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p1, "Gen2StartAmDTPCommand finished successfully."

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final transferData$lambda-42$lambda-30(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 12

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 992
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;

    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CleanAllLogsCommand;

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CleanAllLogsCommand;-><init>()V

    move-object v2, p0

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    const p0, 0x3ccccccd    # 0.025f

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

.method private static final transferData$lambda-42$lambda-31(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 2

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 993
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p1, "Gen2CleanAllLogsCommand finished successfully."

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final transferData$lambda-42$lambda-32(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 12

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 995
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;

    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ErrorLogCommand;

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ErrorLogCommand;-><init>()V

    move-object v2, p0

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    const p0, 0x3ccccccd    # 0.025f

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

.method private static final transferData$lambda-42$lambda-33(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 2

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 996
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p1, "Gen2ErrorLogCommand finished successfully."

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final transferData$lambda-42$lambda-34(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 12

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1003
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;

    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2StopAmDTPCommand;

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2StopAmDTPCommand;-><init>()V

    move-object v2, p0

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    const p0, 0x3d4ccccd    # 0.05f

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

.method private static final transferData$lambda-42$lambda-35(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 2

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1004
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p1, "Gen2StopAmDTPCommand finished successfully."

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final transferData$lambda-42$lambda-39(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 6

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1007
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;->getDataInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object v0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->getActivityLogs()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 1049
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 1050
    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;

    .line 1007
    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->getWalkingSteps()J

    move-result-wide v3

    long-to-int v4, v3

    add-int/2addr v2, v4

    goto :goto_0

    .line 1008
    :cond_0
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;->getDataInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object v0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->getActivityLogs()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 1054
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v3, 0x0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 1055
    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;

    .line 1008
    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->getRunningSteps()J

    move-result-wide v4

    long-to-int v5, v4

    add-int/2addr v3, v5

    goto :goto_1

    .line 1010
    :cond_1
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Total log entries: "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;->getDataInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object v4

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->getActivityLogs()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, " \n Sleep log entries: "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1011
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;->getDataInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object v4

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->getActivityLogs()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    .line 1058
    instance-of v5, v4, Ljava/util/Collection;

    if-eqz v5, :cond_2

    move-object v5, v4

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_3

    .line 1060
    :cond_2
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_3
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;

    .line 1011
    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->isSleep()Z

    move-result v5

    if-eqz v5, :cond_3

    add-int/lit8 v1, v1, 0x1

    if-gez v1, :cond_3

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwCountOverflow()V

    goto :goto_2

    .line 1010
    :cond_4
    :goto_3
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " \n Total steps retrieved: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/2addr v2, v3

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " \n Total number of activities retrieved: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1013
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;->getDataInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object v1

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->getRunningLogs()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    .line 1010
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\nRTL timestamps: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1014
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;->getRtlData()Ljava/util/List;

    move-result-object p1

    .line 1010
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p0, p1, v1, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final transferData$lambda-42$lambda-40(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "gen2DataInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1017
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;->reformatDataLogs(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;->getDataInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object p0

    return-object p0
.end method

.method private static final transferData$lambda-42$lambda-41(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1019
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;->TAG:Ljava/lang/String;

    const-string v0, "Sync failed. Reason: "

    invoke-static {p0, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void
.end method

.method private static final transferData$lambda-42$lambda-6(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$dataInfoWrapper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 921
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;->getLocationInfoProvider()Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;

    move-result-object p4

    invoke-interface {p4}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;->getLastStoredLocation()Lio/reactivex/Single;

    move-result-object p4

    invoke-virtual {p4}, Lio/reactivex/Single;->toObservable()Lio/reactivex/Observable;

    move-result-object p4

    .line 922
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$k9iEZhAlOfvvDJSBQVKxjQ47Kcw;

    invoke-direct {v0, p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$k9iEZhAlOfvvDJSBQVKxjQ47Kcw;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;F)V

    invoke-virtual {p4, v0}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    .line 927
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$onhTefiQKGO5kIh8qPUTnOM7SX4;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$onhTefiQKGO5kIh8qPUTnOM7SX4;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final transferData$lambda-42$lambda-6$lambda-4(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;FLkotlin/Pair;)Lio/reactivex/ObservableSource;
    .locals 13

    move-object v0, p0

    const-string v1, "this$0"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "$uid"

    move-object v4, p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "$dataInfoWrapper"

    move-object v5, p2

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "it"

    move-object/from16 v2, p4

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 923
    invoke-virtual/range {p4 .. p4}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;->getLocationInfoProvider()Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;

    move-result-object v1

    invoke-virtual/range {p4 .. p4}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;

    invoke-interface {v1, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;->isLocationValid(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 924
    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendUserLocationCommand;

    invoke-virtual/range {p4 .. p4}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-direct {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendUserLocationCommand;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;)V

    move-object v3, v1

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    const/4 v6, 0x0

    const v1, 0x3d4ccccd    # 0.05f

    mul-float v7, p3, v1

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/16 v11, 0x68

    const/4 v12, 0x0

    move-object v2, v0

    move-object v4, p1

    move-object v5, p2

    invoke-static/range {v2 .. v12}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendSingleCommandWithAck$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;FJLjava/lang/String;ILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    goto :goto_0

    .line 925
    :cond_0
    invoke-static/range {p4 .. p4}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "just(it)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    check-cast v0, Lio/reactivex/ObservableSource;

    return-object v0
.end method

.method private static final transferData$lambda-42$lambda-6$lambda-5(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/Object;)V
    .locals 2

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 927
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p1, "Gen2StartAmDTPCommand finished successfully."

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final transferData$lambda-42$lambda-7(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;FLjava/lang/Object;)Lio/reactivex/ObservableSource;
    .locals 13

    move-object v0, p0

    const-string v1, "this$0"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "$uid"

    move-object v4, p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "$dataInfoWrapper"

    move-object v5, p2

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "it"

    move-object/from16 v2, p4

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 932
    move-object v2, v0

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Ver3GetLogCountCommand;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Ver3GetLogCountCommand;-><init>()V

    move-object v3, v0

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    const v0, 0x3d4ccccd    # 0.05f

    mul-float v7, p3, v0

    const/4 v6, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/16 v11, 0x68

    const/4 v12, 0x0

    invoke-static/range {v2 .. v12}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendSingleCommandWithAck$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;FJLjava/lang/String;ILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    check-cast v0, Lio/reactivex/ObservableSource;

    return-object v0
.end method

.method private static final transferData$lambda-42$lambda-8(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 934
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;->getGen2LogsCount()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2LogsCount;

    move-result-object p1

    const-string v0, "Gen2Ver3GetLogCountCommand finished successfully.\n "

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final transferData$lambda-42$lambda-9(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 13

    move-object v0, p0

    const-string v1, "this$0"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "$uid"

    move-object v4, p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "$dataInfoWrapper"

    move-object v5, p2

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "it"

    move-object/from16 v2, p4

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 937
    move-object v2, v0

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2GetUserAndGoalsCommandVer3;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2GetUserAndGoalsCommandVer3;-><init>()V

    move-object v3, v0

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    const v0, 0x3d4ccccd    # 0.05f

    mul-float v7, p3, v0

    const/4 v6, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/16 v11, 0x68

    const/4 v12, 0x0

    invoke-static/range {v2 .. v12}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendSingleCommandWithAck$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;FJLjava/lang/String;ILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    check-cast v0, Lio/reactivex/ObservableSource;

    return-object v0
.end method


# virtual methods
.method public final getLocationInfoProvider()Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;
    .locals 1

    .line 899
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;->locationInfoProvider:Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;

    return-object v0
.end method

.method public transferData(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;F)Lio/reactivex/Observable;
    .locals 10
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

    .line 907
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0x37

    const/4 v9, 0x0

    move-object v1, v0

    move-object v5, p3

    invoke-direct/range {v1 .. v9}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;-><init>(Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2TempActivityInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2LogsCount;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 909
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$iPz8LOThkstNfprVoXx6_QyCQUA;

    invoke-direct {v1, p0, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$iPz8LOThkstNfprVoXx6_QyCQUA;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)V

    invoke-static {v1}, Lio/reactivex/Observable;->create(Lio/reactivex/ObservableOnSubscribe;)Lio/reactivex/Observable;

    move-result-object v8

    .line 914
    new-instance v9, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$p3ifsTyYtTY5krgbjZv-34eipt4;

    move-object v1, v9

    move-object v2, p0

    move-object v3, p1

    move-object v4, p3

    move v5, p4

    move-object v6, v0

    move-object v7, p2

    invoke-direct/range {v1 .. v7}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$p3ifsTyYtTY5krgbjZv-34eipt4;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;)V

    invoke-virtual {v8, v9}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "create<DataInfo> {\n            syncProgressChannel.tempPowersConfig = syncConfigPowers2Ver3\n            syncProgressChannel.reset()\n            it.onNext(dataInfo)\n            it.onComplete()\n        }.flatMap {\n            sendAndWait(uid, Gen2DeviceInfoCommand(), dataInfo = dataInfo, power = 0.05F * power)\n                    .doOnNext { debug(\"Gen2DeviceInfoCommand finished successfully.\") }\n                    .flatMap { sendSingleCommandWithAck(Gen2StartAmDTPCommand(), uid, dataInfoWrapper, power = 0.05F * power) }\n                    .doOnNext { debug(\"Gen2StartAmDTPCommand finished successfully.\") }\n\n                    .flatMap {\n                        locationInfoProvider.getLastStoredLocation().toObservable()\n                                .flatMap {\n                                    if (it.first && locationInfoProvider.isLocationValid(it.second))\n                                        sendSingleCommandWithAck(Gen2SendUserLocationCommand(it.second!!), uid, dataInfoWrapper, power = 0.05F * power)\n                                    else Observable.just(it)\n                                }\n                                .doOnNext { debug(\"Gen2StartAmDTPCommand finished successfully.\") }\n\n                    }\n\n\n                    .flatMap { sendSingleCommandWithAck(Gen2Ver3GetLogCountCommand(), uid, dataInfoWrapper, power = 0.05F * power) }\n                    .doOnNext {\n                        debug(\"Gen2Ver3GetLogCountCommand finished successfully.\\n ${it.gen2LogsCount}\")\n                    }\n\n                    .flatMap { sendSingleCommandWithAck(Gen2GetUserAndGoalsCommandVer3(), uid, dataInfoWrapper, power = 0.05F * power) }\n                    .doOnNext { debug(\"Gen2GetUserAndGoalsCommand finished successfully.\") }\n\n                    .flatMap { sendSingleCommandWithAck(Gen2SendUserPrefsAndGoalsCommandVer3(pairingConfig), uid, dataInfoWrapper, power = 0.05F * power) }\n                    .doOnNext { debug(\"Gen2SendUserPrefsAndGoalsCommand finished successfully.\") }\n\n                    .flatMap { sendSingleCommandWithAck(RTLStatusCommand(), uid, dataInfoWrapper, power = 0.05F * power) }\n                    .doOnNext { debug(\"RTLStatusCommand finished successfully.\") }\n\n                    .flatMap { sendSingleCommandWithAck(RTLTimeCommand(), uid, dataInfoWrapper, power = 0.05F * power) }\n                    .doOnNext { debug(\"RTLTimeCommand finished successfully.\") }\n\n                    .flatMap { sendSingleCommandWithAck(Gen2Ver3ActivityHeaderCommand(), uid, it, power = 0.05F * power) }\n                    .doOnNext {\n                        logsCountChecker.checkForHeaderLogs(it)\n                        debug(\"Gen2ActivityHeaderCommand finished successfully.\")\n                        printStartLogs(it.tempActivityLog.tempStartLogs)\n                        printEndLogs(it.tempActivityLog.tempEndLogs)\n                    }\n\n                    .flatMap { sendSingleCommandWithAck(Gen2Ver3ActivityDeltaCommand(), uid, it, power = 0.3F * power) }\n                    .doOnNext { gen2DataInfo ->\n                        debug(\"Gen2ActivityDeltaLogCommand finished successfully.\")\n                        logsCountChecker.checkForDeltaLogsCount(gen2DataInfo)\n\n                        val list = gen2DataInfo.tempActivityLog.exportPaired()\n                        gen2DataInfo.activityInfo.activityDataLogs.addAll(list)\n                        gen2DataInfo.activityInfo.activityDataLogs.forEach {\n                            printActivityDeltaLogs(it.deltaLogs)\n                        }\n                    }\n\n                    .flatMap { sendSingleCommandWithAck(Gen2BackgroundLogCommand(it.rtlData), uid, it, power = 0.2F * power) }\n                    .doOnNext {\n                        logsCountChecker.checkForBackgroundLogsCount(it)\n                        debug(\"Gen2BackgroundLogCommand finished successfully.\")\n                    }\n\n\n                    .doOnNext { traceLogger.log(\"---- Header start ${System.currentTimeMillis().toCalendar().toDateStringDashed()}----\\n\", LogDataType.Header) }\n                    .flatMap { sendSingleCommandWithAck(Gen2HeaderTraceLogCommand(), uid, it, power = 1f) }\n                    .doOnNext {\n                        traceLogger.log(\"\\n---- Header end ----\\n\", LogDataType.Header)\n                        debug(\"Gen2HeaderTraceLogCommand finished successfully.\")\n                    }\n\n\n                    .doOnNext { traceLogger.log(\"---- Accel data start ----\\n\", LogDataType.Accel) }\n                    .flatMap { sendSingleCommandWithAck(Gen2AccelDataTraceLogCommand(), uid, it, power = 1f) }\n                    .doOnNext {\n                        traceLogger.log(\"\\n---- Accel data end ----\\n\", LogDataType.Accel)\n                        debug(\"Gen2AccelDataTraceLogCommand finished successfully.\")\n                    }\n\n\n                    .flatMap { sendSingleCommandWithAck(Gen2CleanAllLogsCommand(), uid, it, power = 0.025F * power) }\n                    .doOnNext { debug(\"Gen2CleanAllLogsCommand finished successfully.\") }\n\n                    .flatMap { sendSingleCommandWithAck(Gen2ErrorLogCommand(), uid, it, power = 0.025F * power) }\n                    .doOnNext { debug(\"Gen2ErrorLogCommand finished successfully.\") }\n\n\n                    //TODO sleep log command\n                    // if any error has occurred, send sync end command\n                    // output of this operator should be only ERROR\n                    .onErrorResumeNext(handleSyncError(uid, dataInfoWrapper))\n                    .flatMap { sendSingleCommandWithAck(Gen2StopAmDTPCommand(), uid, it, power = 0.05F * power) }\n                    .doOnNext { debug(\"Gen2StopAmDTPCommand finished successfully.\") }\n                    .doOnNext {\n\n                        val totalSteps = it.dataInfo.activityLogs.sumBy { it.walkingSteps.toInt() }\n                        val totalRunningSteps = it.dataInfo.activityLogs.sumBy { it.runningSteps.toInt() }\n\n                        debug(\"Total log entries: ${it.dataInfo.activityLogs.size} \\n \" +\n                                \"Sleep log entries: ${it.dataInfo.activityLogs.count { it.isSleep }} \\n \" +\n                                \"Total steps retrieved: ${totalSteps + totalRunningSteps} \\n \" +\n                                \"Total number of activities retrieved: ${it.dataInfo.runningLogs.size}\\n\" +\n                                \"RTL timestamps: ${it.rtlData}\"\n                        )\n                    }\n                    .map { gen2DataInfo -> reformatDataLogs(gen2DataInfo).dataInfo }\n                    .doOnError {\n                        Log.e(TAG, \"Sync failed. Reason: \", it)\n                    }\n        }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
