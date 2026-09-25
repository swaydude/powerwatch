.class public final Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimatorImpl;
.super Ljava/lang/Object;
.source "RunningAnimator.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimator;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000cH\u0016J\u000e\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0013H\u0016J\u0008\u0010\u0014\u001a\u00020\u0010H\u0016J\u000e\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0013H\u0016J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u000cH\u0002R\u001c\u0010\u0004\u001a\u0010\u0012\u000c\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0008\u001a\u0010\u0012\u000c\u0012\n \u0007*\u0004\u0018\u00010\n0\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimatorImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimator;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "()V",
        "animationObservable",
        "Lio/reactivex/subjects/PublishSubject;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/MapAnimationData;",
        "kotlin.jvm.PlatformType",
        "animationStateSubject",
        "Lio/reactivex/subjects/BehaviorSubject;",
        "",
        "mUserActivitySession",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
        "scheduledExecutorService",
        "Ljava/util/concurrent/ScheduledExecutorService;",
        "init",
        "",
        "userActivitySession",
        "isRunning",
        "Lio/reactivex/Observable;",
        "pause",
        "runningAnimationEvents",
        "start",
        "position",
        "",
        "triggerAnimation",
        "startPosition",
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
.field private final animationObservable:Lio/reactivex/subjects/PublishSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/PublishSubject<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/MapAnimationData;",
            ">;"
        }
    .end annotation
.end field

.field private final animationStateSubject:Lio/reactivex/subjects/BehaviorSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/BehaviorSubject<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private mUserActivitySession:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;

.field private scheduledExecutorService:Ljava/util/concurrent/ScheduledExecutorService;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    const-string v1, "newSingleThreadScheduledExecutor()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimatorImpl;->scheduledExecutorService:Ljava/util/concurrent/ScheduledExecutorService;

    .line 42
    invoke-static {}, Lio/reactivex/subjects/PublishSubject;->create()Lio/reactivex/subjects/PublishSubject;

    move-result-object v0

    const-string v1, "create<MapAnimationData>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimatorImpl;->animationObservable:Lio/reactivex/subjects/PublishSubject;

    .line 43
    invoke-static {}, Lio/reactivex/subjects/BehaviorSubject;->create()Lio/reactivex/subjects/BehaviorSubject;

    move-result-object v0

    const-string v1, "create<Boolean>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimatorImpl;->animationStateSubject:Lio/reactivex/subjects/BehaviorSubject;

    return-void
.end method

.method public static synthetic lambda$jUrZOygOujLdTBHlnI2-IiIRYQg(Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimatorImpl;Lkotlin/Pair;Lkotlin/jvm/internal/Ref$FloatRef;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimatorImpl;->triggerAnimation$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimatorImpl;Lkotlin/Pair;Lkotlin/jvm/internal/Ref$FloatRef;)V

    return-void
.end method

.method private final triggerAnimation(ILpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)V
    .locals 8

    .line 73
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimatorImpl;->scheduledExecutorService:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ScheduledExecutorService;->shutdownNow()Ljava/util/List;

    .line 74
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    const-string v1, "newSingleThreadScheduledExecutor()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimatorImpl;->scheduledExecutorService:Ljava/util/concurrent/ScheduledExecutorService;

    .line 76
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/TimeAnimator;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/TimeAnimator;-><init>()V

    invoke-virtual {v0, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/TimeAnimator;->create(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)Lkotlin/Pair;

    move-result-object p2

    .line 80
    new-instance v0, Lkotlin/jvm/internal/Ref$FloatRef;

    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$FloatRef;-><init>()V

    int-to-float p1, p1

    const/16 v1, 0x64

    int-to-float v1, v1

    invoke-virtual {p2}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v1, v2

    div-float/2addr p1, v1

    iput p1, v0, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    .line 81
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimatorImpl;->scheduledExecutorService:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/-$$Lambda$RunningAnimatorImpl$jUrZOygOujLdTBHlnI2-IiIRYQg;

    invoke-direct {v2, p0, p2, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/-$$Lambda$RunningAnimatorImpl$jUrZOygOujLdTBHlnI2-IiIRYQg;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimatorImpl;Lkotlin/Pair;Lkotlin/jvm/internal/Ref$FloatRef;)V

    .line 84
    sget-object v7, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x1e

    .line 81
    invoke-interface/range {v1 .. v7}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    return-void
.end method

.method private static final triggerAnimation$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimatorImpl;Lkotlin/Pair;Lkotlin/jvm/internal/Ref$FloatRef;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$index"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimatorImpl;->animationObservable:Lio/reactivex/subjects/PublishSubject;

    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    iget v0, p2, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    invoke-static {v0}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    .line 83
    iget p0, p2, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    const/4 p1, 0x1

    int-to-float p1, p1

    add-float/2addr p0, p1

    iput p0, p2, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    return-void
.end method


# virtual methods
.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 38
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method public init(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)V
    .locals 1

    const-string v0, "userActivitySession"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimatorImpl;->pause()V

    .line 48
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimatorImpl;->mUserActivitySession:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;

    return-void
.end method

.method public isRunning()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 60
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimatorImpl;->animationStateSubject:Lio/reactivex/subjects/BehaviorSubject;

    check-cast v0, Lio/reactivex/Observable;

    return-object v0
.end method

.method public pause()V
    .locals 2

    .line 67
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimatorImpl;->scheduledExecutorService:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ScheduledExecutorService;->shutdownNow()Ljava/util/List;

    .line 68
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimatorImpl;->animationStateSubject:Lio/reactivex/subjects/BehaviorSubject;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/subjects/BehaviorSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public runningAnimationEvents()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/MapAnimationData;",
            ">;"
        }
    .end annotation

    .line 63
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimatorImpl;->animationObservable:Lio/reactivex/subjects/PublishSubject;

    check-cast v0, Lio/reactivex/Observable;

    return-object v0
.end method

.method public start(I)V
    .locals 3

    .line 53
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimatorImpl;->mUserActivitySession:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;

    if-eqz v0, :cond_0

    .line 55
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimatorImpl;->animationStateSubject:Lio/reactivex/subjects/BehaviorSubject;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/reactivex/subjects/BehaviorSubject;->onNext(Ljava/lang/Object;)V

    .line 56
    invoke-direct {p0, p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimatorImpl;->triggerAnimation(ILpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)V

    :cond_0
    return-void
.end method
