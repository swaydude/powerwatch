.class public abstract Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao;
.super Ljava/lang/Object;
.source "GoalsDao.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\'J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0007H\'J\u0016\u0010\u0008\u001a\u00020\t2\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u00060\u000bH\'J\u0008\u0010\u000c\u001a\u00020\rH\'J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\rH\'J\u0008\u0010\u0010\u001a\u00020\u0004H\'J\u0008\u0010\u0011\u001a\u00020\tH\u0007J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\rH\u0007J\u0016\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00142\u0006\u0010\u000f\u001a\u00020\rH\'J\u000e\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0016H\'\u00a8\u0006\u0017"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao;",
        "",
        "()V",
        "add",
        "",
        "item",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;",
        "addCompletable",
        "Lio/reactivex/Completable;",
        "all",
        "Lio/reactivex/Single;",
        "count",
        "",
        "delete",
        "id",
        "deleteAll",
        "deleteAllCompletable",
        "deleteCompletable",
        "get",
        "Lio/reactivex/Maybe;",
        "lastByCreated",
        "Lio/reactivex/Observable;",
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

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final addCompletable$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao;Ljava/util/List;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao;->add(Ljava/util/List;)V

    return-void
.end method

.method private static final deleteAllCompletable$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao;->deleteAll()V

    return-void
.end method

.method private static final deleteCompletable$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao;J)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao;->delete(J)V

    return-void
.end method

.method public static synthetic lambda$2TTbmrPSc97xKN5pm5HUq-YdEKw(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao;->deleteAllCompletable$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao;)V

    return-void
.end method

.method public static synthetic lambda$A1P4mH_NAWJbJjC9BYwc29nPcqw(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao;Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao;->addCompletable$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic lambda$S_wLsJy1WiaCY1UrlApEAUZ8IiQ(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao;J)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao;->deleteCompletable$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao;J)V

    return-void
.end method


# virtual methods
.method public abstract add(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract add(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;)V
.end method

.method public final addCompletable(Ljava/util/List;)Lio/reactivex/Completable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;",
            ">;)",
            "Lio/reactivex/Completable;"
        }
    .end annotation

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/-$$Lambda$GoalConfigurationDao$A1P4mH_NAWJbJjC9BYwc29nPcqw;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/-$$Lambda$GoalConfigurationDao$A1P4mH_NAWJbJjC9BYwc29nPcqw;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao;Ljava/util/List;)V

    invoke-static {v0}, Lio/reactivex/Completable;->fromAction(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object p1

    const-string v0, "fromAction {\n            add(item)\n        }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public abstract all()Lio/reactivex/Single;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Single<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract count()J
.end method

.method public abstract delete(J)V
.end method

.method public abstract deleteAll()V
.end method

.method public final deleteAllCompletable()Lio/reactivex/Completable;
    .locals 2

    .line 55
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/-$$Lambda$GoalConfigurationDao$2TTbmrPSc97xKN5pm5HUq-YdEKw;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/-$$Lambda$GoalConfigurationDao$2TTbmrPSc97xKN5pm5HUq-YdEKw;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao;)V

    invoke-static {v0}, Lio/reactivex/Completable;->fromAction(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object v0

    const-string v1, "fromAction {\n            deleteAll()\n        }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final deleteCompletable(J)Lio/reactivex/Completable;
    .locals 1

    .line 42
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/-$$Lambda$GoalConfigurationDao$S_wLsJy1WiaCY1UrlApEAUZ8IiQ;

    invoke-direct {v0, p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/-$$Lambda$GoalConfigurationDao$S_wLsJy1WiaCY1UrlApEAUZ8IiQ;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao;J)V

    invoke-static {v0}, Lio/reactivex/Completable;->fromAction(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object p1

    const-string p2, "fromAction {\n            delete(id)\n        }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public abstract get(J)Lio/reactivex/Maybe;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Lio/reactivex/Maybe<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;",
            ">;"
        }
    .end annotation
.end method

.method public abstract lastByCreated()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;",
            ">;"
        }
    .end annotation
.end method
