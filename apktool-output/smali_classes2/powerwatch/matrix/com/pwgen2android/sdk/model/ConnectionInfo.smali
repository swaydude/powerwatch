.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;
.super Ljava/lang/Object;
.source "Entities.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0013H\u00d6\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\"\u0004\u0008\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\"\u0004\u0008\r\u0010\u000e\u00a8\u0006 "
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;",
        "Landroid/os/Parcelable;",
        "technologyType",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;",
        "protocolType",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)V",
        "getProtocolType",
        "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;",
        "setProtocolType",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)V",
        "getTechnologyType",
        "()Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;",
        "setTechnologyType",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;)V",
        "component1",
        "component2",
        "copy",
        "describeContents",
        "",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toString",
        "",
        "writeToParcel",
        "",
        "parcel",
        "Landroid/os/Parcel;",
        "flags",
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


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private protocolType:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

.field private technologyType:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo$Creator;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)V
    .locals 1

    const-string v0, "technologyType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "protocolType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;->technologyType:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;->protocolType:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    return-void
.end method

.method public static synthetic copy$default(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;->technologyType:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;->protocolType:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;->copy(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;->technologyType:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;

    return-object v0
.end method

.method public final component2()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;->protocolType:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    return-object v0
.end method

.method public final copy(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;
    .locals 1

    const-string v0, "technologyType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "protocolType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;

    invoke-direct {v0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)V

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;->technologyType:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;->technologyType:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;->protocolType:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    iget-object p1, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;->protocolType:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getProtocolType()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;
    .locals 1

    .line 16
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;->protocolType:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    return-object v0
.end method

.method public final getTechnologyType()Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;
    .locals 1

    .line 16
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;->technologyType:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;->technologyType:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;->protocolType:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setProtocolType(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;->protocolType:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    return-void
.end method

.method public final setTechnologyType(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;->technologyType:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ConnectionInfo(technologyType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;->technologyType:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", protocolType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;->protocolType:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    const-string p2, "out"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;->technologyType:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;->protocolType:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
