package powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2;

/* JADX INFO: compiled from: AlertsExecutor.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/AlertsExecutor;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;", "communicator", "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;", "(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;)V", "sendAlert", "Lio/reactivex/Completable;", "deviceId", "", "gen2AlertsData", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;", "power", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public class AlertsExecutor extends powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertsExecutor(powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator) {
        super(communicator);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(communicator, "communicator");
    }

    public static /* synthetic */ io.reactivex.Completable sendAlert$default(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.AlertsExecutor alertsExecutor, java.lang.String str, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsData gen2AlertsData, float f, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendAlert");
        }
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        return alertsExecutor.sendAlert(str, gen2AlertsData, f);
    }

    public io.reactivex.Completable sendAlert(final java.lang.String deviceId, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsData gen2AlertsData, final float power) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gen2AlertsData, "gen2AlertsData");
        io.reactivex.Completable completableIgnoreElements = io.reactivex.Observable.just(new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo(false, false, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchDataInfo(null, null, null, null, 0, null, 63, null), 0.0f, null, null, null, 0L, gen2AlertsData, 251, null)).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.-$$Lambda$AlertsExecutor$af_F4Xm48SXFUt2hciuSKhQq4T4
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.AlertsExecutor.m3601sendAlert$lambda0(this.f$0, deviceId, power, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.-$$Lambda$AlertsExecutor$EDsm05OCC_SiWa9bJ7k4tubcF-Q
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.AlertsExecutor.m3602sendAlert$lambda1(this.f$0, deviceId, power, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.-$$Lambda$AlertsExecutor$o8xaP6-A1KuSx5bHBtAvrWkIIIg
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.AlertsExecutor.m3603sendAlert$lambda2(this.f$0, deviceId, power, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.-$$Lambda$AlertsExecutor$992pK_r6f0bd_PPiy1yE8DQTnh0
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.AlertsExecutor.m3604sendAlert$lambda3(this.f$0, deviceId, power, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.-$$Lambda$AlertsExecutor$keYYaybTMhbczNN7sp6LtCPbMVE
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.AlertsExecutor.m3605sendAlert$lambda4(this.f$0, deviceId, power, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).ignoreElements();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableIgnoreElements, "just(DataInfo(data = WatchDataInfo(), alertsData = gen2AlertsData))\n                .flatMap { sendSingleCommandWithAck(Gen2AlertsTypeCommand(it.alertsData), deviceId, Gen2DataInfo(dataInfo = it), power = 0.2F * power, logTag = \"notif_tracker\") }\n                .flatMap {\n                    sendSingleCommandWithAck(Gen2AlertsDateCommand(it.dataInfo.alertsData.postTime, it.dataInfo.alertsData.notificationTime), deviceId,\n                            Gen2DataInfo(dataInfo = it.dataInfo), power = 0.2F * power, logTag = \"notif_tracker\")\n                }\n                .flatMap { sendSingleCommandWithAck(Gen2AlertsTitleCommand(it.dataInfo.alertsData.title), deviceId, Gen2DataInfo(dataInfo = it.dataInfo), power = 0.2F * power, logTag = \"notif_tracker\") }\n                .flatMap { sendSingleCommandWithAck(Gen2AlertsSubtitleCommand(it.dataInfo.alertsData.subTitle), deviceId, Gen2DataInfo(dataInfo = it.dataInfo), power = 0.2F * power, logTag = \"notif_tracker\") }\n                .flatMap { sendSingleCommandWithAck(Gen2AlertsMessageCommand(it.dataInfo.alertsData.message), deviceId, Gen2DataInfo(dataInfo = it.dataInfo), power = 0.2F * power, logTag = \"notif_tracker\") }\n                .ignoreElements()");
        return completableIgnoreElements;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendAlert$lambda-0, reason: not valid java name */
    public static final io.reactivex.ObservableSource m3601sendAlert$lambda0(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.AlertsExecutor this$0, java.lang.String deviceId, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "$deviceId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsTypeCommand(it.getAlertsData()), deviceId, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo(null, null, null, it, null, null, 55, null), null, f * 0.2f, 0L, "notif_tracker", 40, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendAlert$lambda-1, reason: not valid java name */
    public static final io.reactivex.ObservableSource m3602sendAlert$lambda1(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.AlertsExecutor this$0, java.lang.String deviceId, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "$deviceId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsDateCommand(it.getDataInfo().getAlertsData().getPostTime(), it.getDataInfo().getAlertsData().getNotificationTime()), deviceId, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo(null, null, null, it.getDataInfo(), null, null, 55, null), null, f * 0.2f, 0L, "notif_tracker", 40, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendAlert$lambda-2, reason: not valid java name */
    public static final io.reactivex.ObservableSource m3603sendAlert$lambda2(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.AlertsExecutor this$0, java.lang.String deviceId, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "$deviceId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsTitleCommand(it.getDataInfo().getAlertsData().getTitle()), deviceId, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo(null, null, null, it.getDataInfo(), null, null, 55, null), null, f * 0.2f, 0L, "notif_tracker", 40, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendAlert$lambda-3, reason: not valid java name */
    public static final io.reactivex.ObservableSource m3604sendAlert$lambda3(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.AlertsExecutor this$0, java.lang.String deviceId, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "$deviceId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsSubtitleCommand(it.getDataInfo().getAlertsData().getSubTitle()), deviceId, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo(null, null, null, it.getDataInfo(), null, null, 55, null), null, f * 0.2f, 0L, "notif_tracker", 40, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendAlert$lambda-4, reason: not valid java name */
    public static final io.reactivex.ObservableSource m3605sendAlert$lambda4(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.AlertsExecutor this$0, java.lang.String deviceId, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "$deviceId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsMessageCommand(it.getDataInfo().getAlertsData().getMessage()), deviceId, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo(null, null, null, it.getDataInfo(), null, null, 55, null), null, f * 0.2f, 0L, "notif_tracker", 40, null);
    }
}
