.class public interface abstract Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsStorage;
.super Ljava/lang/Object;
.source "AlertsStorage.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ThirdPartyAppStorage;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008f\u0018\u00002\u00020\u0001J\u0018\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&J0\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0005R\u0012\u0010\u0008\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\u0005R\u0012\u0010\n\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u0005\u00a8\u0006\u0019"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsStorage;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ThirdPartyAppStorage;",
        "areAlarmsEnabled",
        "",
        "getAreAlarmsEnabled",
        "()Z",
        "areCallsEnabled",
        "getAreCallsEnabled",
        "areGoalsEnabled",
        "getAreGoalsEnabled",
        "areMessagesEnabled",
        "getAreMessagesEnabled",
        "setActivityGoalsNotificationEnabled",
        "Lio/reactivex/Completable;",
        "isEnabled",
        "context",
        "Landroid/content/Context;",
        "setAlarmsNotificationEnabled",
        "setCallsNotificationEnabled",
        "setMessagesNotificationEnabled",
        "setNotificationTypesEnabled",
        "calls",
        "messages",
        "alarms",
        "activityGoals",
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
.method public abstract getAreAlarmsEnabled()Z
.end method

.method public abstract getAreCallsEnabled()Z
.end method

.method public abstract getAreGoalsEnabled()Z
.end method

.method public abstract getAreMessagesEnabled()Z
.end method

.method public abstract setActivityGoalsNotificationEnabled(ZLandroid/content/Context;)Lio/reactivex/Completable;
.end method

.method public abstract setAlarmsNotificationEnabled(ZLandroid/content/Context;)Lio/reactivex/Completable;
.end method

.method public abstract setCallsNotificationEnabled(ZLandroid/content/Context;)Lio/reactivex/Completable;
.end method

.method public abstract setMessagesNotificationEnabled(ZLandroid/content/Context;)Lio/reactivex/Completable;
.end method

.method public abstract setNotificationTypesEnabled(ZZZZLandroid/content/Context;)Lio/reactivex/Completable;
.end method
