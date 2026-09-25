package powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2;

/* JADX INFO: compiled from: AlertsExecutor.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/AlertsVer2Executor;", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/AlertsExecutor;", "communicator", "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;", "(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;)V", "sendAlert", "Lio/reactivex/Completable;", "deviceId", "", "gen2AlertsData", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;", "power", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class AlertsVer2Executor extends powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.AlertsExecutor {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertsVer2Executor(powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator) {
        super(communicator);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(communicator, "communicator");
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.AlertsExecutor
    public io.reactivex.Completable sendAlert(final java.lang.String deviceId, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsData gen2AlertsData, final float power) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gen2AlertsData, "gen2AlertsData");
        io.reactivex.Completable completableIgnoreElements = io.reactivex.Observable.just(new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo(false, false, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchDataInfo(null, null, null, null, 0, null, 63, null), 0.0f, null, null, null, 0L, gen2AlertsData, 251, null)).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.-$$Lambda$AlertsVer2Executor$Puy5EJJzCUqg8eKgf7nccRkdm9M
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.AlertsVer2Executor.m3606sendAlert$lambda0(this.f$0, deviceId, power, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo) obj);
            }
        }).ignoreElements();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableIgnoreElements, "just(DataInfo(data = WatchDataInfo(), alertsData = gen2AlertsData))\n                .flatMap { sendSingleCommandWithAck(Gen2FullAlertsTypeCommand(it.alertsData), deviceId, Gen2DataInfo(dataInfo = it), power = 1F * power, logTag = \"notif_tracker\") }\n                .ignoreElements()");
        return completableIgnoreElements;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendAlert$lambda-0, reason: not valid java name */
    public static final io.reactivex.ObservableSource m3606sendAlert$lambda0(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.AlertsVer2Executor this$0, java.lang.String deviceId, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "$deviceId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2FullAlertsTypeCommand(it.getAlertsData()), deviceId, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo(null, null, null, it, null, null, 55, null), null, f * 1.0f, 0L, "notif_tracker", 40, null);
    }
}
