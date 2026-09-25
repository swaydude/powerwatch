package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentGettingStartedBinding extends androidx.databinding.ViewDataBinding {

    @androidx.databinding.Bindable
    protected powerwatch.matrix.com.pwgen2android.main.watch.WatchGettingStartedViewModel mViewModel;
    public final android.widget.LinearLayout mainView;

    public abstract void setViewModel(powerwatch.matrix.com.pwgen2android.main.watch.WatchGettingStartedViewModel viewModel);

    protected FragmentGettingStartedBinding(java.lang.Object _bindingComponent, android.view.View _root, int _localFieldCount, android.widget.LinearLayout mainView) {
        super(_bindingComponent, _root, _localFieldCount);
        this.mainView = mainView;
    }

    public powerwatch.matrix.com.pwgen2android.main.watch.WatchGettingStartedViewModel getViewModel() {
        return this.mViewModel;
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentGettingStartedBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentGettingStartedBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentGettingStartedBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_getting_started, root, attachToRoot, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentGettingStartedBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentGettingStartedBinding inflate(android.view.LayoutInflater inflater, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentGettingStartedBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_getting_started, null, false, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentGettingStartedBinding bind(android.view.View view) {
        return bind(view, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentGettingStartedBinding bind(android.view.View view, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentGettingStartedBinding) bind(component, view, powerwatch.matrix.com.pwgen2android.R.layout.fragment_getting_started);
    }
}
