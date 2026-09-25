package powerwatch.matrix.com.pwgen2android.main;

/* JADX INFO: compiled from: OtaProcessExecutorImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/OtaUIPhaseStatus;", "", "()V", "FINISHED", "IN_PROGRESS", "NOT_STARTED", "Lpowerwatch/matrix/com/pwgen2android/main/OtaUIPhaseStatus$NOT_STARTED;", "Lpowerwatch/matrix/com/pwgen2android/main/OtaUIPhaseStatus$IN_PROGRESS;", "Lpowerwatch/matrix/com/pwgen2android/main/OtaUIPhaseStatus$FINISHED;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class OtaUIPhaseStatus {
    public /* synthetic */ OtaUIPhaseStatus(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: compiled from: OtaProcessExecutorImpl.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/OtaUIPhaseStatus$NOT_STARTED;", "Lpowerwatch/matrix/com/pwgen2android/main/OtaUIPhaseStatus;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class NOT_STARTED extends powerwatch.matrix.com.pwgen2android.main.OtaUIPhaseStatus {
        public static final powerwatch.matrix.com.pwgen2android.main.OtaUIPhaseStatus.NOT_STARTED INSTANCE = new powerwatch.matrix.com.pwgen2android.main.OtaUIPhaseStatus.NOT_STARTED();

        private NOT_STARTED() {
            super(null);
        }
    }

    private OtaUIPhaseStatus() {
    }

    /* JADX INFO: compiled from: OtaProcessExecutorImpl.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/OtaUIPhaseStatus$IN_PROGRESS;", "Lpowerwatch/matrix/com/pwgen2android/main/OtaUIPhaseStatus;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class IN_PROGRESS extends powerwatch.matrix.com.pwgen2android.main.OtaUIPhaseStatus {
        public static final powerwatch.matrix.com.pwgen2android.main.OtaUIPhaseStatus.IN_PROGRESS INSTANCE = new powerwatch.matrix.com.pwgen2android.main.OtaUIPhaseStatus.IN_PROGRESS();

        private IN_PROGRESS() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: OtaProcessExecutorImpl.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/OtaUIPhaseStatus$FINISHED;", "Lpowerwatch/matrix/com/pwgen2android/main/OtaUIPhaseStatus;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class FINISHED extends powerwatch.matrix.com.pwgen2android.main.OtaUIPhaseStatus {
        public static final powerwatch.matrix.com.pwgen2android.main.OtaUIPhaseStatus.FINISHED INSTANCE = new powerwatch.matrix.com.pwgen2android.main.OtaUIPhaseStatus.FINISHED();

        private FINISHED() {
            super(null);
        }
    }
}
