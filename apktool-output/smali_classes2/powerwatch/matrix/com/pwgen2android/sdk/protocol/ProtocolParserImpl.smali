.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolParserImpl;
.super Ljava/lang/Object;
.source "ProtocolParser.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolParser;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0004H\u0016\u00a8\u0006\t"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolParserImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolParser;",
        "()V",
        "parseMessage",
        "",
        "message",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;",
        "parseResponse",
        "data",
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

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public parseMessage(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;)[B
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;->getPayload()Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;

    move-result-object p1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;->getData()[B

    move-result-object p1

    return-object p1
.end method

.method public parseResponse([B)Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;
    .locals 7

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;

    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;

    invoke-direct {v2, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;-><init>([B)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
