package powerwatch.matrix.com.pwgen2android.main.update;

/* JADX INFO: compiled from: FirmwareAvailableViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B=\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\b\u0010]\u001a\u00020^H\u0016J\u0010\u0010_\u001a\u00020^2\u0006\u0010`\u001a\u00020aH\u0016J\u0010\u0010b\u001a\u00020^2\u0006\u0010`\u001a\u00020aH\u0016J\u0016\u0010c\u001a\u00020^2\u0006\u0010d\u001a\u00020a2\u0006\u0010e\u001a\u00020\u0016J\n\u0010f\u001a\u00020^*\u00020gR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00160\u00160\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001e\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u000e0\u000e0\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010 \u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00160\u00160\u0015¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0015¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0019R\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0015¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0019R\u001c\u0010+\u001a\u0004\u0018\u00010,X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u000e\u00101\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u00104\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0015¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u0019R\u0017\u00106\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0015¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u0019R\u000e\u00108\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\b\n\u0000\u001a\u0004\b>\u0010\u0019R\u001f\u0010?\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00160\u00160\u0015¢\u0006\b\n\u0000\u001a\u0004\b@\u0010\u0019R\u001f\u0010A\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u001b0\u001b0\u0015¢\u0006\b\n\u0000\u001a\u0004\bB\u0010\u0019R\u000e\u0010C\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010E\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u001b0\u001b0\u0015¢\u0006\b\n\u0000\u001a\u0004\bF\u0010\u0019R\u000e\u0010G\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010I\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0015¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010\u0019R\u000e\u0010K\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010M\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u001b0\u001b0\u0015¢\u0006\b\n\u0000\u001a\u0004\bN\u0010\u0019R\u001f\u0010O\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u001b0\u001b0\u0015¢\u0006\b\n\u0000\u001a\u0004\bP\u0010\u0019R\u001c\u0010Q\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010S0S0RX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010V\u001a\u00020U2\u0006\u0010T\u001a\u00020U@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u000e\u0010[\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\\\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006h"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;", "Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "bluetoothManager", "Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;", "deviceManager", "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;", "networkInfoProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProvider;", "deviceRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;", "otaProcessExecutor", "Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutor;", "parentFragmentManager", "Landroidx/fragment/app/FragmentManager;", "activity", "Landroid/app/Activity;", "(Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutor;Landroidx/fragment/app/FragmentManager;Landroid/app/Activity;)V", "getDeviceRepository", "()Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;", "displayPreconditionsError", "Landroidx/databinding/ObservableField;", "", "kotlin.jvm.PlatformType", "getDisplayPreconditionsError", "()Landroidx/databinding/ObservableField;", "downloadPhase", "", "firmwareVersion", "getFirmwareVersion", "fragmentManagerWeakReference", "Ljava/lang/ref/WeakReference;", "otaFailed", "getOtaFailed", "otaFinishedSuccess", "getOtaFinishedSuccess", "otaInProgress", "getOtaInProgress", "otaProgressValue", "", "getOtaProgressValue", "otaStatus", "getOtaStatus", "pairedDevice", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;", "getPairedDevice", "()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;", "setPairedDevice", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)V", "preconditionsErrorBluetoothText", "preconditionsErrorDeviceNotConnected", "preconditionsErrorNetworkText", "releaseInfo", "getReleaseInfo", "releaseNotes", "getReleaseNotes", "retryNowText", "syncNotAllowedDuringActivity", "syncPhase", "syncTimeoutError", "unknownSyncError", "updateAvailable", "getUpdateAvailable", "updateButtonEnabled", "getUpdateButtonEnabled", "updateButtonText", "getUpdateButtonText", "updateFailedDeviceNotConnectedError", "updateFailedNetworkError", "updateFailedReason", "getUpdateFailedReason", "updateFailedTransferError", "updateFailedUnknownError", "updateInfo", "getUpdateInfo", "updateNowText", "updatePhase", "updatePhaseText", "getUpdatePhaseText", "updatePreconditionsErrorText", "getUpdatePreconditionsErrorText", "updatePreconditionsObservable", "Lio/reactivex/Observable;", "Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;", "value", "Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;", "versionRelease", "getVersionRelease", "()Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;", "setVersionRelease", "(Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;)V", "watchBusy", "watchReadyToUseText", "onBackClicked", "", "onCreateView", "context", "Landroid/content/Context;", "onDestroy", "prepareUpdateInfo", "activityContext", "hasUpdate", "startUpdate", "Landroid/view/View;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class FirmwareAvailableViewModel extends powerwatch.matrix.com.pwgen2android.main.MainDeepBaseViewModel implements powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository deviceRepository;
    private final androidx.databinding.ObservableField<java.lang.Boolean> displayPreconditionsError;
    private final java.lang.String downloadPhase;
    private final androidx.databinding.ObservableField<java.lang.String> firmwareVersion;
    private final java.lang.ref.WeakReference<androidx.fragment.app.FragmentManager> fragmentManagerWeakReference;
    private final androidx.databinding.ObservableField<java.lang.Boolean> otaFailed;
    private final androidx.databinding.ObservableField<java.lang.Boolean> otaFinishedSuccess;
    private final androidx.databinding.ObservableField<java.lang.Boolean> otaInProgress;
    private final powerwatch.matrix.com.pwgen2android.main.OtaProcessExecutor otaProcessExecutor;
    private final androidx.databinding.ObservableField<java.lang.Integer> otaProgressValue;
    private final androidx.databinding.ObservableField<java.lang.String> otaStatus;
    private powerwatch.matrix.com.pwgen2android.shared.data.models.Device pairedDevice;
    private final java.lang.String preconditionsErrorBluetoothText;
    private final java.lang.String preconditionsErrorDeviceNotConnected;
    private final java.lang.String preconditionsErrorNetworkText;
    private final androidx.databinding.ObservableField<java.lang.String> releaseInfo;
    private final androidx.databinding.ObservableField<java.lang.String> releaseNotes;
    private final java.lang.String retryNowText;
    private final java.lang.String syncNotAllowedDuringActivity;
    private final java.lang.String syncPhase;
    private final java.lang.String syncTimeoutError;
    private final java.lang.String unknownSyncError;
    private final androidx.databinding.ObservableField<java.lang.Boolean> updateAvailable;
    private final androidx.databinding.ObservableField<java.lang.Boolean> updateButtonEnabled;
    private final androidx.databinding.ObservableField<java.lang.String> updateButtonText;
    private final java.lang.String updateFailedDeviceNotConnectedError;
    private final java.lang.String updateFailedNetworkError;
    private final androidx.databinding.ObservableField<java.lang.String> updateFailedReason;
    private final java.lang.String updateFailedTransferError;
    private final java.lang.String updateFailedUnknownError;
    private final androidx.databinding.ObservableField<java.lang.String> updateInfo;
    private final java.lang.String updateNowText;
    private final java.lang.String updatePhase;
    private final androidx.databinding.ObservableField<java.lang.String> updatePhaseText;
    private final androidx.databinding.ObservableField<java.lang.String> updatePreconditionsErrorText;
    private final io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.main.update.UpdatePreconditionsState> updatePreconditionsObservable;
    private powerwatch.matrix.com.pwgen2android.main.update.FirmwareDisplayData versionRelease;
    private final java.lang.String watchBusy;
    private final java.lang.String watchReadyToUseText;

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    public final powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository getDeviceRepository() {
        return this.deviceRepository;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FirmwareAvailableViewModel(powerwatch.matrix.com.pwgen2android.shared.host.BluetoothManager bluetoothManager, powerwatch.matrix.com.pwgen2android.sdk.DeviceManager deviceManager, powerwatch.matrix.com.pwgen2android.shared.host.NetworkInfoProvider networkInfoProvider, powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository deviceRepository, powerwatch.matrix.com.pwgen2android.main.OtaProcessExecutor otaProcessExecutor, androidx.fragment.app.FragmentManager parentFragmentManager, android.app.Activity activity) {
        super(activity, null, 2, null == true ? 1 : 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bluetoothManager, "bluetoothManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceManager, "deviceManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkInfoProvider, "networkInfoProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceRepository, "deviceRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(otaProcessExecutor, "otaProcessExecutor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parentFragmentManager, "parentFragmentManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        this.deviceRepository = deviceRepository;
        this.otaProcessExecutor = otaProcessExecutor;
        java.lang.String string = activity.getString(powerwatch.matrix.com.pwgen2android.R.string.start_update);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "activity.getString(R.string.start_update)");
        this.updateNowText = string;
        java.lang.String string2 = activity.getString(powerwatch.matrix.com.pwgen2android.R.string.retry_update);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "activity.getString(R.string.retry_update)");
        this.retryNowText = string2;
        java.lang.String string3 = activity.getString(powerwatch.matrix.com.pwgen2android.R.string.button_done);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "activity.getString(R.string.button_done)");
        this.watchReadyToUseText = string3;
        java.lang.String string4 = activity.getString(powerwatch.matrix.com.pwgen2android.R.string.update_failed_reason_unknown);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string4, "activity.getString(R.string.update_failed_reason_unknown)");
        this.updateFailedUnknownError = string4;
        java.lang.String string5 = activity.getString(powerwatch.matrix.com.pwgen2android.R.string.update_failed_transfer_error);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string5, "activity.getString(R.string.update_failed_transfer_error)");
        this.updateFailedTransferError = string5;
        java.lang.String string6 = activity.getString(powerwatch.matrix.com.pwgen2android.R.string.update_failed_network_error);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string6, "activity.getString(R.string.update_failed_network_error)");
        this.updateFailedNetworkError = string6;
        java.lang.String string7 = activity.getString(powerwatch.matrix.com.pwgen2android.R.string.update_failed_device_not_connected);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string7, "activity.getString(R.string.update_failed_device_not_connected)");
        this.updateFailedDeviceNotConnectedError = string7;
        java.lang.String string8 = activity.getString(powerwatch.matrix.com.pwgen2android.R.string.network_not_available_text);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string8, "activity.getString(R.string.network_not_available_text)");
        this.preconditionsErrorNetworkText = string8;
        java.lang.String string9 = activity.getString(powerwatch.matrix.com.pwgen2android.R.string.bluetooth_disabled_message);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string9, "activity.getString(R.string.bluetooth_disabled_message)");
        this.preconditionsErrorBluetoothText = string9;
        java.lang.String string10 = activity.getString(powerwatch.matrix.com.pwgen2android.R.string.device_not_connected);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string10, "activity.getString(R.string.device_not_connected)");
        this.preconditionsErrorDeviceNotConnected = string10;
        java.lang.String string11 = activity.getString(powerwatch.matrix.com.pwgen2android.R.string.download_firmware);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string11, "activity.getString(R.string.download_firmware)");
        this.downloadPhase = string11;
        java.lang.String string12 = activity.getString(powerwatch.matrix.com.pwgen2android.R.string.applying_updates);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string12, "activity.getString(R.string.applying_updates)");
        this.updatePhase = string12;
        java.lang.String string13 = activity.getString(powerwatch.matrix.com.pwgen2android.R.string.syncing_watch);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string13, "activity.getString(R.string.syncing_watch)");
        this.syncPhase = string13;
        java.lang.String string14 = activity.getString(powerwatch.matrix.com.pwgen2android.R.string.sync_not_allowed_message);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string14, "activity.getString(R.string.sync_not_allowed_message)");
        this.syncNotAllowedDuringActivity = string14;
        java.lang.String string15 = activity.getString(powerwatch.matrix.com.pwgen2android.R.string.watch_busy_text);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string15, "activity.getString(R.string.watch_busy_text)");
        this.watchBusy = string15;
        java.lang.String string16 = activity.getString(powerwatch.matrix.com.pwgen2android.R.string.sync_timeout);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string16, "activity.getString(R.string.sync_timeout)");
        this.syncTimeoutError = string16;
        java.lang.String string17 = activity.getString(powerwatch.matrix.com.pwgen2android.R.string.device_communication_error);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string17, "activity.getString(R.string.device_communication_error)");
        this.unknownSyncError = string17;
        this.releaseInfo = new androidx.databinding.ObservableField<>();
        this.firmwareVersion = new androidx.databinding.ObservableField<>();
        this.releaseNotes = new androidx.databinding.ObservableField<>();
        this.otaStatus = new androidx.databinding.ObservableField<>();
        this.otaInProgress = new androidx.databinding.ObservableField<>(false);
        this.otaFinishedSuccess = new androidx.databinding.ObservableField<>(false);
        this.otaFailed = new androidx.databinding.ObservableField<>(false);
        this.updateAvailable = new androidx.databinding.ObservableField<>(true);
        this.updateInfo = new androidx.databinding.ObservableField<>();
        this.otaProgressValue = new androidx.databinding.ObservableField<>();
        this.updateFailedReason = new androidx.databinding.ObservableField<>(string4);
        this.updateButtonEnabled = new androidx.databinding.ObservableField<>(true);
        this.updateButtonText = new androidx.databinding.ObservableField<>(string);
        this.updatePhaseText = new androidx.databinding.ObservableField<>(string13);
        this.updatePreconditionsErrorText = new androidx.databinding.ObservableField<>("");
        this.displayPreconditionsError = new androidx.databinding.ObservableField<>(false);
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.main.update.UpdatePreconditionsState> observableAutoConnect = io.reactivex.Observable.combineLatest(bluetoothManager.getChangeState(powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState.Enabled.INSTANCE, powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState.Disabled.INSTANCE), powerwatch.matrix.com.pwgen2android.sdk.DeviceManager.DefaultImpls.connect$default(deviceManager, false, 1, null), networkInfoProvider.getNetworkStatusChange(), new io.reactivex.functions.Function3() { // from class: powerwatch.matrix.com.pwgen2android.main.update.-$$Lambda$FirmwareAvailableViewModel$aZjBXGZ8an7TepvqRwyhWy42tJo
            @Override // io.reactivex.functions.Function3
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return powerwatch.matrix.com.pwgen2android.main.update.FirmwareAvailableViewModel.m1914updatePreconditionsObservable$lambda0((powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState) obj, (powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) obj2, (powerwatch.matrix.com.pwgen2android.shared.host.NetworkStatus) obj3);
            }
        }).replay(1).autoConnect();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableAutoConnect, "combineLatest(\n                    bluetoothManager.getChangeState(BluetoothState.Enabled, BluetoothState.Disabled),\n                    deviceManager.connect(),\n                    networkInfoProvider.networkStatusChange, Function3<BluetoothState, DeviceInfo, NetworkStatus, UpdatePreconditionsState> { bluetooth, deviceConnection, network ->\n                UpdatePreconditionsState(bluetooth == BluetoothState.Enabled, network == NetworkStatus.Connected, deviceConnection.isConnected)\n            })\n                    .replay(1)\n                    .autoConnect()");
        this.updatePreconditionsObservable = observableAutoConnect;
        this.versionRelease = new powerwatch.matrix.com.pwgen2android.main.update.FirmwareDisplayData(null, null, null, null, 0, null, 63, null);
        this.fragmentManagerWeakReference = new java.lang.ref.WeakReference<>(parentFragmentManager);
    }

    public final androidx.databinding.ObservableField<java.lang.String> getReleaseInfo() {
        return this.releaseInfo;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getFirmwareVersion() {
        return this.firmwareVersion;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getReleaseNotes() {
        return this.releaseNotes;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getOtaStatus() {
        return this.otaStatus;
    }

    public final androidx.databinding.ObservableField<java.lang.Boolean> getOtaInProgress() {
        return this.otaInProgress;
    }

    public final androidx.databinding.ObservableField<java.lang.Boolean> getOtaFinishedSuccess() {
        return this.otaFinishedSuccess;
    }

    public final androidx.databinding.ObservableField<java.lang.Boolean> getOtaFailed() {
        return this.otaFailed;
    }

    public final androidx.databinding.ObservableField<java.lang.Boolean> getUpdateAvailable() {
        return this.updateAvailable;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getUpdateInfo() {
        return this.updateInfo;
    }

    public final androidx.databinding.ObservableField<java.lang.Integer> getOtaProgressValue() {
        return this.otaProgressValue;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getUpdateFailedReason() {
        return this.updateFailedReason;
    }

    public final androidx.databinding.ObservableField<java.lang.Boolean> getUpdateButtonEnabled() {
        return this.updateButtonEnabled;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getUpdateButtonText() {
        return this.updateButtonText;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getUpdatePhaseText() {
        return this.updatePhaseText;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getUpdatePreconditionsErrorText() {
        return this.updatePreconditionsErrorText;
    }

    public final androidx.databinding.ObservableField<java.lang.Boolean> getDisplayPreconditionsError() {
        return this.displayPreconditionsError;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: updatePreconditionsObservable$lambda-0, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.main.update.UpdatePreconditionsState m1914updatePreconditionsObservable$lambda0(powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState bluetooth, powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceConnection, powerwatch.matrix.com.pwgen2android.shared.host.NetworkStatus network) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bluetooth, "bluetooth");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceConnection, "deviceConnection");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(network, "network");
        return new powerwatch.matrix.com.pwgen2android.main.update.UpdatePreconditionsState(kotlin.jvm.internal.Intrinsics.areEqual(bluetooth, powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState.Enabled.INSTANCE), kotlin.jvm.internal.Intrinsics.areEqual(network, powerwatch.matrix.com.pwgen2android.shared.host.NetworkStatus.Connected.INSTANCE), deviceConnection.isConnected());
    }

    public final powerwatch.matrix.com.pwgen2android.main.update.FirmwareDisplayData getVersionRelease() {
        return this.versionRelease;
    }

    public final void setVersionRelease(powerwatch.matrix.com.pwgen2android.main.update.FirmwareDisplayData value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        this.versionRelease = value;
        this.firmwareVersion.set(value.getVersion());
        this.releaseNotes.set(value.getReleaseNotes());
    }

    public final powerwatch.matrix.com.pwgen2android.shared.data.models.Device getPairedDevice() {
        return this.pairedDevice;
    }

    public final void setPairedDevice(powerwatch.matrix.com.pwgen2android.shared.data.models.Device device) {
        this.pairedDevice = device;
    }

    @Override // powerwatch.matrix.com.pwgen2android.main.MainDeepBaseViewModel
    public void onBackClicked() {
        super.onBackClicked();
        androidx.fragment.app.FragmentManager fragmentManager = this.fragmentManagerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        fragmentManager.popBackStackImmediate();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseViewModel
    public void onDestroy(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        super.onDestroy(context);
        java.lang.Boolean bool = this.otaInProgress.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(bool);
        if (bool.booleanValue()) {
            return;
        }
        this.otaProcessExecutor.resetExecutorState();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseViewModel
    public void onCreateView(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        super.onCreateView(context);
        getCompositeDisposable().add(this.deviceRepository.defaultDevice().filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.main.update.-$$Lambda$FirmwareAvailableViewModel$6ajYOG-tBjRzosXQGczJRwQPKJ4
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.update.FirmwareAvailableViewModel.m1903onCreateView$lambda1((powerwatch.matrix.com.pwgen2android.shared.data.models.Device) obj);
            }
        }).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.update.-$$Lambda$FirmwareAvailableViewModel$h98AGhwByVeqWaNuQMXe35k9K_M
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.update.FirmwareAvailableViewModel.m1904onCreateView$lambda2(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.data.models.Device) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.update.-$$Lambda$FirmwareAvailableViewModel$-HrQMHrz1Zwi7f7QOivF3rDWFNY
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                ((java.lang.Throwable) obj).printStackTrace();
            }
        }));
        getCompositeDisposable().add(this.otaProcessExecutor.otaOutput().retry().repeat().filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.main.update.-$$Lambda$FirmwareAvailableViewModel$OWD2lr4mRBIqGqjl5QSO1Y0a_vc
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.update.FirmwareAvailableViewModel.m1906onCreateView$lambda4((powerwatch.matrix.com.pwgen2android.main.OTAStatus) obj);
            }
        }).observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.update.-$$Lambda$FirmwareAvailableViewModel$DFn3BsWRoQY9lxuAag68OheVA0M
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.update.FirmwareAvailableViewModel.m1907onCreateView$lambda6(this.f$0, (powerwatch.matrix.com.pwgen2android.main.OTAStatus) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.update.-$$Lambda$FirmwareAvailableViewModel$cq2o__pK5s5SnFyJkFvtHXhvMl4
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.update.FirmwareAvailableViewModel.m1908onCreateView$lambda7(this.f$0, (java.lang.Throwable) obj);
            }
        }));
        getCompositeDisposable().add(this.updatePreconditionsObservable.withLatestFrom(this.otaProcessExecutor.otaOutput(), new io.reactivex.functions.BiFunction() { // from class: powerwatch.matrix.com.pwgen2android.main.update.-$$Lambda$FirmwareAvailableViewModel$21FprlhyENUJ5kv6rkvlTmYmeBM
            @Override // io.reactivex.functions.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return powerwatch.matrix.com.pwgen2android.main.update.FirmwareAvailableViewModel.m1909onCreateView$lambda8((powerwatch.matrix.com.pwgen2android.main.update.UpdatePreconditionsState) obj, (powerwatch.matrix.com.pwgen2android.main.OTAStatus) obj2);
            }
        }).subscribe((io.reactivex.functions.Consumer<? super R>) new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.update.-$$Lambda$FirmwareAvailableViewModel$BErXzq-elmqeoaLzbOTEkRosC40
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.update.FirmwareAvailableViewModel.m1910onCreateView$lambda9(this.f$0, (kotlin.Pair) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-1, reason: not valid java name */
    public static final boolean m1903onCreateView$lambda1(powerwatch.matrix.com.pwgen2android.shared.data.models.Device it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it.getBluetoothAddress().length() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-2, reason: not valid java name */
    public static final void m1904onCreateView$lambda2(powerwatch.matrix.com.pwgen2android.main.update.FirmwareAvailableViewModel this$0, powerwatch.matrix.com.pwgen2android.shared.data.models.Device device) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setPairedDevice(device);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-4, reason: not valid java name */
    public static final boolean m1906onCreateView$lambda4(powerwatch.matrix.com.pwgen2android.main.OTAStatus it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return !kotlin.jvm.internal.Intrinsics.areEqual(it.getPhase(), powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.INITIAL.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-6, reason: not valid java name */
    public static final void m1907onCreateView$lambda6(powerwatch.matrix.com.pwgen2android.main.update.FirmwareAvailableViewModel this$0, powerwatch.matrix.com.pwgen2android.main.OTAStatus oTAStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase phase = oTAStatus.getPhase();
        if (kotlin.jvm.internal.Intrinsics.areEqual(phase, powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.COMPLETE.INSTANCE)) {
            this$0.getOtaInProgress().set(false);
            this$0.getOtaProgressValue().set(0);
            this$0.getUpdateButtonText().set(this$0.watchReadyToUseText);
            this$0.getOtaFinishedSuccess().set(true);
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(phase, powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.ERROR.INSTANCE)) {
            this$0.getOtaFailed().set(true);
            this$0.getOtaInProgress().set(false);
            this$0.getOtaProgressValue().set(0);
            this$0.getUpdateButtonText().set(this$0.retryNowText);
            java.lang.Throwable otaError = oTAStatus.getOtaError();
            if (otaError == null) {
                return;
            }
            powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.error$default(this$0, "Received OTA error!", otaError, null, 4, null);
            if (otaError instanceof powerwatch.matrix.com.pwgen2android.shared.sync.SyncError.DeviceNotConnected) {
                this$0.getUpdateFailedReason().set(this$0.updateFailedDeviceNotConnectedError);
                return;
            }
            if (otaError instanceof powerwatch.matrix.com.pwgen2android.shared.sync.SyncError.WatchBusy) {
                this$0.getUpdateFailedReason().set(this$0.watchBusy);
                return;
            }
            if (otaError instanceof powerwatch.matrix.com.pwgen2android.shared.sync.SyncError.ActivityInProgress) {
                this$0.getUpdateFailedReason().set(this$0.syncNotAllowedDuringActivity);
                return;
            }
            if (otaError instanceof powerwatch.matrix.com.pwgen2android.shared.sync.SyncError.SyncTimeoutError) {
                this$0.getUpdateFailedReason().set(this$0.syncTimeoutError);
                return;
            }
            if (otaError instanceof powerwatch.matrix.com.pwgen2android.shared.sync.SyncError.Unknown) {
                this$0.getUpdateFailedReason().set(this$0.unknownSyncError);
                return;
            }
            if (otaError instanceof powerwatch.matrix.com.pwgen2android.main.OTAError.FileTransferInterrupted) {
                this$0.getUpdateFailedReason().set(this$0.updateFailedTransferError);
                return;
            }
            if (otaError instanceof powerwatch.matrix.com.pwgen2android.main.OTAError.FileDownload) {
                this$0.getUpdateFailedReason().set(this$0.updateFailedNetworkError);
                return;
            }
            if (otaError instanceof powerwatch.matrix.com.pwgen2android.main.OTAError.DeviceNotConnected) {
                this$0.getUpdateFailedReason().set(this$0.updateFailedDeviceNotConnectedError);
                return;
            } else {
                if ((otaError instanceof powerwatch.matrix.com.pwgen2android.main.OTAError.VersionMismatch) || (otaError instanceof powerwatch.matrix.com.pwgen2android.main.OTAError.DeviceNotAppeared)) {
                    return;
                }
                this$0.getUpdateFailedReason().set(this$0.updateFailedUnknownError);
                return;
            }
        }
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.info$default(this$0, kotlin.jvm.internal.Intrinsics.stringPlus("Received OTA progress: ", java.lang.Integer.valueOf(oTAStatus.getTotalProgress())), null, 2, null);
        this$0.getOtaProgressValue().set(java.lang.Integer.valueOf(oTAStatus.getTotalProgress()));
        this$0.getOtaInProgress().set(true);
        powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase phase2 = oTAStatus.getPhase();
        if (kotlin.jvm.internal.Intrinsics.areEqual(phase2, powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.SYNC.INSTANCE)) {
            this$0.getUpdatePhaseText().set(this$0.syncPhase);
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(phase2, powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.DOWNLOAD_STARTED.INSTANCE)) {
            this$0.getUpdatePhaseText().set(this$0.downloadPhase);
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(phase2, powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.DOWNLOAD_FINISHED.INSTANCE)) {
            this$0.getUpdatePhaseText().set(this$0.downloadPhase);
        } else {
            this$0.getUpdatePhaseText().set(this$0.updatePhase);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-7, reason: not valid java name */
    public static final void m1908onCreateView$lambda7(powerwatch.matrix.com.pwgen2android.main.update.FirmwareAvailableViewModel this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.wtfError(this$0, "OTA output subscriber received error and died!", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-8, reason: not valid java name */
    public static final kotlin.Pair m1909onCreateView$lambda8(powerwatch.matrix.com.pwgen2android.main.update.UpdatePreconditionsState preconditions, powerwatch.matrix.com.pwgen2android.main.OTAStatus otaState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preconditions, "preconditions");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(otaState, "otaState");
        return new kotlin.Pair(preconditions, otaState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-9, reason: not valid java name */
    public static final void m1910onCreateView$lambda9(powerwatch.matrix.com.pwgen2android.main.update.FirmwareAvailableViewModel this$0, kotlin.Pair pair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (((powerwatch.matrix.com.pwgen2android.main.update.UpdatePreconditionsState) pair.getFirst()).getDeviceConnection() && ((powerwatch.matrix.com.pwgen2android.main.update.UpdatePreconditionsState) pair.getFirst()).getNetwork() && ((powerwatch.matrix.com.pwgen2android.main.update.UpdatePreconditionsState) pair.getFirst()).getBluetooth() && !kotlin.jvm.internal.Intrinsics.areEqual(((powerwatch.matrix.com.pwgen2android.main.OTAStatus) pair.getSecond()).getPhase(), powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.COMPLETE.INSTANCE)) {
            this$0.getUpdateButtonEnabled().set(true);
        }
    }

    public final void startUpdate(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) this.otaFinishedSuccess.get(), (java.lang.Object) true)) {
            onBackClicked();
            return;
        }
        this.otaFailed.set(false);
        powerwatch.matrix.com.pwgen2android.shared.data.models.Device device = this.pairedDevice;
        final java.lang.String bluetoothAddress = device == null ? null : device.getBluetoothAddress();
        if (bluetoothAddress != null) {
            getCompositeDisposable().add(this.updatePreconditionsObservable.flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.update.-$$Lambda$FirmwareAvailableViewModel$w9SmCDakero0UvMFyfiXDfqmIBQ
                @Override // io.reactivex.functions.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return powerwatch.matrix.com.pwgen2android.main.update.FirmwareAvailableViewModel.m1911startUpdate$lambda10((powerwatch.matrix.com.pwgen2android.main.update.UpdatePreconditionsState) obj);
                }
            }).firstOrError().observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.update.-$$Lambda$FirmwareAvailableViewModel$Y8uZnDbVLV6bXxTC7FSpoDrbvbY
                @Override // io.reactivex.functions.Consumer
                public final void accept(java.lang.Object obj) {
                    powerwatch.matrix.com.pwgen2android.main.update.FirmwareAvailableViewModel.m1912startUpdate$lambda11(this.f$0, bluetoothAddress, obj);
                }
            }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.update.-$$Lambda$FirmwareAvailableViewModel$s7xOqfNffXCab-sqRxF2T46C_WI
                @Override // io.reactivex.functions.Consumer
                public final void accept(java.lang.Object obj) {
                    powerwatch.matrix.com.pwgen2android.main.update.FirmwareAvailableViewModel.m1913startUpdate$lambda12(this.f$0, (java.lang.Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startUpdate$lambda-10, reason: not valid java name */
    public static final io.reactivex.ObservableSource m1911startUpdate$lambda10(powerwatch.matrix.com.pwgen2android.main.update.UpdatePreconditionsState it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        if (!it.getBluetooth()) {
            return io.reactivex.Observable.error(powerwatch.matrix.com.pwgen2android.main.update.OTAPreconditionsError.BluetoothNotEnabled.INSTANCE);
        }
        if (it.getNetwork()) {
            return !it.getDeviceConnection() ? io.reactivex.Observable.error(powerwatch.matrix.com.pwgen2android.main.update.OTAPreconditionsError.DeviceNotConnected.INSTANCE) : io.reactivex.Observable.just(it);
        }
        return io.reactivex.Observable.error(powerwatch.matrix.com.pwgen2android.main.update.OTAPreconditionsError.NetworkNotConnected.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startUpdate$lambda-11, reason: not valid java name */
    public static final void m1912startUpdate$lambda11(powerwatch.matrix.com.pwgen2android.main.update.FirmwareAvailableViewModel this$0, java.lang.String str, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getOtaInProgress().set(true);
        powerwatch.matrix.com.pwgen2android.main.OtaProcessExecutor.DefaultImpls.startOTA$default(this$0.otaProcessExecutor, this$0.getVersionRelease().getDownloadUrl(), this$0.getVersionRelease(), str, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startUpdate$lambda-12, reason: not valid java name */
    public static final void m1913startUpdate$lambda12(powerwatch.matrix.com.pwgen2android.main.update.FirmwareAvailableViewModel this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getUpdateButtonEnabled().set(false);
        boolean z = th instanceof powerwatch.matrix.com.pwgen2android.main.update.OTAPreconditionsError;
        if (z && kotlin.jvm.internal.Intrinsics.areEqual(th, powerwatch.matrix.com.pwgen2android.main.update.OTAPreconditionsError.BluetoothNotEnabled.INSTANCE)) {
            this$0.getUpdatePreconditionsErrorText().set(this$0.preconditionsErrorBluetoothText);
            this$0.getDisplayPreconditionsError().set(true);
        } else if (z && kotlin.jvm.internal.Intrinsics.areEqual(th, powerwatch.matrix.com.pwgen2android.main.update.OTAPreconditionsError.DeviceNotConnected.INSTANCE)) {
            this$0.getUpdatePreconditionsErrorText().set(this$0.preconditionsErrorDeviceNotConnected);
            this$0.getDisplayPreconditionsError().set(true);
        } else if (z && kotlin.jvm.internal.Intrinsics.areEqual(th, powerwatch.matrix.com.pwgen2android.main.update.OTAPreconditionsError.NetworkNotConnected.INSTANCE)) {
            this$0.getUpdatePreconditionsErrorText().set(this$0.preconditionsErrorNetworkText);
            this$0.getDisplayPreconditionsError().set(true);
        }
    }

    public final void prepareUpdateInfo(android.content.Context activityContext, boolean hasUpdate) {
        java.lang.String strMonthDayYearFormatText;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityContext, "activityContext");
        java.lang.String releaseDate = this.versionRelease.getReleaseDate();
        java.lang.String str = null;
        java.util.Calendar zonedCalendar$default = releaseDate == null ? null : powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.toZonedCalendar$default(java.lang.Long.parseLong(releaseDate), null, 1, null);
        if (zonedCalendar$default != null && (strMonthDayYearFormatText = powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.monthDayYearFormatText(zonedCalendar$default, "en")) != null) {
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String string = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.released_time);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "activityContext.getString(R.string.released_time)");
            str = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{strMonthDayYearFormatText}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
        }
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject2 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String string2 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.installed_version);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "activityContext.getString(R.string.installed_version)");
        java.lang.String str2 = java.lang.String.format(string2, java.util.Arrays.copyOf(new java.lang.Object[]{this.versionRelease.getInstalledVersion()}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "java.lang.String.format(format, *args)");
        if (hasUpdate && str != null) {
            str2 = ((java.lang.Object) str) + ' ' + str2;
        }
        this.releaseInfo.set(str2);
    }
}
