package powerwatch.matrix.com.pwgen2android.setup;

/* JADX INFO: compiled from: LoginFlowBaseViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\u0007H\u0016R\"\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModelImpl;", "Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModel;", "networkInfoProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProvider;", "(Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProvider;)V", "displayNetworkError", "Landroidx/databinding/ObservableField;", "", "kotlin.jvm.PlatformType", "getDisplayNetworkError", "()Landroidx/databinding/ObservableField;", "checkAndDisplayNetworkError", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class LoginFlowBaseViewModelImpl implements powerwatch.matrix.com.pwgen2android.setup.LoginFlowBaseViewModel {
    private final androidx.databinding.ObservableField<java.lang.Boolean> displayNetworkError;
    private final powerwatch.matrix.com.pwgen2android.shared.host.NetworkInfoProvider networkInfoProvider;

    public LoginFlowBaseViewModelImpl(powerwatch.matrix.com.pwgen2android.shared.host.NetworkInfoProvider networkInfoProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkInfoProvider, "networkInfoProvider");
        this.networkInfoProvider = networkInfoProvider;
        this.displayNetworkError = new androidx.databinding.ObservableField<>(false);
    }

    @Override // powerwatch.matrix.com.pwgen2android.setup.LoginFlowBaseViewModel
    public androidx.databinding.ObservableField<java.lang.Boolean> getDisplayNetworkError() {
        return this.displayNetworkError;
    }

    @Override // powerwatch.matrix.com.pwgen2android.setup.LoginFlowBaseViewModel
    public boolean checkAndDisplayNetworkError() {
        boolean zIsEnabled = this.networkInfoProvider.isEnabled();
        if (!zIsEnabled) {
            getDisplayNetworkError().set(false);
            getDisplayNetworkError().set(true);
        }
        return zIsEnabled;
    }
}
