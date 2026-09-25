package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentLicencePageBinding extends androidx.databinding.ViewDataBinding {
    public final android.widget.FrameLayout conditionsContainer;

    @androidx.databinding.Bindable
    protected powerwatch.matrix.com.pwgen2android.setup.createaccount.LicencePageViewModel mViewModel;
    public final android.widget.LinearLayout mainView;
    public final android.view.View toolbarLayout;

    public abstract void setViewModel(powerwatch.matrix.com.pwgen2android.setup.createaccount.LicencePageViewModel viewModel);

    protected FragmentLicencePageBinding(java.lang.Object _bindingComponent, android.view.View _root, int _localFieldCount, android.widget.FrameLayout conditionsContainer, android.widget.LinearLayout mainView, android.view.View toolbarLayout) {
        super(_bindingComponent, _root, _localFieldCount);
        this.conditionsContainer = conditionsContainer;
        this.mainView = mainView;
        this.toolbarLayout = toolbarLayout;
    }

    public powerwatch.matrix.com.pwgen2android.setup.createaccount.LicencePageViewModel getViewModel() {
        return this.mViewModel;
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentLicencePageBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentLicencePageBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentLicencePageBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_licence_page, root, attachToRoot, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentLicencePageBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentLicencePageBinding inflate(android.view.LayoutInflater inflater, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentLicencePageBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_licence_page, null, false, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentLicencePageBinding bind(android.view.View view) {
        return bind(view, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentLicencePageBinding bind(android.view.View view, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentLicencePageBinding) bind(component, view, powerwatch.matrix.com.pwgen2android.R.layout.fragment_licence_page);
    }
}
