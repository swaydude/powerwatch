.class public interface abstract Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchAlarmTimerSettingExecutor;
.super Ljava/lang/Object;
.source "WatchSettingsExecutor.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0008H&\u00a8\u0006\t"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchAlarmTimerSettingExecutor;",
        "",
        "setAlarm",
        "Lio/reactivex/Completable;",
        "alarmData",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmData;",
        "setTimer",
        "timerData",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;",
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
.method public abstract setAlarm(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmData;)Lio/reactivex/Completable;
.end method

.method public abstract setTimer(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;)Lio/reactivex/Completable;
.end method
