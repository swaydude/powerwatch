.class public final Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;
.super Ljava/lang/Object;
.source "CloudSynchronizer.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u00012\u00020\u0002BM\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\u0002\u0010\u0015J\u0008\u0010!\u001a\u00020\"H\u0016J\u0008\u0010#\u001a\u00020\"H\u0016J\u0016\u0010$\u001a\u0010\u0012\u000c\u0012\n \u001f*\u0004\u0018\u00010&0&0%H\u0016J\u0012\u0010\'\u001a\u00020(2\u0008\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0008\u0010+\u001a\u00020,H\u0016J\u0012\u0010-\u001a\u00020(2\u0008\u0010)\u001a\u0004\u0018\u00010*H\u0016R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001c\u001a\u0010\u0012\u000c\u0012\n \u001f*\u0004\u0018\u00010\u001e0\u001e0\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006."
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "deviceRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;",
        "goalsRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;",
        "userAccountRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;",
        "walkingLogRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepository;",
        "restingLogRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepository;",
        "sleepLogRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepository;",
        "userActivitySessionRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;",
        "networkConnectionInfo",
        "Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProvider;",
        "metricsRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProvider;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;)V",
        "activityOperationQuerer",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;",
        "compositeDisposable",
        "Lio/reactivex/disposables/CompositeDisposable;",
        "restingOperationQuerer",
        "sleepOperationQuerer",
        "syncSubject",
        "Lio/reactivex/subjects/PublishSubject;",
        "",
        "kotlin.jvm.PlatformType",
        "walkingOperationQuerer",
        "hasActivitySessionsToSync",
        "",
        "hasBackgroundLogsToSync",
        "hasDataToSync",
        "Lio/reactivex/Single;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/SyncDataInfo;",
        "syncAllDataToCloud",
        "Lio/reactivex/Completable;",
        "scheduleTime",
        "Ljava/util/concurrent/TimeUnit;",
        "syncData",
        "",
        "syncWatchLogsToCloud",
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
.field private final activityOperationQuerer:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;

.field private final compositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

.field private final deviceRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;

.field private final goalsRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;

.field private final metricsRepository:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;

.field private final networkConnectionInfo:Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProvider;

.field private final restingLogRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepository;

.field private final restingOperationQuerer:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;

.field private final sleepLogRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepository;

.field private final sleepOperationQuerer:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;

.field private final syncSubject:Lio/reactivex/subjects/PublishSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/PublishSubject<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final userAccountRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;

.field private final userActivitySessionRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;

.field private final walkingLogRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepository;

