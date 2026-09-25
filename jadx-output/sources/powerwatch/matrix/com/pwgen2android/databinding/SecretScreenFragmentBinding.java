package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SecretScreenFragmentBinding extends androidx.databinding.ViewDataBinding {
    public final android.widget.FrameLayout calls;
    public final androidx.appcompat.widget.SwitchCompat callsToggle;
    public final android.widget.LinearLayout cloutContent;
    public final android.widget.LinearLayout databaseContent;
    public final android.widget.LinearLayout loggerContent;

    @androidx.databinding.Bindable
    protected powerwatch.matrix.com.pwgen2android.secret.SecretScreenViewModel mViewModel;
    public final android.widget.RadioButton radioDev;
    public final android.widget.RadioButton radioProd;
    public final android.widget.LinearLayout setupFragmentContainer;
    public final android.widget.LinearLayout watchSettings;

    public abstract void setViewModel(powerwatch.matrix.com.pwgen2android.secret.SecretScreenViewModel viewModel);

    protected SecretScreenFragmentBinding(java.lang.Object _bindingComponent, android.view.View _root, int _localFieldCount, android.widget.FrameLayout calls, androidx.appcompat.widget.SwitchCompat callsToggle, android.widget.LinearLayout cloutContent, android.widget.LinearLayout databaseContent, android.widget.LinearLayout loggerContent, android.widget.RadioButton radioDev, android.widget.RadioButton radioProd, android.widget.LinearLayout setupFragmentContainer, android.widget.LinearLayout watchSettings) {
        super(_bindingComponent, _root, _localFieldCount);
        this.calls = calls;
        this.callsToggle = callsToggle;
        this.cloutContent = cloutContent;
        this.databaseContent = databaseContent;
        this.loggerContent = loggerContent;
        this.radioDev = radioDev;
        this.radioProd = radioProd;
        this.setupFragmentContainer = setupFragmentContainer;
        this.watchSettings = watchSettings;
    }

    public powerwatch.matrix.com.pwgen2android.secret.SecretScreenViewModel getViewModel() {
        return this.mViewModel;
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.secret_screen_fragment, root, attachToRoot, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBinding inflate(android.view.LayoutInflater inflater, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.secret_screen_fragment, null, false, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBinding bind(android.view.View view) {
        return bind(view, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBinding bind(android.view.View view, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBinding) bind(component, view, powerwatch.matrix.com.pwgen2android.R.layout.secret_screen_fragment);
    }
}
