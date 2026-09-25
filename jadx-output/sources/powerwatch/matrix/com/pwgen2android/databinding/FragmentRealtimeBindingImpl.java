package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public class FragmentRealtimeBindingImpl extends powerwatch.matrix.com.pwgen2android.databinding.FragmentRealtimeBinding {
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final android.util.SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentRealtimeBindingImpl.OnClickListenerImpl1 mViewModelOnCaloriesCircleClickedAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentRealtimeBindingImpl.OnClickListenerImpl3 mViewModelOnPowerCircleClickedAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentRealtimeBindingImpl.OnClickListenerImpl2 mViewModelOnSleepCircleClickedAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentRealtimeBindingImpl.OnClickListenerImpl mViewModelOnStepsCircleClickedAndroidViewViewOnClickListener;
    private final android.widget.LinearLayout mboundView0;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView10;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView11;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView13;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView14;
    private final android.widget.FrameLayout mboundView3;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView4;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView5;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView7;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView8;

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.main_inner_circle, 15);
    }

    public FragmentRealtimeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }

    private FragmentRealtimeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root, java.lang.Object[] bindings) {
        super(bindingComponent, root, 10, (powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.DashedCircleView) bindings[9], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[2], (powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.DashedCircleView) bindings[15], (powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.DashedCircleView) bindings[12], (powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.DashedCircleView) bindings[6], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[1]);
        this.mDirtyFlags = -1L;
        this.caloriesCircle.setTag(null);
        this.currentDateTitle.setTag(null);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) bindings[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[10];
        this.mboundView10 = fontableTextView;
        fontableTextView.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView2 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[11];
        this.mboundView11 = fontableTextView2;
        fontableTextView2.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView3 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[13];
        this.mboundView13 = fontableTextView3;
        fontableTextView3.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView4 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[14];
        this.mboundView14 = fontableTextView4;
        fontableTextView4.setTag(null);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) bindings[3];
        this.mboundView3 = frameLayout;
        frameLayout.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView5 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[4];
        this.mboundView4 = fontableTextView5;
        fontableTextView5.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView6 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[5];
        this.mboundView5 = fontableTextView6;
        fontableTextView6.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView7 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[7];
        this.mboundView7 = fontableTextView7;
        fontableTextView7.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView8 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[8];
        this.mboundView8 = fontableTextView8;
        fontableTextView8.setTag(null);
        this.sleepCircle.setTag(null);
        this.stepsCircle.setTag(null);
        this.todayTitle.setTag(null);
        setRootTag(root);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = android.support.v4.media.session.PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
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
        setViewModel((powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeViewModel) variable);
        return true;
    }

    @Override // powerwatch.matrix.com.pwgen2android.databinding.FragmentRealtimeBinding
    public void setViewModel(powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized (this) {
            this.mDirtyFlags |= android.support.v4.media.session.PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        }
        notifyPropertyChanged(1);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int localFieldId, java.lang.Object object, int fieldId) {
        switch (localFieldId) {
            case 0:
                return onChangeViewModelSleepPercentageField((androidx.databinding.ObservableField) object, fieldId);
            case 1:
                return onChangeViewModelSolarPowerField((androidx.databinding.ObservableField) object, fieldId);
            case 2:
                return onChangeViewModelBodyPowerField((androidx.databinding.ObservableField) object, fieldId);
            case 3:
                return onChangeViewModelSelectedDateTitle((androidx.databinding.ObservableField) object, fieldId);
            case 4:
                return onChangeViewModelDistanceField((androidx.databinding.ObservableField) object, fieldId);
            case 5:
                return onChangeViewModelSelectedDateSubTitle((androidx.databinding.ObservableField) object, fieldId);
            case 6:
                return onChangeViewModelHeartBeatField((androidx.databinding.ObservableField) object, fieldId);
            case 7:
                return onChangeViewModelStepsField((androidx.databinding.ObservableField) object, fieldId);
            case 8:
                return onChangeViewModelSleepField((androidx.databinding.ObservableField) object, fieldId);
            case 9:
                return onChangeViewModelCaloriesField((androidx.databinding.ObservableField) object, fieldId);
            default:
                return false;
        }
    }

    private boolean onChangeViewModelSleepPercentageField(androidx.databinding.ObservableField<java.lang.String> ViewModelSleepPercentageField, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeViewModelSolarPowerField(androidx.databinding.ObservableField<java.lang.String> ViewModelSolarPowerField, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    private boolean onChangeViewModelBodyPowerField(androidx.databinding.ObservableField<java.lang.String> ViewModelBodyPowerField, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        return true;
    }

    private boolean onChangeViewModelSelectedDateTitle(androidx.databinding.ObservableField<java.lang.String> ViewModelSelectedDateTitle, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        return true;
    }

    private boolean onChangeViewModelDistanceField(androidx.databinding.ObservableField<java.lang.String> ViewModelDistanceField, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        return true;
    }

    private boolean onChangeViewModelSelectedDateSubTitle(androidx.databinding.ObservableField<java.lang.String> ViewModelSelectedDateSubTitle, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 32;
        }
        return true;
    }

    private boolean onChangeViewModelHeartBeatField(androidx.databinding.ObservableField<java.lang.String> ViewModelHeartBeatField, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 64;
        }
        return true;
    }

    private boolean onChangeViewModelStepsField(androidx.databinding.ObservableField<java.lang.String> ViewModelStepsField, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 128;
        }
        return true;
    }

    private boolean onChangeViewModelSleepField(androidx.databinding.ObservableField<java.lang.String> ViewModelSleepField, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 256;
        }
        return true;
    }

    private boolean onChangeViewModelCaloriesField(androidx.databinding.ObservableField<java.lang.String> ViewModelCaloriesField, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 512;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0177 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:101:0x0179  */
    /* JADX WARN: Code duplicated, block: B:102:0x0180  */
    /* JADX WARN: Code duplicated, block: B:105:0x018b  */
    /* JADX WARN: Code duplicated, block: B:106:0x0192  */
    /* JADX WARN: Code duplicated, block: B:110:0x019e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:112:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:115:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:16:0x0041  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:69:0x0105  */
    /* JADX WARN: Code duplicated, block: B:78:0x0123  */
    /* JADX WARN: Code duplicated, block: B:87:0x0143  */
    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentRealtimeBindingImpl.OnClickListenerImpl value;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentRealtimeBindingImpl.OnClickListenerImpl3 value2;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentRealtimeBindingImpl.OnClickListenerImpl1 value3;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentRealtimeBindingImpl.OnClickListenerImpl2 value4;
        java.lang.String str10;
        java.lang.String str11;
        java.lang.String str12;
        java.lang.String str13;
        java.lang.String str14;
        java.lang.String str15;
        java.lang.String str16;
        java.lang.String str17;
        androidx.databinding.ObservableField<java.lang.String> caloriesField;
        androidx.databinding.ObservableField<java.lang.String> sleepField;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeViewModel realTimeViewModel = this.mViewModel;
        java.lang.String str18 = null;
        if ((4095 & j) != 0) {
            if ((j & 3073) == 0) {
                str11 = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> sleepPercentageField = realTimeViewModel != null ? realTimeViewModel.getSleepPercentageField() : null;
                updateRegistration(0, sleepPercentageField);
                if (sleepPercentageField != null) {
                    str11 = sleepPercentageField.get();
                } else {
                    str11 = null;
                }
            }
            if ((j & 3072) == 0 || realTimeViewModel == null) {
                value = null;
                value2 = null;
                value3 = null;
                value4 = null;
            } else {
                powerwatch.matrix.com.pwgen2android.databinding.FragmentRealtimeBindingImpl.OnClickListenerImpl onClickListenerImpl = this.mViewModelOnStepsCircleClickedAndroidViewViewOnClickListener;
                if (onClickListenerImpl == null) {
                    onClickListenerImpl = new powerwatch.matrix.com.pwgen2android.databinding.FragmentRealtimeBindingImpl.OnClickListenerImpl();
                    this.mViewModelOnStepsCircleClickedAndroidViewViewOnClickListener = onClickListenerImpl;
                }
                value = onClickListenerImpl.setValue(realTimeViewModel);
                powerwatch.matrix.com.pwgen2android.databinding.FragmentRealtimeBindingImpl.OnClickListenerImpl1 onClickListenerImpl1 = this.mViewModelOnCaloriesCircleClickedAndroidViewViewOnClickListener;
                if (onClickListenerImpl1 == null) {
                    onClickListenerImpl1 = new powerwatch.matrix.com.pwgen2android.databinding.FragmentRealtimeBindingImpl.OnClickListenerImpl1();
                    this.mViewModelOnCaloriesCircleClickedAndroidViewViewOnClickListener = onClickListenerImpl1;
                }
                value3 = onClickListenerImpl1.setValue(realTimeViewModel);
                powerwatch.matrix.com.pwgen2android.databinding.FragmentRealtimeBindingImpl.OnClickListenerImpl2 onClickListenerImpl2 = this.mViewModelOnSleepCircleClickedAndroidViewViewOnClickListener;
                if (onClickListenerImpl2 == null) {
                    onClickListenerImpl2 = new powerwatch.matrix.com.pwgen2android.databinding.FragmentRealtimeBindingImpl.OnClickListenerImpl2();
                    this.mViewModelOnSleepCircleClickedAndroidViewViewOnClickListener = onClickListenerImpl2;
                }
                value4 = onClickListenerImpl2.setValue(realTimeViewModel);
                powerwatch.matrix.com.pwgen2android.databinding.FragmentRealtimeBindingImpl.OnClickListenerImpl3 onClickListenerImpl3 = this.mViewModelOnPowerCircleClickedAndroidViewViewOnClickListener;
                if (onClickListenerImpl3 == null) {
                    onClickListenerImpl3 = new powerwatch.matrix.com.pwgen2android.databinding.FragmentRealtimeBindingImpl.OnClickListenerImpl3();
                    this.mViewModelOnPowerCircleClickedAndroidViewViewOnClickListener = onClickListenerImpl3;
                }
                value2 = onClickListenerImpl3.setValue(realTimeViewModel);
            }
            if ((j & 3074) == 0) {
                str12 = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> solarPowerField = realTimeViewModel != null ? realTimeViewModel.getSolarPowerField() : null;
                updateRegistration(1, solarPowerField);
                if (solarPowerField != null) {
                    str12 = solarPowerField.get();
                } else {
                    str12 = null;
                }
            }
            if ((j & 3076) == 0) {
                str6 = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> bodyPowerField = realTimeViewModel != null ? realTimeViewModel.getBodyPowerField() : null;
                updateRegistration(2, bodyPowerField);
                if (bodyPowerField != null) {
                    str6 = bodyPowerField.get();
                } else {
                    str6 = null;
                }
            }
            if ((j & 3080) == 0) {
                str13 = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> selectedDateTitle = realTimeViewModel != null ? realTimeViewModel.getSelectedDateTitle() : null;
                updateRegistration(3, selectedDateTitle);
                if (selectedDateTitle != null) {
                    str13 = selectedDateTitle.get();
                } else {
                    str13 = null;
                }
            }
            if ((j & 3088) == 0) {
                str14 = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> distanceField = realTimeViewModel != null ? realTimeViewModel.getDistanceField() : null;
                updateRegistration(4, distanceField);
                if (distanceField != null) {
                    str14 = distanceField.get();
                } else {
                    str14 = null;
                }
            }
            if ((j & 3104) == 0) {
                str15 = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> selectedDateSubTitle = realTimeViewModel != null ? realTimeViewModel.getSelectedDateSubTitle() : null;
                updateRegistration(5, selectedDateSubTitle);
                if (selectedDateSubTitle != null) {
                    str15 = selectedDateSubTitle.get();
                } else {
                    str15 = null;
                }
            }
            if ((j & 3136) == 0) {
                str3 = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> heartBeatField = realTimeViewModel != null ? realTimeViewModel.getHeartBeatField() : null;
                updateRegistration(6, heartBeatField);
                if (heartBeatField != null) {
                    str3 = heartBeatField.get();
                } else {
                    str3 = null;
                }
            }
            if ((j & 3200) != 0) {
                androidx.databinding.ObservableField<java.lang.String> stepsField = realTimeViewModel != null ? realTimeViewModel.getStepsField() : null;
                updateRegistration(7, stepsField);
                if (stepsField != null) {
                    str16 = stepsField.get();
                }
                if ((j & 3328) != 0) {
                    if (realTimeViewModel != null) {
                        sleepField = realTimeViewModel.getSleepField();
                    } else {
                        sleepField = null;
                    }
                    updateRegistration(8, sleepField);
                    if (sleepField != null) {
                        str17 = sleepField.get();
                    }
                    if ((j & 3584) != 0) {
                        if (realTimeViewModel != null) {
                            caloriesField = realTimeViewModel.getCaloriesField();
                        } else {
                            caloriesField = null;
                        }
                        updateRegistration(9, caloriesField);
                        if (caloriesField != null) {
                            str18 = caloriesField.get();
                        }
                    }
                    str10 = str13;
                    str9 = str14;
                    str = str15;
                    str8 = str16;
                    str7 = str12;
                    str5 = str11;
                    str4 = str17;
                    str2 = str18;
                } else {
                    str16 = str16;
                }
                str17 = null;
                if ((j & 3584) != 0) {
                    if (realTimeViewModel != null) {
                        caloriesField = realTimeViewModel.getCaloriesField();
                    } else {
                        caloriesField = null;
                    }
                    updateRegistration(9, caloriesField);
                    if (caloriesField != null) {
                        str18 = caloriesField.get();
                    }
                }
                str10 = str13;
                str9 = str14;
                str = str15;
                str8 = str16;
                str7 = str12;
                str5 = str11;
                str4 = str17;
                str2 = str18;
            } else {
                str15 = str15;
            }
            str16 = null;
            if ((j & 3328) != 0) {
                if (realTimeViewModel != null) {
                    sleepField = realTimeViewModel.getSleepField();
                } else {
                    sleepField = null;
                }
                updateRegistration(8, sleepField);
                if (sleepField != null) {
                    str17 = sleepField.get();
                }
                if ((j & 3584) != 0) {
                    if (realTimeViewModel != null) {
                        caloriesField = realTimeViewModel.getCaloriesField();
                    } else {
                        caloriesField = null;
                    }
                    updateRegistration(9, caloriesField);
                    if (caloriesField != null) {
                        str18 = caloriesField.get();
                    }
                }
                str10 = str13;
                str9 = str14;
                str = str15;
                str8 = str16;
                str7 = str12;
                str5 = str11;
                str4 = str17;
                str2 = str18;
            } else {
                str16 = str16;
            }
            str17 = null;
            if ((j & 3584) != 0) {
                if (realTimeViewModel != null) {
                    caloriesField = realTimeViewModel.getCaloriesField();
                } else {
                    caloriesField = null;
                }
                updateRegistration(9, caloriesField);
                if (caloriesField != null) {
                    str18 = caloriesField.get();
                }
            }
            str10 = str13;
            str9 = str14;
            str = str15;
            str8 = str16;
            str7 = str12;
            str5 = str11;
            str4 = str17;
            str2 = str18;
        } else {
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            value = null;
            value2 = null;
            str5 = null;
            str6 = null;
            str7 = null;
            str8 = null;
            str9 = null;
            value3 = null;
            value4 = null;
            str10 = null;
        }
        java.lang.String str19 = str9;
        if ((j & 3072) != 0) {
            this.caloriesCircle.setOnClickListener(value3);
            this.mboundView3.setOnClickListener(value2);
            this.sleepCircle.setOnClickListener(value4);
            this.stepsCircle.setOnClickListener(value);
        }
        if ((j & 3104) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.currentDateTitle, str);
        }
        if ((j & 3584) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView10, str2);
        }
        if ((j & 3136) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView11, str3);
        }
        if ((3328 & j) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView13, str4);
        }
        if ((j & 3073) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView14, str5);
        }
        if ((j & 3076) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, str6);
        }
        if ((j & 3074) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, str7);
        }
        if ((3200 & j) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, str8);
        }
        if ((3088 & j) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, str19);
        }
        if ((j & 3080) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.todayTitle, str10);
        }
    }

    public static class OnClickListenerImpl implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentRealtimeBindingImpl.OnClickListenerImpl setValue(powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeViewModel value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onStepsCircleClicked(arg0);
        }
    }

    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentRealtimeBindingImpl.OnClickListenerImpl1 setValue(powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeViewModel value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onCaloriesCircleClicked(arg0);
        }
    }

    public static class OnClickListenerImpl2 implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentRealtimeBindingImpl.OnClickListenerImpl2 setValue(powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeViewModel value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onSleepCircleClicked(arg0);
        }
    }

    public static class OnClickListenerImpl3 implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentRealtimeBindingImpl.OnClickListenerImpl3 setValue(powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeViewModel value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onPowerCircleClicked(arg0);
        }
    }
}
