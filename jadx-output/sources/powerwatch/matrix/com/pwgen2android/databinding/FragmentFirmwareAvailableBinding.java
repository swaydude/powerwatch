package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentFirmwareAvailableBinding extends androidx.databinding.ViewDataBinding {
    public final android.widget.LinearLayout actionLayout;

    @androidx.databinding.Bindable
    protected powerwatch.matrix.com.pwgen2android.main.update.FirmwareAvailableViewModel mViewModel;
    public final android.widget.ProgressBar progressBar;

    public abstract void setViewModel(powerwatch.matrix.com.pwgen2android.main.update.FirmwareAvailableViewModel viewModel);

    protected FragmentFirmwareAvailableBinding(java.lang.Object _bindingComponent, android.view.View _root, int _localFieldCount, android.widget.LinearLayout actionLayout, android.widget.ProgressBar progressBar) {
        super(_bindingComponent, _root, _localFieldCount);
        this.actionLayout = actionLayout;
        this.progressBar = progressBar;
    }

    public powerwatch.matrix.com.pwgen2android.main.update.FirmwareAvailableViewModel getViewModel() {
        return this.mViewModel;
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentFirmwareAvailableBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentFirmwareAvailableBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentFirmwareAvailableBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_firmware_available, root, attachToRoot, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentFirmwareAvailableBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentFirmwareAvailableBinding inflate(android.view.LayoutInflater inflater, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentFirmwareAvailableBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_firmware_available, null, false, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentFirmwareAvailableBinding bind(android.view.View view) {
        return bind(view, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentFirmwareAvailableBinding bind(android.view.View view, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentFirmwareAvailableBinding) bind(component, view, powerwatch.matrix.com.pwgen2android.R.layout.fragment_firmware_available);
    }
}
