package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentSignInBinding extends androidx.databinding.ViewDataBinding {
    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableEditText emailEditText;
    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView errorTextView;
    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableButton loginButton;
    public final android.widget.LinearLayout loginDetails;

    @androidx.databinding.Bindable
    protected powerwatch.matrix.com.pwgen2android.setup.signin.SignInViewModel mViewModel;
    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableEditText passwordEditText;

    public abstract void setViewModel(powerwatch.matrix.com.pwgen2android.setup.signin.SignInViewModel viewModel);

    protected FragmentSignInBinding(java.lang.Object _bindingComponent, android.view.View _root, int _localFieldCount, powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableEditText emailEditText, powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView errorTextView, powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableButton loginButton, android.widget.LinearLayout loginDetails, powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableEditText passwordEditText) {
        super(_bindingComponent, _root, _localFieldCount);
        this.emailEditText = emailEditText;
        this.errorTextView = errorTextView;
        this.loginButton = loginButton;
        this.loginDetails = loginDetails;
        this.passwordEditText = passwordEditText;
    }

    public powerwatch.matrix.com.pwgen2android.setup.signin.SignInViewModel getViewModel() {
        return this.mViewModel;
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentSignInBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentSignInBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentSignInBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_sign_in, root, attachToRoot, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentSignInBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentSignInBinding inflate(android.view.LayoutInflater inflater, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentSignInBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_sign_in, null, false, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentSignInBinding bind(android.view.View view) {
        return bind(view, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentSignInBinding bind(android.view.View view, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentSignInBinding) bind(component, view, powerwatch.matrix.com.pwgen2android.R.layout.fragment_sign_in);
    }
}
