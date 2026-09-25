package powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts;

/* JADX INFO: compiled from: AlertsConfiguration.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006H\u0002J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlertsConfiguration;", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsConfiguration;", "communicator", "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;", "(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;)V", "convert", "", "set", "", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Alerts;", "createNotificationToSend", "", "value", "initAlerts", "Lio/reactivex/Completable;", "deviceId", "", "alertsConfig", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsConfig;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Gen1AlertsConfiguration implements powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConfiguration {
    private final powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator;

    public Gen1AlertsConfiguration(powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(communicator, "communicator");
        this.communicator = communicator;
    }

    private final int convert(java.util.Set<powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.Alerts> set) {
        java.util.Set<powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.Alerts> set2 = set;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(set2, 10));
        java.util.Iterator<T> it = set2.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.Alerts) it.next()).getValue()));
        }
        int iIntValue = 0;
        java.util.Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            iIntValue |= ((java.lang.Number) it2.next()).intValue();
        }
        return iIntValue;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConfiguration
    public io.reactivex.Completable initAlerts(java.lang.String deviceId, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConfig alertsConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alertsConfig, "alertsConfig");
        return this.communicator.sendMessage(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsLiteCommunicatorKt.createMessage(deviceId, createNotificationToSend(convert(alertsConfig.getMutableSet()))));
    }

    private final byte[] createNotificationToSend(int value) {
        byte[] bArr = new byte[20];
        int i = 0;
        while (true) {
            int i2 = i + 1;
            bArr[i] = 0;
            if (i2 > 19) {
                bArr[0] = -1;
                bArr[1] = 2;
                bArr[2] = 1;
                bArr[3] = 1;
                bArr[4] = 10;
                bArr[5] = 0;
                bArr[6] = 0;
                bArr[7] = -1;
                bArr[8] = -1;
                bArr[9] = -1;
                bArr[10] = (byte) value;
                return bArr;
            }
            i = i2;
        }
    }
}
