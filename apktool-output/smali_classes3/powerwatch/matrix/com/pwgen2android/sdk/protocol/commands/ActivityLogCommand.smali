.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityLogCommand;
.super Ljava/lang/Object;
.source "Commands.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\n\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nH\u0016J\u0008\u0010\u000b\u001a\u00020\u000cH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000cH\u0002J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000cH\u0002J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000cH\u0002J\u000e\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000cJ\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000cH\u0002J\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000cH\u0002J\u0018\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u000c2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityLogCommand;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;",
        "logger",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;)V",
        "ACTIVITY_PROCESS_TAG",
        "",
        "extractProgress",
        "",
        "dataInfo",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;",
        "getSendingData",
        "",
        "isActivitySyncEnd",
        "",
        "data",
        "isLogCountResponse",
        "dataToParse",
        "isMemoryWriteCommand",
        "isRunningSyncEnd",
        "isStartSyncOrEndCommand",
        "content",
        "isSyncEndCommand",
        "parseReceivedData",
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
.field private final ACTIVITY_PROCESS_TAG:Ljava/lang/String;

.field private final logger:Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;)V
    .locals 1

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 381
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityLogCommand;->logger:Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;

    .line 395
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    const-string v0, "javaClass.simpleName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityLogCommand;->ACTIVITY_PROCESS_TAG:Ljava/lang/String;

    return-void
.end method

