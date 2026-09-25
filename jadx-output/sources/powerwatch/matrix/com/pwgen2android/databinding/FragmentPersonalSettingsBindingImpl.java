package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public class FragmentPersonalSettingsBindingImpl extends powerwatch.matrix.com.pwgen2android.databinding.FragmentPersonalSettingsBinding {
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final android.util.SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentPersonalSettingsBindingImpl.OnClickListenerImpl mViewModelOnAgeClickedAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentPersonalSettingsBindingImpl.OnClickListenerImpl3 mViewModelOnGenderClickedAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentPersonalSettingsBindingImpl.OnClickListenerImpl1 mViewModelOnHeightClickedAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentPersonalSettingsBindingImpl.OnClickListenerImpl4 mViewModelOnSleepTimeClickedAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentPersonalSettingsBindingImpl.OnClickListenerImpl2 mViewModelOnWeightClickedAndroidViewViewOnClickListener;
    private final android.widget.LinearLayout mboundView0;
    private final android.widget.RelativeLayout mboundView1;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView10;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView2;
    private final android.widget.RelativeLayout mboundView3;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView4;
    private final android.widget.RelativeLayout mboundView5;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView6;
    private final android.widget.RelativeLayout mboundView7;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView8;
    private final android.widget.RelativeLayout mboundView9;

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.arrow_weight, 11);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.arrow_height, 12);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.arrow_age, 13);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.arrow_gender, 14);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.arrow_sleep_time, 15);
    }

    public FragmentPersonalSettingsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }

    private FragmentPersonalSettingsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root, java.lang.Object[] bindings) {
        super(bindingComponent, root, 5, (android.widget.ImageView) bindings[13], (android.widget.ImageView) bindings[14], (android.widget.ImageView) bindings[12], (android.widget.ImageView) bindings[15], (android.widget.ImageView) bindings[11]);
        this.mDirtyFlags = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) bindings[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag(null);
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) bindings[1];
        this.mboundView1 = relativeLayout;
        relativeLayout.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[10];
        this.mboundView10 = fontableTextView;
        fontableTextView.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView2 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[2];
        this.mboundView2 = fontableTextView2;
        fontableTextView2.setTag(null);
        android.widget.RelativeLayout relativeLayout2 = (android.widget.RelativeLayout) bindings[3];
        this.mboundView3 = relativeLayout2;
        relativeLayout2.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView3 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[4];
        this.mboundView4 = fontableTextView3;
        fontableTextView3.setTag(null);
        android.widget.RelativeLayout relativeLayout3 = (android.widget.RelativeLayout) bindings[5];
        this.mboundView5 = relativeLayout3;
        relativeLayout3.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView4 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[6];
        this.mboundView6 = fontableTextView4;
        fontableTextView4.setTag(null);
        android.widget.RelativeLayout relativeLayout4 = (android.widget.RelativeLayout) bindings[7];
        this.mboundView7 = relativeLayout4;
        relativeLayout4.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView5 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[8];
        this.mboundView8 = fontableTextView5;
        fontableTextView5.setTag(null);
        android.widget.RelativeLayout relativeLayout5 = (android.widget.RelativeLayout) bindings[9];
        this.mboundView9 = relativeLayout5;
        relativeLayout5.setTag(null);
        setRootTag(root);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 64L;
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
        setViewModel((powerwatch.matrix.com.pwgen2android.main.watch.settings.personal.PersonalSettingsVM) variable);
        return true;
    }

    @Override // powerwatch.matrix.com.pwgen2android.databinding.FragmentPersonalSettingsBinding
    public void setViewModel(powerwatch.matrix.com.pwgen2android.main.watch.settings.personal.PersonalSettingsVM ViewModel) {
        this.mViewModel = ViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 32;
        }
        notifyPropertyChanged(1);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int localFieldId, java.lang.Object object, int fieldId) {
        if (localFieldId == 0) {
            return onChangeViewModelAgeField((androidx.databinding.ObservableField) object, fieldId);
        }
        if (localFieldId == 1) {
            return onChangeViewModelWeightField((androidx.databinding.ObservableField) object, fieldId);
        }
        if (localFieldId == 2) {
            return onChangeViewModelHeightField((androidx.databinding.ObservableField) object, fieldId);
        }
        if (localFieldId == 3) {
            return onChangeViewModelGenderField((androidx.databinding.ObservableField) object, fieldId);
        }
        if (localFieldId != 4) {
            return false;
        }
        return onChangeViewModelSleepTimeField((androidx.databinding.ObservableField) object, fieldId);
    }

    private boolean onChangeViewModelAgeField(androidx.databinding.ObservableField<java.lang.String> ViewModelAgeField, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeViewModelWeightField(androidx.databinding.ObservableField<java.lang.String> ViewModelWeightField, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    private boolean onChangeViewModelHeightField(androidx.databinding.ObservableField<java.lang.String> ViewModelHeightField, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        return true;
    }

    private boolean onChangeViewModelGenderField(androidx.databinding.ObservableField<java.lang.String> ViewModelGenderField, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        return true;
    }

    private boolean onChangeViewModelSleepTimeField(androidx.databinding.ObservableField<java.lang.String> ViewModelSleepTimeField, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0093  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f1  */
    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j;
        java.lang.String str;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentPersonalSettingsBindingImpl.OnClickListenerImpl value;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentPersonalSettingsBindingImpl.OnClickListenerImpl1 value2;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentPersonalSettingsBindingImpl.OnClickListenerImpl2 value3;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentPersonalSettingsBindingImpl.OnClickListenerImpl3 value4;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentPersonalSettingsBindingImpl.OnClickListenerImpl4 value5;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        powerwatch.matrix.com.pwgen2android.main.watch.settings.personal.PersonalSettingsVM personalSettingsVM = this.mViewModel;
        java.lang.String str6 = null;
        if ((127 & j) != 0) {
            if ((j & 96) == 0 || personalSettingsVM == null) {
                value = null;
                value2 = null;
                value3 = null;
                value4 = null;
                value5 = null;
            } else {
                powerwatch.matrix.com.pwgen2android.databinding.FragmentPersonalSettingsBindingImpl.OnClickListenerImpl onClickListenerImpl = this.mViewModelOnAgeClickedAndroidViewViewOnClickListener;
                if (onClickListenerImpl == null) {
                    onClickListenerImpl = new powerwatch.matrix.com.pwgen2android.databinding.FragmentPersonalSettingsBindingImpl.OnClickListenerImpl();
                    this.mViewModelOnAgeClickedAndroidViewViewOnClickListener = onClickListenerImpl;
                }
                value = onClickListenerImpl.setValue(personalSettingsVM);
                powerwatch.matrix.com.pwgen2android.databinding.FragmentPersonalSettingsBindingImpl.OnClickListenerImpl1 onClickListenerImpl1 = this.mViewModelOnHeightClickedAndroidViewViewOnClickListener;
                if (onClickListenerImpl1 == null) {
                    onClickListenerImpl1 = new powerwatch.matrix.com.pwgen2android.databinding.FragmentPersonalSettingsBindingImpl.OnClickListenerImpl1();
                    this.mViewModelOnHeightClickedAndroidViewViewOnClickListener = onClickListenerImpl1;
                }
                value2 = onClickListenerImpl1.setValue(personalSettingsVM);
                powerwatch.matrix.com.pwgen2android.databinding.FragmentPersonalSettingsBindingImpl.OnClickListenerImpl2 onClickListenerImpl2 = this.mViewModelOnWeightClickedAndroidViewViewOnClickListener;
                if (onClickListenerImpl2 == null) {
                    onClickListenerImpl2 = new powerwatch.matrix.com.pwgen2android.databinding.FragmentPersonalSettingsBindingImpl.OnClickListenerImpl2();
                    this.mViewModelOnWeightClickedAndroidViewViewOnClickListener = onClickListenerImpl2;
                }
                value3 = onClickListenerImpl2.setValue(personalSettingsVM);
                powerwatch.matrix.com.pwgen2android.databinding.FragmentPersonalSettingsBindingImpl.OnClickListenerImpl3 onClickListenerImpl3 = this.mViewModelOnGenderClickedAndroidViewViewOnClickListener;
                if (onClickListenerImpl3 == null) {
                    onClickListenerImpl3 = new powerwatch.matrix.com.pwgen2android.databinding.FragmentPersonalSettingsBindingImpl.OnClickListenerImpl3();
                    this.mViewModelOnGenderClickedAndroidViewViewOnClickListener = onClickListenerImpl3;
                }
                value4 = onClickListenerImpl3.setValue(personalSettingsVM);
                powerwatch.matrix.com.pwgen2android.databinding.FragmentPersonalSettingsBindingImpl.OnClickListenerImpl4 onClickListenerImpl4 = this.mViewModelOnSleepTimeClickedAndroidViewViewOnClickListener;
                if (onClickListenerImpl4 == null) {
                    onClickListenerImpl4 = new powerwatch.matrix.com.pwgen2android.databinding.FragmentPersonalSettingsBindingImpl.OnClickListenerImpl4();
                    this.mViewModelOnSleepTimeClickedAndroidViewViewOnClickListener = onClickListenerImpl4;
                }
                value5 = onClickListenerImpl4.setValue(personalSettingsVM);
            }
            if ((j & 97) == 0) {
                str2 = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> ageField = personalSettingsVM != null ? personalSettingsVM.getAgeField() : null;
                updateRegistration(0, ageField);
                if (ageField != null) {
                    str2 = ageField.get();
                } else {
                    str2 = null;
                }
            }
            if ((j & 98) == 0) {
                str5 = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> weightField = personalSettingsVM != null ? personalSettingsVM.getWeightField() : null;
                updateRegistration(1, weightField);
                if (weightField != null) {
                    str5 = weightField.get();
                } else {
                    str5 = null;
                }
            }
            if ((j & 100) == 0) {
                str3 = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> heightField = personalSettingsVM != null ? personalSettingsVM.getHeightField() : null;
                updateRegistration(2, heightField);
                if (heightField != null) {
                    str3 = heightField.get();
                } else {
                    str3 = null;
                }
            }
            if ((j & 104) == 0) {
                str4 = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> genderField = personalSettingsVM != null ? personalSettingsVM.getGenderField() : null;
                updateRegistration(3, genderField);
                if (genderField != null) {
                    str4 = genderField.get();
                } else {
                    str4 = null;
                }
            }
            if ((j & 112) != 0) {
                androidx.databinding.ObservableField<java.lang.String> sleepTimeField = personalSettingsVM != null ? personalSettingsVM.getSleepTimeField() : null;
                updateRegistration(4, sleepTimeField);
                if (sleepTimeField != null) {
                    str6 = sleepTimeField.get();
                }
            }
            str = str6;
        } else {
            str = null;
            value = null;
            value2 = null;
            value3 = null;
            value4 = null;
            value5 = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
        }
        if ((j & 96) != 0) {
            this.mboundView1.setOnClickListener(value3);
            this.mboundView3.setOnClickListener(value2);
            this.mboundView5.setOnClickListener(value);
            this.mboundView7.setOnClickListener(value4);
            this.mboundView9.setOnClickListener(value5);
        }
        if ((j & 112) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView10, str);
        }
        if ((98 & j) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, str5);
        }
        if ((100 & j) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, str3);
        }
        if ((97 & j) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, str2);
        }
        if ((j & 104) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, str4);
        }
    }

    public static class OnClickListenerImpl implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.main.watch.settings.personal.PersonalSettingsVM value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentPersonalSettingsBindingImpl.OnClickListenerImpl setValue(powerwatch.matrix.com.pwgen2android.main.watch.settings.personal.PersonalSettingsVM value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onAgeClicked(arg0);
        }
    }

    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.main.watch.settings.personal.PersonalSettingsVM value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentPersonalSettingsBindingImpl.OnClickListenerImpl1 setValue(powerwatch.matrix.com.pwgen2android.main.watch.settings.personal.PersonalSettingsVM value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onHeightClicked(arg0);
        }
    }

    public static class OnClickListenerImpl2 implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.main.watch.settings.personal.PersonalSettingsVM value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentPersonalSettingsBindingImpl.OnClickListenerImpl2 setValue(powerwatch.matrix.com.pwgen2android.main.watch.settings.personal.PersonalSettingsVM value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onWeightClicked(arg0);
        }
    }

    public static class OnClickListenerImpl3 implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.main.watch.settings.personal.PersonalSettingsVM value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentPersonalSettingsBindingImpl.OnClickListenerImpl3 setValue(powerwatch.matrix.com.pwgen2android.main.watch.settings.personal.PersonalSettingsVM value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onGenderClicked(arg0);
        }
    }

    public static class OnClickListenerImpl4 implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.main.watch.settings.personal.PersonalSettingsVM value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentPersonalSettingsBindingImpl.OnClickListenerImpl4 setValue(powerwatch.matrix.com.pwgen2android.main.watch.settings.personal.PersonalSettingsVM value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onSleepTimeClicked(arg0);
        }
    }
}
