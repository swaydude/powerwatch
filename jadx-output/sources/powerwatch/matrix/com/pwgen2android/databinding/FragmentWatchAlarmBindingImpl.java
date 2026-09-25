package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public class FragmentWatchAlarmBindingImpl extends powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchAlarmBinding {
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final android.util.SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchAlarmBindingImpl.OnClickListenerImpl mViewModelOnActivationClickedAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchAlarmBindingImpl.OnClickListenerImpl1 mViewModelOnAlarmRepeatClickedAndroidViewViewOnClickListener;
    private final android.widget.LinearLayout mboundView0;
    private final android.widget.RelativeLayout mboundView1;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView2;
    private final android.widget.RelativeLayout mboundView3;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView4;

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.hour_picker, 5);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.minute_picker, 6);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.am_pm_picker, 7);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.arrow_alarm_set, 8);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.arrow_activation_set, 9);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.previous_alarm_layout, 10);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.old_alarm_label, 11);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.activation_layout, 12);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.old_alarm_repeat_mode, 13);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.old_alarm_activation_mode, 14);
    }

    public FragmentWatchAlarmBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }

    private FragmentWatchAlarmBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root, java.lang.Object[] bindings) {
        super(bindingComponent, root, 2, (android.widget.LinearLayout) bindings[12], (com.super_rabbit.wheel_picker.WheelPicker) bindings[7], (android.widget.ImageView) bindings[9], (android.widget.ImageView) bindings[8], (com.super_rabbit.wheel_picker.WheelPicker) bindings[5], (com.super_rabbit.wheel_picker.WheelPicker) bindings[6], (android.widget.TextView) bindings[14], (android.widget.TextView) bindings[11], (android.widget.TextView) bindings[13], (android.widget.LinearLayout) bindings[10]);
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
        setViewModel((powerwatch.matrix.com.pwgen2android.main.watch.settings.alarm.WatchAlarmViewModel) variable);
        return true;
    }

    @Override // powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchAlarmBinding
    public void setViewModel(powerwatch.matrix.com.pwgen2android.main.watch.settings.alarm.WatchAlarmViewModel ViewModel) {
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
            return onChangeViewModelAlarmActivationField((androidx.databinding.ObservableField) object, fieldId);
        }
        if (localFieldId != 1) {
            return false;
        }
        return onChangeViewModelAlarmRepeatField((androidx.databinding.ObservableField) object, fieldId);
    }

    private boolean onChangeViewModelAlarmActivationField(androidx.databinding.ObservableField<java.lang.String> ViewModelAlarmActivationField, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeViewModelAlarmRepeatField(androidx.databinding.ObservableField<java.lang.String> ViewModelAlarmRepeatField, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0035  */
    /* JADX WARN: Code duplicated, block: B:25:0x0051  */
    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchAlarmBindingImpl.OnClickListenerImpl onClickListenerImpl;
        java.lang.String str;
        java.lang.String str2;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        powerwatch.matrix.com.pwgen2android.main.watch.settings.alarm.WatchAlarmViewModel watchAlarmViewModel = this.mViewModel;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchAlarmBindingImpl.OnClickListenerImpl1 value = null;
        if ((15 & j) != 0) {
            if ((j & 13) == 0) {
                str = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> alarmActivationField = watchAlarmViewModel != null ? watchAlarmViewModel.getAlarmActivationField() : null;
                updateRegistration(0, alarmActivationField);
                if (alarmActivationField != null) {
                    str = alarmActivationField.get();
                } else {
                    str = null;
                }
            }
            if ((j & 14) == 0) {
                str2 = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> alarmRepeatField = watchAlarmViewModel != null ? watchAlarmViewModel.getAlarmRepeatField() : null;
                updateRegistration(1, alarmRepeatField);
                if (alarmRepeatField != null) {
                    str2 = alarmRepeatField.get();
                } else {
                    str2 = null;
                }
            }
            if ((j & 12) == 0 || watchAlarmViewModel == null) {
                onClickListenerImpl = null;
            } else {
                powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchAlarmBindingImpl.OnClickListenerImpl onClickListenerImpl2 = this.mViewModelOnActivationClickedAndroidViewViewOnClickListener;
                if (onClickListenerImpl2 == null) {
                    onClickListenerImpl2 = new powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchAlarmBindingImpl.OnClickListenerImpl();
                    this.mViewModelOnActivationClickedAndroidViewViewOnClickListener = onClickListenerImpl2;
                }
                powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchAlarmBindingImpl.OnClickListenerImpl value2 = onClickListenerImpl2.setValue(watchAlarmViewModel);
                powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchAlarmBindingImpl.OnClickListenerImpl1 onClickListenerImpl1 = this.mViewModelOnAlarmRepeatClickedAndroidViewViewOnClickListener;
                if (onClickListenerImpl1 == null) {
                    onClickListenerImpl1 = new powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchAlarmBindingImpl.OnClickListenerImpl1();
                    this.mViewModelOnAlarmRepeatClickedAndroidViewViewOnClickListener = onClickListenerImpl1;
                }
                value = onClickListenerImpl1.setValue(watchAlarmViewModel);
                onClickListenerImpl = value2;
            }
        } else {
            onClickListenerImpl = null;
            str = null;
            str2 = null;
        }
        if ((12 & j) != 0) {
            this.mboundView1.setOnClickListener(value);
            this.mboundView3.setOnClickListener(onClickListenerImpl);
        }
        if ((14 & j) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, str2);
        }
        if ((j & 13) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, str);
        }
    }

    public static class OnClickListenerImpl implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.main.watch.settings.alarm.WatchAlarmViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchAlarmBindingImpl.OnClickListenerImpl setValue(powerwatch.matrix.com.pwgen2android.main.watch.settings.alarm.WatchAlarmViewModel value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onActivationClicked(arg0);
        }
    }

    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.main.watch.settings.alarm.WatchAlarmViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchAlarmBindingImpl.OnClickListenerImpl1 setValue(powerwatch.matrix.com.pwgen2android.main.watch.settings.alarm.WatchAlarmViewModel value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onAlarmRepeatClicked(arg0);
        }
    }
}
