.class public interface abstract Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManager;
.super Ljava/lang/Object;
.source "AlertsManager.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H&J\'\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00032\u0012\u0010\t\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u000b0\n\"\u00020\u000bH&\u00a2\u0006\u0002\u0010\u000cJ\'\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u00032\u0012\u0010\u000f\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00100\n\"\u00020\u0010H&\u00a2\u0006\u0002\u0010\u0011J\u000e\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0003H&J\u000e\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0003H&J\'\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00032\u0012\u0010\t\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u000b0\n\"\u00020\u000bH&\u00a2\u0006\u0002\u0010\u000cJ\'\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u00032\u0012\u0010\u000f\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00100\n\"\u00020\u0010H&\u00a2\u0006\u0002\u0010\u0011J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH&\u00a8\u0006\u001d"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManager;",
        "",
        "getActivityGoalsNotification",
        "Lio/reactivex/Observable;",
        "",
        "getAlarmsNotification",
        "getCallsNotification",
        "getCurrentCallNotifications",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;",
        "callState",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;",
        "([Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;)Lio/reactivex/Observable;",
        "getCurrentMessagesNotifications",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;",
        "smsState",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/SMSState;",
        "([Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/SMSState;)Lio/reactivex/Observable;",
        "getMessagesNotification",
        "getNotificationsEnabledGlobally",
        "getNumOfMissedCalls",
        "",
        "getNumOfUnreadSMS",
        "getRealtimeCallEvents",
        "getSMSRealtimeEvent",
        "invalidateNotifications",
        "",
        "context",
        "Landroid/content/Context;",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract getActivityGoalsNotification()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getAlarmsNotification()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getCallsNotification()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end method

.method public varargs abstract getCurrentCallNotifications([Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;)Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;",
            ")",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;",
            ">;"
        }
    .end annotation
.end method

.method public varargs abstract getCurrentMessagesNotifications([Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/SMSState;)Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/SMSState;",
            ")",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getMessagesNotification()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getNotificationsEnabledGlobally()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getNumOfMissedCalls()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getNumOfUnreadSMS()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end method

.method public varargs abstract getRealtimeCallEvents([Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;)Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;",
            ")",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;",
            ">;"
        }
    .end annotation
.end method

.method public varargs abstract getSMSRealtimeEvent([Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/SMSState;)Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/SMSState;",
            ")",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;",
            ">;"
        }
    .end annotation
.end method

.method public abstract invalidateNotifications(Landroid/content/Context;)V
.end method
