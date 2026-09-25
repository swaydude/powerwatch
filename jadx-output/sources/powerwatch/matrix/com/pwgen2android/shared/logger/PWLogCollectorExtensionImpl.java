package powerwatch.matrix.com.pwgen2android.shared.logger;

/* JADX INFO: compiled from: PWLogCollectorExtension.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000e\u001a\u00020\u000fH\u0016J4\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00120\u00112\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00122\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0012H\u0016J\b\u0010\u0017\u001a\u00020\u000fH\u0016J\b\u0010\u0018\u001a\u00020\u000fH\u0016R(\u0010\u0007\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\n \u000b*\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLogCollectorExtensionImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLogCollectorExtension;", "loggerOutput", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerOutput;", "loggerConfig", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerConfig;", "(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerOutput;Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerConfig;)V", "collectorSubject", "Lio/reactivex/subjects/BehaviorSubject;", "", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;", "kotlin.jvm.PlatformType", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "clear", "", "collectedLogs", "Lio/reactivex/Observable;", "", "logLevels", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;", "tags", "", "destroy", "init", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class PWLogCollectorExtensionImpl implements powerwatch.matrix.com.pwgen2android.shared.logger.PWLogCollectorExtension {
    private final io.reactivex.subjects.BehaviorSubject<java.util.List<powerwatch.matrix.com.pwgen2android.shared.logger.PWLog>> collectorSubject;
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable;
    private final powerwatch.matrix.com.pwgen2android.shared.logger.LoggerConfig loggerConfig;
    private final powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerOutput loggerOutput;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: init$lambda-2, reason: not valid java name */
    public static final void m3329init$lambda2(java.lang.Throwable th) {
    }

    public PWLogCollectorExtensionImpl(powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerOutput loggerOutput, powerwatch.matrix.com.pwgen2android.shared.logger.LoggerConfig loggerConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loggerOutput, "loggerOutput");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loggerConfig, "loggerConfig");
        this.loggerOutput = loggerOutput;
        this.loggerConfig = loggerConfig;
        io.reactivex.subjects.BehaviorSubject<java.util.List<powerwatch.matrix.com.pwgen2android.shared.logger.PWLog>> behaviorSubjectCreateDefault = io.reactivex.subjects.BehaviorSubject.createDefault(new java.util.ArrayList());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreateDefault, "createDefault((mutableListOf<PWLog>()))");
        this.collectorSubject = behaviorSubjectCreateDefault;
        this.compositeDisposable = new io.reactivex.disposables.CompositeDisposable();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.logger.PWLogCollectorExtension
    public void init() {
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.loggerConfig.getEnv(), powerwatch.matrix.com.pwgen2android.shared.logger.Env.PROD.INSTANCE)) {
            return;
        }
        this.compositeDisposable.add(this.loggerOutput.logOutput(new powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel[0]).filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.shared.logger.-$$Lambda$PWLogCollectorExtensionImpl$hLgJr3pvdfh9OEMFdPqQEmN58ME
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.logger.PWLogCollectorExtensionImpl.m3327init$lambda0((powerwatch.matrix.com.pwgen2android.shared.logger.PWLog) obj);
            }
        }).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.logger.-$$Lambda$PWLogCollectorExtensionImpl$beb5qV0KVU2tyQTQsLvaXOZrqIk
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.logger.PWLogCollectorExtensionImpl.m3328init$lambda1(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.logger.PWLog) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.logger.-$$Lambda$PWLogCollectorExtensionImpl$_PyQeJUcxr4HvWanJ_1EK2wpa2w
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.logger.PWLogCollectorExtensionImpl.m3329init$lambda2((java.lang.Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: init$lambda-0, reason: not valid java name */
    public static final boolean m3327init$lambda0(powerwatch.matrix.com.pwgen2android.shared.logger.PWLog it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return !kotlin.jvm.internal.Intrinsics.areEqual(it.getTag(), powerwatch.matrix.com.pwgen2android.CloudInterceptLogger.CloudTag);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: init$lambda-1, reason: not valid java name */
    public static final void m3328init$lambda1(powerwatch.matrix.com.pwgen2android.shared.logger.PWLogCollectorExtensionImpl this$0, powerwatch.matrix.com.pwgen2android.shared.logger.PWLog it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.logger.PWLog> value = this$0.collectorSubject.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNull(value);
        if (value.size() == 7000) {
            value.clear();
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        value.add(it);
        this$0.collectorSubject.onNext(value);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.logger.PWLogCollectorExtension
    public void clear() {
        this.collectorSubject.onNext(new java.util.ArrayList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: collectedLogs$lambda-4, reason: not valid java name */
    public static final java.util.List m3325collectedLogs$lambda4(java.util.List it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(it);
        return arrayList;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.logger.PWLogCollectorExtension
    public io.reactivex.Observable<java.util.List<powerwatch.matrix.com.pwgen2android.shared.logger.PWLog>> collectedLogs(final java.util.List<? extends powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel> logLevels, final java.util.List<java.lang.String> tags) {
        io.reactivex.Observable<java.util.List<powerwatch.matrix.com.pwgen2android.shared.logger.PWLog>> map = this.collectorSubject.map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.logger.-$$Lambda$PWLogCollectorExtensionImpl$s4VvDFHvexSz3KS55EBvUHysz0M
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.logger.PWLogCollectorExtensionImpl.m3325collectedLogs$lambda4((java.util.List) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.logger.-$$Lambda$PWLogCollectorExtensionImpl$cOI9pF9vR_GJraBOg8G6CoeE69M
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.logger.PWLogCollectorExtensionImpl.m3326collectedLogs$lambda8(logLevels, tags, (java.util.List) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNull(map);
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:34:0x0085  */
    /* JADX INFO: renamed from: collectedLogs$lambda-8, reason: not valid java name */
    public static final java.util.List m3326collectedLogs$lambda8(java.util.List list, java.util.List list2, java.util.List pwLogs) {
        boolean z;
        boolean z2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pwLogs, "pwLogs");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : pwLogs) {
            powerwatch.matrix.com.pwgen2android.shared.logger.PWLog pWLog = (powerwatch.matrix.com.pwgen2android.shared.logger.PWLog) obj;
            boolean z3 = true;
            if (list != null && list2 != null) {
                java.util.List list3 = list;
                if (!(list3 instanceof java.util.Collection) || !list3.isEmpty()) {
                    java.util.Iterator it = list3.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = true;
                            break;
                        }
                        if (kotlin.jvm.internal.Intrinsics.areEqual((powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel) it.next(), pWLog.getLogLevel())) {
                            z = false;
                            break;
                        }
                    }
                } else {
                    z = true;
                    break;
                }
                if (z) {
                    z3 = false;
                } else {
                    java.util.List list4 = list2;
                    if (!(list4 instanceof java.util.Collection) || !list4.isEmpty()) {
                        java.util.Iterator it2 = list4.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z2 = true;
                                break;
                            }
                            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.String) it2.next(), pWLog.getTag())) {
                                z2 = false;
                                break;
                            }
                        }
                    } else {
                        z2 = true;
                        break;
                    }
                    if (z2) {
                        z3 = false;
                    }
                }
            }
            if (z3) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.logger.PWLogCollectorExtension
    public void destroy() {
        this.compositeDisposable.clear();
    }
}
