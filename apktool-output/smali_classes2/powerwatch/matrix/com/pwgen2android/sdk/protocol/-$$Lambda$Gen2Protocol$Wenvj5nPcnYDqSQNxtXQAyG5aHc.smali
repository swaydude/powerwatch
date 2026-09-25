.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$Gen2Protocol$Wenvj5nPcnYDqSQNxtXQAyG5aHc;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2Protocol;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2Protocol;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$Gen2Protocol$Wenvj5nPcnYDqSQNxtXQAyG5aHc;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$Gen2Protocol$Wenvj5nPcnYDqSQNxtXQAyG5aHc;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2Protocol;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$Gen2Protocol$Wenvj5nPcnYDqSQNxtXQAyG5aHc;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$Gen2Protocol$Wenvj5nPcnYDqSQNxtXQAyG5aHc;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2Protocol;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2Protocol;->lambda$Wenvj5nPcnYDqSQNxtXQAyG5aHc(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2Protocol;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method
