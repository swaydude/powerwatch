package powerwatch.matrix.com.pwgen2android.shared.data.metrics;

/* JADX INFO: compiled from: DeviceEvent.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0007\b\t\n\u000b\fB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0006\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;", "", "eventType", "", "(Ljava/lang/String;)V", "getEventType", "()Ljava/lang/String;", "OtaEnd", "OtaStart", "PairEnd", "PairStart", "SyncEnd", "SyncStart", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType$SyncStart;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType$SyncEnd;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType$PairStart;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType$PairEnd;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType$OtaStart;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType$OtaEnd;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class DeviceEventType {
    private final java.lang.String eventType;

    public /* synthetic */ DeviceEventType(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* JADX INFO: compiled from: DeviceEvent.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType$SyncStart;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class SyncStart extends powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventType {
        public static final powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventType.SyncStart INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventType.SyncStart();

        private SyncStart() {
            super("SYNC_START", null);
        }
    }

    private DeviceEventType(java.lang.String str) {
        this.eventType = str;
    }

    public final java.lang.String getEventType() {
        return this.eventType;
    }

    /* JADX INFO: compiled from: DeviceEvent.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType$SyncEnd;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class SyncEnd extends powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventType {
        public static final powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventType.SyncEnd INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventType.SyncEnd();

        private SyncEnd() {
            super("SYNC_END", null);
        }
    }

    /* JADX INFO: compiled from: DeviceEvent.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType$PairStart;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class PairStart extends powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventType {
        public static final powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventType.PairStart INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventType.PairStart();

        private PairStart() {
            super("PAIR_START", null);
        }
    }

    /* JADX INFO: compiled from: DeviceEvent.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType$PairEnd;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class PairEnd extends powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventType {
        public static final powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventType.PairEnd INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventType.PairEnd();

        private PairEnd() {
            super("PAIR_END", null);
        }
    }

    /* JADX INFO: compiled from: DeviceEvent.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType$OtaStart;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class OtaStart extends powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventType {
        public static final powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventType.OtaStart INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventType.OtaStart();

        private OtaStart() {
            super("OTA_START", null);
        }
    }

    /* JADX INFO: compiled from: DeviceEvent.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType$OtaEnd;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class OtaEnd extends powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventType {
        public static final powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventType.OtaEnd INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventType.OtaEnd();

        private OtaEnd() {
            super("OTA_END", null);
        }
    }
}
