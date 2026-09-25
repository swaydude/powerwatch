package powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard;

/* JADX INFO: compiled from: DashboardToastMessageViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u0006\u0010(\u001a\u00020)R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0015\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u00170\u00170\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010!\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010#0#0\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageViewModel;", "", "bluetoothManager", "Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;", "deviceRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;", "watchSynchronizer", "Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;", "updateInfoRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepository;", "otaProcessExecutor", "Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutor;", "appContext", "Landroid/content/Context;", "metricsRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;", "(Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepository;Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutor;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;)V", "bluetoothActionText", "", "bluetoothDisabledText", "btPermissionMissing", "currentConfig", "Lio/reactivex/Observable;", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageConfig;", "kotlin.jvm.PlatformType", "getCurrentConfig", "()Lio/reactivex/Observable;", "deviceNotConnectedText", "firmwareUpdateActionText", "fontUpdateFailed", "mandatoryUpdateText", "syncErrorText", "syncNotAllowedDuringActivityText", "syncResetEvent", "Lio/reactivex/subjects/PublishSubject;", "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult;", "syncTimeoutErrorText", "unknownError", "updateErrorText", "watchBusyText", "resetSyncErrorEvent", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class DashboardToastMessageViewModel {
    private final java.lang.String bluetoothActionText;
    private final java.lang.String bluetoothDisabledText;
    private final java.lang.String btPermissionMissing;
    private final io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastMessageConfig> currentConfig;
    private final java.lang.String deviceNotConnectedText;
    private final java.lang.String firmwareUpdateActionText;
    private final java.lang.String fontUpdateFailed;
    private final java.lang.String mandatoryUpdateText;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepository metricsRepository;
    private final java.lang.String syncErrorText;
    private final java.lang.String syncNotAllowedDuringActivityText;
    private final io.reactivex.subjects.PublishSubject<powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult> syncResetEvent;
    private final java.lang.String syncTimeoutErrorText;
    private final java.lang.String unknownError;
    private final java.lang.String updateErrorText;
    private final java.lang.String watchBusyText;

    public DashboardToastMessageViewModel(powerwatch.matrix.com.pwgen2android.shared.host.BluetoothManager bluetoothManager, powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository deviceRepository, powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizer watchSynchronizer, powerwatch.matrix.com.pwgen2android.shared.data.repositories.UpdateInfoRepository updateInfoRepository, powerwatch.matrix.com.pwgen2android.main.OtaProcessExecutor otaProcessExecutor, android.content.Context appContext, powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepository metricsRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bluetoothManager, "bluetoothManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceRepository, "deviceRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watchSynchronizer, "watchSynchronizer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateInfoRepository, "updateInfoRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(otaProcessExecutor, "otaProcessExecutor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appContext, "appContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsRepository, "metricsRepository");
        this.metricsRepository = metricsRepository;
        java.lang.String string = appContext.getString(powerwatch.matrix.com.pwgen2android.R.string.bluetooth_disabled_message);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "appContext.getString(R.string.bluetooth_disabled_message)");
        this.bluetoothDisabledText = string;
        java.lang.String string2 = appContext.getString(powerwatch.matrix.com.pwgen2android.R.string.mandatory_update_message);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "appContext.getString(R.string.mandatory_update_message)");
        this.mandatoryUpdateText = string2;
        java.lang.String string3 = appContext.getString(powerwatch.matrix.com.pwgen2android.R.string.enable_text);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "appContext.getString(R.string.enable_text)");
        this.bluetoothActionText = string3;
        java.lang.String string4 = appContext.getString(powerwatch.matrix.com.pwgen2android.R.string.install_update);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string4, "appContext.getString(R.string.install_update)");
        this.firmwareUpdateActionText = string4;
        java.lang.String string5 = appContext.getString(powerwatch.matrix.com.pwgen2android.R.string.sync_not_allowed_message);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string5, "appContext.getString(R.string.sync_not_allowed_message)");
        this.syncNotAllowedDuringActivityText = string5;
        java.lang.String string6 = appContext.getString(powerwatch.matrix.com.pwgen2android.R.string.watch_busy_text);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string6, "appContext.getString(R.string.watch_busy_text)");
        this.watchBusyText = string6;
        java.lang.String string7 = appContext.getString(powerwatch.matrix.com.pwgen2android.R.string.syncError);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string7, "appContext.getString(R.string.syncError)");
        this.syncErrorText = string7;
        java.lang.String string8 = appContext.getString(powerwatch.matrix.com.pwgen2android.R.string.sync_timeout);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string8, "appContext.getString(R.string.sync_timeout)");
        this.syncTimeoutErrorText = string8;
        java.lang.String string9 = appContext.getString(powerwatch.matrix.com.pwgen2android.R.string.performance_update_error);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string9, "appContext.getString(R.string.performance_update_error)");
        this.updateErrorText = string9;
        java.lang.String string10 = appContext.getString(powerwatch.matrix.com.pwgen2android.R.string.device_communication_error);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string10, "appContext.getString(R.string.device_communication_error)");
        this.unknownError = string10;
        java.lang.String string11 = appContext.getString(powerwatch.matrix.com.pwgen2android.R.string.font_update_failed);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string11, "appContext.getString(R.string.font_update_failed)");
        this.fontUpdateFailed = string11;
        java.lang.String string12 = appContext.getString(powerwatch.matrix.com.pwgen2android.R.string.device_not_connected);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string12, "appContext.getString(R.string.device_not_connected)");
        this.deviceNotConnectedText = string12;
        java.lang.String string13 = appContext.getString(powerwatch.matrix.com.pwgen2android.R.string.enable_bt_permission);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string13, "appContext.getString(R.string.enable_bt_permission)");
        this.btPermissionMissing = string13;
        io.reactivex.subjects.PublishSubject<powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult> publishSubjectCreate = io.reactivex.subjects.PublishSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "create<SyncProcessResult>()");
        this.syncResetEvent = publishSubjectCreate;
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastMessageConfig> observableAutoConnect = io.reactivex.Observable.combineLatest(bluetoothManager.getChangeState(powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState.Enabled.INSTANCE, powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState.Disabled.INSTANCE), powerwatch.matrix.com.pwgen2android.shared.data.repositories.ObserveRepository.DefaultImpls.load$default(deviceRepository, true, false, 2, null), io.reactivex.Observable.merge(watchSynchronizer.gpsTransferOutput().skip(200L, java.util.concurrent.TimeUnit.MILLISECONDS).startWith(new powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult.SyncProgress(-1, null, null, false)), publishSubjectCreate), otaProcessExecutor.otaOutput(), powerwatch.matrix.com.pwgen2android.shared.data.repositories.ObserveRepository.DefaultImpls.load$default(updateInfoRepository, true, false, 2, null).startWith(new powerwatch.matrix.com.pwgen2android.shared.data.models.UpdateInfo(-1L, -1, "", "", "", "", false, false, null, 256, null)), io.reactivex.Observable.just(java.lang.Boolean.valueOf(powerwatch.matrix.com.pwgen2android.shared.extensions.BluetoothExtensionsKt.isBluetoothPermissionGranted(appContext))), new io.reactivex.functions.Function6() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.-$$Lambda$DashboardToastMessageViewModel$HnT7bhwgsvBvTYPH58Av1BiMoo8
            @Override // io.reactivex.functions.Function6
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastMessageViewModel.m1794currentConfig$lambda0(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState) obj, (powerwatch.matrix.com.pwgen2android.shared.data.models.Device) obj2, (powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult) obj3, (powerwatch.matrix.com.pwgen2android.main.OTAStatus) obj4, (powerwatch.matrix.com.pwgen2android.shared.data.models.UpdateInfo) obj5, (java.lang.Boolean) obj6);
            }
        }).replay(1).autoConnect();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableAutoConnect, "combineLatest(\n                    bluetoothManager.getChangeState(BluetoothState.Enabled, BluetoothState.Disabled),\n\n                    deviceRepository.load(true),\n\n                    Observable.merge(\n                            watchSynchronizer.gpsTransferOutput()\n                                    .skip(200, TimeUnit.MILLISECONDS)\n                                    // need to push dummy event, so combineLatest can be triggered\n                                    .startWith(SyncProcessResult.SyncProgress(-1, null, null, false)), syncResetEvent),\n\n                    otaProcessExecutor.otaOutput(),\n\n                    updateInfoRepository.load(true)\n                            // need to push initial value here, so combine latest could be triggered\n                            .startWith(UpdateInfo(-1, -1, \"\", \"\", \"\", \"\", mandatory = false, forced = false)),\n                    Observable.just(appContext.isBluetoothPermissionGranted()),\n\n                        Function6<BluetoothState, Device, SyncProcessResult, OTAStatus, UpdateInfo, Boolean, DashboardToastMessageConfig> { bluetoothState, device, syncWithAGpsEvent, otaStatus, updateInfo, btPermissionOn ->\n\n                        val syncEvent = syncWithAGpsEvent as? SyncProcessResult.SyncProgress\n                        val bluetoothDisabled = bluetoothState == BluetoothState.Disabled\n                        val criticalUpdateRequired = updateInfo.mandatory && updateInfo.isUpdateAvailable(device.firmwareVersion)\n                        val otaInProgress = !(otaStatus.phase == OtaProcessPhase.INITIAL || otaStatus.phase == OtaProcessPhase.COMPLETE || otaStatus.phase == OtaProcessPhase.ERROR)\n\n\n                        val aGpsTransferFailed = (syncWithAGpsEvent as? SyncProcessResult.AGPSProgress)?.error != null\n\n\n                        val syncNotAllowed = syncEvent?.error as? SyncError.ActivityInProgress != null\n                        val watchBusy = syncEvent?.error as? SyncError.WatchBusy != null\n                        val deviceNotConnected = syncEvent?.error as? SyncError.DeviceNotConnected != null\n\n                        val syncParsingError = (syncEvent?.error as? SyncError.SyncParsingError)\n                        val syncParsingErrorText = if (syncParsingError != null) String.format(syncErrorText, syncParsingError.code) else null\n\n                        val isTimeoutError = syncEvent?.error as? SyncError.SyncTimeoutError != null\n                        val unknownSyncError = syncEvent?.error as? SyncError.Unknown != null\n\n                        val criticalUpdateError = criticalUpdateRequired && !otaInProgress\n\n                        val fontUpdateEvent = syncWithAGpsEvent is SyncProcessResult.FontUpdateProgress\n                        val fontUpdateInProgress = fontUpdateEvent &&\n                                (syncWithAGpsEvent as SyncProcessResult.FontUpdateProgress).started &&\n                                !syncWithAGpsEvent.completed\n\n                        val fontUpdateError = syncWithAGpsEvent is SyncProcessResult.FontUpdateProgress\n                                && syncWithAGpsEvent.error != null\n\n                        when {\n                            deviceNotConnected -> return@Function6 DashboardToastMessageConfig(deviceNotConnectedText, \"\", updateInfo, device, DashboardToastType.DeviceNotConnected, durationSec = 3)\n                            syncNotAllowed -> return@Function6 DashboardToastMessageConfig(syncNotAllowedDuringActivityText, \"\", updateInfo, device, DashboardToastType.SyncNotAllowed, durationSec = 3)\n                            watchBusy -> return@Function6 DashboardToastMessageConfig(watchBusyText, \"\", updateInfo, device, DashboardToastType.SyncNotAllowed, durationSec = 3)\n                            criticalUpdateError -> return@Function6 DashboardToastMessageConfig(mandatoryUpdateText, firmwareUpdateActionText, updateInfo, device, DashboardToastType.CriticalUpdateRequired)\n                            bluetoothDisabled -> return@Function6 DashboardToastMessageConfig(bluetoothDisabledText, bluetoothActionText, updateInfo, device, DashboardToastType.BluetoothDisabled)\n                            otaInProgress -> return@Function6 DashboardToastMessageConfig(updateInfo = updateInfo, device = device, type = DashboardToastType.OTAInProgress)\n                            syncParsingErrorText != null -> return@Function6 DashboardToastMessageConfig(syncParsingErrorText, updateInfo = updateInfo, device = device, type = DashboardToastType.SyncParsingError, durationSec = 3)\n                            isTimeoutError -> return@Function6 DashboardToastMessageConfig(syncTimeoutErrorText, updateInfo = updateInfo, device = device, type = DashboardToastType.SyncTimeoutError, durationSec = 3)\n                            aGpsTransferFailed -> return@Function6 DashboardToastMessageConfig(updateErrorText, updateInfo = updateInfo, device = device, type = DashboardToastType.SyncTimeoutError, durationSec = 3)\n                            unknownSyncError -> return@Function6 DashboardToastMessageConfig(unknownError, updateInfo = updateInfo, device = device, type = DashboardToastType.UnknownSyncError, durationSec = 3)\n                            fontUpdateInProgress -> return@Function6 DashboardToastMessageConfig(updateInfo = updateInfo, device = device, type = DashboardToastType.FontUpdateInProgress)\n                            fontUpdateError -> return@Function6 DashboardToastMessageConfig(updateInfo = updateInfo, device = device, type = DashboardToastType.FontUpdateFailed, text = fontUpdateFailed, durationSec = 3)\n                            !btPermissionOn -> return@Function6  DashboardToastMessageConfig(btPermissionMissing, \"\", updateInfo, device, DashboardToastType.DeviceNotConnected, durationSec = 3)\n                            else -> DashboardToastMessageConfig(updateInfo = updateInfo, device = device, type = DashboardToastType.None)\n                        }\n                    }\n            )\n            .replay(1)\n            .autoConnect()");
        this.currentConfig = observableAutoConnect;
    }

    public final io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastMessageConfig> getCurrentConfig() {
        return this.currentConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:101:0x0150  */
    /* JADX INFO: renamed from: currentConfig$lambda-0, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastMessageConfig m1794currentConfig$lambda0(powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastMessageViewModel this$0, powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState bluetoothState, powerwatch.matrix.com.pwgen2android.shared.data.models.Device device, powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult syncWithAGpsEvent, powerwatch.matrix.com.pwgen2android.main.OTAStatus otaStatus, powerwatch.matrix.com.pwgen2android.shared.data.models.UpdateInfo updateInfo, java.lang.Boolean btPermissionOn) {
        java.lang.String str;
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bluetoothState, "bluetoothState");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(device, "device");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(syncWithAGpsEvent, "syncWithAGpsEvent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(otaStatus, "otaStatus");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateInfo, "updateInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(btPermissionOn, "btPermissionOn");
        powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult.SyncProgress syncProgress = syncWithAGpsEvent instanceof powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult.SyncProgress ? (powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult.SyncProgress) syncWithAGpsEvent : null;
        boolean zAreEqual = kotlin.jvm.internal.Intrinsics.areEqual(bluetoothState, powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState.Disabled.INSTANCE);
        boolean z2 = updateInfo.getMandatory() && updateInfo.isUpdateAvailable(device.getFirmwareVersion());
        boolean z3 = (kotlin.jvm.internal.Intrinsics.areEqual(otaStatus.getPhase(), powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.INITIAL.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(otaStatus.getPhase(), powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.COMPLETE.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(otaStatus.getPhase(), powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.ERROR.INSTANCE)) ? false : true;
        powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult.AGPSProgress aGPSProgress = syncWithAGpsEvent instanceof powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult.AGPSProgress ? (powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult.AGPSProgress) syncWithAGpsEvent : null;
        boolean z4 = (aGPSProgress == null ? null : aGPSProgress.getError()) != null;
        java.lang.Throwable error = syncProgress == null ? null : syncProgress.getError();
        boolean z5 = (error instanceof powerwatch.matrix.com.pwgen2android.shared.sync.SyncError.ActivityInProgress ? (powerwatch.matrix.com.pwgen2android.shared.sync.SyncError.ActivityInProgress) error : null) != null;
        java.lang.Throwable error2 = syncProgress == null ? null : syncProgress.getError();
        boolean z6 = (error2 instanceof powerwatch.matrix.com.pwgen2android.shared.sync.SyncError.WatchBusy ? (powerwatch.matrix.com.pwgen2android.shared.sync.SyncError.WatchBusy) error2 : null) != null;
        java.lang.Throwable error3 = syncProgress == null ? null : syncProgress.getError();
        boolean z7 = (error3 instanceof powerwatch.matrix.com.pwgen2android.shared.sync.SyncError.DeviceNotConnected ? (powerwatch.matrix.com.pwgen2android.shared.sync.SyncError.DeviceNotConnected) error3 : null) != null;
        java.lang.Throwable error4 = syncProgress == null ? null : syncProgress.getError();
        powerwatch.matrix.com.pwgen2android.shared.sync.SyncError.SyncParsingError syncParsingError = error4 instanceof powerwatch.matrix.com.pwgen2android.shared.sync.SyncError.SyncParsingError ? (powerwatch.matrix.com.pwgen2android.shared.sync.SyncError.SyncParsingError) error4 : null;
        if (syncParsingError != null) {
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            str = java.lang.String.format(this$0.syncErrorText, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(syncParsingError.getCode())}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
        } else {
            str = null;
        }
        java.lang.Throwable error5 = syncProgress == null ? null : syncProgress.getError();
        boolean z8 = (error5 instanceof powerwatch.matrix.com.pwgen2android.shared.sync.SyncError.SyncTimeoutError ? (powerwatch.matrix.com.pwgen2android.shared.sync.SyncError.SyncTimeoutError) error5 : null) != null;
        java.lang.Throwable error6 = syncProgress == null ? null : syncProgress.getError();
        boolean z9 = (error6 instanceof powerwatch.matrix.com.pwgen2android.shared.sync.SyncError.Unknown ? (powerwatch.matrix.com.pwgen2android.shared.sync.SyncError.Unknown) error6 : null) != null;
        boolean z10 = z2 && !z3;
        boolean z11 = syncWithAGpsEvent instanceof powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult.FontUpdateProgress;
        if (z11) {
            powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult.FontUpdateProgress fontUpdateProgress = (powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult.FontUpdateProgress) syncWithAGpsEvent;
            if (!fontUpdateProgress.getStarted() || fontUpdateProgress.getCompleted()) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        boolean z12 = z11 && syncWithAGpsEvent.getError() != null;
        if (z7) {
            return new powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastMessageConfig(this$0.deviceNotConnectedText, "", updateInfo, device, powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastType.DeviceNotConnected.INSTANCE, 3);
        }
        if (z5) {
            return new powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastMessageConfig(this$0.syncNotAllowedDuringActivityText, "", updateInfo, device, powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastType.SyncNotAllowed.INSTANCE, 3);
        }
        if (z6) {
            return new powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastMessageConfig(this$0.watchBusyText, "", updateInfo, device, powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastType.SyncNotAllowed.INSTANCE, 3);
        }
        if (z10) {
            return new powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastMessageConfig(this$0.mandatoryUpdateText, this$0.firmwareUpdateActionText, updateInfo, device, powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastType.CriticalUpdateRequired.INSTANCE, null, 32, null);
        }
        if (zAreEqual) {
            return new powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastMessageConfig(this$0.bluetoothDisabledText, this$0.bluetoothActionText, updateInfo, device, powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastType.BluetoothDisabled.INSTANCE, null, 32, null);
        }
        if (z3) {
            return new powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastMessageConfig(null, null, updateInfo, device, powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastType.OTAInProgress.INSTANCE, null, 35, null);
        }
        if (str != null) {
            return new powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastMessageConfig(str, null, updateInfo, device, powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastType.SyncParsingError.INSTANCE, 3, 2, null);
        }
        if (z8) {
            return new powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastMessageConfig(this$0.syncTimeoutErrorText, null, updateInfo, device, powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastType.SyncTimeoutError.INSTANCE, 3, 2, null);
        }
        if (z4) {
            return new powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastMessageConfig(this$0.updateErrorText, null, updateInfo, device, powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastType.SyncTimeoutError.INSTANCE, 3, 2, null);
        }
        if (z9) {
            return new powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastMessageConfig(this$0.unknownError, null, updateInfo, device, powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastType.UnknownSyncError.INSTANCE, 3, 2, null);
        }
        if (z) {
            return new powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastMessageConfig(null, null, updateInfo, device, powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastType.FontUpdateInProgress.INSTANCE, null, 35, null);
        }
        if (z12) {
            return new powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastMessageConfig(this$0.fontUpdateFailed, null, updateInfo, device, powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastType.FontUpdateFailed.INSTANCE, 3, 2, null);
        }
        return !btPermissionOn.booleanValue() ? new powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastMessageConfig(this$0.btPermissionMissing, "", updateInfo, device, powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastType.DeviceNotConnected.INSTANCE, 3) : new powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastMessageConfig(null, null, updateInfo, device, powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastType.None.INSTANCE, null, 35, null);
    }

    public final void resetSyncErrorEvent() {
        this.syncResetEvent.onNext(new powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult.SyncProgress(-1, null, null, false));
    }
}
