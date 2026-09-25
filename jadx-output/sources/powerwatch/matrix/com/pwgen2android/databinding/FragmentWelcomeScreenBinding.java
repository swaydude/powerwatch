package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentWelcomeScreenBinding extends androidx.databinding.ViewDataBinding {
    public final androidx.viewpager.widget.ViewPager carouselViewPager;
    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableButton gettingStartedButton;

    @androidx.databinding.Bindable
    protected powerwatch.matrix.com.pwgen2android.setup.welcome.WelcomeScreenViewModel mViewModel;

    public abstract void setViewModel(powerwatch.matrix.com.pwgen2android.setup.welcome.WelcomeScreenViewModel viewModel);

    protected FragmentWelcomeScreenBinding(java.lang.Object _bindingComponent, android.view.View _root, int _localFieldCount, androidx.viewpager.widget.ViewPager carouselViewPager, powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableButton gettingStartedButton) {
        super(_bindingComponent, _root, _localFieldCount);
        this.carouselViewPager = carouselViewPager;
        this.gettingStartedButton = gettingStartedButton;
    }

    public powerwatch.matrix.com.pwgen2android.setup.welcome.WelcomeScreenViewModel getViewModel() {
        return this.mViewModel;
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentWelcomeScreenBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentWelcomeScreenBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentWelcomeScreenBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_welcome_screen, root, attachToRoot, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentWelcomeScreenBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentWelcomeScreenBinding inflate(android.view.LayoutInflater inflater, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentWelcomeScreenBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_welcome_screen, null, false, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentWelcomeScreenBinding bind(android.view.View view) {
        return bind(view, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentWelcomeScreenBinding bind(android.view.View view, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentWelcomeScreenBinding) bind(component, view, powerwatch.matrix.com.pwgen2android.R.layout.fragment_welcome_screen);
    }
}
