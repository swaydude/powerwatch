package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ActivityMainBinding extends androidx.databinding.ViewDataBinding {

    @androidx.databinding.Bindable
    protected powerwatch.matrix.com.pwgen2android.main.MainActivityViewModel mViewModel;
    public final com.google.android.material.tabs.TabLayout tabs;
    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.LockableViewPager viewPager;

    public abstract void setViewModel(powerwatch.matrix.com.pwgen2android.main.MainActivityViewModel viewModel);

    protected ActivityMainBinding(java.lang.Object _bindingComponent, android.view.View _root, int _localFieldCount, com.google.android.material.tabs.TabLayout tabs, powerwatch.matrix.com.pwgen2android.shared.ui.views.LockableViewPager viewPager) {
        super(_bindingComponent, _root, _localFieldCount);
        this.tabs = tabs;
        this.viewPager = viewPager;
    }

    public powerwatch.matrix.com.pwgen2android.main.MainActivityViewModel getViewModel() {
        return this.mViewModel;
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.ActivityMainBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.ActivityMainBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.ActivityMainBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.activity_main, root, attachToRoot, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.ActivityMainBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.ActivityMainBinding inflate(android.view.LayoutInflater inflater, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.ActivityMainBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.activity_main, null, false, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.ActivityMainBinding bind(android.view.View view) {
        return bind(view, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.ActivityMainBinding bind(android.view.View view, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.ActivityMainBinding) bind(component, view, powerwatch.matrix.com.pwgen2android.R.layout.activity_main);
    }
}
