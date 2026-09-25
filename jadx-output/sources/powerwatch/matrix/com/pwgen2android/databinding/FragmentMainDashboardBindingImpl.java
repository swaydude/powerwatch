package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public class FragmentMainDashboardBindingImpl extends powerwatch.matrix.com.pwgen2android.databinding.FragmentMainDashboardBinding implements powerwatch.matrix.com.pwgen2android.generated.callback.OnRefreshListener.Listener {
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final android.util.SparseIntArray sViewsWithIds;
    private final androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener mCallback1;
    private long mDirtyFlags;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentMainDashboardBindingImpl.OnClickListenerImpl mViewModelOnToastMessageClickedAndroidViewViewOnClickListener;
    private final android.widget.LinearLayout mboundView1;
    private final android.widget.LinearLayout mboundView2;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView3;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView4;
    private final android.widget.LinearLayout mboundView5;

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.main_scroll, 7);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.real_time_fragment, 8);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.user_activity_fragment, 9);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.pedometer_day_fragment, 10);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.calories_day_fragment, 11);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.heart_rate_day_fragment, 12);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.sleep_day_fragment, 13);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.power_day_fragment, 14);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.temperature_day_fragment, 15);
    }

    public FragmentMainDashboardBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }

    private FragmentMainDashboardBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root, java.lang.Object[] bindings) {
        super(bindingComponent, root, 7, (android.widget.FrameLayout) bindings[11], (android.widget.FrameLayout) bindings[12], (androidx.core.widget.NestedScrollView) bindings[7], (android.widget.FrameLayout) bindings[10], (android.widget.FrameLayout) bindings[14], (android.widget.FrameLayout) bindings[8], (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) bindings[0], (android.widget.FrameLayout) bindings[13], (android.widget.FrameLayout) bindings[6], (android.widget.FrameLayout) bindings[15], (android.widget.FrameLayout) bindings[9]);
        this.mDirtyFlags = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) bindings[1];
        this.mboundView1 = linearLayout;
        linearLayout.setTag(null);
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) bindings[2];
        this.mboundView2 = linearLayout2;
        linearLayout2.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[3];
        this.mboundView3 = fontableTextView;
        fontableTextView.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView2 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[4];
        this.mboundView4 = fontableTextView2;
        fontableTextView2.setTag(null);
        android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) bindings[5];
        this.mboundView5 = linearLayout3;
        linearLayout3.setTag(null);
        this.refreshLayout.setTag(null);
        this.syncFragment.setTag(null);
        setRootTag(root);
        this.mCallback1 = new powerwatch.matrix.com.pwgen2android.generated.callback.OnRefreshListener(this, 1);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 256L;
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
        setViewModel((powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardViewModel) variable);
        return true;
    }

    @Override // powerwatch.matrix.com.pwgen2android.databinding.FragmentMainDashboardBinding
    public void setViewModel(powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 128;
        }
        notifyPropertyChanged(1);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int localFieldId, java.lang.Object object, int fieldId) {
        switch (localFieldId) {
            case 0:
                return onChangeViewModelToastActionButtonFieldText((androidx.databinding.ObservableField) object, fieldId);
            case 1:
                return onChangeViewModelSyncInProgress((androidx.databinding.ObservableField) object, fieldId);
            case 2:
                return onChangeViewModelPullToSyncDisplayed((androidx.databinding.ObservableField) object, fieldId);
            case 3:
                return onChangeViewModelIsSyncBlocked((androidx.databinding.ObservableField) object, fieldId);
            case 4:
                return onChangeViewModelToastMessageFieldText((androidx.databinding.ObservableField) object, fieldId);
            case 5:
                return onChangeViewModelToastMessageDisplayed((androidx.databinding.ObservableField) object, fieldId);
            case 6:
                return onChangeViewModelIsSwipeRefreshing((androidx.databinding.ObservableField) object, fieldId);
            default:
                return false;
        }
    }

    private boolean onChangeViewModelToastActionButtonFieldText(androidx.databinding.ObservableField<java.lang.String> ViewModelToastActionButtonFieldText, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeViewModelSyncInProgress(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelSyncInProgress, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    private boolean onChangeViewModelPullToSyncDisplayed(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelPullToSyncDisplayed, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        return true;
    }

    private boolean onChangeViewModelIsSyncBlocked(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelIsSyncBlocked, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        return true;
    }

    private boolean onChangeViewModelToastMessageFieldText(androidx.databinding.ObservableField<java.lang.String> ViewModelToastMessageFieldText, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        return true;
    }

    private boolean onChangeViewModelToastMessageDisplayed(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelToastMessageDisplayed, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 32;
        }
        return true;
    }

    private boolean onChangeViewModelIsSwipeRefreshing(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelIsSwipeRefreshing, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 64;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003a  */
    /* JADX WARN: Code duplicated, block: B:69:0x0109  */
    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j;
        boolean zSafeUnbox;
        boolean z;
        boolean zSafeUnbox2;
        boolean z2;
        boolean zSafeUnbox3;
        java.lang.String str;
        java.lang.String str2;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentMainDashboardBindingImpl.OnClickListenerImpl value;
        java.lang.String str3;
        boolean zSafeUnbox4;
        boolean zSafeUnbox5;
        androidx.databinding.ObservableField<java.lang.Boolean> pullToSyncDisplayed;
        androidx.databinding.ObservableField<java.lang.Boolean> toastMessageDisplayed;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardViewModel mainDashboardViewModel = this.mViewModel;
        if ((511 & j) != 0) {
            if ((j & 385) == 0) {
                str3 = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> toastActionButtonFieldText = mainDashboardViewModel != null ? mainDashboardViewModel.getToastActionButtonFieldText() : null;
                updateRegistration(0, toastActionButtonFieldText);
                if (toastActionButtonFieldText != null) {
                    str3 = toastActionButtonFieldText.get();
                } else {
                    str3 = null;
                }
            }
            if ((j & 386) != 0) {
                androidx.databinding.ObservableField<java.lang.Boolean> syncInProgress = mainDashboardViewModel != null ? mainDashboardViewModel.getSyncInProgress() : null;
                updateRegistration(1, syncInProgress);
                zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(syncInProgress != null ? syncInProgress.get() : null);
            } else {
                zSafeUnbox4 = false;
            }
            if ((j & 420) != 0) {
                if (mainDashboardViewModel != null) {
                    pullToSyncDisplayed = mainDashboardViewModel.getPullToSyncDisplayed();
                    toastMessageDisplayed = mainDashboardViewModel.getToastMessageDisplayed();
                } else {
                    pullToSyncDisplayed = null;
                    toastMessageDisplayed = null;
                }
                updateRegistration(2, pullToSyncDisplayed);
                updateRegistration(5, toastMessageDisplayed);
                java.lang.Boolean bool = pullToSyncDisplayed != null ? pullToSyncDisplayed.get() : null;
                java.lang.Boolean bool2 = toastMessageDisplayed != null ? toastMessageDisplayed.get() : null;
                boolean zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                zSafeUnbox5 = androidx.databinding.ViewDataBinding.safeUnbox(bool2);
                zSafeUnbox3 = androidx.databinding.ViewDataBinding.safeUnbox(java.lang.Boolean.valueOf(zSafeUnbox6 & (!zSafeUnbox5)));
            } else {
                zSafeUnbox3 = false;
                zSafeUnbox5 = false;
            }
            if ((j & 384) == 0 || mainDashboardViewModel == null) {
                value = null;
            } else {
                powerwatch.matrix.com.pwgen2android.databinding.FragmentMainDashboardBindingImpl.OnClickListenerImpl onClickListenerImpl = this.mViewModelOnToastMessageClickedAndroidViewViewOnClickListener;
                if (onClickListenerImpl == null) {
                    onClickListenerImpl = new powerwatch.matrix.com.pwgen2android.databinding.FragmentMainDashboardBindingImpl.OnClickListenerImpl();
                    this.mViewModelOnToastMessageClickedAndroidViewViewOnClickListener = onClickListenerImpl;
                }
                value = onClickListenerImpl.setValue(mainDashboardViewModel);
            }
            if ((j & 392) != 0) {
                androidx.databinding.ObservableField<java.lang.Boolean> observableFieldIsSyncBlocked = mainDashboardViewModel != null ? mainDashboardViewModel.isSyncBlocked() : null;
                updateRegistration(3, observableFieldIsSyncBlocked);
                zSafeUnbox2 = androidx.databinding.ViewDataBinding.safeUnbox(java.lang.Boolean.valueOf(true ^ androidx.databinding.ViewDataBinding.safeUnbox(observableFieldIsSyncBlocked != null ? observableFieldIsSyncBlocked.get() : null)));
            } else {
                zSafeUnbox2 = false;
            }
            if ((j & 400) == 0) {
                str = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> toastMessageFieldText = mainDashboardViewModel != null ? mainDashboardViewModel.getToastMessageFieldText() : null;
                updateRegistration(4, toastMessageFieldText);
                if (toastMessageFieldText != null) {
                    str = toastMessageFieldText.get();
                } else {
                    str = null;
                }
            }
            if ((j & 448) != 0) {
                androidx.databinding.ObservableField<java.lang.Boolean> observableFieldIsSwipeRefreshing = mainDashboardViewModel != null ? mainDashboardViewModel.isSwipeRefreshing() : null;
                updateRegistration(6, observableFieldIsSwipeRefreshing);
                zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(observableFieldIsSwipeRefreshing != null ? observableFieldIsSwipeRefreshing.get() : null);
                str2 = str3;
                z = zSafeUnbox4;
                z2 = zSafeUnbox5;
            } else {
                str2 = str3;
                z = zSafeUnbox4;
                z2 = zSafeUnbox5;
                zSafeUnbox = false;
            }
        } else {
            zSafeUnbox = false;
            z = false;
            zSafeUnbox2 = false;
            z2 = false;
            zSafeUnbox3 = false;
            str = null;
            str2 = null;
            value = null;
        }
        if ((j & 416) != 0) {
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.goneUnless(this.mboundView2, z2);
        }
        if ((j & 400) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, str);
        }
        if ((384 & j) != 0) {
            this.mboundView4.setOnClickListener(value);
        }
        if ((j & 385) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, str2);
        }
        if ((420 & j) != 0) {
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.goneUnless(this.mboundView5, zSafeUnbox3);
        }
        if ((256 & j) != 0) {
            this.refreshLayout.setOnRefreshListener(this.mCallback1);
        }
        if ((448 & j) != 0) {
            this.refreshLayout.setRefreshing(zSafeUnbox);
        }
        if ((392 & j) != 0) {
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.swipeEnabled(this.refreshLayout, zSafeUnbox2);
        }
        if ((j & 386) != 0) {
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.goneUnless(this.syncFragment, z);
        }
    }

    public static class OnClickListenerImpl implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentMainDashboardBindingImpl.OnClickListenerImpl setValue(powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardViewModel value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onToastMessageClicked(arg0);
        }
    }

    @Override // powerwatch.matrix.com.pwgen2android.generated.callback.OnRefreshListener.Listener
    public final void _internalCallbackOnRefresh(int sourceId) {
        powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardViewModel mainDashboardViewModel = this.mViewModel;
        if (mainDashboardViewModel != null) {
            mainDashboardViewModel.onRefresh();
        }
    }
}
