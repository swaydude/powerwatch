package powerwatch.matrix.com.pwgen2android.sdk;

/* JADX INFO: compiled from: DeviceCommunicationQueuer.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType;", "", "()V", "Blocker", "Delayer", "Discard", "Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType$Blocker;", "Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType$Delayer;", "Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType$Discard;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class OperationType {
    public /* synthetic */ OperationType(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: compiled from: DeviceCommunicationQueuer.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType$Blocker;", "Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Blocker extends powerwatch.matrix.com.pwgen2android.sdk.OperationType {
        public static final powerwatch.matrix.com.pwgen2android.sdk.OperationType.Blocker INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.OperationType.Blocker();

        private Blocker() {
            super(null);
        }
    }

    private OperationType() {
    }

    /* JADX INFO: compiled from: DeviceCommunicationQueuer.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType$Delayer;", "Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Delayer extends powerwatch.matrix.com.pwgen2android.sdk.OperationType {
        public static final powerwatch.matrix.com.pwgen2android.sdk.OperationType.Delayer INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.OperationType.Delayer();

        private Delayer() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: DeviceCommunicationQueuer.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType$Discard;", "Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Discard extends powerwatch.matrix.com.pwgen2android.sdk.OperationType {
        public static final powerwatch.matrix.com.pwgen2android.sdk.OperationType.Discard INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.OperationType.Discard();

        private Discard() {
            super(null);
        }
    }
}
