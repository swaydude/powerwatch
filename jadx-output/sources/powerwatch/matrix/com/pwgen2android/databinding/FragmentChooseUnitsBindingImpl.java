package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public class FragmentChooseUnitsBindingImpl extends powerwatch.matrix.com.pwgen2android.databinding.FragmentChooseUnitsBinding {
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final android.util.SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentChooseUnitsBindingImpl.OnClickListenerImpl1 mViewModelOnImperialCheckedAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentChooseUnitsBindingImpl.OnClickListenerImpl mViewModelOnMetricCheckedAndroidViewViewOnClickListener;
    private final android.widget.LinearLayout mboundView0;
    private final android.widget.LinearLayout mboundView1;
    private final android.widget.LinearLayout mboundView3;

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.unit_type_metric, 5);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.unit_type_imperial, 6);
    }

    public FragmentChooseUnitsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }

    private FragmentChooseUnitsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root, java.lang.Object[] bindings) {
        super(bindingComponent, root, 1, (android.widget.RadioButton) bindings[4], (android.widget.RadioButton) bindings[2], (android.widget.TextView) bindings[6], (android.widget.TextView) bindings[5]);
        this.mDirtyFlags = -1L;
        this.checkedButtonImperial.setTag(null);
        this.checkedButtonMetric.setTag(null);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) bindings[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag(null);
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1 = linearLayout2;
        linearLayout2.setTag(null);
        android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) bindings[3];
        this.mboundView3 = linearLayout3;
        linearLayout3.setTag(null);
        setRootTag(root);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 4L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.mDirtyFlags != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, java.lang.Object variable) {
        if (1 != variableId) {
            return false;
        }
        setViewModel((powerwatch.matrix.com.pwgen2android.setup.units.ChooseUnitsViewModel) variable);
        return true;
    }

    @Override // powerwatch.matrix.com.pwgen2android.databinding.FragmentChooseUnitsBinding
    public void setViewModel(powerwatch.matrix.com.pwgen2android.setup.units.ChooseUnitsViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(1);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int localFieldId, java.lang.Object object, int fieldId) {
        if (localFieldId != 0) {
            return false;
        }
        return onChangeViewModelMetricChecked((androidx.databinding.ObservableField) object, fieldId);
    }

    private boolean onChangeViewModelMetricChecked(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelMetricChecked, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentChooseUnitsBindingImpl.OnClickListenerImpl1 value;
        boolean z;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentChooseUnitsBindingImpl.OnClickListenerImpl value2;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        powerwatch.matrix.com.pwgen2android.setup.units.ChooseUnitsViewModel chooseUnitsViewModel = this.mViewModel;
        long j2 = 7 & j;
        boolean zSafeUnbox = false;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentChooseUnitsBindingImpl.OnClickListenerImpl onClickListenerImpl = null;
        if (j2 != 0) {
            if ((j & 6) == 0 || chooseUnitsViewModel == null) {
                value2 = null;
                value = null;
            } else {
                powerwatch.matrix.com.pwgen2android.databinding.FragmentChooseUnitsBindingImpl.OnClickListenerImpl onClickListenerImpl2 = this.mViewModelOnMetricCheckedAndroidViewViewOnClickListener;
                if (onClickListenerImpl2 == null) {
                    onClickListenerImpl2 = new powerwatch.matrix.com.pwgen2android.databinding.FragmentChooseUnitsBindingImpl.OnClickListenerImpl();
                    this.mViewModelOnMetricCheckedAndroidViewViewOnClickListener = onClickListenerImpl2;
                }
                value2 = onClickListenerImpl2.setValue(chooseUnitsViewModel);
                powerwatch.matrix.com.pwgen2android.databinding.FragmentChooseUnitsBindingImpl.OnClickListenerImpl1 onClickListenerImpl1 = this.mViewModelOnImperialCheckedAndroidViewViewOnClickListener;
                if (onClickListenerImpl1 == null) {
                    onClickListenerImpl1 = new powerwatch.matrix.com.pwgen2android.databinding.FragmentChooseUnitsBindingImpl.OnClickListenerImpl1();
                    this.mViewModelOnImperialCheckedAndroidViewViewOnClickListener = onClickListenerImpl1;
                }
                value = onClickListenerImpl1.setValue(chooseUnitsViewModel);
            }
            androidx.databinding.ObservableField<java.lang.Boolean> metricChecked = chooseUnitsViewModel != null ? chooseUnitsViewModel.getMetricChecked() : null;
            updateRegistration(0, metricChecked);
            boolean zSafeUnbox2 = androidx.databinding.ViewDataBinding.safeUnbox(metricChecked != null ? metricChecked.get() : null);
            onClickListenerImpl = value2;
            zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(java.lang.Boolean.valueOf(!zSafeUnbox2));
            z = zSafeUnbox2;
        } else {
            value = null;
            z = false;
        }
        if (j2 != 0) {
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.checkedButtonImperial, zSafeUnbox);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.checkedButtonMetric, z);
        }
        if ((j & 6) != 0) {
            this.mboundView1.setOnClickListener(onClickListenerImpl);
            this.mboundView3.setOnClickListener(value);
        }
    }

    public static class OnClickListenerImpl implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.setup.units.ChooseUnitsViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentChooseUnitsBindingImpl.OnClickListenerImpl setValue(powerwatch.matrix.com.pwgen2android.setup.units.ChooseUnitsViewModel value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onMetricChecked(arg0);
        }
    }

    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.setup.units.ChooseUnitsViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentChooseUnitsBindingImpl.OnClickListenerImpl1 setValue(powerwatch.matrix.com.pwgen2android.setup.units.ChooseUnitsViewModel value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onImperialChecked(arg0);
        }
    }
}
