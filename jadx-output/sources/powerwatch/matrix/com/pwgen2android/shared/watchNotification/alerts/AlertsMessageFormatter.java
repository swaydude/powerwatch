package powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts;

/* JADX INFO: compiled from: AlertsMessageFormatter.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0002J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eJ\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eJ\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eJ\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eJ,\u0010\u0013\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsMessageFormatter;", "", "()V", "mStateController", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/StateController;", "clearCallIcon", "Ljava/util/ArrayList;", "", "clearIcon", "type", "", "clearMessageIcon", "createIncomingCall", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_TITLE_KEY, "", "body", "createMessagePayload", "createMissedCall", "createMissedMessagePayload", "prepareMessage", "categoryType", "eventFlag", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class AlertsMessageFormatter {
    private final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.StateController mStateController = new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.StateController();

    public final java.util.ArrayList<byte[]> createIncomingCall(java.lang.String title, java.lang.String body) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        return this.mStateController.process(prepareMessage(title, body, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ANCSConstants.CategoryID.CATEGORY_ID_INCOMING_CALL.ordinal(), powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ANCSConstants.EventFlag.EVENT_FLAG_IMPORTANT.getValue()));
    }

    public final java.util.ArrayList<byte[]> createMissedCall(java.lang.String title, java.lang.String body) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        return this.mStateController.process(prepareMessage(title, body, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ANCSConstants.CategoryID.CATEGORY_ID_MISSED_CALL.ordinal(), powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ANCSConstants.EventFlag.EVENT_FLAG_SILENT.getValue()));
    }

    public final java.util.ArrayList<byte[]> createMessagePayload(java.lang.String title, java.lang.String body) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        return this.mStateController.process(prepareMessage(title, body, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ANCSConstants.CategoryID.CATEGORY_ID_OTHER.ordinal(), powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ANCSConstants.EventFlag.EVENT_FLAG_IMPORTANT.getValue()));
    }

    public final java.util.ArrayList<byte[]> createMissedMessagePayload(java.lang.String title, java.lang.String body) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        return this.mStateController.process(prepareMessage(title, body, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ANCSConstants.CategoryID.CATEGORY_ID_OTHER.ordinal(), powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ANCSConstants.EventFlag.EVENT_FLAG_SILENT.getValue()));
    }

    public final java.util.ArrayList<byte[]> clearCallIcon() {
        return this.mStateController.process(clearIcon(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ANCSConstants.CategoryID.CATEGORY_ID_INCOMING_CALL.ordinal()));
    }

    public final java.util.ArrayList<byte[]> clearMessageIcon() {
        return this.mStateController.process(clearIcon(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ANCSConstants.CategoryID.CATEGORY_ID_OTHER.ordinal()));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0018  */
    /* JADX WARN: Code duplicated, block: B:20:0x002f  */
    private final byte[] prepareMessage(java.lang.String title, java.lang.String body, int categoryType, int eventFlag) {
        int length;
        int length2;
        int i = 0;
        if (title == null) {
            length = 0;
        } else {
            if (title.length() == 0) {
                length = 0;
            } else {
                length = title.length();
            }
        }
        if (body == null) {
            length2 = 0;
        } else {
            if (body.length() == 0) {
                length2 = 0;
            } else {
                length2 = body.length();
            }
        }
        int i2 = length + length2;
        byte[] bArr = new byte[i2 + 15];
        bArr[0] = 17;
        bArr[1] = (byte) ((i2 >> 8) & 255);
        bArr[2] = (byte) (i2 & 255);
        bArr[3] = 1;
        bArr[4] = (byte) categoryType;
        bArr[5] = (byte) powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ANCSConstants.EventID.EVENT_ID_NOTIFICATION_ADDED.ordinal();
        bArr[6] = (byte) eventFlag;
        bArr[7] = 1;
        bArr[8] = -1;
        bArr[9] = -1;
        bArr[10] = -1;
        if (length > 0) {
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                kotlin.jvm.internal.Intrinsics.checkNotNull(title);
                bArr[i3 + 11] = (byte) title.charAt(i3);
                if (i4 >= length) {
                    break;
                }
                i3 = i4;
            }
        }
        bArr[length + 11] = 3;
        if (length2 > 0) {
            while (true) {
                int i5 = i + 1;
                kotlin.jvm.internal.Intrinsics.checkNotNull(body);
                bArr[length + 12] = (byte) body.charAt(i);
                if (i5 >= length2) {
                    break;
                }
                i = i5;
            }
        }
        bArr[i2 + 12] = 3;
        bArr[i2 + 13] = -85;
        bArr[i2 + 14] = -51;
        return bArr;
    }

    private final byte[] clearIcon(int type) {
        return new byte[]{17, 0, 14, 1, (byte) type, (byte) powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ANCSConstants.EventID.EVENT_ID_NOTIFICATION_REMOVED.ordinal(), (byte) powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ANCSConstants.EventFlag.EVENT_FLAG_SILENT.getValue(), 0, -1, -1, -1, 32, 3, 32, 3, -85, -51};
    }
}
