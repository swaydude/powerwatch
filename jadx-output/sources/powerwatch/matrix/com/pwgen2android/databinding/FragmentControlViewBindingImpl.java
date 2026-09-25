package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public class FragmentControlViewBindingImpl extends powerwatch.matrix.com.pwgen2android.databinding.FragmentControlViewBinding {
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final android.util.SparseIntArray sViewsWithIds = null;
    private long mDirtyFlags;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentControlViewBindingImpl.OnClickListenerImpl mViewModelOnPlayClickedAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentControlViewBindingImpl.OnProgressChangedImpl mViewModelOnProgressChangedAndroidxDatabindingAdaptersSeekBarBindingAdapterOnProgressChanged;
    private final android.widget.LinearLayout mboundView0;
    private final android.widget.SeekBar mboundView2;

    public FragmentControlViewBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }

    private FragmentControlViewBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root, java.lang.Object[] bindings) {
        super(bindingComponent, root, 2, (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[1]);
        this.mDirtyFlags = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) bindings[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag(null);
        android.widget.SeekBar seekBar = (android.widget.SeekBar) bindings[2];
        this.mboundView2 = seekBar;
        seekBar.setTag(null);
        this.playButton.setTag(null);
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
        setViewModel((powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.control.ControlViewViewModel) variable);
        return true;
    }

    @Override // powerwatch.matrix.com.pwgen2android.databinding.FragmentControlViewBinding
    public void setViewModel(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.control.ControlViewViewModel ViewModel) {
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
            return onChangeViewModelCurrentProgress((androidx.databinding.ObservableField) object, fieldId);
        }
        if (localFieldId != 1) {
            return false;
        }
        return onChangeViewModelButtonIcon((androidx.databinding.ObservableField) object, fieldId);
    }

    private boolean onChangeViewModelCurrentProgress(androidx.databinding.ObservableField<java.lang.Integer> ViewModelCurrentProgress, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeViewModelButtonIcon(androidx.databinding.ObservableField<java.lang.Integer> ViewModelButtonIcon, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j;
        int iSafeUnbox;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentControlViewBindingImpl.OnProgressChangedImpl value;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentControlViewBindingImpl.OnClickListenerImpl value2;
        int iSafeUnbox2;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.control.ControlViewViewModel controlViewViewModel = this.mViewModel;
        int i = 0;
        if ((15 & j) != 0) {
            if ((j & 12) == 0 || controlViewViewModel == null) {
                value = null;
                value2 = null;
            } else {
                powerwatch.matrix.com.pwgen2android.databinding.FragmentControlViewBindingImpl.OnProgressChangedImpl onProgressChangedImpl = this.mViewModelOnProgressChangedAndroidxDatabindingAdaptersSeekBarBindingAdapterOnProgressChanged;
                if (onProgressChangedImpl == null) {
                    onProgressChangedImpl = new powerwatch.matrix.com.pwgen2android.databinding.FragmentControlViewBindingImpl.OnProgressChangedImpl();
                    this.mViewModelOnProgressChangedAndroidxDatabindingAdaptersSeekBarBindingAdapterOnProgressChanged = onProgressChangedImpl;
                }
                value = onProgressChangedImpl.setValue(controlViewViewModel);
                powerwatch.matrix.com.pwgen2android.databinding.FragmentControlViewBindingImpl.OnClickListenerImpl onClickListenerImpl = this.mViewModelOnPlayClickedAndroidViewViewOnClickListener;
                if (onClickListenerImpl == null) {
                    onClickListenerImpl = new powerwatch.matrix.com.pwgen2android.databinding.FragmentControlViewBindingImpl.OnClickListenerImpl();
                    this.mViewModelOnPlayClickedAndroidViewViewOnClickListener = onClickListenerImpl;
                }
                value2 = onClickListenerImpl.setValue(controlViewViewModel);
            }
            if ((j & 13) != 0) {
                androidx.databinding.ObservableField<java.lang.Integer> currentProgress = controlViewViewModel != null ? controlViewViewModel.getCurrentProgress() : null;
                updateRegistration(0, currentProgress);
                iSafeUnbox2 = androidx.databinding.ViewDataBinding.safeUnbox(currentProgress != null ? currentProgress.get() : null);
            } else {
                iSafeUnbox2 = 0;
            }
            if ((j & 14) != 0) {
                androidx.databinding.ObservableField<java.lang.Integer> buttonIcon = controlViewViewModel != null ? controlViewViewModel.getButtonIcon() : null;
                updateRegistration(1, buttonIcon);
                iSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(buttonIcon != null ? buttonIcon.get() : null);
                i = iSafeUnbox2;
            } else {
                i = iSafeUnbox2;
                iSafeUnbox = 0;
            }
        } else {
            iSafeUnbox = 0;
            value = null;
            value2 = null;
        }
        if ((13 & j) != 0) {
            androidx.databinding.adapters.SeekBarBindingAdapter.setProgress(this.mboundView2, i);
        }
        if ((12 & j) != 0) {
            androidx.databinding.adapters.SeekBarBindingAdapter.setOnSeekBarChangeListener(this.mboundView2, (androidx.databinding.adapters.SeekBarBindingAdapter.OnStartTrackingTouch) null, (androidx.databinding.adapters.SeekBarBindingAdapter.OnStopTrackingTouch) null, value, (androidx.databinding.InverseBindingListener) null);
            this.playButton.setOnClickListener(value2);
        }
        if ((j & 14) != 0) {
            powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.control.ControlViewViewModelKt.setImageUri(this.playButton, iSafeUnbox);
        }
    }

    public static class OnProgressChangedImpl implements androidx.databinding.adapters.SeekBarBindingAdapter.OnProgressChanged {
        private powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.control.ControlViewViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentControlViewBindingImpl.OnProgressChangedImpl setValue(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.control.ControlViewViewModel value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // androidx.databinding.adapters.SeekBarBindingAdapter.OnProgressChanged
        public void onProgressChanged(android.widget.SeekBar arg0, int arg1, boolean arg2) {
            this.value.onProgressChanged(arg0, arg1, arg2);
        }
    }

    public static class OnClickListenerImpl implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.control.ControlViewViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentControlViewBindingImpl.OnClickListenerImpl setValue(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.control.ControlViewViewModel value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onPlayClicked(arg0);
        }
    }
}
