.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$vRM4tLXSbB7N5RixeNo4YYcvTFQ;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Predicate;


# instance fields
.field public final synthetic f$0:[Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;


# direct methods
.method public synthetic constructor <init>([Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$vRM4tLXSbB7N5RixeNo4YYcvTFQ;->f$0:[Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$vRM4tLXSbB7N5RixeNo4YYcvTFQ;->f$0:[Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->lambda$vRM4tLXSbB7N5RixeNo4YYcvTFQ([Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;)Z

    move-result p1

    return p1
.end method
