.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLogCommand;
.super Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/AccumulatedGen2Command;
.source "Gen2ActivityStartLogCommand.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J\u0008\u0010\u0008\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000c\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0004H\u0014\u00a8\u0006\u000e"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLogCommand;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/AccumulatedGen2Command;",
        "()V",
        "extractResponse",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;",
        "payloadData",
        "",
        "dataInfo",
        "getParsingError",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$ActivityStartLogSizeMismatch;",
        "parseSingleLog",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLog;",
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
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs$Gen2ActivityStartLogCommandId;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs$Gen2ActivityStartLogCommandId;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;

    invoke-direct {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/AccumulatedGen2Command;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;)V

    return-void
.end method


# virtual methods
.method public extractResponse([BLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;
    .locals 4

    const-string v0, "payloadData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataInfo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLogCommand;->getData()[B

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/collections/ArraysKt;->plus([B[B)[B

    move-result-object p1

    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    .line 27
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLogCommand;->clearAcc()V

    const/16 v0, 0x30

    new-array v1, v0, [B

    .line 30
    :goto_0
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->limit()I

    move-result v2

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v3

    sub-int/2addr v2, v3

    if-lt v2, v0, :cond_0

    .line 31
    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 33
    invoke-virtual {p0, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLogCommand;->parseSingleLog([B)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLog;

    move-result-object v2

    .line 36
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;->getTempActivityLog()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2TempActivityInfo;

    move-result-object v3

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2TempActivityInfo;->getTempStartLogs()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 38
    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLogCommand;->sendFinalProgress(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V

    goto :goto_0

    .line 42
    :cond_0
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "payloadBuffer"

    .line 43
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ByteArrayExtensionsKt;->copyRemainingData(Ljava/nio/ByteBuffer;)[B

    move-result-object p1

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLogCommand;->appendData([B)Z

    .line 47
    :cond_1
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;->getDataInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->setParsingFinished(Z)V

    .line 48
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;->getDataInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->setParsingStarted(Z)V

    .line 50
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;->getDataInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object p1

    const-wide/32 v0, 0xea60

    invoke-virtual {p1, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->setActivityLogInterval(J)V

    return-object p2
.end method

.method public getParsingError()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$ActivityStartLogSizeMismatch;
    .locals 1

    .line 16
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$ActivityStartLogSizeMismatch;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$ActivityStartLogSizeMismatch;

    return-object v0
.end method

.method public bridge synthetic getParsingError()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError;
    .locals 1

    .line 13
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLogCommand;->getParsingError()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$ActivityStartLogSizeMismatch;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError;

    return-object v0
.end method

.method public final parseSingleLog([B)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLog;
    .locals 41

    const-string v0, "payloadData"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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

    move-result v23

    const/4 v5, 0x0

    const/16 v6, 0x11

    const/4 v7, 0x0

    const/4 v8, 0x4

    const/4 v9, 0x0

    move v4, v10

    .line 80
    invoke-static/range {v4 .. v9}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->extractNumber$default(IIIZILjava/lang/Object;)I

    move-result v0

    int-to-long v8, v0

    const/16 v5, 0x12

    const/16 v6, 0x19

    const/4 v0, 0x4

    const/16 v18, 0x0

    move-wide v9, v8

    move v8, v0

    move-wide/from16 v39, v9

    move-object/from16 v9, v18

    .line 81
    invoke-static/range {v4 .. v9}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->extractNumber$default(IIIZILjava/lang/Object;)I

    move-result v26

    const/4 v5, 0x0

    const/16 v6, 0x11

    const/4 v8, 0x4

    const/4 v9, 0x0

    move v4, v11

    .line 83
    invoke-static/range {v4 .. v9}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->extractNumber$default(IIIZILjava/lang/Object;)I

    move-result v0

    const/16 v5, 0x12

    const/16 v6, 0x19

    .line 84
    invoke-static/range {v4 .. v9}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->extractNumber$default(IIIZILjava/lang/Object;)I

    move-result v25

    const/4 v5, 0x0

    const/16 v6, 0x12

    move v4, v12

    .line 86
    invoke-static/range {v4 .. v9}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->extractNumber$default(IIIZILjava/lang/Object;)I

    move-result v4

    int-to-long v10, v4

    const/16 v6, 0x17

    move v4, v13

    .line 88
    invoke-static/range {v4 .. v9}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->extractNumber$default(IIIZILjava/lang/Object;)I

    move-result v31

    const/16 v5, 0x18

    const/16 v6, 0x1e

    .line 89
    invoke-static/range {v4 .. v9}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->extractNumber$default(IIIZILjava/lang/Object;)I

    move-result v34

    const/4 v5, 0x0

    const/16 v6, 0x17

    move v4, v14

    .line 92
    invoke-static/range {v4 .. v9}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->extractNumber$default(IIIZILjava/lang/Object;)I

    move-result v32

    const/16 v5, 0x18

    const/16 v6, 0x1e

    .line 93
    invoke-static/range {v4 .. v9}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->extractNumber$default(IIIZILjava/lang/Object;)I

    move-result v33

    const/4 v5, 0x0

    const/16 v6, 0x11

    move v4, v15

    .line 95
    invoke-static/range {v4 .. v9}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->extractNumber$default(IIIZILjava/lang/Object;)I

    move-result v27

    const/16 v5, 0x12

    const/16 v6, 0x19

    .line 96
    invoke-static/range {v4 .. v9}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->extractNumber$default(IIIZILjava/lang/Object;)I

    move-result v12

    const/4 v5, 0x0

    const/16 v6, 0x11

    move/from16 v4, v16

    .line 99
    invoke-static/range {v4 .. v9}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->extractNumber$default(IIIZILjava/lang/Object;)I

    move-result v28

    const/16 v5, 0x12

    const/16 v6, 0x19

    .line 100
    invoke-static/range {v4 .. v9}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->extractNumber$default(IIIZILjava/lang/Object;)I

    move-result v35

    const/4 v5, 0x0

    const/16 v6, 0x1d

    move/from16 v4, v17

    .line 103
    invoke-static/range {v4 .. v9}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->extractNumber$default(IIIZILjava/lang/Object;)I

    move-result v29

    .line 107
    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$STATIONARY;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$STATIONARY;

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$STATIONARY;->getType()I

    move-result v4

    if-ne v12, v4, :cond_0

    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$STATIONARY;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$STATIONARY;

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;

    :goto_0
    move-object/from16 v19, v4

    goto/16 :goto_1

    .line 108
    :cond_0
    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$WALKING;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$WALKING;

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$WALKING;->getType()I

    move-result v4

    if-ne v12, v4, :cond_1

    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$WALKING;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$WALKING;

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;

    goto :goto_0

    .line 109
    :cond_1
    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$RUNNING;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$RUNNING;

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$RUNNING;->getType()I

    move-result v4

    if-ne v12, v4, :cond_2

    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$RUNNING;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$RUNNING;

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;

    goto :goto_0

    .line 110
    :cond_2
    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$JOGGING;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$JOGGING;

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$JOGGING;->getType()I

    move-result v4

    if-ne v12, v4, :cond_3

    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$JOGGING;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$JOGGING;

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;

    goto :goto_0

    .line 111
    :cond_3
    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$BIKING;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$BIKING;

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$BIKING;->getType()I

    move-result v4

    if-ne v12, v4, :cond_4

    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$BIKING;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$BIKING;

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;

    goto :goto_0

    .line 112
    :cond_4
    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$DRIVING;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$DRIVING;

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$DRIVING;->getType()I

    move-result v4

    if-ne v12, v4, :cond_5

    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$DRIVING;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$DRIVING;

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;

    goto :goto_0

    .line 113
    :cond_5
    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_WALKING;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_WALKING;

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_WALKING;->getType()I

    move-result v4

    if-ne v12, v4, :cond_6

    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_WALKING;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_WALKING;

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;

    goto :goto_0

    .line 114
    :cond_6
    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_RUNNING;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_RUNNING;

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_RUNNING;->getType()I

    move-result v4

    if-ne v12, v4, :cond_7

    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_RUNNING;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_RUNNING;

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;

    goto :goto_0

    .line 115
    :cond_7
    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_JOGGING;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_JOGGING;

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_JOGGING;->getType()I

    move-result v4

    if-ne v12, v4, :cond_8

    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_JOGGING;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_JOGGING;

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;

    goto :goto_0

    .line 116
    :cond_8
    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_BIKING;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_BIKING;

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_BIKING;->getType()I

    move-result v4

    if-ne v12, v4, :cond_9

    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_BIKING;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_BIKING;

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;

    goto :goto_0

    .line 117
    :cond_9
    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_HIIT;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_HIIT;

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_HIIT;->getType()I

    move-result v4

    if-ne v12, v4, :cond_a

    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_HIIT;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_HIIT;

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;

    goto/16 :goto_0

    .line 118
    :cond_a
    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$UNKNOWN;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$UNKNOWN;

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;

    goto/16 :goto_0

    .line 122
    :goto_1
    new-instance v24, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;

    move-object/from16 v36, v24

    invoke-direct/range {v24 .. v29}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;-><init>(IIIII)V

    .line 130
    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLog;

    move-object/from16 v18, v4

    const/16 v20, 0x0

    int-to-long v5, v1

    move-wide/from16 v21, v5

    .line 134
    invoke-static {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ActivityLogExtensionsKt;->parseValueToFloat(I)F

    move-result v24

    .line 135
    invoke-static {v3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ActivityLogExtensionsKt;->parseValueToFloat(I)F

    move-result v25

    const/16 v26, 0x0

    move-wide/from16 v1, v39

    long-to-int v2, v1

    move/from16 v30, v2

    const/16 v37, 0x42

    const/16 v38, 0x0

    move-wide/from16 v27, v10

    move/from16 v29, v0

    .line 130
    invoke-direct/range {v18 .. v38}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLog;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;IJIFFFJIIIIIIILpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4
.end method

.method protected sendFinalProgress(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 3

    const-string v0, "dataInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;->getGen2LogsCount()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2LogsCount;

    move-result-object p1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2LogsCount;->getActivityStartLogs()J

    move-result-wide v0

    long-to-int p1, v0

    .line 20
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLogCommand;->getSyncChannel()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannel;

    move-result-object v0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLogCommand;->getCommandId()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;

    move-result-object v1

    add-int/lit8 p1, p1, 0x1

    int-to-float p1, p1

    const/high16 v2, 0x42c80000    # 100.0f

    div-float/2addr v2, p1

    invoke-virtual {v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannel;->onProgress(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;F)V

    return-void
.end method
