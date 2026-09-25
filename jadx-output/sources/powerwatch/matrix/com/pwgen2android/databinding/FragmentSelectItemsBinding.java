package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentSelectItemsBinding extends androidx.databinding.ViewDataBinding {
    public final androidx.recyclerview.widget.RecyclerView languageList;

    @androidx.databinding.Bindable
    protected powerwatch.matrix.com.pwgen2android.setup.language.SelectItemsViewModel mViewModel;

    public abstract void setViewModel(powerwatch.matrix.com.pwgen2android.setup.language.SelectItemsViewModel viewModel);

    protected FragmentSelectItemsBinding(java.lang.Object _bindingComponent, android.view.View _root, int _localFieldCount, androidx.recyclerview.widget.RecyclerView languageList) {
        super(_bindingComponent, _root, _localFieldCount);
        this.languageList = languageList;
    }

    public powerwatch.matrix.com.pwgen2android.setup.language.SelectItemsViewModel getViewModel() {
        return this.mViewModel;
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentSelectItemsBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentSelectItemsBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentSelectItemsBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_select_items, root, attachToRoot, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentSelectItemsBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentSelectItemsBinding inflate(android.view.LayoutInflater inflater, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentSelectItemsBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_select_items, null, false, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentSelectItemsBinding bind(android.view.View view) {
        return bind(view, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentSelectItemsBinding bind(android.view.View view, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentSelectItemsBinding) bind(component, view, powerwatch.matrix.com.pwgen2android.R.layout.fragment_select_items);
    }
}
