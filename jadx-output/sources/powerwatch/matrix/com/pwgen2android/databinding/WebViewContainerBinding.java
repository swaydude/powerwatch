package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public abstract class WebViewContainerBinding extends androidx.databinding.ViewDataBinding {

    @androidx.databinding.Bindable
    protected powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueViewModel mViewModel;
    public final android.widget.FrameLayout webViewContainer;

    public abstract void setViewModel(powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueViewModel viewModel);

    protected WebViewContainerBinding(java.lang.Object _bindingComponent, android.view.View _root, int _localFieldCount, android.widget.FrameLayout webViewContainer) {
        super(_bindingComponent, _root, _localFieldCount);
        this.webViewContainer = webViewContainer;
    }

    public powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueViewModel getViewModel() {
        return this.mViewModel;
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.WebViewContainerBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.WebViewContainerBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.WebViewContainerBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.web_view_container, root, attachToRoot, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.WebViewContainerBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.WebViewContainerBinding inflate(android.view.LayoutInflater inflater, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.WebViewContainerBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.web_view_container, null, false, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.WebViewContainerBinding bind(android.view.View view) {
        return bind(view, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.WebViewContainerBinding bind(android.view.View view, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.WebViewContainerBinding) bind(component, view, powerwatch.matrix.com.pwgen2android.R.layout.web_view_container);
    }
}
