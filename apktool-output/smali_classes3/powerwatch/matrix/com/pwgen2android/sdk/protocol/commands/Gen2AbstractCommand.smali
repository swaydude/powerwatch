.class public abstract Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand;
.super Ljava/lang/Object;
.source "Gen2Comands.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGen2Comands.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Gen2Comands.kt\npowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand\n+ 2 KoinComponent.kt\norg/koin/core/KoinComponentKt\n+ 3 Koin.kt\norg/koin/core/Koin\n+ 4 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,470:1\n52#2,4:471\n52#3:475\n55#4:476\n*S KotlinDebug\n*F\n+ 1 Gen2Comands.kt\npowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand\n*L\n55#1:471,4\n55#1:475\n55#1:476\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0008&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0008\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0012H\u0014R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\u00088DX\u0084\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u0017"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;",
        "commandId",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;)V",
        "getCommandId",
        "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;",
        "syncChannel",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannel;",
        "getSyncChannel",
        "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannel;",
        "syncChannel$delegate",
        "Lkotlin/Lazy;",
        "getCoreCommand",
        "",
        "onSuccess",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;",
        "dataInfo",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;",
        "printCommandId",
        "",
        "sendFinalProgress",
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
.field private final commandId:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;

.field private final syncChannel$delegate:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;)V
    .locals 3

    const-string v0, "commandId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand;->commandId:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;

    .line 55
    move-object p1, p0

    check-cast p1, Lorg/koin/core/KoinComponent;

    const/4 v0, 0x0

    .line 471
    move-object v1, v0

    check-cast v1, Lorg/koin/core/qualifier/Qualifier;

    .line 472
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 474
    invoke-interface {p1}, Lorg/koin/core/KoinComponent;->getKoin()Lorg/koin/core/Koin;

    move-result-object p1

    .line 475
    invoke-virtual {p1}, Lorg/koin/core/Koin;->getRootScope()Lorg/koin/core/scope/Scope;

    move-result-object p1

    .line 476
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand$special$$inlined$inject$default$1;

    invoke-direct {v2, p1, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand$special$$inlined$inject$default$1;-><init>(Lorg/koin/core/scope/Scope;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)V

    check-cast v2, Lkotlin/jvm/functions/Function0;

    invoke-static {v2}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    .line 55
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand;->syncChannel$delegate:Lkotlin/Lazy;

    return-void
.end method


# virtual methods
.method public createPayload()[B
    .locals 1

    .line 50
    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command$DefaultImpls;->createPayload(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;)[B

    move-result-object v0

    return-object v0
.end method

.method public extractAndCompareCRC([B)Z
    .locals 0

    .line 50
    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command$DefaultImpls;->extractAndCompareCRC(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;[B)Z

    move-result p1

    return p1
.end method

.method public extractPayload([B)Lkotlin/Pair;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B)",
            "Lkotlin/Pair<",
            "Ljava/lang/Boolean;",
            "[B>;"
        }
    .end annotation

    .line 50
    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command$DefaultImpls;->extractPayload(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;[B)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method

.method public extractProgress(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)F
    .locals 1

    .line 50
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command$DefaultImpls;->extractProgress(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)F

    move-result p1

    return p1
.end method

.method public extractResponse([BLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;
    .locals 0

    .line 50
    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command$DefaultImpls;->extractResponse(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;[BLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object p1

    return-object p1
.end method

.method public extractResponse([BLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;
    .locals 0

    .line 50
    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command$DefaultImpls;->extractResponse(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;[BLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;

    move-result-object p1

    return-object p1
.end method

.method public extractResponseType(Lkotlin/Pair;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolError;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Ljava/lang/Boolean;",
            "[B>;)",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolError;"
        }
    .end annotation

    .line 50
    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command$DefaultImpls;->extractResponseType(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Lkotlin/Pair;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolError;

    move-result-object p1

    return-object p1
.end method

.method protected final getCommandId()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;
    .locals 1

    .line 50
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand;->commandId:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;

    return-object v0
.end method

.method public getCommandType()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;
    .locals 1

    .line 50
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command$DefaultImpls;->getCommandType(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    move-result-object v0

    return-object v0
.end method

.method public getCoreCommand()[B
    .locals 1

    .line 51
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand;->commandId:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;->getId()[B

    move-result-object v0

    return-object v0
.end method

.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 50
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method public getSendingData()[B
    .locals 1

    .line 50
    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command$DefaultImpls;->getSendingData(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;)[B

    move-result-object v0

    return-object v0
.end method

.method protected final getSyncChannel()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannel;
    .locals 1

    .line 55
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand;->syncChannel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannel;

    return-object v0
.end method

.method public onSuccess(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;
    .locals 1

    const-string v0, "dataInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand;->sendFinalProgress(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V

    .line 63
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command$DefaultImpls;->onSuccess(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;

    move-result-object p1

    return-object p1
.end method

.method public parseReceivedData([BLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;
    .locals 0

    .line 50
    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command$DefaultImpls;->parseReceivedData(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;[BLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object p1

    return-object p1
.end method

.method public parseReceivedData([BLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;
    .locals 0

    .line 50
    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command$DefaultImpls;->parseReceivedData(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;[BLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;

    move-result-object p1

    return-object p1
.end method

.method public printCommandId()Ljava/lang/String;
    .locals 1

    .line 53
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand;->commandId:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;->getCommandId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected sendFinalProgress(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 2

    const-string v0, "dataInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand;->getSyncChannel()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannel;

    move-result-object p1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand;->commandId:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;

    const/high16 v1, 0x42c80000    # 100.0f

    invoke-virtual {p1, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannel;->onProgress(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;F)V

    return-void
.end method
