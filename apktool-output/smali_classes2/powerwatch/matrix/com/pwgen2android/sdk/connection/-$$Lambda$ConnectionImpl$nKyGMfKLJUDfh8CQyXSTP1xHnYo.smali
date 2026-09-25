.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/connection/-$$Lambda$ConnectionImpl$nKyGMfKLJUDfh8CQyXSTP1xHnYo;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/-$$Lambda$ConnectionImpl$nKyGMfKLJUDfh8CQyXSTP1xHnYo;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/-$$Lambda$ConnectionImpl$nKyGMfKLJUDfh8CQyXSTP1xHnYo;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;->lambda$nKyGMfKLJUDfh8CQyXSTP1xHnYo(Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;)Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;

    move-result-object p1

    return-object p1
.end method
