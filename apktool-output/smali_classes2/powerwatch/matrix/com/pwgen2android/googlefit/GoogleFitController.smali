.class public final Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;
.super Ljava/lang/Object;
.source "GoogleFitController.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0018\u00002\u00020\u0001B\u0017\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0010\u0010\u001f\u001a\u00020\u001e2\u0008\u0010 \u001a\u0004\u0018\u00010!J\u0006\u0010\"\u001a\u00020\u001eJ\u000c\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u001a0$J\u0006\u0010%\u001a\u00020\u001aJ\u0006\u0010&\u001a\u00020\u001aJ\u0008\u0010\'\u001a\u00020\u001aH\u0002J\u0010\u0010(\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020\u001aH\u0003J\u0014\u0010*\u001a\u00020\u001e2\u000c\u0010+\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000fJ\u0014\u0010,\u001a\u00020\u001e2\u000c\u0010-\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u000fJ\u0014\u0010.\u001a\u00020\u001e2\u000c\u0010/\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u000fJ\u0014\u00100\u001a\u00020\u001e2\u000c\u00101\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\r\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0010 \u0011*\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f0\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u0014\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0015 \u0011*\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000f0\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u0016\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0017 \u0011*\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u000f0\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0018\u001a\u0010\u0012\u000c\u0012\n \u0011*\u0004\u0018\u00010\u001a0\u001a0\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u001b\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u001c \u0011*\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u000f0\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00062"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "context",
        "Landroid/content/Context;",
        "writer",
        "Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitWriter;",
        "(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitWriter;)V",
        "getContext",
        "()Landroid/content/Context;",
        "disposable",
        "Lio/reactivex/disposables/CompositeDisposable;",
        "options",
        "Lcom/google/android/gms/fitness/FitnessOptions;",
        "restingSubject",
        "Lio/reactivex/subjects/PublishSubject;",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingLog;",
        "kotlin.jvm.PlatformType",
        "scheduler",
        "Lio/reactivex/Scheduler;",
        "sessionSubject",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
        "sleepSubject",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;",
        "subscribeSubject",
        "Lio/reactivex/subjects/BehaviorSubject;",
        "",
        "walkingSubject",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;",
        "authorizationSuccess",
        "",
        "authorize",
        "fragment",
        "Landroidx/fragment/app/Fragment;",
        "disable",
        "getSubscription",
        "Lio/reactivex/Observable;",
        "hasGooglePermissions",
        "hasPermissions",
        "hasStoredPermission",
        "saveAuthorizationStatus",
        "enable",
        "saveRestingLogs",
        "logs",
        "saveSleepingLogs",
        "sleepLogList",
        "saveWalkingLogs",
        "logList",
        "writeSessionList",
        "sessionList",
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
.field private final context:Landroid/content/Context;

.field private final disposable:Lio/reactivex/disposables/CompositeDisposable;

.field private final options:Lcom/google/android/gms/fitness/FitnessOptions;

.field private final restingSubject:Lio/reactivex/subjects/PublishSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/PublishSubject<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingLog;",
            ">;>;"
        }
    .end annotation
.end field

.field private final scheduler:Lio/reactivex/Scheduler;

.field private final sessionSubject:Lio/reactivex/subjects/PublishSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/PublishSubject<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
            ">;>;"
        }
    .end annotation
.end field

.field private final sleepSubject:Lio/reactivex/subjects/PublishSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/PublishSubject<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;",
            ">;>;"
        }
    .end annotation
.end field

.field private final subscribeSubject:Lio/reactivex/subjects/BehaviorSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/BehaviorSubject<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final walkingSubject:Lio/reactivex/subjects/PublishSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/PublishSubject<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;",
            ">;>;"
        }
    .end annotation
.end field

