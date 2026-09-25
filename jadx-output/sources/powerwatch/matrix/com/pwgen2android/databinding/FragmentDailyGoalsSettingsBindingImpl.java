package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public class FragmentDailyGoalsSettingsBindingImpl extends powerwatch.matrix.com.pwgen2android.databinding.FragmentDailyGoalsSettingsBinding {
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final android.util.SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentDailyGoalsSettingsBindingImpl.OnClickListenerImpl1 mViewModelOnCaloriesClickedAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentDailyGoalsSettingsBindingImpl.OnClickListenerImpl2 mViewModelOnPowerClickedAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentDailyGoalsSettingsBindingImpl.OnClickListenerImpl mViewModelOnSleepClickedAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentDailyGoalsSettingsBindingImpl.OnClickListenerImpl3 mViewModelOnStepsClickedAndroidViewViewOnClickListener;
    private final android.widget.LinearLayout mboundView0;
    private final android.widget.RelativeLayout mboundView1;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView2;
    private final android.widget.RelativeLayout mboundView3;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView4;
    private final android.widget.RelativeLayout mboundView5;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView6;
    private final android.widget.RelativeLayout mboundView7;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView8;

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.arrow_steps, 9);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.arrow_calories, 10);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.arrow_sleep, 11);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.arrow_power, 12);
    }

    public FragmentDailyGoalsSettingsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }

    private FragmentDailyGoalsSettingsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root, java.lang.Object[] bindings) {
        super(bindingComponent, root, 4, (android.widget.ImageView) bindings[10], (android.widget.ImageView) bindings[12], (android.widget.ImageView) bindings[11], (android.widget.ImageView) bindings[9]);
        this.mDirtyFlags = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) bindings[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag(null);
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) bindings[1];
        this.mboundView1 = relativeLayout;
        relativeLayout.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[2];
        this.mboundView2 = fontableTextView;
        fontableTextView.setTag(null);
        android.widget.RelativeLayout relativeLayout2 = (android.widget.RelativeLayout) bindings[3];
        this.mboundView3 = relativeLayout2;
        relativeLayout2.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView2 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[4];
        this.mboundView4 = fontableTextView2;
        fontableTextView2.setTag(null);
        android.widget.RelativeLayout relativeLayout3 = (android.widget.RelativeLayout) bindings[5];
        this.mboundView5 = relativeLayout3;
        relativeLayout3.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView3 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[6];
        this.mboundView6 = fontableTextView3;
        fontableTextView3.setTag(null);
        android.widget.RelativeLayout relativeLayout4 = (android.widget.RelativeLayout) bindings[7];
        this.mboundView7 = relativeLayout4;
        relativeLayout4.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView4 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[8];
        this.mboundView8 = fontableTextView4;
        fontableTextView4.setTag(null);
        setRootTag(root);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 32L;
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
        setViewModel((powerwatch.matrix.com.pwgen2android.main.watch.settings.dailygoals.DailyGoalsSettingsVM) variable);
        return true;
    }

    @Override // powerwatch.matrix.com.pwgen2android.databinding.FragmentDailyGoalsSettingsBinding
    public void setViewModel(powerwatch.matrix.com.pwgen2android.main.watch.settings.dailygoals.DailyGoalsSettingsVM ViewModel) {
        this.mViewModel = ViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        notifyPropertyChanged(1);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int localFieldId, java.lang.Object object, int fieldId) {
        if (localFieldId == 0) {
            return onChangeViewModelStepsField((androidx.databinding.ObservableField) object, fieldId);
        }
        if (localFieldId == 1) {
            return onChangeViewModelPowerField((androidx.databinding.ObservableField) object, fieldId);
        }
        if (localFieldId == 2) {
            return onChangeViewModelSleepField((androidx.databinding.ObservableField) object, fieldId);
        }
        if (localFieldId != 3) {
            return false;
        }
        return onChangeViewModelCaloriesField((androidx.databinding.ObservableField) object, fieldId);
    }

    private boolean onChangeViewModelStepsField(androidx.databinding.ObservableField<java.lang.String> ViewModelStepsField, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeViewModelPowerField(androidx.databinding.ObservableField<java.lang.String> ViewModelPowerField, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    private boolean onChangeViewModelSleepField(androidx.databinding.ObservableField<java.lang.String> ViewModelSleepField, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        return true;
    }

    private boolean onChangeViewModelCaloriesField(androidx.databinding.ObservableField<java.lang.String> ViewModelCaloriesField, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0085  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c1  */
    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j;
        java.lang.String str;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentDailyGoalsSettingsBindingImpl.OnClickListenerImpl value;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentDailyGoalsSettingsBindingImpl.OnClickListenerImpl1 value2;
        java.lang.String str2;
        java.lang.String str3;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentDailyGoalsSettingsBindingImpl.OnClickListenerImpl2 value3;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentDailyGoalsSettingsBindingImpl.OnClickListenerImpl3 value4;
        java.lang.String str4;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        powerwatch.matrix.com.pwgen2android.main.watch.settings.dailygoals.DailyGoalsSettingsVM dailyGoalsSettingsVM = this.mViewModel;
        java.lang.String str5 = null;
        if ((63 & j) != 0) {
            if ((j & 48) == 0 || dailyGoalsSettingsVM == null) {
                value = null;
                value2 = null;
                value3 = null;
                value4 = null;
            } else {
                powerwatch.matrix.com.pwgen2android.databinding.FragmentDailyGoalsSettingsBindingImpl.OnClickListenerImpl onClickListenerImpl = this.mViewModelOnSleepClickedAndroidViewViewOnClickListener;
                if (onClickListenerImpl == null) {
                    onClickListenerImpl = new powerwatch.matrix.com.pwgen2android.databinding.FragmentDailyGoalsSettingsBindingImpl.OnClickListenerImpl();
                    this.mViewModelOnSleepClickedAndroidViewViewOnClickListener = onClickListenerImpl;
                }
                value = onClickListenerImpl.setValue(dailyGoalsSettingsVM);
                powerwatch.matrix.com.pwgen2android.databinding.FragmentDailyGoalsSettingsBindingImpl.OnClickListenerImpl1 onClickListenerImpl1 = this.mViewModelOnCaloriesClickedAndroidViewViewOnClickListener;
                if (onClickListenerImpl1 == null) {
                    onClickListenerImpl1 = new powerwatch.matrix.com.pwgen2android.databinding.FragmentDailyGoalsSettingsBindingImpl.OnClickListenerImpl1();
                    this.mViewModelOnCaloriesClickedAndroidViewViewOnClickListener = onClickListenerImpl1;
                }
                value2 = onClickListenerImpl1.setValue(dailyGoalsSettingsVM);
                powerwatch.matrix.com.pwgen2android.databinding.FragmentDailyGoalsSettingsBindingImpl.OnClickListenerImpl2 onClickListenerImpl2 = this.mViewModelOnPowerClickedAndroidViewViewOnClickListener;
                if (onClickListenerImpl2 == null) {
                    onClickListenerImpl2 = new powerwatch.matrix.com.pwgen2android.databinding.FragmentDailyGoalsSettingsBindingImpl.OnClickListenerImpl2();
                    this.mViewModelOnPowerClickedAndroidViewViewOnClickListener = onClickListenerImpl2;
                }
                value3 = onClickListenerImpl2.setValue(dailyGoalsSettingsVM);
                powerwatch.matrix.com.pwgen2android.databinding.FragmentDailyGoalsSettingsBindingImpl.OnClickListenerImpl3 onClickListenerImpl3 = this.mViewModelOnStepsClickedAndroidViewViewOnClickListener;
                if (onClickListenerImpl3 == null) {
                    onClickListenerImpl3 = new powerwatch.matrix.com.pwgen2android.databinding.FragmentDailyGoalsSettingsBindingImpl.OnClickListenerImpl3();
                    this.mViewModelOnStepsClickedAndroidViewViewOnClickListener = onClickListenerImpl3;
                }
                value4 = onClickListenerImpl3.setValue(dailyGoalsSettingsVM);
            }
            if ((j & 49) == 0) {
                str4 = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> stepsField = dailyGoalsSettingsVM != null ? dailyGoalsSettingsVM.getStepsField() : null;
                updateRegistration(0, stepsField);
                if (stepsField != null) {
                    str4 = stepsField.get();
                } else {
                    str4 = null;
                }
            }
            if ((j & 50) == 0) {
                str2 = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> powerField = dailyGoalsSettingsVM != null ? dailyGoalsSettingsVM.getPowerField() : null;
                updateRegistration(1, powerField);
                if (powerField != null) {
                    str2 = powerField.get();
                } else {
                    str2 = null;
                }
            }
            if ((j & 52) == 0) {
                str3 = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> sleepField = dailyGoalsSettingsVM != null ? dailyGoalsSettingsVM.getSleepField() : null;
                updateRegistration(2, sleepField);
                if (sleepField != null) {
                    str3 = sleepField.get();
                } else {
                    str3 = null;
                }
            }
            if ((j & 56) != 0) {
                androidx.databinding.ObservableField<java.lang.String> caloriesField = dailyGoalsSettingsVM != null ? dailyGoalsSettingsVM.getCaloriesField() : null;
                updateRegistration(3, caloriesField);
                if (caloriesField != null) {
                    str5 = caloriesField.get();
                }
            }
            str = str5;
        } else {
            str = null;
            value = null;
            value2 = null;
            str2 = null;
            str3 = null;
            value3 = null;
            value4 = null;
            str4 = null;
        }
        if ((j & 48) != 0) {
            this.mboundView1.setOnClickListener(value4);
            this.mboundView3.setOnClickListener(value2);
            this.mboundView5.setOnClickListener(value);
            this.mboundView7.setOnClickListener(value3);
        }
        if ((49 & j) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, str4);
        }
        if ((56 & j) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, str);
        }
        if ((j & 52) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, str3);
        }
        if ((j & 50) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, str2);
        }
    }

    public static class OnClickListenerImpl implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.main.watch.settings.dailygoals.DailyGoalsSettingsVM value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentDailyGoalsSettingsBindingImpl.OnClickListenerImpl setValue(powerwatch.matrix.com.pwgen2android.main.watch.settings.dailygoals.DailyGoalsSettingsVM value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onSleepClicked(arg0);
        }
    }

    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.main.watch.settings.dailygoals.DailyGoalsSettingsVM value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentDailyGoalsSettingsBindingImpl.OnClickListenerImpl1 setValue(powerwatch.matrix.com.pwgen2android.main.watch.settings.dailygoals.DailyGoalsSettingsVM value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onCaloriesClicked(arg0);
        }
    }

    public static class OnClickListenerImpl2 implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.main.watch.settings.dailygoals.DailyGoalsSettingsVM value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentDailyGoalsSettingsBindingImpl.OnClickListenerImpl2 setValue(powerwatch.matrix.com.pwgen2android.main.watch.settings.dailygoals.DailyGoalsSettingsVM value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onPowerClicked(arg0);
        }
    }

    public static class OnClickListenerImpl3 implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.main.watch.settings.dailygoals.DailyGoalsSettingsVM value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentDailyGoalsSettingsBindingImpl.OnClickListenerImpl3 setValue(powerwatch.matrix.com.pwgen2android.main.watch.settings.dailygoals.DailyGoalsSettingsVM value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onStepsClicked(arg0);
        }
    }
}
