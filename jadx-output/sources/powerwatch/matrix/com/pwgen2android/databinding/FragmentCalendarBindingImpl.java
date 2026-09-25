package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public class FragmentCalendarBindingImpl extends powerwatch.matrix.com.pwgen2android.databinding.FragmentCalendarBinding {
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
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.day_one, 1);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.day_two, 2);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.day_three, 3);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.day_four, 4);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.day_five, 5);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.day_six, 6);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.day_seven, 7);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.calendar_view, 8);
    }

    public FragmentCalendarBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }

    private FragmentCalendarBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root, java.lang.Object[] bindings) {
        super(bindingComponent, root, 0, (powerwatch.matrix.com.pwgen2android.shared.ui.calendar.CalendarView) bindings[8], (android.widget.Button) bindings[5], (android.widget.Button) bindings[4], (android.widget.Button) bindings[1], (android.widget.Button) bindings[7], (android.widget.Button) bindings[6], (android.widget.Button) bindings[3], (android.widget.Button) bindings[2]);
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
        setViewModel((powerwatch.matrix.com.pwgen2android.main.dashboard.calendar.CalendarViewModel) variable);
        return true;
    }

    @Override // powerwatch.matrix.com.pwgen2android.databinding.FragmentCalendarBinding
    public void setViewModel(powerwatch.matrix.com.pwgen2android.main.dashboard.calendar.CalendarViewModel ViewModel) {
        this.mViewModel = ViewModel;
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        synchronized (this) {
            this.mDirtyFlags = 0L;
        }
    }
}
