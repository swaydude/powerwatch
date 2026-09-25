package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public class FragementBiometricsBindingImpl extends powerwatch.matrix.com.pwgen2android.databinding.FragementBiometricsBinding {
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final android.util.SparseIntArray sViewsWithIds = null;
    private long mDirtyFlags;
    private powerwatch.matrix.com.pwgen2android.databinding.FragementBiometricsBindingImpl.OnClickListenerImpl mViewModelOnAgeClickedAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.FragementBiometricsBindingImpl.OnClickListenerImpl4 mViewModelOnGenderClickedAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.FragementBiometricsBindingImpl.OnClickListenerImpl2 mViewModelOnHeightClickedAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.FragementBiometricsBindingImpl.OnClickListenerImpl1 mViewModelOnLanguageClickedAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.FragementBiometricsBindingImpl.OnClickListenerImpl3 mViewModelOnWeightClickedAndroidViewViewOnClickListener;
    private final android.widget.LinearLayout mboundView0;
    private final android.widget.FrameLayout mboundView1;
    private final android.widget.FrameLayout mboundView10;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView11;
    private final android.widget.TextView mboundView12;
    private final android.widget.FrameLayout mboundView13;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView14;
    private final android.widget.TextView mboundView15;
    private final android.view.View mboundView16;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView2;
    private final android.widget.TextView mboundView3;
    private final android.widget.FrameLayout mboundView4;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView5;
    private final android.widget.TextView mboundView6;
    private final android.widget.FrameLayout mboundView7;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView8;
    private final android.widget.TextView mboundView9;

    public FragementBiometricsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }

    private FragementBiometricsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root, java.lang.Object[] bindings) {
        super(bindingComponent, root, 7);
        this.mDirtyFlags = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) bindings[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag(null);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) bindings[1];
        this.mboundView1 = frameLayout;
        frameLayout.setTag(null);
        android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) bindings[10];
        this.mboundView10 = frameLayout2;
        frameLayout2.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[11];
        this.mboundView11 = fontableTextView;
        fontableTextView.setTag(null);
        android.widget.TextView textView = (android.widget.TextView) bindings[12];
        this.mboundView12 = textView;
        textView.setTag(null);
        android.widget.FrameLayout frameLayout3 = (android.widget.FrameLayout) bindings[13];
        this.mboundView13 = frameLayout3;
        frameLayout3.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView2 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[14];
        this.mboundView14 = fontableTextView2;
        fontableTextView2.setTag(null);
        android.widget.TextView textView2 = (android.widget.TextView) bindings[15];
        this.mboundView15 = textView2;
        textView2.setTag(null);
        android.view.View view = (android.view.View) bindings[16];
        this.mboundView16 = view;
        view.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView3 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[2];
        this.mboundView2 = fontableTextView3;
        fontableTextView3.setTag(null);
        android.widget.TextView textView3 = (android.widget.TextView) bindings[3];
        this.mboundView3 = textView3;
        textView3.setTag(null);
        android.widget.FrameLayout frameLayout4 = (android.widget.FrameLayout) bindings[4];
        this.mboundView4 = frameLayout4;
        frameLayout4.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView4 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[5];
        this.mboundView5 = fontableTextView4;
        fontableTextView4.setTag(null);
        android.widget.TextView textView4 = (android.widget.TextView) bindings[6];
        this.mboundView6 = textView4;
        textView4.setTag(null);
        android.widget.FrameLayout frameLayout5 = (android.widget.FrameLayout) bindings[7];
        this.mboundView7 = frameLayout5;
        frameLayout5.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView5 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[8];
        this.mboundView8 = fontableTextView5;
        fontableTextView5.setTag(null);
        android.widget.TextView textView5 = (android.widget.TextView) bindings[9];
        this.mboundView9 = textView5;
        textView5.setTag(null);
        setRootTag(root);
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
        setViewModel((powerwatch.matrix.com.pwgen2android.setup.biometrics.BiometricsViewModel) variable);
        return true;
    }

    @Override // powerwatch.matrix.com.pwgen2android.databinding.FragementBiometricsBinding
    public void setViewModel(powerwatch.matrix.com.pwgen2android.setup.biometrics.BiometricsViewModel ViewModel) {
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
                return onChangeViewModelTextColor((androidx.databinding.ObservableField) object, fieldId);
            case 1:
                return onChangeViewModelLanguage((androidx.databinding.ObservableField) object, fieldId);
            case 2:
                return onChangeViewModelLanguageShown((androidx.databinding.ObservableField) object, fieldId);
            case 3:
                return onChangeViewModelGender((androidx.databinding.ObservableField) object, fieldId);
            case 4:
                return onChangeViewModelAge((androidx.databinding.ObservableField) object, fieldId);
            case 5:
                return onChangeViewModelWeight((androidx.databinding.ObservableField) object, fieldId);
            case 6:
                return onChangeViewModelHeight((androidx.databinding.ObservableField) object, fieldId);
            default:
                return false;
        }
    }

    private boolean onChangeViewModelTextColor(androidx.databinding.ObservableField<java.lang.Integer> ViewModelTextColor, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeViewModelLanguage(androidx.databinding.ObservableField<java.lang.String> ViewModelLanguage, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    private boolean onChangeViewModelLanguageShown(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelLanguageShown, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        return true;
    }

    private boolean onChangeViewModelGender(androidx.databinding.ObservableField<java.lang.String> ViewModelGender, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        return true;
    }

    private boolean onChangeViewModelAge(androidx.databinding.ObservableField<java.lang.String> ViewModelAge, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        return true;
    }

    private boolean onChangeViewModelWeight(androidx.databinding.ObservableField<java.lang.String> ViewModelWeight, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 32;
        }
        return true;
    }

    private boolean onChangeViewModelHeight(androidx.databinding.ObservableField<java.lang.String> ViewModelHeight, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 64;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:76:0x0114  */
    /* JADX WARN: Code duplicated, block: B:85:0x0132  */
    /* JADX WARN: Code duplicated, block: B:94:0x015a  */
    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j;
        boolean z;
        powerwatch.matrix.com.pwgen2android.databinding.FragementBiometricsBindingImpl.OnClickListenerImpl2 onClickListenerImpl2;
        java.lang.String str;
        powerwatch.matrix.com.pwgen2android.databinding.FragementBiometricsBindingImpl.OnClickListenerImpl value;
        powerwatch.matrix.com.pwgen2android.databinding.FragementBiometricsBindingImpl.OnClickListenerImpl1 value2;
        int i;
        powerwatch.matrix.com.pwgen2android.databinding.FragementBiometricsBindingImpl.OnClickListenerImpl3 onClickListenerImpl3;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        powerwatch.matrix.com.pwgen2android.databinding.FragementBiometricsBindingImpl.OnClickListenerImpl4 value3;
        java.lang.String str5;
        powerwatch.matrix.com.pwgen2android.databinding.FragementBiometricsBindingImpl.OnClickListenerImpl2 value4;
        powerwatch.matrix.com.pwgen2android.databinding.FragementBiometricsBindingImpl.OnClickListenerImpl3 value5;
        int iSafeUnbox;
        java.lang.String str6;
        boolean zSafeUnbox;
        java.lang.String str7;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        powerwatch.matrix.com.pwgen2android.setup.biometrics.BiometricsViewModel biometricsViewModel = this.mViewModel;
        if ((511 & j) != 0) {
            if ((j & 384) == 0 || biometricsViewModel == null) {
                value = null;
                value2 = null;
                value4 = null;
                value5 = null;
                value3 = null;
            } else {
                powerwatch.matrix.com.pwgen2android.databinding.FragementBiometricsBindingImpl.OnClickListenerImpl onClickListenerImpl = this.mViewModelOnAgeClickedAndroidViewViewOnClickListener;
                if (onClickListenerImpl == null) {
                    onClickListenerImpl = new powerwatch.matrix.com.pwgen2android.databinding.FragementBiometricsBindingImpl.OnClickListenerImpl();
                    this.mViewModelOnAgeClickedAndroidViewViewOnClickListener = onClickListenerImpl;
                }
                value = onClickListenerImpl.setValue(biometricsViewModel);
                powerwatch.matrix.com.pwgen2android.databinding.FragementBiometricsBindingImpl.OnClickListenerImpl1 onClickListenerImpl1 = this.mViewModelOnLanguageClickedAndroidViewViewOnClickListener;
                if (onClickListenerImpl1 == null) {
                    onClickListenerImpl1 = new powerwatch.matrix.com.pwgen2android.databinding.FragementBiometricsBindingImpl.OnClickListenerImpl1();
                    this.mViewModelOnLanguageClickedAndroidViewViewOnClickListener = onClickListenerImpl1;
                }
                value2 = onClickListenerImpl1.setValue(biometricsViewModel);
                powerwatch.matrix.com.pwgen2android.databinding.FragementBiometricsBindingImpl.OnClickListenerImpl2 onClickListenerImpl4 = this.mViewModelOnHeightClickedAndroidViewViewOnClickListener;
                if (onClickListenerImpl4 == null) {
                    onClickListenerImpl4 = new powerwatch.matrix.com.pwgen2android.databinding.FragementBiometricsBindingImpl.OnClickListenerImpl2();
                    this.mViewModelOnHeightClickedAndroidViewViewOnClickListener = onClickListenerImpl4;
                }
                value4 = onClickListenerImpl4.setValue(biometricsViewModel);
                powerwatch.matrix.com.pwgen2android.databinding.FragementBiometricsBindingImpl.OnClickListenerImpl3 onClickListenerImpl5 = this.mViewModelOnWeightClickedAndroidViewViewOnClickListener;
                if (onClickListenerImpl5 == null) {
                    onClickListenerImpl5 = new powerwatch.matrix.com.pwgen2android.databinding.FragementBiometricsBindingImpl.OnClickListenerImpl3();
                    this.mViewModelOnWeightClickedAndroidViewViewOnClickListener = onClickListenerImpl5;
                }
                value5 = onClickListenerImpl5.setValue(biometricsViewModel);
                powerwatch.matrix.com.pwgen2android.databinding.FragementBiometricsBindingImpl.OnClickListenerImpl4 onClickListenerImpl6 = this.mViewModelOnGenderClickedAndroidViewViewOnClickListener;
                if (onClickListenerImpl6 == null) {
                    onClickListenerImpl6 = new powerwatch.matrix.com.pwgen2android.databinding.FragementBiometricsBindingImpl.OnClickListenerImpl4();
                    this.mViewModelOnGenderClickedAndroidViewViewOnClickListener = onClickListenerImpl6;
                }
                value3 = onClickListenerImpl6.setValue(biometricsViewModel);
            }
            if ((j & 385) != 0) {
                androidx.databinding.ObservableField<java.lang.Integer> textColor = biometricsViewModel != null ? biometricsViewModel.getTextColor() : null;
                updateRegistration(0, textColor);
                iSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(textColor != null ? textColor.get() : null);
            } else {
                iSafeUnbox = 0;
            }
            if ((j & 386) == 0) {
                str6 = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> language = biometricsViewModel != null ? biometricsViewModel.getLanguage() : null;
                updateRegistration(1, language);
                if (language != null) {
                    str6 = language.get();
                } else {
                    str6 = null;
                }
            }
            if ((j & 388) != 0) {
                androidx.databinding.ObservableField<java.lang.Boolean> languageShown = biometricsViewModel != null ? biometricsViewModel.getLanguageShown() : null;
                updateRegistration(2, languageShown);
                zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(languageShown != null ? languageShown.get() : null);
            } else {
                zSafeUnbox = false;
            }
            if ((j & 392) == 0) {
                str3 = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> gender = biometricsViewModel != null ? biometricsViewModel.getGender() : null;
                updateRegistration(3, gender);
                if (gender != null) {
                    str3 = gender.get();
                } else {
                    str3 = null;
                }
            }
            if ((j & 400) == 0) {
                str5 = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> age = biometricsViewModel != null ? biometricsViewModel.getAge() : null;
                updateRegistration(4, age);
                if (age != null) {
                    str5 = age.get();
                } else {
                    str5 = null;
                }
            }
            if ((j & 416) == 0) {
                str7 = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> weight = biometricsViewModel != null ? biometricsViewModel.getWeight() : null;
                updateRegistration(5, weight);
                if (weight != null) {
                    str7 = weight.get();
                } else {
                    str7 = null;
                }
            }
            if ((j & 448) == 0) {
                str = str6;
                i = iSafeUnbox;
                z = zSafeUnbox;
                str2 = str7;
                onClickListenerImpl2 = value4;
                onClickListenerImpl3 = value5;
                str4 = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> height = biometricsViewModel != null ? biometricsViewModel.getHeight() : null;
                updateRegistration(6, height);
                if (height != null) {
                    str = str6;
                    i = iSafeUnbox;
                    str2 = str7;
                    onClickListenerImpl2 = value4;
                    onClickListenerImpl3 = value5;
                    str4 = height.get();
                    z = zSafeUnbox;
                } else {
                    str = str6;
                    i = iSafeUnbox;
                    z = zSafeUnbox;
                    str2 = str7;
                    onClickListenerImpl2 = value4;
                    onClickListenerImpl3 = value5;
                    str4 = null;
                }
            }
        } else {
            z = false;
            onClickListenerImpl2 = null;
            str = null;
            value = null;
            value2 = null;
            i = 0;
            onClickListenerImpl3 = null;
            str2 = null;
            str3 = null;
            str4 = null;
            value3 = null;
            str5 = null;
        }
        if ((j & 384) != 0) {
            this.mboundView1.setOnClickListener(onClickListenerImpl3);
            this.mboundView10.setOnClickListener(value3);
            this.mboundView13.setOnClickListener(value2);
            this.mboundView4.setOnClickListener(onClickListenerImpl2);
            this.mboundView7.setOnClickListener(value);
        }
        if ((j & 385) != 0) {
            this.mboundView11.setTextColor(i);
            this.mboundView14.setTextColor(i);
            this.mboundView2.setTextColor(i);
            this.mboundView5.setTextColor(i);
            this.mboundView8.setTextColor(i);
        }
        if ((j & 392) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView12, str3);
        }
        if ((388 & j) != 0) {
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.goneUnless(this.mboundView13, z);
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.goneUnless(this.mboundView16, z);
        }
        if ((j & 386) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView15, str);
        }
        if ((416 & j) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, str2);
        }
        if ((448 & j) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, str4);
        }
        if ((j & 400) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView9, str5);
        }
    }

    public static class OnClickListenerImpl implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.setup.biometrics.BiometricsViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragementBiometricsBindingImpl.OnClickListenerImpl setValue(powerwatch.matrix.com.pwgen2android.setup.biometrics.BiometricsViewModel value) {
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
        private powerwatch.matrix.com.pwgen2android.setup.biometrics.BiometricsViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragementBiometricsBindingImpl.OnClickListenerImpl1 setValue(powerwatch.matrix.com.pwgen2android.setup.biometrics.BiometricsViewModel value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onLanguageClicked(arg0);
        }
    }

    public static class OnClickListenerImpl2 implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.setup.biometrics.BiometricsViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragementBiometricsBindingImpl.OnClickListenerImpl2 setValue(powerwatch.matrix.com.pwgen2android.setup.biometrics.BiometricsViewModel value) {
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

    public static class OnClickListenerImpl3 implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.setup.biometrics.BiometricsViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragementBiometricsBindingImpl.OnClickListenerImpl3 setValue(powerwatch.matrix.com.pwgen2android.setup.biometrics.BiometricsViewModel value) {
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

    public static class OnClickListenerImpl4 implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.setup.biometrics.BiometricsViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragementBiometricsBindingImpl.OnClickListenerImpl4 setValue(powerwatch.matrix.com.pwgen2android.setup.biometrics.BiometricsViewModel value) {
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
}
