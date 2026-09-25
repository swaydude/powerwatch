package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ActivityPairingBinding extends androidx.databinding.ViewDataBinding {

    @androidx.databinding.Bindable
    protected powerwatch.matrix.com.pwgen2android.pair.PairingActivityViewModel mViewModel;
    public final android.widget.FrameLayout pairingFragmentContainer;

    public abstract void setViewModel(powerwatch.matrix.com.pwgen2android.pair.PairingActivityViewModel viewModel);

    protected ActivityPairingBinding(java.lang.Object _bindingComponent, android.view.View _root, int _localFieldCount, android.widget.FrameLayout pairingFragmentContainer) {
        super(_bindingComponent, _root, _localFieldCount);
        this.pairingFragmentContainer = pairingFragmentContainer;
    }

    public powerwatch.matrix.com.pwgen2android.pair.PairingActivityViewModel getViewModel() {
        return this.mViewModel;
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.ActivityPairingBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.ActivityPairingBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.ActivityPairingBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.activity_pairing, root, attachToRoot, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.ActivityPairingBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.ActivityPairingBinding inflate(android.view.LayoutInflater inflater, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.ActivityPairingBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.activity_pairing, null, false, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.ActivityPairingBinding bind(android.view.View view) {
        return bind(view, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.ActivityPairingBinding bind(android.view.View view, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.ActivityPairingBinding) bind(component, view, powerwatch.matrix.com.pwgen2android.R.layout.activity_pairing);
    }
}
