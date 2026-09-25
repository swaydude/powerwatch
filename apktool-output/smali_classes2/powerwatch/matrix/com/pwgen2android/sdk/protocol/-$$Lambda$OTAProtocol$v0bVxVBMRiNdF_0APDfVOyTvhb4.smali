.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$OTAProtocol$v0bVxVBMRiNdF_0APDfVOyTvhb4;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/OTAProtocol;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/OTAProtocol;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$OTAProtocol$v0bVxVBMRiNdF_0APDfVOyTvhb4;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/OTAProtocol;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$OTAProtocol$v0bVxVBMRiNdF_0APDfVOyTvhb4;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/OTAProtocol;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/OTAProtocol;->lambda$v0bVxVBMRiNdF_0APDfVOyTvhb4(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/OTAProtocol;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;)Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;

    move-result-object p1

    return-object p1
.end method
