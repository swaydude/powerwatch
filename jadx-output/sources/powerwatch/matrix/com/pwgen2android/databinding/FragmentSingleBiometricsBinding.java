package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentSingleBiometricsBinding extends androidx.databinding.ViewDataBinding {

    @androidx.databinding.Bindable
    protected powerwatch.matrix.com.pwgen2android.setup.editBiometrics.SingleWheelViewModel mViewModel;
    public final com.super_rabbit.wheel_picker.WheelPicker singleBiometricsPicker;

    public abstract void setViewModel(powerwatch.matrix.com.pwgen2android.setup.editBiometrics.SingleWheelViewModel viewModel);

    protected FragmentSingleBiometricsBinding(java.lang.Object _bindingComponent, android.view.View _root, int _localFieldCount, com.super_rabbit.wheel_picker.WheelPicker singleBiometricsPicker) {
        super(_bindingComponent, _root, _localFieldCount);
        this.singleBiometricsPicker = singleBiometricsPicker;
    }

    public powerwatch.matrix.com.pwgen2android.setup.editBiometrics.SingleWheelViewModel getViewModel() {
        return this.mViewModel;
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentSingleBiometricsBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentSingleBiometricsBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentSingleBiometricsBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_single_biometrics, root, attachToRoot, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentSingleBiometricsBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentSingleBiometricsBinding inflate(android.view.LayoutInflater inflater, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentSingleBiometricsBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_single_biometrics, null, false, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentSingleBiometricsBinding bind(android.view.View view) {
        return bind(view, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentSingleBiometricsBinding bind(android.view.View view, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentSingleBiometricsBinding) bind(component, view, powerwatch.matrix.com.pwgen2android.R.layout.fragment_single_biometrics);
    }
}
