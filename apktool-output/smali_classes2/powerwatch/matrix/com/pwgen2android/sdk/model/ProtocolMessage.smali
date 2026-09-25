.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;
.super Ljava/lang/Object;
.source "Entities.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0016\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\"\u0004\u0008\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\"\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u001e"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;",
        "",
        "payload",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;",
        "type",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;",
        "messageType",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;)V",
        "getMessageType",
        "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;",
        "getPayload",
        "()Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;",
        "setPayload",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;)V",
        "getType",
        "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;",
        "setType",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)V",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
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


# instance fields
.field private final messageType:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

.field private payload:Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;

.field private type:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;)V
    .locals 1

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;->payload:Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;->type:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    .line 25
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;->messageType:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    return-void
.end method

.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 24
    sget-object p2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;->BLE_DTP:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 25
    sget-object p3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;->UNKNOWN:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    .line 24
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;)V

    return-void
.end method

.method public static synthetic copy$default(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;->payload:Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;->type:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;->messageType:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;->copy(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;)Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;->payload:Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;

    return-object v0
.end method

.method public final component2()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;->type:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    return-object v0
.end method

.method public final component3()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;->messageType:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    return-object v0
.end method

.method public final copy(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;)Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;
    .locals 1

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;

    invoke-direct {v0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;->payload:Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;->payload:Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;->type:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;->type:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;->messageType:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    iget-object p1, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;->messageType:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getMessageType()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;
    .locals 1

    .line 25
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;->messageType:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    return-object v0
.end method

.method public final getPayload()Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;
    .locals 1

    .line 24
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;->payload:Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;

    return-object v0
.end method

.method public final getType()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;
    .locals 1

    .line 24
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;->type:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;->payload:Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;->type:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;->messageType:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setPayload(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;->payload:Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;

    return-void
.end method

.method public final setType(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;->type:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ProtocolMessage(payload="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;->payload:Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;->type:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", messageType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;->messageType:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
