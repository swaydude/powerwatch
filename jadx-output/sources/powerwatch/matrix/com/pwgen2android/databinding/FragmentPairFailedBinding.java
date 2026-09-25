package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentPairFailedBinding extends androidx.databinding.ViewDataBinding {
    public final android.widget.ImageView backButton;
    public final android.widget.ImageView centerImageView;

    @androidx.databinding.Bindable
    protected powerwatch.matrix.com.pwgen2android.pair.ui.PairFailedViewModel mViewModel;
    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableButton tryAgainButton;

    public abstract void setViewModel(powerwatch.matrix.com.pwgen2android.pair.ui.PairFailedViewModel viewModel);

    protected FragmentPairFailedBinding(java.lang.Object _bindingComponent, android.view.View _root, int _localFieldCount, android.widget.ImageView backButton, android.widget.ImageView centerImageView, powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableButton tryAgainButton) {
        super(_bindingComponent, _root, _localFieldCount);
        this.backButton = backButton;
        this.centerImageView = centerImageView;
        this.tryAgainButton = tryAgainButton;
    }

    public powerwatch.matrix.com.pwgen2android.pair.ui.PairFailedViewModel getViewModel() {
        return this.mViewModel;
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentPairFailedBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentPairFailedBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentPairFailedBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_pair_failed, root, attachToRoot, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentPairFailedBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentPairFailedBinding inflate(android.view.LayoutInflater inflater, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentPairFailedBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_pair_failed, null, false, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentPairFailedBinding bind(android.view.View view) {
        return bind(view, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentPairFailedBinding bind(android.view.View view, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentPairFailedBinding) bind(component, view, powerwatch.matrix.com.pwgen2android.R.layout.fragment_pair_failed);
    }
}
