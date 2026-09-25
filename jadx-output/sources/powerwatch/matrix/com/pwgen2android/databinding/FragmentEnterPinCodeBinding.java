package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentEnterPinCodeBinding extends androidx.databinding.ViewDataBinding {
    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableEditText codeEditText;
    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView enterPairingCodeLabel;

    @androidx.databinding.Bindable
    protected powerwatch.matrix.com.pwgen2android.pair.ui.gen2.EnterPinCodeViewModel mViewModel;

    public abstract void setViewModel(powerwatch.matrix.com.pwgen2android.pair.ui.gen2.EnterPinCodeViewModel viewModel);

    protected FragmentEnterPinCodeBinding(java.lang.Object _bindingComponent, android.view.View _root, int _localFieldCount, powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableEditText codeEditText, powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView enterPairingCodeLabel) {
        super(_bindingComponent, _root, _localFieldCount);
        this.codeEditText = codeEditText;
        this.enterPairingCodeLabel = enterPairingCodeLabel;
    }

    public powerwatch.matrix.com.pwgen2android.pair.ui.gen2.EnterPinCodeViewModel getViewModel() {
        return this.mViewModel;
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentEnterPinCodeBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentEnterPinCodeBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentEnterPinCodeBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_enter_pin_code, root, attachToRoot, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentEnterPinCodeBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentEnterPinCodeBinding inflate(android.view.LayoutInflater inflater, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentEnterPinCodeBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_enter_pin_code, null, false, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentEnterPinCodeBinding bind(android.view.View view) {
        return bind(view, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentEnterPinCodeBinding bind(android.view.View view, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentEnterPinCodeBinding) bind(component, view, powerwatch.matrix.com.pwgen2android.R.layout.fragment_enter_pin_code);
    }
}
