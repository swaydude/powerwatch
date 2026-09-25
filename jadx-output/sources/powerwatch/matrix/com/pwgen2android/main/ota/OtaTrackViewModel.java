package powerwatch.matrix.com.pwgen2android.main.ota;

/* JADX INFO: compiled from: OtaTrackViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00030\u00030\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0013¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u001f\u0010!\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\"0\"0\u0013¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00180\u0013¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0016¨\u0006&"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;", "context", "Landroid/content/Context;", "bluetoothManager", "Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;", "communicator", "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;", "otaExecutor", "Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutorImpl;", "(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutorImpl;)V", "getBluetoothManager", "()Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;", "getCommunicator", "()Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;", "contextWeakReference", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "otaChangeStatus", "Landroidx/databinding/ObservableField;", "Lpowerwatch/matrix/com/pwgen2android/main/OtaUIPhase;", "getOtaChangeStatus", "()Landroidx/databinding/ObservableField;", "otaCompleted", "", "getOtaCompleted", "otaError", "getOtaError", "getOtaExecutor", "()Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutorImpl;", "otaPhaseDescription", "", "getOtaPhaseDescription", "otaProgressField", "", "getOtaProgressField", "otaUiVisible", "getOtaUiVisible", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class OtaTrackViewModel extends powerwatch.matrix.com.pwgen2android.shared.BaseViewModel {
    private final powerwatch.matrix.com.pwgen2android.shared.host.BluetoothManager bluetoothManager;
    private final powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator;
    private final java.lang.ref.WeakReference<android.content.Context> contextWeakReference;
    private final androidx.databinding.ObservableField<powerwatch.matrix.com.pwgen2android.main.OtaUIPhase> otaChangeStatus;
    private final androidx.databinding.ObservableField<java.lang.Boolean> otaCompleted;
    private final androidx.databinding.ObservableField<java.lang.Boolean> otaError;
    private final powerwatch.matrix.com.pwgen2android.main.OtaProcessExecutorImpl otaExecutor;
    private final androidx.databinding.ObservableField<java.lang.String> otaPhaseDescription;
    private final androidx.databinding.ObservableField<java.lang.Integer> otaProgressField;
    private final androidx.databinding.ObservableField<java.lang.Boolean> otaUiVisible;

    public final powerwatch.matrix.com.pwgen2android.shared.host.BluetoothManager getBluetoothManager() {
        return this.bluetoothManager;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator getCommunicator() {
        return this.communicator;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtaTrackViewModel(android.content.Context context, powerwatch.matrix.com.pwgen2android.shared.host.BluetoothManager bluetoothManager, powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator, powerwatch.matrix.com.pwgen2android.main.OtaProcessExecutorImpl otaExecutor) {
        super(null, null, 3, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bluetoothManager, "bluetoothManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(communicator, "communicator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(otaExecutor, "otaExecutor");
        this.bluetoothManager = bluetoothManager;
        this.communicator = communicator;
        this.otaExecutor = otaExecutor;
        this.contextWeakReference = new java.lang.ref.WeakReference<>(context);
        this.otaProgressField = new androidx.databinding.ObservableField<>(0);
        this.otaChangeStatus = new androidx.databinding.ObservableField<>(new powerwatch.matrix.com.pwgen2android.main.OtaUIPhase(powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.INITIAL.INSTANCE, powerwatch.matrix.com.pwgen2android.main.OtaUIPhaseStatus.NOT_STARTED.INSTANCE));
        this.otaCompleted = new androidx.databinding.ObservableField<>(true);
        this.otaError = new androidx.databinding.ObservableField<>(false);
        this.otaUiVisible = new androidx.databinding.ObservableField<>(false);
        this.otaPhaseDescription = new androidx.databinding.ObservableField<>();
    }

    public final powerwatch.matrix.com.pwgen2android.main.OtaProcessExecutorImpl getOtaExecutor() {
        return this.otaExecutor;
    }

    public final androidx.databinding.ObservableField<java.lang.Integer> getOtaProgressField() {
        return this.otaProgressField;
    }

    public final androidx.databinding.ObservableField<powerwatch.matrix.com.pwgen2android.main.OtaUIPhase> getOtaChangeStatus() {
        return this.otaChangeStatus;
    }

    public final androidx.databinding.ObservableField<java.lang.Boolean> getOtaCompleted() {
        return this.otaCompleted;
    }

    public final androidx.databinding.ObservableField<java.lang.Boolean> getOtaError() {
        return this.otaError;
    }

    public final androidx.databinding.ObservableField<java.lang.Boolean> getOtaUiVisible() {
        return this.otaUiVisible;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getOtaPhaseDescription() {
        return this.otaPhaseDescription;
    }
}
