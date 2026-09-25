.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityEndLogCommand;
.super Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/AccumulatedGen2Command;
.source "Gen2ActivityEndLogCommand.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J\u0008\u0010\u0008\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u000c\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0004H\u0014\u00a8\u0006\u000e"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityEndLogCommand;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/AccumulatedGen2Command;",
        "()V",
        "extractResponse",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;",
        "payloadData",
        "",
        "dataInfo",
        "getParsingError",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$ActivityEndLogSizeMismatch;",
        "parseSingleLog",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityEndLog;",
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

.annotation runtime Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/UnusedCommandResult;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 14
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs$Gen2ActivityEndLogCommandId;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs$Gen2ActivityEndLogCommandId;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;

    invoke-direct {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/AccumulatedGen2Command;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;)V

    return-void
.end method

.method private final parseSingleLog([B)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityEndLog;
    .locals 41

    .line 58
    invoke-static/range {p1 .. p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 60
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 62
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v1

    .line 63
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v2

    .line 64
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v3

    .line 65
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v10

    .line 66
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v11

    .line 67
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v12

    .line 68
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v13

    .line 69
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v14

    .line 70
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v15

    .line 71
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v16

    .line 72
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v17

    .line 73
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v22

    .line 77
    invoke-static {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ActivityLogExtensionsKt;->parseValueToFloat(I)F

    move-result v36

    .line 78
    invoke-static {v3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ActivityLogExtensionsKt;->parseValueToFloat(I)F

    move-result v37

    const/4 v5, 0x0

    const/16 v6, 0x11

    const/4 v7, 0x0

    const/4 v8, 0x4

    const/4 v9, 0x0

    move v4, v10

    .line 80
    invoke-static/range {v4 .. v9}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->extractNumber$default(IIIZILjava/lang/Object;)I

    move-result v26

    const/16 v5, 0x12

    const/16 v6, 0x19

    .line 81
    invoke-static/range {v4 .. v9}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->extractNumber$default(IIIZILjava/lang/Object;)I

    move-result v34

    const/4 v5, 0x0

    const/16 v6, 0x11

    move v4, v11

    .line 83
    invoke-static/range {v4 .. v9}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->extractNumber$default(IIIZILjava/lang/Object;)I

    move-result v25

    const/16 v5, 0x12

    const/16 v6, 0x19

    .line 84
    invoke-static/range {v4 .. v9}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->extractNumber$default(IIIZILjava/lang/Object;)I

    move-result v35

    const/4 v5, 0x0

    const/16 v6, 0x12

    move v4, v12

    .line 86
    invoke-static/range {v4 .. v9}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->extractNumber$default(IIIZILjava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Lkotlin/UInt;->constructor-impl(I)I

    move-result v0

    int-to-long v2, v0

    const-wide v4, 0xffffffffL

    and-long v23, v2, v4

    const/4 v5, 0x0

    const/16 v6, 0x17

    move v4, v13

    .line 88
    invoke-static/range {v4 .. v9}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->extractNumber$default(IIIZILjava/lang/Object;)I

    move-result v27

    const/16 v5, 0x18

    const/16 v6, 0x1e

    .line 89
    invoke-static/range {v4 .. v9}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->extractNumber$default(IIIZILjava/lang/Object;)I

    move-result v30

    const/4 v5, 0x0

    const/16 v6, 0x17

    move v4, v14

    .line 92
    invoke-static/range {v4 .. v9}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->extractNumber$default(IIIZILjava/lang/Object;)I

    move-result v28

    const/16 v5, 0x18

    const/16 v6, 0x1e

    .line 93
    invoke-static/range {v4 .. v9}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->extractNumber$default(IIIZILjava/lang/Object;)I

    move-result v29

    const/4 v5, 0x0

    const/16 v6, 0x11

    move v4, v15

    .line 95
    invoke-static/range {v4 .. v9}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->extractNumber$default(IIIZILjava/lang/Object;)I

    move-result v31

    const/16 v5, 0x12

    const/16 v6, 0x19

    .line 96
    invoke-static/range {v4 .. v9}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->extractNumber$default(IIIZILjava/lang/Object;)I

    move-result v39

    const/4 v5, 0x0

    const/16 v6, 0x11

    move/from16 v4, v16

    .line 99
    invoke-static/range {v4 .. v9}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->extractNumber$default(IIIZILjava/lang/Object;)I

    move-result v32

    const/16 v5, 0x12

    const/16 v6, 0x19

    .line 100
    invoke-static/range {v4 .. v9}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->extractNumber$default(IIIZILjava/lang/Object;)I

    move-result v40

    const/4 v5, 0x0

    const/16 v6, 0x1d

    move/from16 v4, v17

    .line 103
    invoke-static/range {v4 .. v9}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->extractNumber$default(IIIZILjava/lang/Object;)I

    move-result v33

    .line 106
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityEndLog;

    move-object/from16 v18, v0

    int-to-long v1, v1

    move-wide/from16 v20, v1

    const/16 v19, 0x0

    const/16 v38, 0x0

    invoke-direct/range {v18 .. v40}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityEndLog;-><init>(IJIJIIIIIIIIIIIFFIII)V

    return-object v0
.end method


# virtual methods
.method public extractResponse([BLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;
    .locals 4

    const-string v0, "payloadData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataInfo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityEndLogCommand;->getData()[B

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/collections/ArraysKt;->plus([B[B)[B

    move-result-object p1

    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    .line 28
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityEndLogCommand;->clearAcc()V

    const/16 v0, 0x30

    new-array v1, v0, [B

    .line 32
    :goto_0
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->limit()I

    move-result v2

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v3

    sub-int/2addr v2, v3

    if-lt v2, v0, :cond_0

    .line 33
    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 35
    invoke-direct {p0, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityEndLogCommand;->parseSingleLog([B)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityEndLog;

    move-result-object v2

    .line 38
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;->getTempActivityLog()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2TempActivityInfo;

    move-result-object v3

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2TempActivityInfo;->getTempEndLogs()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 40
    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityEndLogCommand;->sendFinalProgress(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V

    goto :goto_0

    .line 44
    :cond_0
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "payloadBuffer"

    .line 45
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ByteArrayExtensionsKt;->copyRemainingData(Ljava/nio/ByteBuffer;)[B

    move-result-object p1

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityEndLogCommand;->appendData([B)Z

    .line 49
    :cond_1
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;->getDataInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->setParsingFinished(Z)V

    .line 50
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;->getDataInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->setParsingStarted(Z)V

    .line 52
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;->getDataInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object p1

    const-wide/32 v0, 0xea60

    invoke-virtual {p1, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->setActivityLogInterval(J)V

    return-object p2
.end method

.method public getParsingError()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$ActivityEndLogSizeMismatch;
    .locals 1

    .line 16
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$ActivityEndLogSizeMismatch;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$ActivityEndLogSizeMismatch;

    return-object v0
.end method

.method public bridge synthetic getParsingError()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError;
    .locals 1

    .line 13
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityEndLogCommand;->getParsingError()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$ActivityEndLogSizeMismatch;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError;

    return-object v0
.end method

.method protected sendFinalProgress(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 3

    const-string v0, "dataInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;->getGen2LogsCount()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2LogsCount;

    move-result-object p1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2LogsCount;->getActivityEndLog()J

    move-result-wide v0

    long-to-int p1, v0

    .line 21
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityEndLogCommand;->getSyncChannel()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannel;

    move-result-object v0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityEndLogCommand;->getCommandId()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;

    move-result-object v1

    add-int/lit8 p1, p1, 0x1

    int-to-float p1, p1

    const/high16 v2, 0x42c80000    # 100.0f

    div-float/2addr v2, p1

    invoke-virtual {v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannel;->onProgress(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;F)V

    return-void
.end method
