package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DialogBadPlacementBinding extends androidx.databinding.ViewDataBinding {

    @androidx.databinding.Bindable
    protected powerwatch.matrix.com.pwgen2android.dialog.BadPlacementDialogVM mViewModel;

    public abstract void setViewModel(powerwatch.matrix.com.pwgen2android.dialog.BadPlacementDialogVM viewModel);

    protected DialogBadPlacementBinding(java.lang.Object _bindingComponent, android.view.View _root, int _localFieldCount) {
        super(_bindingComponent, _root, _localFieldCount);
    }

    public powerwatch.matrix.com.pwgen2android.dialog.BadPlacementDialogVM getViewModel() {
        return this.mViewModel;
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.DialogBadPlacementBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.DialogBadPlacementBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.DialogBadPlacementBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.dialog_bad_placement, root, attachToRoot, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.DialogBadPlacementBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.DialogBadPlacementBinding inflate(android.view.LayoutInflater inflater, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.DialogBadPlacementBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.dialog_bad_placement, null, false, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.DialogBadPlacementBinding bind(android.view.View view) {
        return bind(view, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.DialogBadPlacementBinding bind(android.view.View view, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.DialogBadPlacementBinding) bind(component, view, powerwatch.matrix.com.pwgen2android.R.layout.dialog_bad_placement);
    }
}
