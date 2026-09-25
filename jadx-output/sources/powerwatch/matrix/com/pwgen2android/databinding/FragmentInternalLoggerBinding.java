package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentInternalLoggerBinding extends androidx.databinding.ViewDataBinding {
    public final android.widget.ImageView backButton;
    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.MultiSelectionSpinner levelSelection;
    public final androidx.recyclerview.widget.RecyclerView logsList;

    @androidx.databinding.Bindable
    protected powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.InternalLoggerViewModel mViewModel;
    public final androidx.appcompat.widget.AppCompatButton scrollButton;
    public final android.widget.ImageView shareButton;
    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.MultiSelectionSpinner tagSelection;
    public final android.widget.TextView toolbarTitle;

    public abstract void setViewModel(powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.InternalLoggerViewModel viewModel);

    protected FragmentInternalLoggerBinding(java.lang.Object _bindingComponent, android.view.View _root, int _localFieldCount, android.widget.ImageView backButton, powerwatch.matrix.com.pwgen2android.shared.ui.views.MultiSelectionSpinner levelSelection, androidx.recyclerview.widget.RecyclerView logsList, androidx.appcompat.widget.AppCompatButton scrollButton, android.widget.ImageView shareButton, powerwatch.matrix.com.pwgen2android.shared.ui.views.MultiSelectionSpinner tagSelection, android.widget.TextView toolbarTitle) {
        super(_bindingComponent, _root, _localFieldCount);
        this.backButton = backButton;
        this.levelSelection = levelSelection;
        this.logsList = logsList;
        this.scrollButton = scrollButton;
        this.shareButton = shareButton;
        this.tagSelection = tagSelection;
        this.toolbarTitle = toolbarTitle;
    }

    public powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.InternalLoggerViewModel getViewModel() {
        return this.mViewModel;
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentInternalLoggerBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentInternalLoggerBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentInternalLoggerBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_internal_logger, root, attachToRoot, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentInternalLoggerBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentInternalLoggerBinding inflate(android.view.LayoutInflater inflater, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentInternalLoggerBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_internal_logger, null, false, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentInternalLoggerBinding bind(android.view.View view) {
        return bind(view, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentInternalLoggerBinding bind(android.view.View view, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentInternalLoggerBinding) bind(component, view, powerwatch.matrix.com.pwgen2android.R.layout.fragment_internal_logger);
    }
}
