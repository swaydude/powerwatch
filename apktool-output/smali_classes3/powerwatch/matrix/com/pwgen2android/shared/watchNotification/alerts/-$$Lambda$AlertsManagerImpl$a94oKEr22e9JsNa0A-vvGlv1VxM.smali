.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$a94oKEr22e9JsNa0A-vvGlv1VxM;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Predicate;


# instance fields
.field public final synthetic f$0:[Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/SMSState;


# direct methods
.method public synthetic constructor <init>([Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/SMSState;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$a94oKEr22e9JsNa0A-vvGlv1VxM;->f$0:[Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/SMSState;

    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$a94oKEr22e9JsNa0A-vvGlv1VxM;->f$0:[Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/SMSState;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->lambda$a94oKEr22e9JsNa0A-vvGlv1VxM([Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/SMSState;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;)Z

    move-result p1

    return p1
.end method
