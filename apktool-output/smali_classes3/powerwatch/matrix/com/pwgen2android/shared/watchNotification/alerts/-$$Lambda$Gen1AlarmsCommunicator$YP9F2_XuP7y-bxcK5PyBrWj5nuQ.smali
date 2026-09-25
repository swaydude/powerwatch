.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$Gen1AlarmsCommunicator$YP9F2_XuP7y-bxcK5PyBrWj5nuQ;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlarmsCommunicator;

.field public final synthetic f$1:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlarmsCommunicator;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$Gen1AlarmsCommunicator$YP9F2_XuP7y-bxcK5PyBrWj5nuQ;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlarmsCommunicator;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$Gen1AlarmsCommunicator$YP9F2_XuP7y-bxcK5PyBrWj5nuQ;->f$1:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$Gen1AlarmsCommunicator$YP9F2_XuP7y-bxcK5PyBrWj5nuQ;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlarmsCommunicator;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$Gen1AlarmsCommunicator$YP9F2_XuP7y-bxcK5PyBrWj5nuQ;->f$1:Ljava/lang/String;

    check-cast p1, [B

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlarmsCommunicator;->lambda$YP9F2_XuP7y-bxcK5PyBrWj5nuQ(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlarmsCommunicator;Ljava/lang/String;[B)Lio/reactivex/CompletableSource;

    move-result-object p1

    return-object p1
.end method
