.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/-$$Lambda$Gen2AlertsCommunicator$pKezd1LZYkIdPJ2zGWqjyul2gUw;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic f$0:Z

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;

.field public final synthetic f$2:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;

.field public final synthetic f$3:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(ZLpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/-$$Lambda$Gen2AlertsCommunicator$pKezd1LZYkIdPJ2zGWqjyul2gUw;->f$0:Z

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/-$$Lambda$Gen2AlertsCommunicator$pKezd1LZYkIdPJ2zGWqjyul2gUw;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/-$$Lambda$Gen2AlertsCommunicator$pKezd1LZYkIdPJ2zGWqjyul2gUw;->f$2:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;

    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/-$$Lambda$Gen2AlertsCommunicator$pKezd1LZYkIdPJ2zGWqjyul2gUw;->f$3:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 4

    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/-$$Lambda$Gen2AlertsCommunicator$pKezd1LZYkIdPJ2zGWqjyul2gUw;->f$0:Z

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/-$$Lambda$Gen2AlertsCommunicator$pKezd1LZYkIdPJ2zGWqjyul2gUw;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/-$$Lambda$Gen2AlertsCommunicator$pKezd1LZYkIdPJ2zGWqjyul2gUw;->f$2:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;

    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/-$$Lambda$Gen2AlertsCommunicator$pKezd1LZYkIdPJ2zGWqjyul2gUw;->f$3:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;->lambda$pKezd1LZYkIdPJ2zGWqjyul2gUw(ZLpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;Ljava/lang/String;)Lio/reactivex/CompletableSource;

    move-result-object v0

    return-object v0
.end method
