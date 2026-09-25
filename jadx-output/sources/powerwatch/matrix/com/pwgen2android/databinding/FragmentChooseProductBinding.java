package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentChooseProductBinding extends androidx.databinding.ViewDataBinding {
    public final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableButton buttonChooseWatch;

    @androidx.databinding.Bindable
    protected powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.ChooseProductViewModel mViewModel;
    public final androidx.viewpager.widget.ViewPager productsViewPager;
    public final android.widget.RadioGroup radioGroup;

    public abstract void setViewModel(powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.ChooseProductViewModel viewModel);

    protected FragmentChooseProductBinding(java.lang.Object _bindingComponent, android.view.View _root, int _localFieldCount, powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableButton buttonChooseWatch, androidx.viewpager.widget.ViewPager productsViewPager, android.widget.RadioGroup radioGroup) {
        super(_bindingComponent, _root, _localFieldCount);
        this.buttonChooseWatch = buttonChooseWatch;
        this.productsViewPager = productsViewPager;
        this.radioGroup = radioGroup;
    }

    public powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.ChooseProductViewModel getViewModel() {
        return this.mViewModel;
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentChooseProductBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentChooseProductBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentChooseProductBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_choose_product, root, attachToRoot, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentChooseProductBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentChooseProductBinding inflate(android.view.LayoutInflater inflater, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentChooseProductBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_choose_product, null, false, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentChooseProductBinding bind(android.view.View view) {
        return bind(view, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentChooseProductBinding bind(android.view.View view, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentChooseProductBinding) bind(component, view, powerwatch.matrix.com.pwgen2android.R.layout.fragment_choose_product);
    }
}
