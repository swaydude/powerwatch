.class public interface abstract Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlarmsCommunicator;
.super Ljava/lang/Object;
.source "AlarmsCommunicator.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0008H&\u00a8\u0006\t"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlarmsCommunicator;",
        "",
        "disableAlarm",
        "Lio/reactivex/Completable;",
        "deviceId",
        "",
        "enableAlarm",
        "alarm",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Alarm;",
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
.method public abstract disableAlarm(Ljava/lang/String;)Lio/reactivex/Completable;
.end method

.method public abstract enableAlarm(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Alarm;)Lio/reactivex/Completable;
.end method
