.class public interface abstract Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountService;
.super Ljava/lang/Object;
.source "UserAccountService.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateService;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;",
        ">;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;",
        ">;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateService<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00020\u00032\u0008\u0012\u0004\u0012\u00020\u00020\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0008H&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0008H&J\u0010\u0010\u000c\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0008H&J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH&J.\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000f\u001a\u00020\u00122\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00080\u0014j\u0002`\u0015H&\u00a8\u0006\u0016"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountService;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateService;",
        "addFirebaseToken",
        "Lio/reactivex/CompletableSource;",
        "token",
        "",
        "forgotPassword",
        "Lio/reactivex/Completable;",
        "email",
        "resendVerifyEmail",
        "resetPassword",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/ResetPassword;",
        "verifyUser",
        "Lio/reactivex/Single;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/VerifyUser;",
        "headers",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/Headers;",
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
.method public abstract addFirebaseToken(Ljava/lang/String;)Lio/reactivex/CompletableSource;
.end method

.method public abstract forgotPassword(Ljava/lang/String;)Lio/reactivex/Completable;
.end method

.method public abstract resendVerifyEmail(Ljava/lang/String;)Lio/reactivex/Completable;
.end method

.method public abstract resetPassword(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/ResetPassword;)Lio/reactivex/Completable;
.end method

.method public abstract verifyUser(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/VerifyUser;Ljava/util/Map;)Lio/reactivex/Single;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/VerifyUser;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lio/reactivex/Single<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;",
            ">;"
        }
    .end annotation
.end method
