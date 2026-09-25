package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public class DialogBadPlacementBindingImpl extends powerwatch.matrix.com.pwgen2android.databinding.DialogBadPlacementBinding {
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final android.util.SparseIntArray sViewsWithIds = null;
    private long mDirtyFlags;
    private powerwatch.matrix.com.pwgen2android.databinding.DialogBadPlacementBindingImpl.OnClickListenerImpl mViewModelOnCancelClickedAndroidViewViewOnClickListener;
    private final android.widget.LinearLayout mboundView0;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView1;

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int localFieldId, java.lang.Object object, int fieldId) {
        return false;
    }

    public DialogBadPlacementBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }

    private DialogBadPlacementBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root, java.lang.Object[] bindings) {
        super(bindingComponent, root, 0);
        this.mDirtyFlags = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) bindings[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[1];
        this.mboundView1 = fontableTextView;
        fontableTextView.setTag(null);
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
        setViewModel((powerwatch.matrix.com.pwgen2android.dialog.BadPlacementDialogVM) variable);
        return true;
    }

    @Override // powerwatch.matrix.com.pwgen2android.databinding.DialogBadPlacementBinding
    public void setViewModel(powerwatch.matrix.com.pwgen2android.dialog.BadPlacementDialogVM ViewModel) {
        this.mViewModel = ViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(1);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        powerwatch.matrix.com.pwgen2android.databinding.DialogBadPlacementBindingImpl.OnClickListenerImpl value = null;
        powerwatch.matrix.com.pwgen2android.dialog.BadPlacementDialogVM badPlacementDialogVM = this.mViewModel;
        long j2 = j & 3;
        if (j2 != 0 && badPlacementDialogVM != null) {
            powerwatch.matrix.com.pwgen2android.databinding.DialogBadPlacementBindingImpl.OnClickListenerImpl onClickListenerImpl = this.mViewModelOnCancelClickedAndroidViewViewOnClickListener;
            if (onClickListenerImpl == null) {
                onClickListenerImpl = new powerwatch.matrix.com.pwgen2android.databinding.DialogBadPlacementBindingImpl.OnClickListenerImpl();
                this.mViewModelOnCancelClickedAndroidViewViewOnClickListener = onClickListenerImpl;
            }
            value = onClickListenerImpl.setValue(badPlacementDialogVM);
        }
        if (j2 != 0) {
            this.mboundView1.setOnClickListener(value);
        }
    }

    public static class OnClickListenerImpl implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.dialog.BadPlacementDialogVM value;

        public powerwatch.matrix.com.pwgen2android.databinding.DialogBadPlacementBindingImpl.OnClickListenerImpl setValue(powerwatch.matrix.com.pwgen2android.dialog.BadPlacementDialogVM value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onCancelClicked(arg0);
        }
    }
}
