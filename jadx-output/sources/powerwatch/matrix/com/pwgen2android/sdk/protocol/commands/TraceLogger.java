package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: TraceLogger.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TraceLogger;", "", "createFile", "", "logDataType", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType;", "deleteFile", "getStoredLogs", "Ljava/io/File;", "log", "data", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface TraceLogger {
    void createFile(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogDataType logDataType);

    void deleteFile(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogDataType logDataType);

    java.io.File getStoredLogs(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogDataType logDataType);

    void log(java.lang.String data, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogDataType logDataType);
}
