.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$Gen2ProtocolBasics$iXfTC4_wDwMoTvC-rfc1XRbj4Gg;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2ProtocolBasics;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2ProtocolBasics;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$Gen2ProtocolBasics$iXfTC4_wDwMoTvC-rfc1XRbj4Gg;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2ProtocolBasics;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$Gen2ProtocolBasics$iXfTC4_wDwMoTvC-rfc1XRbj4Gg;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2ProtocolBasics;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2ProtocolBasics;->lambda$iXfTC4_wDwMoTvC-rfc1XRbj4Gg(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2ProtocolBasics;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
