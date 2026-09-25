.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Ver3ActivityHeaderCommand;
.super Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/AccumulatedGen2Command;
.source "Gen2Ver3ActivityHeaderCommand.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J\u0008\u0010\u0008\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0014\u00a8\u0006\u000f"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Ver3ActivityHeaderCommand;",
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
        "",
        "infoToFillUp",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2TempActivityInfo;",
        "sendFinalProgress",
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

    .line 12
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs$Gen2ActivityHeaderLogCommandId;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs$Gen2ActivityHeaderLogCommandId;

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

    .line 24
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Ver3ActivityHeaderCommand;->getData()[B

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/collections/ArraysKt;->plus([B[B)[B

    move-result-object p1

    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    .line 25
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Ver3ActivityHeaderCommand;->clearAcc()V

    const/16 v0, 0x30

    new-array v1, v0, [B

    .line 28
    :goto_0
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->limit()I

    move-result v2

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v3

    sub-int/2addr v2, v3

    if-lt v2, v0, :cond_0

    .line 29
    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 31
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;->getTempActivityLog()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2TempActivityInfo;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Ver3ActivityHeaderCommand;->parseSingleLog([BLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2TempActivityInfo;)V

    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 36
    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Ver3ActivityHeaderCommand;->sendFinalProgress(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V

    goto :goto_0

    .line 40
    :cond_0
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "payloadBuffer"

    .line 41
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ByteArrayExtensionsKt;->copyRemainingData(Ljava/nio/ByteBuffer;)[B

    move-result-object p1

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Ver3ActivityHeaderCommand;->appendData([B)Z

    .line 45
    :cond_1
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;->getDataInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->setParsingFinished(Z)V

    .line 46
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;->getDataInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->setParsingStarted(Z)V

    .line 48
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;->getDataInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object p1

    const-wide/32 v0, 0xea60

    invoke-virtual {p1, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->setActivityLogInterval(J)V

    return-object p2
.end method

.method public getParsingError()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$ActivityStartLogSizeMismatch;
    .locals 1

    .line 14
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$ActivityStartLogSizeMismatch;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$ActivityStartLogSizeMismatch;

    return-object v0
.end method

.method public bridge synthetic getParsingError()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Ver3ActivityHeaderCommand;->getParsingError()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$ActivityStartLogSizeMismatch;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError;

    return-object v0
.end method

.method public final parseSingleLog([BLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2TempActivityInfo;)V
    .locals 28

    const-string v0, "payloadData"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "infoToFillUp"

    move-object/from16 v2, p2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    invoke-static/range {p1 .. p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 58
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 60
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v1

    .line 61
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v10

    .line 62
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v9

    .line 63
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v11

    .line 64
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v12

    .line 65
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v13

    .line 66
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v14

    .line 67
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v15

    .line 68
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v16

    .line 69
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v17

    .line 70
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v18

    .line 71
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v0

    const/4 v4, 0x0

    const/4 v5, 0x5

    const/4 v6, 0x0

    const/4 v7, 0x4

    const/4 v8, 0x0

    move v3, v1

    .line 74
    invoke-static/range {v3 .. v8}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->extractNumber$default(IIIZILjava/lang/Object;)I

    move-result v8

    const/4 v4, 0x6

    const/16 v5, 0xd

    const/16 v19, 0x0

    move v2, v8

    move-object/from16 v8, v19

    .line 75
    invoke-static/range {v3 .. v8}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->extractNumber$default(IIIZILjava/lang/Object;)I

    move-result v21

    const/16 v4, 0xe

    const/16 v5, 0x1f

    const/4 v8, 0x0

    .line 76
    invoke-static/range {v3 .. v8}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->extractNumber$default(IIIZILjava/lang/Object;)I

    move-result v1

    .line 79
    invoke-static {v11}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ActivityLogExtensionsKt;->parseValueToFloat(I)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    const/16 v22, 0x0

    goto :goto_0

    :cond_0
    invoke-static {v11}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ActivityLogExtensionsKt;->parseValueToFloat(I)F

    move-result v3

    move/from16 v22, v3

    .line 80
    :goto_0
    invoke-static {v12}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ActivityLogExtensionsKt;->parseValueToFloat(I)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-eqz v3, :cond_1

    const/16 v23, 0x0

    goto :goto_1

    :cond_1
    invoke-static {v12}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ActivityLogExtensionsKt;->parseValueToFloat(I)F

    move-result v3

    move/from16 v23, v3

    :goto_1
    const/4 v4, 0x0

    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v7, 0x4

    const/4 v8, 0x0

    move v3, v13

    .line 85
    invoke-static/range {v3 .. v8}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->extractNumber$default(IIIZILjava/lang/Object;)I

    move-result v12

    const/16 v5, 0x17

    move v3, v14

    .line 87
    invoke-static/range {v3 .. v8}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->extractNumber$default(IIIZILjava/lang/Object;)I

    move-result v26

    const/16 v4, 0x18

    const/16 v5, 0x1f

    .line 88
    invoke-static/range {v3 .. v8}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->extractNumber$default(IIIZILjava/lang/Object;)I

    move-result v27

    const/4 v4, 0x0

    const/16 v5, 0x8

    move v3, v15

    .line 90
    invoke-static/range {v3 .. v8}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->extractNumber$default(IIIZILjava/lang/Object;)I

    move-result v19

    const/16 v4, 0x9

    const/16 v5, 0x11

    .line 91
    invoke-static/range {v3 .. v8}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->extractNumber$default(IIIZILjava/lang/Object;)I

    move-result v20

    const/16 v4, 0x12

    const/16 v5, 0x19

    .line 92
    invoke-static/range {v3 .. v8}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->extractNumber$default(IIIZILjava/lang/Object;)I

    move-result v11

    const/4 v4, 0x0

    const/16 v5, 0x12

    move/from16 v3, v16

    .line 94
    invoke-static/range {v3 .. v8}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->extractNumber$default(IIIZILjava/lang/Object;)I

    move-result v13

    .line 101
    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$STATIONARY;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$STATIONARY;

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$STATIONARY;->getType()I

    move-result v3

    if-ne v11, v3, :cond_2

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$STATIONARY;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$STATIONARY;

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;

    :goto_2
    move-object v14, v3

    goto/16 :goto_3

    .line 102
    :cond_2
    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$WALKING;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$WALKING;

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$WALKING;->getType()I

    move-result v3

    if-ne v11, v3, :cond_3

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$WALKING;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$WALKING;

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;

    goto :goto_2

    .line 103
    :cond_3
    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$RUNNING;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$RUNNING;

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$RUNNING;->getType()I

    move-result v3

    if-ne v11, v3, :cond_4

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$RUNNING;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$RUNNING;

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;

    goto :goto_2

    .line 104
    :cond_4
    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$JOGGING;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$JOGGING;

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$JOGGING;->getType()I

    move-result v3

    if-ne v11, v3, :cond_5

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$JOGGING;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$JOGGING;

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;

    goto :goto_2

    .line 105
    :cond_5
    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$BIKING;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$BIKING;

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$BIKING;->getType()I

    move-result v3

    if-ne v11, v3, :cond_6

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$BIKING;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$BIKING;

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;

    goto :goto_2

    .line 106
    :cond_6
    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$DRIVING;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$DRIVING;

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$DRIVING;->getType()I

    move-result v3

    if-ne v11, v3, :cond_7

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$DRIVING;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$DRIVING;

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;

    goto :goto_2

    .line 107
    :cond_7
    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_WALKING;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_WALKING;

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_WALKING;->getType()I

    move-result v3

    if-ne v11, v3, :cond_8

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_WALKING;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_WALKING;

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;

    goto :goto_2

    .line 108
    :cond_8
    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_RUNNING;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_RUNNING;

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_RUNNING;->getType()I

    move-result v3

    if-ne v11, v3, :cond_9

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_RUNNING;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_RUNNING;

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;

    goto :goto_2

    .line 109
    :cond_9
    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_JOGGING;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_JOGGING;

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_JOGGING;->getType()I

    move-result v3

    if-ne v11, v3, :cond_a

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_JOGGING;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_JOGGING;

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;

    goto :goto_2

    .line 110
    :cond_a
    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_BIKING;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_BIKING;

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_BIKING;->getType()I

    move-result v3

    if-ne v11, v3, :cond_b

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_BIKING;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_BIKING;

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;

    goto :goto_2

    .line 111
    :cond_b
    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_HIIT;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_HIIT;

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_HIIT;->getType()I

    move-result v3

    if-ne v11, v3, :cond_c

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_HIIT;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_HIIT;

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;

    goto/16 :goto_2

    .line 112
    :cond_c
    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$UNKNOWN;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$UNKNOWN;

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;

    goto/16 :goto_2

    .line 116
    :goto_3
    new-instance v24, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;

    move-object/from16 v3, v24

    move/from16 v4, v20

    move/from16 v5, v19

    move/from16 v6, v17

    move/from16 v7, v18

    move v8, v0

    invoke-direct/range {v3 .. v8}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;-><init>(IIIII)V

    if-eqz v2, :cond_e

    const/4 v3, 0x1

    if-eq v2, v3, :cond_d

    goto :goto_4

    .line 146
    :cond_d
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityEndLog;

    move-object v3, v2

    int-to-long v5, v9

    int-to-long v8, v13

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    move/from16 v4, v21

    move v7, v10

    move v10, v1

    move v1, v12

    move/from16 v12, v26

    move/from16 v14, v27

    move/from16 v16, v17

    move/from16 v17, v18

    move/from16 v18, v0

    move/from16 v21, v22

    move/from16 v22, v23

    move/from16 v23, v1

    invoke-direct/range {v3 .. v25}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityEndLog;-><init>(IJIJIIIIIIIIIIIFFIII)V

    .line 168
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2TempActivityInfo;->getTempEndLogs()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_e
    move v0, v12

    int-to-long v6, v9

    int-to-float v11, v0

    int-to-long v12, v13

    .line 124
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLog;

    move-object v3, v0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object v4, v14

    move/from16 v5, v21

    move v8, v10

    move/from16 v9, v22

    move/from16 v10, v23

    move v14, v1

    move/from16 v16, v26

    move/from16 v18, v27

    move-object/from16 v21, v24

    invoke-direct/range {v3 .. v21}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLog;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;IJIFFFJIIIIIIILpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;)V

    .line 142
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2TempActivityInfo;->getTempStartLogs()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_4
    return-void
.end method

.method protected sendFinalProgress(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)V
    .locals 3

    const-string v0, "dataInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;->getGen2LogsCount()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2LogsCount;

    move-result-object p1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2LogsCount;->getActivityStartLogs()J

    move-result-wide v0

    long-to-int p1, v0

    .line 18
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Ver3ActivityHeaderCommand;->getSyncChannel()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannel;

    move-result-object v0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Ver3ActivityHeaderCommand;->getCommandId()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;

    move-result-object v1

    add-int/lit8 p1, p1, 0x1

    int-to-float p1, p1

    const/high16 v2, 0x42c80000    # 100.0f

    div-float/2addr v2, p1

    invoke-virtual {v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannel;->onProgress(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;F)V

    return-void
.end method
