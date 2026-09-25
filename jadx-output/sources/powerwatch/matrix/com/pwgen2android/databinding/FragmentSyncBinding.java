package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentSyncBinding extends androidx.databinding.ViewDataBinding {

    @androidx.databinding.Bindable
    protected powerwatch.matrix.com.pwgen2android.main.dashboard.sync.SyncViewModel mViewModel;
    public final powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.DashedCircleView mainSyncCircle;

    public abstract void setViewModel(powerwatch.matrix.com.pwgen2android.main.dashboard.sync.SyncViewModel viewModel);

    protected FragmentSyncBinding(java.lang.Object _bindingComponent, android.view.View _root, int _localFieldCount, powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.DashedCircleView mainSyncCircle) {
        super(_bindingComponent, _root, _localFieldCount);
        this.mainSyncCircle = mainSyncCircle;
    }

    public powerwatch.matrix.com.pwgen2android.main.dashboard.sync.SyncViewModel getViewModel() {
        return this.mViewModel;
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentSyncBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentSyncBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentSyncBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_sync, root, attachToRoot, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentSyncBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentSyncBinding inflate(android.view.LayoutInflater inflater, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentSyncBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_sync, null, false, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentSyncBinding bind(android.view.View view) {
        return bind(view, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentSyncBinding bind(android.view.View view, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentSyncBinding) bind(component, view, powerwatch.matrix.com.pwgen2android.R.layout.fragment_sync);
    }
}
