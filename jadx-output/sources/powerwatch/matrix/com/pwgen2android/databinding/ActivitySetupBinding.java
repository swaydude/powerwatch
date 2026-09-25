package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ActivitySetupBinding extends androidx.databinding.ViewDataBinding {

    @androidx.databinding.Bindable
    protected powerwatch.matrix.com.pwgen2android.setup.SetupActivityViewModel mViewModel;
    public final android.widget.FrameLayout setupFragmentContainer;

    public abstract void setViewModel(powerwatch.matrix.com.pwgen2android.setup.SetupActivityViewModel viewModel);

    protected ActivitySetupBinding(java.lang.Object _bindingComponent, android.view.View _root, int _localFieldCount, android.widget.FrameLayout setupFragmentContainer) {
        super(_bindingComponent, _root, _localFieldCount);
        this.setupFragmentContainer = setupFragmentContainer;
    }

    public powerwatch.matrix.com.pwgen2android.setup.SetupActivityViewModel getViewModel() {
        return this.mViewModel;
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.ActivitySetupBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.ActivitySetupBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.ActivitySetupBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.activity_setup, root, attachToRoot, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.ActivitySetupBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.ActivitySetupBinding inflate(android.view.LayoutInflater inflater, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.ActivitySetupBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.activity_setup, null, false, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.ActivitySetupBinding bind(android.view.View view) {
        return bind(view, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.ActivitySetupBinding bind(android.view.View view, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.ActivitySetupBinding) bind(component, view, powerwatch.matrix.com.pwgen2android.R.layout.activity_setup);
    }
}
