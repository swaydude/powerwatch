package powerwatch.matrix.com.pwgen2android.main;

/* JADX INFO: compiled from: OtaProcessExecutorImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\t\u0003\u0004\u0005\u0006\u0007\b\t\n\u000bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\t\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;", "", "()V", "COMPLETE", "CONNECTING", "DOWNLOAD_FINISHED", "DOWNLOAD_STARTED", "ERROR", "FILE_TRANSFER", "INITIAL", "STOPPED", "SYNC", "Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$INITIAL;", "Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$CONNECTING;", "Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$DOWNLOAD_STARTED;", "Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$DOWNLOAD_FINISHED;", "Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$SYNC;", "Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$FILE_TRANSFER;", "Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$ERROR;", "Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$COMPLETE;", "Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$STOPPED;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class OtaProcessPhase {
    public /* synthetic */ OtaProcessPhase(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: compiled from: OtaProcessExecutorImpl.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$INITIAL;", "Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class INITIAL extends powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase {
        public static final powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.INITIAL INSTANCE = new powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.INITIAL();

        private INITIAL() {
            super(null);
        }
    }

    private OtaProcessPhase() {
    }

    /* JADX INFO: compiled from: OtaProcessExecutorImpl.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$CONNECTING;", "Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class CONNECTING extends powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase {
        public static final powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.CONNECTING INSTANCE = new powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.CONNECTING();

        private CONNECTING() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: OtaProcessExecutorImpl.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$DOWNLOAD_STARTED;", "Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class DOWNLOAD_STARTED extends powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase {
        public static final powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.DOWNLOAD_STARTED INSTANCE = new powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.DOWNLOAD_STARTED();

        private DOWNLOAD_STARTED() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: OtaProcessExecutorImpl.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$DOWNLOAD_FINISHED;", "Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class DOWNLOAD_FINISHED extends powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase {
        public static final powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.DOWNLOAD_FINISHED INSTANCE = new powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.DOWNLOAD_FINISHED();

        private DOWNLOAD_FINISHED() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: OtaProcessExecutorImpl.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$SYNC;", "Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class SYNC extends powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase {
        public static final powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.SYNC INSTANCE = new powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.SYNC();

        private SYNC() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: OtaProcessExecutorImpl.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$FILE_TRANSFER;", "Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class FILE_TRANSFER extends powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase {
        public static final powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.FILE_TRANSFER INSTANCE = new powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.FILE_TRANSFER();

        private FILE_TRANSFER() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: OtaProcessExecutorImpl.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$ERROR;", "Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class ERROR extends powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase {
        public static final powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.ERROR INSTANCE = new powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.ERROR();

        private ERROR() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: OtaProcessExecutorImpl.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$COMPLETE;", "Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class COMPLETE extends powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase {
        public static final powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.COMPLETE INSTANCE = new powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.COMPLETE();

        private COMPLETE() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: OtaProcessExecutorImpl.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$STOPPED;", "Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class STOPPED extends powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase {
        public static final powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.STOPPED INSTANCE = new powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.STOPPED();

        private STOPPED() {
            super(null);
        }
    }
}
