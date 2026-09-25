package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentEditBiometricsBinding extends androidx.databinding.ViewDataBinding {
    public final android.widget.FrameLayout biometricsContainer;

    @androidx.databinding.Bindable
    protected powerwatch.matrix.com.pwgen2android.setup.editBiometrics.EditBiometricsViewModel mViewModel;

    public abstract void setViewModel(powerwatch.matrix.com.pwgen2android.setup.editBiometrics.EditBiometricsViewModel viewModel);

    protected FragmentEditBiometricsBinding(java.lang.Object _bindingComponent, android.view.View _root, int _localFieldCount, android.widget.FrameLayout biometricsContainer) {
        super(_bindingComponent, _root, _localFieldCount);
        this.biometricsContainer = biometricsContainer;
    }

    public powerwatch.matrix.com.pwgen2android.setup.editBiometrics.EditBiometricsViewModel getViewModel() {
        return this.mViewModel;
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentEditBiometricsBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentEditBiometricsBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentEditBiometricsBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_edit_biometrics, root, attachToRoot, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentEditBiometricsBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentEditBiometricsBinding inflate(android.view.LayoutInflater inflater, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentEditBiometricsBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_edit_biometrics, null, false, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentEditBiometricsBinding bind(android.view.View view) {
        return bind(view, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentEditBiometricsBinding bind(android.view.View view, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentEditBiometricsBinding) bind(component, view, powerwatch.matrix.com.pwgen2android.R.layout.fragment_edit_biometrics);
    }
}
