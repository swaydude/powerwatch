package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentForgotPasswordBinding extends androidx.databinding.ViewDataBinding {
    public final android.widget.Button createAccount;
    public final android.widget.EditText emailEditText;
    public final android.widget.LinearLayout loginDetails;

    @androidx.databinding.Bindable
    protected powerwatch.matrix.com.pwgen2android.setup.forgotpassword.ForgotPasswordViewModel mViewModel;
    public final powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.DashedCircleView mainSyncCircle;

    public abstract void setViewModel(powerwatch.matrix.com.pwgen2android.setup.forgotpassword.ForgotPasswordViewModel viewModel);

    protected FragmentForgotPasswordBinding(java.lang.Object _bindingComponent, android.view.View _root, int _localFieldCount, android.widget.Button createAccount, android.widget.EditText emailEditText, android.widget.LinearLayout loginDetails, powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.DashedCircleView mainSyncCircle) {
        super(_bindingComponent, _root, _localFieldCount);
        this.createAccount = createAccount;
        this.emailEditText = emailEditText;
        this.loginDetails = loginDetails;
        this.mainSyncCircle = mainSyncCircle;
    }

    public powerwatch.matrix.com.pwgen2android.setup.forgotpassword.ForgotPasswordViewModel getViewModel() {
        return this.mViewModel;
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentForgotPasswordBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentForgotPasswordBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentForgotPasswordBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_forgot_password, root, attachToRoot, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentForgotPasswordBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentForgotPasswordBinding inflate(android.view.LayoutInflater inflater, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentForgotPasswordBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_forgot_password, null, false, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentForgotPasswordBinding bind(android.view.View view) {
        return bind(view, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentForgotPasswordBinding bind(android.view.View view, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentForgotPasswordBinding) bind(component, view, powerwatch.matrix.com.pwgen2android.R.layout.fragment_forgot_password);
    }
}
