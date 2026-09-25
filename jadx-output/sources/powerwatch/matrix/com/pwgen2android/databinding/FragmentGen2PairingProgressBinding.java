package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentGen2PairingProgressBinding extends androidx.databinding.ViewDataBinding {

    @androidx.databinding.Bindable
    protected powerwatch.matrix.com.pwgen2android.pair.ui.gen2.Gen2PairingProgressViewModel mViewModel;
    public final powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.DashedCircleView mainPairingCircle;

    public abstract void setViewModel(powerwatch.matrix.com.pwgen2android.pair.ui.gen2.Gen2PairingProgressViewModel viewModel);

    protected FragmentGen2PairingProgressBinding(java.lang.Object _bindingComponent, android.view.View _root, int _localFieldCount, powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.DashedCircleView mainPairingCircle) {
        super(_bindingComponent, _root, _localFieldCount);
        this.mainPairingCircle = mainPairingCircle;
    }

    public powerwatch.matrix.com.pwgen2android.pair.ui.gen2.Gen2PairingProgressViewModel getViewModel() {
        return this.mViewModel;
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentGen2PairingProgressBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentGen2PairingProgressBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentGen2PairingProgressBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_gen2_pairing_progress, root, attachToRoot, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentGen2PairingProgressBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentGen2PairingProgressBinding inflate(android.view.LayoutInflater inflater, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentGen2PairingProgressBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_gen2_pairing_progress, null, false, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentGen2PairingProgressBinding bind(android.view.View view) {
        return bind(view, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentGen2PairingProgressBinding bind(android.view.View view, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentGen2PairingProgressBinding) bind(component, view, powerwatch.matrix.com.pwgen2android.R.layout.fragment_gen2_pairing_progress);
    }
}
