package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public class FragmentEditUserActivityBindingImpl extends powerwatch.matrix.com.pwgen2android.databinding.FragmentEditUserActivityBinding {
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final android.util.SparseIntArray sViewsWithIds;
    private androidx.databinding.InverseBindingListener locationEditTextandroidTextAttrChanged;
    private long mDirtyFlags;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentEditUserActivityBindingImpl.OnClickListenerImpl1 mViewModelOnActivityTypeClickedAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentEditUserActivityBindingImpl.OnClickListenerImpl mViewModelOnDeleteClickedAndroidViewViewOnClickListener;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView1;
    private androidx.databinding.InverseBindingListener mboundView1androidTextAttrChanged;
    private final android.widget.ImageView mboundView2;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView4;
    private final android.widget.ProgressBar mboundView5;

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.activity_type_title, 6);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.location_title, 7);
    }

    public FragmentEditUserActivityBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }

    private FragmentEditUserActivityBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root, java.lang.Object[] bindings) {
        super(bindingComponent, root, 3, (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[6], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableEditText) bindings[3], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[7], (android.widget.LinearLayout) bindings[0]);
        this.locationEditTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() { // from class: powerwatch.matrix.com.pwgen2android.databinding.FragmentEditUserActivityBindingImpl.1
            @Override // androidx.databinding.InverseBindingListener
            public void onChange() {
                java.lang.String textString = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(powerwatch.matrix.com.pwgen2android.databinding.FragmentEditUserActivityBindingImpl.this.locationEditText);
                powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityViewModel editUserActivityViewModel = powerwatch.matrix.com.pwgen2android.databinding.FragmentEditUserActivityBindingImpl.this.mViewModel;
                if (editUserActivityViewModel != null) {
                    androidx.databinding.ObservableField<java.lang.String> locationField = editUserActivityViewModel.getLocationField();
                    if (locationField != null) {
                        locationField.set(textString);
                    }
                }
            }
        };
        this.mboundView1androidTextAttrChanged = new androidx.databinding.InverseBindingListener() { // from class: powerwatch.matrix.com.pwgen2android.databinding.FragmentEditUserActivityBindingImpl.2
            @Override // androidx.databinding.InverseBindingListener
            public void onChange() {
                java.lang.String textString = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(powerwatch.matrix.com.pwgen2android.databinding.FragmentEditUserActivityBindingImpl.this.mboundView1);
                powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityViewModel editUserActivityViewModel = powerwatch.matrix.com.pwgen2android.databinding.FragmentEditUserActivityBindingImpl.this.mViewModel;
                if (editUserActivityViewModel != null) {
                    androidx.databinding.ObservableField<java.lang.String> typeField = editUserActivityViewModel.getTypeField();
                    if (typeField != null) {
                        typeField.set(textString);
                    }
                }
            }
        };
        this.mDirtyFlags = -1L;
        this.locationEditText.setTag(null);
        this.mainView.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[1];
        this.mboundView1 = fontableTextView;
        fontableTextView.setTag(null);
        android.widget.ImageView imageView = (android.widget.ImageView) bindings[2];
        this.mboundView2 = imageView;
        imageView.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView2 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[4];
        this.mboundView4 = fontableTextView2;
        fontableTextView2.setTag(null);
        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) bindings[5];
        this.mboundView5 = progressBar;
        progressBar.setTag(null);
        setRootTag(root);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 16L;
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
        setViewModel((powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityViewModel) variable);
        return true;
    }

    @Override // powerwatch.matrix.com.pwgen2android.databinding.FragmentEditUserActivityBinding
    public void setViewModel(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        notifyPropertyChanged(1);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int localFieldId, java.lang.Object object, int fieldId) {
        if (localFieldId == 0) {
            return onChangeViewModelIsProgressVisible((androidx.databinding.ObservableField) object, fieldId);
        }
        if (localFieldId == 1) {
            return onChangeViewModelTypeField((androidx.databinding.ObservableField) object, fieldId);
        }
        if (localFieldId != 2) {
            return false;
        }
        return onChangeViewModelLocationField((androidx.databinding.ObservableField) object, fieldId);
    }

    private boolean onChangeViewModelIsProgressVisible(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelIsProgressVisible, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeViewModelTypeField(androidx.databinding.ObservableField<java.lang.String> ViewModelTypeField, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    private boolean onChangeViewModelLocationField(androidx.databinding.ObservableField<java.lang.String> ViewModelLocationField, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0062  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a9  */
    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j;
        java.lang.String str;
        java.lang.String str2;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentEditUserActivityBindingImpl.OnClickListenerImpl value;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentEditUserActivityBindingImpl.OnClickListenerImpl1 value2;
        boolean zSafeUnbox;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityViewModel editUserActivityViewModel = this.mViewModel;
        boolean zSafeUnbox2 = false;
        if ((31 & j) != 0) {
            if ((j & 25) != 0) {
                androidx.databinding.ObservableField<java.lang.Boolean> observableFieldIsProgressVisible = editUserActivityViewModel != null ? editUserActivityViewModel.isProgressVisible() : null;
                updateRegistration(0, observableFieldIsProgressVisible);
                zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(observableFieldIsProgressVisible != null ? observableFieldIsProgressVisible.get() : null);
                zSafeUnbox2 = androidx.databinding.ViewDataBinding.safeUnbox(java.lang.Boolean.valueOf(!zSafeUnbox));
            } else {
                zSafeUnbox = false;
            }
            if ((j & 26) == 0) {
                str2 = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> typeField = editUserActivityViewModel != null ? editUserActivityViewModel.getTypeField() : null;
                updateRegistration(1, typeField);
                if (typeField != null) {
                    str2 = typeField.get();
                } else {
                    str2 = null;
                }
            }
            if ((j & 24) == 0 || editUserActivityViewModel == null) {
                value = null;
                value2 = null;
            } else {
                powerwatch.matrix.com.pwgen2android.databinding.FragmentEditUserActivityBindingImpl.OnClickListenerImpl onClickListenerImpl = this.mViewModelOnDeleteClickedAndroidViewViewOnClickListener;
                if (onClickListenerImpl == null) {
                    onClickListenerImpl = new powerwatch.matrix.com.pwgen2android.databinding.FragmentEditUserActivityBindingImpl.OnClickListenerImpl();
                    this.mViewModelOnDeleteClickedAndroidViewViewOnClickListener = onClickListenerImpl;
                }
                value = onClickListenerImpl.setValue(editUserActivityViewModel);
                powerwatch.matrix.com.pwgen2android.databinding.FragmentEditUserActivityBindingImpl.OnClickListenerImpl1 onClickListenerImpl1 = this.mViewModelOnActivityTypeClickedAndroidViewViewOnClickListener;
                if (onClickListenerImpl1 == null) {
                    onClickListenerImpl1 = new powerwatch.matrix.com.pwgen2android.databinding.FragmentEditUserActivityBindingImpl.OnClickListenerImpl1();
                    this.mViewModelOnActivityTypeClickedAndroidViewViewOnClickListener = onClickListenerImpl1;
                }
                value2 = onClickListenerImpl1.setValue(editUserActivityViewModel);
            }
            if ((j & 28) == 0) {
                str = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> locationField = editUserActivityViewModel != null ? editUserActivityViewModel.getLocationField() : null;
                updateRegistration(2, locationField);
                if (locationField != null) {
                    str = locationField.get();
                } else {
                    str = null;
                }
            }
        } else {
            str = null;
            str2 = null;
            value = null;
            value2 = null;
            zSafeUnbox = false;
        }
        if ((28 & j) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.locationEditText, str);
        }
        if ((16 & j) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged beforeTextChanged = (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) null;
            androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged onTextChanged = (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) null;
            androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged afterTextChanged = (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) null;
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.locationEditText, beforeTextChanged, onTextChanged, afterTextChanged, this.locationEditTextandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView1, beforeTextChanged, onTextChanged, afterTextChanged, this.mboundView1androidTextAttrChanged);
        }
        if ((j & 26) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, str2);
        }
        if ((24 & j) != 0) {
            this.mboundView2.setOnClickListener(value2);
            this.mboundView4.setOnClickListener(value);
        }
        if ((j & 25) != 0) {
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.goneUnless(this.mboundView4, zSafeUnbox2);
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.goneUnless(this.mboundView5, zSafeUnbox);
        }
    }

    public static class OnClickListenerImpl implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentEditUserActivityBindingImpl.OnClickListenerImpl setValue(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityViewModel value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onDeleteClicked(arg0);
        }
    }

    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentEditUserActivityBindingImpl.OnClickListenerImpl1 setValue(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityViewModel value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onActivityTypeClicked(arg0);
        }
    }
}
