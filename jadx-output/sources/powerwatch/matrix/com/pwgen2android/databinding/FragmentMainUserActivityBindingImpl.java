package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public class FragmentMainUserActivityBindingImpl extends powerwatch.matrix.com.pwgen2android.databinding.FragmentMainUserActivityBinding {
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final android.util.SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentMainUserActivityBindingImpl.OnClickListenerImpl2 mViewModelOnNextClickedAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentMainUserActivityBindingImpl.OnClickListenerImpl mViewModelOnPreviousClickedAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentMainUserActivityBindingImpl.OnClickListenerImpl1 mViewModelOnSessionClickedAndroidViewViewOnClickListener;
    private final android.widget.LinearLayout mboundView0;
    private final android.widget.LinearLayout mboundView1;
    private final android.widget.RelativeLayout mboundView10;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView11;
    private final android.widget.RelativeLayout mboundView12;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView13;
    private final android.widget.RelativeLayout mboundView14;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView15;
    private final android.widget.RelativeLayout mboundView16;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView18;
    private final android.widget.RelativeLayout mboundView19;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView20;
    private final android.widget.RelativeLayout mboundView21;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView22;
    private final android.widget.ImageView mboundView3;
    private final android.widget.ImageView mboundView6;
    private final android.widget.GridLayout mboundView7;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView8;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView9;

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.duration_title, 25);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.calories_title, 26);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.max_hr_title, 27);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.avg_hr_title, 28);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.total_distance_title, 29);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.ascended_title, 30);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.descended_title, 31);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.control_view_container, 32);
    }

    public FragmentMainUserActivityBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 33, sIncludes, sViewsWithIds));
    }

    private FragmentMainUserActivityBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root, java.lang.Object[] bindings) {
        super(bindingComponent, root, 18, (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[4], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[30], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[28], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[26], (android.widget.FrameLayout) bindings[24], (android.widget.FrameLayout) bindings[32], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[31], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[25], (android.widget.LinearLayout) bindings[2], (android.widget.FrameLayout) bindings[23], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[27], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[17], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[5], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[29]);
        this.mDirtyFlags = -1L;
        this.activityName.setTag(null);
        this.chartFragmentContainer.setTag(null);
        this.headerLayout.setTag(null);
        this.mapsFragmentContainer.setTag(null);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) bindings[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag(null);
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1 = linearLayout2;
        linearLayout2.setTag(null);
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) bindings[10];
        this.mboundView10 = relativeLayout;
        relativeLayout.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[11];
        this.mboundView11 = fontableTextView;
        fontableTextView.setTag(null);
        android.widget.RelativeLayout relativeLayout2 = (android.widget.RelativeLayout) bindings[12];
        this.mboundView12 = relativeLayout2;
        relativeLayout2.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView2 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[13];
        this.mboundView13 = fontableTextView2;
        fontableTextView2.setTag(null);
        android.widget.RelativeLayout relativeLayout3 = (android.widget.RelativeLayout) bindings[14];
        this.mboundView14 = relativeLayout3;
        relativeLayout3.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView3 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[15];
        this.mboundView15 = fontableTextView3;
        fontableTextView3.setTag(null);
        android.widget.RelativeLayout relativeLayout4 = (android.widget.RelativeLayout) bindings[16];
        this.mboundView16 = relativeLayout4;
        relativeLayout4.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView4 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[18];
        this.mboundView18 = fontableTextView4;
        fontableTextView4.setTag(null);
        android.widget.RelativeLayout relativeLayout5 = (android.widget.RelativeLayout) bindings[19];
        this.mboundView19 = relativeLayout5;
        relativeLayout5.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView5 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[20];
        this.mboundView20 = fontableTextView5;
        fontableTextView5.setTag(null);
        android.widget.RelativeLayout relativeLayout6 = (android.widget.RelativeLayout) bindings[21];
        this.mboundView21 = relativeLayout6;
        relativeLayout6.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView6 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[22];
        this.mboundView22 = fontableTextView6;
        fontableTextView6.setTag(null);
        android.widget.ImageView imageView = (android.widget.ImageView) bindings[3];
        this.mboundView3 = imageView;
        imageView.setTag(null);
        android.widget.ImageView imageView2 = (android.widget.ImageView) bindings[6];
        this.mboundView6 = imageView2;
        imageView2.setTag(null);
        android.widget.GridLayout gridLayout = (android.widget.GridLayout) bindings[7];
        this.mboundView7 = gridLayout;
        gridLayout.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView7 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[8];
        this.mboundView8 = fontableTextView7;
        fontableTextView7.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView8 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[9];
        this.mboundView9 = fontableTextView8;
        fontableTextView8.setTag(null);
        this.paceTitle.setTag(null);
        this.subtitleLabel.setTag(null);
        setRootTag(root);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED;
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
        setViewModel((powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel) variable);
        return true;
    }

    @Override // powerwatch.matrix.com.pwgen2android.databinding.FragmentMainUserActivityBinding
    public void setViewModel(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized (this) {
            this.mDirtyFlags |= android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
        }
        notifyPropertyChanged(1);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int localFieldId, java.lang.Object object, int fieldId) {
        switch (localFieldId) {
            case 0:
                return onChangeViewModelMaxHRValue((androidx.databinding.ObservableField) object, fieldId);
            case 1:
                return onChangeViewModelDistance((androidx.databinding.ObservableField) object, fieldId);
            case 2:
                return onChangeViewModelNameField((androidx.databinding.ObservableField) object, fieldId);
            case 3:
                return onChangeViewModelAscendDisplayed((androidx.databinding.ObservableField) object, fieldId);
            case 4:
                return onChangeViewModelDuration((androidx.databinding.ObservableField) object, fieldId);
            case 5:
                return onChangeViewModelLeftArrowVisible((androidx.databinding.ObservableField) object, fieldId);
            case 6:
                return onChangeViewModelHiitActivityDisplayed((androidx.databinding.ObservableField) object, fieldId);
            case 7:
                return onChangeViewModelActiveCals((androidx.databinding.ObservableField) object, fieldId);
            case 8:
                return onChangeViewModelAvgHeartRate((androidx.databinding.ObservableField) object, fieldId);
            case 9:
                return onChangeViewModelNoSessions((androidx.databinding.ObservableField) object, fieldId);
            case 10:
                return onChangeViewModelSubtitleField((androidx.databinding.ObservableField) object, fieldId);
            case 11:
                return onChangeViewModelPaceTitle((androidx.databinding.ObservableField) object, fieldId);
            case 12:
                return onChangeViewModelHasLocations((androidx.databinding.ObservableField) object, fieldId);
            case 13:
                return onChangeViewModelTotalAscendedValue((androidx.databinding.ObservableField) object, fieldId);
            case 14:
                return onChangeViewModelTotalDescendedValue((androidx.databinding.ObservableField) object, fieldId);
            case 15:
                return onChangeViewModelRightArrowVisible((androidx.databinding.ObservableField) object, fieldId);
            case 16:
                return onChangeViewModelPace((androidx.databinding.ObservableField) object, fieldId);
            case 17:
                return onChangeViewModelHasHeartRates((androidx.databinding.ObservableField) object, fieldId);
            default:
                return false;
        }
    }

    private boolean onChangeViewModelMaxHRValue(androidx.databinding.ObservableField<java.lang.String> ViewModelMaxHRValue, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeViewModelDistance(androidx.databinding.ObservableField<java.lang.String> ViewModelDistance, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    private boolean onChangeViewModelNameField(androidx.databinding.ObservableField<java.lang.String> ViewModelNameField, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        return true;
    }

    private boolean onChangeViewModelAscendDisplayed(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelAscendDisplayed, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        return true;
    }

    private boolean onChangeViewModelDuration(androidx.databinding.ObservableField<java.lang.String> ViewModelDuration, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        return true;
    }

    private boolean onChangeViewModelLeftArrowVisible(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelLeftArrowVisible, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 32;
        }
        return true;
    }

    private boolean onChangeViewModelHiitActivityDisplayed(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelHiitActivityDisplayed, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 64;
        }
        return true;
    }

    private boolean onChangeViewModelActiveCals(androidx.databinding.ObservableField<java.lang.String> ViewModelActiveCals, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 128;
        }
        return true;
    }

    private boolean onChangeViewModelAvgHeartRate(androidx.databinding.ObservableField<java.lang.String> ViewModelAvgHeartRate, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 256;
        }
        return true;
    }

    private boolean onChangeViewModelNoSessions(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelNoSessions, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 512;
        }
        return true;
    }

    private boolean onChangeViewModelSubtitleField(androidx.databinding.ObservableField<java.lang.String> ViewModelSubtitleField, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= android.support.v4.media.session.PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        }
        return true;
    }

    private boolean onChangeViewModelPaceTitle(androidx.databinding.ObservableField<java.lang.String> ViewModelPaceTitle, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= android.support.v4.media.session.PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
        }
        return true;
    }

    private boolean onChangeViewModelHasLocations(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelHasLocations, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= android.support.v4.media.session.PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        }
        return true;
    }

    private boolean onChangeViewModelTotalAscendedValue(androidx.databinding.ObservableField<java.lang.String> ViewModelTotalAscendedValue, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= android.support.v4.media.session.PlaybackStateCompat.ACTION_PLAY_FROM_URI;
        }
        return true;
    }

    private boolean onChangeViewModelTotalDescendedValue(androidx.databinding.ObservableField<java.lang.String> ViewModelTotalDescendedValue, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= android.support.v4.media.session.PlaybackStateCompat.ACTION_PREPARE;
        }
        return true;
    }

    private boolean onChangeViewModelRightArrowVisible(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelRightArrowVisible, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= android.support.v4.media.session.PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID;
        }
        return true;
    }

    private boolean onChangeViewModelPace(androidx.databinding.ObservableField<java.lang.String> ViewModelPace, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= android.support.v4.media.session.PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
        }
        return true;
    }

    private boolean onChangeViewModelHasHeartRates(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelHasHeartRates, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= android.support.v4.media.session.PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:109:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:112:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:113:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:117:0x01cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:119:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:122:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:123:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:125:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:128:0x0207 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:129:0x0209  */
    /* JADX WARN: Code duplicated, block: B:130:0x0216  */
    /* JADX WARN: Code duplicated, block: B:133:0x0223  */
    /* JADX WARN: Code duplicated, block: B:134:0x022a  */
    /* JADX WARN: Code duplicated, block: B:138:0x023b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:139:0x023d  */
    /* JADX WARN: Code duplicated, block: B:140:0x0244  */
    /* JADX WARN: Code duplicated, block: B:143:0x024f  */
    /* JADX WARN: Code duplicated, block: B:144:0x0256  */
    /* JADX WARN: Code duplicated, block: B:148:0x0262 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:149:0x0264  */
    /* JADX WARN: Code duplicated, block: B:150:0x026b  */
    /* JADX WARN: Code duplicated, block: B:153:0x0276  */
    /* JADX WARN: Code duplicated, block: B:154:0x027d  */
    /* JADX WARN: Code duplicated, block: B:156:0x0284  */
    /* JADX WARN: Code duplicated, block: B:159:0x0292 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:160:0x0294  */
    /* JADX WARN: Code duplicated, block: B:161:0x029b  */
    /* JADX WARN: Code duplicated, block: B:164:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:165:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:169:0x02bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x005a  */
    /* JADX WARN: Code duplicated, block: B:170:0x02be  */
    /* JADX WARN: Code duplicated, block: B:171:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:174:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:175:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:179:0x02e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:180:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:181:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:184:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:185:0x0301  */
    /* JADX WARN: Code duplicated, block: B:187:0x030b  */
    /* JADX WARN: Code duplicated, block: B:190:0x031d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:191:0x031f  */
    /* JADX WARN: Code duplicated, block: B:192:0x032c  */
    /* JADX WARN: Code duplicated, block: B:195:0x0339  */
    /* JADX WARN: Code duplicated, block: B:196:0x0340  */
    /* JADX WARN: Code duplicated, block: B:200:0x034e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:201:0x0350  */
    /* JADX WARN: Code duplicated, block: B:202:0x0357  */
    /* JADX WARN: Code duplicated, block: B:205:0x0362  */
    /* JADX WARN: Code duplicated, block: B:207:0x038c  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:68:0x0113  */
    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentMainUserActivityBindingImpl.OnClickListenerImpl value;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentMainUserActivityBindingImpl.OnClickListenerImpl1 value2;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentMainUserActivityBindingImpl.OnClickListenerImpl2 onClickListenerImpl2;
        java.lang.String str;
        java.lang.String str2;
        java.lang.Boolean bool;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        java.lang.String str11;
        boolean zSafeUnbox;
        boolean zSafeUnbox2;
        boolean z;
        boolean zSafeUnbox3;
        boolean z2;
        boolean zSafeUnbox4;
        boolean zSafeUnbox5;
        boolean z3;
        boolean zSafeUnbox6;
        boolean z4;
        java.lang.String str12;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentMainUserActivityBindingImpl.OnClickListenerImpl2 value3;
        boolean zSafeUnbox7;
        boolean zSafeUnbox8;
        boolean zSafeUnbox9;
        long j2;
        androidx.databinding.ObservableField<java.lang.Boolean> hasHeartRates;
        androidx.databinding.ObservableField<java.lang.String> pace;
        androidx.databinding.ObservableField<java.lang.String> totalDescendedValue;
        androidx.databinding.ObservableField<java.lang.String> totalAscendedValue;
        androidx.databinding.ObservableField<java.lang.Boolean> hasLocations;
        java.lang.Boolean bool2;
        androidx.databinding.ObservableField<java.lang.String> paceTitle;
        androidx.databinding.ObservableField<java.lang.String> subtitleField;
        androidx.databinding.ObservableField<java.lang.Boolean> noSessions;
        java.lang.Boolean bool3;
        androidx.databinding.ObservableField<java.lang.String> avgHeartRate;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel userActivityViewModel = this.mViewModel;
        androidx.databinding.ObservableField<java.lang.Boolean> rightArrowVisible = null;
        if ((1048575 & j) != 0) {
            if ((j & 786433) == 0) {
                str12 = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> maxHRValue = userActivityViewModel != null ? userActivityViewModel.getMaxHRValue() : null;
                updateRegistration(0, maxHRValue);
                if (maxHRValue != null) {
                    str12 = maxHRValue.get();
                } else {
                    str12 = null;
                }
            }
            if ((j & 786432) == 0 || userActivityViewModel == null) {
                value = null;
                value3 = null;
                value2 = null;
            } else {
                powerwatch.matrix.com.pwgen2android.databinding.FragmentMainUserActivityBindingImpl.OnClickListenerImpl onClickListenerImpl = this.mViewModelOnPreviousClickedAndroidViewViewOnClickListener;
                if (onClickListenerImpl == null) {
                    onClickListenerImpl = new powerwatch.matrix.com.pwgen2android.databinding.FragmentMainUserActivityBindingImpl.OnClickListenerImpl();
                    this.mViewModelOnPreviousClickedAndroidViewViewOnClickListener = onClickListenerImpl;
                }
                value = onClickListenerImpl.setValue(userActivityViewModel);
                powerwatch.matrix.com.pwgen2android.databinding.FragmentMainUserActivityBindingImpl.OnClickListenerImpl1 onClickListenerImpl1 = this.mViewModelOnSessionClickedAndroidViewViewOnClickListener;
                if (onClickListenerImpl1 == null) {
                    onClickListenerImpl1 = new powerwatch.matrix.com.pwgen2android.databinding.FragmentMainUserActivityBindingImpl.OnClickListenerImpl1();
                    this.mViewModelOnSessionClickedAndroidViewViewOnClickListener = onClickListenerImpl1;
                }
                value2 = onClickListenerImpl1.setValue(userActivityViewModel);
                powerwatch.matrix.com.pwgen2android.databinding.FragmentMainUserActivityBindingImpl.OnClickListenerImpl2 onClickListenerImpl3 = this.mViewModelOnNextClickedAndroidViewViewOnClickListener;
                if (onClickListenerImpl3 == null) {
                    onClickListenerImpl3 = new powerwatch.matrix.com.pwgen2android.databinding.FragmentMainUserActivityBindingImpl.OnClickListenerImpl2();
                    this.mViewModelOnNextClickedAndroidViewViewOnClickListener = onClickListenerImpl3;
                }
                value3 = onClickListenerImpl3.setValue(userActivityViewModel);
            }
            if ((j & 786434) == 0) {
                str4 = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> distance = userActivityViewModel != null ? userActivityViewModel.getDistance() : null;
                updateRegistration(1, distance);
                if (distance != null) {
                    str4 = distance.get();
                } else {
                    str4 = null;
                }
            }
            if ((j & 786436) == 0) {
                str2 = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> nameField = userActivityViewModel != null ? userActivityViewModel.getNameField() : null;
                updateRegistration(2, nameField);
                if (nameField != null) {
                    str2 = nameField.get();
                } else {
                    str2 = null;
                }
            }
            if ((j & 786440) != 0) {
                androidx.databinding.ObservableField<java.lang.Boolean> ascendDisplayed = userActivityViewModel != null ? userActivityViewModel.getAscendDisplayed() : null;
                updateRegistration(3, ascendDisplayed);
                zSafeUnbox7 = androidx.databinding.ViewDataBinding.safeUnbox(ascendDisplayed != null ? ascendDisplayed.get() : null);
            } else {
                zSafeUnbox7 = false;
            }
            if ((j & 786448) == 0) {
                str8 = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> duration = userActivityViewModel != null ? userActivityViewModel.getDuration() : null;
                updateRegistration(4, duration);
                if (duration != null) {
                    str8 = duration.get();
                } else {
                    str8 = null;
                }
            }
            long j3 = j & 819232;
            if (j3 != 0) {
                androidx.databinding.ObservableField<java.lang.Boolean> leftArrowVisible = userActivityViewModel != null ? userActivityViewModel.getLeftArrowVisible() : null;
                updateRegistration(5, leftArrowVisible);
                zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(leftArrowVisible != null ? leftArrowVisible.get() : null);
                if (j3 != 0) {
                    j = zSafeUnbox4 ? j | android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE : j | android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
                }
            } else {
                zSafeUnbox4 = false;
            }
            if ((j & 786496) != 0) {
                androidx.databinding.ObservableField<java.lang.Boolean> hiitActivityDisplayed = userActivityViewModel != null ? userActivityViewModel.getHiitActivityDisplayed() : null;
                updateRegistration(6, hiitActivityDisplayed);
                zSafeUnbox3 = androidx.databinding.ViewDataBinding.safeUnbox(hiitActivityDisplayed != null ? hiitActivityDisplayed.get() : null);
                zSafeUnbox8 = androidx.databinding.ViewDataBinding.safeUnbox(java.lang.Boolean.valueOf(!zSafeUnbox3));
            } else {
                zSafeUnbox3 = false;
                zSafeUnbox8 = false;
            }
            if ((j & 786560) != 0) {
                androidx.databinding.ObservableField<java.lang.String> activeCals = userActivityViewModel != null ? userActivityViewModel.getActiveCals() : null;
                updateRegistration(7, activeCals);
                if (activeCals != null) {
                    str9 = activeCals.get();
                }
                if ((j & 786688) != 0) {
                    if (userActivityViewModel != null) {
                        avgHeartRate = userActivityViewModel.getAvgHeartRate();
                    } else {
                        avgHeartRate = null;
                    }
                    updateRegistration(8, avgHeartRate);
                    if (avgHeartRate != null) {
                        str3 = avgHeartRate.get();
                    }
                    if ((j & 786944) != 0) {
                        if (userActivityViewModel != null) {
                            noSessions = userActivityViewModel.getNoSessions();
                        } else {
                            noSessions = null;
                        }
                        updateRegistration(9, noSessions);
                        if (noSessions != null) {
                            bool3 = noSessions.get();
                        } else {
                            bool3 = null;
                        }
                        zSafeUnbox2 = androidx.databinding.ViewDataBinding.safeUnbox(bool3);
                        zSafeUnbox5 = androidx.databinding.ViewDataBinding.safeUnbox(java.lang.Boolean.valueOf(!zSafeUnbox2));
                    } else {
                        str3 = str3;
                        zSafeUnbox2 = false;
                        zSafeUnbox5 = false;
                    }
                    if ((j & 787456) != 0) {
                        if (userActivityViewModel != null) {
                            subtitleField = userActivityViewModel.getSubtitleField();
                        } else {
                            subtitleField = null;
                        }
                        updateRegistration(10, subtitleField);
                        if (subtitleField != null) {
                            str11 = subtitleField.get();
                        }
                        if ((j & 788480) != 0) {
                            if (userActivityViewModel != null) {
                                paceTitle = userActivityViewModel.getPaceTitle();
                            } else {
                                paceTitle = null;
                            }
                            updateRegistration(11, paceTitle);
                            if (paceTitle != null) {
                                str10 = paceTitle.get();
                            }
                            if ((j & 790528) != 0) {
                                if (userActivityViewModel != null) {
                                    hasLocations = userActivityViewModel.getHasLocations();
                                } else {
                                    hasLocations = null;
                                }
                                updateRegistration(12, hasLocations);
                                if (hasLocations != null) {
                                    bool2 = hasLocations.get();
                                } else {
                                    bool2 = null;
                                }
                                zSafeUnbox9 = androidx.databinding.ViewDataBinding.safeUnbox(bool2);
                            } else {
                                str10 = str10;
                                zSafeUnbox9 = false;
                            }
                            if ((j & 794624) != 0) {
                                if (userActivityViewModel != null) {
                                    totalAscendedValue = userActivityViewModel.getTotalAscendedValue();
                                } else {
                                    totalAscendedValue = null;
                                }
                                updateRegistration(13, totalAscendedValue);
                                if (totalAscendedValue != null) {
                                    str6 = totalAscendedValue.get();
                                }
                                if ((j & 802816) != 0) {
                                    if (userActivityViewModel != null) {
                                        totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                                    } else {
                                        totalDescendedValue = null;
                                    }
                                    updateRegistration(14, totalDescendedValue);
                                    if (totalDescendedValue != null) {
                                        str7 = totalDescendedValue.get();
                                    }
                                    if ((j & 819200) != 0) {
                                        if (userActivityViewModel != null) {
                                            rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                                        } else {
                                            rightArrowVisible = null;
                                        }
                                        updateRegistration(15, rightArrowVisible);
                                        if (rightArrowVisible != null) {
                                            bool = rightArrowVisible.get();
                                        } else {
                                            bool = null;
                                        }
                                        zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                                        j2 = 851968;
                                    } else {
                                        str7 = str7;
                                        bool = null;
                                        rightArrowVisible = null;
                                        j2 = 851968;
                                        zSafeUnbox6 = false;
                                    }
                                    if ((j & j2) != 0) {
                                        if (userActivityViewModel != null) {
                                            pace = userActivityViewModel.getPace();
                                        } else {
                                            pace = null;
                                        }
                                        updateRegistration(16, pace);
                                        if (pace != null) {
                                            str5 = pace.get();
                                        }
                                        if ((j & 917504) != 0) {
                                            if (userActivityViewModel != null) {
                                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                                            } else {
                                                hasHeartRates = null;
                                            }
                                            updateRegistration(17, hasHeartRates);
                                            zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                            j = j;
                                        } else {
                                            zSafeUnbox = false;
                                        }
                                        onClickListenerImpl2 = value3;
                                        z3 = zSafeUnbox7;
                                        z2 = zSafeUnbox8;
                                        str = str12;
                                        z = zSafeUnbox9;
                                    } else {
                                        bool = bool;
                                        rightArrowVisible = rightArrowVisible;
                                    }
                                    str5 = null;
                                    if ((j & 917504) != 0) {
                                        if (userActivityViewModel != null) {
                                            hasHeartRates = userActivityViewModel.getHasHeartRates();
                                        } else {
                                            hasHeartRates = null;
                                        }
                                        updateRegistration(17, hasHeartRates);
                                        zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                        j = j;
                                    } else {
                                        zSafeUnbox = false;
                                    }
                                    onClickListenerImpl2 = value3;
                                    z3 = zSafeUnbox7;
                                    z2 = zSafeUnbox8;
                                    str = str12;
                                    z = zSafeUnbox9;
                                } else {
                                    str6 = str6;
                                }
                                str7 = null;
                                if ((j & 819200) != 0) {
                                    if (userActivityViewModel != null) {
                                        rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                                    } else {
                                        rightArrowVisible = null;
                                    }
                                    updateRegistration(15, rightArrowVisible);
                                    if (rightArrowVisible != null) {
                                        bool = rightArrowVisible.get();
                                    } else {
                                        bool = null;
                                    }
                                    zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                                    j2 = 851968;
                                } else {
                                    str7 = str7;
                                    bool = null;
                                    rightArrowVisible = null;
                                    j2 = 851968;
                                    zSafeUnbox6 = false;
                                }
                                if ((j & j2) != 0) {
                                    if (userActivityViewModel != null) {
                                        pace = userActivityViewModel.getPace();
                                    } else {
                                        pace = null;
                                    }
                                    updateRegistration(16, pace);
                                    if (pace != null) {
                                        str5 = pace.get();
                                    }
                                    if ((j & 917504) != 0) {
                                        if (userActivityViewModel != null) {
                                            hasHeartRates = userActivityViewModel.getHasHeartRates();
                                        } else {
                                            hasHeartRates = null;
                                        }
                                        updateRegistration(17, hasHeartRates);
                                        zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                        j = j;
                                    } else {
                                        zSafeUnbox = false;
                                    }
                                    onClickListenerImpl2 = value3;
                                    z3 = zSafeUnbox7;
                                    z2 = zSafeUnbox8;
                                    str = str12;
                                    z = zSafeUnbox9;
                                } else {
                                    bool = bool;
                                    rightArrowVisible = rightArrowVisible;
                                }
                                str5 = null;
                                if ((j & 917504) != 0) {
                                    if (userActivityViewModel != null) {
                                        hasHeartRates = userActivityViewModel.getHasHeartRates();
                                    } else {
                                        hasHeartRates = null;
                                    }
                                    updateRegistration(17, hasHeartRates);
                                    zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                    j = j;
                                } else {
                                    zSafeUnbox = false;
                                }
                                onClickListenerImpl2 = value3;
                                z3 = zSafeUnbox7;
                                z2 = zSafeUnbox8;
                                str = str12;
                                z = zSafeUnbox9;
                            } else {
                                zSafeUnbox9 = zSafeUnbox9;
                            }
                            str6 = null;
                            if ((j & 802816) != 0) {
                                if (userActivityViewModel != null) {
                                    totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                                } else {
                                    totalDescendedValue = null;
                                }
                                updateRegistration(14, totalDescendedValue);
                                if (totalDescendedValue != null) {
                                    str7 = totalDescendedValue.get();
                                }
                                if ((j & 819200) != 0) {
                                    if (userActivityViewModel != null) {
                                        rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                                    } else {
                                        rightArrowVisible = null;
                                    }
                                    updateRegistration(15, rightArrowVisible);
                                    if (rightArrowVisible != null) {
                                        bool = rightArrowVisible.get();
                                    } else {
                                        bool = null;
                                    }
                                    zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                                    j2 = 851968;
                                } else {
                                    str7 = str7;
                                    bool = null;
                                    rightArrowVisible = null;
                                    j2 = 851968;
                                    zSafeUnbox6 = false;
                                }
                                if ((j & j2) != 0) {
                                    if (userActivityViewModel != null) {
                                        pace = userActivityViewModel.getPace();
                                    } else {
                                        pace = null;
                                    }
                                    updateRegistration(16, pace);
                                    if (pace != null) {
                                        str5 = pace.get();
                                    }
                                    if ((j & 917504) != 0) {
                                        if (userActivityViewModel != null) {
                                            hasHeartRates = userActivityViewModel.getHasHeartRates();
                                        } else {
                                            hasHeartRates = null;
                                        }
                                        updateRegistration(17, hasHeartRates);
                                        zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                        j = j;
                                    } else {
                                        zSafeUnbox = false;
                                    }
                                    onClickListenerImpl2 = value3;
                                    z3 = zSafeUnbox7;
                                    z2 = zSafeUnbox8;
                                    str = str12;
                                    z = zSafeUnbox9;
                                } else {
                                    bool = bool;
                                    rightArrowVisible = rightArrowVisible;
                                }
                                str5 = null;
                                if ((j & 917504) != 0) {
                                    if (userActivityViewModel != null) {
                                        hasHeartRates = userActivityViewModel.getHasHeartRates();
                                    } else {
                                        hasHeartRates = null;
                                    }
                                    updateRegistration(17, hasHeartRates);
                                    zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                    j = j;
                                } else {
                                    zSafeUnbox = false;
                                }
                                onClickListenerImpl2 = value3;
                                z3 = zSafeUnbox7;
                                z2 = zSafeUnbox8;
                                str = str12;
                                z = zSafeUnbox9;
                            } else {
                                str6 = str6;
                            }
                            str7 = null;
                            if ((j & 819200) != 0) {
                                if (userActivityViewModel != null) {
                                    rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                                } else {
                                    rightArrowVisible = null;
                                }
                                updateRegistration(15, rightArrowVisible);
                                if (rightArrowVisible != null) {
                                    bool = rightArrowVisible.get();
                                } else {
                                    bool = null;
                                }
                                zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                                j2 = 851968;
                            } else {
                                str7 = str7;
                                bool = null;
                                rightArrowVisible = null;
                                j2 = 851968;
                                zSafeUnbox6 = false;
                            }
                            if ((j & j2) != 0) {
                                if (userActivityViewModel != null) {
                                    pace = userActivityViewModel.getPace();
                                } else {
                                    pace = null;
                                }
                                updateRegistration(16, pace);
                                if (pace != null) {
                                    str5 = pace.get();
                                }
                                if ((j & 917504) != 0) {
                                    if (userActivityViewModel != null) {
                                        hasHeartRates = userActivityViewModel.getHasHeartRates();
                                    } else {
                                        hasHeartRates = null;
                                    }
                                    updateRegistration(17, hasHeartRates);
                                    zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                    j = j;
                                } else {
                                    zSafeUnbox = false;
                                }
                                onClickListenerImpl2 = value3;
                                z3 = zSafeUnbox7;
                                z2 = zSafeUnbox8;
                                str = str12;
                                z = zSafeUnbox9;
                            } else {
                                bool = bool;
                                rightArrowVisible = rightArrowVisible;
                            }
                            str5 = null;
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                j = j;
                            } else {
                                zSafeUnbox = false;
                            }
                            onClickListenerImpl2 = value3;
                            z3 = zSafeUnbox7;
                            z2 = zSafeUnbox8;
                            str = str12;
                            z = zSafeUnbox9;
                        } else {
                            str11 = str11;
                        }
                        str10 = null;
                        if ((j & 790528) != 0) {
                            if (userActivityViewModel != null) {
                                hasLocations = userActivityViewModel.getHasLocations();
                            } else {
                                hasLocations = null;
                            }
                            updateRegistration(12, hasLocations);
                            if (hasLocations != null) {
                                bool2 = hasLocations.get();
                            } else {
                                bool2 = null;
                            }
                            zSafeUnbox9 = androidx.databinding.ViewDataBinding.safeUnbox(bool2);
                        } else {
                            str10 = str10;
                            zSafeUnbox9 = false;
                        }
                        if ((j & 794624) != 0) {
                            if (userActivityViewModel != null) {
                                totalAscendedValue = userActivityViewModel.getTotalAscendedValue();
                            } else {
                                totalAscendedValue = null;
                            }
                            updateRegistration(13, totalAscendedValue);
                            if (totalAscendedValue != null) {
                                str6 = totalAscendedValue.get();
                            }
                            if ((j & 802816) != 0) {
                                if (userActivityViewModel != null) {
                                    totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                                } else {
                                    totalDescendedValue = null;
                                }
                                updateRegistration(14, totalDescendedValue);
                                if (totalDescendedValue != null) {
                                    str7 = totalDescendedValue.get();
                                }
                                if ((j & 819200) != 0) {
                                    if (userActivityViewModel != null) {
                                        rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                                    } else {
                                        rightArrowVisible = null;
                                    }
                                    updateRegistration(15, rightArrowVisible);
                                    if (rightArrowVisible != null) {
                                        bool = rightArrowVisible.get();
                                    } else {
                                        bool = null;
                                    }
                                    zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                                    j2 = 851968;
                                } else {
                                    str7 = str7;
                                    bool = null;
                                    rightArrowVisible = null;
                                    j2 = 851968;
                                    zSafeUnbox6 = false;
                                }
                                if ((j & j2) != 0) {
                                    if (userActivityViewModel != null) {
                                        pace = userActivityViewModel.getPace();
                                    } else {
                                        pace = null;
                                    }
                                    updateRegistration(16, pace);
                                    if (pace != null) {
                                        str5 = pace.get();
                                    }
                                    if ((j & 917504) != 0) {
                                        if (userActivityViewModel != null) {
                                            hasHeartRates = userActivityViewModel.getHasHeartRates();
                                        } else {
                                            hasHeartRates = null;
                                        }
                                        updateRegistration(17, hasHeartRates);
                                        zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                        j = j;
                                    } else {
                                        zSafeUnbox = false;
                                    }
                                    onClickListenerImpl2 = value3;
                                    z3 = zSafeUnbox7;
                                    z2 = zSafeUnbox8;
                                    str = str12;
                                    z = zSafeUnbox9;
                                } else {
                                    bool = bool;
                                    rightArrowVisible = rightArrowVisible;
                                }
                                str5 = null;
                                if ((j & 917504) != 0) {
                                    if (userActivityViewModel != null) {
                                        hasHeartRates = userActivityViewModel.getHasHeartRates();
                                    } else {
                                        hasHeartRates = null;
                                    }
                                    updateRegistration(17, hasHeartRates);
                                    zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                    j = j;
                                } else {
                                    zSafeUnbox = false;
                                }
                                onClickListenerImpl2 = value3;
                                z3 = zSafeUnbox7;
                                z2 = zSafeUnbox8;
                                str = str12;
                                z = zSafeUnbox9;
                            } else {
                                str6 = str6;
                            }
                            str7 = null;
                            if ((j & 819200) != 0) {
                                if (userActivityViewModel != null) {
                                    rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                                } else {
                                    rightArrowVisible = null;
                                }
                                updateRegistration(15, rightArrowVisible);
                                if (rightArrowVisible != null) {
                                    bool = rightArrowVisible.get();
                                } else {
                                    bool = null;
                                }
                                zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                                j2 = 851968;
                            } else {
                                str7 = str7;
                                bool = null;
                                rightArrowVisible = null;
                                j2 = 851968;
                                zSafeUnbox6 = false;
                            }
                            if ((j & j2) != 0) {
                                if (userActivityViewModel != null) {
                                    pace = userActivityViewModel.getPace();
                                } else {
                                    pace = null;
                                }
                                updateRegistration(16, pace);
                                if (pace != null) {
                                    str5 = pace.get();
                                }
                                if ((j & 917504) != 0) {
                                    if (userActivityViewModel != null) {
                                        hasHeartRates = userActivityViewModel.getHasHeartRates();
                                    } else {
                                        hasHeartRates = null;
                                    }
                                    updateRegistration(17, hasHeartRates);
                                    zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                    j = j;
                                } else {
                                    zSafeUnbox = false;
                                }
                                onClickListenerImpl2 = value3;
                                z3 = zSafeUnbox7;
                                z2 = zSafeUnbox8;
                                str = str12;
                                z = zSafeUnbox9;
                            } else {
                                bool = bool;
                                rightArrowVisible = rightArrowVisible;
                            }
                            str5 = null;
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                j = j;
                            } else {
                                zSafeUnbox = false;
                            }
                            onClickListenerImpl2 = value3;
                            z3 = zSafeUnbox7;
                            z2 = zSafeUnbox8;
                            str = str12;
                            z = zSafeUnbox9;
                        } else {
                            zSafeUnbox9 = zSafeUnbox9;
                        }
                        str6 = null;
                        if ((j & 802816) != 0) {
                            if (userActivityViewModel != null) {
                                totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                            } else {
                                totalDescendedValue = null;
                            }
                            updateRegistration(14, totalDescendedValue);
                            if (totalDescendedValue != null) {
                                str7 = totalDescendedValue.get();
                            }
                            if ((j & 819200) != 0) {
                                if (userActivityViewModel != null) {
                                    rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                                } else {
                                    rightArrowVisible = null;
                                }
                                updateRegistration(15, rightArrowVisible);
                                if (rightArrowVisible != null) {
                                    bool = rightArrowVisible.get();
                                } else {
                                    bool = null;
                                }
                                zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                                j2 = 851968;
                            } else {
                                str7 = str7;
                                bool = null;
                                rightArrowVisible = null;
                                j2 = 851968;
                                zSafeUnbox6 = false;
                            }
                            if ((j & j2) != 0) {
                                if (userActivityViewModel != null) {
                                    pace = userActivityViewModel.getPace();
                                } else {
                                    pace = null;
                                }
                                updateRegistration(16, pace);
                                if (pace != null) {
                                    str5 = pace.get();
                                }
                                if ((j & 917504) != 0) {
                                    if (userActivityViewModel != null) {
                                        hasHeartRates = userActivityViewModel.getHasHeartRates();
                                    } else {
                                        hasHeartRates = null;
                                    }
                                    updateRegistration(17, hasHeartRates);
                                    zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                    j = j;
                                } else {
                                    zSafeUnbox = false;
                                }
                                onClickListenerImpl2 = value3;
                                z3 = zSafeUnbox7;
                                z2 = zSafeUnbox8;
                                str = str12;
                                z = zSafeUnbox9;
                            } else {
                                bool = bool;
                                rightArrowVisible = rightArrowVisible;
                            }
                            str5 = null;
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                j = j;
                            } else {
                                zSafeUnbox = false;
                            }
                            onClickListenerImpl2 = value3;
                            z3 = zSafeUnbox7;
                            z2 = zSafeUnbox8;
                            str = str12;
                            z = zSafeUnbox9;
                        } else {
                            str6 = str6;
                        }
                        str7 = null;
                        if ((j & 819200) != 0) {
                            if (userActivityViewModel != null) {
                                rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                            } else {
                                rightArrowVisible = null;
                            }
                            updateRegistration(15, rightArrowVisible);
                            if (rightArrowVisible != null) {
                                bool = rightArrowVisible.get();
                            } else {
                                bool = null;
                            }
                            zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                            j2 = 851968;
                        } else {
                            str7 = str7;
                            bool = null;
                            rightArrowVisible = null;
                            j2 = 851968;
                            zSafeUnbox6 = false;
                        }
                        if ((j & j2) != 0) {
                            if (userActivityViewModel != null) {
                                pace = userActivityViewModel.getPace();
                            } else {
                                pace = null;
                            }
                            updateRegistration(16, pace);
                            if (pace != null) {
                                str5 = pace.get();
                            }
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                j = j;
                            } else {
                                zSafeUnbox = false;
                            }
                            onClickListenerImpl2 = value3;
                            z3 = zSafeUnbox7;
                            z2 = zSafeUnbox8;
                            str = str12;
                            z = zSafeUnbox9;
                        } else {
                            bool = bool;
                            rightArrowVisible = rightArrowVisible;
                        }
                        str5 = null;
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            j = j;
                        } else {
                            zSafeUnbox = false;
                        }
                        onClickListenerImpl2 = value3;
                        z3 = zSafeUnbox7;
                        z2 = zSafeUnbox8;
                        str = str12;
                        z = zSafeUnbox9;
                    } else {
                        zSafeUnbox2 = zSafeUnbox2;
                        zSafeUnbox8 = zSafeUnbox8;
                    }
                    str11 = null;
                    if ((j & 788480) != 0) {
                        if (userActivityViewModel != null) {
                            paceTitle = userActivityViewModel.getPaceTitle();
                        } else {
                            paceTitle = null;
                        }
                        updateRegistration(11, paceTitle);
                        if (paceTitle != null) {
                            str10 = paceTitle.get();
                        }
                        if ((j & 790528) != 0) {
                            if (userActivityViewModel != null) {
                                hasLocations = userActivityViewModel.getHasLocations();
                            } else {
                                hasLocations = null;
                            }
                            updateRegistration(12, hasLocations);
                            if (hasLocations != null) {
                                bool2 = hasLocations.get();
                            } else {
                                bool2 = null;
                            }
                            zSafeUnbox9 = androidx.databinding.ViewDataBinding.safeUnbox(bool2);
                        } else {
                            str10 = str10;
                            zSafeUnbox9 = false;
                        }
                        if ((j & 794624) != 0) {
                            if (userActivityViewModel != null) {
                                totalAscendedValue = userActivityViewModel.getTotalAscendedValue();
                            } else {
                                totalAscendedValue = null;
                            }
                            updateRegistration(13, totalAscendedValue);
                            if (totalAscendedValue != null) {
                                str6 = totalAscendedValue.get();
                            }
                            if ((j & 802816) != 0) {
                                if (userActivityViewModel != null) {
                                    totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                                } else {
                                    totalDescendedValue = null;
                                }
                                updateRegistration(14, totalDescendedValue);
                                if (totalDescendedValue != null) {
                                    str7 = totalDescendedValue.get();
                                }
                                if ((j & 819200) != 0) {
                                    if (userActivityViewModel != null) {
                                        rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                                    } else {
                                        rightArrowVisible = null;
                                    }
                                    updateRegistration(15, rightArrowVisible);
                                    if (rightArrowVisible != null) {
                                        bool = rightArrowVisible.get();
                                    } else {
                                        bool = null;
                                    }
                                    zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                                    j2 = 851968;
                                } else {
                                    str7 = str7;
                                    bool = null;
                                    rightArrowVisible = null;
                                    j2 = 851968;
                                    zSafeUnbox6 = false;
                                }
                                if ((j & j2) != 0) {
                                    if (userActivityViewModel != null) {
                                        pace = userActivityViewModel.getPace();
                                    } else {
                                        pace = null;
                                    }
                                    updateRegistration(16, pace);
                                    if (pace != null) {
                                        str5 = pace.get();
                                    }
                                    if ((j & 917504) != 0) {
                                        if (userActivityViewModel != null) {
                                            hasHeartRates = userActivityViewModel.getHasHeartRates();
                                        } else {
                                            hasHeartRates = null;
                                        }
                                        updateRegistration(17, hasHeartRates);
                                        zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                        j = j;
                                    } else {
                                        zSafeUnbox = false;
                                    }
                                    onClickListenerImpl2 = value3;
                                    z3 = zSafeUnbox7;
                                    z2 = zSafeUnbox8;
                                    str = str12;
                                    z = zSafeUnbox9;
                                } else {
                                    bool = bool;
                                    rightArrowVisible = rightArrowVisible;
                                }
                                str5 = null;
                                if ((j & 917504) != 0) {
                                    if (userActivityViewModel != null) {
                                        hasHeartRates = userActivityViewModel.getHasHeartRates();
                                    } else {
                                        hasHeartRates = null;
                                    }
                                    updateRegistration(17, hasHeartRates);
                                    zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                    j = j;
                                } else {
                                    zSafeUnbox = false;
                                }
                                onClickListenerImpl2 = value3;
                                z3 = zSafeUnbox7;
                                z2 = zSafeUnbox8;
                                str = str12;
                                z = zSafeUnbox9;
                            } else {
                                str6 = str6;
                            }
                            str7 = null;
                            if ((j & 819200) != 0) {
                                if (userActivityViewModel != null) {
                                    rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                                } else {
                                    rightArrowVisible = null;
                                }
                                updateRegistration(15, rightArrowVisible);
                                if (rightArrowVisible != null) {
                                    bool = rightArrowVisible.get();
                                } else {
                                    bool = null;
                                }
                                zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                                j2 = 851968;
                            } else {
                                str7 = str7;
                                bool = null;
                                rightArrowVisible = null;
                                j2 = 851968;
                                zSafeUnbox6 = false;
                            }
                            if ((j & j2) != 0) {
                                if (userActivityViewModel != null) {
                                    pace = userActivityViewModel.getPace();
                                } else {
                                    pace = null;
                                }
                                updateRegistration(16, pace);
                                if (pace != null) {
                                    str5 = pace.get();
                                }
                                if ((j & 917504) != 0) {
                                    if (userActivityViewModel != null) {
                                        hasHeartRates = userActivityViewModel.getHasHeartRates();
                                    } else {
                                        hasHeartRates = null;
                                    }
                                    updateRegistration(17, hasHeartRates);
                                    zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                    j = j;
                                } else {
                                    zSafeUnbox = false;
                                }
                                onClickListenerImpl2 = value3;
                                z3 = zSafeUnbox7;
                                z2 = zSafeUnbox8;
                                str = str12;
                                z = zSafeUnbox9;
                            } else {
                                bool = bool;
                                rightArrowVisible = rightArrowVisible;
                            }
                            str5 = null;
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                j = j;
                            } else {
                                zSafeUnbox = false;
                            }
                            onClickListenerImpl2 = value3;
                            z3 = zSafeUnbox7;
                            z2 = zSafeUnbox8;
                            str = str12;
                            z = zSafeUnbox9;
                        } else {
                            zSafeUnbox9 = zSafeUnbox9;
                        }
                        str6 = null;
                        if ((j & 802816) != 0) {
                            if (userActivityViewModel != null) {
                                totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                            } else {
                                totalDescendedValue = null;
                            }
                            updateRegistration(14, totalDescendedValue);
                            if (totalDescendedValue != null) {
                                str7 = totalDescendedValue.get();
                            }
                            if ((j & 819200) != 0) {
                                if (userActivityViewModel != null) {
                                    rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                                } else {
                                    rightArrowVisible = null;
                                }
                                updateRegistration(15, rightArrowVisible);
                                if (rightArrowVisible != null) {
                                    bool = rightArrowVisible.get();
                                } else {
                                    bool = null;
                                }
                                zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                                j2 = 851968;
                            } else {
                                str7 = str7;
                                bool = null;
                                rightArrowVisible = null;
                                j2 = 851968;
                                zSafeUnbox6 = false;
                            }
                            if ((j & j2) != 0) {
                                if (userActivityViewModel != null) {
                                    pace = userActivityViewModel.getPace();
                                } else {
                                    pace = null;
                                }
                                updateRegistration(16, pace);
                                if (pace != null) {
                                    str5 = pace.get();
                                }
                                if ((j & 917504) != 0) {
                                    if (userActivityViewModel != null) {
                                        hasHeartRates = userActivityViewModel.getHasHeartRates();
                                    } else {
                                        hasHeartRates = null;
                                    }
                                    updateRegistration(17, hasHeartRates);
                                    zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                    j = j;
                                } else {
                                    zSafeUnbox = false;
                                }
                                onClickListenerImpl2 = value3;
                                z3 = zSafeUnbox7;
                                z2 = zSafeUnbox8;
                                str = str12;
                                z = zSafeUnbox9;
                            } else {
                                bool = bool;
                                rightArrowVisible = rightArrowVisible;
                            }
                            str5 = null;
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                j = j;
                            } else {
                                zSafeUnbox = false;
                            }
                            onClickListenerImpl2 = value3;
                            z3 = zSafeUnbox7;
                            z2 = zSafeUnbox8;
                            str = str12;
                            z = zSafeUnbox9;
                        } else {
                            str6 = str6;
                        }
                        str7 = null;
                        if ((j & 819200) != 0) {
                            if (userActivityViewModel != null) {
                                rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                            } else {
                                rightArrowVisible = null;
                            }
                            updateRegistration(15, rightArrowVisible);
                            if (rightArrowVisible != null) {
                                bool = rightArrowVisible.get();
                            } else {
                                bool = null;
                            }
                            zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                            j2 = 851968;
                        } else {
                            str7 = str7;
                            bool = null;
                            rightArrowVisible = null;
                            j2 = 851968;
                            zSafeUnbox6 = false;
                        }
                        if ((j & j2) != 0) {
                            if (userActivityViewModel != null) {
                                pace = userActivityViewModel.getPace();
                            } else {
                                pace = null;
                            }
                            updateRegistration(16, pace);
                            if (pace != null) {
                                str5 = pace.get();
                            }
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                j = j;
                            } else {
                                zSafeUnbox = false;
                            }
                            onClickListenerImpl2 = value3;
                            z3 = zSafeUnbox7;
                            z2 = zSafeUnbox8;
                            str = str12;
                            z = zSafeUnbox9;
                        } else {
                            bool = bool;
                            rightArrowVisible = rightArrowVisible;
                        }
                        str5 = null;
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            j = j;
                        } else {
                            zSafeUnbox = false;
                        }
                        onClickListenerImpl2 = value3;
                        z3 = zSafeUnbox7;
                        z2 = zSafeUnbox8;
                        str = str12;
                        z = zSafeUnbox9;
                    } else {
                        str11 = str11;
                    }
                    str10 = null;
                    if ((j & 790528) != 0) {
                        if (userActivityViewModel != null) {
                            hasLocations = userActivityViewModel.getHasLocations();
                        } else {
                            hasLocations = null;
                        }
                        updateRegistration(12, hasLocations);
                        if (hasLocations != null) {
                            bool2 = hasLocations.get();
                        } else {
                            bool2 = null;
                        }
                        zSafeUnbox9 = androidx.databinding.ViewDataBinding.safeUnbox(bool2);
                    } else {
                        str10 = str10;
                        zSafeUnbox9 = false;
                    }
                    if ((j & 794624) != 0) {
                        if (userActivityViewModel != null) {
                            totalAscendedValue = userActivityViewModel.getTotalAscendedValue();
                        } else {
                            totalAscendedValue = null;
                        }
                        updateRegistration(13, totalAscendedValue);
                        if (totalAscendedValue != null) {
                            str6 = totalAscendedValue.get();
                        }
                        if ((j & 802816) != 0) {
                            if (userActivityViewModel != null) {
                                totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                            } else {
                                totalDescendedValue = null;
                            }
                            updateRegistration(14, totalDescendedValue);
                            if (totalDescendedValue != null) {
                                str7 = totalDescendedValue.get();
                            }
                            if ((j & 819200) != 0) {
                                if (userActivityViewModel != null) {
                                    rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                                } else {
                                    rightArrowVisible = null;
                                }
                                updateRegistration(15, rightArrowVisible);
                                if (rightArrowVisible != null) {
                                    bool = rightArrowVisible.get();
                                } else {
                                    bool = null;
                                }
                                zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                                j2 = 851968;
                            } else {
                                str7 = str7;
                                bool = null;
                                rightArrowVisible = null;
                                j2 = 851968;
                                zSafeUnbox6 = false;
                            }
                            if ((j & j2) != 0) {
                                if (userActivityViewModel != null) {
                                    pace = userActivityViewModel.getPace();
                                } else {
                                    pace = null;
                                }
                                updateRegistration(16, pace);
                                if (pace != null) {
                                    str5 = pace.get();
                                }
                                if ((j & 917504) != 0) {
                                    if (userActivityViewModel != null) {
                                        hasHeartRates = userActivityViewModel.getHasHeartRates();
                                    } else {
                                        hasHeartRates = null;
                                    }
                                    updateRegistration(17, hasHeartRates);
                                    zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                    j = j;
                                } else {
                                    zSafeUnbox = false;
                                }
                                onClickListenerImpl2 = value3;
                                z3 = zSafeUnbox7;
                                z2 = zSafeUnbox8;
                                str = str12;
                                z = zSafeUnbox9;
                            } else {
                                bool = bool;
                                rightArrowVisible = rightArrowVisible;
                            }
                            str5 = null;
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                j = j;
                            } else {
                                zSafeUnbox = false;
                            }
                            onClickListenerImpl2 = value3;
                            z3 = zSafeUnbox7;
                            z2 = zSafeUnbox8;
                            str = str12;
                            z = zSafeUnbox9;
                        } else {
                            str6 = str6;
                        }
                        str7 = null;
                        if ((j & 819200) != 0) {
                            if (userActivityViewModel != null) {
                                rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                            } else {
                                rightArrowVisible = null;
                            }
                            updateRegistration(15, rightArrowVisible);
                            if (rightArrowVisible != null) {
                                bool = rightArrowVisible.get();
                            } else {
                                bool = null;
                            }
                            zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                            j2 = 851968;
                        } else {
                            str7 = str7;
                            bool = null;
                            rightArrowVisible = null;
                            j2 = 851968;
                            zSafeUnbox6 = false;
                        }
                        if ((j & j2) != 0) {
                            if (userActivityViewModel != null) {
                                pace = userActivityViewModel.getPace();
                            } else {
                                pace = null;
                            }
                            updateRegistration(16, pace);
                            if (pace != null) {
                                str5 = pace.get();
                            }
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                j = j;
                            } else {
                                zSafeUnbox = false;
                            }
                            onClickListenerImpl2 = value3;
                            z3 = zSafeUnbox7;
                            z2 = zSafeUnbox8;
                            str = str12;
                            z = zSafeUnbox9;
                        } else {
                            bool = bool;
                            rightArrowVisible = rightArrowVisible;
                        }
                        str5 = null;
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            j = j;
                        } else {
                            zSafeUnbox = false;
                        }
                        onClickListenerImpl2 = value3;
                        z3 = zSafeUnbox7;
                        z2 = zSafeUnbox8;
                        str = str12;
                        z = zSafeUnbox9;
                    } else {
                        zSafeUnbox9 = zSafeUnbox9;
                    }
                    str6 = null;
                    if ((j & 802816) != 0) {
                        if (userActivityViewModel != null) {
                            totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                        } else {
                            totalDescendedValue = null;
                        }
                        updateRegistration(14, totalDescendedValue);
                        if (totalDescendedValue != null) {
                            str7 = totalDescendedValue.get();
                        }
                        if ((j & 819200) != 0) {
                            if (userActivityViewModel != null) {
                                rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                            } else {
                                rightArrowVisible = null;
                            }
                            updateRegistration(15, rightArrowVisible);
                            if (rightArrowVisible != null) {
                                bool = rightArrowVisible.get();
                            } else {
                                bool = null;
                            }
                            zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                            j2 = 851968;
                        } else {
                            str7 = str7;
                            bool = null;
                            rightArrowVisible = null;
                            j2 = 851968;
                            zSafeUnbox6 = false;
                        }
                        if ((j & j2) != 0) {
                            if (userActivityViewModel != null) {
                                pace = userActivityViewModel.getPace();
                            } else {
                                pace = null;
                            }
                            updateRegistration(16, pace);
                            if (pace != null) {
                                str5 = pace.get();
                            }
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                j = j;
                            } else {
                                zSafeUnbox = false;
                            }
                            onClickListenerImpl2 = value3;
                            z3 = zSafeUnbox7;
                            z2 = zSafeUnbox8;
                            str = str12;
                            z = zSafeUnbox9;
                        } else {
                            bool = bool;
                            rightArrowVisible = rightArrowVisible;
                        }
                        str5 = null;
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            j = j;
                        } else {
                            zSafeUnbox = false;
                        }
                        onClickListenerImpl2 = value3;
                        z3 = zSafeUnbox7;
                        z2 = zSafeUnbox8;
                        str = str12;
                        z = zSafeUnbox9;
                    } else {
                        str6 = str6;
                    }
                    str7 = null;
                    if ((j & 819200) != 0) {
                        if (userActivityViewModel != null) {
                            rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                        } else {
                            rightArrowVisible = null;
                        }
                        updateRegistration(15, rightArrowVisible);
                        if (rightArrowVisible != null) {
                            bool = rightArrowVisible.get();
                        } else {
                            bool = null;
                        }
                        zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                        j2 = 851968;
                    } else {
                        str7 = str7;
                        bool = null;
                        rightArrowVisible = null;
                        j2 = 851968;
                        zSafeUnbox6 = false;
                    }
                    if ((j & j2) != 0) {
                        if (userActivityViewModel != null) {
                            pace = userActivityViewModel.getPace();
                        } else {
                            pace = null;
                        }
                        updateRegistration(16, pace);
                        if (pace != null) {
                            str5 = pace.get();
                        }
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            j = j;
                        } else {
                            zSafeUnbox = false;
                        }
                        onClickListenerImpl2 = value3;
                        z3 = zSafeUnbox7;
                        z2 = zSafeUnbox8;
                        str = str12;
                        z = zSafeUnbox9;
                    } else {
                        bool = bool;
                        rightArrowVisible = rightArrowVisible;
                    }
                    str5 = null;
                    if ((j & 917504) != 0) {
                        if (userActivityViewModel != null) {
                            hasHeartRates = userActivityViewModel.getHasHeartRates();
                        } else {
                            hasHeartRates = null;
                        }
                        updateRegistration(17, hasHeartRates);
                        zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                        j = j;
                    } else {
                        zSafeUnbox = false;
                    }
                    onClickListenerImpl2 = value3;
                    z3 = zSafeUnbox7;
                    z2 = zSafeUnbox8;
                    str = str12;
                    z = zSafeUnbox9;
                } else {
                    str9 = str9;
                }
                str3 = null;
                if ((j & 786944) != 0) {
                    if (userActivityViewModel != null) {
                        noSessions = userActivityViewModel.getNoSessions();
                    } else {
                        noSessions = null;
                    }
                    updateRegistration(9, noSessions);
                    if (noSessions != null) {
                        bool3 = noSessions.get();
                    } else {
                        bool3 = null;
                    }
                    zSafeUnbox2 = androidx.databinding.ViewDataBinding.safeUnbox(bool3);
                    zSafeUnbox5 = androidx.databinding.ViewDataBinding.safeUnbox(java.lang.Boolean.valueOf(!zSafeUnbox2));
                } else {
                    str3 = str3;
                    zSafeUnbox2 = false;
                    zSafeUnbox5 = false;
                }
                if ((j & 787456) != 0) {
                    if (userActivityViewModel != null) {
                        subtitleField = userActivityViewModel.getSubtitleField();
                    } else {
                        subtitleField = null;
                    }
                    updateRegistration(10, subtitleField);
                    if (subtitleField != null) {
                        str11 = subtitleField.get();
                    }
                    if ((j & 788480) != 0) {
                        if (userActivityViewModel != null) {
                            paceTitle = userActivityViewModel.getPaceTitle();
                        } else {
                            paceTitle = null;
                        }
                        updateRegistration(11, paceTitle);
                        if (paceTitle != null) {
                            str10 = paceTitle.get();
                        }
                        if ((j & 790528) != 0) {
                            if (userActivityViewModel != null) {
                                hasLocations = userActivityViewModel.getHasLocations();
                            } else {
                                hasLocations = null;
                            }
                            updateRegistration(12, hasLocations);
                            if (hasLocations != null) {
                                bool2 = hasLocations.get();
                            } else {
                                bool2 = null;
                            }
                            zSafeUnbox9 = androidx.databinding.ViewDataBinding.safeUnbox(bool2);
                        } else {
                            str10 = str10;
                            zSafeUnbox9 = false;
                        }
                        if ((j & 794624) != 0) {
                            if (userActivityViewModel != null) {
                                totalAscendedValue = userActivityViewModel.getTotalAscendedValue();
                            } else {
                                totalAscendedValue = null;
                            }
                            updateRegistration(13, totalAscendedValue);
                            if (totalAscendedValue != null) {
                                str6 = totalAscendedValue.get();
                            }
                            if ((j & 802816) != 0) {
                                if (userActivityViewModel != null) {
                                    totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                                } else {
                                    totalDescendedValue = null;
                                }
                                updateRegistration(14, totalDescendedValue);
                                if (totalDescendedValue != null) {
                                    str7 = totalDescendedValue.get();
                                }
                                if ((j & 819200) != 0) {
                                    if (userActivityViewModel != null) {
                                        rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                                    } else {
                                        rightArrowVisible = null;
                                    }
                                    updateRegistration(15, rightArrowVisible);
                                    if (rightArrowVisible != null) {
                                        bool = rightArrowVisible.get();
                                    } else {
                                        bool = null;
                                    }
                                    zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                                    j2 = 851968;
                                } else {
                                    str7 = str7;
                                    bool = null;
                                    rightArrowVisible = null;
                                    j2 = 851968;
                                    zSafeUnbox6 = false;
                                }
                                if ((j & j2) != 0) {
                                    if (userActivityViewModel != null) {
                                        pace = userActivityViewModel.getPace();
                                    } else {
                                        pace = null;
                                    }
                                    updateRegistration(16, pace);
                                    if (pace != null) {
                                        str5 = pace.get();
                                    }
                                    if ((j & 917504) != 0) {
                                        if (userActivityViewModel != null) {
                                            hasHeartRates = userActivityViewModel.getHasHeartRates();
                                        } else {
                                            hasHeartRates = null;
                                        }
                                        updateRegistration(17, hasHeartRates);
                                        zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                        j = j;
                                    } else {
                                        zSafeUnbox = false;
                                    }
                                    onClickListenerImpl2 = value3;
                                    z3 = zSafeUnbox7;
                                    z2 = zSafeUnbox8;
                                    str = str12;
                                    z = zSafeUnbox9;
                                } else {
                                    bool = bool;
                                    rightArrowVisible = rightArrowVisible;
                                }
                                str5 = null;
                                if ((j & 917504) != 0) {
                                    if (userActivityViewModel != null) {
                                        hasHeartRates = userActivityViewModel.getHasHeartRates();
                                    } else {
                                        hasHeartRates = null;
                                    }
                                    updateRegistration(17, hasHeartRates);
                                    zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                    j = j;
                                } else {
                                    zSafeUnbox = false;
                                }
                                onClickListenerImpl2 = value3;
                                z3 = zSafeUnbox7;
                                z2 = zSafeUnbox8;
                                str = str12;
                                z = zSafeUnbox9;
                            } else {
                                str6 = str6;
                            }
                            str7 = null;
                            if ((j & 819200) != 0) {
                                if (userActivityViewModel != null) {
                                    rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                                } else {
                                    rightArrowVisible = null;
                                }
                                updateRegistration(15, rightArrowVisible);
                                if (rightArrowVisible != null) {
                                    bool = rightArrowVisible.get();
                                } else {
                                    bool = null;
                                }
                                zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                                j2 = 851968;
                            } else {
                                str7 = str7;
                                bool = null;
                                rightArrowVisible = null;
                                j2 = 851968;
                                zSafeUnbox6 = false;
                            }
                            if ((j & j2) != 0) {
                                if (userActivityViewModel != null) {
                                    pace = userActivityViewModel.getPace();
                                } else {
                                    pace = null;
                                }
                                updateRegistration(16, pace);
                                if (pace != null) {
                                    str5 = pace.get();
                                }
                                if ((j & 917504) != 0) {
                                    if (userActivityViewModel != null) {
                                        hasHeartRates = userActivityViewModel.getHasHeartRates();
                                    } else {
                                        hasHeartRates = null;
                                    }
                                    updateRegistration(17, hasHeartRates);
                                    zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                    j = j;
                                } else {
                                    zSafeUnbox = false;
                                }
                                onClickListenerImpl2 = value3;
                                z3 = zSafeUnbox7;
                                z2 = zSafeUnbox8;
                                str = str12;
                                z = zSafeUnbox9;
                            } else {
                                bool = bool;
                                rightArrowVisible = rightArrowVisible;
                            }
                            str5 = null;
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                j = j;
                            } else {
                                zSafeUnbox = false;
                            }
                            onClickListenerImpl2 = value3;
                            z3 = zSafeUnbox7;
                            z2 = zSafeUnbox8;
                            str = str12;
                            z = zSafeUnbox9;
                        } else {
                            zSafeUnbox9 = zSafeUnbox9;
                        }
                        str6 = null;
                        if ((j & 802816) != 0) {
                            if (userActivityViewModel != null) {
                                totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                            } else {
                                totalDescendedValue = null;
                            }
                            updateRegistration(14, totalDescendedValue);
                            if (totalDescendedValue != null) {
                                str7 = totalDescendedValue.get();
                            }
                            if ((j & 819200) != 0) {
                                if (userActivityViewModel != null) {
                                    rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                                } else {
                                    rightArrowVisible = null;
                                }
                                updateRegistration(15, rightArrowVisible);
                                if (rightArrowVisible != null) {
                                    bool = rightArrowVisible.get();
                                } else {
                                    bool = null;
                                }
                                zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                                j2 = 851968;
                            } else {
                                str7 = str7;
                                bool = null;
                                rightArrowVisible = null;
                                j2 = 851968;
                                zSafeUnbox6 = false;
                            }
                            if ((j & j2) != 0) {
                                if (userActivityViewModel != null) {
                                    pace = userActivityViewModel.getPace();
                                } else {
                                    pace = null;
                                }
                                updateRegistration(16, pace);
                                if (pace != null) {
                                    str5 = pace.get();
                                }
                                if ((j & 917504) != 0) {
                                    if (userActivityViewModel != null) {
                                        hasHeartRates = userActivityViewModel.getHasHeartRates();
                                    } else {
                                        hasHeartRates = null;
                                    }
                                    updateRegistration(17, hasHeartRates);
                                    zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                    j = j;
                                } else {
                                    zSafeUnbox = false;
                                }
                                onClickListenerImpl2 = value3;
                                z3 = zSafeUnbox7;
                                z2 = zSafeUnbox8;
                                str = str12;
                                z = zSafeUnbox9;
                            } else {
                                bool = bool;
                                rightArrowVisible = rightArrowVisible;
                            }
                            str5 = null;
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                j = j;
                            } else {
                                zSafeUnbox = false;
                            }
                            onClickListenerImpl2 = value3;
                            z3 = zSafeUnbox7;
                            z2 = zSafeUnbox8;
                            str = str12;
                            z = zSafeUnbox9;
                        } else {
                            str6 = str6;
                        }
                        str7 = null;
                        if ((j & 819200) != 0) {
                            if (userActivityViewModel != null) {
                                rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                            } else {
                                rightArrowVisible = null;
                            }
                            updateRegistration(15, rightArrowVisible);
                            if (rightArrowVisible != null) {
                                bool = rightArrowVisible.get();
                            } else {
                                bool = null;
                            }
                            zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                            j2 = 851968;
                        } else {
                            str7 = str7;
                            bool = null;
                            rightArrowVisible = null;
                            j2 = 851968;
                            zSafeUnbox6 = false;
                        }
                        if ((j & j2) != 0) {
                            if (userActivityViewModel != null) {
                                pace = userActivityViewModel.getPace();
                            } else {
                                pace = null;
                            }
                            updateRegistration(16, pace);
                            if (pace != null) {
                                str5 = pace.get();
                            }
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                j = j;
                            } else {
                                zSafeUnbox = false;
                            }
                            onClickListenerImpl2 = value3;
                            z3 = zSafeUnbox7;
                            z2 = zSafeUnbox8;
                            str = str12;
                            z = zSafeUnbox9;
                        } else {
                            bool = bool;
                            rightArrowVisible = rightArrowVisible;
                        }
                        str5 = null;
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            j = j;
                        } else {
                            zSafeUnbox = false;
                        }
                        onClickListenerImpl2 = value3;
                        z3 = zSafeUnbox7;
                        z2 = zSafeUnbox8;
                        str = str12;
                        z = zSafeUnbox9;
                    } else {
                        str11 = str11;
                    }
                    str10 = null;
                    if ((j & 790528) != 0) {
                        if (userActivityViewModel != null) {
                            hasLocations = userActivityViewModel.getHasLocations();
                        } else {
                            hasLocations = null;
                        }
                        updateRegistration(12, hasLocations);
                        if (hasLocations != null) {
                            bool2 = hasLocations.get();
                        } else {
                            bool2 = null;
                        }
                        zSafeUnbox9 = androidx.databinding.ViewDataBinding.safeUnbox(bool2);
                    } else {
                        str10 = str10;
                        zSafeUnbox9 = false;
                    }
                    if ((j & 794624) != 0) {
                        if (userActivityViewModel != null) {
                            totalAscendedValue = userActivityViewModel.getTotalAscendedValue();
                        } else {
                            totalAscendedValue = null;
                        }
                        updateRegistration(13, totalAscendedValue);
                        if (totalAscendedValue != null) {
                            str6 = totalAscendedValue.get();
                        }
                        if ((j & 802816) != 0) {
                            if (userActivityViewModel != null) {
                                totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                            } else {
                                totalDescendedValue = null;
                            }
                            updateRegistration(14, totalDescendedValue);
                            if (totalDescendedValue != null) {
                                str7 = totalDescendedValue.get();
                            }
                            if ((j & 819200) != 0) {
                                if (userActivityViewModel != null) {
                                    rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                                } else {
                                    rightArrowVisible = null;
                                }
                                updateRegistration(15, rightArrowVisible);
                                if (rightArrowVisible != null) {
                                    bool = rightArrowVisible.get();
                                } else {
                                    bool = null;
                                }
                                zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                                j2 = 851968;
                            } else {
                                str7 = str7;
                                bool = null;
                                rightArrowVisible = null;
                                j2 = 851968;
                                zSafeUnbox6 = false;
                            }
                            if ((j & j2) != 0) {
                                if (userActivityViewModel != null) {
                                    pace = userActivityViewModel.getPace();
                                } else {
                                    pace = null;
                                }
                                updateRegistration(16, pace);
                                if (pace != null) {
                                    str5 = pace.get();
                                }
                                if ((j & 917504) != 0) {
                                    if (userActivityViewModel != null) {
                                        hasHeartRates = userActivityViewModel.getHasHeartRates();
                                    } else {
                                        hasHeartRates = null;
                                    }
                                    updateRegistration(17, hasHeartRates);
                                    zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                    j = j;
                                } else {
                                    zSafeUnbox = false;
                                }
                                onClickListenerImpl2 = value3;
                                z3 = zSafeUnbox7;
                                z2 = zSafeUnbox8;
                                str = str12;
                                z = zSafeUnbox9;
                            } else {
                                bool = bool;
                                rightArrowVisible = rightArrowVisible;
                            }
                            str5 = null;
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                j = j;
                            } else {
                                zSafeUnbox = false;
                            }
                            onClickListenerImpl2 = value3;
                            z3 = zSafeUnbox7;
                            z2 = zSafeUnbox8;
                            str = str12;
                            z = zSafeUnbox9;
                        } else {
                            str6 = str6;
                        }
                        str7 = null;
                        if ((j & 819200) != 0) {
                            if (userActivityViewModel != null) {
                                rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                            } else {
                                rightArrowVisible = null;
                            }
                            updateRegistration(15, rightArrowVisible);
                            if (rightArrowVisible != null) {
                                bool = rightArrowVisible.get();
                            } else {
                                bool = null;
                            }
                            zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                            j2 = 851968;
                        } else {
                            str7 = str7;
                            bool = null;
                            rightArrowVisible = null;
                            j2 = 851968;
                            zSafeUnbox6 = false;
                        }
                        if ((j & j2) != 0) {
                            if (userActivityViewModel != null) {
                                pace = userActivityViewModel.getPace();
                            } else {
                                pace = null;
                            }
                            updateRegistration(16, pace);
                            if (pace != null) {
                                str5 = pace.get();
                            }
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                j = j;
                            } else {
                                zSafeUnbox = false;
                            }
                            onClickListenerImpl2 = value3;
                            z3 = zSafeUnbox7;
                            z2 = zSafeUnbox8;
                            str = str12;
                            z = zSafeUnbox9;
                        } else {
                            bool = bool;
                            rightArrowVisible = rightArrowVisible;
                        }
                        str5 = null;
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            j = j;
                        } else {
                            zSafeUnbox = false;
                        }
                        onClickListenerImpl2 = value3;
                        z3 = zSafeUnbox7;
                        z2 = zSafeUnbox8;
                        str = str12;
                        z = zSafeUnbox9;
                    } else {
                        zSafeUnbox9 = zSafeUnbox9;
                    }
                    str6 = null;
                    if ((j & 802816) != 0) {
                        if (userActivityViewModel != null) {
                            totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                        } else {
                            totalDescendedValue = null;
                        }
                        updateRegistration(14, totalDescendedValue);
                        if (totalDescendedValue != null) {
                            str7 = totalDescendedValue.get();
                        }
                        if ((j & 819200) != 0) {
                            if (userActivityViewModel != null) {
                                rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                            } else {
                                rightArrowVisible = null;
                            }
                            updateRegistration(15, rightArrowVisible);
                            if (rightArrowVisible != null) {
                                bool = rightArrowVisible.get();
                            } else {
                                bool = null;
                            }
                            zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                            j2 = 851968;
                        } else {
                            str7 = str7;
                            bool = null;
                            rightArrowVisible = null;
                            j2 = 851968;
                            zSafeUnbox6 = false;
                        }
                        if ((j & j2) != 0) {
                            if (userActivityViewModel != null) {
                                pace = userActivityViewModel.getPace();
                            } else {
                                pace = null;
                            }
                            updateRegistration(16, pace);
                            if (pace != null) {
                                str5 = pace.get();
                            }
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                j = j;
                            } else {
                                zSafeUnbox = false;
                            }
                            onClickListenerImpl2 = value3;
                            z3 = zSafeUnbox7;
                            z2 = zSafeUnbox8;
                            str = str12;
                            z = zSafeUnbox9;
                        } else {
                            bool = bool;
                            rightArrowVisible = rightArrowVisible;
                        }
                        str5 = null;
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            j = j;
                        } else {
                            zSafeUnbox = false;
                        }
                        onClickListenerImpl2 = value3;
                        z3 = zSafeUnbox7;
                        z2 = zSafeUnbox8;
                        str = str12;
                        z = zSafeUnbox9;
                    } else {
                        str6 = str6;
                    }
                    str7 = null;
                    if ((j & 819200) != 0) {
                        if (userActivityViewModel != null) {
                            rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                        } else {
                            rightArrowVisible = null;
                        }
                        updateRegistration(15, rightArrowVisible);
                        if (rightArrowVisible != null) {
                            bool = rightArrowVisible.get();
                        } else {
                            bool = null;
                        }
                        zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                        j2 = 851968;
                    } else {
                        str7 = str7;
                        bool = null;
                        rightArrowVisible = null;
                        j2 = 851968;
                        zSafeUnbox6 = false;
                    }
                    if ((j & j2) != 0) {
                        if (userActivityViewModel != null) {
                            pace = userActivityViewModel.getPace();
                        } else {
                            pace = null;
                        }
                        updateRegistration(16, pace);
                        if (pace != null) {
                            str5 = pace.get();
                        }
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            j = j;
                        } else {
                            zSafeUnbox = false;
                        }
                        onClickListenerImpl2 = value3;
                        z3 = zSafeUnbox7;
                        z2 = zSafeUnbox8;
                        str = str12;
                        z = zSafeUnbox9;
                    } else {
                        bool = bool;
                        rightArrowVisible = rightArrowVisible;
                    }
                    str5 = null;
                    if ((j & 917504) != 0) {
                        if (userActivityViewModel != null) {
                            hasHeartRates = userActivityViewModel.getHasHeartRates();
                        } else {
                            hasHeartRates = null;
                        }
                        updateRegistration(17, hasHeartRates);
                        zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                        j = j;
                    } else {
                        zSafeUnbox = false;
                    }
                    onClickListenerImpl2 = value3;
                    z3 = zSafeUnbox7;
                    z2 = zSafeUnbox8;
                    str = str12;
                    z = zSafeUnbox9;
                } else {
                    zSafeUnbox2 = zSafeUnbox2;
                    zSafeUnbox8 = zSafeUnbox8;
                }
                str11 = null;
                if ((j & 788480) != 0) {
                    if (userActivityViewModel != null) {
                        paceTitle = userActivityViewModel.getPaceTitle();
                    } else {
                        paceTitle = null;
                    }
                    updateRegistration(11, paceTitle);
                    if (paceTitle != null) {
                        str10 = paceTitle.get();
                    }
                    if ((j & 790528) != 0) {
                        if (userActivityViewModel != null) {
                            hasLocations = userActivityViewModel.getHasLocations();
                        } else {
                            hasLocations = null;
                        }
                        updateRegistration(12, hasLocations);
                        if (hasLocations != null) {
                            bool2 = hasLocations.get();
                        } else {
                            bool2 = null;
                        }
                        zSafeUnbox9 = androidx.databinding.ViewDataBinding.safeUnbox(bool2);
                    } else {
                        str10 = str10;
                        zSafeUnbox9 = false;
                    }
                    if ((j & 794624) != 0) {
                        if (userActivityViewModel != null) {
                            totalAscendedValue = userActivityViewModel.getTotalAscendedValue();
                        } else {
                            totalAscendedValue = null;
                        }
                        updateRegistration(13, totalAscendedValue);
                        if (totalAscendedValue != null) {
                            str6 = totalAscendedValue.get();
                        }
                        if ((j & 802816) != 0) {
                            if (userActivityViewModel != null) {
                                totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                            } else {
                                totalDescendedValue = null;
                            }
                            updateRegistration(14, totalDescendedValue);
                            if (totalDescendedValue != null) {
                                str7 = totalDescendedValue.get();
                            }
                            if ((j & 819200) != 0) {
                                if (userActivityViewModel != null) {
                                    rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                                } else {
                                    rightArrowVisible = null;
                                }
                                updateRegistration(15, rightArrowVisible);
                                if (rightArrowVisible != null) {
                                    bool = rightArrowVisible.get();
                                } else {
                                    bool = null;
                                }
                                zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                                j2 = 851968;
                            } else {
                                str7 = str7;
                                bool = null;
                                rightArrowVisible = null;
                                j2 = 851968;
                                zSafeUnbox6 = false;
                            }
                            if ((j & j2) != 0) {
                                if (userActivityViewModel != null) {
                                    pace = userActivityViewModel.getPace();
                                } else {
                                    pace = null;
                                }
                                updateRegistration(16, pace);
                                if (pace != null) {
                                    str5 = pace.get();
                                }
                                if ((j & 917504) != 0) {
                                    if (userActivityViewModel != null) {
                                        hasHeartRates = userActivityViewModel.getHasHeartRates();
                                    } else {
                                        hasHeartRates = null;
                                    }
                                    updateRegistration(17, hasHeartRates);
                                    zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                    j = j;
                                } else {
                                    zSafeUnbox = false;
                                }
                                onClickListenerImpl2 = value3;
                                z3 = zSafeUnbox7;
                                z2 = zSafeUnbox8;
                                str = str12;
                                z = zSafeUnbox9;
                            } else {
                                bool = bool;
                                rightArrowVisible = rightArrowVisible;
                            }
                            str5 = null;
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                j = j;
                            } else {
                                zSafeUnbox = false;
                            }
                            onClickListenerImpl2 = value3;
                            z3 = zSafeUnbox7;
                            z2 = zSafeUnbox8;
                            str = str12;
                            z = zSafeUnbox9;
                        } else {
                            str6 = str6;
                        }
                        str7 = null;
                        if ((j & 819200) != 0) {
                            if (userActivityViewModel != null) {
                                rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                            } else {
                                rightArrowVisible = null;
                            }
                            updateRegistration(15, rightArrowVisible);
                            if (rightArrowVisible != null) {
                                bool = rightArrowVisible.get();
                            } else {
                                bool = null;
                            }
                            zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                            j2 = 851968;
                        } else {
                            str7 = str7;
                            bool = null;
                            rightArrowVisible = null;
                            j2 = 851968;
                            zSafeUnbox6 = false;
                        }
                        if ((j & j2) != 0) {
                            if (userActivityViewModel != null) {
                                pace = userActivityViewModel.getPace();
                            } else {
                                pace = null;
                            }
                            updateRegistration(16, pace);
                            if (pace != null) {
                                str5 = pace.get();
                            }
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                j = j;
                            } else {
                                zSafeUnbox = false;
                            }
                            onClickListenerImpl2 = value3;
                            z3 = zSafeUnbox7;
                            z2 = zSafeUnbox8;
                            str = str12;
                            z = zSafeUnbox9;
                        } else {
                            bool = bool;
                            rightArrowVisible = rightArrowVisible;
                        }
                        str5 = null;
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            j = j;
                        } else {
                            zSafeUnbox = false;
                        }
                        onClickListenerImpl2 = value3;
                        z3 = zSafeUnbox7;
                        z2 = zSafeUnbox8;
                        str = str12;
                        z = zSafeUnbox9;
                    } else {
                        zSafeUnbox9 = zSafeUnbox9;
                    }
                    str6 = null;
                    if ((j & 802816) != 0) {
                        if (userActivityViewModel != null) {
                            totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                        } else {
                            totalDescendedValue = null;
                        }
                        updateRegistration(14, totalDescendedValue);
                        if (totalDescendedValue != null) {
                            str7 = totalDescendedValue.get();
                        }
                        if ((j & 819200) != 0) {
                            if (userActivityViewModel != null) {
                                rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                            } else {
                                rightArrowVisible = null;
                            }
                            updateRegistration(15, rightArrowVisible);
                            if (rightArrowVisible != null) {
                                bool = rightArrowVisible.get();
                            } else {
                                bool = null;
                            }
                            zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                            j2 = 851968;
                        } else {
                            str7 = str7;
                            bool = null;
                            rightArrowVisible = null;
                            j2 = 851968;
                            zSafeUnbox6 = false;
                        }
                        if ((j & j2) != 0) {
                            if (userActivityViewModel != null) {
                                pace = userActivityViewModel.getPace();
                            } else {
                                pace = null;
                            }
                            updateRegistration(16, pace);
                            if (pace != null) {
                                str5 = pace.get();
                            }
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                j = j;
                            } else {
                                zSafeUnbox = false;
                            }
                            onClickListenerImpl2 = value3;
                            z3 = zSafeUnbox7;
                            z2 = zSafeUnbox8;
                            str = str12;
                            z = zSafeUnbox9;
                        } else {
                            bool = bool;
                            rightArrowVisible = rightArrowVisible;
                        }
                        str5 = null;
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            j = j;
                        } else {
                            zSafeUnbox = false;
                        }
                        onClickListenerImpl2 = value3;
                        z3 = zSafeUnbox7;
                        z2 = zSafeUnbox8;
                        str = str12;
                        z = zSafeUnbox9;
                    } else {
                        str6 = str6;
                    }
                    str7 = null;
                    if ((j & 819200) != 0) {
                        if (userActivityViewModel != null) {
                            rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                        } else {
                            rightArrowVisible = null;
                        }
                        updateRegistration(15, rightArrowVisible);
                        if (rightArrowVisible != null) {
                            bool = rightArrowVisible.get();
                        } else {
                            bool = null;
                        }
                        zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                        j2 = 851968;
                    } else {
                        str7 = str7;
                        bool = null;
                        rightArrowVisible = null;
                        j2 = 851968;
                        zSafeUnbox6 = false;
                    }
                    if ((j & j2) != 0) {
                        if (userActivityViewModel != null) {
                            pace = userActivityViewModel.getPace();
                        } else {
                            pace = null;
                        }
                        updateRegistration(16, pace);
                        if (pace != null) {
                            str5 = pace.get();
                        }
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            j = j;
                        } else {
                            zSafeUnbox = false;
                        }
                        onClickListenerImpl2 = value3;
                        z3 = zSafeUnbox7;
                        z2 = zSafeUnbox8;
                        str = str12;
                        z = zSafeUnbox9;
                    } else {
                        bool = bool;
                        rightArrowVisible = rightArrowVisible;
                    }
                    str5 = null;
                    if ((j & 917504) != 0) {
                        if (userActivityViewModel != null) {
                            hasHeartRates = userActivityViewModel.getHasHeartRates();
                        } else {
                            hasHeartRates = null;
                        }
                        updateRegistration(17, hasHeartRates);
                        zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                        j = j;
                    } else {
                        zSafeUnbox = false;
                    }
                    onClickListenerImpl2 = value3;
                    z3 = zSafeUnbox7;
                    z2 = zSafeUnbox8;
                    str = str12;
                    z = zSafeUnbox9;
                } else {
                    str11 = str11;
                }
                str10 = null;
                if ((j & 790528) != 0) {
                    if (userActivityViewModel != null) {
                        hasLocations = userActivityViewModel.getHasLocations();
                    } else {
                        hasLocations = null;
                    }
                    updateRegistration(12, hasLocations);
                    if (hasLocations != null) {
                        bool2 = hasLocations.get();
                    } else {
                        bool2 = null;
                    }
                    zSafeUnbox9 = androidx.databinding.ViewDataBinding.safeUnbox(bool2);
                } else {
                    str10 = str10;
                    zSafeUnbox9 = false;
                }
                if ((j & 794624) != 0) {
                    if (userActivityViewModel != null) {
                        totalAscendedValue = userActivityViewModel.getTotalAscendedValue();
                    } else {
                        totalAscendedValue = null;
                    }
                    updateRegistration(13, totalAscendedValue);
                    if (totalAscendedValue != null) {
                        str6 = totalAscendedValue.get();
                    }
                    if ((j & 802816) != 0) {
                        if (userActivityViewModel != null) {
                            totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                        } else {
                            totalDescendedValue = null;
                        }
                        updateRegistration(14, totalDescendedValue);
                        if (totalDescendedValue != null) {
                            str7 = totalDescendedValue.get();
                        }
                        if ((j & 819200) != 0) {
                            if (userActivityViewModel != null) {
                                rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                            } else {
                                rightArrowVisible = null;
                            }
                            updateRegistration(15, rightArrowVisible);
                            if (rightArrowVisible != null) {
                                bool = rightArrowVisible.get();
                            } else {
                                bool = null;
                            }
                            zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                            j2 = 851968;
                        } else {
                            str7 = str7;
                            bool = null;
                            rightArrowVisible = null;
                            j2 = 851968;
                            zSafeUnbox6 = false;
                        }
                        if ((j & j2) != 0) {
                            if (userActivityViewModel != null) {
                                pace = userActivityViewModel.getPace();
                            } else {
                                pace = null;
                            }
                            updateRegistration(16, pace);
                            if (pace != null) {
                                str5 = pace.get();
                            }
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                j = j;
                            } else {
                                zSafeUnbox = false;
                            }
                            onClickListenerImpl2 = value3;
                            z3 = zSafeUnbox7;
                            z2 = zSafeUnbox8;
                            str = str12;
                            z = zSafeUnbox9;
                        } else {
                            bool = bool;
                            rightArrowVisible = rightArrowVisible;
                        }
                        str5 = null;
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            j = j;
                        } else {
                            zSafeUnbox = false;
                        }
                        onClickListenerImpl2 = value3;
                        z3 = zSafeUnbox7;
                        z2 = zSafeUnbox8;
                        str = str12;
                        z = zSafeUnbox9;
                    } else {
                        str6 = str6;
                    }
                    str7 = null;
                    if ((j & 819200) != 0) {
                        if (userActivityViewModel != null) {
                            rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                        } else {
                            rightArrowVisible = null;
                        }
                        updateRegistration(15, rightArrowVisible);
                        if (rightArrowVisible != null) {
                            bool = rightArrowVisible.get();
                        } else {
                            bool = null;
                        }
                        zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                        j2 = 851968;
                    } else {
                        str7 = str7;
                        bool = null;
                        rightArrowVisible = null;
                        j2 = 851968;
                        zSafeUnbox6 = false;
                    }
                    if ((j & j2) != 0) {
                        if (userActivityViewModel != null) {
                            pace = userActivityViewModel.getPace();
                        } else {
                            pace = null;
                        }
                        updateRegistration(16, pace);
                        if (pace != null) {
                            str5 = pace.get();
                        }
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            j = j;
                        } else {
                            zSafeUnbox = false;
                        }
                        onClickListenerImpl2 = value3;
                        z3 = zSafeUnbox7;
                        z2 = zSafeUnbox8;
                        str = str12;
                        z = zSafeUnbox9;
                    } else {
                        bool = bool;
                        rightArrowVisible = rightArrowVisible;
                    }
                    str5 = null;
                    if ((j & 917504) != 0) {
                        if (userActivityViewModel != null) {
                            hasHeartRates = userActivityViewModel.getHasHeartRates();
                        } else {
                            hasHeartRates = null;
                        }
                        updateRegistration(17, hasHeartRates);
                        zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                        j = j;
                    } else {
                        zSafeUnbox = false;
                    }
                    onClickListenerImpl2 = value3;
                    z3 = zSafeUnbox7;
                    z2 = zSafeUnbox8;
                    str = str12;
                    z = zSafeUnbox9;
                } else {
                    zSafeUnbox9 = zSafeUnbox9;
                }
                str6 = null;
                if ((j & 802816) != 0) {
                    if (userActivityViewModel != null) {
                        totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                    } else {
                        totalDescendedValue = null;
                    }
                    updateRegistration(14, totalDescendedValue);
                    if (totalDescendedValue != null) {
                        str7 = totalDescendedValue.get();
                    }
                    if ((j & 819200) != 0) {
                        if (userActivityViewModel != null) {
                            rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                        } else {
                            rightArrowVisible = null;
                        }
                        updateRegistration(15, rightArrowVisible);
                        if (rightArrowVisible != null) {
                            bool = rightArrowVisible.get();
                        } else {
                            bool = null;
                        }
                        zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                        j2 = 851968;
                    } else {
                        str7 = str7;
                        bool = null;
                        rightArrowVisible = null;
                        j2 = 851968;
                        zSafeUnbox6 = false;
                    }
                    if ((j & j2) != 0) {
                        if (userActivityViewModel != null) {
                            pace = userActivityViewModel.getPace();
                        } else {
                            pace = null;
                        }
                        updateRegistration(16, pace);
                        if (pace != null) {
                            str5 = pace.get();
                        }
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            j = j;
                        } else {
                            zSafeUnbox = false;
                        }
                        onClickListenerImpl2 = value3;
                        z3 = zSafeUnbox7;
                        z2 = zSafeUnbox8;
                        str = str12;
                        z = zSafeUnbox9;
                    } else {
                        bool = bool;
                        rightArrowVisible = rightArrowVisible;
                    }
                    str5 = null;
                    if ((j & 917504) != 0) {
                        if (userActivityViewModel != null) {
                            hasHeartRates = userActivityViewModel.getHasHeartRates();
                        } else {
                            hasHeartRates = null;
                        }
                        updateRegistration(17, hasHeartRates);
                        zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                        j = j;
                    } else {
                        zSafeUnbox = false;
                    }
                    onClickListenerImpl2 = value3;
                    z3 = zSafeUnbox7;
                    z2 = zSafeUnbox8;
                    str = str12;
                    z = zSafeUnbox9;
                } else {
                    str6 = str6;
                }
                str7 = null;
                if ((j & 819200) != 0) {
                    if (userActivityViewModel != null) {
                        rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                    } else {
                        rightArrowVisible = null;
                    }
                    updateRegistration(15, rightArrowVisible);
                    if (rightArrowVisible != null) {
                        bool = rightArrowVisible.get();
                    } else {
                        bool = null;
                    }
                    zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                    j2 = 851968;
                } else {
                    str7 = str7;
                    bool = null;
                    rightArrowVisible = null;
                    j2 = 851968;
                    zSafeUnbox6 = false;
                }
                if ((j & j2) != 0) {
                    if (userActivityViewModel != null) {
                        pace = userActivityViewModel.getPace();
                    } else {
                        pace = null;
                    }
                    updateRegistration(16, pace);
                    if (pace != null) {
                        str5 = pace.get();
                    }
                    if ((j & 917504) != 0) {
                        if (userActivityViewModel != null) {
                            hasHeartRates = userActivityViewModel.getHasHeartRates();
                        } else {
                            hasHeartRates = null;
                        }
                        updateRegistration(17, hasHeartRates);
                        zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                        j = j;
                    } else {
                        zSafeUnbox = false;
                    }
                    onClickListenerImpl2 = value3;
                    z3 = zSafeUnbox7;
                    z2 = zSafeUnbox8;
                    str = str12;
                    z = zSafeUnbox9;
                } else {
                    bool = bool;
                    rightArrowVisible = rightArrowVisible;
                }
                str5 = null;
                if ((j & 917504) != 0) {
                    if (userActivityViewModel != null) {
                        hasHeartRates = userActivityViewModel.getHasHeartRates();
                    } else {
                        hasHeartRates = null;
                    }
                    updateRegistration(17, hasHeartRates);
                    zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                    j = j;
                } else {
                    zSafeUnbox = false;
                }
                onClickListenerImpl2 = value3;
                z3 = zSafeUnbox7;
                z2 = zSafeUnbox8;
                str = str12;
                z = zSafeUnbox9;
            } else {
                zSafeUnbox3 = zSafeUnbox3;
            }
            str9 = null;
            if ((j & 786688) != 0) {
                if (userActivityViewModel != null) {
                    avgHeartRate = userActivityViewModel.getAvgHeartRate();
                } else {
                    avgHeartRate = null;
                }
                updateRegistration(8, avgHeartRate);
                if (avgHeartRate != null) {
                    str3 = avgHeartRate.get();
                }
                if ((j & 786944) != 0) {
                    if (userActivityViewModel != null) {
                        noSessions = userActivityViewModel.getNoSessions();
                    } else {
                        noSessions = null;
                    }
                    updateRegistration(9, noSessions);
                    if (noSessions != null) {
                        bool3 = noSessions.get();
                    } else {
                        bool3 = null;
                    }
                    zSafeUnbox2 = androidx.databinding.ViewDataBinding.safeUnbox(bool3);
                    zSafeUnbox5 = androidx.databinding.ViewDataBinding.safeUnbox(java.lang.Boolean.valueOf(!zSafeUnbox2));
                } else {
                    str3 = str3;
                    zSafeUnbox2 = false;
                    zSafeUnbox5 = false;
                }
                if ((j & 787456) != 0) {
                    if (userActivityViewModel != null) {
                        subtitleField = userActivityViewModel.getSubtitleField();
                    } else {
                        subtitleField = null;
                    }
                    updateRegistration(10, subtitleField);
                    if (subtitleField != null) {
                        str11 = subtitleField.get();
                    }
                    if ((j & 788480) != 0) {
                        if (userActivityViewModel != null) {
                            paceTitle = userActivityViewModel.getPaceTitle();
                        } else {
                            paceTitle = null;
                        }
                        updateRegistration(11, paceTitle);
                        if (paceTitle != null) {
                            str10 = paceTitle.get();
                        }
                        if ((j & 790528) != 0) {
                            if (userActivityViewModel != null) {
                                hasLocations = userActivityViewModel.getHasLocations();
                            } else {
                                hasLocations = null;
                            }
                            updateRegistration(12, hasLocations);
                            if (hasLocations != null) {
                                bool2 = hasLocations.get();
                            } else {
                                bool2 = null;
                            }
                            zSafeUnbox9 = androidx.databinding.ViewDataBinding.safeUnbox(bool2);
                        } else {
                            str10 = str10;
                            zSafeUnbox9 = false;
                        }
                        if ((j & 794624) != 0) {
                            if (userActivityViewModel != null) {
                                totalAscendedValue = userActivityViewModel.getTotalAscendedValue();
                            } else {
                                totalAscendedValue = null;
                            }
                            updateRegistration(13, totalAscendedValue);
                            if (totalAscendedValue != null) {
                                str6 = totalAscendedValue.get();
                            }
                            if ((j & 802816) != 0) {
                                if (userActivityViewModel != null) {
                                    totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                                } else {
                                    totalDescendedValue = null;
                                }
                                updateRegistration(14, totalDescendedValue);
                                if (totalDescendedValue != null) {
                                    str7 = totalDescendedValue.get();
                                }
                                if ((j & 819200) != 0) {
                                    if (userActivityViewModel != null) {
                                        rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                                    } else {
                                        rightArrowVisible = null;
                                    }
                                    updateRegistration(15, rightArrowVisible);
                                    if (rightArrowVisible != null) {
                                        bool = rightArrowVisible.get();
                                    } else {
                                        bool = null;
                                    }
                                    zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                                    j2 = 851968;
                                } else {
                                    str7 = str7;
                                    bool = null;
                                    rightArrowVisible = null;
                                    j2 = 851968;
                                    zSafeUnbox6 = false;
                                }
                                if ((j & j2) != 0) {
                                    if (userActivityViewModel != null) {
                                        pace = userActivityViewModel.getPace();
                                    } else {
                                        pace = null;
                                    }
                                    updateRegistration(16, pace);
                                    if (pace != null) {
                                        str5 = pace.get();
                                    }
                                    if ((j & 917504) != 0) {
                                        if (userActivityViewModel != null) {
                                            hasHeartRates = userActivityViewModel.getHasHeartRates();
                                        } else {
                                            hasHeartRates = null;
                                        }
                                        updateRegistration(17, hasHeartRates);
                                        zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                        j = j;
                                    } else {
                                        zSafeUnbox = false;
                                    }
                                    onClickListenerImpl2 = value3;
                                    z3 = zSafeUnbox7;
                                    z2 = zSafeUnbox8;
                                    str = str12;
                                    z = zSafeUnbox9;
                                } else {
                                    bool = bool;
                                    rightArrowVisible = rightArrowVisible;
                                }
                                str5 = null;
                                if ((j & 917504) != 0) {
                                    if (userActivityViewModel != null) {
                                        hasHeartRates = userActivityViewModel.getHasHeartRates();
                                    } else {
                                        hasHeartRates = null;
                                    }
                                    updateRegistration(17, hasHeartRates);
                                    zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                    j = j;
                                } else {
                                    zSafeUnbox = false;
                                }
                                onClickListenerImpl2 = value3;
                                z3 = zSafeUnbox7;
                                z2 = zSafeUnbox8;
                                str = str12;
                                z = zSafeUnbox9;
                            } else {
                                str6 = str6;
                            }
                            str7 = null;
                            if ((j & 819200) != 0) {
                                if (userActivityViewModel != null) {
                                    rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                                } else {
                                    rightArrowVisible = null;
                                }
                                updateRegistration(15, rightArrowVisible);
                                if (rightArrowVisible != null) {
                                    bool = rightArrowVisible.get();
                                } else {
                                    bool = null;
                                }
                                zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                                j2 = 851968;
                            } else {
                                str7 = str7;
                                bool = null;
                                rightArrowVisible = null;
                                j2 = 851968;
                                zSafeUnbox6 = false;
                            }
                            if ((j & j2) != 0) {
                                if (userActivityViewModel != null) {
                                    pace = userActivityViewModel.getPace();
                                } else {
                                    pace = null;
                                }
                                updateRegistration(16, pace);
                                if (pace != null) {
                                    str5 = pace.get();
                                }
                                if ((j & 917504) != 0) {
                                    if (userActivityViewModel != null) {
                                        hasHeartRates = userActivityViewModel.getHasHeartRates();
                                    } else {
                                        hasHeartRates = null;
                                    }
                                    updateRegistration(17, hasHeartRates);
                                    zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                    j = j;
                                } else {
                                    zSafeUnbox = false;
                                }
                                onClickListenerImpl2 = value3;
                                z3 = zSafeUnbox7;
                                z2 = zSafeUnbox8;
                                str = str12;
                                z = zSafeUnbox9;
                            } else {
                                bool = bool;
                                rightArrowVisible = rightArrowVisible;
                            }
                            str5 = null;
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                j = j;
                            } else {
                                zSafeUnbox = false;
                            }
                            onClickListenerImpl2 = value3;
                            z3 = zSafeUnbox7;
                            z2 = zSafeUnbox8;
                            str = str12;
                            z = zSafeUnbox9;
                        } else {
                            zSafeUnbox9 = zSafeUnbox9;
                        }
                        str6 = null;
                        if ((j & 802816) != 0) {
                            if (userActivityViewModel != null) {
                                totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                            } else {
                                totalDescendedValue = null;
                            }
                            updateRegistration(14, totalDescendedValue);
                            if (totalDescendedValue != null) {
                                str7 = totalDescendedValue.get();
                            }
                            if ((j & 819200) != 0) {
                                if (userActivityViewModel != null) {
                                    rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                                } else {
                                    rightArrowVisible = null;
                                }
                                updateRegistration(15, rightArrowVisible);
                                if (rightArrowVisible != null) {
                                    bool = rightArrowVisible.get();
                                } else {
                                    bool = null;
                                }
                                zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                                j2 = 851968;
                            } else {
                                str7 = str7;
                                bool = null;
                                rightArrowVisible = null;
                                j2 = 851968;
                                zSafeUnbox6 = false;
                            }
                            if ((j & j2) != 0) {
                                if (userActivityViewModel != null) {
                                    pace = userActivityViewModel.getPace();
                                } else {
                                    pace = null;
                                }
                                updateRegistration(16, pace);
                                if (pace != null) {
                                    str5 = pace.get();
                                }
                                if ((j & 917504) != 0) {
                                    if (userActivityViewModel != null) {
                                        hasHeartRates = userActivityViewModel.getHasHeartRates();
                                    } else {
                                        hasHeartRates = null;
                                    }
                                    updateRegistration(17, hasHeartRates);
                                    zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                    j = j;
                                } else {
                                    zSafeUnbox = false;
                                }
                                onClickListenerImpl2 = value3;
                                z3 = zSafeUnbox7;
                                z2 = zSafeUnbox8;
                                str = str12;
                                z = zSafeUnbox9;
                            } else {
                                bool = bool;
                                rightArrowVisible = rightArrowVisible;
                            }
                            str5 = null;
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                j = j;
                            } else {
                                zSafeUnbox = false;
                            }
                            onClickListenerImpl2 = value3;
                            z3 = zSafeUnbox7;
                            z2 = zSafeUnbox8;
                            str = str12;
                            z = zSafeUnbox9;
                        } else {
                            str6 = str6;
                        }
                        str7 = null;
                        if ((j & 819200) != 0) {
                            if (userActivityViewModel != null) {
                                rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                            } else {
                                rightArrowVisible = null;
                            }
                            updateRegistration(15, rightArrowVisible);
                            if (rightArrowVisible != null) {
                                bool = rightArrowVisible.get();
                            } else {
                                bool = null;
                            }
                            zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                            j2 = 851968;
                        } else {
                            str7 = str7;
                            bool = null;
                            rightArrowVisible = null;
                            j2 = 851968;
                            zSafeUnbox6 = false;
                        }
                        if ((j & j2) != 0) {
                            if (userActivityViewModel != null) {
                                pace = userActivityViewModel.getPace();
                            } else {
                                pace = null;
                            }
                            updateRegistration(16, pace);
                            if (pace != null) {
                                str5 = pace.get();
                            }
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                j = j;
                            } else {
                                zSafeUnbox = false;
                            }
                            onClickListenerImpl2 = value3;
                            z3 = zSafeUnbox7;
                            z2 = zSafeUnbox8;
                            str = str12;
                            z = zSafeUnbox9;
                        } else {
                            bool = bool;
                            rightArrowVisible = rightArrowVisible;
                        }
                        str5 = null;
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            j = j;
                        } else {
                            zSafeUnbox = false;
                        }
                        onClickListenerImpl2 = value3;
                        z3 = zSafeUnbox7;
                        z2 = zSafeUnbox8;
                        str = str12;
                        z = zSafeUnbox9;
                    } else {
                        str11 = str11;
                    }
                    str10 = null;
                    if ((j & 790528) != 0) {
                        if (userActivityViewModel != null) {
                            hasLocations = userActivityViewModel.getHasLocations();
                        } else {
                            hasLocations = null;
                        }
                        updateRegistration(12, hasLocations);
                        if (hasLocations != null) {
                            bool2 = hasLocations.get();
                        } else {
                            bool2 = null;
                        }
                        zSafeUnbox9 = androidx.databinding.ViewDataBinding.safeUnbox(bool2);
                    } else {
                        str10 = str10;
                        zSafeUnbox9 = false;
                    }
                    if ((j & 794624) != 0) {
                        if (userActivityViewModel != null) {
                            totalAscendedValue = userActivityViewModel.getTotalAscendedValue();
                        } else {
                            totalAscendedValue = null;
                        }
                        updateRegistration(13, totalAscendedValue);
                        if (totalAscendedValue != null) {
                            str6 = totalAscendedValue.get();
                        }
                        if ((j & 802816) != 0) {
                            if (userActivityViewModel != null) {
                                totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                            } else {
                                totalDescendedValue = null;
                            }
                            updateRegistration(14, totalDescendedValue);
                            if (totalDescendedValue != null) {
                                str7 = totalDescendedValue.get();
                            }
                            if ((j & 819200) != 0) {
                                if (userActivityViewModel != null) {
                                    rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                                } else {
                                    rightArrowVisible = null;
                                }
                                updateRegistration(15, rightArrowVisible);
                                if (rightArrowVisible != null) {
                                    bool = rightArrowVisible.get();
                                } else {
                                    bool = null;
                                }
                                zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                                j2 = 851968;
                            } else {
                                str7 = str7;
                                bool = null;
                                rightArrowVisible = null;
                                j2 = 851968;
                                zSafeUnbox6 = false;
                            }
                            if ((j & j2) != 0) {
                                if (userActivityViewModel != null) {
                                    pace = userActivityViewModel.getPace();
                                } else {
                                    pace = null;
                                }
                                updateRegistration(16, pace);
                                if (pace != null) {
                                    str5 = pace.get();
                                }
                                if ((j & 917504) != 0) {
                                    if (userActivityViewModel != null) {
                                        hasHeartRates = userActivityViewModel.getHasHeartRates();
                                    } else {
                                        hasHeartRates = null;
                                    }
                                    updateRegistration(17, hasHeartRates);
                                    zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                    j = j;
                                } else {
                                    zSafeUnbox = false;
                                }
                                onClickListenerImpl2 = value3;
                                z3 = zSafeUnbox7;
                                z2 = zSafeUnbox8;
                                str = str12;
                                z = zSafeUnbox9;
                            } else {
                                bool = bool;
                                rightArrowVisible = rightArrowVisible;
                            }
                            str5 = null;
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                j = j;
                            } else {
                                zSafeUnbox = false;
                            }
                            onClickListenerImpl2 = value3;
                            z3 = zSafeUnbox7;
                            z2 = zSafeUnbox8;
                            str = str12;
                            z = zSafeUnbox9;
                        } else {
                            str6 = str6;
                        }
                        str7 = null;
                        if ((j & 819200) != 0) {
                            if (userActivityViewModel != null) {
                                rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                            } else {
                                rightArrowVisible = null;
                            }
                            updateRegistration(15, rightArrowVisible);
                            if (rightArrowVisible != null) {
                                bool = rightArrowVisible.get();
                            } else {
                                bool = null;
                            }
                            zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                            j2 = 851968;
                        } else {
                            str7 = str7;
                            bool = null;
                            rightArrowVisible = null;
                            j2 = 851968;
                            zSafeUnbox6 = false;
                        }
                        if ((j & j2) != 0) {
                            if (userActivityViewModel != null) {
                                pace = userActivityViewModel.getPace();
                            } else {
                                pace = null;
                            }
                            updateRegistration(16, pace);
                            if (pace != null) {
                                str5 = pace.get();
                            }
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                j = j;
                            } else {
                                zSafeUnbox = false;
                            }
                            onClickListenerImpl2 = value3;
                            z3 = zSafeUnbox7;
                            z2 = zSafeUnbox8;
                            str = str12;
                            z = zSafeUnbox9;
                        } else {
                            bool = bool;
                            rightArrowVisible = rightArrowVisible;
                        }
                        str5 = null;
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            j = j;
                        } else {
                            zSafeUnbox = false;
                        }
                        onClickListenerImpl2 = value3;
                        z3 = zSafeUnbox7;
                        z2 = zSafeUnbox8;
                        str = str12;
                        z = zSafeUnbox9;
                    } else {
                        zSafeUnbox9 = zSafeUnbox9;
                    }
                    str6 = null;
                    if ((j & 802816) != 0) {
                        if (userActivityViewModel != null) {
                            totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                        } else {
                            totalDescendedValue = null;
                        }
                        updateRegistration(14, totalDescendedValue);
                        if (totalDescendedValue != null) {
                            str7 = totalDescendedValue.get();
                        }
                        if ((j & 819200) != 0) {
                            if (userActivityViewModel != null) {
                                rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                            } else {
                                rightArrowVisible = null;
                            }
                            updateRegistration(15, rightArrowVisible);
                            if (rightArrowVisible != null) {
                                bool = rightArrowVisible.get();
                            } else {
                                bool = null;
                            }
                            zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                            j2 = 851968;
                        } else {
                            str7 = str7;
                            bool = null;
                            rightArrowVisible = null;
                            j2 = 851968;
                            zSafeUnbox6 = false;
                        }
                        if ((j & j2) != 0) {
                            if (userActivityViewModel != null) {
                                pace = userActivityViewModel.getPace();
                            } else {
                                pace = null;
                            }
                            updateRegistration(16, pace);
                            if (pace != null) {
                                str5 = pace.get();
                            }
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                j = j;
                            } else {
                                zSafeUnbox = false;
                            }
                            onClickListenerImpl2 = value3;
                            z3 = zSafeUnbox7;
                            z2 = zSafeUnbox8;
                            str = str12;
                            z = zSafeUnbox9;
                        } else {
                            bool = bool;
                            rightArrowVisible = rightArrowVisible;
                        }
                        str5 = null;
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            j = j;
                        } else {
                            zSafeUnbox = false;
                        }
                        onClickListenerImpl2 = value3;
                        z3 = zSafeUnbox7;
                        z2 = zSafeUnbox8;
                        str = str12;
                        z = zSafeUnbox9;
                    } else {
                        str6 = str6;
                    }
                    str7 = null;
                    if ((j & 819200) != 0) {
                        if (userActivityViewModel != null) {
                            rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                        } else {
                            rightArrowVisible = null;
                        }
                        updateRegistration(15, rightArrowVisible);
                        if (rightArrowVisible != null) {
                            bool = rightArrowVisible.get();
                        } else {
                            bool = null;
                        }
                        zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                        j2 = 851968;
                    } else {
                        str7 = str7;
                        bool = null;
                        rightArrowVisible = null;
                        j2 = 851968;
                        zSafeUnbox6 = false;
                    }
                    if ((j & j2) != 0) {
                        if (userActivityViewModel != null) {
                            pace = userActivityViewModel.getPace();
                        } else {
                            pace = null;
                        }
                        updateRegistration(16, pace);
                        if (pace != null) {
                            str5 = pace.get();
                        }
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            j = j;
                        } else {
                            zSafeUnbox = false;
                        }
                        onClickListenerImpl2 = value3;
                        z3 = zSafeUnbox7;
                        z2 = zSafeUnbox8;
                        str = str12;
                        z = zSafeUnbox9;
                    } else {
                        bool = bool;
                        rightArrowVisible = rightArrowVisible;
                    }
                    str5 = null;
                    if ((j & 917504) != 0) {
                        if (userActivityViewModel != null) {
                            hasHeartRates = userActivityViewModel.getHasHeartRates();
                        } else {
                            hasHeartRates = null;
                        }
                        updateRegistration(17, hasHeartRates);
                        zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                        j = j;
                    } else {
                        zSafeUnbox = false;
                    }
                    onClickListenerImpl2 = value3;
                    z3 = zSafeUnbox7;
                    z2 = zSafeUnbox8;
                    str = str12;
                    z = zSafeUnbox9;
                } else {
                    zSafeUnbox2 = zSafeUnbox2;
                    zSafeUnbox8 = zSafeUnbox8;
                }
                str11 = null;
                if ((j & 788480) != 0) {
                    if (userActivityViewModel != null) {
                        paceTitle = userActivityViewModel.getPaceTitle();
                    } else {
                        paceTitle = null;
                    }
                    updateRegistration(11, paceTitle);
                    if (paceTitle != null) {
                        str10 = paceTitle.get();
                    }
                    if ((j & 790528) != 0) {
                        if (userActivityViewModel != null) {
                            hasLocations = userActivityViewModel.getHasLocations();
                        } else {
                            hasLocations = null;
                        }
                        updateRegistration(12, hasLocations);
                        if (hasLocations != null) {
                            bool2 = hasLocations.get();
                        } else {
                            bool2 = null;
                        }
                        zSafeUnbox9 = androidx.databinding.ViewDataBinding.safeUnbox(bool2);
                    } else {
                        str10 = str10;
                        zSafeUnbox9 = false;
                    }
                    if ((j & 794624) != 0) {
                        if (userActivityViewModel != null) {
                            totalAscendedValue = userActivityViewModel.getTotalAscendedValue();
                        } else {
                            totalAscendedValue = null;
                        }
                        updateRegistration(13, totalAscendedValue);
                        if (totalAscendedValue != null) {
                            str6 = totalAscendedValue.get();
                        }
                        if ((j & 802816) != 0) {
                            if (userActivityViewModel != null) {
                                totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                            } else {
                                totalDescendedValue = null;
                            }
                            updateRegistration(14, totalDescendedValue);
                            if (totalDescendedValue != null) {
                                str7 = totalDescendedValue.get();
                            }
                            if ((j & 819200) != 0) {
                                if (userActivityViewModel != null) {
                                    rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                                } else {
                                    rightArrowVisible = null;
                                }
                                updateRegistration(15, rightArrowVisible);
                                if (rightArrowVisible != null) {
                                    bool = rightArrowVisible.get();
                                } else {
                                    bool = null;
                                }
                                zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                                j2 = 851968;
                            } else {
                                str7 = str7;
                                bool = null;
                                rightArrowVisible = null;
                                j2 = 851968;
                                zSafeUnbox6 = false;
                            }
                            if ((j & j2) != 0) {
                                if (userActivityViewModel != null) {
                                    pace = userActivityViewModel.getPace();
                                } else {
                                    pace = null;
                                }
                                updateRegistration(16, pace);
                                if (pace != null) {
                                    str5 = pace.get();
                                }
                                if ((j & 917504) != 0) {
                                    if (userActivityViewModel != null) {
                                        hasHeartRates = userActivityViewModel.getHasHeartRates();
                                    } else {
                                        hasHeartRates = null;
                                    }
                                    updateRegistration(17, hasHeartRates);
                                    zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                    j = j;
                                } else {
                                    zSafeUnbox = false;
                                }
                                onClickListenerImpl2 = value3;
                                z3 = zSafeUnbox7;
                                z2 = zSafeUnbox8;
                                str = str12;
                                z = zSafeUnbox9;
                            } else {
                                bool = bool;
                                rightArrowVisible = rightArrowVisible;
                            }
                            str5 = null;
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                j = j;
                            } else {
                                zSafeUnbox = false;
                            }
                            onClickListenerImpl2 = value3;
                            z3 = zSafeUnbox7;
                            z2 = zSafeUnbox8;
                            str = str12;
                            z = zSafeUnbox9;
                        } else {
                            str6 = str6;
                        }
                        str7 = null;
                        if ((j & 819200) != 0) {
                            if (userActivityViewModel != null) {
                                rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                            } else {
                                rightArrowVisible = null;
                            }
                            updateRegistration(15, rightArrowVisible);
                            if (rightArrowVisible != null) {
                                bool = rightArrowVisible.get();
                            } else {
                                bool = null;
                            }
                            zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                            j2 = 851968;
                        } else {
                            str7 = str7;
                            bool = null;
                            rightArrowVisible = null;
                            j2 = 851968;
                            zSafeUnbox6 = false;
                        }
                        if ((j & j2) != 0) {
                            if (userActivityViewModel != null) {
                                pace = userActivityViewModel.getPace();
                            } else {
                                pace = null;
                            }
                            updateRegistration(16, pace);
                            if (pace != null) {
                                str5 = pace.get();
                            }
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                j = j;
                            } else {
                                zSafeUnbox = false;
                            }
                            onClickListenerImpl2 = value3;
                            z3 = zSafeUnbox7;
                            z2 = zSafeUnbox8;
                            str = str12;
                            z = zSafeUnbox9;
                        } else {
                            bool = bool;
                            rightArrowVisible = rightArrowVisible;
                        }
                        str5 = null;
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            j = j;
                        } else {
                            zSafeUnbox = false;
                        }
                        onClickListenerImpl2 = value3;
                        z3 = zSafeUnbox7;
                        z2 = zSafeUnbox8;
                        str = str12;
                        z = zSafeUnbox9;
                    } else {
                        zSafeUnbox9 = zSafeUnbox9;
                    }
                    str6 = null;
                    if ((j & 802816) != 0) {
                        if (userActivityViewModel != null) {
                            totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                        } else {
                            totalDescendedValue = null;
                        }
                        updateRegistration(14, totalDescendedValue);
                        if (totalDescendedValue != null) {
                            str7 = totalDescendedValue.get();
                        }
                        if ((j & 819200) != 0) {
                            if (userActivityViewModel != null) {
                                rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                            } else {
                                rightArrowVisible = null;
                            }
                            updateRegistration(15, rightArrowVisible);
                            if (rightArrowVisible != null) {
                                bool = rightArrowVisible.get();
                            } else {
                                bool = null;
                            }
                            zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                            j2 = 851968;
                        } else {
                            str7 = str7;
                            bool = null;
                            rightArrowVisible = null;
                            j2 = 851968;
                            zSafeUnbox6 = false;
                        }
                        if ((j & j2) != 0) {
                            if (userActivityViewModel != null) {
                                pace = userActivityViewModel.getPace();
                            } else {
                                pace = null;
                            }
                            updateRegistration(16, pace);
                            if (pace != null) {
                                str5 = pace.get();
                            }
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                j = j;
                            } else {
                                zSafeUnbox = false;
                            }
                            onClickListenerImpl2 = value3;
                            z3 = zSafeUnbox7;
                            z2 = zSafeUnbox8;
                            str = str12;
                            z = zSafeUnbox9;
                        } else {
                            bool = bool;
                            rightArrowVisible = rightArrowVisible;
                        }
                        str5 = null;
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            j = j;
                        } else {
                            zSafeUnbox = false;
                        }
                        onClickListenerImpl2 = value3;
                        z3 = zSafeUnbox7;
                        z2 = zSafeUnbox8;
                        str = str12;
                        z = zSafeUnbox9;
                    } else {
                        str6 = str6;
                    }
                    str7 = null;
                    if ((j & 819200) != 0) {
                        if (userActivityViewModel != null) {
                            rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                        } else {
                            rightArrowVisible = null;
                        }
                        updateRegistration(15, rightArrowVisible);
                        if (rightArrowVisible != null) {
                            bool = rightArrowVisible.get();
                        } else {
                            bool = null;
                        }
                        zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                        j2 = 851968;
                    } else {
                        str7 = str7;
                        bool = null;
                        rightArrowVisible = null;
                        j2 = 851968;
                        zSafeUnbox6 = false;
                    }
                    if ((j & j2) != 0) {
                        if (userActivityViewModel != null) {
                            pace = userActivityViewModel.getPace();
                        } else {
                            pace = null;
                        }
                        updateRegistration(16, pace);
                        if (pace != null) {
                            str5 = pace.get();
                        }
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            j = j;
                        } else {
                            zSafeUnbox = false;
                        }
                        onClickListenerImpl2 = value3;
                        z3 = zSafeUnbox7;
                        z2 = zSafeUnbox8;
                        str = str12;
                        z = zSafeUnbox9;
                    } else {
                        bool = bool;
                        rightArrowVisible = rightArrowVisible;
                    }
                    str5 = null;
                    if ((j & 917504) != 0) {
                        if (userActivityViewModel != null) {
                            hasHeartRates = userActivityViewModel.getHasHeartRates();
                        } else {
                            hasHeartRates = null;
                        }
                        updateRegistration(17, hasHeartRates);
                        zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                        j = j;
                    } else {
                        zSafeUnbox = false;
                    }
                    onClickListenerImpl2 = value3;
                    z3 = zSafeUnbox7;
                    z2 = zSafeUnbox8;
                    str = str12;
                    z = zSafeUnbox9;
                } else {
                    str11 = str11;
                }
                str10 = null;
                if ((j & 790528) != 0) {
                    if (userActivityViewModel != null) {
                        hasLocations = userActivityViewModel.getHasLocations();
                    } else {
                        hasLocations = null;
                    }
                    updateRegistration(12, hasLocations);
                    if (hasLocations != null) {
                        bool2 = hasLocations.get();
                    } else {
                        bool2 = null;
                    }
                    zSafeUnbox9 = androidx.databinding.ViewDataBinding.safeUnbox(bool2);
                } else {
                    str10 = str10;
                    zSafeUnbox9 = false;
                }
                if ((j & 794624) != 0) {
                    if (userActivityViewModel != null) {
                        totalAscendedValue = userActivityViewModel.getTotalAscendedValue();
                    } else {
                        totalAscendedValue = null;
                    }
                    updateRegistration(13, totalAscendedValue);
                    if (totalAscendedValue != null) {
                        str6 = totalAscendedValue.get();
                    }
                    if ((j & 802816) != 0) {
                        if (userActivityViewModel != null) {
                            totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                        } else {
                            totalDescendedValue = null;
                        }
                        updateRegistration(14, totalDescendedValue);
                        if (totalDescendedValue != null) {
                            str7 = totalDescendedValue.get();
                        }
                        if ((j & 819200) != 0) {
                            if (userActivityViewModel != null) {
                                rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                            } else {
                                rightArrowVisible = null;
                            }
                            updateRegistration(15, rightArrowVisible);
                            if (rightArrowVisible != null) {
                                bool = rightArrowVisible.get();
                            } else {
                                bool = null;
                            }
                            zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                            j2 = 851968;
                        } else {
                            str7 = str7;
                            bool = null;
                            rightArrowVisible = null;
                            j2 = 851968;
                            zSafeUnbox6 = false;
                        }
                        if ((j & j2) != 0) {
                            if (userActivityViewModel != null) {
                                pace = userActivityViewModel.getPace();
                            } else {
                                pace = null;
                            }
                            updateRegistration(16, pace);
                            if (pace != null) {
                                str5 = pace.get();
                            }
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                j = j;
                            } else {
                                zSafeUnbox = false;
                            }
                            onClickListenerImpl2 = value3;
                            z3 = zSafeUnbox7;
                            z2 = zSafeUnbox8;
                            str = str12;
                            z = zSafeUnbox9;
                        } else {
                            bool = bool;
                            rightArrowVisible = rightArrowVisible;
                        }
                        str5 = null;
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            j = j;
                        } else {
                            zSafeUnbox = false;
                        }
                        onClickListenerImpl2 = value3;
                        z3 = zSafeUnbox7;
                        z2 = zSafeUnbox8;
                        str = str12;
                        z = zSafeUnbox9;
                    } else {
                        str6 = str6;
                    }
                    str7 = null;
                    if ((j & 819200) != 0) {
                        if (userActivityViewModel != null) {
                            rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                        } else {
                            rightArrowVisible = null;
                        }
                        updateRegistration(15, rightArrowVisible);
                        if (rightArrowVisible != null) {
                            bool = rightArrowVisible.get();
                        } else {
                            bool = null;
                        }
                        zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                        j2 = 851968;
                    } else {
                        str7 = str7;
                        bool = null;
                        rightArrowVisible = null;
                        j2 = 851968;
                        zSafeUnbox6 = false;
                    }
                    if ((j & j2) != 0) {
                        if (userActivityViewModel != null) {
                            pace = userActivityViewModel.getPace();
                        } else {
                            pace = null;
                        }
                        updateRegistration(16, pace);
                        if (pace != null) {
                            str5 = pace.get();
                        }
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            j = j;
                        } else {
                            zSafeUnbox = false;
                        }
                        onClickListenerImpl2 = value3;
                        z3 = zSafeUnbox7;
                        z2 = zSafeUnbox8;
                        str = str12;
                        z = zSafeUnbox9;
                    } else {
                        bool = bool;
                        rightArrowVisible = rightArrowVisible;
                    }
                    str5 = null;
                    if ((j & 917504) != 0) {
                        if (userActivityViewModel != null) {
                            hasHeartRates = userActivityViewModel.getHasHeartRates();
                        } else {
                            hasHeartRates = null;
                        }
                        updateRegistration(17, hasHeartRates);
                        zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                        j = j;
                    } else {
                        zSafeUnbox = false;
                    }
                    onClickListenerImpl2 = value3;
                    z3 = zSafeUnbox7;
                    z2 = zSafeUnbox8;
                    str = str12;
                    z = zSafeUnbox9;
                } else {
                    zSafeUnbox9 = zSafeUnbox9;
                }
                str6 = null;
                if ((j & 802816) != 0) {
                    if (userActivityViewModel != null) {
                        totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                    } else {
                        totalDescendedValue = null;
                    }
                    updateRegistration(14, totalDescendedValue);
                    if (totalDescendedValue != null) {
                        str7 = totalDescendedValue.get();
                    }
                    if ((j & 819200) != 0) {
                        if (userActivityViewModel != null) {
                            rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                        } else {
                            rightArrowVisible = null;
                        }
                        updateRegistration(15, rightArrowVisible);
                        if (rightArrowVisible != null) {
                            bool = rightArrowVisible.get();
                        } else {
                            bool = null;
                        }
                        zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                        j2 = 851968;
                    } else {
                        str7 = str7;
                        bool = null;
                        rightArrowVisible = null;
                        j2 = 851968;
                        zSafeUnbox6 = false;
                    }
                    if ((j & j2) != 0) {
                        if (userActivityViewModel != null) {
                            pace = userActivityViewModel.getPace();
                        } else {
                            pace = null;
                        }
                        updateRegistration(16, pace);
                        if (pace != null) {
                            str5 = pace.get();
                        }
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            j = j;
                        } else {
                            zSafeUnbox = false;
                        }
                        onClickListenerImpl2 = value3;
                        z3 = zSafeUnbox7;
                        z2 = zSafeUnbox8;
                        str = str12;
                        z = zSafeUnbox9;
                    } else {
                        bool = bool;
                        rightArrowVisible = rightArrowVisible;
                    }
                    str5 = null;
                    if ((j & 917504) != 0) {
                        if (userActivityViewModel != null) {
                            hasHeartRates = userActivityViewModel.getHasHeartRates();
                        } else {
                            hasHeartRates = null;
                        }
                        updateRegistration(17, hasHeartRates);
                        zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                        j = j;
                    } else {
                        zSafeUnbox = false;
                    }
                    onClickListenerImpl2 = value3;
                    z3 = zSafeUnbox7;
                    z2 = zSafeUnbox8;
                    str = str12;
                    z = zSafeUnbox9;
                } else {
                    str6 = str6;
                }
                str7 = null;
                if ((j & 819200) != 0) {
                    if (userActivityViewModel != null) {
                        rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                    } else {
                        rightArrowVisible = null;
                    }
                    updateRegistration(15, rightArrowVisible);
                    if (rightArrowVisible != null) {
                        bool = rightArrowVisible.get();
                    } else {
                        bool = null;
                    }
                    zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                    j2 = 851968;
                } else {
                    str7 = str7;
                    bool = null;
                    rightArrowVisible = null;
                    j2 = 851968;
                    zSafeUnbox6 = false;
                }
                if ((j & j2) != 0) {
                    if (userActivityViewModel != null) {
                        pace = userActivityViewModel.getPace();
                    } else {
                        pace = null;
                    }
                    updateRegistration(16, pace);
                    if (pace != null) {
                        str5 = pace.get();
                    }
                    if ((j & 917504) != 0) {
                        if (userActivityViewModel != null) {
                            hasHeartRates = userActivityViewModel.getHasHeartRates();
                        } else {
                            hasHeartRates = null;
                        }
                        updateRegistration(17, hasHeartRates);
                        zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                        j = j;
                    } else {
                        zSafeUnbox = false;
                    }
                    onClickListenerImpl2 = value3;
                    z3 = zSafeUnbox7;
                    z2 = zSafeUnbox8;
                    str = str12;
                    z = zSafeUnbox9;
                } else {
                    bool = bool;
                    rightArrowVisible = rightArrowVisible;
                }
                str5 = null;
                if ((j & 917504) != 0) {
                    if (userActivityViewModel != null) {
                        hasHeartRates = userActivityViewModel.getHasHeartRates();
                    } else {
                        hasHeartRates = null;
                    }
                    updateRegistration(17, hasHeartRates);
                    zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                    j = j;
                } else {
                    zSafeUnbox = false;
                }
                onClickListenerImpl2 = value3;
                z3 = zSafeUnbox7;
                z2 = zSafeUnbox8;
                str = str12;
                z = zSafeUnbox9;
            } else {
                str9 = str9;
            }
            str3 = null;
            if ((j & 786944) != 0) {
                if (userActivityViewModel != null) {
                    noSessions = userActivityViewModel.getNoSessions();
                } else {
                    noSessions = null;
                }
                updateRegistration(9, noSessions);
                if (noSessions != null) {
                    bool3 = noSessions.get();
                } else {
                    bool3 = null;
                }
                zSafeUnbox2 = androidx.databinding.ViewDataBinding.safeUnbox(bool3);
                zSafeUnbox5 = androidx.databinding.ViewDataBinding.safeUnbox(java.lang.Boolean.valueOf(!zSafeUnbox2));
            } else {
                str3 = str3;
                zSafeUnbox2 = false;
                zSafeUnbox5 = false;
            }
            if ((j & 787456) != 0) {
                if (userActivityViewModel != null) {
                    subtitleField = userActivityViewModel.getSubtitleField();
                } else {
                    subtitleField = null;
                }
                updateRegistration(10, subtitleField);
                if (subtitleField != null) {
                    str11 = subtitleField.get();
                }
                if ((j & 788480) != 0) {
                    if (userActivityViewModel != null) {
                        paceTitle = userActivityViewModel.getPaceTitle();
                    } else {
                        paceTitle = null;
                    }
                    updateRegistration(11, paceTitle);
                    if (paceTitle != null) {
                        str10 = paceTitle.get();
                    }
                    if ((j & 790528) != 0) {
                        if (userActivityViewModel != null) {
                            hasLocations = userActivityViewModel.getHasLocations();
                        } else {
                            hasLocations = null;
                        }
                        updateRegistration(12, hasLocations);
                        if (hasLocations != null) {
                            bool2 = hasLocations.get();
                        } else {
                            bool2 = null;
                        }
                        zSafeUnbox9 = androidx.databinding.ViewDataBinding.safeUnbox(bool2);
                    } else {
                        str10 = str10;
                        zSafeUnbox9 = false;
                    }
                    if ((j & 794624) != 0) {
                        if (userActivityViewModel != null) {
                            totalAscendedValue = userActivityViewModel.getTotalAscendedValue();
                        } else {
                            totalAscendedValue = null;
                        }
                        updateRegistration(13, totalAscendedValue);
                        if (totalAscendedValue != null) {
                            str6 = totalAscendedValue.get();
                        }
                        if ((j & 802816) != 0) {
                            if (userActivityViewModel != null) {
                                totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                            } else {
                                totalDescendedValue = null;
                            }
                            updateRegistration(14, totalDescendedValue);
                            if (totalDescendedValue != null) {
                                str7 = totalDescendedValue.get();
                            }
                            if ((j & 819200) != 0) {
                                if (userActivityViewModel != null) {
                                    rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                                } else {
                                    rightArrowVisible = null;
                                }
                                updateRegistration(15, rightArrowVisible);
                                if (rightArrowVisible != null) {
                                    bool = rightArrowVisible.get();
                                } else {
                                    bool = null;
                                }
                                zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                                j2 = 851968;
                            } else {
                                str7 = str7;
                                bool = null;
                                rightArrowVisible = null;
                                j2 = 851968;
                                zSafeUnbox6 = false;
                            }
                            if ((j & j2) != 0) {
                                if (userActivityViewModel != null) {
                                    pace = userActivityViewModel.getPace();
                                } else {
                                    pace = null;
                                }
                                updateRegistration(16, pace);
                                if (pace != null) {
                                    str5 = pace.get();
                                }
                                if ((j & 917504) != 0) {
                                    if (userActivityViewModel != null) {
                                        hasHeartRates = userActivityViewModel.getHasHeartRates();
                                    } else {
                                        hasHeartRates = null;
                                    }
                                    updateRegistration(17, hasHeartRates);
                                    zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                    j = j;
                                } else {
                                    zSafeUnbox = false;
                                }
                                onClickListenerImpl2 = value3;
                                z3 = zSafeUnbox7;
                                z2 = zSafeUnbox8;
                                str = str12;
                                z = zSafeUnbox9;
                            } else {
                                bool = bool;
                                rightArrowVisible = rightArrowVisible;
                            }
                            str5 = null;
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                j = j;
                            } else {
                                zSafeUnbox = false;
                            }
                            onClickListenerImpl2 = value3;
                            z3 = zSafeUnbox7;
                            z2 = zSafeUnbox8;
                            str = str12;
                            z = zSafeUnbox9;
                        } else {
                            str6 = str6;
                        }
                        str7 = null;
                        if ((j & 819200) != 0) {
                            if (userActivityViewModel != null) {
                                rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                            } else {
                                rightArrowVisible = null;
                            }
                            updateRegistration(15, rightArrowVisible);
                            if (rightArrowVisible != null) {
                                bool = rightArrowVisible.get();
                            } else {
                                bool = null;
                            }
                            zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                            j2 = 851968;
                        } else {
                            str7 = str7;
                            bool = null;
                            rightArrowVisible = null;
                            j2 = 851968;
                            zSafeUnbox6 = false;
                        }
                        if ((j & j2) != 0) {
                            if (userActivityViewModel != null) {
                                pace = userActivityViewModel.getPace();
                            } else {
                                pace = null;
                            }
                            updateRegistration(16, pace);
                            if (pace != null) {
                                str5 = pace.get();
                            }
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                j = j;
                            } else {
                                zSafeUnbox = false;
                            }
                            onClickListenerImpl2 = value3;
                            z3 = zSafeUnbox7;
                            z2 = zSafeUnbox8;
                            str = str12;
                            z = zSafeUnbox9;
                        } else {
                            bool = bool;
                            rightArrowVisible = rightArrowVisible;
                        }
                        str5 = null;
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            j = j;
                        } else {
                            zSafeUnbox = false;
                        }
                        onClickListenerImpl2 = value3;
                        z3 = zSafeUnbox7;
                        z2 = zSafeUnbox8;
                        str = str12;
                        z = zSafeUnbox9;
                    } else {
                        zSafeUnbox9 = zSafeUnbox9;
                    }
                    str6 = null;
                    if ((j & 802816) != 0) {
                        if (userActivityViewModel != null) {
                            totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                        } else {
                            totalDescendedValue = null;
                        }
                        updateRegistration(14, totalDescendedValue);
                        if (totalDescendedValue != null) {
                            str7 = totalDescendedValue.get();
                        }
                        if ((j & 819200) != 0) {
                            if (userActivityViewModel != null) {
                                rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                            } else {
                                rightArrowVisible = null;
                            }
                            updateRegistration(15, rightArrowVisible);
                            if (rightArrowVisible != null) {
                                bool = rightArrowVisible.get();
                            } else {
                                bool = null;
                            }
                            zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                            j2 = 851968;
                        } else {
                            str7 = str7;
                            bool = null;
                            rightArrowVisible = null;
                            j2 = 851968;
                            zSafeUnbox6 = false;
                        }
                        if ((j & j2) != 0) {
                            if (userActivityViewModel != null) {
                                pace = userActivityViewModel.getPace();
                            } else {
                                pace = null;
                            }
                            updateRegistration(16, pace);
                            if (pace != null) {
                                str5 = pace.get();
                            }
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                j = j;
                            } else {
                                zSafeUnbox = false;
                            }
                            onClickListenerImpl2 = value3;
                            z3 = zSafeUnbox7;
                            z2 = zSafeUnbox8;
                            str = str12;
                            z = zSafeUnbox9;
                        } else {
                            bool = bool;
                            rightArrowVisible = rightArrowVisible;
                        }
                        str5 = null;
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            j = j;
                        } else {
                            zSafeUnbox = false;
                        }
                        onClickListenerImpl2 = value3;
                        z3 = zSafeUnbox7;
                        z2 = zSafeUnbox8;
                        str = str12;
                        z = zSafeUnbox9;
                    } else {
                        str6 = str6;
                    }
                    str7 = null;
                    if ((j & 819200) != 0) {
                        if (userActivityViewModel != null) {
                            rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                        } else {
                            rightArrowVisible = null;
                        }
                        updateRegistration(15, rightArrowVisible);
                        if (rightArrowVisible != null) {
                            bool = rightArrowVisible.get();
                        } else {
                            bool = null;
                        }
                        zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                        j2 = 851968;
                    } else {
                        str7 = str7;
                        bool = null;
                        rightArrowVisible = null;
                        j2 = 851968;
                        zSafeUnbox6 = false;
                    }
                    if ((j & j2) != 0) {
                        if (userActivityViewModel != null) {
                            pace = userActivityViewModel.getPace();
                        } else {
                            pace = null;
                        }
                        updateRegistration(16, pace);
                        if (pace != null) {
                            str5 = pace.get();
                        }
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            j = j;
                        } else {
                            zSafeUnbox = false;
                        }
                        onClickListenerImpl2 = value3;
                        z3 = zSafeUnbox7;
                        z2 = zSafeUnbox8;
                        str = str12;
                        z = zSafeUnbox9;
                    } else {
                        bool = bool;
                        rightArrowVisible = rightArrowVisible;
                    }
                    str5 = null;
                    if ((j & 917504) != 0) {
                        if (userActivityViewModel != null) {
                            hasHeartRates = userActivityViewModel.getHasHeartRates();
                        } else {
                            hasHeartRates = null;
                        }
                        updateRegistration(17, hasHeartRates);
                        zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                        j = j;
                    } else {
                        zSafeUnbox = false;
                    }
                    onClickListenerImpl2 = value3;
                    z3 = zSafeUnbox7;
                    z2 = zSafeUnbox8;
                    str = str12;
                    z = zSafeUnbox9;
                } else {
                    str11 = str11;
                }
                str10 = null;
                if ((j & 790528) != 0) {
                    if (userActivityViewModel != null) {
                        hasLocations = userActivityViewModel.getHasLocations();
                    } else {
                        hasLocations = null;
                    }
                    updateRegistration(12, hasLocations);
                    if (hasLocations != null) {
                        bool2 = hasLocations.get();
                    } else {
                        bool2 = null;
                    }
                    zSafeUnbox9 = androidx.databinding.ViewDataBinding.safeUnbox(bool2);
                } else {
                    str10 = str10;
                    zSafeUnbox9 = false;
                }
                if ((j & 794624) != 0) {
                    if (userActivityViewModel != null) {
                        totalAscendedValue = userActivityViewModel.getTotalAscendedValue();
                    } else {
                        totalAscendedValue = null;
                    }
                    updateRegistration(13, totalAscendedValue);
                    if (totalAscendedValue != null) {
                        str6 = totalAscendedValue.get();
                    }
                    if ((j & 802816) != 0) {
                        if (userActivityViewModel != null) {
                            totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                        } else {
                            totalDescendedValue = null;
                        }
                        updateRegistration(14, totalDescendedValue);
                        if (totalDescendedValue != null) {
                            str7 = totalDescendedValue.get();
                        }
                        if ((j & 819200) != 0) {
                            if (userActivityViewModel != null) {
                                rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                            } else {
                                rightArrowVisible = null;
                            }
                            updateRegistration(15, rightArrowVisible);
                            if (rightArrowVisible != null) {
                                bool = rightArrowVisible.get();
                            } else {
                                bool = null;
                            }
                            zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                            j2 = 851968;
                        } else {
                            str7 = str7;
                            bool = null;
                            rightArrowVisible = null;
                            j2 = 851968;
                            zSafeUnbox6 = false;
                        }
                        if ((j & j2) != 0) {
                            if (userActivityViewModel != null) {
                                pace = userActivityViewModel.getPace();
                            } else {
                                pace = null;
                            }
                            updateRegistration(16, pace);
                            if (pace != null) {
                                str5 = pace.get();
                            }
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                j = j;
                            } else {
                                zSafeUnbox = false;
                            }
                            onClickListenerImpl2 = value3;
                            z3 = zSafeUnbox7;
                            z2 = zSafeUnbox8;
                            str = str12;
                            z = zSafeUnbox9;
                        } else {
                            bool = bool;
                            rightArrowVisible = rightArrowVisible;
                        }
                        str5 = null;
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            j = j;
                        } else {
                            zSafeUnbox = false;
                        }
                        onClickListenerImpl2 = value3;
                        z3 = zSafeUnbox7;
                        z2 = zSafeUnbox8;
                        str = str12;
                        z = zSafeUnbox9;
                    } else {
                        str6 = str6;
                    }
                    str7 = null;
                    if ((j & 819200) != 0) {
                        if (userActivityViewModel != null) {
                            rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                        } else {
                            rightArrowVisible = null;
                        }
                        updateRegistration(15, rightArrowVisible);
                        if (rightArrowVisible != null) {
                            bool = rightArrowVisible.get();
                        } else {
                            bool = null;
                        }
                        zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                        j2 = 851968;
                    } else {
                        str7 = str7;
                        bool = null;
                        rightArrowVisible = null;
                        j2 = 851968;
                        zSafeUnbox6 = false;
                    }
                    if ((j & j2) != 0) {
                        if (userActivityViewModel != null) {
                            pace = userActivityViewModel.getPace();
                        } else {
                            pace = null;
                        }
                        updateRegistration(16, pace);
                        if (pace != null) {
                            str5 = pace.get();
                        }
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            j = j;
                        } else {
                            zSafeUnbox = false;
                        }
                        onClickListenerImpl2 = value3;
                        z3 = zSafeUnbox7;
                        z2 = zSafeUnbox8;
                        str = str12;
                        z = zSafeUnbox9;
                    } else {
                        bool = bool;
                        rightArrowVisible = rightArrowVisible;
                    }
                    str5 = null;
                    if ((j & 917504) != 0) {
                        if (userActivityViewModel != null) {
                            hasHeartRates = userActivityViewModel.getHasHeartRates();
                        } else {
                            hasHeartRates = null;
                        }
                        updateRegistration(17, hasHeartRates);
                        zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                        j = j;
                    } else {
                        zSafeUnbox = false;
                    }
                    onClickListenerImpl2 = value3;
                    z3 = zSafeUnbox7;
                    z2 = zSafeUnbox8;
                    str = str12;
                    z = zSafeUnbox9;
                } else {
                    zSafeUnbox9 = zSafeUnbox9;
                }
                str6 = null;
                if ((j & 802816) != 0) {
                    if (userActivityViewModel != null) {
                        totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                    } else {
                        totalDescendedValue = null;
                    }
                    updateRegistration(14, totalDescendedValue);
                    if (totalDescendedValue != null) {
                        str7 = totalDescendedValue.get();
                    }
                    if ((j & 819200) != 0) {
                        if (userActivityViewModel != null) {
                            rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                        } else {
                            rightArrowVisible = null;
                        }
                        updateRegistration(15, rightArrowVisible);
                        if (rightArrowVisible != null) {
                            bool = rightArrowVisible.get();
                        } else {
                            bool = null;
                        }
                        zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                        j2 = 851968;
                    } else {
                        str7 = str7;
                        bool = null;
                        rightArrowVisible = null;
                        j2 = 851968;
                        zSafeUnbox6 = false;
                    }
                    if ((j & j2) != 0) {
                        if (userActivityViewModel != null) {
                            pace = userActivityViewModel.getPace();
                        } else {
                            pace = null;
                        }
                        updateRegistration(16, pace);
                        if (pace != null) {
                            str5 = pace.get();
                        }
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            j = j;
                        } else {
                            zSafeUnbox = false;
                        }
                        onClickListenerImpl2 = value3;
                        z3 = zSafeUnbox7;
                        z2 = zSafeUnbox8;
                        str = str12;
                        z = zSafeUnbox9;
                    } else {
                        bool = bool;
                        rightArrowVisible = rightArrowVisible;
                    }
                    str5 = null;
                    if ((j & 917504) != 0) {
                        if (userActivityViewModel != null) {
                            hasHeartRates = userActivityViewModel.getHasHeartRates();
                        } else {
                            hasHeartRates = null;
                        }
                        updateRegistration(17, hasHeartRates);
                        zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                        j = j;
                    } else {
                        zSafeUnbox = false;
                    }
                    onClickListenerImpl2 = value3;
                    z3 = zSafeUnbox7;
                    z2 = zSafeUnbox8;
                    str = str12;
                    z = zSafeUnbox9;
                } else {
                    str6 = str6;
                }
                str7 = null;
                if ((j & 819200) != 0) {
                    if (userActivityViewModel != null) {
                        rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                    } else {
                        rightArrowVisible = null;
                    }
                    updateRegistration(15, rightArrowVisible);
                    if (rightArrowVisible != null) {
                        bool = rightArrowVisible.get();
                    } else {
                        bool = null;
                    }
                    zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                    j2 = 851968;
                } else {
                    str7 = str7;
                    bool = null;
                    rightArrowVisible = null;
                    j2 = 851968;
                    zSafeUnbox6 = false;
                }
                if ((j & j2) != 0) {
                    if (userActivityViewModel != null) {
                        pace = userActivityViewModel.getPace();
                    } else {
                        pace = null;
                    }
                    updateRegistration(16, pace);
                    if (pace != null) {
                        str5 = pace.get();
                    }
                    if ((j & 917504) != 0) {
                        if (userActivityViewModel != null) {
                            hasHeartRates = userActivityViewModel.getHasHeartRates();
                        } else {
                            hasHeartRates = null;
                        }
                        updateRegistration(17, hasHeartRates);
                        zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                        j = j;
                    } else {
                        zSafeUnbox = false;
                    }
                    onClickListenerImpl2 = value3;
                    z3 = zSafeUnbox7;
                    z2 = zSafeUnbox8;
                    str = str12;
                    z = zSafeUnbox9;
                } else {
                    bool = bool;
                    rightArrowVisible = rightArrowVisible;
                }
                str5 = null;
                if ((j & 917504) != 0) {
                    if (userActivityViewModel != null) {
                        hasHeartRates = userActivityViewModel.getHasHeartRates();
                    } else {
                        hasHeartRates = null;
                    }
                    updateRegistration(17, hasHeartRates);
                    zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                    j = j;
                } else {
                    zSafeUnbox = false;
                }
                onClickListenerImpl2 = value3;
                z3 = zSafeUnbox7;
                z2 = zSafeUnbox8;
                str = str12;
                z = zSafeUnbox9;
            } else {
                zSafeUnbox2 = zSafeUnbox2;
                zSafeUnbox8 = zSafeUnbox8;
            }
            str11 = null;
            if ((j & 788480) != 0) {
                if (userActivityViewModel != null) {
                    paceTitle = userActivityViewModel.getPaceTitle();
                } else {
                    paceTitle = null;
                }
                updateRegistration(11, paceTitle);
                if (paceTitle != null) {
                    str10 = paceTitle.get();
                }
                if ((j & 790528) != 0) {
                    if (userActivityViewModel != null) {
                        hasLocations = userActivityViewModel.getHasLocations();
                    } else {
                        hasLocations = null;
                    }
                    updateRegistration(12, hasLocations);
                    if (hasLocations != null) {
                        bool2 = hasLocations.get();
                    } else {
                        bool2 = null;
                    }
                    zSafeUnbox9 = androidx.databinding.ViewDataBinding.safeUnbox(bool2);
                } else {
                    str10 = str10;
                    zSafeUnbox9 = false;
                }
                if ((j & 794624) != 0) {
                    if (userActivityViewModel != null) {
                        totalAscendedValue = userActivityViewModel.getTotalAscendedValue();
                    } else {
                        totalAscendedValue = null;
                    }
                    updateRegistration(13, totalAscendedValue);
                    if (totalAscendedValue != null) {
                        str6 = totalAscendedValue.get();
                    }
                    if ((j & 802816) != 0) {
                        if (userActivityViewModel != null) {
                            totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                        } else {
                            totalDescendedValue = null;
                        }
                        updateRegistration(14, totalDescendedValue);
                        if (totalDescendedValue != null) {
                            str7 = totalDescendedValue.get();
                        }
                        if ((j & 819200) != 0) {
                            if (userActivityViewModel != null) {
                                rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                            } else {
                                rightArrowVisible = null;
                            }
                            updateRegistration(15, rightArrowVisible);
                            if (rightArrowVisible != null) {
                                bool = rightArrowVisible.get();
                            } else {
                                bool = null;
                            }
                            zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                            j2 = 851968;
                        } else {
                            str7 = str7;
                            bool = null;
                            rightArrowVisible = null;
                            j2 = 851968;
                            zSafeUnbox6 = false;
                        }
                        if ((j & j2) != 0) {
                            if (userActivityViewModel != null) {
                                pace = userActivityViewModel.getPace();
                            } else {
                                pace = null;
                            }
                            updateRegistration(16, pace);
                            if (pace != null) {
                                str5 = pace.get();
                            }
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                j = j;
                            } else {
                                zSafeUnbox = false;
                            }
                            onClickListenerImpl2 = value3;
                            z3 = zSafeUnbox7;
                            z2 = zSafeUnbox8;
                            str = str12;
                            z = zSafeUnbox9;
                        } else {
                            bool = bool;
                            rightArrowVisible = rightArrowVisible;
                        }
                        str5 = null;
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            j = j;
                        } else {
                            zSafeUnbox = false;
                        }
                        onClickListenerImpl2 = value3;
                        z3 = zSafeUnbox7;
                        z2 = zSafeUnbox8;
                        str = str12;
                        z = zSafeUnbox9;
                    } else {
                        str6 = str6;
                    }
                    str7 = null;
                    if ((j & 819200) != 0) {
                        if (userActivityViewModel != null) {
                            rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                        } else {
                            rightArrowVisible = null;
                        }
                        updateRegistration(15, rightArrowVisible);
                        if (rightArrowVisible != null) {
                            bool = rightArrowVisible.get();
                        } else {
                            bool = null;
                        }
                        zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                        j2 = 851968;
                    } else {
                        str7 = str7;
                        bool = null;
                        rightArrowVisible = null;
                        j2 = 851968;
                        zSafeUnbox6 = false;
                    }
                    if ((j & j2) != 0) {
                        if (userActivityViewModel != null) {
                            pace = userActivityViewModel.getPace();
                        } else {
                            pace = null;
                        }
                        updateRegistration(16, pace);
                        if (pace != null) {
                            str5 = pace.get();
                        }
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            j = j;
                        } else {
                            zSafeUnbox = false;
                        }
                        onClickListenerImpl2 = value3;
                        z3 = zSafeUnbox7;
                        z2 = zSafeUnbox8;
                        str = str12;
                        z = zSafeUnbox9;
                    } else {
                        bool = bool;
                        rightArrowVisible = rightArrowVisible;
                    }
                    str5 = null;
                    if ((j & 917504) != 0) {
                        if (userActivityViewModel != null) {
                            hasHeartRates = userActivityViewModel.getHasHeartRates();
                        } else {
                            hasHeartRates = null;
                        }
                        updateRegistration(17, hasHeartRates);
                        zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                        j = j;
                    } else {
                        zSafeUnbox = false;
                    }
                    onClickListenerImpl2 = value3;
                    z3 = zSafeUnbox7;
                    z2 = zSafeUnbox8;
                    str = str12;
                    z = zSafeUnbox9;
                } else {
                    zSafeUnbox9 = zSafeUnbox9;
                }
                str6 = null;
                if ((j & 802816) != 0) {
                    if (userActivityViewModel != null) {
                        totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                    } else {
                        totalDescendedValue = null;
                    }
                    updateRegistration(14, totalDescendedValue);
                    if (totalDescendedValue != null) {
                        str7 = totalDescendedValue.get();
                    }
                    if ((j & 819200) != 0) {
                        if (userActivityViewModel != null) {
                            rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                        } else {
                            rightArrowVisible = null;
                        }
                        updateRegistration(15, rightArrowVisible);
                        if (rightArrowVisible != null) {
                            bool = rightArrowVisible.get();
                        } else {
                            bool = null;
                        }
                        zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                        j2 = 851968;
                    } else {
                        str7 = str7;
                        bool = null;
                        rightArrowVisible = null;
                        j2 = 851968;
                        zSafeUnbox6 = false;
                    }
                    if ((j & j2) != 0) {
                        if (userActivityViewModel != null) {
                            pace = userActivityViewModel.getPace();
                        } else {
                            pace = null;
                        }
                        updateRegistration(16, pace);
                        if (pace != null) {
                            str5 = pace.get();
                        }
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            j = j;
                        } else {
                            zSafeUnbox = false;
                        }
                        onClickListenerImpl2 = value3;
                        z3 = zSafeUnbox7;
                        z2 = zSafeUnbox8;
                        str = str12;
                        z = zSafeUnbox9;
                    } else {
                        bool = bool;
                        rightArrowVisible = rightArrowVisible;
                    }
                    str5 = null;
                    if ((j & 917504) != 0) {
                        if (userActivityViewModel != null) {
                            hasHeartRates = userActivityViewModel.getHasHeartRates();
                        } else {
                            hasHeartRates = null;
                        }
                        updateRegistration(17, hasHeartRates);
                        zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                        j = j;
                    } else {
                        zSafeUnbox = false;
                    }
                    onClickListenerImpl2 = value3;
                    z3 = zSafeUnbox7;
                    z2 = zSafeUnbox8;
                    str = str12;
                    z = zSafeUnbox9;
                } else {
                    str6 = str6;
                }
                str7 = null;
                if ((j & 819200) != 0) {
                    if (userActivityViewModel != null) {
                        rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                    } else {
                        rightArrowVisible = null;
                    }
                    updateRegistration(15, rightArrowVisible);
                    if (rightArrowVisible != null) {
                        bool = rightArrowVisible.get();
                    } else {
                        bool = null;
                    }
                    zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                    j2 = 851968;
                } else {
                    str7 = str7;
                    bool = null;
                    rightArrowVisible = null;
                    j2 = 851968;
                    zSafeUnbox6 = false;
                }
                if ((j & j2) != 0) {
                    if (userActivityViewModel != null) {
                        pace = userActivityViewModel.getPace();
                    } else {
                        pace = null;
                    }
                    updateRegistration(16, pace);
                    if (pace != null) {
                        str5 = pace.get();
                    }
                    if ((j & 917504) != 0) {
                        if (userActivityViewModel != null) {
                            hasHeartRates = userActivityViewModel.getHasHeartRates();
                        } else {
                            hasHeartRates = null;
                        }
                        updateRegistration(17, hasHeartRates);
                        zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                        j = j;
                    } else {
                        zSafeUnbox = false;
                    }
                    onClickListenerImpl2 = value3;
                    z3 = zSafeUnbox7;
                    z2 = zSafeUnbox8;
                    str = str12;
                    z = zSafeUnbox9;
                } else {
                    bool = bool;
                    rightArrowVisible = rightArrowVisible;
                }
                str5 = null;
                if ((j & 917504) != 0) {
                    if (userActivityViewModel != null) {
                        hasHeartRates = userActivityViewModel.getHasHeartRates();
                    } else {
                        hasHeartRates = null;
                    }
                    updateRegistration(17, hasHeartRates);
                    zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                    j = j;
                } else {
                    zSafeUnbox = false;
                }
                onClickListenerImpl2 = value3;
                z3 = zSafeUnbox7;
                z2 = zSafeUnbox8;
                str = str12;
                z = zSafeUnbox9;
            } else {
                str11 = str11;
            }
            str10 = null;
            if ((j & 790528) != 0) {
                if (userActivityViewModel != null) {
                    hasLocations = userActivityViewModel.getHasLocations();
                } else {
                    hasLocations = null;
                }
                updateRegistration(12, hasLocations);
                if (hasLocations != null) {
                    bool2 = hasLocations.get();
                } else {
                    bool2 = null;
                }
                zSafeUnbox9 = androidx.databinding.ViewDataBinding.safeUnbox(bool2);
            } else {
                str10 = str10;
                zSafeUnbox9 = false;
            }
            if ((j & 794624) != 0) {
                if (userActivityViewModel != null) {
                    totalAscendedValue = userActivityViewModel.getTotalAscendedValue();
                } else {
                    totalAscendedValue = null;
                }
                updateRegistration(13, totalAscendedValue);
                if (totalAscendedValue != null) {
                    str6 = totalAscendedValue.get();
                }
                if ((j & 802816) != 0) {
                    if (userActivityViewModel != null) {
                        totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                    } else {
                        totalDescendedValue = null;
                    }
                    updateRegistration(14, totalDescendedValue);
                    if (totalDescendedValue != null) {
                        str7 = totalDescendedValue.get();
                    }
                    if ((j & 819200) != 0) {
                        if (userActivityViewModel != null) {
                            rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                        } else {
                            rightArrowVisible = null;
                        }
                        updateRegistration(15, rightArrowVisible);
                        if (rightArrowVisible != null) {
                            bool = rightArrowVisible.get();
                        } else {
                            bool = null;
                        }
                        zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                        j2 = 851968;
                    } else {
                        str7 = str7;
                        bool = null;
                        rightArrowVisible = null;
                        j2 = 851968;
                        zSafeUnbox6 = false;
                    }
                    if ((j & j2) != 0) {
                        if (userActivityViewModel != null) {
                            pace = userActivityViewModel.getPace();
                        } else {
                            pace = null;
                        }
                        updateRegistration(16, pace);
                        if (pace != null) {
                            str5 = pace.get();
                        }
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            j = j;
                        } else {
                            zSafeUnbox = false;
                        }
                        onClickListenerImpl2 = value3;
                        z3 = zSafeUnbox7;
                        z2 = zSafeUnbox8;
                        str = str12;
                        z = zSafeUnbox9;
                    } else {
                        bool = bool;
                        rightArrowVisible = rightArrowVisible;
                    }
                    str5 = null;
                    if ((j & 917504) != 0) {
                        if (userActivityViewModel != null) {
                            hasHeartRates = userActivityViewModel.getHasHeartRates();
                        } else {
                            hasHeartRates = null;
                        }
                        updateRegistration(17, hasHeartRates);
                        zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                        j = j;
                    } else {
                        zSafeUnbox = false;
                    }
                    onClickListenerImpl2 = value3;
                    z3 = zSafeUnbox7;
                    z2 = zSafeUnbox8;
                    str = str12;
                    z = zSafeUnbox9;
                } else {
                    str6 = str6;
                }
                str7 = null;
                if ((j & 819200) != 0) {
                    if (userActivityViewModel != null) {
                        rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                    } else {
                        rightArrowVisible = null;
                    }
                    updateRegistration(15, rightArrowVisible);
                    if (rightArrowVisible != null) {
                        bool = rightArrowVisible.get();
                    } else {
                        bool = null;
                    }
                    zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                    j2 = 851968;
                } else {
                    str7 = str7;
                    bool = null;
                    rightArrowVisible = null;
                    j2 = 851968;
                    zSafeUnbox6 = false;
                }
                if ((j & j2) != 0) {
                    if (userActivityViewModel != null) {
                        pace = userActivityViewModel.getPace();
                    } else {
                        pace = null;
                    }
                    updateRegistration(16, pace);
                    if (pace != null) {
                        str5 = pace.get();
                    }
                    if ((j & 917504) != 0) {
                        if (userActivityViewModel != null) {
                            hasHeartRates = userActivityViewModel.getHasHeartRates();
                        } else {
                            hasHeartRates = null;
                        }
                        updateRegistration(17, hasHeartRates);
                        zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                        j = j;
                    } else {
                        zSafeUnbox = false;
                    }
                    onClickListenerImpl2 = value3;
                    z3 = zSafeUnbox7;
                    z2 = zSafeUnbox8;
                    str = str12;
                    z = zSafeUnbox9;
                } else {
                    bool = bool;
                    rightArrowVisible = rightArrowVisible;
                }
                str5 = null;
                if ((j & 917504) != 0) {
                    if (userActivityViewModel != null) {
                        hasHeartRates = userActivityViewModel.getHasHeartRates();
                    } else {
                        hasHeartRates = null;
                    }
                    updateRegistration(17, hasHeartRates);
                    zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                    j = j;
                } else {
                    zSafeUnbox = false;
                }
                onClickListenerImpl2 = value3;
                z3 = zSafeUnbox7;
                z2 = zSafeUnbox8;
                str = str12;
                z = zSafeUnbox9;
            } else {
                zSafeUnbox9 = zSafeUnbox9;
            }
            str6 = null;
            if ((j & 802816) != 0) {
                if (userActivityViewModel != null) {
                    totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                } else {
                    totalDescendedValue = null;
                }
                updateRegistration(14, totalDescendedValue);
                if (totalDescendedValue != null) {
                    str7 = totalDescendedValue.get();
                }
                if ((j & 819200) != 0) {
                    if (userActivityViewModel != null) {
                        rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                    } else {
                        rightArrowVisible = null;
                    }
                    updateRegistration(15, rightArrowVisible);
                    if (rightArrowVisible != null) {
                        bool = rightArrowVisible.get();
                    } else {
                        bool = null;
                    }
                    zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                    j2 = 851968;
                } else {
                    str7 = str7;
                    bool = null;
                    rightArrowVisible = null;
                    j2 = 851968;
                    zSafeUnbox6 = false;
                }
                if ((j & j2) != 0) {
                    if (userActivityViewModel != null) {
                        pace = userActivityViewModel.getPace();
                    } else {
                        pace = null;
                    }
                    updateRegistration(16, pace);
                    if (pace != null) {
                        str5 = pace.get();
                    }
                    if ((j & 917504) != 0) {
                        if (userActivityViewModel != null) {
                            hasHeartRates = userActivityViewModel.getHasHeartRates();
                        } else {
                            hasHeartRates = null;
                        }
                        updateRegistration(17, hasHeartRates);
                        zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                        j = j;
                    } else {
                        zSafeUnbox = false;
                    }
                    onClickListenerImpl2 = value3;
                    z3 = zSafeUnbox7;
                    z2 = zSafeUnbox8;
                    str = str12;
                    z = zSafeUnbox9;
                } else {
                    bool = bool;
                    rightArrowVisible = rightArrowVisible;
                }
                str5 = null;
                if ((j & 917504) != 0) {
                    if (userActivityViewModel != null) {
                        hasHeartRates = userActivityViewModel.getHasHeartRates();
                    } else {
                        hasHeartRates = null;
                    }
                    updateRegistration(17, hasHeartRates);
                    zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                    j = j;
                } else {
                    zSafeUnbox = false;
                }
                onClickListenerImpl2 = value3;
                z3 = zSafeUnbox7;
                z2 = zSafeUnbox8;
                str = str12;
                z = zSafeUnbox9;
            } else {
                str6 = str6;
            }
            str7 = null;
            if ((j & 819200) != 0) {
                if (userActivityViewModel != null) {
                    rightArrowVisible = userActivityViewModel.getRightArrowVisible();
                } else {
                    rightArrowVisible = null;
                }
                updateRegistration(15, rightArrowVisible);
                if (rightArrowVisible != null) {
                    bool = rightArrowVisible.get();
                } else {
                    bool = null;
                }
                zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                j2 = 851968;
            } else {
                str7 = str7;
                bool = null;
                rightArrowVisible = null;
                j2 = 851968;
                zSafeUnbox6 = false;
            }
            if ((j & j2) != 0) {
                if (userActivityViewModel != null) {
                    pace = userActivityViewModel.getPace();
                } else {
                    pace = null;
                }
                updateRegistration(16, pace);
                if (pace != null) {
                    str5 = pace.get();
                }
                if ((j & 917504) != 0) {
                    if (userActivityViewModel != null) {
                        hasHeartRates = userActivityViewModel.getHasHeartRates();
                    } else {
                        hasHeartRates = null;
                    }
                    updateRegistration(17, hasHeartRates);
                    zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                    j = j;
                } else {
                    zSafeUnbox = false;
                }
                onClickListenerImpl2 = value3;
                z3 = zSafeUnbox7;
                z2 = zSafeUnbox8;
                str = str12;
                z = zSafeUnbox9;
            } else {
                bool = bool;
                rightArrowVisible = rightArrowVisible;
            }
            str5 = null;
            if ((j & 917504) != 0) {
                if (userActivityViewModel != null) {
                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                } else {
                    hasHeartRates = null;
                }
                updateRegistration(17, hasHeartRates);
                zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                j = j;
            } else {
                zSafeUnbox = false;
            }
            onClickListenerImpl2 = value3;
            z3 = zSafeUnbox7;
            z2 = zSafeUnbox8;
            str = str12;
            z = zSafeUnbox9;
        } else {
            value = null;
            value2 = null;
            onClickListenerImpl2 = null;
            str = null;
            str2 = null;
            bool = null;
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
            str7 = null;
            str8 = null;
            str9 = null;
            str10 = null;
            str11 = null;
            zSafeUnbox = false;
            zSafeUnbox2 = false;
            z = false;
            zSafeUnbox3 = false;
            z2 = false;
            zSafeUnbox4 = false;
            zSafeUnbox5 = false;
            z3 = false;
            zSafeUnbox6 = false;
        }
        if ((j & android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) != 0) {
            if (userActivityViewModel != null) {
                rightArrowVisible = userActivityViewModel.getRightArrowVisible();
            }
            androidx.databinding.ObservableField<java.lang.Boolean> observableField = rightArrowVisible;
            updateRegistration(15, observableField);
            if (observableField != null) {
                bool = observableField.get();
            }
            zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
        }
        boolean z5 = zSafeUnbox6;
        long j4 = j & 819232;
        if (j4 != 0) {
            z4 = zSafeUnbox4 ? true : z5;
        } else {
            z4 = false;
        }
        boolean z6 = zSafeUnbox4;
        if ((j & 786432) != 0) {
            this.activityName.setOnClickListener(value2);
            this.mboundView3.setOnClickListener(value);
            this.mboundView6.setOnClickListener(onClickListenerImpl2);
            this.mboundView7.setOnClickListener(value2);
        }
        if ((j & 786436) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.activityName, str2);
        }
        if (j4 != 0) {
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.centerHorizontalInRelative(this.activityName, z4);
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.centerHorizontalInRelative(this.subtitleLabel, z4);
        }
        if ((j & 917504) != 0) {
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.goneUnless(this.chartFragmentContainer, zSafeUnbox);
        }
        if ((j & 786944) != 0) {
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.goneUnless(this.headerLayout, zSafeUnbox5);
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.goneUnless(this.mboundView1, zSafeUnbox2);
        }
        if ((j & 790528) != 0) {
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.goneUnless(this.mapsFragmentContainer, z);
        }
        if ((j & 786496) != 0) {
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.goneUnless(this.mboundView10, zSafeUnbox3);
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.goneUnless(this.mboundView12, zSafeUnbox3);
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.goneUnless(this.mboundView14, z2);
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.goneUnless(this.mboundView16, z2);
        }
        if ((j & 786433) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView11, str);
        }
        if ((786688 & j) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView13, str3);
        }
        if ((j & 786434) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView15, str4);
        }
        if ((851968 & j) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView18, str5);
        }
        if ((j & 786440) != 0) {
            boolean z7 = z3;
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.goneUnless(this.mboundView19, z7);
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.goneUnless(this.mboundView21, z7);
        }
        if ((794624 & j) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView20, str6);
        }
        if ((802816 & j) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView22, str7);
        }
        if ((786464 & j) != 0) {
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.goneUnless(this.mboundView3, z6);
        }
        if ((819200 & j) != 0) {
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.goneUnless(this.mboundView6, z5);
        }
        if ((j & 786448) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, str8);
        }
        if ((j & 786560) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView9, str9);
        }
        if ((788480 & j) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.paceTitle, str10);
        }
        if ((j & 787456) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.subtitleLabel, str11);
        }
    }

    public static class OnClickListenerImpl implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentMainUserActivityBindingImpl.OnClickListenerImpl setValue(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel value) {
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

    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentMainUserActivityBindingImpl.OnClickListenerImpl1 setValue(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onSessionClicked(arg0);
        }
    }

    public static class OnClickListenerImpl2 implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentMainUserActivityBindingImpl.OnClickListenerImpl2 setValue(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel value) {
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
}
