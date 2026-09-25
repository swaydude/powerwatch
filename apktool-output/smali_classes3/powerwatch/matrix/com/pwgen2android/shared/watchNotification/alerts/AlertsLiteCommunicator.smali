.class public interface abstract Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator;
.super Ljava/lang/Object;
.source "AlertsLiteCommunicator.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\n\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0002\u0008\n\u0008f\u0018\u00002\u00020\u0001JH\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00052\u0008\u0008\u0002\u0010\t\u001a\u00020\u00052\u0008\u0008\u0002\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000cH&JH\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00052\u0008\u0008\u0002\u0010\t\u001a\u00020\u00052\u0008\u0008\u0002\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000cH&JB\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000cH&JB\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000cH&JB\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000cH&JB\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000cH&JB\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000cH&JB\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000cH&JB\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000cH&\u00a8\u0006\u0016"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator;",
        "",
        "sendClearCallIconAlert",
        "Lio/reactivex/Completable;",
        "deviceId",
        "",
        "uid",
        "",
        "title",
        "subTitle",
        "body",
        "postTime",
        "",
        "notificationTime",
        "sendClearMessageIconAlert",
        "sendImportantCallAlert",
        "sendImportantMessageAlert",
        "sendPreExistingCallAlert",
        "sendPreExistingMessageAlert",
        "sendSilentCallAlert",
        "sendSilentIncomingCallAlert",
        "sendSilentMessageAlert",
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
.method public abstract sendClearCallIconAlert(Ljava/lang/String;SLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)Lio/reactivex/Completable;
.end method

.method public abstract sendClearMessageIconAlert(Ljava/lang/String;SLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)Lio/reactivex/Completable;
.end method

.method public abstract sendImportantCallAlert(Ljava/lang/String;SLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)Lio/reactivex/Completable;
.end method

.method public abstract sendImportantMessageAlert(Ljava/lang/String;SLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)Lio/reactivex/Completable;
.end method

.method public abstract sendPreExistingCallAlert(Ljava/lang/String;SLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)Lio/reactivex/Completable;
.end method

.method public abstract sendPreExistingMessageAlert(Ljava/lang/String;SLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)Lio/reactivex/Completable;
.end method

.method public abstract sendSilentCallAlert(Ljava/lang/String;SLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)Lio/reactivex/Completable;
.end method

.method public abstract sendSilentIncomingCallAlert(Ljava/lang/String;SLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)Lio/reactivex/Completable;
.end method

.method public abstract sendSilentMessageAlert(Ljava/lang/String;SLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)Lio/reactivex/Completable;
.end method
