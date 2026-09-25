.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsExecutor;
.super Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;
.source "SettingsLiteCommunicator.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSettingsLiteCommunicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingsLiteCommunicator.kt\npowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsExecutor\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,96:1\n11328#2:97\n11663#2,3:98\n*S KotlinDebug\n*F\n+ 1 SettingsLiteCommunicator.kt\npowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsExecutor\n*L\n91#1:97\n91#1:98,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\'\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\r0\u000c\"\u00020\r\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsExecutor;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;",
        "communicator",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;",
        "deviceCommunicationQueuer",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;)V",
        "sendSettingCommand",
        "Lio/reactivex/Completable;",
        "deviceID",
        "",
        "commands",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;",
        "(Ljava/lang/String;[Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;)Lio/reactivex/Completable;",
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
.field private final deviceCommunicationQueuer:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;)V
    .locals 1

    const-string v0, "communicator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceCommunicationQueuer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;)V

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsExecutor;->deviceCommunicationQueuer:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;

    return-void
.end method

.method public static synthetic lambda$gj_Jp4oFjS99hs22QVU8E-mW67M([Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsExecutor;Ljava/lang/String;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsExecutor;->sendSettingCommand$lambda-1([Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsExecutor;Ljava/lang/String;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method private static final sendSettingCommand$lambda-1([Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsExecutor;Ljava/lang/String;)Lio/reactivex/CompletableSource;
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "$commands"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "this$0"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "$deviceID"

    move-object/from16 v14, p2

    invoke-static {v14, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    new-instance v2, Ljava/util/ArrayList;

    array-length v3, v0

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v2, Ljava/util/Collection;

    .line 98
    array-length v15, v0

    const/4 v3, 0x0

    const/4 v13, 0x0

    :goto_0
    if-ge v13, v15, :cond_0

    aget-object v4, v0, v13

    .line 91
    move-object v3, v1

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;

    new-instance v6, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x3f

    const/16 v24, 0x0

    move-object/from16 v16, v6

    invoke-direct/range {v16 .. v24}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;-><init>(Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2TempActivityInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2LogsCount;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v7, 0x0

    const/high16 v8, 0x3f800000    # 1.0f

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/16 v12, 0x68

    const/16 v16, 0x0

    move-object/from16 v5, p2

    move/from16 v17, v13

    move-object/from16 v13, v16

    invoke-static/range {v3 .. v13}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->sendSingleCommandWithAck$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;FJLjava/lang/String;ILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v13, v17, 0x1

    goto :goto_0

    .line 100
    :cond_0
    check-cast v2, Ljava/util/List;

    .line 97
    check-cast v2, Ljava/lang/Iterable;

    .line 91
    invoke-static {v2}, Lio/reactivex/Observable;->concat(Ljava/lang/Iterable;)Lio/reactivex/Observable;

    move-result-object v4

    const-string v0, "concat(commands.map { sendSingleCommandWithAck(it, deviceID, Gen2DataInfo(), power = 1F) })"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v8}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;-><init>(Lio/reactivex/Observable;Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 93
    iget-object v1, v1, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsExecutor;->deviceCommunicationQueuer:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;

    invoke-interface {v1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;->queue(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/Observable;->ignoreElements()Lio/reactivex/Completable;

    move-result-object v0

    check-cast v0, Lio/reactivex/CompletableSource;

    return-object v0
.end method


# virtual methods
.method public final varargs sendSettingCommand(Ljava/lang/String;[Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;)Lio/reactivex/Completable;
    .locals 1

    const-string v0, "deviceID"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "commands"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/-$$Lambda$SettingsExecutor$gj_Jp4oFjS99hs22QVU8E-mW67M;

    invoke-direct {v0, p2, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/-$$Lambda$SettingsExecutor$gj_Jp4oFjS99hs22QVU8E-mW67M;-><init>([Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsExecutor;Ljava/lang/String;)V

    invoke-static {v0}, Lio/reactivex/Completable;->defer(Ljava/util/concurrent/Callable;)Lio/reactivex/Completable;

    move-result-object p1

    const-string p2, "defer {\n        val operationObs = Observable.concat(commands.map { sendSingleCommandWithAck(it, deviceID, Gen2DataInfo(), power = 1F) })\n        val operation = DeviceCommunicationOperation(operationObs)\n        deviceCommunicationQueuer.queue(operation).ignoreElements()\n    }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
