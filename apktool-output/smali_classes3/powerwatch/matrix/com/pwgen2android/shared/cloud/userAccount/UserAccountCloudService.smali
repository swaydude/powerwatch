.class public interface abstract Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;
.super Ljava/lang/Object;
.source "UserAccountCloudService.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008f\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0005H&J\u000e\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\t0\rH&J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0005H&J\u0018\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H&J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH&\u00a8\u0006\u0013"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;",
        "",
        "addPushNotificationsToken",
        "Lio/reactivex/CompletableSource;",
        "token",
        "",
        "addUser",
        "Lio/reactivex/Completable;",
        "user",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;",
        "forgotUserPassword",
        "email",
        "getUser",
        "Lio/reactivex/Single;",
        "resendVerifyEmail",
        "resetUserPassword",
        "oldPassword",
        "newPassword",
        "updateUser",
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
.method public abstract addPushNotificationsToken(Ljava/lang/String;)Lio/reactivex/CompletableSource;
.end method

.method public abstract addUser(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Lio/reactivex/Completable;
.end method

.method public abstract forgotUserPassword(Ljava/lang/String;)Lio/reactivex/Completable;
.end method

.method public abstract getUser()Lio/reactivex/Single;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Single<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;",
            ">;"
        }
    .end annotation
.end method

.method public abstract resendVerifyEmail(Ljava/lang/String;)Lio/reactivex/Completable;
.end method

.method public abstract resetUserPassword(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/Completable;
.end method

.method public abstract updateUser(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Lio/reactivex/Completable;
.end method
