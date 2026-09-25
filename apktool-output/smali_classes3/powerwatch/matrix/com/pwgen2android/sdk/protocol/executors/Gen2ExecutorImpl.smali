.class public Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;
.super Ljava/lang/Object;
.source "Gen2Executor.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Executor;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGen2Executor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Gen2Executor.kt\npowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl\n+ 2 KoinComponent.kt\norg/koin/core/KoinComponentKt\n+ 3 Koin.kt\norg/koin/core/Koin\n+ 4 Scope.kt\norg/koin/core/scope/Scope\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1045:1\n52#2,4:1046\n52#2,4:1052\n52#3:1050\n52#3:1056\n55#4:1051\n55#4:1057\n1720#5,3:1058\n1849#5:1061\n1849#5,2:1062\n1850#5:1064\n1849#5:1065\n1783#5,3:1066\n1850#5:1069\n1849#5,2:1070\n1849#5,2:1072\n1849#5,2:1074\n2820#5,5:1076\n2820#5,5:1081\n1768#5,4:1086\n*S KotlinDebug\n*F\n+ 1 Gen2Executor.kt\npowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl\n*L\n64#1:1046,4\n329#1:1052,4\n64#1:1050\n329#1:1056\n64#1:1051\n329#1:1057\n171#1:1058,3\n333#1:1061\n385#1:1062,2\n333#1:1064\n533#1:1065\n534#1:1066,3\n533#1:1069\n544#1:1070,2\n550#1:1072,2\n490#1:1074,2\n512#1:1076,5\n513#1:1081,5\n516#1:1086,4\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J*\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001a0\u00190\u00172\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001aH\u0004J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\nH\u0002J\u000e\u0010 \u001a\u0008\u0012\u0004\u0012\u00020!0\u0019H\u0016J\u0016\u0010\"\u001a\u00020#2\u000c\u0010$\u001a\u0008\u0012\u0004\u0012\u00020&0%H\u0004J\u0016\u0010\'\u001a\u00020#2\u000c\u0010(\u001a\u0008\u0012\u0004\u0012\u00020)0%H\u0004J\u0016\u0010*\u001a\u00020#2\u000c\u0010+\u001a\u0008\u0012\u0004\u0012\u00020,0%H\u0004J\u001e\u0010-\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u00192\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u0007H\u0002J\u001e\u00101\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00192\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u0007H\u0002J\u001e\u00102\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00192\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u0007H\u0002J6\u00103\u001a\u0008\u0012\u0004\u0012\u0002040\u00192\u0006\u00105\u001a\u0002062\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u001a2\u0006\u00108\u001a\u00020/2\u0006\u00100\u001a\u00020\u0007H\u0002J\u0010\u00109\u001a\u00020\u001a2\u0006\u0010:\u001a\u00020\u001aH\u0004J.\u0010;\u001a\u0008\u0012\u0004\u0012\u00020<0\u00192\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u00105\u001a\u00020=2\u0006\u00107\u001a\u00020<2\u0006\u0010>\u001a\u00020?H\u0016J6\u0010@\u001a\u0008\u0012\u0004\u0012\u00020<0\u00192\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u00105\u001a\u00020=2\u0006\u00107\u001a\u00020<2\u0006\u0010>\u001a\u00020?2\u0006\u0010A\u001a\u00020!H\u0016J.\u0010B\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00192\u0006\u00105\u001a\u00020=2\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u00108\u001a\u00020/2\u0006\u00100\u001a\u00020\u0007H\u0002JL\u0010C\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u00105\u001a\u0002062\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u001a2\u0008\u0008\u0002\u00108\u001a\u00020/2\u0006\u0010>\u001a\u00020?2\u0008\u0008\u0002\u0010A\u001a\u00020D2\u0008\u0008\u0002\u00100\u001a\u00020\u0007H\u0004J8\u0010E\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u00192\u0006\u00105\u001a\u00020=2\u0006\u0010\u001b\u001a\u00020\u00072\u0008\u0008\u0002\u00108\u001a\u00020/2\u0006\u0010A\u001a\u00020D2\u0006\u00100\u001a\u00020\u0007H\u0002J.\u0010F\u001a\u0008\u0012\u0004\u0012\u00020<0\u00192\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010G\u001a\u00020H2\u0006\u00107\u001a\u00020<2\u0006\u0010>\u001a\u00020?H\u0016J4\u0010I\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020!\u0012\u0006\u0012\u0004\u0018\u00010<0J0\u00192\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010G\u001a\u00020H2\u0006\u0010K\u001a\u00020?H\u0016J0\u0010L\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00192\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010M\u001a\u00020\u001e2\u0006\u00100\u001a\u00020\u00072\u0008\u0008\u0002\u00108\u001a\u00020/H\u0002R\u0016\u0010\u0006\u001a\n \u0008*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\u000c8DX\u0084\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128DX\u0084\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0010\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006N"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Executor;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "communicator",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;)V",
        "TAG",
        "",
        "kotlin.jvm.PlatformType",
        "newControlAckMark",
        "",
        "syncProgressChannel",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannel;",
        "getSyncProgressChannel",
        "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannel;",
        "syncProgressChannel$delegate",
        "Lkotlin/Lazy;",
        "traceLogger",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TraceLogger;",
        "getTraceLogger",
        "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TraceLogger;",
        "traceLogger$delegate",
        "handleSyncError",
        "Lio/reactivex/functions/Function;",
        "",
        "Lio/reactivex/Observable;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;",
        "uid",
        "dataInfoWrapper",
        "isAckControlMark",
        "",
        "data",
        "observeProgress",
        "",
        "printActivityDeltaLogs",
        "",
        "deltaLogs",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;",
        "printEndLogs",
        "tempEndLogs",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityEndLog;",
        "printStartLogs",
        "tempStartLogs",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLog;",
        "readAckResponse",
        "filterProtocolType",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;",
        "logTag",
        "readCommandResponse",
        "readResendControlPackage",
        "readWithAck",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;",
        "command",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;",
        "dataInfo",
        "protocolType",
        "reformatDataLogs",
        "dataInfoParam",
        "send",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;",
        "power",
        "",
        "sendAndWait",
        "timeout",
        "sendCommandRequest",
        "sendSingleCommandWithAck",
        "",
        "sendWithAck",
        "transferData",
        "pairingConfig",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;",
        "transferDataWithProgress",
        "Lkotlin/Pair;",
        "phasePower",
        "writeAck",
        "validCRC",
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

.field private final communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

