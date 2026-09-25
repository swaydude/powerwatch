package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentGen1PairingBinding extends androidx.databinding.ViewDataBinding {
    public final androidx.recyclerview.widget.RecyclerView devicesList;

    @androidx.databinding.Bindable
    protected powerwatch.matrix.com.pwgen2android.pair.ui.gen1.Gen1PairingViewModel mViewModel;

    public abstract void setViewModel(powerwatch.matrix.com.pwgen2android.pair.ui.gen1.Gen1PairingViewModel viewModel);

    protected FragmentGen1PairingBinding(java.lang.Object _bindingComponent, android.view.View _root, int _localFieldCount, androidx.recyclerview.widget.RecyclerView devicesList) {
        super(_bindingComponent, _root, _localFieldCount);
        this.devicesList = devicesList;
    }

    public powerwatch.matrix.com.pwgen2android.pair.ui.gen1.Gen1PairingViewModel getViewModel() {
        return this.mViewModel;
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentGen1PairingBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentGen1PairingBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentGen1PairingBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_gen1_pairing, root, attachToRoot, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentGen1PairingBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentGen1PairingBinding inflate(android.view.LayoutInflater inflater, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentGen1PairingBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_gen1_pairing, null, false, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentGen1PairingBinding bind(android.view.View view) {
        return bind(view, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentGen1PairingBinding bind(android.view.View view, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentGen1PairingBinding) bind(component, view, powerwatch.matrix.com.pwgen2android.R.layout.fragment_gen1_pairing);
    }
}
