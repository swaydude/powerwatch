.class public abstract Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;
.super Ljava/lang/Object;
.source "UserActivitySessionDao.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\r\u0008\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u00050\u0004H\'J\u0010\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0008\u0010\u000f\u001a\u00020\u0008H\'J\u0008\u0010\u0010\u001a\u00020\u0008H\'J\u0010\u0010\u0011\u001a\u00020\u000c2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u0012\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020\u000eH\'J$\u0010\u0013\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\n0\u00050\u00142\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\'J\u0016\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\'J\u0008\u0010\u001a\u001a\u00020\u000eH\'J\u0014\u0010\u001b\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\n0\u00050\u0014H\'J\u0016\u0010\u001c\u001a\u00020\u00082\u000c\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0005H\'J\u0016\u0010\u001e\u001a\u00020\u00082\u000c\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\'J\u0014\u0010 \u001a\u00020\u000c2\u000c\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005J\u0016\u0010!\u001a\u00020\u000c2\u000c\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0005H\u0007J\u0010\u0010#\u001a\u00020\u00082\u0006\u0010$\u001a\u00020\nH\'J\u0010\u0010%\u001a\u00020\u000c2\u0006\u0010\t\u001a\u00020\nH\u0007\u00a8\u0006&"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;",
        "",
        "()V",
        "allActivityDates",
        "Lio/reactivex/Observable;",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityDate;",
        "delete",
        "",
        "session",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
        "deleteActivityDateCompletable",
        "Lio/reactivex/Completable;",
        "startTime",
        "",
        "deleteAll",
        "deleteAllActivityDates",
        "deleteCompletable",
        "deleteSyngleActivityDate",
        "getAll",
        "Lio/reactivex/Single;",
        "endTime",
        "getOne",
        "Lio/reactivex/Maybe;",
        "id",
        "",
        "notSyncedCount",
        "notSyncedSessions",
        "save",
        "items",
        "saveActivityDates",
        "dates",
        "saveActivityDatesCompletable",
        "saveCompletable",
        "sessions",
        "update",
        "item",
        "updateCompletable",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final deleteActivityDateCompletable$lambda-3(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;J)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;->deleteSyngleActivityDate(J)V

    return-void
.end method

.method private static final deleteCompletable$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$session"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;->delete(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)V

    return-void
.end method

.method public static synthetic lambda$CIdGF78n3vGPnvlzY7oSwzlKKCY(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;->deleteCompletable$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)V

    return-void
.end method

.method public static synthetic lambda$L6XL3YuEjDGV7n05ORuFjSHcJ_M(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;J)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;->deleteActivityDateCompletable$lambda-3(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;J)V

    return-void
.end method

.method public static synthetic lambda$RrJIyKbrsqe1MxFsppffR058sso(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;->updateCompletable$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)V

    return-void
.end method

.method public static synthetic lambda$VBVEczuyHBBkzLywdIbZY9DibGk(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;->saveCompletable$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic lambda$aFlNA5McXUqg_ujHjrPP1pDzOU8(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;->saveActivityDatesCompletable$lambda-4(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;Ljava/util/List;)V

    return-void
.end method

.method private static final saveActivityDatesCompletable$lambda-4(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;Ljava/util/List;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$dates"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;->saveActivityDates(Ljava/util/List;)V

    return-void
.end method

.method private static final saveCompletable$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;Ljava/util/List;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$sessions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;->save(Ljava/util/List;)V

    return-void
.end method

.method private static final updateCompletable$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$session"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;->update(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)V

    return-void
.end method


# virtual methods
.method public abstract allActivityDates()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityDate;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract delete(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)V
.end method

.method public final deleteActivityDateCompletable(J)Lio/reactivex/Completable;
    .locals 1

    .line 65
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/-$$Lambda$UserActivitySessionDao$L6XL3YuEjDGV7n05ORuFjSHcJ_M;

    invoke-direct {v0, p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/-$$Lambda$UserActivitySessionDao$L6XL3YuEjDGV7n05ORuFjSHcJ_M;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;J)V

    invoke-static {v0}, Lio/reactivex/Completable;->fromAction(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object p1

    const-string p2, "fromAction {\n            deleteSyngleActivityDate(startTime)\n        }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public abstract deleteAll()V
.end method

.method public abstract deleteAllActivityDates()V
.end method

.method public final deleteCompletable(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)Lio/reactivex/Completable;
    .locals 1

    const-string v0, "session"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/-$$Lambda$UserActivitySessionDao$CIdGF78n3vGPnvlzY7oSwzlKKCY;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/-$$Lambda$UserActivitySessionDao$CIdGF78n3vGPnvlzY7oSwzlKKCY;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)V

    invoke-static {v0}, Lio/reactivex/Completable;->fromAction(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object p1

    const-string v0, "fromAction {\n        delete(session)\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public abstract deleteSyngleActivityDate(J)V
.end method

.method public abstract getAll(JJ)Lio/reactivex/Single;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ)",
            "Lio/reactivex/Single<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract getOne(Ljava/lang/String;)Lio/reactivex/Maybe;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Maybe<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
            ">;"
        }
    .end annotation
.end method

.method public abstract notSyncedCount()J
.end method

.method public abstract notSyncedSessions()Lio/reactivex/Single;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Single<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract save(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract saveActivityDates(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityDate;",
            ">;)V"
        }
    .end annotation
.end method

.method public final saveActivityDatesCompletable(Ljava/util/List;)Lio/reactivex/Completable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityDate;",
            ">;)",
            "Lio/reactivex/Completable;"
        }
    .end annotation

    const-string v0, "dates"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/-$$Lambda$UserActivitySessionDao$aFlNA5McXUqg_ujHjrPP1pDzOU8;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/-$$Lambda$UserActivitySessionDao$aFlNA5McXUqg_ujHjrPP1pDzOU8;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;Ljava/util/List;)V

    invoke-static {v0}, Lio/reactivex/Completable;->fromAction(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object p1

    const-string v0, "fromAction {\n        saveActivityDates(dates)\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final saveCompletable(Ljava/util/List;)Lio/reactivex/Completable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
            ">;)",
            "Lio/reactivex/Completable;"
        }
    .end annotation

    const-string v0, "sessions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/-$$Lambda$UserActivitySessionDao$VBVEczuyHBBkzLywdIbZY9DibGk;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/-$$Lambda$UserActivitySessionDao$VBVEczuyHBBkzLywdIbZY9DibGk;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;Ljava/util/List;)V

    invoke-static {v0}, Lio/reactivex/Completable;->fromAction(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object p1

    const-string v0, "fromAction {\n            save(sessions)\n        }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public abstract update(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)V
.end method

.method public final updateCompletable(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)Lio/reactivex/Completable;
    .locals 1

    const-string v0, "session"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/-$$Lambda$UserActivitySessionDao$RrJIyKbrsqe1MxFsppffR058sso;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/-$$Lambda$UserActivitySessionDao$RrJIyKbrsqe1MxFsppffR058sso;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)V

    invoke-static {v0}, Lio/reactivex/Completable;->fromAction(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object p1

    const-string v0, "fromAction {\n            update(session)\n        }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
