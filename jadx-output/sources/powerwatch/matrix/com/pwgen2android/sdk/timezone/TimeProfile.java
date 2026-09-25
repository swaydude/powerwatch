package powerwatch.matrix.com.pwgen2android.sdk.timezone;

/* JADX INFO: compiled from: TimeProfile.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010#\u001a\u00020$J\u0010\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u001dH\u0002J\u0010\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u001dH\u0002J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0004J\u000e\u0010.\u001a\u00020*2\u0006\u0010+\u001a\u00020,R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001dX\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u001f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010\fR\u0011\u0010!\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\f¨\u0006/"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeProfile;", "", "()V", "ADJUST_DST", "", "ADJUST_EXTERNAL", "ADJUST_MANUAL", "ADJUST_NONE", "ADJUST_TIMEZONE", "CLIENT_CONFIG", "Ljava/util/UUID;", "getCLIENT_CONFIG", "()Ljava/util/UUID;", "CURRENT_TIME", "getCURRENT_TIME", "DAY_FRIDAY", "DAY_MONDAY", "DAY_SATURDAY", "DAY_SUNDAY", "DAY_THURSDAY", "DAY_TUESDAY", "DAY_UNKNOWN", "DAY_WEDNESDAY", "DST_DOUBLE", "DST_HALF", "DST_SINGLE", "DST_STANDARD", "DST_UNKNOWN", "FIFTEEN_MINUTE_MILLIS", "", "HALF_HOUR_MILLIS", "LOCAL_TIME_INFO", "getLOCAL_TIME_INFO", "TIME_SERVICE", "getTIME_SERVICE", "createTimeService", "Landroid/bluetooth/BluetoothGattService;", "getDayOfWeekCode", "dayOfWeek", "getDstOffsetCode", "rawOffset", "getExactTime", "", "timestamp", "", "adjustReason", "getLocalTimeInfo", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class TimeProfile {
    public static final byte ADJUST_DST = 8;
    public static final byte ADJUST_EXTERNAL = 2;
    public static final byte ADJUST_MANUAL = 1;
    public static final byte ADJUST_NONE = 0;
    public static final byte ADJUST_TIMEZONE = 4;
    private static final java.util.UUID CLIENT_CONFIG;
    private static final java.util.UUID CURRENT_TIME;
    private static final byte DAY_FRIDAY = 5;
    private static final byte DAY_MONDAY = 1;
    private static final byte DAY_SATURDAY = 6;
    private static final byte DAY_SUNDAY = 7;
    private static final byte DAY_THURSDAY = 4;
    private static final byte DAY_TUESDAY = 2;
    private static final byte DAY_UNKNOWN = 0;
    private static final byte DAY_WEDNESDAY = 3;
    private static final byte DST_DOUBLE = 8;
    private static final byte DST_HALF = 2;
    private static final byte DST_SINGLE = 4;
    private static final byte DST_STANDARD = 0;
    private static final byte DST_UNKNOWN = -1;
    private static final int FIFTEEN_MINUTE_MILLIS = 900000;
    private static final int HALF_HOUR_MILLIS = 1800000;
    public static final powerwatch.matrix.com.pwgen2android.sdk.timezone.TimeProfile INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.timezone.TimeProfile();
    private static final java.util.UUID LOCAL_TIME_INFO;
    private static final java.util.UUID TIME_SERVICE;

    private final byte getDayOfWeekCode(int dayOfWeek) {
        switch (dayOfWeek) {
            case 1:
                return DAY_SUNDAY;
            case 2:
                return (byte) 1;
            case 3:
                return (byte) 2;
            case 4:
                return DAY_WEDNESDAY;
            case 5:
                return (byte) 4;
            case 6:
                return DAY_FRIDAY;
            case 7:
                return DAY_SATURDAY;
            default:
                return (byte) 0;
        }
    }

    private final byte getDstOffsetCode(int rawOffset) {
        if (rawOffset == 0) {
            return (byte) 0;
        }
        if (rawOffset == 1) {
            return (byte) 2;
        }
        if (rawOffset != 2) {
            return rawOffset != 4 ? (byte) -1 : (byte) 8;
        }
        return (byte) 4;
    }

    private TimeProfile() {
    }

    static {
        java.util.UUID uuidFromString = java.util.UUID.fromString("00001805-0000-1000-8000-00805f9b34fb");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(\"00001805-0000-1000-8000-00805f9b34fb\")");
        TIME_SERVICE = uuidFromString;
        java.util.UUID uuidFromString2 = java.util.UUID.fromString("00002a2b-0000-1000-8000-00805f9b34fb");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuidFromString2, "fromString(\"00002a2b-0000-1000-8000-00805f9b34fb\")");
        CURRENT_TIME = uuidFromString2;
        java.util.UUID uuidFromString3 = java.util.UUID.fromString("00002a0f-0000-1000-8000-00805f9b34fb");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuidFromString3, "fromString(\"00002a0f-0000-1000-8000-00805f9b34fb\")");
        LOCAL_TIME_INFO = uuidFromString3;
        java.util.UUID uuidFromString4 = java.util.UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuidFromString4, "fromString(\"00002902-0000-1000-8000-00805f9b34fb\")");
        CLIENT_CONFIG = uuidFromString4;
    }

    public final java.util.UUID getTIME_SERVICE() {
        return TIME_SERVICE;
    }

    public final java.util.UUID getCURRENT_TIME() {
        return CURRENT_TIME;
    }

    public final java.util.UUID getLOCAL_TIME_INFO() {
        return LOCAL_TIME_INFO;
    }

    public final java.util.UUID getCLIENT_CONFIG() {
        return CLIENT_CONFIG;
    }

    public final android.bluetooth.BluetoothGattService createTimeService() {
        android.bluetooth.BluetoothGattService bluetoothGattService = new android.bluetooth.BluetoothGattService(TIME_SERVICE, 0);
        android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic = new android.bluetooth.BluetoothGattCharacteristic(CURRENT_TIME, 18, 1);
        bluetoothGattCharacteristic.addDescriptor(new android.bluetooth.BluetoothGattDescriptor(CLIENT_CONFIG, 17));
        android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic2 = new android.bluetooth.BluetoothGattCharacteristic(LOCAL_TIME_INFO, 2, 1);
        bluetoothGattService.addCharacteristic(bluetoothGattCharacteristic);
        bluetoothGattService.addCharacteristic(bluetoothGattCharacteristic2);
        return bluetoothGattService;
    }

    public final byte[] getExactTime(long timestamp, byte adjustReason) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTimeInMillis(timestamp);
        int i = calendar.get(1);
        return new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) (calendar.get(2) + 1), (byte) calendar.get(5), (byte) calendar.get(11), (byte) calendar.get(12), (byte) calendar.get(13), getDayOfWeekCode(calendar.get(7)), (byte) (calendar.get(14) / 256), adjustReason};
    }

    public final byte[] getLocalTimeInfo(long timestamp) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTimeInMillis(timestamp);
        return new byte[]{(byte) (calendar.get(15) / FIFTEEN_MINUTE_MILLIS), getDstOffsetCode(calendar.get(16) / HALF_HOUR_MILLIS)};
    }
}
