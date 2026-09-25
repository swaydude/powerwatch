package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public class FragmentEnterPinCodeBindingImpl extends powerwatch.matrix.com.pwgen2android.databinding.FragmentEnterPinCodeBinding {
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final android.util.SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentEnterPinCodeBindingImpl.OnClickListenerImpl mViewModelOnCannotFindQRCodeClickedAndroidViewViewOnClickListener;
    private final android.widget.RelativeLayout mboundView0;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView1;

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int localFieldId, java.lang.Object object, int fieldId) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.code_edit_text, 2);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.enter_pairing_code_label, 3);
    }

    public FragmentEnterPinCodeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }

    private FragmentEnterPinCodeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root, java.lang.Object[] bindings) {
        super(bindingComponent, root, 0, (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableEditText) bindings[2], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[3]);
        this.mDirtyFlags = -1L;
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0 = relativeLayout;
        relativeLayout.setTag(null);
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
        setViewModel((powerwatch.matrix.com.pwgen2android.pair.ui.gen2.EnterPinCodeViewModel) variable);
        return true;
    }

    @Override // powerwatch.matrix.com.pwgen2android.databinding.FragmentEnterPinCodeBinding
    public void setViewModel(powerwatch.matrix.com.pwgen2android.pair.ui.gen2.EnterPinCodeViewModel ViewModel) {
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
        powerwatch.matrix.com.pwgen2android.pair.ui.gen2.EnterPinCodeViewModel enterPinCodeViewModel = this.mViewModel;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentEnterPinCodeBindingImpl.OnClickListenerImpl value = null;
        long j2 = j & 3;
        if (j2 != 0 && enterPinCodeViewModel != null) {
            powerwatch.matrix.com.pwgen2android.databinding.FragmentEnterPinCodeBindingImpl.OnClickListenerImpl onClickListenerImpl = this.mViewModelOnCannotFindQRCodeClickedAndroidViewViewOnClickListener;
            if (onClickListenerImpl == null) {
                onClickListenerImpl = new powerwatch.matrix.com.pwgen2android.databinding.FragmentEnterPinCodeBindingImpl.OnClickListenerImpl();
                this.mViewModelOnCannotFindQRCodeClickedAndroidViewViewOnClickListener = onClickListenerImpl;
            }
            value = onClickListenerImpl.setValue(enterPinCodeViewModel);
        }
        if (j2 != 0) {
            this.mboundView1.setOnClickListener(value);
        }
    }

    public static class OnClickListenerImpl implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.pair.ui.gen2.EnterPinCodeViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentEnterPinCodeBindingImpl.OnClickListenerImpl setValue(powerwatch.matrix.com.pwgen2android.pair.ui.gen2.EnterPinCodeViewModel value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onCannotFindQRCodeClicked(arg0);
        }
    }
}
