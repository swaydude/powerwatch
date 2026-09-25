package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public class FragmentSingleGoalEditBindingImpl extends powerwatch.matrix.com.pwgen2android.databinding.FragmentSingleGoalEditBinding {
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final android.util.SparseIntArray sViewsWithIds = null;
    private androidx.databinding.InverseBindingListener goalValueEditTextandroidTextAttrChanged;
    private long mDirtyFlags;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView2;
    private androidx.databinding.InverseBindingListener mboundView2androidTextAttrChanged;

    public FragmentSingleGoalEditBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }

    private FragmentSingleGoalEditBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root, java.lang.Object[] bindings) {
        super(bindingComponent, root, 2, (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableEditText) bindings[1], (android.widget.FrameLayout) bindings[0]);
        this.goalValueEditTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() { // from class: powerwatch.matrix.com.pwgen2android.databinding.FragmentSingleGoalEditBindingImpl.1
            @Override // androidx.databinding.InverseBindingListener
            public void onChange() {
                java.lang.String textString = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(powerwatch.matrix.com.pwgen2android.databinding.FragmentSingleGoalEditBindingImpl.this.goalValueEditText);
                powerwatch.matrix.com.pwgen2android.setup.goals.SingleGoalEditViewModel singleGoalEditViewModel = powerwatch.matrix.com.pwgen2android.databinding.FragmentSingleGoalEditBindingImpl.this.mViewModel;
                if (singleGoalEditViewModel != null) {
                    androidx.databinding.ObservableField<java.lang.String> valueField = singleGoalEditViewModel.getValueField();
                    if (valueField != null) {
                        valueField.set(textString);
                    }
                }
            }
        };
        this.mboundView2androidTextAttrChanged = new androidx.databinding.InverseBindingListener() { // from class: powerwatch.matrix.com.pwgen2android.databinding.FragmentSingleGoalEditBindingImpl.2
            @Override // androidx.databinding.InverseBindingListener
            public void onChange() {
                java.lang.String textString = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(powerwatch.matrix.com.pwgen2android.databinding.FragmentSingleGoalEditBindingImpl.this.mboundView2);
                powerwatch.matrix.com.pwgen2android.setup.goals.SingleGoalEditViewModel singleGoalEditViewModel = powerwatch.matrix.com.pwgen2android.databinding.FragmentSingleGoalEditBindingImpl.this.mViewModel;
                if (singleGoalEditViewModel != null) {
                    androidx.databinding.ObservableField<java.lang.String> valueUnitField = singleGoalEditViewModel.getValueUnitField();
                    if (valueUnitField != null) {
                        valueUnitField.set(textString);
                    }
                }
            }
        };
        this.mDirtyFlags = -1L;
        this.goalValueEditText.setTag(null);
        this.mainView.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[2];
        this.mboundView2 = fontableTextView;
        fontableTextView.setTag(null);
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
        setViewModel((powerwatch.matrix.com.pwgen2android.setup.goals.SingleGoalEditViewModel) variable);
        return true;
    }

    @Override // powerwatch.matrix.com.pwgen2android.databinding.FragmentSingleGoalEditBinding
    public void setViewModel(powerwatch.matrix.com.pwgen2android.setup.goals.SingleGoalEditViewModel ViewModel) {
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
            return onChangeViewModelValueUnitField((androidx.databinding.ObservableField) object, fieldId);
        }
        if (localFieldId != 1) {
            return false;
        }
        return onChangeViewModelValueField((androidx.databinding.ObservableField) object, fieldId);
    }

    private boolean onChangeViewModelValueUnitField(androidx.databinding.ObservableField<java.lang.String> ViewModelValueUnitField, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeViewModelValueField(androidx.databinding.ObservableField<java.lang.String> ViewModelValueField, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0031  */
    /* JADX WARN: Code duplicated, block: B:24:0x004d  */
    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j;
        java.lang.String str;
        java.lang.String str2;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        powerwatch.matrix.com.pwgen2android.setup.goals.SingleGoalEditViewModel singleGoalEditViewModel = this.mViewModel;
        if ((15 & j) != 0) {
            if ((j & 13) == 0) {
                str2 = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> valueUnitField = singleGoalEditViewModel != null ? singleGoalEditViewModel.getValueUnitField() : null;
                updateRegistration(0, valueUnitField);
                if (valueUnitField != null) {
                    str2 = valueUnitField.get();
                } else {
                    str2 = null;
                }
            }
            if ((j & 14) == 0) {
                str = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> valueField = singleGoalEditViewModel != null ? singleGoalEditViewModel.getValueField() : null;
                updateRegistration(1, valueField);
                if (valueField != null) {
                    str = valueField.get();
                } else {
                    str = null;
                }
            }
        } else {
            str = null;
            str2 = null;
        }
        if ((14 & j) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.goalValueEditText, str);
        }
        if ((8 & j) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged beforeTextChanged = (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) null;
            androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged onTextChanged = (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) null;
            androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged afterTextChanged = (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) null;
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.goalValueEditText, beforeTextChanged, onTextChanged, afterTextChanged, this.goalValueEditTextandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView2, beforeTextChanged, onTextChanged, afterTextChanged, this.mboundView2androidTextAttrChanged);
        }
        if ((j & 13) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, str2);
        }
    }
}
