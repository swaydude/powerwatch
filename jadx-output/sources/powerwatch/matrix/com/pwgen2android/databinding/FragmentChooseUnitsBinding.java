package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentChooseUnitsBinding extends androidx.databinding.ViewDataBinding {
    public final android.widget.RadioButton checkedButtonImperial;
    public final android.widget.RadioButton checkedButtonMetric;

    @androidx.databinding.Bindable
    protected powerwatch.matrix.com.pwgen2android.setup.units.ChooseUnitsViewModel mViewModel;
    public final android.widget.TextView unitTypeImperial;
    public final android.widget.TextView unitTypeMetric;

    public abstract void setViewModel(powerwatch.matrix.com.pwgen2android.setup.units.ChooseUnitsViewModel viewModel);

    protected FragmentChooseUnitsBinding(java.lang.Object _bindingComponent, android.view.View _root, int _localFieldCount, android.widget.RadioButton checkedButtonImperial, android.widget.RadioButton checkedButtonMetric, android.widget.TextView unitTypeImperial, android.widget.TextView unitTypeMetric) {
        super(_bindingComponent, _root, _localFieldCount);
        this.checkedButtonImperial = checkedButtonImperial;
        this.checkedButtonMetric = checkedButtonMetric;
        this.unitTypeImperial = unitTypeImperial;
        this.unitTypeMetric = unitTypeMetric;
    }

    public powerwatch.matrix.com.pwgen2android.setup.units.ChooseUnitsViewModel getViewModel() {
        return this.mViewModel;
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentChooseUnitsBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentChooseUnitsBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentChooseUnitsBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_choose_units, root, attachToRoot, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentChooseUnitsBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentChooseUnitsBinding inflate(android.view.LayoutInflater inflater, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentChooseUnitsBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_choose_units, null, false, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentChooseUnitsBinding bind(android.view.View view) {
        return bind(view, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentChooseUnitsBinding bind(android.view.View view, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentChooseUnitsBinding) bind(component, view, powerwatch.matrix.com.pwgen2android.R.layout.fragment_choose_units);
    }
}
