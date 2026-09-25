package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentDeviceBannerBinding extends androidx.databinding.ViewDataBinding {
    public final android.widget.ImageView bannerImage;

    @androidx.databinding.Bindable
    protected powerwatch.matrix.com.pwgen2android.shared.BaseViewModel mViewModel;
    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView topInfo;

    public abstract void setViewModel(powerwatch.matrix.com.pwgen2android.shared.BaseViewModel viewModel);

    protected FragmentDeviceBannerBinding(java.lang.Object _bindingComponent, android.view.View _root, int _localFieldCount, android.widget.ImageView bannerImage, powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView topInfo) {
        super(_bindingComponent, _root, _localFieldCount);
        this.bannerImage = bannerImage;
        this.topInfo = topInfo;
    }

    public powerwatch.matrix.com.pwgen2android.shared.BaseViewModel getViewModel() {
        return this.mViewModel;
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentDeviceBannerBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentDeviceBannerBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentDeviceBannerBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_device_banner, root, attachToRoot, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentDeviceBannerBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentDeviceBannerBinding inflate(android.view.LayoutInflater inflater, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentDeviceBannerBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_device_banner, null, false, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentDeviceBannerBinding bind(android.view.View view) {
        return bind(view, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentDeviceBannerBinding bind(android.view.View view, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentDeviceBannerBinding) bind(component, view, powerwatch.matrix.com.pwgen2android.R.layout.fragment_device_banner);
    }
}
