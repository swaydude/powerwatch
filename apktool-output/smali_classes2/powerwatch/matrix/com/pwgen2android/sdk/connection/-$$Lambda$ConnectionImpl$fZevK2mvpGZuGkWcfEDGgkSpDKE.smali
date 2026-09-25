.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/connection/-$$Lambda$ConnectionImpl$fZevK2mvpGZuGkWcfEDGgkSpDKE;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/CompletableOnSubscribe;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/-$$Lambda$ConnectionImpl$fZevK2mvpGZuGkWcfEDGgkSpDKE;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/-$$Lambda$ConnectionImpl$fZevK2mvpGZuGkWcfEDGgkSpDKE;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;

    return-void
.end method


# virtual methods
.method public final subscribe(Lio/reactivex/CompletableEmitter;)V
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/-$$Lambda$ConnectionImpl$fZevK2mvpGZuGkWcfEDGgkSpDKE;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/-$$Lambda$ConnectionImpl$fZevK2mvpGZuGkWcfEDGgkSpDKE;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;->lambda$fZevK2mvpGZuGkWcfEDGgkSpDKE(Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;Lio/reactivex/CompletableEmitter;)V

    return-void
.end method
