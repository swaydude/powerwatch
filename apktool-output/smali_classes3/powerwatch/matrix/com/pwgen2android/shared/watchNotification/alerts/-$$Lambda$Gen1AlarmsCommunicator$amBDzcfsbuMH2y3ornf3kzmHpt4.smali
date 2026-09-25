.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$Gen1AlarmsCommunicator$amBDzcfsbuMH2y3ornf3kzmHpt4;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/SingleOnSubscribe;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlarmsCommunicator;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Alarm;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlarmsCommunicator;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Alarm;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$Gen1AlarmsCommunicator$amBDzcfsbuMH2y3ornf3kzmHpt4;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlarmsCommunicator;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$Gen1AlarmsCommunicator$amBDzcfsbuMH2y3ornf3kzmHpt4;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Alarm;

    return-void
.end method


# virtual methods
.method public final subscribe(Lio/reactivex/SingleEmitter;)V
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$Gen1AlarmsCommunicator$amBDzcfsbuMH2y3ornf3kzmHpt4;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlarmsCommunicator;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$Gen1AlarmsCommunicator$amBDzcfsbuMH2y3ornf3kzmHpt4;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Alarm;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlarmsCommunicator;->lambda$amBDzcfsbuMH2y3ornf3kzmHpt4(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlarmsCommunicator;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Alarm;Lio/reactivex/SingleEmitter;)V

    return-void
.end method
