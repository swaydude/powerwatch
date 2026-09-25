.class public interface abstract Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;
.super Ljava/lang/Object;
.source "UserActivitySessionRepository.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AddAllRepository;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetOneRepository;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeleteRepository;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AllRepository;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateRepository;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SyncDataRepository;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/CacheRepository;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AddAllRepository<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
        ">;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetOneRepository<",
        "Ljava/lang/String;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
        ">;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeleteRepository<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
        ">;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AllRepository<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
        ">;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateRepository<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
        ">;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SyncDataRepository;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/CacheRepository;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u00032\u0008\u0012\u0004\u0012\u00020\u00020\u00052\u0008\u0012\u0004\u0012\u00020\u00020\u00062\u0008\u0012\u0004\u0012\u00020\u00020\u00072\u00020\u00082\u00020\tJ\u001c\u0010\n\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\r0\u000c0\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0016\u0010\u0010\u001a\u00020\u00112\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cH&\u00a8\u0006\u0013"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AddAllRepository;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetOneRepository;",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeleteRepository;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AllRepository;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateRepository;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SyncDataRepository;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/CacheRepository;",
        "activityDates",
        "Lio/reactivex/Observable;",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityDate;",
        "page",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;",
        "saveActivityDates",
        "Lio/reactivex/Completable;",
        "dates",
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
.method public abstract activityDates(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;)Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;",
            ")",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityDate;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract saveActivityDates(Ljava/util/List;)Lio/reactivex/Completable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityDate;",
            ">;)",
            "Lio/reactivex/Completable;"
        }
    .end annotation
.end method
