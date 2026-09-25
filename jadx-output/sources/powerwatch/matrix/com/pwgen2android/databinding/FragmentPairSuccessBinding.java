package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentPairSuccessBinding extends androidx.databinding.ViewDataBinding {
    public final android.widget.ImageView centerImageView;

    @androidx.databinding.Bindable
    protected powerwatch.matrix.com.pwgen2android.pair.ui.PairingSuccessViewModel mViewModel;
    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableButton tryAgainButton;

    public abstract void setViewModel(powerwatch.matrix.com.pwgen2android.pair.ui.PairingSuccessViewModel viewModel);

    protected FragmentPairSuccessBinding(java.lang.Object _bindingComponent, android.view.View _root, int _localFieldCount, android.widget.ImageView centerImageView, powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableButton tryAgainButton) {
        super(_bindingComponent, _root, _localFieldCount);
        this.centerImageView = centerImageView;
        this.tryAgainButton = tryAgainButton;
    }

    public powerwatch.matrix.com.pwgen2android.pair.ui.PairingSuccessViewModel getViewModel() {
        return this.mViewModel;
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentPairSuccessBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentPairSuccessBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentPairSuccessBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_pair_success, root, attachToRoot, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentPairSuccessBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentPairSuccessBinding inflate(android.view.LayoutInflater inflater, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentPairSuccessBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_pair_success, null, false, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentPairSuccessBinding bind(android.view.View view) {
        return bind(view, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentPairSuccessBinding bind(android.view.View view, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentPairSuccessBinding) bind(component, view, powerwatch.matrix.com.pwgen2android.R.layout.fragment_pair_success);
    }
}
