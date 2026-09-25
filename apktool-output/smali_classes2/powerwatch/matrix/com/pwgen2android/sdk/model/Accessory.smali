.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;
.super Ljava/lang/Object;
.source "Entities.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nEntities.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Entities.kt\npowerwatch/matrix/com/pwgen2android/sdk/model/Accessory\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,77:1\n764#2:78\n855#2,2:79\n*S KotlinDebug\n*F\n+ 1 Entities.kt\npowerwatch/matrix/com/pwgen2android/sdk/model/Accessory\n*L\n69#1:78\n69#1:79,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0008H\u00c6\u0003J-\u0010\u001b\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008H\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u000f2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u0014\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u001f\u001a\u00020 J\t\u0010!\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\"\u001a\u00020#H\u00d6\u0001R\u0017\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f8F\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00138F\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006$"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;",
        "",
        "deviceInfo",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;",
        "connections",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/connection/Connection;",
        "technologyType",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;)V",
        "getConnections",
        "()Ljava/util/List;",
        "getDeviceInfo",
        "()Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;",
        "hasConnections",
        "",
        "getHasConnections",
        "()Z",
        "numberOfConnections",
        "",
        "getNumberOfConnections",
        "()I",
        "getTechnologyType",
        "()Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "other",
        "getConnectionByProtocolType",
        "protocolType",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;",
        "hashCode",
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
.field private final connections:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/connection/Connection;",
            ">;"
        }
    .end annotation
.end field

.field private final deviceInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

.field private final technologyType:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;",
            "Ljava/util/List<",
            "+",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/connection/Connection;",
            ">;",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;",
            ")V"
        }
    .end annotation

    const-string v0, "deviceInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connections"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "technologyType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;->deviceInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;->connections:Ljava/util/List;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;->technologyType:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;

    return-void
.end method

.method public static synthetic copy$default(Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;->deviceInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;->connections:Ljava/util/List;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;->technologyType:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;->copy(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;)Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;->deviceInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/connection/Connection;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;->connections:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;->technologyType:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;

    return-object v0
.end method

.method public final copy(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;)Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;",
            "Ljava/util/List<",
            "+",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/connection/Connection;",
            ">;",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;",
            ")",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;"
        }
    .end annotation

    const-string v0, "deviceInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connections"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "technologyType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;

    invoke-direct {v0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;->deviceInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;->deviceInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;->connections:Ljava/util/List;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;->connections:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;->technologyType:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;

    iget-object p1, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;->technologyType:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getConnectionByProtocolType(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;",
            ")",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/connection/Connection;",
            ">;"
        }
    .end annotation

    const-string v0, "protocolType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;->connections:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    .line 78
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/Collection;

    .line 79
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/Connection;

    .line 69
    invoke-interface {v3}, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/Connection;->getConnectionInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;

    move-result-object v3

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;->getProtocolType()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    move-result-object v3

    if-ne v3, p1, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    if-eqz v3, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 80
    :cond_2
    check-cast v1, Ljava/util/List;

    return-object v1
.end method

.method public final getConnections()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/connection/Connection;",
            ">;"
        }
    .end annotation

    .line 60
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;->connections:Ljava/util/List;

    return-object v0
.end method

.method public final getDeviceInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;
    .locals 1

    .line 60
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;->deviceInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    return-object v0
.end method

.method public final getHasConnections()Z
    .locals 1

    .line 66
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;->getNumberOfConnections()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final getNumberOfConnections()I
    .locals 1

    .line 63
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;->connections:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final getTechnologyType()Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;
    .locals 1

    .line 60
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;->technologyType:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;->deviceInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;->connections:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;->technologyType:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Accessory(deviceInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;->deviceInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", connections="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;->connections:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", technologyType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;->technologyType:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
