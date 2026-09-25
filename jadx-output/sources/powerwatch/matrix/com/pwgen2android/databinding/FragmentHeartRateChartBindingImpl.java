package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public class FragmentHeartRateChartBindingImpl extends powerwatch.matrix.com.pwgen2android.databinding.FragmentHeartRateChartBinding {
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final android.util.SparseIntArray sViewsWithIds = null;
    private long mDirtyFlags;
    private final android.widget.FrameLayout mboundView0;

    public FragmentHeartRateChartBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }

    private FragmentHeartRateChartBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root, java.lang.Object[] bindings) {
        super(bindingComponent, root, 1, (com.github.mikephil.charting.charts.LineChart) bindings[1]);
        this.mDirtyFlags = -1L;
        this.heartRateChart.setTag(null);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) bindings[0];
        this.mboundView0 = frameLayout;
        frameLayout.setTag(null);
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
        setViewModel((powerwatch.matrix.com.pwgen2android.shared.ui.charts.heartrate.ActivityHeartRateViewModel) variable);
        return true;
    }

    @Override // powerwatch.matrix.com.pwgen2android.databinding.FragmentHeartRateChartBinding
    public void setViewModel(powerwatch.matrix.com.pwgen2android.shared.ui.charts.heartrate.ActivityHeartRateViewModel ViewModel) {
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
        return onChangeViewModelLinesData((androidx.databinding.ObservableField) object, fieldId);
    }

    private boolean onChangeViewModelLinesData(androidx.databinding.ObservableField<java.util.List<com.github.mikephil.charting.data.LineDataSet>> ViewModelLinesData, int fieldId) {
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
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        powerwatch.matrix.com.pwgen2android.shared.ui.charts.heartrate.ActivityHeartRateViewModel activityHeartRateViewModel = this.mViewModel;
        long j2 = j & 7;
        java.util.List<com.github.mikephil.charting.data.LineDataSet> list = null;
        if (j2 != 0) {
            androidx.databinding.ObservableField<java.util.List<com.github.mikephil.charting.data.LineDataSet>> linesData = activityHeartRateViewModel != null ? activityHeartRateViewModel.getLinesData() : null;
            updateRegistration(0, linesData);
            if (linesData != null) {
                list = linesData.get();
            }
        }
        if (j2 != 0) {
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.setLineData(this.heartRateChart, list);
        }
    }
}
