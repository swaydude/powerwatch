package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentCreateAccountBinding extends androidx.databinding.ViewDataBinding {
    public final android.widget.FrameLayout biometricsContainer;
    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableButton createAccount;
    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableEditText emailEditText;
    public final android.widget.LinearLayout loginDetails;

    @androidx.databinding.Bindable
    protected powerwatch.matrix.com.pwgen2android.setup.createaccount.CreateAccountViewModel mViewModel;
    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableEditText nameEditText;
    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableEditText passwordConfirmEditText;
    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableEditText passwordEditText;
    public final android.widget.RelativeLayout termsAndConditionsLayout;
    public final androidx.appcompat.widget.AppCompatCheckBox termsCheckBox;

    public abstract void setViewModel(powerwatch.matrix.com.pwgen2android.setup.createaccount.CreateAccountViewModel viewModel);

    protected FragmentCreateAccountBinding(java.lang.Object _bindingComponent, android.view.View _root, int _localFieldCount, android.widget.FrameLayout biometricsContainer, powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableButton createAccount, powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableEditText emailEditText, android.widget.LinearLayout loginDetails, powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableEditText nameEditText, powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableEditText passwordConfirmEditText, powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableEditText passwordEditText, android.widget.RelativeLayout termsAndConditionsLayout, androidx.appcompat.widget.AppCompatCheckBox termsCheckBox) {
        super(_bindingComponent, _root, _localFieldCount);
        this.biometricsContainer = biometricsContainer;
        this.createAccount = createAccount;
        this.emailEditText = emailEditText;
        this.loginDetails = loginDetails;
        this.nameEditText = nameEditText;
        this.passwordConfirmEditText = passwordConfirmEditText;
        this.passwordEditText = passwordEditText;
        this.termsAndConditionsLayout = termsAndConditionsLayout;
        this.termsCheckBox = termsCheckBox;
    }

    public powerwatch.matrix.com.pwgen2android.setup.createaccount.CreateAccountViewModel getViewModel() {
        return this.mViewModel;
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentCreateAccountBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentCreateAccountBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentCreateAccountBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_create_account, root, attachToRoot, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentCreateAccountBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentCreateAccountBinding inflate(android.view.LayoutInflater inflater, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentCreateAccountBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_create_account, null, false, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentCreateAccountBinding bind(android.view.View view) {
        return bind(view, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentCreateAccountBinding bind(android.view.View view, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentCreateAccountBinding) bind(component, view, powerwatch.matrix.com.pwgen2android.R.layout.fragment_create_account);
    }
}
