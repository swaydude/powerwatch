package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentGetStartedScreenBinding extends androidx.databinding.ViewDataBinding {
    public final android.widget.FrameLayout biometricsContainer;
    public final android.widget.Button loginButton;

    @androidx.databinding.Bindable
    protected powerwatch.matrix.com.pwgen2android.setup.getstarted.GetStartedViewModel mViewModel;

    public abstract void setViewModel(powerwatch.matrix.com.pwgen2android.setup.getstarted.GetStartedViewModel viewModel);

    protected FragmentGetStartedScreenBinding(java.lang.Object _bindingComponent, android.view.View _root, int _localFieldCount, android.widget.FrameLayout biometricsContainer, android.widget.Button loginButton) {
        super(_bindingComponent, _root, _localFieldCount);
        this.biometricsContainer = biometricsContainer;
        this.loginButton = loginButton;
    }

    public powerwatch.matrix.com.pwgen2android.setup.getstarted.GetStartedViewModel getViewModel() {
        return this.mViewModel;
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentGetStartedScreenBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentGetStartedScreenBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentGetStartedScreenBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_get_started_screen, root, attachToRoot, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentGetStartedScreenBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentGetStartedScreenBinding inflate(android.view.LayoutInflater inflater, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentGetStartedScreenBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_get_started_screen, null, false, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentGetStartedScreenBinding bind(android.view.View view) {
        return bind(view, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentGetStartedScreenBinding bind(android.view.View view, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentGetStartedScreenBinding) bind(component, view, powerwatch.matrix.com.pwgen2android.R.layout.fragment_get_started_screen);
    }
}
