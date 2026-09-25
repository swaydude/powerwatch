.class public interface abstract Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlarmsManager;
.super Ljava/lang/Object;
.source "AlarmsManager.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\u00020\u00072\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\u000cH&R\u0018\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\r"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlarmsManager;",
        "",
        "alarm",
        "Lio/reactivex/Single;",
        "getAlarm",
        "()Lio/reactivex/Single;",
        "addDeviceAlarm",
        "Lio/reactivex/Completable;",
        "repeatDays",
        "",
        "",
        "time",
        "",
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
.method public abstract addDeviceAlarm(Ljava/util/List;Ljava/lang/String;)Lio/reactivex/Completable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Completable;"
        }
    .end annotation
.end method

.method public abstract getAlarm()Lio/reactivex/Single;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Single<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end method
