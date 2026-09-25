.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$ProtocolImpl$abHRpp33_gxZRVTlL2nwuBJEWTE;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Consumer;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolImpl;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$ProtocolImpl$abHRpp33_gxZRVTlL2nwuBJEWTE;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolImpl;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$ProtocolImpl$abHRpp33_gxZRVTlL2nwuBJEWTE;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolImpl;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolImpl;->lambda$abHRpp33_gxZRVTlL2nwuBJEWTE(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;)V

    return-void
.end method
