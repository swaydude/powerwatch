.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;
.super Ljava/lang/Object;
.source "Communicator.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\tH\u00c6\u0003J1\u0010\u001f\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\tH\u00c6\u0001J\u0013\u0010 \u001a\u00020!2\u0008\u0010\"\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010#\u001a\u00020$H\u00d6\u0001J\t\u0010%\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\"\u0004\u0008\r\u0010\u000eR\u001a\u0010\u0008\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\"\u0004\u0008\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014\"\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018\"\u0004\u0008\u0019\u0010\u001a\u00a8\u0006&"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;",
        "",
        "uid",
        "",
        "protocolMessage",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;",
        "technologyType",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;",
        "protocolType",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;",
        "(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)V",
        "getProtocolMessage",
        "()Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;",
        "setProtocolMessage",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;)V",
        "getProtocolType",
        "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;",
        "setProtocolType",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)V",
        "getTechnologyType",
        "()Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;",
        "setTechnologyType",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;)V",
        "getUid",
        "()Ljava/lang/String;",
        "setUid",
        "(Ljava/lang/String;)V",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
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
.field private protocolMessage:Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;

.field private protocolType:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

.field private technologyType:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;

.field private uid:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)V
    .locals 1

    const-string v0, "uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "protocolMessage"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "technologyType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "protocolType"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;->uid:Ljava/lang/String;

    .line 28
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;->protocolMessage:Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;

    .line 29
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;->technologyType:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;

    .line 30
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;->protocolType:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    return-void
.end method

.method public static synthetic copy$default(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;->uid:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;->protocolMessage:Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;->technologyType:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;->protocolType:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;->copy(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;->uid:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;->protocolMessage:Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;

    return-object v0
.end method

.method public final component3()Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;->technologyType:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;

    return-object v0
.end method

.method public final component4()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;->protocolType:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;
    .locals 1

    const-string v0, "uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "protocolMessage"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "technologyType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "protocolType"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;

    invoke-direct {v0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;-><init>(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;->uid:Ljava/lang/String;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;->uid:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;->protocolMessage:Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;->protocolMessage:Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;->technologyType:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;->technologyType:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;->protocolType:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    iget-object p1, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;->protocolType:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getProtocolMessage()Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;
    .locals 1

    .line 28
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;->protocolMessage:Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;

    return-object v0
.end method

.method public final getProtocolType()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;
    .locals 1

    .line 30
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;->protocolType:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    return-object v0
.end method

.method public final getTechnologyType()Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;
    .locals 1

    .line 29
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;->technologyType:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;

    return-object v0
.end method

.method public final getUid()Ljava/lang/String;
    .locals 1

    .line 27
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;->uid:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;->uid:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;->protocolMessage:Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;->technologyType:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;->protocolType:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setProtocolMessage(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;->protocolMessage:Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;

    return-void
.end method

.method public final setProtocolType(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;->protocolType:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    return-void
.end method

.method public final setTechnologyType(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;->technologyType:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;

    return-void
.end method

.method public final setUid(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;->uid:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CommunicationMessage(uid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;->uid:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", protocolMessage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;->protocolMessage:Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", technologyType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;->technologyType:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", protocolType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;->protocolType:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
