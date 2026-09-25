.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$DeviceImpl$gZKNY38XlkieKhWH1yT0TFikyv0;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Consumer;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$DeviceImpl$gZKNY38XlkieKhWH1yT0TFikyv0;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$DeviceImpl$gZKNY38XlkieKhWH1yT0TFikyv0;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;->lambda$gZKNY38XlkieKhWH1yT0TFikyv0(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)V

    return-void
.end method
