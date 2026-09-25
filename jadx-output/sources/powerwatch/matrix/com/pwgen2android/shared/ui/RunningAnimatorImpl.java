package powerwatch.matrix.com.pwgen2android.shared.ui;

/* JADX INFO: compiled from: RunningAnimator.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fH\u0016J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0010H\u0016J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0013H\u0016J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\fH\u0002R\u001c\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\n0\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimatorImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimator;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "()V", "animationObservable", "Lio/reactivex/subjects/PublishSubject;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/MapAnimationData;", "kotlin.jvm.PlatformType", "animationStateSubject", "Lio/reactivex/subjects/BehaviorSubject;", "", "mUserActivitySession", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;", "scheduledExecutorService", "Ljava/util/concurrent/ScheduledExecutorService;", "init", "", "userActivitySession", "isRunning", "Lio/reactivex/Observable;", "pause", "runningAnimationEvents", "start", "position", "", "triggerAnimation", "startPosition", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class RunningAnimatorImpl implements powerwatch.matrix.com.pwgen2android.shared.ui.RunningAnimator, powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    private final io.reactivex.subjects.PublishSubject<powerwatch.matrix.com.pwgen2android.shared.ui.MapAnimationData> animationObservable;
    private final io.reactivex.subjects.BehaviorSubject<java.lang.Boolean> animationStateSubject;
    private powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession mUserActivitySession;
    private java.util.concurrent.ScheduledExecutorService scheduledExecutorService;

    public RunningAnimatorImpl() {
        java.util.concurrent.ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = java.util.concurrent.Executors.newSingleThreadScheduledExecutor();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(scheduledExecutorServiceNewSingleThreadScheduledExecutor, "newSingleThreadScheduledExecutor()");
        this.scheduledExecutorService = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        io.reactivex.subjects.PublishSubject<powerwatch.matrix.com.pwgen2android.shared.ui.MapAnimationData> publishSubjectCreate = io.reactivex.subjects.PublishSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "create<MapAnimationData>()");
        this.animationObservable = publishSubjectCreate;
        io.reactivex.subjects.BehaviorSubject<java.lang.Boolean> behaviorSubjectCreate = io.reactivex.subjects.BehaviorSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreate, "create<Boolean>()");
        this.animationStateSubject = behaviorSubjectCreate;
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.ui.RunningAnimator
    public void init(powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession userActivitySession) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userActivitySession, "userActivitySession");
        pause();
        this.mUserActivitySession = userActivitySession;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.ui.RunningAnimator
    public void start(int position) {
        powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession userActivitySession = this.mUserActivitySession;
        if (userActivitySession != null) {
            this.animationStateSubject.onNext(true);
            triggerAnimation(position, userActivitySession);
        }
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.ui.RunningAnimator
    public io.reactivex.Observable<java.lang.Boolean> isRunning() {
        return this.animationStateSubject;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.ui.RunningAnimator
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.ui.MapAnimationData> runningAnimationEvents() {
        return this.animationObservable;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.ui.RunningAnimator
    public void pause() {
        this.scheduledExecutorService.shutdownNow();
        this.animationStateSubject.onNext(false);
    }

    private final void triggerAnimation(int startPosition, powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession userActivitySession) {
        this.scheduledExecutorService.shutdownNow();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = java.util.concurrent.Executors.newSingleThreadScheduledExecutor();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(scheduledExecutorServiceNewSingleThreadScheduledExecutor, "newSingleThreadScheduledExecutor()");
        this.scheduledExecutorService = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        final kotlin.Pair<java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.MapAnimationData>, java.lang.Integer> pairCreate = new powerwatch.matrix.com.pwgen2android.shared.ui.TimeAnimator().create(userActivitySession);
        final kotlin.jvm.internal.Ref.FloatRef floatRef = new kotlin.jvm.internal.Ref.FloatRef();
        floatRef.element = startPosition / (100 / pairCreate.getSecond().intValue());
        this.scheduledExecutorService.scheduleAtFixedRate(new java.lang.Runnable() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.-$$Lambda$RunningAnimatorImpl$jUrZOygOujLdTBHlnI2-IiIRYQg
            @Override // java.lang.Runnable
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.ui.RunningAnimatorImpl.m3437triggerAnimation$lambda0(this.f$0, pairCreate, floatRef);
            }
        }, 0L, 30L, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: triggerAnimation$lambda-0, reason: not valid java name */
    public static final void m3437triggerAnimation$lambda0(powerwatch.matrix.com.pwgen2android.shared.ui.RunningAnimatorImpl this$0, kotlin.Pair data, kotlin.jvm.internal.Ref.FloatRef index) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "$data");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(index, "$index");
        this$0.animationObservable.onNext((powerwatch.matrix.com.pwgen2android.shared.ui.MapAnimationData) ((java.util.List) data.getFirst()).get(kotlin.math.MathKt.roundToInt(index.element)));
        index.element++;
    }
}
