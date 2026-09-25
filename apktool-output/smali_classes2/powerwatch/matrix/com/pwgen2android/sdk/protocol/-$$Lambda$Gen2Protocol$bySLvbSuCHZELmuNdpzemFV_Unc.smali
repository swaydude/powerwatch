.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$Gen2Protocol$bySLvbSuCHZELmuNdpzemFV_Unc;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2Protocol;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2Protocol;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$Gen2Protocol$bySLvbSuCHZELmuNdpzemFV_Unc;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2Protocol;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$Gen2Protocol$bySLvbSuCHZELmuNdpzemFV_Unc;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$Gen2Protocol$bySLvbSuCHZELmuNdpzemFV_Unc;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2Protocol;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$Gen2Protocol$bySLvbSuCHZELmuNdpzemFV_Unc;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;

    check-cast p1, Lkotlin/Pair;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2Protocol;->lambda$bySLvbSuCHZELmuNdpzemFV_Unc(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2Protocol;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;Lkotlin/Pair;)Lio/reactivex/SingleSource;

    move-result-object p1

    return-object p1
.end method
