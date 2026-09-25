package powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.tracelogger;

/* JADX INFO: compiled from: TraceLoggerImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rH\u0016J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rH\u0016J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\rH\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\rH\u0016J\u0018\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\rH\u0016J\u0018\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R4\u0010\t\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r \u000e*\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b0\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \u000e*\u0004\u0018\u00010\f0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/tracelogger/TraceLoggerImpl;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TraceLogger;", "appContext", "Landroid/content/Context;", "traceLoggerStorage", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/tracelogger/TraceLoggerStorage;", "(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/tracelogger/TraceLoggerStorage;)V", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "logSubject", "Lio/reactivex/subjects/PublishSubject;", "Lkotlin/Pair;", "", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType;", "kotlin.jvm.PlatformType", "logTag", "createFile", "", "logDataType", "deleteFile", "getFileName", "getStoredLogs", "Ljava/io/File;", "log", "data", "writeToFile", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class TraceLoggerImpl implements powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.TraceLogger {
    private final android.content.Context appContext;
    private final io.reactivex.disposables.CompositeDisposable disposable;
    private final io.reactivex.subjects.PublishSubject<kotlin.Pair<java.lang.String, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogDataType>> logSubject;
    private final java.lang.String logTag;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.tracelogger.TraceLoggerStorage traceLoggerStorage;

    public TraceLoggerImpl(android.content.Context appContext, powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.tracelogger.TraceLoggerStorage traceLoggerStorage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appContext, "appContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(traceLoggerStorage, "traceLoggerStorage");
        this.appContext = appContext;
        this.traceLoggerStorage = traceLoggerStorage;
        this.logTag = powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.tracelogger.TraceLoggerImpl.class.getSimpleName();
        io.reactivex.subjects.PublishSubject<kotlin.Pair<java.lang.String, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogDataType>> publishSubjectCreate = io.reactivex.subjects.PublishSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "create<Pair<String, LogDataType>>()");
        this.logSubject = publishSubjectCreate;
        io.reactivex.disposables.CompositeDisposable compositeDisposable = new io.reactivex.disposables.CompositeDisposable();
        this.disposable = compositeDisposable;
        compositeDisposable.add(publishSubjectCreate.retry().repeat().observeOn(io.reactivex.schedulers.Schedulers.from(java.util.concurrent.Executors.newSingleThreadExecutor())).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.tracelogger.-$$Lambda$TraceLoggerImpl$EikWOAb9h-YzkmfoZyVLRiaZDPc
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) throws java.lang.Throwable {
                powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.tracelogger.TraceLoggerImpl.m3481_init_$lambda0(this.f$0, (kotlin.Pair) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.tracelogger.-$$Lambda$TraceLoggerImpl$y3kuZn5j7fZQFWti3vq5ZKnPDT8
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                ((java.lang.Throwable) obj).printStackTrace();
            }
        }));
    }

    public /* synthetic */ TraceLoggerImpl(android.content.Context context, powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.tracelogger.TraceLoggerStorage traceLoggerStorage, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.tracelogger.TraceLoggerStorage(context) : traceLoggerStorage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-0, reason: not valid java name */
    public static final void m3481_init_$lambda0(powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.tracelogger.TraceLoggerImpl this$0, kotlin.Pair pair) throws java.lang.Throwable {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.writeToFile((java.lang.String) pair.getFirst(), (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogDataType) pair.getSecond());
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.TraceLogger
    public java.io.File getStoredLogs(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogDataType logDataType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logDataType, "logDataType");
        java.io.File fileStreamPath = this.appContext.getFileStreamPath(getFileName(logDataType));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fileStreamPath, "appContext.getFileStreamPath(getFileName(logDataType))");
        return fileStreamPath;
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.TraceLogger
    public void deleteFile(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogDataType logDataType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logDataType, "logDataType");
        this.traceLoggerStorage.deleteFile(getFileName(logDataType));
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.TraceLogger
    public void createFile(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogDataType logDataType) throws java.io.FileNotFoundException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logDataType, "logDataType");
        this.traceLoggerStorage.createFile(getFileName(logDataType));
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.TraceLogger
    public void log(java.lang.String data, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogDataType logDataType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logDataType, "logDataType");
        this.logSubject.onNext(new kotlin.Pair<>(data, logDataType));
    }

    private final void writeToFile(java.lang.String data, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogDataType logDataType) throws java.lang.Throwable {
        java.io.BufferedWriter bufferedWriter = null;
        try {
            java.io.BufferedWriter bufferedWriter2 = new java.io.BufferedWriter(new java.io.OutputStreamWriter(this.appContext.openFileOutput(getFileName(logDataType), 32768)));
            try {
                bufferedWriter2.write(data);
                bufferedWriter2.close();
                bufferedWriter2.close();
            } catch (java.io.IOException unused) {
                bufferedWriter = bufferedWriter2;
                if (bufferedWriter == null) {
                    return;
                }
                bufferedWriter.close();
            } catch (java.lang.Throwable th) {
                th = th;
                bufferedWriter = bufferedWriter2;
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
                throw th;
            }
        } catch (java.io.IOException unused2) {
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    private final java.lang.String getFileName(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogDataType logDataType) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(logDataType, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogDataType.Accel.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(logDataType, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogDataType.Header.INSTANCE)) {
            return "log.txt";
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(logDataType, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogDataType.HeartRate.INSTANCE)) {
            return powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.tracelogger.TraceLoggerImplKt.HR_TRACE_LOG;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
