package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public class FragmentActivityPeriodItemBindingImpl extends powerwatch.matrix.com.pwgen2android.databinding.FragmentActivityPeriodItemBinding {
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final android.util.SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentActivityPeriodItemBindingImpl.OnClickListenerImpl mViewModelOnOpenDrillDownScreenAndroidViewViewOnClickListener;
    private final android.widget.LinearLayout mboundView0;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView1;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView2;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView3;

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.header_layout, 4);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.first_header_value_title, 5);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.first_header_value_text, 6);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.third_header_value_title, 7);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.third_header_value_text, 8);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.second_header_value_title, 9);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.second_header_value_text, 10);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.fourth_header_value_title, 11);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.fourth_header_value_text, 12);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.chart_fragment_container, 13);
    }

    public FragmentActivityPeriodItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }

    private FragmentActivityPeriodItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root, java.lang.Object[] bindings) {
        super(bindingComponent, root, 4, (android.widget.FrameLayout) bindings[13], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[6], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[5], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[12], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[11], (android.widget.LinearLayout) bindings[4], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[10], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[9], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[8], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[7]);
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
        setViewModel((powerwatch.matrix.com.pwgen2android.shared.ui.activityPeriods.BaseDashboardActivityPeriodItemViewModel) variable);
        return true;
    }

    @Override // powerwatch.matrix.com.pwgen2android.databinding.FragmentActivityPeriodItemBinding
    public void setViewModel(powerwatch.matrix.com.pwgen2android.shared.ui.activityPeriods.BaseDashboardActivityPeriodItemViewModel ViewModel) {
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
            return onChangeViewModelHeaderColor((androidx.databinding.ObservableField) object, fieldId);
        }
        if (localFieldId == 1) {
            return onChangeViewModelTitle((androidx.databinding.ObservableField) object, fieldId);
        }
        if (localFieldId == 2) {
            return onChangeViewModelSubTitleValue((androidx.databinding.ObservableField) object, fieldId);
        }
        if (localFieldId != 3) {
            return false;
        }
        return onChangeViewModelSubTitle((androidx.databinding.ObservableField) object, fieldId);
    }

    private boolean onChangeViewModelHeaderColor(androidx.databinding.ObservableField<java.lang.Integer> ViewModelHeaderColor, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeViewModelTitle(androidx.databinding.ObservableField<java.lang.String> ViewModelTitle, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    private boolean onChangeViewModelSubTitleValue(androidx.databinding.ObservableField<java.lang.String> ViewModelSubTitleValue, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        return true;
    }

    private boolean onChangeViewModelSubTitle(androidx.databinding.ObservableField<java.lang.String> ViewModelSubTitle, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0056  */
    /* JADX WARN: Code duplicated, block: B:35:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x0090  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentActivityPeriodItemBindingImpl.OnClickListenerImpl value;
        java.lang.String str4;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        powerwatch.matrix.com.pwgen2android.shared.ui.activityPeriods.BaseDashboardActivityPeriodItemViewModel baseDashboardActivityPeriodItemViewModel = this.mViewModel;
        int iSafeUnbox = 0;
        if ((63 & j) != 0) {
            if ((j & 49) != 0) {
                androidx.databinding.ObservableField<java.lang.Integer> headerColor = baseDashboardActivityPeriodItemViewModel != null ? baseDashboardActivityPeriodItemViewModel.getHeaderColor() : null;
                updateRegistration(0, headerColor);
                iSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(headerColor != null ? headerColor.get() : null);
            }
            if ((j & 50) == 0) {
                str2 = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> title = baseDashboardActivityPeriodItemViewModel != null ? baseDashboardActivityPeriodItemViewModel.getTitle() : null;
                updateRegistration(1, title);
                if (title != null) {
                    str2 = title.get();
                } else {
                    str2 = null;
                }
            }
            if ((j & 52) == 0) {
                str3 = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> subTitleValue = baseDashboardActivityPeriodItemViewModel != null ? baseDashboardActivityPeriodItemViewModel.getSubTitleValue() : null;
                updateRegistration(2, subTitleValue);
                if (subTitleValue != null) {
                    str3 = subTitleValue.get();
                } else {
                    str3 = null;
                }
            }
            if ((j & 56) == 0) {
                str4 = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> subTitle = baseDashboardActivityPeriodItemViewModel != null ? baseDashboardActivityPeriodItemViewModel.getSubTitle() : null;
                updateRegistration(3, subTitle);
                if (subTitle != null) {
                    str4 = subTitle.get();
                } else {
                    str4 = null;
                }
            }
            if ((j & 48) == 0 || baseDashboardActivityPeriodItemViewModel == null) {
                str = str4;
            } else {
                powerwatch.matrix.com.pwgen2android.databinding.FragmentActivityPeriodItemBindingImpl.OnClickListenerImpl onClickListenerImpl = this.mViewModelOnOpenDrillDownScreenAndroidViewViewOnClickListener;
                if (onClickListenerImpl == null) {
                    onClickListenerImpl = new powerwatch.matrix.com.pwgen2android.databinding.FragmentActivityPeriodItemBindingImpl.OnClickListenerImpl();
                    this.mViewModelOnOpenDrillDownScreenAndroidViewViewOnClickListener = onClickListenerImpl;
                }
                java.lang.String str5 = str4;
                value = onClickListenerImpl.setValue(baseDashboardActivityPeriodItemViewModel);
                str = str5;
            }
            if ((j & 48) != 0) {
                this.mboundView0.setOnClickListener(value);
            }
            if ((j & 50) != 0) {
                androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, str2);
            }
            if ((j & 49) != 0) {
                this.mboundView1.setTextColor(iSafeUnbox);
            }
            if ((56 & j) != 0) {
                androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, str);
            }
            if ((j & 52) != 0) {
                androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, str3);
            }
        }
        str = null;
        str2 = null;
        str3 = null;
        value = null;
        if ((j & 48) != 0) {
            this.mboundView0.setOnClickListener(value);
        }
        if ((j & 50) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, str2);
        }
        if ((j & 49) != 0) {
            this.mboundView1.setTextColor(iSafeUnbox);
        }
        if ((56 & j) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, str);
        }
        if ((j & 52) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, str3);
        }
    }

    public static class OnClickListenerImpl implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.shared.ui.activityPeriods.BaseDashboardActivityPeriodItemViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentActivityPeriodItemBindingImpl.OnClickListenerImpl setValue(powerwatch.matrix.com.pwgen2android.shared.ui.activityPeriods.BaseDashboardActivityPeriodItemViewModel value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onOpenDrillDownScreen(arg0);
        }
    }
}
