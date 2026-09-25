package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentControlViewBinding extends androidx.databinding.ViewDataBinding {

    @androidx.databinding.Bindable
    protected powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.control.ControlViewViewModel mViewModel;
    public final com.google.android.material.floatingactionbutton.FloatingActionButton playButton;

    public abstract void setViewModel(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.control.ControlViewViewModel viewModel);

    protected FragmentControlViewBinding(java.lang.Object _bindingComponent, android.view.View _root, int _localFieldCount, com.google.android.material.floatingactionbutton.FloatingActionButton playButton) {
        super(_bindingComponent, _root, _localFieldCount);
        this.playButton = playButton;
    }

    public powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.control.ControlViewViewModel getViewModel() {
        return this.mViewModel;
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentControlViewBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentControlViewBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentControlViewBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_control_view, root, attachToRoot, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentControlViewBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentControlViewBinding inflate(android.view.LayoutInflater inflater, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentControlViewBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_control_view, null, false, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentControlViewBinding bind(android.view.View view) {
        return bind(view, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentControlViewBinding bind(android.view.View view, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentControlViewBinding) bind(component, view, powerwatch.matrix.com.pwgen2android.R.layout.fragment_control_view);
    }
}
