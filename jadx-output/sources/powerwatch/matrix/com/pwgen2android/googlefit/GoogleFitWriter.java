package powerwatch.matrix.com.pwgen2android.googlefit;

/* JADX INFO: compiled from: GoogleFitWriter.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001c\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0002\u001a\u00020\u0003J\u001c\u0010\u000e\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\u0006\u0010\u0002\u001a\u00020\u0003J\u001c\u0010\u0010\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00110\f2\u0006\u0010\u0002\u001a\u00020\u0003J\u001c\u0010\u0012\u001a\u00020\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\f2\u0006\u0010\u0002\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitWriter;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "context", "Landroid/content/Context;", "googleFitSessionWriter", "Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;", "googleFitDataWriter", "Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;", "(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;)V", "saveRestingLog", "Lio/reactivex/Completable;", "logs", "", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingLog;", "saveSleepingLog", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;", "saveWalkingLog", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;", "writeSessions", "userSessions", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class GoogleFitWriter implements powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    private final android.content.Context context;
    private final powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter googleFitDataWriter;
    private final powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitSessionWriter googleFitSessionWriter;

    public GoogleFitWriter(android.content.Context context, powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitSessionWriter googleFitSessionWriter, powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter googleFitDataWriter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googleFitSessionWriter, "googleFitSessionWriter");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googleFitDataWriter, "googleFitDataWriter");
        this.context = context;
        this.googleFitSessionWriter = googleFitSessionWriter;
        this.googleFitDataWriter = googleFitDataWriter;
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    public final io.reactivex.Completable writeSessions(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> userSessions, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userSessions, "userSessions");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return this.googleFitSessionWriter.writeSessions(userSessions, context);
    }

    public final io.reactivex.Completable saveWalkingLog(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingLog> logs, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logs, "logs");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return this.googleFitDataWriter.saveWalkingLog(logs, context);
    }

    public final io.reactivex.Completable saveRestingLog(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingLog> logs, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logs, "logs");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return this.googleFitDataWriter.saveRestingLog(logs, context);
    }

    public final io.reactivex.Completable saveSleepingLog(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog> logs, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logs, "logs");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter.saveSleepingLog$default(this.googleFitDataWriter, logs, context, false, 4, null);
    }
}
