package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public class FragmentActivityPeriodsBindingImpl extends powerwatch.matrix.com.pwgen2android.databinding.FragmentActivityPeriodsBinding {
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final android.util.SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentActivityPeriodsBindingImpl.OnClickListenerImpl4 mViewModelOnDayPeriodClickedAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentActivityPeriodsBindingImpl.OnClickListenerImpl2 mViewModelOnMonthPeriodClickedAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentActivityPeriodsBindingImpl.OnClickListenerImpl3 mViewModelOnNextClickedAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentActivityPeriodsBindingImpl.OnClickListenerImpl1 mViewModelOnPreviousClickedAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentActivityPeriodsBindingImpl.OnClickListenerImpl mViewModelOnWeekPeriodClickedAndroidViewViewOnClickListener;
    private final android.widget.LinearLayout mboundView0;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView1;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView2;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView3;
    private final android.widget.ImageView mboundView4;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView5;
    private final android.widget.ImageView mboundView6;

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.header_layout, 7);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.first_header_value_title, 8);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.first_header_value_text, 9);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.third_header_value_title, 10);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.third_header_value_text, 11);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.second_header_value_title, 12);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.second_header_value_text, 13);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.fourth_header_value_title, 14);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.fourth_header_value_text, 15);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.chart_pager, 16);
    }

    public FragmentActivityPeriodsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }

    private FragmentActivityPeriodsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root, java.lang.Object[] bindings) {
        super(bindingComponent, root, 3, (powerwatch.matrix.com.pwgen2android.shared.ui.views.LockableViewPager) bindings[16], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[9], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[8], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[15], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[14], (android.widget.LinearLayout) bindings[7], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[13], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[12], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[11], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[10]);
        this.mDirtyFlags = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) bindings[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[1];
        this.mboundView1 = fontableTextView;
        fontableTextView.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView2 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[2];
        this.mboundView2 = fontableTextView2;
        fontableTextView2.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView3 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[3];
        this.mboundView3 = fontableTextView3;
        fontableTextView3.setTag(null);
        android.widget.ImageView imageView = (android.widget.ImageView) bindings[4];
        this.mboundView4 = imageView;
        imageView.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView4 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[5];
        this.mboundView5 = fontableTextView4;
        fontableTextView4.setTag(null);
        android.widget.ImageView imageView2 = (android.widget.ImageView) bindings[6];
        this.mboundView6 = imageView2;
        imageView2.setTag(null);
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
        setViewModel((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BaseChartPeriodsViewModel) variable);
        return true;
    }

    @Override // powerwatch.matrix.com.pwgen2android.databinding.FragmentActivityPeriodsBinding
    public void setViewModel(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BaseChartPeriodsViewModel ViewModel) {
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
            return onChangeViewModelNavigationColor((androidx.databinding.ObservableField) object, fieldId);
        }
        if (localFieldId == 1) {
            return onChangeViewModelCurrentPeriodType((androidx.databinding.ObservableField) object, fieldId);
        }
        if (localFieldId != 2) {
            return false;
        }
        return onChangeViewModelCurrentDateText((androidx.databinding.ObservableField) object, fieldId);
    }

    private boolean onChangeViewModelNavigationColor(androidx.databinding.ObservableField<java.lang.Integer> ViewModelNavigationColor, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeViewModelCurrentPeriodType(androidx.databinding.ObservableField<java.lang.Integer> ViewModelCurrentPeriodType, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    private boolean onChangeViewModelCurrentDateText(androidx.databinding.ObservableField<java.lang.String> ViewModelCurrentDateText, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0171  */
    /* JADX WARN: Code duplicated, block: B:104:0x017b  */
    /* JADX WARN: Code duplicated, block: B:106:0x0196  */
    /* JADX WARN: Code duplicated, block: B:109:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:88:0x0126  */
    /* JADX WARN: Code duplicated, block: B:90:0x012b  */
    /* JADX WARN: Code duplicated, block: B:91:0x0130  */
    /* JADX WARN: Code duplicated, block: B:94:0x013c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0141  */
    /* JADX WARN: Code duplicated, block: B:98:0x014d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0152  */
    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentActivityPeriodsBindingImpl.OnClickListenerImpl value;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentActivityPeriodsBindingImpl.OnClickListenerImpl1 value2;
        java.lang.String str;
        boolean z;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentActivityPeriodsBindingImpl.OnClickListenerImpl3 value3;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentActivityPeriodsBindingImpl.OnClickListenerImpl4 value4;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentActivityPeriodsBindingImpl.OnClickListenerImpl2 value5;
        boolean z2;
        boolean z3;
        int i;
        java.lang.Integer num;
        long j2;
        int i2;
        int i3;
        long j3;
        int colorFromResource;
        int colorFromResource2;
        int colorFromResource3;
        long j4;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BaseChartPeriodsViewModel baseChartPeriodsViewModel = this.mViewModel;
        if ((31 & j) != 0) {
            if ((j & 24) == 0 || baseChartPeriodsViewModel == null) {
                value = null;
                value2 = null;
                value3 = null;
                value4 = null;
                value5 = null;
            } else {
                powerwatch.matrix.com.pwgen2android.databinding.FragmentActivityPeriodsBindingImpl.OnClickListenerImpl onClickListenerImpl = this.mViewModelOnWeekPeriodClickedAndroidViewViewOnClickListener;
                if (onClickListenerImpl == null) {
                    onClickListenerImpl = new powerwatch.matrix.com.pwgen2android.databinding.FragmentActivityPeriodsBindingImpl.OnClickListenerImpl();
                    this.mViewModelOnWeekPeriodClickedAndroidViewViewOnClickListener = onClickListenerImpl;
                }
                value = onClickListenerImpl.setValue(baseChartPeriodsViewModel);
                powerwatch.matrix.com.pwgen2android.databinding.FragmentActivityPeriodsBindingImpl.OnClickListenerImpl1 onClickListenerImpl1 = this.mViewModelOnPreviousClickedAndroidViewViewOnClickListener;
                if (onClickListenerImpl1 == null) {
                    onClickListenerImpl1 = new powerwatch.matrix.com.pwgen2android.databinding.FragmentActivityPeriodsBindingImpl.OnClickListenerImpl1();
                    this.mViewModelOnPreviousClickedAndroidViewViewOnClickListener = onClickListenerImpl1;
                }
                value2 = onClickListenerImpl1.setValue(baseChartPeriodsViewModel);
                powerwatch.matrix.com.pwgen2android.databinding.FragmentActivityPeriodsBindingImpl.OnClickListenerImpl2 onClickListenerImpl2 = this.mViewModelOnMonthPeriodClickedAndroidViewViewOnClickListener;
                if (onClickListenerImpl2 == null) {
                    onClickListenerImpl2 = new powerwatch.matrix.com.pwgen2android.databinding.FragmentActivityPeriodsBindingImpl.OnClickListenerImpl2();
                    this.mViewModelOnMonthPeriodClickedAndroidViewViewOnClickListener = onClickListenerImpl2;
                }
                value5 = onClickListenerImpl2.setValue(baseChartPeriodsViewModel);
                powerwatch.matrix.com.pwgen2android.databinding.FragmentActivityPeriodsBindingImpl.OnClickListenerImpl3 onClickListenerImpl3 = this.mViewModelOnNextClickedAndroidViewViewOnClickListener;
                if (onClickListenerImpl3 == null) {
                    onClickListenerImpl3 = new powerwatch.matrix.com.pwgen2android.databinding.FragmentActivityPeriodsBindingImpl.OnClickListenerImpl3();
                    this.mViewModelOnNextClickedAndroidViewViewOnClickListener = onClickListenerImpl3;
                }
                value3 = onClickListenerImpl3.setValue(baseChartPeriodsViewModel);
                powerwatch.matrix.com.pwgen2android.databinding.FragmentActivityPeriodsBindingImpl.OnClickListenerImpl4 onClickListenerImpl4 = this.mViewModelOnDayPeriodClickedAndroidViewViewOnClickListener;
                if (onClickListenerImpl4 == null) {
                    onClickListenerImpl4 = new powerwatch.matrix.com.pwgen2android.databinding.FragmentActivityPeriodsBindingImpl.OnClickListenerImpl4();
                    this.mViewModelOnDayPeriodClickedAndroidViewViewOnClickListener = onClickListenerImpl4;
                }
                value4 = onClickListenerImpl4.setValue(baseChartPeriodsViewModel);
            }
            long j5 = j & 27;
            if (j5 != 0) {
                androidx.databinding.ObservableField<java.lang.Integer> currentPeriodType = baseChartPeriodsViewModel != null ? baseChartPeriodsViewModel.getCurrentPeriodType() : null;
                updateRegistration(1, currentPeriodType);
                int iSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(currentPeriodType != null ? currentPeriodType.get() : null);
                z2 = iSafeUnbox == 1;
                z3 = iSafeUnbox == 0;
                z = iSafeUnbox == 2;
                if (j5 != 0) {
                    j |= z2 ? 64L : 32L;
                }
                if ((j & 27) != 0) {
                    j |= z3 ? android.support.v4.media.session.PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID : 512L;
                }
                if ((j & 27) != 0) {
                    j |= z ? 256L : 128L;
                }
                j4 = 28;
            } else {
                z = false;
                j4 = 28;
                z2 = false;
                z3 = false;
            }
            if ((j & j4) == 0) {
                str = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> currentDateText = baseChartPeriodsViewModel != null ? baseChartPeriodsViewModel.getCurrentDateText() : null;
                updateRegistration(2, currentDateText);
                if (currentDateText != null) {
                    str = currentDateText.get();
                } else {
                    str = null;
                }
            }
        } else {
            value = null;
            value2 = null;
            str = null;
            z = false;
            value3 = null;
            value4 = null;
            value5 = null;
            z2 = false;
            z3 = false;
        }
        if ((j & 1344) != 0) {
            androidx.databinding.ObservableField<java.lang.Integer> navigationColor = baseChartPeriodsViewModel != null ? baseChartPeriodsViewModel.getNavigationColor() : null;
            i = 0;
            updateRegistration(0, navigationColor);
            num = navigationColor != null ? navigationColor.get() : null;
            j2 = 27 & j;
            if (j2 != 0) {
                if (z2) {
                    colorFromResource = num.intValue();
                } else {
                    colorFromResource = getColorFromResource(this.mboundView2, powerwatch.matrix.com.pwgen2android.R.color.white);
                }
                java.lang.Integer numValueOf = java.lang.Integer.valueOf(colorFromResource);
                if (z) {
                    colorFromResource2 = num.intValue();
                } else {
                    colorFromResource2 = getColorFromResource(this.mboundView3, powerwatch.matrix.com.pwgen2android.R.color.white);
                }
                java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(colorFromResource2);
                if (z3) {
                    colorFromResource3 = num.intValue();
                } else {
                    colorFromResource3 = getColorFromResource(this.mboundView1, powerwatch.matrix.com.pwgen2android.R.color.white);
                }
                java.lang.Integer numValueOf3 = java.lang.Integer.valueOf(colorFromResource3);
                int iSafeUnbox2 = androidx.databinding.ViewDataBinding.safeUnbox(numValueOf);
                int iSafeUnbox3 = androidx.databinding.ViewDataBinding.safeUnbox(numValueOf2);
                int iSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(numValueOf3);
                j3 = 24;
                i3 = iSafeUnbox3;
                i2 = iSafeUnbox2;
                i = iSafeUnbox4;
            } else {
                i2 = 0;
                i3 = 0;
                j3 = 24;
            }
            if ((j & j3) != 0) {
                this.mboundView1.setOnClickListener(value4);
                this.mboundView2.setOnClickListener(value);
                this.mboundView3.setOnClickListener(value5);
                this.mboundView4.setOnClickListener(value2);
                this.mboundView6.setOnClickListener(value3);
            }
            if (j2 != 0) {
                this.mboundView1.setTextColor(i);
                this.mboundView2.setTextColor(i2);
                this.mboundView3.setTextColor(i3);
            }
            if ((j & 28) != 0) {
                androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, str);
            }
        }
        i = 0;
        j2 = 27 & j;
        if (j2 != 0) {
            if (z2) {
                colorFromResource = num.intValue();
            } else {
                colorFromResource = getColorFromResource(this.mboundView2, powerwatch.matrix.com.pwgen2android.R.color.white);
            }
            java.lang.Integer numValueOf4 = java.lang.Integer.valueOf(colorFromResource);
            if (z) {
                colorFromResource2 = num.intValue();
            } else {
                colorFromResource2 = getColorFromResource(this.mboundView3, powerwatch.matrix.com.pwgen2android.R.color.white);
            }
            java.lang.Integer numValueOf5 = java.lang.Integer.valueOf(colorFromResource2);
            if (z3) {
                colorFromResource3 = num.intValue();
            } else {
                colorFromResource3 = getColorFromResource(this.mboundView1, powerwatch.matrix.com.pwgen2android.R.color.white);
            }
            java.lang.Integer numValueOf6 = java.lang.Integer.valueOf(colorFromResource3);
            int iSafeUnbox5 = androidx.databinding.ViewDataBinding.safeUnbox(numValueOf4);
            int iSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(numValueOf5);
            int iSafeUnbox7 = androidx.databinding.ViewDataBinding.safeUnbox(numValueOf6);
            j3 = 24;
            i3 = iSafeUnbox6;
            i2 = iSafeUnbox5;
            i = iSafeUnbox7;
        } else {
            i2 = 0;
            i3 = 0;
            j3 = 24;
        }
        if ((j & j3) != 0) {
            this.mboundView1.setOnClickListener(value4);
            this.mboundView2.setOnClickListener(value);
            this.mboundView3.setOnClickListener(value5);
            this.mboundView4.setOnClickListener(value2);
            this.mboundView6.setOnClickListener(value3);
        }
        if (j2 != 0) {
            this.mboundView1.setTextColor(i);
            this.mboundView2.setTextColor(i2);
            this.mboundView3.setTextColor(i3);
        }
        if ((j & 28) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, str);
        }
    }

    public static class OnClickListenerImpl implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BaseChartPeriodsViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentActivityPeriodsBindingImpl.OnClickListenerImpl setValue(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BaseChartPeriodsViewModel value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onWeekPeriodClicked(arg0);
        }
    }

    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BaseChartPeriodsViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentActivityPeriodsBindingImpl.OnClickListenerImpl1 setValue(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BaseChartPeriodsViewModel value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onPreviousClicked(arg0);
        }
    }

    public static class OnClickListenerImpl2 implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BaseChartPeriodsViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentActivityPeriodsBindingImpl.OnClickListenerImpl2 setValue(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BaseChartPeriodsViewModel value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onMonthPeriodClicked(arg0);
        }
    }

    public static class OnClickListenerImpl3 implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BaseChartPeriodsViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentActivityPeriodsBindingImpl.OnClickListenerImpl3 setValue(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BaseChartPeriodsViewModel value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onNextClicked(arg0);
        }
    }

    public static class OnClickListenerImpl4 implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BaseChartPeriodsViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentActivityPeriodsBindingImpl.OnClickListenerImpl4 setValue(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BaseChartPeriodsViewModel value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onDayPeriodClicked(arg0);
        }
    }
}
