.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$sUdv1t8S7Yn7USjPrfwRvVfmhHk;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Predicate;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$sUdv1t8S7Yn7USjPrfwRvVfmhHk;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$sUdv1t8S7Yn7USjPrfwRvVfmhHk;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->lambda$sUdv1t8S7Yn7USjPrfwRvVfmhHk(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Z

    move-result p1

    return p1
.end method
