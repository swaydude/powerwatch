.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$z5hWM9TgIZsA-0bboyb024OIjbc;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Consumer;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

.field public final synthetic f$2:[B


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$z5hWM9TgIZsA-0bboyb024OIjbc;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$z5hWM9TgIZsA-0bboyb024OIjbc;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$z5hWM9TgIZsA-0bboyb024OIjbc;->f$2:[B

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$z5hWM9TgIZsA-0bboyb024OIjbc;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$z5hWM9TgIZsA-0bboyb024OIjbc;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$z5hWM9TgIZsA-0bboyb024OIjbc;->f$2:[B

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    invoke-static {v0, v1, v2, p1}, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;->lambda$z5hWM9TgIZsA-0bboyb024OIjbc(Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;[BLpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V

    return-void
.end method
