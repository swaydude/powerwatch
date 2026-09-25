.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RunningLogCommand;
.super Ljava/lang/Object;
.source "Commands.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\t\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008H\u0016J\u0008\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\nH\u0002J\u0010\u0010\u000e\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\nH\u0002J\u0010\u0010\u0011\u001a\u00020\u000c2\u0006\u0010\u0012\u001a\u00020\nH\u0002J\u0010\u0010\u0013\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\nH\u0002J\u0018\u0010\u0014\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0008H\u0017R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RunningLogCommand;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;",
        "()V",
        "TAG",
        "",
        "extractProgress",
        "",
        "dataInfo",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;",
        "getSendingData",
        "",
        "isMemoryWriteCommand",
        "",
        "dataToParse",
        "isRunningCount",
        "isRunningSyncEnd",
        "data",
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
.field private final TAG:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 547
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 557
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RunningLogCommand;->TAG:Ljava/lang/String;

    return-void
.end method

.method private final isMemoryWriteCommand([B)Z
    .locals 3

    .line 624
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

.method private final isRunningCount([B)Z
    .locals 2

    .line 560
    new-instance v0, Ljava/lang/String;

    sget-object v1, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v0, p1, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    check-cast v0, Ljava/lang/CharSequence;

    const-string p1, "upload start"

    check-cast p1, Ljava/lang/CharSequence;

    const/4 v1, 0x1

    invoke-static {v0, p1, v1}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result p1

    return p1
.end method

.method private final isRunningSyncEnd([B)Z
    .locals 4

    .line 651
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

.method private final isStartSyncOrEndCommand([B)Z
    .locals 3

    .line 629
    array-length v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x3

    if-ge v0, v2, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x2

    .line 630
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

    .line 636
    array-length v0, p1

    const/4 v1, 0x0

    const/16 v2, 0xa

    if-ge v0, v2, :cond_0

    return v1

    .line 639
    :cond_0
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RunningLogCommand;->isMemoryWriteCommand([B)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 641
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RunningLogCommand;->isStartSyncOrEndCommand([B)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x4

    .line 642
    aget-byte v0, p1, v0

    and-int/lit8 v0, v0, -0x1

    int-to-byte v0, v0

    const/16 v2, 0x8

    if-ne v0, v2, :cond_1

    const/4 v0, 0x6

    .line 644
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
    .locals 1

    const-string v0, "dataInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 554
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->getParsingFinished()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->getDataToProcess()F

    move-result p1

    div-float p1, v0, p1

    :goto_0
    return p1
.end method

.method public getCommandType()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;
    .locals 1

    .line 547
    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command$DefaultImpls;->getCommandType(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    move-result-object v0

    return-object v0
.end method

.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 547
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

    .line 549
    fill-array-data v0, :array_0

    return-object v0

    nop

    :array_0
    .array-data 1
        -0x7ft
        0xft
        0x0t
        -0x80t
        0x10t
    .end array-data
.end method

.method public parseReceivedData([BLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;
    .locals 31

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    const-string v2, "dataToParse"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "dataInfo"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 566
    invoke-direct/range {p0 .. p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RunningLogCommand;->isRunningSyncEnd([B)Z

    move-result v2

    const/4 v3, 0x2

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    .line 567
    move-object/from16 v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->getActivityLogs()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v5, "Detected running sync end, data count: "

    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2, v4, v3, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/16 v12, 0x1fc

    const/4 v13, 0x0

    move-object/from16 v0, p2

    move v1, v2

    move v2, v3

    move-object v3, v4

    move v4, v5

    move-object v5, v6

    move-object v6, v7

    move-object v7, v8

    move-wide v8, v9

    move-object v10, v11

    move v11, v12

    move-object v12, v13

    .line 568
    invoke-static/range {v0 .. v12}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->copy$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;ZZLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;FLjava/util/List;Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TotalActivityData;JLpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object v0

    return-object v0

    .line 571
    :cond_0
    invoke-direct/range {p0 .. p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RunningLogCommand;->isRunningCount([B)Z

    move-result v2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_3

    .line 573
    new-instance v2, Ljava/lang/String;

    sget-object v7, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v2, v0, v7}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    move-object v8, v2

    check-cast v8, Ljava/lang/CharSequence;

    const-string v2, " "

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x6

    const/4 v13, 0x0

    invoke-static/range {v8 .. v13}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const-string v7, "start"

    .line 574
    invoke-interface {v2, v7}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v7

    const/4 v8, -0x1

    if-eq v7, v8, :cond_2

    add-int/2addr v7, v3

    .line 575
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v8

    if-ge v7, v8, :cond_2

    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/CharSequence;

    const-string v9, "\n"

    move-object v10, v9

    check-cast v10, Ljava/lang/CharSequence;

    invoke-static {v8, v10, v6, v3, v4}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    .line 576
    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Ljava/lang/CharSequence;

    filled-new-array {v9}, [Ljava/lang/String;

    move-result-object v11

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x6

    const/4 v15, 0x0

    invoke-static/range {v10 .. v15}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 578
    invoke-static {v2}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v7

    if-eqz v7, :cond_1

    .line 580
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    int-to-float v7, v7

    invoke-virtual {v1, v7}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->setDataToProcess(F)V

    .line 582
    :cond_1
    move-object/from16 v7, p0

    check-cast v7, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string v8, "Expected running sum: "

    invoke-static {v8, v2}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v7, v2, v4, v3, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 584
    :cond_2
    invoke-virtual {v1, v5}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->setParsingStarted(Z)V

    .line 585
    invoke-virtual {v1, v6}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->setParsingFinished(Z)V

    .line 589
    :cond_3
    invoke-direct/range {p0 .. p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RunningLogCommand;->isMemoryWriteCommand([B)Z

    move-result v2

    .line 590
    invoke-direct/range {p0 .. p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RunningLogCommand;->isStartSyncOrEndCommand([B)Z

    move-result v7

    xor-int/2addr v7, v5

    .line 592
    move-object/from16 v8, p0

    check-cast v8, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "Started running processing: isWriteCommand : "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v10, ", isStartOrEnd : "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    xor-int/lit8 v10, v7, 0x1

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9, v4, v3, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    if-eqz v2, :cond_4

    if-eqz v7, :cond_4

    const/4 v2, 0x4

    .line 595
    aget-byte v2, v0, v2

    new-array v7, v2, [B

    const/4 v9, 0x5

    .line 596
    invoke-static {v0, v9, v7, v6, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 599
    invoke-static {v7}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 600
    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 603
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v2

    invoke-static {v2}, Lkotlin/UInt;->constructor-impl(I)I

    move-result v2

    int-to-long v9, v2

    const-wide v11, 0xffffffffL

    and-long/2addr v9, v11

    .line 604
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v2

    invoke-static {v2}, Lkotlin/UInt;->constructor-impl(I)I

    move-result v2

    int-to-long v13, v2

    and-long/2addr v13, v11

    .line 605
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v2

    invoke-static {v2}, Lkotlin/UInt;->constructor-impl(I)I

    move-result v2

    int-to-long v6, v2

    and-long v24, v6, v11

    .line 606
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v2

    invoke-static {v2}, Lkotlin/UInt;->constructor-impl(I)I

    move-result v2

    int-to-long v6, v2

    and-long v22, v6, v11

    .line 607
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v26

    .line 608
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 609
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v27

    .line 611
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;

    const/16 v17, 0x0

    const/16 v2, 0x3e8

    int-to-long v6, v2

    mul-long v18, v9, v6

    mul-long v20, v13, v6

    const/16 v28, 0x0

    const/16 v29, 0x81

    const/16 v30, 0x0

    move-object/from16 v16, v0

    invoke-direct/range {v16 .. v30}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;JJJJIILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v2, "Parsing running log : "

    .line 612
    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v8, v2, v4, v3, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 614
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->getRunningLogs()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 615
    invoke-virtual {v1, v5}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->setParsingStarted(Z)V

    const/4 v0, 0x0

    .line 616
    invoke-virtual {v1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->setParsingFinished(Z)V

    return-object v1

    :cond_4
    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/16 v12, 0x1fc

    const/4 v13, 0x0

    move-object/from16 v0, p2

    move v1, v2

    move v2, v3

    move-object v3, v4

    move v4, v5

    move-object v5, v6

    move-object v6, v7

    move-object v7, v8

    move-wide v8, v9

    move-object v10, v11

    move v11, v12

    move-object v12, v13

    .line 620
    invoke-static/range {v0 .. v12}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->copy$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;ZZLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;FLjava/util/List;Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TotalActivityData;JLpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object v0

    return-object v0
.end method

.method public printCommandId()Ljava/lang/String;
    .locals 1

    .line 547
    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command$DefaultImpls;->printCommandId(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