.field private final writer:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitWriter;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitWriter;)V
    .locals 12

    const-string v0, "writer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->context:Landroid/content/Context;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->writer:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitWriter;

    const/4 p2, 0x0

    .line 33
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lio/reactivex/subjects/BehaviorSubject;->createDefault(Ljava/lang/Object;)Lio/reactivex/subjects/BehaviorSubject;

    move-result-object v0

    const-string v1, "createDefault(false)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->subscribeSubject:Lio/reactivex/subjects/BehaviorSubject;

    .line 35
    new-instance v1, Lio/reactivex/disposables/CompositeDisposable;

    invoke-direct {v1}, Lio/reactivex/disposables/CompositeDisposable;-><init>()V

    iput-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->disposable:Lio/reactivex/disposables/CompositeDisposable;

    .line 40
    invoke-static {}, Lcom/google/android/gms/fitness/FitnessOptions;->builder()Lcom/google/android/gms/fitness/FitnessOptions$Builder;

    move-result-object v2

    .line 41
    sget-object v3, Lcom/google/android/gms/fitness/data/DataType;->TYPE_HEART_RATE_BPM:Lcom/google/android/gms/fitness/data/DataType;

    const/4 v4, 0x1

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/fitness/FitnessOptions$Builder;->addDataType(Lcom/google/android/gms/fitness/data/DataType;I)Lcom/google/android/gms/fitness/FitnessOptions$Builder;

    move-result-object v2

    .line 42
    sget-object v3, Lcom/google/android/gms/fitness/data/DataType;->AGGREGATE_HEART_RATE_SUMMARY:Lcom/google/android/gms/fitness/data/DataType;

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/fitness/FitnessOptions$Builder;->addDataType(Lcom/google/android/gms/fitness/data/DataType;I)Lcom/google/android/gms/fitness/FitnessOptions$Builder;

    move-result-object v2

    .line 44
    sget-object v3, Lcom/google/android/gms/fitness/data/DataType;->TYPE_STEP_COUNT_DELTA:Lcom/google/android/gms/fitness/data/DataType;

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/fitness/FitnessOptions$Builder;->addDataType(Lcom/google/android/gms/fitness/data/DataType;I)Lcom/google/android/gms/fitness/FitnessOptions$Builder;

    move-result-object v2

    .line 45
    sget-object v3, Lcom/google/android/gms/fitness/data/DataType;->TYPE_STEP_COUNT_CUMULATIVE:Lcom/google/android/gms/fitness/data/DataType;

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/fitness/FitnessOptions$Builder;->addDataType(Lcom/google/android/gms/fitness/data/DataType;I)Lcom/google/android/gms/fitness/FitnessOptions$Builder;

    move-result-object v2

    .line 46
    sget-object v3, Lcom/google/android/gms/fitness/data/DataType;->AGGREGATE_STEP_COUNT_DELTA:Lcom/google/android/gms/fitness/data/DataType;

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/fitness/FitnessOptions$Builder;->addDataType(Lcom/google/android/gms/fitness/data/DataType;I)Lcom/google/android/gms/fitness/FitnessOptions$Builder;

    move-result-object v2

    .line 48
    sget-object v3, Lcom/google/android/gms/fitness/data/DataType;->TYPE_DISTANCE_DELTA:Lcom/google/android/gms/fitness/data/DataType;

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/fitness/FitnessOptions$Builder;->addDataType(Lcom/google/android/gms/fitness/data/DataType;I)Lcom/google/android/gms/fitness/FitnessOptions$Builder;

    move-result-object v2

    .line 49
    sget-object v3, Lcom/google/android/gms/fitness/data/DataType;->TYPE_DISTANCE_CUMULATIVE:Lcom/google/android/gms/fitness/data/DataType;

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/fitness/FitnessOptions$Builder;->addDataType(Lcom/google/android/gms/fitness/data/DataType;I)Lcom/google/android/gms/fitness/FitnessOptions$Builder;

    move-result-object v2

    .line 50
    sget-object v3, Lcom/google/android/gms/fitness/data/DataType;->AGGREGATE_DISTANCE_DELTA:Lcom/google/android/gms/fitness/data/DataType;

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/fitness/FitnessOptions$Builder;->addDataType(Lcom/google/android/gms/fitness/data/DataType;I)Lcom/google/android/gms/fitness/FitnessOptions$Builder;

    move-result-object v2

    .line 52
    sget-object v3, Lcom/google/android/gms/fitness/data/DataType;->TYPE_CALORIES_EXPENDED:Lcom/google/android/gms/fitness/data/DataType;

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/fitness/FitnessOptions$Builder;->addDataType(Lcom/google/android/gms/fitness/data/DataType;I)Lcom/google/android/gms/fitness/FitnessOptions$Builder;

    move-result-object v2

    .line 53
    sget-object v3, Lcom/google/android/gms/fitness/data/DataType;->AGGREGATE_CALORIES_EXPENDED:Lcom/google/android/gms/fitness/data/DataType;

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/fitness/FitnessOptions$Builder;->addDataType(Lcom/google/android/gms/fitness/data/DataType;I)Lcom/google/android/gms/fitness/FitnessOptions$Builder;

    move-result-object v2

    .line 55
    sget-object v3, Lcom/google/android/gms/fitness/data/DataType;->TYPE_ACTIVITY_SEGMENT:Lcom/google/android/gms/fitness/data/DataType;

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/fitness/FitnessOptions$Builder;->addDataType(Lcom/google/android/gms/fitness/data/DataType;I)Lcom/google/android/gms/fitness/FitnessOptions$Builder;

    move-result-object v2

    .line 56
    sget-object v3, Lcom/google/android/gms/fitness/data/DataType;->AGGREGATE_ACTIVITY_SUMMARY:Lcom/google/android/gms/fitness/data/DataType;

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/fitness/FitnessOptions$Builder;->addDataType(Lcom/google/android/gms/fitness/data/DataType;I)Lcom/google/android/gms/fitness/FitnessOptions$Builder;

    move-result-object v2

    .line 58
    invoke-virtual {v2}, Lcom/google/android/gms/fitness/FitnessOptions$Builder;->build()Lcom/google/android/gms/fitness/FitnessOptions;

    move-result-object v2

    const-string v3, "builder()\n            .addDataType(DataType.TYPE_HEART_RATE_BPM, FitnessOptions.ACCESS_WRITE)\n            .addDataType(DataType.AGGREGATE_HEART_RATE_SUMMARY, FitnessOptions.ACCESS_WRITE)\n\n            .addDataType(DataType.TYPE_STEP_COUNT_DELTA, FitnessOptions.ACCESS_WRITE)\n            .addDataType(DataType.TYPE_STEP_COUNT_CUMULATIVE, FitnessOptions.ACCESS_WRITE)\n            .addDataType(DataType.AGGREGATE_STEP_COUNT_DELTA, FitnessOptions.ACCESS_WRITE)\n\n            .addDataType(DataType.TYPE_DISTANCE_DELTA, FitnessOptions.ACCESS_WRITE)\n            .addDataType(DataType.TYPE_DISTANCE_CUMULATIVE, FitnessOptions.ACCESS_WRITE)\n            .addDataType(DataType.AGGREGATE_DISTANCE_DELTA, FitnessOptions.ACCESS_WRITE)\n\n            .addDataType(DataType.TYPE_CALORIES_EXPENDED, FitnessOptions.ACCESS_WRITE)\n            .addDataType(DataType.AGGREGATE_CALORIES_EXPENDED, FitnessOptions.ACCESS_WRITE)\n\n            .addDataType(DataType.TYPE_ACTIVITY_SEGMENT, FitnessOptions.ACCESS_WRITE)\n            .addDataType(DataType.AGGREGATE_ACTIVITY_SUMMARY, FitnessOptions.ACCESS_WRITE)\n\n            .build()"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->options:Lcom/google/android/gms/fitness/FitnessOptions;

    .line 60
    invoke-static {}, Lio/reactivex/subjects/PublishSubject;->create()Lio/reactivex/subjects/PublishSubject;

    move-result-object v2

    const-string v3, "create<List<WalkingLog>>()"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->walkingSubject:Lio/reactivex/subjects/PublishSubject;

    .line 61
    invoke-static {}, Lio/reactivex/subjects/PublishSubject;->create()Lio/reactivex/subjects/PublishSubject;

    move-result-object v3

    const-string v5, "create<List<RestingLog>>()"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->restingSubject:Lio/reactivex/subjects/PublishSubject;

    .line 62
    invoke-static {}, Lio/reactivex/subjects/PublishSubject;->create()Lio/reactivex/subjects/PublishSubject;

    move-result-object v5

    const-string v6, "create<List<UserActivitySession>>()"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v5, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->sessionSubject:Lio/reactivex/subjects/PublishSubject;

    .line 63
    invoke-static {}, Lio/reactivex/subjects/PublishSubject;->create()Lio/reactivex/subjects/PublishSubject;

    move-result-object v6

    const-string v7, "create<List<SleepLog>>()"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v6, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->sleepSubject:Lio/reactivex/subjects/PublishSubject;

    .line 64
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v7

    check-cast v7, Ljava/util/concurrent/Executor;

    invoke-static {v7}, Lio/reactivex/schedulers/Schedulers;->from(Ljava/util/concurrent/Executor;)Lio/reactivex/Scheduler;

    move-result-object v7

    const-string v8, "from(Executors.newSingleThreadExecutor())"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v7, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->scheduler:Lio/reactivex/Scheduler;

    const/4 v8, 0x2

    if-eqz p1, :cond_0

    .line 68
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->hasPermissions()Z

    move-result p1

    .line 69
    move-object v9, p0

    check-cast v9, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    const-string v11, "Controller initialized, has permissions: "

    invoke-static {v11, v10}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x0

    invoke-static {v9, v10, v11, v8, v11}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 70
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/subjects/BehaviorSubject;->onNext(Ljava/lang/Object;)V

    :cond_0
    const/4 p1, 0x4

    new-array p1, p1, [Lio/reactivex/CompletableSource;

    .line 75
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitController$tzRT-ncpW9AMSJKNlldu0Uyx1kE;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitController$tzRT-ncpW9AMSJKNlldu0Uyx1kE;-><init>(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;)V

    invoke-virtual {v2, v0}, Lio/reactivex/subjects/PublishSubject;->flatMapCompletable(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object v0

    check-cast v0, Lio/reactivex/CompletableSource;

    aput-object v0, p1, p2

    .line 82
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitController$fTpIoPTivDWgqSRDMPEjFT1oJOo;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitController$fTpIoPTivDWgqSRDMPEjFT1oJOo;-><init>(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;)V

    invoke-virtual {v3, p2}, Lio/reactivex/subjects/PublishSubject;->flatMapCompletable(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object p2

    check-cast p2, Lio/reactivex/CompletableSource;

    aput-object p2, p1, v4

    .line 89
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitController$SqCChIYQ--2vnBe1ifraLSJKojU;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitController$SqCChIYQ--2vnBe1ifraLSJKojU;-><init>(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;)V

    invoke-virtual {v6, p2}, Lio/reactivex/subjects/PublishSubject;->flatMapCompletable(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object p2

    check-cast p2, Lio/reactivex/CompletableSource;

    aput-object p2, p1, v8

    const/4 p2, 0x3

    .line 96
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitController$9bZ0obheidtH_tIv5YFzDWp_NXk;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitController$9bZ0obheidtH_tIv5YFzDWp_NXk;-><init>(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;)V

    invoke-virtual {v5, v0}, Lio/reactivex/subjects/PublishSubject;->flatMapCompletable(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object v0

    check-cast v0, Lio/reactivex/CompletableSource;

    aput-object v0, p1, p2

    .line 74
    invoke-static {p1}, Lio/reactivex/Completable;->mergeArray([Lio/reactivex/CompletableSource;)Lio/reactivex/Completable;

    move-result-object p1

    .line 103
    invoke-virtual {p1, v7}, Lio/reactivex/Completable;->subscribeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Completable;

    move-result-object p1

    .line 104
    invoke-virtual {p1}, Lio/reactivex/Completable;->repeat()Lio/reactivex/Completable;

    move-result-object p1

    .line 105
    invoke-virtual {p1}, Lio/reactivex/Completable;->retry()Lio/reactivex/Completable;

    move-result-object p1

    sget-object p2, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitController$3UaqVGh82WSVHnNwgPv8A5Xi1rM;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitController$3UaqVGh82WSVHnNwgPv8A5Xi1rM;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitController$sVP69nw5u4OjmAcHt7IMSBlpNB4;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitController$sVP69nw5u4OjmAcHt7IMSBlpNB4;

    .line 106
    invoke-virtual {p1, p2, v0}, Lio/reactivex/Completable;->subscribe(Lio/reactivex/functions/Action;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object p1

    .line 73
    invoke-virtual {v1, p1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method

.method private static final _init_$lambda-1(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;Ljava/util/List;)Lio/reactivex/CompletableSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "walkingLogs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    check-cast p1, Ljava/lang/Iterable;

    const/16 v0, 0x1f4

    invoke-static {p1, v0}, Lkotlin/collections/CollectionsKt;->chunked(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lio/reactivex/Observable;->fromIterable(Ljava/lang/Iterable;)Lio/reactivex/Observable;

    move-result-object p1

    .line 77
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitController$bt4CsaNz3dKad1eDYCeGQBo7AAY;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitController$bt4CsaNz3dKad1eDYCeGQBo7AAY;-><init>(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->concatMapCompletable(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    return-object p0
.end method

.method private static final _init_$lambda-3(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;Ljava/util/List;)Lio/reactivex/CompletableSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "restingLogs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    check-cast p1, Ljava/lang/Iterable;

    const/16 v0, 0x1f4

    invoke-static {p1, v0}, Lkotlin/collections/CollectionsKt;->chunked(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lio/reactivex/Observable;->fromIterable(Ljava/lang/Iterable;)Lio/reactivex/Observable;

    move-result-object p1

    .line 84
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitController$nTj6lZs9TW2ogm9OIbI9_dON6Z8;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitController$nTj6lZs9TW2ogm9OIbI9_dON6Z8;-><init>(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->concatMapCompletable(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    return-object p0
.end method

.method private static final _init_$lambda-5(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;Ljava/util/List;)Lio/reactivex/CompletableSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sleepLogs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    check-cast p1, Ljava/lang/Iterable;

    const/16 v0, 0x1f4

    invoke-static {p1, v0}, Lkotlin/collections/CollectionsKt;->chunked(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lio/reactivex/Observable;->fromIterable(Ljava/lang/Iterable;)Lio/reactivex/Observable;

    move-result-object p1

    .line 91
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitController$MvzwEX6yjCagJRs25hMS_GRyPDw;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitController$MvzwEX6yjCagJRs25hMS_GRyPDw;-><init>(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->concatMapCompletable(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    return-object p0
.end method

.method private static final _init_$lambda-7(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;Ljava/util/List;)Lio/reactivex/CompletableSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sessionList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    check-cast p1, Ljava/lang/Iterable;

    const/16 v0, 0x1f4

    invoke-static {p1, v0}, Lkotlin/collections/CollectionsKt;->chunked(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lio/reactivex/Observable;->fromIterable(Ljava/lang/Iterable;)Lio/reactivex/Observable;

    move-result-object p1

    .line 98
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitController$qLCpnCJJI8ZW3YGAzsicrerYje4;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitController$qLCpnCJJI8ZW3YGAzsicrerYje4;-><init>(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->concatMapCompletable(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    return-object p0
.end method

.method private static final _init_$lambda-8()V
    .locals 0

    return-void
.end method

.method private static final _init_$lambda-9(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method private static final disable$lambda-10(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;Ljava/lang/Void;)V
    .locals 3

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 144
    move-object p1, p0

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string v0, "Revoking authorization success"

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p1, v0, v1, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 145
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->subscribeSubject:Lio/reactivex/subjects/BehaviorSubject;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p1, v1}, Lio/reactivex/subjects/BehaviorSubject;->onNext(Ljava/lang/Object;)V

    .line 146
    invoke-direct {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->saveAuthorizationStatus(Z)V

    return-void
.end method

.method private static final disable$lambda-11(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;Ljava/lang/Exception;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 148
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    .line 149
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p1, "Revoking authorization fail"

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final disable$lambda-12(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;Lcom/google/android/gms/tasks/Task;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 152
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p1, "Revoking authorization complete"

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private final hasStoredPermission()Z
    .locals 3

    .line 174
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/auth/api/signin/GoogleSignIn;->getLastSignedInAccount(Landroid/content/Context;)Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 175
    :cond_0
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->context:Landroid/content/Context;

    invoke-static {v2}, Landroidx/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v2

    .line 176
    invoke-virtual {v0}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->getDisplayName()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    const-string v0, "null"

    :cond_1
    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static synthetic lambda$3UaqVGh82WSVHnNwgPv8A5Xi1rM()V
    .locals 0

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->_init_$lambda-8()V

    return-void
.end method

.method public static synthetic lambda$9bZ0obheidtH_tIv5YFzDWp_NXk(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;Ljava/util/List;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->_init_$lambda-7(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;Ljava/util/List;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$MvzwEX6yjCagJRs25hMS_GRyPDw(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;Ljava/util/List;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->lambda-5$lambda-4(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;Ljava/util/List;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$QdlOZpv8uOPTag9ntN2EdH0aM9g(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;Ljava/lang/Void;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->disable$lambda-10(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;Ljava/lang/Void;)V

    return-void
.end method

.method public static synthetic lambda$SBLXTXMI9lcYCuJ2UByEgMIbZT8(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->disable$lambda-12(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method

.method public static synthetic lambda$SqCChIYQ--2vnBe1ifraLSJKojU(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;Ljava/util/List;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->_init_$lambda-5(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;Ljava/util/List;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$ag2jchaTrwXbYQDAEZfloU24XEQ(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;Ljava/lang/Exception;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->disable$lambda-11(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic lambda$bt4CsaNz3dKad1eDYCeGQBo7AAY(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;Ljava/util/List;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->lambda-1$lambda-0(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;Ljava/util/List;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$fTpIoPTivDWgqSRDMPEjFT1oJOo(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;Ljava/util/List;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->_init_$lambda-3(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;Ljava/util/List;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$nTj6lZs9TW2ogm9OIbI9_dON6Z8(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;Ljava/util/List;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->lambda-3$lambda-2(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;Ljava/util/List;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$qLCpnCJJI8ZW3YGAzsicrerYje4(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;Ljava/util/List;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->lambda-7$lambda-6(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;Ljava/util/List;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$sVP69nw5u4OjmAcHt7IMSBlpNB4(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->_init_$lambda-9(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$tzRT-ncpW9AMSJKNlldu0Uyx1kE(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;Ljava/util/List;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->_init_$lambda-1(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;Ljava/util/List;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method private static final lambda-1$lambda-0(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;Ljava/util/List;)Lio/reactivex/CompletableSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->getContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->hasPermissions()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->writer:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitWriter;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {v0, p1, p0}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitWriter;->saveWalkingLog(Ljava/util/List;Landroid/content/Context;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    goto :goto_0

    .line 79
    :cond_0
    invoke-static {}, Lio/reactivex/Completable;->complete()Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    :goto_0
    return-object p0
.end method

.method private static final lambda-3$lambda-2(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;Ljava/util/List;)Lio/reactivex/CompletableSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->getContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->hasPermissions()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->writer:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitWriter;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {v0, p1, p0}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitWriter;->saveRestingLog(Ljava/util/List;Landroid/content/Context;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    goto :goto_0

    .line 86
    :cond_0
    invoke-static {}, Lio/reactivex/Completable;->complete()Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    :goto_0
    return-object p0
.end method

.method private static final lambda-5$lambda-4(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;Ljava/util/List;)Lio/reactivex/CompletableSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->getContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->hasPermissions()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->writer:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitWriter;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {v0, p1, p0}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitWriter;->saveSleepingLog(Ljava/util/List;Landroid/content/Context;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    goto :goto_0

    .line 93
    :cond_0
    invoke-static {}, Lio/reactivex/Completable;->complete()Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    :goto_0
    return-object p0
.end method

.method private static final lambda-7$lambda-6(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;Ljava/util/List;)Lio/reactivex/CompletableSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->getContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->hasPermissions()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->writer:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitWriter;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {v0, p1, p0}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitWriter;->writeSessions(Ljava/util/List;Landroid/content/Context;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    goto :goto_0

    .line 100
    :cond_0
    invoke-static {}, Lio/reactivex/Completable;->complete()Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    :goto_0
    return-object p0
.end method

.method private final saveAuthorizationStatus(Z)V
    .locals 2

    .line 168
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/auth/api/signin/GoogleSignIn;->getLastSignedInAccount(Landroid/content/Context;)Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 169
    :cond_0
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->context:Landroid/content/Context;

    invoke-static {v1}, Landroidx/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 170
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->getDisplayName()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    const-string v0, "null"

    :cond_1
    invoke-interface {v1, v0, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    return-void
.end method


# virtual methods
.method public final authorizationSuccess()V
    .locals 4

    .line 113
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string v1, "Authorization received in controller success!"

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 114
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->subscribeSubject:Lio/reactivex/subjects/BehaviorSubject;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/subjects/BehaviorSubject;->onNext(Ljava/lang/Object;)V

    .line 115
    invoke-direct {p0, v1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->saveAuthorizationStatus(Z)V

    return-void
.end method

.method public final authorize(Landroidx/fragment/app/Fragment;)V
    .locals 6

    const/4 v0, 0x0

    if-nez p1, :cond_0

    move-object v1, v0

    goto :goto_0

    .line 120
    :cond_0
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v1

    :goto_0
    if-nez v1, :cond_1

    return-void

    .line 121
    :cond_1
    move-object v2, p0

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string v3, "Authorization request"

    const/4 v4, 0x2

    invoke-static {v2, v3, v0, v4, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 123
    invoke-static {v1}, Lcom/google/android/gms/auth/api/signin/GoogleSignIn;->getLastSignedInAccount(Landroid/content/Context;)Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    move-result-object v3

    iget-object v5, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->options:Lcom/google/android/gms/fitness/FitnessOptions;

    check-cast v5, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptionsExtension;

    invoke-static {v3, v5}, Lcom/google/android/gms/auth/api/signin/GoogleSignIn;->hasPermissions(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptionsExtension;)Z

    move-result v3

    if-nez v3, :cond_2

    const/16 v0, 0x4d2

    .line 126
    invoke-static {v1}, Lcom/google/android/gms/auth/api/signin/GoogleSignIn;->getLastSignedInAccount(Landroid/content/Context;)Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    move-result-object v1

    .line 127
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->options:Lcom/google/android/gms/fitness/FitnessOptions;

    check-cast v2, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptionsExtension;

    .line 124
    invoke-static {p1, v0, v1, v2}, Lcom/google/android/gms/auth/api/signin/GoogleSignIn;->requestPermissions(Landroidx/fragment/app/Fragment;ILcom/google/android/gms/auth/api/signin/GoogleSignInAccount;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptionsExtension;)V

    goto :goto_1

    :cond_2
    const-string p1, "Authorization granted already!"

    .line 129
    invoke-static {v2, p1, v0, v4, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 130
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->subscribeSubject:Lio/reactivex/subjects/BehaviorSubject;

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p1, v1}, Lio/reactivex/subjects/BehaviorSubject;->onNext(Ljava/lang/Object;)V

    .line 131
    invoke-direct {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->saveAuthorizationStatus(Z)V

    :goto_1
    return-void
.end method

.method public final disable()V
    .locals 4

    .line 137
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string v1, "Revoking authorization to fit"

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 139
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->context:Landroid/content/Context;

    if-nez v0, :cond_0

    return-void

    .line 141
    :cond_0
    invoke-static {v0}, Lcom/google/android/gms/auth/api/signin/GoogleSignIn;->getLastSignedInAccount(Landroid/content/Context;)Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    move-result-object v0

    if-nez v0, :cond_1

    return-void

    .line 142
    :cond_1
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->context:Landroid/content/Context;

    invoke-static {v1, v0}, Lcom/google/android/gms/fitness/Fitness;->getConfigClient(Landroid/content/Context;Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)Lcom/google/android/gms/fitness/ConfigClient;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/fitness/ConfigClient;->disableFit()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    .line 143
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitController$QdlOZpv8uOPTag9ntN2EdH0aM9g;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitController$QdlOZpv8uOPTag9ntN2EdH0aM9g;-><init>(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    .line 147
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitController$ag2jchaTrwXbYQDAEZfloU24XEQ;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitController$ag2jchaTrwXbYQDAEZfloU24XEQ;-><init>(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    .line 151
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitController$SBLXTXMI9lcYCuJ2UByEgMIbZT8;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitController$SBLXTXMI9lcYCuJ2UByEgMIbZT8;-><init>(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method public final getContext()Landroid/content/Context;
    .locals 1

    .line 31
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->context:Landroid/content/Context;

    return-object v0
.end method

.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 31
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method public final getSubscription()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 37
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->subscribeSubject:Lio/reactivex/subjects/BehaviorSubject;

    check-cast v0, Lio/reactivex/Observable;

    return-object v0
.end method

.method public final hasGooglePermissions()Z
    .locals 2

    .line 180
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/auth/api/signin/GoogleSignIn;->getLastSignedInAccount(Landroid/content/Context;)Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 181
    :cond_0
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->options:Lcom/google/android/gms/fitness/FitnessOptions;

    check-cast v1, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptionsExtension;

    invoke-static {v0, v1}, Lcom/google/android/gms/auth/api/signin/GoogleSignIn;->hasPermissions(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptionsExtension;)Z

    move-result v0

    return v0
.end method

.method public final hasPermissions()Z
    .locals 1

    .line 185
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->hasStoredPermission()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->hasGooglePermissions()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final saveRestingLogs(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingLog;",
            ">;)V"
        }
    .end annotation

    const-string v0, "logs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 157
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->restingSubject:Lio/reactivex/subjects/PublishSubject;

    invoke-virtual {v0, p1}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public final saveSleepingLogs(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;",
            ">;)V"
        }
    .end annotation

    const-string v0, "sleepLogList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 163
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->sleepSubject:Lio/reactivex/subjects/PublishSubject;

    invoke-virtual {v0, p1}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public final saveWalkingLogs(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;",
            ">;)V"
        }
    .end annotation

    const-string v0, "logList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 161
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->walkingSubject:Lio/reactivex/subjects/PublishSubject;

    invoke-virtual {v0, p1}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public final writeSessionList(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
            ">;)V"
        }
    .end annotation

    const-string v0, "sessionList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 159
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->sessionSubject:Lio/reactivex/subjects/PublishSubject;

    invoke-virtual {v0, p1}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method
