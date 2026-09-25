package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentUnpairWatchBinding extends androidx.databinding.ViewDataBinding {

    @androidx.databinding.Bindable
    protected powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.UnpairDialogVM mViewModel;

    public abstract void setViewModel(powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.UnpairDialogVM viewModel);

    protected FragmentUnpairWatchBinding(java.lang.Object _bindingComponent, android.view.View _root, int _localFieldCount) {
        super(_bindingComponent, _root, _localFieldCount);
    }

    public powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.UnpairDialogVM getViewModel() {
        return this.mViewModel;
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentUnpairWatchBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentUnpairWatchBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentUnpairWatchBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_unpair_watch, root, attachToRoot, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentUnpairWatchBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentUnpairWatchBinding inflate(android.view.LayoutInflater inflater, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentUnpairWatchBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_unpair_watch, null, false, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentUnpairWatchBinding bind(android.view.View view) {
        return bind(view, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentUnpairWatchBinding bind(android.view.View view, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentUnpairWatchBinding) bind(component, view, powerwatch.matrix.com.pwgen2android.R.layout.fragment_unpair_watch);
    }
}
