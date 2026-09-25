package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public class FragmentGen1PairingBindingImpl extends powerwatch.matrix.com.pwgen2android.databinding.FragmentGen1PairingBinding {
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final android.util.SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentGen1PairingBindingImpl.OnClickListenerImpl mViewModelOnBluetoothEnableClickedAndroidViewViewOnClickListener;
    private final android.widget.LinearLayout mboundView0;
    private final android.widget.LinearLayout mboundView1;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView2;

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.devices_list, 3);
    }

    public FragmentGen1PairingBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }

    private FragmentGen1PairingBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root, java.lang.Object[] bindings) {
        super(bindingComponent, root, 1, (androidx.recyclerview.widget.RecyclerView) bindings[3]);
        this.mDirtyFlags = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) bindings[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag(null);
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1 = linearLayout2;
        linearLayout2.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[2];
        this.mboundView2 = fontableTextView;
        fontableTextView.setTag(null);
        setRootTag(root);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 4L;
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
        setViewModel((powerwatch.matrix.com.pwgen2android.pair.ui.gen1.Gen1PairingViewModel) variable);
        return true;
    }

    @Override // powerwatch.matrix.com.pwgen2android.databinding.FragmentGen1PairingBinding
    public void setViewModel(powerwatch.matrix.com.pwgen2android.pair.ui.gen1.Gen1PairingViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(1);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int localFieldId, java.lang.Object object, int fieldId) {
        if (localFieldId != 0) {
            return false;
        }
        return onChangeViewModelBluetoothWarnDisplayed((androidx.databinding.ObservableField) object, fieldId);
    }

    private boolean onChangeViewModelBluetoothWarnDisplayed(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelBluetoothWarnDisplayed, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentGen1PairingBindingImpl.OnClickListenerImpl value;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        powerwatch.matrix.com.pwgen2android.pair.ui.gen1.Gen1PairingViewModel gen1PairingViewModel = this.mViewModel;
        long j2 = 7 & j;
        boolean zSafeUnbox = false;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentGen1PairingBindingImpl.OnClickListenerImpl onClickListenerImpl = null;
        if (j2 != 0) {
            if ((j & 6) == 0 || gen1PairingViewModel == null) {
                value = null;
            } else {
                powerwatch.matrix.com.pwgen2android.databinding.FragmentGen1PairingBindingImpl.OnClickListenerImpl onClickListenerImpl2 = this.mViewModelOnBluetoothEnableClickedAndroidViewViewOnClickListener;
                if (onClickListenerImpl2 == null) {
                    onClickListenerImpl2 = new powerwatch.matrix.com.pwgen2android.databinding.FragmentGen1PairingBindingImpl.OnClickListenerImpl();
                    this.mViewModelOnBluetoothEnableClickedAndroidViewViewOnClickListener = onClickListenerImpl2;
                }
                value = onClickListenerImpl2.setValue(gen1PairingViewModel);
            }
            androidx.databinding.ObservableField<java.lang.Boolean> bluetoothWarnDisplayed = gen1PairingViewModel != null ? gen1PairingViewModel.getBluetoothWarnDisplayed() : null;
            updateRegistration(0, bluetoothWarnDisplayed);
            zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(bluetoothWarnDisplayed != null ? bluetoothWarnDisplayed.get() : null);
            onClickListenerImpl = value;
        }
        if (j2 != 0) {
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.goneUnless(this.mboundView1, zSafeUnbox);
        }
        if ((j & 6) != 0) {
            this.mboundView2.setOnClickListener(onClickListenerImpl);
        }
    }

    public static class OnClickListenerImpl implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.pair.ui.gen1.Gen1PairingViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentGen1PairingBindingImpl.OnClickListenerImpl setValue(powerwatch.matrix.com.pwgen2android.pair.ui.gen1.Gen1PairingViewModel value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onBluetoothEnableClicked(arg0);
        }
    }
}
