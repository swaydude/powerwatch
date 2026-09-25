.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$CommunicatorImpl$6PfGVrsMe2pssK4Ve42dSl9vjBs;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Consumer;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$CommunicatorImpl$6PfGVrsMe2pssK4Ve42dSl9vjBs;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$CommunicatorImpl$6PfGVrsMe2pssK4Ve42dSl9vjBs;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->lambda$6PfGVrsMe2pssK4Ve42dSl9vjBs(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V

    return-void
.end method
