.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$ZwsswIRzPLS2ePdRgGcV_p41XD8;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

.field public final synthetic f$1:[B


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$ZwsswIRzPLS2ePdRgGcV_p41XD8;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$ZwsswIRzPLS2ePdRgGcV_p41XD8;->f$1:[B

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$ZwsswIRzPLS2ePdRgGcV_p41XD8;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$ZwsswIRzPLS2ePdRgGcV_p41XD8;->f$1:[B

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;->lambda$ZwsswIRzPLS2ePdRgGcV_p41XD8(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;[BLpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Lio/reactivex/ObservableSource;

    move-result-object p1

    return-object p1
.end method
