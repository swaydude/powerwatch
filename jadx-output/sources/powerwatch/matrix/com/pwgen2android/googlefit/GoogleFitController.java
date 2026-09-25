package powerwatch.matrix.com.pwgen2android.googlefit;

/* JADX INFO: compiled from: GoogleFitController.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0010\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010!J\u0006\u0010\"\u001a\u00020\u001eJ\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001a0$J\u0006\u0010%\u001a\u00020\u001aJ\u0006\u0010&\u001a\u00020\u001aJ\b\u0010'\u001a\u00020\u001aH\u0002J\u0010\u0010(\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020\u001aH\u0003J\u0014\u0010*\u001a\u00020\u001e2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u0014\u0010,\u001a\u00020\u001e2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00170\u000fJ\u0014\u0010.\u001a\u00020\u001e2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000fJ\u0014\u00100\u001a\u00020\u001e2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00150\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\r\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0010 \u0011*\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f0\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u0014\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0015 \u0011*\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000f0\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u0016\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0017 \u0011*\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u000f0\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0018\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u001a0\u001a0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u001b\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u001c \u0011*\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u000f0\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "context", "Landroid/content/Context;", "writer", "Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitWriter;", "(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitWriter;)V", "getContext", "()Landroid/content/Context;", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "options", "Lcom/google/android/gms/fitness/FitnessOptions;", "restingSubject", "Lio/reactivex/subjects/PublishSubject;", "", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingLog;", "kotlin.jvm.PlatformType", "scheduler", "Lio/reactivex/Scheduler;", "sessionSubject", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;", "sleepSubject", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;", "subscribeSubject", "Lio/reactivex/subjects/BehaviorSubject;", "", "walkingSubject", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;", "authorizationSuccess", "", "authorize", "fragment", "Landroidx/fragment/app/Fragment;", "disable", "getSubscription", "Lio/reactivex/Observable;", "hasGooglePermissions", "hasPermissions", "hasStoredPermission", "saveAuthorizationStatus", "enable", "saveRestingLogs", "logs", "saveSleepingLogs", "sleepLogList", "saveWalkingLogs", "logList", "writeSessionList", "sessionList", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class GoogleFitController implements powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    private final android.content.Context context;
    private final io.reactivex.disposables.CompositeDisposable disposable;
    private final com.google.android.gms.fitness.FitnessOptions options;
    private final io.reactivex.subjects.PublishSubject<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingLog>> restingSubject;
    private final io.reactivex.Scheduler scheduler;
    private final io.reactivex.subjects.PublishSubject<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession>> sessionSubject;
    private final io.reactivex.subjects.PublishSubject<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog>> sleepSubject;
    private final io.reactivex.subjects.BehaviorSubject<java.lang.Boolean> subscribeSubject;
    private final io.reactivex.subjects.PublishSubject<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingLog>> walkingSubject;
    private final powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitWriter writer;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-8, reason: not valid java name */
    public static final void m1434_init_$lambda8() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-9, reason: not valid java name */
    public static final void m1435_init_$lambda9(java.lang.Throwable th) {
    }

    public GoogleFitController(android.content.Context context, powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitWriter writer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "writer");
        this.context = context;
        this.writer = writer;
        io.reactivex.subjects.BehaviorSubject<java.lang.Boolean> behaviorSubjectCreateDefault = io.reactivex.subjects.BehaviorSubject.createDefault(false);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreateDefault, "createDefault(false)");
        this.subscribeSubject = behaviorSubjectCreateDefault;
        io.reactivex.disposables.CompositeDisposable compositeDisposable = new io.reactivex.disposables.CompositeDisposable();
        this.disposable = compositeDisposable;
        com.google.android.gms.fitness.FitnessOptions fitnessOptionsBuild = com.google.android.gms.fitness.FitnessOptions.builder().addDataType(com.google.android.gms.fitness.data.DataType.TYPE_HEART_RATE_BPM, 1).addDataType(com.google.android.gms.fitness.data.DataType.AGGREGATE_HEART_RATE_SUMMARY, 1).addDataType(com.google.android.gms.fitness.data.DataType.TYPE_STEP_COUNT_DELTA, 1).addDataType(com.google.android.gms.fitness.data.DataType.TYPE_STEP_COUNT_CUMULATIVE, 1).addDataType(com.google.android.gms.fitness.data.DataType.AGGREGATE_STEP_COUNT_DELTA, 1).addDataType(com.google.android.gms.fitness.data.DataType.TYPE_DISTANCE_DELTA, 1).addDataType(com.google.android.gms.fitness.data.DataType.TYPE_DISTANCE_CUMULATIVE, 1).addDataType(com.google.android.gms.fitness.data.DataType.AGGREGATE_DISTANCE_DELTA, 1).addDataType(com.google.android.gms.fitness.data.DataType.TYPE_CALORIES_EXPENDED, 1).addDataType(com.google.android.gms.fitness.data.DataType.AGGREGATE_CALORIES_EXPENDED, 1).addDataType(com.google.android.gms.fitness.data.DataType.TYPE_ACTIVITY_SEGMENT, 1).addDataType(com.google.android.gms.fitness.data.DataType.AGGREGATE_ACTIVITY_SUMMARY, 1).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fitnessOptionsBuild, "builder()\n            .addDataType(DataType.TYPE_HEART_RATE_BPM, FitnessOptions.ACCESS_WRITE)\n            .addDataType(DataType.AGGREGATE_HEART_RATE_SUMMARY, FitnessOptions.ACCESS_WRITE)\n\n            .addDataType(DataType.TYPE_STEP_COUNT_DELTA, FitnessOptions.ACCESS_WRITE)\n            .addDataType(DataType.TYPE_STEP_COUNT_CUMULATIVE, FitnessOptions.ACCESS_WRITE)\n            .addDataType(DataType.AGGREGATE_STEP_COUNT_DELTA, FitnessOptions.ACCESS_WRITE)\n\n            .addDataType(DataType.TYPE_DISTANCE_DELTA, FitnessOptions.ACCESS_WRITE)\n            .addDataType(DataType.TYPE_DISTANCE_CUMULATIVE, FitnessOptions.ACCESS_WRITE)\n            .addDataType(DataType.AGGREGATE_DISTANCE_DELTA, FitnessOptions.ACCESS_WRITE)\n\n            .addDataType(DataType.TYPE_CALORIES_EXPENDED, FitnessOptions.ACCESS_WRITE)\n            .addDataType(DataType.AGGREGATE_CALORIES_EXPENDED, FitnessOptions.ACCESS_WRITE)\n\n            .addDataType(DataType.TYPE_ACTIVITY_SEGMENT, FitnessOptions.ACCESS_WRITE)\n            .addDataType(DataType.AGGREGATE_ACTIVITY_SUMMARY, FitnessOptions.ACCESS_WRITE)\n\n            .build()");
        this.options = fitnessOptionsBuild;
        io.reactivex.subjects.PublishSubject<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingLog>> publishSubjectCreate = io.reactivex.subjects.PublishSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "create<List<WalkingLog>>()");
        this.walkingSubject = publishSubjectCreate;
        io.reactivex.subjects.PublishSubject<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingLog>> publishSubjectCreate2 = io.reactivex.subjects.PublishSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publishSubjectCreate2, "create<List<RestingLog>>()");
        this.restingSubject = publishSubjectCreate2;
        io.reactivex.subjects.PublishSubject<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession>> publishSubjectCreate3 = io.reactivex.subjects.PublishSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publishSubjectCreate3, "create<List<UserActivitySession>>()");
        this.sessionSubject = publishSubjectCreate3;
        io.reactivex.subjects.PublishSubject<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog>> publishSubjectCreate4 = io.reactivex.subjects.PublishSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publishSubjectCreate4, "create<List<SleepLog>>()");
        this.sleepSubject = publishSubjectCreate4;
        io.reactivex.Scheduler schedulerFrom = io.reactivex.schedulers.Schedulers.from(java.util.concurrent.Executors.newSingleThreadExecutor());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(schedulerFrom, "from(Executors.newSingleThreadExecutor())");
        this.scheduler = schedulerFrom;
        if (context != null) {
            boolean zHasPermissions = hasPermissions();
            powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this, kotlin.jvm.internal.Intrinsics.stringPlus("Controller initialized, has permissions: ", java.lang.Boolean.valueOf(zHasPermissions)), null, 2, null);
            behaviorSubjectCreateDefault.onNext(java.lang.Boolean.valueOf(zHasPermissions));
        }
        compositeDisposable.add(io.reactivex.Completable.mergeArray(publishSubjectCreate.flatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.googlefit.-$$Lambda$GoogleFitController$tzRT-ncpW9AMSJKNlldu0Uyx1kE
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController.m1430_init_$lambda1(this.f$0, (java.util.List) obj);
            }
        }), publishSubjectCreate2.flatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.googlefit.-$$Lambda$GoogleFitController$fTpIoPTivDWgqSRDMPEjFT1oJOo
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController.m1431_init_$lambda3(this.f$0, (java.util.List) obj);
            }
        }), publishSubjectCreate4.flatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.googlefit.-$$Lambda$GoogleFitController$SqCChIYQ--2vnBe1ifraLSJKojU
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController.m1432_init_$lambda5(this.f$0, (java.util.List) obj);
            }
        }), publishSubjectCreate3.flatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.googlefit.-$$Lambda$GoogleFitController$9bZ0obheidtH_tIv5YFzDWp_NXk
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController.m1433_init_$lambda7(this.f$0, (java.util.List) obj);
            }
        })).subscribeOn(schedulerFrom).repeat().retry().subscribe(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.googlefit.-$$Lambda$GoogleFitController$3UaqVGh82WSVHnNwgPv8A5Xi1rM
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController.m1434_init_$lambda8();
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.googlefit.-$$Lambda$GoogleFitController$sVP69nw5u4OjmAcHt7IMSBlpNB4
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController.m1435_init_$lambda9((java.lang.Throwable) obj);
            }
        }));
    }

    public final android.content.Context getContext() {
        return this.context;
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    public final io.reactivex.Observable<java.lang.Boolean> getSubscription() {
        return this.subscribeSubject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-1, reason: not valid java name */
    public static final io.reactivex.CompletableSource m1430_init_$lambda1(final powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController this$0, java.util.List walkingLogs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingLogs, "walkingLogs");
        return io.reactivex.Observable.fromIterable(kotlin.collections.CollectionsKt.chunked(walkingLogs, com.baidu.mapapi.UIMsg.d_ResultType.SHORT_URL)).concatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.googlefit.-$$Lambda$GoogleFitController$bt4CsaNz3dKad1eDYCeGQBo7AAY
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController.m1441lambda1$lambda0(this.f$0, (java.util.List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-1$lambda-0, reason: not valid java name */
    public static final io.reactivex.CompletableSource m1441lambda1$lambda0(powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController this$0, java.util.List it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return (this$0.getContext() == null || !this$0.hasPermissions()) ? io.reactivex.Completable.complete() : this$0.writer.saveWalkingLog(it, this$0.getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-3, reason: not valid java name */
    public static final io.reactivex.CompletableSource m1431_init_$lambda3(final powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController this$0, java.util.List restingLogs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingLogs, "restingLogs");
        return io.reactivex.Observable.fromIterable(kotlin.collections.CollectionsKt.chunked(restingLogs, com.baidu.mapapi.UIMsg.d_ResultType.SHORT_URL)).concatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.googlefit.-$$Lambda$GoogleFitController$nTj6lZs9TW2ogm9OIbI9_dON6Z8
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController.m1442lambda3$lambda2(this.f$0, (java.util.List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-3$lambda-2, reason: not valid java name */
    public static final io.reactivex.CompletableSource m1442lambda3$lambda2(powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController this$0, java.util.List it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return (this$0.getContext() == null || !this$0.hasPermissions()) ? io.reactivex.Completable.complete() : this$0.writer.saveRestingLog(it, this$0.getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-5, reason: not valid java name */
    public static final io.reactivex.CompletableSource m1432_init_$lambda5(final powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController this$0, java.util.List sleepLogs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepLogs, "sleepLogs");
        return io.reactivex.Observable.fromIterable(kotlin.collections.CollectionsKt.chunked(sleepLogs, com.baidu.mapapi.UIMsg.d_ResultType.SHORT_URL)).concatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.googlefit.-$$Lambda$GoogleFitController$MvzwEX6yjCagJRs25hMS_GRyPDw
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController.m1443lambda5$lambda4(this.f$0, (java.util.List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-5$lambda-4, reason: not valid java name */
    public static final io.reactivex.CompletableSource m1443lambda5$lambda4(powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController this$0, java.util.List it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return (this$0.getContext() == null || !this$0.hasPermissions()) ? io.reactivex.Completable.complete() : this$0.writer.saveSleepingLog(it, this$0.getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-7, reason: not valid java name */
    public static final io.reactivex.CompletableSource m1433_init_$lambda7(final powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController this$0, java.util.List sessionList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionList, "sessionList");
        return io.reactivex.Observable.fromIterable(kotlin.collections.CollectionsKt.chunked(sessionList, com.baidu.mapapi.UIMsg.d_ResultType.SHORT_URL)).concatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.googlefit.-$$Lambda$GoogleFitController$qLCpnCJJI8ZW3YGAzsicrerYje4
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController.m1444lambda7$lambda6(this.f$0, (java.util.List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-7$lambda-6, reason: not valid java name */
    public static final io.reactivex.CompletableSource m1444lambda7$lambda6(powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController this$0, java.util.List it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return (this$0.getContext() == null || !this$0.hasPermissions()) ? io.reactivex.Completable.complete() : this$0.writer.writeSessions(it, this$0.getContext());
    }

    public final void authorizationSuccess() {
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this, "Authorization received in controller success!", null, 2, null);
        this.subscribeSubject.onNext(true);
        saveAuthorizationStatus(true);
    }

    public final void authorize(androidx.fragment.app.Fragment fragment) {
        android.content.Context context = fragment == null ? null : fragment.getContext();
        if (context == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController googleFitController = this;
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(googleFitController, "Authorization request", null, 2, null);
        if (!com.google.android.gms.auth.api.signin.GoogleSignIn.hasPermissions(com.google.android.gms.auth.api.signin.GoogleSignIn.getLastSignedInAccount(context), this.options)) {
            com.google.android.gms.auth.api.signin.GoogleSignIn.requestPermissions(fragment, powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitAuth.AUTH_CODE, com.google.android.gms.auth.api.signin.GoogleSignIn.getLastSignedInAccount(context), this.options);
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(googleFitController, "Authorization granted already!", null, 2, null);
        this.subscribeSubject.onNext(true);
        saveAuthorizationStatus(true);
    }

    public final void disable() {
        com.google.android.gms.auth.api.signin.GoogleSignInAccount lastSignedInAccount;
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this, "Revoking authorization to fit", null, 2, null);
        android.content.Context context = this.context;
        if (context == null || (lastSignedInAccount = com.google.android.gms.auth.api.signin.GoogleSignIn.getLastSignedInAccount(context)) == null) {
            return;
        }
        com.google.android.gms.fitness.Fitness.getConfigClient(this.context, lastSignedInAccount).disableFit().addOnSuccessListener(new com.google.android.gms.tasks.OnSuccessListener() { // from class: powerwatch.matrix.com.pwgen2android.googlefit.-$$Lambda$GoogleFitController$QdlOZpv8uOPTag9ntN2EdH0aM9g
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController.m1436disable$lambda10(this.f$0, (java.lang.Void) obj);
            }
        }).addOnFailureListener(new com.google.android.gms.tasks.OnFailureListener() { // from class: powerwatch.matrix.com.pwgen2android.googlefit.-$$Lambda$GoogleFitController$ag2jchaTrwXbYQDAEZfloU24XEQ
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(java.lang.Exception exc) {
                powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController.m1437disable$lambda11(this.f$0, exc);
            }
        }).addOnCompleteListener(new com.google.android.gms.tasks.OnCompleteListener() { // from class: powerwatch.matrix.com.pwgen2android.googlefit.-$$Lambda$GoogleFitController$SBLXTXMI9lcYCuJ2UByEgMIbZT8
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(com.google.android.gms.tasks.Task task) {
                powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController.m1438disable$lambda12(this.f$0, task);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: disable$lambda-10, reason: not valid java name */
    public static final void m1436disable$lambda10(powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController this$0, java.lang.Void r4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Revoking authorization success", null, 2, null);
        this$0.subscribeSubject.onNext(false);
        this$0.saveAuthorizationStatus(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: disable$lambda-11, reason: not valid java name */
    public static final void m1437disable$lambda11(powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController this$0, java.lang.Exception it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        it.printStackTrace();
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Revoking authorization fail", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: disable$lambda-12, reason: not valid java name */
    public static final void m1438disable$lambda12(powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController this$0, com.google.android.gms.tasks.Task it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Revoking authorization complete", null, 2, null);
    }

    public final void saveRestingLogs(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingLog> logs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logs, "logs");
        this.restingSubject.onNext(logs);
    }

    public final void writeSessionList(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> sessionList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionList, "sessionList");
        this.sessionSubject.onNext(sessionList);
    }

    public final void saveWalkingLogs(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingLog> logList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logList, "logList");
        this.walkingSubject.onNext(logList);
    }

    public final void saveSleepingLogs(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog> sleepLogList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepLogList, "sleepLogList");
        this.sleepSubject.onNext(sleepLogList);
    }

    private final void saveAuthorizationStatus(boolean enable) {
        com.google.android.gms.auth.api.signin.GoogleSignInAccount lastSignedInAccount = com.google.android.gms.auth.api.signin.GoogleSignIn.getLastSignedInAccount(this.context);
        if (lastSignedInAccount == null) {
            return;
        }
        android.content.SharedPreferences.Editor editorEdit = androidx.preference.PreferenceManager.getDefaultSharedPreferences(this.context).edit();
        java.lang.String displayName = lastSignedInAccount.getDisplayName();
        if (displayName == null) {
            displayName = "null";
        }
        editorEdit.putBoolean(displayName, enable).commit();
    }

    private final boolean hasStoredPermission() {
        com.google.android.gms.auth.api.signin.GoogleSignInAccount lastSignedInAccount = com.google.android.gms.auth.api.signin.GoogleSignIn.getLastSignedInAccount(this.context);
        if (lastSignedInAccount == null) {
            return false;
        }
        android.content.SharedPreferences defaultSharedPreferences = androidx.preference.PreferenceManager.getDefaultSharedPreferences(this.context);
        java.lang.String displayName = lastSignedInAccount.getDisplayName();
        if (displayName == null) {
            displayName = "null";
        }
        return defaultSharedPreferences.getBoolean(displayName, false);
    }

    public final boolean hasGooglePermissions() {
        com.google.android.gms.auth.api.signin.GoogleSignInAccount lastSignedInAccount = com.google.android.gms.auth.api.signin.GoogleSignIn.getLastSignedInAccount(this.context);
        if (lastSignedInAccount == null) {
            return false;
        }
        return com.google.android.gms.auth.api.signin.GoogleSignIn.hasPermissions(lastSignedInAccount, this.options);
    }

    public final boolean hasPermissions() {
        return hasStoredPermission() && hasGooglePermissions();
    }
}
