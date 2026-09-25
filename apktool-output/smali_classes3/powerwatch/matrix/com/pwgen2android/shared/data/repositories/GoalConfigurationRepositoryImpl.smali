.class public final Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepositoryImpl;
.super Ljava/lang/Object;
.source "GoalConfigurationRepository.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepositoryImpl$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGoalConfigurationRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoalConfigurationRepository.kt\npowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepositoryImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,71:1\n1043#2:72\n*S KotlinDebug\n*F\n+ 1 GoalConfigurationRepository.kt\npowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepositoryImpl\n*L\n53#1:72\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J$\u0010\u0007\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\n0\t0\u00082\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0008\u0010\u000f\u001a\u00020\u0010H\u0016J\u0008\u0010\u0011\u001a\u00020\u000eH\u0016J\u001e\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00082\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0016J\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u000eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepositoryImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;",
        "goalConfigDao",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao;",
        "goalConfigCloudService",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/goalConfiguration/GoalConfigurationCloudService;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/goalConfiguration/GoalConfigurationCloudService;)V",
        "all",
        "Lio/reactivex/Observable;",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;",
        "page",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;",
        "fromCache",
        "",
        "deleteAll",
        "Lio/reactivex/Completable;",
        "isEmpty",
        "load",
        "forceCache",
        "save",
        "item",
        "toCacheOnly",
        "Companion",
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


# static fields
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepositoryImpl$Companion;

.field private static final TAG:Ljava/lang/String;


# instance fields
.field private final goalConfigCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/goalConfiguration/GoalConfigurationCloudService;

.field private final goalConfigDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepositoryImpl$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepositoryImpl$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepositoryImpl;->Companion:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepositoryImpl$Companion;

    .line 68
    const-class v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepositoryImpl;

    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/reflect/KClass;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepositoryImpl;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/goalConfiguration/GoalConfigurationCloudService;)V
    .locals 1

    const-string v0, "goalConfigDao"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "goalConfigCloudService"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepositoryImpl;->goalConfigDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao;

    .line 20
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepositoryImpl;->goalConfigCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/goalConfiguration/GoalConfigurationCloudService;

    return-void
.end method

.method private static final all$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepositoryImpl;Ljava/util/List;)Lio/reactivex/SingleSource;
    .locals 14

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 45
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepositoryImpl;->goalConfigDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao;

    new-instance v13, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/16 v11, 0xff

    const/4 v12, 0x0

    move-object v0, v13

    invoke-direct/range {v0 .. v12}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;-><init>(JIFIIIJZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v13}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao;->addCompletable(Ljava/util/List;)Lio/reactivex/Completable;

    move-result-object p0

    .line 46
    invoke-virtual {p0, p1}, Lio/reactivex/Completable;->toSingleDefault(Ljava/lang/Object;)Lio/reactivex/Single;

    move-result-object p0

    check-cast p0, Lio/reactivex/SingleSource;

    return-object p0

    .line 48
    :cond_0
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepositoryImpl;->goalConfigDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao;->addCompletable(Ljava/util/List;)Lio/reactivex/Completable;

    move-result-object p0

    .line 49
    invoke-virtual {p0, p1}, Lio/reactivex/Completable;->toSingleDefault(Ljava/lang/Object;)Lio/reactivex/Single;

    move-result-object p0

    check-cast p0, Lio/reactivex/SingleSource;

    return-object p0
.end method

.method private static final all$lambda-3(Ljava/util/List;)Ljava/util/List;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    check-cast p0, Ljava/lang/Iterable;

    .line 72
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepositoryImpl$all$lambda-3$$inlined$sortedBy$1;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepositoryImpl$all$lambda-3$$inlined$sortedBy$1;-><init>()V

    check-cast v0, Ljava/util/Comparator;

    invoke-static {p0, v0}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final all$lambda-4(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepositoryImpl;Ljava/lang/Throwable;)Lio/reactivex/SingleSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepositoryImpl;->goalConfigDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao;->all()Lio/reactivex/Single;

    move-result-object p0

    check-cast p0, Lio/reactivex/SingleSource;

    return-object p0
.end method

