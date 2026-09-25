package powerwatch.matrix.com.pwgen2android.sdk;

/* JADX INFO: compiled from: RealtimeDataParser.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\f\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\f\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e¨\u0006\u001f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable;", "", "value", "", "(B)V", "getValue", "()B", "BatteryPercentage", "TotalCalories", "TotalCurrentCaloriesActive", "TotalCurrentCaloriesBRM", "TotalCurrentStepsRun", "TotalCurrentStepsWalk", "TotalDistance", "TotalSkinTemp", "TotalSleep", "TotalSolarPower", "TotalSteps", "TotalThermalPower", "Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalSteps;", "Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalCurrentStepsWalk;", "Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalCurrentStepsRun;", "Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalCalories;", "Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalCurrentCaloriesBRM;", "Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalCurrentCaloriesActive;", "Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalSleep;", "Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalDistance;", "Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalSolarPower;", "Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalThermalPower;", "Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalSkinTemp;", "Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$BatteryPercentage;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class HSMTable {
    private final byte value;

    public /* synthetic */ HSMTable(byte b, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(b);
    }

    /* JADX INFO: compiled from: RealtimeDataParser.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalSteps;", "Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class TotalSteps extends powerwatch.matrix.com.pwgen2android.sdk.HSMTable {
        public static final powerwatch.matrix.com.pwgen2android.sdk.HSMTable.TotalSteps INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.HSMTable.TotalSteps();

        private TotalSteps() {
            super((byte) 0, null);
        }
    }

    private HSMTable(byte b) {
        this.value = b;
    }

    public final byte getValue() {
        return this.value;
    }

    /* JADX INFO: compiled from: RealtimeDataParser.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalCurrentStepsWalk;", "Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class TotalCurrentStepsWalk extends powerwatch.matrix.com.pwgen2android.sdk.HSMTable {
        public static final powerwatch.matrix.com.pwgen2android.sdk.HSMTable.TotalCurrentStepsWalk INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.HSMTable.TotalCurrentStepsWalk();

        private TotalCurrentStepsWalk() {
            super((byte) 1, null);
        }
    }

    /* JADX INFO: compiled from: RealtimeDataParser.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalCurrentStepsRun;", "Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class TotalCurrentStepsRun extends powerwatch.matrix.com.pwgen2android.sdk.HSMTable {
        public static final powerwatch.matrix.com.pwgen2android.sdk.HSMTable.TotalCurrentStepsRun INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.HSMTable.TotalCurrentStepsRun();

        private TotalCurrentStepsRun() {
            super((byte) 2, null);
        }
    }

    /* JADX INFO: compiled from: RealtimeDataParser.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalCalories;", "Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class TotalCalories extends powerwatch.matrix.com.pwgen2android.sdk.HSMTable {
        public static final powerwatch.matrix.com.pwgen2android.sdk.HSMTable.TotalCalories INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.HSMTable.TotalCalories();

        private TotalCalories() {
            super((byte) 16, null);
        }
    }

    /* JADX INFO: compiled from: RealtimeDataParser.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalCurrentCaloriesBRM;", "Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class TotalCurrentCaloriesBRM extends powerwatch.matrix.com.pwgen2android.sdk.HSMTable {
        public static final powerwatch.matrix.com.pwgen2android.sdk.HSMTable.TotalCurrentCaloriesBRM INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.HSMTable.TotalCurrentCaloriesBRM();

        private TotalCurrentCaloriesBRM() {
            super((byte) 17, null);
        }
    }

    /* JADX INFO: compiled from: RealtimeDataParser.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalCurrentCaloriesActive;", "Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class TotalCurrentCaloriesActive extends powerwatch.matrix.com.pwgen2android.sdk.HSMTable {
        public static final powerwatch.matrix.com.pwgen2android.sdk.HSMTable.TotalCurrentCaloriesActive INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.HSMTable.TotalCurrentCaloriesActive();

        private TotalCurrentCaloriesActive() {
            super((byte) 18, null);
        }
    }

    /* JADX INFO: compiled from: RealtimeDataParser.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalSleep;", "Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class TotalSleep extends powerwatch.matrix.com.pwgen2android.sdk.HSMTable {
        public static final powerwatch.matrix.com.pwgen2android.sdk.HSMTable.TotalSleep INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.HSMTable.TotalSleep();

        private TotalSleep() {
            super((byte) 32, null);
        }
    }

    /* JADX INFO: compiled from: RealtimeDataParser.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalDistance;", "Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class TotalDistance extends powerwatch.matrix.com.pwgen2android.sdk.HSMTable {
        public static final powerwatch.matrix.com.pwgen2android.sdk.HSMTable.TotalDistance INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.HSMTable.TotalDistance();

        private TotalDistance() {
            super((byte) 48, null);
        }
    }

    /* JADX INFO: compiled from: RealtimeDataParser.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalSolarPower;", "Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class TotalSolarPower extends powerwatch.matrix.com.pwgen2android.sdk.HSMTable {
        public static final powerwatch.matrix.com.pwgen2android.sdk.HSMTable.TotalSolarPower INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.HSMTable.TotalSolarPower();

        private TotalSolarPower() {
            super((byte) 64, null);
        }
    }

    /* JADX INFO: compiled from: RealtimeDataParser.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalThermalPower;", "Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class TotalThermalPower extends powerwatch.matrix.com.pwgen2android.sdk.HSMTable {
        public static final powerwatch.matrix.com.pwgen2android.sdk.HSMTable.TotalThermalPower INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.HSMTable.TotalThermalPower();

        private TotalThermalPower() {
            super((byte) 65, null);
        }
    }

    /* JADX INFO: compiled from: RealtimeDataParser.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalSkinTemp;", "Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class TotalSkinTemp extends powerwatch.matrix.com.pwgen2android.sdk.HSMTable {
        public static final powerwatch.matrix.com.pwgen2android.sdk.HSMTable.TotalSkinTemp INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.HSMTable.TotalSkinTemp();

        private TotalSkinTemp() {
            super((byte) 80, null);
        }
    }

    /* JADX INFO: compiled from: RealtimeDataParser.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$BatteryPercentage;", "Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class BatteryPercentage extends powerwatch.matrix.com.pwgen2android.sdk.HSMTable {
        public static final powerwatch.matrix.com.pwgen2android.sdk.HSMTable.BatteryPercentage INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.HSMTable.BatteryPercentage();

        private BatteryPercentage() {
            super((byte) 66, null);
        }
    }
}
