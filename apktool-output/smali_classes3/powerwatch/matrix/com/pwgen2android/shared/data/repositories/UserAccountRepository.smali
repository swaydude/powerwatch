.class public interface abstract Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;
.super Ljava/lang/Object;
.source "UserAccountRepository.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AddRepository;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetFirstRepository;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateRepository;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeleteRepository;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ObserveRepository;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AddRepository<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;",
        ">;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetFirstRepository<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;",
        ">;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateRepository<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;",
        ">;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeleteRepository<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;",
        ">;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ObserveRepository<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u0008f\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00020\u00032\u0008\u0012\u0004\u0012\u00020\u00020\u00042\u0008\u0012\u0004\u0012\u00020\u00020\u00052\u0008\u0012\u0004\u0012\u00020\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nH&J\u0018\u0010\u000c\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH&\u00a8\u0006\u000f"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AddRepository;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetFirstRepository;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateRepository;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeleteRepository;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ObserveRepository;",
        "forgotPassword",
        "Lio/reactivex/Completable;",
        "email",
        "",
        "resendEmail",
        "resetPassword",
        "oldPassword",
        "newPassword",
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
.method public abstract forgotPassword(Ljava/lang/String;)Lio/reactivex/Completable;
.end method

.method public abstract resendEmail(Ljava/lang/String;)Lio/reactivex/Completable;
.end method

.method public abstract resetPassword(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/Completable;
.end method
