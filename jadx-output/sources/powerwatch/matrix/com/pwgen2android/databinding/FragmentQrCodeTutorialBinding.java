package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentQrCodeTutorialBinding extends androidx.databinding.ViewDataBinding {
    public final android.widget.ImageView backButton;
    public final android.widget.RelativeLayout headerLayout;

    @androidx.databinding.Bindable
    protected powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRCodeViewModel mViewModel;
    public final android.widget.TextView stepOneBody;
    public final android.widget.TextView stepOneTitle;
    public final android.widget.TextView stepThreeBody;
    public final android.widget.TextView stepThreeTitle;
    public final android.widget.TextView stepTwoBody;
    public final android.widget.TextView stepTwoTitle;

    public abstract void setViewModel(powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRCodeViewModel viewModel);

    protected FragmentQrCodeTutorialBinding(java.lang.Object _bindingComponent, android.view.View _root, int _localFieldCount, android.widget.ImageView backButton, android.widget.RelativeLayout headerLayout, android.widget.TextView stepOneBody, android.widget.TextView stepOneTitle, android.widget.TextView stepThreeBody, android.widget.TextView stepThreeTitle, android.widget.TextView stepTwoBody, android.widget.TextView stepTwoTitle) {
        super(_bindingComponent, _root, _localFieldCount);
        this.backButton = backButton;
        this.headerLayout = headerLayout;
        this.stepOneBody = stepOneBody;
        this.stepOneTitle = stepOneTitle;
        this.stepThreeBody = stepThreeBody;
        this.stepThreeTitle = stepThreeTitle;
        this.stepTwoBody = stepTwoBody;
        this.stepTwoTitle = stepTwoTitle;
    }

    public powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRCodeViewModel getViewModel() {
        return this.mViewModel;
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentQrCodeTutorialBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentQrCodeTutorialBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentQrCodeTutorialBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_qr_code_tutorial, root, attachToRoot, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentQrCodeTutorialBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentQrCodeTutorialBinding inflate(android.view.LayoutInflater inflater, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentQrCodeTutorialBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_qr_code_tutorial, null, false, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentQrCodeTutorialBinding bind(android.view.View view) {
        return bind(view, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentQrCodeTutorialBinding bind(android.view.View view, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentQrCodeTutorialBinding) bind(component, view, powerwatch.matrix.com.pwgen2android.R.layout.fragment_qr_code_tutorial);
    }
}
