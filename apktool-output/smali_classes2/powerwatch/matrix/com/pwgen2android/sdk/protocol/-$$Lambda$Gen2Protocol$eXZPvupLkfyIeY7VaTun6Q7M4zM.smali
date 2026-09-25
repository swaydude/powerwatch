.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$Gen2Protocol$eXZPvupLkfyIeY7VaTun6Q7M4zM;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Consumer;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2Protocol;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2Protocol;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$Gen2Protocol$eXZPvupLkfyIeY7VaTun6Q7M4zM;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2Protocol;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$Gen2Protocol$eXZPvupLkfyIeY7VaTun6Q7M4zM;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2Protocol;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2Protocol;->lambda$eXZPvupLkfyIeY7VaTun6Q7M4zM(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2Protocol;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;)V

    return-void
.end method
