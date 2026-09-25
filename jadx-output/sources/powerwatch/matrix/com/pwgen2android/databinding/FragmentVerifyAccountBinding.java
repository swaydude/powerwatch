package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentVerifyAccountBinding extends androidx.databinding.ViewDataBinding {
    public final android.widget.Button continueButton;

    @androidx.databinding.Bindable
    protected powerwatch.matrix.com.pwgen2android.setup.verifyaccount.VerifyAccountViewModel mViewModel;

    public abstract void setViewModel(powerwatch.matrix.com.pwgen2android.setup.verifyaccount.VerifyAccountViewModel viewModel);

    protected FragmentVerifyAccountBinding(java.lang.Object _bindingComponent, android.view.View _root, int _localFieldCount, android.widget.Button continueButton) {
        super(_bindingComponent, _root, _localFieldCount);
        this.continueButton = continueButton;
    }

    public powerwatch.matrix.com.pwgen2android.setup.verifyaccount.VerifyAccountViewModel getViewModel() {
        return this.mViewModel;
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentVerifyAccountBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentVerifyAccountBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentVerifyAccountBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_verify_account, root, attachToRoot, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentVerifyAccountBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentVerifyAccountBinding inflate(android.view.LayoutInflater inflater, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentVerifyAccountBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_verify_account, null, false, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentVerifyAccountBinding bind(android.view.View view) {
        return bind(view, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentVerifyAccountBinding bind(android.view.View view, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentVerifyAccountBinding) bind(component, view, powerwatch.matrix.com.pwgen2android.R.layout.fragment_verify_account);
    }
}