.method private final isActivitySyncEnd([B)Z
    .locals 4

    .line 536
    new-instance v0, Ljava/lang/String;

    sget-object v1, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v0, p1, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    check-cast v0, Ljava/lang/CharSequence;

    const-string p1, "upload end"

    check-cast p1, Ljava/lang/CharSequence;

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, p1, v1, v2, v3}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method private final isLogCountResponse([B)Z
    .locals 2

    .line 505
    new-instance v0, Ljava/lang/String;

    sget-object v1, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v0, p1, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    check-cast v0, Ljava/lang/CharSequence;

    const-string p1, "upload log"

    check-cast p1, Ljava/lang/CharSequence;

    const/4 v1, 0x1

    invoke-static {v0, p1, v1}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result p1

    return p1
.end method

.method private final isMemoryWriteCommand([B)Z
    .locals 3

    .line 509
    array-length v0, p1

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    xor-int/2addr v0, v1

    if-eqz v0, :cond_1

    aget-byte p1, p1, v2

    and-int/lit8 p1, p1, -0x1

    int-to-byte p1, p1

    const/16 v0, -0x70

    if-ne p1, v0, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    return v1
.end method

.method private final isStartSyncOrEndCommand([B)Z
    .locals 3

    .line 514
    array-length v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x3

    if-ge v0, v2, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x2

    .line 515
    aget-byte v0, p1, v0

    shl-int/lit8 v0, v0, 0x8

    aget-byte p1, p1, v2

    or-int/2addr p1, v0

    and-int/lit16 p1, p1, 0xff

    const/16 v0, 0xf8

    if-ne p1, v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method private final isSyncEndCommand([B)Z
    .locals 3

    .line 521
    array-length v0, p1

    const/4 v1, 0x0

    const/16 v2, 0xa

    if-ge v0, v2, :cond_0

    return v1

    .line 524
    :cond_0
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityLogCommand;->isMemoryWriteCommand([B)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 526
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityLogCommand;->isStartSyncOrEndCommand([B)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x4

    .line 527
    aget-byte v0, p1, v0

    and-int/lit8 v0, v0, -0x1

    int-to-byte v0, v0

    const/16 v2, 0x8

    if-ne v0, v2, :cond_1

    const/4 v0, 0x6

    .line 529
    aget-byte v0, p1, v0

    shl-int/2addr v0, v2

    const/4 v2, 0x5

    aget-byte p1, p1, v2

    or-int/2addr p1, v0

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method


# virtual methods
.method public extractProgress(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)F
    .locals 2

    const-string v0, "dataInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 389
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->getActivityLogs()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    if-eqz v0, :cond_0

    return v1

    .line 392
    :cond_0
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->getParsingFinished()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->getDataToProcess()F

    move-result p1

    div-float p1, v1, p1

    :goto_0
    return p1
.end method

.method public getCommandType()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;
    .locals 1

    .line 381
    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command$DefaultImpls;->getCommandType(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    move-result-object v0

    return-object v0
.end method

.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 381
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method public getSendingData()[B
    .locals 1

    const/4 v0, 0x5

    new-array v0, v0, [B

    .line 383
    fill-array-data v0, :array_0

    return-object v0

    nop

    :array_0
    .array-data 1
        -0x7ft
        0xft
        0x0t
        -0x7ft
        0x10t
    .end array-data
.end method

.method public final isRunningSyncEnd([B)Z
    .locals 2

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 542
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityLogCommand;->isSyncEndCommand([B)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0xa

    aget-byte v0, p1, v0

    shl-int/lit8 v0, v0, 0x8

    const/16 v1, 0x9

    aget-byte p1, p1, v1

    and-int/lit16 p1, p1, 0xff

    or-int/2addr p1, v0

    const/16 v0, 0x80

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public parseReceivedData([BLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;
    .locals 31

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string v3, "dataToParse"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "dataInfo"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 398
    iget-object v3, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityLogCommand;->logger:Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v1, v4, v5, v6}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/BluetoothExtensionsKt;->formatToString$default([BZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "Processing log: "

    invoke-static {v8, v7}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    iget-object v8, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityLogCommand;->ACTIVITY_PROCESS_TAG:Ljava/lang/String;

    invoke-interface {v3, v7, v8}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;->debug(Ljava/lang/String;Ljava/lang/Object;)V

    .line 400
    invoke-direct/range {p0 .. p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityLogCommand;->isActivitySyncEnd([B)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 401
    iget-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityLogCommand;->logger:Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;

    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->getActivityLogs()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "Detected activity sync end, data count: "

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityLogCommand;->ACTIVITY_PROCESS_TAG:Ljava/lang/String;

    invoke-interface {v1, v3, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;->debug(Ljava/lang/String;Ljava/lang/Object;)V

    .line 402
    iget-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityLogCommand;->logger:Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;

    invoke-static/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/CommandsKt;->logLogs(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "Accumulated data :"

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityLogCommand;->ACTIVITY_PROCESS_TAG:Ljava/lang/String;

    invoke-interface {v1, v3, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;->debug(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/32 v10, 0x493e0

    const/4 v12, 0x0

    const/16 v13, 0x17c

    const/4 v14, 0x0

    move-object/from16 v1, p2

    move v2, v3

    move v3, v4

    move-object v4, v5

    move v5, v6

    move-object v6, v7

    move-object v7, v8

    move-object v8, v9

    move-wide v9, v10

    move-object v11, v12

    move v12, v13

    move-object v13, v14

    .line 403
    invoke-static/range {v1 .. v13}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->copy$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;ZZLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;FLjava/util/List;Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TotalActivityData;JLpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object v1

    return-object v1

    .line 405
    :cond_0
    invoke-direct/range {p0 .. p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityLogCommand;->isLogCountResponse([B)Z

    move-result v3

    const/4 v7, -0x1

    const/16 v8, 0x8

    if-eqz v3, :cond_2

    .line 408
    new-instance v3, Ljava/lang/String;

    sget-object v9, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v3, v1, v9}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    move-object v10, v3

    check-cast v10, Ljava/lang/CharSequence;

    const-string v3, ","

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v11

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x6

    const/4 v15, 0x0

    invoke-static/range {v10 .. v15}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v3

    const-string v9, "#QT:T"

    .line 410
    invoke-interface {v3, v9}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v9

    if-eq v9, v7, :cond_2

    add-int/lit8 v9, v9, 0x3

    .line 413
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v10

    if-ge v9, v10, :cond_2

    invoke-interface {v3, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/CharSequence;

    const-string v11, "\n"

    move-object v12, v11

    check-cast v12, Ljava/lang/CharSequence;

    const/4 v13, 0x2

    invoke-static {v10, v12, v4, v13, v6}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 414
    invoke-interface {v3, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    move-object v12, v3

    check-cast v12, Ljava/lang/CharSequence;

    filled-new-array {v11}, [Ljava/lang/String;

    move-result-object v13

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x6

    const/16 v17, 0x0

    invoke-static/range {v12 .. v17}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 415
    invoke-static {v3}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 417
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    div-int/2addr v3, v8

    int-to-float v6, v3

    .line 418
    invoke-virtual {v2, v6}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->setDataToProcess(F)V

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    .line 420
    :goto_0
    iget-object v6, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityLogCommand;->logger:Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v9, "Expected sum: "

    invoke-static {v9, v3}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    iget-object v9, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityLogCommand;->ACTIVITY_PROCESS_TAG:Ljava/lang/String;

    invoke-interface {v6, v3, v9}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;->debug(Ljava/lang/String;Ljava/lang/Object;)V

    .line 422
    invoke-virtual {v2, v5}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->setParsingStarted(Z)V

    .line 423
    invoke-virtual {v2, v4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->setParsingFinished(Z)V

    .line 427
    :cond_2
    invoke-direct/range {p0 .. p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityLogCommand;->isMemoryWriteCommand([B)Z

    move-result v3

    .line 428
    invoke-direct/range {p0 .. p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityLogCommand;->isStartSyncOrEndCommand([B)Z

    move-result v6

    xor-int/2addr v6, v5

    if-eqz v3, :cond_5

    if-eqz v6, :cond_5

    const/4 v3, 0x4

    .line 432
    aget-byte v6, v1, v3

    new-array v9, v6, [B

    const/4 v10, 0x5

    .line 433
    invoke-static {v1, v10, v9, v4, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/4 v1, 0x0

    :goto_1
    if-ge v1, v6, :cond_4

    .line 440
    aget-byte v10, v9, v1

    and-int/lit16 v10, v10, 0x80

    shr-int/lit8 v10, v10, 0x7

    int-to-byte v10, v10

    .line 441
    aget-byte v11, v9, v1

    shr-int/2addr v11, v3

    and-int/lit8 v16, v11, 0x7

    .line 442
    iget-object v11, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityLogCommand;->logger:Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;

    invoke-static {v10}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v12

    const-string v13, "Parsing activity log, log type is: "

    invoke-static {v13, v12}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    iget-object v13, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityLogCommand;->ACTIVITY_PROCESS_TAG:Ljava/lang/String;

    invoke-interface {v11, v12, v13}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;->debug(Ljava/lang/String;Ljava/lang/Object;)V

    if-ne v10, v5, :cond_3

    new-array v10, v8, [B

    .line 448
    invoke-static {v9, v1, v10, v4, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 450
    invoke-static {v8}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v11

    .line 451
    invoke-virtual {v11, v10}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 452
    invoke-virtual {v11}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 453
    invoke-virtual {v11}, Ljava/nio/ByteBuffer;->getLong()J

    move-result-wide v10

    const/16 v12, 0x33

    shr-long v12, v10, v12

    const-wide/16 v14, 0x3ff

    and-long v22, v12, v14

    const/16 v12, 0x28

    shr-long v12, v10, v12

    const-wide/16 v14, 0x7ff

    and-long v24, v12, v14

    const/16 v12, 0x1c

    shr-long v12, v10, v12

    const-wide/16 v14, 0xfff

    and-long v26, v12, v14

    const/16 v12, 0x10

    shr-long v12, v10, v12

    and-long/2addr v12, v14

    long-to-int v13, v12

    move/from16 v21, v13

    shr-long v12, v10, v8

    const-wide/16 v14, 0xff

    and-long/2addr v12, v14

    long-to-int v13, v12

    move/from16 v18, v13

    and-long/2addr v10, v14

    long-to-int v11, v10

    move/from16 v17, v11

    .line 463
    new-instance v10, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;

    move-object v12, v10

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x842

    const/16 v30, 0x0

    invoke-direct/range {v12 .. v30}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;-><init>(ZJIIIIIIJJJLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 473
    iget-object v11, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityLogCommand;->logger:Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;

    const-string v12, "Parsing activity log : "

    invoke-static {v12, v10}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    iget-object v13, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityLogCommand;->ACTIVITY_PROCESS_TAG:Ljava/lang/String;

    invoke-interface {v11, v12, v13}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;->debug(Ljava/lang/String;Ljava/lang/Object;)V

    .line 474
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->getActivityLogs()Ljava/util/List;

    move-result-object v11

    invoke-interface {v11, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    add-int/lit8 v10, v1, 0x1

    .line 480
    aget-byte v10, v9, v10

    and-int/2addr v10, v7

    int-to-byte v10, v10

    move/from16 v21, v10

    add-int/lit8 v10, v1, 0x2

    .line 481
    aget-byte v10, v9, v10

    and-int/2addr v10, v7

    int-to-byte v10, v10

    move/from16 v17, v10

    add-int/lit8 v10, v1, 0x3

    .line 482
    aget-byte v10, v9, v10

    and-int/2addr v10, v7

    int-to-byte v10, v10

    move/from16 v18, v10

    .line 484
    new-instance v10, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;

    move-object v12, v10

    const/4 v13, 0x1

    const-wide/16 v14, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v22, 0x0

    const-wide/16 v24, 0x0

    const-wide/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v29, 0xf42

    const/16 v30, 0x0

    invoke-direct/range {v12 .. v30}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;-><init>(ZJIIIIIIJJJLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 490
    iget-object v11, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityLogCommand;->logger:Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;

    const-string v12, "Parsing sleep log : "

    invoke-static {v12, v10}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    iget-object v13, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityLogCommand;->ACTIVITY_PROCESS_TAG:Ljava/lang/String;

    invoke-interface {v11, v12, v13}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;->debug(Ljava/lang/String;Ljava/lang/Object;)V

    .line 491
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->getActivityLogs()Ljava/util/List;

    move-result-object v11

    invoke-interface {v11, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_2
    add-int/lit8 v1, v1, 0x8

    goto/16 :goto_1

    .line 496
    :cond_4
    invoke-virtual {v2, v5}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->setParsingStarted(Z)V

    .line 497
    invoke-virtual {v2, v4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->setParsingFinished(Z)V

    const-wide/32 v3, 0x493e0

    .line 498
    invoke-virtual {v2, v3, v4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->setActivityLogInterval(J)V

    return-object v2

    :cond_5
    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/32 v10, 0x493e0

    const/4 v12, 0x0

    const/16 v13, 0x17c

    const/4 v14, 0x0

    move-object/from16 v1, p2

    move v2, v3

    move v3, v4

    move-object v4, v5

    move v5, v6

    move-object v6, v7

    move-object v7, v8

    move-object v8, v9

    move-wide v9, v10

    move-object v11, v12

    move v12, v13

    move-object v13, v14

    .line 501
    invoke-static/range {v1 .. v13}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->copy$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;ZZLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;FLjava/util/List;Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TotalActivityData;JLpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object v1

    return-object v1
.end method

.method public printCommandId()Ljava/lang/String;
    .locals 1

    .line 381
    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command$DefaultImpls;->printCommandId(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
