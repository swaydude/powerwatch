.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$DeviceImpl$VEyiaCb2CrfxrY6QqwjinMyiQuI;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$DeviceImpl$VEyiaCb2CrfxrY6QqwjinMyiQuI;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$DeviceImpl$VEyiaCb2CrfxrY6QqwjinMyiQuI;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$DeviceImpl$VEyiaCb2CrfxrY6QqwjinMyiQuI;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$DeviceImpl$VEyiaCb2CrfxrY6QqwjinMyiQuI;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;

    invoke-static {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;->lambda$VEyiaCb2CrfxrY6QqwjinMyiQuI(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Lio/reactivex/CompletableSource;

    move-result-object v0

    return-object v0
.end method
