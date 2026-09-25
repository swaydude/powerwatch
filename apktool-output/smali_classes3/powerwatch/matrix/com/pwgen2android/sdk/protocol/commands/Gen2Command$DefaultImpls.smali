.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command$DefaultImpls;
.super Ljava/lang/Object;
.source "Gen2Comands.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method private static createCRC(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;[B)[B
    .locals 2

    const/4 p0, 0x4

    .line 143
    invoke-static {p0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object p0

    .line 144
    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 145
    new-instance v0, Ljava/util/zip/CRC32;

    invoke-direct {v0}, Ljava/util/zip/CRC32;-><init>()V

    .line 146
    invoke-virtual {v0, p1}, Ljava/util/zip/CRC32;->update([B)V

    .line 147
    invoke-virtual {v0}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v0

    long-to-int p1, v0

    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 148
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p0

    const-string p1, "crcBuffer.array()"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static createHeader(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;[B)[B
    .locals 1

    .line 133
    array-length p0, p1

    int-to-short p0, p0

    add-int/lit8 p0, p0, 0x2

    const/4 p1, 0x4

    add-int/2addr p0, p1

    .line 134
    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    .line 135
    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    int-to-short p0, p0

    .line 136
    invoke-virtual {v0, p0}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    move-result-object p0

    const/16 v0, 0x1040

    .line 137
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 138
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p0

    const-string p1, "headerBuffer.array()"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static createPayload(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;)[B
    .locals 1

    const-string v0, "this"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x0

    new-array p0, p0, [B

    return-object p0
.end method

.method public static extractAndCompareCRC(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;[B)Z
    .locals 3

    const-string v0, "this"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 170
    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command$DefaultImpls;->validateResponse(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;[B)Z

    move-result p0

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    const/4 p0, 0x1

    .line 172
    aget-byte p0, p1, p0

    and-int/lit16 p0, p0, 0xff

    shl-int/lit8 p0, p0, 0x8

    .line 173
    aget-byte v1, p1, v0

    and-int/lit16 v1, v1, 0xff

    or-int/2addr p0, v1

    .line 175
    invoke-static {p0}, Lkotlin/UInt;->constructor-impl(I)I

    move-result p0

    .line 177
    array-length v1, p1

    const/4 v2, 0x4

    sub-int/2addr v1, v2

    invoke-static {p1, v2, v1}, Lkotlin/collections/ArraysKt;->copyOfRange([BII)[B

    move-result-object v1

    .line 178
    array-length v1, v1

    invoke-static {v1}, Lkotlin/UInt;->constructor-impl(I)I

    move-result v1

    add-int/2addr v1, v2

    invoke-static {v1}, Lkotlin/UInt;->constructor-impl(I)I

    move-result v1

    if-eq p0, v1, :cond_1

    return v0

    .line 180
    :cond_1
    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ComandsKt;->compareCRC([B)Z

    move-result p0

    return p0
.end method

.method public static extractPayload(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;[B)Lkotlin/Pair;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;",
            "[B)",
            "Lkotlin/Pair<",
            "Ljava/lang/Boolean;",
            "[B>;"
        }
    .end annotation

    const-string v0, "this"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 156
    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command$DefaultImpls;->validateResponse(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;[B)Z

    move-result p0

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    if-nez p0, :cond_0

    new-instance p0, Lkotlin/Pair;

    invoke-direct {p0, v1, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0

    :cond_0
    const/4 p0, 0x1

    .line 158
    aget-byte v2, p1, p0

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x8

    .line 159
    aget-byte v0, p1, v0

    and-int/lit16 v0, v0, 0xff

    or-int/2addr v0, v2

    .line 161
    invoke-static {v0}, Lkotlin/UInt;->constructor-impl(I)I

    move-result v0

    .line 163
    array-length v2, p1

    const/4 v3, 0x4

    sub-int/2addr v2, v3

    invoke-static {p1, v3, v2}, Lkotlin/collections/ArraysKt;->copyOfRange([BII)[B

    move-result-object v2

    .line 164
    array-length v4, v2

    invoke-static {v4}, Lkotlin/UInt;->constructor-impl(I)I

    move-result v4

    add-int/2addr v4, v3

    invoke-static {v4}, Lkotlin/UInt;->constructor-impl(I)I

    move-result v3

    if-eq v0, v3, :cond_1

    new-instance p0, Lkotlin/Pair;

    invoke-direct {p0, v1, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0

    .line 165
    :cond_1
    new-instance p1, Lkotlin/Pair;

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-direct {p1, p0, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method

.method public static extractProgress(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)F
    .locals 1

    const-string v0, "this"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command$DefaultImpls;->extractProgress(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)F

    move-result p0

    return p0
.end method

.method public static extractResponse(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;[BLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;
    .locals 1

    const-string v0, "this"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "payloadData"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "dataInfo"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x1

    .line 89
    invoke-virtual {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->setParsingFinished(Z)V

    const/4 p0, 0x0

    .line 90
    invoke-virtual {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->setParsingStarted(Z)V

    return-object p2
.end method

.method public static extractResponse(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;[BLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;
    .locals 1

    const-string v0, "this"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "payloadData"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "dataInfo"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 121
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;->getDataInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object p0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->setParsingStarted(Z)V

    .line 122
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;->getDataInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object p0

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->setParsingFinished(Z)V

    return-object p2
.end method

.method public static extractResponseType(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Lkotlin/Pair;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolError;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;",
            "Lkotlin/Pair<",
            "Ljava/lang/Boolean;",
            "[B>;)",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolError;"
        }
    .end annotation

    const-string v0, "this"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "data"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 185
    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_6

    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [B

    array-length p0, p0

    const/4 v0, 0x2

    if-ge p0, v0, :cond_0

    goto :goto_1

    .line 187
    :cond_0
    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [B

    invoke-static {p0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p0

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getShort()S

    move-result p0

    invoke-static {p0}, Lkotlin/UShort;->constructor-impl(S)S

    move-result p0

    const p1, 0xffff

    and-int/2addr p0, p1

    .line 188
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType$ERROR;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType$ERROR;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType$ERROR;->getHex()I

    move-result p1

    const/4 v0, 0x0

    if-ne p0, p1, :cond_1

    sget-object p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolError$Unknown;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolError$Unknown;

    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolError;

    goto :goto_0

    .line 189
    :cond_1
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType$LOCKED;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType$LOCKED;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType$LOCKED;->getHex()I

    move-result p1

    if-ne p0, p1, :cond_2

    sget-object p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolError$SyncLocked;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolError$SyncLocked;

    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolError;

    goto :goto_0

    .line 190
    :cond_2
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType$WAIT;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType$WAIT;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType$WAIT;->getHex()I

    move-result p1

    if-ne p0, p1, :cond_3

    sget-object p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolError$WatchBusy;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolError$WatchBusy;

    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolError;

    goto :goto_0

    .line 191
    :cond_3
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType$PROCESSING;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType$PROCESSING;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType$PROCESSING;->getHex()I

    move-result p1

    if-ne p0, p1, :cond_4

    goto :goto_0

    .line 192
    :cond_4
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType$SUCCESS;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType$SUCCESS;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType$SUCCESS;->getHex()I

    move-result p1

    if-ne p0, p1, :cond_5

    goto :goto_0

    .line 193
    :cond_5
    sget-object p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolError$Unknown;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolError$Unknown;

    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolError;

    :goto_0
    return-object v0

    .line 185
    :cond_6
    :goto_1
    sget-object p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolError$Unknown;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolError$Unknown;

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolError;

    return-object p0
.end method

.method public static getCommandType(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;
    .locals 1

    const-string v0, "this"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command$DefaultImpls;->getCommandType(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    move-result-object p0

    return-object p0
.end method

.method public static getKoin(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;)Lorg/koin/core/Koin;
    .locals 1

    const-string v0, "this"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;)Lorg/koin/core/Koin;

    move-result-object p0

    return-object p0
.end method

.method public static getSendingData(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;)[B
    .locals 3

    const-string v0, "this"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    invoke-interface {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;->createPayload()[B

    move-result-object v0

    .line 72
    invoke-interface {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;->getCoreCommand()[B

    move-result-object v1

    .line 73
    invoke-static {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command$DefaultImpls;->createHeader(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;[B)[B

    move-result-object v2

    .line 74
    invoke-static {v2, v1}, Lkotlin/collections/ArraysKt;->plus([B[B)[B

    move-result-object v2

    .line 75
    invoke-static {v2, v0}, Lkotlin/collections/ArraysKt;->plus([B[B)[B

    move-result-object v2

    .line 76
    invoke-static {v1, v0}, Lkotlin/collections/ArraysKt;->plus([B[B)[B

    move-result-object v0

    invoke-static {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command$DefaultImpls;->createCRC(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;[B)[B

    move-result-object p0

    invoke-static {v2, p0}, Lkotlin/collections/ArraysKt;->plus([B[B)[B

    move-result-object p0

    return-object p0
.end method

.method public static onSuccess(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;
    .locals 8

    const-string v0, "this"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "dataInfo"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;->getDataInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object p0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->setParsingFinished(Z)V

    .line 82
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;->getDataInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object p0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->setParsingStarted(Z)V

    .line 83
    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xc

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v7}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;ZZLjava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0
.end method

.method public static parseReceivedData(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;[BLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;
    .locals 1

    const-string v0, "this"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataToParse"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataInfo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 97
    invoke-virtual {p2, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->setParsingStarted(Z)V

    const/4 v0, 0x0

    .line 98
    invoke-virtual {p2, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->setParsingFinished(Z)V

    .line 100
    invoke-interface {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;->extractPayload([B)Lkotlin/Pair;

    move-result-object p1

    .line 101
    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 102
    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    invoke-interface {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;->extractResponse([BLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object p0

    return-object p0

    :cond_0
    return-object p2
.end method

.method public static parseReceivedData(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;[BLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;
    .locals 2

    const-string v0, "this"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "payloadData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataInfo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;->getDataInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->setParsingStarted(Z)V

    .line 110
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;->getDataInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->setParsingFinished(Z)V

    .line 112
    invoke-interface {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;->extractPayload([B)Lkotlin/Pair;

    move-result-object p1

    .line 113
    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 114
    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    invoke-interface {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;->extractResponse([BLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;

    move-result-object p0

    return-object p0

    :cond_0
    return-object p2
.end method

.method public static printCommandId(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;)Ljava/lang/String;
    .locals 1

    const-string v0, "this"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command$DefaultImpls;->printCommandId(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static validateResponse(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;[B)Z
    .locals 0

    .line 152
    array-length p0, p1

    const/16 p1, 0x8

    if-lt p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
