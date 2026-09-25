.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2HeartRateParser;
.super Ljava/lang/Object;
.source "Gen2HeartRateExecutor.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2HeartRateParser;",
        "",
        "()V",
        "parse",
        "",
        "message",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;",
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
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final parse(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)J
    .locals 7

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;->getProtocolMessage()Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;

    move-result-object p1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;->getPayload()Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;

    move-result-object p1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;->getData()[B

    move-result-object p1

    .line 22
    array-length v0, p1

    const-wide/16 v1, 0x0

    const/4 v3, 0x2

    if-ge v0, v3, :cond_0

    return-wide v1

    :cond_0
    const/4 v0, 0x0

    .line 23
    aget-byte v4, p1, v0

    const/4 v5, 0x1

    and-int/2addr v4, v5

    int-to-byte v4, v4

    if-nez v4, :cond_1

    .line 26
    aget-byte p1, p1, v5

    invoke-static {p1}, Lkotlin/UByte;->constructor-impl(B)B

    move-result p1

    int-to-long v0, p1

    const-wide/16 v2, 0xff

    :goto_0
    and-long v1, v0, v2

    goto :goto_1

    :cond_1
    if-ne v4, v5, :cond_3

    .line 28
    array-length v4, p1

    const/4 v6, 0x3

    if-ge v4, v6, :cond_2

    goto :goto_1

    :cond_2
    new-array v1, v3, [B

    aget-byte v2, p1, v5

    aput-byte v2, v1, v0

    aget-byte p1, p1, v3

    aput-byte p1, v1, v5

    invoke-static {v1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getShort()S

    move-result p1

    invoke-static {p1}, Lkotlin/UShort;->constructor-impl(S)S

    move-result p1

    int-to-long v0, p1

    const-wide/32 v2, 0xffff

    goto :goto_0

    :cond_3
    :goto_1
    return-wide v1
.end method
