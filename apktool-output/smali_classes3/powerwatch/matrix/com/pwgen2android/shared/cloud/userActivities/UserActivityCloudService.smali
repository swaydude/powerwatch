.class public interface abstract Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityCloudService;
.super Ljava/lang/Object;
.source "UserActivityCloudService.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001c\u0010\u0006\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u00080\u00072\u0006\u0010\t\u001a\u00020\nH&J\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000c0\u00080\u00072\u0006\u0010\t\u001a\u00020\nH&J\u0016\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0016\u0010\u0010\u001a\u00020\u00032\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0008H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0013"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityCloudService;",
        "",
        "deleteUserActivity",
        "Lio/reactivex/Completable;",
        "userActivity",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
        "getAllUserActivities",
        "Lio/reactivex/Single;",
        "",
        "page",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;",
        "getAllUserActivityDates",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityDate;",
        "getOneUserActivity",
        "id",
        "",
        "saveUserActivities",
        "userActivities",
        "updateUserActivity",
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
.method public abstract deleteUserActivity(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)Lio/reactivex/Completable;
.end method

.method public abstract getAllUserActivities(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;)Lio/reactivex/Single;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;",
            ")",
            "Lio/reactivex/Single<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract getAllUserActivityDates(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;)Lio/reactivex/Single;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;",
            ")",
            "Lio/reactivex/Single<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityDate;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract getOneUserActivity(Ljava/lang/String;)Lio/reactivex/Single;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Single<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
            ">;"
        }
    .end annotation
.end method

.method public abstract saveUserActivities(Ljava/util/List;)Lio/reactivex/Completable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
            ">;)",
            "Lio/reactivex/Completable;"
        }
    .end annotation
.end method

.method public abstract updateUserActivity(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)Lio/reactivex/Completable;
.end method
