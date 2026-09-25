.class final Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl$removeConnections$1;
.super Lkotlin/jvm/internal/Lambda;
.source "Device.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;->removeConnections(Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/connection/Connection;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/connection/Connection;"
    }
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $accessory:Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;


# direct methods
.method constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;)V
    .locals 0

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl$removeConnections$1;->$accessory:Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 123
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/Connection;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl$removeConnections$1;->invoke(Lpowerwatch/matrix/com/pwgen2android/sdk/connection/Connection;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lpowerwatch/matrix/com/pwgen2android/sdk/connection/Connection;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 124
    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/Connection;->getConnectionInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;

    move-result-object p1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;->getTechnologyType()Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;

    move-result-object p1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl$removeConnections$1;->$accessory:Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;->getTechnologyType()Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;

    move-result-object v0

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
