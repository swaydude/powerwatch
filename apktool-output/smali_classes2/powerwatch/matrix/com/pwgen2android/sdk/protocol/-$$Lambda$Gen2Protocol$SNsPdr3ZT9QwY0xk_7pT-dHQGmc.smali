.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$Gen2Protocol$SNsPdr3ZT9QwY0xk_7pT-dHQGmc;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$Gen2Protocol$SNsPdr3ZT9QwY0xk_7pT-dHQGmc;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$Gen2Protocol$SNsPdr3ZT9QwY0xk_7pT-dHQGmc;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;

    check-cast p1, [B

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2Protocol;->lambda$SNsPdr3ZT9QwY0xk_7pT-dHQGmc(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;[B)Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;

    move-result-object p1

    return-object p1
.end method
