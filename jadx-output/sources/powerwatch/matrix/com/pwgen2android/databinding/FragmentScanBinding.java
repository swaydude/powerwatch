package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentScanBinding extends androidx.databinding.ViewDataBinding {
    public final powerwatch.matrix.com.pwgen2android.pair.camera.CameraPreview cameraPreview;
    public final powerwatch.matrix.com.pwgen2android.pair.camera.OverlayView cicleOverlay;
    public final powerwatch.matrix.com.pwgen2android.pair.camera.CustomTextView dashed;

    @androidx.databinding.Bindable
    protected powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRPairingViewModel mViewModel;
    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mainTextView;
    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView unableToScanText;

    public abstract void setViewModel(powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRPairingViewModel viewModel);

    protected FragmentScanBinding(java.lang.Object _bindingComponent, android.view.View _root, int _localFieldCount, powerwatch.matrix.com.pwgen2android.pair.camera.CameraPreview cameraPreview, powerwatch.matrix.com.pwgen2android.pair.camera.OverlayView cicleOverlay, powerwatch.matrix.com.pwgen2android.pair.camera.CustomTextView dashed, powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mainTextView, powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView unableToScanText) {
        super(_bindingComponent, _root, _localFieldCount);
        this.cameraPreview = cameraPreview;
        this.cicleOverlay = cicleOverlay;
        this.dashed = dashed;
        this.mainTextView = mainTextView;
        this.unableToScanText = unableToScanText;
    }

    public powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRPairingViewModel getViewModel() {
        return this.mViewModel;
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentScanBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentScanBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentScanBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_scan, root, attachToRoot, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentScanBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentScanBinding inflate(android.view.LayoutInflater inflater, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentScanBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_scan, null, false, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentScanBinding bind(android.view.View view) {
        return bind(view, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentScanBinding bind(android.view.View view, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentScanBinding) bind(component, view, powerwatch.matrix.com.pwgen2android.R.layout.fragment_scan);
    }
}
