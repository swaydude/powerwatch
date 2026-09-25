.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStreamImpl;
.super Ljava/lang/Object;
.source "ChannelStream.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStream;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nH\u0016J\u0008\u0010\u0010\u001a\u00020\u000eH\u0016J\u0008\u0010\u0011\u001a\u00020\u000eH\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\nH\u0003J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0004H\u0002J\u0008\u0010\u0015\u001a\u00020\u000eH\u0016J\u0008\u0010\u0016\u001a\u00020\u0017H\u0002J\u000e\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\nH\u0002R\u0016\u0010\u0006\u001a\n \u0008*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStreamImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStream;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "headerAddition",
        "",
        "(I)V",
        "TAG",
        "",
        "kotlin.jvm.PlatformType",
        "accumulatedData",
        "",
        "messageList",
        "",
        "appendData",
        "",
        "data",
        "clearMessages",
        "destroy",
        "extractHeaderSize",
        "extractMessage",
        "size",
        "extractMessages",
        "extractSingleMessage",
        "",
        "getMessageList",
        "",
        "isDataValid",
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

.field private accumulatedData:[B

.field private final headerAddition:I

.field private messageList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "[B>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStreamImpl;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStreamImpl;->headerAddition:I

    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStreamImpl;->TAG:Ljava/lang/String;

    .line 29
    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    check-cast p1, Ljava/util/List;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStreamImpl;->messageList:Ljava/util/List;

    const/4 p1, 0x0

    new-array p1, p1, [B

    .line 30
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStreamImpl;->accumulatedData:[B

    return-void
.end method

.method public synthetic constructor <init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x4

    .line 24
    :cond_0
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStreamImpl;-><init>(I)V

    return-void
.end method

.method private final extractHeaderSize([B)I
    .locals 3

    .line 90
    array-length v0, p1

    const/4 v1, -0x1

    const/4 v2, 0x2

    if-le v0, v2, :cond_1

    const/4 v0, 0x1

    .line 91
    aget-byte v0, p1, v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x8

    const/4 v2, 0x0

    .line 92
    aget-byte p1, p1, v2

    and-int/lit16 p1, p1, 0xff

    or-int/2addr p1, v0

    .line 94
    invoke-static {p1}, Lkotlin/UInt;->constructor-impl(I)I

    move-result p1

    const v0, 0x9242

    .line 95
    invoke-static {v0}, Lkotlin/UInt;->constructor-impl(I)I

    move-result v0

    invoke-static {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStreamImpl-$$ExternalSynthetic0;->m0(II)I

    move-result v0

    if-ltz v0, :cond_0

    goto :goto_0

    :cond_0
    move v1, p1

    :cond_1
    :goto_0
    return v1
.end method

.method private final extractMessage(I)[B
    .locals 2

    .line 84
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStreamImpl;->accumulatedData:[B

    array-length v1, v0

    if-ge p1, v1, :cond_0

    goto :goto_0

    :cond_0
    array-length p1, v0

    .line 85
    :goto_0
    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1

    const-string v0, "java.util.Arrays.copyOf(this, newSize)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final extractSingleMessage()Z
    .locals 7

    .line 64
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStreamImpl;->accumulatedData:[B

    invoke-direct {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStreamImpl;->extractHeaderSize([B)I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, -0x1

    if-eq v0, v3, :cond_1

    .line 66
    iget v3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStreamImpl;->headerAddition:I

    add-int/2addr v0, v3

    .line 67
    invoke-direct {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStreamImpl;->extractMessage(I)[B

    move-result-object v3

    .line 68
    iget-object v4, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStreamImpl;->TAG:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Extracted message size: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length v6, v3

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, ", header size: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 69
    array-length v4, v3

    if-ne v4, v0, :cond_2

    .line 70
    iget-object v4, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStreamImpl;->messageList:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 71
    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStreamImpl;->accumulatedData:[B

    array-length v4, v3

    invoke-static {v3, v0, v4}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v0

    const-string v3, "copyOfRange(accumulatedData, header, accumulatedData.size)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStreamImpl;->accumulatedData:[B

    .line 72
    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStreamImpl;->TAG:Ljava/lang/String;

    array-length v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v4, "Batch data size after extract: "

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 73
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStreamImpl;->accumulatedData:[B

    array-length v0, v0

    if-nez v0, :cond_0

    const/4 v2, 0x1

    :cond_0
    xor-int/lit8 v0, v2, 0x1

    return v0

    .line 76
    :cond_1
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStreamImpl;->TAG:Ljava/lang/String;

    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStreamImpl;->accumulatedData:[B

    const/4 v4, 0x0

    invoke-static {v3, v2, v1, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/BluetoothExtensionsKt;->formatToString$default([BZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "Received invalid data: "

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-array v0, v2, [B

    .line 78
    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStreamImpl;->accumulatedData:[B

    :cond_2
    return v2
.end method

.method private final isDataValid([B)Z
    .locals 4

    .line 38
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStreamImpl;->accumulatedData:[B

    invoke-static {v0, p1}, Lkotlin/collections/ArraysKt;->plus([B[B)[B

    move-result-object p1

    new-instance v0, Ljava/lang/String;

    sget-object v1, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v0, p1, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    const-string p1, "#QI:Notification"

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    .line 39
    invoke-static {v0, p1, v1, v2, v3}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method


# virtual methods
.method public appendData([B)V
    .locals 4

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStreamImpl;->isDataValid([B)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 44
    :cond_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStreamImpl;->accumulatedData:[B

    invoke-static {v0, p1}, Lkotlin/collections/ArraysKt;->plus([B[B)[B

    move-result-object p1

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStreamImpl;->accumulatedData:[B

    .line 45
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStreamImpl;->TAG:Ljava/lang/String;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, v1, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/BluetoothExtensionsKt;->formatToString$default([BZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "New data to process: "

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public clearMessages()V
    .locals 1

    .line 49
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStreamImpl;->messageList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public destroy()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    .line 33
    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStreamImpl;->accumulatedData:[B

    .line 34
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStreamImpl;->messageList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public extractMessages()V
    .locals 1

    const/4 v0, 0x1

    :goto_0
    if-eqz v0, :cond_0

    .line 55
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStreamImpl;->extractSingleMessage()Z

    move-result v0

    goto :goto_0

    :cond_0
    return-void
.end method

.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 24
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method public getMessageList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "[B>;"
        }
    .end annotation

    .line 60
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStreamImpl;->messageList:Ljava/util/List;

    return-object v0
.end method
