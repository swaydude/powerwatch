package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentPermissionInfoBinding extends androidx.databinding.ViewDataBinding {
    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableButton loginButton;

    @androidx.databinding.Bindable
    protected powerwatch.matrix.com.pwgen2android.setup.permissions.PermissionsInfoViewModel mViewModel;
    public final androidx.recyclerview.widget.RecyclerView permissionsList;

    public abstract void setViewModel(powerwatch.matrix.com.pwgen2android.setup.permissions.PermissionsInfoViewModel viewModel);

    protected FragmentPermissionInfoBinding(java.lang.Object _bindingComponent, android.view.View _root, int _localFieldCount, powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableButton loginButton, androidx.recyclerview.widget.RecyclerView permissionsList) {
        super(_bindingComponent, _root, _localFieldCount);
        this.loginButton = loginButton;
        this.permissionsList = permissionsList;
    }

    public powerwatch.matrix.com.pwgen2android.setup.permissions.PermissionsInfoViewModel getViewModel() {
        return this.mViewModel;
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentPermissionInfoBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentPermissionInfoBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentPermissionInfoBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_permission_info, root, attachToRoot, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentPermissionInfoBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentPermissionInfoBinding inflate(android.view.LayoutInflater inflater, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentPermissionInfoBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_permission_info, null, false, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentPermissionInfoBinding bind(android.view.View view) {
        return bind(view, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentPermissionInfoBinding bind(android.view.View view, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentPermissionInfoBinding) bind(component, view, powerwatch.matrix.com.pwgen2android.R.layout.fragment_permission_info);
    }
}
