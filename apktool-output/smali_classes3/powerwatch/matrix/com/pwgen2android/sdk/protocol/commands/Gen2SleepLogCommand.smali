.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepLogCommand;
.super Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand;
.source "Gen2SleepLogCommand.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J\u0010\u0010\u0008\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u00a8\u0006\n"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepLogCommand;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand;",
        "()V",
        "extractResponse",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;",
        "payloadData",
        "",
        "dataInfo",
        "parseSingleLog",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;",
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
.method public constructor <init>()V
    .locals 1

    .line 9
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs$Gen2SleepLogCommandId;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs$Gen2SleepLogCommandId;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;

    invoke-direct {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;)V

    return-void
.end method

.method private final parseSingleLog([B)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;
    .locals 21

    .line 34
    invoke-static/range {p1 .. p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 36
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 38
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v1

    .line 39
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v2

    .line 40
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v9

    .line 41
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v0

    const/4 v4, 0x0

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v7, 0x4

    const/4 v8, 0x0

    move v3, v9

    .line 46
    invoke-static/range {v3 .. v8}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->extractNumber$default(IIIZILjava/lang/Object;)I

    move-result v15

    const/16 v4, 0x8

    const/16 v5, 0xf

    .line 47
    invoke-static/range {v3 .. v8}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->extractNumber$default(IIIZILjava/lang/Object;)I

    move-result v16

    const/16 v4, 0x10

    const/16 v5, 0x17

    .line 48
    invoke-static/range {v3 .. v8}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->extractNumber$default(IIIZILjava/lang/Object;)I

    move-result v17

    const/16 v4, 0x18

    const/16 v5, 0x1f

    .line 49
    invoke-static/range {v3 .. v8}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->extractNumber$default(IIIZILjava/lang/Object;)I

    move-result v18

    const/4 v4, 0x0

    const/4 v5, 0x7

    move v3, v0

    .line 51
    invoke-static/range {v3 .. v8}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->extractNumber$default(IIIZILjava/lang/Object;)I

    move-result v19

    const/16 v4, 0x8

    const/16 v5, 0xf

    .line 52
    invoke-static/range {v3 .. v8}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->extractNumber$default(IIIZILjava/lang/Object;)I

    move-result v20

    const/16 v4, 0x10

    const/16 v5, 0x17

    .line 53
    invoke-static/range {v3 .. v8}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->extractNumber$default(IIIZILjava/lang/Object;)I

    .line 56
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;

    int-to-long v11, v1

    int-to-long v13, v2

    move-object v10, v0

    invoke-direct/range {v10 .. v20}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;-><init>(JJIIIIII)V

    return-object v0
.end method


# virtual methods
.method public extractResponse([BLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;
    .locals 4

    const-string v0, "payloadData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataInfo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    const/16 v0, 0x10

    new-array v1, v0, [B

    .line 18
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/List;

    .line 19
    :goto_0
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->limit()I

    move-result v2

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v3

    sub-int/2addr v2, v3

    if-lt v2, v0, :cond_0

    .line 20
    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 21
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;->getSleepLogData()Ljava/util/List;

    move-result-object v2

    invoke-direct {p0, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepLogCommand;->parseSingleLog([B)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 24
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 25
    invoke-static {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->roundMillisToSeconds(J)J

    .line 27
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;->getDataInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->setParsingFinished(Z)V

    .line 28
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;->getDataInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->setParsingStarted(Z)V

    .line 29
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;->getDataInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object p1

    const-wide/32 v0, 0xea60

    invoke-virtual {p1, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->setActivityLogInterval(J)V

    return-object p2
.end method
