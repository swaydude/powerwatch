.class public final Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;
.super Ljava/lang/Object;
.source "UserActivitySessionRepository.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nUserActivitySessionRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserActivitySessionRepository.kt\npowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,200:1\n1547#2:201\n1618#2,3:202\n1547#2:205\n1618#2,3:206\n1547#2:209\n1618#2,3:210\n*S KotlinDebug\n*F\n+ 1 UserActivitySessionRepository.kt\npowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl\n*L\n84#1:201\n84#1:202,3\n72#1:205\n72#1:206,3\n91#1:209\n91#1:210,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0002\u0008\t\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\u001c\u0010\u0016\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00190\u00180\u00172\u0006\u0010\u001a\u001a\u00020\u0012H\u0016J$\u0010\u001b\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001c0\u00180\u00172\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0008\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001cH\u0016J\u001e\u0010$\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u00172\u0006\u0010%\u001a\u00020&2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\'\u001a\u00020 2\u0006\u0010(\u001a\u00020)H\u0002J\u0008\u0010*\u001a\u00020\u0013H\u0016J\u001e\u0010+\u001a\u00020\"2\u000c\u0010,\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u00182\u0006\u0010-\u001a\u00020\u001eH\u0016J\u0016\u0010.\u001a\u00020\"2\u000c\u0010/\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u0018H\u0016J\u0008\u00100\u001a\u00020\"H\u0016J\u0010\u00101\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001cH\u0016R*\u0010\u0010\u001a\u001e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011j\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013`\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R*\u0010\u0015\u001a\u001e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011j\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013`\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00062"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "userActivityCloudService",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityCloudService;",
        "userActivityDao",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;",
        "googleFitController",
        "Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;",
        "stravaController",
        "Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;",
        "dbDataRecovery",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DBDataRecovery;",
        "metricsRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DBDataRecovery;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;)V",
        "activitiesPageCache",
        "Ljava/util/HashMap;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;",
        "",
        "Lkotlin/collections/HashMap;",
        "datesPageCache",
        "activityDates",
        "Lio/reactivex/Observable;",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityDate;",
        "page",
        "all",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
        "fromCache",
        "",
        "clearCache",
        "",
        "delete",
        "Lio/reactivex/Completable;",
        "item",
        "getOne",
        "id",
        "",
        "logUploadFailedError",
        "it",
        "",
        "notSyncedCount",
        "save",
        "items",
        "toCacheOnly",
        "saveActivityDates",
        "dates",
        "sync",
        "update",
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


# instance fields
.field private final activitiesPageCache:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private final datesPageCache:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private final dbDataRecovery:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DBDataRecovery;

.field private final googleFitController:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;

.field private final metricsRepository:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;

.field private final stravaController:Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;

.field private final userActivityCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityCloudService;

.field private final userActivityDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DBDataRecovery;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;)V
    .locals 1

    const-string v0, "userActivityCloudService"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userActivityDao"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "googleFitController"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stravaController"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dbDataRecovery"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricsRepository"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->userActivityCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityCloudService;

    .line 37
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->userActivityDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;

    .line 38
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->googleFitController:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;

    .line 39
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->stravaController:Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;

    .line 40
    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->dbDataRecovery:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DBDataRecovery;

    .line 41
    iput-object p6, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->metricsRepository:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;

    .line 45
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->activitiesPageCache:Ljava/util/HashMap;

    .line 46
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->datesPageCache:Ljava/util/HashMap;

    return-void
.end method

.method private static final activityDates$lambda-18(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;Ljava/util/List;)Lio/reactivex/SingleSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 190
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->userActivityDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;->saveActivityDatesCompletable(Ljava/util/List;)Lio/reactivex/Completable;

    move-result-object p0

    invoke-virtual {p0, p1}, Lio/reactivex/Completable;->toSingleDefault(Ljava/lang/Object;)Lio/reactivex/Single;

    move-result-object p0

    check-cast p0, Lio/reactivex/SingleSource;

    return-object p0
.end method

