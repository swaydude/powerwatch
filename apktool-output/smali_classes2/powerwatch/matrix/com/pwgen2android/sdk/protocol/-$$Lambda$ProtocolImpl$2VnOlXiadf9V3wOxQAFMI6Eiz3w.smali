.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$ProtocolImpl$2VnOlXiadf9V3wOxQAFMI6Eiz3w;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolImpl;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$ProtocolImpl$2VnOlXiadf9V3wOxQAFMI6Eiz3w;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolImpl;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$ProtocolImpl$2VnOlXiadf9V3wOxQAFMI6Eiz3w;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolImpl;

    check-cast p1, [B

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolImpl;->lambda$2VnOlXiadf9V3wOxQAFMI6Eiz3w(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolImpl;[B)Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;

    move-result-object p1

    return-object p1
.end method
