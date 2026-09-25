package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentChangePasswordBinding extends androidx.databinding.ViewDataBinding {
    public final android.widget.FrameLayout biometricsContainer;
    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableButton createAccount;
    public final android.widget.LinearLayout loginDetails;

    @androidx.databinding.Bindable
    protected powerwatch.matrix.com.pwgen2android.setup.changepassword.ChangePasswordViewModel mViewModel;
    public final powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.DashedCircleView mainSyncCircle;
    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableEditText oldPasswordEditText;
    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableEditText passwordConfirmEditText;
    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableEditText passwordEditText;

    public abstract void setViewModel(powerwatch.matrix.com.pwgen2android.setup.changepassword.ChangePasswordViewModel viewModel);

    protected FragmentChangePasswordBinding(java.lang.Object _bindingComponent, android.view.View _root, int _localFieldCount, android.widget.FrameLayout biometricsContainer, powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableButton createAccount, android.widget.LinearLayout loginDetails, powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.DashedCircleView mainSyncCircle, powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableEditText oldPasswordEditText, powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableEditText passwordConfirmEditText, powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableEditText passwordEditText) {
        super(_bindingComponent, _root, _localFieldCount);
        this.biometricsContainer = biometricsContainer;
        this.createAccount = createAccount;
        this.loginDetails = loginDetails;
        this.mainSyncCircle = mainSyncCircle;
        this.oldPasswordEditText = oldPasswordEditText;
        this.passwordConfirmEditText = passwordConfirmEditText;
        this.passwordEditText = passwordEditText;
    }

    public powerwatch.matrix.com.pwgen2android.setup.changepassword.ChangePasswordViewModel getViewModel() {
        return this.mViewModel;
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentChangePasswordBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentChangePasswordBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentChangePasswordBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_change_password, root, attachToRoot, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentChangePasswordBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentChangePasswordBinding inflate(android.view.LayoutInflater inflater, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentChangePasswordBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_change_password, null, false, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentChangePasswordBinding bind(android.view.View view) {
        return bind(view, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentChangePasswordBinding bind(android.view.View view, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentChangePasswordBinding) bind(component, view, powerwatch.matrix.com.pwgen2android.R.layout.fragment_change_password);
    }
}
