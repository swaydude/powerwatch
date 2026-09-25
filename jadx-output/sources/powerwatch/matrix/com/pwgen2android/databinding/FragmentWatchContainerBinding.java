package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentWatchContainerBinding extends androidx.databinding.ViewDataBinding {

    @androidx.databinding.Bindable
    protected powerwatch.matrix.com.pwgen2android.main.watch.WatchContainerViewModel mViewModel;
    public final android.widget.FrameLayout watchFragmentContainer;

    public abstract void setViewModel(powerwatch.matrix.com.pwgen2android.main.watch.WatchContainerViewModel viewModel);

    protected FragmentWatchContainerBinding(java.lang.Object _bindingComponent, android.view.View _root, int _localFieldCount, android.widget.FrameLayout watchFragmentContainer) {
        super(_bindingComponent, _root, _localFieldCount);
        this.watchFragmentContainer = watchFragmentContainer;
    }

    public powerwatch.matrix.com.pwgen2android.main.watch.WatchContainerViewModel getViewModel() {
        return this.mViewModel;
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchContainerBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchContainerBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchContainerBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_watch_container, root, attachToRoot, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchContainerBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchContainerBinding inflate(android.view.LayoutInflater inflater, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchContainerBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_watch_container, null, false, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchContainerBinding bind(android.view.View view) {
        return bind(view, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchContainerBinding bind(android.view.View view, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchContainerBinding) bind(component, view, powerwatch.matrix.com.pwgen2android.R.layout.fragment_watch_container);
    }
}
