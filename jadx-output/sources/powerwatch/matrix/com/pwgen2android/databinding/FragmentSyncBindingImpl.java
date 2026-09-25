package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public class FragmentSyncBindingImpl extends powerwatch.matrix.com.pwgen2android.databinding.FragmentSyncBinding {
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final android.util.SparseIntArray sViewsWithIds = null;
    private long mDirtyFlags;
    private final android.widget.FrameLayout mboundView0;
    private final android.widget.TextView mboundView2;

    public FragmentSyncBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }

    private FragmentSyncBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root, java.lang.Object[] bindings) {
        super(bindingComponent, root, 2, (powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.DashedCircleView) bindings[1]);
        this.mDirtyFlags = -1L;
        this.mainSyncCircle.setTag(null);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) bindings[0];
        this.mboundView0 = frameLayout;
        frameLayout.setTag(null);
        android.widget.TextView textView = (android.widget.TextView) bindings[2];
        this.mboundView2 = textView;
        textView.setTag(null);
        setRootTag(root);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 8L;
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
        setViewModel((powerwatch.matrix.com.pwgen2android.main.dashboard.sync.SyncViewModel) variable);
        return true;
    }

    @Override // powerwatch.matrix.com.pwgen2android.databinding.FragmentSyncBinding
    public void setViewModel(powerwatch.matrix.com.pwgen2android.main.dashboard.sync.SyncViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        notifyPropertyChanged(1);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int localFieldId, java.lang.Object object, int fieldId) {
        if (localFieldId == 0) {
            return onChangeViewModelSyncProgressText((androidx.databinding.ObservableField) object, fieldId);
        }
        if (localFieldId != 1) {
            return false;
        }
        return onChangeViewModelSyncProgressField((androidx.databinding.ObservableField) object, fieldId);
    }

    private boolean onChangeViewModelSyncProgressText(androidx.databinding.ObservableField<java.lang.String> ViewModelSyncProgressText, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeViewModelSyncProgressField(androidx.databinding.ObservableField<java.lang.Integer> ViewModelSyncProgressField, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0031  */
    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j;
        java.lang.String str;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        powerwatch.matrix.com.pwgen2android.main.dashboard.sync.SyncViewModel syncViewModel = this.mViewModel;
        androidx.databinding.ObservableField<java.lang.Integer> syncProgressField = null;
        if ((15 & j) != 0) {
            if ((j & 13) == 0) {
                str = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> syncProgressText = syncViewModel != null ? syncViewModel.getSyncProgressText() : null;
                updateRegistration(0, syncProgressText);
                if (syncProgressText != null) {
                    str = syncProgressText.get();
                } else {
                    str = null;
                }
            }
            if ((j & 14) != 0) {
                syncProgressField = syncViewModel != null ? syncViewModel.getSyncProgressField() : null;
                updateRegistration(1, syncProgressField);
                if (syncProgressField != null) {
                    syncProgressField.get();
                }
            }
        } else {
            str = null;
        }
        if ((14 & j) != 0) {
            this.mainSyncCircle.setCircleValue(syncProgressField);
        }
        if ((j & 13) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, str);
        }
    }
}
