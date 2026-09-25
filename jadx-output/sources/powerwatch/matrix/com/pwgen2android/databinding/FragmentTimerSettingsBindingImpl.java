package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public class FragmentTimerSettingsBindingImpl extends powerwatch.matrix.com.pwgen2android.databinding.FragmentTimerSettingsBinding {
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final android.util.SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final android.widget.LinearLayout mboundView0;

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int localFieldId, java.lang.Object object, int fieldId) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.hour_picker, 1);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.minute_picker, 2);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.seconds_picker, 3);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.reset_view, 4);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.start_view, 5);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.pause_view, 6);
    }

    public FragmentTimerSettingsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }

    private FragmentTimerSettingsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root, java.lang.Object[] bindings) {
        super(bindingComponent, root, 0, (com.super_rabbit.wheel_picker.WheelPicker) bindings[1], (com.super_rabbit.wheel_picker.WheelPicker) bindings[2], (android.widget.TextView) bindings[6], (android.widget.TextView) bindings[4], (com.super_rabbit.wheel_picker.WheelPicker) bindings[3], (android.widget.TextView) bindings[5]);
        this.mDirtyFlags = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) bindings[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 2L;
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
        setViewModel((powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerSettingsVM) variable);
        return true;
    }

    @Override // powerwatch.matrix.com.pwgen2android.databinding.FragmentTimerSettingsBinding
    public void setViewModel(powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerSettingsVM ViewModel) {
        this.mViewModel = ViewModel;
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        synchronized (this) {
            this.mDirtyFlags = 0L;
        }
    }
}