.method private static final activityDates$lambda-19(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;Ljava/util/List;)V
    .locals 2

    const-string p2, "this$0"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "$page"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 192
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->datesPageCache:Ljava/util/HashMap;

    check-cast p0, Ljava/util/Map;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-interface {p0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final all$lambda-17(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;Z)Lio/reactivex/ObservableSource;
    .locals 6

    const-string v0, "$page"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 130
    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ActivityPeriodsExtensionsKt;->dayStartEndTime(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;)Lkotlin/Pair;

    move-result-object v0

    .line 131
    iget-object v1, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->userActivityCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityCloudService;

    invoke-interface {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityCloudService;->getAllUserActivities(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;)Lio/reactivex/Single;

    move-result-object v1

    .line 133
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UserActivitySessionRepositoryImpl$PkiE3cwUcvM1kD_QTGsG1mYmnSU;

    invoke-direct {v2, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UserActivitySessionRepositoryImpl$PkiE3cwUcvM1kD_QTGsG1mYmnSU;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Single;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object v1

    .line 137
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UserActivitySessionRepositoryImpl$l57-ImDqJZBn5IvbetDdLZQdL3c;

    invoke-direct {v2, p1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UserActivitySessionRepositoryImpl$l57-ImDqJZBn5IvbetDdLZQdL3c;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Single;->doOnSuccess(Lio/reactivex/functions/Consumer;)Lio/reactivex/Single;

    move-result-object v1

    .line 140
    invoke-virtual {v1}, Lio/reactivex/Single;->toObservable()Lio/reactivex/Observable;

    move-result-object v1

    if-eqz p2, :cond_0

    .line 143
    iget-object p0, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->userActivityDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;

    invoke-virtual {v0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    invoke-virtual {v0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide v3

    invoke-virtual {p0, v1, v2, v3, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;->getAll(JJ)Lio/reactivex/Single;

    move-result-object p0

    invoke-virtual {p0}, Lio/reactivex/Single;->toObservable()Lio/reactivex/Observable;

    move-result-object p0

    .line 144
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UserActivitySessionRepositoryImpl$9uYYw0o-ne_TRYOrBX6z1INb2qg;

    invoke-direct {p2, p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UserActivitySessionRepositoryImpl$9uYYw0o-ne_TRYOrBX6z1INb2qg;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;Lkotlin/Pair;)V

    invoke-virtual {p0, p2}, Lio/reactivex/Observable;->onErrorReturn(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0

    .line 151
    :cond_0
    iget-object p2, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->activitiesPageCache:Ljava/util/HashMap;

    invoke-virtual {p2, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;

    .line 152
    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;->isPageExpired(Ljava/lang/Long;)Z

    move-result p0

    if-nez p0, :cond_1

    .line 153
    iget-object p0, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->userActivityDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;

    invoke-virtual {v0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    invoke-virtual {v0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide v3

    invoke-virtual {p0, v1, v2, v3, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;->getAll(JJ)Lio/reactivex/Single;

    move-result-object p0

    .line 154
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UserActivitySessionRepositoryImpl$5bYTV0LliNpZjKS3GI_nuq0qEFs;

    invoke-direct {p2, p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UserActivitySessionRepositoryImpl$5bYTV0LliNpZjKS3GI_nuq0qEFs;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;Lkotlin/Pair;)V

    invoke-virtual {p0, p2}, Lio/reactivex/Single;->onErrorReturn(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object p0

    .line 159
    invoke-virtual {p0}, Lio/reactivex/Single;->toObservable()Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0

    .line 163
    :cond_1
    iget-object p0, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->userActivityDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;

    invoke-virtual {v0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    invoke-virtual {v0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    invoke-virtual {p0, v2, v3, v4, v5}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;->getAll(JJ)Lio/reactivex/Single;

    move-result-object p0

    invoke-virtual {p0}, Lio/reactivex/Single;->toObservable()Lio/reactivex/Observable;

    move-result-object p0

    .line 164
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UserActivitySessionRepositoryImpl$v3soeJM0LUvqQkM29xTLhtaXkHo;

    invoke-direct {p2, p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UserActivitySessionRepositoryImpl$v3soeJM0LUvqQkM29xTLhtaXkHo;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;Lkotlin/Pair;)V

    invoke-virtual {p0, p2}, Lio/reactivex/Observable;->onErrorReturn(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    .line 169
    check-cast v1, Lio/reactivex/ObservableSource;

    .line 162
    invoke-static {p0, v1}, Lio/reactivex/Observable;->concat(Lio/reactivex/ObservableSource;Lio/reactivex/ObservableSource;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final all$lambda-17$lambda-12(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;Ljava/util/List;)Lio/reactivex/SingleSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 134
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->userActivityDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;->saveCompletable(Ljava/util/List;)Lio/reactivex/Completable;

    move-result-object p0

    .line 135
    invoke-virtual {p0, p1}, Lio/reactivex/Completable;->toSingleDefault(Ljava/lang/Object;)Lio/reactivex/Single;

    move-result-object p0

    check-cast p0, Lio/reactivex/SingleSource;

    return-object p0
.end method

.method private static final all$lambda-17$lambda-13(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;Ljava/util/List;)V
    .locals 2

    const-string p2, "this$0"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "$page"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 138
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->activitiesPageCache:Ljava/util/HashMap;

    check-cast p0, Ljava/util/Map;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-interface {p0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final all$lambda-17$lambda-14(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;Lkotlin/Pair;Ljava/lang/Throwable;)Ljava/util/List;
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$startEndTime"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 145
    instance-of p2, p2, Landroid/database/sqlite/SQLiteBlobTooBigException;

    if-eqz p2, :cond_0

    .line 146
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->dbDataRecovery:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DBDataRecovery;

    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide p1

    invoke-virtual {p0, v0, v1, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DBDataRecovery;->loadActivities(JJ)Ljava/util/List;

    move-result-object p0

    goto :goto_0

    .line 147
    :cond_0
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method private static final all$lambda-17$lambda-15(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;Lkotlin/Pair;Ljava/lang/Throwable;)Ljava/util/List;
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$startEndTime"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 155
    instance-of p2, p2, Landroid/database/sqlite/SQLiteBlobTooBigException;

    if-eqz p2, :cond_0

    .line 156
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->dbDataRecovery:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DBDataRecovery;

    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide p1

    invoke-virtual {p0, v0, v1, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DBDataRecovery;->loadActivities(JJ)Ljava/util/List;

    move-result-object p0

    goto :goto_0

    .line 157
    :cond_0
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method private static final all$lambda-17$lambda-16(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;Lkotlin/Pair;Ljava/lang/Throwable;)Ljava/util/List;
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$startEndTime"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 165
    instance-of p2, p2, Landroid/database/sqlite/SQLiteBlobTooBigException;

    if-eqz p2, :cond_0

    .line 166
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->dbDataRecovery:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DBDataRecovery;

    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide p1

    invoke-virtual {p0, v0, v1, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DBDataRecovery;->loadActivities(JJ)Ljava/util/List;

    move-result-object p0

    goto :goto_0

    .line 167
    :cond_0
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method private static final getOne$lambda-10(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;Ljava/lang/String;Ljava/lang/Throwable;)Lio/reactivex/Maybe;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 103
    instance-of v0, p2, Landroid/database/sqlite/SQLiteBlobTooBigException;

    if-eqz v0, :cond_1

    .line 104
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->dbDataRecovery:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DBDataRecovery;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DBDataRecovery;->loadSingleActivity(Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 105
    invoke-static {p0}, Lio/reactivex/Maybe;->just(Ljava/lang/Object;)Lio/reactivex/Maybe;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-static {p2}, Lio/reactivex/Maybe;->error(Ljava/lang/Throwable;)Lio/reactivex/Maybe;

    move-result-object p0

    goto :goto_0

    .line 106
    :cond_1
    invoke-static {p2}, Lio/reactivex/Maybe;->error(Ljava/lang/Throwable;)Lio/reactivex/Maybe;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method private static final getOne$lambda-11(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;Ljava/lang/String;Ljava/lang/Throwable;)Lio/reactivex/Maybe;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 113
    instance-of v0, p2, Landroid/database/sqlite/SQLiteBlobTooBigException;

    if-eqz v0, :cond_1

    .line 114
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->dbDataRecovery:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DBDataRecovery;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DBDataRecovery;->loadSingleActivity(Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 115
    invoke-static {p0}, Lio/reactivex/Maybe;->just(Ljava/lang/Object;)Lio/reactivex/Maybe;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-static {p2}, Lio/reactivex/Maybe;->error(Ljava/lang/Throwable;)Lio/reactivex/Maybe;

    move-result-object p0

    goto :goto_0

    .line 116
    :cond_1
    invoke-static {p2}, Lio/reactivex/Maybe;->error(Ljava/lang/Throwable;)Lio/reactivex/Maybe;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static synthetic lambda$-vMHza9s-bm_px2n-zwhtTX8Tf4(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->sync$lambda-5$lambda-4(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic lambda$5bYTV0LliNpZjKS3GI_nuq0qEFs(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;Lkotlin/Pair;Ljava/lang/Throwable;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->all$lambda-17$lambda-15(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;Lkotlin/Pair;Ljava/lang/Throwable;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$9uYYw0o-ne_TRYOrBX6z1INb2qg(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;Lkotlin/Pair;Ljava/lang/Throwable;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->all$lambda-17$lambda-14(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;Lkotlin/Pair;Ljava/lang/Throwable;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$FdRL_e3Eolm7cWH_J1azXAkcxtM(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;Ljava/util/List;Ljava/lang/Throwable;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->save$lambda-9(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;Ljava/util/List;Ljava/lang/Throwable;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$J0QE1ES-_4mbRXWWxMAilQLc-bc(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->sync$lambda-5$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$JfMYBmUfb1eEnLGL1OF3HD8M-lk(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->activityDates$lambda-19(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic lambda$PkiE3cwUcvM1kD_QTGsG1mYmnSU(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;Ljava/util/List;)Lio/reactivex/SingleSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->all$lambda-17$lambda-12(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;Ljava/util/List;)Lio/reactivex/SingleSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$SkTcFKU5cK166opN2z4iqzCF22M(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;Ljava/lang/String;Ljava/lang/Throwable;)Lio/reactivex/Maybe;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->getOne$lambda-10(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;Ljava/lang/String;Ljava/lang/Throwable;)Lio/reactivex/Maybe;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$Y_nIRflsXqYwsVVOaOIMAmqGap4(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->save$lambda-7(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$bBG8YnZ9BSuGrvxY0n7RwHhO0Mo(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;Ljava/lang/String;Ljava/lang/Throwable;)Lio/reactivex/Maybe;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->getOne$lambda-11(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;Ljava/lang/String;Ljava/lang/Throwable;)Lio/reactivex/Maybe;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$f_FPumGbdsn-yzV4v5KGH57GyBA(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;Ljava/lang/Throwable;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->sync$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;Ljava/lang/Throwable;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$jXOXtEUDDwI1cNE34uO5x5RiJ94(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;Z)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->all$lambda-17(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;Z)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$l57-ImDqJZBn5IvbetDdLZQdL3c(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->all$lambda-17$lambda-13(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic lambda$lGvI7wfw15hraZj0a0bAwVaxNi0(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;Ljava/util/List;)Lio/reactivex/SingleSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->activityDates$lambda-18(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;Ljava/util/List;)Lio/reactivex/SingleSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$osWwwHIXhRhHoADAVrBdPiKjOGE(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->sync$lambda-0(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$v3soeJM0LUvqQkM29xTLhtaXkHo(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;Lkotlin/Pair;Ljava/lang/Throwable;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->all$lambda-17$lambda-16(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;Lkotlin/Pair;Ljava/lang/Throwable;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$vdipl1K0JZjTorA6yRV4XaROkiU(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;Ljava/util/List;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->sync$lambda-5(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;Ljava/util/List;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method private final logUploadFailedError(Ljava/lang/Throwable;)V
    .locals 3

    .line 96
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Error saving to cloud: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v2, 0x20

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, p1, v1, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final save$lambda-7(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    .line 88
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->logUploadFailedError(Ljava/lang/Throwable;)V

    return-void
.end method

.method private static final save$lambda-9(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;Ljava/util/List;Ljava/lang/Throwable;)Lio/reactivex/CompletableSource;
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "this$0"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "$items"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "it"

    move-object/from16 v3, p2

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    iget-object v0, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->userActivityDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;

    check-cast v1, Ljava/lang/Iterable;

    .line 209
    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v2, Ljava/util/Collection;

    .line 210
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 211
    move-object v4, v3

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x1

    const/16 v23, 0x0

    const v24, 0x17fff

    const/16 v25, 0x0

    .line 91
    invoke-static/range {v4 .. v25}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;Ljava/lang/String;FIJJFIILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 212
    :cond_0
    check-cast v2, Ljava/util/List;

    .line 91
    invoke-virtual {v0, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;->saveCompletable(Ljava/util/List;)Lio/reactivex/Completable;

    move-result-object v0

    check-cast v0, Lio/reactivex/CompletableSource;

    return-object v0
.end method

.method private static final sync$lambda-0(Ljava/lang/Throwable;)V
    .locals 0

    .line 61
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method private static final sync$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;Ljava/lang/Throwable;)Ljava/util/List;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    instance-of p1, p1, Landroid/database/sqlite/SQLiteBlobTooBigException;

    if-eqz p1, :cond_0

    .line 65
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->dbDataRecovery:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DBDataRecovery;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DBDataRecovery;->loadNotSyncedActivities()Ljava/util/List;

    move-result-object p0

    goto :goto_0

    .line 66
    :cond_0
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method private static final sync$lambda-5(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;Ljava/util/List;)Lio/reactivex/CompletableSource;
    .locals 29

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "this$0"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "it"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {}, Lio/reactivex/Completable;->complete()Lio/reactivex/Completable;

    move-result-object v0

    check-cast v0, Lio/reactivex/CompletableSource;

    return-object v0

    .line 70
    :cond_0
    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->userActivityCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityCloudService;

    invoke-interface {v2, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityCloudService;->saveUserActivities(Ljava/util/List;)Lio/reactivex/Completable;

    move-result-object v2

    .line 71
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UserActivitySessionRepositoryImpl$J0QE1ES-_4mbRXWWxMAilQLc-bc;

    invoke-direct {v3, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UserActivitySessionRepositoryImpl$J0QE1ES-_4mbRXWWxMAilQLc-bc;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;)V

    invoke-virtual {v2, v3}, Lio/reactivex/Completable;->doOnError(Lio/reactivex/functions/Consumer;)Lio/reactivex/Completable;

    move-result-object v2

    .line 72
    iget-object v3, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->userActivityDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;

    move-object v4, v1

    check-cast v4, Ljava/lang/Iterable;

    .line 205
    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v4, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v5, Ljava/util/Collection;

    .line 206
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 207
    move-object v7, v6

    check-cast v7, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const v27, 0x17fff

    const/16 v28, 0x0

    .line 72
    invoke-static/range {v7 .. v28}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;Ljava/lang/String;FIJJFIILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 208
    :cond_1
    check-cast v5, Ljava/util/List;

    .line 72
    invoke-virtual {v3, v5}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;->saveCompletable(Ljava/util/List;)Lio/reactivex/Completable;

    move-result-object v3

    check-cast v3, Lio/reactivex/CompletableSource;

    invoke-virtual {v2, v3}, Lio/reactivex/Completable;->andThen(Lio/reactivex/CompletableSource;)Lio/reactivex/Completable;

    move-result-object v2

    .line 73
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UserActivitySessionRepositoryImpl$-vMHza9s-bm_px2n-zwhtTX8Tf4;

    invoke-direct {v3, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UserActivitySessionRepositoryImpl$-vMHza9s-bm_px2n-zwhtTX8Tf4;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;Ljava/util/List;)V

    invoke-virtual {v2, v3}, Lio/reactivex/Completable;->doOnComplete(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object v0

    check-cast v0, Lio/reactivex/CompletableSource;

    return-object v0
.end method

.method private static final sync$lambda-5$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    .line 71
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->logUploadFailedError(Ljava/lang/Throwable;)V

    return-void
.end method

.method private static final sync$lambda-5$lambda-4(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;Ljava/util/List;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->stravaController:Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->writeSessionList(Ljava/util/List;)V

    .line 75
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->googleFitController:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->writeSessionList(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public activityDates(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;)Lio/reactivex/Observable;
    .locals 2
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

    const-string v0, "page"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 184
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->datesPageCache:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    .line 185
    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;->isPageExpired(Ljava/lang/Long;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 186
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->userActivityDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;->allActivityDates()Lio/reactivex/Observable;

    move-result-object p1

    return-object p1

    .line 188
    :cond_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->userActivityCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityCloudService;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityCloudService;->getAllUserActivityDates(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;)Lio/reactivex/Single;

    move-result-object v0

    .line 190
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UserActivitySessionRepositoryImpl$lGvI7wfw15hraZj0a0bAwVaxNi0;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UserActivitySessionRepositoryImpl$lGvI7wfw15hraZj0a0bAwVaxNi0;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Single;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object v0

    .line 191
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UserActivitySessionRepositoryImpl$JfMYBmUfb1eEnLGL1OF3HD8M-lk;

    invoke-direct {v1, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UserActivitySessionRepositoryImpl$JfMYBmUfb1eEnLGL1OF3HD8M-lk;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Single;->doOnSuccess(Lio/reactivex/functions/Consumer;)Lio/reactivex/Single;

    move-result-object p1

    .line 194
    invoke-virtual {p1}, Lio/reactivex/Single;->toObservable()Lio/reactivex/Observable;

    move-result-object p1

    .line 195
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->userActivityDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;->allActivityDates()Lio/reactivex/Observable;

    move-result-object v0

    check-cast v0, Lio/reactivex/ObservableSource;

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->onErrorResumeNext(Lio/reactivex/ObservableSource;)Lio/reactivex/Observable;

    move-result-object p1

    check-cast p1, Lio/reactivex/ObservableSource;

    .line 196
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->userActivityDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;->allActivityDates()Lio/reactivex/Observable;

    move-result-object v0

    check-cast v0, Lio/reactivex/ObservableSource;

    .line 188
    invoke-static {p1, v0}, Lio/reactivex/Observable;->merge(Lio/reactivex/ObservableSource;Lio/reactivex/ObservableSource;)Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "merge(userActivityCloudService.getAllUserActivityDates(page)\n\n                .flatMap { userActivityDao.saveActivityDatesCompletable(it).toSingleDefault(it) }\n                .doOnSuccess {\n                    datesPageCache[page] = System.currentTimeMillis()\n                }\n                .toObservable()\n                .onErrorResumeNext(userActivityDao.allActivityDates()),\n                userActivityDao.allActivityDates())"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public all(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;Z)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;",
            "Z)",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
            ">;>;"
        }
    .end annotation

    const-string v0, "page"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 128
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UserActivitySessionRepositoryImpl$jXOXtEUDDwI1cNE34uO5x5RiJ94;

    invoke-direct {v0, p1, p0, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UserActivitySessionRepositoryImpl$jXOXtEUDDwI1cNE34uO5x5RiJ94;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;Z)V

    invoke-static {v0}, Lio/reactivex/Observable;->defer(Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "defer {\n\n        val startEndTime = page.dayStartEndTime()\n        val cloudObs = userActivityCloudService.getAllUserActivities(page)\n\n                .flatMap {\n                    userActivityDao.saveCompletable(it)\n                            .toSingleDefault(it)\n                }\n                .doOnSuccess {\n                    activitiesPageCache[page] = System.currentTimeMillis()\n                }\n                .toObservable()\n\n        if (fromCache) {\n            return@defer userActivityDao.getAll(startEndTime.first, startEndTime.second).toObservable()\n                    .onErrorReturn {\n                        if (it is SQLiteBlobTooBigException) {\n                            dbDataRecovery.loadActivities(startEndTime.first, startEndTime.second)\n                        } else emptyList()\n                    }\n        }\n\n        val lastSuccessStoredTime = activitiesPageCache[page]\n        if (!page.isPageExpired(lastSuccessStoredTime)) {\n            return@defer userActivityDao.getAll(startEndTime.first, startEndTime.second)\n                    .onErrorReturn {\n                        if (it is SQLiteBlobTooBigException) {\n                            dbDataRecovery.loadActivities(startEndTime.first, startEndTime.second)\n                        } else emptyList()\n                    }\n                    .toObservable()\n        }\n\n        Observable.concat(\n                userActivityDao.getAll(startEndTime.first, startEndTime.second).toObservable()\n                        .onErrorReturn {\n                            if (it is SQLiteBlobTooBigException) {\n                                dbDataRecovery.loadActivities(startEndTime.first, startEndTime.second)\n                            } else emptyList()\n                        },\n                cloudObs)\n    }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public clearCache()V
    .locals 1

    .line 173
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->activitiesPageCache:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 174
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->datesPageCache:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    return-void
.end method

.method public bridge synthetic delete(Ljava/lang/Object;)Lio/reactivex/Completable;
    .locals 0

    .line 36
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->delete(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public delete(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)Lio/reactivex/Completable;
    .locals 4

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 122
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->userActivityCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityCloudService;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityCloudService;->deleteUserActivity(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)Lio/reactivex/Completable;

    move-result-object v0

    .line 123
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->userActivityDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;

    invoke-virtual {v1, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;->deleteCompletable(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)Lio/reactivex/Completable;

    move-result-object v1

    check-cast v1, Lio/reactivex/CompletableSource;

    invoke-virtual {v0, v1}, Lio/reactivex/Completable;->andThen(Lio/reactivex/CompletableSource;)Lio/reactivex/Completable;

    move-result-object v0

    .line 124
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->userActivityDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getStartTime()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;->deleteActivityDateCompletable(J)Lio/reactivex/Completable;

    move-result-object p1

    check-cast p1, Lio/reactivex/CompletableSource;

    invoke-virtual {v0, p1}, Lio/reactivex/Completable;->andThen(Lio/reactivex/CompletableSource;)Lio/reactivex/Completable;

    move-result-object p1

    const-string v0, "userActivityCloudService.deleteUserActivity(item)\n                .andThen(userActivityDao.deleteCompletable(item))\n                .andThen(userActivityDao.deleteActivityDateCompletable(item.startTime))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 36
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getOne(Ljava/lang/Object;Z)Lio/reactivex/Observable;
    .locals 0

    .line 36
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->getOne(Ljava/lang/String;Z)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public getOne(Ljava/lang/String;Z)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z)",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
            ">;"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    .line 101
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->userActivityDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;

    invoke-virtual {p2, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;->getOne(Ljava/lang/String;)Lio/reactivex/Maybe;

    move-result-object p2

    .line 102
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UserActivitySessionRepositoryImpl$SkTcFKU5cK166opN2z4iqzCF22M;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UserActivitySessionRepositoryImpl$SkTcFKU5cK166opN2z4iqzCF22M;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Lio/reactivex/Maybe;->onErrorResumeNext(Lio/reactivex/functions/Function;)Lio/reactivex/Maybe;

    move-result-object p1

    .line 108
    new-instance p2, Ljava/lang/Throwable;

    const-string v0, "Activity not found!"

    invoke-direct {p2, v0}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    invoke-static {p2}, Lio/reactivex/Single;->error(Ljava/lang/Throwable;)Lio/reactivex/Single;

    move-result-object p2

    check-cast p2, Lio/reactivex/SingleSource;

    invoke-virtual {p1, p2}, Lio/reactivex/Maybe;->switchIfEmpty(Lio/reactivex/SingleSource;)Lio/reactivex/Single;

    move-result-object p1

    .line 109
    invoke-virtual {p1}, Lio/reactivex/Single;->toObservable()Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "userActivityDao.getOne(id)\n                    .onErrorResumeNext (Function {\n                        if (it is SQLiteBlobTooBigException) {\n                            val activity = dbDataRecovery.loadSingleActivity(id)\n                            if (activity != null) Maybe.just(activity) else Maybe.error(it)\n                        } else Maybe.error(it)\n                    })\n                    .switchIfEmpty(Single.error(Throwable(\"Activity not found!\")))\n                    .toObservable()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    .line 111
    :cond_0
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->userActivityDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;

    invoke-virtual {p2, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;->getOne(Ljava/lang/String;)Lio/reactivex/Maybe;

    move-result-object p2

    .line 112
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UserActivitySessionRepositoryImpl$bBG8YnZ9BSuGrvxY0n7RwHhO0Mo;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UserActivitySessionRepositoryImpl$bBG8YnZ9BSuGrvxY0n7RwHhO0Mo;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Lio/reactivex/Maybe;->onErrorResumeNext(Lio/reactivex/functions/Function;)Lio/reactivex/Maybe;

    move-result-object p2

    .line 117
    invoke-virtual {p2}, Lio/reactivex/Maybe;->toObservable()Lio/reactivex/Observable;

    move-result-object p2

    check-cast p2, Lio/reactivex/ObservableSource;

    .line 118
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->userActivityCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityCloudService;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityCloudService;->getOneUserActivity(Ljava/lang/String;)Lio/reactivex/Single;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/Single;->toObservable()Lio/reactivex/Observable;

    move-result-object p1

    check-cast p1, Lio/reactivex/ObservableSource;

    .line 111
    invoke-static {p2, p1}, Lio/reactivex/Observable;->concat(Lio/reactivex/ObservableSource;Lio/reactivex/ObservableSource;)Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "concat(userActivityDao.getOne(id)\n                .onErrorResumeNext (Function {\n                    if (it is SQLiteBlobTooBigException) {\n                        val activity = dbDataRecovery.loadSingleActivity(id)\n                        if (activity != null) Maybe.just(activity) else Maybe.error(it)\n                    } else Maybe.error(it)\n                }).toObservable(),\n                userActivityCloudService.getOneUserActivity(id).toObservable())"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public notSyncedCount()J
    .locals 2

    .line 55
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->userActivityDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;->notSyncedCount()J

    move-result-wide v0

    return-wide v0
.end method

.method public save(Ljava/util/List;Z)Lio/reactivex/Completable;
    .locals 27
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
            ">;Z)",
            "Lio/reactivex/Completable;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "items"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {}, Lio/reactivex/Completable;->complete()Lio/reactivex/Completable;

    move-result-object v1

    const-string v2, "complete()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v1

    :cond_0
    if-eqz p2, :cond_2

    .line 84
    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->userActivityDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;

    check-cast v1, Ljava/lang/Iterable;

    .line 201
    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v1, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v3, Ljava/util/Collection;

    .line 202
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 203
    move-object v5, v4

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x1

    const/16 v24, 0x0

    const v25, 0x17fff

    const/16 v26, 0x0

    .line 84
    invoke-static/range {v5 .. v26}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;Ljava/lang/String;FIJJFIILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 204
    :cond_1
    check-cast v3, Ljava/util/List;

    .line 84
    invoke-virtual {v2, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;->saveCompletable(Ljava/util/List;)Lio/reactivex/Completable;

    move-result-object v1

    return-object v1

    .line 87
    :cond_2
    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->userActivityCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityCloudService;

    invoke-interface {v2, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityCloudService;->saveUserActivities(Ljava/util/List;)Lio/reactivex/Completable;

    move-result-object v2

    .line 88
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UserActivitySessionRepositoryImpl$Y_nIRflsXqYwsVVOaOIMAmqGap4;

    invoke-direct {v3, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UserActivitySessionRepositoryImpl$Y_nIRflsXqYwsVVOaOIMAmqGap4;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;)V

    invoke-virtual {v2, v3}, Lio/reactivex/Completable;->doOnError(Lio/reactivex/functions/Consumer;)Lio/reactivex/Completable;

    move-result-object v2

    .line 89
    iget-object v3, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->userActivityDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;

    invoke-virtual {v3, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;->saveCompletable(Ljava/util/List;)Lio/reactivex/Completable;

    move-result-object v3

    check-cast v3, Lio/reactivex/CompletableSource;

    invoke-virtual {v2, v3}, Lio/reactivex/Completable;->andThen(Lio/reactivex/CompletableSource;)Lio/reactivex/Completable;

    move-result-object v2

    .line 90
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UserActivitySessionRepositoryImpl$FdRL_e3Eolm7cWH_J1azXAkcxtM;

    invoke-direct {v3, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UserActivitySessionRepositoryImpl$FdRL_e3Eolm7cWH_J1azXAkcxtM;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;Ljava/util/List;)V

    invoke-virtual {v2, v3}, Lio/reactivex/Completable;->onErrorResumeNext(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object v1

    const-string v2, "userActivityCloudService.saveUserActivities(items)\n                .doOnError { logUploadFailedError(it) }\n                .andThen(userActivityDao.saveCompletable(items))\n                .onErrorResumeNext {\n                    userActivityDao.saveCompletable(items.map { it.copy(shouldSend = true) })\n                }"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v1
.end method

.method public saveActivityDates(Ljava/util/List;)Lio/reactivex/Completable;
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

    .line 178
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->userActivityDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;->saveActivityDatesCompletable(Ljava/util/List;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public sync()Lio/reactivex/Completable;
    .locals 2

    .line 59
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->userActivityDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;->notSyncedSessions()Lio/reactivex/Single;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UserActivitySessionRepositoryImpl$osWwwHIXhRhHoADAVrBdPiKjOGE;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UserActivitySessionRepositoryImpl$osWwwHIXhRhHoADAVrBdPiKjOGE;

    .line 60
    invoke-virtual {v0, v1}, Lio/reactivex/Single;->doOnError(Lio/reactivex/functions/Consumer;)Lio/reactivex/Single;

    move-result-object v0

    .line 63
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UserActivitySessionRepositoryImpl$f_FPumGbdsn-yzV4v5KGH57GyBA;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UserActivitySessionRepositoryImpl$f_FPumGbdsn-yzV4v5KGH57GyBA;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Single;->onErrorReturn(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object v0

    .line 68
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UserActivitySessionRepositoryImpl$vdipl1K0JZjTorA6yRV4XaROkiU;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UserActivitySessionRepositoryImpl$vdipl1K0JZjTorA6yRV4XaROkiU;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Single;->flatMapCompletable(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object v0

    const-string v1, "userActivityDao.notSyncedSessions()\n            .doOnError {\n                it.printStackTrace()\n            }\n            .onErrorReturn {\n                if (it is SQLiteBlobTooBigException) {\n                    dbDataRecovery.loadNotSyncedActivities()\n                } else emptyList()\n            }\n            .flatMapCompletable {\n                if (it.isEmpty()) return@flatMapCompletable Completable.complete()\n                userActivityCloudService.saveUserActivities(it)\n                        .doOnError { logUploadFailedError(it) }\n                        .andThen(userActivityDao.saveCompletable(it.map { it.copy(shouldSend = false) }))\n                        .doOnComplete {\n                            stravaController.writeSessionList(it)\n                            googleFitController.writeSessionList(it)\n                        }\n            }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic update(Ljava/lang/Object;)Lio/reactivex/Completable;
    .locals 0

    .line 36
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->update(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public update(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)Lio/reactivex/Completable;
    .locals 2

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->userActivityCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityCloudService;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityCloudService;->updateUserActivity(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)Lio/reactivex/Completable;

    move-result-object v0

    .line 50
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->userActivityDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;

    invoke-virtual {v1, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;->updateCompletable(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)Lio/reactivex/Completable;

    move-result-object p1

    check-cast p1, Lio/reactivex/CompletableSource;

    invoke-virtual {v0, p1}, Lio/reactivex/Completable;->andThen(Lio/reactivex/CompletableSource;)Lio/reactivex/Completable;

    move-result-object p1

    const-string v0, "userActivityCloudService.updateUserActivity(item)\n                .andThen(userActivityDao.updateCompletable(item))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
