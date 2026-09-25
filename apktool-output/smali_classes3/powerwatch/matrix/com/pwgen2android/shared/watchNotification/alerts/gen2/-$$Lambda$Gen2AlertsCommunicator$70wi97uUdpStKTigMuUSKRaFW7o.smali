.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/-$$Lambda$Gen2AlertsCommunicator$70wi97uUdpStKTigMuUSKRaFW7o;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;

.field public final synthetic f$1:Ljava/lang/String;

.field public final synthetic f$2:Ljava/lang/String;

.field public final synthetic f$3:Ljava/lang/String;

.field public final synthetic f$4:J

.field public final synthetic f$5:J


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/-$$Lambda$Gen2AlertsCommunicator$70wi97uUdpStKTigMuUSKRaFW7o;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/-$$Lambda$Gen2AlertsCommunicator$70wi97uUdpStKTigMuUSKRaFW7o;->f$1:Ljava/lang/String;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/-$$Lambda$Gen2AlertsCommunicator$70wi97uUdpStKTigMuUSKRaFW7o;->f$2:Ljava/lang/String;

    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/-$$Lambda$Gen2AlertsCommunicator$70wi97uUdpStKTigMuUSKRaFW7o;->f$3:Ljava/lang/String;

    iput-wide p5, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/-$$Lambda$Gen2AlertsCommunicator$70wi97uUdpStKTigMuUSKRaFW7o;->f$4:J

    iput-wide p7, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/-$$Lambda$Gen2AlertsCommunicator$70wi97uUdpStKTigMuUSKRaFW7o;->f$5:J

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/-$$Lambda$Gen2AlertsCommunicator$70wi97uUdpStKTigMuUSKRaFW7o;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/-$$Lambda$Gen2AlertsCommunicator$70wi97uUdpStKTigMuUSKRaFW7o;->f$1:Ljava/lang/String;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/-$$Lambda$Gen2AlertsCommunicator$70wi97uUdpStKTigMuUSKRaFW7o;->f$2:Ljava/lang/String;

    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/-$$Lambda$Gen2AlertsCommunicator$70wi97uUdpStKTigMuUSKRaFW7o;->f$3:Ljava/lang/String;

    iget-wide v4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/-$$Lambda$Gen2AlertsCommunicator$70wi97uUdpStKTigMuUSKRaFW7o;->f$4:J

    iget-wide v6, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/-$$Lambda$Gen2AlertsCommunicator$70wi97uUdpStKTigMuUSKRaFW7o;->f$5:J

    move-object v8, p1

    check-cast v8, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;

    invoke-static/range {v0 .. v8}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;->lambda$70wi97uUdpStKTigMuUSKRaFW7o(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;)Lio/reactivex/CompletableSource;

    move-result-object p1

    return-object p1
.end method
