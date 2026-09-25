.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$j6dQZ1oljgepFbqxHT4IgsZQ-bs;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;

.field public final synthetic f$2:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

.field public final synthetic f$3:[B

.field public final synthetic f$4:F


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;[BF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$j6dQZ1oljgepFbqxHT4IgsZQ-bs;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$j6dQZ1oljgepFbqxHT4IgsZQ-bs;->f$1:Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$j6dQZ1oljgepFbqxHT4IgsZQ-bs;->f$2:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$j6dQZ1oljgepFbqxHT4IgsZQ-bs;->f$3:[B

    iput p5, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$j6dQZ1oljgepFbqxHT4IgsZQ-bs;->f$4:F

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$j6dQZ1oljgepFbqxHT4IgsZQ-bs;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$j6dQZ1oljgepFbqxHT4IgsZQ-bs;->f$1:Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$j6dQZ1oljgepFbqxHT4IgsZQ-bs;->f$2:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$j6dQZ1oljgepFbqxHT4IgsZQ-bs;->f$3:[B

    iget v4, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$j6dQZ1oljgepFbqxHT4IgsZQ-bs;->f$4:F

    invoke-static {v0, v1, v2, v3, v4}, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;->lambda$j6dQZ1oljgepFbqxHT4IgsZQ-bs(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;[BF)Lio/reactivex/ObservableSource;

    move-result-object v0

    return-object v0
.end method
