package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: Gen2Comands.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\f\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\f\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e¨\u0006\u001f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;", "", "type", "", "(I)V", "getType", "()I", "ACTIVITY_HIIT", "ACTIVITY_INDOOR_BIKING", "ACTIVITY_INDOOR_JOGGING", "ACTIVITY_INDOOR_RUNNING", "ACTIVITY_INDOOR_WALKING", "BIKING", "DRIVING", "JOGGING", "RUNNING", "STATIONARY", "UNKNOWN", "WALKING", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$STATIONARY;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$WALKING;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$RUNNING;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$JOGGING;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$BIKING;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$DRIVING;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_WALKING;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_RUNNING;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_JOGGING;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_BIKING;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_HIIT;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$UNKNOWN;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class ActivityType {
    private final int type;

    public /* synthetic */ ActivityType(int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    /* JADX INFO: compiled from: Gen2Comands.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$STATIONARY;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class STATIONARY extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.STATIONARY INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.STATIONARY();

        private STATIONARY() {
            super(0, null);
        }
    }

    private ActivityType(int i) {
        this.type = i;
    }

    public final int getType() {
        return this.type;
    }

    /* JADX INFO: compiled from: Gen2Comands.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$WALKING;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class WALKING extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.WALKING INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.WALKING();

        private WALKING() {
            super(1, null);
        }
    }

    /* JADX INFO: compiled from: Gen2Comands.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$RUNNING;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class RUNNING extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.RUNNING INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.RUNNING();

        private RUNNING() {
            super(2, null);
        }
    }

    /* JADX INFO: compiled from: Gen2Comands.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$JOGGING;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class JOGGING extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.JOGGING INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.JOGGING();

        private JOGGING() {
            super(3, null);
        }
    }

    /* JADX INFO: compiled from: Gen2Comands.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$BIKING;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class BIKING extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.BIKING INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.BIKING();

        private BIKING() {
            super(4, null);
        }
    }

    /* JADX INFO: compiled from: Gen2Comands.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$DRIVING;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class DRIVING extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.DRIVING INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.DRIVING();

        private DRIVING() {
            super(5, null);
        }
    }

    /* JADX INFO: compiled from: Gen2Comands.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_WALKING;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class ACTIVITY_INDOOR_WALKING extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.ACTIVITY_INDOOR_WALKING INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.ACTIVITY_INDOOR_WALKING();

        private ACTIVITY_INDOOR_WALKING() {
            super(6, null);
        }
    }

    /* JADX INFO: compiled from: Gen2Comands.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_RUNNING;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class ACTIVITY_INDOOR_RUNNING extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.ACTIVITY_INDOOR_RUNNING INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.ACTIVITY_INDOOR_RUNNING();

        private ACTIVITY_INDOOR_RUNNING() {
            super(7, null);
        }
    }

    /* JADX INFO: compiled from: Gen2Comands.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_JOGGING;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class ACTIVITY_INDOOR_JOGGING extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.ACTIVITY_INDOOR_JOGGING INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.ACTIVITY_INDOOR_JOGGING();

        private ACTIVITY_INDOOR_JOGGING() {
            super(8, null);
        }
    }

    /* JADX INFO: compiled from: Gen2Comands.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_BIKING;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class ACTIVITY_INDOOR_BIKING extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.ACTIVITY_INDOOR_BIKING INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.ACTIVITY_INDOOR_BIKING();

        private ACTIVITY_INDOOR_BIKING() {
            super(9, null);
        }
    }

    /* JADX INFO: compiled from: Gen2Comands.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_HIIT;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class ACTIVITY_HIIT extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.ACTIVITY_HIIT INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.ACTIVITY_HIIT();

        private ACTIVITY_HIIT() {
            super(10, null);
        }
    }

    /* JADX INFO: compiled from: Gen2Comands.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$UNKNOWN;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class UNKNOWN extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.UNKNOWN INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.UNKNOWN();

        private UNKNOWN() {
            super(255, null);
        }
    }
}