.field private final newControlAckMark:[B

.field private final syncProgressChannel$delegate:Lkotlin/Lazy;

.field private final traceLogger$delegate:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;)V
    .locals 4

    const-string v0, "communicator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    const-string p1, "06000030"

    .line 59
    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorKt;->mapToBytes(Ljava/lang/String;)[B

    move-result-object p1

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->newControlAckMark:[B

    .line 63
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->TAG:Ljava/lang/String;

    .line 64
    move-object p1, p0

    check-cast p1, Lorg/koin/core/KoinComponent;

    const/4 v0, 0x0

    .line 1046
    move-object v1, v0

    check-cast v1, Lorg/koin/core/qualifier/Qualifier;

    .line 1047
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 1049
    invoke-interface {p1}, Lorg/koin/core/KoinComponent;->getKoin()Lorg/koin/core/Koin;

    move-result-object v2

    .line 1050
    invoke-virtual {v2}, Lorg/koin/core/Koin;->getRootScope()Lorg/koin/core/scope/Scope;

    move-result-object v2

    .line 1051
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl$special$$inlined$inject$default$1;

    invoke-direct {v3, v2, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl$special$$inlined$inject$default$1;-><init>(Lorg/koin/core/scope/Scope;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {v3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v2

    .line 64
    iput-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->syncProgressChannel$delegate:Lkotlin/Lazy;

    .line 1055
    invoke-interface {p1}, Lorg/koin/core/KoinComponent;->getKoin()Lorg/koin/core/Koin;

    move-result-object p1

    .line 1056
    invoke-virtual {p1}, Lorg/koin/core/Koin;->getRootScope()Lorg/koin/core/scope/Scope;

    move-result-object p1

    .line 1057
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl$special$$inlined$inject$default$2;

    invoke-direct {v2, p1, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl$special$$inlined$inject$default$2;-><init>(Lorg/koin/core/scope/Scope;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)V

    check-cast v2, Lkotlin/jvm/functions/Function0;

    invoke-static {v2}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    .line 329
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->traceLogger$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private static final handleSyncError$lambda-55(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;Ljava/lang/Throwable;)Lio/reactivex/Observable;
    .locals 12

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$dataInfoWrapper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "error"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 419
    instance-of v0, p3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolError$WatchBusy;

    if-nez v0, :cond_1

    .line 420
    instance-of v0, p3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolError$SyncLocked;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 424
    :cond_0
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    const-string v2, "Sync error occurred, will catch it and send Gen2StopAmDTPCommand. Error is: "

    move-object v3, p3

    invoke-static/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->error$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 426
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2StopAmDTPCommand;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2StopAmDTPCommand;-><init>()V

    move-object v2, v0

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    const/4 v5, 0x0

    const v6, 0x3d4ccccd    # 0.05f

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/16 v10, 0x68

    const/4 v11, 0x0

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    invoke-static/range {v1 .. v11}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendSingleCommandWithAck$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;FJLjava/lang/String;ILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p1

    .line 427
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$t4_RmZubQAr-hg7uC7CA3eZ01o8;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$t4_RmZubQAr-hg7uC7CA3eZ01o8;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p1

    .line 430
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$JaMwLqHKEx8a3gYG-UWqXe975HQ;

    invoke-direct {p2, p0, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$JaMwLqHKEx8a3gYG-UWqXe975HQ;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/Throwable;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->doOnError(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p0

    .line 434
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$VblIcl8lfCN7rm52FOhy1VT6jvI;

    invoke-direct {p1, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$VblIcl8lfCN7rm52FOhy1VT6jvI;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {p0, p1}, Lio/reactivex/Observable;->onErrorResumeNext(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p0

    .line 438
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$oN0WJGUDIe4OK1ubeXJrBwTErxU;

    invoke-direct {p1, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$oN0WJGUDIe4OK1ubeXJrBwTErxU;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {p0, p1}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0

    .line 421
    :cond_1
    :goto_0
    invoke-static {p3}, Lio/reactivex/Observable;->error(Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method private static final handleSyncError$lambda-55$lambda-51(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 2

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 428
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p1, "Gen2StopAmDTPCommand after sync error sent successfully."

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final handleSyncError$lambda-55$lambda-52(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    .locals 6

    const-string p2, "this$0"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "$error"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 431
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string v1, "Gen2StopAmDTPCommand after sync error failed to send. Reason: "

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v2, p1

    invoke-static/range {v0 .. v5}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->error$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final handleSyncError$lambda-55$lambda-53(Ljava/lang/Throwable;Ljava/lang/Throwable;)Lio/reactivex/Observable;
    .locals 1

    const-string v0, "$error"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 435
    invoke-static {p0}, Lio/reactivex/Observable;->error(Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method private static final handleSyncError$lambda-55$lambda-54(Ljava/lang/Throwable;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 1

    const-string v0, "$error"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 439
    invoke-static {p0}, Lio/reactivex/Observable;->error(Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private final isAckControlMark([B)Z
    .locals 4

    .line 170
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->newControlAckMark:[B

    invoke-static {p1, v0}, Lkotlin/collections/ArraysKt;->zip([B[B)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 1058
    instance-of v0, p1, Ljava/util/Collection;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v1, 0x1

    goto :goto_1

    .line 1059
    :cond_1
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/Pair;

    .line 171
    invoke-virtual {v0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->byteValue()B

    move-result v3

    invoke-virtual {v0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->byteValue()B

    move-result v0

    if-ne v3, v0, :cond_3

    const/4 v0, 0x1

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    :goto_1
    return v1
.end method

.method public static synthetic lambda$-VWuVqBMeS4cJuY9hzT_pCbJeDI(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->transferData$lambda-104$lambda-76(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$-ds87dPOb1pd0s8qWLOMxL74oDs(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendAndWait$lambda-7(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)V

    return-void
.end method

.method public static synthetic lambda$28VFAYYnYi-awc98EPY5ahTAG98(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->transferData$lambda-104$lambda-80(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$2L8VKrVD1y8nhLWuWsl-sHQGEWo(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;[B)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendAndWait$lambda-6(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;[B)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$3guA9zPoejLggDJMH0kkjTV9nJs(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->transferData$lambda-104$lambda-64(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$3ppR7K9douhczM_zjS65eBykn0A(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->transferData$lambda-104$lambda-86(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$3ye_sad_74UtoeQzKfrOHrrdgvA(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->transferData$lambda-104$lambda-82(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$47yF6gDEEbNB95WngaUgF02FyHs(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->transferData$lambda-104$lambda-72(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$5bVnTG_BwIOawtJkFbWhdNhRiLA(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->transferData$lambda-104$lambda-90(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$6IaUZENMY_yVcsRtDm7X8JpL0rE([B)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->readAckResponse$lambda-12([B)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$6X5TtDPIM3m6MnMagS2HUBjWTBU(Lio/reactivex/Observable;[B)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->readWithAck$lambda-35$lambda-33$lambda-32(Lio/reactivex/Observable;[B)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$7Teum4orS9WmOxD3gbwxoDjLhTQ(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->transferData$lambda-104$lambda-81(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V

    return-void
.end method

.method public static synthetic lambda$8aB-WqMEj3rXJivPsoXTLLclC7A(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->transferDataWithProgress$lambda-113(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$9XCpy6rzatfh1i5uU_eEz_tG5AE(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->transferData$lambda-104$lambda-87(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V

    return-void
.end method

.method public static synthetic lambda$A16FEfbF87kYyAJwP6vW-PVyNSg(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->transferData$lambda-104$lambda-85(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V

    return-void
.end method

.method public static synthetic lambda$A6N5byYuEGu15SyOwQMNOVtDd14(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->transferData$lambda-104$lambda-91(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V

    return-void
.end method

.method public static synthetic lambda$ABO9A9u_fbOoSX46mcW8zkhpR0g(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->transferData$lambda-104$lambda-93(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V

    return-void
.end method

.method public static synthetic lambda$AD2fKnYgxLHGYoiTbcGs41GKbUY(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)[B
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->readAckResponse$lambda-9(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)[B

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$CCQF_iAIdZ2zTYCrKnQ7YsfwXZA(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static/range {p0 .. p6}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->transferData$lambda-104(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$CSqEEB0zUyuew30uLDIXnsVaTxE(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;Lio/reactivex/ObservableEmitter;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->transferData$lambda-56(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;Lio/reactivex/ObservableEmitter;)V

    return-void
.end method

.method public static synthetic lambda$CfQJT07_0gKAO9OejHY-jLyzH9I(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendSingleCommandWithAck$lambda-39(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;)V

    return-void
.end method

.method public static synthetic lambda$CxWoBGFl8_mBrXeqn7bHCXVJJy0(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->transferData$lambda-104$lambda-60(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$DoRoYkHBgvejrehs9eU7DTMxVk4(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Z
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->readCommandResponse$lambda-21(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$DrWIoGvTqm0_3nbTcbAcsqSrG90(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;Ljava/lang/String;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendCommandRequest$lambda-18(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;Ljava/lang/String;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$E5RBN5uUruQF9S5nxhppoNFkWN4(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->transferData$lambda-104$lambda-59(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V

    return-void
.end method

.method public static synthetic lambda$EE9FEAr3w8aBeXEvCW8ZX2YLbhA(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->transferData$lambda-104$lambda-74(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$EiHp-qmrGCzte2xOqVCru1RzTzw(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;[B)Z
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->readResendControlPackage$lambda-27(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;[B)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$EoSKZqBGZlomcnzFK-F6-__Tzls(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->transferData$lambda-104$lambda-89(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V

    return-void
.end method

.method public static synthetic lambda$Es6m8tbx538feM_Pj86Z2nIngr8(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->transferData$lambda-104$lambda-83(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V

    return-void
.end method

.method public static synthetic lambda$GIgplP9OhCDnCtBmLaJySokg_D8(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->transferData$lambda-104$lambda-69(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V

    return-void
.end method

.method public static synthetic lambda$Houk29CWgJyzuIjLQhQveJLjO9E(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;)Z
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendSingleCommandWithAck$lambda-41(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$IhXk_AAetIhn9bWS3aTNnE0WfJI(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->transferData$lambda-104$lambda-95(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V

    return-void
.end method

.method public static synthetic lambda$JQcHQdBU7Y3bCGqqQuUBqXrF9Fs(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->transferData$lambda-104$lambda-78(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$JaMwLqHKEx8a3gYG-UWqXe975HQ(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->handleSyncError$lambda-55$lambda-52(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$KqHm__ri3LTUId9o_87bPaAva9E(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;[B)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->readCommandResponse$lambda-24(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;[B)V

    return-void
.end method

.method public static synthetic lambda$L-z7af9BgqT4JNUBw46RSY6CGOY(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendSingleCommandWithAck$lambda-40(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$N3aJW2wyHiqMjffuQjT1upCppxc(Ljava/lang/Float;)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->observeProgress$lambda-109(Ljava/lang/Float;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$No5KVt1J99dvM2nCY3ZFWM3nqhk(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->transferData$lambda-104$lambda-67(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V

    return-void
.end method

.method public static synthetic lambda$O2ggxXYJWBN4EPjh7qqLiLC-u8U(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;Ljava/lang/Throwable;)Lio/reactivex/Observable;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->handleSyncError$lambda-55(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$OKb9S_LXBoncc4yT5o1s-abmXi4(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->transferData$lambda-104$lambda-79(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V

    return-void
.end method

.method public static synthetic lambda$QHmn3FEgQerd1FGfC0HGCsdXomA(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;)Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendCommandRequest$lambda-18$lambda-14(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;)Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$QmjWvLKXFZFLIPHpJA9Jw5EoVjc(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;[B)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendCommandRequest$lambda-18$lambda-17$lambda-16(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;[B)V

    return-void
.end method

.method public static synthetic lambda$R_uYYtctyFT8NCJSKp1OWktENzQ([B)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendSingleCommandWithAck$lambda-44([B)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$S03QZexCCQ_dsa_q8KPmTaWhhuA(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->transferDataWithProgress$lambda-112(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)V

    return-void
.end method

.method public static synthetic lambda$S8YJpR7Fxu6W9r6swxs0rk3__28(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->transferData$lambda-104$lambda-73(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V

    return-void
.end method

.method public static synthetic lambda$SWlw1yVHMWEuTDbqT2_W9rKu6Qs(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendSingleCommandWithAck$lambda-42(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;)V

    return-void
.end method

.method public static synthetic lambda$TeoDVbahsZeCXkaKIaorYNqArMM(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->transferData$lambda-104$lambda-77(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V

    return-void
.end method

.method public static synthetic lambda$V2ys7EdML3m1SGVaN2fA4MlLBpc(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->transferData$lambda-104$lambda-101(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V

    return-void
.end method

.method public static synthetic lambda$V4x2Pe9B8zA8v6L3OHzPXpH0zVQ(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/Integer;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->observeProgress$lambda-110(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/Integer;)V

    return-void
.end method

.method public static synthetic lambda$VGIPBsOu_62AqosxWhQahSGz2d8(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendAndWait$lambda-3(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)V

    return-void
.end method

.method public static synthetic lambda$VblIcl8lfCN7rm52FOhy1VT6jvI(Ljava/lang/Throwable;Ljava/lang/Throwable;)Lio/reactivex/Observable;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->handleSyncError$lambda-55$lambda-53(Ljava/lang/Throwable;Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$W-buHRHUsNOLLcrqJVZ0ofJXjf4(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;[B)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->readResendControlPackage$lambda-28(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;[B)V

    return-void
.end method

.method public static synthetic lambda$WHqkg-jhtaTd9nM5df6ltJMDx3k(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;[B)Z
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->readCommandResponse$lambda-23(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;[B)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$XKur28JZitOmIa5mcEMS_toCXcc(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->transferData$lambda-104$lambda-63(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V

    return-void
.end method

.method public static synthetic lambda$XfvnlLrEJGC_BlKDEDknWsRbyGc(Ljava/lang/Integer;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->transferDataWithProgress$lambda-111(Ljava/lang/Integer;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$YOMFeIoo4Rmd-okHowyZ_Am_ppM(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->transferData$lambda-104$lambda-66(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$YSmqp2DFyGIuuLav7DSdnm4fWYY(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->transferData$lambda-104$lambda-58(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$YbQMdOjdytbA-6P6MYZRSyLmLvE(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)[B
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->readCommandResponse$lambda-22(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)[B

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$ZDGJWKh-Rl10l2zMedz17gGHWPk(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->transferData$lambda-104$lambda-103(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$Zk-lY7qQUfrdKtOQ7H8gYMpbtxc(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendAndWait$lambda-2(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$Zm4rjmFItzn7DODsUNx-VOXc66w(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;[B)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->readWithAck$lambda-35$lambda-34(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;[B)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$_YpSzJKCAuwqiKPuImaJncMHmXA(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;Ljava/lang/String;Lio/reactivex/Observable;Ljava/lang/Long;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static/range {p0 .. p5}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->readWithAck$lambda-35$lambda-33(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;Ljava/lang/String;Lio/reactivex/Observable;Ljava/lang/Long;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$aL6kdUgCwptANH9BC7GAanL35OA(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Z
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendAndWait$lambda-5(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$aaB6w0e4aTdq4LcUF107GdWy1eo(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->transferData$lambda-104$lambda-92(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$c9xdiKYzCXNhVmV4MGzV0sdMMkk(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;)Z
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->readWithAck$lambda-37(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$cfwI-77B2LmnvnM1fKkVCpXQ9mQ(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;Ljava/lang/String;Lio/reactivex/Observable;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendSingleCommandWithAck$lambda-46(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;Ljava/lang/String;Lio/reactivex/Observable;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$dvuVlG1euCoc4kO4V-KjoZvrSY8(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;[B)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->writeAck$lambda-30$lambda-29(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;[B)V

    return-void
.end method

.method public static synthetic lambda$e-Nygp_sTLKM21FHil8gecQjGsU(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->transferData$lambda-104$lambda-102(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$g9qKG-3t0poploI58dM9A4dUuN0(Lkotlin/jvm/internal/Ref$BooleanRef;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendSingleCommandWithAck$lambda-38(Lkotlin/jvm/internal/Ref$BooleanRef;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;)V

    return-void
.end method

.method public static synthetic lambda$h1fcRU63EhAD_wsULGtQphJdt_U(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendAndWait$lambda-4(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$igyf1bklFE7tJldUQUJ7QkTpD_w(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->transferData$lambda-104$lambda-65(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V

    return-void
.end method

.method public static synthetic lambda$jYb8tt0Q68HcIzeAj8jncwSeF-U(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->transferData$lambda-104$lambda-71(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V

    return-void
.end method

.method public static synthetic lambda$jorN0n5lOEzdPQ8QWFIZNTJowzY(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendAndWait$lambda-0(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$jutWr-O4qjnXJ6sMnhvDL8Fodno(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendCommandRequest$lambda-18$lambda-13(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;)V

    return-void
.end method

.method public static synthetic lambda$kwexQM9kv4O__F8JXeINsDqCf0Y(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;Ljava/lang/Boolean;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendSingleCommandWithAck$lambda-47(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;Ljava/lang/Boolean;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$lVJ8PF2m_1lHAEgAEMJUgRpoBeo(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->transferData$lambda-104$lambda-61(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V

    return-void
.end method

.method public static synthetic lambda$llexBxLWbsqMhUA4qSqf0DnFwkE(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendCommandRequest$lambda-18$lambda-17(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$oHR_ZDIBmRbltSKSzEwz-3esUA8(Ljava/lang/Boolean;[B)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendWithAck$lambda-19(Ljava/lang/Boolean;[B)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$oN0WJGUDIe4OK1ubeXJrBwTErxU(Ljava/lang/Throwable;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->handleSyncError$lambda-55$lambda-54(Ljava/lang/Throwable;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$ob33Cav8Zn5CCc5_5ZYsbbN7Wf0(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->transferData$lambda-104$lambda-57(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)V

    return-void
.end method

.method public static synthetic lambda$pP8RaJNH2nr767qKs7GhDMFNTjU(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->transferData$lambda-104$lambda-97(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V

    return-void
.end method

.method public static synthetic lambda$psZjASiusx47WejKtwPhhciLhe8(ZLpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->writeAck$lambda-30(ZLpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$q79FW_B2taJgeJFRCZeRbvsmoc4(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendSingleCommandWithAck$lambda-46$lambda-45(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$qk1YxJnfz1-z190GaUcxZcfk-Dw(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;Ljava/lang/String;Lio/reactivex/Observable;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->readWithAck$lambda-35(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;Ljava/lang/String;Lio/reactivex/Observable;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$r6yZpHfsS97WD_IZ_joHq0NgCrI(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->transferData$lambda-104$lambda-68(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$rBOEqwq0lcwpxXvLuiVkoXHq7zs(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->transferData$lambda-104$lambda-94(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$rVEs7ap-uM4UKw71PkVpb7JYZdA(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendCommandRequest$lambda-18$lambda-15(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;)V

    return-void
.end method

.method public static synthetic lambda$sUdv1t8S7Yn7USjPrfwRvVfmhHk(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Z
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->readResendControlPackage$lambda-25(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$t4_RmZubQAr-hg7uC7CA3eZ01o8(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->handleSyncError$lambda-55$lambda-51(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V

    return-void
.end method

.method public static synthetic lambda$t6FpcpbMj-f1ofeiLOJt887DQpE(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Z
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->readAckResponse$lambda-8(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$tj0nq1oope4c93R40mN9xBAfk88(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->transferData$lambda-104$lambda-96(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$uGuC9IOpePd3cCxP_zr14ykOKyo(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->transferData$lambda-104$lambda-70(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$uV7I_pPFcDnY30vrAgy6cdmq8wI(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->transferData$lambda-104$lambda-62(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$uuQuQEBQ_4WU0JG9JnOhFxNPv3Q(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;[B)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->readWithAck$lambda-31(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;[B)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$vCMDTTiQ28yNa0GhKxkjA3ba1Eo(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->transferData$lambda-104$lambda-75(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V

    return-void
.end method

.method public static synthetic lambda$vN3R0tL4kGAwmZu0aT_Tuj4eYbI(Lkotlin/jvm/internal/Ref$BooleanRef;[B)Z
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendSingleCommandWithAck$lambda-43(Lkotlin/jvm/internal/Ref$BooleanRef;[B)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$xDD52KR3JdQHIWz1TFAwfyuEfc8(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->readWithAck$lambda-36(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$xGNmm6Pabjw-A-b-r-u77TxTHhs(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendAndWait$lambda-1(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)V

    return-void
.end method

.method public static synthetic lambda$xw0sNZbOhm12XhHDJ5khLBCXBuo([B)Z
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->readAckResponse$lambda-10([B)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$y0v0chN3-5tqcLaZzf8PSYa4A0c(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->transferData$lambda-104$lambda-88(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$yCiHutcGjfiREGPzIAdMK9Sf198(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)[B
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->readResendControlPackage$lambda-26(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)[B

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$yuC8w_MzTnb6De-gEh-8z8xzkf4(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;[B)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->readAckResponse$lambda-11(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;[B)V

    return-void
.end method

.method private static final observeProgress$lambda-109(Ljava/lang/Float;)Ljava/lang/Integer;
    .locals 2

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 555
    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    const/high16 v1, 0x42c80000    # 100.0f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    const/16 p0, 0x64

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    move-result p0

    float-to-int p0, p0

    :goto_0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method private static final observeProgress$lambda-110(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/Integer;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 557
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->TAG:Ljava/lang/String;

    const-string v0, "Sync progress: "

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private final readAckResponse(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;Ljava/lang/String;)Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 118
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    .line 119
    invoke-interface {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;->messageOutput()Lio/reactivex/Observable;

    move-result-object p2

    .line 120
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$t6FpcpbMj-f1ofeiLOJt887DQpE;

    invoke-direct {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$t6FpcpbMj-f1ofeiLOJt887DQpE;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)V

    invoke-virtual {p2, v0}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object p2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$AD2fKnYgxLHGYoiTbcGs41GKbUY;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$AD2fKnYgxLHGYoiTbcGs41GKbUY;

    .line 121
    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object p2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$xw0sNZbOhm12XhHDJ5khLBCXBuo;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$xw0sNZbOhm12XhHDJ5khLBCXBuo;

    .line 122
    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object p1

    .line 123
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$yuC8w_MzTnb6De-gEh-8z8xzkf4;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$yuC8w_MzTnb6De-gEh-8z8xzkf4;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object p2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$6IaUZENMY_yVcsRtDm7X8JpL0rE;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$6IaUZENMY_yVcsRtDm7X8JpL0rE;

    .line 127
    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    .line 128
    sget-object p2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v0, 0xf

    invoke-virtual {p1, v0, v1, p2}, Lio/reactivex/Observable;->timeout(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "communicator\n                .messageOutput()\n                .filter { it.protocolType == filterProtocolType }\n                .map { it.protocolMessage.payload.data }\n                .filter { it.contentEquals(DTPAckType.AckGood.value) }\n                .doOnNext {\n                    Log.d(TAG, \"Step 2. - Received ACK <--: ${it.formatToString()}\")\n                    debug(\"READ ACK Gen2 -> ${it.formatToString(false)}\")\n                }\n                .map { it.contentEquals(DTPAckType.AckGood.value) }\n                .timeout(15, TimeUnit.SECONDS)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final readAckResponse$lambda-10([B)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 122
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DTPAckType$AckGood;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DTPAckType$AckGood;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DTPAckType$AckGood;->getValue()[B

    move-result-object v0

    invoke-static {p0, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p0

    return p0
.end method

.method private static final readAckResponse$lambda-11(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;[B)V
    .locals 5

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 124
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->TAG:Ljava/lang/String;

    const-string v1, "it"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, v1, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/BluetoothExtensionsKt;->formatToString$default([BZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "Step 2. - Received ACK <--: "

    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 125
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {p1, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/BluetoothExtensionsKt;->formatToString([BZ)Ljava/lang/String;

    move-result-object p1

    const-string v0, "READ ACK Gen2 -> "

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x2

    invoke-static {p0, p1, v3, v0, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final readAckResponse$lambda-12([B)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 127
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DTPAckType$AckGood;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DTPAckType$AckGood;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DTPAckType$AckGood;->getValue()[B

    move-result-object v0

    invoke-static {p0, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method private static final readAckResponse$lambda-8(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Z
    .locals 1

    const-string v0, "$filterProtocolType"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;->getProtocolType()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    move-result-object p1

    if-ne p1, p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static final readAckResponse$lambda-9(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)[B
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 121
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;->getProtocolMessage()Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;->getPayload()Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;->getData()[B

    move-result-object p0

    return-object p0
.end method

.method private final readCommandResponse(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;Ljava/lang/String;)Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Observable<",
            "[B>;"
        }
    .end annotation

    .line 176
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    .line 177
    invoke-interface {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;->messageOutput()Lio/reactivex/Observable;

    move-result-object p2

    .line 178
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$DoRoYkHBgvejrehs9eU7DTMxVk4;

    invoke-direct {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$DoRoYkHBgvejrehs9eU7DTMxVk4;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)V

    invoke-virtual {p2, v0}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object p2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$YbQMdOjdytbA-6P6MYZRSyLmLvE;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$YbQMdOjdytbA-6P6MYZRSyLmLvE;

    .line 179
    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    .line 180
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$WHqkg-jhtaTd9nM5df6ltJMDx3k;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$WHqkg-jhtaTd9nM5df6ltJMDx3k;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object p1

    .line 181
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$KqHm__ri3LTUId9o_87bPaAva9E;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$KqHm__ri3LTUId9o_87bPaAva9E;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p1

    .line 185
    sget-object p2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v0, 0xf

    invoke-virtual {p1, v0, v1, p2}, Lio/reactivex/Observable;->timeout(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "communicator\n                .messageOutput()\n                .filter { it.protocolType == filterProtocolType }\n                .map { it.protocolMessage.payload.data }\n                .filter { !it.contentEquals(DTPAckType.AckGood.value) && !isAckControlMark(it) }\n                .doOnNext {\n                    debug(\"READ DTP Gen2 -> ${it.formatToString(false)}\")\n                    Log.d(TAG, \"Step 3. - Received command response <--: ${it.formatToString()}\")\n                }\n                .timeout(15, TimeUnit.SECONDS)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final readCommandResponse$lambda-21(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Z
    .locals 1

    const-string v0, "$filterProtocolType"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 178
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;->getProtocolType()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    move-result-object p1

    if-ne p1, p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static final readCommandResponse$lambda-22(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)[B
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 179
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;->getProtocolMessage()Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;->getPayload()Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;->getData()[B

    move-result-object p0

    return-object p0
.end method

.method private static final readCommandResponse$lambda-23(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;[B)Z
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 180
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DTPAckType$AckGood;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DTPAckType$AckGood;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DTPAckType$AckGood;->getValue()[B

    move-result-object v0

    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->isAckControlMark([B)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static final readCommandResponse$lambda-24(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;[B)V
    .locals 5

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 182
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string v1, "it"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-static {p1, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/BluetoothExtensionsKt;->formatToString([BZ)Ljava/lang/String;

    move-result-object v2

    const-string v3, "READ DTP Gen2 -> "

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static {v0, v2, v3, v4, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 183
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->TAG:Ljava/lang/String;

    const/4 v0, 0x1

    invoke-static {p1, v1, v0, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/BluetoothExtensionsKt;->formatToString$default([BZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "Step 3. - Received command response <--: "

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private final readResendControlPackage(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;Ljava/lang/String;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Observable<",
            "[B>;"
        }
    .end annotation

    .line 189
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    .line 190
    invoke-interface {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;->messageOutput()Lio/reactivex/Observable;

    move-result-object p2

    .line 191
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$sUdv1t8S7Yn7USjPrfwRvVfmhHk;

    invoke-direct {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$sUdv1t8S7Yn7USjPrfwRvVfmhHk;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)V

    invoke-virtual {p2, v0}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object p2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$yCiHutcGjfiREGPzIAdMK9Sf198;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$yCiHutcGjfiREGPzIAdMK9Sf198;

    .line 192
    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    .line 193
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$EiHp-qmrGCzte2xOqVCru1RzTzw;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$EiHp-qmrGCzte2xOqVCru1RzTzw;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object p1

    .line 194
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$W-buHRHUsNOLLcrqJVZ0ofJXjf4;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$W-buHRHUsNOLLcrqJVZ0ofJXjf4;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "communicator\n                .messageOutput()\n                .filter { it.protocolType == filterProtocolType }\n                .map { it.protocolMessage.payload.data }\n                .filter { isAckControlMark(it) }\n                .doOnNext { Log.d(TAG, \"Step -1. - Read control package <--: ${it.formatToString()}\") }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final readResendControlPackage$lambda-25(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Z
    .locals 1

    const-string v0, "$filterProtocolType"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 191
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;->getProtocolType()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    move-result-object p1

    if-ne p1, p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static final readResendControlPackage$lambda-26(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)[B
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 192
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;->getProtocolMessage()Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;->getPayload()Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;->getData()[B

    move-result-object p0

    return-object p0
.end method

.method private static final readResendControlPackage$lambda-27(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;[B)Z
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 193
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->isAckControlMark([B)Z

    move-result p0

    return p0
.end method

.method private static final readResendControlPackage$lambda-28(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;[B)V
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 194
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->TAG:Ljava/lang/String;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/BluetoothExtensionsKt;->formatToString$default([BZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "Step -1. - Read control package <--: "

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private final readWithAck(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;Ljava/lang/String;)Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;",
            "Ljava/lang/String;",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;",
            ">;"
        }
    .end annotation

    .line 219
    invoke-direct {p0, p4, p5}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->readCommandResponse(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;Ljava/lang/String;)Lio/reactivex/Observable;

    move-result-object v0

    .line 221
    invoke-direct {p0, p4, p5}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->readResendControlPackage(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;Ljava/lang/String;)Lio/reactivex/Observable;

    move-result-object p4

    .line 223
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$uuQuQEBQ_4WU0JG9JnOhFxNPv3Q;

    invoke-direct {v1, p1, p3, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$uuQuQEBQ_4WU0JG9JnOhFxNPv3Q;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    .line 245
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$qk1YxJnfz1-z190GaUcxZcfk-Dw;

    invoke-direct {p3, p0, p2, p5, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$qk1YxJnfz1-z190GaUcxZcfk-Dw;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;Ljava/lang/String;Lio/reactivex/Observable;)V

    invoke-virtual {p1, p3}, Lio/reactivex/Observable;->switchMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    .line 259
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$xDD52KR3JdQHIWz1TFAwfyuEfc8;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$xDD52KR3JdQHIWz1TFAwfyuEfc8;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->doOnError(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object p2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$c9xdiKYzCXNhVmV4MGzV0sdMMkk;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$c9xdiKYzCXNhVmV4MGzV0sdMMkk;

    .line 262
    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->takeUntil(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "readCommandObservable\n                .map {\n                    val payload = command.extractPayload(it)\n                    val isResponseValid = command.extractAndCompareCRC(it)\n                    val error = command.extractResponseType(payload)\n                    // map response type to ack data type\n                    if (error == null) {\n                        command.onSuccess(dataInfo)\n                    } else {\n\n                        //include this part for CRC retry logic\n                        if (!isResponseValid) {\n                            debug(\"Invalid CRC, will write ACK 01\", \"sync_tracker\")\n                            return@map Gen2AckData(dataInfo, false, validCRC = false, error = error)\n                        }\n\n                        val parsedData = command.parseReceivedData(it, dataInfo)\n//                        Log.d(TAG,\"ReadWithAck - Data on parse: $parsedData\")\n                        val result = Gen2AckData(dataInfo, false, error = error)\n                        //    result.validCRC = isResponseValid\n                        result\n                    }\n                }\n                .switchMap { data ->\n                    Observable.timer(200, TimeUnit.MILLISECONDS)\n                            .firstOrError()\n                            .toObservable()\n                            .flatMap {\n                                val writeAck = writeAck(uid, data.validCRC, logTag)\n                                Observable.merge(\n                                        writeAck,\n                                        waitForControlPackageResend\n                                                .throttleFirst(3, TimeUnit.MILLISECONDS)\n                                                .flatMap { writeAck })\n                            }\n                            .map { data }\n                }\n                .doOnError {\n                    error(\"Error in read with ack: ${it.javaClass.simpleName}\", it)\n                }\n                .takeUntil { it.successReceived }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final readWithAck$lambda-31(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;[B)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;
    .locals 8

    const-string v0, "$command"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$dataInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 224
    invoke-interface {p0, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;->extractPayload([B)Lkotlin/Pair;

    move-result-object v0

    .line 225
    invoke-interface {p0, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;->extractAndCompareCRC([B)Z

    move-result v1

    .line 226
    invoke-interface {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;->extractResponseType(Lkotlin/Pair;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolError;

    move-result-object v0

    if-nez v0, :cond_0

    .line 229
    invoke-interface {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;->onSuccess(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;

    move-result-object p0

    goto :goto_0

    :cond_0
    if-nez v1, :cond_1

    .line 234
    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p0, "Invalid CRC, will write ACK 01"

    const-string p3, "sync_tracker"

    invoke-static {p2, p0, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;)V

    .line 235
    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;

    check-cast v0, Ljava/lang/Throwable;

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2, p2, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;ZZLjava/lang/Throwable;)V

    return-object p0

    .line 238
    :cond_1
    invoke-interface {p0, p3, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;->parseReceivedData([BLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;

    .line 240
    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v5, v0

    check-cast v5, Ljava/lang/Throwable;

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v7}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;ZZLjava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_0
    return-object p0
.end method

.method private static final readWithAck$lambda-35(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;Ljava/lang/String;Lio/reactivex/Observable;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;)Lio/reactivex/ObservableSource;
    .locals 8

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$logTag"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$waitForControlPackageResend"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 246
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0xc8

    invoke-static {v1, v2, v0}, Lio/reactivex/Observable;->timer(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;

    move-result-object v0

    .line 247
    invoke-virtual {v0}, Lio/reactivex/Observable;->firstOrError()Lio/reactivex/Single;

    move-result-object v0

    .line 248
    invoke-virtual {v0}, Lio/reactivex/Single;->toObservable()Lio/reactivex/Observable;

    move-result-object v0

    .line 249
    new-instance v7, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$_YpSzJKCAuwqiKPuImaJncMHmXA;

    move-object v1, v7

    move-object v2, p0

    move-object v3, p1

    move-object v4, p4

    move-object v5, p2

    move-object v6, p3

    invoke-direct/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$_YpSzJKCAuwqiKPuImaJncMHmXA;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;Ljava/lang/String;Lio/reactivex/Observable;)V

    invoke-virtual {v0, v7}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p0

    .line 257
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$Zm4rjmFItzn7DODsUNx-VOXc66w;

    invoke-direct {p1, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$Zm4rjmFItzn7DODsUNx-VOXc66w;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;)V

    invoke-virtual {p0, p1}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final readWithAck$lambda-35$lambda-33(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;Ljava/lang/String;Lio/reactivex/Observable;Ljava/lang/Long;)Lio/reactivex/ObservableSource;
    .locals 8

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$logTag"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$waitForControlPackageResend"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 250
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;->getValidCRC()Z

    move-result v3

    const/4 v5, 0x0

    const/16 v6, 0x8

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v4, p3

    invoke-static/range {v1 .. v7}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->writeAck$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;ZLjava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;ILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    .line 252
    move-object p1, p0

    check-cast p1, Lio/reactivex/ObservableSource;

    .line 254
    sget-object p2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v0, 0x3

    invoke-virtual {p4, v0, v1, p2}, Lio/reactivex/Observable;->throttleFirst(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;

    move-result-object p2

    .line 255
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$6X5TtDPIM3m6MnMagS2HUBjWTBU;

    invoke-direct {p3, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$6X5TtDPIM3m6MnMagS2HUBjWTBU;-><init>(Lio/reactivex/Observable;)V

    invoke-virtual {p2, p3}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    .line 251
    invoke-static {p1, p0}, Lio/reactivex/Observable;->merge(Lio/reactivex/ObservableSource;Lio/reactivex/ObservableSource;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final readWithAck$lambda-35$lambda-33$lambda-32(Lio/reactivex/Observable;[B)Lio/reactivex/ObservableSource;
    .locals 1

    const-string v0, "$writeAck"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 255
    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final readWithAck$lambda-35$lambda-34(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;[B)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;
    .locals 1

    const-string v0, "$data"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final readWithAck$lambda-36(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/Throwable;)V
    .locals 7

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 260
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    const-string v0, "Error in read with ack: "

    invoke-static {v0, p0}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v3, p1

    invoke-static/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->error$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final readWithAck$lambda-37(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 262
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;->getSuccessReceived()Z

    move-result p0

    return p0
.end method

.method private static final sendAndWait$lambda-0(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;)Lio/reactivex/ObservableSource;
    .locals 5

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$command"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;

    invoke-interface {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;->getSendingData()[B

    move-result-object v2

    invoke-direct {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;-><init>([B)V

    .line 71
    invoke-interface {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;->getCommandType()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    move-result-object v2

    .line 72
    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;->GEN2_STANDARD_BASICS:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    .line 70
    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;

    invoke-direct {v4, v1, v3, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;)V

    .line 73
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;->BLE_COMMUNICATION:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;->GEN2_STANDARD_BASICS:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    .line 70
    invoke-direct {v0, p1, v4, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;-><init>(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)V

    invoke-interface {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;->sendMessage(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Lio/reactivex/Completable;

    move-result-object p0

    .line 74
    invoke-interface {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;->getSendingData()[B

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/reactivex/Completable;->toSingleDefault(Ljava/lang/Object;)Lio/reactivex/Single;

    move-result-object p0

    .line 75
    invoke-virtual {p0}, Lio/reactivex/Single;->toObservable()Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final sendAndWait$lambda-1(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)V
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->TAG:Ljava/lang/String;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;->getProtocolMessage()Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;

    move-result-object p1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;->getPayload()Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;

    move-result-object p1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;->getData()[B

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/BluetoothExtensionsKt;->formatToString$default([BZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "Received data: "

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private static final sendAndWait$lambda-2(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;
    .locals 1

    const-string v0, "$command"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$dataInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;->getProtocolMessage()Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;

    move-result-object p2

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;->getPayload()Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;

    move-result-object p2

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;->getData()[B

    move-result-object p2

    invoke-interface {p0, p2, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;->parseReceivedData([BLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object p0

    return-object p0
.end method

.method private static final sendAndWait$lambda-3(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)V
    .locals 0

    return-void
.end method

.method private static final sendAndWait$lambda-4(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/Throwable;)V
    .locals 7

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string v2, "Error in Gen2Executor while waiting for data"

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v3, p1

    invoke-static/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->error$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final sendAndWait$lambda-5(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Z
    .locals 1

    const-string v0, "data"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->getParsingFinished()Z

    move-result p0

    return p0
.end method

.method private static final sendAndWait$lambda-6(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;[B)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;
    .locals 1

    const-string v0, "response"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$noName_1"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final sendAndWait$lambda-7(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)V
    .locals 0

    return-void
.end method

.method private final sendCommandRequest(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;Ljava/lang/String;)Lio/reactivex/Observable;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;",
            "Ljava/lang/String;",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Observable<",
            "[B>;"
        }
    .end annotation

    .line 134
    new-instance p4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$DrWIoGvTqm0_3nbTcbAcsqSrG90;

    invoke-direct {p4, p1, p0, p3, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$DrWIoGvTqm0_3nbTcbAcsqSrG90;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;Ljava/lang/String;)V

    invoke-static {p4}, Lio/reactivex/Observable;->defer(Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "defer {\n            return@defer Observable.just(command).doOnNext {\n                debug(\"WRITE DTP -> ${it.printCommandId()}\")\n            }.map {\n                ProtocolMessage(ProtocolPayload(command.getSendingData()),\n                        messageType = command.getCommandType(),\n                        type = protocolType)\n            }.doOnNext {\n                debug(\"WRITE DTP PAYLOAD -> ${it.payload.data.formatToString()}\")\n            }.flatMap {\n                communicator.sendMessage(CommunicationMessage(uid, it,\n                        TechnologyType.BLE_COMMUNICATION, protocolType))\n                        .toSingleDefault(command.getSendingData())\n                        .toObservable()\n                        .doOnNext { Log.d(TAG, \"Step 1. - Sending ${command::class.simpleName} -->: ${it.formatToString()}\") }\n            }\n\n        }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final sendCommandRequest$lambda-18(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;Ljava/lang/String;)Lio/reactivex/ObservableSource;
    .locals 2

    const-string v0, "$command"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$protocolType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 135
    invoke-static {p0}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$jutWr-O4qjnXJ6sMnhvDL8Fodno;

    invoke-direct {v1, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$jutWr-O4qjnXJ6sMnhvDL8Fodno;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object v0

    .line 137
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$QHmn3FEgQerd1FGfC0HGCsdXomA;

    invoke-direct {v1, p0, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$QHmn3FEgQerd1FGfC0HGCsdXomA;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v0

    .line 141
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$rVEs7ap-uM4UKw71PkVpb7JYZdA;

    invoke-direct {v1, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$rVEs7ap-uM4UKw71PkVpb7JYZdA;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object v0

    .line 143
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$llexBxLWbsqMhUA4qSqf0DnFwkE;

    invoke-direct {v1, p1, p3, p2, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$llexBxLWbsqMhUA4qSqf0DnFwkE;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final sendCommandRequest$lambda-18$lambda-13(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 136
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;->printCommandId()Ljava/lang/String;

    move-result-object p1

    const-string v0, "WRITE DTP -> "

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final sendCommandRequest$lambda-18$lambda-14(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;)Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;
    .locals 1

    const-string v0, "$command"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$protocolType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 138
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;

    invoke-interface {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;->getSendingData()[B

    move-result-object v0

    invoke-direct {p2, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;-><init>([B)V

    .line 139
    invoke-interface {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;->getCommandType()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    move-result-object p0

    .line 138
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;

    invoke-direct {v0, p2, p1, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;)V

    return-object v0
.end method

.method private static final sendCommandRequest$lambda-18$lambda-15(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;)V
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 142
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;->getPayload()Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;

    move-result-object p1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;->getData()[B

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/BluetoothExtensionsKt;->formatToString$default([BZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "WRITE DTP PAYLOAD -> "

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x2

    invoke-static {p0, p1, v2, v0, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final sendCommandRequest$lambda-18$lambda-17(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;)Lio/reactivex/ObservableSource;
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$protocolType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$command"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 144
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;

    .line 145
    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;->BLE_COMMUNICATION:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;

    .line 144
    invoke-direct {v1, p1, p4, v2, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;-><init>(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)V

    invoke-interface {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;->sendMessage(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Lio/reactivex/Completable;

    move-result-object p1

    .line 146
    invoke-interface {p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;->getSendingData()[B

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/Completable;->toSingleDefault(Ljava/lang/Object;)Lio/reactivex/Single;

    move-result-object p1

    .line 147
    invoke-virtual {p1}, Lio/reactivex/Single;->toObservable()Lio/reactivex/Observable;

    move-result-object p1

    .line 148
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$QmjWvLKXFZFLIPHpJA9Jw5EoVjc;

    invoke-direct {p2, p0, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$QmjWvLKXFZFLIPHpJA9Jw5EoVjc;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final sendCommandRequest$lambda-18$lambda-17$lambda-16(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;[B)V
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$command"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 148
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->TAG:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Step 1. - Sending "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object p1

    invoke-interface {p1}, Lkotlin/reflect/KClass;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " -->: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "it"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p2, p1, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/BluetoothExtensionsKt;->formatToString$default([BZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public static synthetic sendSingleCommandWithAck$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;FJLjava/lang/String;ILjava/lang/Object;)Lio/reactivex/Observable;
    .locals 10

    if-nez p10, :cond_3

    and-int/lit8 v0, p9, 0x8

    if-eqz v0, :cond_0

    .line 267
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;->GEN2_DTP:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    move-object v5, v0

    goto :goto_0

    :cond_0
    move-object v5, p4

    :goto_0
    and-int/lit8 v0, p9, 0x20

    if-eqz v0, :cond_1

    const-wide/16 v0, 0xa

    move-wide v7, v0

    goto :goto_1

    :cond_1
    move-wide/from16 v7, p6

    :goto_1
    and-int/lit8 v0, p9, 0x40

    if-eqz v0, :cond_2

    const-string v0, "sync_tracker"

    move-object v9, v0

    goto :goto_2

    :cond_2
    move-object/from16 v9, p8

    :goto_2
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v6, p5

    .line 266
    invoke-virtual/range {v1 .. v9}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendSingleCommandWithAck(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;FJLjava/lang/String;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0

    :cond_3
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Super calls with default arguments not supported in this target, function: sendSingleCommandWithAck"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static final sendSingleCommandWithAck$lambda-38(Lkotlin/jvm/internal/Ref$BooleanRef;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;)V
    .locals 1

    const-string v0, "$shouldAllowSuccessACK"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 275
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;->getSuccessReceived()Z

    move-result p1

    iput-boolean p1, p0, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    return-void
.end method

.method private static final sendSingleCommandWithAck$lambda-39(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;)V
    .locals 0

    return-void
.end method

.method private static final sendSingleCommandWithAck$lambda-40(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;)Lio/reactivex/ObservableSource;
    .locals 5

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 284
    invoke-static {p0}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "just(it)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 287
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;->getError()Ljava/lang/Throwable;

    move-result-object v1

    instance-of v2, v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolError$SyncLocked;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolError$SyncLocked;

    goto :goto_0

    :cond_0
    move-object v1, v3

    :goto_0
    const-string v2, "error(it.error)"

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;->getError()Ljava/lang/Throwable;

    move-result-object p0

    invoke-static {p0}, Lio/reactivex/Observable;->error(Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_2

    .line 288
    :cond_1
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;->getError()Ljava/lang/Throwable;

    move-result-object v1

    instance-of v4, v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolError$WatchBusy;

    if-eqz v4, :cond_2

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolError$WatchBusy;

    goto :goto_1

    :cond_2
    move-object v1, v3

    :goto_1
    if-eqz v1, :cond_3

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;->getError()Ljava/lang/Throwable;

    move-result-object p0

    invoke-static {p0}, Lio/reactivex/Observable;->error(Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_2

    .line 289
    :cond_3
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;->getError()Ljava/lang/Throwable;

    move-result-object v1

    instance-of v4, v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError;

    if-eqz v4, :cond_4

    move-object v3, v1

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError;

    :cond_4
    if-eqz v3, :cond_5

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;->getError()Ljava/lang/Throwable;

    move-result-object p0

    invoke-static {p0}, Lio/reactivex/Observable;->error(Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 291
    :cond_5
    :goto_2
    check-cast v0, Lio/reactivex/ObservableSource;

    return-object v0
.end method

.method private static final sendSingleCommandWithAck$lambda-41(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 294
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;->getSuccessReceived()Z

    move-result p0

    return p0
.end method

.method private static final sendSingleCommandWithAck$lambda-42(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;)V
    .locals 0

    return-void
.end method

.method private static final sendSingleCommandWithAck$lambda-43(Lkotlin/jvm/internal/Ref$BooleanRef;[B)Z
    .locals 1

    const-string v0, "$shouldAllowSuccessACK"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 307
    iget-boolean p0, p0, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    return p0
.end method

.method private static final sendSingleCommandWithAck$lambda-44([B)Lio/reactivex/ObservableSource;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 309
    sget-object p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ControlPackageResendError$AckResentControlPackage;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ControlPackageResendError$AckResentControlPackage;

    check-cast p0, Ljava/lang/Throwable;

    invoke-static {p0}, Lio/reactivex/Observable;->error(Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final sendSingleCommandWithAck$lambda-46(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;Ljava/lang/String;Lio/reactivex/Observable;)Lio/reactivex/ObservableSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$logTag"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 311
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$q79FW_B2taJgeJFRCZeRbvsmoc4;

    invoke-direct {v0, p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$q79FW_B2taJgeJFRCZeRbvsmoc4;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p3, v0}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final sendSingleCommandWithAck$lambda-46$lambda-45(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Lio/reactivex/ObservableSource;
    .locals 8

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$logTag"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 312
    instance-of v0, p3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ControlPackageResendError$AckResentControlPackage;

    if-eqz v0, :cond_0

    .line 313
    iget-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->TAG:Ljava/lang/String;

    const-string v0, "Received control packet on listener for E200, will write ACK.."

    invoke-static {p3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v3, 0x1

    const/4 v5, 0x0

    const/16 v6, 0x8

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v4, p2

    .line 315
    invoke-static/range {v1 .. v7}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->writeAck$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;ZLjava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;ILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0

    .line 317
    :cond_0
    invoke-static {p3}, Lio/reactivex/Observable;->error(Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final sendSingleCommandWithAck$lambda-47(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;Ljava/lang/Boolean;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;
    .locals 1

    const-string v0, "t1"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$noName_1"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 321
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;->getDataInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;

    move-result-object p0

    return-object p0
.end method

.method private final sendWithAck(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;JLjava/lang/String;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;",
            "Ljava/lang/String;",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;",
            "J",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 156
    invoke-direct {p0, p3, p6}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->readAckResponse(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;Ljava/lang/String;)Lio/reactivex/Observable;

    move-result-object v0

    .line 157
    invoke-direct {p0, p1, p2, p3, p6}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendCommandRequest(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;Ljava/lang/String;)Lio/reactivex/Observable;

    move-result-object p1

    .line 161
    check-cast v0, Lio/reactivex/ObservableSource;

    check-cast p1, Lio/reactivex/ObservableSource;

    sget-object p2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$oHR_ZDIBmRbltSKSzEwz-3esUA8;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$oHR_ZDIBmRbltSKSzEwz-3esUA8;

    invoke-static {v0, p1, p2}, Lio/reactivex/Observable;->zip(Lio/reactivex/ObservableSource;Lio/reactivex/ObservableSource;Lio/reactivex/functions/BiFunction;)Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "zip(ackObservable, requestObservable, BiFunction { t1, _ ->\n                            t1\n                        })"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 166
    sget-object p2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, p4, p5, p2}, Lio/reactivex/Observable;->timeout(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "responseObservable\n                .timeout(timeout, TimeUnit.SECONDS)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method static synthetic sendWithAck$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;JLjava/lang/String;ILjava/lang/Object;)Lio/reactivex/Observable;
    .locals 7

    if-nez p8, :cond_1

    and-int/lit8 p7, p7, 0x4

    if-eqz p7, :cond_0

    .line 155
    sget-object p3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;->GEN2_DTP:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    :cond_0
    move-object v3, p3

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-wide v4, p4

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendWithAck(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;JLjava/lang/String;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: sendWithAck"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final sendWithAck$lambda-19(Ljava/lang/Boolean;[B)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "t1"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$noName_1"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final transferData$lambda-104(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;
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

    .line 453
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;

    new-instance p6, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DeviceInfoCommand;

    invoke-direct {p6}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DeviceInfoCommand;-><init>()V

    move-object v3, p6

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;

    const p6, 0x3ccccccd    # 0.025f

    mul-float v5, p3, p6

    const/4 v6, 0x0

    const/16 v7, 0x10

    const/4 v8, 0x0

    move-object v2, p1

    move-object v4, p2

    invoke-static/range {v1 .. v8}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor$DefaultImpls;->sendAndWait$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;FIILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p2

    .line 454
    new-instance p6, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$ob33Cav8Zn5CCc5_5ZYsbbN7Wf0;

    invoke-direct {p6, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$ob33Cav8Zn5CCc5_5ZYsbbN7Wf0;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;)V

    invoke-virtual {p2, p6}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p2

    .line 455
    new-instance p6, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$YSmqp2DFyGIuuLav7DSdnm4fWYY;

    invoke-direct {p6, p0, p1, p4, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$YSmqp2DFyGIuuLav7DSdnm4fWYY;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;F)V

    invoke-virtual {p2, p6}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p2

    .line 456
    new-instance p6, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$E5RBN5uUruQF9S5nxhppoNFkWN4;

    invoke-direct {p6, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$E5RBN5uUruQF9S5nxhppoNFkWN4;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;)V

    invoke-virtual {p2, p6}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p2

    .line 457
    new-instance p6, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$CxWoBGFl8_mBrXeqn7bHCXVJJy0;

    invoke-direct {p6, p0, p1, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$CxWoBGFl8_mBrXeqn7bHCXVJJy0;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;F)V

    invoke-virtual {p2, p6}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p2

    .line 458
    new-instance p6, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$lVJ8PF2m_1lHAEgAEMJUgRpoBeo;

    invoke-direct {p6, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$lVJ8PF2m_1lHAEgAEMJUgRpoBeo;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;)V

    invoke-virtual {p2, p6}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p2

    .line 459
    new-instance p6, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$uV7I_pPFcDnY30vrAgy6cdmq8wI;

    invoke-direct {p6, p0, p5, p1, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$uV7I_pPFcDnY30vrAgy6cdmq8wI;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Ljava/lang/String;F)V

    invoke-virtual {p2, p6}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p2

    .line 460
    new-instance p6, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$XKur28JZitOmIa5mcEMS_toCXcc;

    invoke-direct {p6, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$XKur28JZitOmIa5mcEMS_toCXcc;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;)V

    invoke-virtual {p2, p6}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p2

    .line 461
    new-instance p6, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$3guA9zPoejLggDJMH0kkjTV9nJs;

    invoke-direct {p6, p0, p5, p1, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$3guA9zPoejLggDJMH0kkjTV9nJs;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Ljava/lang/String;F)V

    invoke-virtual {p2, p6}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p2

    .line 462
    new-instance p6, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$igyf1bklFE7tJldUQUJ7QkTpD_w;

    invoke-direct {p6, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$igyf1bklFE7tJldUQUJ7QkTpD_w;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;)V

    invoke-virtual {p2, p6}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p2

    .line 463
    new-instance p6, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$YOMFeIoo4Rmd-okHowyZ_Am_ppM;

    invoke-direct {p6, p0, p1, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$YOMFeIoo4Rmd-okHowyZ_Am_ppM;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;F)V

    invoke-virtual {p2, p6}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p2

    .line 464
    new-instance p6, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$No5KVt1J99dvM2nCY3ZFWM3nqhk;

    invoke-direct {p6, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$No5KVt1J99dvM2nCY3ZFWM3nqhk;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;)V

    invoke-virtual {p2, p6}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p2

    .line 465
    new-instance p6, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$r6yZpHfsS97WD_IZ_joHq0NgCrI;

    invoke-direct {p6, p0, p5, p1, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$r6yZpHfsS97WD_IZ_joHq0NgCrI;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Ljava/lang/String;F)V

    invoke-virtual {p2, p6}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p2

    .line 466
    new-instance p6, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$GIgplP9OhCDnCtBmLaJySokg_D8;

    invoke-direct {p6, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$GIgplP9OhCDnCtBmLaJySokg_D8;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;)V

    invoke-virtual {p2, p6}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p2

    .line 467
    new-instance p6, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$uGuC9IOpePd3cCxP_zr14ykOKyo;

    invoke-direct {p6, p0, p5, p1, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$uGuC9IOpePd3cCxP_zr14ykOKyo;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Ljava/lang/String;F)V

    invoke-virtual {p2, p6}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p2

    .line 468
    new-instance p6, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$jYb8tt0Q68HcIzeAj8jncwSeF-U;

    invoke-direct {p6, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$jYb8tt0Q68HcIzeAj8jncwSeF-U;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;)V

    invoke-virtual {p2, p6}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p2

    .line 469
    new-instance p6, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$47yF6gDEEbNB95WngaUgF02FyHs;

    invoke-direct {p6, p0, p5, p1, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$47yF6gDEEbNB95WngaUgF02FyHs;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Ljava/lang/String;F)V

    invoke-virtual {p2, p6}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p2

    .line 470
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$S8YJpR7Fxu6W9r6swxs0rk3__28;

    invoke-direct {p5, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$S8YJpR7Fxu6W9r6swxs0rk3__28;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;)V

    invoke-virtual {p2, p5}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p2

    .line 471
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$EE9FEAr3w8aBeXEvCW8ZX2YLbhA;

    invoke-direct {p5, p0, p1, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$EE9FEAr3w8aBeXEvCW8ZX2YLbhA;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;F)V

    invoke-virtual {p2, p5}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p2

    .line 472
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$vCMDTTiQ28yNa0GhKxkjA3ba1Eo;

    invoke-direct {p5, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$vCMDTTiQ28yNa0GhKxkjA3ba1Eo;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;)V

    invoke-virtual {p2, p5}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p2

    .line 473
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$-VWuVqBMeS4cJuY9hzT_pCbJeDI;

    invoke-direct {p5, p0, p1, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$-VWuVqBMeS4cJuY9hzT_pCbJeDI;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;F)V

    invoke-virtual {p2, p5}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p2

    .line 474
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$TeoDVbahsZeCXkaKIaorYNqArMM;

    invoke-direct {p5, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$TeoDVbahsZeCXkaKIaorYNqArMM;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;)V

    invoke-virtual {p2, p5}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p2

    .line 475
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$JQcHQdBU7Y3bCGqqQuUBqXrF9Fs;

    invoke-direct {p5, p0, p1, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$JQcHQdBU7Y3bCGqqQuUBqXrF9Fs;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;F)V

    invoke-virtual {p2, p5}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p2

    .line 476
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$OKb9S_LXBoncc4yT5o1s-abmXi4;

    invoke-direct {p5, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$OKb9S_LXBoncc4yT5o1s-abmXi4;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;)V

    invoke-virtual {p2, p5}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p2

    .line 480
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$28VFAYYnYi-awc98EPY5ahTAG98;

    invoke-direct {p5, p0, p1, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$28VFAYYnYi-awc98EPY5ahTAG98;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;F)V

    invoke-virtual {p2, p5}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p2

    .line 481
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$7Teum4orS9WmOxD3gbwxoDjLhTQ;

    invoke-direct {p5, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$7Teum4orS9WmOxD3gbwxoDjLhTQ;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;)V

    invoke-virtual {p2, p5}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p2

    .line 485
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$3ye_sad_74UtoeQzKfrOHrrdgvA;

    invoke-direct {p5, p0, p1, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$3ye_sad_74UtoeQzKfrOHrrdgvA;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;F)V

    invoke-virtual {p2, p5}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p2

    .line 486
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$Es6m8tbx538feM_Pj86Z2nIngr8;

    invoke-direct {p5, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$Es6m8tbx538feM_Pj86Z2nIngr8;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;)V

    invoke-virtual {p2, p5}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p2

    .line 487
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$A16FEfbF87kYyAJwP6vW-PVyNSg;

    invoke-direct {p5, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$A16FEfbF87kYyAJwP6vW-PVyNSg;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;)V

    invoke-virtual {p2, p5}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p2

    .line 494
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$3ppR7K9douhczM_zjS65eBykn0A;

    invoke-direct {p5, p0, p1, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$3ppR7K9douhczM_zjS65eBykn0A;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;F)V

    invoke-virtual {p2, p5}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p2

    .line 495
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$9XCpy6rzatfh1i5uU_eEz_tG5AE;

    invoke-direct {p5, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$9XCpy6rzatfh1i5uU_eEz_tG5AE;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;)V

    invoke-virtual {p2, p5}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p2

    .line 497
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$y0v0chN3-5tqcLaZzf8PSYa4A0c;

    invoke-direct {p5, p0, p1, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$y0v0chN3-5tqcLaZzf8PSYa4A0c;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;F)V

    invoke-virtual {p2, p5}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p2

    .line 498
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$EoSKZqBGZlomcnzFK-F6-__Tzls;

    invoke-direct {p5, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$EoSKZqBGZlomcnzFK-F6-__Tzls;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;)V

    invoke-virtual {p2, p5}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p2

    .line 499
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$5bVnTG_BwIOawtJkFbWhdNhRiLA;

    invoke-direct {p5, p0, p1, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$5bVnTG_BwIOawtJkFbWhdNhRiLA;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;F)V

    invoke-virtual {p2, p5}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p2

    .line 500
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$A6N5byYuEGu15SyOwQMNOVtDd14;

    invoke-direct {p5, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$A6N5byYuEGu15SyOwQMNOVtDd14;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;)V

    invoke-virtual {p2, p5}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p2

    .line 501
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$aaB6w0e4aTdq4LcUF107GdWy1eo;

    invoke-direct {p5, p0, p1, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$aaB6w0e4aTdq4LcUF107GdWy1eo;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;F)V

    invoke-virtual {p2, p5}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p2

    .line 502
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$ABO9A9u_fbOoSX46mcW8zkhpR0g;

    invoke-direct {p5, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$ABO9A9u_fbOoSX46mcW8zkhpR0g;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;)V

    invoke-virtual {p2, p5}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p2

    .line 503
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$rBOEqwq0lcwpxXvLuiVkoXHq7zs;

    invoke-direct {p5, p0, p1, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$rBOEqwq0lcwpxXvLuiVkoXHq7zs;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;F)V

    invoke-virtual {p2, p5}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p2

    .line 504
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$IhXk_AAetIhn9bWS3aTNnE0WfJI;

    invoke-direct {p5, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$IhXk_AAetIhn9bWS3aTNnE0WfJI;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;)V

    invoke-virtual {p2, p5}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p2

    .line 507
    invoke-virtual {p0, p1, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->handleSyncError(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/functions/Function;

    move-result-object p4

    invoke-virtual {p2, p4}, Lio/reactivex/Observable;->onErrorResumeNext(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p2

    .line 508
    new-instance p4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$tj0nq1oope4c93R40mN9xBAfk88;

    invoke-direct {p4, p0, p1, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$tj0nq1oope4c93R40mN9xBAfk88;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;F)V

    invoke-virtual {p2, p4}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    .line 509
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$pP8RaJNH2nr767qKs7GhDMFNTjU;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$pP8RaJNH2nr767qKs7GhDMFNTjU;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p1

    .line 510
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$V2ys7EdML3m1SGVaN2fA4MlLBpc;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$V2ys7EdML3m1SGVaN2fA4MlLBpc;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p1

    .line 522
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$e-Nygp_sTLKM21FHil8gecQjGsU;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$e-Nygp_sTLKM21FHil8gecQjGsU;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    .line 523
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$ZDGJWKh-Rl10l2zMedz17gGHWPk;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$ZDGJWKh-Rl10l2zMedz17gGHWPk;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->doOnError(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final transferData$lambda-104$lambda-101(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 7

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 512
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;->getDataInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object v0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->getActivityLogs()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 1077
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

    .line 1078
    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;

    .line 512
    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->getWalkingSteps()J

    move-result-wide v3

    long-to-int v4, v3

    add-int/2addr v2, v4

    goto :goto_0

    .line 513
    :cond_0
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;->getDataInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object v0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->getActivityLogs()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 1082
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v3, 0x0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 1083
    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;

    .line 513
    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->getRunningSteps()J

    move-result-wide v4

    long-to-int v5, v4

    add-int/2addr v3, v5

    goto :goto_1

    .line 515
    :cond_1
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;->getDataInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object v0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->getActivityLogs()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v4, "Total log entries: "

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v4, 0x0

    const/4 v5, 0x2

    invoke-static {p0, v0, v4, v5, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 516
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;->getDataInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object v0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->getActivityLogs()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 1086
    instance-of v6, v0, Ljava/util/Collection;

    if-eqz v6, :cond_2

    move-object v6, v0

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_2

    goto :goto_3

    .line 1088
    :cond_2
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;

    .line 516
    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;->isSleep()Z

    move-result v6

    if-eqz v6, :cond_3

    add-int/lit8 v1, v1, 0x1

    if-gez v1, :cond_3

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwCountOverflow()V

    goto :goto_2

    .line 1089
    :cond_4
    :goto_3
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "Sleep log entries: "

    .line 516
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0, v4, v5, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    add-int/2addr v2, v3

    .line 517
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "Total steps retrieved: "

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0, v4, v5, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 518
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;->getDataInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object v0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->getRunningLogs()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "Total number of activities retrieved: "

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0, v4, v5, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 519
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;->getRtlData()Ljava/util/List;

    move-result-object p1

    const-string v0, "RTL timestamps: "

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1, v4, v5, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final transferData$lambda-104$lambda-102(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "gen2DataInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 522
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->reformatDataLogs(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;->getDataInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object p0

    return-object p0
.end method

.method private static final transferData$lambda-104$lambda-103(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 524
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->TAG:Ljava/lang/String;

    const-string v0, "Sync failed. Reason: "

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 525
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method private static final transferData$lambda-104$lambda-57(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)V
    .locals 2

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 454
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p1, "Gen2DeviceInfoCommand finished successfully."

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final transferData$lambda-104$lambda-58(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;
    .locals 11

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$dataInfoWrapper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 455
    new-instance p4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2StartAmDTPCommand;

    invoke-direct {p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2StartAmDTPCommand;-><init>()V

    move-object v1, p4

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    const p4, 0x3ccccccd    # 0.025f

    mul-float v5, p3, p4

    const/4 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/16 v9, 0x68

    const/4 v10, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v0 .. v10}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendSingleCommandWithAck$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;FJLjava/lang/String;ILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final transferData$lambda-104$lambda-59(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 2

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 456
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p1, "Gen2StartAmDTPCommand finished successfully."

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final transferData$lambda-104$lambda-60(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 12

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 457
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ReceiveUserInformationCommand;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ReceiveUserInformationCommand;-><init>()V

    move-object v2, v0

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    const v0, 0x3d4ccccd    # 0.05f

    mul-float v6, p2, v0

    const/4 v5, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/16 v10, 0x68

    const/4 v11, 0x0

    move-object v1, p0

    move-object v3, p1

    move-object v4, p3

    invoke-static/range {v1 .. v11}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendSingleCommandWithAck$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;FJLjava/lang/String;ILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final transferData$lambda-104$lambda-61(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 2

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 458
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p1, "Gen2ReceiveUserInformationCommand finished successfully."

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final transferData$lambda-104$lambda-62(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 12

    const-string v0, "this$0"

    move-object v1, p0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$pairingConfig"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    move-object v3, p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    move-object/from16 v4, p4

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 459
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendUserInformationCommand;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;->getUnitsInfoData()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UnitsInfoData;

    move-result-object v2

    invoke-direct {v0, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendUserInformationCommand;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UnitsInfoData;)V

    move-object v2, v0

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    const v0, 0x3d4ccccd    # 0.05f

    mul-float v6, p3, v0

    const/4 v5, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/16 v10, 0x68

    const/4 v11, 0x0

    invoke-static/range {v1 .. v11}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendSingleCommandWithAck$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;FJLjava/lang/String;ILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    check-cast v0, Lio/reactivex/ObservableSource;

    return-object v0
.end method

.method private static final transferData$lambda-104$lambda-63(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 2

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 460
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p1, "Gen2SendUserInformationCommand finished successfully."

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final transferData$lambda-104$lambda-64(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 12

    const-string v0, "this$0"

    move-object v1, p0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$pairingConfig"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    move-object v3, p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    move-object/from16 v4, p4

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 461
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendBiometricsCommand;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;->getUserInfoData()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;

    move-result-object v2

    invoke-direct {v0, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendBiometricsCommand;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;)V

    move-object v2, v0

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    const v0, 0x3d4ccccd    # 0.05f

    mul-float v6, p3, v0

    const/4 v5, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/16 v10, 0x68

    const/4 v11, 0x0

    invoke-static/range {v1 .. v11}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendSingleCommandWithAck$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;FJLjava/lang/String;ILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    check-cast v0, Lio/reactivex/ObservableSource;

    return-object v0
.end method

.method private static final transferData$lambda-104$lambda-65(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 2

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 462
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p1, "Gen2SendBiometricsCommand finished successfully."

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final transferData$lambda-104$lambda-66(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 12

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 463
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ReceiveStepsDistanceGoals;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ReceiveStepsDistanceGoals;-><init>()V

    move-object v2, v0

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    const v0, 0x3d4ccccd    # 0.05f

    mul-float v6, p2, v0

    const/4 v5, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/16 v10, 0x68

    const/4 v11, 0x0

    move-object v1, p0

    move-object v3, p1

    move-object v4, p3

    invoke-static/range {v1 .. v11}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendSingleCommandWithAck$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;FJLjava/lang/String;ILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final transferData$lambda-104$lambda-67(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 2

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 464
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p1, "Gen2ReceiveStepsDistanceGoals finished successfully."

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final transferData$lambda-104$lambda-68(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 12

    const-string v0, "this$0"

    move-object v1, p0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$pairingConfig"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    move-object v3, p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    move-object/from16 v4, p4

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 465
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendStepsDistanceGoal;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;->getGoalInfoData()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;

    move-result-object v2

    invoke-direct {v0, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendStepsDistanceGoal;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;)V

    move-object v2, v0

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    const v0, 0x3dcccccd    # 0.1f

    mul-float v6, p3, v0

    const/4 v5, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/16 v10, 0x68

    const/4 v11, 0x0

    invoke-static/range {v1 .. v11}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendSingleCommandWithAck$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;FJLjava/lang/String;ILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    check-cast v0, Lio/reactivex/ObservableSource;

    return-object v0
.end method

.method private static final transferData$lambda-104$lambda-69(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 2

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 466
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p1, "Gen2SendStepsDistanceGoal finished successfully."

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final transferData$lambda-104$lambda-70(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 12

    const-string v0, "this$0"

    move-object v1, p0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$pairingConfig"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    move-object v3, p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    move-object/from16 v4, p4

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 467
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendCaloriesSleepGoal;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;->getGoalInfoData()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;

    move-result-object v2

    invoke-direct {v0, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendCaloriesSleepGoal;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;)V

    move-object v2, v0

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    const v0, 0x3dcccccd    # 0.1f

    mul-float v6, p3, v0

    const/4 v5, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/16 v10, 0x68

    const/4 v11, 0x0

    invoke-static/range {v1 .. v11}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendSingleCommandWithAck$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;FJLjava/lang/String;ILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    check-cast v0, Lio/reactivex/ObservableSource;

    return-object v0
.end method

.method private static final transferData$lambda-104$lambda-71(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 2

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 468
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p1, "Gen2SendCaloriesSleepGoal finished successfully."

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final transferData$lambda-104$lambda-72(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 12

    const-string v0, "this$0"

    move-object v1, p0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$pairingConfig"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    move-object v3, p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    move-object/from16 v4, p4

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 469
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendLanguageCommand;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;->getLanguageInfoData()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/LanguageInfoData;

    move-result-object v2

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/LanguageInfoData;->getLocale()Ljava/util/Locale;

    move-result-object v2

    invoke-direct {v0, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendLanguageCommand;-><init>(Ljava/util/Locale;)V

    move-object v2, v0

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    const v0, 0x3dcccccd    # 0.1f

    mul-float v6, p3, v0

    const/4 v5, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/16 v10, 0x68

    const/4 v11, 0x0

    invoke-static/range {v1 .. v11}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendSingleCommandWithAck$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;FJLjava/lang/String;ILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    check-cast v0, Lio/reactivex/ObservableSource;

    return-object v0
.end method

.method private static final transferData$lambda-104$lambda-73(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 2

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 470
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p1, "Gen2SendLanguageCommand finished successfully."

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final transferData$lambda-104$lambda-74(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 12

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 471
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RTLStatusCommand;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RTLStatusCommand;-><init>()V

    move-object v2, v0

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    const v0, 0x3d4ccccd    # 0.05f

    mul-float v6, p2, v0

    const/4 v5, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/16 v10, 0x68

    const/4 v11, 0x0

    move-object v1, p0

    move-object v3, p1

    move-object v4, p3

    invoke-static/range {v1 .. v11}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendSingleCommandWithAck$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;FJLjava/lang/String;ILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final transferData$lambda-104$lambda-75(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 2

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 472
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p1, "RTLStatusCommand finished successfully."

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final transferData$lambda-104$lambda-76(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 12

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 473
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RTLTimeCommand;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RTLTimeCommand;-><init>()V

    move-object v2, v0

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    const v0, 0x3d4ccccd    # 0.05f

    mul-float v6, p2, v0

    const/4 v5, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/16 v10, 0x68

    const/4 v11, 0x0

    move-object v1, p0

    move-object v3, p1

    move-object v4, p3

    invoke-static/range {v1 .. v11}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendSingleCommandWithAck$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;FJLjava/lang/String;ILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final transferData$lambda-104$lambda-77(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 2

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 474
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p1, "RTLTimeCommand finished successfully."

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final transferData$lambda-104$lambda-78(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 12

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 475
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLogCommand;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLogCommand;-><init>()V

    move-object v2, v0

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    const v0, 0x3ccccccd    # 0.025f

    mul-float v6, p2, v0

    const/4 v5, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/16 v10, 0x68

    const/4 v11, 0x0

    move-object v1, p0

    move-object v3, p1

    move-object v4, p3

    invoke-static/range {v1 .. v11}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendSingleCommandWithAck$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;FJLjava/lang/String;ILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final transferData$lambda-104$lambda-79(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 4

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 477
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string v1, "Gen2ActivityStartLogCommand finished successfully."

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 478
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;->getTempActivityLog()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2TempActivityInfo;

    move-result-object p1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2TempActivityInfo;->getTempStartLogs()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->printStartLogs(Ljava/util/List;)V

    return-void
.end method

.method private static final transferData$lambda-104$lambda-80(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 12

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 480
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityEndLogCommand;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityEndLogCommand;-><init>()V

    move-object v2, v0

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    const v0, 0x3ccccccd    # 0.025f

    mul-float v6, p2, v0

    const/4 v5, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/16 v10, 0x68

    const/4 v11, 0x0

    move-object v1, p0

    move-object v3, p1

    move-object v4, p3

    invoke-static/range {v1 .. v11}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendSingleCommandWithAck$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;FJLjava/lang/String;ILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final transferData$lambda-104$lambda-81(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 4

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 482
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string v1, "Gen2ActivityEndLogCommand finished successfully."

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 483
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;->getTempActivityLog()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2TempActivityInfo;

    move-result-object p1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2TempActivityInfo;->getTempEndLogs()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->printEndLogs(Ljava/util/List;)V

    return-void
.end method

.method private static final transferData$lambda-104$lambda-82(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 12

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 485
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLogCommand;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLogCommand;-><init>()V

    move-object v2, v0

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    const v0, 0x3da3d70a    # 0.08f

    mul-float v6, p2, v0

    const/4 v5, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/16 v10, 0x68

    const/4 v11, 0x0

    move-object v1, p0

    move-object v3, p1

    move-object v4, p3

    invoke-static/range {v1 .. v11}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendSingleCommandWithAck$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;FJLjava/lang/String;ILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final transferData$lambda-104$lambda-83(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 2

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 486
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p1, "Gen2ActivityDeltaLogCommand finished successfully."

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final transferData$lambda-104$lambda-85(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 488
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;->getTempActivityLog()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2TempActivityInfo;

    move-result-object v0

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ActivityLogExtensionsKt;->exportActivityDataLogs(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2TempActivityInfo;)Ljava/util/List;

    move-result-object v0

    .line 489
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;->getActivityInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo;

    move-result-object v1

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo;->getActivityDataLogs()Ljava/util/List;

    move-result-object v1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 490
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;->getActivityInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo;

    move-result-object p1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo;->getActivityDataLogs()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 1074
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDataLog;

    .line 491
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDataLog;->getDeltaLogs()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->printActivityDeltaLogs(Ljava/util/List;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private static final transferData$lambda-104$lambda-86(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 12

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 494
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLogCommand;

    invoke-virtual {p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;->getRtlData()Ljava/util/List;

    move-result-object v2

    invoke-direct {v0, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLogCommand;-><init>(Ljava/util/List;)V

    move-object v2, v0

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    const v0, 0x3ccccccd    # 0.025f

    mul-float v6, p2, v0

    const/4 v5, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/16 v10, 0x68

    const/4 v11, 0x0

    move-object v1, p0

    move-object v3, p1

    move-object v4, p3

    invoke-static/range {v1 .. v11}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendSingleCommandWithAck$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;FJLjava/lang/String;ILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    check-cast v0, Lio/reactivex/ObservableSource;

    return-object v0
.end method

.method private static final transferData$lambda-104$lambda-87(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 2

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 495
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p1, "Gen2BackgroundLogCommand finished successfully."

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final transferData$lambda-104$lambda-88(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 12

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 497
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CleanRTLCommand;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CleanRTLCommand;-><init>()V

    move-object v2, v0

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    const v0, 0x3d4ccccd    # 0.05f

    mul-float v6, p2, v0

    const/4 v5, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/16 v10, 0x68

    const/4 v11, 0x0

    move-object v1, p0

    move-object v3, p1

    move-object v4, p3

    invoke-static/range {v1 .. v11}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendSingleCommandWithAck$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;FJLjava/lang/String;ILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final transferData$lambda-104$lambda-89(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 2

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 498
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p1, "Gen2CleanRTLCommand finished successfully."

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final transferData$lambda-104$lambda-90(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 12

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 499
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CleanActivityLogCommand;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CleanActivityLogCommand;-><init>()V

    move-object v2, v0

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    const v0, 0x3d4ccccd    # 0.05f

    mul-float v6, p2, v0

    const/4 v5, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/16 v10, 0x68

    const/4 v11, 0x0

    move-object v1, p0

    move-object v3, p1

    move-object v4, p3

    invoke-static/range {v1 .. v11}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendSingleCommandWithAck$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;FJLjava/lang/String;ILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final transferData$lambda-104$lambda-91(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 2

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 500
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p1, "Gen2CleanActivityLogCommand finished successfully."

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final transferData$lambda-104$lambda-92(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 12

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 501
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CleanBackgroundLogCommand;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CleanBackgroundLogCommand;-><init>()V

    move-object v2, v0

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    const v0, 0x3d4ccccd    # 0.05f

    mul-float v6, p2, v0

    const/4 v5, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/16 v10, 0x68

    const/4 v11, 0x0

    move-object v1, p0

    move-object v3, p1

    move-object v4, p3

    invoke-static/range {v1 .. v11}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendSingleCommandWithAck$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;FJLjava/lang/String;ILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final transferData$lambda-104$lambda-93(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 2

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 502
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p1, "Gen2CleanBackgroundLogCommand finished successfully."

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final transferData$lambda-104$lambda-94(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 12

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 503
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CleanSleepLogCommand;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CleanSleepLogCommand;-><init>()V

    move-object v2, v0

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    const v0, 0x3d4ccccd    # 0.05f

    mul-float v6, p2, v0

    const/4 v5, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/16 v10, 0x68

    const/4 v11, 0x0

    move-object v1, p0

    move-object v3, p1

    move-object v4, p3

    invoke-static/range {v1 .. v11}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendSingleCommandWithAck$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;FJLjava/lang/String;ILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final transferData$lambda-104$lambda-95(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 2

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 504
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p1, "Gen2CleanSleepLogCommand finished successfully."

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final transferData$lambda-104$lambda-96(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;
    .locals 12

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 508
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2StopAmDTPCommand;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2StopAmDTPCommand;-><init>()V

    move-object v2, v0

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    const v0, 0x3d4ccccd    # 0.05f

    mul-float v6, p2, v0

    const/4 v5, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/16 v10, 0x68

    const/4 v11, 0x0

    move-object v1, p0

    move-object v3, p1

    move-object v4, p3

    invoke-static/range {v1 .. v11}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendSingleCommandWithAck$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;FJLjava/lang/String;ILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final transferData$lambda-104$lambda-97(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 2

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 509
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p1, "Gen2StopAmDTPCommand finished successfully."

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final transferData$lambda-56(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;Lio/reactivex/ObservableEmitter;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$dataInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 448
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->getSyncProgressChannel()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannel;

    move-result-object v0

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannelKt;->getSyncPowers()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannel;->setTempPowersConfig(Lkotlin/jvm/functions/Function1;)V

    .line 449
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->getSyncProgressChannel()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannel;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannel;->reset()V

    .line 450
    invoke-interface {p2, p1}, Lio/reactivex/ObservableEmitter;->onNext(Ljava/lang/Object;)V

    .line 451
    invoke-interface {p2}, Lio/reactivex/ObservableEmitter;->onComplete()V

    return-void
.end method

.method private static final transferDataWithProgress$lambda-111(Ljava/lang/Integer;)Lkotlin/Pair;
    .locals 2

    const-string v0, "progress"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 570
    new-instance v0, Lkotlin/Pair;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method private static final transferDataWithProgress$lambda-112(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)V
    .locals 2

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 572
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p1, "All messages sent"

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final transferDataWithProgress$lambda-113(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lkotlin/Pair;
    .locals 2

    const-string v0, "data"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 573
    new-instance v0, Lkotlin/Pair;

    const/16 v1, 0x64

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method private final writeAck(Ljava/lang/String;ZLjava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)Lio/reactivex/Observable;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;",
            ")",
            "Lio/reactivex/Observable<",
            "[B>;"
        }
    .end annotation

    .line 199
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$psZjASiusx47WejKtwPhhciLhe8;

    invoke-direct {p3, p2, p0, p1, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$psZjASiusx47WejKtwPhhciLhe8;-><init>(ZLpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)V

    invoke-static {p3}, Lio/reactivex/Observable;->defer(Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "defer {\n            var ackType: DTPAckType = DTPAckType.AckGood\n            if (!validCRC) {\n                ackType = DTPAckType.AckCRCInvalid\n            }\n            return@defer communicator.sendMessage(CommunicationMessage(uid, ProtocolMessage(ProtocolPayload(ackType.value),\n                    messageType = ProtocolMessageType.ACK_MESSAGE,\n                    type = protocolType),\n                    TechnologyType.BLE_COMMUNICATION, protocolType))\n                    .toSingleDefault(ackType.value)\n                    .toObservable()\n                    .doOnNext {\n                        debug(\"WRITE ACK -> 00\")\n                        Log.d(TAG, \"Step 4. - Sending ACK -->: ${it.formatToString()}\")\n                    }\n\n        }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method static synthetic writeAck$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;ZLjava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;ILjava/lang/Object;)Lio/reactivex/Observable;
    .locals 0

    if-nez p6, :cond_1

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    .line 198
    sget-object p4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;->GEN2_DTP:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->writeAck(Ljava/lang/String;ZLjava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: writeAck"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final writeAck$lambda-30(ZLpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)Lio/reactivex/ObservableSource;
    .locals 5

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$protocolType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 200
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DTPAckType$AckGood;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DTPAckType$AckGood;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DTPAckType;

    if-nez p0, :cond_0

    .line 202
    sget-object p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DTPAckType$AckCRCInvalid;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DTPAckType$AckCRCInvalid;

    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DTPAckType;

    .line 204
    :cond_0
    iget-object p0, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;

    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DTPAckType;->getValue()[B

    move-result-object v3

    invoke-direct {v2, v3}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;-><init>([B)V

    .line 205
    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;->ACK_MESSAGE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    .line 204
    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;

    invoke-direct {v4, v2, p3, v3}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;)V

    .line 207
    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;->BLE_COMMUNICATION:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;

    .line 204
    invoke-direct {v1, p2, v4, v2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;-><init>(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)V

    invoke-interface {p0, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;->sendMessage(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Lio/reactivex/Completable;

    move-result-object p0

    .line 208
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DTPAckType;->getValue()[B

    move-result-object p2

    invoke-virtual {p0, p2}, Lio/reactivex/Completable;->toSingleDefault(Ljava/lang/Object;)Lio/reactivex/Single;

    move-result-object p0

    .line 209
    invoke-virtual {p0}, Lio/reactivex/Single;->toObservable()Lio/reactivex/Observable;

    move-result-object p0

    .line 210
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$dvuVlG1euCoc4kO4V-KjoZvrSY8;

    invoke-direct {p2, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$dvuVlG1euCoc4kO4V-KjoZvrSY8;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;)V

    invoke-virtual {p0, p2}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final writeAck$lambda-30$lambda-29(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;[B)V
    .locals 4

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 211
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string v1, "WRITE ACK -> 00"

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 212
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->TAG:Ljava/lang/String;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/BluetoothExtensionsKt;->formatToString$default([BZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "Step 4. - Sending ACK -->: "

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method


# virtual methods
.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 56
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Executor;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Executor$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Executor;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method protected final getSyncProgressChannel()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannel;
    .locals 1

    .line 64
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->syncProgressChannel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannel;

    return-object v0
.end method

.method protected final getTraceLogger()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TraceLogger;
    .locals 1

    .line 329
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->traceLogger$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TraceLogger;

    return-object v0
.end method

.method protected final handleSyncError(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/functions/Function;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;",
            ")",
            "Lio/reactivex/functions/Function<",
            "Ljava/lang/Throwable;",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;",
            ">;>;"
        }
    .end annotation

    const-string v0, "uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataInfoWrapper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 416
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$O2ggxXYJWBN4EPjh7qqLiLC-u8U;

    invoke-direct {v0, p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$O2ggxXYJWBN4EPjh7qqLiLC-u8U;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V

    return-object v0
.end method

.method public observeProgress()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 554
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->getSyncProgressChannel()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannel;

    move-result-object v0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannel;->progress()Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$N3aJW2wyHiqMjffuQjT1upCppxc;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$N3aJW2wyHiqMjffuQjT1upCppxc;

    .line 555
    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v0

    .line 556
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$V4x2Pe9B8zA8v6L3OHzPXpH0zVQ;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$V4x2Pe9B8zA8v6L3OHzPXpH0zVQ;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "syncProgressChannel.progress()\n                .map { if (it > 100f) 100 else it.toInt() }\n                .doOnNext {\n                    Log.d(TAG, \"Sync progress: $it\")\n                }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method protected final printActivityDeltaLogs(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;",
            ">;)V"
        }
    .end annotation

    const-string v0, "deltaLogs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 531
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "Parsing activity log size: "

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 533
    check-cast p1, Ljava/lang/Iterable;

    const/16 v1, 0x64

    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->chunked(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 1065
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 534
    check-cast v1, Ljava/lang/Iterable;

    .line 1067
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const-string v4, ""

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;

    .line 535
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_0
    const-string v1, "\n "

    .line 537
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v2, v3, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method protected final printEndLogs(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityEndLog;",
            ">;)V"
        }
    .end annotation

    const-string v0, "tempEndLogs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 543
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "Parsing Activity end log size: "

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 544
    check-cast p1, Ljava/lang/Iterable;

    .line 1070
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityEndLog;

    .line 544
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityEndLog;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v2, v3, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected final printStartLogs(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLog;",
            ">;)V"
        }
    .end annotation

    const-string v0, "tempStartLogs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 549
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "Parsing Activity start log size: "

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 550
    check-cast p1, Ljava/lang/Iterable;

    .line 1072
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLog;

    .line 550
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLog;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v2, v3, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected final reformatDataLogs(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;
    .locals 38

    move-object/from16 v0, p1

    const-string v1, "dataInfoParam"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 332
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;->getActivityInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo;

    move-result-object v1

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo;->getActivityDataLogs()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .line 1061
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDataLog;

    .line 334
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDataLog;->getType()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;

    move-result-object v3

    .line 335
    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$STATIONARY;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$STATIONARY;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;->ACTIVITY_STATIONARY:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;

    :goto_1
    move-object v5, v3

    goto/16 :goto_2

    .line 336
    :cond_0
    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$WALKING;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$WALKING;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;->ACTIVITY_WALKING:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;

    goto :goto_1

    .line 337
    :cond_1
    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$JOGGING;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$JOGGING;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;->ACTIVITY_JOGGING:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;

    goto :goto_1

    .line 338
    :cond_2
    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$RUNNING;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$RUNNING;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;->ACTIVITY_RUNNING:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;

    goto :goto_1

    .line 339
    :cond_3
    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$BIKING;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$BIKING;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;->ACTIVITY_BIKING:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;

    goto :goto_1

    .line 340
    :cond_4
    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$DRIVING;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$DRIVING;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;->ACTIVITY_DRIVING:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;

    goto :goto_1

    .line 341
    :cond_5
    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_WALKING;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_WALKING;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;->ACTIVITY_INDOOR_WALKING:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;

    goto :goto_1

    .line 342
    :cond_6
    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_RUNNING;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_RUNNING;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;->ACTIVITY_INDOOR_RUNNING:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;

    goto :goto_1

    .line 343
    :cond_7
    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_JOGGING;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_JOGGING;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;->ACTIVITY_INDOOR_JOGGING:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;

    goto :goto_1

    .line 344
    :cond_8
    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_BIKING;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_BIKING;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_9

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;->ACTIVITY_INDOOR_BIKING:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;

    goto :goto_1

    .line 345
    :cond_9
    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_HIIT;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_HIIT;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;->ACTIVITY_HIIT:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;

    goto :goto_1

    .line 346
    :cond_a
    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;->ACTIVITY_UNKNOWN:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;

    goto :goto_1

    .line 350
    :goto_2
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDataLog;->getStartLog()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLog;

    move-result-object v3

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLog;->getStartTime()J

    move-result-wide v19

    const/16 v3, 0x3e8

    int-to-long v14, v3

    mul-long v34, v19, v14

    .line 353
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDataLog;->getEndLog()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityEndLog;

    move-result-object v3

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityEndLog;->getEndLogTime()J

    move-result-wide v3

    mul-long v8, v3, v14

    .line 355
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;

    .line 359
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDataLog;->getEndLog()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityEndLog;

    move-result-object v4

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityEndLog;->getEndLogDistance()J

    move-result-wide v6

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDataLog;->getStartLog()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLog;

    move-result-object v4

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLog;->getStartLogDistance()J

    move-result-wide v10

    sub-long v10, v6, v10

    .line 360
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDataLog;->getEndLog()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityEndLog;

    move-result-object v4

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityEndLog;->getEndStepsRunning()I

    move-result v4

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDataLog;->getEndLog()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityEndLog;

    move-result-object v6

    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityEndLog;->getEndStepsWalk()I

    move-result v6

    add-int/2addr v4, v6

    int-to-long v12, v4

    .line 361
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDataLog;->getEndLog()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityEndLog;

    move-result-object v4

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityEndLog;->getEndActiveCals()I

    move-result v4

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDataLog;->getEndLog()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityEndLog;

    move-result-object v6

    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityEndLog;->getEndBMRCals()I

    move-result v6

    add-int v16, v4, v6

    sub-long v6, v8, v34

    long-to-int v7, v6

    const/16 v17, 0x0

    const/16 v18, 0x80

    const/16 v21, 0x0

    move-object v4, v3

    move/from16 v22, v7

    move-wide/from16 v6, v34

    move-wide/from16 v36, v14

    move/from16 v14, v16

    move/from16 v15, v22

    move-object/from16 v16, v17

    move/from16 v17, v18

    move-object/from16 v18, v21

    .line 355
    invoke-direct/range {v4 .. v18}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;JJJJIILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 364
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->getTraceLogger()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TraceLogger;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "---- Activity start "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDataLog;->getStartLog()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLog;

    move-result-object v6

    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLog;->getStartTime()J

    move-result-wide v6

    const-wide/16 v12, 0x3e8

    mul-long v6, v6, v12

    invoke-static {v6, v7}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->toCalendar(J)Ljava/util/Calendar;

    move-result-object v6

    invoke-static {v6}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->toDateStringDashed(Ljava/util/Calendar;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " ----\n"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    sget-object v6, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType$HeartRate;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType$HeartRate;

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType;

    invoke-interface {v4, v5, v6}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TraceLogger;->log(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType;)V

    .line 367
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDataLog;->getStartLog()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLog;

    move-result-object v4

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLog;->getStartLatitude()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    move-result v4

    if-nez v4, :cond_b

    .line 369
    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDataLog;->getStartLog()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLog;

    move-result-object v5

    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLog;->getStartLongitude()F

    move-result v5

    float-to-double v5, v5

    .line 370
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDataLog;->getStartLog()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLog;

    move-result-object v7

    invoke-virtual {v7}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLog;->getStartLatitude()F

    move-result v7

    float-to-double v7, v7

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDataLog;->getStartLog()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLog;

    move-result-object v9

    invoke-virtual {v9}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLog;->getStartAltitude()F

    move-result v9

    float-to-double v9, v9

    const-wide/16 v28, 0x0

    const/16 v32, 0x8

    const/16 v33, 0x0

    move-object/from16 v21, v4

    move-wide/from16 v22, v5

    move-wide/from16 v24, v7

    move-wide/from16 v26, v9

    move-wide/from16 v30, v34

    .line 369
    invoke-direct/range {v21 .. v33}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;-><init>(DDDDJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 372
    new-instance v5, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDataLog;->getStartLog()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLog;

    move-result-object v6

    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLog;->getStartHeartRate()I

    move-result v7

    add-long v10, v34, v36

    move-object v6, v5

    move-wide/from16 v8, v34

    invoke-direct/range {v6 .. v11}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;-><init>(IJJ)V

    .line 373
    new-instance v6, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RunningSplit;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDataLog;->getStartLog()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLog;

    move-result-object v7

    invoke-virtual {v7}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLog;->getStartLogDistance()J

    move-result-wide v7

    long-to-float v7, v7

    invoke-direct {v6, v7, v12, v13}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RunningSplit;-><init>(FJ)V

    .line 374
    new-instance v7, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningSplitEntry;

    invoke-direct {v7, v4, v5, v6}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningSplitEntry;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RunningSplit;)V

    .line 375
    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->getRunningSplits()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 379
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDataLog;->getStartLog()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLog;

    move-result-object v4

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLog;->getStartLatitude()F

    move-result v4

    .line 380
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDataLog;->getStartLog()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLog;

    move-result-object v5

    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLog;->getStartLongitude()F

    move-result v5

    .line 381
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDataLog;->getStartLog()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLog;

    move-result-object v6

    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLog;->getStartAltitude()F

    move-result v6

    .line 385
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDataLog;->getDeltaLogs()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .line 1062
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v7, 0x1

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;

    add-int/lit8 v9, v7, 0x1

    int-to-long v10, v7

    add-long v10, v19, v10

    mul-long v10, v10, v12

    .line 389
    invoke-virtual {v8}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->getDeltaGPSLat()B

    move-result v7

    int-to-float v7, v7

    const v14, 0x47c35000    # 100000.0f

    div-float/2addr v7, v14

    add-float/2addr v4, v7

    .line 390
    invoke-virtual {v8}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->getDeltaGPSLong()B

    move-result v7

    int-to-float v7, v7

    div-float/2addr v7, v14

    add-float/2addr v5, v7

    .line 391
    invoke-virtual {v8}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->getDeltaAltitude()I

    move-result v7

    int-to-float v7, v7

    add-float/2addr v6, v7

    .line 396
    new-instance v7, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;

    float-to-double v14, v5

    float-to-double v12, v4

    move-object/from16 v18, v1

    move-object/from16 v34, v2

    float-to-double v1, v6

    const-wide/16 v28, 0x0

    const/16 v32, 0x8

    const/16 v33, 0x0

    move-object/from16 v21, v7

    move-wide/from16 v22, v14

    move-wide/from16 v24, v12

    move-wide/from16 v26, v1

    move-wide/from16 v30, v10

    invoke-direct/range {v21 .. v33}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;-><init>(DDDDJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 402
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;

    invoke-virtual {v8}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->getDeltaHeartRate()I

    move-result v22

    add-long v25, v10, v36

    move-object/from16 v21, v1

    move-wide/from16 v23, v10

    invoke-direct/range {v21 .. v26}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;-><init>(IJJ)V

    .line 403
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RunningSplit;

    invoke-virtual {v8}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->getDeltaDistance()I

    move-result v10

    int-to-float v10, v10

    const-wide/16 v11, 0x3e8

    invoke-direct {v2, v10, v11, v12}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RunningSplit;-><init>(FJ)V

    .line 404
    new-instance v10, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningSplitEntry;

    invoke-direct {v10, v7, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningSplitEntry;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RunningSplit;)V

    .line 405
    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;->getRunningSplits()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 407
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->getTraceLogger()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TraceLogger;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;->getDeltaHeartRate()I

    move-result v7

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, ",\n"

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    sget-object v7, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType$HeartRate;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType$HeartRate;

    check-cast v7, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType;

    invoke-interface {v1, v2, v7}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TraceLogger;->log(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType;)V

    move v7, v9

    move-wide v12, v11

    move-object/from16 v1, v18

    move-object/from16 v2, v34

    goto/16 :goto_3

    :cond_b
    move-object/from16 v18, v1

    .line 410
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;->getDataInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object v1

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->getRunningLogs()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object/from16 v1, v18

    goto/16 :goto_0

    :cond_c
    return-object v0
.end method

.method public send(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;F)Lio/reactivex/Observable;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;",
            "F)",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;",
            ">;"
        }
    .end annotation

    const-string p4, "uid"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "command"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "dataInfo"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    new-instance p1, Lkotlin/NotImplementedError;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "An operation is not implemented: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "not implemented"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1
.end method

.method public sendAndWait(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;FI)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;",
            "FI)",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;",
            ">;"
        }
    .end annotation

    const-string p4, "uid"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "command"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "dataInfo"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    new-instance p4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$jorN0n5lOEzdPQ8QWFIZNTJowzY;

    invoke-direct {p4, p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$jorN0n5lOEzdPQ8QWFIZNTJowzY;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;)V

    invoke-static {p4}, Lio/reactivex/Observable;->defer(Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object p1

    const-string p4, "defer {\n            return@defer communicator.sendMessage(CommunicationMessage(uid, ProtocolMessage(ProtocolPayload(command.getSendingData()),\n                    messageType = command.getCommandType(),\n                    type = ProtocolType.GEN2_STANDARD_BASICS),\n                    TechnologyType.BLE_COMMUNICATION, ProtocolType.GEN2_STANDARD_BASICS))\n                    .toSingleDefault(command.getSendingData())\n                    .toObservable()\n//                    .doOnNext { debug(\"Sending ${command::class.simpleName}: ${it.formatToString()}\") }\n\n        }"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    iget-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    invoke-interface {p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;->messageOutput()Lio/reactivex/Observable;

    move-result-object p4

    .line 81
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$xGNmm6Pabjw-A-b-r-u77TxTHhs;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$xGNmm6Pabjw-A-b-r-u77TxTHhs;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;)V

    invoke-virtual {p4, v0}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p4

    .line 82
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$Zk-lY7qQUfrdKtOQ7H8gYMpbtxc;

    invoke-direct {v0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$Zk-lY7qQUfrdKtOQ7H8gYMpbtxc;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)V

    invoke-virtual {p4, v0}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p2

    int-to-long p3, p5

    .line 83
    sget-object p5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p2, p3, p4, p5}, Lio/reactivex/Observable;->timeout(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;

    move-result-object p2

    sget-object p3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$VGIPBsOu_62AqosxWhQahSGz2d8;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$VGIPBsOu_62AqosxWhQahSGz2d8;

    .line 84
    invoke-virtual {p2, p3}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p2

    .line 92
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$h1fcRU63EhAD_wsULGtQphJdt_U;

    invoke-direct {p3, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$h1fcRU63EhAD_wsULGtQphJdt_U;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;)V

    invoke-virtual {p2, p3}, Lio/reactivex/Observable;->doOnError(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p2

    sget-object p3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$aL6kdUgCwptANH9BC7GAanL35OA;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$aL6kdUgCwptANH9BC7GAanL35OA;

    .line 95
    invoke-virtual {p2, p3}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object p2

    .line 96
    invoke-virtual {p2}, Lio/reactivex/Observable;->firstOrError()Lio/reactivex/Single;

    move-result-object p2

    .line 97
    invoke-virtual {p2}, Lio/reactivex/Single;->toObservable()Lio/reactivex/Observable;

    move-result-object p2

    .line 100
    check-cast p2, Lio/reactivex/ObservableSource;

    check-cast p1, Lio/reactivex/ObservableSource;

    sget-object p3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$2L8VKrVD1y8nhLWuWsl-sHQGEWo;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$2L8VKrVD1y8nhLWuWsl-sHQGEWo;

    invoke-static {p2, p1, p3}, Lio/reactivex/Observable;->zip(Lio/reactivex/ObservableSource;Lio/reactivex/ObservableSource;Lio/reactivex/functions/BiFunction;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object p2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$-ds87dPOb1pd0s8qWLOMxL74oDs;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$-ds87dPOb1pd0s8qWLOMxL74oDs;

    .line 102
    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "zip(responseObservable, requestObservable,\n                BiFunction<DataInfo, ByteArray, DataInfo> { response, _ -> response })\n                .doOnNext {\n                    //                    if (it.parsingFinished) {\n//                        val progress = command.extractProgress(it) * 100\n//                        val res = progress * power\n//                        progressSubject.onNext((progressSubject.value ?: 0f).plus(res))\n//                    }\n                }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method protected final sendSingleCommandWithAck(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;FJLjava/lang/String;)Lio/reactivex/Observable;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;",
            "Ljava/lang/String;",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;",
            "FJ",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;",
            ">;"
        }
    .end annotation

    const-string p5, "command"

    invoke-static {p1, p5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p5, "uid"

    invoke-static {p2, p5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p5, "dataInfo"

    invoke-static {p3, p5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p5, "protocolType"

    invoke-static {p4, p5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p5, "logTag"

    invoke-static {p8, p5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p8

    .line 270
    invoke-direct/range {v0 .. v5}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->readWithAck(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;Ljava/lang/String;)Lio/reactivex/Observable;

    move-result-object p3

    .line 271
    move-object v1, p1

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;

    move-object v3, p4

    move-wide v4, p6

    move-object v6, p8

    invoke-direct/range {v0 .. v6}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendWithAck(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;JLjava/lang/String;)Lio/reactivex/Observable;

    move-result-object p1

    .line 272
    new-instance p5, Lkotlin/jvm/internal/Ref$BooleanRef;

    invoke-direct {p5}, Lkotlin/jvm/internal/Ref$BooleanRef;-><init>()V

    const/4 p6, 0x1

    iput-boolean p6, p5, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 275
    new-instance p6, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$g9qKG-3t0poploI58dM9A4dUuN0;

    invoke-direct {p6, p5}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$g9qKG-3t0poploI58dM9A4dUuN0;-><init>(Lkotlin/jvm/internal/Ref$BooleanRef;)V

    invoke-virtual {p3, p6}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p3

    sget-object p6, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$CfQJT07_0gKAO9OejHY-jLyzH9I;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$CfQJT07_0gKAO9OejHY-jLyzH9I;

    .line 276
    invoke-virtual {p3, p6}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p3

    sget-object p6, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$L-z7af9BgqT4JNUBw46RSY6CGOY;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$L-z7af9BgqT4JNUBw46RSY6CGOY;

    .line 283
    invoke-virtual {p3, p6}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p3

    sget-object p6, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$Houk29CWgJyzuIjLQhQveJLjO9E;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$Houk29CWgJyzuIjLQhQveJLjO9E;

    .line 293
    invoke-virtual {p3, p6}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object p3

    sget-object p6, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$SWlw1yVHMWEuTDbqT2_W9rKu6Qs;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$SWlw1yVHMWEuTDbqT2_W9rKu6Qs;

    .line 296
    invoke-virtual {p3, p6}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p3

    check-cast p3, Lio/reactivex/ObservableSource;

    .line 305
    check-cast p1, Lio/reactivex/ObservableSource;

    .line 306
    invoke-direct {p0, p4, p8}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->readResendControlPackage(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;Ljava/lang/String;)Lio/reactivex/Observable;

    move-result-object p4

    .line 307
    new-instance p6, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$vN3R0tL4kGAwmZu0aT_Tuj4eYbI;

    invoke-direct {p6, p5}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$vN3R0tL4kGAwmZu0aT_Tuj4eYbI;-><init>(Lkotlin/jvm/internal/Ref$BooleanRef;)V

    invoke-virtual {p4, p6}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object p4

    .line 308
    sget-object p5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 p6, 0x3

    invoke-virtual {p4, p6, p7, p5}, Lio/reactivex/Observable;->throttleFirst(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;

    move-result-object p4

    sget-object p5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$R_uYYtctyFT8NCJSKp1OWktENzQ;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$R_uYYtctyFT8NCJSKp1OWktENzQ;

    .line 309
    invoke-virtual {p4, p5}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p4

    check-cast p4, Lio/reactivex/ObservableSource;

    .line 304
    invoke-static {p1, p4}, Lio/reactivex/Observable;->merge(Lio/reactivex/ObservableSource;Lio/reactivex/ObservableSource;)Lio/reactivex/Observable;

    move-result-object p1

    .line 310
    new-instance p4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$cfwI-77B2LmnvnM1fKkVCpXQ9mQ;

    invoke-direct {p4, p0, p2, p8}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$cfwI-77B2LmnvnM1fKkVCpXQ9mQ;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, p4}, Lio/reactivex/Observable;->retryWhen(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    check-cast p1, Lio/reactivex/ObservableSource;

    sget-object p2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$kwexQM9kv4O__F8JXeINsDqCf0Y;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$kwexQM9kv4O__F8JXeINsDqCf0Y;

    .line 273
    invoke-static {p3, p1, p2}, Lio/reactivex/Observable;->zip(Lio/reactivex/ObservableSource;Lio/reactivex/ObservableSource;Lio/reactivex/functions/BiFunction;)Lio/reactivex/Observable;

    move-result-object p1

    .line 324
    invoke-virtual {p1}, Lio/reactivex/Observable;->firstOrError()Lio/reactivex/Single;

    move-result-object p1

    .line 325
    invoke-virtual {p1}, Lio/reactivex/Single;->toObservable()Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "zip(\n                readCommandAndSendAck\n                        .doOnNext { shouldAllowSuccessACK = it.successReceived }\n                        .doOnNext {\n                            //                            if (it.dataInfo.dataInfo.parsingStarted && !it.dataInfo.dataInfo.parsingFinished) {\n//                                val progress = command.extractProgress(it.dataInfo.dataInfo) * 100\n//                                progressSubject.onNext((progressSubject.value\n//                                        ?: 0f).plus((progress * power)))\n//                            }\n                        }\n                        .flatMap {\n                            var resultObs = Observable.just(it)\n\n                            when {\n                                it.error as? DTPProtocolError.SyncLocked != null -> resultObs = Observable.error(it.error)\n                                it.error as? DTPProtocolError.WatchBusy != null -> resultObs = Observable.error(it.error)\n                                it.error as? DTPProtocolParsingError != null -> resultObs = Observable.error(it.error)\n                            }\n                            resultObs\n                        }\n                        .filter {\n                            it.successReceived\n                        }\n                        .doOnNext {\n                            //                            if (it.dataInfo.dataInfo.parsingFinished) {\n//                                val progress = command.extractProgress(it.dataInfo.dataInfo) * 100\n//                                progressSubject.onNext((progressSubject.value\n//                                        ?: 0f).plus((progress * power)))\n//                                Log.d(TAG, \"Summed on ACK: ${progressSubject.value}\")\n//                            }\n                        },\n                Observable.merge(\n                        writeCommandAndWaitForAck,\n                        readResendControlPackage(protocolType, logTag)\n                                .filter { shouldAllowSuccessACK }\n                                .throttleFirst(3, TimeUnit.MILLISECONDS)\n                                .flatMap { Observable.error<Boolean>(ControlPackageResendError.AckResentControlPackage) })\n                        .retryWhen {\n                            it.flatMap {\n                                if (it is ControlPackageResendError.AckResentControlPackage) {\n                                    Log.d(TAG, \"Received control packet on listener for E200, will write ACK..\")\n                                    // TODO check crc here??\n                                    return@flatMap writeAck(uid, true, logTag)\n                                }\n                                return@flatMap Observable.error<Unit>(it)\n                            }\n                        },\n                BiFunction<Gen2AckData, Boolean, Gen2DataInfo> { t1, _ ->\n                    t1.dataInfo\n                }\n        )\n                .firstOrError()\n                .toObservable()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
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

    .line 445
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

    .line 447
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$CSqEEB0zUyuew30uLDIXnsVaTxE;

    invoke-direct {v1, p0, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$CSqEEB0zUyuew30uLDIXnsVaTxE;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)V

    invoke-static {v1}, Lio/reactivex/Observable;->create(Lio/reactivex/ObservableOnSubscribe;)Lio/reactivex/Observable;

    move-result-object v8

    .line 452
    new-instance v9, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$CCQF_iAIdZ2zTYCrKnQ7YsfwXZA;

    move-object v1, v9

    move-object v2, p0

    move-object v3, p1

    move-object v4, p3

    move v5, p4

    move-object v6, v0

    move-object v7, p2

    invoke-direct/range {v1 .. v7}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$CCQF_iAIdZ2zTYCrKnQ7YsfwXZA;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;)V

    invoke-virtual {v8, v9}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "create<DataInfo> {\n            syncProgressChannel.tempPowersConfig = syncPowers\n            syncProgressChannel.reset()\n            it.onNext(dataInfo)\n            it.onComplete()\n        }.flatMap {\n            sendAndWait(uid, Gen2DeviceInfoCommand(), dataInfo = dataInfo, power = 0.025F * power)\n                    .doOnNext { debug(\"Gen2DeviceInfoCommand finished successfully.\") }\n                    .flatMap { sendSingleCommandWithAck(Gen2StartAmDTPCommand(), uid, dataInfoWrapper, power = 0.025F * power) }\n                    .doOnNext { debug(\"Gen2StartAmDTPCommand finished successfully.\") }\n                    .flatMap { sendSingleCommandWithAck(Gen2ReceiveUserInformationCommand(), uid, it, power = 0.05F * power) }\n                    .doOnNext { debug(\"Gen2ReceiveUserInformationCommand finished successfully.\") }\n                    .flatMap { sendSingleCommandWithAck(Gen2SendUserInformationCommand(pairingConfig.unitsInfoData), uid, it, power = 0.05F * power) }\n                    .doOnNext { debug(\"Gen2SendUserInformationCommand finished successfully.\") }\n                    .flatMap { sendSingleCommandWithAck(Gen2SendBiometricsCommand(pairingConfig.userInfoData), uid, it, power = 0.05F * power) }\n                    .doOnNext { debug(\"Gen2SendBiometricsCommand finished successfully.\") }\n                    .flatMap { sendSingleCommandWithAck(Gen2ReceiveStepsDistanceGoals(), uid, it, power = 0.05F * power) }\n                    .doOnNext { debug(\"Gen2ReceiveStepsDistanceGoals finished successfully.\") }\n                    .flatMap { sendSingleCommandWithAck(Gen2SendStepsDistanceGoal(pairingConfig.goalInfoData), uid, it, power = 0.1F * power) }\n                    .doOnNext { debug(\"Gen2SendStepsDistanceGoal finished successfully.\") }\n                    .flatMap { sendSingleCommandWithAck(Gen2SendCaloriesSleepGoal(pairingConfig.goalInfoData), uid, it, power = 0.1F * power) }\n                    .doOnNext { debug(\"Gen2SendCaloriesSleepGoal finished successfully.\") }\n                    .flatMap { sendSingleCommandWithAck(Gen2SendLanguageCommand(pairingConfig.languageInfoData.locale), uid, it, power = 0.1F * power) }\n                    .doOnNext { debug(\"Gen2SendLanguageCommand finished successfully.\") }\n                    .flatMap { sendSingleCommandWithAck(RTLStatusCommand(), uid, it, power = 0.05F * power) }\n                    .doOnNext { debug(\"RTLStatusCommand finished successfully.\") }\n                    .flatMap { sendSingleCommandWithAck(RTLTimeCommand(), uid, it, power = 0.05F * power) }\n                    .doOnNext { debug(\"RTLTimeCommand finished successfully.\") }\n                    .flatMap { sendSingleCommandWithAck(Gen2ActivityStartLogCommand(), uid, it, power = 0.025F * power) }\n                    .doOnNext {\n                        debug(\"Gen2ActivityStartLogCommand finished successfully.\")\n                        printStartLogs(it.tempActivityLog.tempStartLogs)\n                    }\n                    .flatMap { sendSingleCommandWithAck(Gen2ActivityEndLogCommand(), uid, it, power = 0.025F * power) }\n                    .doOnNext {\n                        debug(\"Gen2ActivityEndLogCommand finished successfully.\")\n                        printEndLogs(it.tempActivityLog.tempEndLogs)\n                    }\n                    .flatMap { sendSingleCommandWithAck(Gen2ActivityDeltaLogCommand(), uid, it, power = 0.08F * power) }\n                    .doOnNext { debug(\"Gen2ActivityDeltaLogCommand finished successfully.\") }\n                    .doOnNext { gen2DataInfo ->\n                        val list = gen2DataInfo.tempActivityLog.exportActivityDataLogs()\n                        gen2DataInfo.activityInfo.activityDataLogs.addAll(list)\n                        gen2DataInfo.activityInfo.activityDataLogs.forEach {\n                            printActivityDeltaLogs(it.deltaLogs)\n                        }\n                    }\n                    .flatMap { sendSingleCommandWithAck(Gen2BackgroundLogCommand(it.rtlData), uid, it, power = 0.025F * power) }\n                    .doOnNext { debug(\"Gen2BackgroundLogCommand finished successfully.\") }\n\n                    .flatMap { sendSingleCommandWithAck(Gen2CleanRTLCommand(), uid, it, power = 0.05F * power) }\n                    .doOnNext { debug(\"Gen2CleanRTLCommand finished successfully.\") }\n                    .flatMap { sendSingleCommandWithAck(Gen2CleanActivityLogCommand(), uid, it, power = 0.05F * power) }\n                    .doOnNext { debug(\"Gen2CleanActivityLogCommand finished successfully.\") }\n                    .flatMap { sendSingleCommandWithAck(Gen2CleanBackgroundLogCommand(), uid, it, power = 0.05F * power) }\n                    .doOnNext { debug(\"Gen2CleanBackgroundLogCommand finished successfully.\") }\n                    .flatMap { sendSingleCommandWithAck(Gen2CleanSleepLogCommand(), uid, it, power = 0.05F * power) }\n                    .doOnNext { debug(\"Gen2CleanSleepLogCommand finished successfully.\") }\n                    // if any error has occurred, send sync end command\n                    // output of this operator should be only ERROR\n                    .onErrorResumeNext(handleSyncError(uid, dataInfoWrapper))\n                    .flatMap { sendSingleCommandWithAck(Gen2StopAmDTPCommand(), uid, it, power = 0.05F * power) }\n                    .doOnNext { debug(\"Gen2StopAmDTPCommand finished successfully.\") }\n                    .doOnNext {\n\n                        val totalSteps = it.dataInfo.activityLogs.sumBy { it.walkingSteps.toInt() }\n                        val totalRunningSteps = it.dataInfo.activityLogs.sumBy { it.runningSteps.toInt() }\n\n                        debug(\"Total log entries: ${it.dataInfo.activityLogs.size}\")\n                        debug(\"Sleep log entries: ${it.dataInfo.activityLogs.count { it.isSleep }}\")\n                        debug(\"Total steps retrieved: ${totalSteps + totalRunningSteps}\")\n                        debug(\"Total number of activities retrieved: ${it.dataInfo.runningLogs.size}\")\n                        debug(\"RTL timestamps: ${it.rtlData}\")\n\n                    }\n                    .map { gen2DataInfo -> reformatDataLogs(gen2DataInfo).dataInfo }\n                    .doOnError {\n                        Log.e(TAG, \"Sync failed. Reason: $it\")\n                        it.printStackTrace()\n                    }\n        }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public transferDataWithProgress(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;F)Lio/reactivex/Observable;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;",
            "F)",
            "Lio/reactivex/Observable<",
            "Lkotlin/Pair<",
            "Ljava/lang/Integer;",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;",
            ">;>;"
        }
    .end annotation

    const-string v0, "uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pairingConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 569
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->observeProgress()Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$XfvnlLrEJGC_BlKDEDknWsRbyGc;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$XfvnlLrEJGC_BlKDEDknWsRbyGc;

    .line 570
    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v0

    check-cast v0, Lio/reactivex/ObservableSource;

    .line 571
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;

    const/4 v4, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v2, p1

    move-object v3, p2

    move v5, p3

    invoke-static/range {v1 .. v7}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor$DefaultImpls;->transferData$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;FILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p1

    .line 572
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$S03QZexCCQ_dsa_q8KPmTaWhhuA;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$S03QZexCCQ_dsa_q8KPmTaWhhuA;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object p2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$8aB-WqMEj3rXJivPsoXTLLclC7A;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$8aB-WqMEj3rXJivPsoXTLLclC7A;

    .line 573
    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    check-cast p1, Lio/reactivex/ObservableSource;

    .line 568
    invoke-static {v0, p1}, Lio/reactivex/Observable;->merge(Lio/reactivex/ObservableSource;Lio/reactivex/ObservableSource;)Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "merge(\n                observeProgress()\n                        .map { progress -> Pair(progress, null) },\n                transferData(uid, pairingConfig, power = phasePower)\n                        .doOnNext { debug(\"All messages sent\") }\n                        .map { data -> Pair(100, data) }\n        )"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
