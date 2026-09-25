package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public class FragmentSetGoalsBindingImpl extends powerwatch.matrix.com.pwgen2android.databinding.FragmentSetGoalsBinding {
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final android.util.SparseIntArray sViewsWithIds;
    private androidx.databinding.InverseBindingListener caloriesEditTextandroidTextAttrChanged;
    private androidx.databinding.InverseBindingListener distanceEditTextandroidTextAttrChanged;
    private long mDirtyFlags;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView3;
    private androidx.databinding.InverseBindingListener mboundView3androidTextAttrChanged;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView6;
    private androidx.databinding.InverseBindingListener mboundView6androidTextAttrChanged;
    private androidx.databinding.InverseBindingListener sleepEditTextandroidTextAttrChanged;
    private androidx.databinding.InverseBindingListener stepsEditTextandroidTextAttrChanged;

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.steps_title, 7);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.distance_title, 8);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.calories_title, 9);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.sleep_title, 10);
    }

    public FragmentSetGoalsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }

    private FragmentSetGoalsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root, java.lang.Object[] bindings) {
        super(bindingComponent, root, 6, (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableEditText) bindings[4], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[9], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableEditText) bindings[2], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[8], (android.widget.LinearLayout) bindings[0], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableEditText) bindings[5], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[10], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableEditText) bindings[1], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[7]);
        this.caloriesEditTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() { // from class: powerwatch.matrix.com.pwgen2android.databinding.FragmentSetGoalsBindingImpl.1
            @Override // androidx.databinding.InverseBindingListener
            public void onChange() {
                java.lang.String textString = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(powerwatch.matrix.com.pwgen2android.databinding.FragmentSetGoalsBindingImpl.this.caloriesEditText);
                powerwatch.matrix.com.pwgen2android.setup.goals.SetGoalsViewModel setGoalsViewModel = powerwatch.matrix.com.pwgen2android.databinding.FragmentSetGoalsBindingImpl.this.mViewModel;
                if (setGoalsViewModel != null) {
                    androidx.databinding.ObservableField<java.lang.String> caloriesField = setGoalsViewModel.getCaloriesField();
                    if (caloriesField != null) {
                        caloriesField.set(textString);
                    }
                }
            }
        };
        this.distanceEditTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() { // from class: powerwatch.matrix.com.pwgen2android.databinding.FragmentSetGoalsBindingImpl.2
            @Override // androidx.databinding.InverseBindingListener
            public void onChange() {
                java.lang.String textString = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(powerwatch.matrix.com.pwgen2android.databinding.FragmentSetGoalsBindingImpl.this.distanceEditText);
                powerwatch.matrix.com.pwgen2android.setup.goals.SetGoalsViewModel setGoalsViewModel = powerwatch.matrix.com.pwgen2android.databinding.FragmentSetGoalsBindingImpl.this.mViewModel;
                if (setGoalsViewModel != null) {
                    androidx.databinding.ObservableField<java.lang.String> distanceField = setGoalsViewModel.getDistanceField();
                    if (distanceField != null) {
                        distanceField.set(textString);
                    }
                }
            }
        };
        this.mboundView3androidTextAttrChanged = new androidx.databinding.InverseBindingListener() { // from class: powerwatch.matrix.com.pwgen2android.databinding.FragmentSetGoalsBindingImpl.3
            @Override // androidx.databinding.InverseBindingListener
            public void onChange() {
                java.lang.String textString = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(powerwatch.matrix.com.pwgen2android.databinding.FragmentSetGoalsBindingImpl.this.mboundView3);
                powerwatch.matrix.com.pwgen2android.setup.goals.SetGoalsViewModel setGoalsViewModel = powerwatch.matrix.com.pwgen2android.databinding.FragmentSetGoalsBindingImpl.this.mViewModel;
                if (setGoalsViewModel != null) {
                    androidx.databinding.ObservableField<java.lang.String> distanceUnitField = setGoalsViewModel.getDistanceUnitField();
                    if (distanceUnitField != null) {
                        distanceUnitField.set(textString);
                    }
                }
            }
        };
        this.mboundView6androidTextAttrChanged = new androidx.databinding.InverseBindingListener() { // from class: powerwatch.matrix.com.pwgen2android.databinding.FragmentSetGoalsBindingImpl.4
            @Override // androidx.databinding.InverseBindingListener
            public void onChange() {
                java.lang.String textString = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(powerwatch.matrix.com.pwgen2android.databinding.FragmentSetGoalsBindingImpl.this.mboundView6);
                powerwatch.matrix.com.pwgen2android.setup.goals.SetGoalsViewModel setGoalsViewModel = powerwatch.matrix.com.pwgen2android.databinding.FragmentSetGoalsBindingImpl.this.mViewModel;
                if (setGoalsViewModel != null) {
                    androidx.databinding.ObservableField<java.lang.String> sleepUnitField = setGoalsViewModel.getSleepUnitField();
                    if (sleepUnitField != null) {
                        sleepUnitField.set(textString);
                    }
                }
            }
        };
        this.sleepEditTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() { // from class: powerwatch.matrix.com.pwgen2android.databinding.FragmentSetGoalsBindingImpl.5
            @Override // androidx.databinding.InverseBindingListener
            public void onChange() {
                java.lang.String textString = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(powerwatch.matrix.com.pwgen2android.databinding.FragmentSetGoalsBindingImpl.this.sleepEditText);
                powerwatch.matrix.com.pwgen2android.setup.goals.SetGoalsViewModel setGoalsViewModel = powerwatch.matrix.com.pwgen2android.databinding.FragmentSetGoalsBindingImpl.this.mViewModel;
                if (setGoalsViewModel != null) {
                    androidx.databinding.ObservableField<java.lang.String> sleepField = setGoalsViewModel.getSleepField();
                    if (sleepField != null) {
                        sleepField.set(textString);
                    }
                }
            }
        };
        this.stepsEditTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() { // from class: powerwatch.matrix.com.pwgen2android.databinding.FragmentSetGoalsBindingImpl.6
            @Override // androidx.databinding.InverseBindingListener
            public void onChange() {
                java.lang.String textString = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(powerwatch.matrix.com.pwgen2android.databinding.FragmentSetGoalsBindingImpl.this.stepsEditText);
                powerwatch.matrix.com.pwgen2android.setup.goals.SetGoalsViewModel setGoalsViewModel = powerwatch.matrix.com.pwgen2android.databinding.FragmentSetGoalsBindingImpl.this.mViewModel;
                if (setGoalsViewModel != null) {
                    androidx.databinding.ObservableField<java.lang.String> stepsField = setGoalsViewModel.getStepsField();
                    if (stepsField != null) {
                        stepsField.set(textString);
                    }
                }
            }
        };
        this.mDirtyFlags = -1L;
        this.caloriesEditText.setTag(null);
        this.distanceEditText.setTag(null);
        this.mainView.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[3];
        this.mboundView3 = fontableTextView;
        fontableTextView.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView2 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[6];
        this.mboundView6 = fontableTextView2;
        fontableTextView2.setTag(null);
        this.sleepEditText.setTag(null);
        this.stepsEditText.setTag(null);
        setRootTag(root);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 128L;
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
        setViewModel((powerwatch.matrix.com.pwgen2android.setup.goals.SetGoalsViewModel) variable);
        return true;
    }

    @Override // powerwatch.matrix.com.pwgen2android.databinding.FragmentSetGoalsBinding
    public void setViewModel(powerwatch.matrix.com.pwgen2android.setup.goals.SetGoalsViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 64;
        }
        notifyPropertyChanged(1);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int localFieldId, java.lang.Object object, int fieldId) {
        if (localFieldId == 0) {
            return onChangeViewModelDistanceUnitField((androidx.databinding.ObservableField) object, fieldId);
        }
        if (localFieldId == 1) {
            return onChangeViewModelSleepUnitField((androidx.databinding.ObservableField) object, fieldId);
        }
        if (localFieldId == 2) {
            return onChangeViewModelDistanceField((androidx.databinding.ObservableField) object, fieldId);
        }
        if (localFieldId == 3) {
            return onChangeViewModelStepsField((androidx.databinding.ObservableField) object, fieldId);
        }
        if (localFieldId == 4) {
            return onChangeViewModelSleepField((androidx.databinding.ObservableField) object, fieldId);
        }
        if (localFieldId != 5) {
            return false;
        }
        return onChangeViewModelCaloriesField((androidx.databinding.ObservableField) object, fieldId);
    }

    private boolean onChangeViewModelDistanceUnitField(androidx.databinding.ObservableField<java.lang.String> ViewModelDistanceUnitField, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeViewModelSleepUnitField(androidx.databinding.ObservableField<java.lang.String> ViewModelSleepUnitField, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    private boolean onChangeViewModelDistanceField(androidx.databinding.ObservableField<java.lang.String> ViewModelDistanceField, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        return true;
    }

    private boolean onChangeViewModelStepsField(androidx.databinding.ObservableField<java.lang.String> ViewModelStepsField, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        return true;
    }

    private boolean onChangeViewModelSleepField(androidx.databinding.ObservableField<java.lang.String> ViewModelSleepField, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        return true;
    }

    private boolean onChangeViewModelCaloriesField(androidx.databinding.ObservableField<java.lang.String> ViewModelCaloriesField, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 32;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x005b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x0097  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d3  */
    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        powerwatch.matrix.com.pwgen2android.setup.goals.SetGoalsViewModel setGoalsViewModel = this.mViewModel;
        if ((255 & j) != 0) {
            if ((j & 193) == 0) {
                str2 = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> distanceUnitField = setGoalsViewModel != null ? setGoalsViewModel.getDistanceUnitField() : null;
                updateRegistration(0, distanceUnitField);
                if (distanceUnitField != null) {
                    str2 = distanceUnitField.get();
                } else {
                    str2 = null;
                }
            }
            if ((j & 194) == 0) {
                str3 = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> sleepUnitField = setGoalsViewModel != null ? setGoalsViewModel.getSleepUnitField() : null;
                updateRegistration(1, sleepUnitField);
                if (sleepUnitField != null) {
                    str3 = sleepUnitField.get();
                } else {
                    str3 = null;
                }
            }
            if ((j & 196) == 0) {
                str6 = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> distanceField = setGoalsViewModel != null ? setGoalsViewModel.getDistanceField() : null;
                updateRegistration(2, distanceField);
                if (distanceField != null) {
                    str6 = distanceField.get();
                } else {
                    str6 = null;
                }
            }
            if ((j & 200) == 0) {
                str4 = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> stepsField = setGoalsViewModel != null ? setGoalsViewModel.getStepsField() : null;
                updateRegistration(3, stepsField);
                if (stepsField != null) {
                    str4 = stepsField.get();
                } else {
                    str4 = null;
                }
            }
            if ((j & 208) == 0) {
                str5 = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> sleepField = setGoalsViewModel != null ? setGoalsViewModel.getSleepField() : null;
                updateRegistration(4, sleepField);
                if (sleepField != null) {
                    str5 = sleepField.get();
                } else {
                    str5 = null;
                }
            }
            if ((j & 224) == 0) {
                str = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> caloriesField = setGoalsViewModel != null ? setGoalsViewModel.getCaloriesField() : null;
                updateRegistration(5, caloriesField);
                if (caloriesField != null) {
                    str = caloriesField.get();
                } else {
                    str = null;
                }
            }
        } else {
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
        }
        if ((j & 224) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.caloriesEditText, str);
        }
        if ((j & 128) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged beforeTextChanged = (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) null;
            androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged onTextChanged = (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) null;
            androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged afterTextChanged = (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) null;
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.caloriesEditText, beforeTextChanged, onTextChanged, afterTextChanged, this.caloriesEditTextandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.distanceEditText, beforeTextChanged, onTextChanged, afterTextChanged, this.distanceEditTextandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView3, beforeTextChanged, onTextChanged, afterTextChanged, this.mboundView3androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView6, beforeTextChanged, onTextChanged, afterTextChanged, this.mboundView6androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.sleepEditText, beforeTextChanged, onTextChanged, afterTextChanged, this.sleepEditTextandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.stepsEditText, beforeTextChanged, onTextChanged, afterTextChanged, this.stepsEditTextandroidTextAttrChanged);
        }
        if ((j & 196) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.distanceEditText, str6);
        }
        if ((j & 193) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, str2);
        }
        if ((194 & j) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, str3);
        }
        if ((208 & j) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.sleepEditText, str5);
        }
        if ((j & 200) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.stepsEditText, str4);
        }
    }
}