.field private final walkingOperationQuerer:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProvider;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;)V
    .locals 1

    const-string v0, "deviceRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "goalsRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userAccountRepository"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "walkingLogRepository"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "restingLogRepository"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sleepLogRepository"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userActivitySessionRepository"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "networkConnectionInfo"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricsRepository"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;->deviceRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;

    .line 49
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;->goalsRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;

    .line 50
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;->userAccountRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;

    .line 51
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;->walkingLogRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepository;

    .line 52
    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;->restingLogRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepository;

    .line 53
    iput-object p6, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;->sleepLogRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepository;

    .line 54
    iput-object p7, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;->userActivitySessionRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;

    .line 55
    iput-object p8, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;->networkConnectionInfo:Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProvider;

    .line 56
    iput-object p9, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;->metricsRepository:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;

    .line 59
    invoke-static {}, Lio/reactivex/subjects/PublishSubject;->create()Lio/reactivex/subjects/PublishSubject;

    move-result-object p1

    const-string p2, "create<Int>()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;->syncSubject:Lio/reactivex/subjects/PublishSubject;

    .line 60
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;

    invoke-direct {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;-><init>()V

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;->walkingOperationQuerer:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;

    .line 61
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;

    invoke-direct {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;-><init>()V

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;->restingOperationQuerer:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;

    .line 62
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;

    invoke-direct {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;-><init>()V

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;->sleepOperationQuerer:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;

    .line 63
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;

    invoke-direct {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;-><init>()V

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;->activityOperationQuerer:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;

    .line 65
    new-instance p2, Lio/reactivex/disposables/CompositeDisposable;

    invoke-direct {p2}, Lio/reactivex/disposables/CompositeDisposable;-><init>()V

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;->compositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

    .line 69
    invoke-interface {p8}, Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProvider;->getNetworkStatusChange()Lio/reactivex/Observable;

    move-result-object p3

    .line 70
    invoke-virtual {p3}, Lio/reactivex/Observable;->distinctUntilChanged()Lio/reactivex/Observable;

    move-result-object p3

    sget-object p4, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudSynchronizerImpl$_tG8q96-jwIDTdZpJqUaogKTjXE;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudSynchronizerImpl$_tG8q96-jwIDTdZpJqUaogKTjXE;

    .line 71
    invoke-virtual {p3, p4}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p3

    sget-object p4, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudSynchronizerImpl$RRnhu1-mYHLOGt1zKEWbhuUZeTg;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudSynchronizerImpl$RRnhu1-mYHLOGt1zKEWbhuUZeTg;

    .line 76
    invoke-virtual {p3, p4}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object p3

    .line 77
    new-instance p4, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudSynchronizerImpl$V3ptiED9Pyv41BvKJTLiZyw0fMM;

    invoke-direct {p4, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudSynchronizerImpl$V3ptiED9Pyv41BvKJTLiZyw0fMM;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;)V

    invoke-virtual {p3, p4}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p3

    .line 81
    new-instance p4, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudSynchronizerImpl$yXn68uk6KWxUB4J-0ZZb7KuENi4;

    invoke-direct {p4, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudSynchronizerImpl$yXn68uk6KWxUB4J-0ZZb7KuENi4;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;)V

    sget-object p5, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudSynchronizerImpl$HP4bu8U0nBzsbVgNCsdlkpBv94A;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudSynchronizerImpl$HP4bu8U0nBzsbVgNCsdlkpBv94A;

    invoke-virtual {p3, p4, p5}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object p3

    .line 68
    invoke-virtual {p2, p3}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    .line 87
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudSynchronizerImpl$pSG7rDw55uP-S-s0WZt5-8Gm4vM;

    invoke-direct {p3, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudSynchronizerImpl$pSG7rDw55uP-S-s0WZt5-8Gm4vM;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;)V

    invoke-virtual {p1, p3}, Lio/reactivex/subjects/PublishSubject;->flatMapCompletable(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object p1

    .line 90
    invoke-virtual {p1}, Lio/reactivex/Completable;->repeat()Lio/reactivex/Completable;

    move-result-object p1

    .line 91
    invoke-virtual {p1}, Lio/reactivex/Completable;->retry()Lio/reactivex/Completable;

    move-result-object p1

    sget-object p3, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudSynchronizerImpl$w6-33Fr99G08ksXNB0T4x3W8Pr4;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudSynchronizerImpl$w6-33Fr99G08ksXNB0T4x3W8Pr4;

    sget-object p4, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudSynchronizerImpl$oz90npI-y7TiMIH-jgNeKX058zg;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudSynchronizerImpl$oz90npI-y7TiMIH-jgNeKX058zg;

    .line 92
    invoke-virtual {p1, p3, p4}, Lio/reactivex/Completable;->subscribe(Lio/reactivex/functions/Action;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object p1

    .line 86
    invoke-virtual {p2, p1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method

.method private static final _init_$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus;)Lio/reactivex/ObservableSource;
    .locals 3

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    new-instance v0, Lkotlin/ranges/IntRange;

    const/4 v1, 0x0

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lkotlin/ranges/IntRange;-><init>(II)V

    invoke-static {v0}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudSynchronizerImpl$BzuPfvI5jis3HNGsid5zDqP5DCo;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudSynchronizerImpl$BzuPfvI5jis3HNGsid5zDqP5DCo;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final _init_$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus$Connected;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus$Connected;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static final _init_$lambda-3(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus;)V
    .locals 2

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p1, "Network connection established, sync with the cloud will be triggered now."

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->info$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final _init_$lambda-4(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;->syncData()V

    return-void
.end method

.method private static final _init_$lambda-5(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method private static final _init_$lambda-6(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;Ljava/lang/Integer;)Lio/reactivex/CompletableSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;

    const/4 p1, 0x0

    const/4 v0, 0x1

    invoke-static {p0, p1, v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer$DefaultImpls;->syncAllDataToCloud$default(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;Ljava/util/concurrent/TimeUnit;ILjava/lang/Object;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    return-object p0
.end method

.method private static final _init_$lambda-7()V
    .locals 0

    return-void
.end method

.method private static final _init_$lambda-8(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method private static final hasDataToSync$lambda-9(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;Lio/reactivex/SingleEmitter;)V
    .locals 9

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 111
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;->walkingLogRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepository;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepository;->notSyncedCount()J

    move-result-wide v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    cmp-long v6, v0, v4

    if-lez v6, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 112
    :goto_0
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;->restingLogRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepository;

    invoke-interface {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepository;->notSyncedCount()J

    move-result-wide v6

    cmp-long v1, v6, v4

    if-lez v1, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    .line 113
    :goto_1
    iget-object v6, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;->sleepLogRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepository;

    invoke-interface {v6}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepository;->notSyncedCount()J

    move-result-wide v6

    cmp-long v8, v6, v4

    if-lez v8, :cond_2

    const/4 v6, 0x1

    goto :goto_2

    :cond_2
    const/4 v6, 0x0

    .line 114
    :goto_2
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;->userActivitySessionRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;

    invoke-interface {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;->notSyncedCount()J

    move-result-wide v7

    cmp-long p0, v7, v4

    if-lez p0, :cond_3

    goto :goto_3

    :cond_3
    const/4 v2, 0x0

    .line 110
    :goto_3
    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/SyncDataInfo;

    invoke-direct {p0, v0, v6, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/SyncDataInfo;-><init>(ZZZZ)V

    .line 116
    invoke-interface {p1, p0}, Lio/reactivex/SingleEmitter;->onSuccess(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic lambda$BdU4N6fJEckDA0l8yKf_zumlzxs(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;Lio/reactivex/SingleEmitter;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;->hasDataToSync$lambda-9(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;Lio/reactivex/SingleEmitter;)V

    return-void
.end method

.method public static synthetic lambda$BzuPfvI5jis3HNGsid5zDqP5DCo(Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus;Lkotlin/ranges/IntRange;)Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;->lambda-1$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus;Lkotlin/ranges/IntRange;)Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$HP4bu8U0nBzsbVgNCsdlkpBv94A(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;->_init_$lambda-5(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$RRnhu1-mYHLOGt1zKEWbhuUZeTg(Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus;)Z
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;->_init_$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$V3ptiED9Pyv41BvKJTLiZyw0fMM(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;->_init_$lambda-3(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus;)V

    return-void
.end method

.method public static synthetic lambda$_tG8q96-jwIDTdZpJqUaogKTjXE(Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;->_init_$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$h32zgSDa7mgyPNc3gYxbIsCHnVs(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;->syncWatchLogsToCloud$lambda-11(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$oz90npI-y7TiMIH-jgNeKX058zg(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;->_init_$lambda-8(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$pSG7rDw55uP-S-s0WZt5-8Gm4vM(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;Ljava/lang/Integer;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;->_init_$lambda-6(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;Ljava/lang/Integer;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$usVU8CHK65skVgrfx7sZIwtkNMg(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;->syncAllDataToCloud$lambda-10(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$w6-33Fr99G08ksXNB0T4x3W8Pr4()V
    .locals 0

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;->_init_$lambda-7()V

    return-void
.end method

.method public static synthetic lambda$yXn68uk6KWxUB4J-0ZZb7KuENi4(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;->_init_$lambda-4(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus;)V

    return-void
.end method

.method private static final lambda-1$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus;Lkotlin/ranges/IntRange;)Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus;
    .locals 1

    const-string v0, "$it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$noName_0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final syncAllDataToCloud$lambda-10(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;)Lio/reactivex/CompletableSource;
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 121
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;->deviceRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;->sync()Lio/reactivex/Completable;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Lio/reactivex/CompletableSource;

    .line 124
    check-cast v0, Lio/reactivex/CompletableSource;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    .line 125
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;

    const/4 v0, 0x0

    const/4 v2, 0x1

    invoke-static {p0, v0, v2, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer$DefaultImpls;->syncWatchLogsToCloud$default(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;Ljava/util/concurrent/TimeUnit;ILjava/lang/Object;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    aput-object p0, v1, v2

    .line 123
    invoke-static {v1}, Lio/reactivex/Completable;->mergeArray([Lio/reactivex/CompletableSource;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    return-object p0
.end method

.method private static final syncWatchLogsToCloud$lambda-11(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;)Lio/reactivex/CompletableSource;
    .locals 15

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 130
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;->walkingLogRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepository;

    invoke-interface {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepository;->sync()Lio/reactivex/Completable;

    move-result-object v1

    invoke-virtual {v1}, Lio/reactivex/Completable;->toObservable()Lio/reactivex/Observable;

    move-result-object v2

    const-string v1, "walkingLogRepository.sync().toObservable<Unit>()"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;-><init>(Lio/reactivex/Observable;Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 131
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;->restingLogRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepository;

    invoke-interface {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepository;->sync()Lio/reactivex/Completable;

    move-result-object v2

    invoke-virtual {v2}, Lio/reactivex/Completable;->toObservable()Lio/reactivex/Observable;

    move-result-object v8

    const-string v2, "restingLogRepository.sync().toObservable<Unit>()"

    invoke-static {v8, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x6

    const/4 v12, 0x0

    move-object v7, v1

    invoke-direct/range {v7 .. v12}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;-><init>(Lio/reactivex/Observable;Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 132
    new-instance v8, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;->sleepLogRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepository;

    invoke-interface {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepository;->sync()Lio/reactivex/Completable;

    move-result-object v2

    invoke-virtual {v2}, Lio/reactivex/Completable;->toObservable()Lio/reactivex/Observable;

    move-result-object v3

    const-string v2, "sleepLogRepository.sync().toObservable<Unit>()"

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v2, v8

    invoke-direct/range {v2 .. v7}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;-><init>(Lio/reactivex/Observable;Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 133
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;

    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;->userActivitySessionRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;

    invoke-interface {v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;->sync()Lio/reactivex/Completable;

    move-result-object v3

    invoke-virtual {v3}, Lio/reactivex/Completable;->toObservable()Lio/reactivex/Observable;

    move-result-object v10

    const-string v3, "userActivitySessionRepository.sync().toObservable<Unit>()"

    invoke-static {v10, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v11, 0x0

    const/4 v13, 0x6

    const/4 v14, 0x0

    move-object v9, v2

    invoke-direct/range {v9 .. v14}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;-><init>(Lio/reactivex/Observable;Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v3, 0x4

    new-array v3, v3, [Lio/reactivex/CompletableSource;

    .line 136
    iget-object v4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;->walkingOperationQuerer:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;

    invoke-virtual {v4, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;->queue(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/Observable;->ignoreElements()Lio/reactivex/Completable;

    move-result-object v0

    check-cast v0, Lio/reactivex/CompletableSource;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    .line 137
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;->restingOperationQuerer:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;->queue(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/Observable;->ignoreElements()Lio/reactivex/Completable;

    move-result-object v0

    check-cast v0, Lio/reactivex/CompletableSource;

    const/4 v1, 0x1

    aput-object v0, v3, v1

    .line 138
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;->sleepOperationQuerer:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;

    invoke-virtual {v0, v8}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;->queue(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/Observable;->ignoreElements()Lio/reactivex/Completable;

    move-result-object v0

    check-cast v0, Lio/reactivex/CompletableSource;

    const/4 v1, 0x2

    aput-object v0, v3, v1

    .line 139
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;->activityOperationQuerer:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;

    invoke-virtual {p0, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;->queue(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;)Lio/reactivex/Observable;

    move-result-object p0

    invoke-virtual {p0}, Lio/reactivex/Observable;->ignoreElements()Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    const/4 v0, 0x3

    aput-object p0, v3, v0

    .line 136
    invoke-static {v3}, Lio/reactivex/Completable;->mergeArray([Lio/reactivex/CompletableSource;)Lio/reactivex/Completable;

    move-result-object p0

    const-string v0, "mergeArray(walkingOperationQuerer.queue(walkingLogs).ignoreElements(),\n                        restingOperationQuerer.queue(restingLogs).ignoreElements(),\n                        sleepOperationQuerer.queue(sleepLogs).ignoreElements(),\n                        activityOperationQuerer.queue(activitySessions).ignoreElements()\n                )"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 142
    check-cast p0, Lio/reactivex/CompletableSource;

    return-object p0
.end method


# virtual methods
.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 48
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method public hasActivitySessionsToSync()Z
    .locals 5

    .line 102
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;->userActivitySessionRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;->notSyncedCount()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasBackgroundLogsToSync()Z
    .locals 5

    .line 106
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;->walkingLogRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepository;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepository;->notSyncedCount()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-gtz v4, :cond_1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;->restingLogRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepository;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepository;->notSyncedCount()J

    move-result-wide v0

    cmp-long v4, v0, v2

    if-gtz v4, :cond_1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;->sleepLogRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepository;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepository;->notSyncedCount()J

    move-result-wide v0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public hasDataToSync()Lio/reactivex/Single;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Single<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/SyncDataInfo;",
            ">;"
        }
    .end annotation

    .line 109
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudSynchronizerImpl$BdU4N6fJEckDA0l8yKf_zumlzxs;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudSynchronizerImpl$BdU4N6fJEckDA0l8yKf_zumlzxs;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;)V

    invoke-static {v0}, Lio/reactivex/Single;->create(Lio/reactivex/SingleOnSubscribe;)Lio/reactivex/Single;

    move-result-object v0

    const-string v1, "create<SyncDataInfo> {\n        val syncDataInfo = SyncDataInfo(\n                shouldSyncWalkingLogs = walkingLogRepository.notSyncedCount() > 0,\n                shouldSyncRestingLogs = restingLogRepository.notSyncedCount() > 0,\n                shouldSyncSleepLogs = sleepLogRepository.notSyncedCount() > 0,\n                shouldSyncActivitySession = userActivitySessionRepository.notSyncedCount() > 0\n        )\n        it.onSuccess(syncDataInfo)\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public syncAllDataToCloud(Ljava/util/concurrent/TimeUnit;)Lio/reactivex/Completable;
    .locals 1

    .line 119
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudSynchronizerImpl$usVU8CHK65skVgrfx7sZIwtkNMg;

    invoke-direct {p1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudSynchronizerImpl$usVU8CHK65skVgrfx7sZIwtkNMg;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;)V

    invoke-static {p1}, Lio/reactivex/Completable;->defer(Ljava/util/concurrent/Callable;)Lio/reactivex/Completable;

    move-result-object p1

    const-string v0, "defer {\n\n        val notSyncedDevices = deviceRepository.sync()\n\n        Completable.mergeArray(\n                notSyncedDevices,\n                syncWatchLogsToCloud()\n        )\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public syncData()V
    .locals 0

    # PATCHED: bypass cloud sync - return immediately without triggering sync
    return-void
.end method

.method public syncWatchLogsToCloud(Ljava/util/concurrent/TimeUnit;)Lio/reactivex/Completable;
    .locals 1

    .line 129
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudSynchronizerImpl$h32zgSDa7mgyPNc3gYxbIsCHnVs;

    invoke-direct {p1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudSynchronizerImpl$h32zgSDa7mgyPNc3gYxbIsCHnVs;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;)V

    invoke-static {p1}, Lio/reactivex/Completable;->defer(Ljava/util/concurrent/Callable;)Lio/reactivex/Completable;

    move-result-object p1

    const-string v0, "defer {\n        val walkingLogs = DeviceCommunicationOperation(walkingLogRepository.sync().toObservable<Unit>())\n        val restingLogs = DeviceCommunicationOperation(restingLogRepository.sync().toObservable<Unit>())\n        val sleepLogs = DeviceCommunicationOperation(sleepLogRepository.sync().toObservable<Unit>())\n        val activitySessions = DeviceCommunicationOperation(userActivitySessionRepository.sync().toObservable<Unit>())\n\n        val dataObs = Completable\n                .mergeArray(walkingOperationQuerer.queue(walkingLogs).ignoreElements(),\n                        restingOperationQuerer.queue(restingLogs).ignoreElements(),\n                        sleepOperationQuerer.queue(sleepLogs).ignoreElements(),\n                        activityOperationQuerer.queue(activitySessions).ignoreElements()\n                )\n\n        dataObs\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