.method public static synthetic lambda$Emn8FPYLoCxoI9PYW5t-3Kyh-SE(Ljava/util/List;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepositoryImpl;->all$lambda-3(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$NQzo_kP84K4Iu9QFGkKq6FFm7ho(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepositoryImpl;Ljava/util/List;)Lio/reactivex/SingleSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepositoryImpl;->all$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepositoryImpl;Ljava/util/List;)Lio/reactivex/SingleSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$V0emQFX9nP5BSMRDhFjK5-at3CQ(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepositoryImpl;Ljava/lang/Throwable;)Lio/reactivex/SingleSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepositoryImpl;->all$lambda-4(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepositoryImpl;Ljava/lang/Throwable;)Lio/reactivex/SingleSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$paf69FG2tnX0VBo6WI-9iclVknQ(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;Ljava/lang/Throwable;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepositoryImpl;->save$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;Ljava/lang/Throwable;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method private static final save$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;Ljava/lang/Throwable;)Lio/reactivex/CompletableSource;
    .locals 13

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepositoryImpl;->goalConfigDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao;

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x1

    const/16 v11, 0x7f

    const/4 v12, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v12}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;->copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;JIFIIIJZILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao;->addCompletable(Ljava/util/List;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    return-object p0
.end method


# virtual methods
.method public all(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;Z)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;",
            "Z)",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;",
            ">;>;"
        }
    .end annotation

    const-string v0, "page"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    # --- PATCHED: return empty list to bypass cloud/DAO ---
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public deleteAll()Lio/reactivex/Completable;
    .locals 1

    .line 22
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepositoryImpl;->goalConfigDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao;->deleteAllCompletable()Lio/reactivex/Completable;

    move-result-object v0

    return-object v0
.end method

.method public isEmpty()Z
    .locals 5

    .line 28
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepositoryImpl;->goalConfigDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao;->count()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public load(ZZ)Lio/reactivex/Observable;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ)",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;",
            ">;"
        }
    .end annotation

    .line 26
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepositoryImpl;->goalConfigDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao;->lastByCreated()Lio/reactivex/Observable;

    move-result-object p1

    # --- PW_OFFLINE: Room single-row query emits NoSuchElementException on an EMPTY goals
    # table (offline fresh install; goals only arrive via cloud sync or a user save), and that
    # error killed the combineLatest in RealTimeDataProviderImpl.observeData, so the "Today"
    # card stayed zero forever. Apply the vendor's own fallback from all() here:
    # "if somehow there are no goals defined, return default one".
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/16 v11, 0xff

    const/4 v12, 0x0

    invoke-direct/range {v0 .. v12}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;-><init>(JIFIIIJZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->onErrorReturnItem(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic save(Ljava/lang/Object;Z)Lio/reactivex/Completable;
    .locals 0

    .line 19
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepositoryImpl;->save(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;Z)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public save(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;Z)Lio/reactivex/Completable;
    .locals 2

    const-string p2, "item"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepositoryImpl;->goalConfigCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/goalConfiguration/GoalConfigurationCloudService;

    invoke-interface {p2, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/goalConfiguration/GoalConfigurationCloudService;->save(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;)Lio/reactivex/Completable;

    move-result-object p2

    .line 35
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepositoryImpl;->goalConfigDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao;->addCompletable(Ljava/util/List;)Lio/reactivex/Completable;

    move-result-object v0

    check-cast v0, Lio/reactivex/CompletableSource;

    invoke-virtual {p2, v0}, Lio/reactivex/Completable;->andThen(Lio/reactivex/CompletableSource;)Lio/reactivex/Completable;

    move-result-object p2

    .line 36
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$GoalConfigurationRepositoryImpl$paf69FG2tnX0VBo6WI-9iclVknQ;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$GoalConfigurationRepositoryImpl$paf69FG2tnX0VBo6WI-9iclVknQ;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;)V

    invoke-virtual {p2, v0}, Lio/reactivex/Completable;->onErrorResumeNext(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object p1

    const-string p2, "goalConfigCloudService.save(item)\n                .andThen(goalConfigDao.addCompletable(listOf(item)))\n                .onErrorResumeNext { goalConfigDao.addCompletable(listOf(item.copy(shouldSync = true))) }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
