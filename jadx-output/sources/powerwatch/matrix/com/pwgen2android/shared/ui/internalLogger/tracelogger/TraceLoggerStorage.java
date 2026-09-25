package powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.tracelogger;

/* JADX INFO: compiled from: TraceLoggerImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/tracelogger/TraceLoggerStorage;", "", "appContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "createFile", "", "fileName", "", "deleteFile", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class TraceLoggerStorage {
    private final android.content.Context appContext;

    public TraceLoggerStorage(android.content.Context appContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.appContext = appContext;
    }

    public final void createFile(java.lang.String fileName) throws java.io.FileNotFoundException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileName, "fileName");
        this.appContext.openFileOutput(fileName, 32768);
    }

    public final void deleteFile(java.lang.String fileName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileName, "fileName");
        this.appContext.deleteFile(fileName);
    }
}
