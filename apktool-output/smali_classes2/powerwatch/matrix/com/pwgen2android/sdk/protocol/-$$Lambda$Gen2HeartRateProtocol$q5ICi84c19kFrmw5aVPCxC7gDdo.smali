.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$Gen2HeartRateProtocol$q5ICi84c19kFrmw5aVPCxC7gDdo;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2HeartRateProtocol;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2HeartRateProtocol;Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$Gen2HeartRateProtocol$q5ICi84c19kFrmw5aVPCxC7gDdo;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2HeartRateProtocol;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$Gen2HeartRateProtocol$q5ICi84c19kFrmw5aVPCxC7gDdo;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$Gen2HeartRateProtocol$q5ICi84c19kFrmw5aVPCxC7gDdo;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2HeartRateProtocol;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$Gen2HeartRateProtocol$q5ICi84c19kFrmw5aVPCxC7gDdo;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;

    invoke-static {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2HeartRateProtocol;->lambda$q5ICi84c19kFrmw5aVPCxC7gDdo(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2HeartRateProtocol;Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;)Lio/reactivex/CompletableSource;

    move-result-object v0

    return-object v0
.end method
