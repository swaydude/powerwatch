package powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts;

/* JADX INFO: compiled from: ANCSConstants.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants;", "", "()V", "CategoryID", "EventFlag", "EventID", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ANCSConstants {

    /* JADX INFO: compiled from: ANCSConstants.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$CategoryID;", "", "(Ljava/lang/String;I)V", "CATEGORY_ID_OTHER", "CATEGORY_ID_INCOMING_CALL", "CATEGORY_ID_MISSED_CALL", "CATEGORY_ID_VOICE_MAIL", "CATEGORY_ID_SOCIAL", "CATEGORY_ID_SCHEDULE", "CATEGORY_ID_EMAIL", "CATEGORY_ID_NEWS", "CATEGORY_ID_HEALTH_AND_FITNESS", "CATEGORY_ID_BUSINESS_AND_FINANCE", "CATEGORY_ID_LOCATION", "CATEGORY_ID_ENTERTAINMENT", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum CategoryID {
        CATEGORY_ID_OTHER,
        CATEGORY_ID_INCOMING_CALL,
        CATEGORY_ID_MISSED_CALL,
        CATEGORY_ID_VOICE_MAIL,
        CATEGORY_ID_SOCIAL,
        CATEGORY_ID_SCHEDULE,
        CATEGORY_ID_EMAIL,
        CATEGORY_ID_NEWS,
        CATEGORY_ID_HEALTH_AND_FITNESS,
        CATEGORY_ID_BUSINESS_AND_FINANCE,
        CATEGORY_ID_LOCATION,
        CATEGORY_ID_ENTERTAINMENT;

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ANCSConstants.CategoryID[] valuesCustom() {
            powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ANCSConstants.CategoryID[] categoryIDArrValuesCustom = values();
            return (powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ANCSConstants.CategoryID[]) java.util.Arrays.copyOf(categoryIDArrValuesCustom, categoryIDArrValuesCustom.length);
        }
    }

    /* JADX INFO: compiled from: ANCSConstants.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventID;", "", "(Ljava/lang/String;I)V", "EVENT_ID_NOTIFICATION_ADDED", "EVENT_ID_NOTIFICATION_MODIFIED", "EVENT_ID_NOTIFICATION_REMOVED", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum EventID {
        EVENT_ID_NOTIFICATION_ADDED,
        EVENT_ID_NOTIFICATION_MODIFIED,
        EVENT_ID_NOTIFICATION_REMOVED;

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ANCSConstants.EventID[] valuesCustom() {
            powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ANCSConstants.EventID[] eventIDArrValuesCustom = values();
            return (powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ANCSConstants.EventID[]) java.util.Arrays.copyOf(eventIDArrValuesCustom, eventIDArrValuesCustom.length);
        }
    }

    /* JADX INFO: compiled from: ANCSConstants.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ANCSConstants$EventFlag;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "setValue", "(I)V", "EVENT_FLAG_SILENT", "EVENT_FLAG_IMPORTANT", "EVENT_FLAG_PRE_EXISTING", "EVENT_FLAG_POSITIVE_ACTION", "EVENT_FLAG_NEGATIVE_ACTION", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum EventFlag {
        EVENT_FLAG_SILENT(1),
        EVENT_FLAG_IMPORTANT(2),
        EVENT_FLAG_PRE_EXISTING(4),
        EVENT_FLAG_POSITIVE_ACTION(8),
        EVENT_FLAG_NEGATIVE_ACTION(16);

        private int value;

        EventFlag(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }

        public final void setValue(int i) {
            this.value = i;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ANCSConstants.EventFlag[] valuesCustom() {
            powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ANCSConstants.EventFlag[] eventFlagArrValuesCustom = values();
            return (powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ANCSConstants.EventFlag[]) java.util.Arrays.copyOf(eventFlagArrValuesCustom, eventFlagArrValuesCustom.length);
        }
    }
}
